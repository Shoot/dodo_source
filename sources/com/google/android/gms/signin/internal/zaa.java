package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable implements tk9 {
    public static final Parcelable.Creator<zaa> CREATOR = new b();
    final int a;
    private int b;
    private Intent c;

    public zaa() {
        this(2, 0, null);
    }

    @Override // defpackage.tk9
    public final Status d() {
        if (this.b == 0) {
            return Status.g;
        }
        return Status.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.m(parcel, 2, this.b);
        ys9.s(parcel, 3, this.c, i, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaa(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }
}
