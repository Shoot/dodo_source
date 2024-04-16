package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.binaryfeedback.presentation.BinaryFeedbackView;
import com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies;
import com.dodopizza.controlling.feature.orderrating.di.OrderRatingComponent;
import com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter;
import com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingTagViewHolder;
import com.dodopizza.controlling.feature.starsfeedback.presentation.StarsFeedbackView;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c5c;
import defpackage.k6;
import defpackage.xtb;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: OrderRatingFragment.kt */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ²\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002³\u0001B\t¢\u0006\u0006\b°\u0001\u0010±\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\bH\u0003J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fH\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u001f\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\rH\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020\rH\u0016J\b\u0010'\u001a\u00020\rH\u0016J\b\u0010(\u001a\u00020\rH\u0016J\u0016\u0010,\u001a\u00020\r2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016J\b\u0010-\u001a\u00020\rH\u0016J\b\u0010.\u001a\u00020\rH\u0016J\b\u0010/\u001a\u00020\rH\u0016J\b\u00100\u001a\u00020\rH\u0016J\u0010\u00102\u001a\u00020\r2\u0006\u00101\u001a\u00020\u0014H\u0016J\b\u00103\u001a\u00020\rH\u0016J\b\u00104\u001a\u00020\rH\u0016J\b\u00105\u001a\u00020\rH\u0016J\b\u00106\u001a\u00020\rH\u0016J\b\u00107\u001a\u00020\rH\u0016J\b\u00108\u001a\u00020\rH\u0016J\u0010\u0010;\u001a\u00020\r2\u0006\u0010:\u001a\u000209H\u0016J\u0010\u0010<\u001a\u00020\r2\u0006\u00101\u001a\u00020\u0014H\u0016J\u0010\u0010>\u001a\u00020\r2\u0006\u0010:\u001a\u00020=H\u0016J\u0010\u0010?\u001a\u00020\r2\u0006\u00101\u001a\u00020\u0014H\u0016J\u0010\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020 H\u0016J\u0018\u0010D\u001a\u00020\r2\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u0014H\u0016J\b\u0010E\u001a\u00020\rH\u0016J\b\u0010F\u001a\u00020\rH\u0016R\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010I\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010I\u001a\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010I\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010]R\u001b\u0010a\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010I\u001a\u0004\b`\u0010]R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010I\u001a\u0004\bd\u0010eR\u001b\u0010i\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010I\u001a\u0004\bh\u0010]R\u001b\u0010n\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010I\u001a\u0004\bl\u0010mR\u001b\u0010q\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010I\u001a\u0004\bp\u0010]R\u001b\u0010v\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010I\u001a\u0004\bt\u0010uR\u001b\u0010y\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010I\u001a\u0004\bx\u0010]R\u001b\u0010|\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010I\u001a\u0004\b{\u0010XR\u001d\u0010\u0081\u0001\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b~\u0010I\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0086\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010I\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001e\u0010\u0089\u0001\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010I\u001a\u0005\b\u0088\u0001\u0010TR\u001d\u0010\u008b\u0001\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b>\u0010I\u001a\u0005\b\u008a\u0001\u0010XR\u001e\u0010\u008e\u0001\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010I\u001a\u0005\b\u008d\u0001\u0010XR*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R1\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R+\u0010¥\u0001\u001a\r  \u0001*\u0005\u0018\u00010\u0098\u00010\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R'\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010¦\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\u001b\u0010¯\u0001\u001a\u00020\u0014*\u00020G8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001¨\u0006´\u0001"}, d2 = {"Lkh7;", "Lf70;", "Lci7;", "Lw50;", "Landroidx/recyclerview/widget/f;", "rh", "Ldh7;", "sh", "Les1;", "", "Th", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "rootView", "ih", "", "onBackPressed", "ratingValue", "W0", "v0", "N5", "s8", "g0", "B0", "p3", "pg", "g1", "", "productsName", "N4", "Rd", "commentText", "Bd", "oa", "O6", "ba", "", "Lr69;", "tags", "d3", "ka", "cd", "v6", "Aa", "visible", "sg", "Vb", "zd", "Gd", "Q3", "N7", "if", "Lez1;", "data", "t0", "q0", "Lvm9;", Image.TYPE_SMALL, "H", RemoteMessageConst.Notification.URL, DateTokenConverter.CONVERTER_KEY, MessageAttributes.TYPE, "checked", "Ze", "Ue", "e5", "Landroidx/core/widget/NestedScrollView;", com.huawei.hms.opendevice.c.a, "Lk79;", "Fh", "()Landroidx/core/widget/NestedScrollView;", "detailsContainer", "Lcom/google/android/material/appbar/AppBarLayout;", "wh", "()Lcom/google/android/material/appbar/AppBarLayout;", "bottomToolbar", "Landroid/widget/ViewSwitcher;", com.huawei.hms.push.e.a, "Gh", "()Landroid/widget/ViewSwitcher;", "loadingSwitcher", "f", "zh", "()Landroid/view/View;", "closeButton", "Landroid/widget/TextView;", "g", "Kh", "()Landroid/widget/TextView;", "ratingTitle", Image.TYPE_HIGH, "Jh", "productsTitle", "Lcom/dodopizza/controlling/feature/starsfeedback/presentation/StarsFeedbackView;", "i", "Nh", "()Lcom/dodopizza/controlling/feature/starsfeedback/presentation/StarsFeedbackView;", "starsFeedbackView", "j", "uh", "binaryFeedbackTitle", "Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView;", "k", "vh", "()Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView;", "binaryFeedbackView", "l", "Ph", "tagsGroupTitle", "Landroidx/recyclerview/widget/RecyclerView;", Image.TYPE_MEDIUM, "Oh", "()Landroidx/recyclerview/widget/RecyclerView;", "tagsGroup", "n", "Ah", "comment", "o", "th", "attachedPhotosIndicator", "Landroidx/appcompat/widget/SwitchCompat;", "p", "Ch", "()Landroidx/appcompat/widget/SwitchCompat;", "contactMeSwitch", "Landroid/widget/Button;", "q", "Mh", "()Landroid/widget/Button;", "sendButton", "r", "xh", "buttonSwitcher", "Dh", "courierTipsCardContainer", "t", "Lh", "rnDigitalCard", "Lxtb;", "u", "Lxtb;", "Eh", "()Lxtb;", "setCustomTabsOpener", "(Lxtb;)V", "customTabsOpener", "Las8;", "Lcom/dodopizza/controlling/feature/orderrating/presentation/OrderRatingPresenter;", "v", "Las8;", "Ih", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "w", "Lmoxy/ktx/MoxyKtxDelegate;", "Hh", "()Lcom/dodopizza/controlling/feature/orderrating/presentation/OrderRatingPresenter;", "presenter", "Lcma;", "Lcom/dodopizza/controlling/feature/orderrating/di/OrderRatingComponent;", "x", "Lcma;", "Bh", "()Lcma;", "componentDependenciesRegistry", "yh", "(Landroidx/core/widget/NestedScrollView;)Z", "canScrollDown", "<init>", "()V", "y", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kh7  reason: default package */
/* loaded from: classes.dex */
public final class kh7 extends f70 implements ci7, w50 {
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
    private final k79 n;
    private final k79 o;
    private final k79 p;
    private final k79 q;
    private final k79 r;
    private final k79 s;
    private final k79 t;
    public xtb u;
    public as8<OrderRatingPresenter> v;
    private final MoxyKtxDelegate w;
    private final cma<OrderRatingComponent> x;
    static final /* synthetic */ je5<Object>[] z = {bc9.f(new ar8(kh7.class, "detailsContainer", "getDetailsContainer()Landroidx/core/widget/NestedScrollView;", 0)), bc9.f(new ar8(kh7.class, "bottomToolbar", "getBottomToolbar()Lcom/google/android/material/appbar/AppBarLayout;", 0)), bc9.f(new ar8(kh7.class, "loadingSwitcher", "getLoadingSwitcher()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(kh7.class, "closeButton", "getCloseButton()Landroid/view/View;", 0)), bc9.f(new ar8(kh7.class, "ratingTitle", "getRatingTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(kh7.class, "productsTitle", "getProductsTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(kh7.class, "starsFeedbackView", "getStarsFeedbackView()Lcom/dodopizza/controlling/feature/starsfeedback/presentation/StarsFeedbackView;", 0)), bc9.f(new ar8(kh7.class, "binaryFeedbackTitle", "getBinaryFeedbackTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(kh7.class, "binaryFeedbackView", "getBinaryFeedbackView()Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView;", 0)), bc9.f(new ar8(kh7.class, "tagsGroupTitle", "getTagsGroupTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(kh7.class, "tagsGroup", "getTagsGroup()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(kh7.class, "comment", "getComment()Landroid/widget/TextView;", 0)), bc9.f(new ar8(kh7.class, "attachedPhotosIndicator", "getAttachedPhotosIndicator()Landroid/view/View;", 0)), bc9.f(new ar8(kh7.class, "contactMeSwitch", "getContactMeSwitch()Landroidx/appcompat/widget/SwitchCompat;", 0)), bc9.f(new ar8(kh7.class, "sendButton", "getSendButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(kh7.class, "buttonSwitcher", "getButtonSwitcher()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(kh7.class, "courierTipsCardContainer", "getCourierTipsCardContainer()Landroid/view/View;", 0)), bc9.f(new ar8(kh7.class, "rnDigitalCard", "getRnDigitalCard()Landroid/view/View;", 0)), bc9.f(new ar8(kh7.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/orderrating/presentation/OrderRatingPresenter;", 0))};
    public static final a y = new a(null);
    private static final Integer[] A = {Integer.valueOf(g19.zero_star_title), Integer.valueOf(g19.one_star_title), Integer.valueOf(g19.two_stars_title), Integer.valueOf(g19.three_stars_title), Integer.valueOf(g19.four_stars_title), Integer.valueOf(g19.five_stars_title)};

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lkh7$a;", "", "Leh7;", "data", "Lkh7;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "", "SWITCHER_CONTENT_INDEX", "I", "SWITCHER_LOADING_INDEX", "", "titleStringResources", "[Ljava/lang/Integer;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kh7$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kh7 a(eh7 eh7Var) {
            z65.h(eh7Var, "data");
            return (kh7) y64.d(new kh7(), bi0.c(bi0.d("data", eh7Var)));
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kh7$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[es1.values().length];
            try {
                iArr[es1.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[es1.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[es1.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/controlling/feature/orderrating/di/OrderRatingComponent;", "a", "()Lcom/dodopizza/controlling/feature/orderrating/di/OrderRatingComponent;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kh7$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<OrderRatingComponent> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderRatingComponent invoke() {
            OrderRatingComponent.b a = OrderRatingComponent.c.a();
            Bundle arguments = kh7.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof eh7)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                Context requireContext = kh7.this.requireContext();
                z65.g(requireContext, "requireContext(...)");
                kh7 kh7Var = kh7.this;
                return a.a((eh7) obj, requireContext, kh7Var, (OrderRatingFeatureDependencies) kh7Var.getComponentDependenciesRegistry().a(bc9.b(OrderRatingFeatureDependencies.class)));
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "thisView", "Lc5c;", "insets", "Landroid/graphics/Rect;", "initialPadding", "a", "(Landroid/view/View;Lc5c;Landroid/graphics/Rect;)Lc5c;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kh7$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements y84<View, c5c, Rect, c5c> {
        public static final d a = new d();

        d() {
            super(3);
        }

        @Override // defpackage.y84
        /* renamed from: a */
        public final c5c invoke(View view, c5c c5cVar, Rect rect) {
            z65.h(view, "thisView");
            z65.h(c5cVar, "insets");
            z65.h(rect, "initialPadding");
            n45 f = c5cVar.f(c5c.m.d());
            z65.g(f, "getInsets(...)");
            p45.l(view, 0, rect.top + f.b, 0, rect.bottom + f.d, 5, null);
            c5c c5cVar2 = c5c.b;
            z65.g(c5cVar2, "CONSUMED");
            return c5cVar2;
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kh7$e */
    /* loaded from: classes.dex */
    /* synthetic */ class e extends m94 implements Function1<Boolean, Unit> {
        e(Object obj) {
            super(1, obj, OrderRatingPresenter.class, "onRnDigitalFormAvailabilityChanged", "onRnDigitalFormAvailabilityChanged(Z)V", 0);
        }

        public final void b(boolean z) {
            ((OrderRatingPresenter) this.receiver).a0(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            b(bool.booleanValue());
            return Unit.a;
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kh7$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            kh7.this.Hh().U();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "starIndex", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kh7$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function1<Integer, Unit> {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            kh7.this.Hh().Y(i + 1, true);
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c$b;", "it", "", "a", "(Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kh7$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements Function1<BinaryFeedbackView.c.b, Unit> {
        h() {
            super(1);
        }

        public final void a(BinaryFeedbackView.c.b bVar) {
            boolean z;
            z65.h(bVar, "it");
            OrderRatingPresenter Hh = kh7.this.Hh();
            if (bVar == BinaryFeedbackView.c.b.a) {
                z = true;
            } else {
                z = false;
            }
            Hh.V(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BinaryFeedbackView.c.b bVar) {
            a(bVar);
            return Unit.a;
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kh7$i */
    /* loaded from: classes.dex */
    static final class i extends ej5 implements Function1<View, Unit> {
        i() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            kh7.this.Hh().W();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kh7$j */
    /* loaded from: classes.dex */
    static final class j extends ej5 implements Function1<View, Unit> {
        j() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            kh7.this.Hh().W();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kh7$k */
    /* loaded from: classes.dex */
    static final class k extends ej5 implements Function1<View, Unit> {
        k() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            kh7.this.Hh().b0(kh7.this.sh());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/controlling/feature/orderrating/presentation/OrderRatingPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/controlling/feature/orderrating/presentation/OrderRatingPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kh7$l */
    /* loaded from: classes.dex */
    static final class l extends ej5 implements Function0<OrderRatingPresenter> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderRatingPresenter invoke() {
            return kh7.this.Ih().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kh7$m */
    /* loaded from: classes.dex */
    public static final class m extends ej5 implements Function1<Object, Boolean> {
        public static final m a = new m();

        public m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof r69);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kh7$n */
    /* loaded from: classes.dex */
    public static final class n extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final n a = new n();

        public n() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = OrderRatingTagViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: OrderRatingFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr69;", "tagVo", "", "isSelected", "", "a", "(Lr69;Z)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kh7$o */
    /* loaded from: classes.dex */
    static final class o extends ej5 implements Function2<r69, Boolean, Unit> {
        o() {
            super(2);
        }

        public final void a(r69 r69Var, boolean z) {
            z65.h(r69Var, "tagVo");
            kh7.this.Hh().Z(r69Var, z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(r69 r69Var, Boolean bool) {
            a(r69Var, bool.booleanValue());
            return Unit.a;
        }
    }

    public kh7() {
        super(wz8.fragment_order_rating);
        this.c = kb0.e(this, zx8.order_rating_details_container);
        this.d = kb0.e(this, zx8.order_rating_bottom_toolbar);
        this.e = kb0.e(this, zx8.order_rating_loading_switcher);
        this.f = kb0.e(this, zx8.order_rating_back_button);
        this.g = kb0.e(this, zx8.order_rating_title);
        this.h = kb0.e(this, zx8.order_rating_product_description);
        this.i = kb0.e(this, zx8.order_rating_stars_feedback);
        this.j = kb0.e(this, zx8.order_rating_binary_feedback_title);
        this.k = kb0.e(this, zx8.order_rating_binary_feedback);
        this.l = kb0.e(this, zx8.order_rating_tags_group_title);
        this.m = kb0.e(this, zx8.order_rating_tags_group);
        this.n = kb0.e(this, zx8.order_rating_comment);
        this.o = kb0.e(this, zx8.order_rating_attached_photos_indicator);
        this.p = kb0.e(this, zx8.order_rating_contact_me_switch);
        this.q = kb0.e(this, zx8.order_rating_send_order_rating);
        this.r = kb0.e(this, zx8.order_rating_button_switcher);
        this.s = kb0.e(this, zx8.courier_tips_card_container);
        this.t = kb0.e(this, zx8.rndigital_card);
        l lVar = new l();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.w = new MoxyKtxDelegate(mvpDelegate, OrderRatingPresenter.class.getName() + ".presenter", lVar);
        this.x = new cma<>(eu2.d(this), bc9.b(OrderRatingComponent.class), new c());
    }

    private final TextView Ah() {
        return (TextView) this.n.a(this, z[11]);
    }

    private final SwitchCompat Ch() {
        return (SwitchCompat) this.p.a(this, z[13]);
    }

    private final View Dh() {
        return (View) this.s.a(this, z[16]);
    }

    private final NestedScrollView Fh() {
        return (NestedScrollView) this.c.a(this, z[0]);
    }

    private final ViewSwitcher Gh() {
        return (ViewSwitcher) this.e.a(this, z[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderRatingPresenter Hh() {
        return (OrderRatingPresenter) this.w.getValue(this, z[18]);
    }

    private final TextView Jh() {
        return (TextView) this.h.a(this, z[5]);
    }

    private final TextView Kh() {
        return (TextView) this.g.a(this, z[4]);
    }

    private final View Lh() {
        return (View) this.t.a(this, z[17]);
    }

    private final Button Mh() {
        return (Button) this.q.a(this, z[14]);
    }

    private final StarsFeedbackView Nh() {
        return (StarsFeedbackView) this.i.a(this, z[6]);
    }

    private final RecyclerView Oh() {
        return (RecyclerView) this.m.a(this, z[10]);
    }

    private final TextView Ph() {
        return (TextView) this.l.a(this, z[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qh(kh7 kh7Var, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        z65.h(kh7Var, "this$0");
        kh7Var.wh().x(kh7Var.yh(kh7Var.Fh()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rh(kh7 kh7Var, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        z65.h(kh7Var, "this$0");
        z65.h(nestedScrollView, "<anonymous parameter 0>");
        kh7Var.wh().x(kh7Var.yh(kh7Var.Fh()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Sh(kh7 kh7Var, CompoundButton compoundButton, boolean z2) {
        z65.h(kh7Var, "this$0");
        kh7Var.Hh().X(z2);
    }

    private final int Th(es1 es1Var) {
        int i2 = b.$EnumSwitchMapping$0[es1Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return g19.contact_me;
                }
                throw new NoWhenBranchMatchedException();
            }
            return g19.contact_me_via_chat;
        }
        return g19.contact_me_via_phone;
    }

    private final androidx.recyclerview.widget.f rh() {
        androidx.recyclerview.widget.f fVar = new androidx.recyclerview.widget.f(requireContext(), 0);
        Drawable e2 = iu1.e(requireContext(), lx8.divider_rating_tags);
        if (e2 != null) {
            fVar.c(e2);
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dh7 sh() {
        Resources resources = getResources();
        z65.g(resources, "getResources(...)");
        return new dh7(resources);
    }

    private final View th() {
        return (View) this.o.a(this, z[12]);
    }

    private final TextView uh() {
        return (TextView) this.j.a(this, z[7]);
    }

    private final BinaryFeedbackView vh() {
        return (BinaryFeedbackView) this.k.a(this, z[8]);
    }

    private final AppBarLayout wh() {
        return (AppBarLayout) this.d.a(this, z[1]);
    }

    private final ViewSwitcher xh() {
        return (ViewSwitcher) this.r.a(this, z[15]);
    }

    private final boolean yh(NestedScrollView nestedScrollView) {
        if (nestedScrollView.getChildCount() == 0) {
            return true;
        }
        View childAt = nestedScrollView.getChildAt(0);
        z65.g(childAt, "getChildAt(...)");
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (nestedScrollView.getScrollY() < ((childAt.getHeight() + layoutParams2.topMargin) + layoutParams2.bottomMargin) - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingTop()) - nestedScrollView.getPaddingBottom())) {
            return true;
        }
        return false;
    }

    private final View zh() {
        return (View) this.f.a(this, z[3]);
    }

    @Override // defpackage.ci7
    public void Aa() {
        un3.e(Ah());
    }

    @Override // defpackage.ci7
    public void B0() {
        un3.e(vh());
    }

    @Override // defpackage.ci7
    public void Bd(String str) {
        z65.h(str, "commentText");
        Ah().setText(str);
    }

    @Override // defpackage.f70, defpackage.lm1
    /* renamed from: Bh */
    public cma<OrderRatingComponent> getComponentDependenciesRegistry() {
        return this.x;
    }

    public final xtb Eh() {
        xtb xtbVar = this.u;
        if (xtbVar != null) {
            return xtbVar;
        }
        z65.z("customTabsOpener");
        return null;
    }

    @Override // defpackage.ci7
    public void Gd() {
        xh().setDisplayedChild(1);
    }

    @Override // defpackage.ci7
    public void H(boolean z2) {
        un3.o(Lh(), z2);
    }

    public final as8<OrderRatingPresenter> Ih() {
        as8<OrderRatingPresenter> as8Var = this.v;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.ci7
    public void N4(String str) {
        z65.h(str, "productsName");
        un3.k(Jh());
        Jh().setText(str);
    }

    @Override // defpackage.ci7
    public void N5() {
        un3.k(uh());
    }

    @Override // defpackage.ci7
    public void N7() {
        Gh().setDisplayedChild(1);
    }

    @Override // defpackage.ci7
    public void O6() {
        Ph().setText(getString(g19.order_rating_negative_tags_title));
        un3.k(Ph());
    }

    @Override // defpackage.ci7
    public void Q3() {
        xh().setDisplayedChild(0);
    }

    @Override // defpackage.ci7
    public void Rd() {
        un3.e(Jh());
    }

    @Override // defpackage.ci7
    public void Ue() {
        un3.e(Ch());
    }

    @Override // defpackage.ci7
    public void Vb() {
        Mh().setEnabled(true);
    }

    @Override // defpackage.ci7
    public void W0(int i2) {
        Nh().setSelectedStar(i2 - 1);
        un3.k(Nh());
    }

    @Override // defpackage.ci7
    public void Ze(es1 es1Var, boolean z2) {
        z65.h(es1Var, MessageAttributes.TYPE);
        SwitchCompat Ch = Ch();
        Ch.setChecked(z2);
        Ch.setText(Th(es1Var));
        un3.k(Ch);
    }

    @Override // defpackage.ci7
    public void ba() {
        un3.e(Ph());
    }

    @Override // defpackage.ci7
    public void cd() {
        un3.e(Oh());
    }

    @Override // defpackage.ci7
    public void d(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        xtb.a.a(Eh(), str, false, 2, null);
    }

    @Override // defpackage.ci7
    public void d3(List<r69> list) {
        z65.h(list, "tags");
        Oh().setAdapter(new k6.a(new k6(list), m.a, new zh7(new o()), n.a).b().d());
    }

    @Override // defpackage.ci7
    public void e5() {
        Object systemService = requireContext().getSystemService(RemoteMessageConst.NOTIFICATION);
        z65.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(b37.c.i());
    }

    @Override // defpackage.ci7
    public void g0() {
        vh().setButtonsState(BinaryFeedbackView.c.a.a);
        un3.k(vh());
    }

    @Override // defpackage.ci7
    public void g1() {
        un3.e(Kh());
    }

    @Override // defpackage.ci7
    /* renamed from: if */
    public void mo0if() {
        Gh().setDisplayedChild(0);
    }

    @Override // defpackage.f70
    protected void ih(View view) {
        z65.h(view, "rootView");
        p45.d(view, d.a);
    }

    @Override // defpackage.ci7
    public void ka() {
        un3.k(Oh());
    }

    @Override // defpackage.ci7
    public void oa() {
        Ph().setText(getString(g19.order_rating_positive_tags_title));
        un3.k(Ph());
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Hh().U();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        getComponentDependenciesRegistry().b().z2(this);
        super.onCreate(bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        wh().v(true);
        Fh().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hh7
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                kh7.Qh(kh7.this, view2, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
        Fh().setOnScrollChangeListener(new NestedScrollView.c() { // from class: ih7
            @Override // androidx.core.widget.NestedScrollView.c
            public final void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
                kh7.Rh(kh7.this, nestedScrollView, i2, i3, i4, i5);
            }
        });
        oma.a(zh(), new f());
        Nh().setOnStarClick(new g());
        vh().setButtonsClickListener(new h());
        Oh().addItemDecoration(rh());
        oma.a(Ah(), new i());
        oma.a(th(), new j());
        Ch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: jh7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                kh7.Sh(kh7.this, compoundButton, z2);
            }
        });
        oma.a(Mh(), new k());
        OrderRatingPresenter Hh = Hh();
        z65.g(Hh, "<get-presenter>(...)");
        x8c.b(this, new e(Hh));
    }

    @Override // defpackage.ci7
    public void p3() {
        Kh().setText(g19.zero_star_title);
        un3.k(Kh());
    }

    @Override // defpackage.ci7
    public void pg(int i2) {
        Kh().setText(A[i2].intValue());
        un3.k(Kh());
    }

    @Override // defpackage.ci7
    public void q0(boolean z2) {
        un3.o(Dh(), z2);
    }

    @Override // defpackage.ci7
    public void s(vm9 vm9Var) {
        z65.h(vm9Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        x8c.a(p, zx8.rndigital_card_container, vm9Var, q19.OrderRatingTheme);
        p.l();
    }

    @Override // defpackage.ci7
    public void s8() {
        un3.e(uh());
    }

    @Override // defpackage.ci7
    public void sg(boolean z2) {
        un3.o(th(), z2);
    }

    @Override // defpackage.ci7
    public void t0(ez1 ez1Var) {
        z65.h(ez1Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        a9c.a(p, zx8.courier_tips_card_container, ez1Var, new mz1(q19.OrderRatingTheme, true));
        p.l();
    }

    @Override // defpackage.ci7
    public void v0() {
        un3.e(Nh());
    }

    @Override // defpackage.ci7
    public void v6() {
        un3.k(Ah());
    }

    @Override // defpackage.ci7
    public void zd() {
        Mh().setEnabled(false);
    }
}
