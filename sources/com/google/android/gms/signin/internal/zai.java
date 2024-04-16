package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new d();
    final int a;
    final zat b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zai(int i, zat zatVar) {
        this.a = i;
        this.b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.s(parcel, 2, this.b, i, false);
        ys9.b(parcel, a);
    }
}
