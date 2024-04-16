package defpackage;

import com.dodopizza.persistence.entity.ClientDeliveryFeeLevelEntity;
import com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity;
import com.dodopizza.persistence.entity.RealmString;
import com.dodopizza.persistence.entity.StateErrorEntity;
import com.dodopizza.persistence.entity.StateWarningEntity;
import com.dodopizza.persistence.entity.address.DeliveryAddressEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.DataPaymentEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.dodopizza.persistence.entity.cart.UpsaleEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationEntity;
import com.dodopizza.persistence.entity.payment.PaymentMethodEntity;
import com.dodopizza.persistence.entity.personalization.PersonalizationEntity;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import defpackage.fda;
import io.realm.k0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.backend.domain.state.dto.ClientDeliveryFeeLevelDto;
import ru.dodopizza.backend.domain.state.dto.DeliveryAddressDto;
import ru.dodopizza.backend.domain.state.dto.DeliveryFeeLevelsDto;
import ru.dodopizza.backend.domain.state.dto.ErrorDto;
import ru.dodopizza.backend.domain.state.dto.PackageInfoDto;
import ru.dodopizza.backend.domain.state.dto.PrizotekaDto;
import ru.dodopizza.backend.domain.state.dto.StateDto;
import ru.dodopizza.backend.domain.state.dto.WarningDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.ClientDeliveryLocationDto;
import ru.dodopizza.backend.domain.state.dto.payment.PaymentDataDto;
import ru.dodopizza.backend.domain.state.dto.payment.PaymentMethodDto;
import ru.dodopizza.backend.domain.state.dto.personalization.PersonalizationDto;
/* compiled from: StateConverter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lhua;", "Lgua;", "Lru/dodopizza/backend/domain/state/dto/StateDto;", "dto", "", "isTransparentImageUrlEnabled", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "a", "Lhq0;", "Lhq0;", "cartConverter", "Lfda;", "b", "Lfda;", "serverTimeParser", "<init>", "(Lhq0;Lfda;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hua  reason: default package */
/* loaded from: classes4.dex */
public final class hua implements gua {
    private final hq0 a;
    private final fda b;

