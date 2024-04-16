package com.facebook.flipper.android;

import android.util.Log;
/* loaded from: classes2.dex */
class FlipperProps {
    private static final int DEFAULT_ALT_INSECURE_PORT = 9089;
    private static final int DEFAULT_ALT_SECURE_PORT = 9088;
    private static final int DEFAULT_INSECURE_PORT = 9089;
    private static final int DEFAULT_SECURE_PORT = 9088;
    private static final String FLIPPER_ALT_PORTS_PROP_NAME = "flipper.alt.ports";
    private static final String FLIPPER_PORTS_PROP_NAME = "flipper.ports";
    private static final String TAG = "Flipper";
    private static String flipperAltPortsPropValue;
    private static String flipperPortsPropValue;

    FlipperProps() {
    }

    static int extractIntFromPropValue(String str, int i, int i2) {
        if (str != null && !str.isEmpty()) {
            try {
                String[] split = str.split(",");
                if (split.length > i) {
                    return Integer.parseInt(split[i]);
                }
            } catch (NumberFormatException unused) {
                Log.e(TAG, "Failed to parse flipper ports value: " + str);
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getAltInsecurePort() {
        return extractIntFromPropValue(getFlipperDefaultAltPortsPropValue(), 0, 9089);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getAltSecurePort() {
        return extractIntFromPropValue(getFlipperDefaultAltPortsPropValue(), 1, 9088);
    }

    private static synchronized String getFlipperDefaultAltPortsPropValue() {
        synchronized (FlipperProps.class) {
            String str = flipperAltPortsPropValue;
            if (str != null) {
                return str;
            }
            String flipperPortsPropValue2 = getFlipperPortsPropValue(FLIPPER_ALT_PORTS_PROP_NAME);
            flipperAltPortsPropValue = flipperPortsPropValue2;
            return flipperPortsPropValue2;
        }
    }

    private static synchronized String getFlipperDefaultPortsPropValue() {
        synchronized (FlipperProps.class) {
            String str = flipperPortsPropValue;
            if (str != null) {
                return str;
            }
            String flipperPortsPropValue2 = getFlipperPortsPropValue(FLIPPER_PORTS_PROP_NAME);
            flipperPortsPropValue = flipperPortsPropValue2;
            return flipperPortsPropValue2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0095 A[Catch: all -> 0x003d, TryCatch #7 {, blocks: (B:4:0x0003, B:12:0x0039, B:18:0x0048, B:19:0x004b, B:17:0x0041, B:45:0x0087, B:50:0x0095, B:51:0x0098, B:52:0x009b, B:48:0x008c, B:35:0x0071, B:40:0x007f, B:38:0x0076), top: B:61:0x0003, inners: #2, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized java.lang.String getFlipperPortsPropValue(java.lang.String r8) {
        /*
            java.lang.Class<com.facebook.flipper.android.FlipperProps> r0 = com.facebook.flipper.android.FlipperProps.class
            monitor-enter(r0)
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L3d
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L62
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L62
            java.lang.String r5 = "/system/bin/getprop"
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L62
            r5 = 1
            r4[r5] = r8     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L62
            java.lang.Process r8 = r3.exec(r4)     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L62
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L58
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L58
            java.io.InputStream r5 = r8.getInputStream()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L58
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L58
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L58
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L58
            java.lang.String r2 = ""
        L31:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51
            if (r4 == 0) goto L39
            r2 = r4
            goto L31
        L39:
            r3.close()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40
            goto L48
        L3d:
            r8 = move-exception
            goto L9c
        L40:
            r3 = move-exception
            java.lang.String r4 = "Flipper"
            java.lang.String r5 = "Failed to close BufferedReader when reading flipper ports prop"
            android.util.Log.e(r4, r5, r3)     // Catch: java.lang.Throwable -> L3d
        L48:
            r8.destroy()     // Catch: java.lang.Throwable -> L3d
        L4b:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L3d
            goto L83
        L4f:
            r2 = move-exception
            goto L85
        L51:
            r2 = move-exception
            goto L66
        L53:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L85
        L58:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L66
        L5d:
            r8 = move-exception
            r3 = r2
            r2 = r8
            r8 = r3
            goto L85
        L62:
            r8 = move-exception
            r3 = r2
            r2 = r8
            r8 = r3
        L66:
            java.lang.String r4 = "Flipper"
            java.lang.String r5 = "Failed to query for flipper ports prop"
            android.util.Log.e(r4, r5, r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = ""
            if (r3 == 0) goto L7d
            r3.close()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L75
            goto L7d
        L75:
            r3 = move-exception
            java.lang.String r4 = "Flipper"
            java.lang.String r5 = "Failed to close BufferedReader when reading flipper ports prop"
            android.util.Log.e(r4, r5, r3)     // Catch: java.lang.Throwable -> L3d
        L7d:
            if (r8 == 0) goto L4b
            r8.destroy()     // Catch: java.lang.Throwable -> L3d
            goto L4b
        L83:
            monitor-exit(r0)
            return r2
        L85:
            if (r3 == 0) goto L93
            r3.close()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L8b
            goto L93
        L8b:
            r3 = move-exception
            java.lang.String r4 = "Flipper"
            java.lang.String r5 = "Failed to close BufferedReader when reading flipper ports prop"
            android.util.Log.e(r4, r5, r3)     // Catch: java.lang.Throwable -> L3d
        L93:
            if (r8 == 0) goto L98
            r8.destroy()     // Catch: java.lang.Throwable -> L3d
        L98:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L3d
            throw r2     // Catch: java.lang.Throwable -> L3d
        L9c:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flipper.android.FlipperProps.getFlipperPortsPropValue(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getInsecurePort() {
        return extractIntFromPropValue(getFlipperDefaultPortsPropValue(), 0, 9089);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getSecurePort() {
        return extractIntFromPropValue(getFlipperDefaultPortsPropValue(), 1, 9088);
    }
}
