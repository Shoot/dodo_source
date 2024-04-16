package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.dodopizza.order.feature.personaloffer.PersonalOffersFeatureDependencies;
import com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter;
import com.dodopizza.order.feature.personaloffer.presentantion.RecyclerViewWithSwipeEnd;
import com.dodopizza.order.feature.personaloffer.presentantion.adapter.PersonalOfferViewHolder;
import com.dodopizza.order.feature.personaloffer.presentantion.adapter.SecretCardViewHolder;
import com.dodopizza.order.feature.personaloffer.presentantion.adapter.emptystate.PersonalOffersEmptyStateViewHolder;
import com.dodopizza.order.feature.personaloffer.presentantion.adapter.failstate.PersonalOffersFailStateViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.iu6;
import defpackage.k6;
import defpackage.n08;
import defpackage.o3b;
import defpackage.y08;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: PersonalOffersFragment.kt */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u008f\u0001\b\u0007\u0018\u0000 \u0099\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u009a\u0001B\t¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J$\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fH\u0002J\u001c\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u001c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\u0016\u0010\"\u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0006H\u0016J\u0010\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0015H\u0016J\b\u00104\u001a\u00020\u0006H\u0016J\u0018\u00108\u001a\u00020\u00062\u0006\u00105\u001a\u00020 2\u0006\u00107\u001a\u000206H\u0016J\u0018\u0010:\u001a\u00020\u00062\u0006\u00105\u001a\u0002092\u0006\u00107\u001a\u000206H\u0016J\u0010\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0016J\u0010\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020/H\u0016J\b\u0010@\u001a\u00020\bH\u0014J\u0010\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0015H\u0016J\u0010\u0010D\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\bH\u0016J\b\u0010E\u001a\u00020\u0006H\u0016J\b\u0010F\u001a\u00020\u0006H\u0016J\b\u0010G\u001a\u00020\u0006H\u0016J\b\u0010H\u001a\u00020\u0006H\u0016R\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR(\u0010Y\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR#\u0010^\u001a\n \u0013*\u0004\u0018\u00010R0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001b\u0010d\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010a\u001a\u0004\bg\u0010hR\u001b\u0010n\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010a\u001a\u0004\bl\u0010mR\u001b\u0010s\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010a\u001a\u0004\bq\u0010rR\u001b\u0010v\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010a\u001a\u0004\bu\u0010rR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u0082\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u009b\u0001"}, d2 = {"Ly08;", "Lf70;", "Lk18;", "Liu6$e;", "Liu6$c;", "Liu6$d;", "", "Lh", "", "useSpecialColorForLastItem", "Mh", "Kh", "Landroid/view/View;", "view", "xh", "Lkotlin/Function1;", "", "updateValueHandler", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "Ih", "", "Gh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onPause", "V2", "", "Lp67;", "personalOffersVO", "F8", "Nc", "L2", "W5", "le", "Pd", "i9", "K4", "vd", "q8", "Y9", "Me", "ub", "", "message", "j0", "messageResId", "R0", "I9", "personalOffer", "Lcq8;", "sender", "l3", "Lt2a;", "Re", "Lrb1;", "collaborationPromo", "Gg", "blockTitle", "A4", "lh", "textAppearance", "z3", "visible", "D8", "I0", "S9", "l0", "Z9", "Ln67;", com.huawei.hms.opendevice.c.a, "Ln67;", "zh", "()Ln67;", "setOfferDialogCreator", "(Ln67;)V", "offerDialogCreator", "Las8;", "Lcom/dodopizza/order/feature/personaloffer/presentantion/PersonalOffersPresenter;", DateTokenConverter.CONVERTER_KEY, "Las8;", "Eh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", com.huawei.hms.push.e.a, "Lmoxy/ktx/MoxyKtxDelegate;", "Dh", "()Lcom/dodopizza/order/feature/personaloffer/presentantion/PersonalOffersPresenter;", "presenter", "Landroid/widget/ViewAnimator;", "f", "Lk79;", "Ah", "()Landroid/widget/ViewAnimator;", "personalOfferAnimator", "Lcom/dodopizza/order/feature/personaloffer/presentantion/RecyclerViewWithSwipeEnd;", "g", "Ch", "()Lcom/dodopizza/order/feature/personaloffer/presentantion/RecyclerViewWithSwipeEnd;", "personalOffers", "Lcom/airbnb/lottie/LottieAnimationView;", Image.TYPE_HIGH, "yh", "()Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "Landroid/widget/TextView;", "i", "Bh", "()Landroid/widget/TextView;", "personalOfferDescription", "j", "Fh", "profilePersonalOffersTitle", "Lt05;", "k", "Lt05;", "personalOfferIndicatorParams", "Lbq5;", "l", "Lbq5;", "personalOffersPagerIndicatorDecoration", "Lep7;", Image.TYPE_MEDIUM, "Lep7;", "pagerMarginItemDecoration", "Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/SecretCardViewHolder;", "n", "Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/SecretCardViewHolder;", "lastAnimatedSecretCardViewHolder", "Landroidx/recyclerview/widget/n;", "o", "Landroidx/recyclerview/widget/n;", "pagerSnapHelper", "Landroid/animation/AnimatorSet;", "p", "Landroid/animation/AnimatorSet;", "scrollAnimation", "y08$h", "q", "Ly08$h;", "animationListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "r", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "<init>", "()V", Image.TYPE_SMALL, "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y08  reason: default package */
/* loaded from: classes2.dex */
public final class y08 extends f70 implements k18, iu6.e, iu6.c, iu6.d {
    public n67 c;
    public as8<PersonalOffersPresenter> d;
    private final MoxyKtxDelegate e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final t05 k;
    private final bq5 l;
    private ep7 m;
    private SecretCardViewHolder n;
    private final androidx.recyclerview.widget.n o;
    private AnimatorSet p;
    private final h q;
    private ViewTreeObserver.OnGlobalLayoutListener r;
    static final /* synthetic */ je5<Object>[] t = {bc9.f(new ar8(y08.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/personaloffer/presentantion/PersonalOffersPresenter;", 0)), bc9.f(new ar8(y08.class, "personalOfferAnimator", "getPersonalOfferAnimator()Landroid/widget/ViewAnimator;", 0)), bc9.f(new ar8(y08.class, "personalOffers", "getPersonalOffers()Lcom/dodopizza/order/feature/personaloffer/presentantion/RecyclerViewWithSwipeEnd;", 0)), bc9.f(new ar8(y08.class, "animationView", "getAnimationView()Lcom/airbnb/lottie/LottieAnimationView;", 0)), bc9.f(new ar8(y08.class, "personalOfferDescription", "getPersonalOfferDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(y08.class, "profilePersonalOffersTitle", "getProfilePersonalOffersTitle()Landroid/widget/TextView;", 0))};
    public static final a s = new a(null);
    public static final int u = 8;

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000fJ \u0010\u0017\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\tR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010$\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010!R\u0014\u0010&\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006,"}, d2 = {"Ly08$a;", "", "Landroid/view/View;", "view", "", "scale", "", "i", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function0;", "actionFun", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", com.huawei.hms.push.e.a, "Lo08;", "personalOffersData", "Landroid/os/Bundle;", DateTokenConverter.CONVERTER_KEY, "args", "Ly08;", "f", "Landroidx/fragment/app/Fragment;", "recipient", "resultListener", "g", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "PERSONAL_OFFER_CHANGED", "", "SCROLL_ANIMATION_DURATION", "J", "", "SCROLL_START_X", "I", "SCROLL_TARGET_X", "SET_EMPTY_STATE", "TAG", "TOP_PERSONAL_INDICATOR_MARGIN", "VISIBILITY", "ZOOM_END_VALUE", "F", "ZOOM_START_VALUE", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y08$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: PersonalOffersFragment.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"y08$a$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: y08$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class ViewTreeObserver$OnGlobalLayoutListenerC0748a implements ViewTreeObserver.OnGlobalLayoutListener {
            final /* synthetic */ Function0<Unit> a;
            final /* synthetic */ RecyclerView b;

            ViewTreeObserver$OnGlobalLayoutListenerC0748a(Function0<Unit> function0, RecyclerView recyclerView) {
                this.a = function0;
                this.b = recyclerView;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                this.a.invoke();
                this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewTreeObserver.OnGlobalLayoutListener e(RecyclerView recyclerView, Function0<Unit> function0) {
            if (!recyclerView.isAnimating()) {
                function0.invoke();
                return null;
            }
            ViewTreeObserver$OnGlobalLayoutListenerC0748a viewTreeObserver$OnGlobalLayoutListenerC0748a = new ViewTreeObserver$OnGlobalLayoutListenerC0748a(function0, recyclerView);
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC0748a);
            return viewTreeObserver$OnGlobalLayoutListenerC0748a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(Function0 function0, String str, Bundle bundle) {
            z65.h(function0, "$resultListener");
            z65.h(str, "<anonymous parameter 0>");
            z65.h(bundle, "<anonymous parameter 1>");
            function0.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i(View view, float f) {
            view.setScaleX(f);
            view.setScaleY(f);
        }

        public final Bundle d(o08 o08Var) {
            z65.h(o08Var, "personalOffersData");
            return bi0.c(lnb.a("data", o08Var));
        }

        public final y08 f(Bundle bundle) {
            z65.h(bundle, "args");
            return (y08) y64.d(new y08(), bundle);
        }

        public final y08 g(y08 y08Var, Fragment fragment, final Function0<Unit> function0) {
            z65.h(y08Var, "<this>");
            z65.h(fragment, "recipient");
            z65.h(function0, "resultListener");
            fragment.getChildFragmentManager().A1("SET_EMPTY_STATE", fragment, new r64() { // from class: x08
                @Override // defpackage.r64
                public final void a(String str, Bundle bundle) {
                    y08.a.h(Function0.this, str, bundle);
                }
            });
            return y08Var;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y08$a0 */
    /* loaded from: classes2.dex */
    static final class a0 extends ej5 implements Function0<Unit> {
        a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            y08.this.Dh().O();
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y08$b */
    /* loaded from: classes2.dex */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
            y08.this.o.b(y08.this.Ch());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animator");
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$b0 */
    /* loaded from: classes2.dex */
    public static final class b0 extends ej5 implements Function1<Object, Boolean> {
        public static final b0 a = new b0();

        public b0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof r08);
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y08$c */
    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animator");
            y08.this.o.b(y08.this.Ch());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animator");
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$c0 */
    /* loaded from: classes2.dex */
    public static final class c0 extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final c0 a = new c0();

        public c0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = PersonalOffersEmptyStateViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y08$d */
    /* loaded from: classes2.dex */
    public static final class d implements Animator.AnimatorListener {
        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animator");
            y08.this.o.b(null);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$d0 */
    /* loaded from: classes2.dex */
    public static final class d0 extends ej5 implements Function1<Object, Boolean> {
        public static final d0 a = new d0();

        public d0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof t08);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y08$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function1<Integer, Unit> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            y08.this.Ch().scrollBy(i, 0);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$e0 */
    /* loaded from: classes2.dex */
    public static final class e0 extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final e0 a = new e0();

        public e0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = PersonalOffersFailStateViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "", "a", "(F)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<Float, Unit> {
        final /* synthetic */ View a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(1);
            this.a = view;
        }

        public final void a(float f) {
            y08.s.i(this.a, f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            a(f.floatValue());
            return Unit.a;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y08$f0 */
    /* loaded from: classes2.dex */
    static final class f0 extends ej5 implements Function0<Unit> {
        f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            y08.this.Dh().S();
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y08$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function0<Unit> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view;
            RecyclerView.h adapter = y08.this.Ch().getAdapter();
            RecyclerView.d0 findViewHolderForAdapterPosition = y08.this.Ch().findViewHolderForAdapterPosition(adapter != null ? adapter.getItemCount() - 1 : 0);
            if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
                return;
            }
            y08.this.xh(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$g0 */
    /* loaded from: classes2.dex */
    public static final class g0 extends ej5 implements Function1<uoa, Unit> {
        final /* synthetic */ String b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PersonalOffersFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: y08$g0$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ y08 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y08 y08Var) {
                super(0);
                this.a = y08Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                return this.a.Ah();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PersonalOffersFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: y08$g0$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(String str) {
            super(1);
            this.b = str;
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(y08.this));
            uoaVar.h(new b(this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"y08$h", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y08$h */
    /* loaded from: classes2.dex */
    public static final class h implements Animator.AnimatorListener {
        h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animation");
            un3.e(y08.this.yh());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animation");
            un3.e(y08.this.yh());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animation");
            un3.k(y08.this.yh());
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y08$i */
    /* loaded from: classes2.dex */
    public static final class i implements Animator.AnimatorListener {
        final /* synthetic */ Function1 a;

        public i(Function1 function1) {
            this.a = function1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
            this.a.invoke(Float.valueOf(1.0f));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animator");
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y08$j */
    /* loaded from: classes2.dex */
    static final class j extends ej5 implements Function1<Integer, Unit> {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            y08.this.Dh().U(i);
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "oldPosition", "newPosition", "", "a", "(II)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$k */
    /* loaded from: classes2.dex */
    static final class k extends ej5 implements Function2<Integer, Integer, Unit> {
        k() {
            super(2);
        }

        public final void a(int i, int i2) {
            y08.this.Dh().T(i, i2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return Unit.a;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lta7;", "a", "()Lta7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$l */
    /* loaded from: classes2.dex */
    static final class l extends ej5 implements Function0<ta7> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ta7 invoke() {
            int i;
            SecretCardViewHolder secretCardViewHolder;
            RecyclerView.h adapter = y08.this.Ch().getAdapter();
            if (adapter != null) {
                i = adapter.getItemCount() - 1;
            } else {
                i = 0;
            }
            RecyclerView.d0 findViewHolderForAdapterPosition = y08.this.Ch().findViewHolderForAdapterPosition(i);
            y08 y08Var = y08.this;
            if (findViewHolderForAdapterPosition instanceof SecretCardViewHolder) {
                secretCardViewHolder = (SecretCardViewHolder) findViewHolderForAdapterPosition;
            } else {
                secretCardViewHolder = null;
            }
            y08Var.n = secretCardViewHolder;
            return y08.this.n;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"y08$m", "Lo3b;", "", "isCompleted", "", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y08$m */
    /* loaded from: classes2.dex */
    public static final class m implements o3b {
        m() {
        }

        @Override // defpackage.o3b
        public void a(boolean z) {
            if (z) {
                y08.this.Mh(true);
                un3.k(y08.this.yh());
                y08.this.yh().x();
            }
        }

        @Override // defpackage.o3b
        public void b() {
            y08.this.yh().l();
        }

        @Override // defpackage.o3b
        public void c(View view, float f) {
            o3b.a.b(this, view, f);
        }

        @Override // defpackage.o3b
        public void d(View view) {
            o3b.a.a(this, view);
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/personaloffer/presentantion/PersonalOffersPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/personaloffer/presentantion/PersonalOffersPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$n */
    /* loaded from: classes2.dex */
    static final class n extends ej5 implements Function0<PersonalOffersPresenter> {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PersonalOffersPresenter invoke() {
            return y08.this.Eh().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$o */
    /* loaded from: classes2.dex */
    public static final class o extends ej5 implements Function1<Object, Boolean> {
        public static final o a = new o();

        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof k08);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$p */
    /* loaded from: classes2.dex */
    public static final class p extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final p a = new p();

        public p() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = PersonalOfferViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$q */
    /* loaded from: classes2.dex */
    public static final class q extends ej5 implements Function1<Object, Boolean> {
        public static final q a = new q();

        public q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof t2a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$r */
    /* loaded from: classes2.dex */
    public static final class r extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final r a = new r();

        public r() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = SecretCardViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp67;", "offerVO", "", "a", "(Lp67;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$s */
    /* loaded from: classes2.dex */
    static final class s extends ej5 implements Function1<p67, Unit> {
        s() {
            super(1);
        }

        public final void a(p67 p67Var) {
            z65.h(p67Var, "offerVO");
            y08.this.Dh().P(p67Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(p67 p67Var) {
            a(p67Var);
            return Unit.a;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp67;", "offerVO", "", "a", "(Lp67;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$t */
    /* loaded from: classes2.dex */
    static final class t extends ej5 implements Function1<p67, Unit> {
        t() {
            super(1);
        }

        public final void a(p67 p67Var) {
            z65.h(p67Var, "offerVO");
            y08.this.Dh().V(p67Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(p67 p67Var) {
            a(p67Var);
            return Unit.a;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp67;", "offerVO", "", "a", "(Lp67;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$u */
    /* loaded from: classes2.dex */
    static final class u extends ej5 implements Function1<p67, Unit> {
        u() {
            super(1);
        }

        public final void a(p67 p67Var) {
            z65.h(p67Var, "offerVO");
            y08.this.Dh().R(p67Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(p67 p67Var) {
            a(p67Var);
            return Unit.a;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp67;", "offerVO", "", "a", "(Lp67;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$v */
    /* loaded from: classes2.dex */
    static final class v extends ej5 implements Function1<p67, Unit> {
        v() {
            super(1);
        }

        public final void a(p67 p67Var) {
            z65.h(p67Var, "offerVO");
            y08.this.Dh().P(p67Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(p67 p67Var) {
            a(p67Var);
            return Unit.a;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp67;", "offerVO", "", "a", "(Lp67;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$w */
    /* loaded from: classes2.dex */
    static final class w extends ej5 implements Function1<p67, Unit> {
        w() {
            super(1);
        }

        public final void a(p67 p67Var) {
            z65.h(p67Var, "offerVO");
            y08.this.Dh().V(p67Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(p67 p67Var) {
            a(p67Var);
            return Unit.a;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp67;", "offerVO", "", "a", "(Lp67;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$x */
    /* loaded from: classes2.dex */
    static final class x extends ej5 implements Function1<p67, Unit> {
        x() {
            super(1);
        }

        public final void a(p67 p67Var) {
            z65.h(p67Var, "offerVO");
            y08.this.Dh().R(p67Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(p67 p67Var) {
            a(p67Var);
            return Unit.a;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp67;", "offerVO", "", "a", "(Lp67;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y08$y */
    /* loaded from: classes2.dex */
    static final class y extends ej5 implements Function1<p67, Unit> {
        y() {
            super(1);
        }

        public final void a(p67 p67Var) {
            z65.h(p67Var, "offerVO");
            y08.this.Dh().W(p67Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(p67 p67Var) {
            a(p67Var);
            return Unit.a;
        }
    }

    /* compiled from: PersonalOffersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y08$z */
    /* loaded from: classes2.dex */
    static final class z extends ej5 implements Function0<Unit> {
        z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            y08.this.Dh().O();
        }
    }

    public y08() {
        super(gz8.fragment_personal_offers);
        n nVar = new n();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.e = new MoxyKtxDelegate(mvpDelegate, PersonalOffersPresenter.class.getName() + ".presenter", nVar);
        this.f = kb0.e(this, gy8.profile_personal_offers_switcher);
        this.g = kb0.e(this, gy8.profile_personal_offers_list);
        this.h = kb0.e(this, gy8.animation_view);
        this.i = kb0.e(this, gy8.profile_personal_offers_description);
        this.j = kb0.e(this, gy8.profile_personal_offers_title);
        t05 t05Var = new t05(ew8.surfaceQuaternaryColor, ew8.x, 0.0f, kx9.a(4), 0.0f, 0.0f, true, false, ew8.strokeLoyaltyColor, 52, null);
        this.k = t05Var;
        this.l = new bq5(t05Var);
        this.m = new ep7(8, 16, 8, 8);
        this.o = new androidx.recyclerview.widget.n();
        this.q = new h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewAnimator Ah() {
        return (ViewAnimator) this.f.a(this, t[1]);
    }

    private final TextView Bh() {
        return (TextView) this.i.a(this, t[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerViewWithSwipeEnd Ch() {
        return (RecyclerViewWithSwipeEnd) this.g.a(this, t[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonalOffersPresenter Dh() {
        return (PersonalOffersPresenter) this.e.getValue(this, t[0]);
    }

    private final TextView Fh() {
        return (TextView) this.j.a(this, t[5]);
    }

    private final ValueAnimator Gh(final Function1<? super Integer, Unit> function1) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(500L);
        valueAnimator.setIntValues(0, 10);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: w08
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                y08.Hh(Function1.this, valueAnimator2);
            }
        });
        return valueAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Hh(Function1 function1, ValueAnimator valueAnimator) {
        z65.h(function1, "$updateValueHandler");
        z65.h(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        z65.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        function1.invoke(Integer.valueOf(((Integer) animatedValue).intValue()));
    }

    private final ValueAnimator Ih(final Function1<? super Float, Unit> function1) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.1f);
        ofFloat.setDuration(500L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: v08
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                y08.Jh(Function1.this, valueAnimator);
            }
        });
        z65.e(ofFloat);
        ofFloat.addListener(new i(function1));
        ofFloat.setRepeatCount(1);
        ofFloat.setRepeatMode(2);
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jh(Function1 function1, ValueAnimator valueAnimator) {
        z65.h(function1, "$updateValueHandler");
        z65.h(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        z65.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        function1.invoke((Float) animatedValue);
    }

    private final void Kh() {
        this.l.i(t05.b(this.k, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, true, false, 0, 319, null));
        Ch().setUseDraggingForLastItem(false);
    }

    private final void Lh() {
        Ch().setUseDraggingForLastItem(true);
        this.l.i(t05.b(this.k, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, true, 0, 319, null));
        RecyclerView.h adapter = Ch().getAdapter();
        if (adapter != null && adapter.getItemCount() == 2) {
            Ch().removeItemDecoration(this.m);
            this.m = new ep7(8, 8, 8, 8);
            Ch().addItemDecoration(this.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mh(boolean z2) {
        Ch().setUseDraggingForLastItem(false);
        this.l.i(t05.b(this.k, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, true, z2, 0, 319, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xh(View view) {
        AnimatorSet animatorSet = this.p;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator Gh = Gh(new e());
        ValueAnimator Ih = Ih(new f(view));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(Gh, Ih);
        animatorSet2.addListener(new d());
        animatorSet2.addListener(new c());
        animatorSet2.addListener(new b());
        animatorSet2.start();
        this.p = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LottieAnimationView yh() {
        return (LottieAnimationView) this.h.a(this, t[3]);
    }

    @Override // defpackage.k18
    public void A4(String str) {
        z65.h(str, "blockTitle");
        Fh().setText(str);
    }

    @Override // defpackage.k18
    public void D8(boolean z2) {
        getParentFragmentManager().z1("PERSONAL_OFFER_CHANGED", bi0.c(bi0.d("VISIBILITY", Boolean.valueOf(z2))));
    }

    public final as8<PersonalOffersPresenter> Eh() {
        as8<PersonalOffersPresenter> as8Var = this.d;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.k18
    public void F8(List<? extends p67> list) {
        z65.h(list, "personalOffersVO");
        Ch().setAdapter(new k6.a(new k6.a(new k6(list), o.a, new f08(new s(), new t(), new u()), p.a).b(), q.a, new s2a(new v(), new w(), new x(), new y()), r.a).b().d());
    }

    @Override // defpackage.k18
    public void Gg(rb1 rb1Var) {
        z65.h(rb1Var, "collaborationPromo");
        zh().a(rb1Var).show(getChildFragmentManager(), "collaboration_promo_fragment");
    }

    @Override // defpackage.k18
    public void I0() {
        new iu6.a().e(r09.confirm_change_promoaction_dialog_title).b(r09.confirm_change_promoaction_dialog_message).d(r09.confirm_change_promocode_dialog_positive).c(r09.confirm_change_promocode_dialog_negative).g(this);
    }

    @Override // defpackage.k18
    public void I9() {
        String string = getString(r09.promocode_failure_error);
        z65.g(string, "getString(...)");
        j0(string);
    }

    @Override // defpackage.k18
    public void K4() {
        un3.l(Ah(), gy8.profile_personal_offers_list);
        Mh(false);
    }

    @Override // defpackage.k18
    public void L2() {
        un3.k(Bh());
        Bh().setText(r09.personal_offers_expiring_description);
    }

    @Override // defpackage.k18
    public void Me() {
        R0(r09.bonus_action_applied);
    }

    @Override // defpackage.k18
    public void Nc() {
        un3.l(Ah(), gy8.profile_personal_offer_loading);
    }

    @Override // defpackage.k18
    public void Pd() {
        un3.l(Ah(), gy8.profile_personal_offers_list);
        Kh();
    }

    @Override // defpackage.k18
    public void R0(int i2) {
        String string = getString(i2);
        z65.g(string, "getString(...)");
        j0(string);
    }

    @Override // defpackage.k18
    public void Re(t2a t2aVar, cq8 cq8Var) {
        z65.h(t2aVar, "personalOffer");
        z65.h(cq8Var, "sender");
        zh().c(t2aVar, cq8Var, new a0(), this).show(getChildFragmentManager(), "bonus_action_fragment");
    }

    @Override // defpackage.iu6.e
    public void S9() {
        Dh().M();
    }

    @Override // defpackage.k18
    public void V2() {
        this.r = s.e(Ch(), new g());
    }

    @Override // defpackage.k18
    public void W5() {
        un3.k(Bh());
        Bh().setText(r09.personal_offer_single_description);
    }

    @Override // defpackage.k18
    public void Y9() {
        List e2;
        RecyclerViewWithSwipeEnd Ch = Ch();
        e2 = jc1.e(t08.a);
        Ch.setAdapter(new k6.a(new k6(e2), d0.a, new u08(new f0()), e0.a).b().d());
        un3.l(Ah(), gy8.profile_personal_offers_list);
    }

    @Override // defpackage.iu6.d
    public void Z9() {
        Dh().Q();
    }

    @Override // defpackage.k18
    public void i9() {
        un3.l(Ah(), gy8.profile_personal_offers_list);
        Lh();
    }

    @Override // defpackage.k18
    public void j0(String str) {
        z65.h(str, "message");
        soa.a.a(new g0(str)).U();
    }

    @Override // defpackage.iu6.c
    public void l0() {
        Dh().Q();
    }

    @Override // defpackage.k18
    public void l3(p67 p67Var, cq8 cq8Var) {
        z65.h(p67Var, "personalOffer");
        z65.h(cq8Var, "sender");
        zh().b(p67Var, cq8Var, new z(), this).show(getChildFragmentManager(), "bonus_action_fragment");
    }

    @Override // defpackage.k18
    public void le() {
        un3.k(Bh());
        Bh().setText(r09.personal_offers_many_description);
    }

    @Override // defpackage.f70
    protected boolean lh() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        n08.a a2 = zg2.a();
        PersonalOffersFeatureDependencies personalOffersFeatureDependencies = (PersonalOffersFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(PersonalOffersFeatureDependencies.class));
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof o08)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a(personalOffersFeatureDependencies, (o08) obj).a(this);
            super.onAttach(context);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Ch().getViewTreeObserver().removeOnGlobalLayoutListener(this.r);
        Ch().n();
        yh().l();
        SecretCardViewHolder secretCardViewHolder = this.n;
        if (secretCardViewHolder != null) {
            secretCardViewHolder.cancelAnimation();
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Ch().addItemDecoration(this.m);
        Ch().addItemDecoration(this.l);
        RecyclerViewWithSwipeEnd Ch = Ch();
        androidx.recyclerview.widget.n nVar = this.o;
        nVar.b(Ch());
        Ch.addOnScrollListener(new xoa(nVar, new j(), new k()));
        yh().i(this.q);
        RecyclerViewWithSwipeEnd Ch2 = Ch();
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        Ch2.g(new q3b(requireContext), new sga(), new isa(new l()), new gdc(), new m());
    }

    @Override // defpackage.k18
    public void q8() {
        List e2;
        RecyclerViewWithSwipeEnd Ch = Ch();
        e2 = jc1.e(r08.a);
        Ch.setAdapter(new k6.a(new k6(e2), b0.a, new s08(), c0.a).b().d());
        un3.l(Ah(), gy8.profile_personal_offers_list);
        i64.a(this, "SET_EMPTY_STATE", new Bundle());
    }

    @Override // defpackage.k18
    public void ub() {
        R0(r09.personal_offer_partly_applied_message);
    }

    @Override // defpackage.k18
    public void vd() {
        Bh().setVisibility(8);
    }

    @Override // defpackage.k18
    public void z3(int i2) {
        edb.o(Fh(), i2);
    }

    public final n67 zh() {
        n67 n67Var = this.c;
        if (n67Var != null) {
            return n67Var;
        }
        z65.z("offerDialogCreator");
        return null;
    }
}
