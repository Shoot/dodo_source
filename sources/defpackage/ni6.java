package defpackage;

import android.content.Context;
/* compiled from: MetadataBackendRegistry_Factory.java */
/* renamed from: ni6  reason: default package */
/* loaded from: classes2.dex */
public final class ni6 implements oo3<mi6> {
    private final as8<Context> a;
    private final as8<l22> b;

    public ni6(as8<Context> as8Var, as8<l22> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static ni6 a(as8<Context> as8Var, as8<l22> as8Var2) {
        return new ni6(as8Var, as8Var2);
    }

    public static mi6 c(Context context, Object obj) {
        return new mi6(context, (l22) obj);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mi6 get() {
        return c(this.a.get(), this.b.get());
    }
}
