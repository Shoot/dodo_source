package defpackage;
/* compiled from: CountryApiFactoryImpl_Factory.java */
/* renamed from: dy1  reason: default package */
/* loaded from: classes.dex */
public final class dy1 implements no3<cy1> {
    private final as8<el9> a;

    public dy1(as8<el9> as8Var) {
        this.a = as8Var;
    }

    public static dy1 a(as8<el9> as8Var) {
        return new dy1(as8Var);
    }

    public static cy1 c(el9 el9Var) {
        return new cy1(el9Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public cy1 get() {
        return c(this.a.get());
    }
}
