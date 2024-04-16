package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.instantapps.zzav;
import com.google.android.gms.internal.instantapps.zzk;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: spc  reason: default package */
/* loaded from: classes2.dex */
public final class spc implements Parcelable.Creator<zzav> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzav createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        BitmapTeleporter bitmapTeleporter = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList<String> arrayList = null;
        zzk zzkVar = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 2:
                    bitmapTeleporter = (BitmapTeleporter) SafeParcelReader.e(parcel, t, BitmapTeleporter.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.f(parcel, t);
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
                    arrayList = SafeParcelReader.h(parcel, t);
                    break;
                case 8:
                    zzkVar = (zzk) SafeParcelReader.e(parcel, t, zzk.CREATOR);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzav(bitmapTeleporter, str, str2, str3, str4, arrayList, zzkVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzav[] newArray(int i) {
        return new zzav[i];
    }
}
