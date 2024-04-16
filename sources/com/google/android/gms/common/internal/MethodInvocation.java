package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new wkc();
    private final int a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final String f;
    private final String g;
    private final int h;
    private final int i;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.m(parcel, 2, this.b);
        ys9.m(parcel, 3, this.c);
        ys9.q(parcel, 4, this.d);
        ys9.q(parcel, 5, this.e);
        ys9.t(parcel, 6, this.f, false);
        ys9.t(parcel, 7, this.g, false);
        ys9.m(parcel, 8, this.h);
        ys9.m(parcel, 9, this.i);
        ys9.b(parcel, a);
    }
}
