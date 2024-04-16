package defpackage;

import android.content.Context;
/* compiled from: MindboxSdk_Factory.java */
/* renamed from: bl6  reason: default package */
/* loaded from: classes4.dex */
public final class bl6 implements no3<tk6> {
    private final as8<Context> a;

    public bl6(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static bl6 a(as8<Context> as8Var) {
        return new bl6(as8Var);
    }

    public static tk6 c(Context context) {
        return new tk6(context);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public tk6 get() {
        return c(this.a.get());
    }
}
