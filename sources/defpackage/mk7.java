package defpackage;

import com.dodopizza.persistence.entity.cart.StateEntity;
import defpackage.jk7;
import defpackage.kk7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: OrderTypeConverter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lmk7;", "", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "Lkk7;", "b", "stateEntity", "a", "Lx42;", "Lx42;", "customerAddressService", "<init>", "(Lx42;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mk7  reason: default package */
/* loaded from: classes4.dex */
public final class mk7 {
    private final x42 a;

    /* compiled from: OrderTypeConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mk7$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jk7.values().length];
            try {
                iArr[jk7.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jk7.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jk7.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jk7.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public mk7(x42 x42Var) {
        z65.h(x42Var, "customerAddressService");
        this.a = x42Var;
    }

    private final kk7 b(StateEntity stateEntity) {
        return new kk7.b.C0408b(f91.a(stateEntity.getClientDeliveryLocationEntity()));
    }

    public final kk7 a(StateEntity stateEntity) {
        int i;
        z65.h(stateEntity, "stateEntity");
        jk7.a aVar = jk7.b;
        Integer currentOrderType = stateEntity.getCurrentOrderType();
        if (currentOrderType != null) {
            i = currentOrderType.intValue();
        } else {
            i = jk7.e.i();
        }
        int i2 = a.$EnumSwitchMapping$0[aVar.a(i).ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    String orderPizzeriaId = stateEntity.getOrderPizzeriaId();
                    if (orderPizzeriaId == null) {
                        orderPizzeriaId = d88.x.a().getId();
                    }
                    return new kk7.c(orderPizzeriaId);
                }
                throw new NoWhenBranchMatchedException();
            }
            String orderPizzeriaId2 = stateEntity.getOrderPizzeriaId();
            if (orderPizzeriaId2 == null) {
                orderPizzeriaId2 = d88.x.a().getId();
            }
            return new kk7.a(orderPizzeriaId2);
        }
        return b(stateEntity);
    }
}
