package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.checkout.CheckoutApi;
import com.dodopizza.ospayments.PaymentsOSApi;
import com.dodopizza.persistence.entity.payment.CardEntity;
import com.dodopizza.persistence.entity.payment.PaymentMethodEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.b77;
import defpackage.mk2;
import defpackage.xb;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import ru.dodopizza.backend.domain.clientcard.ClientCardAPI;
import ru.dodopizza.backend.domain.payment.PaymentAPI;
/* compiled from: PaymentModule.kt */
@Metadata(d1 = {"\u0000ì\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\bH\u0007J0\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J8\u0010$\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0007J \u0010+\u001a\u00020\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0007J\u0018\u0010.\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0007J\b\u0010/\u001a\u00020,H\u0007J\u0018\u00103\u001a\u00020'2\u0006\u0010(\u001a\u0002002\u0006\u00102\u001a\u000201H\u0007J\b\u00104\u001a\u00020\u001eH\u0007J\u0010\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0007J \u0010?\u001a\u00020>2\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0007J\b\u0010@\u001a\u00020<H\u0007J\b\u0010A\u001a\u00020:H\u0007JB\u0010K\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020>2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\b\b\u0001\u0010J\u001a\u00020IH\u0007J\u0018\u0010P\u001a\u00020E2\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0007J\u0010\u0010Q\u001a\u00020G2\u0006\u0010M\u001a\u00020LH\u0007J\u0010\u0010T\u001a\u00020N2\u0006\u0010S\u001a\u00020RH\u0007J\b\u0010V\u001a\u00020UH\u0007J\u0018\u0010[\u001a\u00020Z2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020UH\u0007J\b\u0010]\u001a\u00020\\H\u0007J(\u0010f\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020b2\u0006\u0010e\u001a\u00020dH\u0007J\u0010\u0010i\u001a\u00020 2\u0006\u0010h\u001a\u00020gH\u0007J\b\u0010j\u001a\u00020gH\u0007J \u0010r\u001a\u00020q2\u0006\u0010l\u001a\u00020k2\u0006\u0010n\u001a\u00020m2\u0006\u0010p\u001a\u00020oH\u0007J\u0012\u0010t\u001a\u00020^2\b\b\u0001\u0010s\u001a\u00020qH\u0007J\u0010\u0010u\u001a\u00020q2\u0006\u0010p\u001a\u00020oH\u0007J\u0012\u0010v\u001a\u00020d2\b\b\u0001\u0010s\u001a\u00020qH\u0007J\u0010\u0010w\u001a\u00020q2\u0006\u0010p\u001a\u00020oH\u0007J\u0012\u0010x\u001a\u00020b2\b\b\u0001\u0010s\u001a\u00020qH\u0007J\u000e\u0010{\u001a\b\u0012\u0004\u0012\u00020z0yH\u0007J\u0018\u0010}\u001a\u00020C2\u000e\b\u0001\u0010|\u001a\b\u0012\u0004\u0012\u00020z0yH\u0007J\u0011\u0010\u0080\u0001\u001a\u00020\u00192\u0006\u0010\u007f\u001a\u00020~H\u0007J\u001a\u0010\u0082\u0001\u001a\u00020\r2\u0006\u0010\u007f\u001a\u00020~2\u0007\u0010\u0081\u0001\u001a\u00020ZH\u0007J\u0011\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010\u007f\u001a\u00020~H\u0007J\t\u0010\u0084\u0001\u001a\u00020IH\u0007J\t\u0010\u0085\u0001\u001a\u00020WH\u0007J\n\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0007J\u0014\u0010\u008a\u0001\u001a\u00030\u0089\u00012\b\u0010\u0088\u0001\u001a\u00030\u0086\u0001H\u0007J\u0014\u0010\u008c\u0001\u001a\u00030\u008b\u00012\b\u0010\u0088\u0001\u001a\u00030\u0086\u0001H\u0007J\n\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0007R\u0016\u0010\u0090\u0001\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bf\u0010\u008f\u0001R\u0016\u0010\u0091\u0001\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010\u008f\u0001¨\u0006\u0094\u0001"}, d2 = {"Lgu7;", "", "Lru/dodopizza/backend/domain/payment/PaymentAPI;", "paymentApi", "Lls7;", "responseDtoMapper", "Lbu9;", "P", "Lks7;", "Lvm;", "u", "A", "z", "Lqw7;", "paymentWayRepository", "Lsp0;", "cardRepository", "Lru/dodopizza/backend/domain/clientcard/ClientCardAPI;", "clientCardAPI", "Lvo0;", "cardChargeService", "Ltw7;", "paymentWayService", "Lew7;", "E", "Lxv7;", "paymentRepository", "paymentAPI", "Lq4;", "acquirerRegistry", "Lat7;", "paymentFactory", "Lsh3;", "encryptionDataConverterRegistry", "Ls56;", "makePaymentService", "f", "Lme8;", "pollingPaymentStatusService", "Lq56;", "analytics", "Lan;", "appBackgroundStateDetector", "w", "Lw65;", "intervalWaiter", "L", "t", "Lgc;", "Lava;", "stateProvider", "v", "B", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lfh4;", Image.TYPE_SMALL, "googlePaymentsClientWrapper", "Lkh4;", "googleRequestCreator", "Lzg4;", "googlePayIsReadyRequestCreator", "Ldh4;", "r", "p", "q", "googlePaymentService", "Lkw7;", "paymentWayAcquirerFilter", "Lut9;", "sberPayFeatureStateResolver", "Lrm;", "app2AppFeatureStateResolver", "", "isNewCardPaymentSupported", "J", "Lhq3;", "featureService", "Lcu9;", "sberPayDeepLinkIntentChecker", "N", e.a, "Landroid/content/pm/PackageManager;", "packageManager", "M", "Lxg4;", "o", "Lnw7;", "paymentWayFactory", "googlePayInitDataMapper", "Low7;", "H", "Lit7;", "C", "Lcom/dodopizza/ospayments/PaymentsOSApi;", "paymentsOSApi", "Lub3;", "ecommPayApiBuilderFactory", "Lcom/dodopizza/checkout/CheckoutApi;", "checkoutApi", "Lxb$a;", "allSecureapi", "b", "Lqh3;", "encryptionDataConverterFactory", "k", "j", "Lp80;", "baseUrlProvider", "Lxj3;", "environmentResolver", "Lrn2;", "debugOkHttpClientConfigurator", "Lb77;", "y", "okHttpClient", "K", DateTokenConverter.CONVERTER_KEY, c.a, "i", Image.TYPE_HIGH, "", "", "a", "acquirers", "F", "Ljk2;", "daoFactory", "D", "paymentWayMapper", "I", "g", "x", "G", "Lsg4;", "l", "googlePay", "Lug4;", "n", "Ltg4;", Image.TYPE_MEDIUM, "Lwt9;", "O", "Ljava/lang/String;", "allSecureApiBaseUrl", "checkoutApiBaseUrl", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gu7  reason: default package */
/* loaded from: classes3.dex */
public final class gu7 {
    public static final gu7 a = new gu7();
    private static final String b = "https://asxgw.com";
    private static final String c = "https://api.checkout.com/";

    private gu7() {
    }

    public final ls7 A() {
        return new ls7();
    }

    public final at7 B() {
        return new bt7(dw7.a);
    }

    public final it7 C() {
        return it7.a;
    }

    public final xv7 D(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return new zv7(jk2Var);
    }

    public final ew7 E(qw7 qw7Var, sp0 sp0Var, ClientCardAPI clientCardAPI, vo0 vo0Var, tw7 tw7Var) {
        z65.h(qw7Var, "paymentWayRepository");
        z65.h(sp0Var, "cardRepository");
        z65.h(clientCardAPI, "clientCardAPI");
        z65.h(vo0Var, "cardChargeService");
        z65.h(tw7Var, "paymentWayService");
        return new fw7(qw7Var, sp0Var, clientCardAPI, vo0Var, tw7Var);
    }

    public final kw7 F(Collection<String> collection) {
        z65.h(collection, "acquirers");
        return new lw7(collection);
    }

    public final nw7 G() {
        return nw7.a;
    }

    public final ow7 H(nw7 nw7Var, xg4 xg4Var) {
        z65.h(nw7Var, "paymentWayFactory");
        z65.h(xg4Var, "googlePayInitDataMapper");
        return new pw7(nw7Var, xg4Var);
    }

    public final qw7 I(jk2 jk2Var, ow7 ow7Var) {
        z65.h(jk2Var, "daoFactory");
        z65.h(ow7Var, "paymentWayMapper");
        return new rw7(jk2Var.a(bc9.b(PaymentMethodEntity.class), mk2.b.a), ow7Var);
    }

    public final tw7 J(qw7 qw7Var, sp0 sp0Var, dh4 dh4Var, kw7 kw7Var, ut9 ut9Var, rm rmVar, boolean z) {
        z65.h(qw7Var, "paymentWayRepository");
        z65.h(sp0Var, "cardRepository");
        z65.h(dh4Var, "googlePaymentService");
        z65.h(kw7Var, "paymentWayAcquirerFilter");
        z65.h(ut9Var, "sberPayFeatureStateResolver");
        z65.h(rmVar, "app2AppFeatureStateResolver");
        return new uw7(qw7Var, sp0Var, dh4Var, ut9Var, rmVar, kw7Var, z);
    }

    public final PaymentsOSApi K(b77 b77Var) {
        z65.h(b77Var, "okHttpClient");
        Object create = new Retrofit.Builder().baseUrl("https://api.paymentsos.com/").addCallAdapterFactory(y3b.a()).addConverterFactory(GsonConverterFactory.create()).client(b77Var).build().create(PaymentsOSApi.class);
        z65.g(create, "create(...)");
        return (PaymentsOSApi) create;
    }

    public final me8 L(PaymentAPI paymentAPI, w65 w65Var) {
        z65.h(paymentAPI, "paymentAPI");
        z65.h(w65Var, "intervalWaiter");
        return new ne8(paymentAPI, w65Var);
    }

    public final cu9 M(PackageManager packageManager) {
        z65.h(packageManager, "packageManager");
        return new cu9(packageManager);
    }

    public final ut9 N(hq3 hq3Var, cu9 cu9Var) {
        z65.h(hq3Var, "featureService");
        z65.h(cu9Var, "sberPayDeepLinkIntentChecker");
        return new vt9(hq3Var, cu9Var);
    }

    public final wt9 O() {
        return new xt9();
    }

    public final bu9 P(PaymentAPI paymentAPI, ls7 ls7Var) {
        z65.h(paymentAPI, "paymentApi");
        z65.h(ls7Var, "responseDtoMapper");
        return new bu9(paymentAPI, ls7Var);
    }

    public final Collection<String> a() {
        List o;
        o = kc1.o("Sberbank", "SberbankKz", "BePaid", "CloudPayments", "PaymentsOS", "ECommPay", "Jetpay", "Checkout", "Kaspi", "Momo", "AllSecure", "Yookassa");
        return o;
    }

    public final q4 b(PaymentsOSApi paymentsOSApi, ub3 ub3Var, CheckoutApi checkoutApi, xb.a aVar) {
        Map k;
        z65.h(paymentsOSApi, "paymentsOSApi");
        z65.h(ub3Var, "ecommPayApiBuilderFactory");
        z65.h(checkoutApi, "checkoutApi");
        z65.h(aVar, "allSecureapi");
        k = g86.k(lnb.a("BePaid", new da0()), lnb.a("CloudPayments", fa1.b), lnb.a("PaymentsOS", new gx7(paymentsOSApi)), lnb.a("Sberbank", new du9()), lnb.a("SberbankKz", new du9()), lnb.a("ECommPay", new xb3(ub3Var.a())), lnb.a("Jetpay", new xb3(ub3Var.a())), lnb.a("Checkout", new x41(checkoutApi)), lnb.a("AllSecure", new zb(aVar)));
        return new r4(new n4(new o4(k), k));
    }

    public final xb.a c(b77 b77Var) {
        z65.h(b77Var, "okHttpClient");
        return xb.e.a().c(b77Var).b(b).e("https://secure.asxgw.com");
    }

    public final b77 d(rn2 rn2Var) {
        z65.h(rn2Var, "debugOkHttpClientConfigurator");
        b77.a aVar = new b77.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b77.a O = aVar.e(60L, timeUnit).S(300L, timeUnit).O(5L, timeUnit);
        rn2Var.a(O, "http_allsecure");
        return O.c();
    }

    public final rm e(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new sm(hq3Var);
    }

    public final vo0 f(xv7 xv7Var, PaymentAPI paymentAPI, q4 q4Var, at7 at7Var, sh3 sh3Var, s56 s56Var) {
        z65.h(xv7Var, "paymentRepository");
        z65.h(paymentAPI, "paymentAPI");
        z65.h(q4Var, "acquirerRegistry");
        z65.h(at7Var, "paymentFactory");
        z65.h(sh3Var, "encryptionDataConverterRegistry");
        z65.h(s56Var, "makePaymentService");
        return new wo0(xv7Var, paymentAPI, q4Var, at7Var, sh3Var, s56Var);
    }

    public final sp0 g(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return new tp0(jk2Var.a(bc9.b(CardEntity.class), mk2.b.a));
    }

    public final CheckoutApi h(b77 b77Var) {
        z65.h(b77Var, "okHttpClient");
        Object create = new Retrofit.Builder().baseUrl(c).addCallAdapterFactory(y3b.a()).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonConverterFactory.create()).client(b77Var).build().create(CheckoutApi.class);
        z65.g(create, "create(...)");
        return (CheckoutApi) create;
    }

    public final b77 i(rn2 rn2Var) {
        z65.h(rn2Var, "debugOkHttpClientConfigurator");
        b77.a aVar = new b77.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b77.a O = aVar.e(60L, timeUnit).S(300L, timeUnit).O(5L, timeUnit);
        rn2Var.a(O, "http_checkout");
        return O.c();
    }

    public final qh3 j() {
        return new rh3();
    }

    public final sh3 k(qh3 qh3Var) {
        z65.h(qh3Var, "encryptionDataConverterFactory");
        return new th3(qh3Var);
    }

    public final sg4 l() {
        return new vg4();
    }

    public final tg4 m(sg4 sg4Var) {
        z65.h(sg4Var, "googlePay");
        return sg4Var;
    }

    public final ug4 n(sg4 sg4Var) {
        z65.h(sg4Var, "googlePay");
        return sg4Var;
    }

    public final xg4 o() {
        return new yg4();
    }

    public final zg4 p() {
        return new ah4();
    }

    public final kh4 q() {
        return new lh4();
    }

    public final dh4 r(fh4 fh4Var, kh4 kh4Var, zg4 zg4Var) {
        z65.h(fh4Var, "googlePaymentsClientWrapper");
        z65.h(kh4Var, "googleRequestCreator");
        z65.h(zg4Var, "googlePayIsReadyRequestCreator");
        return new eh4(fh4Var, kh4Var, zg4Var);
    }

    public final fh4 s(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new hh4(context);
    }

    public final w65 t() {
        return new le8();
    }

    public final vm u(PaymentAPI paymentAPI, ks7 ks7Var) {
        z65.h(paymentAPI, "paymentApi");
        z65.h(ks7Var, "responseDtoMapper");
        return new wm(paymentAPI, ks7Var);
    }

    public final q56 v(gc gcVar, ava avaVar) {
        z65.h(gcVar, "analytics");
        z65.h(avaVar, "stateProvider");
        return new r56(gcVar, avaVar);
    }

    public final s56 w(me8 me8Var, q56 q56Var, an anVar) {
        z65.h(me8Var, "pollingPaymentStatusService");
        z65.h(q56Var, "analytics");
        z65.h(anVar, "appBackgroundStateDetector");
        return new t56(me8Var, q56Var, anVar);
    }

    public final boolean x() {
        return true;
    }

    public final b77 y(p80 p80Var, xj3 xj3Var, rn2 rn2Var) {
        z65.h(p80Var, "baseUrlProvider");
        z65.h(xj3Var, "environmentResolver");
        z65.h(rn2Var, "debugOkHttpClientConfigurator");
        b77.a aVar = new b77.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b77.a a2 = aVar.e(60L, timeUnit).S(300L, timeUnit).O(5L, timeUnit).a(new hx7(p80Var, xj3Var));
        rn2Var.a(a2, "http_paymentsos");
        return a2.c();
    }

    public final ks7 z() {
        return new ks7();
    }
}
