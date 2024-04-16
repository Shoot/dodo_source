package defpackage;

import android.content.Context;
import com.google.gson.Gson;
/* compiled from: MindboxSdkRepository_Factory.java */
/* renamed from: xk6  reason: default package */
/* loaded from: classes4.dex */
public final class xk6 implements no3<wk6> {
    private final as8<Context> a;
    private final as8<Gson> b;

    public xk6(as8<Context> as8Var, as8<Gson> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static xk6 a(as8<Context> as8Var, as8<Gson> as8Var2) {
        return new xk6(as8Var, as8Var2);
    }

    public static wk6 c(Context context, Gson gson) {
        return new wk6(context, gson);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wk6 get() {
        return c(this.a.get(), this.b.get());
    }
}
