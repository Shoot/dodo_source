package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.buttons.DodoButton;
import com.dodopizza.android.view.custom.InfoMessage;
import com.google.android.material.textfield.TextInputLayout;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.presentation.payment.card.CardPaymentPresenter;
/* compiled from: CardPaymentFragment.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 o2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001pB\u0007¢\u0006\u0004\bm\u0010nJ\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\u0012\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020\bH\u0016J\u0010\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\u0010\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0004H\u0016R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00102\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u00101R\u001b\u00105\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u00101R\u001b\u00107\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b6\u0010-R\u001b\u00109\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b8\u0010-R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010+\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010+\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010+\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010+\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010f\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001b\u0010l\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k¨\u0006q"}, d2 = {"Ldp0;", "Lf70;", "Lrp0;", "Lw50;", "", "errorMessage", "", "delay", "", "Rh", "Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayout", "Lz35;", "inputValidator", "Uh", "img", "Ph", "num", "Qh", "Lhn6;", "finalSum", "Th", "Lh", "", "shouldBeEnabled", "Lcom/dodopizza/android/buttons/DodoButton$a;", "Nh", "f", "g", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "e2", "errorDescResId", "l4", "onBackPressed", "acquirerName", "v7", "Landroid/widget/EditText;", com.huawei.hms.opendevice.c.a, "Lk79;", "Ch", "()Landroid/widget/EditText;", "cardNumber", DateTokenConverter.CONVERTER_KEY, "Dh", "()Lcom/google/android/material/textfield/TextInputLayout;", "cardNumberLayout", com.huawei.hms.push.e.a, "Bh", "cardExpiryLayout", "Ah", "cardExpiry", "zh", "cardCVC", "Lcom/dodopizza/android/buttons/DodoButton;", Image.TYPE_HIGH, "Fh", "()Lcom/dodopizza/android/buttons/DodoButton;", "pay", "Landroidx/appcompat/widget/SwitchCompat;", "i", "Eh", "()Landroidx/appcompat/widget/SwitchCompat;", "cardSave", "Landroid/widget/TextView;", "j", "wh", "()Landroid/widget/TextView;", "acquirerDescription", "Landroid/widget/ImageView;", "k", "xh", "()Landroid/widget/ImageView;", "acquirerIcon", "Landroidx/appcompat/widget/Toolbar;", "l", "Ih", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/dodopizza/android/view/custom/InfoMessage;", Image.TYPE_MEDIUM, "yh", "()Lcom/dodopizza/android/view/custom/InfoMessage;", "alertMessage", "Lu22;", "n", "Lu22;", "cardNumberValidator", "Lt22;", "o", "Lt22;", "cardExpiryValidator", "p", "Ljava/lang/String;", "Gh", "()Ljava/lang/String;", "Oh", "(Ljava/lang/String;)V", "paymentId", "Lru/dodopizza/app/presentation/payment/card/CardPaymentPresenter;", "q", "Lmoxy/ktx/MoxyKtxDelegate;", "Hh", "()Lru/dodopizza/app/presentation/payment/card/CardPaymentPresenter;", "presenter", "<init>", "()V", "r", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: dp0  reason: default package */
/* loaded from: classes4.dex */
public final class dp0 extends f70 implements rp0, w50 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final u22 n;
    private final t22 o;
    public String p;
    private final MoxyKtxDelegate q;
    static final /* synthetic */ je5<Object>[] s = {bc9.f(new ar8(dp0.class, "cardNumber", "getCardNumber()Landroid/widget/EditText;", 0)), bc9.f(new ar8(dp0.class, "cardNumberLayout", "getCardNumberLayout()Lcom/google/android/material/textfield/TextInputLayout;", 0)), bc9.f(new ar8(dp0.class, "cardExpiryLayout", "getCardExpiryLayout()Lcom/google/android/material/textfield/TextInputLayout;", 0)), bc9.f(new ar8(dp0.class, "cardExpiry", "getCardExpiry()Landroid/widget/EditText;", 0)), bc9.f(new ar8(dp0.class, "cardCVC", "getCardCVC()Landroid/widget/EditText;", 0)), bc9.f(new ar8(dp0.class, "pay", "getPay()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(dp0.class, "cardSave", "getCardSave()Landroidx/appcompat/widget/SwitchCompat;", 0)), bc9.f(new ar8(dp0.class, "acquirerDescription", "getAcquirerDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(dp0.class, "acquirerIcon", "getAcquirerIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(dp0.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(dp0.class, "alertMessage", "getAlertMessage()Lcom/dodopizza/android/view/custom/InfoMessage;", 0)), bc9.f(new ar8(dp0.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/payment/card/CardPaymentPresenter;", 0))};
    public static final a r = new a(null);

    /* compiled from: CardPaymentFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Ldp0$a;", "", "Ldp0$a$a;", "data", "Ldp0;", "a", "", "DEFAULT_TIME_DELAY", "I", "", "EXTRA_PAYMENT_ID", "Ljava/lang/String;", "EXTRA_PAYMENT_SUM", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dp0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* compiled from: CardPaymentFragment.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Ldp0$a$a;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "paymentId", "Lhn6;", "b", "Lhn6;", "()Lhn6;", "paymentSum", "<init>", "(Ljava/lang/String;Lhn6;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: dp0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0289a {
            private final String a;
            private final hn6 b;

            public C0289a(String str, hn6 hn6Var) {
                z65.h(str, "paymentId");
                z65.h(hn6Var, "paymentSum");
                this.a = str;
                this.b = hn6Var;
            }

            public final String a() {
                return this.a;
            }

            public final hn6 b() {
                return this.b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dp0 a(C0289a c0289a) {
            z65.h(c0289a, "data");
            return (dp0) y64.d(new dp0(), bi0.c(bi0.d("extra_payment_id", c0289a.a()), bi0.d("extra_payment_sum", c0289a.b())));
        }
    }

    /* compiled from: CardPaymentFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lbb;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.payment.card.CardPaymentFragment$onViewCreated$2", f = "CardPaymentFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: dp0$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function2<bb, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(bb bbVar, cv1<? super Unit> cv1Var) {
            return ((b) create(bbVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                dp0 dp0Var = dp0.this;
                TextInputLayout Dh = dp0Var.Dh();
                u22 u22Var = dp0.this.n;
                String string = dp0.this.getString(R.string.wrong_card_number);
                z65.g(string, "getString(...)");
                dp0Var.Uh(Dh, u22Var, string);
                dp0 dp0Var2 = dp0.this;
                dp0Var2.Lh(dp0Var2.Ch().getText().toString());
                dp0.this.Qh(String.valueOf(((bb) this.b).a()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CardPaymentFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lbb;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.payment.card.CardPaymentFragment$onViewCreated$3", f = "CardPaymentFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: dp0$c */
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function2<bb, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(bb bbVar, cv1<? super Unit> cv1Var) {
            return ((c) create(bbVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                dp0 dp0Var = dp0.this;
                TextInputLayout Bh = dp0Var.Bh();
                t22 t22Var = dp0.this.o;
                String string = dp0.this.getString(R.string.wrong_expire_date);
                z65.g(string, "getString(...)");
                dp0Var.Uh(Bh, t22Var, string);
                dp0 dp0Var2 = dp0.this;
                dp0Var2.Lh(dp0Var2.Ch().getText().toString());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CardPaymentFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljab;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.payment.card.CardPaymentFragment$onViewCreated$4", f = "CardPaymentFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: dp0$d */
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function2<jab, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(jab jabVar, cv1<? super Unit> cv1Var) {
            return ((d) create(jabVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                dp0 dp0Var = dp0.this;
                dp0Var.Lh(dp0Var.Ch().getText().toString());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CardPaymentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/payment/card/CardPaymentPresenter;", "a", "()Lru/dodopizza/app/presentation/payment/card/CardPaymentPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dp0$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function0<CardPaymentPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CardPaymentPresenter invoke() {
            return ((LocalityComponent) dp0.this.getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).v2().b(((CheckoutComponent) dp0.this.getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).b()).a().a();
        }
    }

    public dp0() {
        super(R.layout.fragment_card);
        this.c = kb0.e(this, R.id.card_number);
        this.d = kb0.e(this, R.id.card_number_layout);
        this.e = kb0.e(this, R.id.card_expiry_layout);
        this.f = kb0.e(this, R.id.card_expiry);
        this.g = kb0.e(this, R.id.card_CVC);
        this.h = kb0.e(this, R.id.pay);
        this.i = kb0.e(this, R.id.card_save);
        this.j = kb0.e(this, R.id.acquirer_description);
        this.k = kb0.e(this, R.id.acquirer_icon);
        this.l = kb0.e(this, R.id.toolbar);
        this.m = kb0.e(this, R.id.info);
        this.n = new u22(null, 1, null);
        this.o = new t22(0, 0, 3, null);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.q = new MoxyKtxDelegate(mvpDelegate, CardPaymentPresenter.class.getName() + ".presenter", eVar);
    }

    private final EditText Ah() {
        return (EditText) this.f.a(this, s[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextInputLayout Bh() {
        return (TextInputLayout) this.e.a(this, s[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText Ch() {
        return (EditText) this.c.a(this, s[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextInputLayout Dh() {
        return (TextInputLayout) this.d.a(this, s[1]);
    }

    private final SwitchCompat Eh() {
        return (SwitchCompat) this.i.a(this, s[6]);
    }

    private final DodoButton Fh() {
        return (DodoButton) this.h.a(this, s[5]);
    }

    private final CardPaymentPresenter Hh() {
        return (CardPaymentPresenter) this.q.getValue(this, s[11]);
    }

    private final Toolbar Ih() {
        return (Toolbar) this.l.a(this, s[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jh(dp0 dp0Var, View view) {
        z65.h(dp0Var, "this$0");
        dp0Var.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kh(dp0 dp0Var, View view) {
        z65.h(dp0Var, "this$0");
        dp0Var.Hh().C(dp0Var.Gh(), dp0Var.n.d(), dp0Var.o.c(), dp0Var.o.d(), dp0Var.zh().getText().toString(), dp0Var.Eh().isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lh(String str) {
        boolean z;
        String obj = zh().getText().toString();
        wp0 a2 = yp0.a.a(qza.d(str));
        if (this.n.a() && this.o.a() && Mh(obj, a2)) {
            z = true;
        } else {
            z = false;
        }
        Fh().setState(Nh(z));
    }

    private static final boolean Mh(String str, wp0 wp0Var) {
        if (str.length() >= wp0Var.O()) {
            return true;
        }
        return false;
    }

    private final DodoButton.a Nh(boolean z) {
        if (z) {
            return DodoButton.a.a;
        }
        return DodoButton.a.c;
    }

    private final void Ph(int i) {
        Ch().setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Qh(String str) {
        Ph(xp0.a(yp0.a.a(qza.d(str))));
    }

    private final void Rh(String str, int i) {
        yh().i(str, i);
    }

    static /* synthetic */ void Sh(dp0 dp0Var, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3000;
        }
        dp0Var.Rh(str, i);
    }

    private final void Th(hn6 hn6Var) {
        Fh().setText(getString(R.string.place_an_order, un6.b(hn6Var)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Uh(TextInputLayout textInputLayout, z35 z35Var, String str) {
        if ((!z35Var.a()) & z35Var.b()) {
            textInputLayout.setError(str);
        } else {
            textInputLayout.setError(null);
        }
    }

    private final TextView wh() {
        return (TextView) this.j.a(this, s[7]);
    }

    private final ImageView xh() {
        return (ImageView) this.k.a(this, s[8]);
    }

    private final InfoMessage yh() {
        return (InfoMessage) this.m.a(this, s[10]);
    }

    private final EditText zh() {
        return (EditText) this.g.a(this, s[4]);
    }

    public final String Gh() {
        String str = this.p;
        if (str != null) {
            return str;
        }
        z65.z("paymentId");
        return null;
    }

    public final void Oh(String str) {
        z65.h(str, "<set-?>");
        this.p = str;
    }

    @Override // defpackage.rp0
    public void e2() {
        this.o.e(true);
    }

    @Override // defpackage.rp0
    public void f() {
        Ch().setEnabled(false);
        Ah().setEnabled(false);
        zh().setEnabled(false);
        Fh().setState(DodoButton.a.b);
    }

    @Override // defpackage.rp0
    public void g() {
        Ch().setEnabled(true);
        Ah().setEnabled(true);
        zh().setEnabled(true);
        Fh().setState(Nh(Fh().isEnabled()));
    }

    @Override // defpackage.rp0
    public void l4(int i) {
        String string = requireContext().getString(i);
        z65.g(string, "getString(...)");
        Sh(this, string, 0, 2, null);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Hh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = requireArguments().getString("extra_payment_id", "");
        z65.g(string, "getString(...)");
        Oh(string);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Ih().setNavigationOnClickListener(new View.OnClickListener() { // from class: bp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dp0.Jh(dp0.this, view2);
            }
        });
        Ch().setFilters(new u22[]{this.n});
        Ch().addTextChangedListener(this.n);
        y31 y31Var = null;
        wz3.C(wz3.F(bdb.a(Ch()), new b(null)), pp5.a(this));
        Ah().setFilters(new t22[]{this.o});
        Ah().addTextChangedListener(this.o);
        wz3.C(wz3.F(bdb.a(Ah()), new c(null)), pp5.a(this));
        wz3.C(wz3.F(jdb.a(zh()), new d(null)), pp5.a(this));
        Fh().setState(DodoButton.a.c);
        Fh().setOnClickListener(new View.OnClickListener() { // from class: cp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dp0.Kh(dp0.this, view2);
            }
        });
        Ih().setTitle(R.string.bank_card);
        Serializable serializable = requireArguments().getSerializable("extra_payment_sum");
        z65.f(serializable, "null cannot be cast to non-null type com.dodopizza.common.money.Money");
        Th((hn6) serializable);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof y31) {
            y31Var = (y31) parentFragment;
        }
        if (y31Var != null) {
            y31Var.setCancelable(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
        if (r5.equals("SberbankKz") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fd, code lost:
        if (r5.equals("Sberbank") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0118, code lost:
        wh().setText(getString(ru.dodopizza.app.R.string.payment_security_desc, "Cбербанк"));
        xh().setImageResource(ru.dodopizza.app.R.drawable.ic_sberbank);
        xh().setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013a, code lost:
        return;
     */
    @Override // defpackage.rp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v7(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp0.v7(java.lang.String):void");
    }
}
