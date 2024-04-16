package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator<SignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 4) {
                if (l != 7) {
                    if (l != 8) {
                        SafeParcelReader.A(parcel, t);
                    } else {
                        str2 = SafeParcelReader.f(parcel, t);
                    }
                } else {
                    googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.e(parcel, t, GoogleSignInAccount.CREATOR);
                }
            } else {
                str = SafeParcelReader.f(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i) {
        return new SignInAccount[i];
    }
}
