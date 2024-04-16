package defpackage;
/* compiled from: OrderDetailsInteractorImpl_Factory.java */
/* renamed from: fd7  reason: default package */
/* loaded from: classes.dex */
public final class fd7 implements no3<ed7> {
    private final as8<li7> a;
    private final as8<md7> b;

    public fd7(as8<li7> as8Var, as8<md7> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static fd7 a(as8<li7> as8Var, as8<md7> as8Var2) {
        return new fd7(as8Var, as8Var2);
    }

    public static ed7 c(li7 li7Var, md7 md7Var) {
        return new ed7(li7Var, md7Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ed7 get() {
        return c(this.a.get(), this.b.get());
    }
}
