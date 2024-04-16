package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.cart.DataPaymentEntity;
import com.dodopizza.persistence.entity.cart.EncryptionDataEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.opendevice.c;
import defpackage.jw7;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.data.dto.response.OrderResponse;
/* compiled from: OrderStepFactory.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lwi7;", "Lvi7;", "Ljw7;", "paymentWay", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "state", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "Lui7;", "b", "Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity;", "paymentDetails", "Lys7;", c.a, "Lru/dodopizza/app/data/dto/response/OrderResponse;", "orderResponse", "a", "Lhq3;", "Lhq3;", "getFeatureService", "()Lhq3;", "featureService", "<init>", "(Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wi7  reason: default package */
/* loaded from: classes4.dex */
public final class wi7 implements vi7 {
    public static final a b = new a(null);
    private final hq3 a;

    /* compiled from: OrderStepFactory.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lwi7$a;", "", "", "MINUTE", "J", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wi7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public wi7(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        this.a = hq3Var;
    }

    private final ui7 b(jw7 jw7Var, StateEntity stateEntity, String str) {
        DataPaymentEntity dataPayment = stateEntity.getDataPayment();
        if (dataPayment == null) {
            dataPayment = new DataPaymentEntity(null, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, 131071, null);
        }
        return new fv6(str, c(dataPayment, jw7Var));
    }

    private final ys7 c(DataPaymentEntity dataPaymentEntity, jw7 jw7Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long invoiceExpirationInMinutes = dataPaymentEntity.getInvoiceExpirationInMinutes() * 60000;
        if (!(jw7Var instanceof jw7.e)) {
            str = "";
        } else {
            str = ((jw7.e) jw7Var).i().a();
        }
        String paymentId = dataPaymentEntity.getPaymentId();
        iw7 d = jw7Var.d();
        du7 c = jw7Var.c();
        String acquirerName = dataPaymentEntity.getAcquirerName();
        String authorizeUrl = dataPaymentEntity.getAuthorizeUrl();
        String redirectUrl = dataPaymentEntity.getRedirectUrl();
        String successUrl = dataPaymentEntity.getSuccessUrl();
        String failureUrl = dataPaymentEntity.getFailureUrl();
        String pizzeriaPaymentKey = dataPaymentEntity.getPizzeriaPaymentKey();
        Map<String, String> providerData = dataPaymentEntity.getProviderData();
        EncryptionDataEntity encryptionData = dataPaymentEntity.getEncryptionData();
        String str7 = null;
        if (encryptionData != null) {
            str2 = encryptionData.getTimestamp();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        EncryptionDataEntity encryptionData2 = dataPaymentEntity.getEncryptionData();
        if (encryptionData2 != null) {
            str4 = encryptionData2.getUuid();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        EncryptionDataEntity encryptionData3 = dataPaymentEntity.getEncryptionData();
        if (encryptionData3 != null) {
            str7 = encryptionData3.getMdorder();
        }
        if (str7 == null) {
            str6 = "";
        } else {
            str6 = str7;
        }
        return new ys7(paymentId, d, c, acquirerName, authorizeUrl, redirectUrl, successUrl, failureUrl, pizzeriaPaymentKey, providerData, invoiceExpirationInMinutes, new oh3(str3, str5, str6, null, null, null, null, null, 248, null), dataPaymentEntity.getGooglePayPaymentRequest(), str, dt7.a.b(dataPaymentEntity.getIntegrationType()));
    }

    @Override // defpackage.vi7
    public ui7 a(OrderResponse orderResponse, jw7 jw7Var) {
        String str;
        z65.h(orderResponse, "orderResponse");
        z65.h(jw7Var, "paymentWay");
        Integer step = orderResponse.getState().getStep();
        String workflowId = orderResponse.getState().getWorkflowId();
        StateEntity state = orderResponse.getState();
        if (step != null && step.intValue() == 2) {
            return new ps8(state);
        }
        if (step != null && step.intValue() == 4) {
            return b(jw7Var, state, workflowId);
        }
        if (step != null && step.intValue() == 5) {
            return new mp7(workflowId);
        }
        if (step != null && step.intValue() == 3) {
            bc7 createdOrder = orderResponse.getCreatedOrder();
            if (createdOrder != null) {
                str = createdOrder.t();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            return new ib8(workflowId, str);
        } else if (step != null && step.intValue() == 6) {
            return new ro3(state);
        } else {
            throw new IllegalStateException("Unsupported order step = " + step);
        }
    }
}
