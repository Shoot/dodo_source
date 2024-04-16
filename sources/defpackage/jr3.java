package defpackage;
/* compiled from: FeedbackPhoneModule_ProvideFeedbackPhoneFactory.java */
/* renamed from: jr3  reason: default package */
/* loaded from: classes3.dex */
public final class jr3 implements no3<kr3> {
    private final as8<ay1> a;

    public jr3(as8<ay1> as8Var) {
        this.a = as8Var;
    }

    public static jr3 a(as8<ay1> as8Var) {
        return new jr3(as8Var);
    }

    public static kr3 c(ay1 ay1Var) {
        return (kr3) jh8.e(ir3.a.a(ay1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public kr3 get() {
        return c(this.a.get());
    }
}
