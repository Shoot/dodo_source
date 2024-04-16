package defpackage;

import android.app.Activity;
/* compiled from: AddressFormFragmentModule_ProvideAddressViewCreatorFactory.java */
/* renamed from: a8  reason: default package */
/* loaded from: classes3.dex */
public final class a8 implements no3<j54> {
    private final as8<Activity> a;
    private final as8<t7> b;
    private final as8<ws3> c;
    private final as8<ay1> d;

    public a8(as8<Activity> as8Var, as8<t7> as8Var2, as8<ws3> as8Var3, as8<ay1> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static a8 a(as8<Activity> as8Var, as8<t7> as8Var2, as8<ws3> as8Var3, as8<ay1> as8Var4) {
        return new a8(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static j54 c(Activity activity, t7 t7Var, ws3 ws3Var, ay1 ay1Var) {
        return (j54) jh8.e(z7.a.a(activity, t7Var, ws3Var, ay1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public j54 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
