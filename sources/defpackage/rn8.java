package defpackage;
/* compiled from: ProfileLocaleListInteractor_Factory.java */
/* renamed from: rn8  reason: default package */
/* loaded from: classes2.dex */
public final class rn8 implements no3<qn8> {
    private final as8<jo> a;
    private final as8<i32> b;
    private final as8<wl5> c;

    public rn8(as8<jo> as8Var, as8<i32> as8Var2, as8<wl5> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static rn8 a(as8<jo> as8Var, as8<i32> as8Var2, as8<wl5> as8Var3) {
        return new rn8(as8Var, as8Var2, as8Var3);
    }

    public static qn8 c(jo joVar, i32 i32Var, wl5 wl5Var) {
        return new qn8(joVar, i32Var, wl5Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qn8 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
