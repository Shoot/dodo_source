package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new g();
    String a;
    String b;
    TimeInterval c;
    @Deprecated
    UriData d;
    @Deprecated
    UriData e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.a = str;
        this.b = str2;
        this.c = timeInterval;
        this.d = uriData;
        this.e = uriData2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.t(parcel, 3, this.b, false);
        ys9.s(parcel, 4, this.c, i, false);
        ys9.s(parcel, 5, this.d, i, false);
        ys9.s(parcel, 6, this.e, i, false);
        ys9.b(parcel, a);
    }
}
