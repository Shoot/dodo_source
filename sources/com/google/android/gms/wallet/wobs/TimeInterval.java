package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<TimeInterval> CREATOR = new s3d();
    long a;
    long b;

    TimeInterval() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.q(parcel, 2, this.a);
        ys9.q(parcel, 3, this.b);
        ys9.b(parcel, a);
    }

    public TimeInterval(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
