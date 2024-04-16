package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.graphics.f;
import androidx.compose.ui.platform.AndroidComposeView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RenderNodeLayer.android.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u00016B1\u0012\u0006\u0010D\u001a\u00020@\u0012\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030;\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030=¢\u0006\u0004\b^\u0010_J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J¯\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u00032\u0006\u0010'\u001a\u00020.H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010-J\b\u00100\u001a\u00020\u0003H\u0016J\u0010\u00101\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0003H\u0016J\b\u00103\u001a\u00020\u0003H\u0016J%\u00106\u001a\u00020&2\u0006\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020\u0017H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0018\u0010:\u001a\u00020\u00032\u0006\u00109\u001a\u0002082\u0006\u00105\u001a\u00020\u0017H\u0016J*\u0010?\u001a\u00020\u00032\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030;2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030=H\u0016R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b:\u0010A\u001a\u0004\bB\u0010CR$\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010ER\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010FR$\u0010K\u001a\u00020\u00172\u0006\u0010G\u001a\u00020\u00178\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b?\u0010H\"\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010MR\u0016\u0010O\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010HR\u0016\u0010P\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010HR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010RR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010YR\u001f\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bI\u0010[R\u0014\u0010]\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\\\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006a"}, d2 = {"Lzf9;", "Lsm7;", "", "", "l", "Lqn0;", "canvas", "j", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Ltga;", "shape", "", "clip", "Lfe9;", "renderEffect", "Luc1;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "Lqm5;", "layoutDirection", "La03;", "density", "g", "(FFFFFFFFFFJLtga;ZLfe9;JJILqm5;La03;)V", "Ls67;", "position", e.a, "(J)Z", "Lw55;", "size", c.a, "(J)V", "Ls55;", Image.TYPE_HIGH, "invalidate", "f", "i", "destroy", "point", "inverse", "b", "(JZ)J", "Lzq6;", "rect", "a", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "value", "Z", "k", "(Z)V", "isDirty", "Llm7;", "Llm7;", "outlineResolver", "isDestroyed", "drawnWithZ", "Lpp7;", "Lpp7;", "softwareLayerPaint", "Lgm5;", "La23;", "Lgm5;", "matrixCache", "Lun0;", "Lun0;", "canvasHolder", "J", "La23;", "renderNode", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", Image.TYPE_MEDIUM, "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zf9  reason: default package */
/* loaded from: classes.dex */
public final class zf9 implements sm7 {
    public static final b m = new b(null);
    private static final Function2<a23, Matrix, Unit> n = a.a;
    private final AndroidComposeView a;
    private Function1<? super qn0, Unit> b;
    private Function0<Unit> c;
    private boolean d;
    private final lm7 e;
    private boolean f;
    private boolean g;
    private pp7 h;
    private final gm5<a23> i;
    private final un0 j;
    private long k;
    private final a23 l;

