package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: classes2.dex */
final class d extends qs2 {
    private final Fragment e;
    protected t77 f;
    private Activity g;
    private final List h = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Fragment fragment) {
        this.e = fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void v(d dVar, Activity activity) {
        dVar.g = activity;
        dVar.x();
    }

    @Override // defpackage.qs2
    protected final void a(t77 t77Var) {
        this.f = t77Var;
        x();
    }

    public final void w(n87 n87Var) {
        if (b() != null) {
            ((c) b()).c(n87Var);
        } else {
            this.h.add(n87Var);
        }
    }

    public final void x() {
        if (this.g != null && this.f != null && b() == null) {
            try {
                c86.a(this.g);
                cs4 H1 = ntc.a(this.g, null).H1(k57.U1(this.g));
                if (H1 == null) {
                    return;
                }
                this.f.a(new c(this.e, H1));
                for (n87 n87Var : this.h) {
                    ((c) b()).c(n87Var);
                }
                this.h.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
