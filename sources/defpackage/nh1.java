package defpackage;
/* compiled from: ComboModule_ProvideComboMenuItemVOFactory.java */
/* renamed from: nh1  reason: default package */
/* loaded from: classes3.dex */
public final class nh1 implements no3<kh1> {
    private final as8<gi1> a;

    public nh1(as8<gi1> as8Var) {
        this.a = as8Var;
    }

    public static nh1 a(as8<gi1> as8Var) {
        return new nh1(as8Var);
    }

    public static kh1 c(gi1 gi1Var) {
        return (kh1) jh8.e(mh1.a.a(gi1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public kh1 get() {
        return c(this.a.get());
    }
}
