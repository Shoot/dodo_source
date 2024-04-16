package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: x1d  reason: default package */
/* loaded from: classes2.dex */
public final class x1d extends x4d<Status> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x1d(c cVar) {
        super(cVar);
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* synthetic */ void b(zwc zwcVar) throws RemoteException {
        zwc zwcVar2 = zwcVar;
        ((kad) zwcVar2.A()).F1(new c4d(this), zwcVar2.j0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ tk9 createFailedResult(Status status) {
        return status;
    }
}
