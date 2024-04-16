package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.ClientDeliveryFeeLevelEntity;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.StateErrorEntity;
import com.dodopizza.persistence.entity.StateWarningEntity;
import com.dodopizza.persistence.entity.address.DeliveryAddressEntity;
import com.dodopizza.persistence.entity.cart.AppliedInfoEntity;
import com.dodopizza.persistence.entity.cart.DataPaymentEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.EncryptionDataEntity;
import com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity;
import com.dodopizza.persistence.entity.cart.PriceEntity;
import com.dodopizza.persistence.entity.cart.UpsaleEntity;
import com.dodopizza.persistence.entity.cart.UpsaleMeasureInfoEntity;
import com.dodopizza.persistence.entity.cart.UpsaleProductEntity;
import com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity;
import com.dodopizza.persistence.entity.deliverylocation.AddressAdditionEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationEntity;
import com.dodopizza.persistence.entity.deliverylocation.CoordinatesEntity;
import com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity;
import com.dodopizza.persistence.entity.payment.CardEntity;
import com.dodopizza.persistence.entity.payment.GooglePayInitDataEntity;
import com.dodopizza.persistence.entity.payment.PaymentMethodEntity;
import com.dodopizza.persistence.entity.personalization.DeliveryExperimentEntity;
import com.dodopizza.persistence.entity.personalization.DynamicDeliveryEntity;
import com.dodopizza.persistence.entity.personalization.MapEntry;
import com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity;
import com.dodopizza.persistence.entity.personalization.PersonalCategoryEntity;
import com.dodopizza.persistence.entity.personalization.PersonalizationEntity;
import com.dodopizza.persistence.entity.personalization.UpsellProductsEntity;
import com.dodopizza.persistence.entity.personalization.UpsellProductsEntityKt;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.oo7;
import io.realm.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.backend.domain.bonus.dto.BonusActionDto;
import ru.dodopizza.backend.domain.cart.dto.UpsaleMeasureInfoDto;
import ru.dodopizza.backend.domain.cart.dto.UpsaleProductDto;
import ru.dodopizza.backend.domain.cart.dto.UpsaleSizeDetailsDto;
import ru.dodopizza.backend.domain.state.dto.ClientDeliveryFeeLevelDto;
import ru.dodopizza.backend.domain.state.dto.DeliveryAddressDto;
import ru.dodopizza.backend.domain.state.dto.ErrorDto;
import ru.dodopizza.backend.domain.state.dto.PackageInfoDto;
import ru.dodopizza.backend.domain.state.dto.PackageTypeDto;
import ru.dodopizza.backend.domain.state.dto.PrizotekaDto;
import ru.dodopizza.backend.domain.state.dto.PrizotekaLevelDto;
import ru.dodopizza.backend.domain.state.dto.UpsaleDto;
import ru.dodopizza.backend.domain.state.dto.WarningDto;
import ru.dodopizza.backend.domain.state.dto.cart.PriceDto;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.AppliedInfoDto;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.PersonalPromoActionDto;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.PromoCodeDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.ClientDeliveryLocationDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.CoordinatesDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.DeliveryLocationDto;
import ru.dodopizza.backend.domain.state.dto.payment.CardDto;
import ru.dodopizza.backend.domain.state.dto.payment.EncryptionDataDto;
import ru.dodopizza.backend.domain.state.dto.payment.PaymentDataDto;
import ru.dodopizza.backend.domain.state.dto.payment.PaymentMethodDto;
import ru.dodopizza.backend.domain.state.dto.payment.googlepay.GooglePayInitDataDto;
import ru.dodopizza.backend.domain.state.dto.payment.googlepay.GooglePayPaymentDataDto;
import ru.dodopizza.backend.domain.state.dto.payment.googlepay.PaymentOptionsDto;
import ru.dodopizza.backend.domain.state.dto.personalization.DynamicDeliveryDto;
import ru.dodopizza.backend.domain.state.dto.personalization.MenuPersonalPriceInfoDto;
import ru.dodopizza.backend.domain.state.dto.personalization.PersonalCategoryDto;
import ru.dodopizza.backend.domain.state.dto.personalization.PersonalizationDto;
import ru.dodopizza.backend.domain.state.dto.personalization.PersonalizationDtoKt;
import ru.dodopizza.backend.domain.state.dto.personalization.UpsellProducts;
/* compiled from: statedtotransforms.kt */
@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0002\u001a\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u001a\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0002\u001a\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0002\u001a\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0002\u001a\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0002\u001a\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0002\u001a\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u0002\u001a\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0\u0002\u001a\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00120\u0002\u001a\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020%0\u0002\u001a\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u0002\u001a\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u0002\u001a\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0\u0002\u001a\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010\u0002\u001a\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002040\u0002\u001a&\u0010:\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000207\u0012\u0006\u0012\u0004\u0018\u00010706\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\u0002\u001a\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0\u0002\u001a\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0\u0002\u001a\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0\u0002\u001a\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0\u0002\u001a\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0\u0002\u001a\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0\u0002\u001a\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N0\u0002\u001a\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020Q0\u0002\u001a\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020T0\u0002\u001a&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020Y0\u00022\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020V0\u0002\u001a\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0\u0002\u001a\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020_0\u0002\u001a\f\u0010c\u001a\u0004\u0018\u00010b*\u00020a\u001a\u000e\u0010f\u001a\u00020e*\u0004\u0018\u00010dH\u0002\u001a\u000e\u0010i\u001a\u0004\u0018\u00010h*\u00020gH\u0002¨\u0006j"}, d2 = {"", "isTransparentImageUrlEnabled", "Lkotlin/Function1;", "Lru/dodopizza/backend/domain/state/dto/UpsaleDto;", "Lcom/dodopizza/persistence/entity/cart/UpsaleEntity;", "z", "Lru/dodopizza/backend/domain/cart/dto/UpsaleProductDto;", "Lcom/dodopizza/persistence/entity/cart/UpsaleProductEntity;", "D", "Lzsb;", "C", "Lkotlin/Function2;", "Lcom/dodopizza/persistence/entity/personalization/UpsellProductsEntity;", "Lksb;", "G", "Lcom/dodopizza/persistence/entity/cart/UpsaleSizeDetailsEntity;", "Letb;", "F", "Lcom/dodopizza/persistence/entity/cart/UpsaleMeasureInfoEntity;", "Lvsb;", "B", "Lru/dodopizza/backend/domain/state/dto/payment/CardDto;", "Lcom/dodopizza/persistence/entity/payment/CardEntity;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/state/dto/payment/PaymentMethodDto;", "Lcom/dodopizza/persistence/entity/payment/PaymentMethodEntity;", "o", "Lru/dodopizza/backend/domain/state/dto/payment/PaymentDataDto;", "Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity;", "n", "Lru/dodopizza/backend/domain/state/dto/payment/EncryptionDataDto;", "Lcom/dodopizza/persistence/entity/cart/EncryptionDataEntity;", "j", "Lru/dodopizza/backend/domain/cart/dto/UpsaleSizeDetailsDto;", "E", "Lru/dodopizza/backend/domain/cart/dto/UpsaleMeasureInfoDto;", "A", "Loh3;", "k", "Lru/dodopizza/backend/domain/state/dto/ErrorDto;", "Lcom/dodopizza/persistence/entity/StateErrorEntity;", "l", "Lru/dodopizza/backend/domain/state/dto/WarningDto;", "Lcom/dodopizza/persistence/entity/StateWarningEntity;", "H", "Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;", "Lcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;", Image.TYPE_HIGH, "Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;", "Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationEntity;", "f", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/DeliveryLocationDto;", "Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;", "i", "", "", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/deliverylocation/AddressAdditionEntity;", "a", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/CoordinatesDto;", "Lcom/dodopizza/persistence/entity/deliverylocation/CoordinatesEntity;", "g", "Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AppliedInfoDto;", "Lcom/dodopizza/persistence/entity/cart/AppliedInfoEntity;", "b", "Lru/dodopizza/backend/domain/bonus/dto/BonusActionDto;", "Lcom/dodopizza/persistence/entity/BonusActionEntity;", com.huawei.hms.opendevice.c.a, "Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PromoCodeDto;", "Lcom/dodopizza/persistence/entity/cart/DataPromoCodeEntity;", "v", "Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PersonalPromoActionDto;", "Lcom/dodopizza/persistence/entity/cart/PersonalPromoActionEntity;", "u", "Lru/dodopizza/backend/domain/state/dto/cart/PriceDto;", "Lcom/dodopizza/persistence/entity/cart/PriceEntity;", "r", "Lru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayInitDataDto;", "Lcom/dodopizza/persistence/entity/payment/GooglePayInitDataEntity;", Image.TYPE_MEDIUM, "Lru/dodopizza/backend/domain/state/dto/PrizotekaDto;", "Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaEntity;", Image.TYPE_SMALL, "Lru/dodopizza/backend/domain/state/dto/PrizotekaLevelDto;", "Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaLevelEntity;", "t", "", "timeConverter", "Lru/dodopizza/backend/domain/state/dto/personalization/PersonalizationDto;", "Lcom/dodopizza/persistence/entity/personalization/PersonalizationEntity;", "q", "Lru/dodopizza/backend/domain/state/dto/ClientDeliveryFeeLevelDto;", "Lcom/dodopizza/persistence/entity/ClientDeliveryFeeLevelEntity;", com.huawei.hms.push.e.a, "Lru/dodopizza/backend/domain/state/dto/personalization/MenuPersonalPriceInfoDto;", "Lcom/dodopizza/persistence/entity/personalization/MenuPersonalPriceInfoEntity;", "p", "Lru/dodopizza/backend/domain/state/dto/PackageInfoDto;", "Loo7;", "x", "Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;", "Lxo7;", "y", "Lru/dodopizza/backend/domain/state/dto/PackageInfoDto$WidgetDataDto;", "Loo7$a;", "w", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: fva  reason: default package */
/* loaded from: classes4.dex */
public final class fva {

