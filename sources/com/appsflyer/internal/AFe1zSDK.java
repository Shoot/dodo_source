package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
/* loaded from: classes.dex */
public final class AFe1zSDK {
    private static char[] AFInAppEventType = null;
    private static int AFKeystoreWrapper = 0;
    private static int values = 1;

    static {
        AFInAppEventParameterName();
        int i = values + 105;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
    }

    static void AFInAppEventParameterName() {
        AFInAppEventType = new char[]{'6', 'k', 'm', 'o', 'o', 'l', 'i', 'l', 't', 'q', 'k', 'l', 'k', 'j', 'q', 'r', 'k', 'm', 'm', 'k', 'l', 'n', 'n', 'l', 'n', 'p', 'p', 'm', 'k', 'l', 'k', 'j', 'l', 'm', 'l', 'k', 'm', 'n', 'n', 'n', 'j', 'j', 't', 'u', 'l', 'l', 'k', 'k', 'n', 'm', 'l', 'm', 's', 's', 'n', 'n', 'u', 'u', 's', 't', 'l', 'j', 'k', 'm'};
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void AFKeystoreWrapper(java.lang.String r12, boolean r13, int[] r14, java.lang.Object[] r15) {
        /*
            if (r12 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r12 = r12.getBytes(r0)
        L8:
            byte[] r12 = (byte[]) r12
            java.lang.Object r0 = com.appsflyer.internal.AFf1iSDK.valueOf
            monitor-enter(r0)
            r1 = 0
            r2 = r14[r1]     // Catch: java.lang.Throwable -> L38
            r3 = 1
            r4 = r14[r3]     // Catch: java.lang.Throwable -> L38
            r5 = 2
            r6 = r14[r5]     // Catch: java.lang.Throwable -> L38
            r7 = 3
            r7 = r14[r7]     // Catch: java.lang.Throwable -> L38
            char[] r8 = com.appsflyer.internal.AFe1zSDK.AFInAppEventType     // Catch: java.lang.Throwable -> L38
            char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L49
            char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.appsflyer.internal.AFf1iSDK.values = r1     // Catch: java.lang.Throwable -> L38
            r8 = 0
        L27:
            int r10 = com.appsflyer.internal.AFf1iSDK.values     // Catch: java.lang.Throwable -> L38
            if (r10 >= r4) goto L48
            r11 = r12[r10]     // Catch: java.lang.Throwable -> L38
            if (r11 != r3) goto L3a
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 + r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
            goto L41
        L38:
            r12 = move-exception
            goto L8d
        L3a:
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
        L41:
            char r8 = r2[r10]     // Catch: java.lang.Throwable -> L38
            int r10 = r10 + 1
            com.appsflyer.internal.AFf1iSDK.values = r10     // Catch: java.lang.Throwable -> L38
            goto L27
        L48:
            r9 = r2
        L49:
            if (r7 <= 0) goto L58
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r9, r1, r12, r1, r4)     // Catch: java.lang.Throwable -> L38
            int r2 = r4 - r7
            java.lang.System.arraycopy(r12, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r12, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L38
        L58:
            if (r13 == 0) goto L6f
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.appsflyer.internal.AFf1iSDK.values = r1     // Catch: java.lang.Throwable -> L38
        L5e:
            int r13 = com.appsflyer.internal.AFf1iSDK.values     // Catch: java.lang.Throwable -> L38
            if (r13 >= r4) goto L6e
            int r2 = r4 - r13
            int r2 = r2 - r3
            char r2 = r9[r2]     // Catch: java.lang.Throwable -> L38
            r12[r13] = r2     // Catch: java.lang.Throwable -> L38
            int r13 = r13 + 1
            com.appsflyer.internal.AFf1iSDK.values = r13     // Catch: java.lang.Throwable -> L38
            goto L5e
        L6e:
            r9 = r12
        L6f:
            if (r6 <= 0) goto L84
            com.appsflyer.internal.AFf1iSDK.values = r1     // Catch: java.lang.Throwable -> L38
        L73:
            int r12 = com.appsflyer.internal.AFf1iSDK.values     // Catch: java.lang.Throwable -> L38
            if (r12 >= r4) goto L84
            char r13 = r9[r12]     // Catch: java.lang.Throwable -> L38
            r2 = r14[r5]     // Catch: java.lang.Throwable -> L38
            int r13 = r13 - r2
            char r13 = (char) r13     // Catch: java.lang.Throwable -> L38
            r9[r12] = r13     // Catch: java.lang.Throwable -> L38
            int r12 = r12 + 1
            com.appsflyer.internal.AFf1iSDK.values = r12     // Catch: java.lang.Throwable -> L38
            goto L73
        L84:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L38
            r12.<init>(r9)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r15[r1] = r12
            return
        L8d:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1zSDK.AFKeystoreWrapper(java.lang.String, boolean, int[], java.lang.Object[]):void");
    }

    @NonNull
    private static AFb1iSDK values(@NonNull AFb1oSDK aFb1oSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        AFf1xSDK aFf1xSDK;
        boolean z = true;
        if (str == null) {
            if (aFb1oSDK.values != AFf1wSDK.DEFAULT) {
                z = false;
            }
            return new AFb1iSDK(z, AFf1xSDK.NA);
        }
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001", false, new int[]{0, 64, 56, 15}, objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFb1oSDK.values == AFf1wSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = AFInAppEventType(new StringBuilder(str3).reverse().toString(), aFb1oSDK.AFKeystoreWrapper, "android", "v1", str4).equals(str);
        if (equals) {
            aFf1xSDK = AFf1xSDK.SUCCESS;
        } else {
            aFf1xSDK = AFf1xSDK.FAILURE;
        }
        return new AFb1iSDK(equals, aFf1xSDK);
    }

    @NonNull
    public final AFb1iSDK AFInAppEventType(@NonNull AFb1oSDK aFb1oSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        int i = AFKeystoreWrapper + 51;
        int i2 = i % 128;
        values = i2;
        int i3 = i % 2;
        if (aFb1oSDK != null) {
            int i4 = i2 + 27;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            if (str2 != null && str3 != null) {
                return values(aFb1oSDK, str, str2, str3);
            }
        }
        AFb1iSDK aFb1iSDK = new AFb1iSDK(false, AFf1xSDK.INTERNAL_ERROR);
        int i6 = AFKeystoreWrapper + 21;
        values = i6 % 128;
        int i7 = i6 % 2;
        return aFb1iSDK;
    }

    @VisibleForTesting
    private static String AFInAppEventType(String str, String str2, String str3, String str4, String str5) {
        String values2 = AFa1aSDK.values(AFa1aSDK.values(str2, str3, str4, str5, ""), str);
        if (values2.length() < 12) {
            int i = AFKeystoreWrapper;
            int i2 = i + 39;
            values = i2 % 128;
            int i3 = i2 % 2;
            int i4 = i + 93;
            values = i4 % 128;
            int i5 = i4 % 2;
            return values2;
        }
        return values2.substring(0, 12);
    }
}
