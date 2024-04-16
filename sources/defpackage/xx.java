package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
/* compiled from: AsyncDrawable.java */
/* renamed from: xx  reason: default package */
/* loaded from: classes3.dex */
public class xx extends Drawable {
    private final String a;
    private final yx b;
    private final ov4 c;
    private final pv4 d;
    private final Drawable e;
    private Drawable f;
    private Drawable.Callback g;
    private int h;
    private float i;
    private boolean j;
    private boolean k = false;

    /* compiled from: AsyncDrawable.java */
    /* renamed from: xx$a */
    /* loaded from: classes3.dex */
    private class a implements Drawable.Callback {
        private final Drawable.Callback a;

        a(@NonNull Drawable.Callback callback) {
            this.a = callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            this.a.invalidateDrawable(xx.this);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
            this.a.scheduleDrawable(xx.this, runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            this.a.unscheduleDrawable(xx.this, runnable);
        }
    }

    public xx(@NonNull String str, @NonNull yx yxVar, @NonNull pv4 pv4Var, ov4 ov4Var) {
        this.a = str;
        this.b = yxVar;
        this.d = pv4Var;
        this.c = ov4Var;
        Drawable d = yxVar.d(this);
        this.e = d;
        if (d != null) {
            m(d);
        }
    }

    private void g() {
        if (this.h == 0) {
            this.j = true;
            setBounds(j(this.f));
            return;
        }
        this.j = false;
        Rect k = k();
        this.f.setBounds(k);
        this.f.setCallback(this.g);
        setBounds(k);
        invalidateSelf();
    }

    @NonNull
    private static Rect j(Drawable drawable) {
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            if (!bounds.isEmpty()) {
                return bounds;
            }
            Rect b = u83.b(drawable);
            if (!b.isEmpty()) {
                return b;
            }
        }
        return new Rect(0, 0, 1, 1);
    }

    @NonNull
    private Rect k() {
        return this.d.a(this);
    }

    @NonNull
    public String a() {
        return this.a;
    }

    public ov4 b() {
        return this.c;
    }

    public float c() {
        return this.i;
    }

    public int d() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (f()) {
            this.f.draw(canvas);
        }
    }

    public Drawable e() {
        return this.f;
    }

    public boolean f() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (f()) {
            return this.f.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (f()) {
            return this.f.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (f()) {
            return this.f.getOpacity();
        }
        return -2;
    }

    public void h(int i, float f) {
        this.h = i;
        this.i = f;
        if (this.j) {
            g();
        }
    }

    public boolean i() {
        if (getCallback() != null) {
            return true;
        }
        return false;
    }

    public void l(Drawable.Callback callback) {
        a aVar;
        boolean z;
        if (callback == null) {
            aVar = null;
        } else {
            aVar = new a(callback);
        }
        this.g = aVar;
        super.setCallback(callback);
        if (this.g != null) {
            Drawable drawable = this.f;
            if (drawable != null && drawable.getCallback() == null) {
                this.f.setCallback(this.g);
            }
            Drawable drawable2 = this.f;
            if (drawable2 != null && drawable2 != this.e) {
                z = false;
            } else {
                z = true;
            }
            if (drawable2 != null) {
                drawable2.setCallback(this.g);
                Drawable drawable3 = this.f;
                if ((drawable3 instanceof Animatable) && this.k) {
                    ((Animatable) drawable3).start();
                }
            }
            if (z) {
                this.b.b(this);
                return;
            }
            return;
        }
        Drawable drawable4 = this.f;
        if (drawable4 != null) {
            drawable4.setCallback(null);
            Drawable drawable5 = this.f;
            if (drawable5 instanceof Animatable) {
                Animatable animatable = (Animatable) drawable5;
                boolean isRunning = animatable.isRunning();
                this.k = isRunning;
                if (isRunning) {
                    animatable.stop();
                }
            }
        }
        this.b.a(this);
    }

    protected void m(@NonNull Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        Rect bounds = drawable.getBounds();
        if (bounds.isEmpty()) {
            Rect b = u83.b(drawable);
            if (b.isEmpty()) {
                drawable.setBounds(0, 0, 1, 1);
            } else {
                drawable.setBounds(b);
            }
            setBounds(drawable.getBounds());
            n(drawable);
            return;
        }
        this.f = drawable;
        drawable.setCallback(this.g);
        setBounds(bounds);
        this.j = false;
    }

    public void n(@NonNull Drawable drawable) {
        this.k = false;
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        g();
    }

    @NonNull
    public String toString() {
        return "AsyncDrawable{destination='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", imageSize=" + this.c + ", result=" + this.f + ", canvasWidth=" + this.h + ", textSize=" + this.i + ", waitingForDimensions=" + this.j + CoreConstants.CURLY_RIGHT;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
