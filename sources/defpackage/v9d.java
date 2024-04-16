package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: v9d  reason: default package */
/* loaded from: classes2.dex */
public interface v9d extends IInterface {
    void N0(Status status) throws RemoteException;

    void V0(Status status) throws RemoteException;

    void h1(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;
}
