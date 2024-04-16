package defpackage;

import javax.crypto.SecretKey;
/* renamed from: en7  reason: default package */
/* loaded from: classes3.dex */
public class en7 implements SecretKey {
    private final char[] a;
    private final jw0 b;

    public en7(char[] cArr, jw0 jw0Var) {
        this.a = tr.j(cArr);
        this.b = jw0Var;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.b.a(this.a);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.b.getType();
    }
}
