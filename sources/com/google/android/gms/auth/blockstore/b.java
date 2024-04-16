package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    SafeParcelReader.A(parcel, t);
                } else {
                    z = SafeParcelReader.m(parcel, t);
                }
            } else {
                arrayList = SafeParcelReader.h(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new DeleteBytesRequest(arrayList, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeleteBytesRequest[i];
    }
}
