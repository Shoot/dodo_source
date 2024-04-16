package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator<zzs> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        if (l != 4) {
                            if (l != 5) {
                                SafeParcelReader.A(parcel, t);
                            } else {
                                i = SafeParcelReader.v(parcel, t);
                            }
                        } else {
                            j2 = SafeParcelReader.x(parcel, t);
                        }
                    } else {
                        f = SafeParcelReader.r(parcel, t);
                    }
                } else {
                    j = SafeParcelReader.x(parcel, t);
                }
            } else {
                z = SafeParcelReader.m(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzs(z, j, f, j2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs[] newArray(int i) {
        return new zzs[i];
    }
}
