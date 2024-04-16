package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.en5;
import defpackage.um7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: MeasureAndLayoutDelegate.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\bM\u0010NJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0006J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0006J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0006J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018J\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cJ\u0016\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006J\u0010\u0010!\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u0006J\u000e\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0002R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001c008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R$\u00109\u001a\u0002042\u0006\u00105\u001a\u0002048F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R!\u0010=\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010<R\u0016\u0010A\u001a\u0004\u0018\u00010>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0018\u0010E\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010CR\u0018\u0010G\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010CR\u0011\u0010J\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010L\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bK\u0010I\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006O"}, d2 = {"Lob6;", "", "Len5;", "layoutNode", "Lnr1;", "constraints", "", "f", "(Len5;Lnr1;)Z", "g", "", "r", com.huawei.hms.opendevice.c.a, "affectsLookahead", "t", "v", "F", "(J)V", "forced", "y", "D", "w", "B", "A", "Lkotlin/Function0;", "onLayout", "o", "p", "Lum7$b;", "listener", Image.TYPE_SMALL, Image.TYPE_HIGH, "forceDispatch", DateTokenConverter.CONVERTER_KEY, "node", "q", "a", "Len5;", "root", "Lk03;", "b", "Lk03;", "relayoutNodes", "Z", "duringMeasureLayout", "Lu87;", "Lu87;", "onPositionedDispatcher", "Lgr6;", e.a, "Lgr6;", "onLayoutCompletedListeners", "", "<set-?>", "J", "n", "()J", "measureIteration", "Lob6$a;", "postponedMeasureRequests", "Lnr1;", "rootConstraints", "Lln5;", "i", "Lln5;", "consistencyChecker", Image.TYPE_MEDIUM, "(Len5;)Z", "measureAffectsParent", "canAffectParent", "j", "canAffectParentInLookahead", "k", "()Z", "hasPendingMeasureOrLayout", "l", "hasPendingOnPositionedCallbacks", "<init>", "(Len5;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ob6 */
/* loaded from: classes.dex */
public final class ob6 {
    private final en5 a;
    private final k03 b;
    private boolean c;
    private final u87 d;
    private final gr6<um7.b> e;
    private long f;
    private final gr6<a> g;
    private nr1 h;
    private final ln5 i;

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u0010"}, d2 = {"Lob6$a;", "", "Len5;", "a", "Len5;", "()Len5;", "node", "", "b", "Z", com.huawei.hms.opendevice.c.a, "()Z", "isLookahead", "isForced", "<init>", "(Len5;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ob6$a */
    /* loaded from: classes.dex */
    public static final class a {
        private final en5 a;
        private final boolean b;
        private final boolean c;

        public a(en5 en5Var, boolean z, boolean z2) {
            z65.h(en5Var, "node");
            this.a = en5Var;
            this.b = z;
            this.c = z2;
        }

        public final en5 a() {
            return this.a;
        }

        public final boolean b() {
            return this.c;
        }

        public final boolean c() {
            return this.b;
        }
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ob6$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[en5.e.values().length];
            try {
                iArr[en5.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[en5.e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[en5.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[en5.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[en5.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "it", "", "a", "(Len5;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ob6$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<en5, Boolean> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(en5 en5Var) {
            boolean X;
            z65.h(en5Var, "it");
            if (this.a) {
                X = en5Var.S();
            } else {
                X = en5Var.X();
            }
            return Boolean.valueOf(X);
        }
    }

    public ob6(en5 en5Var) {
        ln5 ln5Var;
        z65.h(en5Var, "root");
        this.a = en5Var;
        um7.a aVar = um7.P;
        k03 k03Var = new k03(aVar.a());
        this.b = k03Var;
        this.d = new u87();
        this.e = new gr6<>(new um7.b[16], 0);
        this.f = 1L;
        gr6<a> gr6Var = new gr6<>(new a[16], 0);
        this.g = gr6Var;
        if (aVar.a()) {
            ln5Var = new ln5(en5Var, k03Var, gr6Var.h());
        } else {
            ln5Var = null;
        }
        this.i = ln5Var;
    }

    public static /* synthetic */ boolean C(ob6 ob6Var, en5 en5Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ob6Var.B(en5Var, z);
    }

    public static /* synthetic */ boolean E(ob6 ob6Var, en5 en5Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ob6Var.D(en5Var, z);
    }

    private final void c() {
        gr6<um7.b> gr6Var = this.e;
        int s = gr6Var.s();
        if (s > 0) {
            um7.b[] r = gr6Var.r();
            int i = 0;
            do {
                r[i].g();
                i++;
            } while (i < s);
            this.e.k();
        }
        this.e.k();
    }

    public static /* synthetic */ void e(ob6 ob6Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        ob6Var.d(z);
    }

    private final boolean f(en5 en5Var, nr1 nr1Var) {
        boolean G0;
        if (en5Var.U() == null) {
            return false;
        }
        if (nr1Var != null) {
            G0 = en5Var.F0(nr1Var);
        } else {
            G0 = en5.G0(en5Var, null, 1, null);
        }
        en5 h0 = en5Var.h0();
        if (G0 && h0 != null) {
            if (h0.U() == null) {
                E(this, h0, false, 2, null);
            } else if (en5Var.a0() == en5.g.InMeasureBlock) {
                z(this, h0, false, 2, null);
            } else if (en5Var.a0() == en5.g.InLayoutBlock) {
                x(this, h0, false, 2, null);
            }
        }
        return G0;
    }

    private final boolean g(en5 en5Var, nr1 nr1Var) {
        boolean T0;
        if (nr1Var != null) {
            T0 = en5Var.S0(nr1Var);
        } else {
            T0 = en5.T0(en5Var, null, 1, null);
        }
        en5 h0 = en5Var.h0();
        if (T0 && h0 != null) {
            if (en5Var.Z() == en5.g.InMeasureBlock) {
                E(this, h0, false, 2, null);
            } else if (en5Var.Z() == en5.g.InLayoutBlock) {
                C(this, h0, false, 2, null);
            }
        }
        return T0;
    }

    private final boolean i(en5 en5Var) {
        if (en5Var.X() && m(en5Var)) {
            return true;
        }
        return false;
    }

    private final boolean j(en5 en5Var) {
        jb d;
        if (en5Var.S()) {
            if (en5Var.a0() == en5.g.InMeasureBlock) {
                return true;
            }
            kb z = en5Var.O().z();
            if (z != null && (d = z.d()) != null && d.k()) {
                return true;
            }
        }
        return false;
    }

    private final boolean m(en5 en5Var) {
        if (en5Var.Z() != en5.g.InMeasureBlock && !en5Var.O().q().d().k()) {
            return false;
        }
        return true;
    }

    private final void r(en5 en5Var) {
        v(en5Var);
        gr6<en5> o0 = en5Var.o0();
        int s = o0.s();
        if (s > 0) {
            en5[] r = o0.r();
            int i = 0;
            do {
                en5 en5Var2 = r[i];
                if (m(en5Var2)) {
                    r(en5Var2);
                }
                i++;
            } while (i < s);
            v(en5Var);
        }
        v(en5Var);
    }

    public final boolean t(en5 en5Var, boolean z) {
        nr1 nr1Var;
        boolean z2;
        boolean g;
        int i = 0;
        if (!en5Var.b() && !i(en5Var) && !z65.c(en5Var.D0(), Boolean.TRUE) && !j(en5Var) && !en5Var.A()) {
            return false;
        }
        if (!en5Var.S() && !en5Var.X()) {
            g = false;
            z2 = false;
        } else {
            if (en5Var == this.a) {
                nr1Var = this.h;
                z65.e(nr1Var);
            } else {
                nr1Var = null;
            }
            if (en5Var.S() && z) {
                z2 = f(en5Var, nr1Var);
            } else {
                z2 = false;
            }
            g = g(en5Var, nr1Var);
        }
        if ((z2 || en5Var.R()) && z65.c(en5Var.D0(), Boolean.TRUE) && z) {
            en5Var.H0();
        }
        if (en5Var.P() && en5Var.b()) {
            if (en5Var == this.a) {
                en5Var.Q0(0, 0);
            } else {
                en5Var.W0();
            }
            this.d.d(en5Var);
            ln5 ln5Var = this.i;
            if (ln5Var != null) {
                ln5Var.a();
            }
        }
        if (this.g.v()) {
            gr6<a> gr6Var = this.g;
            int s = gr6Var.s();
            if (s > 0) {
                a[] r = gr6Var.r();
                do {
                    a aVar = r[i];
                    if (aVar.a().C0()) {
                        if (!aVar.c()) {
                            D(aVar.a(), aVar.b());
                        } else {
                            y(aVar.a(), aVar.b());
                        }
                    }
                    i++;
                } while (i < s);
                this.g.k();
            } else {
                this.g.k();
            }
        }
        return g;
    }

    static /* synthetic */ boolean u(ob6 ob6Var, en5 en5Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return ob6Var.t(en5Var, z);
    }

    private final void v(en5 en5Var) {
        nr1 nr1Var;
        if (!en5Var.X() && !en5Var.S()) {
            return;
        }
        if (en5Var == this.a) {
            nr1Var = this.h;
            z65.e(nr1Var);
        } else {
            nr1Var = null;
        }
        if (en5Var.S()) {
            f(en5Var, nr1Var);
        }
        g(en5Var, nr1Var);
    }

    public static /* synthetic */ boolean x(ob6 ob6Var, en5 en5Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ob6Var.w(en5Var, z);
    }

    public static /* synthetic */ boolean z(ob6 ob6Var, en5 en5Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ob6Var.y(en5Var, z);
    }

    public final void A(en5 en5Var) {
        z65.h(en5Var, "layoutNode");
        this.d.d(en5Var);
    }

    public final boolean B(en5 en5Var, boolean z) {
        en5 h0;
        z65.h(en5Var, "layoutNode");
        int i = b.$EnumSwitchMapping$0[en5Var.Q().ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            if (i == 5) {
                if (!z && (en5Var.X() || en5Var.P())) {
                    ln5 ln5Var = this.i;
                    if (ln5Var == null) {
                        return false;
                    }
                    ln5Var.a();
                    return false;
                }
                en5Var.I0();
                if (en5Var.b() && (((h0 = en5Var.h0()) == null || !h0.P()) && (h0 == null || !h0.X()))) {
                    this.b.c(en5Var, false);
                }
                if (this.c) {
                    return false;
                }
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        ln5 ln5Var2 = this.i;
        if (ln5Var2 == null) {
            return false;
        }
        ln5Var2.a();
        return false;
    }

    public final boolean D(en5 en5Var, boolean z) {
        en5 h0;
        z65.h(en5Var, "layoutNode");
        int i = b.$EnumSwitchMapping$0[en5Var.Q().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    if (!en5Var.X() || z) {
                        en5Var.L0();
                        if ((en5Var.b() || i(en5Var)) && ((h0 = en5Var.h0()) == null || !h0.X())) {
                            this.b.c(en5Var, false);
                        }
                        if (!this.c) {
                            return true;
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                this.g.b(new a(en5Var, false, z));
                ln5 ln5Var = this.i;
                if (ln5Var != null) {
                    ln5Var.a();
                }
            }
        }
        return false;
    }

    public final void F(long j) {
        nr1 nr1Var = this.h;
        if (nr1Var == null || !nr1.g(nr1Var.s(), j)) {
            boolean z = true;
            if (!this.c) {
                this.h = nr1.b(j);
                if (this.a.U() != null) {
                    this.a.K0();
                }
                this.a.L0();
                k03 k03Var = this.b;
                en5 en5Var = this.a;
                if (en5Var.U() == null) {
                    z = false;
                }
                k03Var.c(en5Var, z);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void d(boolean z) {
        if (z) {
            this.d.e(this.a);
        }
        this.d.a();
    }

    public final void h(en5 en5Var, boolean z) {
        z65.h(en5Var, "layoutNode");
        if (this.b.f()) {
            return;
        }
        if (this.c) {
            c cVar = new c(z);
            if (!cVar.invoke(en5Var).booleanValue()) {
                gr6<en5> o0 = en5Var.o0();
                int s = o0.s();
                if (s > 0) {
                    en5[] r = o0.r();
                    int i = 0;
                    do {
                        en5 en5Var2 = r[i];
                        if (cVar.invoke(en5Var2).booleanValue() && this.b.i(en5Var2, z)) {
                            t(en5Var2, z);
                        }
                        if (!cVar.invoke(en5Var2).booleanValue()) {
                            h(en5Var2, z);
                        }
                        i++;
                    } while (i < s);
                    if (!cVar.invoke(en5Var).booleanValue() && this.b.i(en5Var, z)) {
                        u(this, en5Var, false, 2, null);
                        return;
                    }
                    return;
                } else if (!cVar.invoke(en5Var).booleanValue()) {
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean k() {
        return this.b.g();
    }

    public final boolean l() {
        return this.d.c();
    }

    public final long n() {
        if (this.c) {
            return this.f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean o(Function0<Unit> function0) {
        boolean z;
        j03 j03Var;
        if (this.a.C0()) {
            if (this.a.b()) {
                if (!this.c) {
                    boolean z2 = false;
                    if (this.h != null) {
                        this.c = true;
                        try {
                            if (this.b.g()) {
                                k03 k03Var = this.b;
                                z = false;
                                while (k03Var.g()) {
                                    j03Var = k03Var.a;
                                    boolean z3 = !j03Var.d();
                                    en5 e = (z3 ? k03Var.a : k03Var.b).e();
                                    boolean t = t(e, z3);
                                    if (e == this.a && t) {
                                        z = true;
                                    }
                                }
                                if (function0 != null) {
                                    function0.invoke();
                                }
                            } else {
                                z = false;
                            }
                            this.c = false;
                            ln5 ln5Var = this.i;
                            if (ln5Var != null) {
                                ln5Var.a();
                            }
                            z2 = z;
                        } catch (Throwable th) {
                            this.c = false;
                            throw th;
                        }
                    }
                    c();
                    return z2;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void p() {
        if (this.a.C0()) {
            if (this.a.b()) {
                if (!this.c) {
                    if (this.h != null) {
                        this.c = true;
                        try {
                            r(this.a);
                            this.c = false;
                            ln5 ln5Var = this.i;
                            if (ln5Var != null) {
                                ln5Var.a();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            this.c = false;
                            throw th;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void q(en5 en5Var) {
        z65.h(en5Var, "node");
        this.b.h(en5Var);
    }

    public final void s(um7.b bVar) {
        z65.h(bVar, "listener");
        this.e.b(bVar);
    }

    public final boolean w(en5 en5Var, boolean z) {
        en5 h0;
        z65.h(en5Var, "layoutNode");
        int i = b.$EnumSwitchMapping$0[en5Var.Q().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((en5Var.S() || en5Var.R()) && !z) {
                ln5 ln5Var = this.i;
                if (ln5Var == null) {
                    return false;
                }
                ln5Var.a();
                return false;
            }
            en5Var.J0();
            en5Var.I0();
            if (z65.c(en5Var.D0(), Boolean.TRUE) && (((h0 = en5Var.h0()) == null || !h0.S()) && (h0 == null || !h0.R()))) {
                this.b.c(en5Var, true);
            }
            if (this.c) {
                return false;
            }
            return true;
        }
        ln5 ln5Var2 = this.i;
        if (ln5Var2 == null) {
            return false;
        }
        ln5Var2.a();
        return false;
    }

    public final boolean y(en5 en5Var, boolean z) {
        en5 h0;
        z65.h(en5Var, "layoutNode");
        if (en5Var.U() != null) {
            int i = b.$EnumSwitchMapping$0[en5Var.Q().ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    if (en5Var.S() && !z) {
                        return false;
                    }
                    en5Var.K0();
                    en5Var.L0();
                    if ((z65.c(en5Var.D0(), Boolean.TRUE) || j(en5Var)) && ((h0 = en5Var.h0()) == null || !h0.S())) {
                        this.b.c(en5Var, true);
                    }
                    if (this.c) {
                        return false;
                    }
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            this.g.b(new a(en5Var, true, z));
            ln5 ln5Var = this.i;
            if (ln5Var == null) {
                return false;
            }
            ln5Var.a();
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }
}
