package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        zzba zzbaVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 2:
                    zzbaVar = (zzba) SafeParcelReader.e(parcel, t, zzba.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.u(parcel, t);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, t, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.u(parcel, t);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.u(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzbc(i, zzbaVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i) {
        return new zzbc[i];
    }
}
