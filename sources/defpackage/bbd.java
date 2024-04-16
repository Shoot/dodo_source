package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: bbd  reason: default package */
/* loaded from: classes2.dex */
public abstract class bbd extends htc implements v9d {
    public bbd() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.htc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                h1((GoogleSignInAccount) bxc.a(parcel, GoogleSignInAccount.CREATOR), (Status) bxc.a(parcel, Status.CREATOR));
                break;
            case 102:
                N0((Status) bxc.a(parcel, Status.CREATOR));
                break;
            case 103:
                V0((Status) bxc.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
