package com.dodopizza.order.feature.checkout.sbp.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.checkout.sbp.presentation.a;
import com.dodopizza.order.feature.checkout.sbp.presentation.b;
import com.dodopizza.order.feature.checkout.sbp.presentation.c;
import com.dodopizza.order.feature.checkout.sbp.presentation.d;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ko3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: SbpBankListPresenter.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B=\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b+\u0010,J\b\u0010\u0006\u001a\u00020\u0005H\u0002J0\u0010\n\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\b\u0012\u0004\u0012\u00020\u00050\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\tH\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000bH\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010*\u001a\n '*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/presentation/SbpBankListPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Lvu9;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/d;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/a;", "", "H", "Lkotlin/Function1;", "Lko3;", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "Lbua;", "t", "Lcl2;", "Lou9;", "b", "Lcl2;", "dataSet", "Llu9;", com.huawei.hms.opendevice.c.a, "Llu9;", "interactor", "Lsu9;", DateTokenConverter.CONVERTER_KEY, "Lsu9;", "router", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "", "f", "Ljava/lang/String;", "sbpUrl", "Lj2c;", "g", "Lj2c;", "vpnChecker", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lcl2;Llu9;Lsu9;Lgc;Ljava/lang/String;Lj2c;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SbpBankListPresenter extends MoxyFSMPresenter<vu9, com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a> {
    private final cl2<ou9> b;
    private final lu9 c;
    private final su9 d;
    private final gc e;
    private final String f;
    private final j2c g;
    private final Logger h;

    /* compiled from: SbpBankListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/d;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/a;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<ko3<com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SbpBankListPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/d;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0167a extends ej5 implements Function1<ko3<com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>.a<com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>, Unit> {
            final /* synthetic */ SbpBankListPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SbpBankListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/a$a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/d;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/a;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lcom/dodopizza/order/feature/checkout/sbp/presentation/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0168a extends ej5 implements Function2<a.C0211a, a.C0169a, bua<? extends com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>> {
                final /* synthetic */ SbpBankListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0168a(SbpBankListPresenter sbpBankListPresenter) {
                    super(2);
                    this.a = sbpBankListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a> invoke(a.C0211a c0211a, a.C0169a c0169a) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(c0169a, "<anonymous parameter 1>");
                    this.a.H();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SbpBankListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/presentation/b$a;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/a$a;", "data", "Lbua;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/d;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/a;", "a", "(Lcom/dodopizza/order/feature/checkout/sbp/presentation/b$a;Lcom/dodopizza/order/feature/checkout/sbp/presentation/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter$a$a$b */
            /* loaded from: classes2.dex */
            public static final class b extends ej5 implements Function2<b.a, a.C0169a, bua<? extends com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>> {
                final /* synthetic */ SbpBankListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(SbpBankListPresenter sbpBankListPresenter) {
                    super(2);
                    this.a = sbpBankListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a> invoke(b.a aVar, a.C0169a c0169a) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(c0169a, "data");
                    this.a.e.a(gu9.a.e());
                    this.a.d.a(c.a.a);
                    return new bua<>(d.a.a, c0169a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SbpBankListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/presentation/b$b;", "event", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/a$a;", "data", "Lbua;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/d;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/a;", "a", "(Lcom/dodopizza/order/feature/checkout/sbp/presentation/b$b;Lcom/dodopizza/order/feature/checkout/sbp/presentation/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter$a$a$c */
            /* loaded from: classes2.dex */
            public static final class c extends ej5 implements Function2<b.C0170b, a.C0169a, bua<? extends com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>> {
                final /* synthetic */ SbpBankListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(SbpBankListPresenter sbpBankListPresenter) {
                    super(2);
                    this.a = sbpBankListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a> invoke(b.C0170b c0170b, a.C0169a c0169a) {
                    z65.h(c0170b, "event");
                    z65.h(c0169a, "data");
                    this.a.d.a(new c.b(this.a.f, new hu9(c0170b.a().a(), c0170b.a().b(), c0170b.a().d(), c0170b.a().c())));
                    return new bua<>(d.a.a, c0169a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0167a(SbpBankListPresenter sbpBankListPresenter) {
                super(1);
                this.a = sbpBankListPresenter;
            }

            public final void a(ko3<com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>.a<com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a> aVar) {
                z65.h(aVar, "$this$state");
                C0168a c0168a = new C0168a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.checkout.sbp.presentation.a, bua<? extends com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(a.C0169a.class, (Function2) unb.e(c0168a, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(b.a.class)) {
                    aVar.b().put(b.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.checkout.sbp.presentation.a, bua<? extends com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>>> map2 = aVar.b().get(b.a.class);
                z65.e(map2);
                map2.put(a.C0169a.class, (Function2) unb.e(bVar, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(b.C0170b.class)) {
                    aVar.b().put(b.C0170b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.checkout.sbp.presentation.a, bua<? extends com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>>> map3 = aVar.b().get(b.C0170b.class);
                z65.e(map3);
                map3.put(a.C0169a.class, (Function2) unb.e(cVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>.a<com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        a() {
            super(1);
        }

        public final void a(ko3<com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a> ko3Var) {
            z65.h(ko3Var, "$this$null");
            C0167a c0167a = new C0167a(SbpBankListPresenter.this);
            Map<Class<? extends com.dodopizza.order.feature.checkout.sbp.presentation.d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.checkout.sbp.presentation.a, bua<? extends com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>>>>> c = ko3Var.c();
            ko3.a aVar = new ko3.a();
            c0167a.invoke(aVar);
            c.put(d.b.class, aVar.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SbpBankListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lou9;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter$requestSbpBankListVO$1", f = "SbpBankListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<pz3<? super ou9>, cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super ou9> pz3Var, cv1<? super Unit> cv1Var) {
            return ((b) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SbpBankListPresenter.this.b.r();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SbpBankListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lou9;", "sbpBankListItemVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter$requestSbpBankListVO$2", f = "SbpBankListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<ou9, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ List<ou9> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<ou9> list, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.d = list;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.d, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ou9 ou9Var, cv1<? super Unit> cv1Var) {
            return ((c) create(ou9Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ou9 ou9Var = (ou9) this.b;
                SbpBankListPresenter.this.b.add(ou9Var);
                this.d.add(ou9Var);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SbpBankListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lou9;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter$requestSbpBankListVO$3", f = "SbpBankListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements y84<pz3<? super ou9>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super ou9> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = th;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Throwable th = (Throwable) this.b;
                SbpBankListPresenter.this.h.warn("Can't fetch bank list for SBP", th);
                gc gcVar = SbpBankListPresenter.this.e;
                gu9 gu9Var = gu9.a;
                boolean a = SbpBankListPresenter.this.g.a();
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                gcVar.a(gu9Var.d(a, message));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SbpBankListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lpz3;", "Lou9;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter$requestSbpBankListVO$4", f = "SbpBankListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements y84<pz3<? super ou9>, Throwable, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ List<ou9> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List<ou9> list, cv1<? super e> cv1Var) {
            super(3, cv1Var);
            this.c = list;
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super ou9> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return new e(this.c, cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((vu9) SbpBankListPresenter.this.getViewState()).Z0(this.c);
                SbpBankListPresenter.this.e.a(gu9.a.c());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SbpBankListPresenter(cl2<ou9> cl2Var, lu9 lu9Var, su9 su9Var, gc gcVar, String str, j2c j2cVar) {
        z65.h(cl2Var, "dataSet");
        z65.h(lu9Var, "interactor");
        z65.h(su9Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(str, "sbpUrl");
        z65.h(j2cVar, "vpnChecker");
        this.b = cl2Var;
        this.c = lu9Var;
        this.d = su9Var;
        this.e = gcVar;
        this.f = str;
        this.g = j2cVar;
        this.h = LoggerFactory.getLogger("SbpBankListPresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        ArrayList arrayList = new ArrayList();
        o(wz3.E(wz3.h(wz3.F(wz3.H(this.c.c(), new b(null)), new c(arrayList, null)), new d(null)), new e(arrayList, null)));
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a> t() {
        return new bua<>(d.b.a, a.C0169a.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<com.dodopizza.order.feature.checkout.sbp.presentation.d, com.dodopizza.order.feature.checkout.sbp.presentation.a>, Unit> v() {
        return new a();
    }
}
