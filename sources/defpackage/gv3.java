package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
/* renamed from: gv3  reason: default package */
/* loaded from: classes3.dex */
public class gv3 {
    private static char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private final byte[] a;

    public gv3(byte[] bArr) {
        this(bArr, SyslogConstants.LOG_LOCAL4);
    }

    public static byte[] a(byte[] bArr, int i) {
        if (i % 8 == 0) {
            jq9 jq9Var = new jq9(256);
            jq9Var.update(bArr, 0, bArr.length);
            int i2 = i / 8;
            byte[] bArr2 = new byte[i2];
            jq9Var.c(bArr2, 0, i2);
            return bArr2;
        }
        throw new IllegalArgumentException("bitLength must be a multiple of 8");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gv3) {
            return tr.c(((gv3) obj).a, this.a);
        }
        return false;
    }

    public int hashCode() {
        return tr.F(this.a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != this.a.length; i++) {
            if (i > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(b[(this.a[i] >>> 4) & 15]);
            stringBuffer.append(b[this.a[i] & 15]);
        }
        return stringBuffer.toString();
    }

    public gv3(byte[] bArr, int i) {
        this.a = a(bArr, i);
    }
}
