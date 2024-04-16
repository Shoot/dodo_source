package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzaa;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: hoc  reason: default package */
/* loaded from: classes2.dex */
final class hoc extends vnc {
    final /* synthetic */ a7b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hoc(p94 p94Var, a7b a7bVar) {
        this.a = a7bVar;
    }

    @Override // defpackage.ync
    public final void M1(zzaa zzaaVar) throws RemoteException {
        Status d = zzaaVar.d();
        if (d == null) {
            this.a.d(new ApiException(new Status(8, "Got null status from location service")));
        } else if (d.p() == 0) {
            this.a.c(Boolean.TRUE);
        } else {
            this.a.d(jm.a(d));
        }
    }

    @Override // defpackage.ync
    public final void c() {
    }
}
