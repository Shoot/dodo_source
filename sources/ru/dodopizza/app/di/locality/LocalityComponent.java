package ru.dodopizza.app.di.locality;

import com.dodopizza.activeorder.feature.activeorderwidget.ActiveOrderFoodMenuFeatureDependencies;
import com.dodopizza.activeorder.feature.orderdetails.OrderDetailsFeatureDependencies;
import com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies;
import com.dodopizza.auth.features.legaldocuments.LegalDocumentsFeatureDependencies;
import com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies;
import com.dodopizza.contacts.feature.feedback.FeedbackFeatureDependencies;
import com.dodopizza.controlling.feature.feedbackbuttons.FeedbackButtonsFeatureDependencies;
import com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies;
import com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies;
import com.dodopizza.controlling.feature.rateapp.RateAppFeatureDependencies;
import com.dodopizza.controlling.feature.ratingapplied.RatingAppliedFeatureDependencies;
import com.dodopizza.controlling.feature.ratingcomment.RatingCommentFeatureDependencies;
import com.dodopizza.controlling.feature.rndigitalcard.RnDigitalCardFeatureDependencies;
import com.dodopizza.geo.domain.OnDeliveryLocationSelectedDependencies;
import com.dodopizza.loyalty.menu.di.LoyaltyDependencies;
import com.dodopizza.loyalty.missions.di.LoyaltyMissionDetailsDependencies;
import com.dodopizza.loyalty.products.di.LoyaltyProductsDependencies;
import com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies;
import com.dodopizza.loyalty.stacksgame.di.StackGameDependencies;
import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.halves.HalvesFeatureDependencies;
import com.dodopizza.order.feature.personaldelivery.DynamicDeliveryFeatureDependencies;
import com.dodopizza.order.feature.personaloffer.PersonalOffersFeatureDependencies;
import com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies;
import com.dodopizza.order.feature.product.card.presentation.removeingredient.RemoveIngredientsFeatureDependencies;
import com.dodopizza.order.feature.promoaction.SpecialOfferDialogFeatureDependency;
import com.dodopizza.order.feature.promocode.PromoCodeFeatureDependencies;
import com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies;
import com.dodopizza.order.feature.upsell.UpsaleFeatureDependencies;
import com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies;
import com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies;
import defpackage.ap0;
import defpackage.di3;
import defpackage.e68;
import defpackage.gt0;
import defpackage.ht7;
import defpackage.ji1;
import defpackage.m38;
import defpackage.mx2;
import defpackage.ni0;
import defpackage.o8;
import defpackage.q6a;
import defpackage.y7;
import defpackage.z46;
import defpackage.zg1;
import kotlin.Metadata;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies;
import ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies;
import ru.dodopizza.app.di.modules.presentation.product.card.halves.HalvesProductCardFeatureDependencies;
import ru.dodopizza.app.di.modules.presentation.product.card.snack.SnackProductCardFeatureDependencies;
import ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies;
import ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies;
/* compiled from: LocalityComponent.kt */
@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u00192\u00020\u001a2\u00020\u001b2\u00020\u001c2\u00020\u001d2\u00020\u001e2\u00020\u001f2\u00020 2\u00020!2\u00020\"2\u00020#2\u00020$2\u00020%2\u00020&2\u00020'2\u00020(:\u0001QJ\b\u0010*\u001a\u00020)H&J\b\u0010,\u001a\u00020+H&J\b\u0010.\u001a\u00020-H&J\b\u00100\u001a\u00020/H&J\b\u00102\u001a\u000201H&J\b\u00104\u001a\u000203H&J\b\u00106\u001a\u000205H&J\b\u00108\u001a\u000207H&J\b\u0010:\u001a\u000209H&J\b\u0010<\u001a\u00020;H&J\b\u0010>\u001a\u00020=H&J\b\u0010@\u001a\u00020?H&J\b\u0010B\u001a\u00020AH&J\b\u0010D\u001a\u00020CH&J\b\u0010F\u001a\u00020EH&J\b\u0010H\u001a\u00020GH&J\b\u0010J\u001a\u00020IH&J\b\u0010L\u001a\u00020KH&J\b\u0010N\u001a\u00020MH&J\b\u0010P\u001a\u00020OH&¨\u0006R"}, d2 = {"Lru/dodopizza/app/di/locality/LocalityComponent;", "Luw9;", "Lhv5;", "Ljm1;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/ActiveOrderFoodMenuFeatureDependencies;", "Lcom/dodopizza/order/feature/assistant/AssistantFeatureDependencies;", "Lcom/dodopizza/auth/features/legaldocuments/LegalDocumentsFeatureDependencies;", "Lcom/dodopizza/chat/feature/chat/NativeChatFeatureDependencies;", "Lcom/dodopizza/controlling/feature/ordercompleted/OrderCompletedFeatureDependencies;", "Lcom/dodopizza/activeorder/feature/orderdetails/OrderDetailsFeatureDependencies;", "Lcom/dodopizza/activeorder/feature/ordersummary/OrderSummaryFeatureDependencies;", "Lcom/dodopizza/controlling/feature/feedbackbuttons/FeedbackButtonsFeatureDependencies;", "Lcom/dodopizza/orderhistory/feature/orderhistory/OrderHistoryFeatureDependencies;", "Lcom/dodopizza/controlling/feature/orderrating/OrderRatingFeatureDependencies;", "Lcom/dodopizza/controlling/feature/rateapp/RateAppFeatureDependencies;", "Lcom/dodopizza/controlling/feature/ratingcomment/RatingCommentFeatureDependencies;", "Lcom/dodopizza/controlling/feature/rndigitalcard/RnDigitalCardFeatureDependencies;", "Lru/dodopizza/app/di/modules/presentation/checkout/CheckoutComponentFeatureDependencies;", "Lcom/dodopizza/order/feature/personaloffer/PersonalOffersFeatureDependencies;", "Lcom/dodopizza/controlling/feature/ratingapplied/RatingAppliedFeatureDependencies;", "Lru/dodopizza/app/di/modules/presentation/product/card/combo/ComboProductCardFeatureDependencies;", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/PizzaProductCardFeatureDependencies;", "Lru/dodopizza/app/di/modules/presentation/product/card/halves/HalvesProductCardFeatureDependencies;", "Lru/dodopizza/app/di/modules/presentation/product/card/snack/SnackProductCardFeatureDependencies;", "Lru/dodopizza/app/di/modules/presentation/product/card/variable/VariableProductCardFeatureDependencies;", "Lcom/dodopizza/order/feature/shoppingcart/ShoppingCartFeatureDependencies;", "Lru/dodopizza/app/di/modules/presentation/profile/ProfileFeatureDependencies;", "Lcom/dodopizza/geo/domain/OnDeliveryLocationSelectedDependencies;", "Lcom/dodopizza/order/feature/product/card/presentation/removeingredient/RemoveIngredientsFeatureDependencies;", "Lcom/dodopizza/order/feature/promocode/PromoCodeFeatureDependencies;", "Lcom/dodopizza/loyalty/referralsystem/di/ReferralSystemFeatureDependencies;", "Lcom/dodopizza/loyalty/menu/di/LoyaltyDependencies;", "Lcom/dodopizza/loyalty/products/di/LoyaltyProductsDependencies;", "Lcom/dodopizza/loyalty/missions/di/LoyaltyMissionDetailsDependencies;", "Lcom/dodopizza/loyalty/stacksgame/di/StackGameDependencies;", "Lcom/dodopizza/profile/feature/profilesettings/ProfileSettingsDependencies;", "Lcom/dodopizza/contacts/feature/feedback/FeedbackFeatureDependencies;", "Lcom/dodopizza/order/feature/upsell/UpsaleFeatureDependencies;", "Lcom/dodopizza/order/feature/halves/HalvesFeatureDependencies;", "Lcom/dodopizza/order/feature/promoaction/SpecialOfferDialogFeatureDependency;", "Lcom/dodopizza/order/feature/personaldelivery/DynamicDeliveryFeatureDependencies;", "Lx34;", "i3", "Lht7$a;", "Y3", "Lvw7;", "Z2", "Lm38$a;", "O1", "Le68$a;", "u1", "Lzg1$a;", "q1", "Lgt0$a;", "a3", "Ly7$a;", "R3", "Lap0$a;", "v2", "Ldi3$a;", "W1", "Lo8$a;", "E3", "Lzk7;", "N1", "Lz46$a;", "k4", "Lks1;", "o3", "La02;", "o1", "Lcy9;", "l1", "Lmx2$a;", "g3", "Lq6a$a;", "I1", "Lni0$a;", "l2", "Lji1$a;", "G3", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface LocalityComponent extends uw9<hv5>, jm1, ActiveOrderFoodMenuFeatureDependencies, AssistantFeatureDependencies, LegalDocumentsFeatureDependencies, NativeChatFeatureDependencies, OrderCompletedFeatureDependencies, OrderDetailsFeatureDependencies, OrderSummaryFeatureDependencies, FeedbackButtonsFeatureDependencies, OrderHistoryFeatureDependencies, OrderRatingFeatureDependencies, RateAppFeatureDependencies, RatingCommentFeatureDependencies, RnDigitalCardFeatureDependencies, CheckoutComponentFeatureDependencies, PersonalOffersFeatureDependencies, RatingAppliedFeatureDependencies, ComboProductCardFeatureDependencies, PizzaProductCardFeatureDependencies, HalvesProductCardFeatureDependencies, SnackProductCardFeatureDependencies, VariableProductCardFeatureDependencies, ShoppingCartFeatureDependencies, ProfileFeatureDependencies, OnDeliveryLocationSelectedDependencies, RemoveIngredientsFeatureDependencies, PromoCodeFeatureDependencies, ReferralSystemFeatureDependencies, LoyaltyDependencies, LoyaltyProductsDependencies, LoyaltyMissionDetailsDependencies, StackGameDependencies, ProfileSettingsDependencies, FeedbackFeatureDependencies, UpsaleFeatureDependencies, HalvesFeatureDependencies, SpecialOfferDialogFeatureDependency, DynamicDeliveryFeatureDependencies {

    /* compiled from: LocalityComponent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/di/locality/LocalityComponent$a;", "", "Lqx1;", "lifecycleScope", "b", "Lru/dodopizza/app/di/locality/LocalityComponent;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface a {
        LocalityComponent a();

        a b(qx1 qx1Var);
    }

    o8.a E3();

    ji1.a G3();

    q6a.a I1();

    zk7 N1();

    m38.a O1();

    y7.a R3();

    di3.a W1();

    ht7.a Y3();

    vw7 Z2();

    gt0.a a3();

    mx2.a g3();

    x34 i3();

    z46.a k4();

    cy9 l1();

    ni0.a l2();

    a02 o1();

    ks1 o3();

    zg1.a q1();

    e68.a u1();

    ap0.a v2();
}
