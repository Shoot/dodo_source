package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class hb implements Parcelable.Creator<zznb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zznb createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 2:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 3:
                    j = SafeParcelReader.x(parcel, t);
                    break;
                case 4:
                    l = SafeParcelReader.y(parcel, t);
                    break;
                case 5:
                    f = SafeParcelReader.s(parcel, t);
                    break;
                case 6:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                case 8:
                    d = SafeParcelReader.q(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zznb(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zznb[] newArray(int i) {
        return new zznb[i];
    }
}
