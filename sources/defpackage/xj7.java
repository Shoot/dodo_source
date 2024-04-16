package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.load.engine.GlideException;
import com.dodopizza.activeorder.feature.orderstate.presentation.OrderStateView;
import com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies;
import com.dodopizza.activeorder.feature.ordersummary.di.OrderSummaryComponent;
import com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryGoodViewHolder;
import com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter;
import com.dodopizza.android.view.custom.InfoMessage;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.iu6;
import defpackage.k6;
import defpackage.rg4;
import defpackage.xj7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: OrderSummaryMapFragment.kt */
@Metadata(d1 = {"\u0000\u0082\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ½\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002¾\u0002B\u000b\b\u0000¢\u0006\u0006\b»\u0002\u0010¼\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002JN\u0010$\u001a\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010 \u001a\u00020\u001d2\b\b\u0001\u0010!\u001a\u00020\u001d2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\"H\u0002JJ\u0010)\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\r2\u0006\u0010(\u001a\u00020'H\u0002J\b\u0010*\u001a\u00020\tH\u0002J\b\u0010+\u001a\u00020\tH\u0003J\u0016\u0010/\u001a\u00020\t2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\u0010\u00101\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0007H\u0002J\u0012\u00104\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u000102H\u0016J\u001a\u00106\u001a\u00020\t2\u0006\u00105\u001a\u00020-2\b\u00103\u001a\u0004\u0018\u000102H\u0016J\u0010\u00109\u001a\u00020\t2\u0006\u00108\u001a\u000207H\u0016J\u0010\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020:H\u0016J\b\u0010=\u001a\u00020\tH\u0016J\u0010\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020>H\u0016J\u0010\u0010B\u001a\u00020\t2\u0006\u0010A\u001a\u00020\u0007H\u0016J\u0010\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020%H\u0016J\b\u0010E\u001a\u00020\tH\u0016J\u0010\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020FH\u0016J\u0016\u0010L\u001a\u00020\t2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0IH\u0016J\u0018\u0010P\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020NH\u0016J\b\u0010Q\u001a\u00020\tH\u0016J\b\u0010R\u001a\u00020\tH\u0016J\u0010\u0010T\u001a\u00020\t2\u0006\u0010S\u001a\u00020%H\u0016J\b\u0010U\u001a\u00020\tH\u0016J\b\u0010V\u001a\u00020\tH\u0016J%\u0010Z\u001a\u00020\t2\u0006\u0010W\u001a\u00020\u001d2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020%0XH\u0016¢\u0006\u0004\bZ\u0010[J\u0018\u0010^\u001a\u00020\t2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u001dH\u0016J\b\u0010_\u001a\u00020\tH\u0016J\b\u0010`\u001a\u00020\tH\u0016J\u0010\u0010c\u001a\u00020\t2\u0006\u0010b\u001a\u00020aH\u0016J\b\u0010d\u001a\u00020\tH\u0016J\b\u0010e\u001a\u00020\tH\u0016J\b\u0010f\u001a\u00020\tH\u0016J\u0010\u0010h\u001a\u00020\t2\u0006\u0010?\u001a\u00020gH\u0016J\b\u0010i\u001a\u00020\tH\u0016J\u0010\u0010k\u001a\u00020\t2\u0006\u0010j\u001a\u00020%H\u0016J\b\u0010l\u001a\u00020\tH\u0016J\b\u0010m\u001a\u00020\tH\u0016J\u0010\u0010o\u001a\u00020\t2\u0006\u0010n\u001a\u00020\u0007H\u0016J\u0010\u0010p\u001a\u00020\t2\u0006\u0010n\u001a\u00020\u0007H\u0016J\b\u0010q\u001a\u00020\tH\u0016J\b\u0010r\u001a\u00020\tH\u0016J\b\u0010s\u001a\u00020\tH\u0016J\b\u0010t\u001a\u00020\tH\u0016J\b\u0010u\u001a\u00020\tH\u0016J\b\u0010v\u001a\u00020\tH\u0016J\b\u0010w\u001a\u00020\tH\u0016J\u0018\u0010z\u001a\u00020\t2\u0006\u0010x\u001a\u00020\u001d2\u0006\u0010y\u001a\u00020%H\u0016J\u0018\u0010}\u001a\u00020\t2\u0006\u0010{\u001a\u00020\u001d2\u0006\u0010|\u001a\u00020%H\u0016J\u0012\u0010\u007f\u001a\u00020\t2\b\b\u0001\u0010~\u001a\u00020\u001dH\u0016J\t\u0010\u0080\u0001\u001a\u00020\tH\u0016J\t\u0010\u0081\u0001\u001a\u00020\tH\u0016J\t\u0010\u0082\u0001\u001a\u00020\tH\u0016J\u0011\u0010\u0083\u0001\u001a\u00020\t2\u0006\u0010S\u001a\u00020%H\u0016J\u0011\u0010\u0084\u0001\u001a\u00020\t2\u0006\u0010x\u001a\u00020%H\u0016J\u0012\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\u001dH\u0016J\u0013\u0010\u0089\u0001\u001a\u00020\t2\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0016J\t\u0010\u008a\u0001\u001a\u00020\tH\u0016J\t\u0010\u008b\u0001\u001a\u00020\tH\u0016J\t\u0010\u008c\u0001\u001a\u00020\tH\u0016J\u001c\u0010\u008e\u0001\u001a\u00020\t2\u0007\u0010\f\u001a\u00030\u008d\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u008f\u0001\u001a\u00020\t2\u0007\u0010\f\u001a\u00030\u008d\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001d\u0010\u0091\u0001\u001a\u00020\t2\b\u0010\u0090\u0001\u001a\u00030\u008d\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001b\u0010\u0092\u0001\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0011\u0010\u0093\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\u0094\u0001\u001a\u00020\tH\u0016J\t\u0010\u0095\u0001\u001a\u00020\u0007H\u0016R1\u0010\u009e\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¥\u0001\u001a\u00030\u009f\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R \u0010ª\u0001\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R \u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R!\u0010±\u0001\u001a\u00030\u00ad\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010§\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R!\u0010¶\u0001\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0001\u0010§\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R\u001b\u0010¹\u0001\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010¼\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R%\u0010¿\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R%\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010¾\u0001R-\u0010Å\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190Á\u0001j\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0019`Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001b\u0010È\u0001\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u001b\u0010Ë\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u001b\u0010Î\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0019\u0010Ñ\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R!\u0010Ö\u0001\u001a\u00030Ò\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÓ\u0001\u0010§\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R!\u0010Û\u0001\u001a\u00030×\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bØ\u0001\u0010§\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R!\u0010à\u0001\u001a\u00030Ü\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÝ\u0001\u0010§\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R \u0010ã\u0001\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bá\u0001\u0010§\u0001\u001a\u0006\bâ\u0001\u0010©\u0001R!\u0010è\u0001\u001a\u00030ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bå\u0001\u0010§\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001R!\u0010í\u0001\u001a\u00030é\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bê\u0001\u0010§\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R!\u0010ð\u0001\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bî\u0001\u0010§\u0001\u001a\u0006\bï\u0001\u0010µ\u0001R!\u0010ó\u0001\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bñ\u0001\u0010§\u0001\u001a\u0006\bò\u0001\u0010µ\u0001R!\u0010ø\u0001\u001a\u00030ô\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bõ\u0001\u0010§\u0001\u001a\u0006\bö\u0001\u0010÷\u0001R!\u0010ý\u0001\u001a\u00030ù\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bú\u0001\u0010§\u0001\u001a\u0006\bû\u0001\u0010ü\u0001R!\u0010\u0080\u0002\u001a\u00030ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bþ\u0001\u0010§\u0001\u001a\u0006\bÿ\u0001\u0010ç\u0001R \u0010\u0082\u0002\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b»\u0001\u0010§\u0001\u001a\u0006\b\u0081\u0002\u0010©\u0001R!\u0010\u0085\u0002\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0002\u0010§\u0001\u001a\u0006\b\u0084\u0002\u0010µ\u0001R!\u0010\u0088\u0002\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0002\u0010§\u0001\u001a\u0006\b\u0087\u0002\u0010µ\u0001R!\u0010\u008c\u0002\u001a\u00030\u0089\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÐ\u0001\u0010§\u0001\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R!\u0010\u008f\u0002\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008d\u0002\u0010§\u0001\u001a\u0006\b\u008e\u0002\u0010µ\u0001R \u0010\u0092\u0002\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010§\u0001\u001a\u0006\b\u0091\u0002\u0010©\u0001R!\u0010\u0095\u0002\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0002\u0010§\u0001\u001a\u0006\b\u0094\u0002\u0010µ\u0001R!\u0010\u009a\u0002\u001a\u00030\u0096\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010§\u0001\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R!\u0010\u009d\u0002\u001a\u00030\u00ad\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009b\u0002\u0010§\u0001\u001a\u0006\b\u009c\u0002\u0010°\u0001R!\u0010¢\u0002\u001a\u00030\u009e\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0002\u0010§\u0001\u001a\u0006\b \u0002\u0010¡\u0002R \u0010¤\u0002\u001a\u00030\u009e\u00028BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b@\u0010§\u0001\u001a\u0006\b£\u0002\u0010¡\u0002R \u0010©\u0002\u001a\u00030¥\u00028BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\br\u0010¦\u0002\u001a\u0006\b§\u0002\u0010¨\u0002R\u0018\u0010\u00ad\u0002\u001a\u00030ª\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0002\u0010¬\u0002R+\u0010³\u0002\u001a\r ®\u0002*\u0005\u0018\u00010\u0097\u00010\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0002\u0010°\u0002\u001a\u0006\b±\u0002\u0010²\u0002R'\u0010º\u0002\u001a\n\u0012\u0005\u0012\u00030µ\u00020´\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¶\u0002\u0010·\u0002\u001a\u0006\b¸\u0002\u0010¹\u0002¨\u0006¿\u0002"}, d2 = {"Lxj7;", "Lf70;", "Lfk7;", "Ln87;", "Liu6$e;", "Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView$a;", "Lw50;", "", "isAnimateMove", "", "wi", "Lxf8;", "location", "Ltv5;", "icons", "ui", "Landroid/graphics/Bitmap;", "bitmap", "Oh", "", "lat", "lon", "Bi", "Lcom/google/android/gms/maps/model/LatLng;", "newLatLng", "Lm86;", "marker", "Ei", "Lkotlin/Pair;", "", "sizeImage", "locationIcons", "defaultImageDay", "defaultImageNight", "Lkotlin/Function1;", "onImageReady", "vi", "", "markerTitle", "Lfq2;", "defaultIcons", "Ih", "Lh", "Mh", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "Jh", "isEnable", "Ph", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "view", "onViewCreated", "Lqd;", "sender", "K8", "Loc4;", "gameEntryIcons", "f3", "B1", "Lsr6;", "data", "Y4", "visible", "l1", CrashHianalyticsData.TIME, "H6", "ce", "Lrg4;", "googleMap", "p6", "", "Leg7;", "goods", "Vg", "numGoods", "Lhn6;", "costOrder", "T5", "P7", "G2", RemoteMessageConst.Notification.URL, "Ga", "he", "p1", "titleRes", "", "timeArgs", "G4", "(I[Ljava/lang/String;)V", "value", "total", "V7", "x4", "s6", "", "timeRemain", "Cc", "Ja", "e6", "Jc", "Lpq3;", "K6", "Md", "phoneNumber", "ec", "s5", "H1", "available", "u4", "Hc", "Xf", "Z4", "onDestroyView", "Ag", "a3", "J7", "V5", "orderNumber", "orderCreatedTimeTitle", "Ob", "orderType", "address", "C4", "error", "dd", "S9", "wa", "zc", DateTokenConverter.CONVERTER_KEY, "G7", "tableNumber", "r3", "Lik8;", "levelInfo", "Yb", "Y2", "Ff", "v9", "Lgg7;", "T7", "Xd", "unitLocation", "d8", "w2", "Xc", "B6", "onBackPressed", "Las8;", "Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter;", com.huawei.hms.opendevice.c.a, "Las8;", "pi", "()Las8;", "setPresenterProvider$activeorder_release", "(Las8;)V", "presenterProvider", "Lh37;", "Lh37;", "mi", "()Lh37;", "setNotificationsPermission$activeorder_release", "(Lh37;)V", "notificationsPermission", com.huawei.hms.push.e.a, "Lk79;", "Rh", "()Landroid/view/View;", "bottomSheetBehaviorView", "f", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "g", "Qh", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "backButton", "Landroid/widget/TextView;", Image.TYPE_HIGH, "si", "()Landroid/widget/TextView;", "title", "i", "Lrg4;", "deliveryMap", "j", "I", "savedScrollPosition", "k", "Lkotlin/Pair;", "deliveryLocation", "l", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Image.TYPE_MEDIUM, "Ljava/util/ArrayList;", "markersToClear", "n", "Lm86;", "courierMarker", "o", "Lxf8;", "courierPosition", "p", "Lcom/google/android/gms/maps/model/LatLng;", "previousLatLng", "q", "Z", "isMoveCamera", "Landroidx/core/widget/NestedScrollView;", "r", "qi", "()Landroidx/core/widget/NestedScrollView;", "scrollContainer", "Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView;", Image.TYPE_SMALL, "ni", "()Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView;", "orderStateView", "Landroid/webkit/WebView;", "t", "ti", "()Landroid/webkit/WebView;", "webView", "u", "Sh", "cameraSection", "Landroid/widget/Button;", "v", "Th", "()Landroid/widget/Button;", "cancelBtn", "Landroid/view/ViewGroup;", "w", "ei", "()Landroid/view/ViewGroup;", "infoCont", "x", "Zh", "deliveryInfo", "y", "di", "goodsSummaryText", "Lcom/dodopizza/android/view/custom/InfoMessage;", "z", "fi", "()Lcom/dodopizza/android/view/custom/InfoMessage;", "infoMessage", "Landroidx/recyclerview/widget/RecyclerView;", "A", "ci", "()Landroidx/recyclerview/widget/RecyclerView;", "goodsRecycler", "B", "ii", "nakedHandsText", "hi", "mysteryShopperCard", "X", "Xh", "contactSupportButton", "Y", "Vh", "certificateClarification", "Landroid/widget/ViewSwitcher;", "Uh", "()Landroid/widget/ViewSwitcher;", "cancelButtonSector", "S4", "ai", "deliveryToTableInfo", "T4", "li", "niceBonusView", "U4", "ji", "niceBonusGiftDescription", "Landroid/widget/ImageView;", "V4", "ki", "()Landroid/widget/ImageView;", "niceBonusGiftImage", "W4", "gi", "locationButton", "Lcom/airbnb/lottie/LottieAnimationView;", "X4", "ri", "()Lcom/airbnb/lottie/LottieAnimationView;", "stackGameView", "bi", "fullscreenAnimation", "Lis1;", "Lrn5;", "Yh", "()Lis1;", "contactSupportDialog", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "a5", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "kotlin.jvm.PlatformType", "b5", "Lmoxy/ktx/MoxyKtxDelegate;", "oi", "()Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter;", "presenter", "Lcma;", "Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent;", "c5", "Lcma;", "Wh", "()Lcma;", "componentDependenciesRegistry", "<init>", "()V", "d5", "a", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xj7  reason: default package */
/* loaded from: classes.dex */
public final class xj7 extends f70 implements fk7, n87, iu6.e, OrderStateView.a, w50 {
    private final k79 A;
    private final k79 B;
    private final k79 I;
    private final k79 S4;
    private final k79 T4;
    private final k79 U4;
    private final k79 V4;
    private final k79 W4;
    private final k79 X;
    private final k79 X4;
    private final k79 Y;
    private final k79 Y4;
    private final k79 Z;
    private final rn5 Z4;
    private final ViewTreeObserver.OnGlobalLayoutListener a5;
    private final MoxyKtxDelegate b5;
    public as8<OrderSummaryPresenter> c;
    private final cma<OrderSummaryComponent> c5;
    public h37 d;
    private final k79 e;
    private BottomSheetBehavior<View> f;
    private final k79 g;
    private final k79 h;
    private rg4 i;
    private int j;
    private Pair<Double, Double> k;
    private Pair<Double, Double> l;
    private final ArrayList<m86> m;
    private m86 n;
    private xf8 o;
    private LatLng p;
    private boolean q;
    private final k79 r;
    private final k79 s;
    private final k79 t;
    private final k79 u;
    private final k79 v;
    private final k79 w;
    private final k79 x;
    private final k79 y;
    private final k79 z;
    static final /* synthetic */ je5<Object>[] e5 = {bc9.f(new ar8(xj7.class, "bottomSheetBehaviorView", "getBottomSheetBehaviorView()Landroid/view/View;", 0)), bc9.f(new ar8(xj7.class, "backButton", "getBackButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", 0)), bc9.f(new ar8(xj7.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(xj7.class, "scrollContainer", "getScrollContainer()Landroidx/core/widget/NestedScrollView;", 0)), bc9.f(new ar8(xj7.class, "orderStateView", "getOrderStateView()Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView;", 0)), bc9.f(new ar8(xj7.class, "webView", "getWebView()Landroid/webkit/WebView;", 0)), bc9.f(new ar8(xj7.class, "cameraSection", "getCameraSection()Landroid/view/View;", 0)), bc9.f(new ar8(xj7.class, "cancelBtn", "getCancelBtn()Landroid/widget/Button;", 0)), bc9.f(new ar8(xj7.class, "infoCont", "getInfoCont()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(xj7.class, "deliveryInfo", "getDeliveryInfo()Landroid/widget/TextView;", 0)), bc9.f(new ar8(xj7.class, "goodsSummaryText", "getGoodsSummaryText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(xj7.class, "infoMessage", "getInfoMessage()Lcom/dodopizza/android/view/custom/InfoMessage;", 0)), bc9.f(new ar8(xj7.class, "goodsRecycler", "getGoodsRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(xj7.class, "nakedHandsText", "getNakedHandsText()Landroid/widget/Button;", 0)), bc9.f(new ar8(xj7.class, "mysteryShopperCard", "getMysteryShopperCard()Landroid/view/View;", 0)), bc9.f(new ar8(xj7.class, "contactSupportButton", "getContactSupportButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(xj7.class, "certificateClarification", "getCertificateClarification()Landroid/widget/TextView;", 0)), bc9.f(new ar8(xj7.class, "cancelButtonSector", "getCancelButtonSector()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(xj7.class, "deliveryToTableInfo", "getDeliveryToTableInfo()Landroid/widget/TextView;", 0)), bc9.f(new ar8(xj7.class, "niceBonusView", "getNiceBonusView()Landroid/view/View;", 0)), bc9.f(new ar8(xj7.class, "niceBonusGiftDescription", "getNiceBonusGiftDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(xj7.class, "niceBonusGiftImage", "getNiceBonusGiftImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(xj7.class, "locationButton", "getLocationButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", 0)), bc9.f(new ar8(xj7.class, "stackGameView", "getStackGameView()Lcom/airbnb/lottie/LottieAnimationView;", 0)), bc9.f(new ar8(xj7.class, "fullscreenAnimation", "getFullscreenAnimation()Lcom/airbnb/lottie/LottieAnimationView;", 0)), bc9.f(new ar8(xj7.class, "presenter", "getPresenter()Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter;", 0))};
    public static final a d5 = new a(null);

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000bR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u000bR\u0014\u0010!\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u000bR\u0014\u0010\"\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0014\u0010#\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u000bR\u0014\u0010$\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u000e¨\u0006'"}, d2 = {"Lxj7$a;", "", "Lej7;", "data", "Lxj7;", "a", "", "ANCHOR", "F", "", "COURIER_HEIGHT", "I", "", "COURIER_MARKER", "Ljava/lang/String;", "COURIER_WIDTH", "DEFAULT_PEEK_PART", "DEFAULT_SCROLL_X", "DEFAULT_SCROLL_Y", "DELIVERY_MARKER", "", "DURATION_ANIMATION_COURIER", "J", "DURATION_ANIMATION_FAB", "EXTRA_KEY_DATA", "", "LOCATION_OFFSET", "D", "MARKER_HEIGHT", "MARKER_WIDTH", "NICE_BONUS_SECOND_LEVEL", "NICE_BONUS_THIRD_LEVEL", "PADDING_MAP", "SAFE_TOP_ZONE", "SLIDE_OFFSET", "THREE_SECONDS", "UNIT_MARKER", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xj7$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xj7 a(ej7 ej7Var) {
            z65.h(ej7Var, "data");
            return (xj7) y64.d(new xj7(), bi0.c(bi0.d("data", ej7Var)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "bitmap", "", "b", "(Landroid/graphics/Bitmap;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<Bitmap, Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ Pair<Double, Double> b;
        final /* synthetic */ xj7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Pair<Double, Double> pair, xj7 xj7Var) {
            super(1);
            this.a = str;
            this.b = pair;
            this.c = xj7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(xj7 xj7Var, MarkerOptions markerOptions) {
            m86 m86Var;
            z65.h(xj7Var, "this$0");
            z65.h(markerOptions, "$markerOptions");
            rg4 rg4Var = xj7Var.i;
            if (rg4Var != null) {
                m86Var = rg4Var.a(markerOptions);
            } else {
                m86Var = null;
            }
            if (m86Var != null) {
                xj7Var.m.add(m86Var);
            }
        }

        public final void b(Bitmap bitmap) {
            androidx.fragment.app.d activity;
            z65.h(bitmap, "bitmap");
            final MarkerOptions C = new MarkerOptions().J(this.a).G(new LatLng(this.b.c().doubleValue(), this.b.d().doubleValue())).h(0.5f, 0.5f).C(tb0.b(bitmap));
            z65.g(C, "icon(...)");
            if (this.c.isAdded() && (activity = this.c.getActivity()) != null) {
                final xj7 xj7Var = this.c;
                activity.runOnUiThread(new Runnable() { // from class: yj7
                    @Override // java.lang.Runnable
                    public final void run() {
                        xj7.b.c(xj7.this, C);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            b(bitmap);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"xj7$c", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", com.huawei.hms.opendevice.c.a, "", "slideOffset", "b", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xj7$c */
    /* loaded from: classes.dex */
    public static final class c extends BottomSheetBehavior.f {
        final /* synthetic */ ValueAnimator a;
        final /* synthetic */ xj7 b;

        c(ValueAnimator valueAnimator, xj7 xj7Var) {
            this.a = valueAnimator;
            this.b = xj7Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f) {
            z65.h(view, "bottomSheet");
            this.a.setCurrentPlayTime(((float) 300) * f);
            if (f > 0.9d) {
                this.b.gi().setVisibility(8);
            } else if (this.b.q) {
                this.b.gi().setVisibility(0);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i) {
            z65.h(view, "bottomSheet");
            if (i != 3) {
                this.b.Ph(true);
                return;
            }
            this.a.start();
            this.b.Ph(false);
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent;", "a", "()Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<OrderSummaryComponent> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderSummaryComponent invoke() {
            OrderSummaryComponent.b a = OrderSummaryComponent.a.a();
            Bundle arguments = xj7.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof ej7)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                return a.a((ej7) obj, (OrderSummaryFeatureDependencies) xj7.this.getComponentDependenciesRegistry().a(bc9.b(OrderSummaryFeatureDependencies.class)));
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lis1;", "a", "()Lis1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<is1> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderSummaryMapFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: xj7$e$a */
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
        /* compiled from: OrderSummaryMapFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: xj7$e$b */
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

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final is1 invoke() {
            Context requireContext = xj7.this.requireContext();
            z65.g(requireContext, "requireContext(...)");
            OrderSummaryPresenter oi = xj7.this.oi();
            z65.g(oi, "access$getPresenter(...)");
            a aVar = new a(oi);
            OrderSummaryPresenter oi2 = xj7.this.oi();
            z65.g(oi2, "access$getPresenter(...)");
            return new is1(requireContext, aVar, new b(oi2));
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"xj7$f", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xj7$f */
    /* loaded from: classes.dex */
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view = xj7.this.getView();
            if (view != null) {
                xj7 xj7Var = xj7.this;
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                xj7Var.f = BottomSheetBehavior.B(xj7Var.Rh());
                BottomSheetBehavior bottomSheetBehavior = xj7Var.f;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.b0(view.getHeight() / 3);
                }
                BottomSheetBehavior bottomSheetBehavior2 = xj7Var.f;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.f0(4);
                }
                BottomSheetBehavior bottomSheetBehavior3 = xj7Var.f;
                if (bottomSheetBehavior3 != null) {
                    xj7Var.Jh(bottomSheetBehavior3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "bitmap", "", "a", "(Landroid/graphics/Bitmap;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$g */
    /* loaded from: classes.dex */
    public static final class g extends ej5 implements Function1<Bitmap, Unit> {
        final /* synthetic */ xf8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(xf8 xf8Var) {
            super(1);
            this.b = xf8Var;
        }

        public final void a(Bitmap bitmap) {
            z65.h(bitmap, "bitmap");
            xj7.this.Oh(this.b, bitmap);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            a(bitmap);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J2\u0010\u0004\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J6\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"xj7$h", "Lvi9;", "Landroid/graphics/Bitmap;", "Lcom/bumptech/glide/load/engine/GlideException;", com.huawei.hms.push.e.a, "", "model", "Ln6b;", "target", "", "isFirstResource", "resource", "Ldl2;", "dataSource", "a", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xj7$h */
    /* loaded from: classes.dex */
    public static final class h implements vi9<Bitmap> {
        final /* synthetic */ int b;
        final /* synthetic */ Pair<Integer, Integer> c;
        final /* synthetic */ Function1<Bitmap, Unit> d;

        /* JADX WARN: Multi-variable type inference failed */
        h(int i, Pair<Integer, Integer> pair, Function1<? super Bitmap, Unit> function1) {
            this.b = i;
            this.c = pair;
            this.d = function1;
        }

        @Override // defpackage.vi9
        /* renamed from: a */
        public boolean f(Bitmap bitmap, Object obj, n6b<Bitmap> n6bVar, dl2 dl2Var, boolean z) {
            z65.h(bitmap, "resource");
            z65.h(obj, "model");
            z65.h(n6bVar, "target");
            z65.h(dl2Var, "dataSource");
            this.d.invoke(bitmap);
            return true;
        }

        @Override // defpackage.vi9
        public boolean e(GlideException glideException, Object obj, n6b<Bitmap> n6bVar, boolean z) {
            z65.h(n6bVar, "target");
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(xj7.this.getResources(), this.b), this.c.c().intValue(), this.c.d().intValue(), false);
            z65.g(createScaledBitmap, "createScaledBitmap(...)");
            this.d.invoke(createScaledBitmap);
            return true;
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"xj7$i", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xj7$i */
    /* loaded from: classes.dex */
    public static final class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animation");
            un3.d(xj7.this.bi(), 0L, 1, null);
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xj7$j */
    /* loaded from: classes.dex */
    /* synthetic */ class j extends m94 implements Function1<com.dodopizza.controlling.feature.orderrating.presentation.c, Unit> {
        j(Object obj) {
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

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$k */
    /* loaded from: classes.dex */
    static final class k extends ej5 implements Function1<View, Unit> {
        k() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            xj7.this.oi().Z();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$l */
    /* loaded from: classes.dex */
    static final class l extends ej5 implements Function1<View, Unit> {
        l() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            xj7.this.oi().V();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$m */
    /* loaded from: classes.dex */
    static final class m extends ej5 implements Function1<View, Unit> {
        m() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            xj7.this.oi().Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$n */
    /* loaded from: classes.dex */
    static final class n extends ej5 implements Function1<View, Unit> {
        n() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            xj7.this.oi().S();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$o */
    /* loaded from: classes.dex */
    static final class o extends ej5 implements Function1<View, Unit> {
        o() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            xj7.this.oi().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$p */
    /* loaded from: classes.dex */
    static final class p extends ej5 implements Function1<View, Unit> {
        p() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            xj7.this.wi(true);
            xj7.this.gi().setVisibility(8);
            xj7.this.q = false;
            xj7.this.oi().W();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$q */
    /* loaded from: classes.dex */
    static final class q extends ej5 implements Function1<View, Unit> {
        q() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            xj7.this.oi().a0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$r */
    /* loaded from: classes.dex */
    static final class r extends ej5 implements Function0<OrderSummaryPresenter> {
        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderSummaryPresenter invoke() {
            return xj7.this.pi().get();
        }
    }

    /* compiled from: OrderSummaryMapFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryMapFragment$requestNotificationsPermission$1", f = "OrderSummaryMapFragment.kt", l = {269}, m = "invokeSuspend")
    /* renamed from: xj7$s */
    /* loaded from: classes.dex */
    static final class s extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ qd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(qd qdVar, cv1<? super s> cv1Var) {
            super(2, cv1Var);
            this.c = qdVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new s(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((s) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                h37 mi = xj7.this.mi();
                androidx.fragment.app.d requireActivity = xj7.this.requireActivity();
                z65.g(requireActivity, "requireActivity(...)");
                qd qdVar = this.c;
                OrderSummaryPresenter oi = xj7.this.oi();
                this.a = 1;
                if (mi.h(requireActivity, qdVar, oi, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xj7$t */
    /* loaded from: classes.dex */
    public static final class t extends ej5 implements Function1<Object, Boolean> {
        public static final t a = new t();

        public t() {
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
    /* renamed from: xj7$u */
    /* loaded from: classes.dex */
    public static final class u extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final u a = new u();

        public u() {
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

    public xj7() {
        super(rz8.fragment_order_map);
        rn5 b2;
        this.e = kb0.e(this, ux8.o);
        this.g = kb0.e(this, ux8.n);
        this.h = kb0.e(this, ux8.n0);
        Double valueOf = Double.valueOf(0.0d);
        this.k = new Pair<>(valueOf, valueOf);
        this.l = new Pair<>(valueOf, valueOf);
        this.m = new ArrayList<>();
        this.r = kb0.e(this, ux8.i0);
        this.s = kb0.e(this, ux8.order_state);
        this.t = kb0.e(this, ux8.web_view);
        this.u = kb0.e(this, ux8.camera_section);
        this.v = kb0.e(this, ux8.q);
        this.w = kb0.e(this, ux8.info_container);
        this.x = kb0.e(this, ux8.delivery_info);
        this.y = kb0.e(this, ux8.order_summary_goods_summary);
        this.z = kb0.e(this, ux8.I);
        this.A = kb0.e(this, ux8.G);
        this.B = kb0.e(this, ux8.why_naked_hands);
        this.I = kb0.e(this, ux8.M);
        this.X = kb0.e(this, ux8.contact_support_button);
        this.Y = kb0.e(this, ux8.certificate_clarification);
        this.Z = kb0.e(this, ux8.order_summary_button_switcher);
        this.S4 = kb0.e(this, ux8.delivery_to_table_info);
        this.T4 = kb0.e(this, ux8.nice_bonus_view);
        this.U4 = kb0.e(this, ux8.nice_bonus_description);
        this.V4 = kb0.e(this, ux8.nice_bonus_image);
        this.W4 = kb0.e(this, ux8.delivery_location_button);
        this.X4 = kb0.e(this, ux8.order_summary_map_game_view);
        this.Y4 = kb0.e(this, ux8.fullscreen_animation);
        b2 = yn5.b(new e());
        this.Z4 = b2;
        this.a5 = new f();
        r rVar = new r();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.b5 = new MoxyKtxDelegate(mvpDelegate, OrderSummaryPresenter.class.getName() + ".presenter", rVar);
        this.c5 = new cma<>(eu2.d(this), bc9.b(OrderSummaryComponent.class), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Ai(xj7 xj7Var, View view, MotionEvent motionEvent) {
        z65.h(xj7Var, "this$0");
        xj7Var.bi().w();
        un3.d(xj7Var.bi(), 0L, 1, null);
        return false;
    }

    private final void Bi(double d2, double d3, final Bitmap bitmap) {
        final rg4 rg4Var = this.i;
        if (rg4Var != null) {
            final LatLng latLng = new LatLng(d2, d3);
            androidx.fragment.app.d activity = getActivity();
            if (activity != null) {
                activity.runOnUiThread(new Runnable() { // from class: uj7
                    @Override // java.lang.Runnable
                    public final void run() {
                        xj7.Ci(xj7.this, latLng, bitmap, rg4Var);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ci(final xj7 xj7Var, LatLng latLng, Bitmap bitmap, rg4 rg4Var) {
        LatLng latLng2;
        LatLng latLng3;
        z65.h(xj7Var, "this$0");
        z65.h(latLng, "$markerPosition");
        z65.h(bitmap, "$bitmap");
        z65.h(rg4Var, "$googleMap");
        if (xj7Var.isAdded()) {
            m86 m86Var = xj7Var.n;
            if (m86Var == null) {
                MarkerOptions h2 = new MarkerOptions().J("courier").G(latLng).C(tb0.b(bitmap)).h(0.5f, 0.5f);
                z65.g(h2, "anchor(...)");
                xj7Var.n = rg4Var.a(h2);
                return;
            }
            if (m86Var != null) {
                latLng2 = m86Var.a();
            } else {
                latLng2 = null;
            }
            if (!z65.c(latLng2, latLng)) {
                bm5 bm5Var = new bm5();
                Object[] objArr = new Object[2];
                m86 m86Var2 = xj7Var.n;
                if (m86Var2 == null || (latLng3 = m86Var2.a()) == null) {
                    latLng3 = new LatLng(0.0d, 0.0d);
                }
                objArr[0] = latLng3;
                objArr[1] = latLng;
                ValueAnimator ofObject = ValueAnimator.ofObject(bm5Var, objArr);
                ofObject.setDuration(1000L);
                ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wj7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        xj7.Di(xj7.this, valueAnimator);
                    }
                });
                ofObject.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Di(xj7 xj7Var, ValueAnimator valueAnimator) {
        z65.h(xj7Var, "this$0");
        z65.h(valueAnimator, "valueAnimator");
        m86 m86Var = xj7Var.n;
        if (m86Var != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            z65.f(animatedValue, "null cannot be cast to non-null type com.google.android.gms.maps.model.LatLng");
            m86Var.h((LatLng) animatedValue);
            LatLng a2 = m86Var.a();
            z65.g(a2, "getPosition(...)");
            xj7Var.Ei(a2, m86Var);
        }
    }

    private final void Ei(LatLng latLng, m86 m86Var) {
        LatLng latLng2 = this.p;
        if (latLng2 != null) {
            double d2 = latLng.b;
            z65.e(latLng2);
            double d3 = d2 - latLng2.b;
            double d4 = latLng.a;
            LatLng latLng3 = this.p;
            z65.e(latLng3);
            m86Var.i((float) Math.toDegrees(Math.atan2(d3, d4 - latLng3.a)));
        }
        this.p = latLng;
    }

    private final void Ih(String str, Pair<Double, Double> pair, Pair<Integer, Integer> pair2, tv5 tv5Var, fq2 fq2Var) {
        vi(pair2, tv5Var, fq2Var.b(), fq2Var.a(), new b(str, pair, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jh(BottomSheetBehavior<View> bottomSheetBehavior) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(300L);
        bottomSheetBehavior.s(new c(ofFloat, this));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pj7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                xj7.Kh(xj7.this, valueAnimator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kh(xj7 xj7Var, ValueAnimator valueAnimator) {
        z65.h(xj7Var, "this$0");
        z65.h(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        z65.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        xj7Var.gi().setAlpha(((Float) animatedValue).floatValue());
    }

    private final void Lh() {
        ci().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        ci().setNestedScrollingEnabled(false);
    }

    @SuppressLint({"ClickableViewAccessibility", "SetJavaScriptEnabled"})
    private final void Mh() {
        ti().setLayerType(2, null);
        ti().getSettings().setJavaScriptEnabled(true);
        ti().setOnTouchListener(new View.OnTouchListener() { // from class: vj7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean Nh;
                Nh = xj7.Nh(xj7.this, view, motionEvent);
                return Nh;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Nh(xj7 xj7Var, View view, MotionEvent motionEvent) {
        z65.h(xj7Var, "this$0");
        if (motionEvent.getAction() == 1) {
            xj7Var.oi().P();
        }
        return view.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Oh(xf8 xf8Var, Bitmap bitmap) {
        Double a2 = xf8Var.a();
        if (a2 != null) {
            double doubleValue = a2.doubleValue();
            Double b2 = xf8Var.b();
            if (b2 != null) {
                Bi(doubleValue, b2.doubleValue(), bitmap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ph(boolean z) {
        aqb i2;
        aqb aqbVar;
        aqb i3;
        if (z) {
            rg4 rg4Var = this.i;
            if (rg4Var != null && (i3 = rg4Var.i()) != null) {
                i3.a(true);
            }
            rg4 rg4Var2 = this.i;
            if (rg4Var2 != null) {
                aqbVar = rg4Var2.i();
            } else {
                aqbVar = null;
            }
            if (aqbVar != null) {
                aqbVar.c(false);
                return;
            }
            return;
        }
        rg4 rg4Var3 = this.i;
        if (rg4Var3 != null && (i2 = rg4Var3.i()) != null) {
            i2.a(false);
        }
    }

    private final FloatingActionButton Qh() {
        return (FloatingActionButton) this.g.a(this, e5[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Rh() {
        return (View) this.e.a(this, e5[0]);
    }

    private final View Sh() {
        return (View) this.u.a(this, e5[6]);
    }

    private final Button Th() {
        return (Button) this.v.a(this, e5[7]);
    }

    private final ViewSwitcher Uh() {
        return (ViewSwitcher) this.Z.a(this, e5[17]);
    }

    private final TextView Vh() {
        return (TextView) this.Y.a(this, e5[16]);
    }

    private final TextView Xh() {
        return (TextView) this.X.a(this, e5[15]);
    }

    private final is1 Yh() {
        return (is1) this.Z4.getValue();
    }

    private final TextView Zh() {
        return (TextView) this.x.a(this, e5[9]);
    }

    private final TextView ai() {
        return (TextView) this.S4.a(this, e5[18]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LottieAnimationView bi() {
        return (LottieAnimationView) this.Y4.a(this, e5[24]);
    }

    private final RecyclerView ci() {
        return (RecyclerView) this.A.a(this, e5[12]);
    }

    private final TextView di() {
        return (TextView) this.y.a(this, e5[10]);
    }

    private final ViewGroup ei() {
        return (ViewGroup) this.w.a(this, e5[8]);
    }

    private final InfoMessage fi() {
        return (InfoMessage) this.z.a(this, e5[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FloatingActionButton gi() {
        return (FloatingActionButton) this.W4.a(this, e5[22]);
    }

    private final View hi() {
        return (View) this.I.a(this, e5[14]);
    }

    private final Button ii() {
        return (Button) this.B.a(this, e5[13]);
    }

    private final TextView ji() {
        return (TextView) this.U4.a(this, e5[20]);
    }

    private final ImageView ki() {
        return (ImageView) this.V4.a(this, e5[21]);
    }

    private final View li() {
        return (View) this.T4.a(this, e5[19]);
    }

    private final OrderStateView ni() {
        return (OrderStateView) this.s.a(this, e5[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderSummaryPresenter oi() {
        return (OrderSummaryPresenter) this.b5.getValue(this, e5[25]);
    }

    private final NestedScrollView qi() {
        return (NestedScrollView) this.r.a(this, e5[3]);
    }

    private final LottieAnimationView ri() {
        return (LottieAnimationView) this.X4.a(this, e5[23]);
    }

    private final TextView si() {
        return (TextView) this.h.a(this, e5[2]);
    }

    private final WebView ti() {
        return (WebView) this.t.a(this, e5[5]);
    }

    private final void ui(xf8 xf8Var, tv5 tv5Var) {
        vi(new Pair<>(240, 240), tv5Var, jx8.courier_day, jx8.courier_night, new g(xf8Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 > 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void vi(kotlin.Pair<java.lang.Integer, java.lang.Integer> r3, defpackage.tv5 r4, int r5, int r6, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> r7) {
        /*
            r2 = this;
            android.content.Context r0 = r2.requireContext()
            java.lang.String r1 = "requireContext(...)"
            defpackage.z65.g(r0, r1)
            boolean r0 = defpackage.vl7.a(r0)
            if (r0 == 0) goto L10
            r5 = r6
        L10:
            if (r4 == 0) goto L38
            java.lang.String r6 = r4.a()
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r6.length()
            if (r0 <= 0) goto L20
            goto L21
        L20:
            r6 = r1
        L21:
            if (r6 != 0) goto L36
            java.lang.String r4 = r4.c()
            int r6 = r4.length()
            if (r6 <= 0) goto L2e
            r1 = r4
        L2e:
            if (r1 != 0) goto L35
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            goto L36
        L35:
            r6 = r1
        L36:
            if (r6 != 0) goto L3c
        L38:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
        L3c:
            android.content.Context r4 = r2.requireContext()
            com.bumptech.glide.h r4 = com.bumptech.glide.b.t(r4)
            com.bumptech.glide.g r4 = r4.f()
            com.bumptech.glide.g r4 = r4.L0(r6)
            g80 r4 = r4.i(r5)
            com.bumptech.glide.g r4 = (com.bumptech.glide.g) r4
            java.lang.Object r6 = r3.c()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r0 = r3.d()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            g80 r4 = r4.Z(r6, r0)
            com.bumptech.glide.g r4 = (com.bumptech.glide.g) r4
            xj7$h r6 = new xj7$h
            r6.<init>(r5, r3, r7)
            com.bumptech.glide.g r3 = r4.J0(r6)
            r3.R0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj7.vi(kotlin.Pair, tv5, int, int, kotlin.jvm.functions.Function1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wi(boolean z) {
        int i2;
        Double a2;
        LatLngBounds.a b2 = LatLngBounds.h().b(new LatLng(this.k.c().doubleValue(), this.k.d().doubleValue())).b(new LatLng(this.l.c().doubleValue(), this.l.d().doubleValue()));
        z65.g(b2, "include(...)");
        xf8 xf8Var = this.o;
        if (xf8Var != null && (a2 = xf8Var.a()) != null) {
            double doubleValue = a2.doubleValue();
            Double b3 = xf8Var.b();
            if (b3 != null) {
                b2.b(new LatLng(doubleValue, b3.doubleValue()));
            }
        }
        LatLngBounds a3 = b2.a();
        z65.g(a3, "build(...)");
        BottomSheetBehavior<View> bottomSheetBehavior = this.f;
        if (bottomSheetBehavior != null) {
            i2 = bottomSheetBehavior.F();
        } else {
            i2 = 0;
        }
        Rect rect = new Rect(0, 250, 0, i2);
        um0 a4 = vm0.a(a3, 100);
        z65.g(a4, "newLatLngBounds(...)");
        rg4 rg4Var = this.i;
        if (rg4Var != null) {
            rg4Var.s(rect.left, rect.top, rect.right, rect.bottom);
        }
        rg4 rg4Var2 = this.i;
        if (rg4Var2 != null) {
            if (z) {
                rg4Var2.b(a4);
            } else {
                rg4Var2.j(a4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xi(xj7 xj7Var, int i2) {
        z65.h(xj7Var, "this$0");
        if (i2 == 1) {
            xj7Var.gi().setVisibility(0);
            xj7Var.q = true;
            xj7Var.oi().X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean yi(xj7 xj7Var, m86 m86Var) {
        z65.h(xj7Var, "this$0");
        z65.h(m86Var, "marker");
        xj7Var.oi().Y(m86Var);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zi(xj7 xj7Var) {
        z65.h(xj7Var, "this$0");
        xj7Var.qi().scrollTo(0, xj7Var.j);
    }

    @Override // defpackage.fk7
    public void Ag() {
        Uh().setDisplayedChild(1);
    }

    @Override // defpackage.fk7
    public void B1() {
        un3.e(ri());
    }

    @Override // defpackage.fk7
    public void B6() {
        un3.k(bi());
        bi().x();
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
        TextView Zh = Zh();
        pza pzaVar = pza.a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{str2, str}, 2));
        z65.g(format, "format(...)");
        Zh.setText(format);
    }

    @Override // defpackage.fk7
    public void Cc(long j2) {
        ni().setTimer(j2);
    }

    @Override // defpackage.fk7
    public void Ff() {
        this.j = qi().getScrollY();
    }

    @Override // defpackage.fk7
    public void G2() {
        un3.e(ii());
    }

    @Override // defpackage.fk7
    public void G4(int i2, String[] strArr) {
        z65.h(strArr, "timeArgs");
        OrderStateView ni = ni();
        String string = getString(i2, Arrays.copyOf(strArr, strArr.length));
        z65.g(string, "getString(...)");
        ni.setTitle(string);
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
        if (!z65.c(str, ti().getUrl())) {
            ti().loadUrl(str);
        }
    }

    @Override // defpackage.fk7
    public void H1() {
        un3.e(Xh());
    }

    @Override // defpackage.fk7
    public void H6(String str) {
        z65.h(str, CrashHianalyticsData.TIME);
        un3.k(Vh());
        Vh().setText(getString(d19.certificate_clarification, str));
    }

    @Override // defpackage.fk7
    public void Hc(boolean z) {
        Yh().k(z);
    }

    @Override // defpackage.fk7
    public void J7() {
        un3.k(Uh());
    }

    @Override // defpackage.fk7
    public void Ja() {
        OrderStateView ni = ni();
        String string = getString(d19.sorry_for_late_on_delivery);
        z65.g(string, "getString(...)");
        ni.setSubTitle(string);
    }

    @Override // com.dodopizza.activeorder.feature.orderstate.presentation.OrderStateView.a
    public void Jc() {
        oi().c0();
    }

    @Override // defpackage.fk7
    public void K6(pq3 pq3Var) {
        z65.h(pq3Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        androidx.fragment.app.p p2 = childFragmentManager.p();
        z65.g(p2, "beginTransaction()");
        u8c.a(p2, ux8.D, pq3Var, o19.OrderSummaryTheme);
        p2.l();
    }

    @Override // defpackage.fk7
    public void K8(qd qdVar) {
        z65.h(qdVar, "sender");
        op5 viewLifecycleOwner = getViewLifecycleOwner();
        z65.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        sh0.d(pp5.a(viewLifecycleOwner), null, null, new s(qdVar, null), 3, null);
    }

    @Override // defpackage.fk7
    public void Md() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        androidx.fragment.app.p p2 = childFragmentManager.p();
        z65.g(p2, "beginTransaction()");
        Fragment k0 = getChildFragmentManager().k0(ux8.D);
        if (k0 != null) {
            p2.t(k0);
        }
        p2.l();
    }

    @Override // defpackage.fk7
    public void Ob(int i2, String str) {
        z65.h(str, "orderCreatedTimeTitle");
        si().setText(getResources().getString(d19.order_num_title_with_time, Integer.valueOf(i2), str));
    }

    @Override // defpackage.fk7
    public void P7() {
        un3.k(ii());
    }

    @Override // defpackage.iu6.e
    public void S9() {
        oi().R();
    }

    @Override // defpackage.fk7
    public void T5(int i2, hn6 hn6Var) {
        z65.h(hn6Var, "costOrder");
        String quantityString = getResources().getQuantityString(h09.a, i2, Integer.valueOf(i2), un6.b(hn6Var));
        z65.g(quantityString, "getQuantityString(...)");
        di().setText(quantityString);
    }

    @Override // defpackage.fk7
    public void T7(gg7 gg7Var, tv5 tv5Var) {
        z65.h(gg7Var, "location");
        this.k = new Pair<>(Double.valueOf(gg7Var.a()), Double.valueOf(gg7Var.b()));
        Ih("home", new Pair<>(Double.valueOf(gg7Var.a()), Double.valueOf(gg7Var.b())), new Pair<>(270, 270), tv5Var, new fq2(jx8.house_day, jx8.house_night));
    }

    @Override // defpackage.fk7
    public void V5() {
        un3.e(Uh());
    }

    @Override // defpackage.fk7
    public void V7(int i2, int i3) {
        ni().f(i2, i3);
    }

    @Override // defpackage.fk7
    public void Vg(List<eg7> list) {
        z65.h(list, "goods");
        ci().setAdapter(new k6.a(new k6(list), t.a, new lj7(), u.a).b().d());
    }

    @Override // defpackage.f70, defpackage.lm1
    /* renamed from: Wh */
    public cma<OrderSummaryComponent> getComponentDependenciesRegistry() {
        return this.c5;
    }

    @Override // defpackage.fk7
    public void Xc(boolean z) {
        if (!this.q) {
            wi(z);
        }
    }

    @Override // defpackage.fk7
    public void Xd(gg7 gg7Var, tv5 tv5Var) {
        z65.h(gg7Var, "location");
        this.l = new Pair<>(Double.valueOf(gg7Var.a()), Double.valueOf(gg7Var.b()));
        Ih("pizzeria", new Pair<>(Double.valueOf(gg7Var.a()), Double.valueOf(gg7Var.b())), new Pair<>(270, 270), tv5Var, new fq2(jx8.pizza_day, jx8.pizza_night));
    }

    @Override // defpackage.fk7
    public void Xf() {
        Yh().show();
    }

    @Override // defpackage.fk7
    public void Y2() {
        un3.e(li());
    }

    @Override // defpackage.fk7
    public void Y4(sr6 sr6Var) {
        z65.h(sr6Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        androidx.fragment.app.p p2 = childFragmentManager.p();
        z65.g(p2, "beginTransaction()");
        com.dodopizza.controlling.feature.mysteryshoppercard.presentation.c.a(p2, ux8.N, sr6Var, o19.OrderSummaryTheme);
        p2.l();
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
        ki().setImageDrawable(iu1.e(requireContext(), i2));
        ji().setText(ik8Var.a());
        un3.k(li());
    }

    @Override // defpackage.fk7
    public void Z4() {
        Yh().hide();
    }

    @Override // defpackage.fk7
    public void a3() {
        Uh().setDisplayedChild(0);
    }

    @Override // defpackage.fk7
    public void ce() {
        un3.e(Vh());
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
        Ih("courier", new Pair<>(Double.valueOf(gg7Var.a() - 1.0E-4d), Double.valueOf(gg7Var.b() + 1.0E-4d)), new Pair<>(240, 240), tv5Var, new fq2(jx8.courier_stand_day, jx8.courier_stand_night));
    }

    @Override // defpackage.fk7
    public void dd(int i2) {
        fi().h(i2, 3000);
    }

    @Override // defpackage.fk7
    public void e6() {
        OrderStateView ni = ni();
        String string = getString(d19.sorry_for_late_in_restaurant);
        z65.g(string, "getString(...)");
        ni.setSubTitle(string);
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
        String b2;
        z65.h(oc4Var, "gameEntryIcons");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        if (vl7.a(requireContext)) {
            b2 = oc4Var.a();
        } else {
            b2 = oc4Var.b();
        }
        ri().setAnimationFromUrl(b2);
        ri().x();
        un3.j(ri(), 0L, 1, null);
    }

    @Override // defpackage.fk7
    public void he() {
        un3.k(Sh());
    }

    @Override // defpackage.fk7
    public void l1(boolean z) {
        un3.o(hi(), z);
    }

    public final h37 mi() {
        h37 h37Var = this.d;
        if (h37Var != null) {
            return h37Var;
        }
        z65.z("notificationsPermission");
        return null;
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        oi().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        getComponentDependenciesRegistry().b().M2(this);
        super.onCreate(bundle);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        ti().stopLoading();
        ti().destroy();
        View view = getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.a5);
        }
        super.onDestroyView();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Lh();
        Mh();
        qi().post(new Runnable() { // from class: qj7
            @Override // java.lang.Runnable
            public final void run() {
                xj7.zi(xj7.this);
            }
        });
        oma.a(ii(), new k());
        oma.a(Xh(), new l());
        oma.a(Th(), new m());
        oma.a(ei(), new n());
        oma.a(Qh(), new o());
        oma.a(gi(), new p());
        oma.a(ri(), new q());
        bi().setOnTouchListener(new View.OnTouchListener() { // from class: rj7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean Ai;
                Ai = xj7.Ai(xj7.this, view2, motionEvent);
                return Ai;
            }
        });
        bi().i(new i());
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.a5);
        Fragment k0 = getChildFragmentManager().k0(ux8.active_order_map_container);
        z65.f(k0, "null cannot be cast to non-null type com.google.android.gms.maps.SupportMapFragment");
        ((SupportMapFragment) k0).gh(this);
        OrderStateView ni = ni();
        String string = getString(d19.order_countdown_time_format);
        z65.g(string, "getString(...)");
        ni.setTimerFormatter(new ol6(string));
        ni().setTimerCallback(this);
        OrderSummaryPresenter oi = oi();
        z65.g(oi, "<get-presenter>(...)");
        u8c.b(this, new j(oi));
    }

    @Override // defpackage.fk7
    public void p1() {
        un3.e(Sh());
    }

    @Override // defpackage.n87
    public void p6(rg4 rg4Var) {
        z65.h(rg4Var, "googleMap");
        rg4Var.l(MapStyleOptions.h(requireContext(), m09.map_style));
        rg4Var.i().c(false);
        rg4Var.n(new rg4.d() { // from class: sj7
            @Override // defpackage.rg4.d
            public final void a(int i2) {
                xj7.xi(xj7.this, i2);
            }
        });
        rg4Var.q(new rg4.g() { // from class: tj7
            @Override // defpackage.rg4.g
            public final boolean a(m86 m86Var) {
                boolean yi;
                yi = xj7.yi(xj7.this, m86Var);
                return yi;
            }
        });
        this.i = rg4Var;
    }

    public final as8<OrderSummaryPresenter> pi() {
        as8<OrderSummaryPresenter> as8Var = this.c;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.fk7
    public void r3(int i2) {
        pza pzaVar = pza.a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{getString(d19.will_bring_to_the_table), Integer.valueOf(i2)}, 2));
        z65.g(format, "format(...)");
        ai().setText(format);
        un3.k(ai());
    }

    @Override // defpackage.fk7
    public void s5() {
        un3.k(Xh());
    }

    @Override // defpackage.fk7
    public void s6() {
        ni().e();
    }

    @Override // defpackage.fk7
    public void u4(boolean z) {
        Yh().l(z);
    }

    @Override // defpackage.fk7
    public void v9() {
        Iterator<m86> it = this.m.iterator();
        while (it.hasNext()) {
            m86 next = it.next();
            if (next != null) {
                next.f();
            }
        }
    }

    @Override // defpackage.fk7
    public void w2(xf8 xf8Var, tv5 tv5Var) {
        z65.h(xf8Var, "location");
        this.o = xf8Var;
        ui(xf8Var, tv5Var);
    }

    @Override // defpackage.fk7
    public void wa() {
        fi().j(d19.draft_rating_info_message, 3000);
    }

    @Override // defpackage.fk7
    public void x4() {
        ni().g();
    }

    @Override // defpackage.fk7
    public void zc() {
        fi().h(d19.error_rating_info_message, 3000);
    }
}
