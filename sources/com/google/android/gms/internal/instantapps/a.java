package com.google.android.gms.internal.instantapps;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator<zzaj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaj createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        String str = null;
        Account[] accountArr = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    if (l != 4) {
                        SafeParcelReader.A(parcel, t);
                    } else {
                        accountArr = (Account[]) SafeParcelReader.i(parcel, t, Account.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.f(parcel, t);
                }
            } else {
                i = SafeParcelReader.v(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzaj(i, str, accountArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaj[] newArray(int i) {
        return new zzaj[i];
    }
}
