package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.txb;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: VectorPainter.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a{\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Li73;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "", Action.NAME_ATTRIBUTE, "Luc1;", "tintColor", "Lpc0;", "tintBlendMode", "", "autoMirror", "Lkotlin/Function2;", "", RemoteMessageConst.Notification.CONTENT, "Lqxb;", com.huawei.hms.opendevice.c.a, "(FFFFLjava/lang/String;JIZLa94;Lqn1;II)Lqxb;", "Lyv4;", ElementGenerator.TYPE_IMAGE, "b", "(Lyv4;Lqn1;I)Lqxb;", "Lnxb;", "group", "", "Lkxb;", "configs", "a", "(Lnxb;Ljava/util/Map;Lqn1;II)V", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: rxb  reason: default package */
/* loaded from: classes.dex */
public final class rxb {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: rxb$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ pxb a;
        final /* synthetic */ Map<String, kxb> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pxb pxbVar, Map<String, ? extends kxb> map) {
            super(2);
            this.a = pxbVar;
            this.b = map;
        }

        public final void a(qn1 qn1Var, int i) {
            if ((i & 11) == 2 && qn1Var.g()) {
                qn1Var.E();
                return;
            }
            if (tn1.K()) {
                tn1.V(1450046638, i, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:413)");
            }
            rxb.a((nxb) this.a, this.b, qn1Var, 64, 0);
            if (tn1.K()) {
                tn1.U();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rxb$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ nxb a;
        final /* synthetic */ Map<String, kxb> b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(nxb nxbVar, Map<String, ? extends kxb> map, int i, int i2) {
            super(2);
            this.a = nxbVar;
            this.b = map;
            this.c = i;
            this.d = i2;
        }

        public final void a(qn1 qn1Var, int i) {
            rxb.a(this.a, this.b, qn1Var, f99.a(this.c | 1), this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rxb$c", "Lkxb;", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: rxb$c */
    /* loaded from: classes.dex */
    public static final class c implements kxb {
        c() {
        }

        @Override // defpackage.kxb
        public /* synthetic */ Object a(txb txbVar, Object obj) {
            return jxb.a(this, txbVar, obj);
        }
    }

    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rxb$d", "Lkxb;", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: rxb$d */
    /* loaded from: classes.dex */
    public static final class d implements kxb {
        d() {
        }

        @Override // defpackage.kxb
        public /* synthetic */ Object a(txb txbVar, Object obj) {
            return jxb.a(this, txbVar, obj);
        }
    }

    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(FFLqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: rxb$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements a94<Float, Float, qn1, Integer, Unit> {
        final /* synthetic */ yv4 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(yv4 yv4Var) {
            super(4);
            this.a = yv4Var;
        }

        public final void a(float f, float f2, qn1 qn1Var, int i) {
            if ((i & 11) == 2 && qn1Var.g()) {
                qn1Var.E();
                return;
            }
            if (tn1.K()) {
                tn1.V(1873274766, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous> (VectorPainter.kt:167)");
            }
            rxb.a(this.a.e(), null, qn1Var, 0, 2);
            if (tn1.K()) {
                tn1.U();
            }
        }

        @Override // defpackage.a94
        public /* bridge */ /* synthetic */ Unit q(Float f, Float f2, qn1 qn1Var, Integer num) {
            a(f.floatValue(), f2.floatValue(), qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public static final void a(nxb nxbVar, Map<String, ? extends kxb> map, qn1 qn1Var, int i, int i2) {
        int i3;
        int i4;
        Map<String, ? extends kxb> map2;
        Map<String, ? extends kxb> map3;
        qn1 qn1Var2;
        Map<String, ? extends kxb> map4;
        Map<String, ? extends kxb> h;
        z65.h(nxbVar, "group");
        qn1 f = qn1Var.f(-446179233);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (f.K(nxbVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 16;
        }
        if (i5 == 2 && (i3 & 91) == 18 && f.g()) {
            f.E();
            map3 = map;
            qn1Var2 = f;
        } else {
            if (i5 != 0) {
                h = g86.h();
                map2 = h;
            } else {
                map2 = map;
            }
            if (tn1.K()) {
                tn1.V(-446179233, i, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:327)");
            }
            Iterator<pxb> it = nxbVar.iterator();
            while (it.hasNext()) {
                pxb next = it.next();
                if (next instanceof sxb) {
                    f.w(-326285735);
                    sxb sxbVar = (sxb) next;
                    kxb kxbVar = map2.get(sxbVar.h());
                    if (kxbVar == null) {
                        kxbVar = new c();
                    }
                    kxb kxbVar2 = kxbVar;
                    qn1 qn1Var3 = f;
                    ixb.b((List) kxbVar2.a(txb.c.a, sxbVar.k()), sxbVar.p(), sxbVar.h(), (mg0) kxbVar2.a(txb.a.a, sxbVar.d()), ((Number) kxbVar2.a(txb.b.a, Float.valueOf(sxbVar.g()))).floatValue(), (mg0) kxbVar2.a(txb.i.a, sxbVar.t()), ((Number) kxbVar2.a(txb.j.a, Float.valueOf(sxbVar.u()))).floatValue(), ((Number) kxbVar2.a(txb.k.a, Float.valueOf(sxbVar.A()))).floatValue(), sxbVar.v(), sxbVar.x(), sxbVar.z(), ((Number) kxbVar2.a(txb.p.a, Float.valueOf(sxbVar.D()))).floatValue(), ((Number) kxbVar2.a(txb.n.a, Float.valueOf(sxbVar.B()))).floatValue(), ((Number) kxbVar2.a(txb.o.a, Float.valueOf(sxbVar.C()))).floatValue(), qn1Var3, 8, 0, 0);
                    qn1Var3.J();
                    it = it;
                    map2 = map2;
                    f = qn1Var3;
                } else {
                    Iterator<pxb> it2 = it;
                    Map<String, ? extends kxb> map5 = map2;
                    qn1 qn1Var4 = f;
                    if (next instanceof nxb) {
                        qn1Var4.w(-326283877);
                        nxb nxbVar2 = (nxb) next;
                        map4 = map5;
                        kxb kxbVar3 = map4.get(nxbVar2.h());
                        if (kxbVar3 == null) {
                            kxbVar3 = new d();
                        }
                        ixb.a(nxbVar2.h(), ((Number) kxbVar3.a(txb.f.a, Float.valueOf(nxbVar2.t()))).floatValue(), ((Number) kxbVar3.a(txb.d.a, Float.valueOf(nxbVar2.k()))).floatValue(), ((Number) kxbVar3.a(txb.e.a, Float.valueOf(nxbVar2.p()))).floatValue(), ((Number) kxbVar3.a(txb.g.a, Float.valueOf(nxbVar2.u()))).floatValue(), ((Number) kxbVar3.a(txb.h.a, Float.valueOf(nxbVar2.v()))).floatValue(), ((Number) kxbVar3.a(txb.l.a, Float.valueOf(nxbVar2.x()))).floatValue(), ((Number) kxbVar3.a(txb.m.a, Float.valueOf(nxbVar2.z()))).floatValue(), (List) kxbVar3.a(txb.c.a, nxbVar2.g()), gn1.b(qn1Var4, 1450046638, true, new a(next, map4)), qn1Var4, 939524096, 0);
                        qn1Var4.J();
                    } else {
                        map4 = map5;
                        qn1Var4.w(-326282407);
                        qn1Var4.J();
                    }
                    f = qn1Var4;
                    map2 = map4;
                    it = it2;
                }
            }
            map3 = map2;
            qn1Var2 = f;
            if (tn1.K()) {
                tn1.U();
            }
        }
        xw9 i6 = qn1Var2.i();
        if (i6 != null) {
            i6.a(new b(nxbVar, map3, i, i2));
        }
    }

    public static final qxb b(yv4 yv4Var, qn1 qn1Var, int i) {
        z65.h(yv4Var, ElementGenerator.TYPE_IMAGE);
        qn1Var.w(1413834416);
        if (tn1.K()) {
            tn1.V(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:157)");
        }
        qxb c2 = c(yv4Var.c(), yv4Var.b(), yv4Var.i(), yv4Var.h(), yv4Var.d(), yv4Var.g(), yv4Var.f(), yv4Var.a(), gn1.b(qn1Var, 1873274766, true, new e(yv4Var)), qn1Var, 100663296, 0);
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
        return c2;
    }

    public static final qxb c(float f, float f2, float f3, float f4, String str, long j, int i, boolean z, a94<? super Float, ? super Float, ? super qn1, ? super Integer, Unit> a94Var, qn1 qn1Var, int i2, int i3) {
        float f5;
        String str2;
        long j2;
        int i4;
        boolean z2;
        wc1 wc1Var;
        z65.h(a94Var, RemoteMessageConst.Notification.CONTENT);
        qn1Var.w(1068590786);
        float f6 = Float.NaN;
        if ((i3 & 4) != 0) {
            f5 = Float.NaN;
        } else {
            f5 = f3;
        }
        if ((i3 & 8) == 0) {
            f6 = f4;
        }
        if ((i3 & 16) != 0) {
            str2 = "VectorRootGroup";
        } else {
            str2 = str;
        }
        if ((i3 & 32) != 0) {
            j2 = uc1.b.e();
        } else {
            j2 = j;
        }
        if ((i3 & 64) != 0) {
            i4 = pc0.b.z();
        } else {
            i4 = i;
        }
        if ((i3 & 128) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if (tn1.K()) {
            tn1.V(1068590786, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:115)");
        }
        a03 a03Var = (a03) qn1Var.k(ro1.c());
        float n0 = a03Var.n0(f);
        float n02 = a03Var.n0(f2);
        if (Float.isNaN(f5)) {
            f5 = n0;
        }
        if (Float.isNaN(f6)) {
            f6 = n02;
        }
        uc1 f7 = uc1.f(j2);
        pc0 D = pc0.D(i4);
        int i5 = i2 >> 15;
        qn1Var.w(511388516);
        boolean K = qn1Var.K(f7) | qn1Var.K(D);
        Object x = qn1Var.x();
        if (K || x == qn1.a.a()) {
            if (!uc1.l(j2, uc1.b.e())) {
                wc1Var = wc1.b.a(j2, i4);
            } else {
                wc1Var = null;
            }
            x = wc1Var;
            qn1Var.p(x);
        }
        qn1Var.J();
        wc1 wc1Var2 = (wc1) x;
        qn1Var.w(-492369756);
        Object x2 = qn1Var.x();
        if (x2 == qn1.a.a()) {
            x2 = new qxb();
            qn1Var.p(x2);
        }
        qn1Var.J();
        qxb qxbVar = (qxb) x2;
        qxbVar.u(ina.a(n0, n02));
        qxbVar.r(z2);
        qxbVar.t(wc1Var2);
        qxbVar.k(str2, f5, f6, a94Var, qn1Var, ((i2 >> 12) & 14) | 32768 | (i5 & 7168));
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
        return qxbVar;
    }
}
