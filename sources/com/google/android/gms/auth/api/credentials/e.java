package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator<HintRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HintRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1000) {
                switch (l) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.e(parcel, t, CredentialPickerConfig.CREATOR);
                        continue;
                    case 2:
                        z = SafeParcelReader.m(parcel, t);
                        continue;
                    case 3:
                        z2 = SafeParcelReader.m(parcel, t);
                        continue;
                    case 4:
                        strArr = SafeParcelReader.g(parcel, t);
                        continue;
                    case 5:
                        z3 = SafeParcelReader.m(parcel, t);
                        continue;
                    case 6:
                        str = SafeParcelReader.f(parcel, t);
                        continue;
                    case 7:
                        str2 = SafeParcelReader.f(parcel, t);
                        continue;
                    default:
                        SafeParcelReader.A(parcel, t);
                        continue;
                }
            } else {
                i = SafeParcelReader.v(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HintRequest[] newArray(int i) {
        return new HintRequest[i];
    }
}
