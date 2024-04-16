package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: ls4  reason: default package */
/* loaded from: classes3.dex */
public class ls4 {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.e("IOUtil", "closeSecure IOException");
            }
        }
    }

    public static void b(InputStream inputStream) {
        a(inputStream);
    }

    public static void c(OutputStream outputStream) {
        a(outputStream);
    }

    public static void d(File file) {
        if (file != null && file.exists() && !file.delete()) {
            Log.e("IOUtil", "deleteSecure exception");
        }
    }
}
