package defpackage;
/* compiled from: ControllingDomainModule_ProvideRatingPhotoRepository$controlling_releaseFactory.java */
/* renamed from: ew1  reason: default package */
/* loaded from: classes.dex */
public final class ew1 implements no3<j69> {
    private final as8<jk2> a;

    public ew1(as8<jk2> as8Var) {
        this.a = as8Var;
    }

    public static ew1 a(as8<jk2> as8Var) {
        return new ew1(as8Var);
    }

    public static j69 c(jk2 jk2Var) {
        return (j69) jh8.e(mv1.a.r(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public j69 get() {
        return c(this.a.get());
    }
}
