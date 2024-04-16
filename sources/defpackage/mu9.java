package defpackage;
/* compiled from: SbpBankListInteractor_Factory.java */
/* renamed from: mu9  reason: default package */
/* loaded from: classes2.dex */
public final class mu9 implements no3<lu9> {
    private final as8<xu9> a;

    public mu9(as8<xu9> as8Var) {
        this.a = as8Var;
    }

    public static mu9 a(as8<xu9> as8Var) {
        return new mu9(as8Var);
    }

    public static lu9 c(xu9 xu9Var) {
        return new lu9(xu9Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lu9 get() {
        return c(this.a.get());
    }
}
