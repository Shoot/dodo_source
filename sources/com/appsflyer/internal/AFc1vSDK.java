package com.appsflyer.internal;

import android.util.Base64;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* loaded from: classes.dex */
public interface AFc1vSDK {
    void values(byte[] bArr, Map<String, String> map, int i);

    /* loaded from: classes.dex */
    public static final class AFa1wSDK {
        public final String AFInAppEventType;
        public final Boolean valueOf;
        public Boolean values;

        public AFa1wSDK() {
        }

        public AFa1wSDK(String str, Boolean bool) {
            this.AFInAppEventType = str;
            this.valueOf = bool;
        }

        public static String AFInAppEventType(String str) {
            z65.h(str, "");
            byte[] bytes = str.getBytes(rw0.b);
            z65.g(bytes, "");
            String encodeToString = Base64.encodeToString(bytes, 2);
            z65.g(encodeToString, "");
            return encodeToString;
        }

        public static String AFKeystoreWrapper(String str) {
            z65.h(str, "");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(rw0.b);
            z65.g(bytes, "");
            byte[] digest = messageDigest.digest(bytes);
            z65.g(digest, "");
            String str2 = "";
            for (byte b : digest) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                z65.g(format, "");
                sb.append(format);
                str2 = sb.toString();
            }
            return str2;
        }

        public static JSONArray valueOf(List<AFb1aSDK> list) {
            int w;
            z65.h(list, "");
            List<AFb1aSDK> list2 = list;
            w = lc1.w(list2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (AFb1aSDK aFb1aSDK : list2) {
                arrayList.add(aFb1aSDK.AFKeystoreWrapper());
            }
            return new JSONArray((Collection) arrayList);
        }

        public static boolean valueOf(HttpURLConnection httpURLConnection) {
            z65.h(httpURLConnection, "");
            return httpURLConnection.getResponseCode() / 100 == 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
            r2 = defpackage.k0b.k(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
            r4 = defpackage.k0b.k(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
            r0 = defpackage.k0b.k(r0);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int valueOf(java.lang.String r4) {
            /*
                java.lang.String r0 = ""
                defpackage.z65.h(r4, r0)
                ec9 r0 = new ec9
                java.lang.String r1 = "(\\d+).?(\\d+)?.?(\\d+)?(-rc\\d+)?(_.*)?"
                r0.<init>(r1)
                kotlin.text.MatchResult r4 = r0.e(r4)
                if (r4 == 0) goto L72
                t96 r0 = r4.c()
                r1 = 1
                kotlin.text.MatchGroup r0 = r0.get(r1)
                r1 = 0
                if (r0 == 0) goto L2f
                java.lang.String r0 = r0.a()
                if (r0 == 0) goto L2f
                java.lang.Integer r0 = defpackage.c0b.k(r0)
                if (r0 == 0) goto L2f
                int r0 = r0.intValue()
                goto L30
            L2f:
                r0 = 0
            L30:
                r2 = 1000000(0xf4240, float:1.401298E-39)
                int r0 = r0 * r2
                t96 r2 = r4.c()
                r3 = 2
                kotlin.text.MatchGroup r2 = r2.get(r3)
                if (r2 == 0) goto L51
                java.lang.String r2 = r2.a()
                if (r2 == 0) goto L51
                java.lang.Integer r2 = defpackage.c0b.k(r2)
                if (r2 == 0) goto L51
                int r2 = r2.intValue()
                goto L52
            L51:
                r2 = 0
            L52:
                int r2 = r2 * 1000
                int r0 = r0 + r2
                t96 r4 = r4.c()
                r2 = 3
                kotlin.text.MatchGroup r4 = r4.get(r2)
                if (r4 == 0) goto L70
                java.lang.String r4 = r4.a()
                if (r4 == 0) goto L70
                java.lang.Integer r4 = defpackage.c0b.k(r4)
                if (r4 == 0) goto L70
                int r1 = r4.intValue()
            L70:
                int r0 = r0 + r1
                return r0
            L72:
                r4 = -1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1vSDK.AFa1wSDK.valueOf(java.lang.String):int");
        }
    }
}
