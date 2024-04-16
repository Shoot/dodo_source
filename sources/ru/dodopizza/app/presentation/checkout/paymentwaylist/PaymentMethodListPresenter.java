package ru.dodopizza.app.presentation.checkout.paymentwaylist;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import defpackage.bu7;
import defpackage.et7;
import defpackage.jw7;
import defpackage.ko3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.a;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.b;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.c;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.d;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.i;
/* compiled from: PaymentMethodListPresenter.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B-\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001f05\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020\u0011¢\u0006\u0004\bK\u0010LJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u001e\u0010\u000f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\b\u001a\u00020\rH\u0002J\u001e\u0010\u0010\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\b\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u001e\u0010\u0014\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u001e\u0010\u0018\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0019*\b\u0012\u0004\u0012\u00020\u001e0\u0019H\u0002J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001eH\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00192\u0006\u0010\b\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0005H\u0002J\u0018\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0015H\u0002J\u0018\u0010.\u001a\u00020\u00052\u0006\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\u0011H\u0002J\u0018\u0010/\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\u0006\u0010-\u001a\u00020\u0011H\u0002J0\u00103\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000401\u0012\u0004\u0012\u00020\u000500j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`2H\u0016J\u0014\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000eH\u0016R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u001f058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\fR\u001c\u0010G\u001a\n D*\u0004\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/PaymentMethodListPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Lxt7;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "", "t0", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "data", "o0", "q0", "X", "Z", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$a;", "Lbua;", "W", "g0", "", "isEnabled", "m0", "e0", "Lvt7;", "paymentMethodListVO", "Y", "c0", "", "Let7$c$b;", "a0", "i0", "r0", "Let7$c;", "Let7;", "s0", "paymentWayVO", "d0", "b0", "k0", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/a$a;", "result", "h0", "", "taxPayerId", "j0", "p0", "email", "isLoading", "l0", "n0", "Lkotlin/Function1;", "Lko3;", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "t", "Lcl2;", "b", "Lcl2;", "dataSet", "Lot7;", com.huawei.hms.opendevice.c.a, "Lot7;", "interactor", "Lut7;", DateTokenConverter.CONVERTER_KEY, "Lut7;", "router", com.huawei.hms.push.e.a, "isCarryoutOrRestaurant", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "f0", "()Z", "isEditButtonShouldBeVisible", "<init>", "(Lcl2;Lot7;Lut7;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PaymentMethodListPresenter extends MoxyFSMPresenter<xt7, ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> {
    private final cl2<et7> b;
    private final ot7 c;
    private final ut7 d;
    private final boolean e;
    private final Logger f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Let7;", "it", "", "", "a", "(Let7;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<et7, List<? extends String>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(et7 et7Var) {
            et7.c.b bVar;
            List<String> l;
            z65.h(et7Var, "it");
            if (et7Var instanceof et7.c.b) {
                bVar = (et7.c.b) et7Var;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.i(false);
            }
            l = kc1.l();
            return l;
        }
    }

    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PaymentMethodListPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>, Unit> {
            final /* synthetic */ PaymentMethodListPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0538a extends ej5 implements Function2<a.C0211a, b.C0549b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0538a(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(a.C0211a c0211a, b.C0549b c0549b) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(c0549b, "<anonymous parameter 1>");
                    this.a.z(i.f.a, b.C0549b.a);
                    this.a.t0();
                    this.a.i0();
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaymentMethodListPresenter paymentMethodListPresenter) {
                super(1);
                this.a = paymentMethodListPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                z65.h(aVar, "$this$state");
                C0538a c0538a = new C0538a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(b.C0549b.class, (Function2) unb.e(c0538a, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PaymentMethodListPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0539b extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>, Unit> {
            final /* synthetic */ PaymentMethodListPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$a;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$b$a */
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<d.a, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.a aVar, b.c cVar) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(cVar, "data");
                    this.a.r0();
                    return new bua<>(i.b.a, cVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$g;", "event", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$g;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$b$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0540b extends ej5 implements Function2<d.g, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0540b(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.g gVar, b.c cVar) {
                    z65.h(gVar, "event");
                    z65.h(cVar, "data");
                    this.a.d0(gVar.a());
                    return new bua<>(i.c.a, cVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$d;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$d;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$b$c */
            /* loaded from: classes4.dex */
            public static final class c extends ej5 implements Function2<d.C0551d, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.C0551d c0551d, b.c cVar) {
                    z65.h(c0551d, "<anonymous parameter 0>");
                    z65.h(cVar, "data");
                    this.a.X(cVar);
                    return new bua<>(i.c.a, cVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$c;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$c;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$b$d */
            /* loaded from: classes4.dex */
            public static final class d extends ej5 implements Function2<d.c, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.c cVar, b.c cVar2) {
                    z65.h(cVar, "<anonymous parameter 0>");
                    z65.h(cVar2, "data");
                    this.a.o0(cVar2);
                    return new bua<>(i.C0556i.a, cVar2);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$l;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$l;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$b$e */
            /* loaded from: classes4.dex */
            public static final class e extends ej5 implements Function2<d.l, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.l lVar, b.c cVar) {
                    z65.h(lVar, "<anonymous parameter 0>");
                    z65.h(cVar, "data");
                    this.a.q0(cVar);
                    return new bua<>(i.C0556i.a, cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0539b(PaymentMethodListPresenter paymentMethodListPresenter) {
                super(1);
                this.a = paymentMethodListPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(d.a.class)) {
                    aVar.b().put(d.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map = aVar.b().get(d.a.class);
                z65.e(map);
                map.put(b.c.class, (Function2) unb.e(aVar2, 2));
                C0540b c0540b = new C0540b(this.a);
                if (!aVar.b().containsKey(d.g.class)) {
                    aVar.b().put(d.g.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map2 = aVar.b().get(d.g.class);
                z65.e(map2);
                map2.put(b.c.class, (Function2) unb.e(c0540b, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(d.C0551d.class)) {
                    aVar.b().put(d.C0551d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map3 = aVar.b().get(d.C0551d.class);
                z65.e(map3);
                map3.put(b.c.class, (Function2) unb.e(cVar, 2));
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(d.c.class)) {
                    aVar.b().put(d.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map4 = aVar.b().get(d.c.class);
                z65.e(map4);
                map4.put(b.c.class, (Function2) unb.e(dVar, 2));
                e eVar = new e(this.a);
                if (!aVar.b().containsKey(d.l.class)) {
                    aVar.b().put(d.l.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map5 = aVar.b().get(d.l.class);
                z65.e(map5);
                map5.put(b.c.class, (Function2) unb.e(eVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PaymentMethodListPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>, Unit> {
            final /* synthetic */ PaymentMethodListPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$e;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$e;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<d.e, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                public static final a a = new a();

                a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.e eVar, b.c cVar) {
                    z65.h(eVar, "<anonymous parameter 0>");
                    z65.h(cVar, "data");
                    return new bua<>(i.d.a, cVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$b;", "event", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$b;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$c$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0541b extends ej5 implements Function2<d.b, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0541b(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.b bVar, b.c cVar) {
                    z65.h(bVar, "event");
                    z65.h(cVar, "data");
                    this.a.h0(bVar.a(), cVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$k;", "event", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$k;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$c$c  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0542c extends ej5 implements Function2<d.k, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0542c(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.k kVar, b.c cVar) {
                    z65.h(kVar, "event");
                    z65.h(cVar, "data");
                    this.a.j0(kVar.a(), cVar);
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(PaymentMethodListPresenter paymentMethodListPresenter) {
                super(1);
                this.a = paymentMethodListPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = a.a;
                if (!aVar.b().containsKey(d.e.class)) {
                    aVar.b().put(d.e.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map = aVar.b().get(d.e.class);
                z65.e(map);
                map.put(b.c.class, (Function2) unb.e(aVar2, 2));
                C0541b c0541b = new C0541b(this.a);
                if (!aVar.b().containsKey(d.b.class)) {
                    aVar.b().put(d.b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map2 = aVar.b().get(d.b.class);
                z65.e(map2);
                map2.put(b.c.class, (Function2) unb.e(c0541b, 2));
                C0542c c0542c = new C0542c(this.a);
                if (!aVar.b().containsKey(d.k.class)) {
                    aVar.b().put(d.k.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map3 = aVar.b().get(d.k.class);
                z65.e(map3);
                map3.put(b.c.class, (Function2) unb.e(c0542c, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PaymentMethodListPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>, Unit> {
            final /* synthetic */ PaymentMethodListPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$d;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$d;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<d.C0551d, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.C0551d c0551d, b.c cVar) {
                    z65.h(c0551d, "<anonymous parameter 0>");
                    z65.h(cVar, "data");
                    return this.a.c0(cVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$j;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$j;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$d$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0543b extends ej5 implements Function2<d.j, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0543b(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.j jVar, b.c cVar) {
                    z65.h(jVar, "<anonymous parameter 0>");
                    z65.h(cVar, "data");
                    return this.a.e0(cVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$f;", "event", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$f;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class c extends ej5 implements Function2<d.f, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: PaymentMethodListPresenter.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Let7;", "it", "", "a", "(Let7;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
                /* loaded from: classes4.dex */
                public static final class a extends ej5 implements Function1<et7, Boolean> {
                    final /* synthetic */ d.f a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(d.f fVar) {
                        super(1);
                        this.a = fVar;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final Boolean invoke(et7 et7Var) {
                        z65.h(et7Var, "it");
                        return Boolean.valueOf(z65.c(et7Var, this.a.a()));
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: PaymentMethodListPresenter.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Let7;", "it", "", "", "a", "(Let7;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
                /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$d$c$b  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0544b extends ej5 implements Function1<et7, List<? extends String>> {
                    final /* synthetic */ d.f a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0544b(d.f fVar) {
                        super(1);
                        this.a = fVar;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final List<String> invoke(et7 et7Var) {
                        et7.c.b bVar;
                        List<String> l;
                        z65.h(et7Var, "it");
                        if (et7Var instanceof et7.c.b) {
                            bVar = (et7.c.b) et7Var;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            bVar.h(this.a.b());
                        }
                        l = kc1.l();
                        return l;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.f fVar, b.c cVar) {
                    z65.h(fVar, "event");
                    z65.h(cVar, "<anonymous parameter 1>");
                    this.a.b.S(new a(fVar), new C0544b(fVar));
                    this.a.k0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$g;", "event", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$g;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$d$d  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0545d extends ej5 implements Function2<d.g, b.c, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: PaymentMethodListPresenter.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Let7;", "it", "", "a", "(Let7;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
                /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$d$d$a */
                /* loaded from: classes4.dex */
                public static final class a extends ej5 implements Function1<et7, Boolean> {
                    final /* synthetic */ d.g a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(d.g gVar) {
                        super(1);
                        this.a = gVar;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final Boolean invoke(et7 et7Var) {
                        z65.h(et7Var, "it");
                        return Boolean.valueOf(z65.c(et7Var, this.a.a()));
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: PaymentMethodListPresenter.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Let7;", "it", "", "", "a", "(Let7;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
                /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$d$d$b  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0546b extends ej5 implements Function1<et7, List<? extends String>> {
                    public static final C0546b a = new C0546b();

                    C0546b() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final List<String> invoke(et7 et7Var) {
                        et7.c.b bVar;
                        List<String> e;
                        z65.h(et7Var, "it");
                        if (et7Var instanceof et7.c.b) {
                            bVar = (et7.c.b) et7Var;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            bVar.h(!bVar.e());
                        }
                        e = jc1.e("checked_changed");
                        return e;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0545d(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.g gVar, b.c cVar) {
                    z65.h(gVar, "event");
                    z65.h(cVar, "<anonymous parameter 1>");
                    this.a.b.S(new a(gVar), C0546b.a);
                    this.a.k0();
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(PaymentMethodListPresenter paymentMethodListPresenter) {
                super(1);
                this.a = paymentMethodListPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(d.C0551d.class)) {
                    aVar.b().put(d.C0551d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map = aVar.b().get(d.C0551d.class);
                z65.e(map);
                map.put(b.c.class, (Function2) unb.e(aVar2, 2));
                C0543b c0543b = new C0543b(this.a);
                if (!aVar.b().containsKey(d.j.class)) {
                    aVar.b().put(d.j.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map2 = aVar.b().get(d.j.class);
                z65.e(map2);
                map2.put(b.c.class, (Function2) unb.e(c0543b, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(d.f.class)) {
                    aVar.b().put(d.f.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map3 = aVar.b().get(d.f.class);
                z65.e(map3);
                map3.put(b.c.class, (Function2) unb.e(cVar, 2));
                C0545d c0545d = new C0545d(this.a);
                if (!aVar.b().containsKey(d.g.class)) {
                    aVar.b().put(d.g.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map4 = aVar.b().get(d.g.class);
                z65.e(map4);
                map4.put(b.c.class, (Function2) unb.e(c0545d, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PaymentMethodListPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class e extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>, Unit> {
            final /* synthetic */ PaymentMethodListPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$h;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$h;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<d.h, b.a, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.h hVar, b.a aVar) {
                    z65.h(hVar, "<anonymous parameter 0>");
                    z65.h(aVar, "data");
                    return this.a.g0(aVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$i;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$i;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$b$e$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0547b extends ej5 implements Function2<d.i, b.a, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0547b(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.i iVar, b.a aVar) {
                    z65.h(iVar, "<anonymous parameter 0>");
                    z65.h(aVar, "data");
                    return this.a.W(aVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(PaymentMethodListPresenter paymentMethodListPresenter) {
                super(1);
                this.a = paymentMethodListPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(d.h.class)) {
                    aVar.b().put(d.h.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map = aVar.b().get(d.h.class);
                z65.e(map);
                map.put(b.a.class, (Function2) unb.e(aVar2, 2));
                C0547b c0547b = new C0547b(this.a);
                if (!aVar.b().containsKey(d.i.class)) {
                    aVar.b().put(d.i.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map2 = aVar.b().get(d.i.class);
                z65.e(map2);
                map2.put(b.a.class, (Function2) unb.e(c0547b, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PaymentMethodListPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class f extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>, Unit> {
            final /* synthetic */ PaymentMethodListPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PaymentMethodListPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$d;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/i;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "a", "(Lru/dodopizza/app/presentation/checkout/paymentwaylist/d$d;Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<d.C0551d, b.C0549b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>> {
                final /* synthetic */ PaymentMethodListPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(PaymentMethodListPresenter paymentMethodListPresenter) {
                    super(2);
                    this.a = paymentMethodListPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> invoke(d.C0551d c0551d, b.C0549b c0549b) {
                    z65.h(c0551d, "<anonymous parameter 0>");
                    z65.h(c0549b, "data");
                    this.a.Z();
                    return new bua<>(i.c.a, c0549b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(PaymentMethodListPresenter paymentMethodListPresenter) {
                super(1);
                this.a = paymentMethodListPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(d.C0551d.class)) {
                    aVar.b().put(d.C0551d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>> map = aVar.b().get(d.C0551d.class);
                z65.e(map);
                map.put(b.C0549b.class, (Function2) unb.e(aVar2, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>.a<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        b() {
            super(1);
        }

        public final void a(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> ko3Var) {
            z65.h(ko3Var, "$this$null");
            a aVar = new a(PaymentMethodListPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>>>> c2 = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            aVar.invoke(aVar2);
            c2.put(i.e.class, aVar2.a());
            C0539b c0539b = new C0539b(PaymentMethodListPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>>>> c3 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            c0539b.invoke(aVar3);
            c3.put(i.d.class, aVar3.a());
            c cVar = new c(PaymentMethodListPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>>>> c4 = ko3Var.c();
            ko3.a aVar4 = new ko3.a();
            cVar.invoke(aVar4);
            c4.put(i.C0556i.class, aVar4.a());
            d dVar = new d(PaymentMethodListPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>>>> c5 = ko3Var.c();
            ko3.a aVar5 = new ko3.a();
            dVar.invoke(aVar5);
            c5.put(i.b.class, aVar5.a());
            e eVar = new e(PaymentMethodListPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>>>> c6 = ko3Var.c();
            ko3.a aVar6 = new ko3.a();
            eVar.invoke(aVar6);
            c6.put(i.a.class, aVar6.a());
            f fVar = new f(PaymentMethodListPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.paymentwaylist.b, bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>>>>> c7 = ko3Var.c();
            ko3.a aVar7 = new ko3.a();
            fVar.invoke(aVar7);
            c7.put(i.g.class, aVar7.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$removeCheckedPaymentMethods$1", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
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
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PaymentMethodListPresenter.this.m0(false);
                ((xt7) PaymentMethodListPresenter.this.getViewState()).ra(true);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "", "<name for destructuring parameter 0>", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$removeCheckedPaymentMethods$2", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<Pair<? extends Boolean, ? extends List<? extends String>>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ b.a d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PaymentMethodListPresenter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Let7;", "it", "", "a", "(Let7;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<et7, Boolean> {
            final /* synthetic */ List<String> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<String> list) {
                super(1);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(et7 et7Var) {
                boolean z;
                String str;
                boolean Q;
                z65.h(et7Var, "it");
                if (et7Var instanceof et7.c.b) {
                    et7.c.b bVar = (et7.c.b) et7Var;
                    if (bVar.a() instanceof jw7.g) {
                        List<String> list = this.a;
                        p60 i = ((jw7.g) bVar.a()).i();
                        if (i != null) {
                            str = i.getId();
                        } else {
                            str = null;
                        }
                        Q = sc1.Q(list, str);
                        if (Q) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b.a aVar, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.d = aVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(this.d, cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Pair<Boolean, ? extends List<String>> pair, cv1<? super Unit> cv1Var) {
            return ((d) create(pair, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Pair pair = (Pair) this.b;
                boolean booleanValue = ((Boolean) pair.a()).booleanValue();
                List list = (List) pair.b();
                if (!booleanValue) {
                    PaymentMethodListPresenter.this.b.z0(new a(list));
                    PaymentMethodListPresenter.this.m0(true);
                    ((xt7) PaymentMethodListPresenter.this.getViewState()).ra(false);
                    ((xt7) PaymentMethodListPresenter.this.getViewState()).o6(c.a.a);
                    PaymentMethodListPresenter.this.z(i.b.a, new b.c(this.d.b()));
                } else {
                    vt7 b = this.d.b();
                    b.a aVar = this.d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : this.d.b().e()) {
                        et7.c cVar = (et7.c) obj2;
                        List<et7.c.b> a2 = aVar.a();
                        if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                            for (et7.c.b bVar : a2) {
                                if (z65.c(bVar.a().getId(), cVar.a().getId())) {
                                    break;
                                }
                            }
                        }
                        arrayList.add(obj2);
                    }
                    vt7 b2 = vt7.b(b, arrayList, null, false, null, false, 30, null);
                    PaymentMethodListPresenter.this.Y(b2);
                    PaymentMethodListPresenter.this.z(i.d.a, new b.c(b2));
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$removeCheckedPaymentMethods$3", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ b.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b.a aVar, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.d = aVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(this.d, cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PaymentMethodListPresenter.this.f.warn("Failed to remove selected cards", (Throwable) this.b);
                ((xt7) PaymentMethodListPresenter.this.getViewState()).o6(c.a.a);
                PaymentMethodListPresenter.this.z(i.b.a, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$requestEmailChange$1", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ a.C0548a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a.C0548a c0548a, cv1<? super f> cv1Var) {
            super(1, cv1Var);
            this.c = c0548a;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(this.c, cv1Var);
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
                PaymentMethodListPresenter.this.l0(this.c.a(), true);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$requestEmailChange$2", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ a.C0548a c;
        final /* synthetic */ b.c d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(a.C0548a c0548a, b.c cVar, cv1<? super g> cv1Var) {
            super(2, cv1Var);
            this.c = c0548a;
            this.d = cVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new g(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((g) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PaymentMethodListPresenter.this.l0(this.c.a(), false);
                PaymentMethodListPresenter.this.z(i.d.a, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$requestEmailChange$3", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ b.c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(b.c cVar, cv1<? super h> cv1Var) {
            super(2, cv1Var);
            this.c = cVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((h) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PaymentMethodListPresenter.this.l0(this.c.b().c().b(), true);
                ((xt7) PaymentMethodListPresenter.this.getViewState()).o6(c.b.a);
                PaymentMethodListPresenter.this.z(i.d.a, this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lvt7;", "data", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$requestPaymentMethodsVO$1", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends f3b implements Function2<vt7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i iVar = new i(cv1Var);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(vt7 vt7Var, cv1<? super Unit> cv1Var) {
            return ((i) create(vt7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                vt7 vt7Var = (vt7) this.b;
                PaymentMethodListPresenter.this.p0(vt7Var);
                PaymentMethodListPresenter.this.z(i.d.a, new b.c(vt7Var));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$requestPaymentMethodsVO$2", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        j(cv1<? super j> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j jVar = new j(cv1Var);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((j) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PaymentMethodListPresenter.this.f.error("Failed to load payment methods", (Throwable) this.b);
                ((xt7) PaymentMethodListPresenter.this.getViewState()).U8();
                PaymentMethodListPresenter.this.y(new bua(i.g.a, b.C0549b.a));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$requestPaymentMethodsVO$3", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        k(cv1<? super k> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new k(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((k) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((xt7) PaymentMethodListPresenter.this.getViewState()).P();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$requestTaxPayerIdChange$1", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, cv1<? super l> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new l(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((l) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PaymentMethodListPresenter.this.n0(this.c, true);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "taxPayerIdSet", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$requestTaxPayerIdChange$2", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class m extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ b.c d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(b.c cVar, cv1<? super m> cv1Var) {
            super(2, cv1Var);
            this.d = cVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m mVar = new m(this.d, cv1Var);
            mVar.b = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((m) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = (String) this.b;
                PaymentMethodListPresenter.this.n0(str, false);
                b.c cVar = this.d;
                PaymentMethodListPresenter.this.z(i.d.a, cVar.a(vt7.b(cVar.b(), null, null, false, this.d.b().g().a(str), false, 23, null)));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$requestTaxPayerIdChange$3", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ b.c d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(b.c cVar, cv1<? super n> cv1Var) {
            super(2, cv1Var);
            this.d = cVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n nVar = new n(this.d, cv1Var);
            nVar.b = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((n) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PaymentMethodListPresenter.this.f.error("Failed to set tax payer id", (Throwable) this.b);
                PaymentMethodListPresenter.this.n0(this.d.b().g().b(), false);
                ((xt7) PaymentMethodListPresenter.this.getViewState()).o6(c.C0550c.a);
                PaymentMethodListPresenter.this.z(i.d.a, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Let7;", "it", "", "a", "(Let7;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class o extends ej5 implements Function1<et7, Boolean> {
        public static final o a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(et7 et7Var) {
            z65.h(et7Var, "it");
            return Boolean.valueOf(et7Var instanceof et7.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Let7;", "it", "", "", "a", "(Let7;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class p extends ej5 implements Function1<et7, List<? extends String>> {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, boolean z) {
            super(1);
            this.a = str;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(et7 et7Var) {
            et7.b bVar;
            List<String> o;
            z65.h(et7Var, "it");
            if (et7Var instanceof et7.b) {
                bVar = (et7.b) et7Var;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                String str = this.a;
                boolean z = this.b;
                bVar.e(str);
                bVar.f(z);
            }
            o = kc1.o("loading_changed", "email_changed");
            return o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Let7;", "it", "", "", "a", "(Let7;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class q extends ej5 implements Function1<et7, List<? extends String>> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(et7 et7Var) {
            et7.c.b bVar;
            List<String> e;
            z65.h(et7Var, "it");
            if (et7Var instanceof et7.c.b) {
                bVar = (et7.c.b) et7Var;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.g(this.a);
            }
            e = jc1.e("checkbox_enabled_changed");
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Let7;", "it", "", "a", "(Let7;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class r extends ej5 implements Function1<et7, Boolean> {
        public static final r a = new r();

        r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(et7 et7Var) {
            z65.h(et7Var, "it");
            return Boolean.valueOf(et7Var instanceof et7.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Let7;", "it", "", "", "a", "(Let7;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class s extends ej5 implements Function1<et7, List<? extends String>> {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, boolean z) {
            super(1);
            this.a = str;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(et7 et7Var) {
            et7.d dVar;
            List<String> o;
            z65.h(et7Var, "it");
            if (et7Var instanceof et7.d) {
                dVar = (et7.d) et7Var;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                String str = this.a;
                boolean z = this.b;
                dVar.e(str);
                dVar.d(z);
            }
            o = kc1.o("loading_changed", "tax_payer_id_changed");
            return o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Let7;", "paymentMethod", "", "a", "(Let7;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class t extends ej5 implements Function1<et7, Boolean> {
        public static final t a = new t();

        t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(et7 et7Var) {
            boolean z;
            z65.h(et7Var, "paymentMethod");
            if ((et7Var instanceof et7.c.b) && (((et7.c.b) et7Var).a() instanceof jw7.g)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Let7;", "it", "", "", "a", "(Let7;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class u extends ej5 implements Function1<et7, List<? extends String>> {
        public static final u a = new u();

        u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(et7 et7Var) {
            et7.c.b bVar;
            List<String> l;
            z65.h(et7Var, "it");
            if (et7Var instanceof et7.c.b) {
                bVar = (et7.c.b) et7Var;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.i(true);
                bVar.h(false);
                bVar.g(true);
            }
            l = kc1.l();
            return l;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class v<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((et7.c) t).a().e()), Integer.valueOf(((et7.c) t2).a().e()));
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class w<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((et7.c) t).a().e()), Integer.valueOf(((et7.c) t2).a().e()));
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter$trackPaymentMethodListScreen$1", f = "PaymentMethodListPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class x extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        x(cv1<? super x> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            x xVar = new x(cv1Var);
            xVar.b = obj;
            return xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((x) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PaymentMethodListPresenter.this.f.warn("Failed to tack payment method list screen event. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public PaymentMethodListPresenter(cl2<et7> cl2Var, ot7 ot7Var, ut7 ut7Var, boolean z) {
        z65.h(cl2Var, "dataSet");
        z65.h(ot7Var, "interactor");
        z65.h(ut7Var, "router");
        this.b = cl2Var;
        this.c = ot7Var;
        this.d = ut7Var;
        this.e = z;
        this.f = LoggerFactory.getLogger("PaymentMethodListPresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> W(b.a aVar) {
        return new bua<>(i.b.a, new b.c(aVar.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(b.c cVar) {
        Object next;
        List<et7.c> e2 = cVar.b().e();
        if (!(e2 instanceof Collection) || !e2.isEmpty()) {
            for (et7.c cVar2 : e2) {
                if (cVar2.b()) {
                    Z();
                    return;
                }
            }
        }
        Iterator<T> it = e2.iterator();
        Unit unit = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int e3 = ((et7.c) next).a().e();
                do {
                    Object next2 = it.next();
                    int e4 = ((et7.c) next2).a().e();
                    if (e3 > e4) {
                        next = next2;
                        e3 = e4;
                    }
                } while (it.hasNext());
            }
        }
        et7.c cVar3 = (et7.c) next;
        if (cVar3 != null) {
            d0(cVar3);
            z(i.c.a, cVar);
            unit = Unit.a;
        }
        if (unit == null) {
            Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(vt7 vt7Var) {
        this.b.r();
        this.b.addAll(b0(vt7Var));
        this.b.w1(a.a);
        ((xt7) getViewState()).Og();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        this.d.c(bu7.b.a);
    }

    private final List<et7.c.b> a0() {
        cl2<et7> cl2Var = this.b;
        ArrayList arrayList = new ArrayList();
        for (et7 et7Var : cl2Var) {
            if (et7Var instanceof et7.c.b) {
                arrayList.add(et7Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((et7.c.b) obj).e()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final List<et7> b0(vt7 vt7Var) {
        List<et7> F0;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(s0(vt7Var.e()));
        if (vt7Var.d()) {
            arrayList.add(et7.a.a);
            arrayList.add(vt7Var.c());
        }
        if (vt7Var.f()) {
            arrayList.add(et7.a.a);
            arrayList.add(vt7Var.g());
        }
        F0 = sc1.F0(arrayList);
        return F0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> c0(b.c cVar) {
        Y(cVar.b());
        return new bua<>(i.d.a, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(et7.c cVar) {
        bu7 aVar;
        if (cVar.b()) {
            aVar = bu7.b.a;
        } else {
            aVar = new bu7.a(cVar.a());
        }
        this.d.c(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> e0(b.c cVar) {
        boolean O;
        List<et7.c.b> a0 = a0();
        O = sc1.O(a0);
        if (O) {
            ((xt7) getViewState()).H4(a0.size());
            return new bua<>(i.a.a, new b.a(cVar.b(), a0));
        }
        this.b.r();
        this.b.addAll(b0(cVar.b()));
        ((xt7) getViewState()).Og();
        return new bua<>(i.d.a, cVar);
    }

    private final boolean f0() {
        cl2<et7> cl2Var = this.b;
        if ((cl2Var instanceof Collection) && ((Collection) cl2Var).isEmpty()) {
            return false;
        }
        for (et7 et7Var : cl2Var) {
            if ((et7Var instanceof et7.c.b) && (((et7.c.b) et7Var).a() instanceof jw7.g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> g0(b.a aVar) {
        jw7.g gVar;
        p60 i2;
        z(i.h.a, aVar);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = aVar.a().iterator();
        while (true) {
            String str = null;
            if (it.hasNext()) {
                jw7 a2 = ((et7.c.b) it.next()).a();
                if (a2 instanceof jw7.g) {
                    gVar = (jw7.g) a2;
                } else {
                    gVar = null;
                }
                if (gVar != null && (i2 = gVar.i()) != null) {
                    str = i2.getId();
                }
                if (str != null) {
                    arrayList.add(str);
                }
            } else {
                p(z77.a(y87.a(r77.a(this.c.c(arrayList), new c(null)), new d(aVar, null)), new e(aVar, null)));
                return x();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(a.C0548a c0548a, b.c cVar) {
        p(z77.a(y87.a(r77.a(this.c.e(c0548a.a(), c0548a.b()), new f(c0548a, null)), new g(c0548a, cVar.a(vt7.b(cVar.b(), null, cVar.b().c().a(c0548a.a(), c0548a.b()), false, null, false, 29, null)), null)), new h(cVar, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        p(o77.a(z77.a(y87.a(this.c.d(this.e), new i(null)), new j(null)), new k(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(String str, b.c cVar) {
        p(z77.a(y87.a(r77.a(this.c.b(str), new l(str, null)), new m(cVar, null)), new n(cVar, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        et7.c.b bVar;
        cl2<et7> cl2Var = this.b;
        boolean z = false;
        if (!(cl2Var instanceof Collection) || !((Collection) cl2Var).isEmpty()) {
            Iterator<et7> it = cl2Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                et7 next = it.next();
                if (next instanceof et7.c.b) {
                    bVar = (et7.c.b) next;
                } else {
                    bVar = null;
                }
                if (bVar != null && bVar.e()) {
                    z = true;
                    break;
                }
            }
        }
        ((xt7) getViewState()).Z8(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(String str, boolean z) {
        this.b.S(o.a, new p(str, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(boolean z) {
        this.b.w1(new q(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(String str, boolean z) {
        this.b.S(r.a, new s(str, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(b.c cVar) {
        this.d.a(cVar.b().c(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(vt7 vt7Var) {
        this.b.r();
        this.b.addAll(b0(vt7Var));
        ((xt7) getViewState()).Ce(f0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(b.c cVar) {
        this.d.b(cVar.b().g().b(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        this.b.z0(t.a);
        this.b.w1(u.a);
        ((xt7) getViewState()).vb();
    }

    private final List<et7> s0(List<? extends et7.c> list) {
        List y0;
        List r0;
        List y02;
        List<et7> q0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((et7.c) obj).a().c().k()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        y0 = sc1.y0((Iterable) pair.d(), new v());
        r0 = sc1.r0(y0, et7.a.a);
        y02 = sc1.y0((Iterable) pair.c(), new w());
        q0 = sc1.q0(r0, y02);
        return q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        p(z77.a(this.c.a(), new x(null)));
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b> t() {
        return new bua<>(i.e.a, b.C0549b.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<ru.dodopizza.app.presentation.checkout.paymentwaylist.i, ru.dodopizza.app.presentation.checkout.paymentwaylist.b>, Unit> v() {
        return new b();
    }
}
