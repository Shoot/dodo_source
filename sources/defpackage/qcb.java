package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gb8;
import defpackage.sm6;
import defpackage.uc1;
import defpackage.w24;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextStringSimpleNode.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BV\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\tø\u0001\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJC\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rJ\f\u0010\"\u001a\u00020\u001f*\u00020!H\u0016J)\u0010)\u001a\u00020(*\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\f\u0010,\u001a\u00020\u001f*\u00020+H\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00101R\u001f\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b,\u00102R\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00102R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00102R$\u0010;\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0012\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R*\u0010D\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0@\u0012\u0004\u0012\u00020\r\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006K"}, d2 = {"Lqcb;", "Lsm6$c;", "Lzm5;", "Lv73;", "Lyaa;", "La03;", "density", "Lhq7;", "i1", "Lcd1;", RemoteMessageConst.Notification.COLOR, "Lrcb;", "style", "", "j1", "", "text", "l1", "", "minLines", "maxLines", "softWrap", "Lw24$b;", "fontFamilyResolver", "Lgcb;", "overflow", "k1", "(Lrcb;IIZLw24$b;I)Z", "drawChanged", "textChanged", "layoutChanged", "", "g1", "Ljba;", "U", "Lvb6;", "Lmb6;", "measurable", "Lnr1;", "constraints", "Ltb6;", "p", "(Lvb6;Lmb6;J)Ltb6;", "Lit1;", "q", "n", "Ljava/lang/String;", "o", "Lrcb;", "Lw24$b;", "I", "r", "Z", Image.TYPE_SMALL, "t", "", "Lhb;", "u", "Ljava/util/Map;", "baselineCache", "v", "Lhq7;", "_layoutCache", "Lkotlin/Function1;", "", "Lbcb;", "w", "Lkotlin/jvm/functions/Function1;", "semanticsTextLayoutResult", "h1", "()Lhq7;", "layoutCache", "overrideColor", "<init>", "(Ljava/lang/String;Lrcb;Lw24$b;IZIILcd1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qcb  reason: default package */
/* loaded from: classes.dex */
public final class qcb extends sm6.c implements zm5, v73, yaa {
    private String n;
    private rcb o;
    private w24.b p;
    private int q;
    private boolean r;
    private int s;
    private int t;
    private Map<hb, Integer> u;
    private hq7 v;
    private Function1<? super List<bcb>, Boolean> w;

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lbcb;", "textLayoutResult", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: qcb$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<List<bcb>, Boolean> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<bcb> list) {
            z65.h(list, "textLayoutResult");
            bcb k = qcb.this.h1().k();
            if (k != null) {
                list.add(k);
            }
            return Boolean.FALSE;
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: qcb$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<gb8.a, Unit> {
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

    public /* synthetic */ qcb(String str, rcb rcbVar, w24.b bVar, int i, boolean z, int i2, int i3, cd1 cd1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rcbVar, bVar, i, z, i2, i3, cd1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hq7 h1() {
        if (this.v == null) {
            this.v = new hq7(this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
        }
        hq7 hq7Var = this.v;
        z65.e(hq7Var);
        return hq7Var;
    }

    private final hq7 i1(a03 a03Var) {
        hq7 h1 = h1();
        h1.i(a03Var);
        return h1;
    }

    @Override // defpackage.yaa
    public void U(jba jbaVar) {
        z65.h(jbaVar, "<this>");
        Function1 function1 = this.w;
        if (function1 == null) {
            function1 = new a();
            this.w = function1;
        }
        hba.k(jbaVar, new ml(this.n, null, null, 6, null));
        hba.c(jbaVar, null, function1, 1, null);
    }

    public final void g1(boolean z, boolean z2, boolean z3) {
        if (z2) {
            zaa.b(this);
        }
        if (z2 || z3) {
            h1().l(this.n, this.o, this.p, this.q, this.r, this.s, this.t);
            cn5.b(this);
            w73.a(this);
        }
        if (z) {
            w73.a(this);
        }
    }

    @Override // defpackage.v73
    public /* synthetic */ void i0() {
        u73.a(this);
    }

    public final boolean j1(cd1 cd1Var, rcb rcbVar) {
        z65.h(rcbVar, "style");
        if ((!z65.c(cd1Var, null)) || !rcbVar.F(this.o)) {
            return true;
        }
        return false;
    }

    public final boolean k1(rcb rcbVar, int i, int i2, boolean z, w24.b bVar, int i3) {
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        boolean z2 = !this.o.G(rcbVar);
        this.o = rcbVar;
        if (this.t != i) {
            this.t = i;
            z2 = true;
        }
        if (this.s != i2) {
            this.s = i2;
            z2 = true;
        }
        if (this.r != z) {
            this.r = z;
            z2 = true;
        }
        if (!z65.c(this.p, bVar)) {
            this.p = bVar;
            z2 = true;
        }
        if (!gcb.e(this.q, i3)) {
            this.q = i3;
            return true;
        }
        return z2;
    }

    public final boolean l1(String str) {
        z65.h(str, "text");
        if (z65.c(this.n, str)) {
            return false;
        }
        this.n = str;
        return true;
    }

    @Override // defpackage.zm5
    public tb6 p(vb6 vb6Var, mb6 mb6Var, long j) {
        int c;
        int c2;
        z65.h(vb6Var, "$this$measure");
        z65.h(mb6Var, "measurable");
        hq7 i1 = i1(vb6Var);
        boolean f = i1.f(j, vb6Var.getLayoutDirection());
        i1.c();
        bq7 d = i1.d();
        z65.e(d);
        long b2 = i1.b();
        if (f) {
            cn5.a(this);
            Map<hb, Integer> map = this.u;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            yo4 a2 = ib.a();
            c = la6.c(d.c());
            map.put(a2, Integer.valueOf(c));
            yo4 b3 = ib.b();
            c2 = la6.c(d.k());
            map.put(b3, Integer.valueOf(c2));
            this.u = map;
        }
        gb8 E = mb6Var.E(nr1.b.c(w55.g(b2), w55.f(b2)));
        int g = w55.g(b2);
        int f2 = w55.f(b2);
        Map<hb, Integer> map2 = this.u;
        z65.e(map2);
        return vb6Var.d0(g, f2, map2, new b(E));
    }

    @Override // defpackage.v73
    public void q(it1 it1Var) {
        long a2;
        z65.h(it1Var, "<this>");
        bq7 d = h1().d();
        if (d != null) {
            qn0 u = it1Var.o0().u();
            boolean a3 = h1().a();
            if (a3) {
                k99 a4 = o99.a(s67.b.c(), ina.a(w55.g(h1().b()), w55.f(h1().b())));
                u.l();
                pn0.e(u, a4, 0, 2, null);
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
                    zp7.b(d, u, g, this.o.d(), ogaVar, kabVar, z73Var, 0, 64, null);
                } else {
                    uc1.a aVar = uc1.b;
                    long e = aVar.e();
                    if (e == aVar.e()) {
                        if (this.o.h() != aVar.e()) {
                            a2 = this.o.h();
                        } else {
                            a2 = aVar.a();
                        }
                        e = a2;
                    }
                    zp7.a(d, u, e, ogaVar, kabVar, z73Var, 0, 32, null);
                }
                if (a3) {
                    u.g();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (a3) {
                    u.g();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // defpackage.yaa
    public /* synthetic */ boolean x() {
        return xaa.a(this);
    }

    @Override // defpackage.yaa
    public /* synthetic */ boolean y0() {
        return xaa.b(this);
    }

    private qcb(String str, rcb rcbVar, w24.b bVar, int i, boolean z, int i2, int i3, cd1 cd1Var) {
        z65.h(str, "text");
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        this.n = str;
        this.o = rcbVar;
        this.p = bVar;
        this.q = i;
        this.r = z;
        this.s = i2;
        this.t = i3;
    }
}
