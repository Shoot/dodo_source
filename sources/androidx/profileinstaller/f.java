package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.profileinstaller.f;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: ProfileInstaller.java */
/* loaded from: classes.dex */
public class f {
    private static final c a = new a();
    @NonNull
    static final c b = new b();

    /* compiled from: ProfileInstaller.java */
    /* loaded from: classes.dex */
    class b implements c {
        b() {
        }

        @Override // androidx.profileinstaller.f.c
        public void a(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i != 6 && i != 7 && i != 8) {
                Log.d("ProfileInstaller", str);
            } else {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }

        @Override // androidx.profileinstaller.f.c
        public void b(int i, Object obj) {
            String str;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                str = "";
                            } else {
                                str = "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
                            }
                        } else {
                            str = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
                        }
                    } else {
                        str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
                    }
                } else {
                    str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
                }
            } else {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            }
            Log.d("ProfileInstaller", str);
        }
    }

    /* compiled from: ProfileInstaller.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(int i, Object obj);

        void b(int i, Object obj);
    }

    static boolean b(@NonNull File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar) {
        b(context.getFilesDir());
        g(executor, cVar, 11, null);
    }

    static boolean d(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        boolean z = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            long readLong = dataInputStream.readLong();
            dataInputStream.close();
            if (readLong == packageInfo.lastUpdateTime) {
                z = true;
            }
            if (z) {
                cVar.a(2, null);
            }
            return z;
        } catch (IOException unused) {
            return false;
        }
    }

    static void f(@NonNull PackageInfo packageInfo, @NonNull File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    static void g(@NonNull Executor executor, @NonNull final c cVar, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: gn8
            @Override // java.lang.Runnable
            public final void run() {
                f.c.this.a(i, obj);
            }
        });
    }

    private static boolean h(@NonNull AssetManager assetManager, @NonNull String str, @NonNull PackageInfo packageInfo, @NonNull File file, @NonNull String str2, @NonNull Executor executor, @NonNull c cVar) {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean n = bVar.i().m().n();
        if (n) {
            f(packageInfo, file);
        }
        return n;
    }

    public static void i(@NonNull Context context) {
        j(context, new hc6(), a);
    }

    public static void j(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar) {
        k(context, executor, cVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z && d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                i.c(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z) {
                z2 = true;
            }
            i.c(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            cVar.a(7, e);
            i.c(context, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(@NonNull Context context, @NonNull Executor executor, @NonNull c cVar) {
        try {
            f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            g(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            g(executor, cVar, 7, e);
        }
    }

    /* compiled from: ProfileInstaller.java */
    /* loaded from: classes.dex */
    class a implements c {
        a() {
        }

        @Override // androidx.profileinstaller.f.c
        public void a(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.f.c
        public void b(int i, Object obj) {
        }
    }
}
