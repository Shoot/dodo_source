package defpackage;

import androidx.compose.ui.graphics.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gb8;
import defpackage.jn5;
import im.threads.business.transport.MessageAttributes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: LookaheadDelegate.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b^\u0010_J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\bH\u0014J \u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0000H\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R(\u00104\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b0\u00101\"\u0004\b2\u00103R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050$8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u00107R\u0016\u0010;\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020.8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0016\u0010M\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010:R\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0016\u0010]\u001a\u0004\u0018\u00010Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006`"}, d2 = {"Lty5;", "Lmb6;", "Lsy5;", "Lhb;", "alignmentLine", "", "Y0", "(Lhb;)I", "", "S0", "()V", "Ls55;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "D0", "(JFLkotlin/jvm/functions/Function1;)V", "c1", "ancestor", "d1", "(Lty5;)J", "Loz6;", Image.TYPE_HIGH, "Loz6;", "a1", "()Loz6;", "coordinator", "i", "J", "O0", "()J", "e1", "(J)V", "", "j", "Ljava/util/Map;", "oldAlignmentLines", "Luy5;", "k", "Luy5;", "b1", "()Luy5;", "lookaheadLayoutCoordinates", "Ltb6;", "result", "l", "Ltb6;", "f1", "(Ltb6;)V", "_measureResult", Image.TYPE_MEDIUM, "Z0", "()Ljava/util/Map;", "cachedAlignmentLinesMap", "I0", "()Lsy5;", "child", "", "K0", "()Z", "hasMeasureResult", "M0", "()Ltb6;", "measureResult", "Lqm5;", "getLayoutDirection", "()Lqm5;", "layoutDirection", "getDensity", "()F", "density", "k0", "fontScale", "N0", "parent", "Len5;", "L0", "()Len5;", "layoutNode", "Lom5;", "J0", "()Lom5;", MessageAttributes.COORDINATES, "Lkb;", "X0", "()Lkb;", "alignmentLinesOwner", "", "r", "()Ljava/lang/Object;", "parentData", "<init>", "(Loz6;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ty5 */
/* loaded from: classes.dex */
public abstract class ty5 extends sy5 implements mb6 {
    private final oz6 h;
    private long i;
    private Map<hb, Integer> j;
    private final uy5 k;
    private tb6 l;
    private final Map<hb, Integer> m;

    public ty5(oz6 oz6Var) {
        z65.h(oz6Var, "coordinator");
        this.h = oz6Var;
        this.i = s55.b.a();
        this.k = new uy5(this);
        this.m = new LinkedHashMap();
    }

    public static final /* synthetic */ void V0(ty5 ty5Var, long j) {
        ty5Var.F0(j);
    }

    public static final /* synthetic */ void W0(ty5 ty5Var, tb6 tb6Var) {
        ty5Var.f1(tb6Var);
    }

    public final void f1(tb6 tb6Var) {
        Unit unit;
        Map<hb, Integer> map;
        if (tb6Var != null) {
            E0(x55.a(tb6Var.getWidth(), tb6Var.getHeight()));
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            E0(w55.b.a());
        }
        if (!z65.c(this.l, tb6Var) && tb6Var != null && ((((map = this.j) != null && !map.isEmpty()) || (!tb6Var.d().isEmpty())) && !z65.c(tb6Var.d(), this.j))) {
            X0().d().m();
            Map map2 = this.j;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.j = map2;
            }
            map2.clear();
            map2.putAll(tb6Var.d());
        }
        this.l = tb6Var;
    }

    @Override // defpackage.gb8
    public final void D0(long j, float f, Function1<? super c, Unit> function1) {
        if (!s55.g(O0(), j)) {
            e1(j);
            jn5.a C = L0().O().C();
            if (C != null) {
                C.T0();
            }
            P0(this.h);
        }
        if (R0()) {
            return;
        }
        c1();
    }

    @Override // defpackage.sy5
    public sy5 I0() {
        oz6 A1 = this.h.A1();
        if (A1 != null) {
            return A1.v1();
        }
        return null;
    }

    @Override // defpackage.sy5
    public om5 J0() {
        return this.k;
    }

    @Override // defpackage.sy5
    public boolean K0() {
        if (this.l != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.sy5
    public en5 L0() {
        return this.h.L0();
    }

    @Override // defpackage.sy5
    public tb6 M0() {
        tb6 tb6Var = this.l;
        if (tb6Var != null) {
            return tb6Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // defpackage.sy5
    public sy5 N0() {
        oz6 B1 = this.h.B1();
        if (B1 != null) {
            return B1.v1();
        }
        return null;
    }

    @Override // defpackage.sy5
    public long O0() {
        return this.i;
    }

    @Override // defpackage.sy5
    public void S0() {
        D0(O0(), 0.0f, null);
    }

    public kb X0() {
        kb z = this.h.L0().O().z();
        z65.e(z);
        return z;
    }

    public final int Y0(hb hbVar) {
        z65.h(hbVar, "alignmentLine");
        Integer num = this.m.get(hbVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public final Map<hb, Integer> Z0() {
        return this.m;
    }

    public final oz6 a1() {
        return this.h;
    }

    public final uy5 b1() {
        return this.k;
    }

    protected void c1() {
        om5 om5Var;
        int l;
        qm5 k;
        jn5 jn5Var;
        boolean A;
        gb8.a.C0324a c0324a = gb8.a.a;
        int width = M0().getWidth();
        qm5 layoutDirection = this.h.getLayoutDirection();
        om5Var = gb8.a.d;
        l = c0324a.l();
        k = c0324a.k();
        jn5Var = gb8.a.e;
        gb8.a.c = width;
        gb8.a.b = layoutDirection;
        A = c0324a.A(this);
        M0().a();
        T0(A);
        gb8.a.c = l;
        gb8.a.b = k;
        gb8.a.d = om5Var;
        gb8.a.e = jn5Var;
    }

    public final long d1(ty5 ty5Var) {
        z65.h(ty5Var, "ancestor");
        long a = s55.b.a();
        ty5 ty5Var2 = this;
        while (!z65.c(ty5Var2, ty5Var)) {
            long O0 = ty5Var2.O0();
            a = t55.a(s55.h(a) + s55.h(O0), s55.i(a) + s55.i(O0));
            oz6 B1 = ty5Var2.h.B1();
            z65.e(B1);
            ty5Var2 = B1.v1();
            z65.e(ty5Var2);
        }
        return a;
    }

    public void e1(long j) {
        this.i = j;
    }

    @Override // defpackage.a03
    public float getDensity() {
        return this.h.getDensity();
    }

    @Override // defpackage.y65
    public qm5 getLayoutDirection() {
        return this.h.getLayoutDirection();
    }

    @Override // defpackage.a03
    public float k0() {
        return this.h.k0();
    }

    @Override // defpackage.x65
    public Object r() {
        return this.h.r();
    }
}
