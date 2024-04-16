package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: sbd  reason: default package */
/* loaded from: classes2.dex */
public final class sbd extends avc implements kad {
    /* JADX INFO: Access modifiers changed from: package-private */
    public sbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // defpackage.kad
    public final void F1(v9d v9dVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel x = x();
        bxc.b(x, v9dVar);
        bxc.c(x, googleSignInOptions);
        C(102, x);
    }

    @Override // defpackage.kad
    public final void z1(v9d v9dVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel x = x();
        bxc.b(x, v9dVar);
        bxc.c(x, googleSignInOptions);
        C(103, x);
    }
}
