package defpackage;

import com.dodopizza.persistence.entity.cart.DataPaymentEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.opendevice.c;
import defpackage.du7;
import kotlin.Metadata;
/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0004H\u0000¨\u0006\b"}, d2 = {"", "paymentType", "", c.a, "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "Ldu7;", "a", "b", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: wn3  reason: default package */
/* loaded from: classes4.dex */
public final class wn3 {

    /* compiled from: Extensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wn3$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[iw7.values().length];
            try {
                iArr[iw7.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iw7.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[iw7.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final du7 a(StateEntity stateEntity) {
        Integer num;
        z65.h(stateEntity, "<this>");
        du7.a aVar = du7.b;
        DataPaymentEntity dataPayment = stateEntity.getDataPayment();
        if (dataPayment != null) {
            num = Integer.valueOf(dataPayment.getPaymentMethodType());
        } else {
            num = null;
        }
        return aVar.a(num);
    }

    public static final String b(StateEntity stateEntity) {
        z65.h(stateEntity, "<this>");
        if (stateEntity.getDeliveryAddressEntity() == null && stateEntity.getClientDeliveryLocationEntity() == null) {
            return "carryout";
        }
        return "delivery";
    }

    public static final String c(int i) {
        int i2 = a.$EnumSwitchMapping$0[iw7.b.a(i).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return "other";
                }
                return "card";
            }
            return "dodorubles";
        }
        return "cash";
    }
}
