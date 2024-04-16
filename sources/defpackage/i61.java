package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bq0;
import defpackage.cu7;
import defpackage.d41;
import defpackage.jw7;
import defpackage.nk9;
import defpackage.pt2;
import defpackage.sx6;
import defpackage.u31;
import defpackage.uu2;
import defpackage.v51;
import defpackage.zo7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CheckoutStateLogic.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\bD\u0010EJ\u001a\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u001a\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u001a\u0010\b\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\f\u0010\r\u001a\u00020\f*\u00020\u0004H\u0002J\u001a\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u001a\u0010\u0013\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0002H\u0002J\u001a\u0010\u0019\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u001d\u0010\u001e\u001a\u00020\u001d*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\"\u001a\u00020\u0002*\u00020\u00022\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020 H\u0002J\u0014\u0010%\u001a\u00020\u0002*\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0016J\u0014\u0010(\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\u0014\u0010)\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\f\u0010*\u001a\u00020\u0002*\u00020\u0002H\u0016J\f\u0010+\u001a\u00020\u0002*\u00020\u0002H\u0016J\u001d\u0010,\u001a\u00020\u0002*\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b,\u0010-J\f\u0010.\u001a\u00020\u001d*\u00020\u0002H\u0016J\f\u0010/\u001a\u00020\u001d*\u00020\u0002H\u0016J\u001a\u00100\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0014\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u00101\u001a\u00020\u0004H\u0016J\u0014\u00105\u001a\u00020\u0002*\u00020\u00022\u0006\u00104\u001a\u000203H\u0016J\u0014\u00106\u001a\u00020\u0002*\u00020\u00022\u0006\u00104\u001a\u000203H\u0016J\f\u00107\u001a\u00020\u0002*\u00020\u0002H\u0016J\u0014\u00108\u001a\u00020\u0002*\u00020\u00022\u0006\u00104\u001a\u000203H\u0016J\f\u00109\u001a\u00020\u0002*\u00020\u0002H\u0016J\f\u0010:\u001a\u00020\u0002*\u00020\u0002H\u0016J\f\u0010;\u001a\u00020\u0002*\u00020\u0002H\u0016J\u001d\u0010<\u001a\u00020\u0002*\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b<\u0010-J-\u0010@\u001a\u00020\u0002*\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u001dH\u0016¢\u0006\u0004\b@\u0010AJ\u001d\u0010C\u001a\u00020\u0002*\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\bC\u0010-¨\u0006G"}, d2 = {"Li61;", "Lh61;", "Lb61;", "", "Ld41;", "errors", com.huawei.hms.push.e.a, "g", Image.TYPE_HIGH, "i", DateTokenConverter.CONVERTER_KEY, "j", "Lv51;", "L", "l", "checkoutState", "Lu31;", "p", "q", "f", "Lhn6;", "r", "", "Lsx6$a;", "deferredTimes", "J", "Lsx6$b;", "", CrashHianalyticsData.TIME, "", Image.TYPE_MEDIUM, "(Lsx6$b;Ljava/lang/Long;)Z", "Lkotlin/Function2;", "transform", "H", "Lou2;", "deliverablePlace", "w", "Ld88;", "pizzeria", "C", "y", "E", "t", "B", "(Lb61;Ljava/lang/Long;)Lb61;", Image.TYPE_SMALL, "I", "F", "error", "z", "Ljw7;", "paymentWay", "u", "K", "D", "A", "k", "G", "x", "n", "", "title", "isSuggested", "o", "(Lb61;Ljava/lang/Long;Ljava/lang/String;Z)Lb61;", "loadingTime", "v", "<init>", "()V", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i61  reason: default package */
/* loaded from: classes4.dex */
public final class i61 implements h61 {
    private static final a a = new a(null);
    private static final List<d41> b;
    private static final List<od5<? extends d41>> c;
    private static final List<Class<? extends d41>> d;

    /* compiled from: CheckoutStateLogic.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Li61$a;", "", "", "Ljava/lang/Class;", "Ld41;", "DEFERRED_TIME_ERRORS", "Ljava/util/List;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i61$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CheckoutStateLogic.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb61;", "Lsx6$b;", "newDeferredTime", "a", "(Lb61;Lsx6$b;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: i61$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function2<b61, sx6.b, b61> {
        final /* synthetic */ Long b;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Long l, String str, boolean z) {
            super(2);
            this.b = l;
            this.c = str;
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final b61 invoke(b61 b61Var, sx6.b bVar) {
            Object dVar;
            List r0;
            z65.h(b61Var, "$this$modifyStateIfHasNewDeferredTime");
            z65.h(bVar, "newDeferredTime");
            if (i61.this.m(bVar, this.b)) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : bVar.a()) {
                    sx6.a aVar = (sx6.a) obj;
                    if (aVar instanceof sx6.a.d) {
                        sx6.a.d dVar2 = (sx6.a.d) aVar;
                        if (dVar2.i() && dVar2.f().length() != 0) {
                        }
                    }
                    arrayList.add(obj);
                }
                return i61.this.J(b61Var, arrayList);
            }
            if (this.b == null) {
                dVar = new sx6.a.c(this.c, false, false, this.d);
            } else {
                dVar = new sx6.a.d(this.b, this.c, false, false, this.d);
            }
            i61 i61Var = i61.this;
            r0 = sc1.r0(bVar.a(), dVar);
            return i61Var.J(b61Var, r0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateLogic.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld41;", "error", "Lb61;", "a", "(Ld41;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: i61$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<d41, b61> {
        final /* synthetic */ b61 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b61 b61Var) {
            super(1);
            this.a = b61Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(d41 d41Var) {
            d41 d41Var2;
            b61 b;
            z65.h(d41Var, "error");
            if (i61.d.contains(d41Var.getClass())) {
                d41Var2 = d41Var;
            } else {
                d41Var2 = null;
            }
            if (d41Var2 == null) {
                return null;
            }
            b61 b61Var = this.a;
            if ((z65.c(b61Var.e(), pt2.e.b) || z65.c(b61Var.e(), pt2.c.b) || (b61Var.e() instanceof pt2.a)) && (d41Var instanceof d41.h)) {
                b = b61.b(b61Var, null, null, null, null, b61Var.e(), null, null, null, null, null, null, false, null, 8175, null);
            } else {
                b = b61.b(b61Var, null, null, null, null, new pt2.b(b61Var.e().a(), d41Var), null, null, null, null, null, null, false, null, 8175, null);
            }
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateLogic.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld41;", "error", "Lb61;", "a", "(Ld41;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: i61$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<d41, b61> {
        final /* synthetic */ b61 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b61 b61Var) {
            super(1);
            this.a = b61Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(d41 d41Var) {
            d41 d41Var2;
            z65.h(d41Var, "error");
            if (i61.d.contains(d41Var.getClass())) {
                d41Var2 = d41Var;
            } else {
                d41Var2 = null;
            }
            if (d41Var2 == null) {
                return null;
            }
            b61 b61Var = this.a;
            return b61.b(b61Var, null, null, null, null, null, new sx6.b.a(((sx6.b) b61Var.j()).a(), d41Var), null, null, null, null, null, false, null, 8159, null);
        }
    }

    /* compiled from: CheckoutStateLogic.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb61;", "Lsx6$b;", "deferredTime", "a", "(Lb61;Lsx6$b;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: i61$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function2<b61, sx6.b, b61> {
        final /* synthetic */ Long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Long l) {
            super(2);
            this.b = l;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final b61 invoke(b61 b61Var, sx6.b bVar) {
            int w;
            z65.h(b61Var, "$this$modifyStateIfHasNewDeferredTime");
            z65.h(bVar, "deferredTime");
            List<sx6.a> a = bVar.a();
            Long l = this.b;
            w = lc1.w(a, 10);
            ArrayList arrayList = new ArrayList(w);
            for (Object obj : a) {
                if (obj instanceof sx6.a.b) {
                    sx6.a.b bVar2 = (sx6.a.b) obj;
                    if (!z65.c(bVar2.a(), l)) {
                        continue;
                    } else if (bVar2 instanceof sx6.a.c) {
                        obj = sx6.a.c.d((sx6.a.c) obj, null, false, true, false, 11, null);
                    } else if (bVar2 instanceof sx6.a.d) {
                        obj = sx6.a.d.d((sx6.a.d) obj, null, null, false, true, false, 23, null);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                arrayList.add(obj);
            }
            return i61.this.J(b61Var, arrayList);
        }
    }

    /* compiled from: CheckoutStateLogic.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb61;", "Lsx6$b;", "newDeferredTime", "a", "(Lb61;Lsx6$b;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: i61$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function2<b61, sx6.b, b61> {
        final /* synthetic */ Long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Long l) {
            super(2);
            this.b = l;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final b61 invoke(b61 b61Var, sx6.b bVar) {
            int w;
            z65.h(b61Var, "$this$modifyStateIfHasNewDeferredTime");
            z65.h(bVar, "newDeferredTime");
            List<sx6.a> a = bVar.a();
            Long l = this.b;
            w = lc1.w(a, 10);
            ArrayList arrayList = new ArrayList(w);
            for (Object obj : a) {
                if (!(obj instanceof sx6.a.C0671a)) {
                    if (obj instanceof sx6.a.c) {
                        sx6.a.c cVar = (sx6.a.c) obj;
                        obj = sx6.a.c.d(cVar, null, z65.c(l, cVar.a()), false, false, 13, null);
                    } else if (obj instanceof sx6.a.d) {
                        sx6.a.d dVar = (sx6.a.d) obj;
                        obj = sx6.a.d.d(dVar, null, null, z65.c(l, dVar.a()), false, false, 27, null);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                arrayList.add(obj);
            }
            return i61.this.J(b61Var, arrayList);
        }
    }

    static {
        List<d41> o;
        List<od5<? extends d41>> o2;
        List<Class<? extends d41>> o3;
        o = kc1.o(d41.l.c, d41.v.c, d41.m.c, d41.f.c, d41.a.c);
        b = o;
        o2 = kc1.o(bc9.b(d41.p.class), bc9.b(d41.o.class), bc9.b(d41.q.class), bc9.b(d41.c.class));
        c = o2;
        o3 = kc1.o(d41.h.class, d41.k.class);
        d = o3;
    }

    private final b61 H(b61 b61Var, Function2<? super b61, ? super sx6.b, b61> function2) {
        if (b61Var.j() instanceof sx6.b) {
            return function2.invoke(b61Var, b61Var.j());
        }
        return b61Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b61 J(b61 b61Var, List<? extends sx6.a> list) {
        sx6 j;
        sx6 j2 = b61Var.j();
        if (j2 instanceof sx6.b.a) {
            j = new sx6.b.a(list, ((sx6.b.a) b61Var.j()).b());
        } else if (j2 instanceof sx6.b.C0672b) {
            j = new sx6.b.C0672b(list);
        } else {
            j = b61Var.j();
        }
        return b61.b(b61Var, null, null, null, null, null, j, null, null, null, null, null, false, null, 8159, null);
    }

    private final v51 L(d41 d41Var) {
        if (d41Var instanceof d41.p) {
            return v51.e.a;
        }
        if (z65.c(d41Var, d41.q.c)) {
            return v51.d.a;
        }
        if (z65.c(d41Var, d41.c.c)) {
            return v51.a.a;
        }
        if (z65.c(d41Var, d41.o.c)) {
            return v51.c.a;
        }
        return v51.b.a;
    }

    private final b61 d(b61 b61Var, Collection<? extends d41> collection) {
        Object obj;
        Iterator<T> it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (c.contains(bc9.b(((d41) obj).getClass()))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        d41 d41Var = (d41) obj;
        if (d41Var != null) {
            return b61.b(b61Var, null, null, null, null, null, null, null, null, null, L(d41Var), null, false, null, 7679, null);
        }
        return b61Var;
    }

    private final b61 e(b61 b61Var, Collection<? extends d41> collection) {
        return (b61) mh5.c(nr5.b(collection, new c(b61Var)), b61Var);
    }

    private final b61 f(b61 b61Var, Collection<? extends d41> collection) {
        Collection<? extends d41> collection2 = collection;
        boolean z = collection2 instanceof Collection;
        if (!z || !collection2.isEmpty()) {
            for (d41 d41Var : collection2) {
                if (d41Var instanceof d41.h) {
                    return b61.b(b61Var, null, null, null, null, null, null, null, null, u31.l.a, null, null, false, null, 7935, null);
                }
            }
        }
        if (!z || !collection2.isEmpty()) {
            for (d41 d41Var2 : collection2) {
                if (d41.a.a().contains(bc9.b(d41Var2.getClass()))) {
                    return b61.b(b61Var, null, null, null, null, null, null, null, null, u31.e.a, null, null, false, null, 7935, null);
                }
            }
        }
        return b61Var;
    }

    private final b61 g(b61 b61Var, Collection<? extends d41> collection) {
        sx6.b bVar;
        sx6 j = b61Var.j();
        b61 b61Var2 = null;
        if (j instanceof sx6.b) {
            bVar = (sx6.b) j;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            b61Var2 = (b61) nr5.b(collection, new d(b61Var));
        }
        return (b61) mh5.c(b61Var2, b61Var);
    }

    private final b61 h(b61 b61Var, Collection<? extends d41> collection) {
        Collection<? extends d41> collection2 = collection;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (b.contains((d41) it.next())) {
                    for (d41 d41Var : collection2) {
                        if (b.contains(d41Var)) {
                            wk7 k = b61Var.k();
                            if (k instanceof uu2.a.C0694a) {
                                return b61.b(b61Var, null, new uu2.a.b(((uu2.a.C0694a) b61Var.k()).e(), d41Var), null, null, null, null, null, null, null, null, null, false, null, 8189, null);
                            }
                            if (k instanceof uu2.a.b) {
                                return b61.b(b61Var, null, new uu2.a.b(((uu2.a.b) b61Var.k()).e(), d41Var), null, null, null, null, null, null, null, null, null, false, null, 8189, null);
                            }
                            if (k instanceof bq0.a) {
                                return b61.b(b61Var, null, new bq0.a.b(((bq0.a) b61Var.k()).e(), d41Var), null, null, null, null, null, null, null, null, null, false, null, 8189, null);
                            }
                            if (k instanceof nk9.b) {
                                return b61.b(b61Var, null, new nk9.b.C0456b(((nk9.b) b61Var.k()).e(), d41Var), null, null, null, null, null, null, null, null, null, false, null, 8189, null);
                            }
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
        return b61Var;
    }

    private final b61 i(b61 b61Var, Collection<? extends d41> collection) {
        b61 K;
        Collection<? extends d41> collection2 = collection;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            for (d41 d41Var : collection2) {
                if (d41Var instanceof d41.u) {
                    jw7 a2 = b61Var.n().a();
                    if (a2 != null && (K = K(b61Var, a2)) != null) {
                        return K;
                    }
                    return b61Var;
                }
            }
            return b61Var;
        }
        return b61Var;
    }

    private final b61 j(b61 b61Var, Collection<? extends d41> collection) {
        List q0;
        Collection<d41> q = b61Var.q();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj instanceof d41.r) {
                arrayList.add(obj);
            }
        }
        q0 = sc1.q0(q, arrayList);
        return b61.b(b61Var, null, null, null, null, null, null, null, null, null, null, q0, false, null, 7167, null);
    }

    private final b61 l(b61 b61Var, Collection<? extends d41> collection) {
        if (collection.contains(d41.t.c)) {
            return b61.b(b61Var, null, null, null, null, null, null, null, null, new u31.g(r(b61Var), b61Var.f().a(), b61Var.f().i()), null, null, false, null, 7935, null);
        }
        return b61Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(sx6.b bVar, Long l) {
        List<sx6.a> a2 = bVar.a();
        if ((a2 instanceof Collection) && a2.isEmpty()) {
            return false;
        }
        for (sx6.a aVar : a2) {
            if ((aVar instanceof sx6.a.b) && z65.c(((sx6.a.b) aVar).a(), l)) {
                return true;
            }
        }
        return false;
    }

    private final u31 p(b61 b61Var) {
        wk7 k = b61Var.k();
        if (k instanceof bq0) {
            wk7 k2 = b61Var.k();
            if (k2 instanceof bq0.b) {
                return u31.n.a;
            }
            if (k2 instanceof bq0.a.b) {
                return u31.e.a;
            }
            return q(b61Var);
        } else if (k instanceof uu2) {
            if (b61Var.k() instanceof uu2.c) {
                return u31.b.a;
            }
            if ((b61Var.k() instanceof uu2.a.C0694a) && yk7.b(b61Var.k())) {
                return u31.d.a;
            }
            if (b61Var.k() instanceof uu2.a.b) {
                return u31.e.a;
            }
            return q(b61Var);
        } else if (k instanceof nk9) {
            wk7 k3 = b61Var.k();
            if (k3 instanceof nk9.a) {
                return u31.n.a;
            }
            if (k3 instanceof nk9.b.C0456b) {
                return u31.e.a;
            }
            return q(b61Var);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final u31 q(b61 b61Var) {
        u31 cVar;
        if (b61Var.m() instanceof zo7.b) {
            return u31.i.b.a;
        }
        if (b61Var.n() instanceof cu7.c) {
            return u31.m.a;
        }
        if (!s(b61Var)) {
            cVar = new u31.g(r(b61Var), b61Var.f().a(), b61Var.f().i());
        } else if (b61Var.e() instanceof pt2.b) {
            return u31.e.a;
        } else {
            if (b61Var.e() instanceof pt2.e) {
                return u31.l.a;
            }
            if (b61Var.e() instanceof pt2.c) {
                return u31.e.a;
            }
            if (b61Var.j() instanceof sx6.c) {
                return u31.e.a;
            }
            if (b61Var.i().k().d()) {
                return u31.h.a;
            }
            if (b61Var.n().a() instanceof jw7.e) {
                return u31.f.a;
            }
            if (b61Var.n().a() instanceof jw7.h) {
                return u31.j.a;
            }
            if (b61Var.n().a() instanceof jw7.i) {
                return u31.k.a;
            }
            if (b61Var.n().a() instanceof jw7.a) {
                cVar = new u31.c(((jw7.a) b61Var.n().a()).i());
            } else if (I(b61Var)) {
                return u31.a.a;
            } else {
                return u31.h.a;
            }
        }
        return cVar;
    }

    private final hn6 r(b61 b61Var) {
        return cj6.a.a(b61Var.i().f());
    }

    @Override // defpackage.h61
    public b61 A(b61 b61Var, jw7 jw7Var) {
        List l;
        z65.h(b61Var, "<this>");
        z65.h(jw7Var, "paymentWay");
        cu7.d.c cVar = new cu7.d.c(jw7Var);
        l = kc1.l();
        return b61.b(b61Var, cVar, null, null, null, null, null, null, null, null, null, l, false, null, 7166, null);
    }

    @Override // defpackage.h61
    public b61 B(b61 b61Var, Long l) {
        Set e2;
        z65.h(b61Var, "<this>");
        pt2.d dVar = new pt2.d(l);
        e2 = sfa.e();
        return k(b61.b(b61Var, null, null, null, null, dVar, null, null, null, null, null, e2, false, null, 7151, null));
    }

    @Override // defpackage.h61
    public b61 C(b61 b61Var, d88 d88Var) {
        List l;
        z65.h(b61Var, "<this>");
        z65.h(d88Var, "pizzeria");
        bq0.a.c cVar = new bq0.a.c(d88Var);
        l = kc1.l();
        return k(b61.b(b61Var, null, cVar, null, null, null, null, null, null, null, null, l, false, null, 7165, null));
    }

    @Override // defpackage.h61
    public b61 D(b61 b61Var) {
        List l;
        z65.h(b61Var, "<this>");
        if (z65.c(b61Var.n(), cu7.c.b)) {
            return z(k(b61Var), d41.u.c);
        }
        cu7.d.a aVar = new cu7.d.a((jw7) mh5.b(b61Var.n().a(), "Must be defined"));
        l = kc1.l();
        return k(b61.b(b61Var, aVar, null, null, null, null, null, null, null, null, null, l, false, null, 7166, null));
    }

    @Override // defpackage.h61
    public b61 E(b61 b61Var) {
        List l;
        z65.h(b61Var, "<this>");
        nk9.a aVar = nk9.a.e;
        l = kc1.l();
        return k(b61.b(b61Var, null, aVar, null, null, null, null, null, null, null, null, l, false, null, 7165, null));
    }

    @Override // defpackage.h61
    public b61 F(b61 b61Var, Collection<? extends d41> collection) {
        z65.h(b61Var, "<this>");
        z65.h(collection, "errors");
        if (collection.isEmpty()) {
            return b61Var;
        }
        return d(j(l(f(i(g(e(h(b61Var, collection), collection), collection), collection), collection), collection), collection), collection);
    }

    @Override // defpackage.h61
    public b61 G(b61 b61Var) {
        List l;
        z65.h(b61Var, "<this>");
        u31.i.b bVar = u31.i.b.a;
        l = kc1.l();
        return b61.b(b61Var, null, null, null, null, null, null, null, null, bVar, null, l, false, null, 6911, null);
    }

    public boolean I(b61 b61Var) {
        z65.h(b61Var, "<this>");
        if (b61Var.f().f() && (b61Var.n().a() instanceof jw7.c) && (b61Var.k() instanceof uu2) && b61Var.i().k().e()) {
            return true;
        }
        return false;
    }

    public b61 K(b61 b61Var, jw7 jw7Var) {
        List l;
        z65.h(b61Var, "<this>");
        z65.h(jw7Var, "paymentWay");
        cu7.d.b bVar = new cu7.d.b(jw7Var);
        l = kc1.l();
        return b61.b(b61Var, bVar, null, null, null, null, null, null, null, null, null, l, false, null, 7166, null);
    }

    @Override // defpackage.h61
    public b61 k(b61 b61Var) {
        List l;
        z65.h(b61Var, "<this>");
        u31 p = p(b61Var);
        l = kc1.l();
        return b61.b(b61Var, null, null, null, null, null, null, null, null, p, null, l, false, null, 6911, null);
    }

    @Override // defpackage.h61
    public b61 n(b61 b61Var, Long l) {
        z65.h(b61Var, "<this>");
        return H(b61Var, new f(l));
    }

    @Override // defpackage.h61
    public b61 o(b61 b61Var, Long l, String str, boolean z) {
        z65.h(b61Var, "<this>");
        z65.h(str, "title");
        return H(b61Var, new b(l, str, z));
    }

    public boolean s(b61 b61Var) {
        z65.h(b61Var, "<this>");
        wk7 k = b61Var.k();
        if ((k instanceof bq0) || (k instanceof nk9)) {
            return true;
        }
        if (k instanceof uu2) {
            return cj6.a.b(b61Var.i().f());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.h61
    public b61 t(b61 b61Var) {
        List l;
        z65.h(b61Var, "<this>");
        zo7.b bVar = zo7.b.a;
        l = kc1.l();
        return k(b61.b(b61Var, null, null, bVar, null, null, null, null, null, null, null, l, false, null, 7163, null));
    }

    @Override // defpackage.h61
    public b61 u(b61 b61Var, jw7 jw7Var) {
        List l;
        z65.h(b61Var, "<this>");
        z65.h(jw7Var, "paymentWay");
        cu7.b bVar = new cu7.b(jw7Var);
        l = kc1.l();
        return b61.b(b61Var, bVar, null, null, null, null, null, null, null, null, null, l, false, null, 7166, null);
    }

    @Override // defpackage.h61
    public b61 v(b61 b61Var, Long l) {
        z65.h(b61Var, "<this>");
        return H(b61Var, new e(l));
    }

    @Override // defpackage.h61
    public b61 w(b61 b61Var, ou2 ou2Var) {
        List l;
        z65.h(b61Var, "<this>");
        z65.h(ou2Var, "deliverablePlace");
        uu2.a.c cVar = new uu2.a.c(ou2Var);
        l = kc1.l();
        return k(b61.b(b61Var, null, cVar, null, null, null, null, null, null, null, null, l, false, null, 7165, null));
    }

    @Override // defpackage.h61
    public b61 x(b61 b61Var) {
        z65.h(b61Var, "<this>");
        if (b61Var.n() instanceof cu7.d) {
            jw7 a2 = b61Var.n().a();
            z65.e(a2);
            return b61.b(b61Var, new cu7.a(a2), null, null, null, null, null, null, null, null, null, null, false, null, 8190, null);
        }
        return b61Var;
    }

    @Override // defpackage.h61
    public b61 y(b61 b61Var, d88 d88Var) {
        List l;
        z65.h(b61Var, "<this>");
        z65.h(d88Var, "pizzeria");
        nk9.b.c cVar = new nk9.b.c(d88Var);
        l = kc1.l();
        return k(b61.b(b61Var, null, cVar, null, null, null, null, null, null, null, null, l, false, null, 7165, null));
    }

    @Override // defpackage.h61
    public b61 z(b61 b61Var, d41 d41Var) {
        List r0;
        z65.h(b61Var, "<this>");
        z65.h(d41Var, "error");
        r0 = sc1.r0(b61Var.q(), d41Var);
        return b61.b(b61Var, null, null, null, null, null, null, null, null, null, null, r0, false, null, 7167, null);
    }
}
