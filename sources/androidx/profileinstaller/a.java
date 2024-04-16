package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
/* compiled from: BenchmarkOperation.java */
/* loaded from: classes.dex */
class a {

    /* compiled from: BenchmarkOperation.java */
    /* renamed from: androidx.profileinstaller.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0044a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* compiled from: BenchmarkOperation.java */
    /* loaded from: classes.dex */
    private static class b {
        static File a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext.getCodeCacheDir();
        }
    }

    static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                if (a(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(@NonNull Context context, @NonNull ProfileInstallReceiver.a aVar) {
        File cacheDir;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            cacheDir = b.a(context);
        } else if (i >= 23) {
            cacheDir = C0044a.a(context);
        } else {
            cacheDir = context.getCacheDir();
        }
        if (a(cacheDir)) {
            aVar.a(14, null);
        } else {
            aVar.a(15, null);
        }
    }
}
