package defpackage;

import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: xpc  reason: default package */
/* loaded from: classes2.dex */
final class xpc extends ooc {
    private p70<LocationSettingsResult> a;

    public xpc(p70<LocationSettingsResult> p70Var) {
        boolean z;
        if (p70Var != null) {
            z = true;
        } else {
            z = false;
        }
        gh8.b(z, "listener can't be null.");
        this.a = p70Var;
    }

    @Override // defpackage.toc
    public final void S(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.a.a(locationSettingsResult);
        this.a = null;
    }
}
