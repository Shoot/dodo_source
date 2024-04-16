package defpackage;
/* compiled from: AssistantWishesInteractor_Factory.java */
/* renamed from: ix  reason: default package */
/* loaded from: classes2.dex */
public final class ix implements no3<hx> {
    private final as8<ex> a;

    public ix(as8<ex> as8Var) {
        this.a = as8Var;
    }

    public static ix a(as8<ex> as8Var) {
        return new ix(as8Var);
    }

    public static hx c(ex exVar) {
        return new hx(exVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hx get() {
        return c(this.a.get());
    }
}
