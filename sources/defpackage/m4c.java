package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
import im.threads.ui.fragments.ChatFragment;
/* renamed from: m4c  reason: default package */
/* loaded from: classes3.dex */
public final class m4c implements nn3, sc6 {
    private static final int[] j = {24, 35, 198, 232, 135, SyslogConstants.LOG_LOCAL7, 1, 79, 54, 166, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, 224, 215, 194, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, ChatFragment.REQUEST_PERMISSION_CAMERA, 41, 10, 177, SyslogConstants.LOG_LOCAL4, 107, 133, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, 125, 149, 216, 251, 238, 124, 102, 221, 23, 71, 158, ChatFragment.REQUEST_PERMISSION_READ_EXTERNAL, 45, 191, 7, 173, 90, 131, 51, 99, 2, 170, 113, ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, 25, 73, 217, 242, 227, 91, SyslogConstants.LOG_LOCAL1, 154, 38, 50, SyslogConstants.LOG_LOCAL6, 233, 15, 213, 128, 190, 205, 52, 72, 255, 122, SyslogConstants.LOG_LOCAL2, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, 161, 141, 61, 151, 0, 207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, 186, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, 178, 230, 14, 31, 98, 212, 168, 150, 249, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 209, 165, 226, 97, 179, 33, 156, 30, 67, 199, 252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, 247, 185, 19, 44, 211, 231, 110, 196, 3, 86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, 172, 137, 20, 225, 22, 58, 105, 9, 112, 182, 208, 237, ChatFragment.REQUEST_PERMISSION_RECORD_AUDIO, 66, SyslogConstants.LOG_LOCAL3, 164, 40, 92, 248, 134};
    private static final long[] k = new long[256];
    private static final long[] l = new long[256];
    private static final long[] m = new long[256];
    private static final long[] n = new long[256];
    private static final long[] o = new long[256];
    private static final long[] p = new long[256];
    private static final long[] q = new long[256];
    private static final long[] r = new long[256];
    private static final short[] s;
    private final long[] a;
    private byte[] b;
    private int c;
    private short[] d;
    private long[] e;
    private long[] f;
    private long[] g;
    private long[] h;
    private long[] i;

    static {
        short[] sArr = new short[32];
        s = sArr;
        sArr[31] = 8;
    }

    public m4c() {
        this.a = new long[11];
        this.b = new byte[64];
        this.c = 0;
        this.d = new short[32];
        this.e = new long[8];
        this.f = new long[8];
        this.g = new long[8];
        this.h = new long[8];
        this.i = new long[8];
        for (int i = 0; i < 256; i++) {
            int i2 = j[i];
            int i3 = i(i2 << 1);
            int i4 = i(i3 << 1);
            int i5 = i4 ^ i2;
            int i6 = i(i4 << 1);
            int i7 = i6 ^ i2;
            k[i] = j(i2, i2, i4, i2, i6, i5, i3, i7);
            l[i] = j(i7, i2, i2, i4, i2, i6, i5, i3);
            m[i] = j(i3, i7, i2, i2, i4, i2, i6, i5);
            n[i] = j(i5, i3, i7, i2, i2, i4, i2, i6);
            o[i] = j(i6, i5, i3, i7, i2, i2, i4, i2);
            p[i] = j(i2, i6, i5, i3, i7, i2, i2, i4);
            q[i] = j(i4, i2, i6, i5, i3, i7, i2, i2);
            r[i] = j(i2, i4, i2, i6, i5, i3, i7, i2);
        }
        this.a[0] = 0;
        for (int i8 = 1; i8 <= 10; i8++) {
            int i9 = (i8 - 1) * 8;
            this.a[i8] = (((((((k[i9] & (-72057594037927936L)) ^ (l[i9 + 1] & 71776119061217280L)) ^ (m[i9 + 2] & 280375465082880L)) ^ (n[i9 + 3] & 1095216660480L)) ^ (o[i9 + 4] & 4278190080L)) ^ (p[i9 + 5] & 16711680)) ^ (q[i9 + 6] & 65280)) ^ (r[i9 + 7] & 255);
        }
    }

