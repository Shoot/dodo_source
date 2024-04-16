package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: suc  reason: default package */
/* loaded from: classes2.dex */
public final class suc extends Fragment {
    private int a;
    private btc<?> b;
    boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(y6b<? extends x00> y6bVar) {
        if (!this.c) {
            this.c = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (y6bVar != null) {
                y00.i(activity, this.a, y6bVar);
            } else {
                y00.h(activity, this.a, 0, new Intent());
            }
        }
    }

    private final void c() {
        btc<?> btcVar = this.b;
        if (btcVar != null) {
            btcVar.c(this);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getInt("requestCode");
        if (y00.b != getArguments().getLong("initializationElapsedRealtime")) {
            this.b = null;
        } else {
            this.b = btc.e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.c = z;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        c();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        btc<?> btcVar = this.b;
        if (btcVar != null) {
            btcVar.d(this);
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        b(null);
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.c);
        c();
    }
}
