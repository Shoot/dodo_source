package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: TransformationUtils.java */
/* renamed from: xkb  reason: default package */
/* loaded from: classes.dex */
public final class xkb {
    private static final Paint a = new Paint(6);
    private static final Paint b = new Paint(7);
    private static final Paint c;
    private static final Set<String> d;
    private static final Lock e;

    /* compiled from: TransformationUtils.java */
    /* renamed from: xkb$a */
    /* loaded from: classes.dex */
    class a implements c {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // defpackage.xkb.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.a;
            canvas.drawRoundRect(rectF, i, i, paint);
        }
    }

    /* compiled from: TransformationUtils.java */
    /* renamed from: xkb$b */
    /* loaded from: classes.dex */
    class b implements c {
        final /* synthetic */ float a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;

        b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        @Override // defpackage.xkb.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f = this.a;
            float f2 = this.b;
            float f3 = this.c;
            float f4 = this.d;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransformationUtils.java */
    /* renamed from: xkb$c */
    /* loaded from: classes.dex */
    public interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* compiled from: TransformationUtils.java */
    /* renamed from: xkb$d */
    /* loaded from: classes.dex */
    private static final class d implements Lock {
        d() {
        }

        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        Lock dVar;
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        d = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            dVar = new ReentrantLock();
        } else {
            dVar = new d();
        }
        e = dVar;
        Paint paint = new Paint(7);
        c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        Lock lock = e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, a);
            d(canvas);
            lock.unlock();
        } catch (Throwable th) {
            e.unlock();
            throw th;
        }
    }

    public static Bitmap b(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        Bitmap d2 = gc0Var.d(i, i2, j(bitmap));
        q(bitmap, d2);
        a(bitmap, d2, matrix);
        return d2;
    }

    public static Bitmap c(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return e(gc0Var, bitmap, i, i2);
    }

    private static void d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap e(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap d2 = gc0Var.d((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), j(bitmap));
        q(bitmap, d2);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + d2.getWidth() + "x" + d2.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, d2, matrix);
        return d2;
    }

    private static Bitmap f(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap) {
        Bitmap.Config g = g(bitmap);
        if (g.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d2 = gc0Var.d(bitmap.getWidth(), bitmap.getHeight(), g);
        new Canvas(d2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d2;
    }

    @NonNull
    private static Bitmap.Config g(@NonNull Bitmap bitmap) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config = Bitmap.Config.RGBA_F16;
            if (config.equals(bitmap.getConfig())) {
                config2 = Bitmap.Config.RGBA_F16;
                return config2;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Lock h() {
        return e;
    }

    public static int i(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @NonNull
    private static Bitmap.Config j(@NonNull Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    static void k(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static boolean l(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap m(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, int i) {
        if (!l(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        k(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d2 = gc0Var.d(Math.round(rectF.width()), Math.round(rectF.height()), j(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d2.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, d2, matrix);
        return d2;
    }

    public static Bitmap n(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, float f, float f2, float f3, float f4) {
        return p(gc0Var, bitmap, new b(f, f2, f3, f4));
    }

    public static Bitmap o(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        eh8.a(z, "roundingRadius must be greater than 0.");
        return p(gc0Var, bitmap, new a(i));
    }

    private static Bitmap p(@NonNull gc0 gc0Var, @NonNull Bitmap bitmap, c cVar) {
        Bitmap.Config g = g(bitmap);
        Bitmap f = f(gc0Var, bitmap);
        Bitmap d2 = gc0Var.d(f.getWidth(), f.getHeight(), g);
        d2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(f, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, d2.getWidth(), d2.getHeight());
        Lock lock = e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            d(canvas);
            lock.unlock();
            if (!f.equals(bitmap)) {
                gc0Var.c(f);
            }
            return d2;
        } catch (Throwable th) {
            e.unlock();
            throw th;
        }
    }

    public static void q(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
