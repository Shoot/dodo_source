package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* compiled from: WorkDatabasePathHelper.java */
/* renamed from: y6c  reason: default package */
/* loaded from: classes.dex */
public class y6c {
    private static final String a = nx5.f("WrkDbPathHelper");
    private static final String[] b = {"-journal", "-shm", "-wal"};

    @NonNull
    public static File a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return b(context);
        }
        return c(context, "androidx.work.workdb");
    }

    @NonNull
    public static File b(@NonNull Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static File c(@NonNull Context context, @NonNull String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    @NonNull
    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(@NonNull Context context) {
        String format;
        File b2 = b(context);
        if (Build.VERSION.SDK_INT >= 23 && b2.exists()) {
            nx5.c().a(a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f = f(context);
            for (File file : f.keySet()) {
                File file2 = f.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        nx5.c().h(a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    if (file.renameTo(file2)) {
                        format = String.format("Migrated %s to %s", file, file2);
                    } else {
                        format = String.format("Renaming %s to %s failed", file, file2);
                    }
                    nx5.c().a(a, format, new Throwable[0]);
                }
            }
        }
    }

    @NonNull
    public static Map<File, File> f(@NonNull Context context) {
        File b2;
        File a2;
        String[] strArr;
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            hashMap.put(b(context), a(context));
            for (String str : b) {
                hashMap.put(new File(b2.getPath() + str), new File(a2.getPath() + str));
            }
        }
        return hashMap;
    }
}
