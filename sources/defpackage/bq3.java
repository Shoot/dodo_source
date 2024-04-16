package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeatureCode.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0003\b\u009e\u0001\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0019\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0005j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001¨\u0006¦\u0001"}, d2 = {"Lbq3;", "", "Lcq3;", "a", "Lcq3;", "i", "()Lcq3;", "featureCodeType", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcq3;)V", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "j", "k", "l", Image.TYPE_MEDIUM, "n", "o", "p", "q", "r", Image.TYPE_SMALL, "t", "u", "v", "w", "x", "y", "z", "A", "B", "I", "X", "Y", "Z", "S4", "T4", "U4", "V4", "W4", "X4", "Y4", "Z4", "a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5", "i5", "j5", "k5", "l5", "m5", "n5", "o5", "p5", "q5", "r5", "s5", "t5", "u5", "v5", "w5", "x5", "y5", "z5", "A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5", "I5", "J5", "K5", "L5", "M5", "N5", "O5", "P5", "Q5", "R5", "S5", "T5", "U5", "V5", "W5", "X5", "Y5", "Z5", "a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6", "i6", "j6", "k6", "l6", "m6", "n6", "o6", "p6", "q6", "r6", "s6", "t6", "u6", "v6", "w6", "x6", "y6", "z6", "A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6", "I6", "J6", "K6", "L6", "M6", "N6", "O6", "P6", "Q6", "R6", "S6", "T6", "U6", "V6", "W6", "X6", "Y6", "Z6", "a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bq3  reason: default package */
/* loaded from: classes4.dex */
public final class bq3 {
    public static final bq3 A;
    public static final bq3 A5;
    public static final bq3 A6;
    public static final bq3 B;
    public static final bq3 B5;
    public static final bq3 B6;
    public static final bq3 C5;
    public static final bq3 C6;
    public static final bq3 D5;
    public static final bq3 D6;
    public static final bq3 E5;
    public static final bq3 E6;
    public static final bq3 F5;
    public static final bq3 F6;
    public static final bq3 G5;
    public static final bq3 G6;
    public static final bq3 H5;
    public static final bq3 H6;
    public static final bq3 I;
    public static final bq3 I5;
    public static final bq3 I6;
    public static final bq3 J5;
    public static final bq3 J6;
    public static final bq3 K5;
    public static final bq3 K6;
    public static final bq3 L5;
    public static final bq3 L6;
    public static final bq3 M5;
    public static final bq3 M6;
    public static final bq3 N5;
    public static final bq3 N6;
    public static final bq3 O5;
    public static final bq3 O6;
    public static final bq3 P5;
    public static final bq3 P6;
    public static final bq3 Q5;
    public static final bq3 Q6;
    public static final bq3 R5;
    public static final bq3 R6;
    public static final bq3 S4;
    public static final bq3 S5;
    public static final bq3 S6;
    public static final bq3 T4;
    public static final bq3 T5;
    public static final bq3 T6;
    public static final bq3 U4;
    public static final bq3 U5;
    public static final bq3 U6;
    public static final bq3 V4;
    public static final bq3 V5;
    public static final bq3 V6;
    public static final bq3 W4;
    public static final bq3 W5;
    public static final bq3 W6;
    public static final bq3 X;
    public static final bq3 X4;
    public static final bq3 X5;
    public static final bq3 X6;
    public static final bq3 Y;
    public static final bq3 Y4;
    public static final bq3 Y5;
    public static final bq3 Y6;
    public static final bq3 Z;
    public static final bq3 Z4;
    public static final bq3 Z5;
    public static final bq3 Z6;
    public static final bq3 a5;
    public static final bq3 a6;
    public static final bq3 a7;
    public static final bq3 b5;
    public static final bq3 b6;
    public static final bq3 b7;
    public static final a c;
    public static final bq3 c5;
    public static final bq3 c6;
    public static final bq3 c7;
    public static final bq3 d;
    public static final bq3 d5;
    public static final bq3 d6;
    public static final bq3 d7;
    public static final bq3 e;
    public static final bq3 e5;
    public static final bq3 e6;
    public static final bq3 e7;
    public static final bq3 f;
    public static final bq3 f5;
    public static final bq3 f6;
    public static final bq3 f7;
    public static final bq3 g;
    public static final bq3 g5;
    public static final bq3 g6;
    public static final bq3 g7;
    public static final bq3 h;
    public static final bq3 h5;
    public static final bq3 h6;
    public static final bq3 h7;
    public static final bq3 i;
    public static final bq3 i5;
    public static final bq3 i6;
    private static final /* synthetic */ bq3[] i7;
    public static final bq3 j;
    public static final bq3 j5;
    public static final bq3 j6;
    private static final /* synthetic */ kj3 j7;
    public static final bq3 k;
    public static final bq3 k5;
    public static final bq3 k6;
    public static final bq3 l;
    public static final bq3 l5;
    public static final bq3 l6;
    public static final bq3 m;
    public static final bq3 m5;
    public static final bq3 m6;
    public static final bq3 n;
    public static final bq3 n5;
    public static final bq3 n6;
    public static final bq3 o;
    public static final bq3 o5;
    public static final bq3 o6;
    public static final bq3 p;
    public static final bq3 p5;
    public static final bq3 p6;
    public static final bq3 q;
    public static final bq3 q5;
    public static final bq3 q6;
    public static final bq3 r;
    public static final bq3 r5;
    public static final bq3 r6;
    public static final bq3 s;
    public static final bq3 s5;
    public static final bq3 s6;
    public static final bq3 t;
    public static final bq3 t5;
    public static final bq3 t6;
    public static final bq3 u;
    public static final bq3 u5;
    public static final bq3 u6;
    public static final bq3 v;
    public static final bq3 v5;
    public static final bq3 v6;
    public static final bq3 w;
    public static final bq3 w5;
    public static final bq3 w6;
    public static final bq3 x;
    public static final bq3 x5;
    public static final bq3 x6;
    public static final bq3 y;
    public static final bq3 y5;
    public static final bq3 y6;
    public static final bq3 z;
    public static final bq3 z5;
    public static final bq3 z6;
    private final cq3 a;
    private final String b;

