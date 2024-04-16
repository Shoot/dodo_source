package defpackage;

import android.content.Context;
/* compiled from: NotificationCancellation_Factory.java */
/* renamed from: o07  reason: default package */
/* loaded from: classes.dex */
public final class o07 implements no3<n07> {
    private final as8<Context> a;

    public o07(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static o07 a(as8<Context> as8Var) {
        return new o07(as8Var);
    }

    public static n07 c(Context context) {
        return new n07(context);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public n07 get() {
        return c(this.a.get());
    }
}
