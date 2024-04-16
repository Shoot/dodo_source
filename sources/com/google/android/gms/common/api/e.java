package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        if (l != 4) {
                            if (l != 1000) {
                                SafeParcelReader.A(parcel, t);
                            } else {
                                i = SafeParcelReader.v(parcel, t);
                            }
                        } else {
                            connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, t, ConnectionResult.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, t, PendingIntent.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.f(parcel, t);
                }
            } else {
                i2 = SafeParcelReader.v(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
