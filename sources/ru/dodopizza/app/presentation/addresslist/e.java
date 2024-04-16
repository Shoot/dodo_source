package ru.dodopizza.app.presentation.addresslist;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.n8;
import defpackage.ox1;
import defpackage.zw9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.presentation.addresslist.i;
/* compiled from: AddressListInteractor.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*¢\u0006\u0004\b3\u00104J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bH\u0016J\u0012\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000eH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R,\u00102\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/e;", "Lru/dodopizza/app/presentation/addresslist/d;", "Lox1;", "", "Lou2;", "Lkotlin/Function1;", "", "selector", "", "Ln8$a;", "o", "Lwx;", "b", "", "Lcom/dodopizza/async/AsyncJob;", com.huawei.hms.opendevice.c.a, "deliverablePlace", "Lru/dodopizza/app/presentation/addresslist/i$a;", "a", "Lru/dodopizza/app/presentation/addresslist/i$b;", "request", DateTokenConverter.CONVERTER_KEY, "Lx42;", "Lx42;", "customerAddressService", "Lj9a;", "Lj9a;", "selectedAddressState", "Lpu2;", "Lpu2;", "deliverablePlaceFormatter", "Lgc;", "Lgc;", "analytics", "Lz8;", com.huawei.hms.push.e.a, "Lz8;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lvg7;", "f", "Lvg7;", "orderPizzeriaStateService", "Lru/dodopizza/app/presentation/addresslist/i;", "g", "Lru/dodopizza/app/presentation/addresslist/i;", "selectedAddressHandler", "Lkotlin/Function3;", "", Image.TYPE_HIGH, "Ly84;", "toVO", "<init>", "(Lx42;Lj9a;Lpu2;Lgc;Lz8;Lvg7;Lru/dodopizza/app/presentation/addresslist/i;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class e implements ru.dodopizza.app.presentation.addresslist.d, ox1 {
    private final x42 a;
    private final j9a b;
    private final pu2 c;
    private final gc d;
    private final z8 e;
    private final vg7 f;
    private final i g;
    private final y84<ou2, Integer, Boolean, n8.a> h;

    /* compiled from: AddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/i$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListInteractorImpl$checkSelectedDeliverablePlace$1", f = "AddressListInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super i.a>, Object> {
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
        public final Object invoke(cv1<? super i.a> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return e.this.g.a(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ln8$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListInteractorImpl$getAddresses$1", f = "AddressListInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super List<? extends n8.a>>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AddressListInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lou2;", "deliverablePlace", "", "a", "(Lou2;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<ou2, Boolean> {
            final /* synthetic */ e a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.a = eVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(ou2 ou2Var) {
                z65.h(ou2Var, "deliverablePlace");
                return Boolean.valueOf(z65.c(ou2Var, this.a.b.g()));
            }
        }

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<n8.a>> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e eVar = e.this;
                return eVar.o(eVar.a.getAll(), new a(e.this));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListInteractorImpl$setLocationWithNewLocality$1", f = "AddressListInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ i.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i.b bVar, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e.this.g.b(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lou2;", "", "index", "", "isSelectedAddress", "Ln8$a;", "a", "(Lou2;IZ)Ln8$a;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements y84<ou2, Integer, Boolean, n8.a> {
        d() {
            super(3);
        }

        public final n8.a a(ou2 ou2Var, int i, boolean z) {
            z65.h(ou2Var, "$this$null");
            return new n8.a(i, ou2Var, e.this.c.c(ou2Var), e.this.c.d(ou2Var), z, false, false, false, 224, null);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ n8.a invoke(ou2 ou2Var, Integer num, Boolean bool) {
            return a(ou2Var, num.intValue(), bool.booleanValue());
        }
    }

    /* compiled from: AddressListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addresslist.AddressListInteractorImpl$trackAddressListScreen$1", f = "AddressListInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.dodopizza.app.presentation.addresslist.e$e  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0513e extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        C0513e(cv1<? super C0513e> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new C0513e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((C0513e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e.this.d.a(new zw9.a(a9.a(e.this.e), e.this.f.e()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e(x42 x42Var, j9a j9aVar, pu2 pu2Var, gc gcVar, z8 z8Var, vg7 vg7Var, i iVar) {
        z65.h(x42Var, "customerAddressService");
        z65.h(j9aVar, "selectedAddressState");
        z65.h(pu2Var, "deliverablePlaceFormatter");
        z65.h(gcVar, "analytics");
        z65.h(z8Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(iVar, "selectedAddressHandler");
        this.a = x42Var;
        this.b = j9aVar;
        this.c = pu2Var;
        this.d = gcVar;
        this.e = z8Var;
        this.f = vg7Var;
        this.g = iVar;
        this.h = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<n8.a> o(Collection<? extends ou2> collection, Function1<? super ou2, Boolean> function1) {
        int w;
        Collection<? extends ou2> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        int i = 0;
        for (Object obj : collection2) {
            int i2 = i + 1;
            if (i < 0) {
                kc1.v();
            }
            ou2 ou2Var = (ou2) obj;
            arrayList.add(this.h.invoke(ou2Var, Integer.valueOf(i), function1.invoke(ou2Var)));
            i = i2;
        }
        return arrayList;
    }

    @Override // ru.dodopizza.app.presentation.addresslist.d
    public wx<i.a> a(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        return m(new a(ou2Var, null));
    }

    @Override // ru.dodopizza.app.presentation.addresslist.d
    public wx<List<n8.a>> b() {
        return m(new b(null));
    }

    @Override // ru.dodopizza.app.presentation.addresslist.d
    public wx<Unit> c() {
        return n(new C0513e(null));
    }

    @Override // ru.dodopizza.app.presentation.addresslist.d
    public wx<Unit> d(i.b bVar) {
        z65.h(bVar, "request");
        return m(new c(bVar, null));
    }

    public <T> wx<T> m(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> n(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }
}
