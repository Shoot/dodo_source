package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class z implements Parcelable.Creator<zzaz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaz createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t) != 2) {
                SafeParcelReader.A(parcel, t);
            } else {
                bundle = SafeParcelReader.a(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzaz(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaz[] newArray(int i) {
        return new zzaz[i];
    }
}
