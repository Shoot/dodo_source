package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.fda;
import defpackage.os8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.i;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: LoyaltyInteractor.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\b\b\u0001\u0010:\u001a\u000207¢\u0006\u0004\b@\u0010AJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0012J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010?\u001a\n <*\u0004\u0018\u00010;0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B"}, d2 = {"Ls06;", "Lox1;", "Lt06;", "loyaltyMenu", "Lkotlin/Pair;", "", "", Image.TYPE_MEDIUM, "addedCount", "actualBalance", "Los8;", "l", "Lab1;", "domain", "Ldb1;", "k", "Lu06;", "p", "(Lcv1;)Ljava/lang/Object;", "n", "Ln06;", "o", "alreadyLoadedCount", "", "Lr06;", "q", "(ILcv1;)Ljava/lang/Object;", "Lx26;", "a", "Lx26;", "loyaltyService", "Lt52;", "b", "Lt52;", "customerService", "Lds0;", com.huawei.hms.opendevice.c.a, "Lds0;", "cartService", "Lava;", DateTokenConverter.CONVERTER_KEY, "Lava;", "stateProvider", "Lhq3;", e.a, "Lhq3;", "featureService", "Ldt5;", "f", "Ldt5;", "locality", "Lfda;", "g", "Lfda;", "dateTimeParser", "Lkx1;", Image.TYPE_HIGH, "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "i", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lx26;Lt52;Lds0;Lava;Lhq3;Ldt5;Lfda;Lkx1;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s06  reason: default package */
/* loaded from: classes2.dex */
public final class s06 implements ox1 {
    private final x26 a;
    private final t52 b;
    private final ds0 c;
    private final ava d;
    private final hq3 e;
    private final dt5 f;
    private final fda g;
    private final kx1 h;
    private final Logger i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Ldb1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.menu.LoyaltyInteractor$getCoinsExpirations$2", f = "LoyaltyInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: s06$a */
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super db1>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super db1> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (!s06.this.e.a(bq3.T5)) {
                    return null;
                }
                try {
                    return s06.this.k(s06.this.a.a());
                } catch (Exception e) {
                    s06.this.i.error("Can`t load coins expirations", (Throwable) e);
                    return null;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Ln06;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.menu.LoyaltyInteractor$getLoyaltyHistoryData$2", f = "LoyaltyInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: s06$b */
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super n06>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super n06> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return new n06(s06.this.e.a(bq3.B5));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lu06;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.menu.LoyaltyInteractor$getLoyaltyMenuData$2", f = "LoyaltyInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: s06$c */
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<qx1, cv1<? super u06>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super u06> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            t06 f;
            int w;
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                jk7 c = jua.c(s06.this.d.e());
                double k = s06.this.b.f().k();
                String selectedPizzeriaId = s06.this.d.e().getSelectedPizzeriaId();
                if (c == jk7.e) {
                    f = s06.this.a.h(s06.this.f.getId(), selectedPizzeriaId);
                } else {
                    f = s06.this.a.f(s06.this.f.getId(), selectedPizzeriaId);
                }
                Pair m = s06.this.m(f);
                int intValue = ((Number) m.a()).intValue();
                double doubleValue = k - ((Number) m.b()).doubleValue();
                os8 l = s06.this.l(f, intValue, doubleValue);
                List<a26> a = f.a();
                w = lc1.w(a, 10);
                ArrayList arrayList = new ArrayList(w);
                for (a26 a26Var : a) {
                    String a2 = a26Var.a();
                    String c2 = a26Var.c();
                    String b = a26Var.b().b();
                    double d = a26Var.d();
                    hn6 c3 = f.c();
                    List<y16> e = a26Var.e();
                    if (doubleValue >= a26Var.d()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new b26(a2, c2, b, d, c3, e, z));
                }
                return new u06(arrayList, l, doubleValue, f.b());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "Lr06;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.menu.LoyaltyInteractor$loadHistoryOperations$2", f = "LoyaltyInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: s06$d */
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<qx1, cv1<? super List<? extends r06>>, Object> {
        int a;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.c = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(this.c, cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super List<r06>> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List<o06> e = s06.this.a.e(this.c);
                s06 s06Var = s06.this;
                w = lc1.w(e, 10);
                ArrayList arrayList = new ArrayList(w);
                for (o06 o06Var : e) {
                    arrayList.add(new r06(o06Var.e(), o06Var.d(), o06Var.a(), fda.a.a(s06Var.g, o06Var.b(), null, 2, null), fda.a.a(s06Var.g, o06Var.c(), null, 2, null), o06Var.f()));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super List<? extends r06>> cv1Var) {
            return invoke2(qx1Var, (cv1<? super List<r06>>) cv1Var);
        }
    }

    public s06(x26 x26Var, t52 t52Var, ds0 ds0Var, ava avaVar, hq3 hq3Var, dt5 dt5Var, fda fdaVar, kx1 kx1Var) {
        z65.h(x26Var, "loyaltyService");
        z65.h(t52Var, "customerService");
        z65.h(ds0Var, "cartService");
        z65.h(avaVar, "stateProvider");
        z65.h(hq3Var, "featureService");
        z65.h(dt5Var, "locality");
        z65.h(fdaVar, "dateTimeParser");
        z65.h(kx1Var, "ioDispatcher");
        this.a = x26Var;
        this.b = t52Var;
        this.c = ds0Var;
        this.d = avaVar;
        this.e = hq3Var;
        this.f = dt5Var;
        this.g = fdaVar;
        this.h = kx1Var;
        this.i = LoggerFactory.getLogger("LoyaltyInteractor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final db1 k(ab1 ab1Var) {
        int w;
        int b2 = ab1Var.b();
        int c2 = ab1Var.c();
        Collection<wa1> a2 = ab1Var.a();
        w = lc1.w(a2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (wa1 wa1Var : a2) {
            arrayList.add(new xa1(fda.a.a(this.g, wa1Var.b(), null, 2, null), wa1Var.a()));
        }
        return new db1(b2, c2, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final os8 l(t06 t06Var, int i, double d2) {
        Object next;
        Double d3;
        Object next2;
        if (i != 0) {
            return new os8.b(i);
        }
        if (d2 == 0.0d) {
            return os8.e.a;
        }
        Iterator<T> it = t06Var.a().iterator();
        Double d4 = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                double d5 = ((a26) next).d();
                do {
                    Object next3 = it.next();
                    double d6 = ((a26) next3).d();
                    if (Double.compare(d5, d6) > 0) {
                        next = next3;
                        d5 = d6;
                    }
                } while (it.hasNext());
            }
        }
        a26 a26Var = (a26) next;
        if (a26Var != null) {
            d3 = Double.valueOf(a26Var.d());
        } else {
            d3 = null;
        }
        if (d2 < ((Number) mh5.c(d3, Double.valueOf(0.0d))).doubleValue()) {
            return os8.a.a;
        }
        Iterator<T> it2 = t06Var.a().iterator();
        if (!it2.hasNext()) {
            next2 = null;
        } else {
            next2 = it2.next();
            if (it2.hasNext()) {
                double d7 = ((a26) next2).d();
                do {
                    Object next4 = it2.next();
                    double d8 = ((a26) next4).d();
                    if (Double.compare(d7, d8) < 0) {
                        next2 = next4;
                        d7 = d8;
                    }
                } while (it2.hasNext());
            }
        }
        a26 a26Var2 = (a26) next2;
        if (a26Var2 != null) {
            d4 = Double.valueOf(a26Var2.d());
        }
        if (d2 >= ((Number) mh5.c(d4, Double.valueOf(0.0d))).doubleValue()) {
            return os8.d.a;
        }
        return os8.c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Integer, Double> m(t06 t06Var) {
        int w;
        int e;
        int e2;
        int w2;
        int w3;
        Collection<nq0> c2 = this.c.c();
        w = lc1.w(c2, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (nq0 nq0Var : c2) {
            Pair a2 = lnb.a(nq0Var.X(), Integer.valueOf(nq0Var.d()));
            linkedHashMap.put(a2.c(), a2.d());
        }
        List<a26> a3 = t06Var.a();
        w2 = lc1.w(a3, 10);
        ArrayList<Pair> arrayList = new ArrayList(w2);
        for (a26 a26Var : a3) {
            List<y16> e3 = a26Var.e();
            w3 = lc1.w(e3, 10);
            ArrayList<String> arrayList2 = new ArrayList(w3);
            for (y16 y16Var : e3) {
                arrayList2.add(y16Var.G0());
            }
            int i = 0;
            for (String str : arrayList2) {
                i += ((Number) mh5.c(linkedHashMap.get(str), 0)).intValue();
            }
            arrayList.add(lnb.a(a26Var, Integer.valueOf(i)));
        }
        Pair<Integer, Double> a4 = lnb.a(0, Double.valueOf(0.0d));
        for (Pair pair : arrayList) {
            int intValue = a4.a().intValue();
            double doubleValue = a4.b().doubleValue();
            int intValue2 = ((Number) pair.b()).intValue();
            a4 = lnb.a(Integer.valueOf(intValue + intValue2), Double.valueOf(doubleValue + (((a26) pair.a()).d() * intValue2)));
        }
        return a4;
    }

    public final Object n(cv1<? super db1> cv1Var) {
        return qh0.g(this.h, new a(null), cv1Var);
    }

    public final Object o(cv1<? super n06> cv1Var) {
        return qh0.g(this.h, new b(null), cv1Var);
    }

    public final Object p(cv1<? super u06> cv1Var) {
        return qh0.g(this.h, new c(null), cv1Var);
    }

    public final Object q(int i, cv1<? super List<r06>> cv1Var) {
        return qh0.g(this.h, new d(i, null), cv1Var);
    }
}
