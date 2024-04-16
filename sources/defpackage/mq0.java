package defpackage;

import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import defpackage.kl8;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: CartExtensions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lmq0;", "", "Lcom/dodopizza/persistence/entity/cart/CartItemEntity;", "entity", "Lnr0;", "b", "Lcom/dodopizza/persistence/entity/cart/CartEntity;", "cart", "", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mq0  reason: default package */
/* loaded from: classes4.dex */
public final class mq0 {
    public static final mq0 a = new mq0();

    private mq0() {
    }

    private final nr0 b(CartItemEntity cartItemEntity) {
        return new nr0(cartItemEntity.getName(), kl8.a.a.b(cartItemEntity.getCategory()), cartItemEntity.getDoughTypeId(), cartItemEntity.getSizeGroupId());
    }

    public final Collection<nr0> a(CartEntity cartEntity) {
        int w;
        z65.h(cartEntity, "cart");
        k0<CartItemEntity> cartItems = cartEntity.getCartItems();
        ArrayList<CartItemEntity> arrayList = new ArrayList();
        for (CartItemEntity cartItemEntity : cartItems) {
            if (cartItemEntity.getErrorCode() != 1) {
                arrayList.add(cartItemEntity);
            }
        }
        mq0 mq0Var = a;
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (CartItemEntity cartItemEntity2 : arrayList) {
            arrayList2.add(mq0Var.b(cartItemEntity2));
        }
        return arrayList2;
    }
}
