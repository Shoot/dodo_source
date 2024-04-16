package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: BitmapPool.java */
/* renamed from: fc0  reason: default package */
/* loaded from: classes3.dex */
public class fc0 {
    private static final fc0 c = new fc0();
    private final LinkedList<Bitmap> a = new LinkedList<>();
    private final ExecutorService b = Executors.newFixedThreadPool(1, new cq1(1, getClass().getName()));

    /* compiled from: BitmapPool.java */
    /* renamed from: fc0$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        final /* synthetic */ Drawable a;

        a(Drawable drawable) {
            this.a = drawable;
        }

        @Override // java.lang.Runnable
        public void run() {
            fc0.this.g(this.a);
        }
    }

    private fc0() {
    }

    public static fc0 d() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Drawable drawable) {
        if (drawable != null && (drawable instanceof bm9)) {
            f((bm9) drawable);
        }
    }

    public void b(BitmapFactory.Options options, int i, int i2) {
        options.inBitmap = e(i, i2);
        options.inSampleSize = 1;
        options.inMutable = true;
    }

    public void c(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        this.b.execute(new a(drawable));
    }

    public Bitmap e(int i, int i2) {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
                Iterator<Bitmap> it = this.a.iterator();
                while (it.hasNext()) {
                    Bitmap next = it.next();
                    if (next.isRecycled()) {
                        this.a.remove(next);
                        return e(i, i2);
                    } else if (next.getWidth() == i && next.getHeight() == i2) {
                        this.a.remove(next);
                        return next;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(bm9 bm9Var) {
        Bitmap f = bm9Var.f();
        if (f != null && !f.isRecycled() && f.isMutable() && f.getConfig() != null) {
            synchronized (this.a) {
                this.a.addLast(f);
            }
        } else if (f != null) {
            Log.d("OsmDroid", "Rejected bitmap from being added to BitmapPool.");
        }
    }
}
