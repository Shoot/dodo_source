package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.TextModuleData;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: b3d  reason: default package */
/* loaded from: classes2.dex */
public final class b3d implements Parcelable.Creator<TextModuleData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TextModuleData createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    SafeParcelReader.A(parcel, t);
                } else {
                    str2 = SafeParcelReader.f(parcel, t);
                }
            } else {
                str = SafeParcelReader.f(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new TextModuleData(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TextModuleData[] newArray(int i) {
        return new TextModuleData[i];
    }
}
