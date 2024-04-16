package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b_\u0010`J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R*\u0010\u0010\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010 \u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR6\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R3\u00100\u001a\u00020*2\u0006\u0010\t\u001a\u00020*8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00103\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR*\u00106\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR.\u00109\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R3\u0010=\u001a\u00020:2\u0006\u0010\t\u001a\u00020:8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b.\u0010+\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/R3\u0010A\u001a\u00020>2\u0006\u0010\t\u001a\u00020>8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b?\u0010-\"\u0004\b@\u0010/R*\u0010D\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001b\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010\u001fR*\u0010G\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001b\u001a\u0004\bE\u0010\u001d\"\u0004\bF\u0010\u001fR*\u0010J\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001b\u001a\u0004\bH\u0010\u001d\"\u0004\bI\u0010\u001fR*\u0010M\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u001b\u001a\u0004\bK\u0010\u001d\"\u0004\bL\u0010\u001fR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010OR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010OR\u0016\u0010R\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010OR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010WR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010WR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b#\u0010]\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Lpr7;", "Luvb;", "", "t", "u", "Ly73;", "a", "", "toString", "value", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", Image.TYPE_HIGH, "(Ljava/lang/String;)V", Action.NAME_ATTRIBUTE, "Lmg0;", c.a, "Lmg0;", "getFill", "()Lmg0;", "f", "(Lmg0;)V", "fill", "", DateTokenConverter.CONVERTER_KEY, "F", "getFillAlpha", "()F", "g", "(F)V", "fillAlpha", "", "Lzr7;", e.a, "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "pathData", "Lsr7;", "I", "getPathFillType-Rg-k1Os", "()I", "j", "(I)V", "pathFillType", "getStrokeAlpha", "l", "strokeAlpha", "getStrokeLineWidth", "p", "strokeLineWidth", "getStroke", "k", "stroke", "Lq0b;", "getStrokeLineCap-KaPHkGw", Image.TYPE_MEDIUM, "strokeLineCap", "Ls0b;", "getStrokeLineJoin-LxFBmk8", "n", "strokeLineJoin", "getStrokeLineMiter", "o", "strokeLineMiter", "getTrimPathStart", Image.TYPE_SMALL, "trimPathStart", "getTrimPathEnd", "q", "trimPathEnd", "getTrimPathOffset", "r", "trimPathOffset", "", "Z", "isPathDirty", "isStrokeDirty", "isTrimPathDirty", "Lp0b;", "Lp0b;", "strokeStyle", "Lor7;", "Lor7;", "path", "renderPath", "Lxr7;", "v", "Lrn5;", "()Lxr7;", "pathMeasure", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: pr7  reason: default package */
/* loaded from: classes.dex */
public final class pr7 extends uvb {
    private String b;
    private mg0 c;
    private float d;
    private List<? extends zr7> e;
    private int f;
    private float g;
    private float h;
    private mg0 i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float n;
    private float o;
    private boolean p;
    private boolean q;
    private boolean r;
    private p0b s;
    private final or7 t;
    private or7 u;
    private final rn5 v;

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxr7;", "a", "()Lxr7;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pr7$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<xr7> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final xr7 invoke() {
            return ii.a();
        }
    }

    public pr7() {
        super(null);
        rn5 a2;
        this.b = "";
        this.d = 1.0f;
        this.e = oxb.e();
        this.f = oxb.b();
        this.g = 1.0f;
        this.j = oxb.c();
        this.k = oxb.d();
        this.l = 4.0f;
        this.n = 1.0f;
        this.p = true;
        this.q = true;
        or7 a3 = ji.a();
        this.t = a3;
        this.u = a3;
        a2 = yn5.a(fo5.c, a.a);
        this.v = a2;
    }

    private final xr7 e() {
        return (xr7) this.v.getValue();
    }

    private final void t() {
        fs7.c(this.e, this.t);
        u();
    }

    private final void u() {
        if (this.m == 0.0f && this.n == 1.0f) {
            this.u = this.t;
            return;
        }
        if (z65.c(this.u, this.t)) {
            this.u = ji.a();
        } else {
            int j = this.u.j();
            this.u.g();
            this.u.f(j);
        }
        e().a(this.t, false);
        float c = e().c();
        float f = this.m;
        float f2 = this.o;
        float f3 = ((f + f2) % 1.0f) * c;
        float f4 = ((this.n + f2) % 1.0f) * c;
        if (f3 > f4) {
            e().b(f3, c, this.u, true);
            e().b(0.0f, f4, this.u, true);
            return;
        }
        e().b(f3, f4, this.u, true);
    }

    @Override // defpackage.uvb
    public void a(y73 y73Var) {
        z65.h(y73Var, "<this>");
        if (this.p) {
            t();
        } else if (this.r) {
            u();
        }
        this.p = false;
        this.r = false;
        mg0 mg0Var = this.c;
        if (mg0Var != null) {
            x73.e(y73Var, this.u, mg0Var, this.d, null, null, 0, 56, null);
        }
        mg0 mg0Var2 = this.i;
        if (mg0Var2 != null) {
            p0b p0bVar = this.s;
            if (this.q || p0bVar == null) {
                p0bVar = new p0b(this.h, this.l, this.j, this.k, null, 16, null);
                this.s = p0bVar;
                this.q = false;
            }
            x73.e(y73Var, this.u, mg0Var2, this.g, p0bVar, null, 0, 48, null);
        }
    }

    public final void f(mg0 mg0Var) {
        this.c = mg0Var;
        c();
    }

    public final void g(float f) {
        this.d = f;
        c();
    }

    public final void h(String str) {
        z65.h(str, "value");
        this.b = str;
        c();
    }

    public final void i(List<? extends zr7> list) {
        z65.h(list, "value");
        this.e = list;
        this.p = true;
        c();
    }

    public final void j(int i) {
        this.f = i;
        this.u.f(i);
        c();
    }

    public final void k(mg0 mg0Var) {
        this.i = mg0Var;
        c();
    }

    public final void l(float f) {
        this.g = f;
        c();
    }

    public final void m(int i) {
        this.j = i;
        this.q = true;
        c();
    }

    public final void n(int i) {
        this.k = i;
        this.q = true;
        c();
    }

    public final void o(float f) {
        this.l = f;
        this.q = true;
        c();
    }

    public final void p(float f) {
        this.h = f;
        c();
    }

    public final void q(float f) {
        if (this.n != f) {
            this.n = f;
            this.r = true;
            c();
        }
    }

    public final void r(float f) {
        if (this.o != f) {
            this.o = f;
            this.r = true;
            c();
        }
    }

    public final void s(float f) {
        if (this.m != f) {
            this.m = f;
            this.r = true;
            c();
        }
    }

    public String toString() {
        return this.t.toString();
    }
}
