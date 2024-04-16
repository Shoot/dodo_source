package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ns4;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new s();
    private final String a;
    private final boolean b;
    private final boolean c;
    private final Context d;
    private final boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = (Context) k57.T1(ns4.a.C(iBinder));
        this.e = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ns4, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 1, this.a, false);
        ys9.c(parcel, 2, this.b);
        ys9.c(parcel, 3, this.c);
        ys9.l(parcel, 4, k57.U1(this.d), false);
        ys9.c(parcel, 5, this.e);
        ys9.b(parcel, a);
    }
}
