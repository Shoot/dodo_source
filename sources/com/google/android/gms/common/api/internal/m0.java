package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class m0 implements Runnable {
    private final k0 a;
    final /* synthetic */ n0 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(n0 n0Var, k0 k0Var) {
        this.b = n0Var;
        this.a = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b.b) {
            return;
        }
        ConnectionResult b = this.a.b();
        if (b.t()) {
            n0 n0Var = this.b;
            n0Var.a.startActivityForResult(GoogleApiActivity.a(n0Var.b(), (PendingIntent) gh8.j(b.p()), this.a.a(), false), 1);
            return;
        }
        n0 n0Var2 = this.b;
        if (n0Var2.e.b(n0Var2.b(), b.h(), null) != null) {
            n0 n0Var3 = this.b;
            n0Var3.e.v(n0Var3.b(), this.b.a, b.h(), 2, this.b);
        } else if (b.h() != 18) {
            this.b.l(b, this.a.a());
        } else {
            n0 n0Var4 = this.b;
            Dialog q = n0Var4.e.q(n0Var4.b(), this.b);
            n0 n0Var5 = this.b;
            n0Var5.e.r(n0Var5.b().getApplicationContext(), new l0(this, q));
        }
    }
}
