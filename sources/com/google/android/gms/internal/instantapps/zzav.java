package com.google.android.gms.internal.instantapps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new spc();
    final BitmapTeleporter a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final ArrayList<String> f;
    private final zzk g;

    public zzav(BitmapTeleporter bitmapTeleporter, String str, String str2, String str3, String str4, Collection<String> collection, zzk zzkVar) {
        int size;
        this.a = bitmapTeleporter;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        if (collection == null) {
            size = 0;
        } else {
            size = collection.size();
        }
        ArrayList<String> arrayList = new ArrayList<>(size);
        this.f = arrayList;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        this.g = zzkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.s(parcel, 2, this.a, i, false);
        ys9.t(parcel, 3, this.b, false);
        ys9.t(parcel, 4, this.c, false);
        ys9.t(parcel, 5, this.d, false);
        ys9.t(parcel, 6, this.e, false);
        ys9.v(parcel, 7, Collections.unmodifiableList(this.f), false);
        ys9.s(parcel, 8, this.g, i, false);
        ys9.b(parcel, a);
    }
}
