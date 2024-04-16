package ru.dodopizza.app.presentation.checkout.cashcharge;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bt0;
import defpackage.ko3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.checkout.cashcharge.a;
import ru.dodopizza.app.presentation.checkout.cashcharge.b;
import ru.dodopizza.app.presentation.checkout.cashcharge.d;
/* compiled from: CashChargePresenter.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001BC\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\u0011¢\u0006\u0004\b3\u00104J\b\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u001e\u0010\r\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u001e\u0010\u000e\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u001e\u0010\u000f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\u0010\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000bH\u0002J0\u0010\u0014\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0004\u0012\u00020\u00050\u0011j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0013H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000bH\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00102\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/CashChargePresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Lys0;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "", "N", "Lru/dodopizza/app/presentation/checkout/cashcharge/b$f;", "event", "Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;", "data", "Lbua;", "L", "I", "J", "K", "M", "Lkotlin/Function1;", "Lko3;", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "t", "Los0;", "b", "Los0;", "interactor", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Ljn6;", DateTokenConverter.CONVERTER_KEY, "Ljn6;", "moneyFactory", "Lzs0;", e.a, "Lzs0;", "viewBinder", "Lvn6;", "f", "Lvn6;", "moneyValidator", "", "g", "Lkotlin/jvm/functions/Function1;", "moneyInputFilter", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "<init>", "(Los0;Lf63;Ljn6;Lzs0;Lvn6;Lkotlin/jvm/functions/Function1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CashChargePresenter extends MoxyFSMPresenter<ys0, ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> {
    private final os0 b;
    private final f63 c;
    private final jn6 d;
    private final zs0 e;
    private final vn6 f;
    private final Function1<String, String> g;
    private final Logger h;

    /* compiled from: CashChargePresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CashChargePresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.checkout.cashcharge.CashChargePresenter$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0515a extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>.a<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>, Unit> {
            final /* synthetic */ CashChargePresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CashChargePresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/cashcharge/a$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lru/dodopizza/app/presentation/checkout/cashcharge/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.cashcharge.CashChargePresenter$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0516a extends ej5 implements Function2<a.C0211a, a.b, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>> {
                final /* synthetic */ CashChargePresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0516a(CashChargePresenter cashChargePresenter) {
                    super(2);
                    this.a = cashChargePresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> invoke(a.C0211a c0211a, a.b bVar) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.z(d.f.a, a.b.a);
                    this.a.N();
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0515a(CashChargePresenter cashChargePresenter) {
                super(1);
                this.a = cashChargePresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>.a<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> aVar) {
                z65.h(aVar, "$this$state");
                C0516a c0516a = new C0516a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.cashcharge.a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(a.b.class, (Function2) unb.e(c0516a, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>.a<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CashChargePresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>.a<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>, Unit> {
            final /* synthetic */ CashChargePresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CashChargePresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/b$f;", "event", "Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "a", "(Lru/dodopizza/app/presentation/checkout/cashcharge/b$f;Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.cashcharge.CashChargePresenter$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0517a extends ej5 implements Function2<b.f, a.C0520a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>> {
                final /* synthetic */ CashChargePresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0517a(CashChargePresenter cashChargePresenter) {
                    super(2);
                    this.a = cashChargePresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> invoke(b.f fVar, a.C0520a c0520a) {
                    z65.h(fVar, "event");
                    z65.h(c0520a, "data");
                    return this.a.L(fVar, c0520a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CashChargePresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/b$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "a", "(Lru/dodopizza/app/presentation/checkout/cashcharge/b$a;Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.cashcharge.CashChargePresenter$a$b$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0518b extends ej5 implements Function2<b.a, a.C0520a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>> {
                final /* synthetic */ CashChargePresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0518b(CashChargePresenter cashChargePresenter) {
                    super(2);
                    this.a = cashChargePresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> invoke(b.a aVar, a.C0520a c0520a) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(c0520a, "data");
                    return this.a.I(c0520a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CashChargePresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/b$b;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "a", "(Lru/dodopizza/app/presentation/checkout/cashcharge/b$b;Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class c extends ej5 implements Function2<b.C0521b, a.C0520a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>> {
                final /* synthetic */ CashChargePresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(CashChargePresenter cashChargePresenter) {
                    super(2);
                    this.a = cashChargePresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> invoke(b.C0521b c0521b, a.C0520a c0520a) {
                    z65.h(c0521b, "<anonymous parameter 0>");
                    z65.h(c0520a, "data");
                    return this.a.J(c0520a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CashChargePresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/b$e;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "a", "(Lru/dodopizza/app/presentation/checkout/cashcharge/b$e;Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class d extends ej5 implements Function2<b.e, a.C0520a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>> {
                final /* synthetic */ CashChargePresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(CashChargePresenter cashChargePresenter) {
                    super(2);
                    this.a = cashChargePresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> invoke(b.e eVar, a.C0520a c0520a) {
                    z65.h(eVar, "<anonymous parameter 0>");
                    z65.h(c0520a, "data");
                    return this.a.K(c0520a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CashChargePresenter cashChargePresenter) {
                super(1);
                this.a = cashChargePresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>.a<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> aVar) {
                z65.h(aVar, "$this$state");
                C0517a c0517a = new C0517a(this.a);
                if (!aVar.b().containsKey(b.f.class)) {
                    aVar.b().put(b.f.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.cashcharge.a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>>> map = aVar.b().get(b.f.class);
                z65.e(map);
                map.put(a.C0520a.class, (Function2) unb.e(c0517a, 2));
                C0518b c0518b = new C0518b(this.a);
                if (!aVar.b().containsKey(b.a.class)) {
                    aVar.b().put(b.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.cashcharge.a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>>> map2 = aVar.b().get(b.a.class);
                z65.e(map2);
                map2.put(a.C0520a.class, (Function2) unb.e(c0518b, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(b.C0521b.class)) {
                    aVar.b().put(b.C0521b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.cashcharge.a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>>> map3 = aVar.b().get(b.C0521b.class);
                z65.e(map3);
                map3.put(a.C0520a.class, (Function2) unb.e(cVar, 2));
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(b.e.class)) {
                    aVar.b().put(b.e.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.cashcharge.a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>>> map4 = aVar.b().get(b.e.class);
                z65.e(map4);
                map4.put(a.C0520a.class, (Function2) unb.e(dVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>.a<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CashChargePresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>.a<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>, Unit> {
            final /* synthetic */ CashChargePresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CashChargePresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/b$c;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "a", "(Lru/dodopizza/app/presentation/checkout/cashcharge/b$c;Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.checkout.cashcharge.CashChargePresenter$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0519a extends ej5 implements Function2<b.c, a.C0520a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>> {
                final /* synthetic */ CashChargePresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0519a(CashChargePresenter cashChargePresenter) {
                    super(2);
                    this.a = cashChargePresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> invoke(b.c cVar, a.C0520a c0520a) {
                    z65.h(cVar, "<anonymous parameter 0>");
                    z65.h(c0520a, "<anonymous parameter 1>");
                    return this.a.M();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CashChargePresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/b$d;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;", "data", "Lbua;", "Lru/dodopizza/app/presentation/checkout/cashcharge/d;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "a", "(Lru/dodopizza/app/presentation/checkout/cashcharge/b$d;Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class b extends ej5 implements Function2<b.d, a.C0520a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>> {
                public static final b a = new b();

                b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> invoke(b.d dVar, a.C0520a c0520a) {
                    z65.h(dVar, "<anonymous parameter 0>");
                    z65.h(c0520a, "data");
                    return new bua<>(d.c.a, c0520a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(CashChargePresenter cashChargePresenter) {
                super(1);
                this.a = cashChargePresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>.a<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> aVar) {
                z65.h(aVar, "$this$state");
                C0519a c0519a = new C0519a(this.a);
                if (!aVar.b().containsKey(b.c.class)) {
                    aVar.b().put(b.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.cashcharge.a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>>> map = aVar.b().get(b.c.class);
                z65.e(map);
                map.put(a.C0520a.class, (Function2) unb.e(c0519a, 2));
                b bVar = b.a;
                if (!aVar.b().containsKey(b.d.class)) {
                    aVar.b().put(b.d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.cashcharge.a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>>> map2 = aVar.b().get(b.d.class);
                z65.e(map2);
                map2.put(a.C0520a.class, (Function2) unb.e(bVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>.a<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        a() {
            super(1);
        }

        public final void a(ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> ko3Var) {
            z65.h(ko3Var, "$this$null");
            C0515a c0515a = new C0515a(CashChargePresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.cashcharge.a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>>>>> c2 = ko3Var.c();
            ko3.a aVar = new ko3.a();
            c0515a.invoke(aVar);
            c2.put(d.C0523d.class, aVar.a());
            b bVar = new b(CashChargePresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.cashcharge.a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>>>>> c3 = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            bVar.invoke(aVar2);
            c3.put(d.c.class, aVar2.a());
            c cVar = new c(CashChargePresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.checkout.cashcharge.a, bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>>>>> c4 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            cVar.invoke(aVar3);
            c4.put(d.a.class, aVar3.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CashChargePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lws0;", "vo", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.cashcharge.CashChargePresenter$requestCashChargeVO$1", f = "CashChargePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<ws0, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ws0 ws0Var, cv1<? super Unit> cv1Var) {
            return ((b) create(ws0Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ws0 ws0Var = (ws0) this.b;
                zs0 zs0Var = CashChargePresenter.this.e;
                View viewState = CashChargePresenter.this.getViewState();
                z65.g(viewState, "getViewState(...)");
                zs0Var.a((ys0) viewState, ws0Var);
                CashChargePresenter.this.z(d.c.a, new a.C0520a(ws0Var, false));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CashChargePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.cashcharge.CashChargePresenter$requestCashChargeVO$2", f = "CashChargePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CashChargePresenter.this.h.warn("Failed to load cash charge data", (Throwable) this.b);
                CashChargePresenter.this.z(d.e.a, a.b.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CashChargePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.cashcharge.CashChargePresenter$requestCashChargeVO$3", f = "CashChargePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ys0) CashChargePresenter.this.getViewState()).P();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashChargePresenter(os0 os0Var, f63 f63Var, jn6 jn6Var, zs0 zs0Var, vn6 vn6Var, Function1<? super String, String> function1) {
        z65.h(os0Var, "interactor");
        z65.h(f63Var, "router");
        z65.h(jn6Var, "moneyFactory");
        z65.h(zs0Var, "viewBinder");
        z65.h(vn6Var, "moneyValidator");
        z65.h(function1, "moneyInputFilter");
        this.b = os0Var;
        this.c = f63Var;
        this.d = jn6Var;
        this.e = zs0Var;
        this.f = vn6Var;
        this.g = function1;
        this.h = LoggerFactory.getLogger("CashChargePresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> I(a.C0520a c0520a) {
        if (c0520a.c()) {
            ((ys0) getViewState()).Fc();
            return new bua<>(d.a.a, c0520a);
        }
        return M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> J(a.C0520a c0520a) {
        if (rn6.c(c0520a.b().c(), c0520a.b().d()) < 0) {
            return new bua<>(d.c.a, c0520a);
        }
        ((ys0) getViewState()).a();
        this.c.i(R.id.cash_charge_result, new bt0.a(c0520a.b().c()));
        return new bua<>(d.b.a, a.b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> K(a.C0520a c0520a) {
        ((ys0) getViewState()).a();
        this.c.i(R.id.cash_charge_result, new bt0.a(c0520a.b().d()));
        return new bua<>(d.b.a, a.b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> L(b.f fVar, a.C0520a c0520a) {
        ws0 b2;
        if (this.f.a(fVar.a())) {
            b2 = ws0.b(c0520a.b(), null, this.d.a(this.g.invoke(fVar.a())), fVar.a(), false, 9, null);
        } else {
            ((ys0) getViewState()).u0();
            b2 = c0520a.b();
        }
        zs0 zs0Var = this.e;
        View viewState = getViewState();
        z65.g(viewState, "getViewState(...)");
        zs0Var.a((ys0) viewState, b2);
        return new bua<>(d.c.a, c0520a.a(b2, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> M() {
        ((ys0) getViewState()).a();
        this.c.i(R.id.cash_charge_result, bt0.b.a);
        return new bua<>(d.b.a, a.b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        p(o77.a(z77.a(y87.a(this.b.a(), new b(null)), new c(null)), new d(null)));
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a> t() {
        return new bua<>(d.C0523d.a, a.b.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<ru.dodopizza.app.presentation.checkout.cashcharge.d, ru.dodopizza.app.presentation.checkout.cashcharge.a>, Unit> v() {
        return new a();
    }
}
