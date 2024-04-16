package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: h6d  reason: default package */
/* loaded from: classes2.dex */
final class h6d extends ctc {
    private final /* synthetic */ k3d a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h6d(k3d k3dVar) {
        this.a = k3dVar;
    }

    @Override // defpackage.ctc, defpackage.v9d
    public final void V0(Status status) throws RemoteException {
        this.a.setResult(status);
    }
}
