package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class qa implements Parcelable.Creator<zzmh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmh createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        SafeParcelReader.A(parcel, t);
                    } else {
                        i = SafeParcelReader.v(parcel, t);
                    }
                } else {
                    j = SafeParcelReader.x(parcel, t);
                }
            } else {
                str = SafeParcelReader.f(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzmh(str, j, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmh[] newArray(int i) {
        return new zzmh[i];
    }
}
