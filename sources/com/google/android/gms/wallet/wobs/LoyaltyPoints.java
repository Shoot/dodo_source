package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new f();
    String a;
    LoyaltyPointsBalance b;
    @Deprecated
    TimeInterval c;

    LoyaltyPoints() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.s(parcel, 3, this.b, i, false);
        ys9.s(parcel, 5, this.c, i, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.a = str;
        this.b = loyaltyPointsBalance;
        this.c = timeInterval;
    }
}