    private long d(byte[] bArr, int i) {
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    private void e(long j2, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) ((j2 >> (56 - (i2 * 8))) & 255);
        }
    }

    private byte[] f() {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) (this.d[i] & 255);
        }
        return bArr;
    }

    private void g() {
        byte[] f = f();
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        bArr[i] = (byte) (bArr[i] | 128);
        if (i2 == bArr.length) {
            l(bArr, 0);
        }
        if (this.c > 32) {
            while (this.c != 0) {
                update((byte) 0);
            }
        }
        while (this.c <= 32) {
            update((byte) 0);
        }
        System.arraycopy(f, 0, this.b, 32, f.length);
        l(this.b, 0);
    }

    private void h() {
        int i = 0;
        for (int length = this.d.length - 1; length >= 0; length--) {
            short[] sArr = this.d;
            int i2 = (sArr[length] & 255) + s[length] + i;
            i = i2 >>> 8;
            sArr[length] = (short) (i2 & 255);
        }
    }

    private int i(int i) {
        if (i >= 256) {
            return i ^ 285;
        }
        return i;
    }

    private long j(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (((((((i2 << 48) ^ (i << 56)) ^ (i3 << 40)) ^ (i4 << 32)) ^ (i5 << 24)) ^ (i6 << 16)) ^ (i7 << 8)) ^ i8;
    }

    private void l(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this.i.length; i2++) {
            this.h[i2] = d(this.b, i2 * 8);
        }
        k();
        this.c = 0;
        tr.y(this.b, (byte) 0);
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new m4c(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        m4c m4cVar = (m4c) sc6Var;
        long[] jArr = m4cVar.a;
        long[] jArr2 = this.a;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = m4cVar.b;
        byte[] bArr2 = this.b;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.c = m4cVar.c;
        short[] sArr = m4cVar.d;
        short[] sArr2 = this.d;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = m4cVar.e;
        long[] jArr4 = this.e;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = m4cVar.f;
        long[] jArr6 = this.f;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = m4cVar.g;
        long[] jArr8 = this.g;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = m4cVar.h;
        long[] jArr10 = this.h;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = m4cVar.i;
        long[] jArr12 = this.i;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        g();
        for (int i2 = 0; i2 < 8; i2++) {
            e(this.e[i2], bArr, (i2 * 8) + i);
        }
        reset();
        return getDigestSize();
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // defpackage.nn3
    public int getByteLength() {
        return 64;
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 64;
    }

    protected void k() {
        long[] jArr;
        for (int i = 0; i < 8; i++) {
            long[] jArr2 = this.i;
            long j2 = this.h[i];
            long[] jArr3 = this.f;
            long j3 = this.e[i];
            jArr3[i] = j3;
            jArr2[i] = j2 ^ j3;
        }
        int i2 = 1;
        while (i2 <= 10) {
            int i3 = 0;
            while (i3 < 8) {
                long[] jArr4 = this.g;
                jArr4[i3] = 0;
                long[] jArr5 = k;
                long[] jArr6 = this.f;
                long j4 = jArr5[((int) (jArr6[i3 & 7] >>> 56)) & 255];
                jArr4[i3] = j4;
                long j5 = l[((int) (jArr6[(i3 - 1) & 7] >>> 48)) & 255] ^ j4;
                jArr4[i3] = j5;
                long j6 = j5 ^ m[((int) (jArr6[(i3 - 2) & 7] >>> 40)) & 255];
                jArr4[i3] = j6;
                long j7 = j6 ^ n[((int) (jArr6[(i3 - 3) & 7] >>> 32)) & 255];
                jArr4[i3] = j7;
                long j8 = j7 ^ o[((int) (jArr6[(i3 - 4) & 7] >>> 24)) & 255];
                jArr4[i3] = j8;
                long j9 = j8 ^ p[((int) (jArr6[(i3 - 5) & 7] >>> 16)) & 255];
                jArr4[i3] = j9;
                long j10 = j9 ^ q[((int) (jArr6[(i3 - 6) & 7] >>> 8)) & 255];
                jArr4[i3] = j10;
                jArr4[i3] = j10 ^ r[((int) jArr6[(i3 - 7) & 7]) & 255];
                i3++;
                i2 = i2;
            }
            int i4 = i2;
            long[] jArr7 = this.g;
            long[] jArr8 = this.f;
            System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
            long[] jArr9 = this.f;
            jArr9[0] = jArr9[0] ^ this.a[i4];
            int i5 = 0;
            while (true) {
                jArr = this.g;
                if (i5 < 8) {
                    long j11 = this.f[i5];
                    jArr[i5] = j11;
                    long[] jArr10 = k;
                    long[] jArr11 = this.i;
                    long j12 = jArr10[((int) (jArr11[i5 & 7] >>> 56)) & 255] ^ j11;
                    jArr[i5] = j12;
                    long j13 = j12 ^ l[((int) (jArr11[(i5 - 1) & 7] >>> 48)) & 255];
                    jArr[i5] = j13;
                    long j14 = j13 ^ m[((int) (jArr11[(i5 - 2) & 7] >>> 40)) & 255];
                    jArr[i5] = j14;
                    long j15 = j14 ^ n[((int) (jArr11[(i5 - 3) & 7] >>> 32)) & 255];
                    jArr[i5] = j15;
                    long j16 = j15 ^ o[((int) (jArr11[(i5 - 4) & 7] >>> 24)) & 255];
                    jArr[i5] = j16;
                    long j17 = j16 ^ p[((int) (jArr11[(i5 - 5) & 7] >>> 16)) & 255];
                    jArr[i5] = j17;
                    long j18 = j17 ^ q[((int) (jArr11[(i5 - 6) & 7] >>> 8)) & 255];
                    jArr[i5] = j18;
                    jArr[i5] = j18 ^ r[((int) jArr11[(i5 - 7) & 7]) & 255];
                    i5++;
                }
            }
            long[] jArr12 = this.i;
            System.arraycopy(jArr, 0, jArr12, 0, jArr12.length);
            i2 = i4 + 1;
        }
        for (int i6 = 0; i6 < 8; i6++) {
            long[] jArr13 = this.e;
            jArr13[i6] = jArr13[i6] ^ (this.i[i6] ^ this.h[i6]);
        }
    }

    @Override // defpackage.e23
    public void reset() {
        this.c = 0;
        tr.D(this.d, (short) 0);
        tr.y(this.b, (byte) 0);
        tr.C(this.e, 0L);
        tr.C(this.f, 0L);
        tr.C(this.g, 0L);
        tr.C(this.h, 0L);
        tr.C(this.i, 0L);
    }

    @Override // defpackage.e23
    public void update(byte b) {
        byte[] bArr = this.b;
        int i = this.c;
        bArr[i] = b;
        int i2 = i + 1;
        this.c = i2;
        if (i2 == bArr.length) {
            l(bArr, 0);
        }
        h();
    }

    public m4c(m4c m4cVar) {
        this.a = new long[11];
        this.b = new byte[64];
        this.c = 0;
        this.d = new short[32];
        this.e = new long[8];
        this.f = new long[8];
        this.g = new long[8];
        this.h = new long[8];
        this.i = new long[8];
        b(m4cVar);
    }

    @Override // defpackage.e23
    public void update(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
