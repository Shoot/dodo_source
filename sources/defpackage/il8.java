package defpackage;
/* compiled from: ProductCardScreenFactory_Factory.java */
/* renamed from: il8  reason: default package */
/* loaded from: classes4.dex */
public final class il8 implements no3<hl8> {
    private final as8<ow> a;

    public il8(as8<ow> as8Var) {
        this.a = as8Var;
    }

    public static il8 a(as8<ow> as8Var) {
        return new il8(as8Var);
    }

    public static hl8 c(ow owVar) {
        return new hl8(owVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hl8 get() {
        return c(this.a.get());
    }
}
