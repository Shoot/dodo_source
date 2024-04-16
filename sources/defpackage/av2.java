package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.buttons.DodoButton;
import com.dodopizza.android.textinputlayout.DodoEditTextInputLayout;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter;
import com.dodopizza.order.feature.delivery.address.DeliveryAddressFeatureDependencies;
import com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k9a;
import defpackage.wu2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: DeliveryAddressFragment.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001SB\u0007¢\u0006\u0004\bP\u0010QJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dR(\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R#\u0010.\u001a\n )*\u0004\u0018\u00010!0!8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010=\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u0010AR\u001b\u0010E\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\bD\u0010<R\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00101\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006T"}, d2 = {"Lav2;", "Lf70;", "Lbx2;", "", "isInvisible", "", "wh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Liv0;", "changeLocationResult", "K9", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a$a;", "deliveryLocationResult", "K2", "Gf", "La", "b", "C", "Lk9a$b;", "request", "q", "z2", "Lxu2;", "fragmentData", "vh", "Las8;", "Lcom/dodopizza/order/feature/delivery/address/presentation/DeliveryAddressPresenter;", com.huawei.hms.opendevice.c.a, "Las8;", "sh", "()Las8;", "setPresenterProvider$order_release", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lmoxy/ktx/MoxyKtxDelegate;", "rh", "()Lcom/dodopizza/order/feature/delivery/address/presentation/DeliveryAddressPresenter;", "presenter", "Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", com.huawei.hms.push.e.a, "Lk79;", "mh", "()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", "addressInputLayout", "Lcom/dodopizza/android/buttons/DodoButton;", "f", "nh", "()Lcom/dodopizza/android/buttons/DodoButton;", "applyAddressButton", "g", "uh", "()Landroid/view/View;", "warning", "Landroidx/appcompat/widget/AppCompatTextView;", Image.TYPE_HIGH, "th", "()Landroidx/appcompat/widget/AppCompatTextView;", "textWarning", "i", "qh", "errorIcon", "Landroid/widget/ImageButton;", "j", "ph", "()Landroid/widget/ImageButton;", "closeButton", "k", "Lrn5;", "oh", "()Lxu2;", "args", "<init>", "()V", "l", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: av2  reason: default package */
/* loaded from: classes2.dex */
public final class av2 extends f70 implements bx2 {
    public as8<DeliveryAddressPresenter> c;
    private final MoxyKtxDelegate d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final rn5 k;
    static final /* synthetic */ je5<Object>[] m = {bc9.f(new ar8(av2.class, "presenter", "getPresenter$order_release()Lcom/dodopizza/order/feature/delivery/address/presentation/DeliveryAddressPresenter;", 0)), bc9.f(new ar8(av2.class, "addressInputLayout", "getAddressInputLayout()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", 0)), bc9.f(new ar8(av2.class, "applyAddressButton", "getApplyAddressButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(av2.class, "warning", "getWarning()Landroid/view/View;", 0)), bc9.f(new ar8(av2.class, "textWarning", "getTextWarning()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(av2.class, "errorIcon", "getErrorIcon()Landroid/view/View;", 0)), bc9.f(new ar8(av2.class, "closeButton", "getCloseButton()Landroid/widget/ImageButton;", 0))};
    public static final a l = new a(null);
    public static final int n = 8;

    /* compiled from: DeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lav2$a;", "", "Lxu2;", "arguments", "Lav2;", "a", "", "ARG_DELIVERY_ADDRESS_DATA", "Ljava/lang/String;", "CLOSE_DELIVERY_ADDRESS_VIEW_VALUE", "HANDLE_LOCALITY_CHANGED", "NEW_DELIVERY_ADDRESS_VALUE", "OPEN_DELIVERY_SUGGESTIONS_VALUE", "SELECT_DELIVERY_ADDRESS_VALUE", "SHOW_MAIN_SCREEN_VALUE", "", "WRONG_RESOURCE_ID", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: av2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final av2 a(xu2 xu2Var) {
            z65.h(xu2Var, "arguments");
            return (av2) y64.d(new av2(), bi0.c(bi0.d("arg_delivery_address_data", xu2Var)));
        }
    }

    /* compiled from: DeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxu2;", "a", "()Lxu2;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: av2$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<xu2> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final xu2 invoke() {
            Bundle arguments = av2.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_delivery_address_data")) == null) ? null : null;
            if (obj != null && !(obj instanceof xu2)) {
                throw new ClassCastException("Property arg_delivery_address_data has different class type");
            } else if (obj != null) {
                return (xu2) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = arg_delivery_address_data not found in bundle");
            }
        }
    }

    /* compiled from: DeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/delivery/address/presentation/DeliveryAddressPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/delivery/address/presentation/DeliveryAddressPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: av2$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<DeliveryAddressPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final DeliveryAddressPresenter invoke() {
            return av2.this.sh().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: av2$d */
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            i64.a(av2.this, "delivery_key", bi0.c(bi0.d("close_delivery_address_view_value", "close_delivery_address_view_value")));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: av2$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ ev2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ev2 ev2Var) {
            super(1);
            this.b = ev2Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            i64.a(av2.this, "delivery_key", bi0.c(bi0.d("open_delivery_suggestions_value", this.b)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: av2$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            av2.this.rh().v();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: av2$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ k9a.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k9a.b bVar) {
            super(0);
            this.b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            av2.this.rh().A(EditDeliveryAddressMapPresenter.a.b.a, this.b);
        }
    }

    /* compiled from: DeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: av2$h */
    /* loaded from: classes2.dex */
    static final class h extends ej5 implements Function0<Unit> {
        final /* synthetic */ k9a.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k9a.b bVar) {
            super(0);
            this.b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            av2.this.rh().A(EditDeliveryAddressMapPresenter.a.C0141a.a, this.b);
        }
    }

    public av2() {
        super(gz8.fragment_delivery_address);
        rn5 b2;
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.d = new MoxyKtxDelegate(mvpDelegate, DeliveryAddressPresenter.class.getName() + ".presenter", cVar);
        this.e = kb0.e(this, gy8.e);
        this.f = kb0.e(this, gy8.P3);
        this.g = kb0.e(this, gy8.m6);
        this.h = kb0.e(this, gy8.M5);
        this.i = kb0.e(this, gy8.u0);
        this.j = kb0.e(this, gy8.F);
        b2 = yn5.b(new b());
        this.k = b2;
    }

    private final DodoEditTextInputLayout mh() {
        return (DodoEditTextInputLayout) this.e.a(this, m[1]);
    }

    private final DodoButton nh() {
        return (DodoButton) this.f.a(this, m[2]);
    }

    private final xu2 oh() {
        return (xu2) this.k.getValue();
    }

    private final ImageButton ph() {
        return (ImageButton) this.j.a(this, m[6]);
    }

    private final View qh() {
        return (View) this.i.a(this, m[5]);
    }

    private final AppCompatTextView th() {
        return (AppCompatTextView) this.h.a(this, m[4]);
    }

    private final View uh() {
        return (View) this.g.a(this, m[3]);
    }

    private final void wh(boolean z) {
        String string;
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_delivery_address_data")) == null) ? null : null;
        if (obj != null && !(obj instanceof xu2)) {
            throw new ClassCastException("Property arg_delivery_address_data has different class type");
        } else if (obj != null) {
            xu2 xu2Var = (xu2) obj;
            if (z) {
                nh().setText("");
                return;
            }
            DodoButton nh = nh();
            if (xu2Var.k()) {
                string = getString(o09.continue_text);
            } else {
                string = getString(o09.save);
            }
            nh.setText(string);
        } else {
            throw new IllegalArgumentException("Argument with key = arg_delivery_address_data not found in bundle");
        }
    }

    @Override // defpackage.bx2
    public void C() {
        mh().setEnabled(oh().a().e());
        nh().setState(DodoButton.a.a);
    }

    @Override // defpackage.bx2
    public void Gf() {
        i64.a(this, "delivery_key", bi0.c(bi0.d("show_main_screen_value", "show_main_screen_value")));
    }

    @Override // defpackage.bx2
    public void K2(c.a.C0131a c0131a) {
        z65.h(c0131a, "deliveryLocationResult");
        i64.a(this, "delivery_key", bi0.c(bi0.d("new_delivery_address_value", c0131a)));
    }

    @Override // defpackage.bx2
    public void K9(iv0 iv0Var) {
        z65.h(iv0Var, "changeLocationResult");
        i64.a(this, "delivery_key", bi0.c(bi0.d("select_delivery_address_value", iv0Var)));
    }

    @Override // defpackage.bx2
    public void La() {
        i64.a(this, "delivery_key", bi0.c(bi0.d("handle_locality_changed", "handle_locality_changed")));
    }

    @Override // defpackage.bx2
    public void b() {
        mh().setEnabled(false);
        nh().setState(DodoButton.a.b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        wu2.b a2 = wu2.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_delivery_address_data")) == null) ? null : null;
        if (obj != null && !(obj instanceof xu2)) {
            throw new ClassCastException("Property arg_delivery_address_data has different class type");
        } else if (obj != null) {
            a2.a((xu2) obj, (DeliveryAddressFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(DeliveryAddressFeatureDependencies.class))).a(this);
            super.onAttach(context);
        } else {
            throw new IllegalArgumentException("Argument with key = arg_delivery_address_data not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_delivery_address_data")) == null) ? null : null;
        if (obj != null && !(obj instanceof xu2)) {
            throw new ClassCastException("Property arg_delivery_address_data has different class type");
        } else if (obj != null) {
            vh((xu2) obj);
        } else {
            throw new IllegalArgumentException("Argument with key = arg_delivery_address_data not found in bundle");
        }
    }

    @Override // defpackage.bx2
    public void q(k9a.b bVar) {
        z65.h(bVar, "request");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        x81.c(requireContext, new g(bVar), new h(bVar));
    }

    public final DeliveryAddressPresenter rh() {
        return (DeliveryAddressPresenter) this.d.getValue(this, m[0]);
    }

    public final as8<DeliveryAddressPresenter> sh() {
        as8<DeliveryAddressPresenter> as8Var = this.c;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    public final void vh(xu2 xu2Var) {
        int i;
        int i2;
        String str;
        z65.h(xu2Var, "fragmentData");
        ev2 a2 = xu2Var.a();
        rh().F(xu2Var);
        ImageButton ph = ph();
        int i3 = 8;
        boolean z = false;
        if (xu2Var.j()) {
            i = 0;
        } else {
            i = 8;
        }
        ph.setVisibility(i);
        oma.a(ph(), new d());
        DodoEditTextInputLayout mh = mh();
        String d2 = a2.d();
        if (d2.length() == 0) {
            d2 = getString(r09.t0);
            z65.g(d2, "getString(...)");
        }
        mh.setHint(d2);
        EditText editText = mh().getEditText();
        if (editText != null) {
            editText.setText(a2.f());
        }
        mh().setEnabled(a2.e());
        EditText editText2 = mh().getEditText();
        if (editText2 != null) {
            editText2.setClickable(!xu2Var.j());
            editText2.setCursorVisible(false);
            editText2.setFocusable(false);
            editText2.setFocusableInTouchMode(false);
            editText2.setInputType(131073);
            if (!xu2Var.j()) {
                oma.a(editText2, new e(a2));
            }
        }
        View uh = uh();
        if (a2.m()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        uh.setVisibility(i2);
        AppCompatTextView th = th();
        String str2 = "";
        if (a2.n() == -1) {
            str = "";
        } else {
            str = getString(a2.n());
        }
        th.setText(str);
        View qh = qh();
        if (a2.k()) {
            i3 = 0;
        }
        qh.setVisibility(i3);
        nh().setState(z56.a(a2.i()));
        if (a2.i() == di0.b) {
            z = true;
        }
        wh(z);
        DodoEditTextInputLayout mh2 = mh();
        if (!a2.m()) {
            str2 = null;
        }
        mh2.setError(str2);
        oma.a(nh(), new f());
    }

    @Override // defpackage.bx2
    public void z2() {
        uh().setVisibility(0);
        th().setText(getString(r09.p0));
    }
}
