package defpackage;
/* compiled from: RequestCoordinator.java */
/* renamed from: ki9  reason: default package */
/* loaded from: classes.dex */
public interface ki9 {

    /* compiled from: RequestCoordinator.java */
    /* renamed from: ki9$a */
    /* loaded from: classes.dex */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean a;

        a(boolean z) {
            this.a = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean i() {
            return this.a;
        }
    }

    boolean a();

    ki9 b();

    boolean c(ii9 ii9Var);

    void d(ii9 ii9Var);

    void f(ii9 ii9Var);

    boolean i(ii9 ii9Var);

    boolean j(ii9 ii9Var);
}
