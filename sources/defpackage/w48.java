package defpackage;
/* compiled from: PhonePrefixModule_ProvideInteractorFactory.java */
/* renamed from: w48  reason: default package */
/* loaded from: classes3.dex */
public final class w48 implements no3<r48> {
    private final as8<z48> a;

    public w48(as8<z48> as8Var) {
        this.a = as8Var;
    }

    public static w48 a(as8<z48> as8Var) {
        return new w48(as8Var);
    }

    public static r48 c(z48 z48Var) {
        return (r48) jh8.e(v48.a.a(z48Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public r48 get() {
        return c(this.a.get());
    }
}
