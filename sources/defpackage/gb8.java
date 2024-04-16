package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: Placeable.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J;\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R3\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR3\u0010$\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020 8\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR-\u0010'\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048\u0004@BX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u0014\u0010)\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0012R\u0014\u0010+\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006."}, d2 = {"Lgb8;", "", "", "C0", "Ls55;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "D0", "(JFLkotlin/jvm/functions/Function1;)V", "", "<set-?>", "a", "I", "y0", "()I", "width", "b", "e0", "height", "Lw55;", "value", c.a, "J", "j0", "()J", "E0", "(J)V", "measuredSize", "Lnr1;", DateTokenConverter.CONVERTER_KEY, "x0", "F0", "measurementConstraints", e.a, "W", "apparentToRealOffset", "v0", "measuredWidth", "i0", "measuredHeight", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gb8  reason: default package */
/* loaded from: classes.dex */
public abstract class gb8 {
    private int a;
    private int b;
    private long c = x55.a(0, 0);
    private long d = hb8.a();
    private long e = s55.b.a();

    /* compiled from: Placeable.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006J$\u0010\n\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006J)\u0010\r\u001a\u00020\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0012\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000fJ:\u0010\u0013\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000fJ?\u0010\u0014\u001a\u00020\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00038$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lgb8$a;", "", "Lgb8;", "", "x", "y", "", "zIndex", "", "q", Image.TYPE_MEDIUM, "Ls55;", "position", "o", "(Lgb8;JF)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", Image.TYPE_SMALL, "u", "w", "(Lgb8;JFLkotlin/jvm/functions/Function1;)V", "l", "()I", "parentWidth", "Lqm5;", "k", "()Lqm5;", "parentLayoutDirection", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gb8$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static final C0324a a = new C0324a(null);
        private static qm5 b = qm5.Ltr;
        private static int c;
        private static om5 d;
        private static jn5 e;

        /* compiled from: Placeable.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lgb8$a$a;", "Lgb8$a;", "Lsy5;", Action.SCOPE_ATTRIBUTE, "", "A", "Lqm5;", "<set-?>", "parentLayoutDirection", "Lqm5;", "k", "()Lqm5;", "", "parentWidth", "I", "l", "()I", "Lom5;", "_coordinates", "Lom5;", "Ljn5;", "layoutDelegate", "Ljn5;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: gb8$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0324a extends a {
            public /* synthetic */ C0324a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final boolean A(sy5 sy5Var) {
                if (sy5Var == null) {
                    a.d = null;
                    a.e = null;
                    return false;
                }
                boolean Q0 = sy5Var.Q0();
                sy5 N0 = sy5Var.N0();
                if (N0 != null && N0.Q0()) {
                    sy5Var.T0(true);
                }
                a.e = sy5Var.L0().O();
                if (sy5Var.Q0() || sy5Var.R0()) {
                    a.d = null;
                } else {
                    a.d = sy5Var.J0();
                }
                return Q0;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // defpackage.gb8.a
            public qm5 k() {
                return a.b;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // defpackage.gb8.a
            public int l() {
                return a.c;
            }

            private C0324a() {
            }
        }

        public static /* synthetic */ void n(a aVar, gb8 gb8Var, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                aVar.m(gb8Var, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        public static /* synthetic */ void p(a aVar, gb8 gb8Var, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                aVar.o(gb8Var, j, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        public static /* synthetic */ void r(a aVar, gb8 gb8Var, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                aVar.q(gb8Var, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        public static /* synthetic */ void t(a aVar, gb8 gb8Var, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            float f2;
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f2 = 0.0f;
                } else {
                    f2 = f;
                }
                Function1 function12 = function1;
                if ((i3 & 8) != 0) {
                    function12 = hb8.b();
                }
                aVar.s(gb8Var, i, i2, f2, function12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        public static /* synthetic */ void v(a aVar, gb8 gb8Var, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            float f2;
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f2 = 0.0f;
                } else {
                    f2 = f;
                }
                Function1 function12 = function1;
                if ((i3 & 8) != 0) {
                    function12 = hb8.b();
                }
                aVar.u(gb8Var, i, i2, f2, function12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract qm5 k();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int l();

        public final void m(gb8 gb8Var, int i, int i2, float f) {
            z65.h(gb8Var, "<this>");
            long a2 = t55.a(i, i2);
            long j = gb8Var.e;
            gb8Var.D0(t55.a(s55.h(a2) + s55.h(j), s55.i(a2) + s55.i(j)), f, null);
        }

        public final void o(gb8 gb8Var, long j, float f) {
            z65.h(gb8Var, "$this$place");
            long j2 = gb8Var.e;
            gb8Var.D0(t55.a(s55.h(j) + s55.h(j2), s55.i(j) + s55.i(j2)), f, null);
        }

        public final void q(gb8 gb8Var, int i, int i2, float f) {
            z65.h(gb8Var, "<this>");
            long a2 = t55.a(i, i2);
            if (k() == qm5.Ltr || l() == 0) {
                long j = gb8Var.e;
                gb8Var.D0(t55.a(s55.h(a2) + s55.h(j), s55.i(a2) + s55.i(j)), f, null);
                return;
            }
            long a3 = t55.a((l() - gb8Var.y0()) - s55.h(a2), s55.i(a2));
            long j2 = gb8Var.e;
            gb8Var.D0(t55.a(s55.h(a3) + s55.h(j2), s55.i(a3) + s55.i(j2)), f, null);
        }

        public final void s(gb8 gb8Var, int i, int i2, float f, Function1<? super androidx.compose.ui.graphics.c, Unit> function1) {
            z65.h(gb8Var, "<this>");
            z65.h(function1, "layerBlock");
            long a2 = t55.a(i, i2);
            if (k() == qm5.Ltr || l() == 0) {
                long j = gb8Var.e;
                gb8Var.D0(t55.a(s55.h(a2) + s55.h(j), s55.i(a2) + s55.i(j)), f, function1);
                return;
            }
            long a3 = t55.a((l() - gb8Var.y0()) - s55.h(a2), s55.i(a2));
            long j2 = gb8Var.e;
            gb8Var.D0(t55.a(s55.h(a3) + s55.h(j2), s55.i(a3) + s55.i(j2)), f, function1);
        }

        public final void u(gb8 gb8Var, int i, int i2, float f, Function1<? super androidx.compose.ui.graphics.c, Unit> function1) {
            z65.h(gb8Var, "<this>");
            z65.h(function1, "layerBlock");
            long a2 = t55.a(i, i2);
            long j = gb8Var.e;
            gb8Var.D0(t55.a(s55.h(a2) + s55.h(j), s55.i(a2) + s55.i(j)), f, function1);
        }

        public final void w(gb8 gb8Var, long j, float f, Function1<? super androidx.compose.ui.graphics.c, Unit> function1) {
            z65.h(gb8Var, "$this$placeWithLayer");
            z65.h(function1, "layerBlock");
            long j2 = gb8Var.e;
            gb8Var.D0(t55.a(s55.h(j) + s55.h(j2), s55.i(j) + s55.i(j2)), f, function1);
        }
    }

    private final void C0() {
        int l;
        int l2;
        l = i.l(w55.g(this.c), nr1.p(this.d), nr1.n(this.d));
        this.a = l;
        l2 = i.l(w55.f(this.c), nr1.o(this.d), nr1.m(this.d));
        this.b = l2;
        this.e = t55.a((this.a - w55.g(this.c)) / 2, (this.b - w55.f(this.c)) / 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void D0(long j, float f, Function1<? super androidx.compose.ui.graphics.c, Unit> function1);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E0(long j) {
        if (!w55.e(this.c, j)) {
            this.c = j;
            C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F0(long j) {
        if (!nr1.g(this.d, j)) {
            this.d = j;
            C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long W() {
        return this.e;
    }

    public final int e0() {
        return this.b;
    }

    public int i0() {
        return w55.f(this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long j0() {
        return this.c;
    }

    public int v0() {
        return w55.g(this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long x0() {
        return this.d;
    }

    public final int y0() {
        return this.a;
    }
}
