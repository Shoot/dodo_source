package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import defpackage.a73;
import defpackage.lv4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
/* compiled from: Downsampler.java */
/* renamed from: g73  reason: default package */
/* loaded from: classes.dex */
public final class g73 {
    public static final mb7<qo2> f = mb7.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", qo2.c);
    public static final mb7<mi8> g = mb7.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    @Deprecated
    public static final mb7<a73> h = a73.h;
    public static final mb7<Boolean> i;
    public static final mb7<Boolean> j;
    private static final Set<String> k;
    private static final b l;
    private static final Set<ImageHeaderParser.ImageType> m;
    private static final Queue<BitmapFactory.Options> n;
    private final gc0 a;
    private final DisplayMetrics b;
    private final mr c;
    private final List<ImageHeaderParser> d;
    private final xm4 e = xm4.b();

    /* compiled from: Downsampler.java */
    /* renamed from: g73$b */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(gc0 gc0Var, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        i = mb7.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        j = mb7.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        l = new a();
        m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        n = vub.g(0);
    }

    public g73(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, gc0 gc0Var, mr mrVar) {
        this.d = list;
        this.b = (DisplayMetrics) eh8.d(displayMetrics);
        this.a = (gc0) eh8.d(gc0Var);
        this.c = (mr) eh8.d(mrVar);
    }

