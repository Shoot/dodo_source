package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: DataUri.java */
/* renamed from: sl2  reason: default package */
/* loaded from: classes3.dex */
public class sl2 {
    private final String a;
    private final boolean b;
    private final String c;

    public sl2(String str, boolean z, String str2) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public boolean a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sl2 sl2Var = (sl2) obj;
        if (this.b != sl2Var.b) {
            return false;
        }
        String str = this.a;
        if (str == null ? sl2Var.a != null : !str.equals(sl2Var.a)) {
            return false;
        }
        String str2 = this.c;
        String str3 = sl2Var.c;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((i * 31) + (this.b ? 1 : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "DataUri{contentType='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", base64=" + this.b + ", data='" + this.c + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}
