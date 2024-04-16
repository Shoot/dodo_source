package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CreateComboOrder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0003B#\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Ld22;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "state", "b", "Ljava/lang/Integer;", "orderNumber", "Ld88;", c.a, "Ld88;", "pizzeria", "<init>", "(Lcom/dodopizza/persistence/entity/cart/StateEntity;Ljava/lang/Integer;Ld88;)V", DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d22  reason: default package */
/* loaded from: classes4.dex */
public final class d22 implements dc {
    public static final a d = new a(null);
    private final StateEntity a;
    private final Integer b;
    private final d88 c;

    /* compiled from: CreateComboOrder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Ld22$a;", "", "", "AF_CURRENCY_PARAM", "Ljava/lang/String;", "AF_ORDER_ID_PARAM", "AF_REVENUE_PARAM", "CREATE_ORDER_COMBO", "CURRENCY_PARAM", "DISCOUNT_PRICE_PARAM", "ORDER_NUMBER_PARAM", "PAYMENT_TYPE_PARAM", "PROMOCODE_PARAM", "REVENUE_PARAM", "TRANSACTION_ID_PARAM", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d22$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d22(StateEntity stateEntity, Integer num, d88 d88Var) {
        z65.h(stateEntity, "state");
        this.a = stateEntity;
        this.b = num;
        this.c = d88Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3 == null) goto L30;
     */
    @Override // defpackage.dc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.qc a() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d22.a():qc");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d22)) {
            return false;
        }
        d22 d22Var = (d22) obj;
        if (z65.c(this.a, d22Var.a) && z65.c(this.b, d22Var.b) && z65.c(this.c, d22Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Integer num = this.b;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        d88 d88Var = this.c;
        if (d88Var != null) {
            i = d88Var.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StateEntity stateEntity = this.a;
        Integer num = this.b;
        d88 d88Var = this.c;
        return "CreateComboOrder(state=" + stateEntity + ", orderNumber=" + num + ", pizzeria=" + d88Var + ")";
    }
}