    /* compiled from: StateConverter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", CrashHianalyticsData.TIME, "", "a", "(Ljava/lang/String;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hua$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<String, Long> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Long invoke(String str) {
            z65.h(str, CrashHianalyticsData.TIME);
            return Long.valueOf(fda.a.a(hua.this.b, str, null, 2, null));
        }
    }

    public hua(hq0 hq0Var, fda fdaVar) {
        z65.h(hq0Var, "cartConverter");
        z65.h(fdaVar, "serverTimeParser");
        this.a = hq0Var;
        this.b = fdaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gua
    public StateEntity a(StateDto stateDto, boolean z) {
        DeliveryFeeLevelsEntity deliveryFeeLevelsEntity;
        oo7 x;
        z65.h(stateDto, "dto");
        String workflowId = stateDto.getWorkflowId();
        String placedOrderId = stateDto.getPlacedOrderId();
        Integer valueOf = Integer.valueOf(stateDto.getStep());
        boolean isWorkload = stateDto.isWorkload();
        String orderPizzeriaId = stateDto.getOrderPizzeriaId();
        CartEntity a2 = this.a.a(stateDto.getCart(), z);
        Integer valueOf2 = Integer.valueOf(stateDto.getCartError());
        String localityId = stateDto.getLocalityId();
        double minDeliveryPrice = stateDto.getMinDeliveryPrice();
        double minDeliveryPriceCustomized = stateDto.getMinDeliveryPriceCustomized();
        int expectedMinutesToReceiveForASAP = stateDto.getExpectedMinutesToReceiveForASAP();
        DeliveryAddressDto deliveryAddress = stateDto.getDeliveryAddress();
        DeliveryAddressEntity invoke = deliveryAddress != null ? fva.h().invoke(deliveryAddress) : null;
        ClientDeliveryLocationDto clientDeliveryLocation = stateDto.getClientDeliveryLocation();
        ClientDeliveryLocationEntity invoke2 = clientDeliveryLocation != null ? fva.f().invoke(clientDeliveryLocation) : null;
        String deferredOrderDateTime = stateDto.getDeferredOrderDateTime();
        Integer valueOf3 = Integer.valueOf(stateDto.getCountryCode());
        Integer valueOf4 = Integer.valueOf(stateDto.getCurrentOrderType());
        String languageCode = stateDto.getLanguageCode();
        k0 k0Var = new k0();
        for (Iterator it = stateDto.getStopLists().getProductIds().iterator(); it.hasNext(); it = it) {
            k0Var.add(new RealmString((String) it.next()));
            expectedMinutesToReceiveForASAP = expectedMinutesToReceiveForASAP;
        }
        int i = expectedMinutesToReceiveForASAP;
        k0 k0Var2 = new k0();
        for (Iterator it2 = stateDto.getStopLists().getToppingIds().iterator(); it2.hasNext(); it2 = it2) {
            k0Var2.add(new RealmString((String) it2.next()));
            k0Var = k0Var;
        }
        k0 k0Var3 = k0Var;
        PaymentDataDto payment = stateDto.getPayment();
        DataPaymentEntity invoke3 = payment != null ? fva.n().invoke(payment) : null;
        k0 k0Var4 = new k0();
        Function1<ErrorDto, StateErrorEntity> l = fva.l();
        for (Object obj : stateDto.getErrors()) {
            k0Var4.add(l.invoke(obj));
            minDeliveryPriceCustomized = minDeliveryPriceCustomized;
        }
        double d = minDeliveryPriceCustomized;
        k0 k0Var5 = new k0();
        Function1<WarningDto, StateWarningEntity> H = fva.H();
        for (Object obj2 : stateDto.getWarnings()) {
            k0Var5.add(H.invoke(obj2));
        }
        UpsaleEntity invoke4 = fva.z(z).invoke(stateDto.getUpsale());
        k0 k0Var6 = new k0();
        Function1<PaymentMethodDto, PaymentMethodEntity> o = fva.o();
        for (Object obj3 : stateDto.getPaymentMethods()) {
            k0Var6.add(o.invoke(obj3));
            k0Var4 = k0Var4;
        }
        k0 k0Var7 = k0Var4;
        Boolean isTakeaway = stateDto.isTakeaway();
        String identificationNumber = stateDto.getTaxpayer().getIdentificationNumber();
        Integer tableNumber = stateDto.getTableNumber();
        PrizotekaDto prizoteka = stateDto.getPrizoteka();
        PrizotekaEntity invoke5 = prizoteka != null ? fva.s().invoke(prizoteka) : null;
        PersonalizationDto personalization = stateDto.getPersonalization();
        PersonalizationEntity invoke6 = personalization != null ? fva.q(new a()).invoke(personalization) : null;
        DeliveryFeeLevelsDto delivery = stateDto.getDelivery();
        if (delivery != null) {
            k0 k0Var8 = new k0();
            Function1<ClientDeliveryFeeLevelDto, ClientDeliveryFeeLevelEntity> e = fva.e();
            for (Object obj4 : delivery.getFeeLevels()) {
                k0Var8.add(e.invoke(obj4));
            }
            deliveryFeeLevelsEntity = new DeliveryFeeLevelsEntity(k0Var8);
        } else {
            deliveryFeeLevelsEntity = null;
        }
        int pizzeriaAverageServiceTimeMinutes = stateDto.getPizzeriaAverageServiceTimeMinutes();
        PackageInfoDto packageInfo = stateDto.getPackageInfo();
        return new StateEntity(workflowId, placedOrderId, valueOf, isWorkload, orderPizzeriaId, a2, valueOf2, localityId, minDeliveryPrice, d, i, invoke, invoke2, deferredOrderDateTime, valueOf3, valueOf4, languageCode, k0Var3, k0Var2, invoke3, k0Var7, k0Var5, invoke4, k0Var6, isTakeaway, identificationNumber, tableNumber, invoke5, invoke6, deliveryFeeLevelsEntity, pizzeriaAverageServiceTimeMinutes, (packageInfo == null || (x = fva.x(packageInfo)) == null) ? null : qo7.d(x));
    }
}
