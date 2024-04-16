package defpackage;

import org.bouncycastle.asn1.k;
/* renamed from: k23  reason: default package */
/* loaded from: classes3.dex */
class k23 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static k a(String str) {
        if (str.equals("SHA-256")) {
            return ms6.c;
        }
        if (str.equals("SHA-512")) {
            return ms6.e;
        }
        if (str.equals("SHAKE128")) {
            return ms6.m;
        }
        if (str.equals("SHAKE256")) {
            return ms6.n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
