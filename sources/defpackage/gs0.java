package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.cart.AppliedBonusActionEntity;
import com.dodopizza.persistence.entity.cart.AppliedInfoEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.opendevice.c;
import io.realm.k0;
import java.util.List;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CartUpdateService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001c\u0010\u0013\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0016"}, d2 = {"Lgs0;", "Lfs0;", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "state", "Lu90;", c.a, "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "Lcom/dodopizza/persistence/entity/cart/CartEntity;", "cart", "b", "Lt90;", "a", "La98;", "La98;", "pizzeriaRepository", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "(La98;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gs0  reason: default package */
/* loaded from: classes4.dex */
public final class gs0 implements fs0 {
    private final a98 a;
    private final Logger b;

    public gs0(a98 a98Var) {
        z65.h(a98Var, "pizzeriaRepository");
        this.a = a98Var;
        this.b = LoggerFactory.getLogger("CartUpdateService");
    }

    private final u90 b(u90 u90Var, String str, CartEntity cartEntity) {
        AppliedInfoEntity appliedInfoEntity;
        String str2 = null;
        if (cartEntity.getPromoCode() != null) {
            DataPromoCodeEntity promoCode = cartEntity.getPromoCode();
            if (promoCode != null) {
                appliedInfoEntity = promoCode.getAppliedInfo();
            } else {
                appliedInfoEntity = null;
            }
            if (appliedInfoEntity != null) {
                u90Var.c(jq8.a(cartEntity.getPromoCode()));
                u90Var.b(iq8.a(cartEntity.getPromoAction()));
                return u90Var;
            }
        }
        DataPromoCodeEntity promoCode2 = cartEntity.getPromoCode();
        if (promoCode2 != null) {
            str2 = promoCode2.getPromoCode();
        }
        this.b.error("Some trouble when applying cart", (Throwable) new IllegalArgumentException("Promo Code " + ((String) mh5.c(str2, "null")) + ", appliedInfo is null, workflow is " + str));
        u90Var.b(iq8.a(cartEntity.getPromoAction()));
        return u90Var;
    }

    private final u90 c(StateEntity stateEntity) {
        k0<AppliedBonusActionEntity> k0Var;
        d88 a;
        CartEntity cart = stateEntity.getCart();
        if (cart != null) {
            k0Var = cart.getAppliedBonusActions();
        } else {
            k0Var = null;
        }
        List<ce0> b = pm2.b(k0Var);
        String selectedPizzeriaId = stateEntity.getSelectedPizzeriaId();
        if (selectedPizzeriaId == null || (a = this.a.a(selectedPizzeriaId)) == null) {
            a = d88.x.a();
        }
        return new u90(a, b);
    }

    @Override // defpackage.fs0
    public t90 a(StateEntity stateEntity) {
        z65.h(stateEntity, "state");
        u90 c = c(stateEntity);
        String workflowId = stateEntity.getWorkflowId();
        CartEntity cart = stateEntity.getCart();
        if (cart == null) {
            cart = new CartEntity(null, null, null, null, null, null, 63, null);
        }
        t90 a = b(c, workflowId, cart).a();
        z65.g(a, "build(...)");
        return a;
    }
}
