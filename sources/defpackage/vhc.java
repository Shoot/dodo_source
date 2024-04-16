package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: vhc  reason: default package */
/* loaded from: classes3.dex */
public abstract class vhc {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                xhc.d("IOUtil", "closeSecure IOException");
            }
        }
    }

    public static void b(InputStream inputStream) {
        a(inputStream);
    }

    public static void c(OutputStream outputStream) {
        a(outputStream);
    }
}
