package defpackage;
/* compiled from: SbpBankListRouter_Factory.java */
/* renamed from: tu9  reason: default package */
/* loaded from: classes2.dex */
public final class tu9 implements no3<su9> {
    private final as8<f63> a;

    public tu9(as8<f63> as8Var) {
        this.a = as8Var;
    }

    public static tu9 a(as8<f63> as8Var) {
        return new tu9(as8Var);
    }

    public static su9 c(f63 f63Var) {
        return new su9(f63Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public su9 get() {
        return c(this.a.get());
    }
}
