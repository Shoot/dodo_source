package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class eb implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = -2147483648L;
        String str11 = "";
        String str12 = str11;
        String str13 = str12;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = false;
        int i2 = 100;
        int i3 = 0;
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
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(parcel, t);
                    break;
                case 6:
                    j = SafeParcelReader.x(parcel, t);
                    break;
                case 7:
                    j2 = SafeParcelReader.x(parcel, t);
                    break;
                case 8:
                    str5 = SafeParcelReader.f(parcel, t);
                    break;
                case 9:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 10:
                    z2 = SafeParcelReader.m(parcel, t);
                    break;
                case 11:
                    j8 = SafeParcelReader.x(parcel, t);
                    break;
                case 12:
                    str6 = SafeParcelReader.f(parcel, t);
                    break;
                case 13:
                    j3 = SafeParcelReader.x(parcel, t);
                    break;
                case 14:
                    j4 = SafeParcelReader.x(parcel, t);
                    break;
                case 15:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 16:
                    z3 = SafeParcelReader.m(parcel, t);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
                case 18:
                    z4 = SafeParcelReader.m(parcel, t);
                    break;
                case 19:
                    str7 = SafeParcelReader.f(parcel, t);
                    break;
                case 21:
                    bool = SafeParcelReader.n(parcel, t);
                    break;
                case 22:
                    j5 = SafeParcelReader.x(parcel, t);
                    break;
                case 23:
                    arrayList = SafeParcelReader.h(parcel, t);
                    break;
                case 24:
                    str8 = SafeParcelReader.f(parcel, t);
                    break;
                case 25:
                    str11 = SafeParcelReader.f(parcel, t);
                    break;
                case 26:
                    str12 = SafeParcelReader.f(parcel, t);
                    break;
                case 27:
                    str9 = SafeParcelReader.f(parcel, t);
                    break;
                case 28:
                    z5 = SafeParcelReader.m(parcel, t);
                    break;
                case 29:
                    j6 = SafeParcelReader.x(parcel, t);
                    break;
                case 30:
                    i2 = SafeParcelReader.v(parcel, t);
                    break;
                case 31:
                    str13 = SafeParcelReader.f(parcel, t);
                    break;
                case 32:
                    i3 = SafeParcelReader.v(parcel, t);
                    break;
                case 34:
                    j7 = SafeParcelReader.x(parcel, t);
                    break;
                case 35:
                    str10 = SafeParcelReader.f(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzo(str, str2, str3, str4, j, j2, str5, z, z2, j8, str6, j3, j4, i, z3, z4, str7, bool, j5, arrayList, str8, str11, str12, str9, z5, j6, i2, str13, i3, j7, str10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i) {
        return new zzo[i];
    }
}
