package defpackage;
/* compiled from: NumberInput.java */
/* renamed from: x37  reason: default package */
/* loaded from: classes2.dex */
public final class x37 {
    static final String a = String.valueOf(Long.MIN_VALUE).substring(1);
    static final String b = String.valueOf(Long.MAX_VALUE);

    public static boolean a(String str, boolean z) {
        String str2;
        if (z) {
            str2 = a;
        } else {
            str2 = b;
        }
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            int charAt = str.charAt(i) - str2.charAt(i);
            if (charAt != 0) {
                if (charAt < 0) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0073, code lost:
        return java.lang.Integer.parseInt(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r10) {
        /*
            r0 = 0
            char r1 = r10.charAt(r0)
            int r2 = r10.length()
            r3 = 45
            r4 = 1
            if (r1 != r3) goto Lf
            r0 = 1
        Lf:
            r3 = 2
            r5 = 10
            if (r0 == 0) goto L24
            if (r2 == r4) goto L1f
            if (r2 <= r5) goto L19
            goto L1f
        L19:
            char r1 = r10.charAt(r4)
            r4 = 2
            goto L2d
        L1f:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L24:
            r6 = 9
            if (r2 <= r6) goto L2d
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L2d:
            r6 = 57
            if (r1 > r6) goto L82
            r7 = 48
            if (r1 >= r7) goto L36
            goto L82
        L36:
            int r1 = r1 - r7
            if (r4 >= r2) goto L7e
            int r8 = r4 + 1
            char r9 = r10.charAt(r4)
            if (r9 > r6) goto L79
            if (r9 >= r7) goto L44
            goto L79
        L44:
            int r1 = r1 * 10
            int r9 = r9 - r7
            int r1 = r1 + r9
            if (r8 >= r2) goto L7e
            int r4 = r4 + r3
            char r3 = r10.charAt(r8)
            if (r3 > r6) goto L74
            if (r3 >= r7) goto L54
            goto L74
        L54:
            int r1 = r1 * 10
            int r3 = r3 - r7
            int r1 = r1 + r3
            if (r4 >= r2) goto L7e
        L5a:
            int r3 = r4 + 1
            char r4 = r10.charAt(r4)
            if (r4 > r6) goto L6f
            if (r4 >= r7) goto L65
            goto L6f
        L65:
            int r1 = r1 * 10
            int r4 = r4 + (-48)
            int r1 = r1 + r4
            if (r3 < r2) goto L6d
            goto L7e
        L6d:
            r4 = r3
            goto L5a
        L6f:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L74:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L79:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L7e:
            if (r0 == 0) goto L81
            int r1 = -r1
        L81:
            return r1
        L82:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x37.b(java.lang.String):int");
    }

    public static long c(String str) {
        if (str.length() <= 9) {
            return b(str);
        }
        return Long.parseLong(str);
    }
}
