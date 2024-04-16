package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.TransactionInfo;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: aoc  reason: default package */
/* loaded from: classes2.dex */
public final class aoc implements Parcelable.Creator<TransactionInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TransactionInfo createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        SafeParcelReader.A(parcel, t);
                    } else {
                        str2 = SafeParcelReader.f(parcel, t);
                    }
                } else {
                    str = SafeParcelReader.f(parcel, t);
                }
            } else {
                i = SafeParcelReader.v(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new TransactionInfo(i, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TransactionInfo[] newArray(int i) {
        return new TransactionInfo[i];
    }
}
