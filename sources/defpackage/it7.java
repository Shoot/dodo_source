package defpackage;

import com.dodopizza.persistence.entity.payment.PaymentMethodEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PaymentMethodFilter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lit7;", "", "", "Lcom/dodopizza/persistence/entity/payment/PaymentMethodEntity;", "paymentMethods", "a", "", "Ldu7;", "b", "Ljava/util/List;", "UNSUPPORTED_PAYMENT_METHODS", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: it7  reason: default package */
/* loaded from: classes2.dex */
public final class it7 {
    public static final it7 a = new it7();
    private static final List<du7> b;

    static {
        List<du7> o;
        o = kc1.o(du7.i, du7.e);
        b = o;
    }

    private it7() {
    }

    public final Collection<PaymentMethodEntity> a(Collection<? extends PaymentMethodEntity> collection) {
        z65.h(collection, "paymentMethods");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (!b.contains(du7.b.a(Integer.valueOf(((PaymentMethodEntity) obj).getPaymentType())))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
