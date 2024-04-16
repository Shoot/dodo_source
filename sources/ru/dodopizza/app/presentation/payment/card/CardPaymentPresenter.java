package ru.dodopizza.app.presentation.payment.card;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.DataPaymentEntity;
import com.dodopizza.persistence.entity.cart.EncryptionDataEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.mp0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.payment.card.CardPaymentPresenter;
/* compiled from: CardPaymentPresenter.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB?\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\b?\u0010@J\b\u0010\u0004\u001a\u00020\u0003H\u0002J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0016J6\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\nR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00109\u001a\n 6*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\n0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lru/dodopizza/app/presentation/payment/card/CardPaymentPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lrp0;", "", "D", "paymentId", "Lrs7;", "paymentAuthorization3DS", "paRes", "md", "", "z", "A", "y", "onFirstViewAttach", "onDestroy", "cardNumber", "", "cardExpiryMonth", "cardExpiryYear", "cardCVV", "", "saveCard", "C", "onBackPressed", "Lf63;", "a", "Lf63;", "flowRouter", "Lep0;", "b", "Lep0;", "cardPaymentInteractor", "Lava;", com.huawei.hms.opendevice.c.a, "Lava;", "stateProvider", "Lhq3;", DateTokenConverter.CONVERTER_KEY, "Lhq3;", "featureService", "Lj2c;", com.huawei.hms.push.e.a, "Lj2c;", "vpnChecker", "Lgc;", "f", "Lgc;", "analytics", "Lnp0;", "g", "Lnp0;", "router", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "Lkotlin/Function1;", "", "i", "Lkotlin/jvm/functions/Function1;", "paymentErrorHandler", "<init>", "(Lf63;Lep0;Lava;Lhq3;Lj2c;Lgc;Lnp0;)V", "j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CardPaymentPresenter extends BasePresenter<rp0> {
    public static final a j = new a(null);
    private final f63 a;
    private final ep0 b;
    private final ava c;
    private final hq3 d;
    private final j2c e;
    private final gc f;
    private final np0 g;
    private final Logger h;
    private final Function1<Throwable, Unit> i;

    /* compiled from: CardPaymentPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lru/dodopizza/app/presentation/payment/card/CardPaymentPresenter$a;", "", "", "DEFAULT_PAYMENT_ERROR_RES_ID", "I", "FIRST_INDEX_FOR_SLICE", "LAST_INDEX_FOR_SLICE", "REQUEST_CARD_PAYMENT_ID", "getREQUEST_CARD_PAYMENT_ID$annotations", "()V", "REQUEST_SECURE_3D", "<init>", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CardPaymentPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.payment.card.CardPaymentPresenter$on3DSConfirmed$1", f = "CardPaymentPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((b) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CardPaymentPresenter.this.y();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CardPaymentPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.payment.card.CardPaymentPresenter$on3DSConfirmed$2", f = "CardPaymentPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CardPaymentPresenter.this.i.invoke((Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CardPaymentPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.payment.card.CardPaymentPresenter$onPay$1", f = "CardPaymentPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String Y0;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                gc gcVar = CardPaymentPresenter.this.f;
                ps7 ps7Var = ps7.a;
                Y0 = o0b.Y0(this.c, new IntRange(0, 6));
                gcVar.a(ps7Var.b(Y0, CardPaymentPresenter.this.e.a(), this.d));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CardPaymentPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqs7;", "paymentAuthorization", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.payment.card.CardPaymentPresenter$onPay$2", f = "CardPaymentPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends f3b implements Function2<qs7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(this.d, cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(qs7 qs7Var, cv1<? super Unit> cv1Var) {
            return ((e) create(qs7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qs7 qs7Var = (qs7) this.b;
                if (qs7Var instanceof vs7) {
                    CardPaymentPresenter.this.y();
                } else if (qs7Var instanceof ss7) {
                    CardPaymentPresenter.this.y();
                } else if (qs7Var instanceof rs7) {
                    CardPaymentPresenter.this.g.a((rs7) qs7Var, this.d, CardPaymentPresenter.this.D());
                } else if (qs7Var instanceof us7) {
                    Logger logger = CardPaymentPresenter.this.h;
                    logger.warn("Wrong state! " + qs7Var);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CardPaymentPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.payment.card.CardPaymentPresenter$onPay$3", f = "CardPaymentPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CardPaymentPresenter.this.i.invoke((Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CardPaymentPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function1<Throwable, Unit> {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            z65.h(th, "throwable");
            ((rp0) CardPaymentPresenter.this.getViewState()).g();
            ((rp0) CardPaymentPresenter.this.getViewState()).l4(R.string.default_payment_error_desc);
        }
    }

    public CardPaymentPresenter(f63 f63Var, ep0 ep0Var, ava avaVar, hq3 hq3Var, j2c j2cVar, gc gcVar, np0 np0Var) {
        z65.h(f63Var, "flowRouter");
        z65.h(ep0Var, "cardPaymentInteractor");
        z65.h(avaVar, "stateProvider");
        z65.h(hq3Var, "featureService");
        z65.h(j2cVar, "vpnChecker");
        z65.h(gcVar, "analytics");
        z65.h(np0Var, "router");
        this.a = f63Var;
        this.b = ep0Var;
        this.c = avaVar;
        this.d = hq3Var;
        this.e = j2cVar;
        this.f = gcVar;
        this.g = np0Var;
        this.h = LoggerFactory.getLogger("EnterPostcodePresenter");
        this.i = new g();
    }

    private final void A() {
        ((rp0) getViewState()).g();
        ((rp0) getViewState()).l4(R.string.three_ds_error_desc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(CardPaymentPresenter cardPaymentPresenter, Object obj) {
        z65.h(cardPaymentPresenter, "this$0");
        if (obj == null) {
            ((rp0) cardPaymentPresenter.getViewState()).g();
        } else if (obj instanceof j3a) {
            j3a j3aVar = (j3a) obj;
            cardPaymentPresenter.z(j3aVar.d(), j3aVar.c(), j3aVar.b(), j3aVar.a());
        } else if (obj instanceof String) {
            cardPaymentPresenter.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D() {
        String str;
        DataPaymentEntity dataPayment = this.c.e().getDataPayment();
        if (dataPayment != null) {
            str = dataPayment.getAcquirerName();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        this.a.i(R.id.card_payment_id, mp0.a.a);
    }

    private final void z(String str, rs7 rs7Var, String str2, String str3) {
        p(z77.a(y87.a(this.b.h(str, rs7Var, str2, str3), new b(null)), new c(null)));
    }

    public final void C(String str, String str2, int i, int i2, String str3, boolean z) {
        String str4;
        oh3 oh3Var;
        Map<String, String> map;
        EncryptionDataEntity encryptionData;
        z65.h(str, "paymentId");
        z65.h(str2, "cardNumber");
        z65.h(str3, "cardCVV");
        ((rp0) getViewState()).f();
        DataPaymentEntity dataPayment = this.c.e().getDataPayment();
        if (dataPayment != null) {
            str4 = dataPayment.getAcquirerName();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        ep0 ep0Var = this.b;
        DataPaymentEntity dataPayment2 = this.c.e().getDataPayment();
        if (dataPayment2 != null && (encryptionData = dataPayment2.getEncryptionData()) != null) {
            oh3Var = fva.k().invoke(encryptionData);
        } else {
            oh3Var = null;
        }
        DataPaymentEntity dataPayment3 = this.c.e().getDataPayment();
        if (dataPayment3 != null) {
            map = dataPayment3.getProviderData();
        } else {
            map = null;
        }
        if (map == null) {
            map = g86.h();
        }
        p(z77.a(y87.a(r77.a(ep0Var.i(str, str2, i, i2, str3, z, oh3Var, map), new d(str2, str5, null)), new e(str2, null)), new f(null)));
    }

    public final void onBackPressed() {
        this.a.i(R.id.card_payment_id, mp0.b.a);
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        this.a.j(R.id.secure_3d_authorization_data);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        if (this.d.a(bq3.h5)) {
            ((rp0) getViewState()).e2();
        }
        this.a.m(R.id.secure_3d_authorization_data, new wk9() { // from class: lp0
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                CardPaymentPresenter.B(CardPaymentPresenter.this, obj);
            }
        });
        ((rp0) getViewState()).v7(D());
    }
}
