package defpackage;

import android.app.Application;
/* compiled from: ThreadsLibActivitiesFix_Factory.java */
/* renamed from: ieb  reason: default package */
/* loaded from: classes.dex */
public final class ieb implements no3<heb> {
    private final as8<Application> a;
    private final as8<bfb> b;
    private final as8<ih> c;

    public ieb(as8<Application> as8Var, as8<bfb> as8Var2, as8<ih> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static ieb a(as8<Application> as8Var, as8<bfb> as8Var2, as8<ih> as8Var3) {
        return new ieb(as8Var, as8Var2, as8Var3);
    }

    public static heb c(Application application, as8<bfb> as8Var, as8<ih> as8Var2) {
        return new heb(application, as8Var, as8Var2);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public heb get() {
        return c(this.a.get(), this.b, this.c);
    }
}
