package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BaseProgressDrawable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\n\b&\u0018\u0000 02\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b.\u0010/J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0010\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010&\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010-\u001a\u00020'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b\u001b\u0010*\"\u0004\b+\u0010,¨\u00061"}, d2 = {"Lf80;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Canvas;", "canvas", "", "width", "height", "", DateTokenConverter.CONVERTER_KEY, "draw", "alpha", "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "a", "I", "getAlphaValue", "()I", "setAlphaValue", "(I)V", "alphaValue", "b", "Landroid/graphics/ColorFilter;", "colorFilterValue", "Landroid/graphics/Paint;", c.a, "Landroid/graphics/Paint;", "()Landroid/graphics/Paint;", "setPaintBG", "(Landroid/graphics/Paint;)V", "paintBG", "setPaintFG", "paintFG", e.a, "getPaintRound", "setPaintRound", "paintRound", "", "f", "F", "()F", "setRound", "(F)V", "round", "<init>", "()V", "g", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f80  reason: default package */
/* loaded from: classes.dex */
public abstract class f80 extends Drawable {
    public static final a g = new a(null);
    private ColorFilter b;
    private float f;
    private int a = 255;
    private Paint c = new Paint();
    private Paint d = new Paint();
    private Paint e = new Paint();

    /* compiled from: BaseProgressDrawable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lf80$a;", "", "", "DEFAULT_BG_COLOR", "I", "DEFAULT_FG_COLOR", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: f80$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f80() {
        this.c.setAntiAlias(true);
        this.c.setColor(-16777216);
        Paint paint = this.c;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.d.setAntiAlias(true);
        this.d.setColor(-65536);
        this.d.setStyle(style);
    }

    public final Paint a() {
        return this.c;
    }

    public final Paint b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float c() {
        return this.f;
    }

    public abstract void d(Canvas canvas, int i, int i2);

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        z65.h(canvas, "canvas");
        if (getBounds().width() != 0 && getBounds().height() != 0) {
            this.f = getBounds().height() / 2;
            int save = canvas.save();
            d(canvas, getBounds().width(), getBounds().height());
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b = colorFilter;
        invalidateSelf();
    }
}
