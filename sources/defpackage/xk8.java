package defpackage;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: xk8  reason: default package */
/* loaded from: classes2.dex */
public class xk8 {
    private static String a;
    private static int b;

    public static String a() {
        BufferedReader bufferedReader;
        if (a == null) {
            int i = b;
            if (i == 0) {
                i = Process.myPid();
                b = i;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i > 0) {
                try {
                    String str2 = "/proc/" + i + "/cmdline";
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str2));
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    String readLine = bufferedReader.readLine();
                    gh8.j(readLine);
                    str = readLine.trim();
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    ms4.a(bufferedReader2);
                    throw th;
                }
                ms4.a(bufferedReader);
            }
            a = str;
        }
        return a;
    }
}
