package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: dzc  reason: default package */
/* loaded from: classes2.dex */
public final class dzc {

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
    /* renamed from: dzc$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static volatile pb7<bzc> a;

        private a() {
        }

        public static pb7<bzc> a(Context context) {
            pb7<bzc> pb7Var;
            pb7<bzc> a2;
            boolean isDeviceProtectedStorage;
            synchronized (a.class) {
                try {
                    pb7Var = a;
                    if (pb7Var == null) {
                        new dzc();
                        if (!fzc.c(Build.TYPE, Build.TAGS)) {
                            a2 = pb7.a();
                        } else {
                            if (oyc.a()) {
                                isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                                if (!isDeviceProtectedStorage) {
                                    context = context.createDeviceProtectedStorageContext();
                                }
                            }
                            a2 = dzc.a(context);
                        }
                        pb7Var = a2;
                        a = pb7Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return pb7Var;
        }
    }

    static pb7<bzc> a(Context context) {
        pb7<bzc> a2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            pb7<File> d = d(context);
            if (d.c()) {
                a2 = pb7.d(c(context, d.b()));
            } else {
                a2 = pb7.a();
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static final String b(String str) {
        return new String(str);
    }

    private static bzc c(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            wka wkaVar = new wka();
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String b = b(split[0]);
                        String decode = Uri.decode(b(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String b2 = b(split[2]);
                            str = Uri.decode(b2);
                            if (str.length() < 1024 || str == b2) {
                                hashMap.put(b2, str);
                            }
                        }
                        if (!wkaVar.containsKey(b)) {
                            wkaVar.put(b, new wka());
                        }
                        ((wka) wkaVar.get(b)).put(decode, str);
                    }
                } else {
                    String valueOf = String.valueOf(file);
                    String packageName = context.getPackageName();
                    Log.w("HermeticFileOverrides", "Parsed " + valueOf + " for Android package " + packageName);
                    vyc vycVar = new vyc(wkaVar);
                    bufferedReader.close();
                    return vycVar;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static pb7<File> d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                return pb7.d(file);
            }
            return pb7.a();
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return pb7.a();
        }
    }
}
