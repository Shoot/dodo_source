package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class zzaz extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzaz> CREATOR = new z();
    private final Bundle a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaz(Bundle bundle) {
        this.a = bundle;
    }

    public final int h() {
        return this.a.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new a0(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double p(String str) {
        return Double.valueOf(this.a.getDouble(str));
    }

    public final Bundle t() {
        return new Bundle(this.a);
    }

    public final String toString() {
        return this.a.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long u(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object v(String str) {
        return this.a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String w(String str) {
        return this.a.getString(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.e(parcel, 2, t(), false);
        ys9.b(parcel, a);
    }
}
