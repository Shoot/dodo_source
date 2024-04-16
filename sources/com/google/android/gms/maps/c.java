package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: classes2.dex */
final class c implements jp5 {
    private final Fragment a;
    private final cs4 b;

    public c(Fragment fragment, cs4 cs4Var) {
        this.b = (cs4) gh8.j(cs4Var);
        this.a = (Fragment) gh8.j(fragment);
    }

    @Override // defpackage.jp5
    public final void a(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            ltc.b(bundle2, bundle3);
            this.b.I1(k57.U1(activity), googleMapOptions, bundle3);
            ltc.b(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.jp5
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            ltc.b(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            ns4 x0 = this.b.x0(k57.U1(layoutInflater), k57.U1(viewGroup), bundle2);
            StrictMode.setThreadPolicy(threadPolicy);
            ltc.b(bundle2, bundle);
            return (View) k57.T1(x0);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void c(n87 n87Var) {
        try {
            this.b.y0(new b(this, n87Var));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.jp5
    public final void g() {
        try {
            this.b.g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.jp5
    public final void o() {
        try {
            this.b.o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.jp5
    public final void onDestroy() {
        try {
            this.b.onDestroy();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.jp5
    public final void onLowMemory() {
        try {
            this.b.onLowMemory();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.jp5
    public final void onPause() {
        try {
            this.b.onPause();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.jp5
    public final void onStart() {
        try {
            this.b.onStart();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.jp5
    public final void p(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            ltc.b(bundle, bundle2);
            this.b.p(bundle2);
            ltc.b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.jp5
    public final void u() {
        try {
            this.b.u();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.jp5
    public final void w(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            ltc.b(bundle, bundle2);
            Bundle arguments = this.a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                ltc.c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.b.w(bundle2);
            ltc.b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
