package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: c4d  reason: default package */
/* loaded from: classes2.dex */
final class c4d extends ctc {
    private final /* synthetic */ x1d a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c4d(x1d x1dVar) {
        this.a = x1dVar;
    }

    @Override // defpackage.ctc, defpackage.v9d
    public final void N0(Status status) throws RemoteException {
        this.a.setResult(status);
    }
}