    /* compiled from: FeatureCode.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lbq3$a;", "", "", "code", "Lbq3;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bq3$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bq3 a(String str) {
            bq3[] values;
            z65.h(str, "code");
            for (bq3 bq3Var : bq3.values()) {
                if (z65.c(bq3Var.getValue(), str)) {
                    return bq3Var;
                }
            }
            return null;
        }
    }

    static {
        cq3 cq3Var = cq3.b;
        d = new bq3("CASH_CHANGE_CAN_BE_FLOAT", 0, "CashChangeCanBeFloat", cq3Var);
        e = new bq3("CHANGE_CASH", 1, "ChangeCash", cq3Var);
        f = new bq3("DEFERRED_TIME_FIRST_PART_ONLY", 2, "DeferredTimeFirstPartOnlyAndroid", cq3Var);
        g = new bq3("GUARANTEED_DELIVERY", 3, "GuaranteedDelivery", cq3Var);
        h = new bq3("NATIVE_CHAT", 4, "NativeChatAndroidV3", cq3Var);
        i = new bq3("ORDER_RATING_COURIER_TIPS", 5, "OrderRatingCourierTips", cq3Var);
        j = new bq3("REST_ORDER_RECEIPT", 6, "RestOrderReceiptAndroid", cq3Var);
        k = new bq3("FAVORITE_PRODUCTS", 7, "FavoriteProductsAndroid", cq3Var);
        l = new bq3("ROMAN_PIZZA_UI_ANDROID", 8, "RomanPizzaUIAndroid", cq3Var);
        m = new bq3("DEFERRED_TIME_INTERVALS_FROM_SERVER", 9, "DeferredTimeIntervalsFromServer", cq3Var);
        n = new bq3("DEFERRED_TIME_BLOCKED_SLOTS", 10, "DeferredTimeBlockedSlotsAndroid", cq3Var);
        o = new bq3("COVID_WARNING", 11, "CovidWarningAndroid", cq3Var);
        p = new bq3("USE_TAX_PAYER_ID_AT_CHECKOUT", 12, "UseNIPAtCheckoutAndroid", cq3Var);
        q = new bq3("SHORT_STREET_NAME", 13, "ShortStreetNameAndroidV2", cq3Var);
        r = new bq3("HIDE_OSM_FOR_SELECT_PIZZERIA", 14, "HideOsmForSelectPizzeriaAndroid", cq3Var);
        s = new bq3("STORIES", 15, "StoriesAndroidV2", cq3Var);
        t = new bq3("BONUS_ACTION_BANNERS", 16, "BonusActionBannersAndroid", cq3Var);
        u = new bq3("LOYALTY_PROGRAM", 17, "LoyaltyProgramAndroidV2", cq3Var);
        v = new bq3("LOYALTY_PROGRAM_HINT_AT_CART_UAE", 18, "LoyaltyProgramHintAtCartUAEAndroid", cq3Var);
        w = new bq3("MENU_SEARCH", 19, "MenuSearchAndroid", cq3Var);
        x = new bq3("ORDER_COMPLETED_DISPLAY_COURIER_TIPS", 20, "OrderCompletedDisplayCourierTipsAndroid", cq3Var);
        y = new bq3("ORDER_RATING_AUTO_SUBMIT", 21, "OrderRatingAutoSubmitAndroid", cq3Var);
        z = new bq3("ORDER_RATING_BINARY_FEEDBACK", 22, "OrderRatingBinaryFeedbackAndroidV2", cq3Var);
        A = new bq3("ORDER_RATING_CONTACT_ME_SWITCH", 23, "OrderRatingContactMeSwitchAndroid", cq3Var);
        B = new bq3("ORDER_RATING_IMPLICIT_CONTACT_ME_SWITCH", 24, "OrderRatingImplicitContactMeSwitchAndroid", cq3Var);
        I = new bq3("PHONE_NUMBER_HINT", 25, "PhoneNumberHint", cq3Var);
        X = new bq3("USE_DELIVERY_LOCATION", 26, "UseDeliveryLocationAndroid", cq3Var);
        Y = new bq3("USE_GEO_FLOW", 27, "UseGeoFlowAndroid", cq3Var);
        Z = new bq3("IN_APP_NOTIFICATION", 28, "InAppNotificationsAndroid", cq3Var);
        S4 = new bq3("IN_APP_NOTIFICATION_ANIMATED_IMAGE", 29, "InAppNotificationsAnimatedImageAndroid", cq3Var);
        T4 = new bq3("ACTIVE_ORDER_ON_MAIN_SCREEN_WIDGET", 30, "ActiveOrderOnMainScreenAndroid", cq3Var);
        U4 = new bq3("PROFILE_MESSAGE_OF_THE_DAY", 31, "MessageOfTheDayAndroid", cq3Var);
        V4 = new bq3("ALLOW_DELAYED_PAYMENT_WITH_DEEPLINK", 32, "AllowDelayedPaymentWithDeeplinkAndroid", cq3Var);
        W4 = new bq3("DELIVERY_MAP_ANDROID", 33, "DeliveryMapAndroid", cq3Var);
        X4 = new bq3("DELIVERY_MAP_USER_LOCATION", 34, "DeliveryMapUserLocationAndroid", cq3Var);
        Y4 = new bq3("DELIVERY_MAP_MOVING_PIN_ANALYTICS", 35, "DeliveryMapMovingPinAnalyticsAndroid", cq3Var);
        Z4 = new bq3("DELIVERY_MAP_HIDE_SUBTITLE", 36, "DeliveryMapHideSubtitleAndroid", cq3Var);
        a5 = new bq3("DELIVERY_FEE", 37, "DeliveryFeeAndroid", cq3Var);
        b5 = new bq3("DYNAMIC_DELIVERY_FEE", 38, "DynamicDeliveryFeeAndroid", cq3Var);
        c5 = new bq3("EXTRA_DELIVERY_FEE_TOOLTIP", 39, "ExtraDeliveryFeeTooltipAndroid", cq3Var);
        d5 = new bq3("USE_DELIVERY_LOCATION_PROFILE", 40, "UseDeliveryLocationProfileAndroid", cq3Var);
        e5 = new bq3("LOYALTY_PROGRAM_MISSIONS", 41, "LoyaltyProgramMissionsAndroid", cq3Var);
        f5 = new bq3("ORDER_TYPE_AT_CHECKOUT", 42, "OrderTypeAtCheckoutAndroid", cq3Var);
        g5 = new bq3("OTHER_PRODUCTS_MINIMAL_SUM_BASKET", 43, "OtherProductsMinimalSumBasketAndroid", cq3Var);
        h5 = new bq3("TURN_OFF_CARD_EXPIRATION_DATE_VALIDATION", 44, "TurnOffCardExpirationDateValidationAndroid", cq3Var);
        i5 = new bq3("INFO_STORIES", 45, "InfoStoriesAndroidV2", cq3Var);
        j5 = new bq3("NO_PAYMENT_METHODS_FLASHLIGHT", 46, "NoPaymentMethodsFlashlightAndroid", cq3Var);
        k5 = new bq3("MIN_DELIVERY_PRICE_IN_MENU", 47, "MinDeliveryPriceInMenuAndroid", cq3Var);
        l5 = new bq3("SBER_PAY_ALLOWED", 48, "SberPayAllowedAndroid", cq3Var);
        m5 = new bq3("KASPI_PAY_ALLOWED", 49, "KaspiPayAllowedAndroid", cq3Var);
        n5 = new bq3("MOMO_APP2APP_PAY_ALLOWED", 50, "MomoApp2AppPayAllowedAndroid", cq3Var);
        o5 = new bq3("MIN_DELIVERY_BUTTON_IN_CART", 51, "MinDeliveryButtonInCartAndroid", cq3Var);
        p5 = new bq3("INCLUDE_GOODS_IN_MIN_PRICE", 52, "IncludeGoodsInMinDeliveryPriceAndroid", cq3Var);
        q5 = new bq3("SHOW_VPN_WARNING_IN_CHECKOUT", 53, "ShowVPNWarningInCheckoutAndroid", cq3Var);
        r5 = new bq3("CROSSED_OUT_COMBO_PRICES", 54, "CrossedOutComboPricesAndroid", cq3Var);
        s5 = new bq3("SELECT_ORDER_TYPE_ON_START", 55, "SelectOrderTypeOnStartAndroid", cq3Var);
        t5 = new bq3("REDESIGN_DEFERRED_TIME", 56, "RedesignDeferredTimeAndroid", cq3Var);
        u5 = new bq3("PROFILE_SUBSCRIPTION", 57, "ProfileSubscriptionAndroid", cq3Var);
        v5 = new bq3("PERSONAL_PRICES", 58, "PersonalPricesAndroid", cq3Var);
        w5 = new bq3("CART_SCROLLABLE_BUTTON", 59, "CartScrollableButtonAndroid", cq3Var);
        x5 = new bq3("DEFERRED_TIME_NEXT_DAY_STUB", 60, "DeferredTimeNextDayStubAndroid", cq3Var);
        y5 = new bq3("PRODUCT_UPSELL", 61, "ProductUpsellAndroid", cq3Var);
        z5 = new bq3("SEND_UPSELL_SCROLLING_EVENT_ANDROID", 62, "SendUpsellScrollingEventAndroid", cq3Var);
        A5 = new bq3("ALL_COUNTRIES_FOR_SMS", 63, "AllCountriesForSms_Android", cq3Var);
        B5 = new bq3("LOYALTY_HISTORY", 64, "LoyaltyHistoryAndroid", cq3Var);
        C5 = new bq3("PERSONAL_PRICES_PIZZA_AND_META", 65, "PersonalPricesPizzaAndVariableProductAndroid", cq3Var);
        D5 = new bq3("PERSONAL_OFFERS_IN_CART", 66, "PersonalOffersInCartAndroidV2", cq3Var);
        E5 = new bq3("MARKETING_CAMPAIGN_UI", 67, "MarketingCampaignUIAndroid", cq3Var);
        F5 = new bq3("HERO_PRODUCT", 68, "HeroProductsAndroid", cq3Var);
        G5 = new bq3("HERO_PRODUCTS_LOCAL_IDENTIFICATION", 69, "HeroProductsLocalIdentificationAndroid", cq3Var);
        H5 = new bq3("USE_DELIVERY_LOCATION_ADDITIONS_WITH_EDIT_MODE", 70, "UseDeliveryLocationAdditionsWithEditModeAndroid", cq3Var);
        I5 = new bq3("REMOVE_PROMO_ENDPOINT", 71, "RemovePromoEndpointAndroid", cq3Var);
        J5 = new bq3("DODOCOIN_BALANCE_IN_MENU_SUPPORTED", 72, "DodocoinBalanceInMenuAndroid", cq3Var);
        K5 = new bq3("DRINKS_TWO_COLUMN", 73, "DrinksTwoColumnAndroid", cq3Var);
        L5 = new bq3("BELARUS_LEGAL_INFO", 74, "BelarusLegalInfoAndroid", cq3Var);
        M5 = new bq3("DISTANCE_TO_DELIVERY_ADDRESS_VALIDATION", 75, "DistanceToDeliveryAddressValidationAndroid", cq3Var);
        N5 = new bq3("SHOW_SUPPORT_BUTTON_FOR_ANY_ORDER_STATE", 76, "ShowSupportButtonForAnyOrderStateAndroid", cq3Var);
        O5 = new bq3("PERSONAL_OFFERS_V2", 77, "PersonalPromoActionAndroidV2", cq3Var);
        P5 = new bq3("COMBO_CUSTOMIZE", 78, "ComboCustomizeAndroid", cq3Var);
        Q5 = new bq3("USE_ARABIC_PICTURES", 79, "UseArabicPicturesAndroid", cq3Var);
        R5 = new bq3("LOGIN_LEGAL_DOCUMENTS_SCREEN", 80, "LoginLegalDocumentsScreenAndroid", cq3Var);
        S5 = new bq3("USE_DELIVERY_LOCATION_EDIT_WITH_MAP_FROM_PROFILE", 81, "UseDeliveryLocationEditWithMapFromProfileAndroid", cq3Var);
        T5 = new bq3("DODO_COINS_EXPIRATION_INFO", 82, "DodocoinsExpirationInfoAndroid", cq3Var);
        U5 = new bq3("NICE_BONUS", 83, "NiceBonusAndroid", cq3Var);
        V5 = new bq3("EASY_BONUS", 84, "EasyBonusAndroid", cq3Var);
        W5 = new bq3("UPDATE_STATE_AFTER_PERSONAL_PRICE_EXPIRATION_IN_CART", 85, "UpdateStateAfterPersonalPriceExpirationInCartAndroid", cq3Var);
        X5 = new bq3("LOYALTY_COINS_EXPIRATION_DOT_IN_PROFILE", 86, "LoyaltyCoinsExpirationDotInProfileAndroid", cq3Var);
        Y5 = new bq3("GEO_SCREENS_IN_PROFILE", 87, "GeoScreensInProfileAndroid", cq3Var);
        Z5 = new bq3("GEO_SCREENS_IN_CHECKOUT", 88, "GeoScreensInCheckoutAndroid", cq3Var);
        a6 = new bq3("GEO_SCREENS_IN_MENU", 89, "GeoScreensInMenuAndroid", cq3Var);
        b6 = new bq3("GEO_SCREENS_SUGGESTIONS", 90, "GeoScreensSuggestionsAndroid", cq3Var);
        c6 = new bq3("GEO_SCREENS_IN_ONBOARDING", 91, "GeoScreensInOnboardingAndroid", cq3Var);
        d6 = new bq3("SELECT_PIZZERIA_COMBINED_VIEW", 92, "SelectPizzeriaCombinedViewAndroid", cq3Var);
        e6 = new bq3("NEW_MAP_ON_PIZZERIA_COMBINED_VIEW", 93, "NewMapOnPizzeriaCombinedViewAndroid", cq3Var);
        f6 = new bq3("OPEN_CATEGORY_SCROLL_EVENT", 94, "OpenCategoryScrollEventAndroid", cq3Var);
        g6 = new bq3("DYNAMIC_MINIMUM_DELIVERY_PRICE", 95, "DynamicMinimumDeliveryPriceAndroid", cq3Var);
        h6 = new bq3("MIN_DELIVERY_PRICE_UNIFIED_TEXT", 96, "MinimumDeliveryPriceUnifiedTextAndroid", cq3Var);
        i6 = new bq3("MENU_SUB_CATEGORIES", 97, "MenuSubCategoriesAndroid", cq3Var);
        j6 = new bq3("TRANSPARENT_IMAGE_URL", 98, "TransparentImageUrlAndroid", cq3Var);
        k6 = new bq3("REFERRAL_SYSTEM", 99, "ReferralSystemAndroidV3", cq3Var);
        l6 = new bq3("REFERRAL_BADGE_IN_PROFILE", 100, "ReferralBadgeInProfileAndroidV3", cq3Var);
        m6 = new bq3("REFERRAL_STATIC_QR_CODE", 101, "ReferralStaticQrCodeAndroidV3", cq3Var);
        n6 = new bq3("ENTER_CODE_WIDGET_IN_PROFILE", 102, "EnterCodeWidgetInProfileAndroidV2", cq3Var);
        o6 = new bq3("RETRY_NOTIFICATION_PERMISSION_REQUEST", 103, "RetryNotificationPermissionRequestAndroid", cq3Var);
        p6 = new bq3("DARK_MODE", 104, "DarkModeAndroid", cq3Var);
        q6 = new bq3("EDIT_DELIVERY_ADDRESS_MAP_FSM", 105, "EditDeliveryAddressMapFSM", cq3Var);
        r6 = new bq3("COURIER_ON_MAP", 106, "CourierOnMapAndroid", cq3Var);
        s6 = new bq3("DELIVERY_PROMO_ALWAYS_FREE", 107, "DeliveryPromoAlwaysFreeAndroid", cq3Var);
        t6 = new bq3("STACK_GAME", 108, "StackGameAndroidV3", cq3Var);
        u6 = new bq3("STACK_GAME_COUNTER", 109, "StackGameDodocoinsCounterAndroidV3", cq3Var);
        v6 = new bq3("SHOW_SECRET_PERSONAL_ACTION", 110, "ShowSecretPersonalActionAndroid", cq3Var);
        w6 = new bq3("NEW_MENU", 111, "NewMenuAndroidV6", cq3Var);
        x6 = new bq3("ACCOUNT_DELETION", 112, "AccountDeletionAndroid", cq3Var);
        y6 = new bq3("NEW_YEAR_BANNER", 113, "NewYearBanner", cq3Var);
        z6 = new bq3("ORDER_TRACKING_MAP_SNOW_ANIMATION", 114, "OrderTrackingMapSnowAnimationAndroid", cq3Var);
        A6 = new bq3("TRACK_INSTANT_APP_STATUS", 115, "TrackInstantAppStatusAndroid", cq3Var);
        B6 = new bq3("NEW_RESTAURANT_MAP_SELECTION", 116, "NewRestaurantMapSelectionAndroid", cq3Var);
        C6 = new bq3("KIOSK_ORDER_TRACKING_WEB_VIEW", 117, "KioskOrderTrackingWebViewAndroid", cq3Var);
        D6 = new bq3("BLOCK_STORE", 118, "BlockStoreAndroidV2", cq3Var);
        E6 = new bq3("USE_MIN_ORDER_PRICE_FOR_DELIVERY", 119, "UseMinOrderPriceForDeliveryAndroid", cq3Var);
        F6 = new bq3("PIZZERIAS_FLOW_WITHOUT_CITY_SELECTION", 120, "PizzeriasFlowWithoutCitySelectionAndroid", cq3Var);
        G6 = new bq3("INFINITE_UPSELL", 121, "InfiniteUpsellAndroid", cq3Var);
        H6 = new bq3("UPDATE_STATE_BY_MIN_DELIVERY_PRICE_TTL", 122, "UpdateStateByTtlAndroidV1", cq3Var);
        I6 = new bq3("ADDRESS_CATCHER", 123, "AddressCatcherAndroid", cq3Var);
        J6 = new bq3("SUPPORT_IN_PROFILE", 124, "SupportInProfileAndroid", cq3Var);
        K6 = new bq3("PIZZA_HALVES_INGREDIENTS", 125, "PizzaHalfIngredientsBottomSheetAndroid", cq3Var);
        L6 = new bq3("PIZZA_HALVES_PRODUCT_TAGS", 126, "PizzaHalvesProductTagsAndroid", cq3Var);
        M6 = new bq3("COMBINED_MAP_SELECTOR", 127, "CombinedMapSelectorAndroid", cq3Var);
        cq3 cq3Var2 = cq3.d;
        N6 = new bq3("ORDER_RATING_DO_NOT_CONTACT_ME", 128, "OrderRatingDoNotContactMe", cq3Var2);
        O6 = new bq3("ORDER_RATING_CONTACT_ME_VIA_CHAT", 129, "OrderRatingContactMeViaChat", cq3Var2);
        P6 = new bq3("ORDER_RATING_USE_BINARY_FEEDBACK", 130, "OrderRatingUseBinaryFeedback", cq3Var2);
        Q6 = new bq3("SELECT_ORDER_TYPE_ON_START_ENABLED", 131, "SelectOrderTypeOnStartEnabled", cq3Var2);
        R6 = new bq3("REDESIGN_DEFERRED_TIME_ENABLED", 132, "RedesignDeferredTimeEnabled", cq3Var2);
        S6 = new bq3("CART_SCROLLABLE_BUTTON_ENABLED", 133, "CartScrollableButtonEnabled", cq3Var2);
        T6 = new bq3("DODOCOIN_BALANCE_IN_MENU_ENABLED", 134, "DodocoinBalanceInMenuEnabled", cq3Var2);
        U6 = new bq3("DRINKS_TWO_COLUMN_ENABLED", 135, "DrinksTwoColumnEnabled", cq3Var2);
        V6 = new bq3("DISTANCE_TO_DELIVERY_ADDRESS_VALIDATION_ENABLED", SyslogConstants.LOG_LOCAL1, "DistanceToDeliveryAddressValidationEnabled", cq3Var2);
        W6 = new bq3("COMBO_CUSTOMIZE_SECTIONS_REARRANGEMENT_ENABLED", 137, "ComboCustomizeSectionsRearrangementEnabled", cq3Var2);
        X6 = new bq3("MENU_SUB_CATEGORIES_ENABLED", 138, "MenuSubcategoriesEnabled", cq3Var2);
        Y6 = new bq3("CHOOSE_ORDER_TYPE_VARIANTS_ENABLED", 139, "ChooseOrderTypeVariantsEnabled", cq3Var2);
        Z6 = new bq3("INFINITE_UPSELL_ENABLED", 140, "InfiniteUpsellEnabled", cq3Var2);
        cq3 cq3Var3 = cq3.c;
        a7 = new bq3("DEBUG_UTILS", 141, "DebugUtils", cq3Var3);
        b7 = new bq3("PAYMENT_CHECK", 142, "PaymentCheck", cq3Var3);
        c7 = new bq3("MULTI_ACQUIRING_ANDROID", 143, "MultiAcquiringAndroid", cq3Var3);
        d7 = new bq3("CHANGE_VARIABLE_PRODUCTS_IN_CART", SyslogConstants.LOG_LOCAL2, "ChangeVariableProductsInCartAndroid", cq3Var3);
        e7 = new bq3("NEW_PROMOTING_ITEM_LAYOUT", 145, "NewPromotingItemLayoutAndroid", cq3Var3);
        f7 = new bq3("AR_PIZZA_HEART", 146, "ARPizzaHeartAndroidV2", cq3Var3);
        g7 = new bq3("PROFILE_V2024", 147, "ProfileV2024Android", cq3Var3);
        h7 = new bq3("CART_BUTTON", 148, "CartButtonAndroid", cq3Var3);
        bq3[] a2 = a();
        i7 = a2;
        j7 = lj3.a(a2);
        c = new a(null);
    }

    private bq3(String str, int i2, String str2, cq3 cq3Var) {
        this.a = cq3Var;
        String i3 = cq3Var.i();
        this.b = i3 + str2;
    }

    private static final /* synthetic */ bq3[] a() {
        return new bq3[]{d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, I, X, Y, Z, S4, T4, U4, V4, W4, X4, Y4, Z4, a5, b5, c5, d5, e5, f5, g5, h5, i5, j5, k5, l5, m5, n5, o5, p5, q5, r5, s5, t5, u5, v5, w5, x5, y5, z5, A5, B5, C5, D5, E5, F5, G5, H5, I5, J5, K5, L5, M5, N5, O5, P5, Q5, R5, S5, T5, U5, V5, W5, X5, Y5, Z5, a6, b6, c6, d6, e6, f6, g6, h6, i6, j6, k6, l6, m6, n6, o6, p6, q6, r6, s6, t6, u6, v6, w6, x6, y6, z6, A6, B6, C6, D6, E6, F6, G6, H6, I6, J6, K6, L6, M6, N6, O6, P6, Q6, R6, S6, T6, U6, V6, W6, X6, Y6, Z6, a7, b7, c7, d7, e7, f7, g7, h7};
    }

    public static bq3 valueOf(String str) {
        return (bq3) Enum.valueOf(bq3.class, str);
    }

    public static bq3[] values() {
        return (bq3[]) i7.clone();
    }

    public final String getValue() {
        return this.b;
    }

    public final cq3 i() {
        return this.a;
    }
}
