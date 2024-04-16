package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.platform.h;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gn9;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0002\u001a \u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\bH\u0002\u001a\f\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\f\u0010\u0010\u001a\u00020\u0005*\u00020\u000bH\u0002\u001a\f\u0010\u0011\u001a\u00020\u0005*\u00020\u000bH\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002\u001a\u0018\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017*\u00020\u0016H\u0000\u001a\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0000\u001a\u001b\u0010!\u001a\u0004\u0018\u00010 *\u00020\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0016\u0010%\u001a\u0004\u0018\u00010$*\u00020#2\u0006\u0010\u001d\u001a\u00020\u0018H\u0000\"\u001e\u0010*\u001a\u00020\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'\"\u0018\u0010,\u001a\u00020\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'\"\u0018\u0010.\u001a\u00020\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'\"\u0018\u00100\u001a\u00020\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010'\"\u001a\u00103\u001a\u0004\u0018\u00010\u0005*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0018\u00106\u001a\u00020\u0000*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\"\u001a\u00109\u001a\u0004\u0018\u00010 *\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006:"}, d2 = {"", "that", "Lha7;", "G", "it", "", "E", "Len5;", "Lkotlin/Function1;", "selector", "t", "Laba;", "q", "Landroidx/compose/ui/platform/h$h;", "oldNode", "F", "y", "r", "Lq2;", "", "other", "p", "Ldba;", "", "", "Lcba;", "u", "", "Lpx9;", "id", Image.TYPE_SMALL, "Lgn9;", "", "I", "(I)Ljava/lang/String;", "Lmj;", "Landroid/view/View;", "H", "D", "(Laba;)Z", "isVisible$annotations", "(Laba;)V", "isVisible", "z", "isPassword", "B", "isTextField", "A", "isRtl", "C", "(Laba;)Ljava/lang/Boolean;", "isTraversalGroup", "w", "(Laba;)F", "getTraversalIndex", "x", "(Laba;)Ljava/lang/String;", "infoContentDescriptionOrNull", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class i {

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "it", "", "a", "(Len5;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<en5, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x001c, code lost:
            if (r3.h(defpackage.saa.a.t()) != false) goto L7;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(defpackage.en5 r3) {
            /*
                r2 = this;
                java.lang.String r0 = "it"
                defpackage.z65.h(r3, r0)
                taa r3 = r3.F()
                if (r3 == 0) goto L1f
                boolean r0 = r3.x()
                r1 = 1
                if (r0 != r1) goto L1f
                saa r0 = defpackage.saa.a
                iba r0 = r0.t()
                boolean r3 = r3.h(r0)
                if (r3 == 0) goto L1f
                goto L20
            L1f:
                r1 = 0
            L20:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.i.a.invoke(en5):java.lang.Boolean");
        }
    }

    public static final boolean A(aba abaVar) {
        if (abaVar.n().getLayoutDirection() == qm5.Rtl) {
            return true;
        }
        return false;
    }

    public static final boolean B(aba abaVar) {
        return abaVar.u().h(saa.a.t());
    }

    public static final Boolean C(aba abaVar) {
        return (Boolean) uaa.a(abaVar.l(), eba.a.l());
    }

    public static final boolean D(aba abaVar) {
        if (!abaVar.x() && !abaVar.u().h(eba.a.k())) {
            return true;
        }
        return false;
    }

    public static final boolean E(ha7<Float> ha7Var, ha7<Float> ha7Var2) {
        if (!ha7Var.isEmpty() && !ha7Var2.isEmpty() && Math.max(ha7Var.d().floatValue(), ha7Var2.d().floatValue()) < Math.min(ha7Var.a().floatValue(), ha7Var2.a().floatValue())) {
            return true;
        }
        return false;
    }

    public static final boolean F(aba abaVar, h.C0023h c0023h) {
        Iterator<Map.Entry<? extends iba<?>, ? extends Object>> it = c0023h.c().iterator();
        while (it.hasNext()) {
            if (!abaVar.l().h(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final ha7<Float> G(float f, float f2) {
        return new u(f, f2);
    }

    public static final View H(mj mjVar, int i) {
        Object obj;
        z65.h(mjVar, "<this>");
        Set<Map.Entry<en5, jj>> entrySet = mjVar.getLayoutNodeToHolder().entrySet();
        z65.g(entrySet, "layoutNodeToHolder.entries");
        Iterator<T> it = entrySet.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((en5) ((Map.Entry) obj).getKey()).j0() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (jj) entry.getValue();
    }

    public static final String I(int i) {
        gn9.a aVar = gn9.b;
        if (gn9.k(i, aVar.a())) {
            return "android.widget.Button";
        }
        if (gn9.k(i, aVar.b())) {
            return "android.widget.CheckBox";
        }
        if (gn9.k(i, aVar.e())) {
            return "android.widget.RadioButton";
        }
        if (gn9.k(i, aVar.d())) {
            return "android.widget.ImageView";
        }
        if (gn9.k(i, aVar.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final /* synthetic */ boolean a(q2 q2Var, Object obj) {
        return p(q2Var, obj);
    }

    public static final /* synthetic */ boolean b(aba abaVar) {
        return q(abaVar);
    }

    public static final /* synthetic */ boolean c(aba abaVar) {
        return r(abaVar);
    }

    public static final /* synthetic */ en5 d(en5 en5Var, Function1 function1) {
        return t(en5Var, function1);
    }

    public static final /* synthetic */ float e(aba abaVar) {
        return w(abaVar);
    }

    public static final /* synthetic */ String f(aba abaVar) {
        return x(abaVar);
    }

    public static final /* synthetic */ boolean g(aba abaVar) {
        return y(abaVar);
    }

    public static final /* synthetic */ boolean h(aba abaVar) {
        return z(abaVar);
    }

    public static final /* synthetic */ boolean i(aba abaVar) {
        return A(abaVar);
    }

    public static final /* synthetic */ boolean j(aba abaVar) {
        return B(abaVar);
    }

    public static final /* synthetic */ Boolean k(aba abaVar) {
        return C(abaVar);
    }

    public static final /* synthetic */ boolean l(aba abaVar) {
        return D(abaVar);
    }

    public static final /* synthetic */ boolean m(ha7 ha7Var, ha7 ha7Var2) {
        return E(ha7Var, ha7Var2);
    }

    public static final /* synthetic */ boolean n(aba abaVar, h.C0023h c0023h) {
        return F(abaVar, c0023h);
    }

    public static final /* synthetic */ String o(int i) {
        return I(i);
    }

    public static final boolean p(q2<?> q2Var, Object obj) {
        if (q2Var == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var2 = (q2) obj;
        if (!z65.c(q2Var.b(), q2Var2.b())) {
            return false;
        }
        if (q2Var.a() == null && q2Var2.a() != null) {
            return false;
        }
        if (q2Var.a() == null || q2Var2.a() != null) {
            return true;
        }
        return false;
    }

    public static final boolean q(aba abaVar) {
        if (uaa.a(abaVar.l(), eba.a.d()) == null) {
            return true;
        }
        return false;
    }

    public static final boolean r(aba abaVar) {
        taa F;
        if (B(abaVar) && !z65.c(uaa.a(abaVar.u(), eba.a.g()), Boolean.TRUE)) {
            return true;
        }
        en5 t = t(abaVar.o(), a.a);
        if (t != null && ((F = t.F()) == null || !z65.c(uaa.a(F, eba.a.g()), Boolean.TRUE))) {
            return true;
        }
        return false;
    }

    public static final px9 s(List<px9> list, int i) {
        z65.h(list, "<this>");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).d() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    public static final en5 t(en5 en5Var, Function1<? super en5, Boolean> function1) {
        for (en5 h0 = en5Var.h0(); h0 != null; h0 = h0.h0()) {
            if (function1.invoke(h0).booleanValue()) {
                return h0;
            }
        }
        return null;
    }

    public static final Map<Integer, cba> u(dba dbaVar) {
        int c;
        int c2;
        int c3;
        int c4;
        z65.h(dbaVar, "<this>");
        aba a2 = dbaVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a2.o().b() && a2.o().C0()) {
            Region region = new Region();
            k99 h = a2.h();
            c = la6.c(h.f());
            c2 = la6.c(h.i());
            c3 = la6.c(h.g());
            c4 = la6.c(h.c());
            region.set(new Rect(c, c2, c3, c4));
            v(region, a2, linkedHashMap, a2);
        }
        return linkedHashMap;
    }

    private static final void v(Region region, aba abaVar, Map<Integer, cba> map, aba abaVar2) {
        boolean z;
        int c;
        int c2;
        int c3;
        int c4;
        int m;
        k99 k99Var;
        int c5;
        int c6;
        int c7;
        int c8;
        tm5 n;
        if (abaVar2.o().b() && abaVar2.o().C0()) {
            z = false;
        } else {
            z = true;
        }
        if (!region.isEmpty() || abaVar2.m() == abaVar.m()) {
            if (z && !abaVar2.v()) {
                return;
            }
            k99 t = abaVar2.t();
            c = la6.c(t.f());
            c2 = la6.c(t.i());
            c3 = la6.c(t.g());
            c4 = la6.c(t.c());
            Rect rect = new Rect(c, c2, c3, c4);
            Region region2 = new Region();
            region2.set(rect);
            if (abaVar2.m() == abaVar.m()) {
                m = -1;
            } else {
                m = abaVar2.m();
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(m);
                Rect bounds = region2.getBounds();
                z65.g(bounds, "region.bounds");
                map.put(valueOf, new cba(abaVar2, bounds));
                List<aba> r = abaVar2.r();
                for (int size = r.size() - 1; -1 < size; size--) {
                    v(region, abaVar, map, r.get(size));
                }
                region.op(rect, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (abaVar2.v()) {
                aba p = abaVar2.p();
                if (p != null && (n = p.n()) != null && n.b()) {
                    k99Var = p.h();
                } else {
                    k99Var = new k99(0.0f, 0.0f, 10.0f, 10.0f);
                }
                Integer valueOf2 = Integer.valueOf(m);
                c5 = la6.c(k99Var.f());
                c6 = la6.c(k99Var.i());
                c7 = la6.c(k99Var.g());
                c8 = la6.c(k99Var.c());
                map.put(valueOf2, new cba(abaVar2, new Rect(c5, c6, c7, c8)));
            } else if (m == -1) {
                Integer valueOf3 = Integer.valueOf(m);
                Rect bounds2 = region2.getBounds();
                z65.g(bounds2, "region.bounds");
                map.put(valueOf3, new cba(abaVar2, bounds2));
            }
        }
    }

    public static final float w(aba abaVar) {
        taa l = abaVar.l();
        eba ebaVar = eba.a;
        if (l.h(ebaVar.y())) {
            return ((Number) abaVar.l().p(ebaVar.y())).floatValue();
        }
        return 0.0f;
    }

    public static final String x(aba abaVar) {
        Object b0;
        List list = (List) uaa.a(abaVar.u(), eba.a.c());
        if (list != null) {
            b0 = sc1.b0(list);
            return (String) b0;
        }
        return null;
    }

    public static final boolean y(aba abaVar) {
        return abaVar.l().h(eba.a.n());
    }

    public static final boolean z(aba abaVar) {
        return abaVar.l().h(eba.a.o());
    }
}
