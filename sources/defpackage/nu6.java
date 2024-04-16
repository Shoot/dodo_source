package defpackage;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
/* compiled from: NativeSessionFileGzipper.java */
/* renamed from: nu6  reason: default package */
/* loaded from: classes2.dex */
class nu6 {
    private static void a(InputStream inputStream, @NonNull File file) throws IOException {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        ek1.g(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    ek1.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(File file, List<mu6> list) {
        for (mu6 mu6Var : list) {
            InputStream inputStream = null;
            try {
                inputStream = mu6Var.c();
                if (inputStream != null) {
                    a(inputStream, new File(file, mu6Var.b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                ek1.g(null);
                throw th;
            }
            ek1.g(inputStream);
        }
    }
}
