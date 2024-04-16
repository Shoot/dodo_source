package defpackage;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@Deprecated
/* renamed from: ms4  reason: default package */
/* loaded from: classes2.dex */
public final class ms4 {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long b(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            a(inputStream);
            a(outputStream);
        }
        return j;
    }

    @NonNull
    @Deprecated
    public static byte[] c(@NonNull InputStream inputStream) throws IOException {
        return d(inputStream, true);
    }

    @NonNull
    @Deprecated
    public static byte[] d(@NonNull InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
