package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
/* compiled from: GifDecoder.java */
/* renamed from: jf4  reason: default package */
/* loaded from: classes.dex */
public interface jf4 {

    /* compiled from: GifDecoder.java */
    /* renamed from: jf4$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(@NonNull Bitmap bitmap);

        @NonNull
        byte[] b(int i);

        @NonNull
        Bitmap c(int i, int i2, @NonNull Bitmap.Config config);

        @NonNull
        int[] d(int i);

        void e(@NonNull byte[] bArr);

        void f(@NonNull int[] iArr);
    }

    Bitmap a();

    void b();

    int c();

    void clear();

    void d(@NonNull Bitmap.Config config);

    int e();

    void f();

    int g();

    @NonNull
    ByteBuffer getData();

    int h();
}
