package defpackage;

import android.content.Context;
/* compiled from: BlockStoreDataSource_Factory.java */
/* renamed from: md0  reason: default package */
/* loaded from: classes3.dex */
public final class md0 implements no3<ld0> {
    private final as8<Context> a;
    private final as8<ih4> b;

    public md0(as8<Context> as8Var, as8<ih4> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static md0 a(as8<Context> as8Var, as8<ih4> as8Var2) {
        return new md0(as8Var, as8Var2);
    }

    public static ld0 c(Context context, ih4 ih4Var) {
        return new ld0(context, ih4Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ld0 get() {
        return c(this.a.get(), this.b.get());
    }
}
