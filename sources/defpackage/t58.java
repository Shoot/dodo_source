package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import defpackage.s58;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PicassoDrawable.java */
/* renamed from: t58  reason: default package */
/* loaded from: classes3.dex */
public final class t58 extends BitmapDrawable {
    private static final Paint h = new Paint();
    private final boolean a;
    private final float b;
    private final s58.e c;
    Drawable d;
    long e;
    boolean f;
    int g;

    t58(Context context, Bitmap bitmap, Drawable drawable, s58.e eVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.g = 255;
        this.a = z2;
        this.b = context.getResources().getDisplayMetrics().density;
        this.c = eVar;
        if (eVar != s58.e.MEMORY && !z) {
            this.d = drawable;
            this.f = true;
            this.e = SystemClock.uptimeMillis();
        }
    }

    private void a(Canvas canvas) {
        Paint paint = h;
        paint.setColor(-1);
        canvas.drawPath(b(0, 0, (int) (this.b * 16.0f)), paint);
        paint.setColor(this.c.a);
        canvas.drawPath(b(0, 0, (int) (this.b * 15.0f)), paint);
    }

    private static Path b(int i, int i2, int i3) {
        Path path = new Path();
        float f = i;
        float f2 = i2;
        path.moveTo(f, f2);
        path.lineTo(i + i3, f2);
        path.lineTo(f, i2 + i3);
        return path;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ImageView imageView, Context context, Bitmap bitmap, s58.e eVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new t58(context, bitmap, drawable, eVar, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f = false;
                this.d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.g);
            }
        }
        if (this.a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.g = i;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
