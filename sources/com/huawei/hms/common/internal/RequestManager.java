package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.log.HMSLog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes3.dex */
public class RequestManager implements Handler.Callback {
    public static final int NOTIFY_CONNECT_FAILED = 10012;
    public static final int NOTIFY_CONNECT_SUCCESS = 10011;
    public static final int NOTIFY_CONNECT_SUSPENDED = 10013;
    private static final String TAG = "RequestManager";
    private static Handler mHandler;
    private static volatile RequestManager mInstance;
    private static final Object LOCK_OBJECT = new Object();
    private static Queue<HuaweiApi.RequestHandler> requestQueue = new ConcurrentLinkedQueue();
    private static Map<String, HuaweiApi.RequestHandler> connectedReqMap = new LinkedHashMap();

    private RequestManager(Looper looper) {
        mHandler = new Handler(looper, this);
    }

    public static void addRequestToQueue(HuaweiApi.RequestHandler requestHandler) {
        requestQueue.add(requestHandler);
    }

    public static void addToConnectedReqMap(final String str, final HuaweiApi.RequestHandler requestHandler) {
        if (mHandler == null) {
            return;
        }
        HMSLog.i(TAG, "addToConnectedReqMap");
        mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.connectedReqMap.put(str, requestHandler);
            }
        });
    }

    public static Handler getHandler() {
        return mHandler;
    }

    public static RequestManager getInstance() {
        synchronized (LOCK_OBJECT) {
            try {
                if (mInstance == null) {
                    HandlerThread handlerThread = new HandlerThread(TAG);
                    handlerThread.start();
                    mInstance = new RequestManager(handlerThread.getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mInstance;
    }

    private void handleConnectFailed(Message message) {
        HMSLog.i(TAG, "NOTIFY_CONNECT_FAILED.");
        try {
            BaseHmsClient.ConnectionResultWrapper connectionResultWrapper = (BaseHmsClient.ConnectionResultWrapper) message.obj;
            HuaweiApi.RequestHandler request = connectionResultWrapper.getRequest();
            requestQueue.remove(request);
            request.onConnectionFailed(connectionResultWrapper.getConnectionResult());
        } catch (RuntimeException e) {
            HMSLog.e(TAG, "<handleConnectFailed> handle Failed" + e.getMessage());
        }
    }

    private void handleConnectSuccess() {
        while (!requestQueue.isEmpty()) {
            HuaweiApi.RequestHandler poll = requestQueue.poll();
            if (poll != null) {
                AnyClient client = poll.getClient();
                if (client instanceof BaseHmsClient) {
                    BaseHmsClient baseHmsClient = (BaseHmsClient) client;
                    baseHmsClient.setService(IAIDLInvoke.Stub.asInterface(baseHmsClient.getAdapter().getServiceBinder()));
                    poll.onConnected();
                }
            }
        }
    }

    private void handleConnectSuspend() {
        HMSLog.i(TAG, "NOTIFY_CONNECT_SUSPENDED.");
        while (!requestQueue.isEmpty()) {
            requestQueue.poll().onConnectionSuspended(1);
        }
        notifyRunningRequestConnectSuspend();
    }

    private void notifyRunningRequestConnectSuspend() {
        HMSLog.i(TAG, "notifyRunningRequestConnectSuspend, connectedReqMap.size(): " + connectedReqMap.size());
        Iterator<Map.Entry<String, HuaweiApi.RequestHandler>> it = connectedReqMap.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().onConnectionSuspended(1);
            } catch (RuntimeException e) {
                HMSLog.e(TAG, "NOTIFY_CONNECT_SUSPENDED Exception: " + e.getMessage());
            }
            it.remove();
        }
    }

    public static void removeReqByTransId(final String str) {
        if (mHandler == null) {
            return;
        }
        HMSLog.i(TAG, "removeReqByTransId");
        mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.2
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.connectedReqMap.remove(str);
            }
        });
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        HMSLog.i(TAG, "RequestManager handleMessage.");
        switch (message.what) {
            case NOTIFY_CONNECT_SUCCESS /* 10011 */:
                handleConnectSuccess();
                return true;
            case NOTIFY_CONNECT_FAILED /* 10012 */:
                handleConnectFailed(message);
                return true;
            case NOTIFY_CONNECT_SUSPENDED /* 10013 */:
                handleConnectSuspend();
                return true;
            default:
                HMSLog.i(TAG, "handleMessage unknown msg:" + message.what);
                return false;
        }
    }
}
