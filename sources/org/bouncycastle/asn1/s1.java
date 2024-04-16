package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
class s1 implements Enumeration {
    private h a;
    private Object b = a();

    public s1(byte[] bArr) {
        this.a = new h(bArr, true);
    }

    private Object a() {
        try {
            return this.a.l();
        } catch (IOException e) {
            throw new ASN1ParsingException("malformed DER construction: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.b;
        if (obj != null) {
            this.b = a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
