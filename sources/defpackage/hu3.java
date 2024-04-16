package defpackage;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.dodopizza.persistence.entity.PaymentEntity;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: FileStore.java */
/* renamed from: hu3  reason: default package */
/* loaded from: classes2.dex */
public class hu3 {
    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final File f;

    public hu3(Context context) {
        String str;
        String processName;
        File filesDir = context.getFilesDir();
        this.a = filesDir;
        if (v()) {
            StringBuilder sb = new StringBuilder();
            sb.append(".com.google.firebase.crashlytics.files.v2");
            sb.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb.append(u(processName));
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File q = q(new File(filesDir, str));
        this.b = q;
        this.c = q(new File(q, "open-sessions"));
        this.d = q(new File(q, "reports"));
        this.e = q(new File(q, "priority-reports"));
        this.f = q(new File(q, "native-reports"));
    }

    private void a(File file) {
        if (file.exists() && s(file)) {
            rx5 f = rx5.f();
            f.b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private File n(String str) {
        return r(new File(this.c, str));
    }

    private static synchronized File q(File file) {
        synchronized (hu3.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    rx5 f = rx5.f();
                    f.b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    rx5 f2 = rx5.f();
                    f2.d("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static File r(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                s(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> t(T[] tArr) {
        if (tArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(tArr);
    }

    static String u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    private static boolean v() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public void b() {
        a(new File(this.a, ".com.google.firebase.crashlytics"));
        a(new File(this.a, ".com.google.firebase.crashlytics-ndk"));
        if (v()) {
            a(new File(this.a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    public boolean c(String str) {
        return s(new File(this.c, str));
    }

    public List<String> d() {
        return t(this.c.list());
    }

    public File e(String str) {
        return new File(this.b, str);
    }

    public List<File> f(FilenameFilter filenameFilter) {
        return t(this.b.listFiles(filenameFilter));
    }

    public File g(String str) {
        return new File(this.f, str);
    }

    public List<File> h() {
        return t(this.f.listFiles());
    }

    public File i(String str) {
        return r(new File(n(str), PaymentEntity.SCENARIO_NATIVE));
    }

    public File j(String str) {
        return new File(this.e, str);
    }

    public List<File> k() {
        return t(this.e.listFiles());
    }

    public File l(String str) {
        return new File(this.d, str);
    }

    public List<File> m() {
        return t(this.d.listFiles());
    }

    public File o(String str, String str2) {
        return new File(n(str), str2);
    }

    public List<File> p(String str, FilenameFilter filenameFilter) {
        return t(n(str).listFiles(filenameFilter));
    }
}
