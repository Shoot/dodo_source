package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.PaymentEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: PaymentRepository.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lyv7;", "Lsg9;", "Los7;", "Lcom/dodopizza/persistence/entity/PaymentEntity;", "entity", DateTokenConverter.CONVERTER_KEY, "model", c.a, "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yv7  reason: default package */
/* loaded from: classes2.dex */
public final class yv7 implements sg9<os7, PaymentEntity> {
    public static final yv7 a = new yv7();

    private yv7() {
    }

    @Override // defpackage.sg9
    /* renamed from: c */
    public PaymentEntity a(os7 os7Var) {
        z65.h(os7Var, "model");
        pp0 c = os7Var.c();
        if (c instanceof lu6) {
            return new PaymentEntity(os7Var.a(), null, os7Var.e(), os7Var.b(), os7Var.d().name(), PaymentEntity.SCENARIO_NATIVE, ((lu6) os7Var.c()).a(), null, null, null, ((lu6) os7Var.c()).b(), null, null, ((lu6) os7Var.c()).c(), null, null, 56194, null);
        } else if (c instanceof j4c) {
            return new PaymentEntity(os7Var.a(), null, os7Var.e(), os7Var.b(), os7Var.d().name(), PaymentEntity.SCENARIO_WEB_VIEW, null, ((j4c) os7Var.c()).c(), ((j4c) os7Var.c()).d(), ((j4c) os7Var.c()).a(), null, null, null, ((j4c) os7Var.c()).b(), null, null, 56386, null);
        } else if (c instanceof ap2) {
            return new PaymentEntity(os7Var.a(), null, os7Var.e(), os7Var.b(), os7Var.d().name(), PaymentEntity.SCENARIO_DEEP_LINK, null, ((ap2) os7Var.c()).a(), null, null, null, null, null, 0L, null, null, 65346, null);
        } else {
            if (c instanceof ch4) {
                return new PaymentEntity(os7Var.a(), null, os7Var.e(), os7Var.b(), os7Var.d().name(), PaymentEntity.SCENARIO_GOOGLE_PAY, null, null, null, null, null, ((ch4) os7Var.c()).c(), ((ch4) os7Var.c()).b(), 0L, ((ch4) os7Var.c()).d(), ((ch4) os7Var.c()).a(), 10178, null);
            }
            if (c instanceof ht9) {
                return new PaymentEntity(os7Var.a(), null, os7Var.e(), os7Var.b(), os7Var.d().name(), PaymentEntity.SCENARIO_SAVED_CARD, null, null, null, null, null, null, null, 0L, null, null, 65474, null);
            }
            if (c instanceof au9) {
                return new PaymentEntity(os7Var.a(), null, os7Var.e(), os7Var.b(), os7Var.d().name(), PaymentEntity.SCENARIO_SBER_PAY, null, null, null, null, null, null, null, 0L, null, null, 65474, null);
            }
            if (c instanceof um) {
                return new PaymentEntity(os7Var.a(), null, os7Var.e(), os7Var.b(), os7Var.d().name(), PaymentEntity.SCENARIO_KASPI_PAY, null, null, null, null, null, null, null, 0L, null, null, 65474, null);
            }
            if (c instanceof bv9) {
                return new PaymentEntity(os7Var.a(), null, os7Var.e(), os7Var.b(), os7Var.d().name(), PaymentEntity.SCENARIO_SBP, null, null, null, null, null, null, null, 0L, null, null, 65474, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // defpackage.sg9
    /* renamed from: d */
    public os7 b(PaymentEntity paymentEntity) {
        pp0 ap2Var;
        z65.h(paymentEntity, "entity");
        String paymentScenario = paymentEntity.getPaymentScenario();
        switch (paymentScenario.hashCode()) {
            case -1980522643:
                if (paymentScenario.equals(PaymentEntity.SCENARIO_DEEP_LINK)) {
                    String paymentScenarioRedirectUrl = paymentEntity.getPaymentScenarioRedirectUrl();
                    z65.e(paymentScenarioRedirectUrl);
                    ap2Var = new ap2(paymentScenarioRedirectUrl);
                    pp0 pp0Var = ap2Var;
                    String id = paymentEntity.getId();
                    z65.e(id);
                    return new os7(id, paymentEntity.getWorkflowId(), paymentEntity.getProvider(), gw7.valueOf(paymentEntity.getStatus()), pp0Var);
                }
                String paymentScenario2 = paymentEntity.getPaymentScenario();
                throw new IllegalArgumentException("Can't convert payment scenario with code " + paymentScenario2);
            case -1659460315:
                if (paymentScenario.equals(PaymentEntity.SCENARIO_SBER_PAY)) {
                    ap2Var = au9.a;
                    pp0 pp0Var2 = ap2Var;
                    String id2 = paymentEntity.getId();
                    z65.e(id2);
                    return new os7(id2, paymentEntity.getWorkflowId(), paymentEntity.getProvider(), gw7.valueOf(paymentEntity.getStatus()), pp0Var2);
                }
                String paymentScenario22 = paymentEntity.getPaymentScenario();
                throw new IllegalArgumentException("Can't convert payment scenario with code " + paymentScenario22);
            case -1534821982:
                if (paymentScenario.equals(PaymentEntity.SCENARIO_GOOGLE_PAY)) {
                    String paymentScenarioMerchantId = paymentEntity.getPaymentScenarioMerchantId();
                    z65.e(paymentScenarioMerchantId);
                    String paymentScenarioGateway = paymentEntity.getPaymentScenarioGateway();
                    z65.e(paymentScenarioGateway);
                    String paymentScenarioGooglePayString = paymentEntity.getPaymentScenarioGooglePayString();
                    String str = "";
                    if (paymentScenarioGooglePayString == null) {
                        paymentScenarioGooglePayString = "";
                    }
                    String paymentScenarioGooglePayEnv = paymentEntity.getPaymentScenarioGooglePayEnv();
                    if (paymentScenarioGooglePayEnv != null) {
                        str = paymentScenarioGooglePayEnv;
                    }
                    ap2Var = new ch4(paymentScenarioMerchantId, paymentScenarioGateway, paymentScenarioGooglePayString, str);
                    pp0 pp0Var22 = ap2Var;
                    String id22 = paymentEntity.getId();
                    z65.e(id22);
                    return new os7(id22, paymentEntity.getWorkflowId(), paymentEntity.getProvider(), gw7.valueOf(paymentEntity.getStatus()), pp0Var22);
                }
                String paymentScenario222 = paymentEntity.getPaymentScenario();
                throw new IllegalArgumentException("Can't convert payment scenario with code " + paymentScenario222);
            case -1052618729:
                if (paymentScenario.equals(PaymentEntity.SCENARIO_NATIVE)) {
                    long paymentScenarioLifetime = paymentEntity.getPaymentScenarioLifetime();
                    String paymentScenarioAuthorizeUrl = paymentEntity.getPaymentScenarioAuthorizeUrl();
                    z65.e(paymentScenarioAuthorizeUrl);
                    String paymentScenarioPublicKey = paymentEntity.getPaymentScenarioPublicKey();
                    z65.e(paymentScenarioPublicKey);
                    ap2Var = new lu6(paymentScenarioLifetime, paymentScenarioAuthorizeUrl, paymentScenarioPublicKey);
                    pp0 pp0Var222 = ap2Var;
                    String id222 = paymentEntity.getId();
                    z65.e(id222);
                    return new os7(id222, paymentEntity.getWorkflowId(), paymentEntity.getProvider(), gw7.valueOf(paymentEntity.getStatus()), pp0Var222);
                }
                String paymentScenario2222 = paymentEntity.getPaymentScenario();
                throw new IllegalArgumentException("Can't convert payment scenario with code " + paymentScenario2222);
            case -718398288:
                if (paymentScenario.equals(PaymentEntity.SCENARIO_WEB_VIEW)) {
                    long paymentScenarioLifetime2 = paymentEntity.getPaymentScenarioLifetime();
                    String paymentScenarioSuccessUrl = paymentEntity.getPaymentScenarioSuccessUrl();
                    z65.e(paymentScenarioSuccessUrl);
                    String paymentScenarioFailureUrl = paymentEntity.getPaymentScenarioFailureUrl();
                    z65.e(paymentScenarioFailureUrl);
                    String paymentScenarioRedirectUrl2 = paymentEntity.getPaymentScenarioRedirectUrl();
                    z65.e(paymentScenarioRedirectUrl2);
                    ap2Var = new j4c(paymentScenarioLifetime2, paymentScenarioSuccessUrl, paymentScenarioFailureUrl, paymentScenarioRedirectUrl2);
                    pp0 pp0Var2222 = ap2Var;
                    String id2222 = paymentEntity.getId();
                    z65.e(id2222);
                    return new os7(id2222, paymentEntity.getWorkflowId(), paymentEntity.getProvider(), gw7.valueOf(paymentEntity.getStatus()), pp0Var2222);
                }
                String paymentScenario22222 = paymentEntity.getPaymentScenario();
                throw new IllegalArgumentException("Can't convert payment scenario with code " + paymentScenario22222);
            case -580104833:
                if (paymentScenario.equals(PaymentEntity.SCENARIO_KASPI_PAY)) {
                    ap2Var = um.a;
                    pp0 pp0Var22222 = ap2Var;
                    String id22222 = paymentEntity.getId();
                    z65.e(id22222);
                    return new os7(id22222, paymentEntity.getWorkflowId(), paymentEntity.getProvider(), gw7.valueOf(paymentEntity.getStatus()), pp0Var22222);
                }
                String paymentScenario222222 = paymentEntity.getPaymentScenario();
                throw new IllegalArgumentException("Can't convert payment scenario with code " + paymentScenario222222);
            case 113665:
                if (paymentScenario.equals(PaymentEntity.SCENARIO_SBP)) {
                    ap2Var = bv9.a;
                    pp0 pp0Var222222 = ap2Var;
                    String id222222 = paymentEntity.getId();
                    z65.e(id222222);
                    return new os7(id222222, paymentEntity.getWorkflowId(), paymentEntity.getProvider(), gw7.valueOf(paymentEntity.getStatus()), pp0Var222222);
                }
                String paymentScenario2222222 = paymentEntity.getPaymentScenario();
                throw new IllegalArgumentException("Can't convert payment scenario with code " + paymentScenario2222222);
            case 1536803272:
                if (paymentScenario.equals(PaymentEntity.SCENARIO_SAVED_CARD)) {
                    ap2Var = ht9.a;
                    pp0 pp0Var2222222 = ap2Var;
                    String id2222222 = paymentEntity.getId();
                    z65.e(id2222222);
                    return new os7(id2222222, paymentEntity.getWorkflowId(), paymentEntity.getProvider(), gw7.valueOf(paymentEntity.getStatus()), pp0Var2222222);
                }
                String paymentScenario22222222 = paymentEntity.getPaymentScenario();
                throw new IllegalArgumentException("Can't convert payment scenario with code " + paymentScenario22222222);
            default:
                String paymentScenario222222222 = paymentEntity.getPaymentScenario();
                throw new IllegalArgumentException("Can't convert payment scenario with code " + paymentScenario222222222);
        }
    }
}
