package defpackage;

import java.security.SecureRandom;
/* renamed from: hh3  reason: default package */
/* loaded from: classes3.dex */
public class hh3 {
    private static boolean a = false;
    private static boolean b = true;

    /* JADX WARN: Removed duplicated region for block: B:23:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.SecureRandom a() {
        /*
            java.lang.String r0 = "generateSecureRandomNew "
            java.lang.String r1 = "EncryptUtil"
            defpackage.jec.b(r1, r0)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchAlgorithmException -> L12
            r2 = 26
            if (r0 < r2) goto L17
            java.security.SecureRandom r0 = defpackage.gh3.a()     // Catch: java.security.NoSuchAlgorithmException -> L12
            goto L18
        L12:
            java.lang.String r0 = "getSecureRandomBytes: NoSuchAlgorithmException"
            defpackage.jec.c(r1, r0)
        L17:
            r0 = 0
        L18:
            r2 = 0
            if (r0 != 0) goto L24
            java.lang.String r3 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r3)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            goto L24
        L22:
            r3 = move-exception
            goto L43
        L24:
            q r3 = new q     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r3.<init>()     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r4 = 32
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r0.nextBytes(r4)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            yq9 r5 = new yq9     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r6 = 1
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r6 = 384(0x180, float:5.38E-43)
            yq9 r5 = r5.f(r6)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r6 = 256(0x100, float:3.59E-43)
            xq9 r0 = r5.b(r3, r6, r4, r2)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            return r0
        L43:
            boolean r4 = defpackage.hh3.b
            if (r4 == 0) goto L6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "exception : "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = " , you should implementation bcprov-jdk15on library"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            defpackage.jec.c(r1, r3)
            defpackage.hh3.b = r2
            goto L6c
        L67:
            java.lang.String r2 = "NoSuchAlgorithmException"
            defpackage.jec.c(r1, r2)
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh3.a():java.security.SecureRandom");
    }

    private static byte[] b(int i) {
        SecureRandom a2 = a();
        if (a2 == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        a2.nextBytes(bArr);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] c(int r3) {
        /*
            java.lang.String r0 = "EncryptUtil"
            boolean r1 = defpackage.hh3.a
            if (r1 != 0) goto L4a
            byte[] r3 = new byte[r3]
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchAlgorithmException -> L13
            r2 = 26
            if (r1 < r2) goto L18
            java.security.SecureRandom r1 = defpackage.gh3.a()     // Catch: java.security.NoSuchAlgorithmException -> L13
            goto L19
        L13:
            java.lang.String r1 = "getSecureRandomBytes: NoSuchAlgorithmException"
            defpackage.jec.c(r0, r1)
        L18:
            r1 = 0
        L19:
            if (r1 != 0) goto L24
            java.lang.String r1 = "SHA1PRNG"
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r1)     // Catch: java.lang.Exception -> L22 java.security.NoSuchAlgorithmException -> L41
            goto L24
        L22:
            r3 = move-exception
            goto L28
        L24:
            r1.nextBytes(r3)     // Catch: java.lang.Exception -> L22 java.security.NoSuchAlgorithmException -> L41
            return r3
        L28:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getSecureRandomBytes getInstance: exception : "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            defpackage.jec.c(r0, r3)
            goto L46
        L41:
            java.lang.String r3 = "getSecureRandomBytes getInstance: NoSuchAlgorithmException"
            defpackage.jec.c(r0, r3)
        L46:
            r3 = 0
            byte[] r3 = new byte[r3]
            return r3
        L4a:
            byte[] r3 = b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh3.c(int):byte[]");
    }

    public static String d(int i) {
        return jo4.a(c(i));
    }
}
