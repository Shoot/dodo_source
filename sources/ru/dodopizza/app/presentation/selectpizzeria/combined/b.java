package ru.dodopizza.app.presentation.selectpizzeria.combined;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.pickup.presentation.PickupPizzeriaVH;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c5c;
import defpackage.cw5;
import defpackage.k6;
import defpackage.o7a;
import defpackage.qv5;
import defpackage.tj1;
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
import org.osmdroid.util.BoundingBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.selectpizzeria.PizzeriaCard;
import ru.dodopizza.app.presentation.selectpizzeria.PizzeriasMap;
import ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies;
import ru.dodopizza.app.presentation.selectpizzeria.combined.a;
import ru.dodopizza.app.presentation.selectpizzeria.combined.b;
import ru.dodopizza.app.presentation.selectpizzeria.combined.d;
import ru.dodopizza.app.presentation.selectpizzeria.combined.filters.views.PizzeriaFilterViewHolder;
/* compiled from: SelectPizzeriaCombinedFragment.kt */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002º\u0001B\t¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002J\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\n*\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u001a\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u001eH\u0014J\b\u0010&\u001a\u00020%H\u0014J\u001a\u0010)\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J(\u00100\u001a\u00020\u00132\u0006\u0010*\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0011H\u0016J\u0010\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u000201H\u0016J\b\u00104\u001a\u00020\u0013H\u0016J\u0010\u00107\u001a\u00020\u00132\u0006\u00106\u001a\u000205H\u0016J\u0010\u00109\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0007H\u0016J\u0010\u0010;\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0011H\u0016J\b\u0010<\u001a\u00020\u0011H\u0016J\u0010\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020=H\u0016J\b\u0010@\u001a\u00020\u0013H\u0016J\u0010\u0010B\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u0011H\u0016J\"\u0010G\u001a\u00020\u00132\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020%2\b\u0010F\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010H\u001a\u00020\u00132\u0006\u00106\u001a\u000205H\u0016J\b\u0010I\u001a\u00020\u0013H\u0016J\u0010\u0010K\u001a\u00020\u00132\u0006\u0010J\u001a\u000201H\u0016J\u0010\u0010L\u001a\u00020\u00132\u0006\u0010J\u001a\u000201H\u0016J\b\u0010M\u001a\u00020\u0013H\u0016J\b\u0010N\u001a\u00020\u0013H\u0016R\u001c\u0010R\u001a\n P*\u0004\u0018\u00010O0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010QR\u001b\u0010W\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010T\u001a\u0004\bY\u0010VR\u001b\u0010]\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010T\u001a\u0004\b\\\u0010VR\u001b\u0010`\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010T\u001a\u0004\b_\u0010VR\u001b\u0010c\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010T\u001a\u0004\bb\u0010VR\u001b\u0010h\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010T\u001a\u0004\bf\u0010gR\u001b\u0010j\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010T\u001a\u0004\bi\u0010gR\u001b\u0010m\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010T\u001a\u0004\bl\u0010VR\u001b\u0010p\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010T\u001a\u0004\bo\u0010VR\u001b\u0010u\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010T\u001a\u0004\bs\u0010tR\u001b\u0010x\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010T\u001a\u0004\bw\u0010VR\u001b\u0010|\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010T\u001a\u0004\bz\u0010{R\u001b\u0010\u007f\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010T\u001a\u0004\b~\u0010VR\u001e\u0010\u0082\u0001\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010T\u001a\u0005\b\u0081\u0001\u0010VR\u001e\u0010\u0085\u0001\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010T\u001a\u0005\b\u0084\u0001\u0010VR\u001e\u0010\u0088\u0001\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010T\u001a\u0005\b\u0087\u0001\u0010VR\u001e\u0010\u008b\u0001\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010T\u001a\u0005\b\u008a\u0001\u0010VR\u001e\u0010\u008e\u0001\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010T\u001a\u0005\b\u008d\u0001\u0010VR\u001e\u0010\u0091\u0001\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010T\u001a\u0005\b\u0090\u0001\u0010VR\"\u0010\u0095\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R1\u0010¦\u0001\u001a\n\u0012\u0005\u0012\u00030\u009f\u00010\u009e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R*\u0010«\u0001\u001a\f P*\u0005\u0018\u00010\u009f\u00010\u009f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001f\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001f\u0010³\u0001\u001a\n\u0012\u0005\u0012\u00030±\u00010¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010¯\u0001R\u0018\u0010A\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0019\u0010·\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010´\u0001¨\u0006»\u0001"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/b;", "Lf70;", "Ln7a;", "Lw50;", "Ltu6;", "Lhdc;", "Ltj1$a;", "Lif0;", "Lorg/osmdroid/util/BoundingBox;", "ri", "Loz3;", "Lqy7;", "ei", "Lcw5;", "di", "Lqv5;", "ci", "", "showNearbyRestaurantView", "", "qi", "pi", "ni", "oi", "", "slideOffset", "mi", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "rootView", "ih", "", "hh", "Ld88;", "selectedPizzeria", "U0", "pizzeria", "Ljb7;", "operationalTypeVo", "Lgn3;", "pizzeriaType", "isShortStreetNameEnabled", "G", "", "phoneNumber", "K", "j", "Lov5;", "location", "X0", "boundingBox", "Y", "isEnabled", "S0", "onBackPressed", "Lru/dodopizza/app/presentation/selectpizzeria/combined/a;", "vo", "V0", "finish", "focusOnUser", "o", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "M0", com.huawei.hms.opendevice.c.a, "id", "O8", "onCancel", "c2", "xd", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", DateTokenConverter.CONVERTER_KEY, "Lk79;", "Zh", "()Landroid/view/View;", "progress", com.huawei.hms.push.e.a, "Jh", "errorContainer", "f", "ai", "refreshButton", "g", "Sh", "pizzeriaCardClose", Image.TYPE_HIGH, "Vh", "pizzeriaListContainer", "Landroidx/recyclerview/widget/RecyclerView;", "i", "Uh", "()Landroidx/recyclerview/widget/RecyclerView;", "pizzeriaList", "Lh", "filterList", "k", "Ih", "emptyPizzeriasView", "l", "Hh", "clearFiltersView", "Lru/dodopizza/app/presentation/selectpizzeria/PizzeriasMap;", Image.TYPE_MEDIUM, "Wh", "()Lru/dodopizza/app/presentation/selectpizzeria/PizzeriasMap;", "pizzeriasMap", "n", "Th", "pizzeriaCardContainer", "Lru/dodopizza/app/presentation/selectpizzeria/PizzeriaCard;", "Rh", "()Lru/dodopizza/app/presentation/selectpizzeria/PizzeriaCard;", "pizzeriaCard", "p", "Qh", "orderHereButtonContainer", "q", "Ph", "orderHereButton", "r", "Nh", "findNearestPizzeriasButtonContainer", Image.TYPE_SMALL, "Mh", "findNearestPizzeriasButton", "t", "Kh", "exitButton", "u", "Gh", "bottomSheetView", "v", "Fh", "bottomSheetBehaviorView", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "w", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "Lje4;", "x", "Lje4;", "Oh", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "Las8;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaCombinedViewPresenter;", "y", "Las8;", "Yh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "z", "Lmoxy/ktx/MoxyKtxDelegate;", "Xh", "()Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaCombinedViewPresenter;", "presenter", "Ll6;", "Lb68;", "A", "Ll6;", "pizzeriaAdapterList", "Lr88;", "B", "filterAdapterList", "I", "Z", "X", "previousBottomSheetState", "<init>", "()V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class b extends f70 implements n7a, w50, tu6, hdc, tj1.a {
    private final l6<b68> A;
    private final l6<r88> B;
    private boolean I;
    private int X;
    private final Logger c;
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
    private final k79 u;
    private final k79 v;
    private BottomSheetBehavior<View> w;
    public je4 x;
    public as8<SelectPizzeriaCombinedViewPresenter> y;
    private final MoxyKtxDelegate z;
    static final /* synthetic */ je5<Object>[] Z = {bc9.f(new ar8(b.class, "progress", "getProgress()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "errorContainer", "getErrorContainer()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "refreshButton", "getRefreshButton()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "pizzeriaCardClose", "getPizzeriaCardClose()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "pizzeriaListContainer", "getPizzeriaListContainer()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "pizzeriaList", "getPizzeriaList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(b.class, "filterList", "getFilterList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(b.class, "emptyPizzeriasView", "getEmptyPizzeriasView()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "clearFiltersView", "getClearFiltersView()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "pizzeriasMap", "getPizzeriasMap()Lru/dodopizza/app/presentation/selectpizzeria/PizzeriasMap;", 0)), bc9.f(new ar8(b.class, "pizzeriaCardContainer", "getPizzeriaCardContainer()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "pizzeriaCard", "getPizzeriaCard()Lru/dodopizza/app/presentation/selectpizzeria/PizzeriaCard;", 0)), bc9.f(new ar8(b.class, "orderHereButtonContainer", "getOrderHereButtonContainer()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "orderHereButton", "getOrderHereButton()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "findNearestPizzeriasButtonContainer", "getFindNearestPizzeriasButtonContainer()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "findNearestPizzeriasButton", "getFindNearestPizzeriasButton()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "exitButton", "getExitButton()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "bottomSheetView", "getBottomSheetView()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "bottomSheetBehaviorView", "getBottomSheetBehaviorView()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaCombinedViewPresenter;", 0))};
    public static final a Y = new a(null);

    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/b$a;", "", "Lx7a;", "data", "Lru/dodopizza/app/presentation/selectpizzeria/combined/b;", "a", "", "DEFAULT_BOTTOM_SHEET_PEEK_HEIGHT", "I", "", "DEFAULT_EMPTY_VIEW_BIAS", "F", "DEFAULT_PEEK_PART", "DEFAULT_SLIDE_FACTOR", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "FILTERS_VIEW_HEIGHT", "FIND_BUTTON_CONTAINER_HEIGHT", "FULL_ALPHA", "MAP_CONTROL_VIEW_BIAS", "REQUEST_CODE_ENABLE_LOCATION_PROVIDERS", "ZERO", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(x7a x7aVar) {
            z65.h(x7aVar, "data");
            return (b) y64.d(new b(), bi0.c(bi0.d("extra_key_select_pizzeria_data", x7aVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedFragment$lastOrSingleRequestLocation$1", f = "SelectPizzeriaCombinedFragment.kt", l = {457}, m = "invokeSuspend")
    /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0633b extends f3b implements Function2<pz3<? super cw5>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ qv5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0633b(qv5 qv5Var, cv1<? super C0633b> cv1Var) {
            super(2, cv1Var);
            this.c = qv5Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            C0633b c0633b = new C0633b(this.c, cv1Var);
            c0633b.b = obj;
            return c0633b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super cw5> pz3Var, cv1<? super Unit> cv1Var) {
            return ((C0633b) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 L = wz3.L(qv5.b.a(this.c, null, 1, null), 1);
                this.a = 1;
                if (wz3.q((pz3) this.b, L, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedFragment$locationPermissionFlow$1", f = "SelectPizzeriaCombinedFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<qy7, cv1<? super Unit>, Object> {
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
        public final Object invoke(qy7 qy7Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qy7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                defpackage.a75.d()
                int r0 = r4.a
                if (r0 != 0) goto L73
                defpackage.vk9.b(r5)
                java.lang.Object r5 = r4.b
                qy7 r5 = (defpackage.qy7) r5
                java.util.List r0 = r5.b()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L18:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()
                r2 = r1
                dy7 r2 = (defpackage.dy7) r2
                ry7 r2 = r2.d()
                ry7 r3 = defpackage.ry7.GRANTED
                if (r2 != r3) goto L18
                goto L2f
            L2e:
                r1 = 0
            L2f:
                if (r1 != 0) goto L70
                java.util.List r5 = r5.b()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                boolean r0 = r5 instanceof java.util.Collection
                if (r0 == 0) goto L45
                r0 = r5
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L45
                goto L70
            L45:
                java.util.Iterator r5 = r5.iterator()
            L49:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L70
                java.lang.Object r0 = r5.next()
                dy7 r0 = (defpackage.dy7) r0
                ry7 r1 = r0.d()
                ry7 r2 = defpackage.ry7.DENIED
                if (r1 == r2) goto L65
                ry7 r0 = r0.d()
                ry7 r1 = defpackage.ry7.DENIED_FOREVER
                if (r0 != r1) goto L49
            L65:
                ru.dodopizza.app.presentation.selectpizzeria.combined.b r5 = ru.dodopizza.app.presentation.selectpizzeria.combined.b.this
                ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedViewPresenter r5 = ru.dodopizza.app.presentation.selectpizzeria.combined.b.zh(r5)
                ru.dodopizza.app.presentation.selectpizzeria.combined.d$g r0 = ru.dodopizza.app.presentation.selectpizzeria.combined.d.g.a
                r5.w(r0)
            L70:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            L73:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectpizzeria.combined.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<Object, Boolean> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof r88);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final e a = new e();

        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = PizzeriaFilterViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"ru/dodopizza/app/presentation/selectpizzeria/combined/b$f", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", com.huawei.hms.opendevice.c.a, "", "slideOffset", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f extends BottomSheetBehavior.f {
        f() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f) {
            z65.h(view, "bottomSheet");
            float f2 = 1 - f;
            b.this.Kh().setAlpha(Math.abs(f2));
            b.this.Wh().setZoomButtonsAlpha(Math.abs(f2));
            b.this.Wh().setMyLocationButtonAlpha(Math.abs(f2));
            b.this.mi(f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i) {
            z65.h(view, "bottomSheet");
            if (i == 4 && b.this.Vh().getVisibility() == 0) {
                b.this.Xh().w(d.m.a);
            }
            if (i == 3 && b.this.Vh().getVisibility() == 0) {
                b.this.Xh().w(d.n.a);
            }
            if (b.this.X == i && i == 4) {
                b.this.Xh().w(d.s.a);
            }
            if (i != 1 && i != 2) {
                b.this.X = i;
            }
        }
    }

    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr88;", "filterVO", "", "<anonymous parameter 1>", "", "a", "(Lr88;I)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function2<r88, Integer, Unit> {
        g() {
            super(2);
        }

        public final void a(r88 r88Var, int i) {
            z65.h(r88Var, "filterVO");
            b.this.Xh().w(new d.b(r88Var));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(r88 r88Var, Integer num) {
            a(r88Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ru/dodopizza/app/presentation/selectpizzeria/combined/b$h", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class h implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View a;
        final /* synthetic */ b b;

        h(View view, b bVar) {
            this.a = view;
            this.b = bVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int height;
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            PizzeriasMap Wh = this.b.Wh();
            jx9 jx9Var = jx9.a;
            p45.l(Wh, 0, 0, 0, (this.a.getHeight() / 3) - jx9Var.a(80), 7, null);
            BottomSheetBehavior bottomSheetBehavior = this.b.w;
            if (bottomSheetBehavior != null) {
                if (this.b.Vh().getVisibility() == 0) {
                    height = this.a.getHeight() / 3;
                } else {
                    height = (this.a.getHeight() / 3) - jx9Var.a(60);
                }
                bottomSheetBehavior.b0(height);
            }
        }
    }

    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"ru/dodopizza/app/presentation/selectpizzeria/combined/b$i", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i extends RecyclerView.u {
        i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            BottomSheetBehavior bottomSheetBehavior;
            BottomSheetBehavior bottomSheetBehavior2;
            z65.h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && (bottomSheetBehavior = b.this.w) != null && b.this.X == bottomSheetBehavior.G() && (bottomSheetBehavior2 = b.this.w) != null && bottomSheetBehavior2.G() == 4) {
                b.this.Xh().w(d.s.a);
            }
        }
    }

    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class j extends ej5 implements Function1<View, Unit> {
        j() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b.this.Xh().w(d.q.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb68;", "vo", "", "a", "(Lb68;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class k extends ej5 implements Function1<b68, Unit> {
        k() {
            super(1);
        }

        public final void a(b68 b68Var) {
            z65.h(b68Var, "vo");
            b.this.Xh().w(new d.p(b68Var));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b68 b68Var) {
            a(b68Var);
            return Unit.a;
        }
    }

    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaCombinedViewPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaCombinedViewPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class l extends ej5 implements Function0<SelectPizzeriaCombinedViewPresenter> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SelectPizzeriaCombinedViewPresenter invoke() {
            return b.this.Yh().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedFragment$requestLocation$1", f = "SelectPizzeriaCombinedFragment.kt", l = {405}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class m extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaCombinedFragment.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "Loz3;", "Lcw5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedFragment$requestLocation$1$1", f = "SelectPizzeriaCombinedFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends f3b implements Function2<qy7, cv1<? super oz3<? extends cw5>>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.c = bVar;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                a aVar = new a(this.c, cv1Var);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(qy7 qy7Var, cv1<? super oz3<? extends cw5>> cv1Var) {
                return ((a) create(qy7Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    List<dy7> b = ((qy7) this.b).b();
                    if (!(b instanceof Collection) || !b.isEmpty()) {
                        for (dy7 dy7Var : b) {
                            if (dy7Var.d() == ry7.GRANTED) {
                                return this.c.di();
                            }
                        }
                    }
                    return wz3.A(cw5.b.a);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaCombinedFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedFragment$requestLocation$1$2", f = "SelectPizzeriaCombinedFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.b$m$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0634b extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0634b(b bVar, cv1<? super C0634b> cv1Var) {
                super(3, cv1Var);
                this.c = bVar;
            }

            @Override // defpackage.y84
            /* renamed from: i */
            public final Object invoke(pz3<? super cw5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
                C0634b c0634b = new C0634b(this.c, cv1Var);
                c0634b.b = th;
                return c0634b.invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    this.c.c.warn("Failed to request location. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaCombinedFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "result", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class c<T> implements pz3 {
            final /* synthetic */ b a;
            final /* synthetic */ boolean b;

            c(b bVar, boolean z) {
                this.a = bVar;
                this.b = z;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                if (cw5Var instanceof cw5.d) {
                    cw5.d dVar = (cw5.d) cw5Var;
                    this.a.Xh().w(new d.i(new ov5(dVar.a().getLatitude(), dVar.a().getLongitude(), null, null, 12, null), this.b));
                } else if (cw5Var instanceof cw5.a) {
                    this.a.Xh().w(d.f.a);
                } else if (!z65.c(cw5Var, cw5.b.a) && (cw5Var instanceof cw5.c)) {
                    gw5.a((cw5.c) cw5Var, this.a, 100);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z, cv1<? super m> cv1Var) {
            super(2, cv1Var);
            this.c = z;
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
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                oz3 h = wz3.h(wz3.x(b.this.ei(), new a(b.this, null)), new C0634b(b.this, null));
                c cVar = new c(b.this, this.c);
                this.a = 1;
                if (h.collect(cVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class n extends ej5 implements Function1<Object, Boolean> {
        public static final n a = new n();

        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof b68);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class o extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final o a = new o();

        public o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = PickupPizzeriaVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lb68;", "oldItems", "newItems", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class p extends ej5 implements Function2<List<? extends b68>, List<? extends b68>, e.C0047e> {
        public static final p a = new p();

        p() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<b68> list, List<b68> list2) {
            z65.h(list, "oldItems");
            z65.h(list2, "newItems");
            e.C0047e b = androidx.recyclerview.widget.e.b(new c68(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb68;", "pizzeriaVO", "", "position", "", "a", "(Lb68;I)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class q extends ej5 implements Function2<b68, Integer, Unit> {
        q() {
            super(2);
        }

        public final void a(b68 b68Var, int i) {
            z65.h(b68Var, "pizzeriaVO");
            b.this.Xh().w(new d.o(b68Var.g(), i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(b68 b68Var, Integer num) {
            a(b68Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: SelectPizzeriaCombinedFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lr88;", "oldItems", "newItems", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class r extends ej5 implements Function2<List<? extends r88>, List<? extends r88>, e.C0047e> {
        public static final r a = new r();

        r() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<r88> list, List<r88> list2) {
            z65.h(list, "oldItems");
            z65.h(list2, "newItems");
            e.C0047e b = androidx.recyclerview.widget.e.b(new l88(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    public b() {
        super(R.layout.fragment_select_pizzeria_combined_view);
        this.c = LoggerFactory.getLogger("SelectPizzeriaCombinedFragment");
        this.d = kb0.e(this, R.id.progress);
        this.e = kb0.e(this, R.id.failed_to_load_pizzerias_container);
        this.f = kb0.e(this, R.id.try_again_button);
        this.g = kb0.e(this, R.id.pizzeria_card_close);
        this.h = kb0.e(this, R.id.pizzeria_list_container);
        this.i = kb0.e(this, R.id.pizzeria_list);
        this.j = kb0.e(this, R.id.filters_list);
        this.k = kb0.e(this, R.id.empty_view);
        this.l = kb0.e(this, R.id.clear_filters_view);
        this.m = kb0.e(this, R.id.pizzerias_map);
        this.n = kb0.e(this, R.id.pizzeria_card_container);
        this.o = kb0.e(this, R.id.pizzeria_card);
        this.p = kb0.e(this, R.id.order_here_button_container);
        this.q = kb0.e(this, R.id.order_here_button);
        this.r = kb0.e(this, R.id.find_nearest_pizzerias_button_container);
        this.s = kb0.e(this, R.id.find_nearest_pizzerias_button);
        this.t = kb0.e(this, R.id.exit_button);
        this.u = kb0.e(this, R.id.bottom_sheet_view);
        this.v = kb0.e(this, R.id.bottom_sheet_behavior_view);
        l lVar = new l();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.z = new MoxyKtxDelegate(mvpDelegate, SelectPizzeriaCombinedViewPresenter.class.getName() + ".presenter", lVar);
        this.A = new l6<>(null, 1, null);
        this.B = new l6<>(null, 1, null);
        this.X = 4;
    }

    private final View Fh() {
        return (View) this.v.a(this, Z[18]);
    }

    private final View Gh() {
        return (View) this.u.a(this, Z[17]);
    }

    private final View Hh() {
        return (View) this.l.a(this, Z[8]);
    }

    private final View Ih() {
        return (View) this.k.a(this, Z[7]);
    }

    private final View Jh() {
        return (View) this.e.a(this, Z[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Kh() {
        return (View) this.t.a(this, Z[16]);
    }

    private final RecyclerView Lh() {
        return (RecyclerView) this.j.a(this, Z[6]);
    }

    private final View Mh() {
        return (View) this.s.a(this, Z[15]);
    }

    private final View Nh() {
        return (View) this.r.a(this, Z[14]);
    }

    private final View Ph() {
        return (View) this.q.a(this, Z[13]);
    }

    private final View Qh() {
        return (View) this.p.a(this, Z[12]);
    }

    private final PizzeriaCard Rh() {
        return (PizzeriaCard) this.o.a(this, Z[11]);
    }

    private final View Sh() {
        return (View) this.g.a(this, Z[3]);
    }

    private final View Th() {
        return (View) this.n.a(this, Z[10]);
    }

    private final RecyclerView Uh() {
        return (RecyclerView) this.i.a(this, Z[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Vh() {
        return (View) this.h.a(this, Z[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PizzeriasMap Wh() {
        return (PizzeriasMap) this.m.a(this, Z[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectPizzeriaCombinedViewPresenter Xh() {
        return (SelectPizzeriaCombinedViewPresenter) this.z.getValue(this, Z[19]);
    }

    private final View Zh() {
        return (View) this.d.a(this, Z[0]);
    }

    private final View ai() {
        return (View) this.f.a(this, Z[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5c bi(int i2, View view, c5c c5cVar) {
        z65.h(view, "view");
        z65.h(c5cVar, "insets");
        n45 f2 = c5cVar.f(c5c.m.d());
        z65.g(f2, "getInsets(...)");
        p45.l(view, 0, 0, 0, i2 + f2.d, 7, null);
        p45.j(view, 0, 0, 0, 0, 13, null);
        return c5cVar;
    }

    private final oz3<cw5> ci(qv5 qv5Var) {
        return wz3.G(qv5Var.a(), new C0633b(qv5Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<cw5> di() {
        return ci(qv5.a.a(Oh()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<qy7> ei() {
        return wz3.F(ky7.a.a(this).a("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fi(b bVar, View view) {
        z65.h(bVar, "this$0");
        bVar.Xh().w(d.h.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gi(b bVar, String str) {
        z65.h(bVar, "this$0");
        SelectPizzeriaCombinedViewPresenter Xh = bVar.Xh();
        z65.e(str);
        Xh.w(new d.l(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hi(b bVar, View view) {
        z65.h(bVar, "this$0");
        bVar.Xh().w(d.a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ii(b bVar, View view) {
        z65.h(bVar, "this$0");
        bVar.Xh().w(d.c.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ji(b bVar, View view) {
        z65.h(bVar, "this$0");
        bVar.Xh().w(d.e.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ki(b bVar, View view) {
        z65.h(bVar, "this$0");
        bVar.Xh().w(d.r.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void li(b bVar, View view) {
        z65.h(bVar, "this$0");
        bVar.Xh().w(d.C0635d.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mi(float f2) {
        ConstraintLayout.b bVar;
        float max = Math.max(0.12f, f2 / 2);
        ViewGroup.LayoutParams layoutParams = Ih().getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            bVar = (ConstraintLayout.b) layoutParams;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.G = max;
        }
        Ih().setLayoutParams(bVar);
    }

    private final void ni() {
        int a2;
        syb.H0(Uh(), false);
        BottomSheetBehavior<View> bottomSheetBehavior = this.w;
        if (bottomSheetBehavior != null) {
            View view = getView();
            if (view != null) {
                a2 = (view.getHeight() / 3) - jx9.a.a(60);
            } else {
                a2 = 230 - jx9.a.a(60);
            }
            bottomSheetBehavior.b0(a2);
        }
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.w;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f0(4);
        }
    }

    private final void oi(boolean z) {
        int i2;
        int i3;
        syb.H0(Uh(), true);
        BottomSheetBehavior<View> bottomSheetBehavior = this.w;
        if (bottomSheetBehavior != null) {
            View view = getView();
            if (view != null) {
                i3 = view.getHeight() / 3;
            } else {
                i3 = 230;
            }
            bottomSheetBehavior.b0(i3);
        }
        un3.o(Ih(), this.A.isEmpty());
        un3.o(Uh(), true ^ this.A.isEmpty());
        un3.o(Nh(), z);
        View Vh = Vh();
        if (z) {
            i2 = jx9.a.a(80);
        } else {
            i2 = 0;
        }
        p45.l(Vh, 0, 0, 0, i2, 7, null);
    }

    private final void pi() {
        ni();
        un3.e(Vh());
        un3.k(Th());
        un3.e(Nh());
        un3.k(Qh());
        un3.k(Gh());
    }

    private final void qi(boolean z) {
        oi(z);
        Wh().clearFocus();
        un3.e(Th());
        un3.e(Qh());
        un3.k(Vh());
        un3.k(Gh());
    }

    private final BoundingBox ri(if0 if0Var) {
        return new BoundingBox(if0Var.b(), if0Var.a(), if0Var.c(), if0Var.d());
    }

    @Override // defpackage.n7a
    public void G(d88 d88Var, jb7 jb7Var, gn3 gn3Var, boolean z) {
        boolean z2;
        z65.h(d88Var, "pizzeria");
        z65.h(jb7Var, "operationalTypeVo");
        z65.h(gn3Var, "pizzeriaType");
        Rh().S(d88Var, jb7Var, gn3Var, Boolean.valueOf(z));
        View Ph = Ph();
        if (jb7Var != jb7.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        Ph.setEnabled(z2);
    }

    @Override // defpackage.n7a
    public void K(String str) {
        z65.h(str, "phoneNumber");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.f(requireContext, str);
    }

    @Override // defpackage.n7a
    public void M0(ov5 ov5Var) {
        z65.h(ov5Var, "location");
        Wh().m(ov5Var.b(), ov5Var.c());
    }

    @Override // defpackage.tj1.a
    public void O8(String str) {
        z65.h(str, "id");
        Context context = getContext();
        if (context != null) {
            av1.c(context);
        }
    }

    public final je4 Oh() {
        je4 je4Var = this.x;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    @Override // defpackage.n7a
    public void S0(boolean z) {
        Wh().setMyLocationButtonEnabled(z);
    }

    @Override // defpackage.n7a
    public void U0(d88 d88Var, boolean z) {
        if (d88Var != null) {
            Wh().setSelectedPizzeria(d88Var.getId());
            pi();
            return;
        }
        Wh().clearFocus();
        qi(z);
    }

    @Override // defpackage.n7a
    public void V0(ru.dodopizza.app.presentation.selectpizzeria.combined.a aVar) {
        z65.h(aVar, "vo");
        if (z65.c(aVar, a.C0632a.a)) {
            un3.e(Gh());
            un3.e(Wh());
            un3.e(Zh());
            un3.k(Jh());
        } else if (z65.c(aVar, a.b.a)) {
            un3.e(Gh());
            un3.e(Wh());
            un3.e(Jh());
            un3.k(Zh());
        } else if (aVar instanceof a.c) {
            a.c cVar = (a.c) aVar;
            Wh().setPizzerias(cVar.a());
            this.A.Z(cVar.a(), p.a);
            Uh().setAdapter(new k6.a(new k6(this.A), n.a, new z58(cVar.d(), cVar.c(), new q()), o.a).b().d());
            this.B.Z(cVar.b(), r.a);
            un3.k(Wh());
            un3.e(Jh());
            un3.e(Zh());
        }
    }

    @Override // defpackage.n7a
    public void X0(ov5 ov5Var) {
        z65.h(ov5Var, "location");
        Wh().r(ov5Var.b(), ov5Var.c());
    }

    @Override // defpackage.n7a
    public void Y(if0 if0Var) {
        z65.h(if0Var, "boundingBox");
        Wh().setBoundingBox(ri(if0Var));
    }

    public final as8<SelectPizzeriaCombinedViewPresenter> Yh() {
        as8<SelectPizzeriaCombinedViewPresenter> as8Var = this.y;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.n7a
    public void c() {
        String string = requireContext().getString(R.string.turn_on_geolocation);
        z65.g(string, "getString(...)");
        String string2 = requireContext().getString(R.string.cancel);
        z65.g(string2, "getString(...)");
        String string3 = requireContext().getString(R.string.settings);
        z65.g(string3, "getString(...)");
        tj1.e.a(string, string2, string3, "request_permission").show(getChildFragmentManager(), "request_permission");
    }

    @Override // defpackage.hdc
    public void c2() {
        Xh().w(d.j.a);
    }

    @Override // defpackage.tu6
    public void finish() {
        Xh().w(d.a.a);
    }

    @Override // defpackage.f70
    protected int hh() {
        return R.color.transparent;
    }

    @Override // defpackage.f70
    protected void ih(View view) {
        z65.h(view, "rootView");
        final int paddingBottom = view.getPaddingBottom();
        syb.I0(view, new h77() { // from class: d7a
            @Override // defpackage.h77
            public final c5c a(View view2, c5c c5cVar) {
                c5c bi;
                bi = b.bi(paddingBottom, view2, c5cVar);
                return bi;
            }
        });
    }

    @Override // defpackage.n7a
    public void j() {
        Toast.makeText(getContext(), (int) R.string.location_not_available, 1).show();
    }

    @Override // defpackage.n7a
    public void o(boolean z) {
        this.I = z;
        sh0.d(pp5.a(this), null, null, new m(z, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 100 && i3 == -1) {
            o(this.I);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        o7a.b a2 = o7a.a.a();
        SelectPizzeriaFeatureDependencies selectPizzeriaFeatureDependencies = (SelectPizzeriaFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(SelectPizzeriaFeatureDependencies.class));
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("extra_key_select_pizzeria_data")) == null) ? null : null;
        if (obj != null && !(obj instanceof x7a)) {
            throw new ClassCastException("Property extra_key_select_pizzeria_data has different class type");
        } else if (obj != null) {
            a2.a(selectPizzeriaFeatureDependencies, (x7a) obj).c(this);
            super.onAttach(context);
        } else {
            throw new IllegalArgumentException("Argument with key = extra_key_select_pizzeria_data not found in bundle");
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Xh().w(d.a.a);
        return true;
    }

    @Override // defpackage.tj1.a
    public void onCancel(String str) {
        z65.h(str, "id");
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView Uh = Uh();
        v99 v99Var = v99.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        Uh.addItemDecoration(v99Var.c(requireContext));
        oma.a(ai(), new j());
        Wh().setOnPizzeriaTapListener(new k());
        Wh().setOnMyLocationClickListener(new View.OnClickListener() { // from class: e7a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.fi(b.this, view2);
            }
        });
        Rh().setPhoneTextListener(new PizzeriaCard.a() { // from class: f7a
            @Override // ru.dodopizza.app.presentation.selectpizzeria.PizzeriaCard.a
            public final void a(String str) {
                b.gi(b.this, str);
            }
        });
        Kh().setOnClickListener(new View.OnClickListener() { // from class: g7a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.hi(b.this, view2);
            }
        });
        Hh().setOnClickListener(new View.OnClickListener() { // from class: h7a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.ii(b.this, view2);
            }
        });
        Ph().setOnClickListener(new View.OnClickListener() { // from class: i7a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.ji(b.this, view2);
            }
        });
        Mh().setOnClickListener(new View.OnClickListener() { // from class: j7a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.ki(b.this, view2);
            }
        });
        Sh().setOnClickListener(new View.OnClickListener() { // from class: k7a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.li(b.this, view2);
            }
        });
        BottomSheetBehavior<View> B = BottomSheetBehavior.B(Fh());
        this.w = B;
        if (B != null) {
            B.s(new f());
        }
        Lh().setAdapter(new k6.a(new k6(this.B), d.a, new j88(new g()), e.a).b().d());
        view.getViewTreeObserver().addOnGlobalLayoutListener(new h(view, this));
        Wh().setControlViewVerticalBias(0.65f);
        Uh().addOnScrollListener(new i());
        Wh().setZoomListener(this);
    }

    @Override // defpackage.hdc
    public void xd() {
        Xh().w(d.k.a);
    }
}
