package defpackage;
/* renamed from: kx7  reason: default package */
/* loaded from: classes3.dex */
public class kx7 {
    private String a;
    private String b;

    public kx7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    private int a(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    private boolean d(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str != null && str2 != null) {
            return str.equals(str2);
        }
        return false;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kx7)) {
            return false;
        }
        kx7 kx7Var = (kx7) obj;
        if (kx7Var != this && (!d(this.a, kx7Var.a) || !d(this.b, kx7Var.b))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return a(this.a) + (a(this.b) * 31);
    }
}
