package com.github.hiteshsondhi88.libffmpeg;

import android.content.Context;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileUtils.java */
/* loaded from: classes2.dex */
public class i {
    static String a(InputStream inputStream) {
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                Formatter formatter = new Formatter();
                byte[] digest = messageDigest.digest();
                int length = digest.length;
                for (int i = 0; i < length; i++) {
                    formatter.format("%02x", Byte.valueOf(digest[i]));
                }
                String formatter2 = formatter.toString();
                m.a(inputStream);
                return formatter2;
            } catch (IOException e) {
                j.c(e);
                m.a(inputStream);
                return null;
            } catch (NoSuchAlgorithmException e2) {
                j.c(e2);
                m.a(inputStream);
                return null;
            }
        } catch (Throwable th) {
            m.a(inputStream);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0014: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:8:0x0014 */
    public static String b(String str) {
        BufferedInputStream bufferedInputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
                try {
                    String a = a(bufferedInputStream);
                    m.a(bufferedInputStream);
                    return a;
                } catch (IOException e) {
                    e = e;
                    j.c(e);
                    m.a(bufferedInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                m.a(inputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            bufferedInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            m.a(inputStream2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context, String str, String str2) {
        File f = f(context);
        try {
            InputStream open = context.getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(f, str2));
            byte[] bArr = new byte[4096];
            while (true) {
                int read = open.read(bArr);
                if (-1 != read) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    m.b(fileOutputStream);
                    m.a(open);
                    return true;
                }
            }
        } catch (IOException e) {
            j.b("issue in coping binary from assets to data. ", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(Context context) {
        return f(context).getAbsolutePath() + File.separator + "ffmpeg";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(Context context, Map<String, String> map) {
        String str = "";
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str = str + entry.getKey() + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue() + " ";
            }
        }
        return str + d(context);
    }

    static File f(Context context) {
        return context.getFilesDir();
    }
}
