package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 2:
                    arrayList = SafeParcelReader.j(parcel, t, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.e(parcel, t, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 5:
                    z2 = SafeParcelReader.m(parcel, t);
                    break;
                case 6:
                    z3 = SafeParcelReader.m(parcel, t);
                    break;
                case 7:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 8:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.j(parcel, t, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
