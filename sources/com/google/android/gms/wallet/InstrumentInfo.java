package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new e5d();
    private String a;
    private String b;
    private int c;

    private InstrumentInfo() {
    }

    public int h() {
        int i = this.c;
        if (i != 1 && i != 2 && i != 3) {
            return 0;
        }
        return i;
    }

    @RecentlyNonNull
    public String k() {
        return this.b;
    }

    @RecentlyNonNull
    public String p() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, p(), false);
        ys9.t(parcel, 3, k(), false);
        ys9.m(parcel, 4, h());
        ys9.b(parcel, a);
    }

    public InstrumentInfo(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