    /* compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La23;", "rn", "Landroid/graphics/Matrix;", "matrix", "", "a", "(La23;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: zf9$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function2<a23, Matrix, Unit> {
        public static final a a = new a();

        a() {
            super(2);
        }

        public final void a(a23 a23Var, Matrix matrix) {
            z65.h(a23Var, "rn");
            z65.h(matrix, "matrix");
            a23Var.G(matrix);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(a23 a23Var, Matrix matrix) {
            a(a23Var, matrix);
            return Unit.a;
        }
    }

    /* compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lzf9$b;", "", "Lkotlin/Function2;", "La23;", "Landroid/graphics/Matrix;", "", "getMatrix", "Lkotlin/jvm/functions/Function2;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zf9$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public zf9(AndroidComposeView androidComposeView, Function1<? super qn0, Unit> function1, Function0<Unit> function0) {
        a23 ie9Var;
        z65.h(androidComposeView, "ownerView");
        z65.h(function1, "drawBlock");
        z65.h(function0, "invalidateParentLayer");
        this.a = androidComposeView;
        this.b = function1;
        this.c = function0;
        this.e = new lm7(androidComposeView.getDensity());
        this.i = new gm5<>(n);
        this.j = new un0();
        this.k = f.a.a();
        if (Build.VERSION.SDK_INT >= 29) {
            ie9Var = new wf9(androidComposeView);
        } else {
            ie9Var = new ie9(androidComposeView);
        }
        ie9Var.F(true);
        this.l = ie9Var;
    }

    private final void j(qn0 qn0Var) {
        if (this.l.E() || this.l.C()) {
            this.e.a(qn0Var);
        }
    }

    private final void k(boolean z) {
        if (z != this.d) {
            this.d = z;
            this.a.Y(this, z);
        }
    }

    private final void l() {
        if (Build.VERSION.SDK_INT >= 26) {
            o8c.a.a(this.a);
        } else {
            this.a.invalidate();
        }
    }

    @Override // defpackage.sm7
    public void a(zq6 zq6Var, boolean z) {
        z65.h(zq6Var, "rect");
        if (z) {
            float[] a2 = this.i.a(this.l);
            if (a2 == null) {
                zq6Var.g(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                oa6.g(a2, zq6Var);
                return;
            }
        }
        oa6.g(this.i.b(this.l), zq6Var);
    }

    @Override // defpackage.sm7
    public long b(long j, boolean z) {
        if (z) {
            float[] a2 = this.i.a(this.l);
            if (a2 != null) {
                return oa6.f(a2, j);
            }
            return s67.b.a();
        }
        return oa6.f(this.i.b(this.l), j);
    }

    @Override // defpackage.sm7
    public void c(long j) {
        int g = w55.g(j);
        int f = w55.f(j);
        float f2 = g;
        this.l.J(f.d(this.k) * f2);
        float f3 = f;
        this.l.K(f.e(this.k) * f3);
        a23 a23Var = this.l;
        if (a23Var.x(a23Var.e(), this.l.D(), this.l.e() + g, this.l.D() + f)) {
            this.e.h(ina.a(f2, f3));
            this.l.M(this.e.c());
            invalidate();
            this.i.c();
        }
    }

    @Override // defpackage.sm7
    public void d(Function1<? super qn0, Unit> function1, Function0<Unit> function0) {
        z65.h(function1, "drawBlock");
        z65.h(function0, "invalidateParentLayer");
        k(false);
        this.f = false;
        this.g = false;
        this.k = f.a.a();
        this.b = function1;
        this.c = function0;
    }

    @Override // defpackage.sm7
    public void destroy() {
        if (this.l.B()) {
            this.l.y();
        }
        this.b = null;
        this.c = null;
        this.f = true;
        k(false);
        this.a.e0();
        this.a.d0(this);
    }

    @Override // defpackage.sm7
    public boolean e(long j) {
        float l = s67.l(j);
        float m2 = s67.m(j);
        if (this.l.C()) {
            if (0.0f <= l && l < this.l.getWidth() && 0.0f <= m2 && m2 < this.l.getHeight()) {
                return true;
            }
            return false;
        } else if (!this.l.E()) {
            return true;
        } else {
            return this.e.e(j);
        }
    }

    @Override // defpackage.sm7
    public void f(qn0 qn0Var) {
        z65.h(qn0Var, "canvas");
        Canvas c = tf.c(qn0Var);
        boolean z = false;
        if (c.isHardwareAccelerated()) {
            i();
            if (this.l.Q() > 0.0f) {
                z = true;
            }
            this.g = z;
            if (z) {
                qn0Var.h();
            }
            this.l.v(c);
            if (this.g) {
                qn0Var.m();
                return;
            }
            return;
        }
        float e = this.l.e();
        float D = this.l.D();
        float u = this.l.u();
        float I = this.l.I();
        if (this.l.a() < 1.0f) {
            pp7 pp7Var = this.h;
            if (pp7Var == null) {
                pp7Var = xh.a();
                this.h = pp7Var;
            }
            pp7Var.c(this.l.a());
            c.saveLayer(e, D, u, I, pp7Var.p());
        } else {
            qn0Var.l();
        }
        qn0Var.a(e, D);
        qn0Var.n(this.i.b(this.l));
        j(qn0Var);
        Function1<? super qn0, Unit> function1 = this.b;
        if (function1 != null) {
            function1.invoke(qn0Var);
        }
        qn0Var.g();
        k(false);
    }

    @Override // defpackage.sm7
    public void g(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, tga tgaVar, boolean z, fe9 fe9Var, long j2, long j3, int i, qm5 qm5Var, a03 a03Var) {
        Function0<Unit> function0;
        z65.h(tgaVar, "shape");
        z65.h(qm5Var, "layoutDirection");
        z65.h(a03Var, "density");
        this.k = j;
        boolean z2 = false;
        boolean z3 = this.l.E() && !this.e.d();
        this.l.i(f);
        this.l.o(f2);
        this.l.c(f3);
        this.l.t(f4);
        this.l.f(f5);
        this.l.z(f6);
        this.l.N(yc1.f(j2));
        this.l.P(yc1.f(j3));
        this.l.n(f9);
        this.l.k(f7);
        this.l.l(f8);
        this.l.j(f10);
        this.l.J(f.d(j) * this.l.getWidth());
        this.l.K(f.e(j) * this.l.getHeight());
        this.l.O(z && tgaVar != s99.a());
        this.l.w(z && tgaVar == s99.a());
        this.l.g(fe9Var);
        this.l.h(i);
        boolean g = this.e.g(tgaVar, this.l.a(), this.l.E(), this.l.Q(), qm5Var, a03Var);
        this.l.M(this.e.c());
        if (this.l.E() && !this.e.d()) {
            z2 = true;
        }
        if (z3 == z2 && (!z2 || !g)) {
            l();
        } else {
            invalidate();
        }
        if (!this.g && this.l.Q() > 0.0f && (function0 = this.c) != null) {
            function0.invoke();
        }
        this.i.c();
    }

    @Override // defpackage.sm7
    public void h(long j) {
        int e = this.l.e();
        int D = this.l.D();
        int h = s55.h(j);
        int i = s55.i(j);
        if (e != h || D != i) {
            if (e != h) {
                this.l.H(h - e);
            }
            if (D != i) {
                this.l.A(i - D);
            }
            l();
            this.i.c();
        }
    }

    @Override // defpackage.sm7
    public void i() {
        or7 or7Var;
        if (this.d || !this.l.B()) {
            k(false);
            if (this.l.E() && !this.e.d()) {
                or7Var = this.e.b();
            } else {
                or7Var = null;
            }
            Function1<? super qn0, Unit> function1 = this.b;
            if (function1 != null) {
                this.l.L(this.j, or7Var, function1);
            }
        }
    }

    @Override // defpackage.sm7
    public void invalidate() {
        if (!this.d && !this.f) {
            this.a.invalidate();
            k(true);
        }
    }
}
