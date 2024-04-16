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
import android.widget.ViewAnimator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.buttons.DodoButton;
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
import ru.dodopizza.app.presentation.profile.adapter.loyaltymissions.failstate.MissionsFailStateViewHolderV2024;
import ru.dodopizza.app.presentation.profile.adapter.loyaltymissionsV2024.LoyaltyMissionViewHolderV2024;
import ru.dodopizza.app.presentation.profile.adapter.loyaltymissionsV2024.emptystate.MissionsEmptyStateViewHolderV2024;
import ru.dodopizza.app.presentation.profile.adapter.widgets.LoyaltyWidgetViewHolder;
import ru.dodopizza.app.presentation.profile.adapter.widgets.PersonalWidgetViewHolder;
/* compiled from: ProfileFragmentV2024.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 ¿\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Ã\u0001B\t¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0002J9\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0096\u0001J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0014J\b\u0010 \u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000bH\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\u0016\u0010)\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001bH\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\b\u0010-\u001a\u00020\u0004H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016J\u0010\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000fH\u0016J\b\u00102\u001a\u00020\u0004H\u0016J\b\u00103\u001a\u00020\u0004H\u0016J\u0016\u00106\u001a\u00020\u00042\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u001bH\u0016J\b\u00107\u001a\u00020\u0004H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u000fH\u0016J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u000fH\u0016J\b\u0010<\u001a\u00020\u0004H\u0016J\b\u0010=\u001a\u00020\u0004H\u0016J\b\u0010>\u001a\u00020\u0004H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016J\b\u0010@\u001a\u00020\u0004H\u0016J\b\u0010A\u001a\u00020\u0004H\u0016J\b\u0010B\u001a\u00020\u0004H\u0016J\b\u0010C\u001a\u00020\u0004H\u0016J\b\u0010D\u001a\u00020\u0004H\u0016J\b\u0010E\u001a\u00020\u0004H\u0016J0\u0010L\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020JH\u0016J\b\u0010M\u001a\u00020\u0004H\u0016J\b\u0010N\u001a\u00020\u0004H\u0016J\b\u0010O\u001a\u00020\u0004H\u0016J \u0010T\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020J2\u0006\u0010S\u001a\u00020JH\u0016J\u0010\u0010V\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u000fH\u0016J\u0010\u0010X\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u000bH\u0016J\b\u0010Y\u001a\u00020\u0004H\u0016R(\u0010b\u001a\b\u0012\u0004\u0012\u00020[0Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001b\u0010h\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010e\u001a\u0004\bk\u0010lR\u001b\u0010q\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010e\u001a\u0004\bo\u0010pR\u001b\u0010s\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010e\u001a\u0004\br\u0010pR\u001b\u0010w\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010e\u001a\u0004\bu\u0010vR\u001b\u0010z\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010e\u001a\u0004\by\u0010vR\u001b\u0010}\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010e\u001a\u0004\b|\u0010gR\u001e\u0010\u0082\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010e\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0085\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010e\u001a\u0006\b\u0084\u0001\u0010\u0081\u0001R\u001f\u0010\u0088\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010e\u001a\u0006\b\u0087\u0001\u0010\u0081\u0001R \u0010\u008d\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010e\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u0090\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008e\u0001\u0010e\u001a\u0006\b\u008f\u0001\u0010\u008c\u0001R\u001e\u0010\u0093\u0001\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010e\u001a\u0005\b\u0092\u0001\u0010gR\u001e\u0010\u0096\u0001\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010e\u001a\u0005\b\u0095\u0001\u0010gR \u0010\u009b\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010e\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001e\u0010\u009e\u0001\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010e\u001a\u0005\b\u009d\u0001\u0010gR \u0010£\u0001\u001a\u00030\u009f\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b \u0001\u0010e\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010¦\u0001\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¤\u0001\u0010e\u001a\u0005\b¥\u0001\u0010lR \u0010«\u0001\u001a\u00030§\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¨\u0001\u0010e\u001a\u0006\b©\u0001\u0010ª\u0001R \u0010®\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¬\u0001\u0010e\u001a\u0006\b\u00ad\u0001\u0010\u008c\u0001R\u001e\u0010²\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R \u0010·\u0001\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R)\u0010½\u0001\u001a\u000b ¸\u0001*\u0004\u0018\u00010[0[8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R\u0019\u0010À\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001¨\u0006Ä\u0001"}, d2 = {"Ldn8;", "Lf70;", "Lxo8;", "Ld15;", "", "Rh", "Qh", "Uh", "Lcom/google/android/material/badge/a;", "sh", "badge", "", "rh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "storyId", "Lkotlin/Function0;", "onSuccess", "onFailure", "bf", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "Lq4c;", "widgets", "ng", "hh", "la", "b5", "orderNumber", "N2", "S", "o0", "nc", "Lwl7;", "activeOrders", "C1", "F1", "kd", "T3", "H3", "k6", "t8", "aboutMissionUrl", "We", "nb", "q3", "Lul6;", "loyaltyMissions", "ne", "D6", "message", "j0", "infoStoryId", "F", "F5", "gb", "ca", "Xg", "b0", "Q1", "d7", "A2", "Lb", "U3", "versionName", "versionCode", "buildType", "rcVersion", "", "isDebug", "id", "k0", "j7", "Kb", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfoData", "isNativeChatEnabled", "isAuth", "hg", "phone", "a0", "count", Image.TYPE_HIGH, "i", "Las8;", "Lru/dodopizza/app/presentation/profile/ProfilePresenter;", DateTokenConverter.CONVERTER_KEY, "Las8;", "Gh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Landroid/view/ViewGroup;", com.huawei.hms.push.e.a, "Lk79;", "Oh", "()Landroid/view/ViewGroup;", "unauthorizedContainer", "Landroid/widget/Button;", "f", "wh", "()Landroid/widget/Button;", "enterPhoneButton", "g", "yh", "()Landroid/view/View;", "exitButtonUnAuth", "Nh", "supportButtonUnAuth", "Landroidx/appcompat/widget/AppCompatTextView;", "zh", "()Landroidx/appcompat/widget/AppCompatTextView;", "legalDocsUnAuth", "j", "Ph", "versionUnAuth", "k", "uh", "authorizedContainer", "Landroid/widget/ImageButton;", "l", "Hh", "()Landroid/widget/ImageButton;", "settingsButton", Image.TYPE_MEDIUM, "xh", "exitButton", "n", "Mh", "supportButton", "Landroidx/recyclerview/widget/RecyclerView;", "o", "th", "()Landroidx/recyclerview/widget/RecyclerView;", "activeOrdersList", "p", "Ah", "loyaltyMissionsList", "q", "Ch", "missionsContainer", "r", "Dh", "personalOfferFragmentContainer", "Landroid/widget/ViewAnimator;", Image.TYPE_SMALL, "Bh", "()Landroid/widget/ViewAnimator;", "missionsAnimator", "t", "Kh", "subscriptionPanel", "Lcom/dodopizza/android/buttons/DodoButton;", "u", "Lh", "()Lcom/dodopizza/android/buttons/DodoButton;", "subscriptionPositiveButton", "v", "Jh", "subscriptionNegativeButton", "Landroid/widget/ImageView;", "w", "Ih", "()Landroid/widget/ImageView;", "subscriptionInfoButton", "x", "Eh", "personalWidgets", "Ll6;", "y", "Ll6;", "profileCustomerMenu", "z", "Lrn5;", "vh", "()Lcom/google/android/material/badge/a;", "chatBadgeDrawable", "kotlin.jvm.PlatformType", "A", "Lmoxy/ktx/MoxyKtxDelegate;", "Fh", "()Lru/dodopizza/app/presentation/profile/ProfilePresenter;", "presenter", "B", "I", "statusFragmentBarColor", "<init>", "()V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: dn8  reason: default package */
/* loaded from: classes4.dex */
public final class dn8 extends f70 implements xo8, d15 {
    private final MoxyKtxDelegate A;
    private int B;
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
    private final l6<q4c> y;
    private final rn5 z;
    static final /* synthetic */ je5<Object>[] X = {bc9.f(new ar8(dn8.class, "unauthorizedContainer", "getUnauthorizedContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(dn8.class, "enterPhoneButton", "getEnterPhoneButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(dn8.class, "exitButtonUnAuth", "getExitButtonUnAuth()Landroid/view/View;", 0)), bc9.f(new ar8(dn8.class, "supportButtonUnAuth", "getSupportButtonUnAuth()Landroid/view/View;", 0)), bc9.f(new ar8(dn8.class, "legalDocsUnAuth", "getLegalDocsUnAuth()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(dn8.class, "versionUnAuth", "getVersionUnAuth()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(dn8.class, "authorizedContainer", "getAuthorizedContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(dn8.class, "settingsButton", "getSettingsButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(dn8.class, "exitButton", "getExitButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(dn8.class, "supportButton", "getSupportButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(dn8.class, "activeOrdersList", "getActiveOrdersList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(dn8.class, "loyaltyMissionsList", "getLoyaltyMissionsList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(dn8.class, "missionsContainer", "getMissionsContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(dn8.class, "personalOfferFragmentContainer", "getPersonalOfferFragmentContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(dn8.class, "missionsAnimator", "getMissionsAnimator()Landroid/widget/ViewAnimator;", 0)), bc9.f(new ar8(dn8.class, "subscriptionPanel", "getSubscriptionPanel()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(dn8.class, "subscriptionPositiveButton", "getSubscriptionPositiveButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(dn8.class, "subscriptionNegativeButton", "getSubscriptionNegativeButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(dn8.class, "subscriptionInfoButton", "getSubscriptionInfoButton()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(dn8.class, "personalWidgets", "getPersonalWidgets()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(dn8.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/profile/ProfilePresenter;", 0))};
    public static final a I = new a(null);

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Ldn8$a;", "", "Ldn8;", "a", "", "OFFSET_RIGHT_DP", "F", "POPUP_HEIGHT_DP", "POPUP_WIDTH_DP", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dn8$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dn8 a() {
            return new dn8();
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul6;", "mission", "", "a", "(Lul6;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$a0 */
    /* loaded from: classes4.dex */
    static final class a0 extends ej5 implements Function1<ul6, Unit> {
        a0() {
            super(1);
        }

        public final void a(ul6 ul6Var) {
            z65.h(ul6Var, "mission");
            dn8.this.Fh().o0(ul6Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ul6 ul6Var) {
            a(ul6Var);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/material/badge/a;", "a", "()Lcom/google/android/material/badge/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<com.google.android.material.badge.a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.google.android.material.badge.a invoke() {
            return dn8.this.sh();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$b0 */
    /* loaded from: classes4.dex */
    public static final class b0 extends ej5 implements Function1<Object, Boolean> {
        public static final b0 a = new b0();

        public b0() {
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
    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dn8.this.Fh().w0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$c0 */
    /* loaded from: classes4.dex */
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
            Object newInstance = MissionsEmptyStateViewHolderV2024.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dn8.this.Fh().r0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$d0 */
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
            return Boolean.valueOf(obj instanceof bm6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dn8.this.Uh();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$e0 */
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
            Object newInstance = MissionsFailStateViewHolderV2024.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$f */
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

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dn8$f0 */
    /* loaded from: classes4.dex */
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
            dn8.this.Fh().q0();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$g */
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

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dn8$g0 */
    /* loaded from: classes4.dex */
    static final class g0 extends ej5 implements Function0<Unit> {
        public static final g0 a = new g0();

        g0() {
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
    /* renamed from: dn8$h */
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

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$h0 */
    /* loaded from: classes4.dex */
    static final class h0 extends ej5 implements Function1<uoa, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: dn8$h0$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ dn8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(dn8 dn8Var) {
                super(0);
                this.a = dn8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                View requireView = this.a.requireView();
                z65.g(requireView, "requireView(...)");
                return requireView;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: dn8$h0$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ dn8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(dn8 dn8Var) {
                super(0);
                this.a = dn8Var;
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
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: dn8$h0$c */
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
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: dn8$h0$d */
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

        h0() {
            super(1);
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(dn8.this));
            uoaVar.h(new b(dn8.this));
            uoaVar.d(c.a);
            uoaVar.f(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$i */
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

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"dn8$i0", "Lo2b$b;", "", com.huawei.hms.opendevice.c.a, "b", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dn8$i0 */
    /* loaded from: classes4.dex */
    public static final class i0 implements o2b.b {
        i0() {
        }

        @Override // defpackage.o2b.b
        public void a() {
            dn8.this.Fh().e0();
        }

        @Override // defpackage.o2b.b
        public void b() {
            dn8.this.Fh().d0();
        }

        @Override // defpackage.o2b.b
        public void c() {
            dn8.this.Fh().g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La28;", "data", "", "a", "(La28;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$j */
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<a28, Unit> {

        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: dn8$j$a */
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
                            dn8.this.Fh().m0();
                            return;
                        }
                        return;
                    }
                    dn8.this.Fh().l0();
                    return;
                }
                dn8.this.Fh().i0();
                return;
            }
            dn8.this.Fh().t0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a28 a28Var) {
            a(a28Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$j0 */
    /* loaded from: classes4.dex */
    public static final class j0 extends ej5 implements Function1<uoa, Unit> {
        final /* synthetic */ String b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: dn8$j0$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ dn8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(dn8 dn8Var) {
                super(0);
                this.a = dn8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                View requireView = this.a.requireView();
                z65.g(requireView, "requireView(...)");
                return requireView;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: dn8$j0$b */
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
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: dn8$j0$c */
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
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: dn8$j0$d */
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
        j0(String str) {
            super(1);
            this.b = str;
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(dn8.this));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc36;", "it", "", "a", "(Lc36;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$k */
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function1<c36, Unit> {
        k() {
            super(1);
        }

        public final void a(c36 c36Var) {
            z65.h(c36Var, "it");
            dn8.this.Fh().n0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c36 c36Var) {
            a(c36Var);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lq4c;", "old", "new", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$k0 */
    /* loaded from: classes4.dex */
    static final class k0 extends ej5 implements Function2<List<? extends q4c>, List<? extends q4c>, e.C0047e> {
        public static final k0 a = new k0();

        k0() {
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

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$l */
    /* loaded from: classes4.dex */
    static final class l extends ej5 implements Function1<View, Unit> {
        l() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dn8.this.Fh().v0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$m */
    /* loaded from: classes4.dex */
    static final class m extends ej5 implements Function1<View, Unit> {
        m() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dn8.this.Fh().k0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$n */
    /* loaded from: classes4.dex */
    static final class n extends ej5 implements Function1<View, Unit> {
        n() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dn8.this.Fh().k0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$o */
    /* loaded from: classes4.dex */
    static final class o extends ej5 implements Function1<View, Unit> {
        o() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dn8.this.Fh().j0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$p */
    /* loaded from: classes4.dex */
    static final class p extends ej5 implements Function1<View, Unit> {
        p() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dn8.this.Fh().f0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/profile/ProfilePresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/profile/ProfilePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$q */
    /* loaded from: classes4.dex */
    static final class q extends ej5 implements Function0<ProfilePresenter> {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ProfilePresenter invoke() {
            return dn8.this.Gh().get();
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dn8$r */
    /* loaded from: classes4.dex */
    static final class r extends ej5 implements Function0<Unit> {
        public static final r a = new r();

        r() {
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
    /* renamed from: dn8$s */
    /* loaded from: classes4.dex */
    public static final class s extends ej5 implements Function1<Object, Boolean> {
        public static final s a = new s();

        public s() {
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
    /* renamed from: dn8$t */
    /* loaded from: classes4.dex */
    public static final class t extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final t a = new t();

        public t() {
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

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwl7;", "orderVO", "", "a", "(Lwl7;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$u */
    /* loaded from: classes4.dex */
    static final class u extends ej5 implements Function1<wl7, Unit> {
        u() {
            super(1);
        }

        public final void a(wl7 wl7Var) {
            z65.h(wl7Var, "orderVO");
            dn8.this.Fh().s0(wl7Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wl7 wl7Var) {
            a(wl7Var);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$v */
    /* loaded from: classes4.dex */
    static final class v extends ej5 implements Function1<uoa, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: dn8$v$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ dn8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(dn8 dn8Var) {
                super(0);
                this.a = dn8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                View requireView = this.a.requireView();
                z65.g(requireView, "requireView(...)");
                return requireView;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: dn8$v$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ dn8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(dn8 dn8Var) {
                super(0);
                this.a = dn8Var;
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
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: dn8$v$c */
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
        /* compiled from: ProfileFragmentV2024.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/material/snackbar/Snackbar;", "snackbar", "", "a", "(Lcom/google/android/material/snackbar/Snackbar;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: dn8$v$d */
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function1<Snackbar, Unit> {
            final /* synthetic */ dn8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(dn8 dn8Var) {
                super(1);
                this.a = dn8Var;
            }

            public final void a(Snackbar snackbar) {
                z65.h(snackbar, "snackbar");
                this.a.Fh().u0();
                snackbar.s();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Snackbar snackbar) {
                a(snackbar);
                return Unit.a;
            }
        }

        v() {
            super(1);
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(dn8.this));
            uoaVar.h(new b(dn8.this));
            uoaVar.f(c.a);
            uoaVar.g(R.string.refresh_button_label, new d(dn8.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dn8$w */
    /* loaded from: classes4.dex */
    static final class w extends ej5 implements Function0<Unit> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str) {
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
            dn8.this.Fh().y0(this.b);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$x */
    /* loaded from: classes4.dex */
    public static final class x extends ej5 implements Function1<Object, Boolean> {
        public static final x a = new x();

        public x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof ul6);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$y */
    /* loaded from: classes4.dex */
    public static final class y extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final y a = new y();

        public y() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = LoyaltyMissionViewHolderV2024.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ProfileFragmentV2024.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul6;", "mission", "", "a", "(Lul6;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dn8$z */
    /* loaded from: classes4.dex */
    static final class z extends ej5 implements Function1<ul6, Unit> {
        z() {
            super(1);
        }

        public final void a(ul6 ul6Var) {
            z65.h(ul6Var, "mission");
            dn8.this.Fh().p0(ul6Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ul6 ul6Var) {
            a(ul6Var);
            return Unit.a;
        }
    }

    public dn8() {
        super(R.layout.fragment_profile_v2024);
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
        this.o = kb0.e(this, R.id.profile_active_orders);
        this.p = kb0.e(this, R.id.profile_loyalty_missions);
        this.q = kb0.e(this, R.id.profile_loyalty_missions_container);
        this.r = kb0.e(this, R.id.personal_offers_fragment_container);
        this.s = kb0.e(this, R.id.profile_missions_switcher);
        this.t = kb0.e(this, R.id.profile_subscription);
        this.u = kb0.e(this, R.id.subscription_positive_button);
        this.v = kb0.e(this, R.id.subscription_negative_button);
        this.w = kb0.e(this, R.id.subscription_info_button);
        this.x = kb0.e(this, R.id.new_profile_customer_menu_container);
        this.y = new l6<>(null, 1, null);
        b2 = yn5.b(new b());
        this.z = b2;
        q qVar = new q();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.A = new MoxyKtxDelegate(mvpDelegate, ProfilePresenter.class.getName() + ".presenter", qVar);
        this.B = R.color.backgroundSecondaryColor;
    }

    private final RecyclerView Ah() {
        return (RecyclerView) this.p.a(this, X[11]);
    }

    private final ViewAnimator Bh() {
        return (ViewAnimator) this.s.a(this, X[14]);
    }

    private final ViewGroup Ch() {
        return (ViewGroup) this.q.a(this, X[12]);
    }

    private final ViewGroup Dh() {
        return (ViewGroup) this.r.a(this, X[13]);
    }

    private final RecyclerView Eh() {
        return (RecyclerView) this.x.a(this, X[19]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfilePresenter Fh() {
        return (ProfilePresenter) this.A.getValue(this, X[20]);
    }

    private final ImageButton Hh() {
        return (ImageButton) this.l.a(this, X[7]);
    }

    private final ImageView Ih() {
        return (ImageView) this.w.a(this, X[18]);
    }

    private final Button Jh() {
        return (Button) this.v.a(this, X[17]);
    }

    private final ViewGroup Kh() {
        return (ViewGroup) this.t.a(this, X[15]);
    }

    private final DodoButton Lh() {
        return (DodoButton) this.u.a(this, X[16]);
    }

    private final ImageButton Mh() {
        return (ImageButton) this.n.a(this, X[9]);
    }

    private final View Nh() {
        return (View) this.h.a(this, X[3]);
    }

    private final ViewGroup Oh() {
        return (ViewGroup) this.e.a(this, X[0]);
    }

    private final AppCompatTextView Ph() {
        return (AppCompatTextView) this.j.a(this, X[5]);
    }

    private final void Qh() {
        oma.a(Lh(), new c());
        oma.a(Jh(), new d());
        oma.a(Ih(), new e());
    }

    private final void Rh() {
        Eh().addItemDecoration(new zo4(4, 4, 4));
        Eh().setAdapter(new k6.a(new k6.a(new k6(this.y), f.a, new z18(new j()), g.a).b(), h.a, new b36(new k()), i.a).b().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Sh(dn8 dn8Var, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        z65.h(dn8Var, "this$0");
        com.google.android.material.badge.b.a(dn8Var.vh(), dn8Var.Mh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Th(dn8 dn8Var, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        z65.h(dn8Var, "this$0");
        com.google.android.material.badge.b.a(dn8Var.vh(), dn8Var.Nh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Uh() {
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
            Ih().getLocationOnScreen(iArr);
            popupWindow.showAtLocation(inflate, 0, iArr[0] - a2, iArr[1] - a3);
        }
    }

    private final int rh(com.google.android.material.badge.a aVar) {
        m60 m60Var = m60.a;
        int a2 = m60Var.a(aVar, -((int) kx9.a(20)));
        Resources resources = getResources();
        z65.g(resources, "getResources(...)");
        return a2 - m60Var.b(resources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.material.badge.a sh() {
        com.google.android.material.badge.a e2 = com.google.android.material.badge.a.e(requireContext(), R.xml.contacts_screen_badge);
        z65.g(e2, "createFromResource(...)");
        m60.a.c(e2, R.style.ContactsScreenBadgeTextAppearance);
        e2.D(3);
        e2.K(false);
        return e2;
    }

    private final RecyclerView th() {
        return (RecyclerView) this.o.a(this, X[10]);
    }

    private final ViewGroup uh() {
        return (ViewGroup) this.k.a(this, X[6]);
    }

    private final com.google.android.material.badge.a vh() {
        return (com.google.android.material.badge.a) this.z.getValue();
    }

    private final Button wh() {
        return (Button) this.f.a(this, X[1]);
    }

    private final ImageButton xh() {
        return (ImageButton) this.m.a(this, X[8]);
    }

    private final View yh() {
        return (View) this.g.a(this, X[2]);
    }

    private final AppCompatTextView zh() {
        return (AppCompatTextView) this.i.a(this, X[4]);
    }

    @Override // defpackage.xo8
    public void A2() {
        un3.k(Dh());
        String string = getString(R.string.personal_offer);
        z65.g(string, "getString(...)");
        y8c.c(this, R.id.personal_offers_fragment_container, new o08(string, false, false, 0, h18.d, false, 46, null), r.a);
    }

    @Override // defpackage.xo8
    public void C1(List<wl7> list) {
        z65.h(list, "activeOrders");
        un3.k(th());
        String string = getString(R.string.order_countdown_time_format);
        z65.g(string, "getString(...)");
        ol6 ol6Var = new ol6(string);
        th().setAdapter(new k6.a(new k6(list), s.a, new a5(ol6Var, new u()), t.a).b().d());
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
        d15.a.a(this, requireContext, str, new w(str), null, 8, null);
    }

    @Override // defpackage.xo8
    public void F1() {
        un3.e(th());
    }

    @Override // defpackage.xo8
    public void F5() {
        un3.k(Kh());
    }

    public final as8<ProfilePresenter> Gh() {
        as8<ProfilePresenter> as8Var = this.d;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.xo8
    public void Kb() {
        un3.e(Mh());
        un3.e(Nh());
    }

    @Override // defpackage.xo8
    public void Lb() {
        up8.i.a(cq8.k).show(getParentFragmentManager(), "enter_invite_code_dialog");
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
        soa.a.a(new v()).Q(-2).U();
    }

    @Override // defpackage.xo8
    public void U3() {
        un3.k(Ph());
    }

    @Override // defpackage.xo8
    public void We(String str) {
        List e2;
        z65.h(str, "aboutMissionUrl");
        RecyclerView Ah = Ah();
        e2 = jc1.e(yl6.a);
        Ah.setAdapter(new k6.a(new k6(e2), b0.a, new am6(), c0.a).b().d());
        un3.l(Bh(), R.id.profile_loyalty_missions);
    }

    @Override // defpackage.xo8
    public void Xg() {
        Lh().setState(DodoButton.a.a);
        Jh().setEnabled(true);
        Ih().setEnabled(true);
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
        soa.a.a(new h0()).U();
    }

    @Override // defpackage.xo8
    public void b5() {
        un3.o(Oh(), true);
        un3.o(uh(), false);
        this.B = R.color.backgroundPrimaryColor;
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
        Lh().setState(DodoButton.a.b);
        Jh().setEnabled(false);
        Ih().setEnabled(false);
    }

    @Override // defpackage.xo8
    public void d7() {
        un3.k(Dh());
        String string = getString(R.string.personal_offer);
        z65.g(string, "getString(...)");
        y8c.a(this, R.id.personal_offers_fragment_container, new o08(string, false, false, 0, h18.d, false, 46, null), g0.a);
    }

    @Override // defpackage.xo8
    public void gb() {
        un3.e(Kh());
    }

    @Override // defpackage.xo8
    public void h(int i2) {
        vh().E(i2);
        vh().A(rh(vh()));
        vh().K(true);
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
        o2b.m.a().ph(new i0()).oh(z4).mh(z2).nh(z5).show(getParentFragmentManager(), "support_dialog");
    }

    @Override // defpackage.f70
    protected int hh() {
        return this.B;
    }

    @Override // defpackage.xo8
    public void i() {
        vh().K(false);
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
        Ph().setText(sb.toString());
    }

    public void j0(String str) {
        z65.h(str, "message");
        soa.a.a(new j0(str)).U();
    }

    @Override // defpackage.xo8
    public void j7() {
        un3.k(Mh());
        un3.k(Nh());
    }

    @Override // defpackage.xo8
    public void k0() {
        un3.k(zh());
    }

    @Override // defpackage.xo8
    public void k6() {
        un3.k(Ch());
    }

    @Override // defpackage.xo8
    public void la() {
        un3.o(Oh(), false);
        un3.o(uh(), true);
        this.B = R.color.backgroundUnderlayerColor;
        kh(R.color.backgroundUnderlayerColor);
    }

    @Override // defpackage.xo8
    public void nb() {
        List e2;
        RecyclerView Ah = Ah();
        e2 = jc1.e(bm6.a);
        Ah.setAdapter(new k6.a(new k6(e2), d0.a, new dm6(new f0()), e0.a).b().d());
        un3.l(Bh(), R.id.profile_loyalty_missions);
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
        Ah().setAdapter(new k6.a(new k6(list), x.a, new z06(new z(), new a0()), y.a).b().d());
        un3.l(Bh(), R.id.profile_loyalty_missions);
    }

    @Override // defpackage.xo8
    public void ng(List<? extends q4c> list) {
        z65.h(list, "widgets");
        this.y.Z(list, k0.a);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        wm8.a.a().a((ProfileFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(ProfileFeatureDependencies.class))).b(this);
        super.onCreate(bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        th().addItemDecoration(new eyb(0, 0, 0, 6, null));
        Ah().addItemDecoration(new eyb(8, 16, 16));
        Rh();
        oma.a(Hh(), new l());
        oma.a(xh(), new m());
        oma.a(yh(), new n());
        oma.a(wh(), new o());
        oma.a(zh(), new p());
        Mh().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: bn8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                dn8.Sh(dn8.this, view2, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
        Nh().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: cn8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                dn8.Th(dn8.this, view2, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
        zh().setPaintFlags(zh().getPaintFlags() | 8);
        Qh();
    }

    @Override // defpackage.xo8
    public void q3() {
        un3.l(Bh(), R.id.profile_missions_loading);
    }

    @Override // defpackage.xo8
    public void t8() {
        un3.e(Ch());
    }

    @Override // defpackage.xo8
    public void H3() {
    }

    @Override // defpackage.xo8
    public void T3() {
    }

    @Override // defpackage.xo8
    public void kd() {
    }

    @Override // defpackage.xo8
    public void o0() {
    }
}
