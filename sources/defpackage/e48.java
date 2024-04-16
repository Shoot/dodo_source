package defpackage;
/* compiled from: PhoneNumberModule_ProvidePhoneInputHandlerFactory.java */
/* renamed from: e48  reason: default package */
/* loaded from: classes3.dex */
public final class e48 implements no3<v28> {
    private final as8<m28> a;

    public e48(as8<m28> as8Var) {
        this.a = as8Var;
    }

    public static e48 a(as8<m28> as8Var) {
        return new e48(as8Var);
    }

    public static v28 c(m28 m28Var) {
        return (v28) jh8.e(b48.a.c(m28Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public v28 get() {
        return c(this.a.get());
    }
}
