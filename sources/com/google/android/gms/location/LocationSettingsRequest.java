package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new e();
    private final List<LocationRequest> a;
    private final boolean b;
    private final boolean c;
    private zzbj d;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    /* loaded from: classes2.dex */
    public static final class a {
        private final ArrayList<LocationRequest> a = new ArrayList<>();
        private boolean b = false;
        private boolean c = false;

        @RecentlyNonNull
        public a a(@RecentlyNonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.a.add(locationRequest);
            }
            return this;
        }

        @RecentlyNonNull
        public LocationSettingsRequest b() {
            return new LocationSettingsRequest(this.a, this.b, this.c, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2, zzbj zzbjVar) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = zzbjVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = ys9.a(parcel);
        ys9.x(parcel, 1, Collections.unmodifiableList(this.a), false);
        ys9.c(parcel, 2, this.b);
        ys9.c(parcel, 3, this.c);
        ys9.s(parcel, 5, this.d, i, false);
        ys9.b(parcel, a2);
    }
}
