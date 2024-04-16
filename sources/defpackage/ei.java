package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bs7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AndroidPath.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u00102\u001a\u00020-¢\u0006\u0004\bH\u0010IJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J(\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J8\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J8\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\tH\u0016J-\u0010+\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00012\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010:R-\u0010B\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010F\u001a\u00020\u00048VX\u0096\u0004¢\u0006\f\u0012\u0004\bD\u0010E\u001a\u0004\b.\u0010CR\u0014\u0010G\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010C\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006J"}, d2 = {"Lei;", "Lor7;", "Lk99;", "rect", "", "p", "", "x", "y", "", "l", "dx", "dy", "b", "o", "n", "x1", "y1", "x2", "y2", DateTokenConverter.CONVERTER_KEY, "dx1", "dy1", "dx2", "dy2", e.a, "x3", "y3", Image.TYPE_MEDIUM, "dx3", "dy3", c.a, "i", "Lgo9;", "roundRect", Image.TYPE_HIGH, "close", "reset", "g", "path1", "path2", "Lbs7;", "operation", "k", "(Lor7;Lor7;I)Z", "Landroid/graphics/Path;", "a", "Landroid/graphics/Path;", "q", "()Landroid/graphics/Path;", "internalPath", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "", "[F", "radii", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mMatrix", "Lsr7;", "value", "j", "()I", "f", "(I)V", "fillType", "()Z", "isConvex$annotations", "()V", "isConvex", "isEmpty", "<init>", "(Landroid/graphics/Path;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ei  reason: default package */
/* loaded from: classes.dex */
public final class ei implements or7 {
    private final Path a;
    private final RectF b;
    private final float[] c;
    private final Matrix d;

    public ei() {
        this(null, 1, null);
    }

    private final boolean p(k99 k99Var) {
        if (!Float.isNaN(k99Var.f())) {
            if (!Float.isNaN(k99Var.i())) {
                if (!Float.isNaN(k99Var.g())) {
                    if (!Float.isNaN(k99Var.c())) {
                        return true;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    @Override // defpackage.or7
    public boolean a() {
        return this.a.isConvex();
    }

    @Override // defpackage.or7
    public void b(float f, float f2) {
        this.a.rMoveTo(f, f2);
    }

    @Override // defpackage.or7
    public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.or7
    public void close() {
        this.a.close();
    }

    @Override // defpackage.or7
    public void d(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.or7
    public void e(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // defpackage.or7
    public void f(int i) {
        Path.FillType fillType;
        Path path = this.a;
        if (sr7.f(i, sr7.b.a())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // defpackage.or7
    public void g() {
        this.a.rewind();
    }

    @Override // defpackage.or7
    public void h(go9 go9Var) {
        z65.h(go9Var, "roundRect");
        this.b.set(go9Var.e(), go9Var.g(), go9Var.f(), go9Var.a());
        this.c[0] = bx1.d(go9Var.h());
        this.c[1] = bx1.e(go9Var.h());
        this.c[2] = bx1.d(go9Var.i());
        this.c[3] = bx1.e(go9Var.i());
        this.c[4] = bx1.d(go9Var.c());
        this.c[5] = bx1.e(go9Var.c());
        this.c[6] = bx1.d(go9Var.b());
        this.c[7] = bx1.e(go9Var.b());
        this.a.addRoundRect(this.b, this.c, Path.Direction.CCW);
    }

    @Override // defpackage.or7
    public void i(k99 k99Var) {
        z65.h(k99Var, "rect");
        if (p(k99Var)) {
            this.b.set(k99Var.f(), k99Var.i(), k99Var.g(), k99Var.c());
            this.a.addRect(this.b, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // defpackage.or7
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.or7
    public int j() {
        if (this.a.getFillType() == Path.FillType.EVEN_ODD) {
            return sr7.b.a();
        }
        return sr7.b.b();
    }

    @Override // defpackage.or7
    public boolean k(or7 or7Var, or7 or7Var2, int i) {
        Path.Op op;
        z65.h(or7Var, "path1");
        z65.h(or7Var2, "path2");
        bs7.a aVar = bs7.a;
        if (bs7.f(i, aVar.a())) {
            op = Path.Op.DIFFERENCE;
        } else if (bs7.f(i, aVar.b())) {
            op = Path.Op.INTERSECT;
        } else if (bs7.f(i, aVar.c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (bs7.f(i, aVar.d())) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        Path path = this.a;
        if (or7Var instanceof ei) {
            Path q = ((ei) or7Var).q();
            if (or7Var2 instanceof ei) {
                return path.op(q, ((ei) or7Var2).q(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.or7
    public void l(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    @Override // defpackage.or7
    public void m(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.or7
    public void n(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    @Override // defpackage.or7
    public void o(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final Path q() {
        return this.a;
    }

    @Override // defpackage.or7
    public void reset() {
        this.a.reset();
    }

    public ei(Path path) {
        z65.h(path, "internalPath");
        this.a = path;
        this.b = new RectF();
        this.c = new float[8];
        this.d = new Matrix();
    }

    public /* synthetic */ ei(Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Path() : path);
    }
}
