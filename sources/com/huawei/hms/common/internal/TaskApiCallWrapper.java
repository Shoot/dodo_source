package com.huawei.hms.common.internal;
/* loaded from: classes3.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {
    private final TaskApiCall<? extends AnyClient, TResult> mTaskApiCall;
    private final z6b<TResult> mTaskCompletionSource;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, z6b<TResult> z6bVar) {
        super(1);
        this.mTaskApiCall = taskApiCall;
        this.mTaskCompletionSource = z6bVar;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.mTaskApiCall;
    }

    public z6b<TResult> getTaskCompletionSource() {
        return this.mTaskCompletionSource;
    }
}
