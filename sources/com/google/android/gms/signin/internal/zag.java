package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class zag extends AbstractSafeParcelable implements tk9 {
    public static final Parcelable.Creator<zag> CREATOR = new okc();
    private final List a;
    private final String b;

    public zag(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.tk9
    public final Status d() {
        if (this.b != null) {
            return Status.g;
        }
        return Status.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.v(parcel, 1, this.a, false);
        ys9.t(parcel, 2, this.b, false);
        ys9.b(parcel, a);
    }
}
