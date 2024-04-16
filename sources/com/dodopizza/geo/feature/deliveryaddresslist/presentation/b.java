package com.dodopizza.geo.feature.deliveryaddresslist.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.a;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.d;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hv0;
import defpackage.k9a;
import defpackage.ou2;
import defpackage.ox1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DeliveryAddressListInteractor.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b4\u00105J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000bH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00103\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/b;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a;", "Lox1;", "", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$a;", "n", "Lou2;", "p", "Le91;", "", "o", "Lwx;", "b", "deliverablePlace", DateTokenConverter.CONVERTER_KEY, "clientDeliveryLocation", com.huawei.hms.opendevice.c.a, "Lk9a$a;", "a", "f", "Lk9a$b;", "request", "Lsk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$b;", com.huawei.hms.push.e.a, "Lk9a;", "Lk9a;", "selectedDeliveryAddressHandler", "Liv2;", "Liv2;", "args", "Lx42;", "Lx42;", "customerAddressService", "Lpu2;", "Lpu2;", "deliverablePlaceFormatter", "Lj9a;", "Lj9a;", "selectedAddressState", "Lk6a;", "Lk6a;", "selectLocationService", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;", "g", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;", "onDeliveryLocationSetToStateListener", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lk9a;Liv2;Lx42;Lpu2;Lj9a;Lk6a;Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b implements com.dodopizza.geo.feature.deliveryaddresslist.presentation.a, ox1 {
    private final k9a a;
    private final iv2 b;
    private final x42 c;
    private final pu2 d;
    private final j9a e;
    private final k6a f;
    private final com.dodopizza.geo.feature.deliveryaddresslist.presentation.d g;
    private final Logger h;

    /* compiled from: DeliveryAddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lk9a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListInteractorImpl$checkSelectedDeliverablePlace$1", f = "DeliveryAddressListInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super k9a.a>, Object> {
        int a;
        final /* synthetic */ ou2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ou2 ou2Var, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = ou2Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super k9a.a> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.a.a(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryAddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListInteractorImpl$deleteDeliverablePlace$1", f = "DeliveryAddressListInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.dodopizza.geo.feature.deliveryaddresslist.presentation.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0130b extends f3b implements Function1<cv1<? super List<? extends a.C0129a>>, Object> {
        int a;
        final /* synthetic */ ou2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0130b(ou2 ou2Var, cv1<? super C0130b> cv1Var) {
            super(1, cv1Var);
            this.c = ou2Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new C0130b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<a.C0129a>> cv1Var) {
            return ((C0130b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                b.this.c.f(this.c);
                return b.this.n();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryAddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListInteractorImpl$getAddresses$1", f = "DeliveryAddressListInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super List<? extends a.C0129a>>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<a.C0129a>> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.n();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(((ou2.b) t).b().n().a(), ((ou2.b) t2).b().n().a());
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lou2$c;", "it", "", "a", "(Lou2$c;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function1<ou2.c, Comparable<?>> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(ou2.c cVar) {
            z65.h(cVar, "it");
            return Integer.valueOf(b.this.o(cVar.b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lou2$c;", "it", "", "a", "(Lou2$c;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<ou2.c, Comparable<?>> {
        public static final f a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Comparable<?> invoke(ou2.c cVar) {
            z65.h(cVar, "it");
            return cVar.b().c().f();
        }
    }

    /* compiled from: DeliveryAddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListInteractorImpl$saveToProfile$1", f = "DeliveryAddressListInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class g extends f3b implements Function1<cv1<? super List<? extends a.C0129a>>, Object> {
        int a;
        final /* synthetic */ e91 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(e91 e91Var, cv1<? super g> cv1Var) {
            super(1, cv1Var);
            this.c = e91Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<a.C0129a>> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                b.this.c.a(this.c);
                return b.this.n();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryAddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lsk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListInteractorImpl$setDeliveryLocationToState$1", f = "DeliveryAddressListInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class h extends f3b implements Function1<cv1<? super sk9<? extends a.b>>, Object> {
        int a;
        final /* synthetic */ k9a.b b;
        final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k9a.b bVar, b bVar2, cv1<? super h> cv1Var) {
            super(1, cv1Var);
            this.b = bVar;
            this.c = bVar2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super sk9<a.b>> cv1Var) {
            return ((h) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object b;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                k9a.b bVar = this.b;
                e91 a = bVar.a();
                this.c.f.b(new hv0.a(bVar.b(), a, false, null, 8, null));
                Object a2 = this.c.g.a(a, true);
                if (sk9.i(a2)) {
                    b = sk9.b(new a.b(((d.a) a2).a()));
                } else {
                    b = sk9.b(a2);
                }
                return sk9.a(b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(k9a k9aVar, iv2 iv2Var, x42 x42Var, pu2 pu2Var, j9a j9aVar, k6a k6aVar, com.dodopizza.geo.feature.deliveryaddresslist.presentation.d dVar) {
        z65.h(k9aVar, "selectedDeliveryAddressHandler");
        z65.h(iv2Var, "args");
        z65.h(x42Var, "customerAddressService");
        z65.h(pu2Var, "deliverablePlaceFormatter");
        z65.h(j9aVar, "selectedAddressState");
        z65.h(k6aVar, "selectLocationService");
        z65.h(dVar, "onDeliveryLocationSetToStateListener");
        this.a = k9aVar;
        this.b = iv2Var;
        this.c = x42Var;
        this.d = pu2Var;
        this.e = j9aVar;
        this.f = k6aVar;
        this.g = dVar;
        this.h = LoggerFactory.getLogger("DeliveryAddressListInteractorImpl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<a.C0129a> n() {
        List y0;
        Comparator b;
        List y02;
        List q0;
        int w;
        Collection<ou2> all = this.c.getAll();
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (obj instanceof ou2.b) {
                arrayList.add(obj);
            }
        }
        y0 = sc1.y0(arrayList, new d());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : all) {
            if (obj2 instanceof ou2.c) {
                arrayList2.add(obj2);
            }
        }
        b = mk1.b(new e(), f.a);
        y02 = sc1.y0(arrayList2, b);
        q0 = sc1.q0(y0, y02);
        List<ou2> list = q0;
        w = lc1.w(list, 10);
        ArrayList arrayList3 = new ArrayList(w);
        for (ou2 ou2Var : list) {
            arrayList3.add(p(ou2Var));
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o(e91 e91Var) {
        int b;
        int b2;
        qw1 d2 = e91Var.c().d();
        double d3 = 10;
        b = la6.b(d2.b() * d3);
        b2 = la6.b(d2.c() * d3);
        return b + b2;
    }

    private final a.C0129a p(ou2 ou2Var) {
        String str;
        ou2.c cVar;
        boolean z;
        String c2;
        String a2 = this.d.a(ou2Var);
        w6 d2 = ru2.d(ou2Var);
        if (d2 == null || (c2 = d2.c()) == null) {
            str = "";
        } else {
            str = c2;
        }
        String str2 = null;
        if (ou2Var instanceof ou2.c) {
            cVar = (ou2.c) ou2Var;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            str2 = this.d.d(cVar);
        }
        if (str2 == null) {
            str2 = "";
        }
        if (this.b.d() == jk7.e && z65.c(ou2Var, this.e.g())) {
            z = true;
        } else {
            z = false;
        }
        return new a.C0129a(a2, str, str2, ou2Var, z);
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.a
    public wx<k9a.a> a(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        return m(new a(ou2Var, null));
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.a
    public wx<List<a.C0129a>> b() {
        return m(new c(null));
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.a
    public wx<List<a.C0129a>> c(e91 e91Var) {
        z65.h(e91Var, "clientDeliveryLocation");
        return m(new g(e91Var, null));
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.a
    public wx<List<a.C0129a>> d(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        return m(new C0130b(ou2Var, null));
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.a
    public wx<sk9<a.b>> e(k9a.b bVar) {
        z65.h(bVar, "request");
        return m(new h(bVar, this, null));
    }

    @Override // com.dodopizza.geo.feature.deliveryaddresslist.presentation.a
    public e91 f() {
        return e91.d.a();
    }

    public <T> wx<T> m(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
