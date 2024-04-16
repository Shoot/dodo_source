package com.hcaptcha.sdk;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.JavascriptInterface;
import ch.qos.logback.core.CoreConstants;
import dalvik.system.DexFile;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import lombok.NonNull;
/* loaded from: classes.dex */
final class b implements Serializable {
    private static String b = "[]";
    private static String c;
    @NonNull
    private final Context a;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public b(@NonNull Context context) {
        if (context != null) {
            this.a = context;
            return;
        }
        throw new NullPointerException("context is marked non-null but is null");
    }

    public List<String> a(String str, String str2) {
        ArrayList arrayList = new ArrayList(512);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest3 = MessageDigest.getInstance("MD5");
        DexFile dexFile = new DexFile(str2);
        try {
            Enumeration<String> entries = dexFile.entries();
            while (entries.hasMoreElements()) {
                String nextElement = entries.nextElement();
                if (!nextElement.startsWith("com.google.android.") && !nextElement.startsWith("android.")) {
                    if (nextElement.startsWith(str)) {
                        messageDigest2.update(nextElement.getBytes("UTF-8"));
                    } else {
                        messageDigest3.update(nextElement.getBytes("UTF-8"));
                    }
                }
                messageDigest.update(nextElement.getBytes("UTF-8"));
            }
            dexFile.close();
            arrayList.add("sys_" + String.format("%032x", new BigInteger(1, messageDigest.digest())));
            arrayList.add("deps_" + String.format("%032x", new BigInteger(1, messageDigest3.digest())));
            arrayList.add("app_" + String.format("%032x", new BigInteger(1, messageDigest2.digest())));
            arrayList.add("aver_" + Build.VERSION.RELEASE);
            arrayList.add("sdk_" + "3.8.1_33".replace((char) CoreConstants.DOT, '_'));
            return arrayList;
        } catch (Throwable th) {
            dexFile.close();
            throw th;
        }
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Context b() {
        return this.a;
    }

    public Map<String, String> c() {
        int length;
        HashMap hashMap = new HashMap();
        Process process = null;
        try {
            process = new ProcessBuilder("/system/bin/getprop").start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.endsWith("]")) {
                        if (sb.length() == 0) {
                            length = 0;
                        } else {
                            length = sb.length() - 1;
                        }
                        sb.replace(0, length, readLine);
                        String[] split = sb.toString().split("]: \\[");
                        String substring = split[0].substring(1);
                        if (substring.startsWith("ro")) {
                            String str = split[1];
                            hashMap.put(substring, str.substring(0, str.length() - 2));
                        }
                    } else {
                        sb.append(readLine);
                    }
                } else {
                    bufferedReader.close();
                    process.destroy();
                    return hashMap;
                }
            }
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        Context b2 = b();
        Context b3 = ((b) obj).b();
        if (b2 != null ? b2.equals(b3) : b3 == null) {
            return true;
        }
        return false;
    }

    @JavascriptInterface
    public String getDebugInfo() {
        String str = b;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            String str2 = b;
            if (str2 != null) {
                return str2;
            }
            try {
                String m = new f57().m(a(this.a.getPackageName(), this.a.getPackageCodePath()));
                b = m;
                return m;
            } catch (IOException | NoSuchAlgorithmException unused) {
                Log.d("JSDI", "Cannot build debugInfo");
                return "[]";
            }
        }
    }

    @JavascriptInterface
    public String getSysDebug() {
        String str = c;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            String str2 = c;
            if (str2 != null) {
                return str2;
            }
            try {
                String m = new f57().m(c());
                c = m;
                return m;
            } catch (IOException unused) {
                Log.d("JSDI", "Cannot build sysDebug");
                return "{}";
            }
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int hashCode;
        Context b2 = b();
        if (b2 == null) {
            hashCode = 43;
        } else {
            hashCode = b2.hashCode();
        }
        return hashCode + 59;
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "HCaptchaDebugInfo(context=" + b() + ")";
    }
}
