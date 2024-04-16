package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import com.bumptech.glide.b;
import defpackage.qf4;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: GifDrawable.java */
/* renamed from: kf4  reason: default package */
/* loaded from: classes.dex */
public class kf4 extends Drawable implements qf4.b, Animatable {
    private final a a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private Paint i;
    private Rect j;
    private List<nj> k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifDrawable.java */
    /* renamed from: kf4$a */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {
        final qf4 a;

        a(qf4 qf4Var) {
            this.a = qf4Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new kf4(this);
        }
    }

    public kf4(Context context, jf4 jf4Var, tkb<Bitmap> tkbVar, int i, int i2, Bitmap bitmap) {
        this(new a(new qf4(b.c(context), jf4Var, i, i2, tkbVar, bitmap)));
    }

    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    private Paint h() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    private void j() {
        List<nj> list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.k.get(i).a(this);
            }
        }
    }

    private void l() {
        this.f = 0;
    }

    private void n() {
        eh8.a(!this.d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.a.f() == 1) {
            invalidateSelf();
        } else if (!this.b) {
            this.b = true;
            this.a.a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.b = false;
        this.a.a.s(this);
    }

    @Override // defpackage.qf4.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f++;
        }
        int i = this.g;
        if (i != -1 && this.f >= i) {
            j();
            stop();
        }
    }

    public ByteBuffer c() {
        return this.a.a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.h = false;
        }
        canvas.drawBitmap(this.a.a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.a.a.e();
    }

    public int f() {
        return this.a.a.f();
    }

    public int g() {
        return this.a.a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.a.a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b;
    }

    public void k() {
        this.d = true;
        this.a.a.a();
    }

    public void m(tkb<Bitmap> tkbVar, Bitmap bitmap) {
        this.a.a.o(tkbVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        h().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        eh8.a(!this.d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.e = z;
        if (!z) {
            o();
        } else if (this.c) {
            n();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.c = true;
        l();
        if (this.e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.c = false;
        o();
    }

    kf4(a aVar) {
        this.e = true;
        this.g = -1;
        this.a = (a) eh8.d(aVar);
    }
}
