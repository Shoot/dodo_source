package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.d4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: CollectionInfo.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0002\u001a\u0014\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r*\u00020\fH\u0002\u001a\u001c\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\u00120\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0002\"\u0018\u0010\u0016\u001a\u00020\u0007*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Laba;", "node", "Ld4;", "info", "", DateTokenConverter.CONVERTER_KEY, e.a, "", "b", "", "items", "a", "Lzb1;", "Ld4$b;", "kotlin.jvm.PlatformType", "f", "Lbc1;", "itemNode", "Ld4$c;", "g", c.a, "(Lzb1;)Z", "isLazyCollection", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ac1  reason: default package */
/* loaded from: classes.dex */
public final class ac1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollectionInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ac1$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Boolean> {
        public static final a a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollectionInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ac1$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Boolean> {
        public static final b a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List<aba> list) {
        List l;
        Object Z;
        int n;
        long t;
        Object Z2;
        int n2;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            l = kc1.l();
        } else {
            l = new ArrayList();
            aba abaVar = list.get(0);
            n2 = kc1.n(list);
            int i = 0;
            while (i < n2) {
                i++;
                aba abaVar2 = list.get(i);
                aba abaVar3 = abaVar2;
                aba abaVar4 = abaVar;
                l.add(s67.d(x67.a(Math.abs(s67.l(abaVar4.h().d()) - s67.l(abaVar3.h().d())), Math.abs(s67.m(abaVar4.h().d()) - s67.m(abaVar3.h().d())))));
                abaVar = abaVar2;
            }
        }
        if (l.size() == 1) {
            Z2 = sc1.Z(l);
            t = ((s67) Z2).t();
        } else if (!l.isEmpty()) {
            Z = sc1.Z(l);
            n = kc1.n(l);
            if (1 <= n) {
                int i2 = 1;
                while (true) {
                    Z = s67.d(s67.q(((s67) Z).t(), ((s67) l.get(i2)).t()));
                    if (i2 == n) {
                        break;
                    }
                    i2++;
                }
            }
            t = ((s67) Z).t();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (s67.f(t) < s67.e(t)) {
            return true;
        }
        return false;
    }

    public static final boolean b(aba abaVar) {
        z65.h(abaVar, "<this>");
        taa l = abaVar.l();
        eba ebaVar = eba.a;
        if (uaa.a(l, ebaVar.a()) == null && uaa.a(abaVar.l(), ebaVar.r()) == null) {
            return false;
        }
        return true;
    }

    private static final boolean c(zb1 zb1Var) {
        if (zb1Var.b() >= 0 && zb1Var.a() >= 0) {
            return false;
        }
        return true;
    }

    public static final void d(aba abaVar, d4 d4Var) {
        int size;
        z65.h(abaVar, "node");
        z65.h(d4Var, "info");
        taa l = abaVar.l();
        eba ebaVar = eba.a;
        zb1 zb1Var = (zb1) uaa.a(l, ebaVar.a());
        if (zb1Var != null) {
            d4Var.p0(f(zb1Var));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (uaa.a(abaVar.l(), ebaVar.r()) != null) {
            List<aba> r = abaVar.r();
            int size2 = r.size();
            for (int i = 0; i < size2; i++) {
                aba abaVar2 = r.get(i);
                if (abaVar2.l().h(eba.a.s())) {
                    arrayList.add(abaVar2);
                }
            }
        }
        int i2 = 1;
        if (!arrayList.isEmpty()) {
            boolean a2 = a(arrayList);
            if (a2) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (a2) {
                i2 = arrayList.size();
            }
            d4Var.p0(d4.b.d(size, i2, false, 0));
        }
    }

    public static final void e(aba abaVar, d4 d4Var) {
        int i;
        int i2;
        z65.h(abaVar, "node");
        z65.h(d4Var, "info");
        taa l = abaVar.l();
        eba ebaVar = eba.a;
        bc1 bc1Var = (bc1) uaa.a(l, ebaVar.b());
        if (bc1Var != null) {
            d4Var.q0(g(bc1Var, abaVar));
        }
        aba p = abaVar.p();
        if (p != null && uaa.a(p.l(), ebaVar.r()) != null) {
            zb1 zb1Var = (zb1) uaa.a(p.l(), ebaVar.a());
            if ((zb1Var != null && c(zb1Var)) || !abaVar.l().h(ebaVar.s())) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<aba> r = p.r();
            int size = r.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                aba abaVar2 = r.get(i4);
                if (abaVar2.l().h(eba.a.s())) {
                    arrayList.add(abaVar2);
                    if (abaVar2.o().i0() < abaVar.o().i0()) {
                        i3++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean a2 = a(arrayList);
                if (a2) {
                    i = 0;
                } else {
                    i = i3;
                }
                if (a2) {
                    i2 = i3;
                } else {
                    i2 = 0;
                }
                d4.c f = d4.c.f(i, 1, i2, 1, false, ((Boolean) abaVar.l().t(eba.a.s(), a.a)).booleanValue());
                if (f != null) {
                    d4Var.q0(f);
                }
            }
        }
    }

    private static final d4.b f(zb1 zb1Var) {
        return d4.b.d(zb1Var.b(), zb1Var.a(), false, 0);
    }

    private static final d4.c g(bc1 bc1Var, aba abaVar) {
        return d4.c.f(bc1Var.c(), bc1Var.d(), bc1Var.a(), bc1Var.b(), false, ((Boolean) abaVar.l().t(eba.a.s(), b.a)).booleanValue());
    }
}
