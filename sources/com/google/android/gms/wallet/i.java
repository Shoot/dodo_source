package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class i implements Parcelable.Creator<IsReadyToPayRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IsReadyToPayRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList<Integer> arrayList2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 2:
                    arrayList = SafeParcelReader.d(parcel, t);
                    break;
                case 3:
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 5:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.d(parcel, t);
                    break;
                case 7:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 8:
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new IsReadyToPayRequest(arrayList, str, str2, arrayList2, z, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IsReadyToPayRequest[] newArray(int i) {
        return new IsReadyToPayRequest[i];
    }
}
