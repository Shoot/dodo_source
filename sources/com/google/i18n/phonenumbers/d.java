package com.google.i18n.phonenumbers;

import java.io.Serializable;
/* compiled from: Phonenumber.java */
/* loaded from: classes.dex */
public class d implements Serializable {
    private boolean a;
    private boolean c;
    private boolean e;
    private boolean g;
    private boolean i;
    private boolean k;
    private boolean m;
    private boolean o;
    private int b = 0;
    private long d = 0;
    private String f = "";
    private boolean h = false;
    private int j = 1;
    private String l = "";
    private String p = "";
    private a n = a.UNSPECIFIED;

    /* compiled from: Phonenumber.java */
    /* loaded from: classes.dex */
    public enum a {
        FROM_NUMBER_WITH_PLUS_SIGN,
        FROM_NUMBER_WITH_IDD,
        FROM_NUMBER_WITHOUT_PLUS_SIGN,
        FROM_DEFAULT_COUNTRY,
        UNSPECIFIED
    }

    public d E(long j) {
        this.c = true;
        this.d = j;
        return this;
    }

    public d G(int i) {
        this.i = true;
        this.j = i;
        return this;
    }

    public d H(String str) {
        str.getClass();
        this.o = true;
        this.p = str;
        return this;
    }

    public d K(String str) {
        str.getClass();
        this.k = true;
        this.l = str;
        return this;
    }

    public d a() {
        this.m = false;
        this.n = a.UNSPECIFIED;
        return this;
    }

    public boolean b(d dVar) {
        if (dVar == null) {
            return false;
        }
        if (this == dVar) {
            return true;
        }
        if (this.b != dVar.b || this.d != dVar.d || !this.f.equals(dVar.f) || this.h != dVar.h || this.j != dVar.j || !this.l.equals(dVar.l) || this.n != dVar.n || !this.p.equals(dVar.p) || r() != dVar.r()) {
            return false;
        }
        return true;
    }

    public int c() {
        return this.b;
    }

    public a d() {
        return this.n;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof d) && b((d) obj)) {
            return true;
        }
        return false;
    }

    public long f() {
        return this.d;
    }

    public int hashCode() {
        int i;
        int c = (((((2173 + c()) * 53) + Long.valueOf(f()).hashCode()) * 53) + e().hashCode()) * 53;
        int i2 = 1237;
        if (s()) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (((((((((c + i) * 53) + i()) * 53) + k().hashCode()) * 53) + d().hashCode()) * 53) + j().hashCode()) * 53;
        if (r()) {
            i2 = 1231;
        }
        return i3 + i2;
    }

    public int i() {
        return this.j;
    }

    public String j() {
        return this.p;
    }

    public String k() {
        return this.l;
    }

    public boolean l() {
        return this.a;
    }

    public boolean m() {
        return this.m;
    }

    public boolean n() {
        return this.e;
    }

    public boolean o() {
        return this.g;
    }

    public boolean q() {
        return this.i;
    }

    public boolean r() {
        return this.o;
    }

    public boolean s() {
        return this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.b);
        sb.append(" National Number: ");
        sb.append(this.d);
        if (o() && s()) {
            sb.append(" Leading Zero(s): true");
        }
        if (q()) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.j);
        }
        if (n()) {
            sb.append(" Extension: ");
            sb.append(this.f);
        }
        if (m()) {
            sb.append(" Country Code Source: ");
            sb.append(this.n);
        }
        if (r()) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.p);
        }
        return sb.toString();
    }

    public d u(int i) {
        this.a = true;
        this.b = i;
        return this;
    }

    public d w(a aVar) {
        aVar.getClass();
        this.m = true;
        this.n = aVar;
        return this;
    }

    public d x(String str) {
        str.getClass();
        this.e = true;
        this.f = str;
        return this;
    }

    public d y(boolean z) {
        this.g = true;
        this.h = z;
        return this;
    }
}
