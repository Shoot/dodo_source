package defpackage;

import javax.crypto.SecretKey;
/* renamed from: an7  reason: default package */
/* loaded from: classes3.dex */
public class an7 implements SecretKey {
    private final char[] a;
    private final jw0 b;

    public an7(char[] cArr, jw0 jw0Var) {
        char[] cArr2 = new char[cArr.length];
        this.a = cArr2;
        this.b = jw0Var;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.b.a(this.a);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.b.getType();
    }

    public char[] getPassword() {
        return this.a;
    }
}
