package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new e();
    final int a;
    private final ConnectionResult b;
    private final zav c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zak(int i, ConnectionResult connectionResult, zav zavVar) {
        this.a = i;
        this.b = connectionResult;
        this.c = zavVar;
    }

    public final ConnectionResult h() {
        return this.b;
    }

    public final zav k() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.s(parcel, 2, this.b, i, false);
        ys9.s(parcel, 3, this.c, i, false);
        ys9.b(parcel, a);
    }
}
