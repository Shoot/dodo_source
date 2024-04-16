package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class j implements Parcelable.Creator<LoyaltyWalletObject> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LoyaltyWalletObject createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList c = sr.c();
        ArrayList c2 = sr.c();
        ArrayList c3 = sr.c();
        ArrayList arrayList = c;
        ArrayList arrayList2 = c2;
        ArrayList arrayList3 = c3;
        ArrayList c4 = sr.c();
        ArrayList c5 = sr.c();
        ArrayList c6 = sr.c();
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
        TimeInterval timeInterval = null;
        String str11 = null;
        String str12 = null;
        LoyaltyPoints loyaltyPoints = null;
        int i = 0;
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
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 13:
                    arrayList = SafeParcelReader.j(parcel, t, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) SafeParcelReader.e(parcel, t, TimeInterval.CREATOR);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.j(parcel, t, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = SafeParcelReader.f(parcel, t);
                    break;
                case 17:
                    str12 = SafeParcelReader.f(parcel, t);
                    break;
                case 18:
                    arrayList3 = SafeParcelReader.j(parcel, t, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 20:
                    c4 = SafeParcelReader.j(parcel, t, UriData.CREATOR);
                    break;
                case 21:
                    c5 = SafeParcelReader.j(parcel, t, TextModuleData.CREATOR);
                    break;
                case 22:
                    c6 = SafeParcelReader.j(parcel, t, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) SafeParcelReader.e(parcel, t, LoyaltyPoints.CREATOR);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new LoyaltyWalletObject(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i, arrayList, timeInterval, arrayList2, str11, str12, arrayList3, z, c4, c5, c6, loyaltyPoints);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LoyaltyWalletObject[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
