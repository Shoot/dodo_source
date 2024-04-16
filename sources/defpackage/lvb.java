package defpackage;

import org.bouncycastle.asn1.q0;
/* renamed from: lvb  reason: default package */
/* loaded from: classes3.dex */
class lvb {
    /* JADX INFO: Access modifiers changed from: package-private */
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
    public static e23 b(eb ebVar) {
        if (ebVar.t().x(g47.i)) {
            return f23.b();
        }
        if (ebVar.t().x(ms6.f)) {
            return f23.c();
        }
        if (ebVar.t().x(ms6.c)) {
            return f23.d();
        }
        if (ebVar.t().x(ms6.d)) {
            return f23.e();
        }
        if (ebVar.t().x(ms6.e)) {
            return f23.j();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + ebVar.t());
    }
}
