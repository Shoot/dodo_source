package defpackage;

import com.google.gson.Gson;
/* compiled from: CaptchaContractAdapterImpl_Factory.java */
/* renamed from: fo0  reason: default package */
/* loaded from: classes.dex */
public final class fo0 implements no3<eo0> {
    private final as8<Gson> a;

    public fo0(as8<Gson> as8Var) {
        this.a = as8Var;
    }

    public static fo0 a(as8<Gson> as8Var) {
        return new fo0(as8Var);
    }

    public static eo0 c(Gson gson) {
        return new eo0(gson);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public eo0 get() {
        return c(this.a.get());
    }
}
