package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class cb implements ib {
    final /* synthetic */ va a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cb(va vaVar) {
        this.a = vaVar;
    }

    @Override // com.google.android.gms.measurement.internal.ib
    public final void b(String str, String str2, Bundle bundle) {
        u5 u5Var;
        u5 u5Var2;
        if (TextUtils.isEmpty(str)) {
            u5Var = this.a.l;
            if (u5Var != null) {
                u5Var2 = this.a.l;
                u5Var2.n().F().b("AppId not known when logging event", str2);
                return;
            }
            return;
        }
        this.a.k().C(new bb(this, str, str2, bundle));
    }
}
