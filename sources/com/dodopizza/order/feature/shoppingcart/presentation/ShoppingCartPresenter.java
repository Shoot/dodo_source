package com.dodopizza.order.feature.shoppingcart.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter;
import com.dodopizza.order.feature.shoppingcart.presentation.a;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cj6;
import defpackage.fy5;
import defpackage.h15;
import defpackage.v51;
import defpackage.ym;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ShoppingCartPresenter.kt */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Â\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001aB\u009b\u0001\b\u0007\u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010g\u001a\u00020d\u0012\u0006\u0010k\u001a\u00020h\u0012\u0006\u0010o\u001a\u00020l\u0012\u0006\u0010s\u001a\u00020p\u0012\u0006\u0010w\u001a\u00020t\u0012\u0006\u0010{\u001a\u00020x\u0012\u0006\u0010\u007f\u001a\u00020|\u0012\b\u0010\u0083\u0001\u001a\u00030\u0080\u0001\u0012\b\u0010\u0087\u0001\u001a\u00030\u0084\u0001\u0012\b\u0010\u008b\u0001\u001a\u00030\u0088\u0001\u0012\b\u0010\u008f\u0001\u001a\u00030\u008c\u0001\u0012\b\u0010\u0093\u0001\u001a\u00030\u0090\u0001\u0012\b\u0010\u0097\u0001\u001a\u00030\u0094\u0001\u0012\b\u0010\u009b\u0001\u001a\u00030\u0098\u0001\u0012\b\u0010\u009f\u0001\u001a\u00030\u009c\u0001¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002J\u0012\u0010%\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010'\u001a\u00020\u0003H\u0002J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u001eH\u0002J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0002J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0016H\u0002J\u0010\u00100\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u00101\u001a\u00020\u0003H\u0002J\b\u00102\u001a\u00020\u0003H\u0002J\b\u00103\u001a\u00020\u0003H\u0002J\b\u00104\u001a\u00020\u0003H\u0002J\u0018\u00108\u001a\u00020\u00032\u0006\u00105\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0002J\b\u00109\u001a\u00020\u0003H\u0002J\b\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020\u0003H\u0002J\b\u0010<\u001a\u00020\u0003H\u0002J\b\u0010=\u001a\u00020\u0003H\u0002J\b\u0010>\u001a\u00020\u0003H\u0014J\u0012\u0010@\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010A\u001a\u00020\u0003H\u0016J\u000e\u0010B\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010C\u001a\u00020\u0003J\u000e\u0010D\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010E\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010F\u001a\u00020\u0003J\u0006\u0010G\u001a\u00020\u0003J\u0006\u0010H\u001a\u00020\u0003J\u0006\u0010I\u001a\u00020\u0003J\u000e\u0010K\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u0007J\u0006\u0010L\u001a\u00020\u0003J\u0006\u0010M\u001a\u00020\u0003J\u000e\u0010N\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010P\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u0007J\u000e\u0010S\u001a\u00020\u00032\u0006\u0010R\u001a\u00020QJ\u000e\u0010U\u001a\u00020\u00032\u0006\u0010T\u001a\u00020\u0007J\u000e\u0010W\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u001eJ\u0006\u0010X\u001a\u00020\u0003J\u0006\u0010Y\u001a\u00020\u0003J\u0006\u0010Z\u001a\u00020\u001eJ\u0006\u0010[\u001a\u00020\u0003J\u0014\u0010_\u001a\u00020\u00032\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001b\u0010¢\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¤\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b£\u0001\u0010\u000fR\u0018\u0010¦\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¥\u0001\u0010\u000fR\u001c\u0010ª\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001a\u0010®\u0001\u001a\u00030«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R!\u0010³\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010°\u00010¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R!\u0010µ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010°\u00010¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010²\u0001R)\u0010º\u0001\u001a\u00020\u001e2\u0007\u0010¶\u0001\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b·\u0001\u0010\u000f\u001a\u0006\b¸\u0001\u0010¹\u0001R\"\u0010¿\u0001\u001a\r ¼\u0001*\u0005\u0018\u00010»\u00010»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001¨\u0006Ã\u0001"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/presentation/ShoppingCartPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Loja;", "", "a0", "T", "R", "", "promoCode", "z0", "d0", "W", "Lnq0;", "cartItem", "Lwx;", "Z", "T0", "K0", "e0", "U", "S", "Q", "Llja;", "shoppingCartVO", "C0", "P0", "N0", "O0", "y0", "Y", "", "j0", "Ljk7;", "orderType", "Lcj6;", "minDeliveryPriceInfo", "F0", "b0", "f0", "M0", "isUseUnifiedVariantForLabel", "G0", "Lcj6$b;", "customizedPriceForDelivery", "U0", "E0", "cartVO", "D0", "B0", "Q0", "R0", "S0", "P", "goodModel", "", "count", "c0", "g0", "L0", "I0", "M", "H0", "onFirstViewAttach", "view", "V", "onDestroy", "N", "V0", "x0", "w0", "n0", "o0", "u0", "t0", "upsaleProductId", "O", "m0", "q0", "l0", "id", "A0", "Lv23;", "discount", "p0", "title", "s0", "visible", "h0", "r0", "v0", "i0", "onBackPressed", "", "Llq3;", "levels", "J0", "Ldo;", "a", "Ldo;", "appInitializer", "Ldf4;", "b", "Ldf4;", "getDataAvailabilityInteractor", "Lnfa;", com.huawei.hms.opendevice.c.a, "Lnfa;", "setPromoCodeInteractor", "Lo63;", DateTokenConverter.CONVERTER_KEY, "Lo63;", "domainState", "Li00;", com.huawei.hms.push.e.a, "Li00;", "authorizationState", "Lk63;", "f", "Lk63;", "domainEvents", "Lcs0;", "g", "Lcs0;", "cartRepository", "Lwg6;", Image.TYPE_HIGH, "Lwg6;", "menuRefreshInteractor", "Lwia;", "i", "Lwia;", "shoppingCartInteractor", "Lzxa;", "j", "Lzxa;", "storiesInteractor", "Lbo;", "k", "Lbo;", "appInitializationStateProvider", "Lhq3;", "l", "Lhq3;", "featureService", "Lbq;", Image.TYPE_MEDIUM, "Lbq;", "applyedPromoOfferRepository", "Lnia;", "n", "Lnia;", "delegate", "Lf5b;", "o", "Lf5b;", "timeProvider", "Lf63;", "p", "Lf63;", "router", "q", "Llja;", "currentShoppingCart", "r", "needToPlaceOrder", Image.TYPE_SMALL, "isReadyToCheckout", "Ll95;", "t", "Ll95;", "callActualizeByListener", "", "u", "J", "lastUpdatedTtl", "Lwk9;", "", "v", "Lwk9;", "loginResultListener", "w", "cartErrorsResultListener", "<set-?>", "x", "getReadyToChange", "()Z", "readyToChange", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "y", "Lorg/slf4j/Logger;", "logger", "<init>", "(Ldo;Ldf4;Lnfa;Lo63;Li00;Lk63;Lcs0;Lwg6;Lwia;Lzxa;Lbo;Lhq3;Lbq;Lnia;Lf5b;Lf63;)V", "z", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ShoppingCartPresenter extends BasePresenter<oja> {
    private final Cdo a;
    private final df4 b;
    private final nfa c;
    private final o63 d;
    private final i00 e;
    private final k63 f;
    private final cs0 g;
    private final wg6 h;
    private final wia i;
    private final zxa j;
    private final bo k;
    private final hq3 l;
    private final bq m;
    private final nia n;
    private final f5b o;
    private final f63 p;
    private lja q;
    private boolean r;
    private boolean s;
    private l95 t;
    private long u;
    private final wk9<Object> v;
    private final wk9<Object> w;
    private boolean x;
    private final Logger y;
    public static final a z = new a(null);
    public static final int A = 8;
    private static final int B = gy8.register_success_result;
    private static final int C = gy8.checkout_cart_errors;

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/presentation/ShoppingCartPresenter$a;", "", "", "isUseUnifiedVariantForLabel", "", com.huawei.hms.opendevice.c.a, "Lcj6$b;", "customizedPriceForDelivery", com.huawei.hms.push.e.a, "RESULT_LOGIN", "I", DateTokenConverter.CONVERTER_KEY, "()I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(boolean z) {
            if (z) {
                return ew8.A;
            }
            return ew8.C;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(boolean z, cj6.b bVar) {
            if (z) {
                return r09.min_delivery_universal_alert_title;
            }
            if (bVar.j().a() > bVar.f().a()) {
                return r09.min_delivery_alert_title_for_decreased_price;
            }
            return r09.min_delivery_alert_title_for_increased_price;
        }

        public final int d() {
            return ShoppingCartPresenter.B;
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$saveInfoStoryId$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(String str, cv1<? super a0> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a0 a0Var = new a0(this.d, cv1Var);
            a0Var.b = obj;
            return a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((a0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = ShoppingCartPresenter.this.y;
                String str = this.d;
                logger.warn("Failed to save info story id: " + str, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kl8.values().length];
            try {
                iArr[kl8.i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kl8.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kl8.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kl8.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kl8.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ex2.values().length];
            try {
                iArr2[ex2.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ex2.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ex2.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Llk8;", "prizotekaVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$setUpPrizoteka$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b0 extends f3b implements Function2<lk8, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ lja c;
        final /* synthetic */ ShoppingCartPresenter d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(lja ljaVar, ShoppingCartPresenter shoppingCartPresenter, cv1<? super b0> cv1Var) {
            super(2, cv1Var);
            this.c = ljaVar;
            this.d = shoppingCartPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b0 b0Var = new b0(this.c, this.d, cv1Var);
            b0Var.b = obj;
            return b0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(lk8 lk8Var, cv1<? super Unit> cv1Var) {
            return ((b0) create(lk8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                lk8 lk8Var = (lk8) this.b;
                if (lk8Var != null) {
                    ik8 a = hk8.a.a(lk8Var.a(), this.c.m());
                    ((oja) this.d.getViewState()).z8(lk8Var, a.b(), a.c(), this.c.m());
                } else {
                    ((oja) this.d.getViewState()).O9();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/presentation/a;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$actualizeAndShowCheckoutDialog$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<com.dodopizza.order.feature.shoppingcart.presentation.a, cv1<? super Unit>, Object> {
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
        public final Object invoke(com.dodopizza.order.feature.shoppingcart.presentation.a aVar, cv1<? super Unit> cv1Var) {
            return ((c) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                com.dodopizza.order.feature.shoppingcart.presentation.a aVar = (com.dodopizza.order.feature.shoppingcart.presentation.a) this.b;
                if (z65.c(aVar, a.d.a)) {
                    ShoppingCartPresenter.this.H0();
                } else if (aVar instanceof a.b) {
                    ShoppingCartPresenter.this.e0();
                    ShoppingCartPresenter.this.M0();
                } else if (z65.c(aVar, a.C0207a.a)) {
                    ((oja) ShoppingCartPresenter.this.getViewState()).h8();
                } else if (aVar instanceof a.c) {
                    ShoppingCartPresenter.this.e0();
                    ((oja) ShoppingCartPresenter.this.getViewState()).xg();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$setUpPrizoteka$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c0(cv1<? super c0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c0 c0Var = new c0(cv1Var);
            c0Var.b = obj;
            return c0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.error("Failed to get getPrizotekaVO", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$actualizeAndShowCheckoutDialog$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.error("Failed to actualize", (Throwable) this.b);
                ShoppingCartPresenter.this.H0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "checkoutState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$showCheckoutDialog$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d0(cv1<? super d0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d0 d0Var = new d0(cv1Var);
            d0Var.b = obj;
            return d0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((d0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.n.f((b61) this.b);
                ShoppingCartPresenter.this.e0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$addItem$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class e extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((e) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.x = true;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$showCheckoutDialog$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e0(cv1<? super e0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e0 e0Var = new e0(cv1Var);
            e0Var.b = obj;
            return e0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.error("Failed to get checkout details", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$addItem$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
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
                ShoppingCartPresenter.this.x = true;
                ShoppingCartPresenter.this.y.error("Failed to add product to cart", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ln42;", "customer", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$showCheckoutSheetOrEnterNameFragment$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f0 extends f3b implements Function2<n42, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f0(cv1<? super f0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f0 f0Var = new f0(cv1Var);
            f0Var.b = obj;
            return f0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(n42 n42Var, cv1<? super Unit> cv1Var) {
            return ((f0) create(n42Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean y;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                y = l0b.y(((n42) this.b).h());
                if (y) {
                    ShoppingCartPresenter.this.e0();
                    ShoppingCartPresenter.this.n.k();
                    ShoppingCartPresenter.this.n.c(ShoppingCartPresenter.z.d(), ShoppingCartPresenter.this.v);
                } else {
                    ShoppingCartPresenter.this.M();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$addUpsale$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class g extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((g) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.error("Failed to add product to cart", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$showCheckoutSheetOrEnterNameFragment$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g0(cv1<? super g0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g0 g0Var = new g0(cv1Var);
            g0Var.b = obj;
            return g0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((g0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.warn("Failed to get customer", (Throwable) this.b);
                ShoppingCartPresenter.this.M();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Llja;", "shoppingCartVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$applyBasket$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function2<lja, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(cv1Var);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(lja ljaVar, cv1<? super Unit> cv1Var) {
            return ((h) create(ljaVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                lja ljaVar = (lja) this.b;
                Logger logger = ShoppingCartPresenter.this.y;
                logger.debug("update shopping cart from " + ljaVar);
                ShoppingCartPresenter.this.C0(ljaVar);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lh15;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$showInfoStoryIfNeed$1", f = "ShoppingCartPresenter.kt", l = {420}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h0 extends f3b implements Function1<cv1<? super h15>, Object> {
        int a;

        h0(cv1<? super h0> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super h15> cv1Var) {
            return ((h0) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                zxa zxaVar = ShoppingCartPresenter.this.j;
                i15 i15Var = i15.d;
                this.a = 1;
                obj = zxaVar.a(i15Var, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "exception", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$applyBasket$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i iVar = new i(cv1Var);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((i) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Throwable th = (Throwable) this.b;
                ShoppingCartPresenter.this.y.error(th.getMessage(), th);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lh15;", "infoStoryResult", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$showInfoStoryIfNeed$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i0 extends f3b implements Function2<h15, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i0(cv1<? super i0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i0 i0Var = new i0(cv1Var);
            i0Var.b = obj;
            return i0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(h15 h15Var, cv1<? super Unit> cv1Var) {
            return ((i0) create(h15Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                h15 h15Var = (h15) this.b;
                if (h15Var instanceof h15.e) {
                    ((oja) ShoppingCartPresenter.this.getViewState()).F(((h15.e) h15Var).b());
                } else {
                    ShoppingCartPresenter.this.y.warn(h15Var.a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "menuItemId", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$changeVariableProduct$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ nq0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(nq0 nq0Var, cv1<? super j> cv1Var) {
            super(2, cv1Var);
            this.d = nq0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j jVar = new j(this.d, cv1Var);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((j) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.n.l(this.d.j().getValue(), (String) this.b, ym.d.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$showInfoStoryIfNeed$3", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        j0(cv1<? super j0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j0 j0Var = new j0(cv1Var);
            j0Var.b = obj;
            return j0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((j0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.warn("Failed to show info story!", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$checkLocalityFromScope$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        k(cv1<? super k> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new k(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((k) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (ShoppingCartPresenter.this.i.b()) {
                    ShoppingCartPresenter.this.a.m();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$showUpsaleBlock$1", f = "ShoppingCartPresenter.kt", l = {795}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k0 extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        k0(cv1<? super k0> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new k0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((k0) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                bo boVar = ShoppingCartPresenter.this.k;
                this.a = 1;
                if (co.b(boVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$decreaseGoodCount$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new l(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((l) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.x = true;
                ShoppingCartPresenter.this.y.info("Product removed from cart");
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$showUpsaleBlock$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l0 extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(Function0<Unit> function0, cv1<? super l0> cv1Var) {
            super(2, cv1Var);
            this.b = function0;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new l0(this.b, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((l0) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                this.b.invoke();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$decreaseGoodCount$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        m(cv1<? super m> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m mVar = new m(cv1Var);
            mVar.b = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((m) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.x = true;
                ShoppingCartPresenter.this.y.error("Failed to add product to cart", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class m0 extends ej5 implements Function0<Unit> {
        m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (kq3.a(ShoppingCartPresenter.this.l)) {
                ((oja) ShoppingCartPresenter.this.getViewState()).da();
            } else {
                ((oja) ShoppingCartPresenter.this.getViewState()).s1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$deletePersonalPromoAction$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n nVar = new n(cv1Var);
            nVar.b = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((n) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.warn("Failed to reset promo action. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lvv6;", "networkAvailabilityState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$subscribeOnDataAvailability$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n0 extends f3b implements Function2<vv6, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n0(cv1<? super n0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n0 n0Var = new n0(cv1Var);
            n0Var.b = obj;
            return n0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(vv6 vv6Var, cv1<? super Unit> cv1Var) {
            return ((n0) create(vv6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((vv6) this.b) == vv6.b) {
                    ((oja) ShoppingCartPresenter.this.getViewState()).S();
                } else {
                    ((oja) ShoppingCartPresenter.this.getViewState()).o0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "menuItemId", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$onClickChange$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class o extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ nq0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(nq0 nq0Var, cv1<? super o> cv1Var) {
            super(2, cv1Var);
            this.d = nq0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o oVar = new o(this.d, cv1Var);
            oVar.b = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((o) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.n.n((String) this.b, this.d.j().getValue(), ym.d.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj63;", "domainEvent", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$subscribeOnDomainEvents$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o0 extends f3b implements Function2<j63, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* compiled from: ShoppingCartPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[j63.values().length];
                try {
                    iArr[j63.b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j63.a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j63.c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[j63.e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        o0(cv1<? super o0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o0 o0Var = new o0(cv1Var);
            o0Var.b = obj;
            return o0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j63 j63Var, cv1<? super Unit> cv1Var) {
            return ((o0) create(j63Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                int i = a.$EnumSwitchMapping$0[((j63) this.b).ordinal()];
                if (i == 1) {
                    ShoppingCartPresenter.this.T();
                } else if (i == 2) {
                    ShoppingCartPresenter.this.Q();
                } else if (i == 3) {
                    ShoppingCartPresenter.this.P();
                } else if (i == 4) {
                    ShoppingCartPresenter.this.Q0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$onClickChange$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class p extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        p(cv1<? super p> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new p(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((p) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.error("Error while getting menuItemId for combo");
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$trackCartScreenShown$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        p0(cv1<? super p0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p0 p0Var = new p0(cv1Var);
            p0Var.b = obj;
            return p0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((p0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.warn("Failed to track Cart Screen Shown event", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "menuItemId", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$onClickChange$3", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class q extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ nq0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(nq0 nq0Var, cv1<? super q> cv1Var) {
            super(2, cv1Var);
            this.d = nq0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            q qVar = new q(this.d, cv1Var);
            qVar.b = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((q) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.n.o(com.dodopizza.order.feature.product.card.presentation.pizza.c.a(new o78((String) this.b, this.d.j().getValue(), null, 0, ym.d.d, false, 44, null)));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/presentation/a;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$updateItemPersonalPrice$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q0 extends f3b implements Function2<com.dodopizza.order.feature.shoppingcart.presentation.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        q0(cv1<? super q0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            q0 q0Var = new q0(cv1Var);
            q0Var.b = obj;
            return q0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(com.dodopizza.order.feature.shoppingcart.presentation.a aVar, cv1<? super Unit> cv1Var) {
            return ((q0) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                com.dodopizza.order.feature.shoppingcart.presentation.a aVar = (com.dodopizza.order.feature.shoppingcart.presentation.a) this.b;
                if (!z65.c(aVar, a.d.a)) {
                    if (aVar instanceof a.b) {
                        ShoppingCartPresenter.this.M0();
                    } else if (z65.c(aVar, a.C0207a.a)) {
                        ((oja) ShoppingCartPresenter.this.getViewState()).h8();
                    } else if (aVar instanceof a.c) {
                        ShoppingCartPresenter.this.e0();
                        ((oja) ShoppingCartPresenter.this.getViewState()).xg();
                    }
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$onClickChange$4", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class r extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        r(cv1<? super r> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            r rVar = new r(cv1Var);
            rVar.b = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((r) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.error("Error while getting menuItemId for pizza", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$updateItemPersonalPrice$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        r0(cv1<? super r0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            r0 r0Var = new r0(cv1Var);
            r0Var.b = obj;
            return r0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((r0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.error("Failed to actualize products to cart", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$onClickChange$5", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class s extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        s(cv1<? super s> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            s sVar = new s(cv1Var);
            sVar.b = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((s) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.error("Error while getting menuItemId for snack", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$onClickChange$6", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class t extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        t(cv1<? super t> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t tVar = new t(cv1Var);
            tVar.b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((t) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.error("Error while getting menuItemId for drinks", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$onClickChange$7", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class u extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        u(cv1<? super u> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            u uVar = new u(cv1Var);
            uVar.b = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((u) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.error("Error while getting menuItemId for dessert", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", RemoteMessageConst.Notification.URL, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$onNiceBonusRulesClicked$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class v extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(String str, cv1<? super v> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            v vVar = new v(this.d, cv1Var);
            vVar.b = obj;
            return vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((v) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = (String) this.b;
                if (str != null) {
                    ShoppingCartPresenter.this.n.o(com.dodopizza.feature.webinfo.presentation.d.a(new com.dodopizza.feature.webinfo.presentation.a(this.d, str, (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$onNiceBonusRulesClicked$2", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class w extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        w(cv1<? super w> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            w wVar = new w(cv1Var);
            wVar.b = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((w) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.warn("Failed to get nice bonus rules url", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$onRefresh$1", f = "ShoppingCartPresenter.kt", l = {324}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class x extends f3b implements Function1<cv1<? super Object>, Object> {
        int a;

        x(cv1<? super x> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new x(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<Object> cv1Var) {
            return ((x) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                wg6 wg6Var = ShoppingCartPresenter.this.h;
                this.a = 1;
                obj = wg6Var.h(this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$resetPromoCode$1", f = "ShoppingCartPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        y(cv1<? super y> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            y yVar = new y(cv1Var);
            yVar.b = obj;
            return yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((y) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ShoppingCartPresenter.this.y.warn("Failed to reset promo code. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter$saveInfoStoryId$1", f = "ShoppingCartPresenter.kt", l = {433}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class z extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(String str, cv1<? super z> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new z(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((z) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                zxa zxaVar = ShoppingCartPresenter.this.j;
                i15 i15Var = i15.d;
                String str = this.c;
                this.a = 1;
                if (zxaVar.c(i15Var, str, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public ShoppingCartPresenter(Cdo cdo, df4 df4Var, nfa nfaVar, o63 o63Var, i00 i00Var, k63 k63Var, cs0 cs0Var, wg6 wg6Var, wia wiaVar, zxa zxaVar, bo boVar, hq3 hq3Var, bq bqVar, nia niaVar, f5b f5bVar, f63 f63Var) {
        z65.h(cdo, "appInitializer");
        z65.h(df4Var, "getDataAvailabilityInteractor");
        z65.h(nfaVar, "setPromoCodeInteractor");
        z65.h(o63Var, "domainState");
        z65.h(i00Var, "authorizationState");
        z65.h(k63Var, "domainEvents");
        z65.h(cs0Var, "cartRepository");
        z65.h(wg6Var, "menuRefreshInteractor");
        z65.h(wiaVar, "shoppingCartInteractor");
        z65.h(zxaVar, "storiesInteractor");
        z65.h(boVar, "appInitializationStateProvider");
        z65.h(hq3Var, "featureService");
        z65.h(bqVar, "applyedPromoOfferRepository");
        z65.h(niaVar, "delegate");
        z65.h(f5bVar, "timeProvider");
        z65.h(f63Var, "router");
        this.a = cdo;
        this.b = df4Var;
        this.c = nfaVar;
        this.d = o63Var;
        this.e = i00Var;
        this.f = k63Var;
        this.g = cs0Var;
        this.h = wg6Var;
        this.i = wiaVar;
        this.j = zxaVar;
        this.k = boVar;
        this.l = hq3Var;
        this.m = bqVar;
        this.n = niaVar;
        this.o = f5bVar;
        this.p = f63Var;
        this.u = -1L;
        this.v = new wk9() { // from class: fja
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                ShoppingCartPresenter.k0(ShoppingCartPresenter.this, obj);
            }
        };
        this.w = new wk9() { // from class: gja
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                ShoppingCartPresenter.X(ShoppingCartPresenter.this, obj);
            }
        };
        this.x = true;
        this.y = LoggerFactory.getLogger("ShoppingCartPresenter");
    }

    private final void B0(lja ljaVar) {
        if (this.l.a(bq3.a5) && ljaVar.f() == jk7.e) {
            ((oja) getViewState()).Da();
            if (ljaVar.a().a().d()) {
                ((oja) getViewState()).yd();
            } else {
                ((oja) getViewState()).e3(ljaVar.a().a());
            }
            int i2 = b.$EnumSwitchMapping$1[ljaVar.a().b().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ((oja) getViewState()).i4(this.l.a(bq3.s6));
                        return;
                    }
                    return;
                }
                ((oja) getViewState()).T4();
                return;
            }
            ((oja) getViewState()).kc();
            return;
        }
        ((oja) getViewState()).J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(lja ljaVar) {
        boolean z2;
        this.q = ljaVar;
        this.s = ljaVar.p();
        if (ljaVar.o()) {
            P0(ljaVar);
            ((oja) getViewState()).n0();
            return;
        }
        ((oja) getViewState()).Wb(ljaVar.g());
        ((oja) getViewState()).P6(ljaVar);
        if (F0(ljaVar.f(), ljaVar.e())) {
            this.n.b(ck1.i);
            ((oja) getViewState()).dg(cj6.a.a(ljaVar.e()));
        } else {
            ((oja) getViewState()).L0(ljaVar.m());
        }
        B0(ljaVar);
        List<or0> g2 = ljaVar.g();
        boolean z3 = true;
        if (!(g2 instanceof Collection) || !g2.isEmpty()) {
            for (or0 or0Var : g2) {
                if (or0Var.a() > 0 && or0Var.b()) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        List<nq0> j2 = ljaVar.j();
        if (!(j2 instanceof Collection) || !j2.isEmpty()) {
            for (nq0 nq0Var : j2) {
                if (nq0Var.d() > 0 && nq0Var.y()) {
                    break;
                }
            }
        }
        z3 = false;
        if (!z2 && !z3) {
            ((oja) getViewState()).r5();
        } else {
            ((oja) getViewState()).B5();
        }
        f0(ljaVar);
        if (ljaVar.p()) {
            e0();
            this.y.info("Shopping cart is ready to checkout");
        } else {
            this.y.info("Shopping cart is not ready to checkout");
        }
        if (this.l.a(bq3.u) && ljaVar.d() > 0) {
            ((oja) getViewState()).oe(ljaVar.d());
        } else {
            ((oja) getViewState()).v1();
        }
        D0(ljaVar);
        O0();
    }

    private final void D0(lja ljaVar) {
        if (this.l.a(bq3.U5)) {
            p(z77.a(y87.a(this.i.f(), new b0(ljaVar, this, null)), new c0(null)));
        } else {
            ((oja) getViewState()).O9();
        }
    }

    private final boolean E0(lja ljaVar) {
        if (this.l.a(bq3.g6) && (ljaVar.e() instanceof cj6.b) && ((cj6.b) ljaVar.e()).l()) {
            return true;
        }
        return false;
    }

    private final boolean F0(jk7 jk7Var, cj6 cj6Var) {
        if (this.l.a(bq3.o5) && jk7Var == jk7.e && cj6.a.c(cj6Var)) {
            return true;
        }
        return false;
    }

    private final void G0(lja ljaVar, boolean z2) {
        int i2;
        if (E0(ljaVar)) {
            cj6 e2 = ljaVar.e();
            z65.f(e2, "null cannot be cast to non-null type ru.dodopizza.app.domain.cart.mindeliveryprice.MinDeliveryPriceInfo.CustomizedPriceForDelivery");
            cj6.b bVar = (cj6.b) e2;
            a aVar = z;
            int e3 = aVar.e(z2, bVar);
            ((oja) getViewState()).X2(bVar.j(), bVar.f(), aVar.c(z2), e3);
            U0(bVar);
            return;
        }
        hn6 c2 = this.g.c();
        if (z2) {
            i2 = r09.min_delivery_universal_alert_title;
        } else {
            i2 = r09.min_delivery_alert_title;
        }
        ((oja) getViewState()).Yg(c2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0() {
        p(z77.a(y87.a(this.i.g(), new d0(null)), new e0(null)));
    }

    private final void I0() {
        p(z77.a(y87.a(this.i.j(), new f0(null)), new g0(null)));
    }

    private final void K0() {
        p(z77.a(y87.a(hy.a(new h0(null)), new i0(null)), new j0(null)));
    }

    private final void L0() {
        this.n.m();
        this.n.c(B, this.v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        this.n.c(C, this.w);
        p(z77.a(y87.a(this.i.k(), new c(null)), new d(null)));
    }

    private final void N0(lja ljaVar) {
        int i2;
        if (ljaVar.f() == jk7.e) {
            if (E0(ljaVar)) {
                cj6 e2 = ljaVar.e();
                z65.f(e2, "null cannot be cast to non-null type ru.dodopizza.app.domain.cart.mindeliveryprice.MinDeliveryPriceInfo.CustomizedPriceForDelivery");
                cj6.b bVar = (cj6.b) e2;
                boolean a2 = this.l.a(bq3.h6);
                if (a2) {
                    i2 = r09.min_delivery_price_message;
                } else if (bVar.j().a() > bVar.f().a()) {
                    i2 = r09.min_delivery_price_message_decreased_value;
                } else {
                    i2 = r09.min_delivery_price_message_increased_value;
                }
                ((oja) getViewState()).ld(bVar.j(), bVar.f(), z.c(a2), i2);
                U0(bVar);
                return;
            }
            ((oja) getViewState()).R3(this.g.c());
            return;
        }
        ((oja) getViewState()).e4();
    }

    private final void O0() {
        if (j0() && this.e.b()) {
            if (!kq3.a(this.l)) {
                ((oja) getViewState()).Id();
            } else {
                ((oja) getViewState()).Td();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        y0();
    }

    private final void P0(lja ljaVar) {
        if (ljaVar.f() != jk7.e) {
            return;
        }
        if (this.l.a(bq3.b5) && (!ljaVar.b().isEmpty())) {
            ((oja) getViewState()).He(ljaVar.b());
        } else {
            N0(ljaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        p(z77.a(y87.a(this.i.h(), new h(null)), new i(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0() {
        m0 m0Var = new m0();
        if (co.a(this.k)) {
            m0Var.invoke();
        } else {
            p(y87.a(hy.a(new k0(null)), new l0(m0Var, null)));
        }
    }

    private final void R() {
        if (this.l.a(bq3.v)) {
            ((oja) getViewState()).Z2();
        }
    }

    private final void R0() {
        o(wz3.F(this.b.a(), new n0(null)));
    }

    private final void S() {
        op8 a2 = this.d.a();
        w18 a3 = this.m.a();
        if (a2.h()) {
            ((oja) getViewState()).J6(a2);
        } else if (a3.h()) {
            ((oja) getViewState()).Z6(a3);
        } else {
            ((oja) getViewState()).xc();
        }
    }

    private final void S0() {
        o(wz3.F(this.f.c(), new o0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        if (this.l.a(bq3.O5)) {
            S();
        } else {
            U();
        }
    }

    private final void T0() {
        p(z77.a(this.i.d(), new p0(null)));
    }

    private final void U() {
        op8 a2 = this.d.a();
        if (a2.h()) {
            ((oja) getViewState()).J6(a2);
        } else {
            ((oja) getViewState()).xc();
        }
    }

    private final void U0(cj6.b bVar) {
        if (bVar.m()) {
            this.n.a(new nl6(String.valueOf(bVar.i().a()), String.valueOf(bVar.c().a()), bVar.d(), ck1.i));
        }
    }

    private final void W() {
        this.n.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(ShoppingCartPresenter shoppingCartPresenter, Object obj) {
        z65.h(shoppingCartPresenter, "this$0");
        if (obj instanceof v51) {
            shoppingCartPresenter.n.h();
            v51 v51Var = (v51) obj;
            if (z65.c(v51Var, v51.e.a)) {
                ((oja) shoppingCartPresenter.getViewState()).xg();
            } else if (z65.c(v51Var, v51.c.a)) {
                ((oja) shoppingCartPresenter.getViewState()).h8();
            } else if (z65.c(v51Var, v51.a.a)) {
                ((oja) shoppingCartPresenter.getViewState()).Eb();
            } else if (z65.c(v51Var, v51.d.a)) {
                ((oja) shoppingCartPresenter.getViewState()).C6();
            }
        }
    }

    private final void Y() {
        boolean z2;
        oja ojaVar = (oja) getViewState();
        if (j0() && this.e.b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        ojaVar.w1(z2);
    }

    private final wx<String> Z(nq0 nq0Var) {
        return y87.a(this.i.a(nq0Var), new j(nq0Var, null));
    }

    private final void a0() {
        sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    private final boolean b0(cj6 cj6Var) {
        if (!(cj6Var instanceof cj6.b) || ((cj6.b) cj6Var).e() - this.o.b() >= 0) {
            return false;
        }
        return true;
    }

    private final void c0(nq0 nq0Var, int i2) {
        if (this.x) {
            this.x = false;
            p(z77.a(y87.a(this.i.m(new ng4(nq0Var, i2)), new l(null)), new m(null)));
        }
    }

    private final void d0() {
        p(z77.a(this.c.l(), new n(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0() {
        ((oja) getViewState()).se();
        if (this.r) {
            n0();
            this.r = false;
        }
    }

    private final void f0(lja ljaVar) {
        cj6.b bVar;
        long j2;
        boolean a2 = this.l.a(bq3.h6);
        if (ljaVar.f() == jk7.e && ((ljaVar.e() instanceof cj6.d) || (ljaVar.e() instanceof cj6.b))) {
            cj6 e2 = ljaVar.e();
            boolean z2 = e2 instanceof cj6.b;
            cj6.b bVar2 = null;
            if (z2) {
                bVar = (cj6.b) e2;
            } else {
                bVar = null;
            }
            long j3 = 0;
            if (bVar != null) {
                j2 = bVar.e();
            } else {
                j2 = 0;
            }
            if (j2 != this.u && b0(e2)) {
                if (z2) {
                    bVar2 = (cj6.b) e2;
                }
                if (bVar2 != null) {
                    j3 = bVar2.e();
                }
                this.u = j3;
                V0();
            }
            if (cj6.a.b(e2)) {
                ((oja) getViewState()).Je();
            } else {
                G0(ljaVar, a2);
            }
            boolean z3 = !z65.c(ljaVar.h(), ljaVar.i());
            if (this.l.a(bq3.g5) && !this.l.a(bq3.p5)) {
                ((oja) getViewState()).S4(z3);
                return;
            } else {
                ((oja) getViewState()).G5();
                return;
            }
        }
        ((oja) getViewState()).Je();
        ((oja) getViewState()).G5();
    }

    private final void g0() {
        ((oja) getViewState()).showProgressBar();
        I0();
    }

    private final boolean j0() {
        return this.l.a(bq3.D5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(ShoppingCartPresenter shoppingCartPresenter, Object obj) {
        z65.h(shoppingCartPresenter, "this$0");
        if (obj instanceof fy5) {
            shoppingCartPresenter.n.e();
            if (obj instanceof fy5.b.a) {
                ((oja) shoppingCartPresenter.getViewState()).showProgressBar();
                shoppingCartPresenter.M();
            }
        }
    }

    private final void y0() {
        if (j0() && this.e.b()) {
            if (!kq3.a(this.l)) {
                ((oja) getViewState()).Va();
            } else {
                ((oja) getViewState()).L6();
            }
        }
    }

    private final void z0(String str) {
        this.n.a(pp8.a.a(str, ck1.i));
        p(z77.a(this.c.m(), new y(null)));
    }

    public final void A0(String str) {
        z65.h(str, "id");
        p(z77.a(hy.a(new z(str, null)), new a0(str, null)));
    }

    public final void J0(List<lq3> list) {
        z65.h(list, "levels");
        this.n.i(new r93(new q93(list)));
    }

    public final void N(nq0 nq0Var) {
        z65.h(nq0Var, "cartItem");
        if (this.x) {
            this.x = false;
            p(z77.a(y87.a(this.i.e(nq0Var), new e(null)), new f(null)));
        }
    }

    public final void O(String str) {
        z65.h(str, "upsaleProductId");
        p(z77.a(this.i.i(str), new g(null)));
    }

    @Override // moxy.MvpPresenter
    /* renamed from: V */
    public void attachView(oja ojaVar) {
        super.attachView(ojaVar);
        K0();
        T0();
        Q();
        Y();
        a0();
    }

    public final void V0() {
        if (this.l.a(bq3.H6) || this.l.a(bq3.W5)) {
            l95 l95Var = this.t;
            if (l95Var == null || (l95Var != null && l95Var.e())) {
                this.t = p(z77.a(y87.a(this.i.k(), new q0(null)), new r0(null)));
            }
        }
    }

    public final void h0(boolean z2) {
        ((oja) getViewState()).w1(z2);
        this.n.a(new b08(h18.f));
    }

    public final boolean i0() {
        return this.l.a(bq3.h7);
    }

    public final void l0(nq0 nq0Var) {
        z65.h(nq0Var, "cartItem");
        this.n.g(nq0Var.m());
        int i2 = b.$EnumSwitchMapping$0[nq0Var.m().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            Logger logger = this.y;
                            kl8 m2 = nq0Var.m();
                            logger.warn("Change for " + m2 + " category not support");
                            return;
                        }
                        p(z77.a(Z(nq0Var), new u(null)));
                        return;
                    }
                    p(z77.a(Z(nq0Var), new t(null)));
                    return;
                }
                p(z77.a(Z(nq0Var), new s(null)));
                return;
            }
            p(z77.a(y87.a(this.i.a(nq0Var), new q(nq0Var, null)), new r(null)));
            return;
        }
        p(z77.a(y87.a(this.i.c(nq0Var), new o(nq0Var, null)), new p(null)));
    }

    public final void m0() {
        W();
    }

    public final void n0() {
        if (!this.s) {
            ((oja) getViewState()).showProgressBar();
            this.r = true;
        } else if (this.e.b()) {
            g0();
        } else {
            L0();
        }
    }

    public final void o0() {
        if (this.e.b()) {
            ((oja) getViewState()).Lf();
        } else {
            this.n.p();
        }
    }

    public final void onBackPressed() {
        this.p.d();
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        this.n.h();
        this.n.e();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        R0();
        T();
        Q0();
        R();
        S0();
        ((oja) getViewState()).w1(false);
    }

    public final void p0(v23 v23Var) {
        z65.h(v23Var, "discount");
        ((oja) getViewState()).T1(new ce0("", v23Var.f(), v23Var.c(), "", new xp(yp.c, "")));
    }

    public final void q0() {
        cj6 e2;
        lja ljaVar = this.q;
        if (ljaVar != null && (e2 = ljaVar.e()) != null) {
            cj6.a aVar = cj6.a;
            if (aVar.c(e2)) {
                this.n.d(aVar.a(e2), ck1.i);
            }
        }
        W();
    }

    public final void r0() {
        ((oja) getViewState()).ff();
        this.n.a(ay6.a.a());
    }

    public final void s0(String str) {
        z65.h(str, "title");
        p(z77.a(y87.a(this.i.l(), new v(str, null)), new w(null)));
    }

    public final void t0() {
        p(hy.a(new x(null)));
    }

    public final void u0() {
        op8 a2 = this.d.a();
        if (this.l.a(bq3.O5)) {
            w18 a3 = this.m.a();
            if (a2.h()) {
                z0(a2.d());
                return;
            } else if (a3.h()) {
                d0();
                return;
            } else {
                return;
            }
        }
        z0(a2.d());
    }

    public final void v0() {
        ((oja) getViewState()).R8();
    }

    public final void w0(nq0 nq0Var) {
        z65.h(nq0Var, "cartItem");
        c0(nq0Var, nq0Var.d());
    }

    public final void x0(nq0 nq0Var) {
        z65.h(nq0Var, "cartItem");
        c0(nq0Var, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0() {
    }
}
