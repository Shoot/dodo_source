package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Response;
import ru.dodopizza.backend.domain.payment.PaymentAPI;
import ru.dodopizza.backend.domain.payment.dto.Confirm3dsRequestDto;
import ru.dodopizza.backend.domain.payment.dto.sbp.SbpRequestDto;
import ru.dodopizza.backend.domain.payment.dto.v2.PayByNewCardRequestDto;
import ru.dodopizza.backend.domain.payment.dto.v2.PayBySavedCardRequestDto;
/* compiled from: CardChargeServiceAsyncImpl.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00101\u001a\u00020/\u0012\u0006\u00104\u001a\u000202\u0012\u0006\u00107\u001a\u000205¢\u0006\u0004\b<\u0010=J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J>\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001cH\u0016J(\u0010#\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0016R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00106R\u001c\u0010;\u001a\n 9*\u0004\u0018\u000108088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:¨\u0006>"}, d2 = {"Lwo0;", "Lvo0;", "Los7;", "payment", "", "cryptogram", "", "saveCard", "Lqs7;", DateTokenConverter.CONVERTER_KEY, "paymentAuthorization", "", "k", "Lgw7;", "paymentStatus", com.huawei.hms.opendevice.c.a, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "Lys7;", "paymentData", "g", "paymentId", "i", com.huawei.hms.push.e.a, "f", "Lxo0;", "cardCredentials", "Loh3;", "encryptionData", "", "providerData", Image.TYPE_HIGH, "Lrs7;", "paymentAuthorization3DS", "paRes", "md", "j", "Lxv7;", "a", "Lxv7;", "paymentRepository", "Lru/dodopizza/backend/domain/payment/PaymentAPI;", "b", "Lru/dodopizza/backend/domain/payment/PaymentAPI;", "paymentAPI", "Lq4;", "Lq4;", "acquirerRegistry", "Lat7;", "Lat7;", "paymentFactory", "Lsh3;", "Lsh3;", "converterRegistry", "Ls56;", "Ls56;", "makePaymentService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lxv7;Lru/dodopizza/backend/domain/payment/PaymentAPI;Lq4;Lat7;Lsh3;Ls56;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wo0  reason: default package */
/* loaded from: classes2.dex */
public final class wo0 implements vo0 {
    private final xv7 a;
    private final PaymentAPI b;
    private final q4 c;
    private final at7 d;
    private final sh3 e;
    private final s56 f;
    private final Logger g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CardChargeServiceAsyncImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqs7;", "a", "()Lqs7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wo0$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<qs7> {
        final /* synthetic */ os7 b;
        final /* synthetic */ Function0<Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(os7 os7Var, Function0<Unit> function0) {
            super(0);
            this.b = os7Var;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final qs7 invoke() {
            return wo0.this.f.a(this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CardChargeServiceAsyncImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wo0$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ os7 b;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(os7 os7Var, String str, boolean z) {
            super(0);
            this.b = os7Var;
            this.c = str;
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            wo0.this.b.payByNewCard(this.b.a(), new PayByNewCardRequestDto(this.b.e(), this.c, this.d));
        }
    }

    /* compiled from: CardChargeServiceAsyncImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqs7;", "a", "()Lqs7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wo0$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<qs7> {
        final /* synthetic */ os7 b;
        final /* synthetic */ Function0<Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(os7 os7Var, Function0<Unit> function0) {
            super(0);
            this.b = os7Var;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final qs7 invoke() {
            return wo0.this.f.a(this.b, this.c);
        }
    }

    /* compiled from: CardChargeServiceAsyncImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wo0$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            wo0.this.b.payBySavedCard(this.b, new PayBySavedCardRequestDto(this.c));
        }
    }

    /* compiled from: CardChargeServiceAsyncImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqs7;", "a", "()Lqs7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wo0$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<qs7> {
        final /* synthetic */ os7 b;
        final /* synthetic */ Function0<Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(os7 os7Var, Function0<Unit> function0) {
            super(0);
            this.b = os7Var;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final qs7 invoke() {
            return wo0.this.f.a(this.b, this.c);
        }
    }

    /* compiled from: CardChargeServiceAsyncImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wo0$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            wo0.this.b.payBySbp(this.b, new SbpRequestDto(this.c));
        }
    }

    /* compiled from: CardChargeServiceAsyncImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lretrofit2/Response;", "Ljava/lang/Void;", "Lru/dodopizza/backend/client/common/EmptyResponse;", "a", "()Lretrofit2/Response;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wo0$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function0<Response<Void>> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, String str3) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Response<Void> invoke() {
            return wo0.this.b.confirm3ds(this.b, new Confirm3dsRequestDto(this.c, this.d));
        }
    }

    public wo0(xv7 xv7Var, PaymentAPI paymentAPI, q4 q4Var, at7 at7Var, sh3 sh3Var, s56 s56Var) {
        z65.h(xv7Var, "paymentRepository");
        z65.h(paymentAPI, "paymentAPI");
        z65.h(q4Var, "acquirerRegistry");
        z65.h(at7Var, "paymentFactory");
        z65.h(sh3Var, "converterRegistry");
        z65.h(s56Var, "makePaymentService");
        this.a = xv7Var;
        this.b = paymentAPI;
        this.c = q4Var;
        this.d = at7Var;
        this.e = sh3Var;
        this.f = s56Var;
        this.g = LoggerFactory.getLogger("CardChargeServiceAsyncImpl");
    }

    private final void c(os7 os7Var, gw7 gw7Var) {
        xv7 xv7Var = this.a;
        os7Var.f(gw7Var);
        xv7Var.h(os7Var);
        Logger logger = this.g;
        String a2 = os7Var.a();
        logger.info("Change payment status to " + gw7Var + " [paymentId=" + a2 + "]");
    }

    private final qs7 d(os7 os7Var, String str, boolean z) {
        qs7 qs7Var = (qs7) inb.c(new a(os7Var, new b(os7Var, str, z)));
        k(qs7Var, os7Var);
        return qs7Var;
    }

    private final void k(qs7 qs7Var, os7 os7Var) {
        if (qs7Var instanceof vs7) {
            c(os7Var, gw7.c);
        } else if (qs7Var instanceof ss7) {
            c(os7Var, gw7.c);
        } else if (qs7Var instanceof rs7) {
            c(os7Var, gw7.b);
        } else if (qs7Var instanceof us7) {
            c(os7Var, gw7.b);
        }
    }

    @Override // defpackage.vo0
    public qs7 e(String str, String str2) {
        z65.h(str, "paymentId");
        z65.h(str2, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        os7 a2 = this.a.a(str);
        if (a2 != null) {
            qs7 qs7Var = (qs7) inb.c(new c(a2, new d(str, str2)));
            k(qs7Var, a2);
            return qs7Var;
        }
        throw new IllegalStateException("Payment not found [paymentId=" + str + "]");
    }

    @Override // defpackage.vo0
    public qs7 f(String str, String str2) {
        z65.h(str, "paymentId");
        z65.h(str2, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        os7 a2 = this.a.a(str);
        if (a2 != null) {
            qs7 qs7Var = (qs7) inb.c(new e(a2, new f(str, str2)));
            k(qs7Var, a2);
            return qs7Var;
        }
        throw new IllegalStateException("Payment not found [paymentId=" + str + "]");
    }

    @Override // defpackage.vo0
    public os7 g(String str, ys7 ys7Var) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(ys7Var, "paymentData");
        return this.a.h(this.d.a(str, ys7Var));
    }

    @Override // defpackage.vo0
    public qs7 h(String str, xo0 xo0Var, boolean z, oh3 oh3Var, Map<String, String> map) {
        boolean z2;
        z65.h(str, "paymentId");
        z65.h(xo0Var, "cardCredentials");
        z65.h(map, "providerData");
        os7 a2 = this.a.a(str);
        if (a2 != null) {
            l4 a3 = this.c.a(a2.b());
            Map<String, String> a4 = this.e.a(a2.b()).a(oh3Var, map);
            pp0 c2 = a2.c();
            z65.f(c2, "null cannot be cast to non-null type com.dodopizza.payment.charge.scenario.NativePaymentScenario");
            String b2 = a3.b(xo0Var, ((lu6) c2).b(), a4);
            if (z && a3.a(xo0Var)) {
                z2 = true;
            } else {
                z2 = false;
            }
            return d(a2, b2, z2);
        }
        throw new IllegalStateException("Payment not found [paymentId=" + str + "]");
    }

    @Override // defpackage.vo0
    public qs7 i(String str, String str2, boolean z) {
        z65.h(str, "paymentId");
        z65.h(str2, "cryptogram");
        os7 a2 = this.a.a(str);
        if (a2 != null) {
            return d(a2, str2, z);
        }
        throw new IllegalStateException("Payment not found [paymentId=" + str + "]");
    }

    @Override // defpackage.vo0
    public void j(String str, rs7 rs7Var, String str2, String str3) {
        z65.h(str, "paymentId");
        z65.h(rs7Var, "paymentAuthorization3DS");
        z65.h(str2, "paRes");
        z65.h(str3, "md");
        inb.c(new g(str, str2, str3));
        os7 a2 = this.a.a(str);
        if (a2 != null) {
            c(a2, gw7.c);
        }
    }
}
