package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
/* compiled from: CircleImageView.java */
/* renamed from: y71  reason: default package */
/* loaded from: classes.dex */
public class y71 extends AppCompatImageView {
    private static final ImageView.ScaleType q = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config r = Bitmap.Config.ARGB_8888;
    private final RectF a;
    private final RectF b;
    private final Matrix c;
    private final Paint d;
    private final Paint e;
    private int f;
    private int g;
    private Bitmap h;
    private BitmapShader i;
    private int j;
    private int k;
    private float l;
    private float m;
    private ColorFilter n;
    private boolean o;
    private boolean p;

    public y71(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Paint();
        this.e = new Paint();
        this.f = -16777216;
        this.g = 2;
        d();
    }

    private Bitmap c(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                createBitmap = Bitmap.createBitmap(2, 2, r);
            } else {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), r);
            }
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    private void d() {
        super.setScaleType(q);
        this.o = true;
        if (this.p) {
            e();
            this.p = false;
        }
    }

    private void e() {
        Bitmap bitmap = this.h;
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap copy = this.h.copy(Bitmap.Config.ARGB_8888, true);
            this.h = copy;
            if (!this.o) {
                this.p = true;
            } else if (copy == null) {
            } else {
                Bitmap bitmap2 = this.h;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.i = new BitmapShader(bitmap2, tileMode, tileMode);
                this.d.setAntiAlias(true);
                this.d.setShader(this.i);
                this.e.setStyle(Paint.Style.STROKE);
                this.e.setAntiAlias(true);
                this.e.setColor(this.f);
                this.e.setStrokeWidth(this.g);
                this.k = this.h.getHeight();
                this.j = this.h.getWidth();
                this.b.set(0.0f, 0.0f, getWidth(), getHeight());
                RectF rectF = this.a;
                int i = this.g;
                rectF.set(i, i, this.b.width() - this.g, this.b.height() - this.g);
                f();
                invalidate();
            }
        }
    }

    private void f() {
        float width;
        float height;
        this.c.set(null);
        float f = 0.0f;
        if (this.j * this.a.height() > this.a.width() * this.k) {
            width = this.a.height() / this.k;
            f = (this.a.width() - (this.j * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = this.a.width() / this.j;
            height = (this.a.height() - (this.k * width)) * 0.5f;
        }
        this.c.setScale(width, width);
        Matrix matrix = this.c;
        int i = this.g;
        matrix.postTranslate(((int) (f + 0.5f)) + i, ((int) (height + 0.5f)) + i);
        this.i.setLocalMatrix(this.c);
    }

    public int getBorderColor() {
        return this.f;
    }

    public int getBorderWidth() {
        return this.g;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return q;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.l, this.d);
        if (this.g != 0) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.m, this.e);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (!z) {
            return;
        }
        throw new IllegalArgumentException("adjustViewBounds not supported.");
    }

    public void setBorderColor(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        this.e.setColor(i);
        invalidate();
    }

    public void setBorderWidth(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        e();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.n) {
            return;
        }
        this.n = colorFilter;
        this.d.setColorFilter(colorFilter);
        invalidate();
    }

    public void setDrawableRadius(float f) {
        this.l = f;
        this.m = f - (this.g / 2);
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.h = bitmap;
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.h = c(drawable);
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.h = c(getDrawable());
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.h = c(getDrawable());
        e();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == q) {
            return;
        }
        throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
    }
}