    /* compiled from: statedtotransforms.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fva$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PackageTypeDto.values().length];
            try {
                iArr[PackageTypeDto.DISPOSABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PackageTypeDto.REUSABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/UpsaleProductEntity;", "upsaleProductEntity", "Lzsb;", "a", "(Lcom/dodopizza/persistence/entity/cart/UpsaleProductEntity;)Lzsb;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$a0 */
    /* loaded from: classes4.dex */
    public static final class a0 extends ej5 implements Function1<UpsaleProductEntity, zsb> {
        public static final a0 a = new a0();

        a0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final zsb invoke(UpsaleProductEntity upsaleProductEntity) {
            Integer num;
            etb etbVar;
            etb invoke;
            z65.h(upsaleProductEntity, "upsaleProductEntity");
            String upsaleProductId = upsaleProductEntity.getUpsaleProductId();
            String name = upsaleProductEntity.getName();
            ImageEntity image = upsaleProductEntity.getImage();
            String str = null;
            if (image != null) {
                num = Integer.valueOf(image.getSize());
            } else {
                num = null;
            }
            int intValue = ((Number) mh5.c(num, 0)).intValue();
            ImageEntity image2 = upsaleProductEntity.getImage();
            if (image2 != null) {
                str = image2.getUrl();
            }
            if (str == null) {
                str = "";
            }
            tl8 tl8Var = new tl8(intValue, str);
            double price = upsaleProductEntity.getPrice();
            int orderInCart = upsaleProductEntity.getOrderInCart();
            Integer category = upsaleProductEntity.getCategory();
            UpsaleSizeDetailsEntity promotingSizeDetailsEntity = upsaleProductEntity.getPromotingSizeDetailsEntity();
            if (promotingSizeDetailsEntity != null && (invoke = fva.F().invoke(promotingSizeDetailsEntity)) != null) {
                etbVar = invoke;
            } else {
                etbVar = new etb(null, null, null, null, null, 31, null);
            }
            return new zsb(upsaleProductId, name, tl8Var, price, orderInCart, category, etbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "map", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/deliverylocation/AddressAdditionEntity;", "a", "(Ljava/util/Map;)Lio/realm/k0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<Map<String, ? extends String>, k0<AddressAdditionEntity>> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final k0<AddressAdditionEntity> invoke(Map<String, String> map) {
            z65.h(map, "map");
            k0<AddressAdditionEntity> k0Var = new k0<>();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                k0Var.add(new AddressAdditionEntity(entry.getKey(), entry.getValue()));
            }
            return k0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/UpsaleProductDto;", "product", "Lcom/dodopizza/persistence/entity/cart/UpsaleProductEntity;", "a", "(Lru/dodopizza/backend/domain/cart/dto/UpsaleProductDto;)Lcom/dodopizza/persistence/entity/cart/UpsaleProductEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$b0 */
    /* loaded from: classes4.dex */
    public static final class b0 extends ej5 implements Function1<UpsaleProductDto, UpsaleProductEntity> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final UpsaleProductEntity invoke(UpsaleProductDto upsaleProductDto) {
            UpsaleSizeDetailsEntity upsaleSizeDetailsEntity;
            z65.h(upsaleProductDto, "product");
            String id = upsaleProductDto.getId();
            ImageEntity imageEntity = new ImageEntity(upsaleProductDto.getImage().getSize(), ug6.a(upsaleProductDto.getImage(), this.a));
            String name = upsaleProductDto.getName();
            int orderInCart = upsaleProductDto.getOrderInCart();
            double price = upsaleProductDto.getPrice();
            Integer category = upsaleProductDto.getCategory();
            UpsaleSizeDetailsDto upsaleSizeDetailsDto = upsaleProductDto.getUpsaleSizeDetailsDto();
            if (upsaleSizeDetailsDto != null) {
                upsaleSizeDetailsEntity = fva.E().invoke(upsaleSizeDetailsDto);
            } else {
                upsaleSizeDetailsEntity = null;
            }
            return new UpsaleProductEntity(id, imageEntity, name, orderInCart, price, category, upsaleSizeDetailsEntity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AppliedInfoDto;", "dto", "Lcom/dodopizza/persistence/entity/cart/AppliedInfoEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AppliedInfoDto;)Lcom/dodopizza/persistence/entity/cart/AppliedInfoEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<AppliedInfoDto, AppliedInfoEntity> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AppliedInfoEntity invoke(AppliedInfoDto appliedInfoDto) {
            z65.h(appliedInfoDto, "dto");
            return new AppliedInfoEntity(appliedInfoDto.getStatus(), appliedInfoDto.getDescription());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/UpsaleSizeDetailsDto;", "upsaleSizeDetailsDto", "Lcom/dodopizza/persistence/entity/cart/UpsaleSizeDetailsEntity;", "a", "(Lru/dodopizza/backend/domain/cart/dto/UpsaleSizeDetailsDto;)Lcom/dodopizza/persistence/entity/cart/UpsaleSizeDetailsEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$c0 */
    /* loaded from: classes4.dex */
    public static final class c0 extends ej5 implements Function1<UpsaleSizeDetailsDto, UpsaleSizeDetailsEntity> {
        public static final c0 a = new c0();

        c0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final UpsaleSizeDetailsEntity invoke(UpsaleSizeDetailsDto upsaleSizeDetailsDto) {
            UpsaleMeasureInfoEntity upsaleMeasureInfoEntity;
            z65.h(upsaleSizeDetailsDto, "upsaleSizeDetailsDto");
            Integer valueOf = Integer.valueOf(upsaleSizeDetailsDto.getDoughTypeId());
            String doughTypeName = upsaleSizeDetailsDto.getDoughTypeName();
            Integer valueOf2 = Integer.valueOf(upsaleSizeDetailsDto.getSizeGroupId());
            String sizeGroupName = upsaleSizeDetailsDto.getSizeGroupName();
            UpsaleMeasureInfoDto measureInfo = upsaleSizeDetailsDto.getMeasureInfo();
            if (measureInfo != null) {
                upsaleMeasureInfoEntity = fva.A().invoke(measureInfo);
            } else {
                upsaleMeasureInfoEntity = null;
            }
            return new UpsaleSizeDetailsEntity(valueOf, doughTypeName, valueOf2, sizeGroupName, upsaleMeasureInfoEntity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/bonus/dto/BonusActionDto;", "dto", "Lcom/dodopizza/persistence/entity/BonusActionEntity;", "a", "(Lru/dodopizza/backend/domain/bonus/dto/BonusActionDto;)Lcom/dodopizza/persistence/entity/BonusActionEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<BonusActionDto, BonusActionEntity> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BonusActionEntity invoke(BonusActionDto bonusActionDto) {
            z65.h(bonusActionDto, "dto");
            return new BonusActionEntity(bonusActionDto.getId(), bonusActionDto.getTitle(), bonusActionDto.getDescription(), null, 0, null, null, 0, 248, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/UpsaleSizeDetailsEntity;", "upsaleSizeDetailsEntity", "Letb;", "a", "(Lcom/dodopizza/persistence/entity/cart/UpsaleSizeDetailsEntity;)Letb;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$d0 */
    /* loaded from: classes4.dex */
    public static final class d0 extends ej5 implements Function1<UpsaleSizeDetailsEntity, etb> {
        public static final d0 a = new d0();

        d0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final etb invoke(UpsaleSizeDetailsEntity upsaleSizeDetailsEntity) {
            vsb vsbVar;
            z65.h(upsaleSizeDetailsEntity, "upsaleSizeDetailsEntity");
            Integer doughTypeId = upsaleSizeDetailsEntity.getDoughTypeId();
            String doughTypeName = upsaleSizeDetailsEntity.getDoughTypeName();
            Integer sizeGroupId = upsaleSizeDetailsEntity.getSizeGroupId();
            String sizeGroupName = upsaleSizeDetailsEntity.getSizeGroupName();
            UpsaleMeasureInfoEntity measureInfo = upsaleSizeDetailsEntity.getMeasureInfo();
            if (measureInfo == null || (vsbVar = fva.B().invoke(measureInfo)) == null) {
                vsbVar = new vsb(0, 0.0f, 3, null);
            }
            return new etb(doughTypeId, doughTypeName, sizeGroupId, sizeGroupName, vsbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/CardDto;", "card", "Lcom/dodopizza/persistence/entity/payment/CardEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/payment/CardDto;)Lcom/dodopizza/persistence/entity/payment/CardEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<CardDto, CardEntity> {
        public static final e a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CardEntity invoke(CardDto cardDto) {
            z65.h(cardDto, "card");
            return new CardEntity(cardDto.getId(), cardDto.getStartPart(), cardDto.getEndPart(), null, null, 24, null);
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/UpsaleEntity;", "upsellEntity", "Lcom/dodopizza/persistence/entity/personalization/UpsellProductsEntity;", "upsellProductsEntity", "Lksb;", "a", "(Lcom/dodopizza/persistence/entity/cart/UpsaleEntity;Lcom/dodopizza/persistence/entity/personalization/UpsellProductsEntity;)Lksb;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$e0 */
    /* loaded from: classes4.dex */
    static final class e0 extends ej5 implements Function2<UpsaleEntity, UpsellProductsEntity, ksb> {
        public static final e0 a = new e0();

        e0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final ksb invoke(UpsaleEntity upsaleEntity, UpsellProductsEntity upsellProductsEntity) {
            int w;
            Map map;
            int w2;
            z65.h(upsaleEntity, "upsellEntity");
            z65.h(upsellProductsEntity, "upsellProductsEntity");
            k0<UpsaleProductEntity> products = upsaleEntity.getProducts();
            Function1<UpsaleProductEntity, zsb> C = fva.C();
            w = lc1.w(products, 10);
            ArrayList arrayList = new ArrayList(w);
            for (UpsaleProductEntity upsaleProductEntity : products) {
                arrayList.add(C.invoke(upsaleProductEntity));
            }
            k0<MapEntry> additionalData = upsellProductsEntity.getAdditionalData();
            if (additionalData != null) {
                w2 = lc1.w(additionalData, 10);
                ArrayList arrayList2 = new ArrayList(w2);
                for (MapEntry mapEntry : additionalData) {
                    String key = mapEntry.getKey();
                    String str = "";
                    if (key == null) {
                        key = "";
                    }
                    String value = mapEntry.getValue();
                    if (value != null) {
                        str = value;
                    }
                    arrayList2.add(lnb.a(key, str));
                }
                map = g86.s(arrayList2);
            } else {
                map = null;
            }
            if (map == null) {
                map = g86.h();
            }
            return new ksb(arrayList, new nsb(upsaleEntity.getProducts().size(), map));
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/ClientDeliveryFeeLevelDto;", "dto", "Lcom/dodopizza/persistence/entity/ClientDeliveryFeeLevelEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/ClientDeliveryFeeLevelDto;)Lcom/dodopizza/persistence/entity/ClientDeliveryFeeLevelEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<ClientDeliveryFeeLevelDto, ClientDeliveryFeeLevelEntity> {
        public static final f a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ClientDeliveryFeeLevelEntity invoke(ClientDeliveryFeeLevelDto clientDeliveryFeeLevelDto) {
            z65.h(clientDeliveryFeeLevelDto, "dto");
            return new ClientDeliveryFeeLevelEntity(clientDeliveryFeeLevelDto.getMin(), clientDeliveryFeeLevelDto.getMax(), clientDeliveryFeeLevelDto.getFee());
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/WarningDto;", "dto", "Lcom/dodopizza/persistence/entity/StateWarningEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/WarningDto;)Lcom/dodopizza/persistence/entity/StateWarningEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$f0 */
    /* loaded from: classes4.dex */
    static final class f0 extends ej5 implements Function1<WarningDto, StateWarningEntity> {
        public static final f0 a = new f0();

        f0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final StateWarningEntity invoke(WarningDto warningDto) {
            z65.h(warningDto, "dto");
            return new StateWarningEntity(Integer.valueOf(warningDto.getCode()), warningDto.getDescription());
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;", "dto", "Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;)Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function1<ClientDeliveryLocationDto, ClientDeliveryLocationEntity> {
        public static final g a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ClientDeliveryLocationEntity invoke(ClientDeliveryLocationDto clientDeliveryLocationDto) {
            boolean z;
            z65.h(clientDeliveryLocationDto, "dto");
            String id = clientDeliveryLocationDto.getId();
            DeliveryLocationEntity invoke = fva.i().invoke(clientDeliveryLocationDto.getDeliveryLocation());
            Boolean requiresAdditions = clientDeliveryLocationDto.getRequiresAdditions();
            if (requiresAdditions != null) {
                z = requiresAdditions.booleanValue();
            } else {
                z = false;
            }
            return new ClientDeliveryLocationEntity(id, invoke, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/deliverylocation/CoordinatesDto;", "dto", "Lcom/dodopizza/persistence/entity/deliverylocation/CoordinatesEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/deliverylocation/CoordinatesDto;)Lcom/dodopizza/persistence/entity/deliverylocation/CoordinatesEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$h */
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function1<CoordinatesDto, CoordinatesEntity> {
        public static final h a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CoordinatesEntity invoke(CoordinatesDto coordinatesDto) {
            z65.h(coordinatesDto, "dto");
            return new CoordinatesEntity(coordinatesDto.getLat(), coordinatesDto.getLon());
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;", "dto", "Lcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;)Lcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$i */
    /* loaded from: classes4.dex */
    static final class i extends ej5 implements Function1<DeliveryAddressDto, DeliveryAddressEntity> {
        public static final i a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DeliveryAddressEntity invoke(DeliveryAddressDto deliveryAddressDto) {
            z65.h(deliveryAddressDto, "dto");
            return new DeliveryAddressEntity(deliveryAddressDto.getId(), deliveryAddressDto.getStreetId(), deliveryAddressDto.getStreetName(), deliveryAddressDto.getHouseNumber(), deliveryAddressDto.getApartment(), deliveryAddressDto.getEntrance(), deliveryAddressDto.getFloor(), deliveryAddressDto.getIntercom(), deliveryAddressDto.getComment(), deliveryAddressDto.getAddressAlias());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/deliverylocation/DeliveryLocationDto;", "dto", "Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/deliverylocation/DeliveryLocationDto;)Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$j */
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<DeliveryLocationDto, DeliveryLocationEntity> {
        public static final j a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DeliveryLocationEntity invoke(DeliveryLocationDto deliveryLocationDto) {
            k0<AddressAdditionEntity> k0Var;
            z65.h(deliveryLocationDto, "dto");
            String formattedAddress = deliveryLocationDto.getFormattedAddress();
            Map<String, String> additions = deliveryLocationDto.getAdditions();
            if (additions != null) {
                k0Var = fva.a().invoke(additions);
            } else {
                k0Var = null;
            }
            return new DeliveryLocationEntity(formattedAddress, (k0) mh5.c(k0Var, new k0()), fva.g().invoke(deliveryLocationDto.getCoordinates()), deliveryLocationDto.getEncodedComponents());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/EncryptionDataDto;", "encryptionDataDto", "Lcom/dodopizza/persistence/entity/cart/EncryptionDataEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/payment/EncryptionDataDto;)Lcom/dodopizza/persistence/entity/cart/EncryptionDataEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$k */
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function1<EncryptionDataDto, EncryptionDataEntity> {
        public static final k a = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EncryptionDataEntity invoke(EncryptionDataDto encryptionDataDto) {
            z65.h(encryptionDataDto, "encryptionDataDto");
            return new EncryptionDataEntity(encryptionDataDto.getTimestamp(), encryptionDataDto.getUuid(), encryptionDataDto.getMdorder(), encryptionDataDto.getPublicKey(), encryptionDataDto.getApiKey(), encryptionDataDto.getProjectId(), encryptionDataDto.getClientId(), encryptionDataDto.getTokenizationHost());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/EncryptionDataEntity;", "encryptionDataEntity", "Loh3;", "a", "(Lcom/dodopizza/persistence/entity/cart/EncryptionDataEntity;)Loh3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$l */
    /* loaded from: classes4.dex */
    public static final class l extends ej5 implements Function1<EncryptionDataEntity, oh3> {
        public static final l a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final oh3 invoke(EncryptionDataEntity encryptionDataEntity) {
            z65.h(encryptionDataEntity, "encryptionDataEntity");
            return new oh3(encryptionDataEntity.getTimestamp(), encryptionDataEntity.getUuid(), encryptionDataEntity.getMdorder(), encryptionDataEntity.getPublicKey(), encryptionDataEntity.getApiKey(), encryptionDataEntity.getProjectId(), encryptionDataEntity.getClientId(), encryptionDataEntity.getTokenizationHost());
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/ErrorDto;", "errorDto", "Lcom/dodopizza/persistence/entity/StateErrorEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/ErrorDto;)Lcom/dodopizza/persistence/entity/StateErrorEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$m */
    /* loaded from: classes4.dex */
    static final class m extends ej5 implements Function1<ErrorDto, StateErrorEntity> {
        public static final m a = new m();

        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final StateErrorEntity invoke(ErrorDto errorDto) {
            z65.h(errorDto, "errorDto");
            return new StateErrorEntity(Integer.valueOf(errorDto.getErrorCode()), errorDto.getDescription());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayInitDataDto;", "dto", "Lcom/dodopizza/persistence/entity/payment/GooglePayInitDataEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayInitDataDto;)Lcom/dodopizza/persistence/entity/payment/GooglePayInitDataEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$n */
    /* loaded from: classes4.dex */
    public static final class n extends ej5 implements Function1<GooglePayInitDataDto, GooglePayInitDataEntity> {
        public static final n a = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final GooglePayInitDataEntity invoke(GooglePayInitDataDto googlePayInitDataDto) {
            z65.h(googlePayInitDataDto, "dto");
            PaymentOptionsDto paymentOptions = googlePayInitDataDto.getPaymentOptions();
            return new GooglePayInitDataEntity((paymentOptions == null || (r1 = paymentOptions.getEnvironment()) == null) ? "" : "", googlePayInitDataDto.isReadyToPayRequest());
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/PaymentDataDto;", "paymentDataDto", "Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/payment/PaymentDataDto;)Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$o */
    /* loaded from: classes4.dex */
    static final class o extends ej5 implements Function1<PaymentDataDto, DataPaymentEntity> {
        public static final o a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DataPaymentEntity invoke(PaymentDataDto paymentDataDto) {
            String str;
            CardEntity cardEntity;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            EncryptionDataEntity encryptionDataEntity;
            String str7;
            z65.h(paymentDataDto, "paymentDataDto");
            String paymentId = paymentDataDto.getPaymentId();
            if (paymentId == null) {
                str = "";
            } else {
                str = paymentId;
            }
            int paymentType = paymentDataDto.getPaymentType();
            int paymentMethodType = paymentDataDto.getPaymentMethodType();
            CardDto card = paymentDataDto.getCard();
            if (card != null) {
                cardEntity = fva.d().invoke(card);
            } else {
                cardEntity = null;
            }
            Double clientNotes = paymentDataDto.getClientNotes();
            String redirectUrl = paymentDataDto.getRedirectUrl();
            if (redirectUrl == null) {
                str2 = "";
            } else {
                str2 = redirectUrl;
            }
            String successUrl = paymentDataDto.getSuccessUrl();
            if (successUrl == null) {
                str3 = "";
            } else {
                str3 = successUrl;
            }
            String failureUrl = paymentDataDto.getFailureUrl();
            if (failureUrl == null) {
                str4 = "";
            } else {
                str4 = failureUrl;
            }
            int invoiceExpirationInMinutes = paymentDataDto.getInvoiceExpirationInMinutes();
            String authorizeUrl = paymentDataDto.getAuthorizeUrl();
            if (authorizeUrl == null) {
                str5 = "";
            } else {
                str5 = authorizeUrl;
            }
            String acquirerName = paymentDataDto.getAcquirerName();
            if (acquirerName == null) {
                str6 = "";
            } else {
                str6 = acquirerName;
            }
            String pizzeriaPaymentKey = paymentDataDto.getPizzeriaPaymentKey();
            Map<String, String> providerData = paymentDataDto.getProviderData();
            EncryptionDataDto encryptionDataDto = paymentDataDto.getEncryptionDataDto();
            if (encryptionDataDto != null) {
                encryptionDataEntity = fva.j().invoke(encryptionDataDto);
            } else {
                encryptionDataEntity = null;
            }
            GooglePayPaymentDataDto googlePayPaymentData = paymentDataDto.getGooglePayPaymentData();
            if (googlePayPaymentData != null) {
                str7 = googlePayPaymentData.getPaymentRequest();
            } else {
                str7 = null;
            }
            return new DataPaymentEntity(str, paymentType, paymentMethodType, clientNotes, cardEntity, str2, str3, str4, invoiceExpirationInMinutes, str5, str6, null, encryptionDataEntity, pizzeriaPaymentKey, providerData, str7, paymentDataDto.getIntegrationType(), 2048, null);
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/PaymentMethodDto;", "paymentMethodDto", "Lcom/dodopizza/persistence/entity/payment/PaymentMethodEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/payment/PaymentMethodDto;)Lcom/dodopizza/persistence/entity/payment/PaymentMethodEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$p */
    /* loaded from: classes4.dex */
    static final class p extends ej5 implements Function1<PaymentMethodDto, PaymentMethodEntity> {
        public static final p a = new p();

        p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PaymentMethodEntity invoke(PaymentMethodDto paymentMethodDto) {
            CardEntity cardEntity;
            GooglePayInitDataEntity googlePayInitDataEntity;
            z65.h(paymentMethodDto, "paymentMethodDto");
            String valueOf = String.valueOf(paymentMethodDto.hashCode());
            int paymentType = paymentMethodDto.getPaymentType();
            String acquirerName = paymentMethodDto.getAcquirerName();
            String brandName = paymentMethodDto.getBrandName();
            String integrationType = paymentMethodDto.getIntegrationType();
            int priority = paymentMethodDto.getPriority();
            CardDto card = paymentMethodDto.getCard();
            if (card != null) {
                cardEntity = fva.d().invoke(card);
            } else {
                cardEntity = null;
            }
            GooglePayInitDataDto googlePayInitData = paymentMethodDto.getGooglePayInitData();
            if (googlePayInitData != null) {
                googlePayInitDataEntity = fva.m().invoke(googlePayInitData);
            } else {
                googlePayInitDataEntity = null;
            }
            return new PaymentMethodEntity(valueOf, paymentType, acquirerName, brandName, integrationType, cardEntity, priority, googlePayInitDataEntity, false, 256, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/personalization/MenuPersonalPriceInfoDto;", "dto", "Lcom/dodopizza/persistence/entity/personalization/MenuPersonalPriceInfoEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/personalization/MenuPersonalPriceInfoDto;)Lcom/dodopizza/persistence/entity/personalization/MenuPersonalPriceInfoEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$q */
    /* loaded from: classes4.dex */
    public static final class q extends ej5 implements Function1<MenuPersonalPriceInfoDto, MenuPersonalPriceInfoEntity> {
        public static final q a = new q();

        q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final MenuPersonalPriceInfoEntity invoke(MenuPersonalPriceInfoDto menuPersonalPriceInfoDto) {
            z65.h(menuPersonalPriceInfoDto, "dto");
            return new MenuPersonalPriceInfoEntity(menuPersonalPriceInfoDto.getProductId(), menuPersonalPriceInfoDto.getRawPrice(), menuPersonalPriceInfoDto.getDiscountedPrice(), menuPersonalPriceInfoDto.getDiscountInPercent(), menuPersonalPriceInfoDto.getDiscountMode(), menuPersonalPriceInfoDto.getEndDateTimeUtc(), menuPersonalPriceInfoDto.getPriority(), menuPersonalPriceInfoDto.getMenuCategoryId());
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/personalization/PersonalizationDto;", "dto", "Lcom/dodopizza/persistence/entity/personalization/PersonalizationEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/personalization/PersonalizationDto;)Lcom/dodopizza/persistence/entity/personalization/PersonalizationEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$r */
    /* loaded from: classes4.dex */
    static final class r extends ej5 implements Function1<PersonalizationDto, PersonalizationEntity> {
        final /* synthetic */ Function1<String, Long> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(Function1<? super String, Long> function1) {
            super(1);
            this.a = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PersonalizationEntity invoke(PersonalizationDto personalizationDto) {
            PersonalCategoryEntity personalCategoryEntity;
            UpsellProductsEntity upsellProductsEntity;
            DynamicDeliveryEntity dynamicDeliveryEntity;
            z65.h(personalizationDto, "dto");
            k0 k0Var = new k0();
            Function1<MenuPersonalPriceInfoDto, MenuPersonalPriceInfoEntity> p = fva.p();
            for (Object obj : personalizationDto.getMenuPersonalPricesInfo()) {
                k0Var.add(p.invoke(obj));
            }
            PersonalCategoryDto personalCategory = personalizationDto.getPersonalCategory();
            if (personalCategory != null) {
                personalCategoryEntity = new PersonalCategoryEntity(personalCategory.getIndex(), personalCategory.getCategoryId(), personalCategory.getName());
            } else {
                personalCategoryEntity = null;
            }
            UpsellProducts upsellProducts = personalizationDto.getUpsellProducts();
            if (upsellProducts != null) {
                Map<String, String> additionalData = upsellProducts.getAdditionalData();
                if (additionalData == null) {
                    additionalData = g86.h();
                }
                upsellProductsEntity = new UpsellProductsEntity(UpsellProductsEntityKt.mapToRealList(additionalData));
            } else {
                upsellProductsEntity = null;
            }
            Double departmentMinDeliveryPrice = PersonalizationDtoKt.getDepartmentMinDeliveryPrice(personalizationDto);
            Double personalizedMinDeliveryPrice = PersonalizationDtoKt.getPersonalizedMinDeliveryPrice(personalizationDto);
            Map<String, String> minDeliveryPrice = personalizationDto.getMinDeliveryPrice();
            if (minDeliveryPrice == null) {
                minDeliveryPrice = g86.h();
            }
            DeliveryExperimentEntity deliveryExperimentEntity = new DeliveryExperimentEntity(departmentMinDeliveryPrice, personalizedMinDeliveryPrice, UpsellProductsEntityKt.mapToRealList(minDeliveryPrice));
            Function1<String, Long> function1 = this.a;
            String minDeliveryPriceExpiresAtUtc = personalizationDto.getMinDeliveryPriceExpiresAtUtc();
            if (minDeliveryPriceExpiresAtUtc == null) {
                minDeliveryPriceExpiresAtUtc = "";
            }
            long longValue = function1.invoke(minDeliveryPriceExpiresAtUtc).longValue();
            DynamicDeliveryDto dynamicDelivery = personalizationDto.getDynamicDelivery();
            if (dynamicDelivery != null) {
                Map<String, String> additionalData2 = dynamicDelivery.getAdditionalData();
                if (additionalData2 == null) {
                    additionalData2 = g86.h();
                }
                dynamicDeliveryEntity = new DynamicDeliveryEntity(UpsellProductsEntityKt.mapToRealList(additionalData2));
            } else {
                dynamicDeliveryEntity = null;
            }
            return new PersonalizationEntity(k0Var, personalCategoryEntity, upsellProductsEntity, deliveryExperimentEntity, longValue, dynamicDeliveryEntity);
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/PriceDto;", "dto", "Lcom/dodopizza/persistence/entity/cart/PriceEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/cart/PriceDto;)Lcom/dodopizza/persistence/entity/cart/PriceEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$s */
    /* loaded from: classes4.dex */
    static final class s extends ej5 implements Function1<PriceDto, PriceEntity> {
        public static final s a = new s();

        s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PriceEntity invoke(PriceDto priceDto) {
            z65.h(priceDto, "dto");
            return new PriceEntity(priceDto.getTotal(), priceDto.getSubtotal(), priceDto.getRawPrice(), priceDto.getRawPriceWithoutGoods(), priceDto.getMinOrderPriceForDelivery(), priceDto.getSauces(), priceDto.getDodoRubles(), priceDto.getTotalDiscount(), priceDto.getDeliveryFee(), ((Number) mh5.c(priceDto.getLoyaltyRewardSum(), Double.valueOf(0.0d))).doubleValue());
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/PrizotekaDto;", "dto", "Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/PrizotekaDto;)Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$t */
    /* loaded from: classes4.dex */
    static final class t extends ej5 implements Function1<PrizotekaDto, PrizotekaEntity> {
        public static final t a = new t();

        t() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PrizotekaEntity invoke(PrizotekaDto prizotekaDto) {
            z65.h(prizotekaDto, "dto");
            String title = prizotekaDto.getTitle();
            String subtitle = prizotekaDto.getSubtitle();
            String legalDocumentUrl = prizotekaDto.getLegalDocumentUrl();
            k0 k0Var = new k0();
            Function1<PrizotekaLevelDto, PrizotekaLevelEntity> t = fva.t();
            for (Object obj : prizotekaDto.getLevels()) {
                k0Var.add(t.invoke(obj));
            }
            return new PrizotekaEntity(title, subtitle, legalDocumentUrl, k0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/PrizotekaLevelDto;", "dto", "Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaLevelEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/PrizotekaLevelDto;)Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaLevelEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$u */
    /* loaded from: classes4.dex */
    public static final class u extends ej5 implements Function1<PrizotekaLevelDto, PrizotekaLevelEntity> {
        public static final u a = new u();

        u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PrizotekaLevelEntity invoke(PrizotekaLevelDto prizotekaLevelDto) {
            z65.h(prizotekaLevelDto, "dto");
            return new PrizotekaLevelEntity(prizotekaLevelDto.getMinCartValue(), prizotekaLevelDto.getProgressDescription(), prizotekaLevelDto.getGiftDescription());
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PersonalPromoActionDto;", "dto", "Lcom/dodopizza/persistence/entity/cart/PersonalPromoActionEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PersonalPromoActionDto;)Lcom/dodopizza/persistence/entity/cart/PersonalPromoActionEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$v */
    /* loaded from: classes4.dex */
    static final class v extends ej5 implements Function1<PersonalPromoActionDto, PersonalPromoActionEntity> {
        public static final v a = new v();

        v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PersonalPromoActionEntity invoke(PersonalPromoActionDto personalPromoActionDto) {
            z65.h(personalPromoActionDto, "dto");
            return new PersonalPromoActionEntity(personalPromoActionDto.getId(), personalPromoActionDto.getStatus(), personalPromoActionDto.getDescription(), personalPromoActionDto.getTitle(), personalPromoActionDto.getErrorMessage());
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PromoCodeDto;", "dto", "Lcom/dodopizza/persistence/entity/cart/DataPromoCodeEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PromoCodeDto;)Lcom/dodopizza/persistence/entity/cart/DataPromoCodeEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$w */
    /* loaded from: classes4.dex */
    static final class w extends ej5 implements Function1<PromoCodeDto, DataPromoCodeEntity> {
        public static final w a = new w();

        w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DataPromoCodeEntity invoke(PromoCodeDto promoCodeDto) {
            AppliedInfoEntity appliedInfoEntity;
            BonusActionEntity bonusActionEntity;
            z65.h(promoCodeDto, "dto");
            String promoCode = promoCodeDto.getPromoCode();
            int status = promoCodeDto.getStatus();
            AppliedInfoDto appliedInfo = promoCodeDto.getAppliedInfo();
            if (appliedInfo != null) {
                appliedInfoEntity = fva.b().invoke(appliedInfo);
            } else {
                appliedInfoEntity = null;
            }
            BonusActionDto bonusAction = promoCodeDto.getBonusAction();
            if (bonusAction != null) {
                bonusActionEntity = fva.c().invoke(bonusAction);
            } else {
                bonusActionEntity = null;
            }
            return new DataPromoCodeEntity(promoCode, status, appliedInfoEntity, null, bonusActionEntity);
        }
    }

    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/UpsaleDto;", "dto", "Lcom/dodopizza/persistence/entity/cart/UpsaleEntity;", "a", "(Lru/dodopizza/backend/domain/state/dto/UpsaleDto;)Lcom/dodopizza/persistence/entity/cart/UpsaleEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$x */
    /* loaded from: classes4.dex */
    static final class x extends ej5 implements Function1<UpsaleDto, UpsaleEntity> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(boolean z) {
            super(1);
            this.a = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final UpsaleEntity invoke(UpsaleDto upsaleDto) {
            z65.h(upsaleDto, "dto");
            k0 k0Var = new k0();
            Function1<UpsaleProductDto, UpsaleProductEntity> D = fva.D(this.a);
            for (Object obj : upsaleDto.getProducts()) {
                k0Var.add(D.invoke(obj));
            }
            return new UpsaleEntity(k0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/UpsaleMeasureInfoDto;", "upsaleMeasureInfoDto", "Lcom/dodopizza/persistence/entity/cart/UpsaleMeasureInfoEntity;", "a", "(Lru/dodopizza/backend/domain/cart/dto/UpsaleMeasureInfoDto;)Lcom/dodopizza/persistence/entity/cart/UpsaleMeasureInfoEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$y */
    /* loaded from: classes4.dex */
    public static final class y extends ej5 implements Function1<UpsaleMeasureInfoDto, UpsaleMeasureInfoEntity> {
        public static final y a = new y();

        y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final UpsaleMeasureInfoEntity invoke(UpsaleMeasureInfoDto upsaleMeasureInfoDto) {
            z65.h(upsaleMeasureInfoDto, "upsaleMeasureInfoDto");
            return new UpsaleMeasureInfoEntity(upsaleMeasureInfoDto.getMeasure(), upsaleMeasureInfoDto.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: statedtotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/UpsaleMeasureInfoEntity;", "upsaleMeasureInfoEntity", "Lvsb;", "a", "(Lcom/dodopizza/persistence/entity/cart/UpsaleMeasureInfoEntity;)Lvsb;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fva$z */
    /* loaded from: classes4.dex */
    public static final class z extends ej5 implements Function1<UpsaleMeasureInfoEntity, vsb> {
        public static final z a = new z();

        z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vsb invoke(UpsaleMeasureInfoEntity upsaleMeasureInfoEntity) {
            z65.h(upsaleMeasureInfoEntity, "upsaleMeasureInfoEntity");
            return new vsb(upsaleMeasureInfoEntity.getMeasure(), upsaleMeasureInfoEntity.getValue());
        }
    }

    public static final Function1<UpsaleMeasureInfoDto, UpsaleMeasureInfoEntity> A() {
        return y.a;
    }

    public static final Function1<UpsaleMeasureInfoEntity, vsb> B() {
        return z.a;
    }

    public static final Function1<UpsaleProductEntity, zsb> C() {
        return a0.a;
    }

    public static final Function1<UpsaleProductDto, UpsaleProductEntity> D(boolean z2) {
        return new b0(z2);
    }

    public static final Function1<UpsaleSizeDetailsDto, UpsaleSizeDetailsEntity> E() {
        return c0.a;
    }

    public static final Function1<UpsaleSizeDetailsEntity, etb> F() {
        return d0.a;
    }

    public static final Function2<UpsaleEntity, UpsellProductsEntity, ksb> G() {
        return e0.a;
    }

    public static final Function1<WarningDto, StateWarningEntity> H() {
        return f0.a;
    }

    public static final Function1<Map<String, String>, k0<AddressAdditionEntity>> a() {
        return b.a;
    }

    public static final Function1<AppliedInfoDto, AppliedInfoEntity> b() {
        return c.a;
    }

    public static final Function1<BonusActionDto, BonusActionEntity> c() {
        return d.a;
    }

    public static final Function1<CardDto, CardEntity> d() {
        return e.a;
    }

    public static final Function1<ClientDeliveryFeeLevelDto, ClientDeliveryFeeLevelEntity> e() {
        return f.a;
    }

    public static final Function1<ClientDeliveryLocationDto, ClientDeliveryLocationEntity> f() {
        return g.a;
    }

    public static final Function1<CoordinatesDto, CoordinatesEntity> g() {
        return h.a;
    }

    public static final Function1<DeliveryAddressDto, DeliveryAddressEntity> h() {
        return i.a;
    }

    public static final Function1<DeliveryLocationDto, DeliveryLocationEntity> i() {
        return j.a;
    }

    public static final Function1<EncryptionDataDto, EncryptionDataEntity> j() {
        return k.a;
    }

    public static final Function1<EncryptionDataEntity, oh3> k() {
        return l.a;
    }

    public static final Function1<ErrorDto, StateErrorEntity> l() {
        return m.a;
    }

    public static final Function1<GooglePayInitDataDto, GooglePayInitDataEntity> m() {
        return n.a;
    }

    public static final Function1<PaymentDataDto, DataPaymentEntity> n() {
        return o.a;
    }

    public static final Function1<PaymentMethodDto, PaymentMethodEntity> o() {
        return p.a;
    }

    public static final Function1<MenuPersonalPriceInfoDto, MenuPersonalPriceInfoEntity> p() {
        return q.a;
    }

    public static final Function1<PersonalizationDto, PersonalizationEntity> q(Function1<? super String, Long> function1) {
        z65.h(function1, "timeConverter");
        return new r(function1);
    }

    public static final Function1<PriceDto, PriceEntity> r() {
        return s.a;
    }

    public static final Function1<PrizotekaDto, PrizotekaEntity> s() {
        return t.a;
    }

    public static final Function1<PrizotekaLevelDto, PrizotekaLevelEntity> t() {
        return u.a;
    }

    public static final Function1<PersonalPromoActionDto, PersonalPromoActionEntity> u() {
        return v.a;
    }

    public static final Function1<PromoCodeDto, DataPromoCodeEntity> v() {
        return w.a;
    }

    private static final oo7.a w(PackageInfoDto.WidgetDataDto widgetDataDto) {
        try {
            return new oo7.a(widgetDataDto.getTitle(), widgetDataDto.getDescription(), widgetDataDto.getSwitcherTitle(), widgetDataDto.getActionTitle(), widgetDataDto.getActionUrl());
        } catch (Exception unused) {
            return null;
        }
    }

    public static final oo7 x(PackageInfoDto packageInfoDto) {
        int w2;
        oo7.a aVar;
        z65.h(packageInfoDto, "<this>");
        try {
            xo7 y2 = y(packageInfoDto.getType());
            List<PackageTypeDto> availableTypes = packageInfoDto.getAvailableTypes();
            w2 = lc1.w(availableTypes, 10);
            ArrayList arrayList = new ArrayList(w2);
            for (PackageTypeDto packageTypeDto : availableTypes) {
                arrayList.add(y(packageTypeDto));
            }
            PackageInfoDto.WidgetDataDto widgetData = packageInfoDto.getWidgetData();
            if (widgetData != null) {
                aVar = w(widgetData);
            } else {
                aVar = null;
            }
            return new oo7(y2, arrayList, aVar);
        } catch (Exception unused) {
            return null;
        }
    }

    private static final xo7 y(PackageTypeDto packageTypeDto) {
        int i2;
        if (packageTypeDto == null) {
            i2 = -1;
        } else {
            i2 = a.$EnumSwitchMapping$0[packageTypeDto.ordinal()];
        }
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return xo7.b;
                }
                throw new NoWhenBranchMatchedException();
            }
            return xo7.a;
        }
        return xo7.c;
    }

    public static final Function1<UpsaleDto, UpsaleEntity> z(boolean z2) {
        return new x(z2);
    }
}
