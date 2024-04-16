package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new l3d();
    private final RootTelemetryConfiguration a;
    private final boolean b;
    private final boolean c;
    private final int[] d;
    private final int e;
    private final int[] f;

    public ConnectionTelemetryConfiguration(@NonNull RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = rootTelemetryConfiguration;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    public int h() {
        return this.e;
    }

    public int[] k() {
        return this.d;
    }

    public int[] p() {
        return this.f;
    }

    public boolean t() {
        return this.b;
    }

    public boolean u() {
        return this.c;
    }

    @NonNull
    public final RootTelemetryConfiguration v() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.s(parcel, 1, this.a, i, false);
        ys9.c(parcel, 2, t());
        ys9.c(parcel, 3, u());
        ys9.n(parcel, 4, k(), false);
        ys9.m(parcel, 5, h());
        ys9.n(parcel, 6, p(), false);
        ys9.b(parcel, a);
    }
}
