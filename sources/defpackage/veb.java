package defpackage;
/* compiled from: ThreadsLibDomainModule_ProvideThreadsLibContextLocaleFix$chat_releaseFactory.java */
/* renamed from: veb  reason: default package */
/* loaded from: classes.dex */
public final class veb implements no3<oeb> {
    private final as8<ih> a;

    public veb(as8<ih> as8Var) {
        this.a = as8Var;
    }

    public static veb a(as8<ih> as8Var) {
        return new veb(as8Var);
    }

    public static oeb c(ih ihVar) {
        return (oeb) jh8.e(peb.a.f(ihVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public oeb get() {
        return c(this.a.get());
    }
}
