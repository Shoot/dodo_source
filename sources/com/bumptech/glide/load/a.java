package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0098a implements h {
        final /* synthetic */ InputStream a;

        C0098a(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.a);
            } finally {
                this.a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes.dex */
    class b implements h {
        final /* synthetic */ ByteBuffer a;

        b(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.a);
            } finally {
                ck0.d(this.a);
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes.dex */
    class c implements h {
        final /* synthetic */ ParcelFileDescriptorRewinder a;
        final /* synthetic */ mr b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, mr mrVar) {
            this.a = parcelFileDescriptorRewinder;
            this.b = mrVar;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            u99 u99Var = null;
            try {
                u99 u99Var2 = new u99(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
                try {
                    ImageHeaderParser.ImageType c = imageHeaderParser.c(u99Var2);
                    u99Var2.c();
                    this.a.a();
                    return c;
                } catch (Throwable th) {
                    th = th;
                    u99Var = u99Var2;
                    if (u99Var != null) {
                        u99Var.c();
                    }
                    this.a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes.dex */
    class d implements g {
        final /* synthetic */ ByteBuffer a;
        final /* synthetic */ mr b;

        d(ByteBuffer byteBuffer, mr mrVar) {
            this.a = byteBuffer;
            this.b = mrVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.a, this.b);
            } finally {
                ck0.d(this.a);
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes.dex */
    class e implements g {
        final /* synthetic */ InputStream a;
        final /* synthetic */ mr b;

        e(InputStream inputStream, mr mrVar) {
            this.a = inputStream;
            this.b = mrVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.a, this.b);
            } finally {
                this.a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes.dex */
    class f implements g {
        final /* synthetic */ ParcelFileDescriptorRewinder a;
        final /* synthetic */ mr b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, mr mrVar) {
            this.a = parcelFileDescriptorRewinder;
            this.b = mrVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            u99 u99Var = null;
            try {
                u99 u99Var2 = new u99(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
                try {
                    int a = imageHeaderParser.a(u99Var2, this.b);
                    u99Var2.c();
                    this.a.a();
                    return a;
                } catch (Throwable th) {
                    th = th;
                    u99Var = u99Var2;
                    if (u99Var != null) {
                        u99Var.c();
                    }
                    this.a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes.dex */
    public interface g {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes.dex */
    public interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static int a(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull mr mrVar) throws IOException {
        return d(list, new f(parcelFileDescriptorRewinder, mrVar));
    }

    public static int b(@NonNull List<ImageHeaderParser> list, InputStream inputStream, @NonNull mr mrVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new u99(inputStream, mrVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, mrVar));
    }

    public static int c(@NonNull List<ImageHeaderParser> list, ByteBuffer byteBuffer, @NonNull mr mrVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, mrVar));
    }

    private static int d(@NonNull List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = gVar.a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    @NonNull
    public static ImageHeaderParser.ImageType e(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull mr mrVar) throws IOException {
        return h(list, new c(parcelFileDescriptorRewinder, mrVar));
    }

    @NonNull
    public static ImageHeaderParser.ImageType f(@NonNull List<ImageHeaderParser> list, InputStream inputStream, @NonNull mr mrVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new u99(inputStream, mrVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0098a(inputStream));
    }

    @NonNull
    public static ImageHeaderParser.ImageType g(@NonNull List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return h(list, new b(byteBuffer));
    }

    @NonNull
    private static ImageHeaderParser.ImageType h(@NonNull List<ImageHeaderParser> list, h hVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = hVar.a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
