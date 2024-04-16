package com.github.hiteshsondhi88.libffmpeg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
/* compiled from: Util.java */
/* loaded from: classes2.dex */
class m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    return sb.toString();
                }
            }
        } catch (IOException e) {
            j.b("error converting input stream to string", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Process process) {
        if (process != null) {
            process.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationContext().getApplicationInfo();
        int i = applicationInfo.flags & 2;
        applicationInfo.flags = i;
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(Process process) {
        if (process == null) {
            return true;
        }
        try {
            process.exitValue();
            return true;
        } catch (IllegalThreadStateException unused) {
            return false;
        }
    }
}
