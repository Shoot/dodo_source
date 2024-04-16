package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new b();
    ArrayList<String> a;

    private ShippingAddressRequirements() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.v(parcel, 1, this.a, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShippingAddressRequirements(ArrayList<String> arrayList) {
        this.a = arrayList;
    }
}
