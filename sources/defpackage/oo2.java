package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: DecimalStyle.java */
/* renamed from: oo2  reason: default package */
/* loaded from: classes3.dex */
public final class oo2 {
    public static final oo2 e = new oo2('0', '+', CoreConstants.DASH_CHAR, CoreConstants.DOT);
    private static final ConcurrentMap<Locale, oo2> f = new ConcurrentHashMap(16, 0.75f, 2);
    private final char a;
    private final char b;
    private final char c;
    private final char d;

    private oo2(char c, char c2, char c3, char c4) {
        this.a = c;
        this.b = c2;
        this.c = c3;
        this.d = c4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        char c = this.a;
        if (c == '0') {
            return str;
        }
        int i = c - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(char c) {
        int i = c - this.a;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public char c() {
        return this.d;
    }

    public char d() {
        return this.c;
    }

    public char e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo2)) {
            return false;
        }
        oo2 oo2Var = (oo2) obj;
        if (this.a == oo2Var.a && this.b == oo2Var.b && this.c == oo2Var.c && this.d == oo2Var.d) {
            return true;
        }
        return false;
    }

    public char f() {
        return this.a;
    }

    public int hashCode() {
        return this.a + this.b + this.c + this.d;
    }

    public String toString() {
        return "DecimalStyle[" + this.a + this.b + this.c + this.d + "]";
    }
}
