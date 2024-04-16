package defpackage;

import android.text.TextUtils;
/* compiled from: Header.java */
/* renamed from: en4  reason: default package */
/* loaded from: classes.dex */
public final class en4 {
    private final String a;
    private final String b;

    public en4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || en4.class != obj.getClass()) {
            return false;
        }
        en4 en4Var = (en4) obj;
        if (TextUtils.equals(this.a, en4Var.a) && TextUtils.equals(this.b, en4Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + "]";
    }
}
