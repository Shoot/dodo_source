package com.huawei.hms.hatool;

import java.io.File;
import java.io.IOException;
/* loaded from: classes3.dex */
public class c0 {
    public String a = b.i().getFilesDir().getPath();

    public static boolean d() {
        return b(new File(b.i().getFilesDir().getPath() + "/hms"));
    }

    public String a() {
        String b;
        String b2;
        String b3;
        String b4;
        String c = c();
        if (b()) {
            y.c("hmsSdk", "refresh components");
            b = hh3.d(128);
            a("aprpap", b);
            b2 = hh3.d(128);
            a("febdoc", b2);
            b3 = hh3.d(128);
            a("marfil", b3);
            b4 = hh3.d(128);
            a("maywnj", b4);
            g0.b(b.i(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            b = b("aprpap");
            b2 = b("febdoc");
            b3 = b("marfil");
            b4 = b("maywnj");
        }
        return jo4.a(cn7.b(a(b, b2, b3, c), jo4.b(b4), 10000, 16));
    }

    public final String b(String str) {
        String a = a(str);
        File file = new File(a, "hianalytics_" + str);
        if (a(file)) {
            return t0.a(file);
        }
        String d = hh3.d(128);
        t0.a(file, d);
        return d;
    }

    public final String c() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }

    public final String a(String str) {
        return this.a + "/hms/component/".replace("component", str);
    }

    public final boolean b() {
        long a = g0.a(b.i(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != a) {
            return System.currentTimeMillis() - a > 31536000000L;
        }
        y.c("hmsSdk", "First init components");
        return true;
    }

    public static boolean b(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    y.c("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                b(file2);
            }
        }
        return file.delete();
    }

    public final void a(String str, String str2) {
        File file = new File(a(str));
        String a = a(str);
        File file2 = new File(a, "hianalytics_" + str);
        if (!file.exists() && file.mkdirs()) {
            y.c("hmsSdk", "file directory is mkdirs");
        }
        if (a(file2)) {
            t0.a(file2, str2);
        } else {
            y.f("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    public final boolean a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            y.f("hmsSdk", "create new file error!");
            return false;
        }
    }

    public final char[] a(String str, String str2, String str3, String str4) {
        byte[] b = jo4.b(str);
        byte[] b2 = jo4.b(str2);
        byte[] b3 = jo4.b(str3);
        byte[] b4 = jo4.b(str4);
        int length = b.length;
        if (length > b2.length) {
            length = b2.length;
        }
        if (length > b3.length) {
            length = b3.length;
        }
        if (length > b4.length) {
            length = b4.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((b[i] ^ b2[i]) ^ b3[i]) ^ b4[i]);
        }
        return cArr;
    }
}
