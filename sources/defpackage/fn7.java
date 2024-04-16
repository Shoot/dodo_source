package defpackage;

import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.q0;
/* renamed from: fn7  reason: default package */
/* loaded from: classes3.dex */
public class fn7 extends PBEKeySpec {
    private static final eb b = new eb(co7.D0, q0.a);
    private eb a;

    public fn7(char[] cArr, byte[] bArr, int i, int i2, eb ebVar) {
        super(cArr, bArr, i, i2);
        this.a = ebVar;
    }

    public eb a() {
        return this.a;
    }
}
