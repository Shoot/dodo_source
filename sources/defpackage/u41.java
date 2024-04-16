package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.DataPaymentEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.dodopizza.persistence.entity.payment.CardEntity;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.jw7;
import defpackage.oo7;
import defpackage.ou2;
import defpackage.wo7;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.backend.domain.state.WorkflowApi;
import ru.dodopizza.backend.domain.state.dto.DeliveryAddressDto;
import ru.dodopizza.backend.domain.state.dto.PackageTypeDto;
import ru.dodopizza.backend.domain.state.dto.SetAddressRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetDeferredTimeRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetDeliveryRequest;
import ru.dodopizza.backend.domain.state.dto.SetDeliveryTableNumberRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetPackageTypeRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetPizzeriaRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetRestaurantPizzeriaRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetTakeawayRequestDto;
import ru.dodopizza.backend.domain.state.dto.StateDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.SetDeliveryLocationDetailsDto;
import ru.dodopizza.backend.domain.state.dto.payment.PaymentMethodRequestDto;
/* compiled from: CheckoutDetailsServiceImpl.kt */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010D\u001a\u00020B\u0012\u0006\u0010G\u001a\u00020E\u0012\u0006\u0010J\u001a\u00020H\u0012\u0006\u0010M\u001a\u00020K\u0012\u0006\u0010P\u001a\u00020N\u0012\u0006\u0010S\u001a\u00020Q\u0012\u0006\u0010V\u001a\u00020T\u0012\u0006\u0010Y\u001a\u00020W\u0012\u0006\u0010\\\u001a\u00020Z\u0012\u0006\u0010_\u001a\u00020]\u0012\u0006\u0010b\u001a\u00020`¢\u0006\u0004\bs\u0010tJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0018\u001a\u00020\u0005*\u00020\u0010H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\f\u0010\u001e\u001a\u00020\u001d*\u00020\u0010H\u0002J\u000e\u0010!\u001a\u00020 *\u0004\u0018\u00010\u001fH\u0002J\u001a\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010(\u001a\u00020\u001bH\u0016J%\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b+\u0010,J\u001c\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010-\u001a\u00020\nH\u0016J\u001c\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u00100\u001a\u00020/H\u0016J$\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u00103\u001a\u0002022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0014\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u001c\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u001c\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u00109\u001a\u000208H\u0016J\u001c\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u00109\u001a\u000208H\u0016J\u001c\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010<\u001a\u00020\nH\u0016J\b\u0010>\u001a\u00020\u0005H\u0016R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010CR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010IR\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010LR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010OR\u0014\u0010S\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010^R\u0014\u0010b\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010aR \u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR,\u0010l\u001a\u001a\u0012\u0004\u0012\u00020i\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010o\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006u"}, d2 = {"Lu41;", "Lt41;", "Lw6;", "address", "Lkotlin/Pair;", "Lb41;", "Lov0;", "w", "Le91;", "clientDeliveryLocation", "", "setDeliveryOrderType", "x", "isReusablePackageSelected", "Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;", "o", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "state", "v", "", "deferredTime", "", "r", "(Ljava/lang/Long;)Ljava/lang/String;", "y", "Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity;", "statePayment", "Ljw7;", "t", "Lkk7;", Image.TYPE_SMALL, "Loo7;", "Lwo7;", "z", "Lxo7;", "selectedType", "Loo7$a;", "widgetData", "Lwo7$b;", "p", "paymentWay", "f", CrashHianalyticsData.TIME, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Long;)Lkotlin/Pair;", "isTakeaway", "a", "", "tableNumber", "g", "Lou2;", "deliverablePlace", "j", "l", c.a, "i", "Ld88;", "pizzeria", e.a, Image.TYPE_HIGH, "isSelected", "b", "k", "Lru/dodopizza/backend/domain/state/WorkflowApi;", "Lru/dodopizza/backend/domain/state/WorkflowApi;", "workflowApi", "Lf8c;", "Lf8c;", "workflowIdProvider", "Lava;", "Lava;", "stateProvider", "Ldua;", "Ldua;", "stateAnalyzer", "Lv53;", "Lv53;", "domainState", "Ltw7;", "Ltw7;", "paymentWayService", "Lnw7;", "Lnw7;", "paymentWayFactory", "Lpv0;", "Lpv0;", "changeWorkflowResultHandler", "Ljgb;", "Ljgb;", "timeFormatter", "Lpgb;", "Lpgb;", "timeParser", "Lmk7;", "Lmk7;", "orderTypeConverter", "Lgy2;", "Lgy2;", "converter", "Lkotlin/reflect/KFunction1;", "Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;", Image.TYPE_MEDIUM, "Ltd5;", "addressToDto", "Lkotlin/Function1;", "Lru/dodopizza/backend/domain/state/dto/StateDto;", "n", "Lkotlin/jvm/functions/Function1;", "handleNewState", "u", "()Ljava/lang/String;", "stateId", "q", "()Lcom/dodopizza/persistence/entity/cart/StateEntity;", "currentState", "<init>", "(Lru/dodopizza/backend/domain/state/WorkflowApi;Lf8c;Lava;Ldua;Lv53;Ltw7;Lnw7;Lpv0;Ljgb;Lpgb;Lmk7;Lgy2;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u41  reason: default package */
/* loaded from: classes4.dex */
public final class u41 implements t41 {
    private final WorkflowApi a;
    private final f8c b;
    private final ava c;
    private final dua d;
    private final v53 e;
    private final tw7 f;
    private final nw7 g;
    private final pv0 h;
    private final jgb i;
    private final pgb j;
    private final mk7 k;
    private final gy2 l;
    private final td5<DeliveryAddressDto> m;
    private final Function1<StateDto, Pair<b41, ov0>> n;

    /* compiled from: CheckoutDetailsServiceImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u41$a */
    /* loaded from: classes4.dex */
    /* synthetic */ class a extends m94 implements Function1<w6, DeliveryAddressDto> {
        public static final a a = new a();

        a() {
            super(1, j9.class, "mapAddressToDeliveryAddressDto", "mapAddressToDeliveryAddressDto(Lru/dodopizza/app/domain/customer/address/Address;)Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final DeliveryAddressDto invoke(w6 w6Var) {
            z65.h(w6Var, "p0");
            return j9.a(w6Var);
        }
    }

    /* compiled from: CheckoutDetailsServiceImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/StateDto;", "stateDto", "Lkotlin/Pair;", "Lb41;", "Lov0;", "a", "(Lru/dodopizza/backend/domain/state/dto/StateDto;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u41$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<StateDto, Pair<? extends b41, ? extends ov0>> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<b41, ov0> invoke(StateDto stateDto) {
            z65.h(stateDto, "stateDto");
            return u41.this.v(u41.this.d.d(stateDto));
        }
    }

    public u41(WorkflowApi workflowApi, f8c f8cVar, ava avaVar, dua duaVar, v53 v53Var, tw7 tw7Var, nw7 nw7Var, pv0 pv0Var, jgb jgbVar, pgb pgbVar, mk7 mk7Var, gy2 gy2Var) {
        z65.h(workflowApi, "workflowApi");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(avaVar, "stateProvider");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(v53Var, "domainState");
        z65.h(tw7Var, "paymentWayService");
        z65.h(nw7Var, "paymentWayFactory");
        z65.h(pv0Var, "changeWorkflowResultHandler");
        z65.h(jgbVar, "timeFormatter");
        z65.h(pgbVar, "timeParser");
        z65.h(mk7Var, "orderTypeConverter");
        z65.h(gy2Var, "converter");
        this.a = workflowApi;
        this.b = f8cVar;
        this.c = avaVar;
        this.d = duaVar;
        this.e = v53Var;
        this.f = tw7Var;
        this.g = nw7Var;
        this.h = pv0Var;
        this.i = jgbVar;
        this.j = pgbVar;
        this.k = mk7Var;
        this.l = gy2Var;
        this.m = a.a;
        this.n = new b();
    }

    private final PackageTypeDto o(boolean z) {
        if (z) {
            return PackageTypeDto.REUSABLE;
        }
        return PackageTypeDto.DISPOSABLE;
    }

    private final wo7.b p(xo7 xo7Var, oo7.a aVar) {
        boolean z;
        if (xo7Var == xo7.b) {
            z = true;
        } else {
            z = false;
        }
        if (aVar == null) {
            return new wo7.b.C0726b(z);
        }
        return new wo7.b.a(z, aVar.e(), aVar.c(), aVar.d(), aVar.a(), aVar.b());
    }

    private final StateEntity q() {
        return this.c.e();
    }

    private final String r(Long l) {
        if (l != null) {
            return this.i.a(l.longValue());
        }
        return null;
    }

    private final kk7 s(StateEntity stateEntity) {
        return this.k.a(stateEntity);
    }

    private final jw7 t(DataPaymentEntity dataPaymentEntity) {
        Object obj;
        Object next;
        String str;
        String str2;
        Iterator<T> it = this.f.a().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            jw7 jw7Var = (jw7) next;
            CardEntity card = dataPaymentEntity.getCard();
            if (card != null) {
                str = card.getId();
            } else {
                str = null;
            }
            if (str != null) {
                if (z65.c(jw7Var.a(), dataPaymentEntity.getAcquirerName()) && jw7Var.c().i() == dataPaymentEntity.getPaymentMethodType() && (jw7Var instanceof jw7.g)) {
                    p60 i = ((jw7.g) jw7Var).i();
                    if (i != null) {
                        str2 = i.getId();
                    } else {
                        str2 = null;
                    }
                    CardEntity card2 = dataPaymentEntity.getCard();
                    if (card2 != null) {
                        obj = card2.getId();
                    }
                    if (obj == null) {
                        obj = "";
                    }
                    if (z65.c(str2, obj)) {
                        break;
                    }
                }
            } else if (z65.c(jw7Var.a(), dataPaymentEntity.getAcquirerName()) && jw7Var.c().i() == dataPaymentEntity.getPaymentMethodType()) {
                break;
            }
        }
        obj = next;
        return (jw7) obj;
    }

    private final String u() {
        return this.b.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<b41, ov0> v(StateEntity stateEntity) {
        return new Pair<>(y(stateEntity), this.h.a(stateEntity));
    }

    private final Pair<b41, ov0> w(w6 w6Var) {
        this.e.h(w6Var);
        k().l(w6Var);
        return this.n.invoke(this.a.setAddress(new SetAddressRequestDto(u(), (DeliveryAddressDto) ((Function1) this.m).invoke(w6Var))));
    }

    private final Pair<b41, ov0> x(e91 e91Var, boolean z) {
        this.e.n(e91Var);
        k().n(e91Var);
        return this.n.invoke(this.a.setDeliveryLocation(this.l.a(u(), e91Var, z)));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.b41 y(com.dodopizza.persistence.entity.cart.StateEntity r13) {
        /*
            r12 = this;
            com.dodopizza.persistence.entity.cart.DataPaymentEntity r0 = r13.getDataPayment()
            r1 = 0
            if (r0 == 0) goto Lc
            jw7 r0 = r12.t(r0)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            kn6 r2 = defpackage.kn6.c
            com.dodopizza.persistence.entity.cart.DataPaymentEntity r3 = r13.getDataPayment()
            if (r3 == 0) goto L20
            java.lang.Double r3 = r3.getClientNotes()
            if (r3 == 0) goto L20
            double r3 = r3.doubleValue()
            goto L22
        L20:
            r3 = 0
        L22:
            hn6 r2 = r2.b(r3)
            zs7 r4 = new zs7
            r4.<init>(r0, r2)
            kk7 r5 = r12.s(r13)
            java.lang.String r0 = r13.getDeferredOrderTime()
            if (r0 == 0) goto L4e
            int r2 = r0.length()
            if (r2 != 0) goto L3c
            r0 = r1
        L3c:
            if (r0 == 0) goto L4e
            pgb r0 = r12.j
            java.lang.String r2 = r13.getDeferredOrderTime()
            long r2 = r0.a(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6 = r0
            goto L4f
        L4e:
            r6 = r1
        L4f:
            boolean r7 = r13.isWorkload()
            java.lang.Boolean r8 = r13.isTakeaway()
            int r9 = r13.getExpectedMinutesToReceiveForASAP()
            java.lang.Integer r10 = r13.getTableNumber()
            com.dodopizza.persistence.entity.PackageInfoEntity r13 = r13.getPackageInfo()
            if (r13 == 0) goto L69
            oo7 r1 = defpackage.qo7.b(r13)
        L69:
            wo7 r11 = r12.z(r1)
            b41 r13 = new b41
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u41.y(com.dodopizza.persistence.entity.cart.StateEntity):b41");
    }

    private final wo7 z(oo7 oo7Var) {
        if (oo7Var == null) {
            return wo7.a.a;
        }
        if (oo7Var.a().contains(xo7.a) && oo7Var.a().contains(xo7.b)) {
            return p(oo7Var.b(), oo7Var.c());
        }
        return wo7.a.a;
    }

    @Override // defpackage.t41
    public Pair<b41, ov0> a(boolean z) {
        return this.n.invoke(this.a.setTakeaway(new SetTakeawayRequestDto(u(), z)));
    }

    @Override // defpackage.t41
    public Pair<b41, ov0> b(boolean z) {
        return this.n.invoke(this.a.setPackageType(new SetPackageTypeRequestDto(u(), o(z))));
    }

    @Override // defpackage.t41
    public Pair<b41, ov0> c(e91 e91Var) {
        z65.h(e91Var, "clientDeliveryLocation");
        this.e.n(e91Var);
        k().n(e91Var);
        return this.n.invoke(this.a.setDeliveryLocationDetails(new SetDeliveryLocationDetailsDto(u(), e91Var.c().c())));
    }

    @Override // defpackage.t41
    public Pair<b41, ov0> d(Long l) {
        return this.n.invoke(this.a.setDeferredTime(new SetDeferredTimeRequestDto(u(), r(k().p(l).c()))));
    }

    @Override // defpackage.t41
    public Pair<b41, ov0> e(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        this.e.h(w6.n);
        k().m(d88Var);
        return this.n.invoke(this.a.setPizzeria(new SetPizzeriaRequestDto(u(), d88Var.getId())));
    }

    @Override // defpackage.t41
    public Pair<b41, ov0> f(jw7 jw7Var) {
        jw7.g gVar;
        p60 i;
        z65.h(jw7Var, "paymentWay");
        WorkflowApi workflowApi = this.a;
        String u = u();
        int i2 = jw7Var.c().i();
        String str = null;
        if (jw7Var instanceof jw7.g) {
            gVar = (jw7.g) jw7Var;
        } else {
            gVar = null;
        }
        if (gVar != null && (i = gVar.i()) != null) {
            str = i.getId();
        }
        return this.n.invoke(workflowApi.setPaymentMethod(new PaymentMethodRequestDto(u, i2, str, Boolean.valueOf(jw7Var.f()))));
    }

    @Override // defpackage.t41
    public Pair<b41, ov0> g(int i) {
        return this.n.invoke(this.a.setDeliveryTableNumber(new SetDeliveryTableNumberRequestDto(u(), i)));
    }

    @Override // defpackage.t41
    public Pair<b41, ov0> h(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        this.e.h(w6.n);
        k().o(d88Var);
        return this.n.invoke(this.a.setRestaurantPizzeria(new SetRestaurantPizzeriaRequestDto(u(), d88Var.getId())));
    }

    @Override // defpackage.t41
    public Pair<b41, ov0> i() {
        return this.n.invoke(this.a.setDelivery(new SetDeliveryRequest(u())));
    }

    @Override // defpackage.t41
    public Pair<b41, ov0> j(ou2 ou2Var, boolean z) {
        z65.h(ou2Var, "deliverablePlace");
        if (ou2Var instanceof ou2.b) {
            return w(((ou2.b) ou2Var).b());
        }
        if (ou2Var instanceof ou2.c) {
            return x(((ou2.c) ou2Var).b(), z);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.t41
    public b41 k() {
        return y(q());
    }

    @Override // defpackage.t41
    public Pair<b41, ov0> l() {
        this.e.m();
        k().k();
        return this.n.invoke(this.a.deleteDeliveryLocation(u()));
    }
}
