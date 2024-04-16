package defpackage;
/* compiled from: OnboardingSelectedCountryService_Factory.java */
/* renamed from: w97  reason: default package */
/* loaded from: classes2.dex */
public final class w97 implements no3<v97> {
    private final as8<ci8> a;

    public w97(as8<ci8> as8Var) {
        this.a = as8Var;
    }

    public static w97 a(as8<ci8> as8Var) {
        return new w97(as8Var);
    }

    public static v97 c(ci8 ci8Var) {
        return new v97(ci8Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public v97 get() {
        return c(this.a.get());
    }
}
