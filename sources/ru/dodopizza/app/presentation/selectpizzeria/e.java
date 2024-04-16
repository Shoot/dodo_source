package ru.dodopizza.app.presentation.selectpizzeria;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.SegmentedControl;
import com.dodopizza.geo.feature.pickup.presentation.PickupPizzeriaVH;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.inappstory.sdk.stories.api.models.Image;
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
import ru.dodopizza.app.presentation.selectpizzeria.d;
import ru.dodopizza.app.presentation.selectpizzeria.e;
import ru.dodopizza.app.presentation.selectpizzeria.g;
/* compiled from: SelectPizzeriaFragment.kt */
@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ±\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002²\u0001B\t¢\u0006\u0006\b¯\u0001\u0010°\u0001J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0002J\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\t*\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J(\u0010)\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\u0010\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+H\u0016J\u0010\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0010\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020'H\u0016J\b\u00102\u001a\u00020'H\u0016J\u0010\u00104\u001a\u00020\u00102\u0006\u00103\u001a\u00020'H\u0016J\u0010\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0016J\b\u00108\u001a\u00020\u0010H\u0016J\b\u00109\u001a\u00020\u0010H\u0016J\"\u0010?\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016J\u0010\u0010@\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+H\u0016J\b\u0010A\u001a\u00020\u0010H\u0016J\u0010\u0010D\u001a\u00020\u00102\u0006\u0010C\u001a\u00020BH\u0016J\u0010\u0010E\u001a\u00020\u00102\u0006\u0010C\u001a\u00020BH\u0016J\u0010\u0010G\u001a\u00020\u00102\u0006\u0010F\u001a\u00020BH\u0016J\b\u0010H\u001a\u00020\u0010H\u0016R\u001c\u0010L\u001a\n J*\u0004\u0018\u00010I0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010KR\u001b\u0010R\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001b\u0010V\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010O\u001a\u0004\bX\u0010UR\u001b\u0010\\\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010O\u001a\u0004\b[\u0010UR\u001b\u0010_\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010O\u001a\u0004\b^\u0010UR\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010O\u001a\u0004\bb\u0010cR\u001b\u0010f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010O\u001a\u0004\be\u0010UR\u001b\u0010j\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010O\u001a\u0004\bh\u0010iR\u001b\u0010m\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010O\u001a\u0004\bl\u0010UR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010O\u001a\u0004\bp\u0010qR\u001b\u0010u\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010O\u001a\u0004\bt\u0010UR\u001b\u0010z\u001a\u00020v8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010O\u001a\u0004\bx\u0010yR\u001b\u0010}\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010O\u001a\u0004\b|\u0010UR\u001c\u0010\u0080\u0001\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b~\u0010O\u001a\u0004\b\u007f\u0010UR\u001e\u0010\u0083\u0001\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010O\u001a\u0005\b\u0082\u0001\u0010UR\u001e\u0010\u0086\u0001\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010O\u001a\u0005\b\u0085\u0001\u0010UR \u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0087\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0087\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0089\u0001R*\u0010\u0094\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R1\u0010\u009d\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010¥\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R*\u0010®\u0001\u001a\f J*\u0005\u0018\u00010\u0096\u00010\u0096\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006³\u0001"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/e;", "Lf70;", "Lq8a;", "Lw50;", "Ltu6;", "Ltj1$a;", "Lif0;", "Lorg/osmdroid/util/BoundingBox;", "fi", "Loz3;", "Lqy7;", "Xh", "Lcw5;", "Wh", "Lqv5;", "Uh", "", "ei", "", "startValue", "endValue", "fraction", "Vh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Ld88;", "selectedPizzeria", "Pe", "pizzeria", "Ljb7;", "operationalTypeVo", "Lgn3;", "pizzeriaType", "", "isShortStreetNameEnabled", "G", "j", "Lov5;", "location", "X0", "boundingBox", "Y", "isEnabled", "S0", "onBackPressed", "isShouldBeVisible", "h1", "Lru/dodopizza/app/presentation/selectpizzeria/g;", "vo", "T2", "finish", "k", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "M0", com.huawei.hms.opendevice.c.a, "", "id", "O8", "onCancel", Action.NAME_ATTRIBUTE, "jd", "cg", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "Landroidx/appcompat/widget/Toolbar;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "Th", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", com.huawei.hms.push.e.a, "Ph", "()Landroid/view/View;", "progress", "f", "Dh", "errorContainer", "g", "Qh", "refreshButton", Image.TYPE_HIGH, "Fh", "footer", "Lcom/dodopizza/android/view/custom/SegmentedControl;", "i", "Ch", "()Lcom/dodopizza/android/view/custom/SegmentedControl;", "displayModeGroup", "Kh", "pizzeriaListContainer", "Landroidx/recyclerview/widget/RecyclerView;", "Jh", "()Landroidx/recyclerview/widget/RecyclerView;", "pizzeriaList", "l", "Mh", "pizzeriaMapContainer", "Lru/dodopizza/app/presentation/selectpizzeria/PizzeriasMap;", Image.TYPE_MEDIUM, "Lh", "()Lru/dodopizza/app/presentation/selectpizzeria/PizzeriasMap;", "pizzeriaMap", "n", "Ah", "bottomPizzeriaCard", "Lru/dodopizza/app/presentation/selectpizzeria/PizzeriaCard;", "o", "Ih", "()Lru/dodopizza/app/presentation/selectpizzeria/PizzeriaCard;", "pizzeriaCard", "p", "Gh", "footerView", "q", "Bh", "confirmPizzeriaButton", "r", "Sh", "showNearbyRestaurantsContainer", Image.TYPE_SMALL, "Rh", "showNearbyRestaurants", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "t", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "pizzeriaCardBehavior", "u", "pickUpPizzeriaButtonBehavior", "Lje4;", "v", "Lje4;", "Hh", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "Las8;", "Lru/dodopizza/app/presentation/selectpizzeria/SelectPizzeriaPresenter;", "w", "Las8;", "Oh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Lhq3;", "x", "Lhq3;", "Eh", "()Lhq3;", "setFeatureService", "(Lhq3;)V", "featureService", "Landroidx/recyclerview/widget/RecyclerView$u;", "y", "Landroidx/recyclerview/widget/RecyclerView$u;", "pizzeriaListScrollListener", "z", "Lmoxy/ktx/MoxyKtxDelegate;", "Nh", "()Lru/dodopizza/app/presentation/selectpizzeria/SelectPizzeriaPresenter;", "presenter", "<init>", "()V", "A", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class e extends f70 implements q8a, w50, tu6, tj1.a {
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
    private BottomSheetBehavior<View> t;
    private BottomSheetBehavior<View> u;
    public je4 v;
    public as8<SelectPizzeriaPresenter> w;
    public hq3 x;
    private RecyclerView.u y;
    private final MoxyKtxDelegate z;
    static final /* synthetic */ je5<Object>[] B = {bc9.f(new ar8(e.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(e.class, "progress", "getProgress()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "errorContainer", "getErrorContainer()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "refreshButton", "getRefreshButton()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "footer", "getFooter()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "displayModeGroup", "getDisplayModeGroup()Lcom/dodopizza/android/view/custom/SegmentedControl;", 0)), bc9.f(new ar8(e.class, "pizzeriaListContainer", "getPizzeriaListContainer()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "pizzeriaList", "getPizzeriaList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(e.class, "pizzeriaMapContainer", "getPizzeriaMapContainer()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "pizzeriaMap", "getPizzeriaMap()Lru/dodopizza/app/presentation/selectpizzeria/PizzeriasMap;", 0)), bc9.f(new ar8(e.class, "bottomPizzeriaCard", "getBottomPizzeriaCard()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "pizzeriaCard", "getPizzeriaCard()Lru/dodopizza/app/presentation/selectpizzeria/PizzeriaCard;", 0)), bc9.f(new ar8(e.class, "footerView", "getFooterView()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "confirmPizzeriaButton", "getConfirmPizzeriaButton()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "showNearbyRestaurantsContainer", "getShowNearbyRestaurantsContainer()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "showNearbyRestaurants", "getShowNearbyRestaurants()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/selectpizzeria/SelectPizzeriaPresenter;", 0))};
    public static final a A = new a(null);

    /* compiled from: SelectPizzeriaFragment.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/e$a;", "", "Lx7a;", "data", "Lru/dodopizza/app/presentation/selectpizzeria/e;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "", "MAX_HEADER_ELEVATION", "F", "MIN_HEADER_ELEVATION", "", "PIZZERIA_CARD_BEHAVIOR_OFFSET", "D", "RANGE", "", "REQUEST_CODE_ENABLE_LOCATION_PROVIDERS", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(x7a x7aVar) {
            z65.h(x7aVar, "data");
            return (e) y64.d(new e(), bi0.c(bi0.d("extra_key_select_pizzeria_data", x7aVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFragment$lastOrSingleRequestLocation$1", f = "SelectPizzeriaFragment.kt", l = {386}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<pz3<? super cw5>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ qv5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(qv5 qv5Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = qv5Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.c, cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super cw5> pz3Var, cv1<? super Unit> cv1Var) {
            return ((b) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
    /* compiled from: SelectPizzeriaFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFragment$locationPermissionFlow$1", f = "SelectPizzeriaFragment.kt", l = {}, m = "invokeSuspend")
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

        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
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
                if (r0 != 0) goto L88
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
                dy7 r1 = (defpackage.dy7) r1
                if (r1 == 0) goto L46
                ru.dodopizza.app.presentation.selectpizzeria.e r5 = ru.dodopizza.app.presentation.selectpizzeria.e.this
                ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter r5 = ru.dodopizza.app.presentation.selectpizzeria.e.vh(r5)
                ru.dodopizza.app.presentation.selectpizzeria.d$g r0 = new ru.dodopizza.app.presentation.selectpizzeria.d$g
                boolean r1 = r1.e()
                r0.<init>(r1)
                r5.w(r0)
                goto L85
            L46:
                java.util.List r5 = r5.b()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                boolean r0 = r5 instanceof java.util.Collection
                if (r0 == 0) goto L5a
                r0 = r5
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L5a
                goto L85
            L5a:
                java.util.Iterator r5 = r5.iterator()
            L5e:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L85
                java.lang.Object r0 = r5.next()
                dy7 r0 = (defpackage.dy7) r0
                ry7 r1 = r0.d()
                ry7 r2 = defpackage.ry7.DENIED
                if (r1 == r2) goto L7a
                ry7 r0 = r0.d()
                ry7 r1 = defpackage.ry7.DENIED_FOREVER
                if (r0 != r1) goto L5e
            L7a:
                ru.dodopizza.app.presentation.selectpizzeria.e r5 = ru.dodopizza.app.presentation.selectpizzeria.e.this
                ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter r5 = ru.dodopizza.app.presentation.selectpizzeria.e.vh(r5)
                ru.dodopizza.app.presentation.selectpizzeria.d$f r0 = ru.dodopizza.app.presentation.selectpizzeria.d.f.a
                r5.w(r0)
            L85:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            L88:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectpizzeria.e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SelectPizzeriaFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            e.this.Nh().w(d.m.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: SelectPizzeriaFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb68;", "vo", "", "a", "(Lb68;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.e$e  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0640e extends ej5 implements Function1<b68, Unit> {
        C0640e() {
            super(1);
        }

        public final void a(b68 b68Var) {
            z65.h(b68Var, "vo");
            e.this.Nh().w(new d.l(b68Var));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b68 b68Var) {
            a(b68Var);
            return Unit.a;
        }
    }

    /* compiled from: SelectPizzeriaFragment.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"ru/dodopizza/app/presentation/selectpizzeria/e$f", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", com.huawei.hms.opendevice.c.a, "", "slideOffset", "b", "", "a", "D", "getHalfOffset", "()D", "halfOffset", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f extends BottomSheetBehavior.f {
        private final double a = -0.5d;

        f() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f) {
            z65.h(view, "bottomSheet");
            BottomSheetBehavior bottomSheetBehavior = null;
            if (f >= this.a) {
                BottomSheetBehavior bottomSheetBehavior2 = e.this.u;
                if (bottomSheetBehavior2 == null) {
                    z65.z("pickUpPizzeriaButtonBehavior");
                } else {
                    bottomSheetBehavior = bottomSheetBehavior2;
                }
                bottomSheetBehavior.f0(4);
                return;
            }
            BottomSheetBehavior bottomSheetBehavior3 = e.this.u;
            if (bottomSheetBehavior3 == null) {
                z65.z("pickUpPizzeriaButtonBehavior");
            } else {
                bottomSheetBehavior = bottomSheetBehavior3;
            }
            bottomSheetBehavior.f0(5);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i) {
            z65.h(view, "bottomSheet");
            if (i == 5) {
                e.this.Lh().clearFocus();
            }
        }
    }

    /* compiled from: SelectPizzeriaFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/SelectPizzeriaPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/selectpizzeria/SelectPizzeriaPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function0<SelectPizzeriaPresenter> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SelectPizzeriaPresenter invoke() {
            return e.this.Oh().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFragment$requestLocation$1", f = "SelectPizzeriaFragment.kt", l = {335}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaFragment.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "Loz3;", "Lcw5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFragment$requestLocation$1$1", f = "SelectPizzeriaFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends f3b implements Function2<qy7, cv1<? super oz3<? extends cw5>>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ e c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.c = eVar;
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
                                return this.c.Wh();
                            }
                        }
                    }
                    return wz3.A(cw5.b.a);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFragment$requestLocation$1$2", f = "SelectPizzeriaFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class b extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ e c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e eVar, cv1<? super b> cv1Var) {
                super(3, cv1Var);
                this.c = eVar;
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
                    this.c.c.warn("Failed to request location. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "result", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class c<T> implements pz3 {
            final /* synthetic */ e a;

            c(e eVar) {
                this.a = eVar;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                if (cw5Var instanceof cw5.d) {
                    cw5.d dVar = (cw5.d) cw5Var;
                    this.a.Nh().w(new d.i(new ov5(dVar.a().getLatitude(), dVar.a().getLongitude(), null, null, 12, null)));
                } else if (cw5Var instanceof cw5.a) {
                    this.a.Nh().w(d.e.a);
                } else if (!z65.c(cw5Var, cw5.b.a) && (cw5Var instanceof cw5.c)) {
                    gw5.a((cw5.c) cw5Var, this.a, 100);
                }
                return Unit.a;
            }
        }

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((h) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 h = wz3.h(wz3.x(e.this.Xh(), new a(e.this, null)), new b(e.this, null));
                c cVar = new c(e.this);
                this.a = 1;
                if (h.collect(cVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: SelectPizzeriaFragment.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"ru/dodopizza/app/presentation/selectpizzeria/e$i", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView;", "v", "", "dx", "dy", "", "onScrolled", "a", "I", "getCurrentScroll", "()I", "setCurrentScroll", "(I)V", "currentScroll", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i extends RecyclerView.u {
        private int a;

        i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            float k;
            z65.h(recyclerView, "v");
            super.onScrolled(recyclerView, i, i2);
            int i3 = this.a + i2;
            this.a = i3;
            k = kotlin.ranges.i.k(Math.abs(i3) / 16.0f, 0.0f, 1.0f);
            e.this.Sh().setElevation(e.this.Vh(0.0f, 8.0f, k));
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<Object, Boolean> {
        public static final j a = new j();

        public j() {
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
    public static final class k extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final k a = new k();

        public k() {
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

    /* compiled from: SelectPizzeriaFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb68;", "pizzeriaVO", "", "position", "", "a", "(Lb68;I)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class l extends ej5 implements Function2<b68, Integer, Unit> {
        l() {
            super(2);
        }

        public final void a(b68 b68Var, int i) {
            z65.h(b68Var, "pizzeriaVO");
            e.this.Nh().w(new d.k(b68Var.g(), i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(b68 b68Var, Integer num) {
            a(b68Var, num.intValue());
            return Unit.a;
        }
    }

    public e() {
        super(R.layout.fragment_select_pizzeria);
        this.c = LoggerFactory.getLogger("SelectPizzeriaFragment");
        this.d = kb0.e(this, R.id.toolbar);
        this.e = kb0.e(this, R.id.progress);
        this.f = kb0.e(this, R.id.failed_to_load_pizzerias_container);
        this.g = kb0.e(this, R.id.try_again_button);
        this.h = kb0.e(this, R.id.footer);
        this.i = kb0.e(this, R.id.switch_map_or_list);
        this.j = kb0.e(this, R.id.pizzeria_list);
        this.k = kb0.e(this, R.id.recycler);
        this.l = kb0.e(this, R.id.pizzeria_map);
        this.m = kb0.e(this, R.id.pizzerias_map_view);
        this.n = kb0.e(this, R.id.pizzerias_map_pizzeria_card_container);
        this.o = kb0.e(this, R.id.pizzerias_map_pizzeria_card);
        this.p = kb0.e(this, R.id.pizzerias_map_button_container);
        this.q = kb0.e(this, R.id.pizzerias_map_pick_up_pizza_button);
        this.r = kb0.e(this, R.id.show_nearby_restaurants_container);
        this.s = kb0.e(this, R.id.show_nearby_restaurants);
        g gVar = new g();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.z = new MoxyKtxDelegate(mvpDelegate, SelectPizzeriaPresenter.class.getName() + ".presenter", gVar);
    }

    private final View Ah() {
        return (View) this.n.a(this, B[10]);
    }

    private final View Bh() {
        return (View) this.q.a(this, B[13]);
    }

    private final SegmentedControl Ch() {
        return (SegmentedControl) this.i.a(this, B[5]);
    }

    private final View Dh() {
        return (View) this.f.a(this, B[2]);
    }

    private final View Fh() {
        return (View) this.h.a(this, B[4]);
    }

    private final View Gh() {
        return (View) this.p.a(this, B[12]);
    }

    private final PizzeriaCard Ih() {
        return (PizzeriaCard) this.o.a(this, B[11]);
    }

    private final RecyclerView Jh() {
        return (RecyclerView) this.k.a(this, B[7]);
    }

    private final View Kh() {
        return (View) this.j.a(this, B[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PizzeriasMap Lh() {
        return (PizzeriasMap) this.m.a(this, B[9]);
    }

    private final View Mh() {
        return (View) this.l.a(this, B[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectPizzeriaPresenter Nh() {
        return (SelectPizzeriaPresenter) this.z.getValue(this, B[16]);
    }

    private final View Ph() {
        return (View) this.e.a(this, B[1]);
    }

    private final View Qh() {
        return (View) this.g.a(this, B[3]);
    }

    private final View Rh() {
        return (View) this.s.a(this, B[15]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Sh() {
        return (View) this.r.a(this, B[14]);
    }

    private final Toolbar Th() {
        return (Toolbar) this.d.a(this, B[0]);
    }

    private final oz3<cw5> Uh(qv5 qv5Var) {
        return wz3.G(qv5Var.a(), new b(qv5Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float Vh(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<cw5> Wh() {
        return Uh(qv5.a.a(Hh()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<qy7> Xh() {
        return wz3.F(ky7.a.a(this).a("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Yh(e eVar, View view) {
        z65.h(eVar, "this$0");
        eVar.Nh().w(d.c.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zh(e eVar, RadioGroup radioGroup, int i2) {
        z65.h(eVar, "this$0");
        switch (i2) {
            case R.id.switch_as_list /* 2131363996 */:
                eVar.Nh().w(d.a.a);
                return;
            case R.id.switch_as_map /* 2131363997 */:
                eVar.Nh().w(d.b.a);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ai(e eVar, View view) {
        z65.h(eVar, "this$0");
        eVar.Nh().w(d.h.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bi(e eVar, String str) {
        z65.h(eVar, "this$0");
        SelectPizzeriaPresenter Nh = eVar.Nh();
        z65.e(str);
        Nh.w(new d.j(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ci(e eVar, View view) {
        z65.h(eVar, "this$0");
        eVar.Nh().w(d.C0639d.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void di(e eVar, View view) {
        z65.h(eVar, "this$0");
        eVar.Nh().w(d.n.a);
    }

    private final void ei() {
        RecyclerView.u uVar = this.y;
        if (uVar != null) {
            Jh().removeOnScrollListener(uVar);
        }
        i iVar = new i();
        Jh().addOnScrollListener(iVar);
        this.y = iVar;
    }

    private final BoundingBox fi(if0 if0Var) {
        return new BoundingBox(if0Var.b(), if0Var.a(), if0Var.c(), if0Var.d());
    }

    public final hq3 Eh() {
        hq3 hq3Var = this.x;
        if (hq3Var != null) {
            return hq3Var;
        }
        z65.z("featureService");
        return null;
    }

    @Override // defpackage.q8a
    public void G(d88 d88Var, jb7 jb7Var, gn3 gn3Var, boolean z) {
        boolean z2;
        z65.h(d88Var, "pizzeria");
        z65.h(jb7Var, "operationalTypeVo");
        z65.h(gn3Var, "pizzeriaType");
        Ih().S(d88Var, jb7Var, gn3Var, Boolean.valueOf(z));
        View Bh = Bh();
        if (jb7Var != jb7.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        Bh.setEnabled(z2);
        BottomSheetBehavior<View> bottomSheetBehavior = this.t;
        BottomSheetBehavior<View> bottomSheetBehavior2 = null;
        if (bottomSheetBehavior == null) {
            z65.z("pizzeriaCardBehavior");
            bottomSheetBehavior = null;
        }
        if (bottomSheetBehavior.G() != 4) {
            BottomSheetBehavior<View> bottomSheetBehavior3 = this.t;
            if (bottomSheetBehavior3 == null) {
                z65.z("pizzeriaCardBehavior");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior3;
            }
            bottomSheetBehavior2.f0(4);
        }
    }

    public final je4 Hh() {
        je4 je4Var = this.v;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    @Override // defpackage.q8a
    public void M0(ov5 ov5Var) {
        z65.h(ov5Var, "location");
        Lh().m(ov5Var.b(), ov5Var.c());
    }

    @Override // defpackage.tj1.a
    public void O8(String str) {
        z65.h(str, "id");
        Context context = getContext();
        if (context != null) {
            av1.c(context);
        }
    }

    public final as8<SelectPizzeriaPresenter> Oh() {
        as8<SelectPizzeriaPresenter> as8Var = this.w;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.q8a
    public void Pe(d88 d88Var) {
        BottomSheetBehavior<View> bottomSheetBehavior = null;
        if (d88Var != null) {
            Lh().setSelectedPizzeria(d88Var.getId());
            BottomSheetBehavior<View> bottomSheetBehavior2 = this.u;
            if (bottomSheetBehavior2 == null) {
                z65.z("pickUpPizzeriaButtonBehavior");
            } else {
                bottomSheetBehavior = bottomSheetBehavior2;
            }
            bottomSheetBehavior.f0(4);
            return;
        }
        Lh().clearFocus();
        BottomSheetBehavior<View> bottomSheetBehavior3 = this.u;
        if (bottomSheetBehavior3 == null) {
            z65.z("pickUpPizzeriaButtonBehavior");
        } else {
            bottomSheetBehavior = bottomSheetBehavior3;
        }
        bottomSheetBehavior.f0(5);
    }

    @Override // defpackage.q8a
    public void S0(boolean z) {
        Lh().setMyLocationButtonEnabled(z);
    }

    @Override // defpackage.q8a
    public void T2(ru.dodopizza.app.presentation.selectpizzeria.g gVar) {
        z65.h(gVar, "vo");
        if (z65.c(gVar, g.a.a)) {
            un3.e(Kh());
            un3.e(Mh());
            un3.e(Fh());
            un3.e(Ph());
            un3.k(Dh());
        } else if (z65.c(gVar, g.b.a)) {
            un3.e(Kh());
            un3.e(Mh());
            un3.e(Fh());
            un3.e(Dh());
            un3.k(Ph());
        } else if (gVar instanceof g.d) {
            Lh().setPizzerias(((g.d) gVar).a());
            un3.e(Kh());
            un3.k(Mh());
            un3.k(Fh());
            un3.e(Dh());
            un3.e(Ph());
        } else if (gVar instanceof g.c) {
            g.c cVar = (g.c) gVar;
            Jh().setAdapter(new k6.a(new k6(cVar.a()), j.a, new z58(cVar.c(), cVar.b(), new l()), k.a).b().d());
            un3.k(Fh());
            un3.e(Dh());
            un3.e(Ph());
            un3.k(Kh());
            un3.e(Mh());
            ei();
        }
    }

    @Override // defpackage.q8a
    public void X0(ov5 ov5Var) {
        z65.h(ov5Var, "location");
        Lh().r(ov5Var.b(), ov5Var.c());
    }

    @Override // defpackage.q8a
    public void Y(if0 if0Var) {
        z65.h(if0Var, "boundingBox");
        Lh().setBoundingBox(fi(if0Var));
    }

    @Override // defpackage.q8a
    public void c() {
        String string = requireContext().getString(R.string.turn_on_geolocation);
        z65.g(string, "getString(...)");
        String string2 = requireContext().getString(R.string.cancel);
        z65.g(string2, "getString(...)");
        String string3 = requireContext().getString(R.string.settings);
        z65.g(string3, "getString(...)");
        tj1.e.a(string, string2, string3, "request_permission").show(getChildFragmentManager(), "request_permission");
    }

    @Override // defpackage.q8a
    public void cg() {
        Th().setTitle(getString(R.string.restaurant_delivery));
    }

    @Override // defpackage.tu6
    public void finish() {
        Nh().w(d.c.a);
    }

    @Override // defpackage.q8a
    public void h1(boolean z) {
        un3.o(Sh(), z);
    }

    @Override // defpackage.q8a
    public void j() {
        Toast.makeText(getContext(), (int) R.string.location_not_available, 1).show();
    }

    @Override // defpackage.q8a
    public void jd(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        Th().setTitle(str);
    }

    @Override // defpackage.q8a
    public void k() {
        sh0.d(pp5.a(this), null, null, new h(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 100 && i3 == -1) {
            k();
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
            a2.a(selectPizzeriaFeatureDependencies, (x7a) obj).a(this);
            super.onAttach(context);
        } else {
            throw new IllegalArgumentException("Argument with key = extra_key_select_pizzeria_data not found in bundle");
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Nh().w(d.c.a);
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
        RecyclerView Jh = Jh();
        v99 v99Var = v99.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        Jh.addItemDecoration(v99Var.c(requireContext));
        Th().setNavigationOnClickListener(new View.OnClickListener() { // from class: p7a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.Yh(e.this, view2);
            }
        });
        oma.a(Qh(), new d());
        if (Eh().a(bq3.r)) {
            un3.e(Ch());
            Nh().w(d.a.a);
        } else {
            Ch().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: q7a
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                    e.Zh(e.this, radioGroup, i2);
                }
            });
        }
        Lh().setOnPizzeriaTapListener(new C0640e());
        Lh().setOnMyLocationClickListener(new View.OnClickListener() { // from class: r7a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.ai(e.this, view2);
            }
        });
        Ih().setPhoneTextListener(new PizzeriaCard.a() { // from class: s7a
            @Override // ru.dodopizza.app.presentation.selectpizzeria.PizzeriaCard.a
            public final void a(String str) {
                e.bi(e.this, str);
            }
        });
        BottomSheetBehavior<View> B2 = BottomSheetBehavior.B(Gh());
        z65.g(B2, "from(...)");
        this.u = B2;
        BottomSheetBehavior<View> bottomSheetBehavior = null;
        if (B2 == null) {
            z65.z("pickUpPizzeriaButtonBehavior");
            B2 = null;
        }
        B2.Y(true);
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.u;
        if (bottomSheetBehavior2 == null) {
            z65.z("pickUpPizzeriaButtonBehavior");
            bottomSheetBehavior2 = null;
        }
        bottomSheetBehavior2.f0(5);
        BottomSheetBehavior<View> B3 = BottomSheetBehavior.B(Ah());
        z65.g(B3, "from(...)");
        this.t = B3;
        if (B3 == null) {
            z65.z("pizzeriaCardBehavior");
            B3 = null;
        }
        B3.Y(true);
        BottomSheetBehavior<View> bottomSheetBehavior3 = this.t;
        if (bottomSheetBehavior3 == null) {
            z65.z("pizzeriaCardBehavior");
            bottomSheetBehavior3 = null;
        }
        bottomSheetBehavior3.f0(5);
        BottomSheetBehavior<View> bottomSheetBehavior4 = this.t;
        if (bottomSheetBehavior4 == null) {
            z65.z("pizzeriaCardBehavior");
        } else {
            bottomSheetBehavior = bottomSheetBehavior4;
        }
        bottomSheetBehavior.s(new f());
        Bh().setOnClickListener(new View.OnClickListener() { // from class: t7a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.ci(e.this, view2);
            }
        });
        Rh().setOnClickListener(new View.OnClickListener() { // from class: u7a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.di(e.this, view2);
            }
        });
    }
}
