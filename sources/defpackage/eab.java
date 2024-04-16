package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gb8;
import defpackage.ml;
import defpackage.sm6;
import defpackage.uc1;
import defpackage.w24;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextAnnotatedStringNode.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B²\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 \u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u0012\u0012\u001e\b\u0002\u0010%\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0012\u0012\u0004\u0012\u00020\"\u0018\u00010 \u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\tø\u0001\u0001¢\u0006\u0004\b^\u0010_J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJY\u0010\u001e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010(\u001a\u00020\r2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 2\u001c\u0010%\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0012\u0012\u0004\u0012\u00020\"\u0018\u00010 2\b\u0010'\u001a\u0004\u0018\u00010&J&\u0010-\u001a\u00020\"2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\rJ\f\u0010/\u001a\u00020\"*\u00020.H\u0016J+\u00107\u001a\u0002062\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J)\u00109\u001a\u000206*\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u00108J\u000e\u0010<\u001a\u00020\"2\u0006\u0010;\u001a\u00020:J\f\u0010=\u001a\u00020\"*\u00020:H\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010BR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010CR\u001f\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010ER\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010ER$\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR,\u0010%\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0012\u0012\u0004\u0012\u00020\"\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010CR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010S\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u0016\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR*\u0010Y\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0W\u0012\u0004\u0012\u00020\r\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010CR\u0014\u0010\\\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006`"}, d2 = {"Leab;", "Lsm6$c;", "Lzm5;", "Lv73;", "Lyaa;", "La03;", "density", "Lvp6;", "j1", "Lcd1;", RemoteMessageConst.Notification.COLOR, "Lrcb;", "style", "", "m1", "Lml;", "text", "o1", "", "Lml$a;", "Ljb8;", "placeholders", "", "minLines", "maxLines", "softWrap", "Lw24$b;", "fontFamilyResolver", "Lgcb;", "overflow", "n1", "(Lrcb;Ljava/util/List;IIZLw24$b;I)Z", "Lkotlin/Function1;", "Lbcb;", "", "onTextLayout", "Lk99;", "onPlaceholderLayout", "Lu9a;", "selectionController", "l1", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "g1", "Ljba;", "U", "Lvb6;", "measureScope", "Lmb6;", "measurable", "Lnr1;", "constraints", "Ltb6;", "k1", "(Lvb6;Lmb6;J)Ltb6;", "p", "Lit1;", "contentDrawScope", "h1", "q", "n", "Lml;", "o", "Lrcb;", "Lw24$b;", "Lkotlin/jvm/functions/Function1;", "r", "I", Image.TYPE_SMALL, "Z", "t", "u", "v", "Ljava/util/List;", "w", "x", "Lu9a;", "", "Lhb;", "y", "Ljava/util/Map;", "baselineCache", "z", "Lvp6;", "_layoutCache", "", "A", "semanticsTextLayoutResult", "i1", "()Lvp6;", "layoutCache", "overrideColor", "<init>", "(Lml;Lrcb;Lw24$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Lu9a;Lcd1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: eab  reason: default package */
/* loaded from: classes.dex */
public final class eab extends sm6.c implements zm5, v73, yaa {
    private Function1<? super List<bcb>, Boolean> A;
    private ml n;
    private rcb o;
    private w24.b p;
    private Function1<? super bcb, Unit> q;
    private int r;
    private boolean s;
    private int t;
    private int u;
    private List<ml.a<jb8>> v;
    private Function1<? super List<k99>, Unit> w;
    private u9a x;
    private Map<hb, Integer> y;
    private vp6 z;

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lbcb;", "textLayoutResult", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eab$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<List<bcb>, Boolean> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<bcb> list) {
            z65.h(list, "textLayoutResult");
            bcb a = eab.this.i1().a();
            if (a != null) {
                list.add(a);
            } else {
                a = null;
            }
            return Boolean.valueOf(a != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eab$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<gb8.a, Unit> {
        final /* synthetic */ gb8 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(gb8 gb8Var) {
            super(1);
            this.a = gb8Var;
        }

        public final void a(gb8.a aVar) {
            z65.h(aVar, "$this$layout");
            gb8.a.n(aVar, this.a, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    public /* synthetic */ eab(ml mlVar, rcb rcbVar, w24.b bVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, u9a u9aVar, cd1 cd1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(mlVar, rcbVar, bVar, function1, i, z, i2, i3, list, function12, u9aVar, cd1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vp6 i1() {
        if (this.z == null) {
            this.z = new vp6(this.n, this.o, this.p, this.r, this.s, this.t, this.u, this.v, null);
        }
        vp6 vp6Var = this.z;
        z65.e(vp6Var);
        return vp6Var;
    }

    private final vp6 j1(a03 a03Var) {
        vp6 i1 = i1();
        i1.g(a03Var);
        return i1;
    }

    @Override // defpackage.yaa
    public void U(jba jbaVar) {
        z65.h(jbaVar, "<this>");
        Function1 function1 = this.A;
        if (function1 == null) {
            function1 = new a();
            this.A = function1;
        }
        hba.k(jbaVar, this.n);
        hba.c(jbaVar, null, function1, 1, null);
    }

    public final void g1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            zaa.b(this);
        }
        if (z2 || z3 || z4) {
            i1().j(this.n, this.o, this.p, this.r, this.s, this.t, this.u, this.v);
            cn5.b(this);
            w73.a(this);
        }
        if (z) {
            w73.a(this);
        }
    }

    public final void h1(it1 it1Var) {
        z65.h(it1Var, "contentDrawScope");
        q(it1Var);
    }

    @Override // defpackage.v73
    public /* synthetic */ void i0() {
        u73.a(this);
    }

    public final tb6 k1(vb6 vb6Var, mb6 mb6Var, long j) {
        z65.h(vb6Var, "measureScope");
        z65.h(mb6Var, "measurable");
        return p(vb6Var, mb6Var, j);
    }

    public final boolean l1(Function1<? super bcb, Unit> function1, Function1<? super List<k99>, Unit> function12, u9a u9aVar) {
        boolean z;
        if (!z65.c(this.q, function1)) {
            this.q = function1;
            z = true;
        } else {
            z = false;
        }
        if (!z65.c(this.w, function12)) {
            this.w = function12;
            z = true;
        }
        if (!z65.c(this.x, u9aVar)) {
            this.x = u9aVar;
            return true;
        }
        return z;
    }

    public final boolean m1(cd1 cd1Var, rcb rcbVar) {
        z65.h(rcbVar, "style");
        if ((!z65.c(cd1Var, null)) || !rcbVar.F(this.o)) {
            return true;
        }
        return false;
    }

    public final boolean n1(rcb rcbVar, List<ml.a<jb8>> list, int i, int i2, boolean z, w24.b bVar, int i3) {
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        boolean z2 = !this.o.G(rcbVar);
        this.o = rcbVar;
        if (!z65.c(this.v, list)) {
            this.v = list;
            z2 = true;
        }
        if (this.u != i) {
            this.u = i;
            z2 = true;
        }
        if (this.t != i2) {
            this.t = i2;
            z2 = true;
        }
        if (this.s != z) {
            this.s = z;
            z2 = true;
        }
        if (!z65.c(this.p, bVar)) {
            this.p = bVar;
            z2 = true;
        }
        if (!gcb.e(this.r, i3)) {
            this.r = i3;
            return true;
        }
        return z2;
    }

    public final boolean o1(ml mlVar) {
        z65.h(mlVar, "text");
        if (z65.c(this.n, mlVar)) {
            return false;
        }
        this.n = mlVar;
        return true;
    }

    @Override // defpackage.zm5
    public tb6 p(vb6 vb6Var, mb6 mb6Var, long j) {
        int c;
        int c2;
        Map<hb, Integer> k;
        z65.h(vb6Var, "$this$measure");
        z65.h(mb6Var, "measurable");
        vp6 j1 = j1(vb6Var);
        boolean d = j1.d(j, vb6Var.getLayoutDirection());
        bcb b2 = j1.b();
        b2.o().f().a();
        if (d) {
            cn5.a(this);
            Function1<? super bcb, Unit> function1 = this.q;
            if (function1 != null) {
                function1.invoke(b2);
            }
            u9a u9aVar = this.x;
            if (u9aVar != null) {
                u9aVar.h(b2);
            }
            yo4 a2 = ib.a();
            c = la6.c(b2.d());
            yo4 b3 = ib.b();
            c2 = la6.c(b2.f());
            k = g86.k(lnb.a(a2, Integer.valueOf(c)), lnb.a(b3, Integer.valueOf(c2)));
            this.y = k;
        }
        Function1<? super List<k99>, Unit> function12 = this.w;
        if (function12 != null) {
            function12.invoke(b2.r());
        }
        gb8 E = mb6Var.E(nr1.b.c(w55.g(b2.s()), w55.f(b2.s())));
        int g = w55.g(b2.s());
        int f = w55.f(b2.s());
        Map<hb, Integer> map = this.y;
        z65.e(map);
        return vb6Var.d0(g, f, map, new b(E));
    }

    @Override // defpackage.v73
    public void q(it1 it1Var) {
        boolean z;
        z65.h(it1Var, "<this>");
        u9a u9aVar = this.x;
        if (u9aVar != null) {
            u9aVar.e(it1Var);
        }
        qn0 u = it1Var.o0().u();
        bcb b2 = i1().b();
        rp6 o = b2.o();
        if (b2.e() && !gcb.e(this.r, gcb.a.c())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            k99 a2 = o99.a(s67.b.c(), ina.a(w55.g(b2.s()), w55.f(b2.s())));
            u.l();
            pn0.e(u, a2, 0, 2, null);
        }
        try {
            kab A = this.o.A();
            if (A == null) {
                A = kab.b.b();
            }
            kab kabVar = A;
            oga x = this.o.x();
            if (x == null) {
                x = oga.d.a();
            }
            oga ogaVar = x;
            z73 i = this.o.i();
            if (i == null) {
                i = uu3.a;
            }
            z73 z73Var = i;
            mg0 g = this.o.g();
            if (g != null) {
                rp6.v(o, u, g, this.o.d(), ogaVar, kabVar, z73Var, 0, 64, null);
            } else {
                uc1.a aVar = uc1.b;
                long e = aVar.e();
                if (e == aVar.e()) {
                    if (this.o.h() != aVar.e()) {
                        e = this.o.h();
                    } else {
                        e = aVar.a();
                    }
                }
                rp6.t(o, u, e, ogaVar, kabVar, z73Var, 0, 32, null);
            }
            if (z) {
                u.g();
            }
            List<ml.a<jb8>> list = this.v;
            if (list != null && !list.isEmpty()) {
                it1Var.B0();
            }
        } catch (Throwable th) {
            if (z) {
                u.g();
            }
            throw th;
        }
    }

    @Override // defpackage.yaa
    public /* synthetic */ boolean x() {
        return xaa.a(this);
    }

    @Override // defpackage.yaa
    public /* synthetic */ boolean y0() {
        return xaa.b(this);
    }

    private eab(ml mlVar, rcb rcbVar, w24.b bVar, Function1<? super bcb, Unit> function1, int i, boolean z, int i2, int i3, List<ml.a<jb8>> list, Function1<? super List<k99>, Unit> function12, u9a u9aVar, cd1 cd1Var) {
        z65.h(mlVar, "text");
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        this.n = mlVar;
        this.o = rcbVar;
        this.p = bVar;
        this.q = function1;
        this.r = i;
        this.s = z;
        this.t = i2;
        this.u = i3;
        this.v = list;
        this.w = function12;
        this.x = u9aVar;
    }
}
