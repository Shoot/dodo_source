package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CardRequirements> CREATOR = new f();
    ArrayList<Integer> a;
    boolean b;
    boolean c;
    int d;

    private CardRequirements() {
        this.b = true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.o(parcel, 1, this.a, false);
        ys9.c(parcel, 2, this.b);
        ys9.c(parcel, 3, this.c);
        ys9.m(parcel, 4, this.d);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CardRequirements(ArrayList<Integer> arrayList, boolean z, boolean z2, int i) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
        this.d = i;
    }
}
