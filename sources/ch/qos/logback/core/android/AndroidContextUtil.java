package ch.qos.logback.core.android;

import android.annotation.TargetApi;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public class AndroidContextUtil {
    private ContextWrapper context;

    public AndroidContextUtil() {
        this(getContext());
    }

    private String absPath(File file) {
        if (file != null) {
            return file.getAbsolutePath();
        }
        return "";
    }

    public static boolean containsProperties(String str) {
        if (!str.contains(CoreConstants.DATA_DIR_KEY) && !str.contains(CoreConstants.EXT_DIR_KEY) && !str.contains(CoreConstants.PACKAGE_NAME_KEY) && !str.contains(CoreConstants.VERSION_CODE_KEY) && !str.contains(CoreConstants.VERSION_NAME_KEY)) {
            return false;
        }
        return true;
    }

    protected static ContextWrapper getContext() {
        try {
            Class<?> cls = Class.forName("android.app.AppGlobals");
            return (ContextWrapper) cls.getDeclaredMethod("getInitialApplication", new Class[0]).invoke(cls, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public String getCacheDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        if (contextWrapper != null) {
            return absPath(contextWrapper.getCacheDir());
        }
        return "";
    }

    public String getDatabaseDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        if (contextWrapper != null && contextWrapper.getDatabasePath("x") != null) {
            return this.context.getDatabasePath("x").getParent();
        }
        return "";
    }

    public String getDatabasePath(String str) {
        ContextWrapper contextWrapper = this.context;
        if (contextWrapper != null) {
            return absPath(contextWrapper.getDatabasePath(str));
        }
        return "";
    }

    public String getExternalCacheDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        if (contextWrapper != null) {
            return absPath(contextWrapper.getExternalCacheDir());
        }
        return "";
    }

    @TargetApi(8)
    public String getExternalFilesDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        if (contextWrapper != null) {
            return absPath(contextWrapper.getExternalFilesDir(null));
        }
        return "";
    }

    @TargetApi(8)
    public String getExternalStorageDirectoryPath() {
        if (Build.VERSION.SDK_INT >= 29) {
            return getExternalFilesDirectoryPath();
        }
        return absPath(Environment.getExternalStorageDirectory());
    }

    public String getFilesDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        if (contextWrapper != null) {
            return absPath(contextWrapper.getFilesDir());
        }
        return "";
    }

    public String getMountedExternalStorageDirectoryPath() {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            return null;
        }
        return getExternalStorageDirectoryPath();
    }

    @TargetApi(21)
    public String getNoBackupFilesDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        if (contextWrapper != null) {
            return absPath(contextWrapper.getNoBackupFilesDir());
        }
        return "";
    }

    public String getPackageName() {
        ContextWrapper contextWrapper = this.context;
        if (contextWrapper != null) {
            return contextWrapper.getPackageName();
        }
        return "";
    }

    public String getVersionCode() {
        ContextWrapper contextWrapper = this.context;
        if (contextWrapper == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = contextWrapper.getPackageManager().getPackageInfo(getPackageName(), 0);
            return "" + packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getVersionName() {
        /*
            r4 = this;
            android.content.ContextWrapper r0 = r4.context
            java.lang.String r1 = ""
            if (r0 == 0) goto L17
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            java.lang.String r2 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            r3 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            java.lang.String r0 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            goto L18
        L16:
        L17:
            r0 = r1
        L18:
            if (r0 == 0) goto L1b
            r1 = r0
        L1b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.android.AndroidContextUtil.getVersionName():java.lang.String");
    }

    public void setupProperties(Context context) {
        context.putProperty(CoreConstants.DATA_DIR_KEY, getFilesDirectoryPath());
        String mountedExternalStorageDirectoryPath = getMountedExternalStorageDirectoryPath();
        if (mountedExternalStorageDirectoryPath != null) {
            context.putProperty(CoreConstants.EXT_DIR_KEY, mountedExternalStorageDirectoryPath);
        }
        context.putProperty(CoreConstants.PACKAGE_NAME_KEY, getPackageName());
        context.putProperty(CoreConstants.VERSION_CODE_KEY, getVersionCode());
        context.putProperty(CoreConstants.VERSION_NAME_KEY, getVersionName());
    }

    public AndroidContextUtil(ContextWrapper contextWrapper) {
        this.context = contextWrapper;
    }
}
