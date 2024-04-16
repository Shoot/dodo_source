package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new r();
    Bundle a;
    Feature[] b;
    int c;
    ConnectionTelemetryConfiguration d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.a = bundle;
        this.b = featureArr;
        this.c = i;
        this.d = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.e(parcel, 1, this.a, false);
        ys9.w(parcel, 2, this.b, i, false);
        ys9.m(parcel, 3, this.c);
        ys9.s(parcel, 4, this.d, i, false);
        ys9.b(parcel, a);
    }

    public zzj() {
    }
}
