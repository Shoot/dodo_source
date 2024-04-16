package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.badgebackgroundtextview.BadgeBackgroundTextView;
import com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter;
import com.dodopizza.order.feature.menu.ordertypeswitcher.b;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cw5;
import defpackage.yy3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.checkout.details.views.OrderTypeSwitcher;
/* compiled from: OrderTypeSwitcherFragment.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ¨\u00012\u00020\u00012\u00020\u0002:\u0002©\u0001B\t¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\tH\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\u0014\u0010\u0014\u001a\u00020\u0005*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0003H\u0014J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\b\u00104\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u00020\u0005H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\b\u00107\u001a\u00020\u0005H\u0016J\b\u00108\u001a\u00020\u0005H\u0016J\u0012\u00109\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\tH\u0016J\b\u0010<\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020\u0005H\u0016J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\tH\u0016J\b\u0010@\u001a\u00020\u0005H\u0016J\u0010\u0010C\u001a\u00020\u00052\u0006\u0010B\u001a\u00020AH\u0016J\u0010\u0010E\u001a\u00020\u00052\u0006\u0010#\u001a\u00020DH\u0016J\b\u0010F\u001a\u00020\u0005H\u0016J\u0010\u0010H\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\tH\u0016J\u0010\u0010J\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u0003H\u0016J\b\u0010K\u001a\u00020\u0005H\u0016J,\u0010Q\u001a\u00020\u00052\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020L2\b\b\u0001\u0010O\u001a\u00020\u00032\b\b\u0001\u0010P\u001a\u00020\u0003H\u0016J\u0010\u0010S\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\tH\u0016J\u0010\u0010T\u001a\u00020\u00052\u0006\u0010N\u001a\u00020LH\u0016J\b\u0010U\u001a\u00020\u0005H\u0016R$\u0010]\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010b\u001a\n _*\u0004\u0018\u00010^0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001b\u0010h\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010e\u001a\u0004\bk\u0010lR\u001b\u0010q\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010e\u001a\u0004\bo\u0010pR\u001b\u0010t\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010e\u001a\u0004\bs\u0010lR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010e\u001a\u0004\bw\u0010xR\u001b\u0010|\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010e\u001a\u0004\b{\u0010pR\u001c\u0010\u0080\u0001\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010e\u001a\u0004\b~\u0010\u007fR\u001e\u0010\u0083\u0001\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010e\u001a\u0005\b\u0082\u0001\u0010xR \u0010\u0088\u0001\u001a\u00030\u0084\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010e\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u008b\u0001\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010e\u001a\u0005\b\u008a\u0001\u0010xR\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R1\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010\u009d\u0001\u001a\f _*\u0005\u0018\u00010\u0091\u00010\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010¥\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001¨\u0006ª\u0001"}, d2 = {"Ljl7;", "Lf70;", "Ltl7;", "", "colorRes", "", "Eh", "res", "Mh", "", "openTime", "Lh", "resId", "Ih", "error", "Jh", "Hh", "Gh", "Landroid/text/SpannableString;", "imageResId", "qh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onPause", "onDetach", "hh", "r6", "z7", "address", "A0", "t4", "N9", "x7", "Y0", "", "isEnabled", "r1", "Jb", "Mg", "ge", "e9", "c4", "showLoader", "c9", "af", "K3", "W1", "wb", "Mf", "z9", "S1", "errorMessage", "c7", "n8", "N3", "discount", "P0", "W", "Ld88;", "pizzeria", "t1", "Le91;", "F6", "k", "description", "O1", "averageDeliveryTime", "j8", "j3", "Lhn6;", "previousMinDeliveryPrice", "minDeliveryPrice", "highlightEndColor", "textTemplateStringId", "P4", "feeText", "bh", "Ia", "fg", "Lvoa;", com.huawei.hms.opendevice.c.a, "Lvoa;", "getSnackbarHolder", "()Lvoa;", "Fh", "(Lvoa;)V", "snackbarHolder", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "logger", "Landroid/view/ViewGroup;", com.huawei.hms.push.e.a, "Lk79;", "wh", "()Landroid/view/ViewGroup;", "orderTypeIconContainer", "Landroid/widget/ImageView;", "f", "uh", "()Landroid/widget/ImageView;", "errorIcon", "g", "Ah", "()Landroid/view/View;", "progress", Image.TYPE_HIGH, "sh", "chevron", "Landroid/widget/TextView;", "i", "Ch", "()Landroid/widget/TextView;", "textViewAddress", "j", "rh", "addressContainer", "Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeSwitcher;", "xh", "()Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeSwitcher;", "orderTypeSwitcher", "l", "Dh", "textViewError", "Lcom/dodopizza/android/view/custom/badgebackgroundtextview/BadgeBackgroundTextView;", Image.TYPE_MEDIUM, "Bh", "()Lcom/dodopizza/android/view/custom/badgebackgroundtextview/BadgeBackgroundTextView;", "restaurantDiscount", "n", "th", "deliveryAverageTime", "Lxab;", "o", "Lxab;", "minDeliveryPriceChanger", "Las8;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/OrderTypeSwitcherPresenter;", "p", "Las8;", "zh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "q", "Lmoxy/ktx/MoxyKtxDelegate;", "yh", "()Lcom/dodopizza/order/feature/menu/ordertypeswitcher/OrderTypeSwitcherPresenter;", "presenter", "Lje4;", "r", "Lje4;", "vh", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "<init>", "()V", Image.TYPE_SMALL, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: jl7  reason: default package */
/* loaded from: classes4.dex */
public final class jl7 extends f70 implements tl7 {
    private voa c;
    private final Logger d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final k79 n;
    private xab o;
    public as8<OrderTypeSwitcherPresenter> p;
    private final MoxyKtxDelegate q;
    public je4 r;
    static final /* synthetic */ je5<Object>[] t = {bc9.f(new ar8(jl7.class, "orderTypeIconContainer", "getOrderTypeIconContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(jl7.class, "errorIcon", "getErrorIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(jl7.class, "progress", "getProgress()Landroid/view/View;", 0)), bc9.f(new ar8(jl7.class, "chevron", "getChevron()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(jl7.class, "textViewAddress", "getTextViewAddress()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jl7.class, "addressContainer", "getAddressContainer()Landroid/view/View;", 0)), bc9.f(new ar8(jl7.class, "orderTypeSwitcher", "getOrderTypeSwitcher()Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeSwitcher;", 0)), bc9.f(new ar8(jl7.class, "textViewError", "getTextViewError()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jl7.class, "restaurantDiscount", "getRestaurantDiscount()Lcom/dodopizza/android/view/custom/badgebackgroundtextview/BadgeBackgroundTextView;", 0)), bc9.f(new ar8(jl7.class, "deliveryAverageTime", "getDeliveryAverageTime()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jl7.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/menu/ordertypeswitcher/OrderTypeSwitcherPresenter;", 0))};
    public static final a s = new a(null);
    private static final eq5 u = new eq5();

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Ljl7$a;", "", "Ljl7;", "a", "", "ADDRESS_CONTAINER_TRANSLATION", "F", "", "ANIMATION_DURATION", "J", "", "COLOR_BLACK", "I", "COLOR_DISABLED", "COLOR_ORANGE", "COLOR_SECONDARY_LABEL", "COLOR_SUCCESS", "ICON_CARRYOUT", "ICON_DELIVERY", "ICON_RESTAURANT", "", "IMAGE_TAG", "Ljava/lang/String;", "Leq5;", "INTERPOLATOR", "Leq5;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jl7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jl7 a() {
            return new jl7();
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jl7$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            jl7.this.yh().w(b.j.a);
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jl7$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            jl7.this.yh().w(b.u.a);
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jl7$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            jl7.this.yh().w(b.h.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/OrderTypeSwitcherPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/menu/ordertypeswitcher/OrderTypeSwitcherPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jl7$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function0<OrderTypeSwitcherPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderTypeSwitcherPresenter invoke() {
            return jl7.this.zh().get();
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.ordertypeswitcher.OrderTypeSwitcherFragment$requestLocation$1", f = "OrderTypeSwitcherFragment.kt", l = {382}, m = "invokeSuspend")
    /* renamed from: jl7$f */
    /* loaded from: classes4.dex */
    static final class f extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderTypeSwitcherFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbw5;", "", "a", "(Lbw5;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: jl7$f$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<bw5, Unit> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final void a(bw5 bw5Var) {
                z65.h(bw5Var, "$this$requestLocation");
                bw5Var.b(wj8.PRIORITY_HIGH_ACCURACY);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(bw5 bw5Var) {
                a(bw5Var);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderTypeSwitcherFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.foodmenu.ordertypeswitcher.OrderTypeSwitcherFragment$requestLocation$1$1$2", f = "OrderTypeSwitcherFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: jl7$f$b */
        /* loaded from: classes4.dex */
        public static final class b extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ jl7 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(jl7 jl7Var, cv1<? super b> cv1Var) {
                super(3, cv1Var);
                this.c = jl7Var;
            }

            @Override // defpackage.y84
            /* renamed from: i */
            public final Object invoke(pz3<? super cw5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
                b bVar = new b(this.c, cv1Var);
                bVar.b = th;
                return bVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    this.c.d.warn("Failed to request location. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderTypeSwitcherFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "it", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: jl7$f$c */
        /* loaded from: classes4.dex */
        public static final class c<T> implements pz3 {
            final /* synthetic */ jl7 a;

            c(jl7 jl7Var) {
                this.a = jl7Var;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                if (cw5Var instanceof cw5.d) {
                    cw5.d dVar = (cw5.d) cw5Var;
                    this.a.yh().w(new b.n(new ov5(dVar.a().getLatitude(), dVar.a().getLongitude(), nf0.b(dVar.a().getAccuracy()), null, 8, null)));
                }
                return Unit.a;
            }
        }

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((f) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    Context context = (Context) this.a;
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                Context context2 = jl7.this.getContext();
                if (context2 != null) {
                    jl7 jl7Var = jl7.this;
                    oz3 h = wz3.h(wz3.L(qv5.a.a(jl7Var.vh()).b(a.a), 1), new b(jl7Var, null));
                    c cVar = new c(jl7Var);
                    this.a = context2;
                    this.b = 1;
                    if (h.collect(cVar, this) == d) {
                        return d;
                    }
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"jl7$g", "Ly1b;", "", "b", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jl7$g */
    /* loaded from: classes4.dex */
    public static final class g implements y1b {
        g() {
        }

        @Override // defpackage.y1b
        public void a() {
            jl7.this.yh().w(b.k.C0185b.a);
        }

        @Override // defpackage.y1b
        public void b() {
            jl7.this.yh().w(b.k.a.a);
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/text/Spannable;", "it", "", "a", "(Landroid/text/Spannable;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jl7$h */
    /* loaded from: classes4.dex */
    static final class h extends ej5 implements Function1<Spannable, Unit> {
        h() {
            super(1);
        }

        public final void a(Spannable spannable) {
            z65.h(spannable, "it");
            un3.k(jl7.this.th());
            jl7.this.th().setText(spannable);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Spannable spannable) {
            a(spannable);
            return Unit.a;
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jl7$i */
    /* loaded from: classes4.dex */
    static final class i extends ej5 implements Function0<String> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return jl7.this.th().getText().toString();
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(D)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jl7$j */
    /* loaded from: classes4.dex */
    static final class j extends ej5 implements Function1<Double, String> {
        final /* synthetic */ int b;
        final /* synthetic */ hn6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i, hn6 hn6Var) {
            super(1);
            this.b = i;
            this.c = hn6Var;
        }

        public final String a(double d) {
            String str;
            Context context = jl7.this.getContext();
            if (context != null) {
                str = context.getString(this.b, un6.b(new hn6(d, this.c.c())));
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Double d) {
            return a(d.doubleValue());
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jl7$k */
    /* loaded from: classes4.dex */
    static final class k extends ej5 implements Function1<String, String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ CharSequence c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2, CharSequence charSequence) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(String str) {
            z65.h(str, "it");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str);
            String str2 = this.a;
            String str3 = this.b;
            spannableStringBuilder.append((CharSequence) (" " + str2 + " " + str3));
            CharSequence charSequence = this.c;
            z65.g(charSequence, "$previousText");
            if (charSequence.length() > 0) {
                CharSequence charSequence2 = this.c;
                spannableStringBuilder.append((CharSequence) (", " + ((Object) charSequence2)));
            }
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            z65.g(spannableStringBuilder2, "toString(...)");
            return spannableStringBuilder2;
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"jl7$l", "Ly1b;", "", "b", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jl7$l */
    /* loaded from: classes4.dex */
    public static final class l implements y1b {
        final /* synthetic */ d88 b;

        l(d88 d88Var) {
            this.b = d88Var;
        }

        @Override // defpackage.y1b
        public void a() {
            jl7.this.yh().w(b.r.a);
        }

        @Override // defpackage.y1b
        public void b() {
            jl7.this.yh().w(new b.q(this.b));
        }
    }

    /* compiled from: OrderTypeSwitcherFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.ordertypeswitcher.OrderTypeSwitcherFragment$showNoPaymentMethodsFlash$1", f = "OrderTypeSwitcherFragment.kt", l = {397, 398}, m = "invokeSuspend")
    /* renamed from: jl7$m */
    /* loaded from: classes4.dex */
    static final class m extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderTypeSwitcherFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyy3$a;", "", "a", "(Lyy3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: jl7$m$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<yy3.a, Unit> {
            final /* synthetic */ jl7 a;
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(jl7 jl7Var, String str) {
                super(1);
                this.a = jl7Var;
                this.b = str;
            }

            public final void a(yy3.a aVar) {
                z65.h(aVar, "$this$flashLight");
                View requireView = this.a.requireView();
                z65.g(requireView, "requireView(...)");
                aVar.b(requireView);
                aVar.e(8388611);
                aVar.d(this.b);
                aVar.c(R.attr.textAppearanceTextL);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(yy3.a aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, cv1<? super m> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new m(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((m) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        vk9.b(obj);
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                this.a = 1;
                if (xt2.a(500L, this) == d) {
                    return d;
                }
            }
            Context requireContext = jl7.this.requireContext();
            z65.g(requireContext, "requireContext(...)");
            a aVar = new a(jl7.this, this.c);
            this.a = 2;
            if (zy3.a(requireContext, aVar, this) == d) {
                return d;
            }
            return Unit.a;
        }
    }

    public jl7() {
        super(R.layout.fragment_food_menu_order_type_switcher);
        this.d = LoggerFactory.getLogger("OrderTypeSwitcherFragment");
        this.e = kb0.e(this, R.id.delivery_type_icon_container);
        this.f = kb0.e(this, R.id.error_icon);
        this.g = kb0.e(this, R.id.progress);
        this.h = kb0.e(this, R.id.arrow);
        this.i = kb0.e(this, R.id.address_text);
        this.j = kb0.e(this, R.id.address_container);
        this.k = kb0.e(this, R.id.order_type_switcher);
        this.l = kb0.e(this, R.id.error_text);
        this.m = kb0.e(this, R.id.restaurant_discount_view);
        this.n = kb0.e(this, R.id.delivery_average_time_text);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.q = new MoxyKtxDelegate(mvpDelegate, OrderTypeSwitcherPresenter.class.getName() + ".presenter", eVar);
    }

    private final View Ah() {
        return (View) this.g.a(this, t[2]);
    }

    private final BadgeBackgroundTextView Bh() {
        return (BadgeBackgroundTextView) this.m.a(this, t[8]);
    }

    private final TextView Ch() {
        return (TextView) this.i.a(this, t[4]);
    }

    private final TextView Dh() {
        return (TextView) this.l.a(this, t[7]);
    }

    private final void Eh(int i2) {
        int c2 = iu1.c(requireContext(), i2);
        Ch().setTextColor(c2);
        f83.n(sh().getDrawable(), c2);
    }

    private final void Gh() {
        String string = getString(R.string.delivery);
        SpannableString spannableString = new SpannableString("@image_tag " + string);
        qh(spannableString, R.drawable.ic_delivery);
        xh().setDeliveryLabel(spannableString);
    }

    private final void Hh() {
        String string = getString(R.string.pizzeria_order_type_label);
        SpannableString spannableString = new SpannableString("@image_tag " + string);
        qh(spannableString, R.drawable.ic_restaurant);
        xh().setRestaurantLabel(spannableString);
    }

    private final void Ih(int i2) {
        String string = getString(i2);
        z65.g(string, "getString(...)");
        Jh(string);
    }

    private final void Jh(String str) {
        TextView Dh = Dh();
        Dh.setText(str);
        un3.k(Dh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kh(jl7 jl7Var) {
        z65.h(jl7Var, "this$0");
        jl7Var.yh().w(b.o.a);
    }

    private final void Lh(String str) {
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) getString(R.string.pizzeria_is_closed));
        z65.g(append, "append(...)");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iu1.c(requireContext(), R.color.textIconSecondaryColor));
        int length = append.length();
        append.append((CharSequence) " • ");
        append.append((CharSequence) getString(R.string.pizzeria_will_be_open_at, str));
        append.setSpan(foregroundColorSpan, length, append.length(), 17);
        TextView Dh = Dh();
        SpannableString valueOf = SpannableString.valueOf(append);
        z65.g(valueOf, "valueOf(this)");
        Dh.setText(valueOf);
        un3.k(Dh());
    }

    private final void Mh(int i2) {
        un3.k(wh());
        n1c.c(wh());
    }

    private final void qh(SpannableString spannableString, int i2) {
        int Z;
        int Z2;
        int e2 = mpb.e(14.0f, requireContext());
        Object b2 = mh5.b(iu1.e(requireContext(), i2), "Can`t be null");
        z65.g(b2, "notNullOrError(...)");
        Drawable drawable = (Drawable) b2;
        drawable.setBounds(0, 0, e2, e2);
        drawable.setTint(iu1.c(requireContext(), R.color.textIconPrimaryColor));
        sv4 sv4Var = new sv4(drawable, 2, null, 4, null);
        Z = m0b.Z(spannableString, "@image_tag", 0, false, 6, null);
        Z2 = m0b.Z(spannableString, "@image_tag", 0, false, 6, null);
        spannableString.setSpan(sv4Var, Z, Z2 + 10, 17);
    }

    private final View rh() {
        return (View) this.j.a(this, t[5]);
    }

    private final ImageView sh() {
        return (ImageView) this.h.a(this, t[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView th() {
        return (TextView) this.n.a(this, t[9]);
    }

    private final ImageView uh() {
        return (ImageView) this.f.a(this, t[1]);
    }

    private final ViewGroup wh() {
        return (ViewGroup) this.e.a(this, t[0]);
    }

    private final OrderTypeSwitcher xh() {
        return (OrderTypeSwitcher) this.k.a(this, t[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderTypeSwitcherPresenter yh() {
        return (OrderTypeSwitcherPresenter) this.q.getValue(this, t[10]);
    }

    @Override // defpackage.tl7
    public void A0(String str) {
        z65.h(str, "address");
        Ch().setText(str);
    }

    @Override // defpackage.tl7
    public void F6(e91 e91Var) {
        z65.h(e91Var, "address");
        v43 a2 = v43.h.a(e91Var.c().f());
        a2.nh(new g());
        a2.show(getParentFragmentManager(), "pizzeria_suggestion");
    }

    public final void Fh(voa voaVar) {
        this.c = voaVar;
    }

    @Override // defpackage.tl7
    public void Ia(hn6 hn6Var) {
        z65.h(hn6Var, "minDeliveryPrice");
        un3.k(th());
        CharSequence text = th().getText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.min_delivery_price_message_order_from, un6.b(hn6Var))).append((CharSequence) " ").append((CharSequence) getString(R.string.bullet)).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) getString(R.string.free_delivery_fee_promo_food_menu));
        z65.e(text);
        if (text.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ").append(text);
        }
        TextView th = th();
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        z65.g(valueOf, "valueOf(this)");
        th.setText(valueOf);
    }

    @Override // defpackage.tl7
    public void Jb() {
        Eh(R.color.textIconTertiaryColor);
    }

    @Override // defpackage.tl7
    public void K3() {
        Mh(R.drawable.ic_restaurant);
    }

    @Override // defpackage.tl7
    public void Mf() {
        Ih(R.string.pizzeria_delivery_stop);
    }

    @Override // defpackage.tl7
    public void Mg() {
        Eh(R.color.textIconDodoColor);
    }

    @Override // defpackage.tl7
    public void N3() {
        un3.k(wh());
        n1c.e(wh(), uh());
    }

    @Override // defpackage.tl7
    public void N9() {
        xh().d();
    }

    @Override // defpackage.tl7
    public void O1(String str) {
        z65.h(str, "description");
        op5 viewLifecycleOwner = getViewLifecycleOwner();
        z65.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        pp5.a(viewLifecycleOwner).b(new m(str, null));
    }

    @Override // defpackage.tl7
    public void P0(String str) {
        z65.h(str, "discount");
        un3.k(Bh());
        Bh().setText(str);
    }

    @Override // defpackage.tl7
    public void P4(hn6 hn6Var, hn6 hn6Var2, int i2, int i3) {
        z65.h(hn6Var, "previousMinDeliveryPrice");
        z65.h(hn6Var2, "minDeliveryPrice");
        un3.k(th());
        CharSequence text = th().getText();
        String string = getString(R.string.bullet);
        z65.g(string, "getString(...)");
        String string2 = getString(R.string.free_delivery_fee_promo_food_menu);
        z65.g(string2, "getString(...)");
        xab xabVar = this.o;
        if (xabVar != null) {
            xabVar.k(iu1.c(requireContext(), i2));
            xabVar.l(new h());
            xabVar.j(new i());
            xabVar.o(new j(i3, hn6Var2));
            xabVar.n(new k(string, string2, text));
            xabVar.h(hn6Var.a(), hn6Var2.a());
        }
    }

    @Override // defpackage.tl7
    public void S1(String str) {
        if (str != null) {
            Lh(str);
        } else {
            Ih(R.string.pizzeria_closed_by_schedule_error_description);
        }
    }

    @Override // defpackage.tl7
    public void W() {
        un3.e(Bh());
    }

    @Override // defpackage.tl7
    public void W1() {
        Ih(R.string.address_delivery_stop_2);
    }

    @Override // defpackage.tl7
    public void Y0() {
        View requireView = requireView();
        z65.g(requireView, "requireView(...)");
        un3.e(requireView);
    }

    @Override // defpackage.tl7
    public void af() {
        Mh(R.drawable.ic_restaurant);
    }

    @Override // defpackage.tl7
    public void bh(String str) {
        z65.h(str, "feeText");
        un3.k(th());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence text = th().getText();
        spannableStringBuilder.append((CharSequence) getString(R.string.delivery_fee_with_amount, str));
        z65.e(text);
        if (text.length() > 0) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) getString(R.string.bullet)).append((CharSequence) " ").append(text);
        }
        TextView th = th();
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        z65.g(valueOf, "valueOf(this)");
        th.setText(valueOf);
    }

    @Override // defpackage.tl7
    public void c4() {
        if (rh().getVisibility() == 0) {
            return;
        }
        xj1.a(xh());
        un3.k(rh());
        rh().setTranslationX(-150.0f);
        rh().setAlpha(0.0f);
        rh().animate().alpha(1.0f).translationX(0.0f).setInterpolator(u).setDuration(500L).withEndAction(new Runnable() { // from class: il7
            @Override // java.lang.Runnable
            public final void run() {
                jl7.Kh(jl7.this);
            }
        }).start();
    }

    @Override // defpackage.tl7
    public void c7(String str) {
        z65.h(str, "errorMessage");
        Jh(str);
    }

    @Override // defpackage.tl7
    public void c9() {
        Mh(R.drawable.ic_delivery);
    }

    @Override // defpackage.tl7
    public void e9() {
        un3.e(wh());
    }

    @Override // defpackage.tl7
    public void fg() {
        un3.e(th());
        th().setText("");
    }

    @Override // defpackage.tl7
    public void ge() {
        Eh(R.color.textIconPrimaryColor);
    }

    @Override // defpackage.f70
    protected int hh() {
        return R.color.backgroundUnderlayerColor;
    }

    @Override // defpackage.tl7
    public void j3() {
        un3.k(th());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.free_delivery_fee_promo_food_menu));
        CharSequence text = th().getText();
        z65.g(text, "getText(...)");
        if (text.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ").append(th().getText());
        }
        TextView th = th();
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        z65.g(valueOf, "valueOf(this)");
        th.setText(valueOf);
    }

    @Override // defpackage.tl7
    public void j8(int i2) {
        un3.k(th());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iu1.c(requireContext(), R.color.textIconSuccessColor));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.free_delivery_time_promo_food_menu_format, Integer.valueOf(i2)));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        TextView th = th();
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        z65.g(valueOf, "valueOf(this)");
        th.setText(valueOf);
    }

    @Override // defpackage.tl7
    public void k() {
        sh0.d(pp5.a(this), null, null, new f(null), 3, null);
    }

    @Override // defpackage.tl7
    public void n8() {
        un3.e(Dh());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ((LocalityComponent) getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).N1().a(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        xab xabVar = this.o;
        if (xabVar != null) {
            xabVar.p();
        }
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        xab xabVar = this.o;
        if (xabVar != null) {
            xabVar.p();
        }
    }

    @Override // defpackage.f70, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.p != null) {
            yh().w(b.v.a);
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        xh().setOnDeliverySelectedListener(new b());
        xh().setOnRestaurantSelectedListener(new c());
        oma.a(rh(), new d());
        rh().setVisibility(4);
        xh().setVisibility(4);
        this.o = new xab(true, 0L, iu1.c(view.getContext(), R.color.textIconSuccessColor), 2, null);
        Hh();
        Gh();
    }

    @Override // defpackage.tl7
    public void r1(boolean z) {
        xh().setEnabled(z);
        rh().setEnabled(z);
    }

    @Override // defpackage.tl7
    public void r6() {
        xh().c();
    }

    @Override // defpackage.tl7
    public void showLoader() {
        un3.k(wh());
        n1c.e(wh(), Ah());
    }

    @Override // defpackage.tl7
    public void t1(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        l98 a2 = l98.h.a(d88Var.u());
        a2.nh(new l(d88Var));
        a2.show(getParentFragmentManager(), "pizzeria_suggestion");
    }

    @Override // defpackage.tl7
    public void t4() {
        Ch().setText(requireContext().getText(R.string.checkout_select_pizzeria));
    }

    public final je4 vh() {
        je4 je4Var = this.r;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    @Override // defpackage.tl7
    public void wb() {
        Ih(R.string.undeliverable_address_error_description);
    }

    @Override // defpackage.tl7
    public void x7() {
        Ch().setText(requireContext().getText(R.string.checkout_select_pizzeria));
    }

    @Override // defpackage.tl7
    public void z7() {
        Ch().setText(requireContext().getText(R.string.checkout_select_address));
    }

    @Override // defpackage.tl7
    public void z9() {
        Ih(R.string.pizzeria_is_temporarily_closed);
    }

    public final as8<OrderTypeSwitcherPresenter> zh() {
        as8<OrderTypeSwitcherPresenter> as8Var = this.p;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
