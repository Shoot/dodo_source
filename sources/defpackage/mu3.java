package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
/* compiled from: FileUtil.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Ljava/nio/channels/ReadableByteChannel;", "input", "Ljava/nio/channels/FileChannel;", "output", "", "a", "room-runtime_release"}, k = 2, mv = {1, 7, 1})
/* renamed from: mu3  reason: default package */
/* loaded from: classes.dex */
public final class mu3 {
    @SuppressLint({"LambdaLast"})
    public static final void a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        z65.h(readableByteChannel, "input");
        z65.h(fileChannel, "output");
        try {
            if (Build.VERSION.SDK_INT > 23) {
                fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            } else {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            }
            fileChannel.force(false);
            readableByteChannel.close();
            fileChannel.close();
        } catch (Throwable th) {
            readableByteChannel.close();
            fileChannel.close();
            throw th;
        }
    }
}
