package defpackage;

import android.content.Context;
/* compiled from: SchemaManager_Factory.java */
/* renamed from: pw9  reason: default package */
/* loaded from: classes2.dex */
public final class pw9 implements oo3<ow9> {
    private final as8<Context> a;
    private final as8<String> b;
    private final as8<Integer> c;

    public pw9(as8<Context> as8Var, as8<String> as8Var2, as8<Integer> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static pw9 a(as8<Context> as8Var, as8<String> as8Var2, as8<Integer> as8Var3) {
        return new pw9(as8Var, as8Var2, as8Var3);
    }

    public static ow9 c(Context context, String str, int i) {
        return new ow9(context, str, i);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ow9 get() {
        return c(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
