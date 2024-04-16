package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new t();
    private final boolean a;
    private final String b;
    private final int c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(boolean z, String str, int i, int i2) {
        this.a = z;
        this.b = str;
        this.c = x.a(i) - 1;
        this.d = h.a(i2) - 1;
    }

    public final String h() {
        return this.b;
    }

    public final boolean k() {
        return this.a;
    }

    public final int p() {
        return h.a(this.d);
    }

    public final int t() {
        return x.a(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.c(parcel, 1, this.a);
        ys9.t(parcel, 2, this.b, false);
        ys9.m(parcel, 3, this.c);
        ys9.m(parcel, 4, this.d);
        ys9.b(parcel, a);
    }
}
