package defpackage;

import javax.crypto.SecretKey;
/* renamed from: sn7  reason: default package */
/* loaded from: classes3.dex */
public class sn7 implements SecretKey {
    private final char[] a;
    private final boolean b;

    public sn7(char[] cArr, boolean z) {
        cArr = cArr == null ? new char[0] : cArr;
        char[] cArr2 = new char[cArr.length];
        this.a = cArr2;
        this.b = z;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PKCS12";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.b && this.a.length == 0) {
            return new byte[2];
        }
        return ym7.a(this.a);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS12";
    }

    public char[] getPassword() {
        return this.a;
    }
}
