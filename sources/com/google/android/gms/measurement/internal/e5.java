package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class e5 {
    final u5 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e5(va vaVar) {
        this.a = vaVar.i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(String str, nsc nscVar) {
        this.a.k().l();
        if (nscVar == null) {
            this.a.n().K().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle q = nscVar.q(bundle);
            if (q == null) {
                this.a.n().F().a("Install Referrer Service returned a null response");
                return null;
            }
            return q;
        } catch (Exception e) {
            this.a.n().F().b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        try {
            uo7 a = t8c.a(this.a.zza());
            if (a == null) {
                this.a.n().J().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.e("com.android.vending", 128).versionCode < 80837300) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            this.a.n().J().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
