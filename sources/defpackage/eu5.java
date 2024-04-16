package defpackage;
/* compiled from: LocalityListModule_ProvidesInteractorFactory.java */
/* renamed from: eu5  reason: default package */
/* loaded from: classes3.dex */
public final class eu5 implements no3<au5> {
    private final as8<bu5> a;

    public eu5(as8<bu5> as8Var) {
        this.a = as8Var;
    }

    public static eu5 a(as8<bu5> as8Var) {
        return new eu5(as8Var);
    }

    public static au5 c(bu5 bu5Var) {
        return (au5) jh8.e(du5.a.a(bu5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public au5 get() {
        return c(this.a.get());
    }
}
