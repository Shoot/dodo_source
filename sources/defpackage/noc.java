package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.instantapps.zzam;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: noc  reason: default package */
/* loaded from: classes2.dex */
public final class noc implements Parcelable.Creator<zzam> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzam createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String[] strArr4 = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        if (l != 4) {
                            SafeParcelReader.A(parcel, t);
                        } else {
                            strArr3 = SafeParcelReader.g(parcel, t);
                        }
                    } else {
                        strArr4 = SafeParcelReader.g(parcel, t);
                    }
                } else {
                    strArr2 = SafeParcelReader.g(parcel, t);
                }
            } else {
                strArr = SafeParcelReader.g(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzam(strArr, strArr2, strArr3, strArr4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzam[] newArray(int i) {
        return new zzam[i];
    }
}