    private static int a(double d) {
        int l2 = l(d);
        int x = x(l2 * d);
        return x((d / (x / l2)) * x);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(defpackage.lv4 r7, defpackage.qo2 r8, boolean r9, boolean r10, android.graphics.BitmapFactory.Options r11, int r12, int r13) {
        /*
            r6 = this;
            xm4 r0 = r6.e
            r1 = r12
            r2 = r13
            r3 = r11
            r4 = r9
            r5 = r10
            boolean r9 = r0.g(r1, r2, r3, r4, r5)
            if (r9 == 0) goto Le
            return
        Le:
            qo2 r9 = defpackage.qo2.PREFER_ARGB_8888
            if (r8 == r9) goto L49
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = r7.d()     // Catch: java.io.IOException -> L1f
            boolean r7 = r7.hasAlpha()     // Catch: java.io.IOException -> L1f
            if (r7 == 0) goto L3d
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            goto L3f
        L1f:
            r7 = move-exception
            r9 = 3
            java.lang.String r10 = "Downsampler"
            boolean r9 = android.util.Log.isLoggable(r10, r9)
            if (r9 == 0) goto L3d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "Cannot determine whether the image has alpha or not from header, format "
            r9.append(r12)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.d(r10, r8, r7)
        L3d:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565
        L3f:
            r11.inPreferredConfig = r7
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.RGB_565
            if (r7 != r8) goto L48
            r7 = 1
            r11.inDither = r7
        L48:
            return
        L49:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            r11.inPreferredConfig = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g73.b(lv4, qo2, boolean, boolean, android.graphics.BitmapFactory$Options, int, int):void");
    }

    private static void c(ImageHeaderParser.ImageType imageType, lv4 lv4Var, b bVar, gc0 gc0Var, a73 a73Var, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) throws IOException {
        int i7;
        int i8;
        int min;
        int i9;
        int floor;
        double floor2;
        int i10;
        if (i3 > 0 && i4 > 0) {
            if (r(i2)) {
                i8 = i3;
                i7 = i4;
            } else {
                i7 = i3;
                i8 = i4;
            }
            float b2 = a73Var.b(i7, i8, i5, i6);
            if (b2 > 0.0f) {
                a73.g a2 = a73Var.a(i7, i8, i5, i6);
                if (a2 != null) {
                    float f2 = i7;
                    float f3 = i8;
                    int x = i7 / x(b2 * f2);
                    int x2 = i8 / x(b2 * f3);
                    a73.g gVar = a73.g.MEMORY;
                    if (a2 == gVar) {
                        min = Math.max(x, x2);
                    } else {
                        min = Math.min(x, x2);
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 > 23 || !k.contains(options.outMimeType)) {
                        int max = Math.max(1, Integer.highestOneBit(min));
                        if (a2 == gVar && max < 1.0f / b2) {
                            max <<= 1;
                        }
                        i9 = max;
                    } else {
                        i9 = 1;
                    }
                    options.inSampleSize = i9;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min2 = Math.min(i9, 8);
                        floor = (int) Math.ceil(f2 / min2);
                        i10 = (int) Math.ceil(f3 / min2);
                        int i12 = i9 / 8;
                        if (i12 > 0) {
                            floor /= i12;
                            i10 /= i12;
                        }
                    } else {
                        if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                            if (imageType.isWebp()) {
                                if (i11 >= 24) {
                                    float f4 = i9;
                                    floor = Math.round(f2 / f4);
                                    i10 = Math.round(f3 / f4);
                                } else {
                                    float f5 = i9;
                                    floor = (int) Math.floor(f2 / f5);
                                    floor2 = Math.floor(f3 / f5);
                                }
                            } else if (i7 % i9 == 0 && i8 % i9 == 0) {
                                floor = i7 / i9;
                                i10 = i8 / i9;
                            } else {
                                int[] m2 = m(lv4Var, options, bVar, gc0Var);
                                floor = m2[0];
                                i10 = m2[1];
                            }
                        } else {
                            float f6 = i9;
                            floor = (int) Math.floor(f2 / f6);
                            floor2 = Math.floor(f3 / f6);
                        }
                        i10 = (int) floor2;
                    }
                    double b3 = a73Var.b(floor, i10, i5, i6);
                    options.inTargetDensity = a(b3);
                    options.inDensity = l(b3);
                    if (s(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i3 + "x" + i4 + "], degreesToRotate: " + i2 + ", target: [" + i5 + "x" + i6 + "], power of two scaled: [" + floor + "x" + i10 + "], exact scale factor: " + b2 + ", power of 2 sample size: " + i9 + ", adjusted scale factor: " + b3 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + b2 + " from: " + a73Var + ", source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i5 + "x" + i6 + "]");
        }
    }

    private nj9<Bitmap> d(lv4 lv4Var, int i2, int i3, ac7 ac7Var, b bVar) throws IOException {
        boolean z;
        byte[] bArr = (byte[]) this.c.c(65536, byte[].class);
        BitmapFactory.Options k2 = k();
        k2.inTempStorage = bArr;
        qo2 qo2Var = (qo2) ac7Var.c(f);
        mi8 mi8Var = (mi8) ac7Var.c(g);
        a73 a73Var = (a73) ac7Var.c(a73.h);
        boolean booleanValue = ((Boolean) ac7Var.c(i)).booleanValue();
        mb7<Boolean> mb7Var = j;
        if (ac7Var.c(mb7Var) != null && ((Boolean) ac7Var.c(mb7Var)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        try {
            return ic0.e(h(lv4Var, k2, a73Var, qo2Var, mi8Var, z, i2, i3, booleanValue, bVar), this.a);
        } finally {
            v(k2);
            this.c.put(bArr);
        }
    }

    private Bitmap h(lv4 lv4Var, BitmapFactory.Options options, a73 a73Var, qo2 qo2Var, mi8 mi8Var, boolean z, int i2, int i3, boolean z2, b bVar) throws IOException {
        boolean z3;
        int i4;
        int i5;
        int i6;
        String str;
        int i7;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        float f2;
        int round;
        int i8;
        int i9;
        long b2 = hx5.b();
        int[] m2 = m(lv4Var, options, bVar, this.a);
        int i10 = m2[0];
        int i11 = m2[1];
        String str2 = options.outMimeType;
        if (i10 != -1 && i11 != -1) {
            z3 = z;
        } else {
            z3 = false;
        }
        int c = lv4Var.c();
        int i12 = xkb.i(c);
        boolean l2 = xkb.l(c);
        if (i2 == Integer.MIN_VALUE) {
            i4 = i3;
            if (r(i12)) {
                i5 = i11;
            } else {
                i5 = i10;
            }
        } else {
            i4 = i3;
            i5 = i2;
        }
        if (i4 == Integer.MIN_VALUE) {
            if (r(i12)) {
                i6 = i10;
            } else {
                i6 = i11;
            }
        } else {
            i6 = i4;
        }
        ImageHeaderParser.ImageType d = lv4Var.d();
        c(d, lv4Var, bVar, this.a, a73Var, i12, i10, i11, i5, i6, options);
        b(lv4Var, qo2Var, z3, l2, options, i5, i6);
        int i13 = Build.VERSION.SDK_INT;
        if (!z(d)) {
            str = "Downsampler";
        } else {
            if (i10 >= 0 && i11 >= 0 && z2) {
                str = "Downsampler";
                i9 = i5;
                round = i6;
            } else {
                if (s(options)) {
                    f2 = options.inTargetDensity / options.inDensity;
                } else {
                    f2 = 1.0f;
                }
                int i14 = options.inSampleSize;
                float f3 = i14;
                int round2 = Math.round(((int) Math.ceil(i10 / f3)) * f2);
                round = Math.round(((int) Math.ceil(i11 / f3)) * f2);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(round2);
                    sb.append("x");
                    sb.append(round);
                    i8 = round2;
                    sb.append("] for source [");
                    sb.append(i10);
                    sb.append("x");
                    sb.append(i11);
                    sb.append("], sampleSize: ");
                    sb.append(i14);
                    sb.append(", targetDensity: ");
                    sb.append(options.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f2);
                    Log.v(str, sb.toString());
                } else {
                    i8 = round2;
                }
                i9 = i8;
            }
            if (i9 > 0 && round > 0) {
                y(options, this.a, i9, round);
            }
        }
        if (mi8Var != null) {
            if (i13 >= 28) {
                if (mi8Var == mi8.DISPLAY_P3) {
                    colorSpace3 = options.outColorSpace;
                    if (colorSpace3 != null) {
                        colorSpace4 = options.outColorSpace;
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            named2 = ColorSpace.Named.DISPLAY_P3;
                            colorSpace2 = ColorSpace.get(named2);
                            options.inPreferredColorSpace = colorSpace2;
                        }
                    }
                }
                named2 = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named2);
                options.inPreferredColorSpace = colorSpace2;
            } else if (i13 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                options.inPreferredColorSpace = colorSpace;
            }
        }
        Bitmap i15 = i(lv4Var, options, bVar, this.a);
        bVar.b(this.a, i15);
        if (Log.isLoggable(str, 2)) {
            i7 = c;
            t(i10, i11, str2, options, i15, i2, i3, b2);
        } else {
            i7 = c;
        }
        if (i15 != null) {
            i15.setDensity(this.b.densityDpi);
            Bitmap m3 = xkb.m(this.a, i15, i7);
            if (!i15.equals(m3)) {
                this.a.c(i15);
                return m3;
            }
            return m3;
        }
        return null;
    }

    private static Bitmap i(lv4 lv4Var, BitmapFactory.Options options, b bVar, gc0 gc0Var) throws IOException {
        if (!options.inJustDecodeBounds) {
            bVar.a();
            lv4Var.b();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        xkb.h().lock();
        try {
            try {
                Bitmap a2 = lv4Var.a(options);
                xkb.h().unlock();
                return a2;
            } catch (IllegalArgumentException e) {
                IOException u = u(e, i2, i3, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", u);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        gc0Var.c(bitmap);
                        options.inBitmap = null;
                        Bitmap i4 = i(lv4Var, options, bVar, gc0Var);
                        xkb.h().unlock();
                        return i4;
                    } catch (IOException unused) {
                        throw u;
                    }
                }
                throw u;
            }
        } catch (Throwable th) {
            xkb.h().unlock();
            throw th;
        }
    }

    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (g73.class) {
            Queue<BitmapFactory.Options> queue = n;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    private static int l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    private static int[] m(lv4 lv4Var, BitmapFactory.Options options, b bVar, gc0 gc0Var) throws IOException {
        options.inJustDecodeBounds = true;
        i(lv4Var, options, bVar, gc0Var);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i2) {
        if (i2 != 90 && i2 != 270) {
            return false;
        }
        return true;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        if (i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2) {
            return true;
        }
        return false;
    }

    private static void t(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i2 + "x" + i3 + "] " + str + " with inBitmap " + n(options) + " for [" + i4 + "x" + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + hx5.a(j2));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, gc0 gc0Var, int i2, int i3) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.inPreferredConfig;
            config2 = Bitmap.Config.HARDWARE;
            if (config3 != config2) {
                config = options.outConfig;
            } else {
                return;
            }
        } else {
            config = null;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = gc0Var.e(i2, i3, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public nj9<Bitmap> e(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, ac7 ac7Var) throws IOException {
        return d(new lv4.c(parcelFileDescriptor, this.d, this.c), i2, i3, ac7Var, l);
    }

    public nj9<Bitmap> f(InputStream inputStream, int i2, int i3, ac7 ac7Var, b bVar) throws IOException {
        return d(new lv4.b(inputStream, this.d, this.c), i2, i3, ac7Var, bVar);
    }

    public nj9<Bitmap> g(ByteBuffer byteBuffer, int i2, int i3, ac7 ac7Var) throws IOException {
        return d(new lv4.a(byteBuffer, this.d, this.c), i2, i3, ac7Var, l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    /* compiled from: Downsampler.java */
    /* renamed from: g73$a */
    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // defpackage.g73.b
        public void a() {
        }

        @Override // defpackage.g73.b
        public void b(gc0 gc0Var, Bitmap bitmap) {
        }
    }
}
