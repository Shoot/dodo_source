package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: ImageReader.java */
/* renamed from: lv4  reason: default package */
/* loaded from: classes.dex */
interface lv4 {

    /* compiled from: ImageReader.java */
    /* renamed from: lv4$b */
    /* loaded from: classes.dex */
    public static final class b implements lv4 {
        private final com.bumptech.glide.load.data.c a;
        private final mr b;
        private final List<ImageHeaderParser> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(InputStream inputStream, List<ImageHeaderParser> list, mr mrVar) {
            this.b = (mr) eh8.d(mrVar);
            this.c = (List) eh8.d(list);
            this.a = new com.bumptech.glide.load.data.c(inputStream, mrVar);
        }

        @Override // defpackage.lv4
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.a.a(), null, options);
        }

        @Override // defpackage.lv4
        public void b() {
            this.a.c();
        }

        @Override // defpackage.lv4
        public int c() throws IOException {
            return com.bumptech.glide.load.a.b(this.c, this.a.a(), this.b);
        }

        @Override // defpackage.lv4
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.f(this.c, this.a.a(), this.b);
        }
    }

    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;

    /* compiled from: ImageReader.java */
    /* renamed from: lv4$a */
    /* loaded from: classes.dex */
    public static final class a implements lv4 {
        private final ByteBuffer a;
        private final List<ImageHeaderParser> b;
        private final mr c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, mr mrVar) {
            this.a = byteBuffer;
            this.b = list;
            this.c = mrVar;
        }

        private InputStream e() {
            return ck0.g(ck0.d(this.a));
        }

        @Override // defpackage.lv4
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // defpackage.lv4
        public int c() throws IOException {
            return com.bumptech.glide.load.a.c(this.b, ck0.d(this.a), this.c);
        }

        @Override // defpackage.lv4
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.g(this.b, ck0.d(this.a));
        }

        @Override // defpackage.lv4
        public void b() {
        }
    }

    /* compiled from: ImageReader.java */
    /* renamed from: lv4$c */
    /* loaded from: classes.dex */
    public static final class c implements lv4 {
        private final mr a;
        private final List<ImageHeaderParser> b;
        private final ParcelFileDescriptorRewinder c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, mr mrVar) {
            this.a = (mr) eh8.d(mrVar);
            this.b = (List) eh8.d(list);
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // defpackage.lv4
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
        }

        @Override // defpackage.lv4
        public int c() throws IOException {
            return com.bumptech.glide.load.a.a(this.b, this.c, this.a);
        }

        @Override // defpackage.lv4
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.e(this.b, this.c, this.a);
        }

        @Override // defpackage.lv4
        public void b() {
        }
    }
}
