package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: aqb  reason: default package */
/* loaded from: classes2.dex */
public final class aqb {
    private final dt4 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aqb(dt4 dt4Var) {
        this.a = dt4Var;
    }

    public void a(boolean z) {
        try {
            this.a.r0(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void b(boolean z) {
        try {
            this.a.p0(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void c(boolean z) {
        try {
            this.a.r1(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
