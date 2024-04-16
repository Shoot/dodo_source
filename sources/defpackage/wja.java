package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.cart.AddedIngredientEntity;
import com.dodopizza.persistence.entity.cart.AppliedBonusActionEntity;
import com.dodopizza.persistence.entity.cart.CartComboSlotProductEntity;
import com.dodopizza.persistence.entity.cart.CartProductEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.PizzaHalvesEntity;
import com.dodopizza.persistence.entity.cart.RemovedIngredientEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kl8;
import io.realm.k0;
import java.util.ArrayList;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.AppliedBonusActionDto;
import ru.dodopizza.backend.domain.state.dto.cart.response.AddedIngredientResponseDto;
import ru.dodopizza.backend.domain.state.dto.cart.response.CartComboSlotProductResponseDto;
import ru.dodopizza.backend.domain.state.dto.cart.response.CartProductResponseDto;
import ru.dodopizza.backend.domain.state.dto.cart.response.CustomizationResponseDto;
import ru.dodopizza.backend.domain.state.dto.cart.response.PizzaHalvesResponseDto;
import ru.dodopizza.backend.domain.state.dto.cart.response.RemovedIngredientResponseDto;
/* compiled from: shoppingcarttransform.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\fH\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\rH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0013H\u0000\u001a\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0014H\u0000\u001a\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017H\u0000\u001a\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000\u001a\u0010\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001dH\u0000\u001a\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020 H\u0000\u001a\u0010\u0010&\u001a\u00020%2\u0006\u0010\u0001\u001a\u00020$H\u0000\u001a\u0010\u0010(\u001a\u00020 2\u0006\u0010'\u001a\u00020%H\u0000\u001a\u0010\u0010)\u001a\u00020%2\u0006\u0010\"\u001a\u00020 H\u0002\u001a\u0018\u0010,\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020*H\u0000\u001a\u000e\u0010/\u001a\u00020.2\u0006\u0010\u0001\u001a\u00020-¨\u00060"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/response/CartProductResponseDto;", "dto", "", "isTransparentImageUrlEnabled", "Lcom/dodopizza/persistence/entity/cart/CartProductEntity;", "k", "Lmr0;", "cartProduct", "l", "entity", "j", "isTransparentUrlEnabled", "Lru/dodopizza/backend/domain/state/dto/cart/response/CartComboSlotProductResponseDto;", "Lcom/dodopizza/persistence/entity/cart/CartComboSlotProductEntity;", "f", "Ldq0;", e.a, "cartComboProduct", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/state/dto/cart/response/CustomizationResponseDto;", "Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", Image.TYPE_MEDIUM, "customizationEntity", "Lqq0;", "n", "cartItemCustomization", "g", "Lru/dodopizza/backend/domain/state/dto/cart/response/RemovedIngredientResponseDto;", "removedIngredientDto", "Lcom/dodopizza/persistence/entity/cart/RemovedIngredientEntity;", "p", "removedIngredientEntity", "Lxq0;", "q", "cartItemProductIngredient", "i", "Lru/dodopizza/backend/domain/state/dto/cart/response/AddedIngredientResponseDto;", "Lcom/dodopizza/persistence/entity/cart/AddedIngredientEntity;", "a", "addedIngredientEntity", "b", Image.TYPE_HIGH, "Lru/dodopizza/backend/domain/state/dto/cart/response/PizzaHalvesResponseDto;", "Lcom/dodopizza/persistence/entity/cart/PizzaHalvesEntity;", "o", "Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AppliedBonusActionDto;", "Lcom/dodopizza/persistence/entity/cart/AppliedBonusActionEntity;", c.a, "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: wja  reason: default package */
/* loaded from: classes4.dex */
public final class wja {
    public static final AddedIngredientEntity a(AddedIngredientResponseDto addedIngredientResponseDto) {
        boolean z;
        z65.h(addedIngredientResponseDto, "dto");
        String id = addedIngredientResponseDto.getId();
        int count = addedIngredientResponseDto.getCount();
        String name = addedIngredientResponseDto.getName();
        double price = addedIngredientResponseDto.getPrice();
        if (addedIngredientResponseDto.getErrorCode() != 1) {
            z = true;
        } else {
            z = false;
        }
        return new AddedIngredientEntity(id, count, name, price, z);
    }

    public static final xq0 b(AddedIngredientEntity addedIngredientEntity) {
        z65.h(addedIngredientEntity, "addedIngredientEntity");
        return new xq0(addedIngredientEntity.getExternalId(), addedIngredientEntity.getName(), kn6.c.b(addedIngredientEntity.getPrice()), null, addedIngredientEntity.isInStop(), 8, null);
    }

