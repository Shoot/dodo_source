package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.ViewAnimator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.buttons.DodoButton;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.d15;
import defpackage.k6;
import defpackage.o2b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies;
import ru.dodopizza.app.presentation.profile.ProfilePresenter;
import ru.dodopizza.app.presentation.profile.adapter.activeorder.ActiveOrderViewHolder;
import ru.dodopizza.app.presentation.profile.adapter.loyaltymissions.LoyaltyMissionViewHolder;
import ru.dodopizza.app.presentation.profile.adapter.loyaltymissions.emptystate.MissionsEmptyStateViewHolder;
import ru.dodopizza.app.presentation.profile.adapter.loyaltymissions.failstate.MissionsFailStateViewHolder;
import ru.dodopizza.app.presentation.profile.adapter.widgets.LoyaltyWidgetViewHolder;
import ru.dodopizza.app.presentation.profile.adapter.widgets.PersonalWidgetViewHolder;
/* compiled from: ProfileFragment.kt */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 Ô\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Õ\u0001B\t¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0002J9\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0096\u0001J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0014J\b\u0010 \u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000bH\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\u0016\u0010)\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001bH\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u000fH\u0016J\b\u0010/\u001a\u00020\u0004H\u0016J\b\u00100\u001a\u00020\u0004H\u0016J\b\u00101\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J\b\u00103\u001a\u00020\u0004H\u0016J\b\u00104\u001a\u00020\u0004H\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u000fH\u0016J\u0010\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u000fH\u0016J\b\u00109\u001a\u00020\u0004H\u0016J\u0016\u0010<\u001a\u00020\u00042\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u001bH\u0016J\b\u0010=\u001a\u00020\u0004H\u0016J\b\u0010>\u001a\u00020\u0004H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016J\b\u0010@\u001a\u00020\u0004H\u0016J\b\u0010A\u001a\u00020\u0004H\u0016J\b\u0010B\u001a\u00020\u0004H\u0016J\b\u0010C\u001a\u00020\u0004H\u0016J\b\u0010D\u001a\u00020\u0004H\u0016J\b\u0010E\u001a\u00020\u0004H\u0016J0\u0010L\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020JH\u0016J\b\u0010M\u001a\u00020\u0004H\u0016J\b\u0010N\u001a\u00020\u0004H\u0016J\b\u0010O\u001a\u00020\u0004H\u0016J \u0010T\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020J2\u0006\u0010S\u001a\u00020JH\u0016J\u0010\u0010V\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u000fH\u0016J\u0010\u0010X\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u000bH\u0016J\b\u0010Y\u001a\u00020\u0004H\u0016R(\u0010b\u001a\b\u0012\u0004\u0012\u00020[0Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001b\u0010h\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010e\u001a\u0004\bk\u0010lR\u001b\u0010q\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010e\u001a\u0004\bo\u0010pR\u001b\u0010s\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010e\u001a\u0004\br\u0010pR\u001b\u0010w\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010e\u001a\u0004\bu\u0010vR\u001b\u0010z\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010e\u001a\u0004\by\u0010vR\u001b\u0010}\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010e\u001a\u0004\b|\u0010gR\u001e\u0010\u0082\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010e\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0085\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010e\u001a\u0006\b\u0084\u0001\u0010\u0081\u0001R\u001f\u0010\u0088\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010e\u001a\u0006\b\u0087\u0001\u0010\u0081\u0001R \u0010\u008d\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010e\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u0092\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008f\u0001\u0010e\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0097\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0094\u0001\u0010e\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u009a\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010e\u001a\u0006\b\u0099\u0001\u0010\u0096\u0001R\u001e\u0010\u009d\u0001\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010e\u001a\u0005\b\u009c\u0001\u0010gR\u001e\u0010 \u0001\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010e\u001a\u0005\b\u009f\u0001\u0010gR \u0010¥\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¢\u0001\u0010e\u001a\u0006\b£\u0001\u0010¤\u0001R \u0010¨\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¦\u0001\u0010e\u001a\u0006\b§\u0001\u0010¤\u0001R\u001e\u0010«\u0001\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b©\u0001\u0010e\u001a\u0005\bª\u0001\u0010gR \u0010°\u0001\u001a\u00030¬\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u00ad\u0001\u0010e\u001a\u0006\b®\u0001\u0010¯\u0001R\u001e\u0010³\u0001\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b±\u0001\u0010e\u001a\u0005\b²\u0001\u0010lR \u0010¸\u0001\u001a\u00030´\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bµ\u0001\u0010e\u001a\u0006\b¶\u0001\u0010·\u0001R \u0010½\u0001\u001a\u00030¹\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bº\u0001\u0010e\u001a\u0006\b»\u0001\u0010¼\u0001R \u0010À\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¾\u0001\u0010e\u001a\u0006\b¿\u0001\u0010\u0096\u0001R\u001e\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R \u0010É\u0001\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R)\u0010Ï\u0001\u001a\u000b Ê\u0001*\u0004\u0018\u00010[0[8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0019\u0010Ñ\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Â\u0001¨\u0006Ö\u0001"}, d2 = {"Lan8;", "Lf70;", "Lxo8;", "Ld15;", "", "Xh", "Wh", "bi", "Lcom/google/android/material/badge/a;", "uh", "badge", "", "th", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "storyId", "Lkotlin/Function0;", "onSuccess", "onFailure", "bf", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "Lq4c;", "widgets", "ng", "hh", "la", "b5", "orderNumber", "N2", "S", "o0", "nc", "Lwl7;", "activeOrders", "C1", "F1", "b0", "Q1", "aboutMissionUrl", "We", "nb", "kd", "T3", "H3", "k6", "t8", "message", "j0", "infoStoryId", "F", "q3", "Lul6;", "loyaltyMissions", "ne", "F5", "gb", "ca", "Xg", "D6", "d7", "A2", "Lb", "U3", "versionName", "versionCode", "buildType", "rcVersion", "", "isDebug", "id", "k0", "j7", "Kb", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfoData", "isNativeChatEnabled", "isAuth", "hg", "phone", "a0", "count", Image.TYPE_HIGH, "i", "Las8;", "Lru/dodopizza/app/presentation/profile/ProfilePresenter;", DateTokenConverter.CONVERTER_KEY, "Las8;", "Mh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Landroid/view/ViewGroup;", com.huawei.hms.push.e.a, "Lk79;", "Uh", "()Landroid/view/ViewGroup;", "unauthorizedContainer", "Landroid/widget/Button;", "f", "Ch", "()Landroid/widget/Button;", "enterPhoneButton", "g", "Eh", "()Landroid/view/View;", "exitButtonUnAuth", "Th", "supportButtonUnAuth", "Landroidx/appcompat/widget/AppCompatTextView;", "Fh", "()Landroidx/appcompat/widget/AppCompatTextView;", "legalDocsUnAuth", "j", "Vh", "versionUnAuth", "k", "xh", "authorizedContainer", "Landroid/widget/ImageButton;", "l", "Nh", "()Landroid/widget/ImageButton;", "settingsButton", Image.TYPE_MEDIUM, "Dh", "exitButton", "n", "Sh", "supportButton", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "o", "Bh", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "customerDataContainer", "Lcom/google/android/material/appbar/AppBarLayout;", "p", "wh", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Landroidx/recyclerview/widget/RecyclerView;", "q", "vh", "()Landroidx/recyclerview/widget/RecyclerView;", "activeOrdersList", "r", "Gh", "loyaltyMissionsList", Image.TYPE_SMALL, "Ih", "missionsContainer", "t", "Jh", "personalOfferFragmentContainer", "Landroid/widget/ViewAnimator;", "u", "Hh", "()Landroid/widget/ViewAnimator;", "missionsAnimator", "v", "yh", "benefitsAnimator", "w", "Qh", "subscriptionPanel", "Lcom/dodopizza/android/buttons/DodoButton;", "x", "Rh", "()Lcom/dodopizza/android/buttons/DodoButton;", "subscriptionPositiveButton", "y", "Ph", "subscriptionNegativeButton", "Landroid/widget/ImageView;", "z", "Oh", "()Landroid/widget/ImageView;", "subscriptionInfoButton", "Landroid/widget/ProgressBar;", "A", "zh", "()Landroid/widget/ProgressBar;", "benefitsProgress", "B", "Kh", "personalWidgets", "Ll6;", "I", "Ll6;", "profileCustomerMenu", "X", "Lrn5;", "Ah", "()Lcom/google/android/material/badge/a;", "chatBadgeDrawable", "kotlin.jvm.PlatformType", "Y", "Lmoxy/ktx/MoxyKtxDelegate;", "Lh", "()Lru/dodopizza/app/presentation/profile/ProfilePresenter;", "presenter", "Z", "statusFragmentBarColor", "<init>", "()V", "S4", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: an8  reason: default package */
/* loaded from: classes4.dex */
public final class an8 extends f70 implements xo8, d15 {
    private final k79 A;
    private final k79 B;
    private final l6<q4c> I;
    private final rn5 X;
    private final MoxyKtxDelegate Y;
    private int Z;
    private final /* synthetic */ e15 c;
    public as8<ProfilePresenter> d;
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
    private final k79 u;
    private final k79 v;
    private final k79 w;
    private final k79 x;
    private final k79 y;
    private final k79 z;
    static final /* synthetic */ je5<Object>[] T4 = {bc9.f(new ar8(an8.class, "unauthorizedContainer", "getUnauthorizedContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(an8.class, "enterPhoneButton", "getEnterPhoneButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(an8.class, "exitButtonUnAuth", "getExitButtonUnAuth()Landroid/view/View;", 0)), bc9.f(new ar8(an8.class, "supportButtonUnAuth", "getSupportButtonUnAuth()Landroid/view/View;", 0)), bc9.f(new ar8(an8.class, "legalDocsUnAuth", "getLegalDocsUnAuth()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(an8.class, "versionUnAuth", "getVersionUnAuth()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(an8.class, "authorizedContainer", "getAuthorizedContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(an8.class, "settingsButton", "getSettingsButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(an8.class, "exitButton", "getExitButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(an8.class, "supportButton", "getSupportButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(an8.class, "customerDataContainer", "getCustomerDataContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0)), bc9.f(new ar8(an8.class, "appBar", "getAppBar()Lcom/google/android/material/appbar/AppBarLayout;", 0)), bc9.f(new ar8(an8.class, "activeOrdersList", "getActiveOrdersList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(an8.class, "loyaltyMissionsList", "getLoyaltyMissionsList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(an8.class, "missionsContainer", "getMissionsContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(an8.class, "personalOfferFragmentContainer", "getPersonalOfferFragmentContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(an8.class, "missionsAnimator", "getMissionsAnimator()Landroid/widget/ViewAnimator;", 0)), bc9.f(new ar8(an8.class, "benefitsAnimator", "getBenefitsAnimator()Landroid/widget/ViewAnimator;", 0)), bc9.f(new ar8(an8.class, "subscriptionPanel", "getSubscriptionPanel()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(an8.class, "subscriptionPositiveButton", "getSubscriptionPositiveButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(an8.class, "subscriptionNegativeButton", "getSubscriptionNegativeButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(an8.class, "subscriptionInfoButton", "getSubscriptionInfoButton()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(an8.class, "benefitsProgress", "getBenefitsProgress()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(an8.class, "personalWidgets", "getPersonalWidgets()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(an8.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/profile/ProfilePresenter;", 0))};
    public static final a S4 = new a(null);

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lan8$a;", "", "Lan8;", "a", "", "OFFSET_RIGHT_DP", "F", "POPUP_HEIGHT_DP", "POPUP_WIDTH_DP", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: an8$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final an8 a() {
            return new an8();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$a0 */
    /* loaded from: classes4.dex */
    public static final class a0 extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final a0 a = new a0();

        public a0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = LoyaltyMissionViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/material/badge/a;", "a", "()Lcom/google/android/material/badge/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<com.google.android.material.badge.a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.google.android.material.badge.a invoke() {
            return an8.this.uh();
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul6;", "mission", "", "a", "(Lul6;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$b0 */
    /* loaded from: classes4.dex */
    static final class b0 extends ej5 implements Function1<ul6, Unit> {
        b0() {
            super(1);
        }

        public final void a(ul6 ul6Var) {
            z65.h(ul6Var, "mission");
            an8.this.Lh().p0(ul6Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ul6 ul6Var) {
            a(ul6Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            an8.this.Lh().w0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul6;", "mission", "", "a", "(Lul6;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$c0 */
    /* loaded from: classes4.dex */
    static final class c0 extends ej5 implements Function1<ul6, Unit> {
        c0() {
            super(1);
        }

        public final void a(ul6 ul6Var) {
            z65.h(ul6Var, "mission");
            an8.this.Lh().o0(ul6Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ul6 ul6Var) {
            a(ul6Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            an8.this.Lh().r0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$d0 */
    /* loaded from: classes4.dex */
    public static final class d0 extends ej5 implements Function1<Object, Boolean> {
        public static final d0 a = new d0();

        public d0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof yl6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            an8.this.bi();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$e0 */
    /* loaded from: classes4.dex */
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
            Object newInstance = MissionsEmptyStateViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$f */
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function1<Object, Boolean> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof a28);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$f0 */
    /* loaded from: classes4.dex */
    public static final class f0 extends ej5 implements Function1<Object, Boolean> {
        public static final f0 a = new f0();

        public f0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof bm6);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$g */
    /* loaded from: classes4.dex */
    public static final class g extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final g a = new g();

        public g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = PersonalWidgetViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$g0 */
    /* loaded from: classes4.dex */
    public static final class g0 extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final g0 a = new g0();

        public g0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = MissionsFailStateViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$h */
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function1<Object, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof c36);
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: an8$h0 */
    /* loaded from: classes4.dex */
    static final class h0 extends ej5 implements Function0<Unit> {
        h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            an8.this.Lh().q0();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$i */
    /* loaded from: classes4.dex */
    public static final class i extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final i a = new i();

        public i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = LoyaltyWidgetViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: an8$i0 */
    /* loaded from: classes4.dex */
    static final class i0 extends ej5 implements Function0<Unit> {
        public static final i0 a = new i0();

        i0() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La28;", "data", "", "a", "(La28;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$j */
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<a28, Unit> {

        /* compiled from: ProfileFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: an8$j$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[c28.values().length];
                try {
                    iArr[c28.b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c28.d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c28.e.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c28.c.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        j() {
            super(1);
        }

        public final void a(a28 a28Var) {
            z65.h(a28Var, "data");
            int i = a.$EnumSwitchMapping$0[a28Var.a().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            an8.this.Lh().m0();
                            return;
                        }
                        return;
                    }
                    an8.this.Lh().l0();
                    return;
                }
                an8.this.Lh().i0();
                return;
            }
            an8.this.Lh().t0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a28 a28Var) {
            a(a28Var);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$j0 */
    /* loaded from: classes4.dex */
    static final class j0 extends ej5 implements Function1<uoa, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: an8$j0$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ an8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(an8 an8Var) {
                super(0);
                this.a = an8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                return this.a.Bh();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: an8$j0$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ an8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(an8 an8Var) {
                super(0);
                this.a = an8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String string = this.a.getString(R.string.promo_subscription_success);
                z65.g(string, "getString(...)");
                return string;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: an8$j0$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 5;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: an8$j0$d */
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function0<Integer> {
            public static final d a = new d();

            d() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 2;
            }
        }

        j0() {
            super(1);
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(an8.this));
            uoaVar.h(new b(an8.this));
            uoaVar.d(c.a);
            uoaVar.f(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc36;", "it", "", "a", "(Lc36;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$k */
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function1<c36, Unit> {
        k() {
            super(1);
        }

        public final void a(c36 c36Var) {
            z65.h(c36Var, "it");
            an8.this.Lh().n0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c36 c36Var) {
            a(c36Var);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"an8$k0", "Lo2b$b;", "", com.huawei.hms.opendevice.c.a, "b", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: an8$k0 */
    /* loaded from: classes4.dex */
    public static final class k0 implements o2b.b {
        k0() {
        }

        @Override // defpackage.o2b.b
        public void a() {
            an8.this.Lh().e0();
        }

        @Override // defpackage.o2b.b
        public void b() {
            an8.this.Lh().d0();
        }

        @Override // defpackage.o2b.b
        public void c() {
            an8.this.Lh().g0();
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$l */
    /* loaded from: classes4.dex */
    static final class l extends ej5 implements Function1<View, Unit> {
        l() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            an8.this.Lh().v0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$l0 */
    /* loaded from: classes4.dex */
    public static final class l0 extends ej5 implements Function1<uoa, Unit> {
        final /* synthetic */ String b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: an8$l0$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ an8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(an8 an8Var) {
                super(0);
                this.a = an8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                return this.a.Bh();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: an8$l0$b */
        /* loaded from: classes4.dex */
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: an8$l0$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: an8$l0$d */
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function0<Integer> {
            public static final d a = new d();

            d() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 5;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(String str) {
            super(1);
            this.b = str;
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(an8.this));
            uoaVar.h(new b(this.b));
            uoaVar.f(c.a);
            uoaVar.d(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$m */
    /* loaded from: classes4.dex */
    static final class m extends ej5 implements Function1<View, Unit> {
        m() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            an8.this.Lh().k0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lq4c;", "old", "new", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$m0 */
    /* loaded from: classes4.dex */
    static final class m0 extends ej5 implements Function2<List<? extends q4c>, List<? extends q4c>, e.C0047e> {
        public static final m0 a = new m0();

        m0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<? extends q4c> list, List<? extends q4c> list2) {
            z65.h(list, "old");
            z65.h(list2, "new");
            e.C0047e b = androidx.recyclerview.widget.e.b(new b28(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$n */
    /* loaded from: classes4.dex */
    static final class n extends ej5 implements Function1<View, Unit> {
        n() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            an8.this.Lh().k0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$o */
    /* loaded from: classes4.dex */
    static final class o extends ej5 implements Function1<View, Unit> {
        o() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            an8.this.Lh().j0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$p */
    /* loaded from: classes4.dex */
    static final class p extends ej5 implements Function1<View, Unit> {
        p() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            an8.this.Lh().f0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$q */
    /* loaded from: classes4.dex */
    static final class q extends ej5 implements Function1<View, Unit> {
        q() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            an8.this.Lh().h0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$r */
    /* loaded from: classes4.dex */
    static final class r extends ej5 implements Function1<View, Unit> {
        r() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            an8.this.Lh().h0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/profile/ProfilePresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/profile/ProfilePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$s */
    /* loaded from: classes4.dex */
    static final class s extends ej5 implements Function0<ProfilePresenter> {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ProfilePresenter invoke() {
            return an8.this.Mh().get();
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: an8$t */
    /* loaded from: classes4.dex */
    static final class t extends ej5 implements Function0<Unit> {
        public static final t a = new t();

        t() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$u */
    /* loaded from: classes4.dex */
    public static final class u extends ej5 implements Function1<Object, Boolean> {
        public static final u a = new u();

        public u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof wl7);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$v */
    /* loaded from: classes4.dex */
    public static final class v extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final v a = new v();

        public v() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = ActiveOrderViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwl7;", "orderVO", "", "a", "(Lwl7;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$w */
    /* loaded from: classes4.dex */
    static final class w extends ej5 implements Function1<wl7, Unit> {
        w() {
            super(1);
        }

        public final void a(wl7 wl7Var) {
            z65.h(wl7Var, "orderVO");
            an8.this.Lh().s0(wl7Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wl7 wl7Var) {
            a(wl7Var);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$x */
    /* loaded from: classes4.dex */
    static final class x extends ej5 implements Function1<uoa, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: an8$x$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ an8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(an8 an8Var) {
                super(0);
                this.a = an8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                return this.a.Bh();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: an8$x$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ an8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(an8 an8Var) {
                super(0);
                this.a = an8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String string = this.a.getString(R.string.network_error);
                z65.g(string, "getString(...)");
                return string;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: an8$x$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/material/snackbar/Snackbar;", "snackbar", "", "a", "(Lcom/google/android/material/snackbar/Snackbar;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: an8$x$d */
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function1<Snackbar, Unit> {
            final /* synthetic */ an8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(an8 an8Var) {
                super(1);
                this.a = an8Var;
            }

            public final void a(Snackbar snackbar) {
                z65.h(snackbar, "snackbar");
                this.a.Lh().u0();
                snackbar.s();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Snackbar snackbar) {
                a(snackbar);
                return Unit.a;
            }
        }

        x() {
            super(1);
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(an8.this));
            uoaVar.h(new b(an8.this));
            uoaVar.f(c.a);
            uoaVar.g(R.string.refresh_button_label, new d(an8.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: an8$y */
    /* loaded from: classes4.dex */
    static final class y extends ej5 implements Function0<Unit> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            an8.this.Lh().y0(this.b);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: an8$z */
    /* loaded from: classes4.dex */
    public static final class z extends ej5 implements Function1<Object, Boolean> {
        public static final z a = new z();

        public z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof ul6);
        }
    }

    public an8() {
        super(R.layout.fragment_profile);
        rn5 b2;
        this.c = new e15();
        this.e = kb0.e(this, R.id.profile_unauthorized_container);
        this.f = kb0.e(this, R.id.profile_enter_phone_btn);
        this.g = kb0.e(this, R.id.profile_unauth_back);
        this.h = kb0.e(this, R.id.profile_unauth_support);
        this.i = kb0.e(this, R.id.profile_legal_doc_unauthorized);
        this.j = kb0.e(this, R.id.profile_version_unauthorized);
        this.k = kb0.e(this, R.id.profile_authorized_container);
        this.l = kb0.e(this, R.id.profile_customer_settings);
        this.m = kb0.e(this, R.id.profile_exit);
        this.n = kb0.e(this, R.id.profile_support);
        this.o = kb0.e(this, R.id.profile_customer_data_container);
        this.p = kb0.e(this, R.id.profile_app_bar);
        this.q = kb0.e(this, R.id.profile_active_orders);
        this.r = kb0.e(this, R.id.profile_loyalty_missions);
        this.s = kb0.e(this, R.id.profile_loyalty_missions_container);
        this.t = kb0.e(this, R.id.personal_offers_fragment_container);
        this.u = kb0.e(this, R.id.profile_missions_switcher);
        this.v = kb0.e(this, R.id.profile_benefits_animator);
        this.w = kb0.e(this, R.id.profile_subscription);
        this.x = kb0.e(this, R.id.subscription_positive_button);
        this.y = kb0.e(this, R.id.subscription_negative_button);
        this.z = kb0.e(this, R.id.subscription_info_button);
        this.A = kb0.e(this, R.id.profile_benefits_loading);
        this.B = kb0.e(this, R.id.new_profile_customer_menu_container);
        this.I = new l6<>(null, 1, null);
        b2 = yn5.b(new b());
        this.X = b2;
        s sVar = new s();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.Y = new MoxyKtxDelegate(mvpDelegate, ProfilePresenter.class.getName() + ".presenter", sVar);
        this.Z = R.color.backgroundSecondaryColor;
    }

    private final com.google.android.material.badge.a Ah() {
        return (com.google.android.material.badge.a) this.X.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoordinatorLayout Bh() {
        return (CoordinatorLayout) this.o.a(this, T4[10]);
    }

    private final Button Ch() {
        return (Button) this.f.a(this, T4[1]);
    }

    private final ImageButton Dh() {
        return (ImageButton) this.m.a(this, T4[8]);
    }

    private final View Eh() {
        return (View) this.g.a(this, T4[2]);
    }

    private final AppCompatTextView Fh() {
        return (AppCompatTextView) this.i.a(this, T4[4]);
    }

    private final RecyclerView Gh() {
        return (RecyclerView) this.r.a(this, T4[13]);
    }

    private final ViewAnimator Hh() {
        return (ViewAnimator) this.u.a(this, T4[16]);
    }

    private final ViewGroup Ih() {
        return (ViewGroup) this.s.a(this, T4[14]);
    }

    private final ViewGroup Jh() {
        return (ViewGroup) this.t.a(this, T4[15]);
    }

    private final RecyclerView Kh() {
        return (RecyclerView) this.B.a(this, T4[23]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfilePresenter Lh() {
        return (ProfilePresenter) this.Y.getValue(this, T4[24]);
    }

    private final ImageButton Nh() {
        return (ImageButton) this.l.a(this, T4[7]);
    }

    private final ImageView Oh() {
        return (ImageView) this.z.a(this, T4[21]);
    }

    private final Button Ph() {
        return (Button) this.y.a(this, T4[20]);
    }

    private final ViewGroup Qh() {
        return (ViewGroup) this.w.a(this, T4[18]);
    }

    private final DodoButton Rh() {
        return (DodoButton) this.x.a(this, T4[19]);
    }

    private final ImageButton Sh() {
        return (ImageButton) this.n.a(this, T4[9]);
    }

    private final View Th() {
        return (View) this.h.a(this, T4[3]);
    }

    private final ViewGroup Uh() {
        return (ViewGroup) this.e.a(this, T4[0]);
    }

    private final AppCompatTextView Vh() {
        return (AppCompatTextView) this.j.a(this, T4[5]);
    }

    private final void Wh() {
        oma.a(Rh(), new c());
        oma.a(Ph(), new d());
        oma.a(Oh(), new e());
    }

    private final void Xh() {
        Kh().addItemDecoration(new zo4(4, 8, 8));
        Kh().setAdapter(new k6.a(new k6.a(new k6(this.I), f.a, new z18(new j()), g.a).b(), h.a, new b36(new k()), i.a).b().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Yh(an8 an8Var, AppBarLayout appBarLayout, int i2) {
        z65.h(an8Var, "this$0");
        an8Var.Kh().setAlpha(1.0f - Math.abs(i2 / appBarLayout.getTotalScrollRange()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zh(an8 an8Var, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        z65.h(an8Var, "this$0");
        com.google.android.material.badge.b.a(an8Var.Ah(), an8Var.Sh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ai(an8 an8Var, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        z65.h(an8Var, "this$0");
        com.google.android.material.badge.b.a(an8Var.Ah(), an8Var.Th());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bi() {
        androidx.fragment.app.d activity = getActivity();
        if (activity != null) {
            Object systemService = activity.getSystemService("layout_inflater");
            z65.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_subscription_info, (ViewGroup) null, false);
            z65.g(inflate, "inflate(...)");
            PopupWindow popupWindow = new PopupWindow(getContext());
            popupWindow.setContentView(inflate);
            popupWindow.setFocusable(true);
            popupWindow.setBackgroundDrawable(new BitmapDrawable());
            int a2 = mpb.a(242.5f, activity);
            int a3 = mpb.a(160.0f, activity);
            int[] iArr = new int[2];
            Oh().getLocationOnScreen(iArr);
            popupWindow.showAtLocation(inflate, 0, iArr[0] - a2, iArr[1] - a3);
        }
    }

    private final int th(com.google.android.material.badge.a aVar) {
        m60 m60Var = m60.a;
        int a2 = m60Var.a(aVar, -((int) kx9.a(20)));
        Resources resources = getResources();
        z65.g(resources, "getResources(...)");
        return a2 - m60Var.b(resources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.material.badge.a uh() {
        com.google.android.material.badge.a e2 = com.google.android.material.badge.a.e(requireContext(), R.xml.contacts_screen_badge);
        z65.g(e2, "createFromResource(...)");
        m60.a.c(e2, R.style.ContactsScreenBadgeTextAppearance);
        e2.D(3);
        e2.K(false);
        return e2;
    }

    private final RecyclerView vh() {
        return (RecyclerView) this.q.a(this, T4[12]);
    }

    private final AppBarLayout wh() {
        return (AppBarLayout) this.p.a(this, T4[11]);
    }

    private final ViewGroup xh() {
        return (ViewGroup) this.k.a(this, T4[6]);
    }

    private final ViewAnimator yh() {
        return (ViewAnimator) this.v.a(this, T4[17]);
    }

    private final ProgressBar zh() {
        return (ProgressBar) this.A.a(this, T4[22]);
    }

    @Override // defpackage.xo8
    public void A2() {
        un3.k(Jh());
        String string = getString(R.string.personal_offer);
        z65.g(string, "getString(...)");
        y8c.c(this, R.id.personal_offers_fragment_container, new o08(string, false, false, 0, h18.d, false, 46, null), t.a);
    }

    @Override // defpackage.xo8
    public void C1(List<wl7> list) {
        z65.h(list, "activeOrders");
        un3.k(vh());
        String string = getString(R.string.order_countdown_time_format);
        z65.g(string, "getString(...)");
        ol6 ol6Var = new ol6(string);
        vh().setAdapter(new k6.a(new k6(list), u.a, new a5(ol6Var, new w()), v.a).b().d());
    }

    @Override // defpackage.xo8
    public void D6() {
        String string = getString(R.string.error_has_occurred);
        z65.g(string, "getString(...)");
        j0(string);
    }

    @Override // defpackage.xo8
    public void F(String str) {
        z65.h(str, "infoStoryId");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        d15.a.a(this, requireContext, str, new y(str), null, 8, null);
    }

    @Override // defpackage.xo8
    public void F1() {
        un3.e(vh());
    }

    @Override // defpackage.xo8
    public void F5() {
        un3.k(Qh());
    }

    @Override // defpackage.xo8
    public void H3() {
        un3.l(yh(), R.id.profile_user_benefits_section);
    }

    @Override // defpackage.xo8
    public void Kb() {
        un3.e(Sh());
        un3.e(Th());
    }

    @Override // defpackage.xo8
    public void Lb() {
        up8.i.a(cq8.k).show(getParentFragmentManager(), "enter_invite_code_dialog");
    }

    public final as8<ProfilePresenter> Mh() {
        as8<ProfilePresenter> as8Var = this.d;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.xo8
    public void N2(int i2) {
        String string = getString(R.string.cancel_order_num, Integer.valueOf(i2));
        z65.g(string, "getString(...)");
        j0(string);
    }

    @Override // defpackage.xo8
    public void Q1() {
        String string = getString(R.string.error_has_occurred);
        z65.g(string, "getString(...)");
        j0(string);
    }

    @Override // defpackage.xo8
    public void S() {
        soa.a.a(new x()).Q(-2).U();
    }

    @Override // defpackage.xo8
    public void T3() {
        un3.e(zh());
    }

    @Override // defpackage.xo8
    public void U3() {
        un3.k(Vh());
    }

    @Override // defpackage.xo8
    public void We(String str) {
        List e2;
        z65.h(str, "aboutMissionUrl");
        RecyclerView Gh = Gh();
        e2 = jc1.e(yl6.a);
        Gh.setAdapter(new k6.a(new k6(e2), d0.a, new zl6(), e0.a).b().d());
        un3.l(Hh(), R.id.profile_loyalty_missions);
    }

    @Override // defpackage.xo8
    public void Xg() {
        Rh().setText(getString(R.string.profile_subscription_positive_button));
        Rh().setState(DodoButton.a.a);
        Ph().setEnabled(true);
        Oh().setEnabled(true);
    }

    @Override // defpackage.xo8
    public void a0(String str) {
        z65.h(str, "phone");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.f(requireContext, str);
    }

    @Override // defpackage.xo8
    public void b0() {
        soa.a.a(new j0()).U();
    }

    @Override // defpackage.xo8
    public void b5() {
        un3.o(Uh(), true);
        un3.o(xh(), false);
        this.Z = R.color.backgroundPrimaryColor;
        kh(R.color.backgroundPrimaryColor);
    }

    @Override // defpackage.d15
    public void bf(Context context, String str, Function0<Unit> function0, Function0<Unit> function02) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, "storyId");
        z65.h(function0, "onSuccess");
        z65.h(function02, "onFailure");
        this.c.bf(context, str, function0, function02);
    }

    @Override // defpackage.xo8
    public void ca() {
        Rh().setText("");
        Rh().setState(DodoButton.a.b);
        Ph().setEnabled(false);
        Oh().setEnabled(false);
    }

    @Override // defpackage.xo8
    public void d7() {
        un3.k(Jh());
        String string = getString(R.string.personal_offer);
        z65.g(string, "getString(...)");
        y8c.a(this, R.id.personal_offers_fragment_container, new o08(string, false, false, 0, h18.d, false, 46, null), i0.a);
    }

    @Override // defpackage.xo8
    public void gb() {
        un3.e(Qh());
    }

    @Override // defpackage.xo8
    public void h(int i2) {
        Ah().E(i2);
        Ah().A(th(Ah()));
        Ah().K(true);
    }

    @Override // defpackage.xo8
    public void hg(com.dodopizza.profile.feature.profilesettings.presentation.a aVar, boolean z2, boolean z3) {
        boolean z4;
        z65.h(aVar, "contactInfoData");
        boolean z5 = false;
        if (aVar.h().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && !z2 && aVar.d().length() > 0) {
            z5 = true;
        }
        o2b.m.a().ph(new k0()).oh(z4).mh(z2).nh(z5).show(getParentFragmentManager(), "support_dialog");
    }

    @Override // defpackage.f70
    protected int hh() {
        return this.Z;
    }

    @Override // defpackage.xo8
    public void i() {
        Ah().K(false);
    }

    @Override // defpackage.xo8
    public void id(String str, int i2, String str2, int i3, boolean z2) {
        z65.h(str, "versionName");
        z65.h(str2, "buildType");
        StringBuilder sb = new StringBuilder(getString(R.string.app_version, str, String.valueOf(i2)));
        if (z2) {
            sb.append(" DEBUG");
        }
        if (z65.c(str2, "regress")) {
            sb.append(", RC version " + i3);
        }
        Vh().setText(sb.toString());
    }

    public void j0(String str) {
        z65.h(str, "message");
        soa.a.a(new l0(str)).U();
    }

    @Override // defpackage.xo8
    public void j7() {
        un3.k(Sh());
        un3.k(Th());
    }

    @Override // defpackage.xo8
    public void k0() {
        un3.k(Fh());
    }

    @Override // defpackage.xo8
    public void k6() {
        un3.k(Ih());
    }

    @Override // defpackage.xo8
    public void kd() {
        un3.l(yh(), R.id.profile_benefits_loading);
    }

    @Override // defpackage.xo8
    public void la() {
        un3.o(Uh(), false);
        un3.o(xh(), true);
        this.Z = R.color.backgroundUnderlayerColor;
        kh(R.color.backgroundUnderlayerColor);
    }

    @Override // defpackage.xo8
    public void nb() {
        List e2;
        RecyclerView Gh = Gh();
        e2 = jc1.e(bm6.a);
        Gh.setAdapter(new k6.a(new k6(e2), f0.a, new cm6(new h0()), g0.a).b().d());
        un3.l(Hh(), R.id.profile_loyalty_missions);
    }

    @Override // defpackage.xo8
    public void nc() {
        String string = getString(R.string.order_placed_empty_id_message);
        z65.g(string, "getString(...)");
        j0(string);
    }

    @Override // defpackage.xo8
    public void ne(List<ul6> list) {
        z65.h(list, "loyaltyMissions");
        Gh().setAdapter(new k6.a(new k6(list), z.a, new y06(new b0(), new c0()), a0.a).b().d());
        un3.l(Hh(), R.id.profile_loyalty_missions);
    }

    @Override // defpackage.xo8
    public void ng(List<? extends q4c> list) {
        z65.h(list, "widgets");
        this.I.Z(list, m0.a);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        wm8.a.a().a((ProfileFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(ProfileFeatureDependencies.class))).a(this);
        super.onCreate(bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        vh().addItemDecoration(new eyb(0, 16, 8));
        Gh().addItemDecoration(new eyb(24, 16, 16));
        wh().d(new AppBarLayout.h() { // from class: xm8
            @Override // com.google.android.material.appbar.AppBarLayout.c
            public final void a(AppBarLayout appBarLayout, int i2) {
                an8.Yh(an8.this, appBarLayout, i2);
            }
        });
        Xh();
        oma.a(Nh(), new l());
        oma.a(Dh(), new m());
        oma.a(Eh(), new n());
        oma.a(Ch(), new o());
        oma.a(Fh(), new p());
        oma.a(Sh(), new q());
        oma.a(Th(), new r());
        Fh().setPaintFlags(Fh().getPaintFlags() | 8);
        Sh().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ym8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                an8.Zh(an8.this, view2, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
        Th().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: zm8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                an8.ai(an8.this, view2, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
        Wh();
    }

    @Override // defpackage.xo8
    public void q3() {
        un3.l(Hh(), R.id.profile_missions_loading);
    }

    @Override // defpackage.xo8
    public void t8() {
        un3.e(Ih());
    }

    @Override // defpackage.xo8
    public void o0() {
    }
}
