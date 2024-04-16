package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes3.dex */
public class d {
    private static final String o = "d";
    private Map<String, List<String>> a;
    private byte[] b;
    private int c;
    private long d;
    private long e;
    private long f;
    private String g;
    private int h;
    private int i;
    private String j;
    private long k;
    private String l;
    private Exception m;
    private String n;

    public d(int i, Map<String, List<String>> map, byte[] bArr, long j) {
        this.h = 2;
        this.i = ConnectionResult.RESOLUTION_REQUIRED;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.c = i;
        this.a = map;
        this.b = ByteBuffer.wrap(bArr).array();
        this.d = j;
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r9.getInt("resultCode") == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p() {
        /*
            r10 = this;
            java.lang.String r0 = "errorList"
            java.lang.String r1 = "errorDesc"
            java.lang.String r2 = "errorCode"
            java.lang.String r3 = "resultCode"
            java.lang.String r4 = "isSuccess"
            boolean r5 = r10.m()
            r6 = 1
            if (r5 == 0) goto L1c
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "GRSSDK get httpcode{304} not any changed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.c(r6)
            return
        L1c:
            boolean r5 = r10.o()
            r7 = 2
            if (r5 != 0) goto L2e
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "GRSSDK parse server body all failed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.c(r7)
            return
        L2e:
            r5 = 0
            byte[] r8 = r10.b     // Catch: org.json.JSONException -> L47
            java.lang.String r8 = com.huawei.hms.framework.common.StringUtils.byte2Str(r8)     // Catch: org.json.JSONException -> L47
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L47
            r9.<init>(r8)     // Catch: org.json.JSONException -> L47
            boolean r8 = r9.has(r4)     // Catch: org.json.JSONException -> L47
            if (r8 == 0) goto L4a
            int r3 = r9.getInt(r4)     // Catch: org.json.JSONException -> L47
            if (r3 != r6) goto L58
            goto L56
        L47:
            r0 = move-exception
            goto Lba
        L4a:
            boolean r4 = r9.has(r3)     // Catch: org.json.JSONException -> L47
            if (r4 == 0) goto L5a
            int r3 = r9.getInt(r3)     // Catch: org.json.JSONException -> L47
            if (r3 != 0) goto L58
        L56:
            r3 = 1
            goto L62
        L58:
            r3 = 2
            goto L62
        L5a:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.d.o     // Catch: org.json.JSONException -> L47
            java.lang.String r4 = "sth. wrong because server errorcode's key."
            com.huawei.hms.framework.common.Logger.e(r3, r4)     // Catch: org.json.JSONException -> L47
            r3 = -1
        L62:
            java.lang.String r4 = "services"
            if (r3 == r6) goto L6d
            boolean r8 = r9.has(r4)     // Catch: org.json.JSONException -> L47
            if (r8 == 0) goto L6d
            r3 = 0
        L6d:
            r10.c(r3)     // Catch: org.json.JSONException -> L47
            java.lang.String r8 = ""
            if (r3 == r6) goto L95
            if (r3 != 0) goto L77
            goto L95
        L77:
            boolean r0 = r9.has(r2)     // Catch: org.json.JSONException -> L47
            if (r0 == 0) goto L82
            int r0 = r9.getInt(r2)     // Catch: org.json.JSONException -> L47
            goto L84
        L82:
            r0 = 9001(0x2329, float:1.2613E-41)
        L84:
            r10.b(r0)     // Catch: org.json.JSONException -> L47
            boolean r0 = r9.has(r1)     // Catch: org.json.JSONException -> L47
            if (r0 == 0) goto L91
            java.lang.String r8 = r9.getString(r1)     // Catch: org.json.JSONException -> L47
        L91:
            r10.d(r8)     // Catch: org.json.JSONException -> L47
            goto Ld0
        L95:
            boolean r1 = r9.has(r4)     // Catch: org.json.JSONException -> L47
            if (r1 == 0) goto La4
            org.json.JSONObject r1 = r9.getJSONObject(r4)     // Catch: org.json.JSONException -> L47
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L47
            goto La5
        La4:
            r1 = r8
        La5:
            r10.f(r1)     // Catch: org.json.JSONException -> L47
            boolean r1 = r9.has(r0)     // Catch: org.json.JSONException -> L47
            if (r1 == 0) goto Lb6
            org.json.JSONObject r0 = r9.getJSONObject(r0)     // Catch: org.json.JSONException -> L47
            java.lang.String r8 = r0.toString()     // Catch: org.json.JSONException -> L47
        Lb6:
            r10.e(r8)     // Catch: org.json.JSONException -> L47
            goto Ld0
        Lba:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            r2[r5] = r0
            java.lang.String r0 = "GrsResponse GrsResponse(String result) JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r0, r2)
            r10.c(r7)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[Catch: JSONException -> 0x0032, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0032, blocks: (B:13:0x0025, B:15:0x002b, B:21:0x003a, B:23:0x0040, B:20:0x0034), top: B:27:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            r4 = this;
            boolean r0 = r4.o()
            if (r0 != 0) goto L13
            boolean r0 = r4.n()
            if (r0 != 0) goto L13
            boolean r0 = r4.m()
            if (r0 != 0) goto L13
            return
        L13:
            java.util.Map r0 = r4.r()
            int r1 = r0.size()
            if (r1 > 0) goto L25
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "parseHeader {headers.size() <= 0}"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            return
        L25:
            boolean r1 = r4.o()     // Catch: org.json.JSONException -> L32
            if (r1 != 0) goto L34
            boolean r1 = r4.m()     // Catch: org.json.JSONException -> L32
            if (r1 == 0) goto L3a
            goto L34
        L32:
            r0 = move-exception
            goto L44
        L34:
            r4.b(r0)     // Catch: org.json.JSONException -> L32
            r4.a(r0)     // Catch: org.json.JSONException -> L32
        L3a:
            boolean r1 = r4.n()     // Catch: org.json.JSONException -> L32
            if (r1 == 0) goto L59
            r4.c(r0)     // Catch: org.json.JSONException -> L32
            goto L59
        L44:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.o
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "parseHeader catch JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r0, r2)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.q():void");
    }

    private Map<String, String> r() {
        HashMap hashMap = new HashMap(16);
        Map<String, List<String>> map = this.a;
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, List<String>> entry : this.a.entrySet()) {
                String key = entry.getKey();
                for (String str : entry.getValue()) {
                    hashMap.put(key, str);
                }
            }
            return hashMap;
        }
        Logger.v(o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
        return hashMap;
    }

    private void s() {
        q();
        p();
    }

    public String a() {
        return this.j;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.i;
    }

    public Exception d() {
        return this.m;
    }

    public String e() {
        return this.l;
    }

    public int f() {
        return this.h;
    }

    public long g() {
        return this.f;
    }

    public long h() {
        return this.e;
    }

    public long i() {
        return this.d;
    }

    public String j() {
        return this.g;
    }

    public long k() {
        return this.k;
    }

    public String l() {
        return this.n;
    }

    public boolean m() {
        if (this.c == 304) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if (this.c == 503) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.c == 200) {
            return true;
        }
        return false;
    }

    public d(Exception exc, long j) {
        this.c = 0;
        this.h = 2;
        this.i = ConnectionResult.RESOLUTION_REQUIRED;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.m = exc;
        this.d = j;
    }

    private void b(int i) {
        this.i = i;
    }

    private void c(int i) {
        this.h = i;
    }

    private void d(String str) {
    }

    private void e(String str) {
    }

    private void f(String str) {
        this.g = str;
    }

    public void a(int i) {
    }

    private void c(long j) {
        this.k = j;
    }

    public void a(long j) {
        this.f = j;
    }

    public void b(long j) {
        this.e = j;
    }

    private void c(String str) {
        this.j = str;
    }

    public void a(String str) {
        this.l = str;
    }

    public void b(String str) {
        this.n = str;
    }

    private void a(Map<String, String> map) {
        String str;
        String str2;
        if (map.containsKey("ETag")) {
            String str3 = map.get("ETag");
            if (!TextUtils.isEmpty(str3)) {
                Logger.i(o, "success get Etag from server");
                a(str3);
                return;
            }
            str = o;
            str2 = "The Response Heads Etag is Empty";
        } else {
            str = o;
            str2 = "Response Heads has not Etag";
        }
        Logger.i(str, str2);
    }

    private void b(Map<String, String> map) {
        long time;
        if (map.containsKey("Cache-Control")) {
            String str = map.get("Cache-Control");
            if (!TextUtils.isEmpty(str) && str.contains("max-age=")) {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                    try {
                        Logger.v(o, "Cache-Control value{%s}", Long.valueOf(time));
                    } catch (NumberFormatException e) {
                        e = e;
                        Logger.w(o, "getExpireTime addHeadersToResult NumberFormatException", e);
                        long j = ((time > 0 || time > 2592000) ? 86400L : 86400L) * 1000;
                        Logger.i(o, "convert expireTime{%s}", Long.valueOf(j));
                        c(String.valueOf(j + System.currentTimeMillis()));
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    time = 0;
                }
            }
            time = 0;
        } else {
            if (map.containsKey("Expires")) {
                String str2 = map.get("Expires");
                Logger.v(o, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey("Date") ? map.get("Date") : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e3) {
                    Logger.w(o, "getExpireTime ParseException.", e3);
                }
            } else {
                Logger.i(o, "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        long j2 = ((time > 0 || time > 2592000) ? 86400L : 86400L) * 1000;
        Logger.i(o, "convert expireTime{%s}", Long.valueOf(j2));
        c(String.valueOf(j2 + System.currentTimeMillis()));
    }

    private void c(Map<String, String> map) {
        long j;
        if (map.containsKey("Retry-After")) {
            String str = map.get("Retry-After");
            if (!TextUtils.isEmpty(str)) {
                try {
                    j = Long.parseLong(str);
                } catch (NumberFormatException e) {
                    Logger.w(o, "getRetryAfter addHeadersToResult NumberFormatException", e);
                }
                long j2 = j * 1000;
                Logger.v(o, "convert retry-afterTime{%s}", Long.valueOf(j2));
                c(j2);
            }
        }
        j = 0;
        long j22 = j * 1000;
        Logger.v(o, "convert retry-afterTime{%s}", Long.valueOf(j22));
        c(j22);
    }
}
