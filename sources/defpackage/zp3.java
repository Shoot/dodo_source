package defpackage;

import android.content.Context;
/* compiled from: FeatureAppModule_ProviderToggleServiceFactory.java */
/* renamed from: zp3  reason: default package */
/* loaded from: classes3.dex */
public final class zp3 implements no3<yhb> {
    private final as8<Context> a;

    public zp3(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static zp3 a(as8<Context> as8Var) {
        return new zp3(as8Var);
    }

    public static yhb c(Context context) {
        return (yhb) jh8.e(up3.a.e(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public yhb get() {
        return c(this.a.get());
    }
}
