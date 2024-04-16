package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.d;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.InfoMessage;
import com.dodopizza.order.feature.menu.DodocoinBadgeView;
import com.dodopizza.order.feature.menu.adapters.menuitem.AssistantMenuItemVH;
import com.dodopizza.order.feature.menu.adapters.menuitem.MenuCategoryItemVH;
import com.dodopizza.order.feature.menu.adapters.menuitem.MenuItemVH;
import com.dodopizza.order.feature.menu.adapters.menuitem.TwoColumnMenuItemRegularVH;
import com.dodopizza.order.feature.menu.adapters.menuitem.d;
import com.dodopizza.order.feature.menu.adapters.promotion.FoodMenuPromotingProductViewHolder;
import com.dodopizza.order.feature.menu.adapters.specialoffer.SpecialOfferViewHolder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CloseReader;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CloseStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.SourceType;
import com.inappstory.sdk.stories.ui.list.StoriesList;
import defpackage.d15;
import defpackage.hxa;
import defpackage.k6;
import defpackage.r5b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter;
import ru.dodopizza.app.presentation.widgets.inappnotification.InAppNotification;
/* compiled from: FoodMenuFragment.kt */
@Metadata(d1 = {"\u0000°\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0002\r'\u0018\u0000 Ë\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Ì\u0002B\t¢\u0006\u0006\bÉ\u0002\u0010Ê\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u0012H\u0002J'\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)J\u0012\u0010,\u001a\u00020+2\b\b\u0001\u0010*\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020-H\u0002J9\u00105\u001a\u00020\u00122\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\b2\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u0012022\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u001202H\u0096\u0001J\b\u00106\u001a\u00020\u001aH\u0014J\u0010\u00107\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0016J\u001a\u0010:\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\b\u00109\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u001cH\u0016J\u0010\u0010?\u001a\u00020\u00122\u0006\u0010>\u001a\u00020=H\u0016J\u0010\u0010A\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u001cH\u0016J\u0016\u0010E\u001a\u00020\u00122\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0BH\u0016J\b\u0010F\u001a\u00020\u0012H\u0016J\u0010\u0010H\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\bH\u0016J\u0010\u0010J\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u001cH\u0016J\u0010\u0010L\u001a\u00020\u00122\u0006\u0010K\u001a\u00020CH\u0016J\u0010\u0010N\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u001aH\u0016J\u0010\u0010P\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\bH\u0016J\b\u0010Q\u001a\u00020\u0012H\u0016J\b\u0010R\u001a\u00020\u0012H\u0016J\u0010\u0010S\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010U\u001a\u00020TH\u0016J\b\u0010W\u001a\u00020\u0012H\u0016J\b\u0010X\u001a\u00020\u0012H\u0016J\b\u0010Y\u001a\u00020\u0012H\u0016J\b\u0010Z\u001a\u00020\u0012H\u0016J\u0010\u0010[\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010]\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020\u001aH\u0016J\b\u0010^\u001a\u00020\u0012H\u0016J\b\u0010_\u001a\u00020\u0012H\u0016J\b\u0010`\u001a\u00020\u0012H\u0016J\b\u0010a\u001a\u00020\u0012H\u0016J\u0006\u0010b\u001a\u00020\u0012J\u0016\u0010e\u001a\u00020\u00122\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\b0cH\u0016J\u001e\u0010g\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u001202H\u0016J\b\u0010h\u001a\u00020\u0012H\u0016J\u0016\u0010j\u001a\u00020\u00122\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\b0BH\u0016J\u0010\u0010l\u001a\u00020\u00122\u0006\u0010k\u001a\u00020\bH\u0016J\b\u0010m\u001a\u00020\u0012H\u0016J\u0010\u0010o\u001a\u00020\u00122\u0006\u0010n\u001a\u00020\u001aH\u0016J\b\u0010p\u001a\u00020\u0012H\u0016J\b\u0010q\u001a\u00020\u0012H\u0016J\b\u0010r\u001a\u00020\u0012H\u0016J\b\u0010s\u001a\u00020\u0012H\u0016J\b\u0010t\u001a\u00020\u0012H\u0016J\b\u0010u\u001a\u00020\u0012H\u0016J\u0010\u0010x\u001a\u00020\u00122\u0006\u0010w\u001a\u00020vH\u0016J\b\u0010y\u001a\u00020\u0012H\u0016J\b\u0010z\u001a\u00020\u0012H\u0016R\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008f\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bo\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001f\u0010\u0092\u0001\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bp\u0010\u008c\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R!\u0010\u0097\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u008c\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R!\u0010\u009c\u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u008c\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R!\u0010¡\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u008c\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R!\u0010¦\u0001\u001a\u00030¢\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b£\u0001\u0010\u008c\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R!\u0010«\u0001\u001a\u00030§\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u008c\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R!\u0010°\u0001\u001a\u00030¬\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u008c\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R!\u0010µ\u0001\u001a\u00030±\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0001\u0010\u008c\u0001\u001a\u0006\b³\u0001\u0010´\u0001R!\u0010º\u0001\u001a\u00030¶\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b·\u0001\u0010\u008c\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R!\u0010½\u0001\u001a\u00030±\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b»\u0001\u0010\u008c\u0001\u001a\u0006\b¼\u0001\u0010´\u0001R!\u0010À\u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¾\u0001\u0010\u008c\u0001\u001a\u0006\b¿\u0001\u0010\u009b\u0001R!\u0010Å\u0001\u001a\u00030Á\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010\u008c\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R!\u0010È\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÆ\u0001\u0010\u008c\u0001\u001a\u0006\bÇ\u0001\u0010\u0096\u0001R!\u0010Ë\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÉ\u0001\u0010\u008c\u0001\u001a\u0006\bÊ\u0001\u0010\u0096\u0001R!\u0010Î\u0001\u001a\u00030¬\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÌ\u0001\u0010\u008c\u0001\u001a\u0006\bÍ\u0001\u0010¯\u0001R!\u0010Ó\u0001\u001a\u00030Ï\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÐ\u0001\u0010\u008c\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R \u0010Ö\u0001\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010\u008c\u0001\u001a\u0006\bÕ\u0001\u0010\u0091\u0001R!\u0010Û\u0001\u001a\u00030×\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bØ\u0001\u0010\u008c\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R \u0010Þ\u0001\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÜ\u0001\u0010\u008c\u0001\u001a\u0006\bÝ\u0001\u0010\u0091\u0001R!\u0010ã\u0001\u001a\u00030ß\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bà\u0001\u0010\u008c\u0001\u001a\u0006\bá\u0001\u0010â\u0001R \u0010æ\u0001\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bä\u0001\u0010\u008c\u0001\u001a\u0006\bå\u0001\u0010\u0091\u0001R%\u0010ë\u0001\u001a\u0010\u0012\u0005\u0012\u00030è\u0001\u0012\u0004\u0012\u00020\u00120ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R!\u0010ð\u0001\u001a\u00030ì\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bí\u0001\u0010\u008c\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R!\u0010õ\u0001\u001a\u00030ñ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bò\u0001\u0010\u008c\u0001\u001a\u0006\bó\u0001\u0010ô\u0001R \u0010ø\u0001\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bö\u0001\u0010\u008c\u0001\u001a\u0006\b÷\u0001\u0010\u0091\u0001R!\u0010û\u0001\u001a\u00030Á\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bù\u0001\u0010\u008c\u0001\u001a\u0006\bú\u0001\u0010Ä\u0001R\u001a\u0010ÿ\u0001\u001a\u00030ü\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R1\u0010\u0088\u0002\u001a\n\u0012\u0005\u0012\u00030\u0081\u00020\u0080\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R+\u0010\u008e\u0002\u001a\r \u0089\u0002*\u0005\u0018\u00010\u0081\u00020\u0081\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0002\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R*\u0010\u0096\u0002\u001a\u00030\u008f\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0090\u0002\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002R\u001c\u0010\u009a\u0002\u001a\u0005\u0018\u00010\u0097\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0099\u0002R*\u0010¢\u0002\u001a\u00030\u009b\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009c\u0002\u0010\u009d\u0002\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002\"\u0006\b \u0002\u0010¡\u0002R*\u0010ª\u0002\u001a\u00030£\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¤\u0002\u0010¥\u0002\u001a\u0006\b¦\u0002\u0010§\u0002\"\u0006\b¨\u0002\u0010©\u0002R*\u0010²\u0002\u001a\u00030«\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¬\u0002\u0010\u00ad\u0002\u001a\u0006\b®\u0002\u0010¯\u0002\"\u0006\b°\u0002\u0010±\u0002R*\u0010º\u0002\u001a\u00030³\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b´\u0002\u0010µ\u0002\u001a\u0006\b¶\u0002\u0010·\u0002\"\u0006\b¸\u0002\u0010¹\u0002R\"\u0010¾\u0002\u001a\r \u0089\u0002*\u0005\u0018\u00010»\u00020»\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R!\u0010Ä\u0002\u001a\u00030¿\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÀ\u0002\u0010Á\u0002\u001a\u0006\bÂ\u0002\u0010Ã\u0002R \u0010È\u0002\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0002\u0010Á\u0002\u001a\u0006\bÆ\u0002\u0010Ç\u0002¨\u0006Í\u0002"}, d2 = {"Lb44;", "Lf70;", "Ls44;", "Lvoa;", "Lr5b$a;", "Ld15;", "Lnq8;", "promotionProducts", "", "pi", "Lk6;", "adapterBuilder", "Ah", "b44$n", "Eh", "()Lb44$n;", "Lnh6;", "menuVO", "", "yi", "wi", "xi", "Lcom/inappstory/sdk/AppearanceManager;", "Ch", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "", "targetPosition", "", "qi", "ri", "Landroid/view/View;", "view", "directionShow", "Bh", "vi", "personalDiscountCount", "totalItemCount", "commonHeaderTitle", "b44$o", "Fh", "(IILjava/lang/String;)Lb44$o;", "gradientRes", "Landroid/graphics/drawable/Drawable;", "Qh", "Lcom/google/android/material/badge/a;", "Dh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "storyId", "Lkotlin/Function0;", "onSuccess", "onFailure", "bf", "hh", "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "isLoading", "ae", "Lvy4;", "inAppNotificationModel", "xb", "visible", "o8", "", "Lce0;", "data", "O3", "Ee", "cityName", "F0", "isError", "L", "bonusAction", "j9", "menuCategoryIndex", "t9", "clickUrl", "Za", "z1", "s9", "D1", "", "balance", "tf", "cf", "Pf", "od", "V9", "md", "position", "H7", "W3", "W8", "Af", "p9", "ui", "", "imageUrls", "w5", "showAnimation", "qf", "n6", "tags", "Zc", "infoStoryId", "F", "A9", "count", Image.TYPE_HIGH, "i", "showSearch", "M4", "Ld", "Qb", "Lc", "Lhn6;", "priceBelowMinPrice", "kg", "eg", "k9", "Ljl7;", DateTokenConverter.CONVERTER_KEY, "Ljl7;", "orderTypeSwitcherFragment", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/b;", com.huawei.hms.push.e.a, "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/b;", "activeOrderFoodMenuFragment", "Lr5b;", "f", "Lr5b;", "mediator", "Lkp;", "g", "Lkp;", "appearanceManagerProvider", "Lcom/google/android/material/appbar/AppBarLayout;", "Lk79;", "Ih", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "ci", "()Landroid/view/View;", "promoTitle", "Landroidx/recyclerview/widget/RecyclerView;", "j", "bi", "()Landroidx/recyclerview/widget/RecyclerView;", "promoRecyclerView", "Landroid/widget/LinearLayout;", "k", "Mh", "()Landroid/widget/LinearLayout;", "containerSearchTabs", "Lcom/google/android/material/tabs/TabLayout;", "l", "mi", "()Lcom/google/android/material/tabs/TabLayout;", "tabs", "Landroid/widget/HorizontalScrollView;", Image.TYPE_MEDIUM, "ni", "()Landroid/widget/HorizontalScrollView;", "tabsScroll", "Landroid/widget/ProgressBar;", "n", "Th", "()Landroid/widget/ProgressBar;", "menuLoader", "Landroid/widget/RelativeLayout;", "o", "Oh", "()Landroid/widget/RelativeLayout;", "errorMessage", "Landroid/widget/Button;", "p", "hi", "()Landroid/widget/Button;", "refreshButton", "Lcom/dodopizza/android/view/custom/InfoMessage;", "q", "Rh", "()Lcom/dodopizza/android/view/custom/InfoMessage;", "infoMessage", "r", "Lh", "cityHeader", Image.TYPE_SMALL, "di", "promotionProductsContainer", "Landroid/widget/TextView;", "t", "fi", "()Landroid/widget/TextView;", "promotionProductsTitle", "u", "gi", "promotionProductsView", "v", "Ph", "foodMenuProducts", "w", "Hh", "animationContainer", "Lcom/inappstory/sdk/stories/ui/list/StoriesList;", "x", "ji", "()Lcom/inappstory/sdk/stories/ui/list/StoriesList;", "stories", "y", "ii", "searchView", "Lcom/dodopizza/order/feature/menu/DodocoinBadgeView;", "z", "Nh", "()Lcom/dodopizza/order/feature/menu/DodocoinBadgeView;", "dodocoinBadgeHeader", "A", "ai", "profileViewHeader", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "B", "Sh", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "mainContentContainer", "I", "Jh", "cartButton", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "X", "Lkotlin/jvm/functions/Function1;", "animator", "Lru/dodopizza/app/presentation/widgets/inappnotification/InAppNotification;", "Y", "Xh", "()Lru/dodopizza/app/presentation/widgets/inappnotification/InAppNotification;", RemoteMessageConst.NOTIFICATION, "Landroid/view/ViewGroup;", "Z", "Gh", "()Landroid/view/ViewGroup;", "activeOrderContainer", "S4", "Uh", "minDeliveryPriceContainer", "T4", "Vh", "minDeliveryPriceText", "Log6;", "U4", "Log6;", "menuPreloadHelper", "Las8;", "Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter;", "V4", "Las8;", "Zh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "W4", "Lmoxy/ktx/MoxyKtxDelegate;", "Yh", "()Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter;", "presenter", "Lo5b;", "X4", "Lo5b;", "li", "()Lo5b;", "setTabLayoutColorManagerCreator", "(Lo5b;)V", "tabLayoutColorManagerCreator", "Ln5b;", "Y4", "Ln5b;", "tabLayoutColorManager", "Lu18;", "Z4", "Lu18;", "oi", "()Lu18;", "setTimerFormatter", "(Lu18;)V", "timerFormatter", "Lf5b;", "a5", "Lf5b;", "ki", "()Lf5b;", "setSystemTimeProvider", "(Lf5b;)V", "systemTimeProvider", "Lgc;", "b5", "Lgc;", "getAnalytics", "()Lgc;", "setAnalytics", "(Lgc;)V", "analytics", "Lvu4;", "c5", "Lvu4;", "Wh", "()Lvu4;", "setModifierFactory", "(Lvu4;)V", "modifierFactory", "Lorg/slf4j/Logger;", "d5", "Lorg/slf4j/Logger;", "logger", "Lhxa;", "e5", "Lrn5;", "ei", "()Lhxa;", "promotionProductsDecoration", "f5", "Kh", "()Lcom/google/android/material/badge/a;", "chatBadgeDrawable", "<init>", "()V", "g5", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: b44  reason: default package */
/* loaded from: classes4.dex */
public final class b44 extends f70 implements s44, voa, r5b.a, d15 {
    private final k79 A;
    private final k79 B;
    private final k79 I;
    private final k79 S4;
    private final k79 T4;
    private og6 U4;
    public as8<FoodMenuPresenter> V4;
    private final MoxyKtxDelegate W4;
    private final Function1<ImageView, Unit> X;
    public o5b X4;
    private final k79 Y;
    private n5b Y4;
    private final k79 Z;
    public u18 Z4;
    public f5b a5;
    public gc b5;
    private final /* synthetic */ e15 c;
    public vu4 c5;
    private jl7 d;
    private final Logger d5;
    private com.dodopizza.activeorder.feature.activeorderwidget.presentation.b e;
    private final rn5 e5;
    private r5b f;
    private final rn5 f5;
    private kp g;
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
    static final /* synthetic */ je5<Object>[] h5 = {bc9.f(new ar8(b44.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0)), bc9.f(new ar8(b44.class, "promoTitle", "getPromoTitle()Landroid/view/View;", 0)), bc9.f(new ar8(b44.class, "promoRecyclerView", "getPromoRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(b44.class, "containerSearchTabs", "getContainerSearchTabs()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(b44.class, "tabs", "getTabs()Lcom/google/android/material/tabs/TabLayout;", 0)), bc9.f(new ar8(b44.class, "tabsScroll", "getTabsScroll()Landroid/widget/HorizontalScrollView;", 0)), bc9.f(new ar8(b44.class, "menuLoader", "getMenuLoader()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(b44.class, "errorMessage", "getErrorMessage()Landroid/widget/RelativeLayout;", 0)), bc9.f(new ar8(b44.class, "refreshButton", "getRefreshButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(b44.class, "infoMessage", "getInfoMessage()Lcom/dodopizza/android/view/custom/InfoMessage;", 0)), bc9.f(new ar8(b44.class, "cityHeader", "getCityHeader()Landroid/widget/Button;", 0)), bc9.f(new ar8(b44.class, "promotionProductsContainer", "getPromotionProductsContainer()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(b44.class, "promotionProductsTitle", "getPromotionProductsTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(b44.class, "promotionProductsView", "getPromotionProductsView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(b44.class, "foodMenuProducts", "getFoodMenuProducts()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(b44.class, "animationContainer", "getAnimationContainer()Landroid/widget/RelativeLayout;", 0)), bc9.f(new ar8(b44.class, "stories", "getStories()Lcom/inappstory/sdk/stories/ui/list/StoriesList;", 0)), bc9.f(new ar8(b44.class, "searchView", "getSearchView()Landroid/view/View;", 0)), bc9.f(new ar8(b44.class, "dodocoinBadgeHeader", "getDodocoinBadgeHeader()Lcom/dodopizza/order/feature/menu/DodocoinBadgeView;", 0)), bc9.f(new ar8(b44.class, "profileViewHeader", "getProfileViewHeader()Landroid/view/View;", 0)), bc9.f(new ar8(b44.class, "mainContentContainer", "getMainContentContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0)), bc9.f(new ar8(b44.class, "cartButton", "getCartButton()Landroid/view/View;", 0)), bc9.f(new ar8(b44.class, RemoteMessageConst.NOTIFICATION, "getNotification()Lru/dodopizza/app/presentation/widgets/inappnotification/InAppNotification;", 0)), bc9.f(new ar8(b44.class, "activeOrderContainer", "getActiveOrderContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(b44.class, "minDeliveryPriceContainer", "getMinDeliveryPriceContainer()Landroid/view/View;", 0)), bc9.f(new ar8(b44.class, "minDeliveryPriceText", "getMinDeliveryPriceText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(b44.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter;", 0))};
    public static final a g5 = new a(null);

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0012"}, d2 = {"Lb44$a;", "", "Lb44;", "a", "", "ALERT_DURATION", "I", "ANIMATION_DURATION", "", "ANIMATION_DURATION_CART", "J", "APPBAR_HORIZONTAL_SPACE_DP", "FIRST_POSITION", "FULL_SPAN_SIZE", "HALF_SPAN_SIZE", "PROMOTION_PRODUCT_ITEMS_OFFSET", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b44$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b44 a() {
            return new b44();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$a0 */
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
            Object newInstance = MenuCategoryItemVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b44$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b78.values().length];
            try {
                iArr[b78.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b78.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$b0 */
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
            return Boolean.valueOf(obj instanceof rc9);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<Object, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof s18);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$c0 */
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
            Object newInstance = MenuItemVH.MenuItemRegularVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final d a = new d();

        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = FoodMenuPromotingProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$d0 */
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
            return Boolean.valueOf(obj instanceof rc9);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<Object, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof np3);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$e0 */
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
            Object newInstance = MenuItemVH.MenuItemBigImageVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$f */
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final f a = new f();

        public f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = FoodMenuPromotingProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$f0 */
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
            return Boolean.valueOf(obj instanceof fo4);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$g */
    /* loaded from: classes4.dex */
    public static final class g extends ej5 implements Function1<Object, Boolean> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof rf8);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$g0 */
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
            Object newInstance = MenuItemVH.HeroMenuItemVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$h */
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final h a = new h();

        public h() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = FoodMenuPromotingProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$h0 */
    /* loaded from: classes4.dex */
    public static final class h0 extends ej5 implements Function1<Object, Boolean> {
        public static final h0 a = new h0();

        public h0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof b93);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls18;", "item", "", "a", "(Ls18;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$i */
    /* loaded from: classes4.dex */
    public static final class i extends ej5 implements Function1<s18, Unit> {
        i() {
            super(1);
        }

        public final void a(s18 s18Var) {
            z65.h(s18Var, "item");
            b44.this.Yh().q0(s18Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(s18 s18Var) {
            a(s18Var);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$i0 */
    /* loaded from: classes4.dex */
    public static final class i0 extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final i0 a = new i0();

        public i0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = TwoColumnMenuItemRegularVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnp3;", "item", "", "position", "", "a", "(Lnp3;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$j */
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function2<np3, Integer, Unit> {
        j() {
            super(2);
        }

        public final void a(np3 np3Var, int i) {
            z65.h(np3Var, "item");
            b44.this.Yh().n0(np3Var, i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(np3 np3Var, Integer num) {
            a(np3Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$j0 */
    /* loaded from: classes4.dex */
    public static final class j0 extends ej5 implements Function1<Object, Boolean> {
        public static final j0 a = new j0();

        public j0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof iu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrf8;", "item", "", "a", "(Lrf8;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$k */
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function1<rf8, Unit> {
        k() {
            super(1);
        }

        public final void a(rf8 rf8Var) {
            z65.h(rf8Var, "item");
            b44.this.Yh().r0(rf8Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(rf8 rf8Var) {
            a(rf8Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/android/material/tabs/TabLayout$g;", "tab", "", "position", "", "a", "(Lcom/google/android/material/tabs/TabLayout$g;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$k0 */
    /* loaded from: classes4.dex */
    public static final class k0 extends ej5 implements Function2<TabLayout.g, Integer, Unit> {
        final /* synthetic */ nh6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(nh6 nh6Var) {
            super(2);
            this.a = nh6Var;
        }

        public final void a(TabLayout.g gVar, int i) {
            z65.h(gVar, "tab");
            gVar.r(this.a.c().get(i).d());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(TabLayout.g gVar, Integer num) {
            a(gVar, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/widget/ImageView;", "imageView", "", "a", "(Landroid/widget/ImageView;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$l */
    /* loaded from: classes4.dex */
    static final class l extends ej5 implements Function1<ImageView, Unit> {
        l() {
            super(1);
        }

        public final void a(ImageView imageView) {
            Window window;
            View decorView;
            int left;
            z65.h(imageView, "imageView");
            try {
                androidx.fragment.app.d activity = b44.this.getActivity();
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    b44 b44Var = b44.this;
                    int bottom = decorView.getBottom();
                    if (decorView.getLayoutDirection() == 0) {
                        left = decorView.getRight();
                    } else {
                        left = decorView.getLeft() - imageView.getWidth();
                    }
                    new x71().c(b44Var.Hh()).k(imageView).i(left, bottom).h(iu1.c(b44Var.requireContext(), R.color.strokePrimaryColor)).j(600).l();
                }
            } catch (IllegalStateException unused) {
                Logger logger = b44.this.d5;
                d.b b = b44.this.getLifecycle().b();
                logger.error("Failed to show circle animation. Current state: " + b);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageView imageView) {
            a(imageView);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b44$l0 */
    /* loaded from: classes4.dex */
    public static final class l0 extends ej5 implements Function0<Unit> {
        final /* synthetic */ nh6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(nh6 nh6Var) {
            super(0);
            this.b = nh6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            n5b n5bVar = b44.this.Y4;
            if (n5bVar != null) {
                n5bVar.a(this.b.c());
            }
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/material/badge/a;", "a", "()Lcom/google/android/material/badge/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$m */
    /* loaded from: classes4.dex */
    static final class m extends ej5 implements Function0<com.google.android.material.badge.a> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.google.android.material.badge.a invoke() {
            return b44.this.Dh();
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b44$m0 */
    /* loaded from: classes4.dex */
    static final class m0 extends ej5 implements Function0<Unit> {
        final /* synthetic */ int b;
        final /* synthetic */ Function0<Unit> c;

        /* compiled from: FoodMenuFragment.kt */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"b44$m0$a", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: b44$m0$a */
        /* loaded from: classes4.dex */
        public static final class a extends RecyclerView.u {
            final /* synthetic */ Function0<Unit> a;
            final /* synthetic */ b44 b;

            a(Function0<Unit> function0, b44 b44Var) {
                this.a = function0;
                this.b = b44Var;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.u
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                z65.h(recyclerView, "recyclerView");
                if (i == 0) {
                    this.a.invoke();
                    this.b.Ph().removeOnScrollListener(this);
                }
            }
        }

        /* compiled from: FoodMenuFragment.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"b44$m0$b", "Landroidx/recyclerview/widget/j;", "", "B", "dx", "x", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: b44$m0$b */
        /* loaded from: classes4.dex */
        public static final class b extends androidx.recyclerview.widget.j {
            b(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.j
            protected int B() {
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.j
            public int x(int i) {
                return 250;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(int i, Function0<Unit> function0) {
            super(0);
            this.b = i;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            RecyclerView.p layoutManager = b44.this.Ph().getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                b44 b44Var = b44.this;
                int i = this.b;
                Function0<Unit> function0 = this.c;
                if (b44Var.qi(linearLayoutManager, i)) {
                    b44Var.Ph().addOnScrollListener(new a(function0, b44Var));
                    b bVar = new b(b44Var.Ph().getContext());
                    bVar.p(i);
                    linearLayoutManager.R1(bVar);
                    return;
                }
                function0.invoke();
            }
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"b44$n", "Lrd6;", "Lye6;", "menuItemVO", "", "position", "", "b", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b44$n */
    /* loaded from: classes4.dex */
    public static final class n implements rd6 {
        n() {
        }

        @Override // defpackage.rd6
        public void a(ye6 ye6Var, int i) {
            z65.h(ye6Var, "menuItemVO");
            b44.this.Yh().v0(ye6Var);
        }

        @Override // defpackage.rd6
        public void b(ye6 ye6Var, int i) {
            z65.h(ye6Var, "menuItemVO");
            b44.this.Yh().p0(ye6Var, i);
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b44$n0 */
    /* loaded from: classes4.dex */
    static final class n0 extends ej5 implements Function0<Unit> {
        final /* synthetic */ vy4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(vy4 vy4Var) {
            super(0);
            this.b = vy4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b44.this.Yh().o0(this.b);
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"b44$o", "Lhxa$a;", "", "itemPosition", "b", "Landroid/view/View;", "header", "headerPosition", "", "a", "currentHeaderPosition", com.huawei.hms.opendevice.c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b44$o */
    /* loaded from: classes4.dex */
    public static final class o implements hxa.a {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ b44 c;
        final /* synthetic */ String d;

        o(int i, int i2, b44 b44Var, String str) {
            this.a = i;
            this.b = i2;
            this.c = b44Var;
            this.d = str;
        }

        @Override // defpackage.hxa.a
        public void a(View view, int i) {
            String str;
            z65.h(view, "header");
            if (i == 0) {
                str = this.c.getString(R.string.personal_products_label);
            } else {
                str = this.d;
            }
            z65.e(str);
            ((TextView) view.findViewById(R.id.title)).setText(str);
        }

        @Override // defpackage.hxa.a
        public int b(int i) {
            if (i >= 0 && i < this.a) {
                return 0;
            }
            if (this.a <= i && i < this.b) {
                return 1;
            }
            return -1;
        }

        @Override // defpackage.hxa.a
        public int c(int i) {
            int i2 = this.a;
            if (i2 == 0 || i != 0) {
                return -1;
            }
            return i2;
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b44$o0 */
    /* loaded from: classes4.dex */
    static final class o0 extends ej5 implements Function0<Unit> {
        final /* synthetic */ vy4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(vy4 vy4Var) {
            super(0);
            this.b = vy4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b44.this.Yh().k0(this.b);
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$p */
    /* loaded from: classes4.dex */
    static final class p extends ej5 implements Function1<View, Unit> {
        p() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b44.this.Yh().s0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b44$p0 */
    /* loaded from: classes4.dex */
    static final class p0 extends ej5 implements Function0<Unit> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(String str) {
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
            b44.this.Yh().H0(this.b);
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$q */
    /* loaded from: classes4.dex */
    static final class q extends ej5 implements Function1<View, Unit> {
        q() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b44.this.Yh().j0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$q0 */
    /* loaded from: classes4.dex */
    static final class q0 extends ej5 implements Function1<View, Unit> {
        q0() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b44.this.Yh().l0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$r */
    /* loaded from: classes4.dex */
    static final class r extends ej5 implements Function1<View, Unit> {
        r() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b44.this.Yh().C0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$r0 */
    /* loaded from: classes4.dex */
    public static final class r0 extends ej5 implements Function1<Object, Boolean> {
        public static final r0 a = new r0();

        public r0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof ce0);
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$s */
    /* loaded from: classes4.dex */
    static final class s extends ej5 implements Function1<View, Unit> {
        s() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b44.this.Yh().B0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$s0 */
    /* loaded from: classes4.dex */
    public static final class s0 extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final s0 a = new s0();

        public s0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = SpecialOfferViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$t */
    /* loaded from: classes4.dex */
    static final class t extends ej5 implements Function0<FoodMenuPresenter> {
        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final FoodMenuPresenter invoke() {
            return b44.this.Zh().get();
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lce0;", "offer", "", "a", "(Lce0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$t0 */
    /* loaded from: classes4.dex */
    static final class t0 extends ej5 implements Function1<ce0, Unit> {
        t0() {
            super(1);
        }

        public final void a(ce0 ce0Var) {
            z65.h(ce0Var, "offer");
            b44.this.Yh().w0(ce0Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ce0 ce0Var) {
            a(ce0Var);
            return Unit.a;
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhxa;", "a", "()Lhxa;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$u */
    /* loaded from: classes4.dex */
    static final class u extends ej5 implements Function0<hxa> {
        u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final hxa invoke() {
            b44 b44Var = b44.this;
            String string = b44Var.getString(R.string.favorite_products_label);
            z65.g(string, "getString(...)");
            return new hxa(R.layout.sticky_promotion_group_header, 40, b44Var.Fh(0, 0, string));
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b44$u0 */
    /* loaded from: classes4.dex */
    /* synthetic */ class u0 extends m94 implements c94<Integer, String, String, Integer, SourceType, Unit> {
        u0(Object obj) {
            super(5, obj, FoodMenuPresenter.class, "onStoryOpened", "onStoryOpened(ILjava/lang/String;Ljava/lang/String;ILcom/inappstory/sdk/stories/outercallbacks/common/reader/SourceType;)V", 0);
        }

        public final void b(int i, String str, String str2, int i2, SourceType sourceType) {
            z65.h(str, "p1");
            z65.h(str2, "p2");
            z65.h(sourceType, "p4");
            ((FoodMenuPresenter) this.receiver).y0(i, str, str2, i2, sourceType);
        }

        @Override // defpackage.c94
        public /* bridge */ /* synthetic */ Unit f0(Integer num, String str, String str2, Integer num2, SourceType sourceType) {
            b(num.intValue(), str, str2, num2.intValue(), sourceType);
            return Unit.a;
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b44$v */
    /* loaded from: classes4.dex */
    static final class v extends ej5 implements Function0<Unit> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (b44.this.mi().x(this.b) != null) {
                b44 b44Var = b44.this;
                int i = this.b;
                r5b r5bVar = b44Var.f;
                if (r5bVar != null) {
                    r5bVar.k(i, false);
                }
            }
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez4;", "it", "", "a", "(Lez4;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$v0 */
    /* loaded from: classes4.dex */
    static final class v0 extends ej5 implements Function1<ez4, Unit> {
        v0() {
            super(1);
        }

        public final void a(ez4 ez4Var) {
            z65.h(ez4Var, "it");
            b44.this.ri();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ez4 ez4Var) {
            a(ez4Var);
            return Unit.a;
        }
    }

    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"b44$w", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b44$w */
    /* loaded from: classes4.dex */
    public static final class w extends GridLayoutManager.c {
        final /* synthetic */ nh6 e;

        w(nh6 nh6Var) {
            this.e = nh6Var;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            if (this.e.d().get(i) instanceof b93) {
                return 1;
            }
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldh6;", "selectedSubCategory", "", "categoryPosition", "subcategoryPosition", "", "a", "(Ldh6;II)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$x */
    /* loaded from: classes4.dex */
    public static final class x extends ej5 implements y84<dh6, Integer, Integer, Unit> {
        x() {
            super(3);
        }

        public final void a(dh6 dh6Var, int i, int i2) {
            z65.h(dh6Var, "selectedSubCategory");
            b44.this.Yh().z0(dh6Var, i, i2);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(dh6 dh6Var, Integer num, Integer num2) {
            a(dh6Var, num.intValue(), num2.intValue());
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$y */
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
            Object newInstance = AssistantMenuItemVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b44$z */
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
            return Boolean.valueOf(obj instanceof fd6);
        }
    }

    public b44() {
        super(R.layout.fragment_food_menu);
        rn5 b2;
        rn5 b3;
        this.c = new e15();
        this.h = kb0.e(this, R.id.food_menu_appbar);
        this.i = kb0.e(this, R.id.food_menu_special_offer_title);
        this.j = kb0.e(this, R.id.food_menu_special_offer);
        this.k = kb0.e(this, R.id.container_search_category_tabs);
        this.l = kb0.e(this, R.id.food_menu_category_tabs);
        this.m = kb0.e(this, R.id.food_menu_category_scroll);
        this.n = kb0.e(this, R.id.food_menu_loader);
        this.o = kb0.e(this, R.id.food_menu_alert_message);
        this.p = kb0.e(this, R.id.refresh_button);
        this.q = kb0.e(this, R.id.food_menu_pizzeria_info);
        this.r = kb0.e(this, R.id.food_menu_city_header);
        this.s = kb0.e(this, R.id.food_menu_promotion_products_container);
        this.t = kb0.e(this, R.id.food_menu_promotion_products_title);
        this.u = kb0.e(this, R.id.food_menu_promotion_products);
        this.v = kb0.e(this, R.id.food_menu_products);
        this.w = kb0.e(this, R.id.animation_container);
        this.x = kb0.e(this, R.id.stories_list);
        this.y = kb0.e(this, R.id.search_view);
        this.z = kb0.e(this, R.id.dodocoin_badge_header);
        this.A = kb0.e(this, R.id.profile_header);
        this.B = kb0.e(this, R.id.coordinator);
        this.I = kb0.e(this, R.id.food_menu_button_cart);
        this.X = new l();
        this.Y = kb0.e(this, R.id.notification);
        this.Z = kb0.e(this, R.id.active_order_widget_container);
        this.S4 = kb0.e(this, R.id.menu_min_delivery_price_container);
        this.T4 = kb0.e(this, R.id.menu_min_delivery_price_text);
        t tVar = new t();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.W4 = new MoxyKtxDelegate(mvpDelegate, FoodMenuPresenter.class.getName() + ".presenter", tVar);
        this.d5 = LoggerFactory.getLogger("FoodMenuFragment");
        b2 = yn5.b(new u());
        this.e5 = b2;
        b3 = yn5.b(new m());
        this.f5 = b3;
    }

    private final k6 Ah(k6 k6Var) {
        return new k6.a(new k6.a(new k6.a(k6Var, c.a, new r18(new i()), d.a).b(), e.a, new ip3(new j()), f.a).b(), g.a, new of8(new k()), h.a).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Bh(View view, boolean z2) {
        float f2;
        float f3;
        int i2;
        Interpolator linearInterpolator;
        if (z2) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (z2) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        if (z2) {
            linearInterpolator = new OvershootInterpolator();
        } else {
            linearInterpolator = new LinearInterpolator();
        }
        Interpolator interpolator = linearInterpolator;
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, f2, 1, f3);
        translateAnimation.setDuration(750L);
        translateAnimation.setInterpolator(interpolator);
        AnimationSet animationSet = new AnimationSet(true);
        if (!z2) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(750L);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(translateAnimation);
        }
        view.setVisibility(i2);
        if (!z2) {
            translateAnimation = animationSet;
        }
        view.startAnimation(translateAnimation);
    }

    private final AppearanceManager Ch() {
        AppearanceManager appearanceManager;
        kp kpVar = this.g;
        if (kpVar != null) {
            appearanceManager = kpVar.a();
        } else {
            appearanceManager = null;
        }
        return (AppearanceManager) mh5.c(appearanceManager, new AppearanceManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.material.badge.a Dh() {
        com.google.android.material.badge.a e2 = com.google.android.material.badge.a.e(requireContext(), R.xml.contacts_screen_badge);
        z65.g(e2, "createFromResource(...)");
        m60.a.c(e2, R.style.ContactsScreenBadgeTextAppearance);
        e2.D(3);
        e2.K(false);
        return e2;
    }

    private final n Eh() {
        return new n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o Fh(int i2, int i3, String str) {
        return new o(i2, i3, this, str);
    }

    private final ViewGroup Gh() {
        return (ViewGroup) this.Z.a(this, h5[23]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RelativeLayout Hh() {
        return (RelativeLayout) this.w.a(this, h5[15]);
    }

    private final AppBarLayout Ih() {
        return (AppBarLayout) this.h.a(this, h5[0]);
    }

    private final View Jh() {
        return (View) this.I.a(this, h5[21]);
    }

    private final com.google.android.material.badge.a Kh() {
        return (com.google.android.material.badge.a) this.f5.getValue();
    }

    private final Button Lh() {
        return (Button) this.r.a(this, h5[10]);
    }

    private final LinearLayout Mh() {
        return (LinearLayout) this.k.a(this, h5[3]);
    }

    private final DodocoinBadgeView Nh() {
        return (DodocoinBadgeView) this.z.a(this, h5[18]);
    }

    private final RelativeLayout Oh() {
        return (RelativeLayout) this.o.a(this, h5[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView Ph() {
        return (RecyclerView) this.v.a(this, h5[14]);
    }

    private final Drawable Qh(int i2) {
        Drawable drawable;
        Drawable e2 = iu1.e(requireContext(), i2);
        if (e2 != null) {
            drawable = e2.mutate();
        } else {
            drawable = null;
        }
        z65.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable).setCornerRadius(kx9.a(12));
        return drawable;
    }

    private final InfoMessage Rh() {
        return (InfoMessage) this.q.a(this, h5[9]);
    }

    private final CoordinatorLayout Sh() {
        return (CoordinatorLayout) this.B.a(this, h5[20]);
    }

    private final ProgressBar Th() {
        return (ProgressBar) this.n.a(this, h5[6]);
    }

    private final View Uh() {
        return (View) this.S4.a(this, h5[24]);
    }

    private final TextView Vh() {
        return (TextView) this.T4.a(this, h5[25]);
    }

    private final InAppNotification Xh() {
        return (InAppNotification) this.Y.a(this, h5[22]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FoodMenuPresenter Yh() {
        return (FoodMenuPresenter) this.W4.getValue(this, h5[26]);
    }

    private final View ai() {
        return (View) this.A.a(this, h5[19]);
    }

    private final RecyclerView bi() {
        return (RecyclerView) this.j.a(this, h5[2]);
    }

    private final View ci() {
        return (View) this.i.a(this, h5[1]);
    }

    private final LinearLayout di() {
        return (LinearLayout) this.s.a(this, h5[11]);
    }

    private final hxa ei() {
        return (hxa) this.e5.getValue();
    }

    private final TextView fi() {
        return (TextView) this.t.a(this, h5[12]);
    }

    private final RecyclerView gi() {
        return (RecyclerView) this.u.a(this, h5[13]);
    }

    private final Button hi() {
        return (Button) this.p.a(this, h5[8]);
    }

    private final View ii() {
        return (View) this.y.a(this, h5[17]);
    }

    private final StoriesList ji() {
        return (StoriesList) this.x.a(this, h5[16]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TabLayout mi() {
        return (TabLayout) this.l.a(this, h5[4]);
    }

    private final HorizontalScrollView ni() {
        return (HorizontalScrollView) this.m.a(this, h5[5]);
    }

    private final String pi(nq8 nq8Var) {
        String string;
        if (nq8Var.b()) {
            string = getString(R.string.favorite_products_label);
        } else {
            string = getString(R.string.popular_products_label);
        }
        z65.e(string);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean qi(LinearLayoutManager linearLayoutManager, int i2) {
        int k2 = linearLayoutManager.k2();
        int h2 = linearLayoutManager.h2();
        if ((h2 != -1 && i2 < h2) || (k2 != -1 && i2 > k2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ri() {
        Yh().m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void si(b44 b44Var, View view) {
        int i2;
        z65.h(b44Var, "this$0");
        RecyclerView.p layoutManager = b44Var.Ph().getLayoutManager();
        if (layoutManager != null) {
            i2 = ((LinearLayoutManager) layoutManager).d2();
        } else {
            i2 = 0;
        }
        b44Var.Yh().u0(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ti(b44 b44Var, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        z65.h(b44Var, "this$0");
        com.google.android.material.badge.b.a(b44Var.Kh(), b44Var.ai());
    }

    private final void vi() {
        Sh().setClipToOutline(true);
        Sh().setBackground(getResources().getDrawable(R.drawable.rounded_corners_top_32dp));
    }

    private final void wi() {
        TabLayout.i iVar;
        TabLayout.g x2 = mi().x(mi().getTabCount() - 1);
        if (x2 != null && (iVar = x2.i) != null) {
            ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(R.dimen.last_tab_margin_category_menu));
                iVar.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    private final void xi() {
        if (mi().getSelectedTabPosition() != 0) {
            Ih().t(false, true);
        }
    }

    private final void yi(nh6 nh6Var) {
        r5b r5bVar = this.f;
        if (r5bVar != null) {
            r5bVar.i();
        }
        r5b r5bVar2 = new r5b(Ph(), mi(), ni(), nh6Var.a(), nh6Var.b(), new k0(nh6Var), this, new l0(nh6Var));
        this.f = r5bVar2;
        r5bVar2.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zi(b44 b44Var, int i2, String str, String str2, int i3, int i4, CloseReader closeReader, SourceType sourceType) {
        z65.h(b44Var, "this$0");
        FoodMenuPresenter Yh = b44Var.Yh();
        z65.e(sourceType);
        Yh.x0(sourceType);
    }

    @Override // defpackage.s44
    public void A9() {
        un3.e(ji());
    }

    @Override // defpackage.s44
    public void Af() {
        p45.h(mi(), getResources().getDimensionPixelSize(R.dimen.food_menu_appbar_space_horizontal), 0, 0, 0, 14, null);
    }

    @Override // defpackage.s44
    public void D1(nq8 nq8Var) {
        z65.h(nq8Var, "promotionProducts");
        fi().setText(pi(nq8Var));
        gi().removeItemDecoration(ei());
        gi().setAdapter(Ah(new k6(new l6(nq8Var.a()))).d());
        un3.k(di());
    }

    @Override // defpackage.s44
    public void Ee() {
        un3.e(bi());
    }

    @Override // defpackage.s44
    public void F(String str) {
        z65.h(str, "infoStoryId");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        d15.a.a(this, requireContext, str, new p0(str), null, 8, null);
    }

    @Override // defpackage.s44
    public void F0(String str) {
        z65.h(str, "cityName");
        Lh().setText(str);
    }

    @Override // defpackage.s44
    public void H7(nh6 nh6Var, int i2) {
        z65.h(nh6Var, "menuVO");
        md(nh6Var);
        Ph().scrollToPosition(i2);
    }

    @Override // defpackage.s44
    public void L(boolean z2) {
        if (z2) {
            Oh().setVisibility(0);
        } else {
            Oh().setVisibility(8);
        }
    }

    @Override // defpackage.s44
    public void Lc() {
        un3.e(Uh());
    }

    @Override // defpackage.s44
    public void Ld() {
        if (this.e == null) {
            com.dodopizza.activeorder.feature.activeorderwidget.presentation.b a2 = com.dodopizza.activeorder.feature.activeorderwidget.presentation.b.r.a();
            getChildFragmentManager().p().u(R.id.active_order_widget_container, a2).k();
            this.e = a2;
        }
        un3.k(Gh());
    }

    @Override // defpackage.s44
    public void M4() {
        un3.e(ii());
    }

    @Override // defpackage.s44
    public void O3(Collection<ce0> collection) {
        z65.h(collection, "data");
        un3.k(bi());
        bi().setAdapter(new k6.a(new k6(new l6(collection)), r0.a, new era(new t0()), s0.a).b().d());
    }

    @Override // defpackage.s44
    public void Pf() {
        if (this.d == null) {
            jl7 a2 = jl7.s.a();
            a2.Fh(this);
            getChildFragmentManager().p().u(R.id.order_type_switcher_container, a2).k();
            this.d = a2;
        }
    }

    @Override // defpackage.s44
    public void Qb() {
        com.dodopizza.activeorder.feature.activeorderwidget.presentation.b bVar = this.e;
        if (bVar != null) {
            getChildFragmentManager().p().t(bVar).k();
        }
        this.e = null;
        un3.e(Gh());
    }

    @Override // defpackage.s44
    public void V9() {
        bi().setEnabled(true);
        bi().setAlpha(1.0f);
    }

    @Override // defpackage.r5b.a
    public void W3() {
        Yh().i0(mi().getSelectedTabPosition());
        xi();
    }

    @Override // defpackage.r5b.a
    public void W8() {
        Yh().t0(mi().getSelectedTabPosition());
        wi();
        xi();
    }

    public final vu4 Wh() {
        vu4 vu4Var = this.c5;
        if (vu4Var != null) {
            return vu4Var;
        }
        z65.z("modifierFactory");
        return null;
    }

    @Override // defpackage.s44
    public void Za(String str) {
        z65.h(str, "clickUrl");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        startActivity(new so9(requireContext).f(str).c(v27.c.toString()).a());
    }

    @Override // defpackage.s44
    public void Zc(Collection<String> collection) {
        z65.h(collection, "tags");
        InAppStoryManager inAppStoryManager = InAppStoryManager.getInstance();
        if (inAppStoryManager != null) {
            inAppStoryManager.setTags(new ArrayList<>(collection));
            un3.k(ji());
            FoodMenuPresenter Yh = Yh();
            z65.g(Yh, "<get-presenter>(...)");
            b05.c(inAppStoryManager, new u0(Yh));
            inAppStoryManager.setCloseStoryCallback(new CloseStoryCallback() { // from class: a44
                @Override // com.inappstory.sdk.stories.outercallbacks.common.reader.CloseStoryCallback
                public final void closeStory(int i2, String str, String str2, int i3, int i4, CloseReader closeReader, SourceType sourceType) {
                    b44.zi(b44.this, i2, str, str2, i3, i4, closeReader, sourceType);
                }
            });
            b05.b(inAppStoryManager, new v0());
            ji().setAppearanceManager(Ch());
            ji().loadStories();
        }
    }

    public final as8<FoodMenuPresenter> Zh() {
        as8<FoodMenuPresenter> as8Var = this.V4;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.s44
    public void ae(boolean z2) {
        un3.o(Ph(), !z2);
        un3.o(Mh(), !z2);
        un3.o(Th(), z2);
    }

    @Override // defpackage.d15
    public void bf(Context context, String str, Function0<Unit> function0, Function0<Unit> function02) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, "storyId");
        z65.h(function0, "onSuccess");
        z65.h(function02, "onFailure");
        this.c.bf(context, str, function0, function02);
    }

    @Override // defpackage.s44
    public void cf() {
        un3.e(Nh());
    }

    @Override // defpackage.s44
    public void eg() {
        Bh(Jh(), true);
    }

    @Override // defpackage.s44
    public void h(int i2) {
        Kh().E(i2);
        Kh().A((int) kx9.a(16));
        Kh().K(true);
    }

    @Override // defpackage.f70
    protected int hh() {
        return R.color.backgroundUnderlayerColor;
    }

    @Override // defpackage.s44
    public void i() {
        Kh().K(false);
    }

    @Override // defpackage.s44
    public void j9(ce0 ce0Var) {
        z65.h(ce0Var, "bonusAction");
        ira.n.d(ce0Var, cq8.e).show(getParentFragmentManager(), "bonus_action_fragment");
    }

    @Override // defpackage.s44
    public void k9() {
        Bh(Jh(), false);
    }

    @Override // defpackage.s44
    public void kg(hn6 hn6Var) {
        z65.h(hn6Var, "priceBelowMinPrice");
        Vh().setText(getString(R.string.min_delivery_price_menu_text, un6.b(hn6Var)));
        un3.k(Uh());
    }

    public final f5b ki() {
        f5b f5bVar = this.a5;
        if (f5bVar != null) {
            return f5bVar;
        }
        z65.z("systemTimeProvider");
        return null;
    }

    public final o5b li() {
        o5b o5bVar = this.X4;
        if (o5bVar != null) {
            return o5bVar;
        }
        z65.z("tabLayoutColorManagerCreator");
        return null;
    }

    @Override // defpackage.s44
    public void md(nh6 nh6Var) {
        z65.h(nh6Var, "menuVO");
        n Eh = Eh();
        RecyclerView Ph = Ph();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.m3(new w(nh6Var));
        Ph.setLayoutManager(gridLayoutManager);
        RecyclerView Ph2 = Ph();
        k6 k6Var = new k6(nh6Var.d());
        int i2 = b.$EnumSwitchMapping$0[nh6Var.e().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                new k6.a(k6Var, d0.a, new d.a(Eh, this.X, oi(), ki()), e0.a).b();
            }
        } else {
            new k6.a(k6Var, b0.a, new d.b(Eh, this.X, oi(), ki()), c0.a).b();
        }
        new k6.a(k6Var, f0.a, new com.dodopizza.order.feature.menu.adapters.menuitem.c(nh6Var.e(), Wh(), Eh, this.X, oi(), ki()), g0.a).b();
        new k6.a(k6Var, h0.a, new com.dodopizza.order.feature.menu.adapters.menuitem.e(Eh, this.X, oi(), ki()), i0.a).b();
        new k6.a(k6Var, j0.a, new com.dodopizza.order.feature.menu.adapters.menuitem.a(nh6Var.e(), Wh(), Eh, this.X, oi(), ki()), y.a).b();
        new k6.a(k6Var, z.a, new ed6(new x()), a0.a).b();
        Ph2.setAdapter(k6Var.d());
        og6 og6Var = this.U4;
        if (og6Var == null) {
            z65.z("menuPreloadHelper");
            og6Var = null;
        }
        og6Var.b(nh6Var.d());
        yi(nh6Var);
    }

    @Override // defpackage.s44
    public void n6() {
        Rh().n(getString(R.string.bonus_action_applied), 3000);
    }

    @Override // defpackage.s44
    public void o8(boolean z2) {
        un3.o(ci(), z2);
    }

    @Override // defpackage.s44
    public void od() {
        bi().setEnabled(false);
        bi().setAlpha(0.5f);
    }

    public final u18 oi() {
        u18 u18Var = this.Z4;
        if (u18Var != null) {
            return u18Var;
        }
        z65.z("timerFormatter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ((LocalityComponent) getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).i3().a(this);
        super.onAttach(context);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        new androidx.recyclerview.widget.n().b(bi());
        bi().addItemDecoration(new ep7(8, 24, 12, 12));
        Ih().getLayoutTransition().enableTransitionType(1);
        gi().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        gi().addItemDecoration(new zo4(16, 12, 12));
        vi();
        oma.a(hi(), new p());
        oma.a(Lh(), new q());
        RecyclerView Ph = Ph();
        FoodMenuPresenter Yh = Yh();
        z65.g(Yh, "<get-presenter>(...)");
        this.U4 = new og6(Ph, Yh);
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        this.g = new lp(requireContext);
        ii().setOnClickListener(new View.OnClickListener() { // from class: y34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b44.si(b44.this, view2);
            }
        });
        oma.a(ai(), new r());
        ai().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: z34
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                b44.ti(b44.this, view2, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
        this.Y4 = li().a(mi());
        oma.a(Jh(), new s());
    }

    @Override // defpackage.s44
    public void p9() {
        p45.h(mi(), 0, 0, 0, 0, 14, null);
    }

    @Override // defpackage.s44
    public void qf(int i2, Function0<Unit> function0) {
        z65.h(function0, "showAnimation");
        un3.g(this, new m0(i2, function0));
    }

    @Override // defpackage.s44
    public void s9() {
        un3.e(di());
    }

    @Override // defpackage.s44
    public void showSearch() {
        un3.k(ii());
    }

    @Override // defpackage.s44
    public void t9(int i2) {
        un3.g(this, new v(i2));
    }

    @Override // defpackage.s44
    public void tf(double d2) {
        String a2 = eb1.a.a(d2);
        un3.k(Nh());
        Nh().setBalance(a2);
        oma.a(Nh(), new q0());
    }

    public final void ui() {
        TabLayout.g x2 = mi().x(0);
        if (x2 != null) {
            x2.l();
        }
    }

    @Override // defpackage.s44
    public void w5(List<String> list) {
        z65.h(list, "imageUrls");
        for (String str : list) {
            com.bumptech.glide.b.t(requireContext()).t(str).b0(yj8.LOW).P0();
        }
    }

    @Override // defpackage.s44
    public void xb(vy4 vy4Var) {
        String b2;
        z65.h(vy4Var, "inAppNotificationModel");
        Xh().c(new n0(vy4Var));
        Xh().b(new o0(vy4Var));
        Xh().setTitle(vy4Var.g());
        Xh().setTitleColor(iu1.c(requireContext(), vy4Var.f().q()));
        InAppNotification Xh = Xh();
        ColorStateList d2 = iu1.d(requireContext(), vy4Var.f().q());
        z65.e(d2);
        Xh.setCloseIconTint(d2);
        Xh().setDescription(vy4Var.c());
        Xh().setDescriptionColor(iu1.c(requireContext(), vy4Var.f().q()));
        Xh().setBackgroundStyle(Qh(vy4Var.f().k()));
        fk a2 = vy4Var.a();
        if (a2 != null) {
            Context requireContext = requireContext();
            z65.g(requireContext, "requireContext(...)");
            if (vl7.a(requireContext)) {
                b2 = a2.a();
            } else {
                b2 = a2.b();
            }
        } else {
            b2 = vy4Var.e().b();
        }
        Xh().a(b2);
        un3.k(Xh());
    }

    @Override // defpackage.s44
    public void z1() {
        un3.e(Xh());
    }
}
