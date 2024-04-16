package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.q0b;
import defpackage.s0b;
import kotlin.Metadata;
/* compiled from: AndroidPaint.android.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0002\u001a\b\u0010\u0004\u001a\u00020\u0002H\u0000\u001a%\u0010\t\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\r\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010\u0010\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u001a\u0010\u0012\u001a\u00020\u0011*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0017\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u0016H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\n\u001a\u0010\u0010\u0018\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010\u0019\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u001a\u0010\u001b\u001a\u00020\u001a*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u001aH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\n\u001a\u001a\u0010\u001f\u001a\u00020\u001e*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001c\u001a%\u0010 \u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u001eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\n\u001a\u0010\u0010!\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010\"\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u001a\u0010$\u001a\u00020#*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u001c\u001a%\u0010%\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020#H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\n\u001a \u0010(\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u000e\u0010\f\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'H\u0000\u001a\u001a\u0010*\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\b\u0010\f\u001a\u0004\u0018\u00010)H\u0000*\n\u0010+\"\u00020\u00022\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lpp7;", "a", "Landroid/graphics/Paint;", "b", "j", "Landroidx/compose/ui/graphics/NativePaint;", "Lpc0;", "mode", "", "l", "(Landroid/graphics/Paint;I)V", "Lwc1;", "value", "n", "", c.a, "k", "Luc1;", DateTokenConverter.CONVERTER_KEY, "(Landroid/graphics/Paint;)J", Image.TYPE_MEDIUM, "(Landroid/graphics/Paint;J)V", "Lup7;", "v", "i", "u", "Lq0b;", "f", "(Landroid/graphics/Paint;)I", "r", "Ls0b;", "g", Image.TYPE_SMALL, Image.TYPE_HIGH, "t", "Lyu3;", e.a, "o", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "q", "Lrr7;", "p", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: xh  reason: default package */
/* loaded from: classes.dex */
public final class xh {

    /* compiled from: AndroidPaint.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: xh$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final pp7 a() {
        return new wh();
    }

    public static final pp7 b(Paint paint) {
        z65.h(paint, "<this>");
        return new wh(paint);
    }

    public static final float c(Paint paint) {
        z65.h(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        z65.h(paint, "<this>");
        return yc1.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        z65.h(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return yu3.a.b();
        }
        return yu3.a.a();
    }

    public static final int f(Paint paint) {
        int i;
        z65.h(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$1[strokeCap.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return q0b.b.a();
                }
                return q0b.b.c();
            }
            return q0b.b.b();
        }
        return q0b.b.a();
    }

    public static final int g(Paint paint) {
        int i;
        z65.h(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return s0b.b.b();
                }
                return s0b.b.c();
            }
            return s0b.b.a();
        }
        return s0b.b.b();
    }

    public static final float h(Paint paint) {
        z65.h(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        z65.h(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f) {
        z65.h(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void l(Paint paint, int i) {
        z65.h(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            s8c.a.a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(rf.b(i)));
        }
    }

    public static final void m(Paint paint, long j) {
        z65.h(paint, "$this$setNativeColor");
        paint.setColor(yc1.f(j));
    }

    public static final void n(Paint paint, wc1 wc1Var) {
        ColorFilter colorFilter;
        z65.h(paint, "<this>");
        if (wc1Var != null) {
            colorFilter = yf.b(wc1Var);
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    public static final void o(Paint paint, int i) {
        z65.h(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!yu3.d(i, yu3.a.b()));
    }

    public static final void p(Paint paint, rr7 rr7Var) {
        PathEffect pathEffect;
        z65.h(paint, "<this>");
        fi fiVar = (fi) rr7Var;
        if (fiVar != null) {
            pathEffect = fiVar.a();
        } else {
            pathEffect = null;
        }
        paint.setPathEffect(pathEffect);
    }

    public static final void q(Paint paint, Shader shader) {
        z65.h(paint, "<this>");
        paint.setShader(shader);
    }

    public static final void r(Paint paint, int i) {
        Paint.Cap cap;
        z65.h(paint, "$this$setNativeStrokeCap");
        q0b.a aVar = q0b.b;
        if (q0b.g(i, aVar.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (q0b.g(i, aVar.b())) {
            cap = Paint.Cap.ROUND;
        } else if (q0b.g(i, aVar.a())) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void s(Paint paint, int i) {
        Paint.Join join;
        z65.h(paint, "$this$setNativeStrokeJoin");
        s0b.a aVar = s0b.b;
        if (s0b.g(i, aVar.b())) {
            join = Paint.Join.MITER;
        } else if (s0b.g(i, aVar.a())) {
            join = Paint.Join.BEVEL;
        } else if (s0b.g(i, aVar.c())) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void t(Paint paint, float f) {
        z65.h(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public static final void u(Paint paint, float f) {
        z65.h(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    public static final void v(Paint paint, int i) {
        Paint.Style style;
        z65.h(paint, "$this$setNativeStyle");
        if (up7.d(i, up7.a.b())) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }
}
