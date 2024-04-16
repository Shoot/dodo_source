package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AFLogger;
import java.lang.ref.WeakReference;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFa1aSDK {
    private static int AFInAppEventType = 0;
    private static int AFKeystoreWrapper = 1;
    private static char[] values = {137, 282, 289, 280, 277, 284, 278, 273, 272, 279, 284, 281};

    public static String AFInAppEventParameterName(String str) {
        int i = AFInAppEventType + 15;
        AFKeystoreWrapper = i % 128;
        String str2 = null;
        try {
            if (i % 2 == 0) {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.reset();
                messageDigest.update(str.getBytes("UTF-8"));
                str2 = AFInAppEventType(messageDigest.digest());
                int i2 = 61 / 0;
            } else {
                MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                messageDigest2.reset();
                messageDigest2.update(str.getBytes("UTF-8"));
                str2 = AFInAppEventType(messageDigest2.digest());
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.afErrorLog(sb.toString(), e);
        }
        int i3 = AFKeystoreWrapper + 119;
        AFInAppEventType = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    private static String AFInAppEventType(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        int i = AFKeystoreWrapper + 37;
        AFInAppEventType = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (i3 < length) {
            formatter.format("%02x", Byte.valueOf(bArr[i3]));
            i3++;
            int i4 = AFKeystoreWrapper + 109;
            AFInAppEventType = i4 % 128;
            int i5 = i4 % 2;
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    public static boolean AFKeystoreWrapper(Map<String, Object> map, String[] strArr, AFb1fSDK aFb1fSDK) throws IllegalStateException {
        int i = AFKeystoreWrapper + 111;
        AFInAppEventType = i % 128;
        int i2 = i % 2;
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            int i3 = AFInAppEventType + 7;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        String valueOf = AFb1fSDK.valueOf();
        StringBuilder sb = new StringBuilder();
        sb.append(new JSONObject(map));
        sb.append(valueOf);
        return values(sb.toString(), AFb1xSDK.AFInAppEventParameterName(new WeakReference(aFb1fSDK.valueOf.values))).equals(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String valueOf(java.lang.String r6) {
        /*
            int r0 = com.appsflyer.internal.AFa1aSDK.AFInAppEventType
            int r0 = r0 + 73
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.AFKeystoreWrapper = r1
            int r0 = r0 % 2
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = "SHA-1"
            r3 = 0
            if (r0 == 0) goto L2c
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Exception -> L28
            r0.reset()     // Catch: java.lang.Exception -> L28
            byte[] r1 = r6.getBytes(r1)     // Catch: java.lang.Exception -> L28
            r0.update(r1)     // Catch: java.lang.Exception -> L28
            byte[] r0 = r0.digest()     // Catch: java.lang.Exception -> L28
            java.lang.String r6 = AFInAppEventType(r0)     // Catch: java.lang.Exception -> L28
            goto L63
        L28:
            r0 = move-exception
            r1 = r0
            r0 = r3
            goto L46
        L2c:
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Exception -> L28
            r0.reset()     // Catch: java.lang.Exception -> L28
            byte[] r1 = r6.getBytes(r1)     // Catch: java.lang.Exception -> L28
            r0.update(r1)     // Catch: java.lang.Exception -> L28
            byte[] r0 = r0.digest()     // Catch: java.lang.Exception -> L28
            java.lang.String r0 = AFInAppEventType(r0)     // Catch: java.lang.Exception -> L28
            throw r3     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
        L43:
            r6 = move-exception
            throw r6
        L45:
            r1 = move-exception
        L46:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Error turning "
            r2.<init>(r4)
            r4 = 0
            r5 = 6
            java.lang.String r6 = r6.substring(r4, r5)
            r2.append(r6)
            java.lang.String r6 = ".. to SHA1"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.appsflyer.AFLogger.afErrorLog(r6, r1)
            r6 = r0
        L63:
            int r0 = com.appsflyer.internal.AFa1aSDK.AFInAppEventType
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.AFKeystoreWrapper = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L70
            return r6
        L70:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.valueOf(java.lang.String):java.lang.String");
    }

    public static String values(String str) {
        String str2;
        int i = AFKeystoreWrapper + 63;
        AFInAppEventType = i % 128;
        String str3 = null;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (i % 2 == 0) {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            str2 = AFInAppEventParameterName(messageDigest.digest());
            int i2 = AFInAppEventType + 105;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
            return str2;
        }
        MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
        messageDigest2.update(str.getBytes());
        String AFInAppEventParameterName = AFInAppEventParameterName(messageDigest2.digest());
        try {
            throw null;
        } catch (Exception e2) {
            str3 = AFInAppEventParameterName;
            e = e2;
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.afErrorLog(sb.toString(), e);
            str2 = str3;
            int i22 = AFInAppEventType + 105;
            AFKeystoreWrapper = i22 % 128;
            int i32 = i22 % 2;
            return str2;
        }
    }

    public static String values(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            String lowerCase = AFInAppEventParameterName(mac.doFinal(str.getBytes())).toLowerCase();
            int i = AFInAppEventType + 51;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0) {
                return lowerCase;
            }
            throw null;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.afErrorLog(e.getMessage(), e, true);
            return e.getMessage();
        }
    }

    private static String AFInAppEventParameterName(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int i = AFKeystoreWrapper + 41;
        AFInAppEventType = i % 128;
        int i2 = i % 2;
        for (byte b : bArr) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        String obj = sb.toString();
        int i3 = AFKeystoreWrapper + 59;
        AFInAppEventType = i3 % 128;
        int i4 = i3 % 2;
        return obj;
    }

    public static String valueOf(Map<String, Object> map) {
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{0, 12, 174, 6}, objArr);
        String str = (String) map.get(((String) objArr[0]).intern());
        StringBuilder sb = new StringBuilder();
        sb.append(((String) map.get("appsflyerKey")).substring(0, 7));
        sb.append(((String) map.get("uid")).substring(0, 7));
        sb.append(str.substring(str.length() - 7));
        String valueOf = valueOf(sb.toString());
        int i = AFInAppEventType + 71;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            return valueOf;
        }
        throw null;
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
            char[] r8 = com.appsflyer.internal.AFa1aSDK.values     // Catch: java.lang.Throwable -> L38
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
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.AFKeystoreWrapper(java.lang.String, boolean, int[], java.lang.Object[]):void");
    }

    public static String values(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) map.get("appsflyerKey"));
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{0, 12, 174, 6}, objArr);
        sb.append(map.get(((String) objArr[0]).intern()));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(map.get("uid"));
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append(map.get("installDate"));
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj3);
        sb4.append(map.get("counter"));
        String obj4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj4);
        sb5.append(map.get("iaecounter"));
        String valueOf = valueOf(AFInAppEventParameterName(sb5.toString()));
        int i = AFKeystoreWrapper + 13;
        AFInAppEventType = i % 128;
        if (i % 2 == 0) {
            return valueOf;
        }
        throw null;
    }

    public static String values(String... strArr) {
        int i = AFKeystoreWrapper + 61;
        AFInAppEventType = i % 128;
        if (i % 2 == 0) {
            return TextUtils.join("\u2063", strArr);
        }
        TextUtils.join("\u2063", strArr);
        throw null;
    }
}
