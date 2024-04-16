package defpackage;

import android.content.Context;
/* compiled from: GeopositionModule_ProvideGeoLocationProviderFactoryFactory.java */
/* renamed from: ye4  reason: default package */
/* loaded from: classes3.dex */
public final class ye4 implements no3<je4> {
    private final as8<Context> a;

    public ye4(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static ye4 a(as8<Context> as8Var) {
        return new ye4(as8Var);
    }

    public static je4 c(Context context) {
        return (je4) jh8.e(we4.a.b(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public je4 get() {
        return c(this.a.get());
    }
}
