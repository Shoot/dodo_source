package defpackage;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.mb7;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: VideoDecoder.java */
/* renamed from: lyb  reason: default package */
/* loaded from: classes.dex */
public class lyb<T> implements rj9<T, Bitmap> {
    public static final mb7<Long> d = mb7.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final mb7<Integer> e = mb7.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    private static final f f = new f();
    private static final List<String> g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    private final e<T> a;
    private final gc0 b;
    private final f c;

    /* compiled from: VideoDecoder.java */
    /* renamed from: lyb$a */
    /* loaded from: classes.dex */
    class a implements mb7.b<Long> {
        private final ByteBuffer a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // defpackage.mb7.b
        /* renamed from: b */
        public void a(@NonNull byte[] bArr, @NonNull Long l, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: lyb$b */
    /* loaded from: classes.dex */
    class b implements mb7.b<Integer> {
        private final ByteBuffer a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // defpackage.mb7.b
        /* renamed from: b */
        public void a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num.intValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: lyb$c */
    /* loaded from: classes.dex */
    private static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // defpackage.lyb.e
        /* renamed from: c */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // defpackage.lyb.e
        /* renamed from: d */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoDecoder.java */
    /* renamed from: lyb$e */
    /* loaded from: classes.dex */
    public interface e<T> {
        void a(MediaExtractor mediaExtractor, T t) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: lyb$f */
    /* loaded from: classes.dex */
    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: lyb$g */
    /* loaded from: classes.dex */
    static final class g implements e<ParcelFileDescriptor> {
        g() {
        }

        @Override // defpackage.lyb.e
        /* renamed from: c */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // defpackage.lyb.e
        /* renamed from: d */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoDecoder.java */
    /* renamed from: lyb$h */
    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    lyb(gc0 gc0Var, e<T> eVar) {
        this(gc0Var, eVar, f);
    }

    public static rj9<AssetFileDescriptor, Bitmap> c(gc0 gc0Var) {
        return new lyb(gc0Var, new c(null));
    }

    public static rj9<ByteBuffer, Bitmap> d(gc0 gc0Var) {
        return new lyb(gc0Var, new d());
    }

    @TargetApi(30)
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!j()) {
            return bitmap;
        }
        try {
            if (i(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        return bitmap;
    }

    private Bitmap f(@NonNull T t, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, a73 a73Var) {
        Bitmap bitmap;
        if (!l(t, mediaMetadataRetriever)) {
            if (Build.VERSION.SDK_INT >= 27 && i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && a73Var != a73.f) {
                bitmap = h(mediaMetadataRetriever, j, i, i2, i3, a73Var);
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                bitmap = g(mediaMetadataRetriever, j, i);
            }
            Bitmap e2 = e(mediaMetadataRetriever, bitmap);
            if (e2 != null) {
                return e2;
            }
            throw new h();
        }
        throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, a73 a73Var) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b2 = a73Var.b(parseInt, parseInt2, i2, i3);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * b2), Math.round(b2 * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable th) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
                return null;
            }
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        int parseInt2 = Integer.parseInt(extractMetadata2);
        if ((parseInt == 7 || parseInt == 6) && parseInt2 == 6) {
            return true;
        }
        return false;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            return true;
        }
        return false;
    }

    private static boolean k() {
        for (String str : g) {
            if (Build.ID.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean l(@NonNull T t, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.a.a(mediaExtractor2, t);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i).getString("mime"))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable th2) {
            th = th2;
            mediaExtractor = mediaExtractor2;
            try {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    public static rj9<ParcelFileDescriptor, Bitmap> m(gc0 gc0Var) {
        return new lyb(gc0Var, new g());
    }

    @Override // defpackage.rj9
    public boolean a(@NonNull T t, @NonNull ac7 ac7Var) {
        return true;
    }

    @Override // defpackage.rj9
    public nj9<Bitmap> b(@NonNull T t, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        long longValue = ((Long) ac7Var.c(d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) ac7Var.c(e);
        if (num == null) {
            num = 2;
        }
        a73 a73Var = (a73) ac7Var.c(a73.h);
        if (a73Var == null) {
            a73Var = a73.g;
        }
        a73 a73Var2 = a73Var;
        MediaMetadataRetriever a2 = this.c.a();
        try {
            this.a.b(a2, t);
            return ic0.e(f(t, a2, longValue, num.intValue(), i, i2, a73Var2), this.b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                a2.release();
            } else {
                a2.release();
            }
        }
    }

    lyb(gc0 gc0Var, e<T> eVar, f fVar) {
        this.b = gc0Var;
        this.a = eVar;
        this.c = fVar;
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: lyb$d */
    /* loaded from: classes.dex */
    static final class d implements e<ByteBuffer> {
        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // defpackage.lyb.e
        /* renamed from: d */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // defpackage.lyb.e
        /* renamed from: e */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VideoDecoder.java */
        /* renamed from: lyb$d$a */
        /* loaded from: classes.dex */
        public class a extends MediaDataSource {
            final /* synthetic */ ByteBuffer a;

            a(ByteBuffer byteBuffer) {
                this.a = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.a.limit()) {
                    return -1;
                }
                this.a.position((int) j);
                int min = Math.min(i2, this.a.remaining());
                this.a.get(bArr, i, min);
                return min;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }
}
