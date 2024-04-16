package defpackage;
/* compiled from: SelectCountryModule_ProvideCountryDataMapperFactory.java */
/* renamed from: v4a  reason: default package */
/* loaded from: classes2.dex */
public final class v4a implements no3<gy1> {
    private final as8<py1> a;

    public v4a(as8<py1> as8Var) {
        this.a = as8Var;
    }

    public static v4a a(as8<py1> as8Var) {
        return new v4a(as8Var);
    }

    public static gy1 c(py1 py1Var) {
        return (gy1) jh8.e(u4a.a.a(py1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gy1 get() {
        return c(this.a.get());
    }
}
