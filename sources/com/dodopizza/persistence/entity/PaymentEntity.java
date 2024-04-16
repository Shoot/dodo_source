package com.dodopizza.persistence.entity;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\t\n\u0002\b\u0010\b\u0017\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B»\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b;\u0010<R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u0016\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR$\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR$\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR$\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR$\u0010\"\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0005\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR$\u0010%\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0005\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR$\u0010(\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0005\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR$\u0010+\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0005\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\"\u0010/\u001a\u00020.8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0005\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR$\u00108\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0005\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\t¨\u0006>"}, d2 = {"Lcom/dodopizza/persistence/entity/PaymentEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "transactionId", "getTransactionId", "setTransactionId", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "getWorkflowId", "setWorkflowId", "provider", "getProvider", "setProvider", "status", "getStatus", "setStatus", "paymentScenario", "getPaymentScenario", "setPaymentScenario", "paymentScenarioAuthorizeUrl", "getPaymentScenarioAuthorizeUrl", "setPaymentScenarioAuthorizeUrl", "paymentScenarioRedirectUrl", "getPaymentScenarioRedirectUrl", "setPaymentScenarioRedirectUrl", "paymentScenarioSuccessUrl", "getPaymentScenarioSuccessUrl", "setPaymentScenarioSuccessUrl", "paymentScenarioFailureUrl", "getPaymentScenarioFailureUrl", "setPaymentScenarioFailureUrl", "paymentScenarioPublicKey", "getPaymentScenarioPublicKey", "setPaymentScenarioPublicKey", "paymentScenarioMerchantId", "getPaymentScenarioMerchantId", "setPaymentScenarioMerchantId", "paymentScenarioGateway", "getPaymentScenarioGateway", "setPaymentScenarioGateway", "", "paymentScenarioLifetime", "J", "getPaymentScenarioLifetime", "()J", "setPaymentScenarioLifetime", "(J)V", "paymentScenarioGooglePayString", "getPaymentScenarioGooglePayString", "setPaymentScenarioGooglePayString", "paymentScenarioGooglePayEnv", "getPaymentScenarioGooglePayEnv", "setPaymentScenarioGooglePayEnv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PaymentEntity extends n0 implements yi3, yec {
    public static final Companion Companion = new Companion(null);
    public static final String SCENARIO_DEEP_LINK = "deep_link";
    public static final String SCENARIO_GOOGLE_PAY = "google_pay";
    public static final String SCENARIO_KASPI_PAY = "kaspi_pay";
    public static final String SCENARIO_NATIVE = "native";
    public static final String SCENARIO_SAVED_CARD = "saved_card";
    public static final String SCENARIO_SBER_PAY = "sber_pay";
    public static final String SCENARIO_SBP = "sbp";
    public static final String SCENARIO_WEB_VIEW = "web_view";
    private String id;
    private String paymentScenario;
    private String paymentScenarioAuthorizeUrl;
    private String paymentScenarioFailureUrl;
    private String paymentScenarioGateway;
    private String paymentScenarioGooglePayEnv;
    private String paymentScenarioGooglePayString;
    private long paymentScenarioLifetime;
    private String paymentScenarioMerchantId;
    private String paymentScenarioPublicKey;
    private String paymentScenarioRedirectUrl;
    private String paymentScenarioSuccessUrl;
    private String provider;
    private String status;
    private String transactionId;
    private String workflowId;

    /* compiled from: PaymentEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/dodopizza/persistence/entity/PaymentEntity$Companion;", "", "()V", "SCENARIO_DEEP_LINK", "", "SCENARIO_GOOGLE_PAY", "SCENARIO_KASPI_PAY", "SCENARIO_NATIVE", "SCENARIO_SAVED_CARD", "SCENARIO_SBER_PAY", "SCENARIO_SBP", "SCENARIO_WEB_VIEW", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PaymentEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, 65535, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getPaymentScenario() {
        return realmGet$paymentScenario();
    }

    public String getPaymentScenarioAuthorizeUrl() {
        return realmGet$paymentScenarioAuthorizeUrl();
    }

    public String getPaymentScenarioFailureUrl() {
        return realmGet$paymentScenarioFailureUrl();
    }

    public String getPaymentScenarioGateway() {
        return realmGet$paymentScenarioGateway();
    }

    public String getPaymentScenarioGooglePayEnv() {
        return realmGet$paymentScenarioGooglePayEnv();
    }

    public String getPaymentScenarioGooglePayString() {
        return realmGet$paymentScenarioGooglePayString();
    }

    public long getPaymentScenarioLifetime() {
        return realmGet$paymentScenarioLifetime();
    }

    public String getPaymentScenarioMerchantId() {
        return realmGet$paymentScenarioMerchantId();
    }

    public String getPaymentScenarioPublicKey() {
        return realmGet$paymentScenarioPublicKey();
    }

    public String getPaymentScenarioRedirectUrl() {
        return realmGet$paymentScenarioRedirectUrl();
    }

    public String getPaymentScenarioSuccessUrl() {
        return realmGet$paymentScenarioSuccessUrl();
    }

    public String getProvider() {
        return realmGet$provider();
    }

    public String getStatus() {
        return realmGet$status();
    }

    public String getTransactionId() {
        return realmGet$transactionId();
    }

    public String getWorkflowId() {
        return realmGet$workflowId();
    }

    @Override // defpackage.yec
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.yec
    public String realmGet$paymentScenario() {
        return this.paymentScenario;
    }

    @Override // defpackage.yec
    public String realmGet$paymentScenarioAuthorizeUrl() {
        return this.paymentScenarioAuthorizeUrl;
    }

    @Override // defpackage.yec
    public String realmGet$paymentScenarioFailureUrl() {
        return this.paymentScenarioFailureUrl;
    }

    @Override // defpackage.yec
    public String realmGet$paymentScenarioGateway() {
        return this.paymentScenarioGateway;
    }

    @Override // defpackage.yec
    public String realmGet$paymentScenarioGooglePayEnv() {
        return this.paymentScenarioGooglePayEnv;
    }

    @Override // defpackage.yec
    public String realmGet$paymentScenarioGooglePayString() {
        return this.paymentScenarioGooglePayString;
    }

    @Override // defpackage.yec
    public long realmGet$paymentScenarioLifetime() {
        return this.paymentScenarioLifetime;
    }

    @Override // defpackage.yec
    public String realmGet$paymentScenarioMerchantId() {
        return this.paymentScenarioMerchantId;
    }

    @Override // defpackage.yec
    public String realmGet$paymentScenarioPublicKey() {
        return this.paymentScenarioPublicKey;
    }

    @Override // defpackage.yec
    public String realmGet$paymentScenarioRedirectUrl() {
        return this.paymentScenarioRedirectUrl;
    }

    @Override // defpackage.yec
    public String realmGet$paymentScenarioSuccessUrl() {
        return this.paymentScenarioSuccessUrl;
    }

    @Override // defpackage.yec
    public String realmGet$provider() {
        return this.provider;
    }

    @Override // defpackage.yec
    public String realmGet$status() {
        return this.status;
    }

    @Override // defpackage.yec
    public String realmGet$transactionId() {
        return this.transactionId;
    }

    @Override // defpackage.yec
    public String realmGet$workflowId() {
        return this.workflowId;
    }

    @Override // defpackage.yec
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.yec
    public void realmSet$paymentScenario(String str) {
        this.paymentScenario = str;
    }

    @Override // defpackage.yec
    public void realmSet$paymentScenarioAuthorizeUrl(String str) {
        this.paymentScenarioAuthorizeUrl = str;
    }

    @Override // defpackage.yec
    public void realmSet$paymentScenarioFailureUrl(String str) {
        this.paymentScenarioFailureUrl = str;
    }

    @Override // defpackage.yec
    public void realmSet$paymentScenarioGateway(String str) {
        this.paymentScenarioGateway = str;
    }

    @Override // defpackage.yec
    public void realmSet$paymentScenarioGooglePayEnv(String str) {
        this.paymentScenarioGooglePayEnv = str;
    }

    @Override // defpackage.yec
    public void realmSet$paymentScenarioGooglePayString(String str) {
        this.paymentScenarioGooglePayString = str;
    }

    @Override // defpackage.yec
    public void realmSet$paymentScenarioLifetime(long j) {
        this.paymentScenarioLifetime = j;
    }

    @Override // defpackage.yec
    public void realmSet$paymentScenarioMerchantId(String str) {
        this.paymentScenarioMerchantId = str;
    }

    @Override // defpackage.yec
    public void realmSet$paymentScenarioPublicKey(String str) {
        this.paymentScenarioPublicKey = str;
    }

    @Override // defpackage.yec
    public void realmSet$paymentScenarioRedirectUrl(String str) {
        this.paymentScenarioRedirectUrl = str;
    }

    @Override // defpackage.yec
    public void realmSet$paymentScenarioSuccessUrl(String str) {
        this.paymentScenarioSuccessUrl = str;
    }

    @Override // defpackage.yec
    public void realmSet$provider(String str) {
        this.provider = str;
    }

    @Override // defpackage.yec
    public void realmSet$status(String str) {
        this.status = str;
    }

    @Override // defpackage.yec
    public void realmSet$transactionId(String str) {
        this.transactionId = str;
    }

    @Override // defpackage.yec
    public void realmSet$workflowId(String str) {
        this.workflowId = str;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setPaymentScenario(String str) {
        z65.h(str, "<set-?>");
        realmSet$paymentScenario(str);
    }

    public void setPaymentScenarioAuthorizeUrl(String str) {
        realmSet$paymentScenarioAuthorizeUrl(str);
    }

    public void setPaymentScenarioFailureUrl(String str) {
        realmSet$paymentScenarioFailureUrl(str);
    }

    public void setPaymentScenarioGateway(String str) {
        realmSet$paymentScenarioGateway(str);
    }

    public void setPaymentScenarioGooglePayEnv(String str) {
        realmSet$paymentScenarioGooglePayEnv(str);
    }

    public void setPaymentScenarioGooglePayString(String str) {
        realmSet$paymentScenarioGooglePayString(str);
    }

    public void setPaymentScenarioLifetime(long j) {
        realmSet$paymentScenarioLifetime(j);
    }

    public void setPaymentScenarioMerchantId(String str) {
        realmSet$paymentScenarioMerchantId(str);
    }

    public void setPaymentScenarioPublicKey(String str) {
        realmSet$paymentScenarioPublicKey(str);
    }

    public void setPaymentScenarioRedirectUrl(String str) {
        realmSet$paymentScenarioRedirectUrl(str);
    }

    public void setPaymentScenarioSuccessUrl(String str) {
        realmSet$paymentScenarioSuccessUrl(str);
    }

    public void setProvider(String str) {
        z65.h(str, "<set-?>");
        realmSet$provider(str);
    }

    public void setStatus(String str) {
        z65.h(str, "<set-?>");
        realmSet$status(str);
    }

    public void setTransactionId(String str) {
        z65.h(str, "<set-?>");
        realmSet$transactionId(str);
    }

    public void setWorkflowId(String str) {
        z65.h(str, "<set-?>");
        realmSet$workflowId(str);
    }

    public /* synthetic */ PaymentEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? 0L : j, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PaymentEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, String str14, String str15) {
        z65.h(str2, "transactionId");
        z65.h(str3, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(str4, "provider");
        z65.h(str5, "status");
        z65.h(str6, "paymentScenario");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$transactionId(str2);
        realmSet$workflowId(str3);
        realmSet$provider(str4);
        realmSet$status(str5);
        realmSet$paymentScenario(str6);
        realmSet$paymentScenarioAuthorizeUrl(str7);
        realmSet$paymentScenarioRedirectUrl(str8);
        realmSet$paymentScenarioSuccessUrl(str9);
        realmSet$paymentScenarioFailureUrl(str10);
        realmSet$paymentScenarioPublicKey(str11);
        realmSet$paymentScenarioMerchantId(str12);
        realmSet$paymentScenarioGateway(str13);
        realmSet$paymentScenarioLifetime(j);
        realmSet$paymentScenarioGooglePayString(str14);
        realmSet$paymentScenarioGooglePayEnv(str15);
    }
}