    public static final AppliedBonusActionEntity c(AppliedBonusActionDto appliedBonusActionDto) {
        z65.h(appliedBonusActionDto, "dto");
        return new AppliedBonusActionEntity(appliedBonusActionDto.getId(), appliedBonusActionDto.getDescription(), appliedBonusActionDto.getTitle());
    }

    public static final CartComboSlotProductEntity d(dq0 dq0Var) {
        z65.h(dq0Var, "cartComboProduct");
        return new CartComboSlotProductEntity(dq0Var.getId(), dq0Var.c().getId(), dq0Var.h().a(), dq0Var.l(), null, new ImageEntity(0, dq0Var.i(), 1, null), dq0Var.getName(), dq0Var.e(), null, dq0Var.o(), null, 1296, null);
    }

    public static final dq0 e(CartComboSlotProductEntity cartComboSlotProductEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        qq0 qq0Var;
        z65.h(cartComboSlotProductEntity, "entity");
        String externalId = cartComboSlotProductEntity.getExternalId();
        if (externalId == null) {
            str = "";
        } else {
            str = externalId;
        }
        String name = cartComboSlotProductEntity.getName();
        ImageEntity image = cartComboSlotProductEntity.getImage();
        if (image != null) {
            str2 = image.getUrl();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        kl8 a = kl8.a.a.a(cartComboSlotProductEntity.getCategory());
        hn6 b = kn6.c.b(cartComboSlotProductEntity.getPrice());
        int size = cartComboSlotProductEntity.getSize();
        String sizeGroupName = cartComboSlotProductEntity.getSizeGroupName();
        if (sizeGroupName == null) {
            str4 = "";
        } else {
            str4 = sizeGroupName;
        }
        int dough = cartComboSlotProductEntity.getDough();
        String doughTypeName = cartComboSlotProductEntity.getDoughTypeName();
        if (doughTypeName == null) {
            str5 = "";
        } else {
            str5 = doughTypeName;
        }
        boolean isInStop = cartComboSlotProductEntity.isInStop();
        CustomizationEntity customization = cartComboSlotProductEntity.getCustomization();
        if (customization != null) {
            qq0Var = n(customization);
        } else {
            qq0Var = null;
        }
        return new dq0(str, name, str3, a, b, size, null, str4, dough, str5, isInStop, qq0Var, null, null, 12352, null);
    }

    public static final CartComboSlotProductEntity f(boolean z, CartComboSlotProductResponseDto cartComboSlotProductResponseDto) {
        Integer num;
        CustomizationEntity customizationEntity;
        z65.h(cartComboSlotProductResponseDto, "dto");
        String id = cartComboSlotProductResponseDto.getId();
        String category = cartComboSlotProductResponseDto.getCategory();
        double price = cartComboSlotProductResponseDto.getPrice();
        int size = cartComboSlotProductResponseDto.getSize();
        String sizeGroupName = cartComboSlotProductResponseDto.getSizeGroupName();
        ProductImageDto image = cartComboSlotProductResponseDto.getImage();
        if (image != null) {
            num = Integer.valueOf(image.getSize());
        } else {
            num = null;
        }
        ImageEntity imageEntity = new ImageEntity(((Number) mh5.c(num, 0)).intValue(), ug6.a(cartComboSlotProductResponseDto.getImage(), z));
        String name = cartComboSlotProductResponseDto.getName();
        int dough = cartComboSlotProductResponseDto.getDough();
        String doughTypeName = cartComboSlotProductResponseDto.getDoughTypeName();
        boolean z2 = true;
        if (cartComboSlotProductResponseDto.getErrorCode() == 1) {
            z2 = false;
        }
        CustomizationResponseDto customization = cartComboSlotProductResponseDto.getCustomization();
        if (customization != null) {
            customizationEntity = m(customization);
        } else {
            customizationEntity = null;
        }
        return new CartComboSlotProductEntity(id, category, price, size, sizeGroupName, imageEntity, name, dough, doughTypeName, z2, customizationEntity);
    }

    public static final CustomizationEntity g(qq0 qq0Var) {
        z65.h(qq0Var, "cartItemCustomization");
        k0 k0Var = new k0();
        for (xq0 xq0Var : qq0Var.a()) {
            k0Var.add(h(xq0Var));
        }
        k0 k0Var2 = new k0();
        for (xq0 xq0Var2 : qq0Var.b()) {
            k0Var2.add(i(xq0Var2));
        }
        return new CustomizationEntity(null, k0Var, k0Var2, 1, null);
    }

    private static final AddedIngredientEntity h(xq0 xq0Var) {
        return new AddedIngredientEntity(xq0Var.getId(), 0, xq0Var.getName(), xq0Var.h().a(), xq0Var.a(), 2, null);
    }

    public static final RemovedIngredientEntity i(xq0 xq0Var) {
        z65.h(xq0Var, "cartItemProductIngredient");
        return new RemovedIngredientEntity(xq0Var.getId(), xq0Var.getName());
    }

    public static final mr0 j(CartProductEntity cartProductEntity) {
        String str;
        String str2;
        String str3;
        z65.h(cartProductEntity, "entity");
        String externalId = cartProductEntity.getExternalId();
        if (externalId == null) {
            str = "";
        } else {
            str = externalId;
        }
        String name = cartProductEntity.getName();
        ImageEntity image = cartProductEntity.getImage();
        if (image != null) {
            str2 = image.getUrl();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        return new mr0(str, name, str3, kl8.a.a.a(cartProductEntity.getCategory()), kn6.c.b(cartProductEntity.getPrice()), cartProductEntity.getSize(), cartProductEntity.getDough(), cartProductEntity.isInStop());
    }

    private static final CartProductEntity k(CartProductResponseDto cartProductResponseDto, boolean z) {
        Integer num;
        boolean z2;
        String id = cartProductResponseDto.getId();
        String category = cartProductResponseDto.getCategory();
        double price = cartProductResponseDto.getPrice();
        int size = cartProductResponseDto.getSize();
        ProductImageDto image = cartProductResponseDto.getImage();
        if (image != null) {
            num = Integer.valueOf(image.getSize());
        } else {
            num = null;
        }
        ImageEntity imageEntity = new ImageEntity(((Number) mh5.c(num, 0)).intValue(), ug6.a(cartProductResponseDto.getImage(), z));
        String name = cartProductResponseDto.getName();
        int dough = cartProductResponseDto.getDough();
        if (cartProductResponseDto.getErrorCode() != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new CartProductEntity(id, category, price, size, imageEntity, name, dough, z2);
    }

    public static final CartProductEntity l(mr0 mr0Var) {
        z65.h(mr0Var, "cartProduct");
        return new CartProductEntity(mr0Var.getId(), mr0Var.a().getId(), mr0Var.h().a(), mr0Var.d(), new ImageEntity(0, mr0Var.c(), 1, null), mr0Var.getName(), mr0Var.b(), mr0Var.e());
    }

    public static final CustomizationEntity m(CustomizationResponseDto customizationResponseDto) {
        z65.h(customizationResponseDto, "dto");
        String a = ht4.a.a();
        k0 k0Var = new k0();
        for (AddedIngredientResponseDto addedIngredientResponseDto : customizationResponseDto.getAddedIngredients()) {
            k0Var.add(a(addedIngredientResponseDto));
        }
        k0 k0Var2 = new k0();
        for (RemovedIngredientResponseDto removedIngredientResponseDto : customizationResponseDto.getRemovedIngredients()) {
            k0Var2.add(p(removedIngredientResponseDto));
        }
        return new CustomizationEntity(a, k0Var, k0Var2);
    }

    public static final qq0 n(CustomizationEntity customizationEntity) {
        int w;
        int w2;
        z65.h(customizationEntity, "customizationEntity");
        k0<RemovedIngredientEntity> removedIngredients = customizationEntity.getRemovedIngredients();
        w = lc1.w(removedIngredients, 10);
        ArrayList arrayList = new ArrayList(w);
        for (RemovedIngredientEntity removedIngredientEntity : removedIngredients) {
            arrayList.add(q(removedIngredientEntity));
        }
        k0<AddedIngredientEntity> addedIngredients = customizationEntity.getAddedIngredients();
        w2 = lc1.w(addedIngredients, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (AddedIngredientEntity addedIngredientEntity : addedIngredients) {
            arrayList2.add(b(addedIngredientEntity));
        }
        return new qq0(arrayList, arrayList2);
    }

    public static final PizzaHalvesEntity o(boolean z, PizzaHalvesResponseDto pizzaHalvesResponseDto) {
        z65.h(pizzaHalvesResponseDto, "dto");
        return new PizzaHalvesEntity(k(pizzaHalvesResponseDto.getLeft(), z), k(pizzaHalvesResponseDto.getRight(), z));
    }

    public static final RemovedIngredientEntity p(RemovedIngredientResponseDto removedIngredientResponseDto) {
        z65.h(removedIngredientResponseDto, "removedIngredientDto");
        return new RemovedIngredientEntity(removedIngredientResponseDto.getId(), removedIngredientResponseDto.getName());
    }

    public static final xq0 q(RemovedIngredientEntity removedIngredientEntity) {
        z65.h(removedIngredientEntity, "removedIngredientEntity");
        return new xq0(removedIngredientEntity.getExternalId(), removedIngredientEntity.getName(), null, null, false, 28, null);
    }
}
