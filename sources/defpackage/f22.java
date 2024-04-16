package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerProperties;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.cart.AddedIngredientEntity;
import com.dodopizza.persistence.entity.cart.AppliedBonusActionEntity;
import com.dodopizza.persistence.entity.cart.CartComboSlotProductEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.DiscountEntity;
import com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity;
import com.dodopizza.persistence.entity.cart.PriceEntity;
import com.dodopizza.persistence.entity.cart.RemovedIngredientEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ijb;
import im.threads.business.transport.MessageAttributes;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CreateOrder.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001aBU\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010&\u0012\u0006\u0010*\u001a\u00020\f\u0012\b\u0010,\u001a\u0004\u0018\u00010\n\u0012\b\u0010/\u001a\u0004\u0018\u00010-\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00104\u001a\u00020\u0014¢\u0006\u0004\b5\u00106J\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001c\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u001a\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b*\u00020\nH\u0002J\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b*\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u0012*\u00020\u0010H\u0002J\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0010H\u0002J\u001e\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u0012*\u00020\u0016H\u0002J\u001e\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u0012*\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\t\u0010\u001b\u001a\u00020\fHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0016\u0010,\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u00104\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103¨\u00067"}, d2 = {"Lf22;", "Ldc;", "Lbc;", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "state", "i", "", "orderType", "expectedReadinessTime", Image.TYPE_HIGH, "Lov5;", "", "", "", e.a, "j", "Lcom/dodopizza/persistence/entity/cart/CartItemEntity;", "f", "", "b", "", c.a, "Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", DateTokenConverter.CONVERTER_KEY, "g", "Lqc;", "a", "toString", "hashCode", "other", "equals", "Lbc7;", "Lbc7;", BonusActionEntity.ORDER, "", "D", "addedCoins", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "Ld88;", "Ld88;", "pizzeria", "Ljava/lang/String;", AppsFlyerProperties.CURRENCY_CODE, "Lov5;", "orderLocation", "", "Ljava/lang/Float;", "distanceToPizzeria", "Ltl5;", "Ltl5;", "languageConfig", "Z", "hasBeenReusableBoxUsed", "<init>", "(Lbc7;DLcom/dodopizza/persistence/entity/cart/StateEntity;Ld88;Ljava/lang/String;Lov5;Ljava/lang/Float;Ltl5;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f22  reason: default package */
/* loaded from: classes4.dex */
public final class f22 implements dc {
    public static final a j = new a(null);
    private final bc7 a;
    private final double b;
    private final StateEntity c;
    private final d88 d;
    private final String e;
    private final ov5 f;
    private final Float g;
    private final tl5 h;
    private final boolean i;

    /* compiled from: CreateOrder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b,\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0083T¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0083T¢\u0006\f\n\u0004\b\f\u0010\u0004\u0012\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u001a\u0010\"\u001a\u00020\u00028\u0002X\u0083T¢\u0006\f\n\u0004\b\"\u0010\u0004\u0012\u0004\b#\u0010\tR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0004¨\u0006."}, d2 = {"Lf22$a;", "", "", "AF_CURRENCY_PARAM", "Ljava/lang/String;", "AF_ORDER_ID_PARAM", "AF_REVENUE_PARAM", "COINS_ADDED", "getCOINS_ADDED$annotations", "()V", "CREATE_ORDER", "PARAM_ACCURACY", "PARAM_BONUS_ACTION_ID", "getPARAM_BONUS_ACTION_ID$annotations", "PARAM_BONUS_ACTION_NAME", "PARAM_CLIENT_DISTANCE", "PARAM_CLIENT_GEO", "PARAM_CURRENCY", "PARAM_DISCOUNT", "PARAM_EXPECTED_READINESS_TIME", "PARAM_HAS_PERSONAL_PRICE", "PARAM_HAS_REUSABLE_PACKAGE", "PARAM_ID", "PARAM_INTERFACE_LANGUAGE", "PARAM_LAT", "PARAM_LON", "PARAM_NAME", "PARAM_ORDER_NUMBER", "PARAM_PRICE", "PARAM_PRODUCTS", "PARAM_PRODUCT_DISCOUNT", "PARAM_PRODUCT_ID", "PARAM_PROMOCODE", "PARAM_QUANTITY", "PARAM_RAW_PRICE", "getPARAM_RAW_PRICE$annotations", "PARAM_REVENUE", "PARAM_TAKE_TYPE", "PARAM_TIMESTAMP", "PARAM_TRANSACTION_ID", "PARAM_VARIANT", "TAKE_TYPE_DINE_IN", "TAKE_TYPE_NONE", "TAKE_TYPE_TABLE", "TAKE_TYPE_TAKEAWAY", "<init>", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: f22$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f22(bc7 bc7Var, double d, StateEntity stateEntity, d88 d88Var, String str, ov5 ov5Var, Float f, tl5 tl5Var, boolean z) {
        z65.h(bc7Var, BonusActionEntity.ORDER);
        z65.h(stateEntity, "state");
        z65.h(str, AppsFlyerProperties.CURRENCY_CODE);
        z65.h(tl5Var, "languageConfig");
        this.a = bc7Var;
        this.b = d;
        this.c = stateEntity;
        this.d = d88Var;
        this.e = str;
        this.f = ov5Var;
        this.g = f;
        this.h = tl5Var;
        this.i = z;
    }

    private final List<Map<String, Object>> b(CartItemEntity cartItemEntity) {
        int w;
        Map k;
        k0<CartComboSlotProductEntity> cartComboProducts = cartItemEntity.getCartComboProducts();
        w = lc1.w(cartComboProducts, 10);
        ArrayList arrayList = new ArrayList(w);
        for (CartComboSlotProductEntity cartComboSlotProductEntity : cartComboProducts) {
            Pair[] pairArr = new Pair[5];
            String externalId = cartComboSlotProductEntity.getExternalId();
            if (externalId == null) {
                externalId = "";
            }
            pairArr[0] = lnb.a(ShoppingInfoEntity.FIELD_PRODUCT_ID, externalId);
            pairArr[1] = lnb.a(Action.NAME_ATTRIBUTE, cartComboSlotProductEntity.getName());
            pairArr[2] = vc.k(cartComboSlotProductEntity.getCategory());
            pairArr[3] = lnb.a("rawPrice", Double.valueOf(cartComboSlotProductEntity.getPrice()));
            pairArr[4] = lnb.a("variant", uc.a.d(cartComboSlotProductEntity.getDough(), cartComboSlotProductEntity.getSize()));
            k = g86.k(pairArr);
            arrayList.add(k);
        }
        return arrayList;
    }

    private final boolean c(CartItemEntity cartItemEntity) {
        PersonalPriceDiscountEntity personalPriceDiscountEntity;
        DiscountEntity discount = cartItemEntity.getDiscount();
        if (discount != null) {
            personalPriceDiscountEntity = discount.getPersonalPriceDiscount();
        } else {
            personalPriceDiscountEntity = null;
        }
        if (personalPriceDiscountEntity != null) {
            return true;
        }
        return false;
    }

    private final List<Map<String, Object>> d(CustomizationEntity customizationEntity) {
        int w;
        Map k;
        k0<AddedIngredientEntity> addedIngredients = customizationEntity.getAddedIngredients();
        w = lc1.w(addedIngredients, 10);
        ArrayList arrayList = new ArrayList(w);
        for (AddedIngredientEntity addedIngredientEntity : addedIngredients) {
            k = g86.k(lnb.a(Action.NAME_ATTRIBUTE, addedIngredientEntity.getName()), lnb.a("price", Double.valueOf(addedIngredientEntity.getPrice())), lnb.a("quantity", 1), lnb.a("toppingId", addedIngredientEntity.getExternalId()), lnb.a(MessageAttributes.TYPE, ijb.a.b.a()), lnb.a("quantity", Integer.valueOf(addedIngredientEntity.getCount())));
            arrayList.add(k);
        }
        return arrayList;
    }

    private final Map<String, Object> e(ov5 ov5Var) {
        Map<String, Object> k;
        k = g86.k(lnb.a("lat", Double.valueOf(ov5Var.b())), lnb.a("lon", Double.valueOf(ov5Var.c())), lnb.a("acc", ov5Var.a()), lnb.a("timestamp", ov5Var.d()));
        return k;
    }

    private final Map<String, Object> f(CartItemEntity cartItemEntity, StateEntity stateEntity) {
        AppliedBonusActionEntity appliedBonusActionEntity;
        String str;
        String str2;
        List<Map<String, Object>> list;
        Map h;
        List<Map<String, Object>> list2;
        Map h2;
        Map<String, Object> k;
        k0<AppliedBonusActionEntity> appliedBonusActions;
        AppliedBonusActionEntity appliedBonusActionEntity2;
        String str3;
        CartEntity cart = stateEntity.getCart();
        Double d = null;
        if (cart != null && (appliedBonusActions = cart.getAppliedBonusActions()) != null) {
            Iterator<AppliedBonusActionEntity> it = appliedBonusActions.iterator();
            while (true) {
                if (it.hasNext()) {
                    appliedBonusActionEntity2 = it.next();
                    String externalId = appliedBonusActionEntity2.getExternalId();
                    DiscountEntity discount = cartItemEntity.getDiscount();
                    if (discount != null) {
                        str3 = discount.getBonusActionId();
                    } else {
                        str3 = null;
                    }
                    if (z65.c(externalId, str3)) {
                        break;
                    }
                } else {
                    appliedBonusActionEntity2 = null;
                    break;
                }
            }
            appliedBonusActionEntity = appliedBonusActionEntity2;
        } else {
            appliedBonusActionEntity = null;
        }
        Pair[] pairArr = new Pair[14];
        if (appliedBonusActionEntity != null) {
            str = appliedBonusActionEntity.getTitle();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = lnb.a("bonusaction", str);
        if (appliedBonusActionEntity != null) {
            str2 = appliedBonusActionEntity.getExternalId();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = lnb.a("bonusactionId", str2);
        pairArr[2] = vc.k(cartItemEntity.getCategory());
        CustomizationEntity customizationEntity = cartItemEntity.getCustomizationEntity();
        if (customizationEntity != null) {
            list = d(customizationEntity);
        } else {
            list = null;
        }
        h = g86.h();
        pairArr[3] = lnb.a("added", mh5.c(list, h));
        CustomizationEntity customizationEntity2 = cartItemEntity.getCustomizationEntity();
        if (customizationEntity2 != null) {
            list2 = g(customizationEntity2);
        } else {
            list2 = null;
        }
        h2 = g86.h();
        pairArr[4] = lnb.a("deleted", mh5.c(list2, h2));
        DiscountEntity discount2 = cartItemEntity.getDiscount();
        if (discount2 != null) {
            d = Double.valueOf(discount2.getAmount());
        }
        pairArr[5] = lnb.a("discount", mh5.c(d, 0));
        String productId = cartItemEntity.getProductId();
        if (productId == null) {
            productId = "";
        }
        pairArr[6] = lnb.a(ShoppingInfoEntity.FIELD_PRODUCT_ID, productId);
        String id = cartItemEntity.getId();
        if (id != null) {
            str4 = id;
        }
        pairArr[7] = lnb.a("id", str4);
        pairArr[8] = lnb.a(Action.NAME_ATTRIBUTE, cartItemEntity.getName());
        pairArr[9] = lnb.a("price", mh5.c(Double.valueOf(cartItemEntity.getTotalPrice()), 0));
        pairArr[10] = lnb.a("quantity", Integer.valueOf(cartItemEntity.getCount()));
        pairArr[11] = lnb.a("variant", uc.a.d(cartItemEntity.getDoughTypeId(), cartItemEntity.getSizeGroupId()));
        pairArr[12] = lnb.a("products", b(cartItemEntity));
        pairArr[13] = lnb.a("has_personal_price", Boolean.valueOf(c(cartItemEntity)));
        k = g86.k(pairArr);
        return k;
    }

    private final List<Map<String, Object>> g(CustomizationEntity customizationEntity) {
        int w;
        Map k;
        k0<RemovedIngredientEntity> removedIngredients = customizationEntity.getRemovedIngredients();
        w = lc1.w(removedIngredients, 10);
        ArrayList arrayList = new ArrayList(w);
        for (RemovedIngredientEntity removedIngredientEntity : removedIngredients) {
            k = g86.k(lnb.a(Action.NAME_ATTRIBUTE, removedIngredientEntity.getName()), lnb.a("price", 0), lnb.a("quantity", 1), lnb.a("toppingId", removedIngredientEntity.getExternalId()), lnb.a(MessageAttributes.TYPE, ijb.c.b.a()), lnb.a("quantity", 1));
            arrayList.add(k);
        }
        return arrayList;
    }

    private final bc h(bc bcVar, int i, int i2) {
        if (i == jk7.g.i() || i == jk7.f.i()) {
            bc.e(bcVar, "expected_readiness_time", Integer.valueOf(i2), false, 4, null);
        }
        return bcVar;
    }

    private final bc i(bc bcVar, StateEntity stateEntity) {
        ArrayList arrayList;
        k0<CartItemEntity> cartItems;
        int w;
        CartEntity cart = stateEntity.getCart();
        if (cart != null && (cartItems = cart.getCartItems()) != null) {
            ArrayList<CartItemEntity> arrayList2 = new ArrayList();
            for (CartItemEntity cartItemEntity : cartItems) {
                CartItemEntity cartItemEntity2 = cartItemEntity;
                if (!z65.c(cartItemEntity2.getCategory(), kl8.e.getId()) || cartItemEntity2.getCount() != 0) {
                    arrayList2.add(cartItemEntity);
                }
            }
            w = lc1.w(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(w);
            for (CartItemEntity cartItemEntity3 : arrayList2) {
                z65.e(cartItemEntity3);
                arrayList3.add(f(cartItemEntity3, stateEntity));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        bc.e(bcVar, "products", arrayList, false, 4, null);
        return bcVar;
    }

    private final bc j(bc bcVar, StateEntity stateEntity) {
        String str;
        Integer currentOrderType = stateEntity.getCurrentOrderType();
        Boolean isTakeaway = stateEntity.isTakeaway();
        Integer tableNumber = stateEntity.getTableNumber();
        jk7 jk7Var = jk7.g;
        int i = jk7Var.i();
        if (currentOrderType != null && currentOrderType.intValue() == i && tableNumber != null) {
            str = "table";
        } else {
            int i2 = jk7Var.i();
            if (currentOrderType != null && currentOrderType.intValue() == i2 && isTakeaway != null) {
                if (isTakeaway.booleanValue()) {
                    str = "take-away";
                } else {
                    str = "dine-in";
                }
            } else {
                str = "null";
            }
        }
        return bc.e(bcVar, "take_type", str, false, 4, null);
    }

    @Override // defpackage.dc
    public qc a() {
        Double d;
        String str;
        String str2;
        String str3;
        DataPromoCodeEntity promoCode;
        BonusActionEntity bonusAction;
        DataPromoCodeEntity promoCode2;
        BonusActionEntity bonusAction2;
        DataPromoCodeEntity promoCode3;
        PriceEntity price;
        bc v = vc.v(vc.w(bc.e(bc.e(bc.e(bc.e(bc.e(bc.e(bc.e(j(vc.l(vc.t(new bc("create_order"), this.a.t()), this.a.E()), this.c), "coinsAdded", Double.valueOf(this.b), false, 4, null), AFInAppEventParameterName.CURRENCY, this.e, false, 4, null), "af_order_id", this.a.t(), false, 4, null), AFInAppEventParameterName.REVENUE, Double.valueOf(this.a.D().a()), false, 4, null), "currency", this.e, false, 4, null), "revenue", Double.valueOf(this.a.D().a()), false, 4, null), "orderNumber", Integer.valueOf(this.a.e()), false, 4, null), this.d), wn3.a(this.c));
        CartEntity cart = this.c.getCart();
        Map<String, Object> map = null;
        if (cart != null && (price = cart.getPrice()) != null) {
            d = Double.valueOf(price.getTotalDiscount());
        } else {
            d = null;
        }
        bc e = bc.e(v, "discount", d, false, 4, null);
        CartEntity cart2 = this.c.getCart();
        if (cart2 != null && (promoCode3 = cart2.getPromoCode()) != null) {
            str = promoCode3.getPromoCode();
        } else {
            str = null;
        }
        bc e2 = bc.e(bc.e(e, "promocode", str, false, 4, null), CommonCode.MapKey.TRANSACTION_ID, this.c.getWorkflowId(), false, 4, null);
        CartEntity cart3 = this.c.getCart();
        if (cart3 != null && (promoCode2 = cart3.getPromoCode()) != null && (bonusAction2 = promoCode2.getBonusAction()) != null) {
            str2 = bonusAction2.getTitle();
        } else {
            str2 = null;
        }
        bc e3 = bc.e(e2, "bonusaction", str2, false, 4, null);
        CartEntity cart4 = this.c.getCart();
        if (cart4 != null && (promoCode = cart4.getPromoCode()) != null && (bonusAction = promoCode.getBonusAction()) != null) {
            str3 = bonusAction.getExternalId();
        } else {
            str3 = null;
        }
        bc i = i(bc.e(e3, "bonusactionId", str3, false, 4, null), this.c);
        ov5 ov5Var = this.f;
        if (ov5Var != null) {
            map = e(ov5Var);
        }
        return bc.e(bc.e(h(bc.e(bc.e(i, "client_geo", map, false, 4, null), "client_distance", this.g, false, 4, null), this.a.E(), this.c.getExpectedMinutesToReceiveForASAP()), "interface_language", this.h.b(), false, 4, null), "hasReusablePackage", Boolean.valueOf(this.i), false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f22)) {
            return false;
        }
        f22 f22Var = (f22) obj;
        if (z65.c(this.a, f22Var.a) && Double.compare(this.b, f22Var.b) == 0 && z65.c(this.c, f22Var.c) && z65.c(this.d, f22Var.d) && z65.c(this.e, f22Var.e) && z65.c(this.f, f22Var.f) && z65.c(this.g, f22Var.g) && z65.c(this.h, f22Var.h) && this.i == f22Var.i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.a.hashCode() * 31) + nkb.a(this.b)) * 31) + this.c.hashCode()) * 31;
        d88 d88Var = this.d;
        int i = 0;
        if (d88Var == null) {
            hashCode = 0;
        } else {
            hashCode = d88Var.hashCode();
        }
        int hashCode4 = (((hashCode3 + hashCode) * 31) + this.e.hashCode()) * 31;
        ov5 ov5Var = this.f;
        if (ov5Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ov5Var.hashCode();
        }
        int i2 = (hashCode4 + hashCode2) * 31;
        Float f = this.g;
        if (f != null) {
            i = f.hashCode();
        }
        return ((((i2 + i) * 31) + this.h.hashCode()) * 31) + a91.a(this.i);
    }

    public String toString() {
        bc7 bc7Var = this.a;
        double d = this.b;
        StateEntity stateEntity = this.c;
        d88 d88Var = this.d;
        String str = this.e;
        ov5 ov5Var = this.f;
        Float f = this.g;
        tl5 tl5Var = this.h;
        boolean z = this.i;
        return "CreateOrder(order=" + bc7Var + ", addedCoins=" + d + ", state=" + stateEntity + ", pizzeria=" + d88Var + ", currencyCode=" + str + ", orderLocation=" + ov5Var + ", distanceToPizzeria=" + f + ", languageConfig=" + tl5Var + ", hasBeenReusableBoxUsed=" + z + ")";
    }
}
