package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Painter.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\f\u0010\u000f\u001a\u00020\u0006*\u00020\u000eH$J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0014J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bH\u0014J5\u0010\u0017\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u001d\u0010%\u001a\u00020\u00158&X¦\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006("}, d2 = {"Lsp7;", "", "Lpp7;", "i", "Lwc1;", "colorFilter", "", e.a, "", "alpha", DateTokenConverter.CONVERTER_KEY, "Lqm5;", "rtl", "f", "Ly73;", "j", "", "a", "b", "layoutDirection", c.a, "Lcna;", "size", "g", "(Ly73;JFLwc1;)V", "Lpp7;", "layerPaint", "Z", "useLayer", "Lwc1;", "F", "Lqm5;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "drawLambda", Image.TYPE_HIGH, "()J", "intrinsicSize", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sp7  reason: default package */
/* loaded from: classes.dex */
public abstract class sp7 {
    private pp7 a;
    private boolean b;
    private wc1 c;
    private float d = 1.0f;
    private qm5 e = qm5.Ltr;
    private final Function1<y73, Unit> f = new a();

    /* compiled from: Painter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly73;", "", "a", "(Ly73;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sp7$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<y73, Unit> {
        a() {
            super(1);
        }

        public final void a(y73 y73Var) {
            z65.h(y73Var, "$this$null");
            sp7.this.j(y73Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y73 y73Var) {
            a(y73Var);
            return Unit.a;
        }
    }

    private final void d(float f) {
        if (this.d != f) {
            if (!a(f)) {
                if (f == 1.0f) {
                    pp7 pp7Var = this.a;
                    if (pp7Var != null) {
                        pp7Var.c(f);
                    }
                    this.b = false;
                } else {
                    i().c(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
    }

    private final void e(wc1 wc1Var) {
        if (!z65.c(this.c, wc1Var)) {
            if (!b(wc1Var)) {
                if (wc1Var == null) {
                    pp7 pp7Var = this.a;
                    if (pp7Var != null) {
                        pp7Var.t(null);
                    }
                    this.b = false;
                } else {
                    i().t(wc1Var);
                    this.b = true;
                }
            }
            this.c = wc1Var;
        }
    }

    private final void f(qm5 qm5Var) {
        if (this.e != qm5Var) {
            c(qm5Var);
            this.e = qm5Var;
        }
    }

    private final pp7 i() {
        pp7 pp7Var = this.a;
        if (pp7Var == null) {
            pp7 a2 = xh.a();
            this.a = a2;
            return a2;
        }
        return pp7Var;
    }

    protected abstract boolean a(float f);

    protected abstract boolean b(wc1 wc1Var);

    protected boolean c(qm5 qm5Var) {
        z65.h(qm5Var, "layoutDirection");
        return false;
    }

    public final void g(y73 y73Var, long j, float f, wc1 wc1Var) {
        z65.h(y73Var, "$this$draw");
        d(f);
        e(wc1Var);
        f(y73Var.getLayoutDirection());
        float i = cna.i(y73Var.s()) - cna.i(j);
        float g = cna.g(y73Var.s()) - cna.g(j);
        y73Var.o0().t().e(0.0f, 0.0f, i, g);
        if (f > 0.0f && cna.i(j) > 0.0f && cna.g(j) > 0.0f) {
            if (this.b) {
                k99 a2 = o99.a(s67.b.c(), ina.a(cna.i(j), cna.g(j)));
                qn0 u = y73Var.o0().u();
                try {
                    u.o(a2, i());
                    j(y73Var);
                } finally {
                    u.g();
                }
            } else {
                j(y73Var);
            }
        }
        y73Var.o0().t().e(-0.0f, -0.0f, -i, -g);
    }

    public abstract long h();

    protected abstract void j(y73 y73Var);
}
