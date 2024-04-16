package defpackage;

import android.content.pm.PackageManager;
/* compiled from: PaymentModule_ProvideSberPayDeepLinkIntentCheckerFactory.java */
/* renamed from: tv7  reason: default package */
/* loaded from: classes3.dex */
public final class tv7 implements no3<cu9> {
    private final as8<PackageManager> a;

    public tv7(as8<PackageManager> as8Var) {
        this.a = as8Var;
    }

    public static tv7 a(as8<PackageManager> as8Var) {
        return new tv7(as8Var);
    }

    public static cu9 c(PackageManager packageManager) {
        return (cu9) jh8.e(gu7.a.M(packageManager));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public cu9 get() {
        return c(this.a.get());
    }
}
