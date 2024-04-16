package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* renamed from: f7b  reason: default package */
/* loaded from: classes.dex */
public final class f7b {
    private static final f7b d = new f7b();
    private final ExecutorService b = eec.a();
    private final Executor a = new a();
    private final Executor c = eec.b();

    /* renamed from: f7b$a */
    /* loaded from: classes.dex */
    static final class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private f7b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService a() {
        return d.b;
    }

    public static Executor b() {
        return d.c;
    }
}
