package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new boc();
    private final int a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final int e;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public int h() {
        return this.d;
    }

    public int k() {
        return this.e;
    }

    public boolean p() {
        return this.b;
    }

    public boolean t() {
        return this.c;
    }

    public int u() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, u());
        ys9.c(parcel, 2, p());
        ys9.c(parcel, 3, t());
        ys9.m(parcel, 4, h());
        ys9.m(parcel, 5, k());
        ys9.b(parcel, a);
    }
}
