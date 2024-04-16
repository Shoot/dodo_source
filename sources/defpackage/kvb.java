package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q0;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kvb  reason: default package */
/* loaded from: classes3.dex */
public class kvb {
    static final eb a;
    static final eb b;
    static final eb c;
    static final eb d;
    static final eb e;
    static final eb f;
    static final eb g;
    static final eb h;
    static final Map i;

    static {
        k kVar = ko7.X;
        a = new eb(kVar);
        k kVar2 = ko7.Y;
        b = new eb(kVar2);
        c = new eb(ms6.j);
        d = new eb(ms6.h);
        e = new eb(ms6.c);
        f = new eb(ms6.e);
        g = new eb(ms6.m);
        h = new eb(ms6.n);
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put(kVar, g65.d(5));
        hashMap.put(kVar2, g65.d(6));
    }

    public static eb a(String str) {
        if (str.equals("SHA-1")) {
            return new eb(g47.i, q0.a);
        }
        if (str.equals("SHA-224")) {
            return new eb(ms6.f);
        }
        if (str.equals("SHA-256")) {
            return new eb(ms6.c);
        }
        if (str.equals("SHA-384")) {
            return new eb(ms6.d);
        }
        if (str.equals("SHA-512")) {
            return new eb(ms6.e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e23 b(k kVar) {
        if (kVar.x(ms6.c)) {
            return new dq9();
        }
        if (kVar.x(ms6.e)) {
            return new gq9();
        }
        if (kVar.x(ms6.m)) {
            return new jq9(128);
        }
        if (kVar.x(ms6.n)) {
            return new jq9(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + kVar);
    }

    public static String c(k kVar) {
        if (kVar.x(g47.i)) {
            return "SHA-1";
        }
        if (kVar.x(ms6.f)) {
            return "SHA-224";
        }
        if (kVar.x(ms6.c)) {
            return "SHA-256";
        }
        if (kVar.x(ms6.d)) {
            return "SHA-384";
        }
        if (kVar.x(ms6.e)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eb d(int i2) {
        if (i2 != 5) {
            if (i2 == 6) {
                return b;
            }
            throw new IllegalArgumentException("unknown security category: " + i2);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(eb ebVar) {
        return ((Integer) i.get(ebVar.t())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eb f(String str) {
        if (str.equals("SHA3-256")) {
            return c;
        }
        if (str.equals("SHA-512/256")) {
            return d;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(zq9 zq9Var) {
        eb u = zq9Var.u();
        if (u.t().x(c.t())) {
            return "SHA3-256";
        }
        if (u.t().x(d.t())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + u.t());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eb h(String str) {
        if (str.equals("SHA-256")) {
            return e;
        }
        if (str.equals("SHA-512")) {
            return f;
        }
        if (str.equals("SHAKE128")) {
            return g;
        }
        if (str.equals("SHAKE256")) {
            return h;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
