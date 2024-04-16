package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: LruBitmapPool.java */
/* renamed from: f36  reason: default package */
/* loaded from: classes.dex */
public class f36 implements gc0 {
    private static final Bitmap.Config k = Bitmap.Config.ARGB_8888;
    private final k36 a;
    private final Set<Bitmap.Config> b;
    private final long c;
    private final a d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LruBitmapPool.java */
    /* renamed from: f36$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    f36(long j, k36 k36Var, Set<Bitmap.Config> set) {
        this.c = j;
        this.e = j;
        this.a = k36Var;
        this.b = set;
        this.d = new b();
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config != config2) {
                return;
            }
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    private static Bitmap g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.j + ", currentSize=" + this.f + ", maxSize=" + this.e + "\nStrategy=" + this.a);
    }

    private void j() {
        q(this.e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> k() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static k36 l() {
        return new dna();
    }

    private synchronized Bitmap m(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap d;
        try {
            f(config);
            k36 k36Var = this.a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = k;
            }
            d = k36Var.d(i, i2, config2);
            if (d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.a.e(i, i2, config));
                }
                this.h++;
            } else {
                this.g++;
                this.f -= this.a.f(d);
                this.d.a(d);
                p(d);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.a.e(i, i2, config));
            }
            h();
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    @TargetApi(19)
    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j) {
        while (this.f > j) {
            try {
                Bitmap b2 = this.a.b();
                if (b2 == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f = 0L;
                    return;
                }
                this.d.a(b2);
                this.f -= this.a.f(b2);
                this.j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.a.a(b2));
                }
                h();
                b2.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gc0
    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i < 40 && (Build.VERSION.SDK_INT < 23 || i < 20)) {
            if (i >= 20 || i == 15) {
                q(n() / 2);
                return;
            }
            return;
        }
        b();
    }

    @Override // defpackage.gc0
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // defpackage.gc0
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.a.f(bitmap) <= this.e && this.b.contains(bitmap.getConfig())) {
                        int f = this.a.f(bitmap);
                        this.a.c(bitmap);
                        this.d.b(bitmap);
                        this.i++;
                        this.f += f;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.a.a(bitmap));
                        }
                        h();
                        j();
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gc0
    @NonNull
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap m = m(i, i2, config);
        if (m != null) {
            m.eraseColor(0);
            return m;
        }
        return g(i, i2, config);
    }

    @Override // defpackage.gc0
    @NonNull
    public Bitmap e(int i, int i2, Bitmap.Config config) {
        Bitmap m = m(i, i2, config);
        if (m == null) {
            return g(i, i2, config);
        }
        return m;
    }

    public long n() {
        return this.e;
    }

    public f36(long j) {
        this(j, l(), k());
    }

    /* compiled from: LruBitmapPool.java */
    /* renamed from: f36$b */
    /* loaded from: classes.dex */
    private static final class b implements a {
        b() {
        }

        @Override // defpackage.f36.a
        public void a(Bitmap bitmap) {
        }

        @Override // defpackage.f36.a
        public void b(Bitmap bitmap) {
        }
    }
}
