package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: PrizotekaProgressDrawable.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\"\u0010\u0019\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00100\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\"\u00106\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b7\u00105R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010;R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010;R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010?R\u0016\u0010B\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010A¨\u0006G"}, d2 = {"Lkk8;", "Lf80;", "", "width", "", "l", "height", "k", "Landroid/graphics/Canvas;", "canvas", "f", Image.TYPE_MEDIUM, Image.TYPE_HIGH, "g", "Landroid/graphics/drawable/Drawable;", "i", "", e.a, "draw", DateTokenConverter.CONVERTER_KEY, "F", "getProgressMinValue", "()F", "t", "(F)V", "progressMinValue", "j", Image.TYPE_SMALL, "progressMaxValue", "getProgressCurrentValue", "r", "progressCurrentValue", "", "Z", "getShowGiftIcon", "()Z", "u", "(Z)V", "showGiftIcon", "", "[F", "getBackgroundCorners", "()[F", "n", "([F)V", "backgroundCorners", "getProgressCorners", "q", "progressCorners", "I", "getGradientStartColor", "()I", "p", "(I)V", "gradientStartColor", "o", "getGradientEndColor", "gradientEndColor", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectBackground", "rectProgress", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/drawable/Drawable;", "giftIcon", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kk8  reason: default package */
/* loaded from: classes2.dex */
public final class kk8 extends f80 {
    private float h;
    private float i;
    private float j;
    private boolean k;
    private float[] l;
    private float[] m;
    private int n;
    private int o;
    private final RectF p;
    private final RectF q;
    private final Path r;
    private final Drawable s;

    public kk8(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.l = new float[0];
        this.m = new float[0];
        this.n = -7829368;
        this.o = -7829368;
        this.p = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.q = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.r = new Path();
        Drawable e = iu1.e(context, bx8.ic_gift_16dp);
        this.s = e;
        a().setColor(iu1.c(context, ew8.e));
        if (e != null) {
            e.setTint(iu1.c(context, ew8.p));
        }
    }

    private final float e(int i) {
        float f = this.j;
        float f2 = this.h;
        if (f > f2) {
            return i * ((f - f2) / (this.i - f2));
        }
        return 0.0f;
    }

    private final void f(Canvas canvas) {
        this.r.reset();
        this.r.addRoundRect(this.p, this.l, Path.Direction.CW);
        canvas.drawPath(this.r, a());
        canvas.clipPath(this.r);
    }

    private final void g(Canvas canvas) {
        Drawable i = i();
        if (i != null) {
            float f = 2;
            float intrinsicHeight = (this.p.bottom - i.getIntrinsicHeight()) / f;
            int intrinsicWidth = (int) ((this.p.right - i.getIntrinsicWidth()) / f);
            i.getBounds().right = ((int) this.p.right) - intrinsicWidth;
            i.getBounds().left = ((int) this.p.left) + intrinsicWidth;
            int i2 = (int) intrinsicHeight;
            i.getBounds().top = ((int) this.p.top) + i2;
            i.getBounds().bottom = ((int) this.p.bottom) - i2;
            i.draw(canvas);
        }
    }

    private final void h(Canvas canvas) {
        this.r.reset();
        this.r.addRoundRect(this.q, this.m, Path.Direction.CW);
        canvas.drawPath(this.r, b());
        canvas.clipPath(this.r);
    }

    private final Drawable i() {
        if (this.k) {
            return this.s;
        }
        return null;
    }

    private final void k(int i, int i2) {
        this.p.set(0.0f, 0.0f, i, i2);
    }

    private final void l(int i) {
        b().setShader(new LinearGradient(0.0f, 0.0f, i, 0.0f, this.n, this.o, Shader.TileMode.MIRROR));
    }

    private final void m(int i, int i2) {
        this.q.set(0.0f, 0.0f, e(i), i2);
    }

    @Override // defpackage.f80
    public void d(Canvas canvas, int i, int i2) {
        z65.h(canvas, "canvas");
        k(i, i2);
        f(canvas);
        l(i);
        m(i, i2);
        h(canvas);
    }

    @Override // defpackage.f80, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        z65.h(canvas, "canvas");
        super.draw(canvas);
        g(canvas);
    }

    public final float j() {
        return this.i;
    }

    public final void n(float[] fArr) {
        z65.h(fArr, "<set-?>");
        this.l = fArr;
    }

    public final void o(int i) {
        this.o = i;
    }

    public final void p(int i) {
        this.n = i;
    }

    public final void q(float[] fArr) {
        z65.h(fArr, "<set-?>");
        this.m = fArr;
    }

    public final void r(float f) {
        this.j = f;
    }

    public final void s(float f) {
        this.i = f;
    }

    public final void t(float f) {
        this.h = f;
    }

    public final void u(boolean z) {
        this.k = z;
    }
}
