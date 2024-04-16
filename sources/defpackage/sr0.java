package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.CartComboSlotProductEntity;
import com.dodopizza.persistence.entity.cart.CartProductEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.DiscountEntity;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.opendevice.c;
import defpackage.qr0;
import defpackage.uq0;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: CartQueueItemRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lsr0;", "Lsg9;", "Lqr0;", "Lcom/dodopizza/persistence/entity/cart/queue/CartQueueItemEntity;", "entity", DateTokenConverter.CONVERTER_KEY, "model", c.a, "Lx23;", "a", "Lx23;", "discountConverter", "<init>", "(Lx23;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sr0  reason: default package */
/* loaded from: classes4.dex */
public final class sr0 implements sg9<qr0, CartQueueItemEntity> {
    private final x23 a;

    public sr0(x23 x23Var) {
        z65.h(x23Var, "discountConverter");
        this.a = x23Var;
    }

    @Override // defpackage.sg9
    /* renamed from: c */
    public CartQueueItemEntity a(qr0 qr0Var) {
        CustomizationEntity customizationEntity;
        DiscountEntity discountEntity;
        z65.h(qr0Var, "model");
        if (qr0Var instanceof qr0.a) {
            String id = qr0Var.getId();
            String value = qr0Var.a().getValue();
            boolean z = qr0Var.a() instanceof uq0.a;
            int b = qr0Var.b();
            qr0.a aVar = (qr0.a) qr0Var;
            String name = aVar.getName();
            String m = aVar.m();
            int k = aVar.k();
            String l = aVar.l();
            int q = aVar.q();
            String o = aVar.o();
            double a = aVar.h().a();
            CustomizationEntity g = wja.g(aVar.I());
            boolean v0 = aVar.v0();
            String X = aVar.X();
            String n = aVar.n();
            k0 k0Var = new k0();
            for (dq0 dq0Var : aVar.w0()) {
                k0Var.add(wja.d(dq0Var));
            }
            k0 k0Var2 = new k0();
            for (Iterator it = aVar.z().iterator(); it.hasNext(); it = it) {
                k0Var2.add(wja.l((mr0) it.next()));
            }
            v23 j = aVar.j();
            if (j != null) {
                discountEntity = this.a.a(j);
            } else {
                discountEntity = null;
            }
            return new CartQueueItemEntity(id, CartQueueItemEntity.OPERATION_ADD, b, name, m, k, l, q, o, a, g, v0, X, n, value, z, k0Var2, k0Var, discountEntity);
        } else if (qr0Var instanceof qr0.c) {
            String id2 = qr0Var.getId();
            String value2 = qr0Var.a().getValue();
            boolean z2 = qr0Var.a() instanceof uq0.a;
            int b2 = qr0Var.b();
            qr0.c cVar = (qr0.c) qr0Var;
            qq0 I = cVar.I();
            if (I != null) {
                customizationEntity = wja.g(I);
            } else {
                customizationEntity = null;
            }
            String X2 = cVar.X();
            k0 k0Var3 = new k0();
            for (dq0 dq0Var2 : cVar.w0()) {
                k0Var3.add(wja.d(dq0Var2));
            }
            return new CartQueueItemEntity(id2, CartQueueItemEntity.OPERATION_EDIT, b2, null, null, 0, null, 0, null, 0.0d, customizationEntity, false, X2, null, value2, z2, null, k0Var3, null, 338936, null);
        } else if (qr0Var instanceof qr0.d) {
            return new CartQueueItemEntity(qr0Var.getId(), CartQueueItemEntity.OPERATION_REMOVE, qr0Var.b(), null, null, 0, null, 0, null, 0.0d, null, false, null, null, qr0Var.a().getValue(), qr0Var.a() instanceof uq0.a, null, null, null, 475128, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // defpackage.sg9
    /* renamed from: d */
    public qr0 b(CartQueueItemEntity cartQueueItemEntity) {
        uq0 bVar;
        uq0 bVar2;
        qq0 qq0Var;
        int w;
        int w2;
        v23 v23Var;
        int w3;
        z65.h(cartQueueItemEntity, "entity");
        String operation = cartQueueItemEntity.getOperation();
        int hashCode = operation.hashCode();
        if (hashCode != -934610812) {
            if (hashCode != 96417) {
                if (hashCode == 3108362 && operation.equals(CartQueueItemEntity.OPERATION_EDIT)) {
                    String id = cartQueueItemEntity.getId();
                    z65.e(id);
                    uq0.a aVar = new uq0.a(cartQueueItemEntity.getCartItemId());
                    int count = cartQueueItemEntity.getCount();
                    k0<CartComboSlotProductEntity> comboProducts = cartQueueItemEntity.getComboProducts();
                    w3 = lc1.w(comboProducts, 10);
                    ArrayList arrayList = new ArrayList(w3);
                    for (CartComboSlotProductEntity cartComboSlotProductEntity : comboProducts) {
                        arrayList.add(wja.e(cartComboSlotProductEntity));
                    }
                    return new qr0.c(id, aVar, count, null, arrayList, null, 0, 104, null);
                }
            } else if (operation.equals(CartQueueItemEntity.OPERATION_ADD)) {
                String id2 = cartQueueItemEntity.getId();
                z65.e(id2);
                if (cartQueueItemEntity.isCartItemPersisted()) {
                    bVar2 = new uq0.a(cartQueueItemEntity.getCartItemId());
                } else {
                    bVar2 = new uq0.b(cartQueueItemEntity.getCartItemId());
                }
                uq0 uq0Var = bVar2;
                int count2 = cartQueueItemEntity.getCount();
                boolean isGift = cartQueueItemEntity.isGift();
                String name = cartQueueItemEntity.getName();
                String imageUrl = cartQueueItemEntity.getImageUrl();
                int doughId = cartQueueItemEntity.getDoughId();
                String doughTypeName = cartQueueItemEntity.getDoughTypeName();
                int sizeId = cartQueueItemEntity.getSizeId();
                String sizeGroupName = cartQueueItemEntity.getSizeGroupName();
                hn6 b = kn6.c.b(cartQueueItemEntity.getPrice());
                String shoppingItemId = cartQueueItemEntity.getShoppingItemId();
                String productCategory = cartQueueItemEntity.getProductCategory();
                CustomizationEntity customization = cartQueueItemEntity.getCustomization();
                if (customization != null) {
                    qq0Var = wja.n(customization);
                } else {
                    qq0Var = null;
                }
                qq0 qq0Var2 = (qq0) mh5.c(qq0Var, new qq0(null, null, 3, null));
                k0<CartProductEntity> pizzaHalves = cartQueueItemEntity.getPizzaHalves();
                w = lc1.w(pizzaHalves, 10);
                ArrayList arrayList2 = new ArrayList(w);
                for (CartProductEntity cartProductEntity : pizzaHalves) {
                    arrayList2.add(wja.j(cartProductEntity));
                }
                k0<CartComboSlotProductEntity> comboProducts2 = cartQueueItemEntity.getComboProducts();
                w2 = lc1.w(comboProducts2, 10);
                ArrayList arrayList3 = new ArrayList(w2);
                for (CartComboSlotProductEntity cartComboSlotProductEntity2 : comboProducts2) {
                    arrayList3.add(wja.e(cartComboSlotProductEntity2));
                }
                DiscountEntity discount = cartQueueItemEntity.getDiscount();
                if (discount != null) {
                    v23Var = this.a.b(discount);
                } else {
                    v23Var = null;
                }
                return new qr0.a(id2, uq0Var, shoppingItemId, count2, isGift, name, imageUrl, doughId, doughTypeName, sizeId, sizeGroupName, b, productCategory, qq0Var2, arrayList3, arrayList2, v23Var, 0, 131072, null);
            }
        } else if (operation.equals(CartQueueItemEntity.OPERATION_REMOVE)) {
            String id3 = cartQueueItemEntity.getId();
            z65.e(id3);
            if (cartQueueItemEntity.isCartItemPersisted()) {
                bVar = new uq0.a(cartQueueItemEntity.getCartItemId());
            } else {
                bVar = new uq0.b(cartQueueItemEntity.getCartItemId());
            }
            return new qr0.d(id3, bVar, cartQueueItemEntity.getCount(), 0, 8, null);
        }
        throw new IllegalStateException("Wrong CartQueueItemEntity operation " + cartQueueItemEntity.getOperation());
    }
}
