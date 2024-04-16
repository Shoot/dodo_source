package defpackage;

import java.security.spec.EncodedKeySpec;
/* renamed from: qa7  reason: default package */
/* loaded from: classes3.dex */
public class qa7 extends EncodedKeySpec {
    private static final String[] b = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};
    private final String a;

    public qa7(byte[] bArr) {
        super(bArr);
        int i = 0;
        int i2 = (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) + 4;
        if (i2 < bArr.length) {
            String b2 = a0b.b(tr.w(bArr, 4, i2));
            this.a = b2;
            if (b2.startsWith("ecdsa")) {
                return;
            }
            while (true) {
                String[] strArr = b;
                if (i < strArr.length) {
                    if (strArr[i].equals(this.a)) {
                        return;
                    }
                    i++;
                } else {
                    throw new IllegalArgumentException("unrecognised public key type " + this.a);
                }
            }
        } else {
            throw new IllegalArgumentException("invalid public key blob: type field longer than blob");
        }
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "OpenSSH";
    }
}
