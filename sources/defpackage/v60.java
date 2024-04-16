package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Arrays;
/* compiled from: Base64Variant.java */
/* renamed from: v60  reason: default package */
/* loaded from: classes2.dex */
public final class v60 implements Serializable {
    private final transient int[] a;
    private final transient char[] b;
    private final transient byte[] c;
    final String d;
    private final char e;
    private final int f;
    private final boolean g;
    private final a h;

    /* compiled from: Base64Variant.java */
    /* renamed from: v60$a */
    /* loaded from: classes2.dex */
    public enum a {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public v60(String str, String str2, boolean z, char c, int i) {
        int[] iArr = new int[128];
        this.a = iArr;
        char[] cArr = new char[64];
        this.b = cArr;
        this.c = new byte[64];
        this.d = str;
        this.g = z;
        this.e = c;
        this.f = i;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, cArr, 0);
            Arrays.fill(iArr, -1);
            for (int i2 = 0; i2 < length; i2++) {
                char c2 = this.b[i2];
                this.c[i2] = (byte) c2;
                this.a[c2] = i2;
            }
            if (z) {
                this.a[c] = -2;
            }
            this.h = z ? a.PADDING_REQUIRED : a.PADDING_FORBIDDEN;
            return;
        }
        throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
    }

    public String a(byte[] bArr) {
        return b(bArr, false);
    }

    public String b(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        int i = i() >> 2;
        int i2 = length - 3;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = i3 + 2;
            int i5 = bArr[i3 + 1] & 255;
            i3 += 3;
            d(sb, ((i5 | (bArr[i3] << 8)) << 8) | (bArr[i4] & 255));
            i--;
            if (i <= 0) {
                sb.append(CoreConstants.ESCAPE_CHAR);
                sb.append('n');
                i = i() >> 2;
            }
        }
        int i6 = length - i3;
        if (i6 > 0) {
            int i7 = i3 + 1;
            int i8 = bArr[i3] << 16;
            if (i6 == 2) {
                i8 |= (bArr[i7] & 255) << 8;
            }
            f(sb, i8, i6);
        }
        if (z) {
            sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        return sb.toString();
    }

    public int c(int i, char[] cArr, int i2) {
        char[] cArr2 = this.b;
        cArr[i2] = cArr2[(i >> 18) & 63];
        cArr[i2 + 1] = cArr2[(i >> 12) & 63];
        int i3 = i2 + 3;
        cArr[i2 + 2] = cArr2[(i >> 6) & 63];
        int i4 = i2 + 4;
        cArr[i3] = cArr2[i & 63];
        return i4;
    }

    public void d(StringBuilder sb, int i) {
        sb.append(this.b[(i >> 18) & 63]);
        sb.append(this.b[(i >> 12) & 63]);
        sb.append(this.b[(i >> 6) & 63]);
        sb.append(this.b[i & 63]);
    }

    public int e(int i, int i2, char[] cArr, int i3) {
        char c;
        char[] cArr2 = this.b;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        cArr[i3 + 1] = cArr2[(i >> 12) & 63];
        if (j()) {
            int i5 = i3 + 3;
            if (i2 == 2) {
                c = this.b[(i >> 6) & 63];
            } else {
                c = this.e;
            }
            cArr[i4] = c;
            int i6 = i3 + 4;
            cArr[i5] = this.e;
            return i6;
        } else if (i2 == 2) {
            int i7 = i3 + 3;
            cArr[i4] = this.b[(i >> 6) & 63];
            return i7;
        } else {
            return i4;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != v60.class) {
            return false;
        }
        v60 v60Var = (v60) obj;
        if (v60Var.e == this.e && v60Var.f == this.f && v60Var.g == this.g && v60Var.h == this.h && this.d.equals(v60Var.d)) {
            return true;
        }
        return false;
    }

    public void f(StringBuilder sb, int i, int i2) {
        char c;
        sb.append(this.b[(i >> 18) & 63]);
        sb.append(this.b[(i >> 12) & 63]);
        if (j()) {
            if (i2 == 2) {
                c = this.b[(i >> 6) & 63];
            } else {
                c = this.e;
            }
            sb.append(c);
            sb.append(this.e);
        } else if (i2 == 2) {
            sb.append(this.b[(i >> 6) & 63]);
        }
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public int i() {
        return this.f;
    }

    public boolean j() {
        return this.g;
    }

    protected Object readResolve() {
        v60 b = w60.b(this.d);
        boolean z = this.g;
        boolean z2 = b.g;
        if (z == z2 && this.e == b.e && this.h == b.h && this.f == b.f && z == z2) {
            return b;
        }
        return new v60(b, this.d, z, this.e, this.h, this.f);
    }

    public String toString() {
        return this.d;
    }

    public v60(v60 v60Var, String str, int i) {
        this(v60Var, str, v60Var.g, v60Var.e, i);
    }

    public v60(v60 v60Var, String str, boolean z, char c, int i) {
        this(v60Var, str, z, c, v60Var.h, i);
    }

    private v60(v60 v60Var, String str, boolean z, char c, a aVar, int i) {
        int[] iArr = new int[128];
        this.a = iArr;
        char[] cArr = new char[64];
        this.b = cArr;
        byte[] bArr = new byte[64];
        this.c = bArr;
        this.d = str;
        byte[] bArr2 = v60Var.c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = v60Var.b;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = v60Var.a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.g = z;
        this.e = c;
        this.f = i;
        this.h = aVar;
    }
}
