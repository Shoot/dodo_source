package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: AnimatedImageDecoder.java */
/* renamed from: nk  reason: default package */
/* loaded from: classes.dex */
public final class nk {
    private final List<ImageHeaderParser> a;
    private final mr b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedImageDecoder.java */
    /* renamed from: nk$a */
    /* loaded from: classes.dex */
    public static final class a implements nj9<Drawable> {
        private final AnimatedImageDrawable a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.a = animatedImageDrawable;
        }

        @Override // defpackage.nj9
        public int a() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.a.getIntrinsicWidth();
            intrinsicHeight = this.a.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * vub.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // defpackage.nj9
        public void b() {
            this.a.stop();
            this.a.clearAnimationCallbacks();
        }

        @Override // defpackage.nj9
        @NonNull
        public Class<Drawable> c() {
            return Drawable.class;
        }

        @Override // defpackage.nj9
        @NonNull
        /* renamed from: d */
        public AnimatedImageDrawable get() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedImageDecoder.java */
    /* renamed from: nk$b */
    /* loaded from: classes.dex */
    public static final class b implements rj9<ByteBuffer, Drawable> {
        private final nk a;

        b(nk nkVar) {
            this.a = nkVar;
        }

        @Override // defpackage.rj9
        /* renamed from: c */
        public nj9<Drawable> b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.a.b(createSource, i, i2, ac7Var);
        }

        @Override // defpackage.rj9
        /* renamed from: d */
        public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull ac7 ac7Var) throws IOException {
            return this.a.d(byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedImageDecoder.java */
    /* renamed from: nk$c */
    /* loaded from: classes.dex */
    public static final class c implements rj9<InputStream, Drawable> {
        private final nk a;

        c(nk nkVar) {
            this.a = nkVar;
        }

        @Override // defpackage.rj9
        /* renamed from: c */
        public nj9<Drawable> b(@NonNull InputStream inputStream, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(ck0.b(inputStream));
            return this.a.b(createSource, i, i2, ac7Var);
        }

        @Override // defpackage.rj9
        /* renamed from: d */
        public boolean a(@NonNull InputStream inputStream, @NonNull ac7 ac7Var) throws IOException {
            return this.a.c(inputStream);
        }
    }

    private nk(List<ImageHeaderParser> list, mr mrVar) {
        this.a = list;
        this.b = mrVar;
    }

    public static rj9<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, mr mrVar) {
        return new b(new nk(list, mrVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || imageType != ImageHeaderParser.ImageType.ANIMATED_AVIF)) {
            return false;
        }
        return true;
    }

    public static rj9<InputStream, Drawable> f(List<ImageHeaderParser> list, mr mrVar) {
        return new c(new nk(list, mrVar));
    }

    nj9<Drawable> b(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new dr2(i, i2, ac7Var));
        if (hk.a(decodeDrawable)) {
            return new a(ik.a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.a.f(this.a, inputStream, this.b));
    }

    boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.a.g(this.a, byteBuffer));
    }
}
