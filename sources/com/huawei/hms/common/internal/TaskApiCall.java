package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;
/* loaded from: classes3.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {
    private static final String TAG = "TaskApiCall";
    private int apiLevel;
    private final String mRequestJson;
    private final String mUri;
    private Parcelable parcelable;
    private mn0 token;
    private String transactionId;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.apiLevel = 1;
        this.mUri = str;
        this.mRequestJson = str2;
        this.parcelable = null;
        this.transactionId = null;
    }

    protected abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, z6b<ResultT> z6bVar);

    public int getApiLevel() {
        return this.apiLevel;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.parcelable;
    }

    public String getRequestJson() {
        return this.mRequestJson;
    }

    public mn0 getToken() {
        return null;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getUri() {
        return this.mUri;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, z6b<ResultT> z6bVar) {
        HMSLog.i(TAG, "doExecute, uri:" + this.mUri + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.transactionId);
        doExecute(clientt, responseErrorCode, str, z6bVar);
    }

    public void setApiLevel(int i) {
        this.apiLevel = i;
    }

    public void setParcelable(Parcelable parcelable) {
        this.parcelable = parcelable;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.apiLevel = 1;
        this.mUri = str;
        this.mRequestJson = str2;
        this.parcelable = null;
        this.transactionId = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i) {
        this.mUri = str;
        this.mRequestJson = str2;
        this.parcelable = null;
        this.transactionId = str3;
        this.apiLevel = i;
    }

    public void setToken(mn0 mn0Var) {
    }
}
