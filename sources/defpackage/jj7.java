package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.activeorder.feature.orderstate.presentation.OrderStateView;
import com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies;
import com.dodopizza.activeorder.feature.ordersummary.di.OrderSummaryComponent;
import com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryGoodViewHolder;
import com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter;
import com.dodopizza.android.view.custom.InfoMessage;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.iu6;
import defpackage.k6;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: OrderSummaryFragment.kt */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ç\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002è\u0001B\u000b\b\u0000¢\u0006\u0006\bå\u0001\u0010æ\u0001J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0003J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\u0016\u0010#\u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\u0018\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001cH\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0006H\u0016J%\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020$2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001c00H\u0016¢\u0006\u0004\b2\u00103J\u0018\u00106\u001a\u00020\u00062\u0006\u00104\u001a\u00020$2\u0006\u00105\u001a\u00020$H\u0016J\b\u00107\u001a\u00020\u0006H\u0016J\b\u00108\u001a\u00020\u0006H\u0016J\u0010\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016J\b\u0010<\u001a\u00020\u0006H\u0016J\b\u0010=\u001a\u00020\u0006H\u0016J\b\u0010>\u001a\u00020\u0006H\u0016J\u0010\u0010@\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020?H\u0016J\b\u0010A\u001a\u00020\u0006H\u0016J\u0010\u0010C\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u001cH\u0016J\b\u0010D\u001a\u00020\u0006H\u0016J\b\u0010E\u001a\u00020\u0006H\u0016J\u0010\u0010G\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0019H\u0016J\u0010\u0010H\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0019H\u0016J\b\u0010I\u001a\u00020\u0006H\u0016J\b\u0010J\u001a\u00020\u0006H\u0016J\b\u0010K\u001a\u00020\u0006H\u0016J\b\u0010L\u001a\u00020\u0006H\u0016J\b\u0010M\u001a\u00020\u0006H\u0016J\b\u0010N\u001a\u00020\u0006H\u0016J\b\u0010O\u001a\u00020\u0006H\u0016J\u0018\u0010R\u001a\u00020\u00062\u0006\u0010P\u001a\u00020$2\u0006\u0010Q\u001a\u00020\u001cH\u0016J\u0018\u0010U\u001a\u00020\u00062\u0006\u0010S\u001a\u00020$2\u0006\u0010T\u001a\u00020\u001cH\u0016J\u0012\u0010W\u001a\u00020\u00062\b\b\u0001\u0010V\u001a\u00020$H\u0016J\b\u0010X\u001a\u00020\u0006H\u0016J\b\u0010Y\u001a\u00020\u0006H\u0016J\b\u0010Z\u001a\u00020\u0006H\u0016J\u0010\u0010[\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0010\u0010\\\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u001cH\u0016J\u0010\u0010^\u001a\u00020\u00062\u0006\u0010]\u001a\u00020$H\u0016J\u0010\u0010a\u001a\u00020\u00062\u0006\u0010`\u001a\u00020_H\u0016J\b\u0010b\u001a\u00020\u0006H\u0016J\b\u0010c\u001a\u00020\u0019H\u0016J\b\u0010d\u001a\u00020\u0006H\u0016J\b\u0010e\u001a\u00020\u0006H\u0016J\u001a\u0010j\u001a\u00020\u00062\u0006\u0010g\u001a\u00020f2\b\u0010i\u001a\u0004\u0018\u00010hH\u0016J\u001a\u0010k\u001a\u00020\u00062\u0006\u0010g\u001a\u00020f2\b\u0010i\u001a\u0004\u0018\u00010hH\u0016J\u001a\u0010m\u001a\u00020\u00062\u0006\u0010l\u001a\u00020f2\b\u0010i\u001a\u0004\u0018\u00010hH\u0016J\u001a\u0010o\u001a\u00020\u00062\u0006\u0010g\u001a\u00020n2\b\u0010i\u001a\u0004\u0018\u00010hH\u0016J\u0010\u0010q\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\u0019H\u0016J\b\u0010r\u001a\u00020\u0006H\u0016R(\u0010{\u001a\b\u0012\u0004\u0012\u00020t0s8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR%\u0010\u0082\u0001\u001a\u00020|8\u0000@\u0000X\u0081.¢\u0006\u0014\n\u0004\b[\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R!\u0010\u0088\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u0010\u008d\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0085\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010\u0092\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0085\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0096\u0001\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0085\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R!\u0010\u009b\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0085\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R!\u0010 \u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u0085\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R!\u0010¥\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u0085\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R!\u0010¨\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u0085\u0001\u001a\u0006\b§\u0001\u0010¤\u0001R!\u0010\u00ad\u0001\u001a\u00030©\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010\u0085\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R!\u0010²\u0001\u001a\u00030®\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u0085\u0001\u001a\u0006\b°\u0001\u0010±\u0001R!\u0010µ\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0001\u0010\u0085\u0001\u001a\u0006\b´\u0001\u0010\u009a\u0001R \u0010¸\u0001\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¶\u0001\u0010\u0085\u0001\u001a\u0006\b·\u0001\u0010\u0095\u0001R!\u0010»\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u0085\u0001\u001a\u0006\bº\u0001\u0010¤\u0001R!\u0010¾\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u0085\u0001\u001a\u0006\b½\u0001\u0010¤\u0001R!\u0010Ã\u0001\u001a\u00030¿\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÀ\u0001\u0010\u0085\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R!\u0010Æ\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÄ\u0001\u0010\u0085\u0001\u001a\u0006\bÅ\u0001\u0010¤\u0001R \u0010É\u0001\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0001\u0010\u0085\u0001\u001a\u0006\bÈ\u0001\u0010\u0095\u0001R!\u0010Ì\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010\u0085\u0001\u001a\u0006\bË\u0001\u0010¤\u0001R!\u0010Ñ\u0001\u001a\u00030Í\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÎ\u0001\u0010\u0085\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R!\u0010×\u0001\u001a\u00030Ò\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R)\u0010Ý\u0001\u001a\u000b Ø\u0001*\u0004\u0018\u00010t0t8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001R'\u0010ä\u0001\u001a\n\u0012\u0005\u0012\u00030ß\u00010Þ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001¨\u0006é\u0001"}, d2 = {"Ljj7;", "Lf70;", "Lfk7;", "Liu6$e;", "Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView$a;", "Lw50;", "", "ph", "qh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "Lqd;", "sender", "K8", "Loc4;", "gameEntryIcons", "f3", "B1", "Lsr6;", "data", "Y4", "", "visible", "l1", "", CrashHianalyticsData.TIME, "H6", "ce", "", "Leg7;", "goods", "Vg", "", "numGoods", "Lhn6;", "costOrder", "T5", "P7", "G2", RemoteMessageConst.Notification.URL, "Ga", "he", "p1", "titleRes", "", "timeArgs", "G4", "(I[Ljava/lang/String;)V", "value", "total", "V7", "x4", "s6", "", "timeRemain", "Cc", "Ja", "e6", "Jc", "Lpq3;", "K6", "Md", "phoneNumber", "ec", "s5", "H1", "available", "u4", "Hc", "Xf", "Z4", "onDestroyView", "Ag", "a3", "J7", "V5", "orderNumber", "orderCreatedTimeTitle", "Ob", "orderType", "address", "C4", "error", "dd", "S9", "wa", "zc", DateTokenConverter.CONVERTER_KEY, "G7", "tableNumber", "r3", "Lik8;", "levelInfo", "Yb", "Y2", "onBackPressed", "Ff", "v9", "Lgg7;", "location", "Ltv5;", "icons", "T7", "Xd", "unitLocation", "d8", "Lxf8;", "w2", "isAnimateMove", "Xc", "B6", "Las8;", "Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter;", com.huawei.hms.opendevice.c.a, "Las8;", "Nh", "()Las8;", "setPresenterProvider$activeorder_release", "(Las8;)V", "presenterProvider", "Lh37;", "Lh37;", "Kh", "()Lh37;", "setNotificationsPermission$activeorder_release", "(Lh37;)V", "notificationsPermission", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.push.e.a, "Lk79;", "Oh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView;", "f", "Lh", "()Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView;", "orderStateView", "Landroid/webkit/WebView;", "g", "Ph", "()Landroid/webkit/WebView;", "webView", Image.TYPE_HIGH, "sh", "()Landroid/view/View;", "cameraSection", "Landroid/widget/Button;", "i", "th", "()Landroid/widget/Button;", "cancelBtn", "Landroid/view/ViewGroup;", "j", "Dh", "()Landroid/view/ViewGroup;", "infoCont", "Landroid/widget/TextView;", "k", "zh", "()Landroid/widget/TextView;", "deliveryInfo", "l", "Ch", "goodsSummaryText", "Lcom/dodopizza/android/view/custom/InfoMessage;", Image.TYPE_MEDIUM, "Eh", "()Lcom/dodopizza/android/view/custom/InfoMessage;", "infoMessage", "Landroidx/recyclerview/widget/RecyclerView;", "n", "Bh", "()Landroidx/recyclerview/widget/RecyclerView;", "goodsRecycler", "o", "Gh", "nakedHandsText", "p", "Fh", "mysteryShopperCard", "q", "xh", "contactSupportButton", "r", "vh", "certificateClarification", "Landroid/widget/ViewSwitcher;", Image.TYPE_SMALL, "uh", "()Landroid/widget/ViewSwitcher;", "cancelButtonSector", "t", "Ah", "deliveryToTableInfo", "u", "Jh", "niceBonusView", "v", "Hh", "niceBonusGiftDescription", "Landroid/widget/ImageView;", "w", "Ih", "()Landroid/widget/ImageView;", "niceBonusGiftImage", "Lis1;", "x", "Lrn5;", "yh", "()Lis1;", "contactSupportDialog", "kotlin.jvm.PlatformType", "y", "Lmoxy/ktx/MoxyKtxDelegate;", "Mh", "()Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter;", "presenter", "Lcma;", "Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent;", "z", "Lcma;", "wh", "()Lcma;", "componentDependenciesRegistry", "<init>", "()V", "A", "a", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jj7  reason: default package */
/* loaded from: classes.dex */
public final class jj7 extends f70 implements fk7, iu6.e, OrderStateView.a, w50 {
    public as8<OrderSummaryPresenter> c;
    public h37 d;
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
    private final rn5 x;
    private final MoxyKtxDelegate y;
    private final cma<OrderSummaryComponent> z;
    static final /* synthetic */ je5<Object>[] B = {bc9.f(new ar8(jj7.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(jj7.class, "orderStateView", "getOrderStateView()Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView;", 0)), bc9.f(new ar8(jj7.class, "webView", "getWebView()Landroid/webkit/WebView;", 0)), bc9.f(new ar8(jj7.class, "cameraSection", "getCameraSection()Landroid/view/View;", 0)), bc9.f(new ar8(jj7.class, "cancelBtn", "getCancelBtn()Landroid/widget/Button;", 0)), bc9.f(new ar8(jj7.class, "infoCont", "getInfoCont()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(jj7.class, "deliveryInfo", "getDeliveryInfo()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jj7.class, "goodsSummaryText", "getGoodsSummaryText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jj7.class, "infoMessage", "getInfoMessage()Lcom/dodopizza/android/view/custom/InfoMessage;", 0)), bc9.f(new ar8(jj7.class, "goodsRecycler", "getGoodsRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(jj7.class, "nakedHandsText", "getNakedHandsText()Landroid/widget/Button;", 0)), bc9.f(new ar8(jj7.class, "mysteryShopperCard", "getMysteryShopperCard()Landroid/view/View;", 0)), bc9.f(new ar8(jj7.class, "contactSupportButton", "getContactSupportButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jj7.class, "certificateClarification", "getCertificateClarification()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jj7.class, "cancelButtonSector", "getCancelButtonSector()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(jj7.class, "deliveryToTableInfo", "getDeliveryToTableInfo()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jj7.class, "niceBonusView", "getNiceBonusView()Landroid/view/View;", 0)), bc9.f(new ar8(jj7.class, "niceBonusGiftDescription", "getNiceBonusGiftDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jj7.class, "niceBonusGiftImage", "getNiceBonusGiftImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(jj7.class, "presenter", "getPresenter()Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter;", 0))};
    public static final a A = new a(null);

    /* compiled from: OrderSummaryFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Ljj7$a;", "", "Lej7;", "data", "Ljj7;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "", "NICE_BONUS_SECOND_LEVEL", "I", "NICE_BONUS_THIRD_LEVEL", "THREE_SECONDS", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jj7$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jj7 a(ej7 ej7Var) {
            z65.h(ej7Var, "data");
            return (jj7) y64.d(new jj7(), bi0.c(bi0.d("data", ej7Var)));
        }
    }

    /* compiled from: OrderSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent;", "a", "()Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jj7$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<OrderSummaryComponent> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderSummaryComponent invoke() {
            OrderSummaryComponent.b a = OrderSummaryComponent.a.a();
            Bundle arguments = jj7.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof ej7)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                return a.a((ej7) obj, (OrderSummaryFeatureDependencies) jj7.this.getComponentDependenciesRegistry().a(bc9.b(OrderSummaryFeatureDependencies.class)));
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    /* compiled from: OrderSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lis1;", "a", "()Lis1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jj7$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<is1> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderSummaryFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jj7$c$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class a extends m94 implements Function0<Unit> {
            a(Object obj) {
                super(0, obj, OrderSummaryPresenter.class, "onContactSupportByPhoneClick", "onContactSupportByPhoneClick()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((OrderSummaryPresenter) this.receiver).U();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderSummaryFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jj7$c$b */
        /* loaded from: classes.dex */
        public /* synthetic */ class b extends m94 implements Function0<Unit> {
            b(Object obj) {
                super(0, obj, OrderSummaryPresenter.class, "onContactSupportByChatClick", "onContactSupportByChatClick()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((OrderSummaryPresenter) this.receiver).T();
            }
        }

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final is1 invoke() {
            Context requireContext = jj7.this.requireContext();
            z65.g(requireContext, "requireContext(...)");
            OrderSummaryPresenter Mh = jj7.this.Mh();
            z65.g(Mh, "access$getPresenter(...)");
            a aVar = new a(Mh);
            OrderSummaryPresenter Mh2 = jj7.this.Mh();
            z65.g(Mh2, "access$getPresenter(...)");
            return new is1(requireContext, aVar, new b(Mh2));
        }
    }

    /* compiled from: OrderSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jj7$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            jj7.this.Mh().Z();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jj7$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            jj7.this.Mh().V();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jj7$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            jj7.this.Mh().Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jj7$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function1<View, Unit> {
        g() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            jj7.this.Mh().S();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jj7$h */
    /* loaded from: classes.dex */
    /* synthetic */ class h extends m94 implements Function1<com.dodopizza.controlling.feature.orderrating.presentation.c, Unit> {
        h(Object obj) {
            super(1, obj, OrderSummaryPresenter.class, "onOrderRatingResult", "onOrderRatingResult(Lcom/dodopizza/controlling/feature/orderrating/presentation/OrderRatingResult;)V", 0);
        }

        public final void b(com.dodopizza.controlling.feature.orderrating.presentation.c cVar) {
            z65.h(cVar, "p0");
            ((OrderSummaryPresenter) this.receiver).b0(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.dodopizza.controlling.feature.orderrating.presentation.c cVar) {
            b(cVar);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jj7$i */
    /* loaded from: classes.dex */
    static final class i extends ej5 implements Function0<OrderSummaryPresenter> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderSummaryPresenter invoke() {
            return jj7.this.Nh().get();
        }
    }

    /* compiled from: OrderSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryFragment$requestNotificationsPermission$1", f = "OrderSummaryFragment.kt", l = {158}, m = "invokeSuspend")
    /* renamed from: jj7$j */
    /* loaded from: classes.dex */
    static final class j extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ qd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(qd qdVar, cv1<? super j> cv1Var) {
            super(2, cv1Var);
            this.c = qdVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new j(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((j) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                h37 Kh = jj7.this.Kh();
                androidx.fragment.app.d requireActivity = jj7.this.requireActivity();
                z65.g(requireActivity, "requireActivity(...)");
                qd qdVar = this.c;
                OrderSummaryPresenter Mh = jj7.this.Mh();
                this.a = 1;
                if (Kh.h(requireActivity, qdVar, Mh, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jj7$k */
    /* loaded from: classes.dex */
    public static final class k extends ej5 implements Function1<Object, Boolean> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof eg7);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jj7$l */
    /* loaded from: classes.dex */
    public static final class l extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final l a = new l();

        public l() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = OrderSummaryGoodViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    public jj7() {
        super(rz8.fragment_order);
        rn5 b2;
        this.e = kb0.e(this, ux8.order_summary_toolbar);
        this.f = kb0.e(this, ux8.order_state);
        this.g = kb0.e(this, ux8.web_view);
        this.h = kb0.e(this, ux8.camera_section);
        this.i = kb0.e(this, ux8.q);
        this.j = kb0.e(this, ux8.info_container);
        this.k = kb0.e(this, ux8.delivery_info);
        this.l = kb0.e(this, ux8.order_summary_goods_summary);
        this.m = kb0.e(this, ux8.I);
        this.n = kb0.e(this, ux8.G);
        this.o = kb0.e(this, ux8.why_naked_hands);
        this.p = kb0.e(this, ux8.M);
        this.q = kb0.e(this, ux8.contact_support_button);
        this.r = kb0.e(this, ux8.certificate_clarification);
        this.s = kb0.e(this, ux8.order_summary_button_switcher);
        this.t = kb0.e(this, ux8.delivery_to_table_info);
        this.u = kb0.e(this, ux8.nice_bonus_view);
        this.v = kb0.e(this, ux8.nice_bonus_description);
        this.w = kb0.e(this, ux8.nice_bonus_image);
        b2 = yn5.b(new c());
        this.x = b2;
        i iVar = new i();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.y = new MoxyKtxDelegate(mvpDelegate, OrderSummaryPresenter.class.getName() + ".presenter", iVar);
        this.z = new cma<>(eu2.d(this), bc9.b(OrderSummaryComponent.class), new b());
    }

    private final TextView Ah() {
        return (TextView) this.t.a(this, B[15]);
    }

    private final RecyclerView Bh() {
        return (RecyclerView) this.n.a(this, B[9]);
    }

    private final TextView Ch() {
        return (TextView) this.l.a(this, B[7]);
    }

    private final ViewGroup Dh() {
        return (ViewGroup) this.j.a(this, B[5]);
    }

    private final InfoMessage Eh() {
        return (InfoMessage) this.m.a(this, B[8]);
    }

    private final View Fh() {
        return (View) this.p.a(this, B[11]);
    }

    private final Button Gh() {
        return (Button) this.o.a(this, B[10]);
    }

    private final TextView Hh() {
        return (TextView) this.v.a(this, B[17]);
    }

    private final ImageView Ih() {
        return (ImageView) this.w.a(this, B[18]);
    }

    private final View Jh() {
        return (View) this.u.a(this, B[16]);
    }

    private final OrderStateView Lh() {
        return (OrderStateView) this.f.a(this, B[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderSummaryPresenter Mh() {
        return (OrderSummaryPresenter) this.y.getValue(this, B[19]);
    }

    private final Toolbar Oh() {
        return (Toolbar) this.e.a(this, B[0]);
    }

    private final WebView Ph() {
        return (WebView) this.g.a(this, B[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qh(jj7 jj7Var, View view) {
        z65.h(jj7Var, "this$0");
        jj7Var.Mh().onBackPressed();
    }

    private final void ph() {
        Bh().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        Bh().setNestedScrollingEnabled(false);
    }

    @SuppressLint({"ClickableViewAccessibility", "SetJavaScriptEnabled"})
    private final void qh() {
        Ph().setLayerType(2, null);
        Ph().getSettings().setJavaScriptEnabled(true);
        Ph().setOnTouchListener(new View.OnTouchListener() { // from class: ij7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean rh;
                rh = jj7.rh(jj7.this, view, motionEvent);
                return rh;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rh(jj7 jj7Var, View view, MotionEvent motionEvent) {
        z65.h(jj7Var, "this$0");
        if (motionEvent.getAction() == 1) {
            jj7Var.Mh().P();
        }
        return view.onTouchEvent(motionEvent);
    }

    private final View sh() {
        return (View) this.h.a(this, B[3]);
    }

    private final Button th() {
        return (Button) this.i.a(this, B[4]);
    }

    private final ViewSwitcher uh() {
        return (ViewSwitcher) this.s.a(this, B[14]);
    }

    private final TextView vh() {
        return (TextView) this.r.a(this, B[13]);
    }

    private final TextView xh() {
        return (TextView) this.q.a(this, B[12]);
    }

    private final is1 yh() {
        return (is1) this.x.getValue();
    }

    private final TextView zh() {
        return (TextView) this.k.a(this, B[6]);
    }

    @Override // defpackage.fk7
    public void Ag() {
        uh().setDisplayedChild(1);
    }

    @Override // defpackage.fk7
    public void C4(int i2, String str) {
        String str2;
        z65.h(str, "address");
        if (i2 == jk7.e.i()) {
            str2 = getString(d19.courier_delivery_full);
        } else if (i2 == jk7.g.i()) {
            str2 = getString(d19.restaurant_delivery_full);
        } else if (i2 == jk7.f.i()) {
            str2 = getString(d19.restaurant_delivery_full);
        } else {
            str2 = "";
        }
        z65.e(str2);
        TextView zh = zh();
        pza pzaVar = pza.a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{str2, str}, 2));
        z65.g(format, "format(...)");
        zh.setText(format);
    }

    @Override // defpackage.fk7
    public void Cc(long j2) {
        Lh().setTimer(j2);
    }

    @Override // defpackage.fk7
    public void G2() {
        un3.e(Gh());
    }

    @Override // defpackage.fk7
    public void G4(int i2, String[] strArr) {
        z65.h(strArr, "timeArgs");
        OrderStateView Lh = Lh();
        String string = getString(i2, Arrays.copyOf(strArr, strArr.length));
        z65.g(string, "getString(...)");
        Lh.setTitle(string);
    }

    @Override // defpackage.fk7
    public void G7(String str) {
        z65.h(str, "orderNumber");
        String string = getString(d19.cancel_order_text, str);
        z65.g(string, "getString(...)");
        Spanned a2 = vp4.a(string, 0);
        z65.g(a2, "fromHtml(...)");
        new iu6.a().f(a2).d(d19.cancel_order_dialog_confirm_button).c(d19.cancel_order_dialog_close_button).g(this);
    }

    @Override // defpackage.fk7
    public void Ga(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        if (!z65.c(str, Ph().getUrl())) {
            Ph().loadUrl(str);
        }
    }

    @Override // defpackage.fk7
    public void H1() {
        un3.e(xh());
    }

    @Override // defpackage.fk7
    public void H6(String str) {
        z65.h(str, CrashHianalyticsData.TIME);
        un3.k(vh());
        vh().setText(getString(d19.certificate_clarification, str));
    }

    @Override // defpackage.fk7
    public void Hc(boolean z) {
        yh().k(z);
    }

    @Override // defpackage.fk7
    public void J7() {
        un3.k(uh());
    }

    @Override // defpackage.fk7
    public void Ja() {
        OrderStateView Lh = Lh();
        String string = getString(d19.sorry_for_late_on_delivery);
        z65.g(string, "getString(...)");
        Lh.setSubTitle(string);
    }

    @Override // com.dodopizza.activeorder.feature.orderstate.presentation.OrderStateView.a
    public void Jc() {
        Mh().c0();
    }

    @Override // defpackage.fk7
    public void K6(pq3 pq3Var) {
        z65.h(pq3Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        u8c.a(p, ux8.D, pq3Var, o19.OrderSummaryTheme);
        p.l();
    }

    @Override // defpackage.fk7
    public void K8(qd qdVar) {
        z65.h(qdVar, "sender");
        op5 viewLifecycleOwner = getViewLifecycleOwner();
        z65.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        sh0.d(pp5.a(viewLifecycleOwner), null, null, new j(qdVar, null), 3, null);
    }

    public final h37 Kh() {
        h37 h37Var = this.d;
        if (h37Var != null) {
            return h37Var;
        }
        z65.z("notificationsPermission");
        return null;
    }

    @Override // defpackage.fk7
    public void Md() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        Fragment k0 = getChildFragmentManager().k0(ux8.D);
        if (k0 != null) {
            p.t(k0);
        }
        p.l();
    }

    public final as8<OrderSummaryPresenter> Nh() {
        as8<OrderSummaryPresenter> as8Var = this.c;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.fk7
    public void Ob(int i2, String str) {
        z65.h(str, "orderCreatedTimeTitle");
        Oh().setTitle(getResources().getString(d19.order_num_title_with_time, Integer.valueOf(i2), str));
    }

    @Override // defpackage.fk7
    public void P7() {
        un3.k(Gh());
    }

    @Override // defpackage.iu6.e
    public void S9() {
        Mh().R();
    }

    @Override // defpackage.fk7
    public void T5(int i2, hn6 hn6Var) {
        z65.h(hn6Var, "costOrder");
        String quantityString = getResources().getQuantityString(h09.a, i2, Integer.valueOf(i2), un6.b(hn6Var));
        z65.g(quantityString, "getQuantityString(...)");
        Ch().setText(quantityString);
    }

    @Override // defpackage.fk7
    public void T7(gg7 gg7Var, tv5 tv5Var) {
        z65.h(gg7Var, "location");
    }

    @Override // defpackage.fk7
    public void V5() {
        un3.e(uh());
    }

    @Override // defpackage.fk7
    public void V7(int i2, int i3) {
        Lh().f(i2, i3);
    }

    @Override // defpackage.fk7
    public void Vg(List<eg7> list) {
        z65.h(list, "goods");
        Bh().setAdapter(new k6.a(new k6(list), k.a, new lj7(), l.a).b().d());
    }

    @Override // defpackage.fk7
    public void Xd(gg7 gg7Var, tv5 tv5Var) {
        z65.h(gg7Var, "location");
    }

    @Override // defpackage.fk7
    public void Xf() {
        yh().show();
    }

    @Override // defpackage.fk7
    public void Y2() {
        un3.e(Jh());
    }

    @Override // defpackage.fk7
    public void Y4(sr6 sr6Var) {
        z65.h(sr6Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        com.dodopizza.controlling.feature.mysteryshoppercard.presentation.c.a(p, ux8.N, sr6Var, o19.OrderSummaryTheme);
        p.l();
    }

    @Override // defpackage.fk7
    public void Yb(ik8 ik8Var) {
        int i2;
        z65.h(ik8Var, "levelInfo");
        int b2 = ik8Var.b();
        if (b2 != 2) {
            if (b2 != 3) {
                i2 = jx8.nice_bonus_first_gift;
            } else {
                i2 = jx8.nice_bonus_third_gift;
            }
        } else {
            i2 = jx8.nice_bonus_second_gift;
        }
        Ih().setImageDrawable(iu1.e(requireContext(), i2));
        Hh().setText(ik8Var.a());
        un3.k(Jh());
    }

    @Override // defpackage.fk7
    public void Z4() {
        yh().hide();
    }

    @Override // defpackage.fk7
    public void a3() {
        uh().setDisplayedChild(0);
    }

    @Override // defpackage.fk7
    public void ce() {
        un3.e(vh());
    }

    @Override // defpackage.fk7
    public void d(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.g(requireContext, str);
    }

    @Override // defpackage.fk7
    public void d8(gg7 gg7Var, tv5 tv5Var) {
        z65.h(gg7Var, "unitLocation");
    }

    @Override // defpackage.fk7
    public void dd(int i2) {
        Eh().h(i2, 3000);
    }

    @Override // defpackage.fk7
    public void e6() {
        OrderStateView Lh = Lh();
        String string = getString(d19.sorry_for_late_in_restaurant);
        z65.g(string, "getString(...)");
        Lh.setSubTitle(string);
    }

    @Override // defpackage.fk7
    public void ec(String str) {
        z65.h(str, "phoneNumber");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.f(requireContext, str);
    }

    @Override // defpackage.fk7
    public void f3(oc4 oc4Var) {
        z65.h(oc4Var, "gameEntryIcons");
    }

    @Override // defpackage.fk7
    public void he() {
        un3.k(sh());
    }

    @Override // defpackage.fk7
    public void l1(boolean z) {
        un3.o(Fh(), z);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Mh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        getComponentDependenciesRegistry().b().Q3(this);
        super.onCreate(bundle);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Ph().stopLoading();
        Ph().destroy();
        super.onDestroyView();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        ph();
        qh();
        Oh().setNavigationOnClickListener(new View.OnClickListener() { // from class: hj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jj7.Qh(jj7.this, view2);
            }
        });
        oma.a(Gh(), new d());
        oma.a(xh(), new e());
        oma.a(th(), new f());
        oma.a(Dh(), new g());
        OrderStateView Lh = Lh();
        String string = getString(d19.order_countdown_time_format);
        z65.g(string, "getString(...)");
        Lh.setTimerFormatter(new ol6(string));
        Lh().setTimerCallback(this);
        OrderSummaryPresenter Mh = Mh();
        z65.g(Mh, "<get-presenter>(...)");
        u8c.b(this, new h(Mh));
    }

    @Override // defpackage.fk7
    public void p1() {
        un3.e(sh());
    }

    @Override // defpackage.fk7
    public void r3(int i2) {
        pza pzaVar = pza.a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{getString(d19.will_bring_to_the_table), Integer.valueOf(i2)}, 2));
        z65.g(format, "format(...)");
        Ah().setText(format);
        un3.k(Ah());
    }

    @Override // defpackage.fk7
    public void s5() {
        un3.k(xh());
    }

    @Override // defpackage.fk7
    public void s6() {
        Lh().e();
    }

    @Override // defpackage.fk7
    public void u4(boolean z) {
        yh().l(z);
    }

    @Override // defpackage.fk7
    public void w2(xf8 xf8Var, tv5 tv5Var) {
        z65.h(xf8Var, "location");
    }

    @Override // defpackage.fk7
    public void wa() {
        Eh().j(d19.draft_rating_info_message, 3000);
    }

    @Override // defpackage.f70, defpackage.lm1
    /* renamed from: wh */
    public cma<OrderSummaryComponent> getComponentDependenciesRegistry() {
        return this.z;
    }

    @Override // defpackage.fk7
    public void x4() {
        Lh().g();
    }

    @Override // defpackage.fk7
    public void zc() {
        Eh().h(d19.error_rating_info_message, 3000);
    }

    @Override // defpackage.fk7
    public void B1() {
    }

    @Override // defpackage.fk7
    public void B6() {
    }

    @Override // defpackage.fk7
    public void Ff() {
    }

    @Override // defpackage.fk7
    public void v9() {
    }

    @Override // defpackage.fk7
    public void Xc(boolean z) {
    }
}
