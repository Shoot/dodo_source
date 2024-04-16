package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import defpackage.um7;
import im.threads.business.transport.MessageAttributes;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: BackwardsCompatNode.kt */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0017\u001a\u00020I¢\u0006\u0004\bm\u0010PJ\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0014\u0010\u0018\u001a\u00020\u00102\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u000f\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0010J)\u0010%\u001a\u00020$*\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\f\u0010(\u001a\u00020\u0010*\u00020'H\u0016J\f\u0010*\u001a\u00020\u0010*\u00020)H\u0016J-\u00101\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\b\u00103\u001a\u00020\u0010H\u0016J\b\u00104\u001a\u00020\u0012H\u0016J\b\u00105\u001a\u00020\u0012H\u0016J\u0018\u00109\u001a\u0004\u0018\u000107*\u0002062\b\u00108\u001a\u0004\u0018\u000107H\u0016J\u0010\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0016J\u001d\u0010>\u001a\u00020\u00102\u0006\u0010=\u001a\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010C\u001a\u00020\u00102\u0006\u0010B\u001a\u00020AH\u0016J\u0010\u0010F\u001a\u00020\u00102\u0006\u0010E\u001a\u00020DH\u0016J\b\u0010H\u001a\u00020GH\u0016R*\u0010\u0017\u001a\u00020I2\u0006\u0010J\u001a\u00020I8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010UR:\u0010_\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030X0Wj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030X`Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0018\u0010a\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010`R\u0014\u0010e\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR$\u0010i\u001a\u00028\u0000\"\u0004\b\u0000\u0010f*\b\u0012\u0004\u0012\u00028\u00000X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006n"}, d2 = {"Lk60;", "Lzm5;", "Lv73;", "Lyaa;", "Lfe8;", "Lan6;", "Ldn6;", "Lwq7;", "Lkm5;", "Ljg4;", "Lu14;", "Lg24;", "Lj24;", "Lvm7;", "Lkh0;", "Lsm6$c;", "", "l1", "", "duringAttach", "i1", "m1", "Lcn6;", "element", "o1", "P0", "Q0", "i0", "j1", "()V", "n1", "Lvb6;", "Lmb6;", "measurable", "Lnr1;", "constraints", "Ltb6;", "p", "(Lvb6;Lmb6;J)Ltb6;", "Lit1;", "q", "Ljba;", "U", "Lkd8;", "pointerEvent", "Lmd8;", "pass", "Lw55;", "bounds", "v", "(Lkd8;Lmd8;J)V", "h0", "v0", "B", "La03;", "", "parentData", DateTokenConverter.CONVERTER_KEY, "Lom5;", MessageAttributes.COORDINATES, e.a, "size", "b", "(J)V", Image.TYPE_MEDIUM, "Lk24;", "focusState", "r", "Landroidx/compose/ui/focus/e;", "focusProperties", "e0", "", "toString", "Lsm6$b;", "value", "n", "Lsm6$b;", "g1", "()Lsm6$b;", "k1", "(Lsm6$b;)V", "o", "Z", "invalidateCache", "Lj60;", "Lj60;", "_providedValues", "Ljava/util/HashSet;", "Lum6;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "h1", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "Lom5;", "lastOnPlacedCoordinates", "Lym6;", "D", "()Lym6;", "providedValues", "T", "E", "(Lum6;)Ljava/lang/Object;", "current", "b0", "()Z", "isValidOwnerScope", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: k60  reason: default package */
/* loaded from: classes.dex */
public final class k60 extends sm6.c implements zm5, v73, yaa, fe8, an6, dn6, wq7, km5, jg4, u14, g24, j24, vm7, kh0 {
    private sm6.b n;
    private boolean o;
    private j60 p;
    private HashSet<um6<?>> q;
    private om5 r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k60$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k60.this.n1();
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"k60$b", "Lum7$b;", "", "g", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: k60$b */
    /* loaded from: classes.dex */
    public static final class b implements um7.b {
        b() {
        }

        @Override // defpackage.um7.b
        public void g() {
            if (k60.this.r == null) {
                k60 k60Var = k60.this;
                k60Var.m(au2.h(k60Var, qz6.a(128)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k60$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ sm6.b a;
        final /* synthetic */ k60 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(sm6.b bVar, k60 k60Var) {
            super(0);
            this.a = bVar;
            this.b = k60Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((q73) this.a).k(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k60$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            sm6.b g1 = k60.this.g1();
            z65.f(g1, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((vm6) g1).a(k60.this);
        }
    }

    public k60(sm6.b bVar) {
        z65.h(bVar, "element");
        Z0(rz6.f(bVar));
        this.n = bVar;
        this.o = true;
        this.q = new HashSet<>();
    }

    private final void i1(boolean z) {
        if (M0()) {
            sm6.b bVar = this.n;
            if ((qz6.a(32) & H0()) != 0) {
                if (bVar instanceof vm6) {
                    d1(new a());
                }
                if (bVar instanceof cn6) {
                    o1((cn6) bVar);
                }
            }
            if ((qz6.a(4) & H0()) != 0) {
                if (bVar instanceof q73) {
                    this.o = true;
                }
                if (!z) {
                    cn5.a(this);
                }
            }
            if ((qz6.a(2) & H0()) != 0) {
                if (l60.d(this)) {
                    oz6 E0 = E0();
                    z65.e(E0);
                    ((an5) E0).t2(this);
                    E0.Q1();
                }
                if (!z) {
                    cn5.a(this);
                    au2.i(this).y0();
                }
            }
            if (bVar instanceof vc9) {
                ((vc9) bVar).j(au2.i(this));
            }
            if ((qz6.a(128) & H0()) != 0) {
                if ((bVar instanceof x87) && l60.d(this)) {
                    au2.i(this).y0();
                }
                if (bVar instanceof t87) {
                    this.r = null;
                    if (l60.d(this)) {
                        au2.j(this).e(new b());
                    }
                }
            }
            if ((qz6.a(256) & H0()) != 0 && (bVar instanceof g87) && l60.d(this)) {
                au2.i(this).y0();
            }
            if (bVar instanceof i24) {
                ((i24) bVar).g().d().b(this);
            }
            if ((qz6.a(16) & H0()) != 0 && (bVar instanceof de8)) {
                ((de8) bVar).l();
                E0();
                throw null;
            } else if ((qz6.a(8) & H0()) != 0) {
                au2.j(this).p();
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void l1() {
        if (M0()) {
            sm6.b bVar = this.n;
            if ((qz6.a(32) & H0()) != 0) {
                if (bVar instanceof cn6) {
                    au2.j(this).getModifierLocalManager().d(this, ((cn6) bVar).getKey());
                }
                if (bVar instanceof vm6) {
                    ((vm6) bVar).a(l60.a());
                }
            }
            if ((qz6.a(8) & H0()) != 0) {
                au2.j(this).p();
            }
            if (bVar instanceof i24) {
                ((i24) bVar).g().d().x(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void m1() {
        sm6.b bVar = this.n;
        if (bVar instanceof q73) {
            au2.j(this).getSnapshotObserver().h(this, l60.b(), new c(bVar, this));
        }
        this.o = false;
    }

    private final void o1(cn6<?> cn6Var) {
        j60 j60Var = this.p;
        if (j60Var != null && j60Var.a(cn6Var.getKey())) {
            j60Var.c(cn6Var);
            au2.j(this).getModifierLocalManager().f(this, cn6Var.getKey());
            return;
        }
        this.p = new j60(cn6Var);
        if (l60.d(this)) {
            au2.j(this).getModifierLocalManager().a(this, cn6Var.getKey());
        }
    }

    @Override // defpackage.fe8
    public boolean B() {
        sm6.b bVar = this.n;
        z65.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((de8) bVar).l();
        throw null;
    }

    @Override // defpackage.an6
    public ym6 D() {
        j60 j60Var = this.p;
        if (j60Var == null) {
            return bn6.a();
        }
        return j60Var;
    }

    @Override // defpackage.dn6
    public <T> T E(um6<T> um6Var) {
        mz6 e0;
        z65.h(um6Var, "<this>");
        this.q.add(um6Var);
        int a2 = qz6.a(32);
        if (I().M0()) {
            sm6.c J0 = I().J0();
            en5 i = au2.i(this);
            while (i != null) {
                if ((i.e0().k().C0() & a2) != 0) {
                    while (J0 != null) {
                        if ((J0.H0() & a2) != 0) {
                            sm6.c cVar = J0;
                            gr6 gr6Var = null;
                            while (cVar != null) {
                                if (cVar instanceof an6) {
                                    an6 an6Var = (an6) cVar;
                                    if (an6Var.D().a(um6Var)) {
                                        return (T) an6Var.D().b(um6Var);
                                    }
                                } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                                    int i2 = 0;
                                    for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                        if ((g1.H0() & a2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar = g1;
                                            } else {
                                                if (gr6Var == null) {
                                                    gr6Var = new gr6(new sm6.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    gr6Var.b(cVar);
                                                    cVar = null;
                                                }
                                                gr6Var.b(g1);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar = au2.g(gr6Var);
                            }
                            continue;
                        }
                        J0 = J0.J0();
                    }
                }
                i = i.h0();
                if (i != null && (e0 = i.e0()) != null) {
                    J0 = e0.o();
                } else {
                    J0 = null;
                }
            }
            return um6Var.a().invoke();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @Override // defpackage.sm6.c
    public void P0() {
        i1(true);
    }

    @Override // defpackage.sm6.c
    public void Q0() {
        l1();
    }

    @Override // defpackage.yaa
    public void U(jba jbaVar) {
        z65.h(jbaVar, "<this>");
        sm6.b bVar = this.n;
        z65.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        ((taa) jbaVar).g(((vaa) bVar).n());
    }

    @Override // defpackage.km5
    public void b(long j) {
        sm6.b bVar = this.n;
        if (bVar instanceof x87) {
            ((x87) bVar).b(j);
        }
    }

    @Override // defpackage.vm7
    public boolean b0() {
        return M0();
    }

    @Override // defpackage.wq7
    public Object d(a03 a03Var, Object obj) {
        z65.h(a03Var, "<this>");
        sm6.b bVar = this.n;
        z65.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((vq7) bVar).d(a03Var, obj);
    }

    @Override // defpackage.jg4
    public void e(om5 om5Var) {
        z65.h(om5Var, MessageAttributes.COORDINATES);
        sm6.b bVar = this.n;
        z65.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((g87) bVar).e(om5Var);
    }

    @Override // defpackage.g24
    public void e0(androidx.compose.ui.focus.e eVar) {
        z65.h(eVar, "focusProperties");
        sm6.b bVar = this.n;
        if (bVar instanceof d24) {
            new e24((d24) bVar).invoke(eVar);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final sm6.b g1() {
        return this.n;
    }

    @Override // defpackage.fe8
    public void h0() {
        sm6.b bVar = this.n;
        z65.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((de8) bVar).l();
        throw null;
    }

    public final HashSet<um6<?>> h1() {
        return this.q;
    }

    @Override // defpackage.v73
    public void i0() {
        this.o = true;
        w73.a(this);
    }

    @Override // defpackage.fe8
    public /* synthetic */ void j0() {
        ee8.b(this);
    }

    public final void j1() {
        this.o = true;
        w73.a(this);
    }

    public final void k1(sm6.b bVar) {
        z65.h(bVar, "value");
        if (M0()) {
            l1();
        }
        this.n = bVar;
        Z0(rz6.f(bVar));
        if (M0()) {
            i1(false);
        }
    }

    @Override // defpackage.km5
    public void m(om5 om5Var) {
        z65.h(om5Var, MessageAttributes.COORDINATES);
        this.r = om5Var;
        sm6.b bVar = this.n;
        if (bVar instanceof t87) {
            ((t87) bVar).m(om5Var);
        }
    }

    public final void n1() {
        if (M0()) {
            this.q.clear();
            au2.j(this).getSnapshotObserver().h(this, l60.c(), new d());
        }
    }

    @Override // defpackage.zm5
    public tb6 p(vb6 vb6Var, mb6 mb6Var, long j) {
        z65.h(vb6Var, "$this$measure");
        z65.h(mb6Var, "measurable");
        sm6.b bVar = this.n;
        z65.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((ym5) bVar).p(vb6Var, mb6Var, j);
    }

    @Override // defpackage.v73
    public void q(it1 it1Var) {
        z65.h(it1Var, "<this>");
        sm6.b bVar = this.n;
        z65.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        t73 t73Var = (t73) bVar;
        if (this.o && (bVar instanceof q73)) {
            m1();
        }
        t73Var.q(it1Var);
    }

    @Override // defpackage.u14
    public void r(k24 k24Var) {
        z65.h(k24Var, "focusState");
        sm6.b bVar = this.n;
        if (bVar instanceof t14) {
            ((t14) bVar).r(k24Var);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        return this.n.toString();
    }

    @Override // defpackage.fe8
    public void v(kd8 kd8Var, md8 md8Var, long j) {
        z65.h(kd8Var, "pointerEvent");
        z65.h(md8Var, "pass");
        sm6.b bVar = this.n;
        z65.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((de8) bVar).l();
        throw null;
    }

    @Override // defpackage.fe8
    public boolean v0() {
        sm6.b bVar = this.n;
        z65.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((de8) bVar).l();
        throw null;
    }

    @Override // defpackage.yaa
    public /* synthetic */ boolean x() {
        return xaa.a(this);
    }

    @Override // defpackage.fe8
    public /* synthetic */ void x0() {
        ee8.c(this);
    }

    @Override // defpackage.yaa
    public /* synthetic */ boolean y0() {
        return xaa.b(this);
    }
}
