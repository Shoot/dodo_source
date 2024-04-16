package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.PackageConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: lc0  reason: default package */
/* loaded from: classes3.dex */
public class lc0 {
    private static final Uri a = Uri.parse("content://com.huawei.hwid");
    private static final String[] b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"};

    private static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            xhc.f("BksUtil", "The directory  has already exists");
            return 1;
        } else if (file.mkdirs()) {
            xhc.b("BksUtil", "create directory  success");
            return 0;
        } else {
            xhc.d("BksUtil", "create directory  failed");
            return -1;
        }
    }

    private static String b(Context context) {
        Context createDeviceProtectedStorageContext;
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder();
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            sb.append(createDeviceProtectedStorageContext.getFilesDir());
            sb.append(File.separator);
            sb.append("aegis");
            return sb.toString();
        }
        return context.getApplicationContext().getFilesDir() + File.separator + "aegis";
    }

    private static String c(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArr) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        }
        return "";
    }

    private static void d(InputStream inputStream, Context context) {
        FileOutputStream fileOutputStream;
        if (inputStream != null && context != null) {
            String b2 = b(context);
            if (!new File(b2).exists()) {
                a(b2);
            }
            File file = new File(b2, "hmsrootcas.bks");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    xhc.e("BksUtil", "write output stream ");
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException unused) {
            }
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr, 0, 2048);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        vhc.c(fileOutputStream);
                        return;
                    }
                }
            } catch (IOException unused2) {
                fileOutputStream2 = fileOutputStream;
                xhc.d("BksUtil", " IOException");
                vhc.c(fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                vhc.c(fileOutputStream2);
                throw th;
            }
        }
    }

    private static byte[] e(Context context, String str) {
        PackageInfo packageInfo;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                    return packageInfo.signatures[0].toByteArray();
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("BksUtil", "PackageManager.NameNotFoundException : " + e.getMessage());
            } catch (Exception e2) {
                Log.e("BksUtil", "get pm exception : " + e2.getMessage());
            }
            return new byte[0];
        }
        Log.e("BksUtil", "packageName is null or context is null");
        return new byte[0];
    }

    private static String f(Context context) {
        return b(context) + File.separator + "hmsrootcas.bks";
    }

    private static String g(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return c(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            xhc.d("BksUtil", "inputstraem exception");
            return "";
        }
    }

    private static boolean h(Context context, String str) {
        return "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(j(e(context, str)));
    }

    private static boolean i(String str) {
        int parseInt;
        int i;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        xhc.e("BksUtil", "hms version code is : " + str);
        String[] split = str.split("\\.");
        String[] split2 = "4.0.2.300".split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        for (int i2 = 0; i2 < max; i2++) {
            if (i2 < length) {
                try {
                    parseInt = Integer.parseInt(split[i2]);
                } catch (Exception e) {
                    xhc.d("BksUtil", " exception : " + e.getMessage());
                    if (i2 < length2) {
                        return false;
                    }
                    return true;
                }
            } else {
                parseInt = 0;
            }
            if (i2 < length2) {
                i = Integer.parseInt(split2[i2]);
            } else {
                i = 0;
            }
            if (parseInt < i) {
                return false;
            }
            if (parseInt > i) {
                return true;
            }
        }
        return true;
    }

    private static String j(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return c(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e) {
            Log.e("BksUtil", "NoSuchAlgorithmException" + e.getMessage());
            return "";
        }
    }

    private static boolean k(Context context) {
        return new File(b(context) + File.separator + "hmsrootcas.bks").exists();
    }

    private static boolean l(Context context, String str) {
        byte[] e = e(context, str);
        for (String str2 : b) {
            if (str2.equalsIgnoreCase(j(e))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    public static synchronized InputStream m(Context context) {
        InputStream inputStream;
        ByteArrayInputStream byteArrayInputStream;
        String a2;
        String g;
        synchronized (lc0.class) {
            try {
                xhc.e("BksUtil", "get bks from tss begin");
                if (context != null) {
                    nec.b(context);
                }
                Context a3 = nec.a();
                ByteArrayInputStream byteArrayInputStream2 = null;
                if (a3 == null) {
                    xhc.d("BksUtil", "context is null");
                    return null;
                } else if (!i(aic.a("com.huawei.hwid")) && !i(aic.a(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
                    xhc.d("BksUtil", "hms version code is too low : " + aic.a("com.huawei.hwid"));
                    return null;
                } else {
                    boolean l = l(a3, "com.huawei.hwid");
                    ?? r2 = l;
                    if (!l) {
                        boolean h = h(a3, PackageConstants.SERVICES_PACKAGE_ALL_SCENE);
                        r2 = h;
                        if (!h) {
                            xhc.d("BksUtil", "hms sign error");
                            return null;
                        }
                    }
                    try {
                        r2 = new ByteArrayOutputStream();
                        try {
                            inputStream = a3.getContentResolver().openInputStream(Uri.withAppendedPath(a, "files/hmsrootcas.bks"));
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read <= -1) {
                                        break;
                                    }
                                    r2.write(bArr, 0, read);
                                }
                                r2.flush();
                                byteArrayInputStream = new ByteArrayInputStream(r2.toByteArray());
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            inputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            inputStream = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        a2 = dic.a("bks_hash", "", a3);
                        g = g(r2.toByteArray());
                    } catch (Exception unused3) {
                        byteArrayInputStream2 = byteArrayInputStream;
                        xhc.d("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider");
                        vhc.b(inputStream);
                        vhc.c(r2);
                        vhc.b(byteArrayInputStream2);
                        return n(a3);
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayInputStream2 = byteArrayInputStream;
                        vhc.b(inputStream);
                        vhc.c(r2);
                        vhc.b(byteArrayInputStream2);
                        throw th;
                    }
                    if (k(a3) && a2.equals(g)) {
                        xhc.e("BksUtil", "bks not update");
                        vhc.b(inputStream);
                        vhc.c(r2);
                        vhc.b(byteArrayInputStream);
                        return n(a3);
                    }
                    xhc.e("BksUtil", "update bks and sp");
                    d(byteArrayInputStream, a3);
                    dic.c("bks_hash", g, a3);
                    vhc.b(inputStream);
                    vhc.c(r2);
                    vhc.b(byteArrayInputStream);
                    return n(a3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static InputStream n(Context context) {
        if (k(context)) {
            xhc.e("BksUtil", "getFilesBksIS ");
            try {
                return new FileInputStream(f(context));
            } catch (FileNotFoundException unused) {
                xhc.d("BksUtil", "FileNotFoundExceptio: ");
                return null;
            }
        }
        return null;
    }
}
