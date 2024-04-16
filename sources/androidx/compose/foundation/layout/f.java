package androidx.compose.foundation.layout;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import defpackage.gb8;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B4\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001bø\u0001\u0001¢\u0006\u0004\b%\u0010&J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R7\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/f;", "Lzm5;", "Lsm6$c;", "Lvb6;", "Lmb6;", "measurable", "Lnr1;", "constraints", "Ltb6;", "p", "(Lvb6;Lmb6;J)Ltb6;", "Lt23;", "n", "Lt23;", "getDirection", "()Lt23;", "h1", "(Lt23;)V", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "o", "Z", "getUnbounded", "()Z", "i1", "(Z)V", "unbounded", "Lkotlin/Function2;", "Lw55;", "Lqm5;", "Ls55;", "Lkotlin/jvm/functions/Function2;", "f1", "()Lkotlin/jvm/functions/Function2;", "g1", "(Lkotlin/jvm/functions/Function2;)V", "alignmentCallback", "<init>", "(Lt23;ZLkotlin/jvm/functions/Function2;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class f extends sm6.c implements zm5 {
    private t23 n;
    private boolean o;
    private Function2<? super w55, ? super qm5, s55> p;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<gb8.a, Unit> {
        final /* synthetic */ int b;
        final /* synthetic */ gb8 c;
        final /* synthetic */ int d;
        final /* synthetic */ vb6 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i, gb8 gb8Var, int i2, vb6 vb6Var) {
            super(1);
            this.b = i;
            this.c = gb8Var;
            this.d = i2;
            this.e = vb6Var;
        }

        public final void a(gb8.a aVar) {
            z65.h(aVar, "$this$layout");
            gb8.a.p(aVar, this.c, f.this.f1().invoke(w55.b(x55.a(this.b - this.c.y0(), this.d - this.c.e0())), this.e.getLayoutDirection()).l(), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    public f(t23 t23Var, boolean z, Function2<? super w55, ? super qm5, s55> function2) {
        z65.h(t23Var, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        z65.h(function2, "alignmentCallback");
        this.n = t23Var;
        this.o = z;
        this.p = function2;
    }

    public final Function2<w55, qm5, s55> f1() {
        return this.p;
    }

    public final void g1(Function2<? super w55, ? super qm5, s55> function2) {
        z65.h(function2, "<set-?>");
        this.p = function2;
    }

    public final void h1(t23 t23Var) {
        z65.h(t23Var, "<set-?>");
        this.n = t23Var;
    }

    public final void i1(boolean z) {
        this.o = z;
    }

    @Override // defpackage.zm5
    public tb6 p(vb6 vb6Var, mb6 mb6Var, long j) {
        int p;
        int n;
        int l;
        int l2;
        z65.h(vb6Var, "$this$measure");
        z65.h(mb6Var, "measurable");
        t23 t23Var = this.n;
        t23 t23Var2 = t23.Vertical;
        int i = 0;
        if (t23Var != t23Var2) {
            p = 0;
        } else {
            p = nr1.p(j);
        }
        t23 t23Var3 = this.n;
        t23 t23Var4 = t23.Horizontal;
        if (t23Var3 == t23Var4) {
            i = nr1.o(j);
        }
        int i2 = Integer.MAX_VALUE;
        if (this.n != t23Var2 && this.o) {
            n = Integer.MAX_VALUE;
        } else {
            n = nr1.n(j);
        }
        if (this.n == t23Var4 || !this.o) {
            i2 = nr1.m(j);
        }
        gb8 E = mb6Var.E(qr1.a(p, n, i, i2));
        l = i.l(E.y0(), nr1.p(j), nr1.n(j));
        l2 = i.l(E.e0(), nr1.o(j), nr1.m(j));
        return ub6.b(vb6Var, l, l2, null, new a(l, E, l2, vb6Var), 4, null);
    }
}
