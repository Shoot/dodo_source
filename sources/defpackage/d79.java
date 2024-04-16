package defpackage;

import java.security.spec.EncodedKeySpec;
/* renamed from: d79  reason: default package */
/* loaded from: classes3.dex */
public class d79 extends EncodedKeySpec {
    public d79(byte[] bArr) {
        super(bArr);
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "RAW";
    }
}
