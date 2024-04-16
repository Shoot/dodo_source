package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new g();
    boolean a;
    long b;
    float c;
    long d;
    int e;

    public zzs() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        if (this.a == zzsVar.a && this.b == zzsVar.b && Float.compare(this.c, zzsVar.c) == 0 && this.d == zzsVar.d && this.e == zzsVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return m57.b(Boolean.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.c);
        long j = this.d;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.e);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.c(parcel, 1, this.a);
        ys9.q(parcel, 2, this.b);
        ys9.j(parcel, 3, this.c);
        ys9.q(parcel, 4, this.d);
        ys9.m(parcel, 5, this.e);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(boolean z, long j, float f, long j2, int i) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = j2;
        this.e = i;
    }
}
