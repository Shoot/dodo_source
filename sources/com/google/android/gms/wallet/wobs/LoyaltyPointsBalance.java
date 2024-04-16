package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new e();
    int a;
    String b;
    double c;
    String d;
    long e;
    int f;

    LoyaltyPointsBalance() {
        this.f = -1;
        this.a = -1;
        this.c = -1.0d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 2, this.a);
        ys9.t(parcel, 3, this.b, false);
        ys9.h(parcel, 4, this.c);
        ys9.t(parcel, 5, this.d, false);
        ys9.q(parcel, 6, this.e);
        ys9.m(parcel, 7, this.f);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.a = i;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = j;
        this.f = i2;
    }
}
