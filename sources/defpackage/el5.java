package defpackage;
/* compiled from: LandingSMSInputModule_ProvideLandingSMSInputInteractorFactory.java */
/* renamed from: el5  reason: default package */
/* loaded from: classes3.dex */
public final class el5 implements no3<bl5> {
    private final as8<String> a;
    private final as8<String> b;
    private final as8<il5> c;

    public el5(as8<String> as8Var, as8<String> as8Var2, as8<il5> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static el5 a(as8<String> as8Var, as8<String> as8Var2, as8<il5> as8Var3) {
        return new el5(as8Var, as8Var2, as8Var3);
    }

    public static bl5 c(String str, String str2, il5 il5Var) {
        return (bl5) jh8.e(dl5.a.a(str, str2, il5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public bl5 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
