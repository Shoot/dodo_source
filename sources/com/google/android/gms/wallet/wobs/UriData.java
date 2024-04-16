package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class UriData extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<UriData> CREATOR = new j4d();
    String a;
    String b;

    UriData() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.t(parcel, 3, this.b, false);
        ys9.b(parcel, a);
    }

    public UriData(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this.a = str;
        this.b = str2;
    }
}
