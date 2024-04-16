package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.instantapps.LaunchData;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: y1d  reason: default package */
/* loaded from: classes2.dex */
public final class y1d implements Parcelable.Creator<LaunchData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LaunchData createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Intent intent = null;
        String str = null;
        String str2 = null;
        BitmapTeleporter bitmapTeleporter = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    if (l != 4) {
                        if (l != 5) {
                            SafeParcelReader.A(parcel, t);
                        } else {
                            bitmapTeleporter = (BitmapTeleporter) SafeParcelReader.e(parcel, t, BitmapTeleporter.CREATOR);
                        }
                    } else {
                        str2 = SafeParcelReader.f(parcel, t);
                    }
                } else {
                    str = SafeParcelReader.f(parcel, t);
                }
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, t, Intent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new LaunchData(intent, str, str2, bitmapTeleporter);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LaunchData[] newArray(int i) {
        return new LaunchData[i];
    }
}
