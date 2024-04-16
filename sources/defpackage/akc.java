package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: akc  reason: default package */
/* loaded from: classes2.dex */
public abstract class akc extends uic implements fkc {
    public akc() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.uic
    protected final boolean T1(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) ejc.a(parcel, ConnectionResult.CREATOR);
                zaa zaaVar = (zaa) ejc.a(parcel, zaa.CREATOR);
                ejc.b(parcel);
                break;
            case 4:
                Status status = (Status) ejc.a(parcel, Status.CREATOR);
                ejc.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) ejc.a(parcel, Status.CREATOR);
                ejc.b(parcel);
                break;
            case 7:
                Status status3 = (Status) ejc.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) ejc.a(parcel, GoogleSignInAccount.CREATOR);
                ejc.b(parcel);
                break;
            case 8:
                ejc.b(parcel);
                Q((zak) ejc.a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zagVar = (zag) ejc.a(parcel, zag.CREATOR);
                ejc.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
