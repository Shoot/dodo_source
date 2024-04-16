package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.inappstory.sdk.stories.api.models.Image;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();
    int a;
    long b;
    long c;
    boolean d;
    long e;
    int f;
    float g;
    long h;
    boolean i;

    @Deprecated
    public LocationRequest() {
        this.a = 102;
        this.b = CoreConstants.MILLIS_IN_ONE_HOUR;
        this.c = 600000L;
        this.d = false;
        this.e = Long.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0.0f;
        this.h = 0L;
        this.i = false;
    }

    private static void u(long j) {
        if (j >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.a == locationRequest.a && this.b == locationRequest.b && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && h() == locationRequest.h() && this.i == locationRequest.i) {
                return true;
            }
        }
        return false;
    }

    public long h() {
        long j = this.h;
        long j2 = this.b;
        if (j < j2) {
            return j2;
        }
        return j;
    }

    public int hashCode() {
        return m57.b(Integer.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.g), Long.valueOf(this.h));
    }

    @RecentlyNonNull
    public LocationRequest k(long j) {
        u(j);
        this.d = true;
        this.c = j;
        return this;
    }

    @RecentlyNonNull
    public LocationRequest p(long j) {
        u(j);
        this.b = j;
        if (!this.d) {
            this.c = (long) (j / 6.0d);
        }
        return this;
    }

    @RecentlyNonNull
    public LocationRequest t(int i) {
        if (i != 100 && i != 102 && i != 104 && i != 105) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("invalid quality: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.a = i;
        return this;
    }

    @RecentlyNonNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.a;
        if (i != 100) {
            if (i != 102) {
                if (i != 104) {
                    if (i != 105) {
                        str = "???";
                    } else {
                        str = "PRIORITY_NO_POWER";
                    }
                } else {
                    str = "PRIORITY_LOW_POWER";
                }
            } else {
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
            }
        } else {
            str = "PRIORITY_HIGH_ACCURACY";
        }
        sb.append(str);
        if (this.a != 105) {
            sb.append(" requested=");
            sb.append(this.b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.c);
        sb.append("ms");
        if (this.h > this.b) {
            sb.append(" maxWait=");
            sb.append(this.h);
            sb.append("ms");
        }
        if (this.g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.g);
            sb.append(Image.TYPE_MEDIUM);
        }
        long j = this.e;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.q(parcel, 2, this.b);
        ys9.q(parcel, 3, this.c);
        ys9.c(parcel, 4, this.d);
        ys9.q(parcel, 5, this.e);
        ys9.m(parcel, 6, this.f);
        ys9.j(parcel, 7, this.g);
        ys9.q(parcel, 8, this.h);
        ys9.c(parcel, 9, this.i);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = i2;
        this.g = f;
        this.h = j4;
        this.i = z2;
    }
}
