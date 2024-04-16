package defpackage;
/* compiled from: CulturesInterceptor_Factory.java */
/* renamed from: e32  reason: default package */
/* loaded from: classes3.dex */
public final class e32 implements no3<d32> {
    private final as8<i32> a;

    public e32(as8<i32> as8Var) {
        this.a = as8Var;
    }

    public static e32 a(as8<i32> as8Var) {
        return new e32(as8Var);
    }

    public static d32 c(i32 i32Var) {
        return new d32(i32Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public d32 get() {
        return c(this.a.get());
    }
}
