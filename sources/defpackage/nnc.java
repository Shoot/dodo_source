package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.zzad;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: nnc  reason: default package */
/* loaded from: classes2.dex */
public final class nnc implements Parcelable.Creator<zzad> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzad createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    if (l != 4) {
                        if (l != 5) {
                            SafeParcelReader.A(parcel, t);
                        } else {
                            i2 = SafeParcelReader.v(parcel, t);
                        }
                    } else {
                        i = SafeParcelReader.v(parcel, t);
                    }
                } else {
                    str2 = SafeParcelReader.f(parcel, t);
                }
            } else {
                str = SafeParcelReader.f(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzad(str, str2, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzad[] newArray(int i) {
        return new zzad[i];
    }
}
