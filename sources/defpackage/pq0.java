package defpackage;

import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.cart.CartComboSlotProductEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.CartProductEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.DiscountEntity;
import com.dodopizza.persistence.entity.cart.PizzaHalvesEntity;
import defpackage.kl8;
import defpackage.uq0;
import io.realm.k0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: CartItemConverter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lpq0;", "Loq0;", "Lkotlin/Function1;", "Lcom/dodopizza/persistence/entity/cart/PizzaHalvesEntity;", "", "Lmr0;", "b", "Lcom/dodopizza/persistence/entity/cart/CartItemEntity;", "cartItemEntity", "Lnq0;", "a", "Lx23;", "Lx23;", "discountConverter", "<init>", "(Lx23;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pq0  reason: default package */
/* loaded from: classes4.dex */
public final class pq0 implements oq0 {
    private final x23 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CartItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/PizzaHalvesEntity;", "entity", "", "Lmr0;", "a", "(Lcom/dodopizza/persistence/entity/cart/PizzaHalvesEntity;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: pq0$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<PizzaHalvesEntity, List<? extends mr0>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<mr0> invoke(PizzaHalvesEntity pizzaHalvesEntity) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<mr0> o;
            z65.h(pizzaHalvesEntity, "entity");
            CartProductEntity left = pizzaHalvesEntity.getLeft();
            z65.e(left);
            CartProductEntity right = pizzaHalvesEntity.getRight();
            z65.e(right);
            mr0[] mr0VarArr = new mr0[2];
            String externalId = left.getExternalId();
            z65.e(externalId);
            String name = left.getName();
            ImageEntity image = left.getImage();
            if (image != null) {
                str = image.getUrl();
            } else {
                str = null;
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            kl8.a aVar = kl8.a.a;
            kl8 a2 = aVar.a(left.getCategory());
            kn6 kn6Var = kn6.c;
            mr0VarArr[0] = new mr0(externalId, name, str2, a2, kn6Var.b(left.getPrice()), left.getSize(), left.getDough(), left.isInStop());
            String externalId2 = right.getExternalId();
            if (externalId2 == null) {
                str3 = "";
            } else {
                str3 = externalId2;
            }
            String name2 = right.getName();
            ImageEntity image2 = right.getImage();
            if (image2 != null) {
                str4 = image2.getUrl();
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str5 = "";
            } else {
                str5 = str4;
            }
            mr0VarArr[1] = new mr0(str3, name2, str5, aVar.a(right.getCategory()), kn6Var.b(right.getPrice()), right.getSize(), right.getDough(), right.isInStop());
            o = kc1.o(mr0VarArr);
            return o;
        }
    }

    public pq0(x23 x23Var) {
        z65.h(x23Var, "discountConverter");
        this.a = x23Var;
    }

    private final Function1<PizzaHalvesEntity, List<mr0>> b() {
        return a.a;
    }

    @Override // defpackage.oq0
    public nq0 a(CartItemEntity cartItemEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        v23 v23Var;
        qq0 qq0Var;
        int w;
        List<mr0> list;
        List<mr0> list2;
        List<mr0> l;
        z65.h(cartItemEntity, "cartItemEntity");
        String id = cartItemEntity.getId();
        z65.e(id);
        uq0.a aVar = new uq0.a(id);
        int errorCode = cartItemEntity.getErrorCode();
        kl8 a2 = kl8.a.a.a(cartItemEntity.getCategory());
        int count = cartItemEntity.getCount();
        int maxCount = cartItemEntity.getMaxCount();
        String name = cartItemEntity.getName();
        String description = cartItemEntity.getDescription();
        int sizeMeasurement = cartItemEntity.getSizeMeasurement();
        float sizeValue = cartItemEntity.getSizeValue();
        ImageEntity image = cartItemEntity.getImage();
        if (image != null) {
            str = image.getUrl();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        kn6 kn6Var = kn6.c;
        hn6 b = kn6Var.b(cartItemEntity.getPrice());
        boolean isGift = cartItemEntity.isGift();
        int availableMore = cartItemEntity.getAvailableMore();
        hn6 b2 = kn6Var.b(cartItemEntity.getTotalPrice());
        int doughTypeId = cartItemEntity.getDoughTypeId();
        String doughTypeName = cartItemEntity.getDoughTypeName();
        if (doughTypeName == null) {
            str2 = "";
        } else {
            str2 = doughTypeName;
        }
        int sizeGroupId = cartItemEntity.getSizeGroupId();
        String sizeGroupName = cartItemEntity.getSizeGroupName();
        if (sizeGroupName == null) {
            str3 = "";
        } else {
            str3 = sizeGroupName;
        }
        String shoppingItemId = cartItemEntity.getShoppingItemId();
        String productId = cartItemEntity.getProductId();
        if (productId == null) {
            str4 = "";
        } else {
            str4 = productId;
        }
        DiscountEntity discount = cartItemEntity.getDiscount();
        if (discount != null) {
            v23Var = this.a.b(discount);
        } else {
            v23Var = null;
        }
        int order = cartItemEntity.getOrder();
        CustomizationEntity customizationEntity = cartItemEntity.getCustomizationEntity();
        if (customizationEntity != null) {
            qq0Var = wja.n(customizationEntity);
        } else {
            qq0Var = null;
        }
        qq0 qq0Var2 = (qq0) mh5.c(qq0Var, new qq0(null, null, 3, null));
        k0<CartComboSlotProductEntity> cartComboProducts = cartItemEntity.getCartComboProducts();
        w = lc1.w(cartComboProducts, 10);
        ArrayList arrayList = new ArrayList(w);
        for (CartComboSlotProductEntity cartComboSlotProductEntity : cartComboProducts) {
            arrayList.add(wja.e(cartComboSlotProductEntity));
        }
        PizzaHalvesEntity pizzaHalves = cartItemEntity.getPizzaHalves();
        if (pizzaHalves != null) {
            list = b().invoke(pizzaHalves);
        } else {
            list = null;
        }
        if (list == null) {
            l = kc1.l();
            list2 = l;
        } else {
            list2 = list;
        }
        return new nq0(aVar, errorCode, a2, count, maxCount, name, description, sizeMeasurement, sizeValue, str, b, isGift, availableMore, b2, doughTypeId, str2, sizeGroupId, str3, shoppingItemId, str4, v23Var, order, qq0Var2, arrayList, list2, cartItemEntity.isEditable());
    }
}
