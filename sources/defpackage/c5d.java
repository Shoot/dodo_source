package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.wallet.zzm;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: c5d  reason: default package */
/* loaded from: classes2.dex */
public final class c5d implements Parcelable.Creator<zzm> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzm createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t) != 1) {
                SafeParcelReader.A(parcel, t);
            } else {
                bArr = SafeParcelReader.b(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzm(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzm[] newArray(int i) {
        return new zzm[i];
    }
}
