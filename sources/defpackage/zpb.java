package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: UiExecutor.java */
/* renamed from: zpb  reason: default package */
/* loaded from: classes2.dex */
public enum zpb implements Executor {
    INSTANCE;
    
    @SuppressLint({"ThreadPoolCreation"})
    private static final Handler b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        b.post(runnable);
    }
}
