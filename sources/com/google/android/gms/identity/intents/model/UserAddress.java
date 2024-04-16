package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new a();
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private String n;
    private String o;

    UserAddress() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
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
        ys9.t(parcel, 12, this.k, false);
        ys9.t(parcel, 13, this.l, false);
        ys9.c(parcel, 14, this.m);
        ys9.t(parcel, 15, this.n, false);
        ys9.t(parcel, 16, this.o, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
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
        this.k = str11;
        this.l = str12;
        this.m = z;
        this.n = str13;
        this.o = str14;
    }
}
