package defpackage;

import java.io.Serializable;
/* compiled from: Street.java */
/* renamed from: bza  reason: default package */
/* loaded from: classes4.dex */
public class bza implements Serializable {
    public static final bza d = new bza("", "", "");
    private String a;
    private String b;
    private String c;

    public bza(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bza bzaVar = (bza) obj;
        if (this.a.equals(bzaVar.a) && this.b.equals(bzaVar.b) && this.c.equals(bzaVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode() + this.c.hashCode();
    }

    public String toString() {
        return this.b;
    }
}
