package defpackage;
/* compiled from: TransportImpl.java */
/* renamed from: amb  reason: default package */
/* loaded from: classes2.dex */
final class amb<T> implements ulb<T> {
    private final wlb a;
    private final String b;
    private final eh3 c;
    private final zkb<T, byte[]> d;
    private final cmb e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public amb(wlb wlbVar, String str, eh3 eh3Var, zkb<T, byte[]> zkbVar, cmb cmbVar) {
        this.a = wlbVar;
        this.b = str;
        this.c = eh3Var;
        this.d = zkbVar;
        this.e = cmbVar;
    }

    @Override // defpackage.ulb
    public void a(pk3<T> pk3Var) {
        b(pk3Var, new omb() { // from class: zlb
            @Override // defpackage.omb
            public final void a(Exception exc) {
                amb.e(exc);
            }
        });
    }

    @Override // defpackage.ulb
    public void b(pk3<T> pk3Var, omb ombVar) {
        this.e.a(qba.a().e(this.a).c(pk3Var).f(this.b).d(this.d).b(this.c).a(), ombVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public wlb d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }
}
