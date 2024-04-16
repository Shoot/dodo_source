package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
/* compiled from: ContextModule_ProvidePackageManagerFactory.java */
/* renamed from: qu1  reason: default package */
/* loaded from: classes3.dex */
public final class qu1 implements no3<PackageManager> {
    private final as8<Context> a;

    public qu1(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static qu1 a(as8<Context> as8Var) {
        return new qu1(as8Var);
    }

    public static PackageManager c(Context context) {
        return (PackageManager) jh8.e(lu1.a.e(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PackageManager get() {
        return c(this.a.get());
    }
}
