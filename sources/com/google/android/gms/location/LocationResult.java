package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    private final List<Location> a;
    static final List<Location> b = Collections.emptyList();
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationResult(List<Location> list) {
        this.a = list;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.a.size() != this.a.size()) {
            return false;
        }
        Iterator<Location> it = locationResult.a.iterator();
        Iterator<Location> it2 = this.a.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    @RecentlyNonNull
    public Location h() {
        int size = this.a.size();
        if (size == 0) {
            return null;
        }
        return this.a.get(size - 1);
    }

    public int hashCode() {
        int i = 17;
        for (Location location : this.a) {
            long time = location.getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    @RecentlyNonNull
    public List<Location> k() {
        return this.a;
    }

    @RecentlyNonNull
    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.x(parcel, 1, k(), false);
        ys9.b(parcel, a);
    }
}
