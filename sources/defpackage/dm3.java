package defpackage;

import java.util.concurrent.Executor;
/* compiled from: ExecutionModule_ExecutorFactory.java */
/* renamed from: dm3  reason: default package */
/* loaded from: classes2.dex */
public final class dm3 implements oo3<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* renamed from: dm3$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private static final dm3 a = new dm3();
    }

    public static dm3 a() {
        return a.a;
    }

    public static Executor b() {
        return (Executor) fh8.c(cm3.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
