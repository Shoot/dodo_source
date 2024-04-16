package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.wallet.zzi;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: d2d  reason: default package */
/* loaded from: classes2.dex */
public final class d2d implements Parcelable.Creator<zzi> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzi createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t) != 2) {
                SafeParcelReader.A(parcel, t);
            } else {
                bArr = SafeParcelReader.b(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzi(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzi[] newArray(int i) {
        return new zzi[i];
    }
}
