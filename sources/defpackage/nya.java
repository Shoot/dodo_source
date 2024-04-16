package defpackage;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: StreamAnimationDecoder.java */
/* renamed from: nya  reason: default package */
/* loaded from: classes.dex */
public class nya implements rj9<InputStream, h74> {
    private final rj9<ByteBuffer, h74> a;

    public nya(rj9<ByteBuffer, h74> rj9Var) {
        this.a = rj9Var;
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
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<h74> b(@NonNull InputStream inputStream, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        byte[] e = e(inputStream);
        if (e == null) {
            return null;
        }
        return this.a.b(ByteBuffer.wrap(e), i, i2, ac7Var);
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public boolean a(@NonNull InputStream inputStream, @NonNull ac7 ac7Var) {
        if (!((Boolean) ac7Var.c(qk.b)).booleanValue() && q0.a(new wya(inputStream))) {
            return true;
        }
        return false;
    }
}
