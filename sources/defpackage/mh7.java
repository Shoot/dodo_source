package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ox1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderRatingInteractor.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\b\b\u0002\u0010;\u001a\u000208¢\u0006\u0004\b<\u0010=J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\bJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u000f\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lmh7;", "Lox1;", "Lb59;", "Lqd7;", "o", "", "Lyf7;", "items", "", "j", "Lw69;", "", "isEditable", "isSent", "p", "orderId", "Lwx;", "Lai7;", "i", "k", "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "ratingVO", "ratingPhotosIds", "Ldj9;", "requestedContactType", "", "l", "(Lw69;Ljava/util/List;Ldj9;Lcv1;)Ljava/lang/Object;", Image.TYPE_MEDIUM, "feedbackValue", "n", "(Lqd7;Lcv1;)Ljava/lang/Object;", "Lo69;", "a", "Lo69;", "ratingService", "Lli7;", "b", "Lli7;", "orderService", "Lk69;", com.huawei.hms.opendevice.c.a, "Lk69;", "ratingPhotoService", "Lx49;", DateTokenConverter.CONVERTER_KEY, "Lx49;", "rateAppService", "Leb0;", com.huawei.hms.push.e.a, "Leb0;", "binaryFeedbackFeatureState", "Lah7;", "f", "Lah7;", "orderRatingAutoSubmitFeatureState", "Lkx1;", "g", "Lkx1;", "ioDispatcher", "<init>", "(Lo69;Lli7;Lk69;Lx49;Leb0;Lah7;Lkx1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mh7  reason: default package */
/* loaded from: classes.dex */
public final class mh7 implements ox1 {
    private final o69 a;
    private final li7 b;
    private final k69 c;
    private final x49 d;
    private final eb0 e;
    private final ah7 f;
    private final kx1 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lai7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingInteractor$getOrderRating$1", f = "OrderRatingInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mh7$a */
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function1<cv1<? super ai7>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super ai7> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                bc7 bc7Var = (bc7) mh5.c(mh7.this.b.g(this.c), bc7.B.a());
                b59 a = mh7.this.a.a(this.c);
                return new ai7(new w69(a.e(), mh7.this.o(a), a.d(), a.f()), a.i(), mh7.this.j(bc7Var.u()), mh7.this.a.b(bc7Var.E()));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "", "", "<name for destructuring parameter 0>", "", "a", "(Lkotlin/Pair;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mh7$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<Pair<? extends String, ? extends Integer>, CharSequence> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(Pair<String, Integer> pair) {
            z65.h(pair, "<name for destructuring parameter 0>");
            String a2 = pair.a();
            int intValue = pair.b().intValue();
            if (intValue > 1) {
                return a2 + " (x" + intValue + ")";
            }
            return a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingInteractor$getUploadedPhotosIds$2", f = "OrderRatingInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mh7$c */
    /* loaded from: classes.dex */
    public static final class c extends f3b implements Function2<qx1, cv1<? super List<? extends String>>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super List<String>> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ArrayList<h69> arrayList = new ArrayList();
                for (Object obj2 : mh7.this.c.d(this.c)) {
                    if (((h69) obj2).g()) {
                        arrayList.add(obj2);
                    }
                }
                w = lc1.w(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(w);
                for (h69 h69Var : arrayList) {
                    arrayList2.add(h69Var.f());
                }
                return arrayList2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super List<? extends String>> cv1Var) {
            return invoke2(qx1Var, (cv1<? super List<String>>) cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingInteractor$saveDraftOrderRating$2", f = "OrderRatingInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mh7$d */
    /* loaded from: classes.dex */
    public static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ w69 c;
        final /* synthetic */ List<String> d;
        final /* synthetic */ dj9 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(w69 w69Var, List<String> list, dj9 dj9Var, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.c = w69Var;
            this.d = list;
            this.e = dj9Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(this.c, this.d, this.e, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                b59 p = mh7.this.p(this.c, true, false);
                mh7.this.a.c(p);
                qd7 f = this.c.f();
                if (f.g() && bh7.a(mh7.this.f)) {
                    mh7.this.a.d(p, this.d, f instanceof hb0, this.e);
                    mh7.this.a.c(b59.b(p, null, 0, null, null, null, false, true, 63, null));
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingInteractor$saveFinalOrderRating$2", f = "OrderRatingInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mh7$e */
    /* loaded from: classes.dex */
    public static final class e extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ w69 b;
        final /* synthetic */ mh7 c;
        final /* synthetic */ List<String> d;
        final /* synthetic */ dj9 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(w69 w69Var, mh7 mh7Var, List<String> list, dj9 dj9Var, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.b = w69Var;
            this.c = mh7Var;
            this.d = list;
            this.e = dj9Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(this.b, this.c, this.d, this.e, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((e) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qd7 f = this.b.f();
                if (f.g()) {
                    try {
                        b59 p = this.c.p(this.b, false, true);
                        this.c.a.d(p, this.d, f instanceof hb0, this.e);
                        this.c.a.c(p);
                        return Unit.a;
                    } catch (Exception e) {
                        try {
                            this.c.a.c(this.c.p(this.b, true, false));
                        } catch (Exception e2) {
                            vl3.a(e, e2);
                        }
                        throw e;
                    }
                }
                throw new IllegalArgumentException("Feedback value is not selected".toString());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public mh7(o69 o69Var, li7 li7Var, k69 k69Var, x49 x49Var, eb0 eb0Var, ah7 ah7Var, kx1 kx1Var) {
        z65.h(o69Var, "ratingService");
        z65.h(li7Var, "orderService");
        z65.h(k69Var, "ratingPhotoService");
        z65.h(x49Var, "rateAppService");
        z65.h(eb0Var, "binaryFeedbackFeatureState");
        z65.h(ah7Var, "orderRatingAutoSubmitFeatureState");
        z65.h(kx1Var, "ioDispatcher");
        this.a = o69Var;
        this.b = li7Var;
        this.c = k69Var;
        this.d = x49Var;
        this.e = eb0Var;
        this.f = ah7Var;
        this.g = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(List<yf7> list) {
        int e2;
        List y;
        String i0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String p = ((yf7) obj).p();
            Object obj2 = linkedHashMap.get(p);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(p, obj2);
            }
            ((List) obj2).add(obj);
        }
        e2 = f86.e(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), Integer.valueOf(((List) entry.getValue()).size()));
        }
        y = i86.y(linkedHashMap2);
        i0 = sc1.i0(y, null, null, null, 0, null, b.a, 31, null);
        return i0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qd7 o(b59 b59Var) {
        if (fb0.a(this.e)) {
            return new hb0(b59Var.c());
        }
        return new g69(b59Var.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b59 p(w69 w69Var, boolean z, boolean z2) {
        return new b59(w69Var.d(), kw1.b(w69Var.f()), kw1.a(w69Var.f()), w69Var.c(), w69Var.e(), z, z2);
    }

    public <T> wx<T> h(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<ai7> i(String str) {
        z65.h(str, "orderId");
        return h(new a(str, null));
    }

    public final Object k(String str, cv1<? super List<String>> cv1Var) {
        return qh0.g(this.g, new c(str, null), cv1Var);
    }

    public final Object l(w69 w69Var, List<String> list, dj9 dj9Var, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g = qh0.g(this.g, new d(w69Var, list, dj9Var, null), cv1Var);
        d2 = c75.d();
        if (g == d2) {
            return g;
        }
        return Unit.a;
    }

    public final Object m(w69 w69Var, List<String> list, dj9 dj9Var, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g = qh0.g(this.g, new e(w69Var, this, list, dj9Var, null), cv1Var);
        d2 = c75.d();
        if (g == d2) {
            return g;
        }
        return Unit.a;
    }

    public final Object n(qd7 qd7Var, cv1<? super Boolean> cv1Var) {
        boolean z;
        if (qd7Var.g()) {
            int b2 = kw1.b(qd7Var);
            if (this.d.a() && b2 >= 4) {
                z = true;
            } else {
                z = false;
            }
            return nf0.a(z);
        }
        throw new IllegalArgumentException("Feedback value is not selected".toString());
    }

    public /* synthetic */ mh7(o69 o69Var, li7 li7Var, k69 k69Var, x49 x49Var, eb0 eb0Var, ah7 ah7Var, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(o69Var, li7Var, k69Var, x49Var, eb0Var, ah7Var, (i & 64) != 0 ? v33.b() : kx1Var);
    }
}
