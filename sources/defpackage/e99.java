package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RecomposeScopeImpl.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0013B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bS\u0010TJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0007J\u0016\u0010\u001c\u001a\u00020\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001aJ\u0006\u0010\u001d\u001a\u00020\u0005J\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u0011R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010!R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R*\u00108\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000306\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00107R$\u0010=\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010@\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188@@BX\u0080\u000e¢\u0006\f\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R\u0011\u0010B\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bA\u0010:R\u0011\u0010D\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bC\u0010:R$\u0010G\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010:\"\u0004\bF\u0010<R$\u0010J\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010:\"\u0004\bI\u0010<R$\u0010M\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010:\"\u0004\bL\u0010<R$\u0010P\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010:\"\u0004\bO\u0010<R\u0011\u0010R\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bQ\u0010:¨\u0006U"}, d2 = {"Le99;", "Lxw9;", "Ld99;", "Lqn1;", "composer", "", Image.TYPE_HIGH, "", "value", "Lj75;", Image.TYPE_SMALL, "w", "Lg99;", "owner", "g", "invalidate", "Lkotlin/Function2;", "", "block", "a", "token", "G", "y", "instance", "", "v", "Llt4;", "instances", "u", "x", "Lkotlin/Function1;", "Lco1;", "i", "I", "flags", "b", "Lg99;", "Lrd;", c.a, "Lrd;", "j", "()Lrd;", "z", "(Lrd;)V", "anchor", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", e.a, "currentToken", "Ljt4;", "f", "Ljt4;", "trackedInstances", "Lkt4;", "Lt03;", "Lkt4;", "trackedDependencies", "o", "()Z", "D", "(Z)V", "rereading", "p", "E", "skipped", "r", "valid", "k", "canRecompose", "q", "F", "used", "l", "A", "defaultsInScope", Image.TYPE_MEDIUM, "B", "defaultsInvalid", "n", "C", "requiresRecompose", "t", "isConditional", "<init>", "(Lg99;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: e99  reason: default package */
/* loaded from: classes.dex */
public final class e99 implements xw9, d99 {
    public static final a h = new a(null);
    private int a;
    private g99 b;
    private rd c;
    private Function2<? super qn1, ? super Integer, Unit> d;
    private int e;
    private jt4 f;
    private kt4<t03<?>, Object> g;

    /* compiled from: RecomposeScopeImpl.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Le99$a;", "", "Lzna;", "slots", "", "Lrd;", "anchors", "Lg99;", "newOwner", "", "a", "(Lzna;Ljava/util/List;Lg99;)V", "Lwna;", "", "b", "(Lwna;Ljava/util/List;)Z", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: e99$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(zna znaVar, List<rd> list, g99 g99Var) {
            e99 e99Var;
            z65.h(znaVar, "slots");
            z65.h(list, "anchors");
            z65.h(g99Var, "newOwner");
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object R0 = znaVar.R0(list.get(i), 0);
                    if (R0 instanceof e99) {
                        e99Var = (e99) R0;
                    } else {
                        e99Var = null;
                    }
                    if (e99Var != null) {
                        e99Var.g(g99Var);
                    }
                }
            }
        }

        public final boolean b(wna wnaVar, List<rd> list) {
            z65.h(wnaVar, "slots");
            z65.h(list, "anchors");
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    rd rdVar = list.get(i);
                    if (wnaVar.F(rdVar) && (wnaVar.H(wnaVar.g(rdVar), 0) instanceof e99)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: RecomposeScopeImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lco1;", "composition", "", "a", "(Lco1;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e99$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<co1, Unit> {
        final /* synthetic */ int b;
        final /* synthetic */ jt4 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i, jt4 jt4Var) {
            super(1);
            this.b = i;
            this.c = jt4Var;
        }

        public final void a(co1 co1Var) {
            boolean z;
            t03<?> t03Var;
            z65.h(co1Var, "composition");
            if (e99.this.e == this.b && z65.c(this.c, e99.this.f) && (co1Var instanceof io1)) {
                jt4 jt4Var = this.c;
                int i = this.b;
                e99 e99Var = e99.this;
                Object[] e = jt4Var.e();
                int[] g = jt4Var.g();
                int f = jt4Var.f();
                int i2 = 0;
                for (int i3 = 0; i3 < f; i3++) {
                    Object obj = e[i3];
                    z65.f(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i4 = g[i3];
                    if (i4 != i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        io1 io1Var = (io1) co1Var;
                        io1Var.F(obj, e99Var);
                        if (obj instanceof t03) {
                            t03Var = (t03) obj;
                        } else {
                            t03Var = null;
                        }
                        if (t03Var != null) {
                            io1Var.E(t03Var);
                            kt4 kt4Var = e99Var.g;
                            if (kt4Var != null) {
                                kt4Var.k(t03Var);
                                if (kt4Var.h() == 0) {
                                    e99Var.g = null;
                                }
                            }
                        }
                    }
                    if (!z) {
                        if (i2 != i3) {
                            e[i2] = obj;
                            g[i2] = i4;
                        }
                        i2++;
                    }
                }
                for (int i5 = i2; i5 < f; i5++) {
                    e[i5] = null;
                }
                jt4Var.a = i2;
                if (this.c.f() == 0) {
                    e99.this.f = null;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(co1 co1Var) {
            a(co1Var);
            return Unit.a;
        }
    }

    public e99(g99 g99Var) {
        this.b = g99Var;
    }

    private final void D(boolean z) {
        if (z) {
            this.a |= 32;
        } else {
            this.a &= -33;
        }
    }

    private final void E(boolean z) {
        if (z) {
            this.a |= 16;
        } else {
            this.a &= -17;
        }
    }

    private final boolean o() {
        if ((this.a & 32) != 0) {
            return true;
        }
        return false;
    }

    public final void A(boolean z) {
        if (z) {
            this.a |= 2;
        } else {
            this.a &= -3;
        }
    }

    public final void B(boolean z) {
        if (z) {
            this.a |= 4;
        } else {
            this.a &= -5;
        }
    }

    public final void C(boolean z) {
        if (z) {
            this.a |= 8;
        } else {
            this.a &= -9;
        }
    }

    public final void F(boolean z) {
        if (z) {
            this.a |= 1;
        } else {
            this.a &= -2;
        }
    }

    public final void G(int i) {
        this.e = i;
        E(false);
    }

    @Override // defpackage.xw9
    public void a(Function2<? super qn1, ? super Integer, Unit> function2) {
        z65.h(function2, "block");
        this.d = function2;
    }

    public final void g(g99 g99Var) {
        z65.h(g99Var, "owner");
        this.b = g99Var;
    }

    public final void h(qn1 qn1Var) {
        Unit unit;
        z65.h(qn1Var, "composer");
        Function2<? super qn1, ? super Integer, Unit> function2 = this.d;
        if (function2 != null) {
            function2.invoke(qn1Var, 1);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        throw new IllegalStateException("Invalid restart scope".toString());
    }

    public final Function1<co1, Unit> i(int i) {
        jt4 jt4Var = this.f;
        if (jt4Var == null || p()) {
            return null;
        }
        Object[] e = jt4Var.e();
        int[] g = jt4Var.g();
        int f = jt4Var.f();
        for (int i2 = 0; i2 < f; i2++) {
            z65.f(e[i2], "null cannot be cast to non-null type kotlin.Any");
            if (g[i2] != i) {
                return new b(i, jt4Var);
            }
        }
        return null;
    }

    @Override // defpackage.d99
    public void invalidate() {
        g99 g99Var = this.b;
        if (g99Var != null) {
            g99Var.d(this, null);
        }
    }

    public final rd j() {
        return this.c;
    }

    public final boolean k() {
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.a & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.a & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if ((this.a & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.a & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.a & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        rd rdVar;
        if (this.b != null && (rdVar = this.c) != null && rdVar.b()) {
            return true;
        }
        return false;
    }

    public final j75 s(Object obj) {
        j75 d;
        g99 g99Var = this.b;
        if (g99Var == null || (d = g99Var.d(this, obj)) == null) {
            return j75.IGNORED;
        }
        return d;
    }

    public final boolean t() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public final boolean u(lt4<Object> lt4Var) {
        kt4<t03<?>, Object> kt4Var;
        if (lt4Var != null && (kt4Var = this.g) != null && lt4Var.u()) {
            if (!lt4Var.isEmpty()) {
                for (Object obj : lt4Var) {
                    if (obj instanceof t03) {
                        t03<?> t03Var = (t03) obj;
                        ppa<?> a2 = t03Var.a();
                        if (a2 == null) {
                            a2 = qpa.h();
                        }
                        if (!a2.b(t03Var.l().a(), kt4Var.f(t03Var))) {
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean v(Object obj) {
        z65.h(obj, "instance");
        if (o()) {
            return false;
        }
        jt4 jt4Var = this.f;
        if (jt4Var == null) {
            jt4Var = new jt4();
            this.f = jt4Var;
        }
        if (jt4Var.b(obj, this.e) == this.e) {
            return true;
        }
        if (obj instanceof t03) {
            kt4<t03<?>, Object> kt4Var = this.g;
            if (kt4Var == null) {
                kt4Var = new kt4<>(0, 1, null);
                this.g = kt4Var;
            }
            kt4Var.l(obj, ((t03) obj).l().a());
        }
        return false;
    }

    public final void w() {
        g99 g99Var = this.b;
        if (g99Var != null) {
            g99Var.s(this);
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void x() {
        jt4 jt4Var;
        g99 g99Var = this.b;
        if (g99Var != null && (jt4Var = this.f) != null) {
            D(true);
            try {
                Object[] e = jt4Var.e();
                int[] g = jt4Var.g();
                int f = jt4Var.f();
                for (int i = 0; i < f; i++) {
                    Object obj = e[i];
                    z65.f(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i2 = g[i];
                    g99Var.b(obj);
                }
            } finally {
                D(false);
            }
        }
    }

    public final void y() {
        E(true);
    }

    public final void z(rd rdVar) {
        this.c = rdVar;
    }
}
