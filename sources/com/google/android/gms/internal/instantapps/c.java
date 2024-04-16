package com.google.android.gms.internal.instantapps;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator<zzt> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzt createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        Intent intent = null;
        Intent intent2 = null;
        zzf zzfVar = null;
        zzao zzaoVar = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr2 = null;
        Bundle bundle = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 2:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 3:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 4:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 5:
                    intent = (Intent) SafeParcelReader.e(parcel, t, Intent.CREATOR);
                    break;
                case 6:
                    intent2 = (Intent) SafeParcelReader.e(parcel, t, Intent.CREATOR);
                    break;
                case 7:
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
                case 8:
                    zzfVar = (zzf) SafeParcelReader.e(parcel, t, zzf.CREATOR);
                    break;
                case 9:
                    zzaoVar = (zzao) SafeParcelReader.e(parcel, t, zzao.CREATOR);
                    break;
                case 10:
                    z2 = SafeParcelReader.m(parcel, t);
                    break;
                case 11:
                    bArr = SafeParcelReader.b(parcel, t);
                    break;
                case 12:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 13:
                    i2 = SafeParcelReader.v(parcel, t);
                    break;
                case 14:
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                case 15:
                    bundle = SafeParcelReader.a(parcel, t);
                    break;
                case 16:
                    i3 = SafeParcelReader.v(parcel, t);
                    break;
                case 17:
                    bArr2 = SafeParcelReader.b(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzt(i, str, z, intent, intent2, zzfVar, zzaoVar, z2, bArr, str2, i2, i3, str3, bArr2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzt[] newArray(int i) {
        return new zzt[i];
    }
}
