package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.wallet.zzo;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: v7d  reason: default package */
/* loaded from: classes2.dex */
public final class v7d implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzo createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t) != 1) {
                SafeParcelReader.A(parcel, t);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, t, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzo(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzo[] newArray(int i) {
        return new zzo[i];
    }
}
