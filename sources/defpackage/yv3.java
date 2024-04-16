package defpackage;

import java.util.concurrent.Executor;
/* compiled from: FirebaseExecutors.java */
/* renamed from: yv3  reason: default package */
/* loaded from: classes2.dex */
public class yv3 {

    /* compiled from: FirebaseExecutors.java */
    /* renamed from: yv3$a */
    /* loaded from: classes2.dex */
    private enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor) {
        return new gca(executor);
    }
}
