package defpackage;

import android.util.Pair;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: NetworkCache.java */
/* renamed from: xv6  reason: default package */
/* loaded from: classes.dex */
public class xv6 {
    @NonNull
    private final uz5 a;

    public xv6(@NonNull uz5 uz5Var) {
        this.a = uz5Var;
    }

    private static String b(String str, vt3 vt3Var, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = vt3Var.a();
        } else {
            str2 = vt3Var.a;
        }
        sb.append(str2);
        return sb.toString();
    }

    private File c(String str) throws FileNotFoundException {
        File file = new File(d(), b(str, vt3.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(d(), b(str, vt3.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File d() {
        File a = this.a.a();
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Pair<vt3, InputStream> a(String str) {
        vt3 vt3Var;
        try {
            File c = c(str);
            if (c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(c);
            if (c.getAbsolutePath().endsWith(".zip")) {
                vt3Var = vt3.ZIP;
            } else {
                vt3Var = vt3.JSON;
            }
            ox5.a("Cache hit for " + str + " at " + c.getAbsolutePath());
            return new Pair<>(vt3Var, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, vt3 vt3Var) {
        File file = new File(d(), b(str, vt3Var, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        ox5.a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            ox5.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File f(String str, InputStream inputStream, vt3 vt3Var) throws IOException {
        File file = new File(d(), b(str, vt3Var, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
