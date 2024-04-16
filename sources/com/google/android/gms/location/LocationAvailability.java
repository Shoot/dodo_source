package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();
    @Deprecated
    int a;
    @Deprecated
    int b;
    long c;
    int d;
    zzbo[] e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationAvailability(int i, int i2, int i3, long j, zzbo[] zzboVarArr) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = zzboVarArr;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        if (this.d < 1000) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return m57.b(Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), this.e);
    }

    @RecentlyNonNull
    public String toString() {
        boolean h = h();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(h);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.m(parcel, 2, this.b);
        ys9.q(parcel, 3, this.c);
        ys9.m(parcel, 4, this.d);
        ys9.w(parcel, 5, this.e, i, false);
        ys9.b(parcel, a);
    }
}
