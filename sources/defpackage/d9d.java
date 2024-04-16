package defpackage;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.internal.instantapps.zzaj;
import com.google.android.gms.internal.instantapps.zzam;
import com.google.android.gms.internal.instantapps.zzav;
import com.google.android.gms.internal.instantapps.zzn;
import com.google.android.gms.internal.instantapps.zzt;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: d9d  reason: default package */
/* loaded from: classes2.dex */
public abstract class d9d extends dqc implements x9d {
    public d9d() {
        super("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
    }

    @Override // defpackage.dqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            if (i != 13) {
                if (i != 9) {
                    if (i != 10) {
                        if (i != 26) {
                            if (i != 27) {
                                switch (i) {
                                    case 18:
                                        R((Status) rsc.a(parcel, Status.CREATOR), (PackageInfo) rsc.a(parcel, PackageInfo.CREATOR));
                                        return true;
                                    case 19:
                                        g0((Status) rsc.a(parcel, Status.CREATOR), (LaunchData) rsc.a(parcel, LaunchData.CREATOR));
                                        return true;
                                    case 20:
                                        m1((Status) rsc.a(parcel, Status.CREATOR), parcel.createTypedArrayList(zzav.CREATOR));
                                        return true;
                                    case 21:
                                        F((Status) rsc.a(parcel, Status.CREATOR), (ParcelFileDescriptor) rsc.a(parcel, ParcelFileDescriptor.CREATOR));
                                        return true;
                                    case 22:
                                        G0((Status) rsc.a(parcel, Status.CREATOR), (BitmapTeleporter) rsc.a(parcel, BitmapTeleporter.CREATOR));
                                        return true;
                                    case 23:
                                        S0((Status) rsc.a(parcel, Status.CREATOR), (zzn) rsc.a(parcel, zzn.CREATOR));
                                        return true;
                                    default:
                                        return false;
                                }
                            }
                            l((Status) rsc.a(parcel, Status.CREATOR), rsc.c(parcel));
                            return true;
                        }
                        A1((Status) rsc.a(parcel, Status.CREATOR), rsc.c(parcel));
                        return true;
                    }
                    m(parcel.readInt());
                    return true;
                }
                M0((Status) rsc.a(parcel, Status.CREATOR), (zzam) rsc.a(parcel, zzam.CREATOR));
                return true;
            }
            n0((Status) rsc.a(parcel, Status.CREATOR), (zzaj) rsc.a(parcel, zzaj.CREATOR));
            return true;
        }
        W((Status) rsc.a(parcel, Status.CREATOR), (zzt) rsc.a(parcel, zzt.CREATOR));
        return true;
    }
}
