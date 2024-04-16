package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new d();
    @Deprecated
    String a;
    @Deprecated
    String b;
    ArrayList<LabelValue> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LabelValueRow(String str, String str2, ArrayList<LabelValue> arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.t(parcel, 3, this.b, false);
        ys9.x(parcel, 4, this.c, false);
        ys9.b(parcel, a);
    }
}
