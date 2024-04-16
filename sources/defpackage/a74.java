package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import defpackage.h74;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: FrameAnimationDrawable.java */
/* renamed from: a74  reason: default package */
/* loaded from: classes2.dex */
public abstract class a74<Decoder extends h74<?, ?>> extends Drawable implements Animatable, h74.j {
    private static final String l = "a74";
    private final Paint a;
    private final Decoder b;
    private final DrawFilter c;
    private final Matrix d;
    private final Set<nj> e;
    private Bitmap f;
    private final Handler g;
    private final Runnable h;
    private boolean i;
    private final Set<WeakReference<Drawable.Callback>> j;
    private boolean k;

    /* compiled from: FrameAnimationDrawable.java */
    /* renamed from: a74$a */
    /* loaded from: classes2.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    Iterator it = new ArrayList(a74.this.e).iterator();
                    while (it.hasNext()) {
                        ((nj) it.next()).a(a74.this);
                    }
                    return;
                }
                return;
            }
            Iterator it2 = new ArrayList(a74.this.e).iterator();
            while (it2.hasNext()) {
                ((nj) it2.next()).b(a74.this);
            }
        }
    }

    /* compiled from: FrameAnimationDrawable.java */
    /* renamed from: a74$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a74.this.invalidateSelf();
        }
    }

    public a74(Decoder decoder) {
        Paint paint = new Paint();
        this.a = paint;
        this.c = new PaintFlagsDrawFilter(0, 3);
        this.d = new Matrix();
        this.e = new HashSet();
        this.g = new a(Looper.getMainLooper());
        this.h = new b();
        this.i = true;
        this.j = new HashSet();
        this.k = false;
        paint.setAntiAlias(true);
        this.b = decoder;
    }

    private void e() {
        ArrayList<WeakReference> arrayList = new ArrayList();
        Drawable.Callback callback = getCallback();
        boolean z = false;
        for (WeakReference weakReference : new HashSet(this.j)) {
            Drawable.Callback callback2 = (Drawable.Callback) weakReference.get();
            if (callback2 == null) {
                arrayList.add(weakReference);
            } else if (callback2 == callback) {
                z = true;
            } else {
                callback2.invalidateDrawable(this);
            }
        }
        for (WeakReference weakReference2 : arrayList) {
            this.j.remove(weakReference2);
        }
        if (!z) {
            this.j.add(new WeakReference<>(callback));
        }
    }

    private void f() {
        this.b.o(this);
        if (this.i) {
            this.b.O();
        } else if (!this.b.F()) {
            this.b.O();
        }
    }

    private void g() {
        this.b.K(this);
        if (this.i) {
            this.b.Q();
        } else {
            this.b.R();
        }
    }

    @Override // defpackage.h74.j
    public void a(ByteBuffer byteBuffer) {
        if (!isRunning()) {
            return;
        }
        Bitmap bitmap = this.f;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f = Bitmap.createBitmap(this.b.r().width() / this.b.A(), this.b.r().height() / this.b.A(), Bitmap.Config.ARGB_8888);
        }
        byteBuffer.rewind();
        if (byteBuffer.remaining() < this.f.getByteCount()) {
            Log.e(l, "onRender:Buffer not large enough for pixels");
            return;
        }
        this.f.copyPixelsFromBuffer(byteBuffer);
        this.g.post(this.h);
    }

    @Override // defpackage.h74.j
    public void b() {
        Message.obtain(this.g, 2).sendToTarget();
    }

    public int d() {
        int x = this.b.x();
        Bitmap bitmap = this.f;
        if (bitmap != null && !bitmap.isRecycled()) {
            x += this.f.getAllocationByteCount();
        }
        return Math.max(1, x);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.setDrawFilter(this.c);
            canvas.drawBitmap(this.f, this.d, this.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return super.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.k) {
            return -1;
        }
        try {
            return this.b.r().height();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.k) {
            return -1;
        }
        try {
            return this.b.r().width();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(boolean z) {
        this.i = z;
    }

    public void i(boolean z) {
        this.k = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        for (WeakReference weakReference : new HashSet(this.j)) {
            Drawable.Callback callback = (Drawable.Callback) weakReference.get();
            if (callback != null && callback != getCallback()) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b.F();
    }

    @Override // defpackage.h74.j
    public void onStart() {
        Message.obtain(this.g, 1).sendToTarget();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        boolean N = this.b.N(getBounds().width(), getBounds().height());
        this.d.setScale(((getBounds().width() * 1.0f) * this.b.A()) / this.b.r().width(), ((getBounds().height() * 1.0f) * this.b.A()) / this.b.r().height());
        if (N) {
            this.f = Bitmap.createBitmap(this.b.r().width() / this.b.A(), this.b.r().height() / this.b.A(), Bitmap.Config.ARGB_8888);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        e();
        if (this.i) {
            if (z) {
                if (!isRunning()) {
                    f();
                }
            } else if (isRunning()) {
                g();
            }
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.b.F()) {
            this.b.Q();
        }
        this.b.M();
        f();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        g();
    }
}
