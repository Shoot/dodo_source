package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.b;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {
    private static final String TAG = "HuaweiApi";
    private String innerHmsPkg;
    private boolean isUseInnerHms;
    private WeakReference<Activity> mActivity;
    private String mAppID;
    private AbstractClientBuilder<?, TOption> mClientBuilder;
    private Context mContext;
    private String mHostAppid;
    private Context mHostContext;
    private int mKitSdkVersion;
    private TOption mOption;
    private SubAppInfo mSubAppInfo;
    private RequestManager requestManager;
    private int apiLevel = 1;
    private boolean isFirstReqSent = false;

    /* loaded from: classes3.dex */
    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {
        private final HuaweiApi<OptionsT> mApi;
        private final AnyClient mClient;
        private ResolveClientBean mResolveClientBean;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();
        private final Queue<TaskApiCallbackWrapper> callbackRunQueue = new LinkedList();
        private ConnectionResult mConnectionResult = null;

        RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
            this.mApi = huaweiApi;
            this.mClient = huaweiApi.getClient(RequestManager.getHandler().getLooper(), this);
        }

        private String errorReason(ConnectionResult connectionResult) {
            if (Util.isAvailableLibExist(this.mApi.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                if (errorCode != -1) {
                    if (errorCode != 3) {
                        if (errorCode != 8) {
                            if (errorCode != 10) {
                                if (errorCode != 13) {
                                    if (errorCode != 21) {
                                        switch (errorCode) {
                                            case 25:
                                                return "failed to get update result";
                                            case 26:
                                                return "update failed, because no activity incoming, can't pop update page";
                                            case 27:
                                                return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                                        }
                                        return "unknown errorReason";
                                    }
                                    return "device is too old to be support";
                                }
                                return "update cancelled";
                            }
                            return "application configuration error, please developer check configuration";
                        }
                        return "internal error";
                    }
                    return "HuaWei Mobile Service is disabled";
                }
                return "get update result, but has other error codes";
            }
            int errorCode2 = connectionResult.getErrorCode();
            if (errorCode2 != -1) {
                if (errorCode2 != 8) {
                    if (errorCode2 != 10) {
                        return "unknown errorReason";
                    }
                    return "application configuration error, please developer check configuration";
                }
                return "internal error";
            }
            return "get update result, but has other error codes";
        }

        private String getTransactionId(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return TransactionIdCreater.getId(this.mApi.getAppID(), str2);
            }
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void innerConnected() {
            this.mConnectionResult = null;
            this.callbackRunQueue.clear();
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackWaitQueue) {
                postMessage(taskApiCallbackWrapper);
            }
            this.callbackWaitQueue.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void innerConnectionFailed(ConnectionResult connectionResult) {
            this.mConnectionResult = connectionResult;
            boolean z = true;
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackWaitQueue) {
                TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + errorReason(connectionResult) + "(" + connectionResult.getErrorCode() + ")");
                responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
                b.a(this.mApi.getContext(), responseHeader, String.valueOf(this.mApi.getKitSdkVersion()));
                if (this.mConnectionResult.getResolution() != null && z) {
                    responseHeader.setParcelable(this.mConnectionResult.getResolution());
                    if (Util.isAvailableLibExist(this.mApi.getContext()) && this.mConnectionResult.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                    z = false;
                }
                int errorCode = this.mConnectionResult.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.callbackRunQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void innerConnectionSuspended() {
            HMSLog.i(HuaweiApi.TAG, "wait queue size = " + this.callbackWaitQueue.size());
            HMSLog.i(HuaweiApi.TAG, "run queue size = " + this.callbackRunQueue.size());
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackWaitQueue) {
                sendConnectionSuspended(taskApiCallbackWrapper);
            }
            for (TaskApiCallbackWrapper taskApiCallbackWrapper2 : this.callbackRunQueue) {
                sendConnectionSuspended(taskApiCallbackWrapper2);
            }
            this.callbackWaitQueue.clear();
            this.callbackRunQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
        }

        private void sendConnectionSuspended(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
            ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
            responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
            apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
        }

        private TaskApiCallbackWrapper wrapperRequest(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.1
                private AtomicBoolean isFirstRsp = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.e(HuaweiApi.TAG, "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (responseHeader.getErrorCode() == 11) {
                        RequestHandler.this.disconnect();
                        HMSLog.i(HuaweiApi.TAG, "unbind service");
                    }
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.e(HuaweiApi.TAG, "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.isFirstRsp.compareAndSet(true, false)) {
                        b.a(RequestHandler.this.mApi.getContext(), responseHeader, String.valueOf(RequestHandler.this.mApi.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.mClient, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        synchronized void connect(int i, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            if (this.mClient.isConnected()) {
                HMSLog.d(HuaweiApi.TAG, "client is connected");
            } else if (this.mClient.isConnecting()) {
                HMSLog.d(HuaweiApi.TAG, "client is isConnecting");
            } else {
                if (this.mApi.getActivity() != null) {
                    if (this.mResolveClientBean == null) {
                        this.mResolveClientBean = new ResolveClientBean(this.mClient, i);
                    }
                    if (BindResolveClients.getInstance().isClientRegistered(this.mResolveClientBean)) {
                        HMSLog.i(HuaweiApi.TAG, "mResolveClientBean has already register, return!");
                        return;
                    }
                    BindResolveClients.getInstance().register(this.mResolveClientBean);
                }
                this.mClient.connect(i);
            }
        }

        void disconnect() {
            this.mClient.disconnect();
        }

        public AnyClient getClient() {
            return this.mClient;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.i(HuaweiApi.TAG, "onConnected");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.4
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.innerConnected();
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.i(HuaweiApi.TAG, "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.innerConnectionFailed(connectionResult);
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HMSLog.i(HuaweiApi.TAG, "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.5
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.innerConnectionSuspended();
                }
            });
        }

        public void postMessage(final TaskApiCallbackWrapper taskApiCallbackWrapper) {
            Context context;
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall().getTransactionId(), this);
            this.callbackRunQueue.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall().getUri();
            if (((HuaweiApi) this.mApi).mHostContext != null) {
                context = ((HuaweiApi) this.mApi).mHostContext;
            } else {
                context = this.mApi.getContext();
            }
            String packageName = context.getPackageName();
            if (((HuaweiApi) this.mApi).mHostContext != null) {
                HuaweiApi<OptionsT> huaweiApi = this.mApi;
                huaweiApi.setHostAppId(((HuaweiApi) huaweiApi).mHostContext);
            }
            final RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.mApi.getAppID() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.mApi.getSubAppID());
            requestHeader.setPkgName(packageName);
            requestHeader.setSessionId(this.mClient.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall();
            requestHeader.setTransactionId(getTransactionId(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.mApi.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.mApi.getApiLevel(), taskApiCall.getApiLevel()));
            this.mClient.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2
                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    AnyClient.CallBack callBack = taskApiCallbackWrapper.getCallBack();
                    if (callBack != null) {
                        callBack.onCallback(iMessageEntity, str);
                    }
                    RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                    RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RequestHandler.this.callbackRunQueue.remove(taskApiCallbackWrapper);
                        }
                    });
                }
            });
        }

        void sendRequest(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.i(HuaweiApi.TAG, "sendRequest");
            TaskApiCallbackWrapper wrapperRequest = wrapperRequest(taskApiCallWrapper);
            if (this.mClient.isConnected()) {
                HMSLog.i(HuaweiApi.TAG, "isConnected:true.");
                BinderAdapter adapter = ((BaseHmsClient) this.mClient).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.mClient).setService(IAIDLInvoke.Stub.asInterface(adapter.getServiceBinder()));
                postMessage(wrapperRequest);
                return;
            }
            HMSLog.i(HuaweiApi.TAG, "isConnected:false.");
            this.callbackWaitQueue.add(wrapperRequest);
            ConnectionResult connectionResult = this.mConnectionResult;
            if (connectionResult != null && connectionResult.getErrorCode() != 0) {
                HMSLog.i(HuaweiApi.TAG, "onConnectionFailed, ErrorCode:" + this.mConnectionResult.getErrorCode());
                onConnectionFailed(this.mConnectionResult);
                return;
            }
            RequestManager.addRequestToQueue(this);
            AnyClient anyClient = this.mClient;
            if (anyClient instanceof BaseHmsClient) {
                ((BaseHmsClient) anyClient).setInternalRequest(this);
            }
            connect(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), wrapperRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class RequestRunnable<OptionsT extends Api.ApiOptions> implements Runnable {
        private final HuaweiApi<OptionsT> mApi;
        private final TaskApiCallWrapper mTaskApiCallWrapper;

        public RequestRunnable(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
            this.mApi = huaweiApi;
            this.mTaskApiCallWrapper = taskApiCallWrapper;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void notifyCpException(com.huawei.hms.common.HuaweiApi.RequestHandler r8, java.lang.Exception r9) {
            /*
                r7 = this;
                java.lang.String r0 = "HuaweiApi"
                r1 = 0
                com.huawei.hms.common.internal.AnyClient r8 = r8.getClient()     // Catch: java.lang.RuntimeException -> L36
                com.huawei.hms.common.internal.ResponseHeader r2 = new com.huawei.hms.common.internal.ResponseHeader     // Catch: java.lang.RuntimeException -> L33
                java.lang.String r9 = r9.getMessage()     // Catch: java.lang.RuntimeException -> L33
                r3 = 1
                r4 = 907135001(0x3611c819, float:2.1723156E-6)
                r2.<init>(r3, r4, r9)     // Catch: java.lang.RuntimeException -> L33
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.RuntimeException -> L2f
                r9.<init>()     // Catch: java.lang.RuntimeException -> L2f
                java.lang.String r9 = r9.toString()     // Catch: java.lang.RuntimeException -> L2f
                com.huawei.hms.common.internal.TaskApiCallWrapper r3 = r7.mTaskApiCallWrapper     // Catch: java.lang.RuntimeException -> L2c
                z6b r3 = r3.getTaskCompletionSource()     // Catch: java.lang.RuntimeException -> L2c
                com.huawei.hms.common.internal.TaskApiCallWrapper r4 = r7.mTaskApiCallWrapper     // Catch: java.lang.RuntimeException -> L2a
                com.huawei.hms.common.internal.TaskApiCall r1 = r4.getTaskApiCall()     // Catch: java.lang.RuntimeException -> L2a
                goto L54
            L2a:
                r4 = move-exception
                goto L3c
            L2c:
                r4 = move-exception
                r3 = r1
                goto L3c
            L2f:
                r4 = move-exception
                r9 = r1
                r3 = r9
                goto L3c
            L33:
                r9 = move-exception
                r4 = r9
                goto L39
            L36:
                r8 = move-exception
                r4 = r8
                r8 = r1
            L39:
                r9 = r1
                r2 = r9
                r3 = r2
            L3c:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "<notifyCpException> "
                r5.append(r6)
                java.lang.String r4 = r4.getMessage()
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                com.huawei.hms.support.log.HMSLog.e(r0, r4)
            L54:
                if (r8 == 0) goto L62
                if (r2 == 0) goto L62
                if (r9 == 0) goto L62
                if (r3 == 0) goto L62
                if (r1 == 0) goto L62
                r1.onResponse(r8, r2, r9, r3)
                goto L67
            L62:
                java.lang.String r8 = "<notifyCpException> isNotify is false, Can not notify CP."
                com.huawei.hms.support.log.HMSLog.e(r0, r8)
            L67:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.HuaweiApi.RequestRunnable.notifyCpException(com.huawei.hms.common.HuaweiApi$RequestHandler, java.lang.Exception):void");
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestHandler requestHandler = new RequestHandler(this.mApi);
            try {
                requestHandler.sendRequest(this.mTaskApiCallWrapper);
            } catch (RuntimeException e) {
                notifyCpException(requestHandler, e);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class TaskApiCallbackWrapper {
        private final TaskApiCallWrapper mApiCallWrapper;
        private final AnyClient.CallBack mCallBack;

        TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.mApiCallWrapper = taskApiCallWrapper;
            this.mCallBack = callBack;
        }

        TaskApiCallWrapper getApiCallWrapper() {
            return this.mApiCallWrapper;
        }

        AnyClient.CallBack getCallBack() {
            return this.mCallBack;
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, i, null);
    }

    private void init(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        this.mContext = context.getApplicationContext();
        this.mOption = toption;
        this.mClientBuilder = abstractClientBuilder;
        setHostAppId(context);
        this.mSubAppInfo = new SubAppInfo("");
        this.mKitSdkVersion = i;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.mHostAppid)) {
                HMSLog.e(TAG, "subAppId is host appid");
            } else {
                HMSLog.i(TAG, "subAppId is " + str);
                this.mSubAppInfo = new SubAppInfo(str);
            }
        }
        initBI(context);
    }

    private void initBI(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void innerDisconnect(HuaweiApi<?> huaweiApi, z6b<Boolean> z6bVar) {
        HMSLog.i(TAG, "innerDisconnect.");
        try {
            huaweiApi.getClient(RequestManager.getHandler().getLooper(), null).disconnect();
            z6bVar.c(Boolean.TRUE);
        } catch (Exception e) {
            HMSLog.w(TAG, "disconnect the binder failed for:" + e.getMessage());
        }
    }

    private <TResult, TClient extends AnyClient> v6b<TResult> sendRequest(TaskApiCall<TClient, TResult> taskApiCall) {
        taskApiCall.getToken();
        z6b z6bVar = new z6b();
        RequestManager.getHandler().post(new RequestRunnable(this, new TaskApiCallWrapper(taskApiCall, z6bVar)));
        return z6bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHostAppId(Context context) {
        String appId = Util.getAppId(context);
        this.mHostAppid = appId;
        this.mAppID = appId;
    }

    @Deprecated
    public v6b<Boolean> disconnectService() {
        final z6b z6bVar = new z6b();
        RequestManager.getInstance();
        RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.1
            @Override // java.lang.Runnable
            public void run() {
                HuaweiApi.this.innerDisconnect(this, z6bVar);
            }
        });
        return z6bVar.a();
    }

    public <TResult, TClient extends AnyClient> v6b<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        String subAppID;
        this.isFirstReqSent = true;
        if (taskApiCall == null) {
            HMSLog.e(TAG, "in doWrite:taskApiCall is null");
            z6b z6bVar = new z6b();
            z6bVar.b(new ApiException(Status.FAILURE));
            return z6bVar.a();
        }
        if (TextUtils.isEmpty(this.mSubAppInfo.getSubAppID())) {
            subAppID = this.mAppID;
        } else {
            subAppID = this.mSubAppInfo.getSubAppID();
        }
        b.a(this.mContext, taskApiCall.getUri(), subAppID, taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
        if (this.requestManager == null) {
            this.requestManager = RequestManager.getInstance();
        }
        return sendRequest(taskApiCall);
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.apiLevel;
    }

    public String getAppID() {
        return this.mAppID;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.huawei.hms.common.internal.AnyClient] */
    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.mClientBuilder.buildClient(this.mContext, getClientSetting(), requestHandler, requestHandler);
    }

    protected ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.mContext.getPackageName(), this.mContext.getClass().getName(), getScopes(), this.mHostAppid, null, this.mSubAppInfo);
        if (!this.isUseInnerHms) {
            this.innerHmsPkg = HMSPackageManager.getInstance(this.mContext).getHMSPackageNameForMultiService();
            HMSLog.i(TAG, "No setInnerHms, hms pkg name is " + this.innerHmsPkg);
        }
        clientSettings.setInnerHmsPkg(this.innerHmsPkg);
        clientSettings.setUseInnerHms(this.isUseInnerHms);
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getKitSdkVersion() {
        return this.mKitSdkVersion;
    }

    public TOption getOption() {
        return this.mOption;
    }

    protected List<Scope> getScopes() {
        return Collections.emptyList();
    }

    public String getSubAppID() {
        return this.mSubAppInfo.getSubAppID();
    }

    public void setApiLevel(int i) {
        this.apiLevel = i;
    }

    public void setHostContext(Context context) {
        this.mHostContext = context;
    }

    public void setInnerHms() {
        this.innerHmsPkg = this.mContext.getPackageName();
        this.isUseInnerHms = true;
        HMSLog.i(TAG, "<setInnerHms> init inner hms pkg info:" + this.innerHmsPkg);
    }

    public void setKitSdkVersion(int i) {
        this.mKitSdkVersion = i;
    }

    public void setSubAppId(String str) throws ApiException {
        if (setSubAppInfo(new SubAppInfo(str))) {
            return;
        }
        throw new ApiException(Status.FAILURE);
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.i(TAG, "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.mSubAppInfo;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.e(TAG, "subAppInfo is already set");
            return false;
        } else if (subAppInfo == null) {
            HMSLog.e(TAG, "subAppInfo is null");
            return false;
        } else {
            String subAppID = subAppInfo.getSubAppID();
            if (TextUtils.isEmpty(subAppID)) {
                HMSLog.e(TAG, "subAppId is empty");
                return false;
            } else if (subAppID.equals(this.mHostAppid)) {
                HMSLog.e(TAG, "subAppId is host appid");
                return false;
            } else if (this.isFirstReqSent) {
                HMSLog.e(TAG, "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
                return false;
            } else {
                this.mSubAppInfo = new SubAppInfo(subAppInfo);
                return true;
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, 0, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, i, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, 0, null);
    }
}
