package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.wallet.zzi;
import com.google.android.gms.internal.wallet.zzk;
import com.google.android.gms.internal.wallet.zzm;
import com.google.android.gms.internal.wallet.zzo;
import com.google.android.gms.internal.wallet.zzq;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.zzan;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: pad  reason: default package */
/* loaded from: classes2.dex */
public abstract class pad extends iqc implements wad {
    public pad() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    @Override // defpackage.iqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                i0(parcel.readInt(), (MaskedWallet) vsc.a(parcel, MaskedWallet.CREATOR), (Bundle) vsc.a(parcel, Bundle.CREATOR));
                return true;
            case 2:
                L1(parcel.readInt(), (FullWallet) vsc.a(parcel, FullWallet.CREATOR), (Bundle) vsc.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                b0(parcel.readInt(), vsc.d(parcel), (Bundle) vsc.a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                w0(parcel.readInt(), (Bundle) vsc.a(parcel, Bundle.CREATOR));
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                vsc.d(parcel);
                Bundle bundle = (Bundle) vsc.a(parcel, Bundle.CREATOR);
                return true;
            case 7:
                Status status = (Status) vsc.a(parcel, Status.CREATOR);
                zzi zziVar = (zzi) vsc.a(parcel, zzi.CREATOR);
                Bundle bundle2 = (Bundle) vsc.a(parcel, Bundle.CREATOR);
                return true;
            case 8:
                Status status2 = (Status) vsc.a(parcel, Status.CREATOR);
                Bundle bundle3 = (Bundle) vsc.a(parcel, Bundle.CREATOR);
                return true;
            case 9:
                Q0((Status) vsc.a(parcel, Status.CREATOR), vsc.d(parcel), (Bundle) vsc.a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Status status3 = (Status) vsc.a(parcel, Status.CREATOR);
                zzk zzkVar = (zzk) vsc.a(parcel, zzk.CREATOR);
                Bundle bundle4 = (Bundle) vsc.a(parcel, Bundle.CREATOR);
                return true;
            case 11:
                Status status4 = (Status) vsc.a(parcel, Status.CREATOR);
                Bundle bundle5 = (Bundle) vsc.a(parcel, Bundle.CREATOR);
                return true;
            case 12:
                Status status5 = (Status) vsc.a(parcel, Status.CREATOR);
                zzan zzanVar = (zzan) vsc.a(parcel, zzan.CREATOR);
                Bundle bundle6 = (Bundle) vsc.a(parcel, Bundle.CREATOR);
                return true;
            case 13:
                Status status6 = (Status) vsc.a(parcel, Status.CREATOR);
                Bundle bundle7 = (Bundle) vsc.a(parcel, Bundle.CREATOR);
                return true;
            case 14:
                u0((Status) vsc.a(parcel, Status.CREATOR), (PaymentData) vsc.a(parcel, PaymentData.CREATOR), (Bundle) vsc.a(parcel, Bundle.CREATOR));
                return true;
            case 15:
                Status status7 = (Status) vsc.a(parcel, Status.CREATOR);
                zzq zzqVar = (zzq) vsc.a(parcel, zzq.CREATOR);
                Bundle bundle8 = (Bundle) vsc.a(parcel, Bundle.CREATOR);
                return true;
            case 16:
                Status status8 = (Status) vsc.a(parcel, Status.CREATOR);
                zzm zzmVar = (zzm) vsc.a(parcel, zzm.CREATOR);
                Bundle bundle9 = (Bundle) vsc.a(parcel, Bundle.CREATOR);
                return true;
            case 17:
                Status status9 = (Status) vsc.a(parcel, Status.CREATOR);
                zzo zzoVar = (zzo) vsc.a(parcel, zzo.CREATOR);
                Bundle bundle10 = (Bundle) vsc.a(parcel, Bundle.CREATOR);
                return true;
            case 18:
                parcel.readInt();
                Bundle bundle11 = (Bundle) vsc.a(parcel, Bundle.CREATOR);
                return true;
        }
    }
}
