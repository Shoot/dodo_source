package androidx.compose.foundation.layout;

import defpackage.gb8;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Padding.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B:\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010%\u001a\u00020\u001eø\u0001\u0001¢\u0006\u0004\b&\u0010'J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR+\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R+\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R+\u0010\u001d\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/c;", "Lzm5;", "Lsm6$c;", "Lvb6;", "Lmb6;", "measurable", "Lnr1;", "constraints", "Ltb6;", "p", "(Lvb6;Lmb6;J)Ltb6;", "Li73;", "n", "F", "g1", "()F", "l1", "(F)V", "start", "o", "h1", "m1", "top", "getEnd-D9Ej5fM", "j1", "end", "q", "getBottom-D9Ej5fM", "i1", "bottom", "", "r", "Z", "f1", "()Z", "k1", "(Z)V", "rtlAware", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class c extends sm6.c implements zm5 {
    private float n;
    private float o;
    private float p;
    private float q;
    private boolean r;

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<gb8.a, Unit> {
        final /* synthetic */ gb8 b;
        final /* synthetic */ vb6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(gb8 gb8Var, vb6 vb6Var) {
            super(1);
            this.b = gb8Var;
            this.c = vb6Var;
        }

        public final void a(gb8.a aVar) {
            z65.h(aVar, "$this$layout");
            if (c.this.f1()) {
                gb8.a.r(aVar, this.b, this.c.O(c.this.g1()), this.c.O(c.this.h1()), 0.0f, 4, null);
            } else {
                gb8.a.n(aVar, this.b, this.c.O(c.this.g1()), this.c.O(c.this.h1()), 0.0f, 4, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    public /* synthetic */ c(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    public final boolean f1() {
        return this.r;
    }

    public final float g1() {
        return this.n;
    }

    public final float h1() {
        return this.o;
    }

    public final void i1(float f) {
        this.q = f;
    }

    public final void j1(float f) {
        this.p = f;
    }

    public final void k1(boolean z) {
        this.r = z;
    }

    public final void l1(float f) {
        this.n = f;
    }

    public final void m1(float f) {
        this.o = f;
    }

    @Override // defpackage.zm5
    public tb6 p(vb6 vb6Var, mb6 mb6Var, long j) {
        z65.h(vb6Var, "$this$measure");
        z65.h(mb6Var, "measurable");
        int O = vb6Var.O(this.n) + vb6Var.O(this.p);
        int O2 = vb6Var.O(this.o) + vb6Var.O(this.q);
        gb8 E = mb6Var.E(qr1.h(j, -O, -O2));
        return ub6.b(vb6Var, qr1.g(j, E.y0() + O), qr1.f(j, E.e0() + O2), null, new a(E, vb6Var), 4, null);
    }

    private c(float f, float f2, float f3, float f4, boolean z) {
        this.n = f;
        this.o = f2;
        this.p = f3;
        this.q = f4;
        this.r = z;
    }
}
