package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new a();
    int a;
    Bundle b;

    private PaymentMethodTokenizationParameters() {
        this.b = new Bundle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 2, this.a);
        ys9.e(parcel, 3, this.b, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PaymentMethodTokenizationParameters(int i, Bundle bundle) {
        new Bundle();
        this.a = i;
        this.b = bundle;
    }
}
