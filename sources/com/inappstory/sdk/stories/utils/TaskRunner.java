package com.inappstory.sdk.stories.utils;

import android.os.Handler;
import android.os.Looper;
import com.inappstory.sdk.InAppStoryService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes3.dex */
public class TaskRunner {
    private final Executor executor = Executors.newSingleThreadExecutor();
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* loaded from: classes3.dex */
    public interface Callback<R> {
        void onComplete(R r);
    }

    /* loaded from: classes3.dex */
    class a implements Runnable {
        final /* synthetic */ Callable a;
        final /* synthetic */ Callback b;

        /* renamed from: com.inappstory.sdk.stories.utils.TaskRunner$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0272a implements Runnable {
            final /* synthetic */ Object a;

            RunnableC0272a(Object obj) {
                this.a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onComplete(this.a);
            }
        }

        a(Callable callable, Callback callback) {
            this.a = callable;
            this.b = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TaskRunner.this.handler.post(new RunnableC0272a(this.a.call()));
            } catch (Exception e) {
                InAppStoryService.createExceptionLog(e);
            }
        }
    }

    public <R> void executeAsync(Callable<R> callable, Callback<R> callback) {
        this.executor.execute(new a(callable, callback));
    }
}
