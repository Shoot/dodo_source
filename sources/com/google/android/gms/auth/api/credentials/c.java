package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator<CredentialPickerConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        if (l != 4) {
                            if (l != 1000) {
                                SafeParcelReader.A(parcel, t);
                            } else {
                                i = SafeParcelReader.v(parcel, t);
                            }
                        } else {
                            i2 = SafeParcelReader.v(parcel, t);
                        }
                    } else {
                        z3 = SafeParcelReader.m(parcel, t);
                    }
                } else {
                    z2 = SafeParcelReader.m(parcel, t);
                }
            } else {
                z = SafeParcelReader.m(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
