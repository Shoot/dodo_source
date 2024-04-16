package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.m57;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new dtc();
    private final String a;
    @Deprecated
    private final int b;
    private final long c;

    public Feature(@NonNull String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((h() != null && h().equals(feature.h())) || (h() == null && feature.h() == null)) && k() == feature.k()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String h() {
        return this.a;
    }

    public final int hashCode() {
        return m57.b(h(), Long.valueOf(k()));
    }

    public long k() {
        long j = this.c;
        if (j == -1) {
            return this.b;
        }
        return j;
    }

    @NonNull
    public final String toString() {
        m57.a c = m57.c(this);
        c.a(Action.NAME_ATTRIBUTE, h());
        c.a("version", Long.valueOf(k()));
        return c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 1, h(), false);
        ys9.m(parcel, 2, this.b);
        ys9.q(parcel, 3, k());
        ys9.b(parcel, a);
    }

    public Feature(@NonNull String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }
}
