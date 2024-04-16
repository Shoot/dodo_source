package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new j();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    @Deprecated
    String i;
    String j;
    int k;
    ArrayList<WalletObjectMessage> l;
    TimeInterval m;
    ArrayList<LatLng> n;
    @Deprecated
    String o;
    @Deprecated
    String p;
    ArrayList<LabelValueRow> q;
    boolean r;
    ArrayList<UriData> s;
    ArrayList<TextModuleData> t;
    ArrayList<UriData> u;
    LoyaltyPoints v;

    LoyaltyWalletObject() {
        this.l = sr.c();
        this.n = sr.c();
        this.q = sr.c();
        this.s = sr.c();
        this.t = sr.c();
        this.u = sr.c();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.t(parcel, 3, this.b, false);
        ys9.t(parcel, 4, this.c, false);
        ys9.t(parcel, 5, this.d, false);
        ys9.t(parcel, 6, this.e, false);
        ys9.t(parcel, 7, this.f, false);
        ys9.t(parcel, 8, this.g, false);
        ys9.t(parcel, 9, this.h, false);
        ys9.t(parcel, 10, this.i, false);
        ys9.t(parcel, 11, this.j, false);
        ys9.m(parcel, 12, this.k);
        ys9.x(parcel, 13, this.l, false);
        ys9.s(parcel, 14, this.m, i, false);
        ys9.x(parcel, 15, this.n, false);
        ys9.t(parcel, 16, this.o, false);
        ys9.t(parcel, 17, this.p, false);
        ys9.x(parcel, 18, this.q, false);
        ys9.c(parcel, 19, this.r);
        ys9.x(parcel, 20, this.s, false);
        ys9.x(parcel, 21, this.t, false);
        ys9.x(parcel, 22, this.u, false);
        ys9.s(parcel, 23, this.v, i, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList<WalletObjectMessage> arrayList, TimeInterval timeInterval, ArrayList<LatLng> arrayList2, String str11, String str12, ArrayList<LabelValueRow> arrayList3, boolean z, ArrayList<UriData> arrayList4, ArrayList<TextModuleData> arrayList5, ArrayList<UriData> arrayList6, LoyaltyPoints loyaltyPoints) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = i;
        this.l = arrayList;
        this.m = timeInterval;
        this.n = arrayList2;
        this.o = str11;
        this.p = str12;
        this.q = arrayList3;
        this.r = z;
        this.s = arrayList4;
        this.t = arrayList5;
        this.u = arrayList6;
        this.v = loyaltyPoints;
    }
}
