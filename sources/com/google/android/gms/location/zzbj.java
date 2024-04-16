package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new d();
    private final String a;
    private final String b;
    private final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(String str, String str2, String str3) {
        this.c = str;
        this.a = str2;
        this.b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 1, this.a, false);
        ys9.t(parcel, 2, this.b, false);
        ys9.t(parcel, 5, this.c, false);
        ys9.b(parcel, a);
    }
}
