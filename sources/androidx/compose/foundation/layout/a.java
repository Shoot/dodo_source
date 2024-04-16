package androidx.compose.foundation.layout;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import defpackage.gb8;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.i;
/* compiled from: Size.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/a;", "Lzm5;", "Lsm6$c;", "Lvb6;", "Lmb6;", "measurable", "Lnr1;", "constraints", "Ltb6;", "p", "(Lvb6;Lmb6;J)Ltb6;", "Lt23;", "n", "Lt23;", "getDirection", "()Lt23;", "f1", "(Lt23;)V", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "o", "F", "getFraction", "()F", "g1", "(F)V", "fraction", "<init>", "(Lt23;F)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class a extends sm6.c implements zm5 {
    private t23 n;
    private float o;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0016a extends ej5 implements Function1<gb8.a, Unit> {
        final /* synthetic */ gb8 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0016a(gb8 gb8Var) {
            super(1);
            this.a = gb8Var;
        }

        public final void a(gb8.a aVar) {
            z65.h(aVar, "$this$layout");
            gb8.a.r(aVar, this.a, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    public a(t23 t23Var, float f) {
        z65.h(t23Var, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        this.n = t23Var;
        this.o = f;
    }

    public final void f1(t23 t23Var) {
        z65.h(t23Var, "<set-?>");
        this.n = t23Var;
    }

    public final void g1(float f) {
        this.o = f;
    }

    @Override // defpackage.zm5
    public tb6 p(vb6 vb6Var, mb6 mb6Var, long j) {
        int p;
        int n;
        int m;
        int i;
        int c;
        int c2;
        z65.h(vb6Var, "$this$measure");
        z65.h(mb6Var, "measurable");
        if (nr1.j(j) && this.n != t23.Vertical) {
            c2 = la6.c(nr1.n(j) * this.o);
            p = i.l(c2, nr1.p(j), nr1.n(j));
            n = p;
        } else {
            p = nr1.p(j);
            n = nr1.n(j);
        }
        if (nr1.i(j) && this.n != t23.Horizontal) {
            c = la6.c(nr1.m(j) * this.o);
            i = i.l(c, nr1.o(j), nr1.m(j));
            m = i;
        } else {
            int o = nr1.o(j);
            m = nr1.m(j);
            i = o;
        }
        gb8 E = mb6Var.E(qr1.a(p, n, i, m));
        return ub6.b(vb6Var, E.y0(), E.e0(), null, new C0016a(E), 4, null);
    }
}
