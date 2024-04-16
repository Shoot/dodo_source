package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator<LabelValueRow> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LabelValueRow createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList c = sr.c();
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    if (l != 4) {
                        SafeParcelReader.A(parcel, t);
                    } else {
                        c = SafeParcelReader.j(parcel, t, LabelValue.CREATOR);
                    }
                } else {
                    str2 = SafeParcelReader.f(parcel, t);
                }
            } else {
                str = SafeParcelReader.f(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new LabelValueRow(str, str2, c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LabelValueRow[] newArray(int i) {
        return new LabelValueRow[i];
    }
}
