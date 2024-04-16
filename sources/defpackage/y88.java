package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.a68;
import defpackage.qv9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
/* compiled from: PizzeriaMapper.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u0007\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002J\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0002J0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, d2 = {"Ly88;", "Lx88;", "Ld88;", "Lov5;", "userLocation", "selectedPizzeria", "Lb68;", e.a, "pizzeria", "Ljb7;", com.huawei.hms.opendevice.c.a, "Lqv9;", "La68;", DateTokenConverter.CONVERTER_KEY, "location", "Lx58;", "b", "", "", "a", "Lpv9;", "Lpv9;", "scheduleHelper", "Lr43;", "Lr43;", "distanceMeasurer", "Ln43;", "Ln43;", "distanceFormatter", "<init>", "(Lpv9;Lr43;Ln43;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y88  reason: default package */
/* loaded from: classes2.dex */
public final class y88 implements x88 {
    private final pv9 a;
    private final r43 b;
    private final n43 c;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y88$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Float f;
            int d;
            x58 c = ((b68) t).c();
            Float f2 = null;
            if (c != null) {
                f = Float.valueOf(c.b());
            } else {
                f = null;
            }
            x58 c2 = ((b68) t2).c();
            if (c2 != null) {
                f2 = Float.valueOf(c2.b());
            }
            d = mk1.d(f, f2);
            return d;
        }
    }

    /* compiled from: PizzeriaMapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb68;", "it", "", "a", "(Lb68;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y88$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<b68, Comparable<?>> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(b68 b68Var) {
            z65.h(b68Var, "it");
            return b68Var.e();
        }
    }

    /* compiled from: PizzeriaMapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb68;", "it", "", "a", "(Lb68;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y88$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<b68, Comparable<?>> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(b68 b68Var) {
            z65.h(b68Var, "it");
            return b68Var.g().q();
        }
    }

    public y88(pv9 pv9Var, r43 r43Var, n43 n43Var) {
        z65.h(pv9Var, "scheduleHelper");
        z65.h(r43Var, "distanceMeasurer");
        z65.h(n43Var, "distanceFormatter");
        this.a = pv9Var;
        this.b = r43Var;
        this.c = n43Var;
    }

    private final x58 b(d88 d88Var, ov5 ov5Var) {
        if (ov5Var != null) {
            float a2 = this.b.a(d88Var.x(), ov5Var);
            return new x58(a2, this.c.b(a2));
        }
        return null;
    }

    private final jb7 c(d88 d88Var) {
        boolean contains = d88Var.G().contains(ib7.d);
        boolean contains2 = d88Var.G().contains(ib7.e);
        boolean contains3 = d88Var.G().contains(ib7.c);
        if (contains2) {
            if (contains3 && contains) {
                return jb7.a;
            }
            if (contains3) {
                return jb7.b;
            }
            if (contains) {
                return jb7.c;
            }
            return jb7.f;
        } else if (contains) {
            return jb7.d;
        } else {
            if (!contains && contains3) {
                return jb7.e;
            }
            return jb7.f;
        }
    }

    private final a68 d(qv9 qv9Var) {
        if (qv9Var instanceof qv9.b) {
            qv9.b bVar = (qv9.b) qv9Var;
            return new a68.c(sv9.b(bVar), sv9.c(bVar));
        } else if (qv9Var instanceof qv9.a) {
            qv9.a aVar = (qv9.a) qv9Var;
            if (sv9.e(aVar)) {
                return new a68.e(sv9.a(aVar));
            }
            return new a68.f(sv9.a(aVar));
        } else if (z65.c(qv9Var, qv9.c.a)) {
            return a68.b.a;
        } else {
            if (z65.c(qv9Var, qv9.d.a)) {
                return a68.d.a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private final b68 e(d88 d88Var, ov5 ov5Var, d88 d88Var2) {
        String str;
        String id = d88Var.getId();
        String s = d88Var.s();
        String w = d88Var.w();
        String q = d88Var.q();
        jb7 c2 = c(d88Var);
        a68 d = d(this.a.c(d88Var.H(), d88Var.L()));
        x58 b2 = b(d88Var, ov5Var);
        String id2 = d88Var.getId();
        if (d88Var2 != null) {
            str = d88Var2.getId();
        } else {
            str = null;
        }
        return new b68(id, s, w, d88Var, q, c2, d, b2, false, false, z65.c(id2, str), null, 2048, null);
    }

    @Override // defpackage.x88
    public List<b68> a(Collection<d88> collection, ov5 ov5Var, d88 d88Var) {
        int w;
        List y0;
        int w2;
        boolean z;
        Comparator b2;
        List y02;
        int w3;
        z65.h(collection, "pizzeria");
        Collection<d88> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (d88 d88Var2 : collection2) {
            arrayList.add(e(d88Var2, ov5Var, d88Var));
        }
        if (ov5Var == null) {
            b2 = mk1.b(b.a, c.a);
            y02 = sc1.y0(arrayList, b2);
            List<b68> list = y02;
            w3 = lc1.w(list, 10);
            ArrayList arrayList2 = new ArrayList(w3);
            for (b68 b68Var : list) {
                arrayList2.add(b68.b(b68Var, null, null, null, null, null, null, null, null, false, false, false, null, 2047, null));
            }
            return arrayList2;
        }
        y0 = sc1.y0(arrayList, new a());
        List list2 = y0;
        w2 = lc1.w(list2, 10);
        ArrayList arrayList3 = new ArrayList(w2);
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                kc1.v();
            }
            b68 b68Var2 = (b68) obj;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            arrayList3.add(b68.b(b68Var2, null, null, null, null, null, null, null, null, false, false, false, Boolean.valueOf(z), 2047, null));
            i = i2;
        }
        return arrayList3;
    }
}
