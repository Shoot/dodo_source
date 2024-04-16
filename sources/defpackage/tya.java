package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: StreamGifDecoder.java */
/* renamed from: tya  reason: default package */
/* loaded from: classes.dex */
public class tya implements rj9<InputStream, kf4> {
    private final List<ImageHeaderParser> a;
    private final rj9<ByteBuffer, kf4> b;
    private final mr c;

    public tya(List<ImageHeaderParser> list, rj9<ByteBuffer, kf4> rj9Var, mr mrVar) {
        this.a = list;
        this.b = rj9Var;
        this.c = mrVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
                return null;
            }
            return null;
        }
    }

    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<kf4> b(@NonNull InputStream inputStream, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        byte[] e = e(inputStream);
        if (e == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(e), i, i2, ac7Var);
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public boolean a(@NonNull InputStream inputStream, @NonNull ac7 ac7Var) throws IOException {
        if (!((Boolean) ac7Var.c(vf4.b)).booleanValue() && a.f(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }
}
