package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
/* renamed from: y9c  reason: default package */
/* loaded from: classes3.dex */
public class y9c {
    boolean a;
    l b;
    public static final k c = new k("2.5.29.9");
    public static final k d = new k("2.5.29.14");
    public static final k e = new k("2.5.29.15");
    public static final k f = new k("2.5.29.16");
    public static final k g = new k("2.5.29.17");
    public static final k h = new k("2.5.29.18");
    public static final k i = new k("2.5.29.19");
    public static final k j = new k("2.5.29.20");
    public static final k k = new k("2.5.29.21");
    public static final k l = new k("2.5.29.23");
    public static final k m = new k("2.5.29.24");
    public static final k n = new k("2.5.29.27");
    public static final k o = new k("2.5.29.28");
    public static final k p = new k("2.5.29.29");
    public static final k q = new k("2.5.29.30");
    public static final k r = new k("2.5.29.31");
    public static final k s = new k("2.5.29.32");
    public static final k t = new k("2.5.29.33");
    public static final k u = new k("2.5.29.35");
    public static final k v = new k("2.5.29.36");
    public static final k w = new k("2.5.29.37");
    public static final k x = new k("2.5.29.46");
    public static final k y = new k("2.5.29.54");
    public static final k z = new k("1.3.6.1.5.5.7.1.1");
    public static final k A = new k("1.3.6.1.5.5.7.1.11");
    public static final k B = new k("1.3.6.1.5.5.7.1.12");
    public static final k C = new k("1.3.6.1.5.5.7.1.2");
    public static final k D = new k("1.3.6.1.5.5.7.1.3");
    public static final k E = new k("1.3.6.1.5.5.7.1.4");
    public static final k F = new k("2.5.29.56");
    public static final k G = new k("2.5.29.55");

    public static n a(y9c y9cVar) throws IllegalArgumentException {
        try {
            return n.z(y9cVar.b().F());
        } catch (IOException e2) {
            throw new IllegalArgumentException("can't convert extension: " + e2);
        }
    }

    public l b() {
        return this.b;
    }

    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y9c)) {
            return false;
        }
        y9c y9cVar = (y9c) obj;
        if (!y9cVar.b().x(b()) || y9cVar.c() != c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (c()) {
            return b().hashCode();
        }
        return ~b().hashCode();
    }
}
