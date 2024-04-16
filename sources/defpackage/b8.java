package defpackage;

import android.content.Context;
/* compiled from: AddressFormFragmentModule_ProvideFieldsConfigFactory.java */
/* renamed from: b8  reason: default package */
/* loaded from: classes3.dex */
public final class b8 implements no3<ws3> {
    private final as8<Context> a;

    public b8(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static b8 a(as8<Context> as8Var) {
        return new b8(as8Var);
    }

    public static ws3 c(Context context) {
        return (ws3) jh8.e(z7.a.b(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ws3 get() {
        return c(this.a.get());
    }
}
