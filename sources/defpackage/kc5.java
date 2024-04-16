package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: JsonStringEncoder.java */
/* renamed from: kc5  reason: default package */
/* loaded from: classes2.dex */
public final class kc5 {
    private static final char[] a = kw0.c();
    private static final byte[] b = kw0.b();
    private static final kc5 c = new kc5();

    private int a(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    private int b(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = a;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    static int c(int i) {
        return Math.min(Math.max(16, i + Math.min((i >> 3) + 6, 1000)), 32000);
    }

    private char[] d() {
        return new char[]{CoreConstants.ESCAPE_CHAR, 0, '0', '0'};
    }

    public static kc5 e() {
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r10 >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        r7 = b(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        r7 = a(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        r10 = r8 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r10 <= r1.length) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        r10 = r1.length - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r10 <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        java.lang.System.arraycopy(r6, 0, r1, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        r5 = defpackage.iab.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        r1 = r5.j();
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r1, 0, r7);
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        java.lang.System.arraycopy(r6, 0, r1, r8, r7);
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        r6 = d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] f(java.lang.String r13) {
        /*
            r12 = this;
            int r0 = r13.length()
            int r1 = c(r0)
            char[] r1 = new char[r1]
            int[] r2 = defpackage.kw0.d()
            int r3 = r2.length
            r4 = 0
            r5 = 0
            r6 = r5
            r7 = 0
            r8 = 0
        L14:
            if (r7 >= r0) goto L75
        L16:
            char r9 = r13.charAt(r7)
            if (r9 >= r3) goto L5b
            r10 = r2[r9]
            if (r10 == 0) goto L5b
            if (r6 != 0) goto L26
            char[] r6 = r12.d()
        L26:
            int r9 = r7 + 1
            char r7 = r13.charAt(r7)
            r10 = r2[r7]
            if (r10 >= 0) goto L35
            int r7 = r12.b(r7, r6)
            goto L39
        L35:
            int r7 = r12.a(r10, r6)
        L39:
            int r10 = r8 + r7
            int r11 = r1.length
            if (r10 <= r11) goto L55
            int r10 = r1.length
            int r10 = r10 - r8
            if (r10 <= 0) goto L45
            java.lang.System.arraycopy(r6, r4, r1, r8, r10)
        L45:
            if (r5 != 0) goto L4b
            iab r5 = defpackage.iab.k(r1)
        L4b:
            char[] r1 = r5.j()
            int r7 = r7 - r10
            java.lang.System.arraycopy(r6, r10, r1, r4, r7)
            r8 = r7
            goto L59
        L55:
            java.lang.System.arraycopy(r6, r4, r1, r8, r7)
            r8 = r10
        L59:
            r7 = r9
            goto L14
        L5b:
            int r10 = r1.length
            if (r8 < r10) goto L69
            if (r5 != 0) goto L64
            iab r5 = defpackage.iab.k(r1)
        L64:
            char[] r1 = r5.j()
            r8 = 0
        L69:
            int r10 = r8 + 1
            r1[r8] = r9
            int r7 = r7 + 1
            if (r7 < r0) goto L73
            r8 = r10
            goto L75
        L73:
            r8 = r10
            goto L16
        L75:
            if (r5 != 0) goto L7c
            char[] r13 = java.util.Arrays.copyOfRange(r1, r4, r8)
            return r13
        L7c:
            r5.n(r8)
            char[] r13 = r5.g()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc5.f(java.lang.String):char[]");
    }
}
