package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
/* loaded from: classes.dex */
public class InnerBinderAdapter extends BinderAdapter {
    private static final int INNER_MSG_CONN_TIMEOUT = 2001;
    private static final int INNER_MSG_DELAY_DISCONNECT = 2002;
    private static final Object LOCK_OBJECT_INIT = new Object();
    private static final String TAG = "InnerBinderAdapter";
    private static BinderAdapter innerAdapter;

    private InnerBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.i(TAG, "InnerBinderAdapter getInstance.");
        synchronized (LOCK_OBJECT_INIT) {
            try {
                if (innerAdapter == null) {
                    innerAdapter = new InnerBinderAdapter(context, str, str2);
                }
                binderAdapter = innerAdapter;
            } catch (Throwable th) {
                throw th;
            }
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    protected int getConnTimeOut() {
        return INNER_MSG_CONN_TIMEOUT;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    protected int getMsgDelayDisconnect() {
        return INNER_MSG_DELAY_DISCONNECT;
    }
}
