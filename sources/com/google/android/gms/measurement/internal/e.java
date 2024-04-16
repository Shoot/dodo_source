package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        zznb zznbVar = null;
        String str3 = null;
        zzbe zzbeVar = null;
        zzbe zzbeVar2 = null;
        zzbe zzbeVar3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 2:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 4:
                    zznbVar = (zznb) SafeParcelReader.e(parcel, t, zznb.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.x(parcel, t);
                    break;
                case 6:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                case 8:
                    zzbeVar = (zzbe) SafeParcelReader.e(parcel, t, zzbe.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.x(parcel, t);
                    break;
                case 10:
                    zzbeVar2 = (zzbe) SafeParcelReader.e(parcel, t, zzbe.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.x(parcel, t);
                    break;
                case 12:
                    zzbeVar3 = (zzbe) SafeParcelReader.e(parcel, t, zzbe.CREATOR);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzae(str, str2, zznbVar, j, z, str3, zzbeVar, j2, zzbeVar2, j3, zzbeVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i) {
        return new zzae[i];
    }
}
