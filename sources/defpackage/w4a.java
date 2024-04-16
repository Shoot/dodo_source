package defpackage;
/* compiled from: SelectCountryModule_ProvideSelectCountryInteractorFactory.java */
/* renamed from: w4a  reason: default package */
/* loaded from: classes2.dex */
public final class w4a implements no3<r4a> {
    private final as8<s4a> a;

    public w4a(as8<s4a> as8Var) {
        this.a = as8Var;
    }

    public static w4a a(as8<s4a> as8Var) {
        return new w4a(as8Var);
    }

    public static r4a c(s4a s4aVar) {
        return (r4a) jh8.e(u4a.a.b(s4aVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public r4a get() {
        return c(this.a.get());
    }
}
