package defpackage;

import com.google.gson.Gson;
/* compiled from: MenuItemV5ImageResolver_Factory.java */
/* renamed from: ve6  reason: default package */
/* loaded from: classes4.dex */
public final class ve6 implements no3<ue6> {
    private final as8<Gson> a;

    public ve6(as8<Gson> as8Var) {
        this.a = as8Var;
    }

    public static ve6 a(as8<Gson> as8Var) {
        return new ve6(as8Var);
    }

    public static ue6 c(Gson gson) {
        return new ue6(gson);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ue6 get() {
        return c(this.a.get());
    }
}
