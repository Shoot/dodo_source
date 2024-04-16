package androidx.compose.foundation.layout;

import defpackage.gb8;
import defpackage.i73;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B:\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010%\u001a\u00020\u001eø\u0001\u0001¢\u0006\u0004\b*\u0010+J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR+\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R+\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R+\u0010\u001d\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R!\u0010)\u001a\u00020\u0006*\u00020&8BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/e;", "Lzm5;", "Lsm6$c;", "Lvb6;", "Lmb6;", "measurable", "Lnr1;", "constraints", "Ltb6;", "p", "(Lvb6;Lmb6;J)Ltb6;", "Li73;", "n", "F", "getMinWidth-D9Ej5fM", "()F", "k1", "(F)V", "minWidth", "o", "getMinHeight-D9Ej5fM", "j1", "minHeight", "getMaxWidth-D9Ej5fM", "i1", "maxWidth", "q", "getMaxHeight-D9Ej5fM", "h1", "maxHeight", "", "r", "Z", "getEnforceIncoming", "()Z", "g1", "(Z)V", "enforceIncoming", "La03;", "f1", "(La03;)J", "targetConstraints", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class e extends sm6.c implements zm5 {
    private float n;
    private float o;
    private float p;
    private float q;
    private boolean r;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<gb8.a, Unit> {
        final /* synthetic */ gb8 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(gb8 gb8Var) {
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

    public /* synthetic */ e(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (r5 != Integer.MAX_VALUE) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long f1(defpackage.a03 r8) {
        /*
            r7 = this;
            float r0 = r7.p
            i73$a r1 = defpackage.i73.b
            float r2 = r1.b()
            boolean r0 = defpackage.i73.q(r0, r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L1d
            float r0 = r7.p
            int r0 = r8.O(r0)
            int r0 = kotlin.ranges.g.e(r0, r3)
            goto L20
        L1d:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L20:
            float r4 = r7.q
            float r5 = r1.b()
            boolean r4 = defpackage.i73.q(r4, r5)
            if (r4 != 0) goto L37
            float r4 = r7.q
            int r4 = r8.O(r4)
            int r4 = kotlin.ranges.g.e(r4, r3)
            goto L3a
        L37:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L3a:
            float r5 = r7.n
            float r6 = r1.b()
            boolean r5 = defpackage.i73.q(r5, r6)
            if (r5 != 0) goto L57
            float r5 = r7.n
            int r5 = r8.O(r5)
            int r5 = kotlin.ranges.g.h(r5, r0)
            int r5 = kotlin.ranges.g.e(r5, r3)
            if (r5 == r2) goto L57
            goto L58
        L57:
            r5 = 0
        L58:
            float r6 = r7.o
            float r1 = r1.b()
            boolean r1 = defpackage.i73.q(r6, r1)
            if (r1 != 0) goto L75
            float r1 = r7.o
            int r8 = r8.O(r1)
            int r8 = kotlin.ranges.g.h(r8, r4)
            int r8 = kotlin.ranges.g.e(r8, r3)
            if (r8 == r2) goto L75
            r3 = r8
        L75:
            long r0 = defpackage.qr1.a(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.e.f1(a03):long");
    }

    public final void g1(boolean z) {
        this.r = z;
    }

    public final void h1(float f) {
        this.q = f;
    }

    public final void i1(float f) {
        this.p = f;
    }

    public final void j1(float f) {
        this.o = f;
    }

    public final void k1(float f) {
        this.n = f;
    }

    @Override // defpackage.zm5
    public tb6 p(vb6 vb6Var, mb6 mb6Var, long j) {
        int h;
        int e;
        int h2;
        int e2;
        long a2;
        z65.h(vb6Var, "$this$measure");
        z65.h(mb6Var, "measurable");
        long f1 = f1(vb6Var);
        if (this.r) {
            a2 = qr1.e(j, f1);
        } else {
            float f = this.n;
            i73.a aVar = i73.b;
            if (i73.q(f, aVar.b())) {
                h = i.h(nr1.p(j), nr1.n(f1));
            } else {
                h = nr1.p(f1);
            }
            if (i73.q(this.p, aVar.b())) {
                e = i.e(nr1.n(j), nr1.p(f1));
            } else {
                e = nr1.n(f1);
            }
            if (i73.q(this.o, aVar.b())) {
                h2 = i.h(nr1.o(j), nr1.m(f1));
            } else {
                h2 = nr1.o(f1);
            }
            if (i73.q(this.q, aVar.b())) {
                e2 = i.e(nr1.m(j), nr1.o(f1));
            } else {
                e2 = nr1.m(f1);
            }
            a2 = qr1.a(h, e, h2, e2);
        }
        gb8 E = mb6Var.E(a2);
        return ub6.b(vb6Var, E.y0(), E.e0(), null, new a(E), 4, null);
    }

    private e(float f, float f2, float f3, float f4, boolean z) {
        this.n = f;
        this.o = f2;
        this.p = f3;
        this.q = f4;
        this.r = z;
    }
}
