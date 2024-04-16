package defpackage;

import android.content.Context;
/* compiled from: AppResourceLocalesFactoryImpl_Factory.java */
/* renamed from: lo  reason: default package */
/* loaded from: classes4.dex */
public final class lo implements no3<ko> {
    private final as8<Context> a;

    public lo(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static lo a(as8<Context> as8Var) {
        return new lo(as8Var);
    }

    public static ko c(Context context) {
        return new ko(context);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ko get() {
        return c(this.a.get());
    }
}
