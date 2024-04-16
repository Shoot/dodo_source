package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
@KeepName
/* loaded from: classes2.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new c();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    @Deprecated
    String h;
    int i;
    ArrayList<WalletObjectMessage> j;
    TimeInterval k;
    ArrayList<LatLng> l;
    @Deprecated
    String m;
    @Deprecated
    String n;
    ArrayList<LabelValueRow> o;
    boolean p;
    ArrayList<UriData> q;
    ArrayList<TextModuleData> r;
    ArrayList<UriData> s;

    CommonWalletObject() {
        this.j = sr.c();
        this.l = sr.c();
        this.o = sr.c();
        this.q = sr.c();
        this.r = sr.c();
        this.s = sr.c();
    }

    public static b h() {
        return new b(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.t(parcel, 3, this.b, false);
        ys9.t(parcel, 4, this.c, false);
        ys9.t(parcel, 5, this.d, false);
        ys9.t(parcel, 6, this.e, false);
        ys9.t(parcel, 7, this.f, false);
        ys9.t(parcel, 8, this.g, false);
        ys9.t(parcel, 9, this.h, false);
        ys9.m(parcel, 10, this.i);
        ys9.x(parcel, 11, this.j, false);
        ys9.s(parcel, 12, this.k, i, false);
        ys9.x(parcel, 13, this.l, false);
        ys9.t(parcel, 14, this.m, false);
        ys9.t(parcel, 15, this.n, false);
        ys9.x(parcel, 16, this.o, false);
        ys9.c(parcel, 17, this.p);
        ys9.x(parcel, 18, this.q, false);
        ys9.x(parcel, 19, this.r, false);
        ys9.x(parcel, 20, this.s, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList<WalletObjectMessage> arrayList, TimeInterval timeInterval, ArrayList<LatLng> arrayList2, String str9, String str10, ArrayList<LabelValueRow> arrayList3, boolean z, ArrayList<UriData> arrayList4, ArrayList<TextModuleData> arrayList5, ArrayList<UriData> arrayList6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
        this.j = arrayList;
        this.k = timeInterval;
        this.l = arrayList2;
        this.m = str9;
        this.n = str10;
        this.o = arrayList3;
        this.p = z;
        this.q = arrayList4;
        this.r = arrayList5;
        this.s = arrayList6;
    }
}
