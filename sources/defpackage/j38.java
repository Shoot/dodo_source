package defpackage;
/* compiled from: PhoneNumberCollectorRouterImpl_Factory.java */
/* renamed from: j38  reason: default package */
/* loaded from: classes2.dex */
public final class j38 implements no3<i38> {
    private final as8<f63> a;

    public j38(as8<f63> as8Var) {
        this.a = as8Var;
    }

    public static j38 a(as8<f63> as8Var) {
        return new j38(as8Var);
    }

    public static i38 c(f63 f63Var) {
        return new i38(f63Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public i38 get() {
        return c(this.a.get());
    }
}
