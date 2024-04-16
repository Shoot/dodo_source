package defpackage;

import java.security.spec.EncodedKeySpec;
/* renamed from: oa7  reason: default package */
/* loaded from: classes3.dex */
public class oa7 extends EncodedKeySpec {
    private final String a;

    public oa7(byte[] bArr) {
        super(bArr);
        String str;
        byte b = bArr[0];
        if (b == 48) {
            str = "ASN.1";
        } else if (b == 111) {
            str = "OpenSSH";
        } else {
            throw new IllegalArgumentException("unknown byte encoding");
        }
        this.a = str;
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return this.a;
    }
}
