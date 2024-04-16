package com.google.android.gms.internal.instantapps;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator<zzf> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzf createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        byte[] bArr = null;
        PackageInfo packageInfo = null;
        byte[] bArr2 = null;
        int i = 0;
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
                case 10:
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
                case 5:
                    arrayList = SafeParcelReader.j(parcel, t, zzao.CREATOR);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.j(parcel, t, zzh.CREATOR);
                    break;
                case 7:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 8:
                    bArr = SafeParcelReader.b(parcel, t);
                    break;
                case 9:
                    packageInfo = (PackageInfo) SafeParcelReader.e(parcel, t, PackageInfo.CREATOR);
                    break;
                case 11:
                    arrayList3 = SafeParcelReader.j(parcel, t, zzas.CREATOR);
                    break;
                case 12:
                    bArr2 = SafeParcelReader.b(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzf(str, str2, arrayList, arrayList2, arrayList3, i, bArr, packageInfo, bArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzf[] newArray(int i) {
        return new zzf[i];
    }
}
