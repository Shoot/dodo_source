package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator<UserAddress> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserAddress createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
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
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(parcel, t);
                    break;
                case 6:
                    str5 = SafeParcelReader.f(parcel, t);
                    break;
                case 7:
                    str6 = SafeParcelReader.f(parcel, t);
                    break;
                case 8:
                    str7 = SafeParcelReader.f(parcel, t);
                    break;
                case 9:
                    str8 = SafeParcelReader.f(parcel, t);
                    break;
                case 10:
                    str9 = SafeParcelReader.f(parcel, t);
                    break;
                case 11:
                    str10 = SafeParcelReader.f(parcel, t);
                    break;
                case 12:
                    str11 = SafeParcelReader.f(parcel, t);
                    break;
                case 13:
                    str12 = SafeParcelReader.f(parcel, t);
                    break;
                case 14:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 15:
                    str13 = SafeParcelReader.f(parcel, t);
                    break;
                case 16:
                    str14 = SafeParcelReader.f(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserAddress[] newArray(int i) {
        return new UserAddress[i];
    }
}
