package defpackage;

import android.content.Context;
/* compiled from: NotificationsStatusDetector_Factory.java */
/* renamed from: l37  reason: default package */
/* loaded from: classes.dex */
public final class l37 implements no3<k37> {
    private final as8<Context> a;

    public l37(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static l37 a(as8<Context> as8Var) {
        return new l37(as8Var);
    }

    public static k37 c(Context context) {
        return new k37(context);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public k37 get() {
        return c(this.a.get());
    }
}
