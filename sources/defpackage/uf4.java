package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import pl.droidsonroids.gif.GifDrawable;
/* compiled from: GifMediaDecoder.java */
/* renamed from: uf4  reason: default package */
/* loaded from: classes3.dex */
public class uf4 extends kc6 {
    private final boolean a;

    protected uf4(boolean z) {
        this.a = z;
        g();
    }

    @NonNull
    public static uf4 c() {
        return d(true);
    }

    @NonNull
    public static uf4 d(boolean z) {
        return new uf4(z);
    }

    @NonNull
    protected static byte[] f(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static void g() {
        if (wf4.a()) {
            return;
        }
        throw new IllegalStateException(wf4.b());
    }

    @Override // defpackage.kc6
    @NonNull
    public Drawable a(String str, @NonNull InputStream inputStream) {
        try {
            try {
                GifDrawable e = e(f(inputStream));
                if (!this.a) {
                    e.pause();
                }
                return e;
            } catch (IOException e2) {
                throw new IllegalStateException("Exception creating GifDrawable", e2);
            }
        } catch (IOException e3) {
            throw new IllegalStateException("Cannot read GIF input-stream", e3);
        }
    }

    @Override // defpackage.kc6
    @NonNull
    public Collection<String> b() {
        return Collections.singleton("image/gif");
    }

    @NonNull
    protected GifDrawable e(@NonNull byte[] bArr) throws IOException {
        return new GifDrawable(bArr);
    }
}
