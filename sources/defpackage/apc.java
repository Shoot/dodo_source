package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.instantapps.zzao;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: apc  reason: default package */
/* loaded from: classes2.dex */
public final class apc implements Parcelable.Creator<zzao> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzao createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 2:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 3:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 5:
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                case 6:
                    str4 = SafeParcelReader.f(parcel, t);
                    break;
                case 7:
                    str6 = SafeParcelReader.f(parcel, t);
                    break;
                case 8:
                    str7 = SafeParcelReader.f(parcel, t);
                    break;
                case 9:
                    str5 = SafeParcelReader.f(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzao(str, i, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzao[] newArray(int i) {
        return new zzao[i];
    }
}
