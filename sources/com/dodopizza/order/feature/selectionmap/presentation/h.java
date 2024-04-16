package com.dodopizza.order.feature.selectionmap.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.selectionmap.presentation.g;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ox1;
import defpackage.zw9;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: SelectionMapInteractor.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u000e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202¢\u0006\u0004\b?\u0010@J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\f\u0010\n\u001a\u00020\u0003*\u00020\tH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0016J\u0012\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00180\u000bj\u0002`\u0019H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u000e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010>\u001a\n ;*\u0004\u0018\u00010:0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/h;", "Lcom/dodopizza/order/feature/selectionmap/presentation/g;", "Lox1;", "Lqd;", "sender", "Ld88;", "currentPizzeria", "Ldc;", "t", "Lmaa;", "u", "Lwx;", "Ljaa;", DateTokenConverter.CONVERTER_KEY, "data", "", "Lb68;", "f", "Lqw1;", MessageAttributes.COORDINATES, "Lcom/dodopizza/order/feature/selectionmap/presentation/g$a;", "a", "Lc66;", com.huawei.hms.opendevice.c.a, "", "Lcom/dodopizza/async/AsyncJob;", "b", "Lcom/dodopizza/order/feature/selectionmap/presentation/g$b$a;", com.huawei.hms.push.e.a, "Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "Le98;", "Le98;", "pizzeriaService", "Lx88;", "Lx88;", "pizzeriaMapper", "Lre4;", "Lre4;", "geocodeService", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lgc;", "Lgc;", "analytics", "Lvg7;", "g", "Lvg7;", "orderPizzeriaStateService", "Lhq3;", Image.TYPE_HIGH, "Lhq3;", "featureService", "", "i", "Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "j", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lcom/dodopizza/order/feature/selectionmap/presentation/f;Le98;Lx88;Lre4;Lru/dodopizza/app/domain/country/CountryService;Lgc;Lvg7;Lhq3;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class h implements g, ox1 {
    private final com.dodopizza.order.feature.selectionmap.presentation.f a;
    private final e98 b;
    private final x88 c;
    private final re4 d;
    private final CountryService e;
    private final gc f;
    private final vg7 g;
    private final hq3 h;
    private final String i;
    private final Logger j;

    /* compiled from: SelectionMapInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[hn3.values().length];
            try {
                iArr[hn3.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hn3.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[maa.values().length];
            try {
                iArr2[maa.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[maa.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[maa.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: SelectionMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/g$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapInteractorImpl$getAddress$1", f = "SelectionMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super g.a>, Object> {
        int a;
        final /* synthetic */ qw1 c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMapInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldm9;", "a", "()Ldm9;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<dm9> {
            final /* synthetic */ h a;
            final /* synthetic */ qw1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, qw1 qw1Var) {
                super(0);
                this.a = hVar;
                this.b = qw1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final dm9 invoke() {
                return this.a.d.a(this.b, this.a.i, this.a.e.h(this.a.i));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(qw1 qw1Var, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = qw1Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super g.a> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            g.a c;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                c = i.c((dm9) fnb.a.a(new a(h.this, this.c)).b());
                return c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectionMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lc66;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapInteractorImpl$getCountryMapBounds$1", f = "SelectionMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super c66>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMapInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc66;", "a", "()Lc66;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<c66> {
            final /* synthetic */ h a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(0);
                this.a = hVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final c66 invoke() {
                return d66.b(this.a.e.c(this.a.i).j());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMapInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lc66;", "a", "(Ljava/lang/Throwable;)Lc66;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function1<Throwable, c66> {
            final /* synthetic */ h a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar) {
                super(1);
                this.a = hVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final c66 invoke(Throwable th) {
                z65.h(th, "it");
                this.a.j.error("Failed to get country map bounds", th);
                return c66.c.a();
            }
        }

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super c66> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return fnb.a.a(new a(h.this)).a(new b(h.this));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectionMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/g$b$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapInteractorImpl$getDeliveryInitialData$1", f = "SelectionMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class d extends f3b implements Function1<cv1<? super g.b.a>, Object> {
        int a;
        final /* synthetic */ qw1 b;
        final /* synthetic */ h c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMapInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<String> {
            final /* synthetic */ h a;
            final /* synthetic */ qw1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, qw1 qw1Var) {
                super(0);
                this.a = hVar;
                this.b = qw1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return this.a.d.b(this.b, this.a.a.b());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(qw1 qw1Var, h hVar, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.b = qw1Var;
            this.c = hVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super g.b.a> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String str;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (qw1.c.c(this.b)) {
                    str = (String) fnb.a.a(new a(this.c, this.b)).b();
                } else {
                    str = null;
                }
                return new g.b.a(str);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectionMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljaa;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapInteractorImpl$getPizzerias$1", f = "SelectionMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class e extends f3b implements Function1<cv1<? super jaa>, Object> {
        int a;

        /* compiled from: SelectionMapInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[hn3.values().length];
                try {
                    iArr[hn3.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        e(cv1<? super e> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super jaa> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            List l;
            List list;
            Object obj2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                hn3 c = h.this.a.c();
                List e = (c != null && a.$EnumSwitchMapping$0[c.ordinal()] == 1) ? jc1.e(ib7.d) : kc1.o(ib7.d, ib7.e, ib7.c);
                if (h.this.h.a(bq3.F6)) {
                    list = h.this.b.getPizzeriasInCountry(h.this.a.b());
                } else if (h.this.a.d() == null) {
                    l = kc1.l();
                    list = l;
                } else {
                    list = h.this.b.c(h.this.a.d());
                }
                Collection<d88> collection = list;
                h hVar = h.this;
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (z65.c(((d88) obj2).getId(), hVar.a.i())) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                d88 d88Var = (d88) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collection) {
                    List<ib7> G = ((d88) obj3).G();
                    if (!(G instanceof Collection) || !G.isEmpty()) {
                        Iterator<T> it2 = G.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (e.contains((ib7) it2.next())) {
                                    arrayList.add(obj3);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                return new jaa(d88Var, arrayList, null, 4, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectionMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapInteractorImpl$trackSelectPizzeriaScreen$1", f = "SelectionMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class f extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        f(cv1<? super f> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                gc gcVar = h.this.f;
                h hVar = h.this;
                gcVar.a(hVar.t(hVar.u(hVar.a.j()), h.this.g.e()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public h(com.dodopizza.order.feature.selectionmap.presentation.f fVar, e98 e98Var, x88 x88Var, re4 re4Var, CountryService countryService, gc gcVar, vg7 vg7Var, hq3 hq3Var) {
        z65.h(fVar, "data");
        z65.h(e98Var, "pizzeriaService");
        z65.h(x88Var, "pizzeriaMapper");
        z65.h(re4Var, "geocodeService");
        z65.h(countryService, "countryService");
        z65.h(gcVar, "analytics");
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(hq3Var, "featureService");
        this.a = fVar;
        this.b = e98Var;
        this.c = x88Var;
        this.d = re4Var;
        this.e = countryService;
        this.f = gcVar;
        this.g = vg7Var;
        this.h = hq3Var;
        this.i = fVar.b();
        this.j = LoggerFactory.getLogger(h.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dc t(qd qdVar, d88 d88Var) {
        int i;
        hn3 c2 = this.a.c();
        if (c2 == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[c2.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                return new zw9.j(qdVar, d88Var);
            }
            return new zw9.j(qdVar, d88Var);
        }
        return new zw9.b(qdVar, d88Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qd u(maa maaVar) {
        int i = a.$EnumSwitchMapping$1[maaVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return ck1.v;
                }
                throw new NoWhenBranchMatchedException();
            }
            return ck1.o;
        }
        return ck1.e;
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.g
    public wx<g.a> a(qw1 qw1Var) {
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        return r(new b(qw1Var, null));
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.g
    public wx<Unit> b() {
        return s(new f(null));
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.g
    public wx<c66> c() {
        return r(new c(null));
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.g
    public wx<jaa> d() {
        return r(new e(null));
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.g
    public wx<g.b.a> e(qw1 qw1Var) {
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        return r(new d(qw1Var, this, null));
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.g
    public List<b68> f(jaa jaaVar) {
        z65.h(jaaVar, "data");
        return this.c.a(jaaVar.c(), jaaVar.e(), jaaVar.d());
    }

    public <T> wx<T> r(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> s(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }
}
