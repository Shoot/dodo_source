package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        if (l != 4) {
                            SafeParcelReader.A(parcel, t);
                        } else {
                            i2 = SafeParcelReader.v(parcel, t);
                        }
                    } else {
                        i = SafeParcelReader.v(parcel, t);
                    }
                } else {
                    str = SafeParcelReader.f(parcel, t);
                }
            } else {
                z = SafeParcelReader.m(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzq(z, str, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
