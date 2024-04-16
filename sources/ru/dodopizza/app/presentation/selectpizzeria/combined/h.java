package ru.dodopizza.app.presentation.selectpizzeria.combined;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.pickup.presentation.PickupPizzeriaVH;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c5c;
import defpackage.cw5;
import defpackage.k6;
import defpackage.o7a;
import defpackage.qv5;
import defpackage.rg4;
import defpackage.tj1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import ru.dodopizza.app.presentation.selectpizzeria.PizzeriaCard;
import ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies;
import ru.dodopizza.app.presentation.selectpizzeria.combined.a;
import ru.dodopizza.app.presentation.selectpizzeria.combined.filters.views.PizzeriaFilterViewHolder;
import ru.dodopizza.app.presentation.selectpizzeria.combined.g;
import ru.dodopizza.app.presentation.selectpizzeria.combined.h;
/* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 ×\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002Ø\u0001B\t¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b*\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020 H\u0014J\b\u0010(\u001a\u00020'H\u0014J\u001a\u0010+\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,H\u0016J\u0010\u00101\u001a\u00020\u00142\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00102\u001a\u00020\u00142\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00103\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u000204H\u0016J(\u0010=\u001a\u00020\u00142\u0006\u00107\u001a\u00020)2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u0012H\u0016J\u0010\u0010@\u001a\u00020\u00142\u0006\u0010?\u001a\u00020>H\u0016J\b\u0010A\u001a\u00020\u0014H\u0016J\b\u0010B\u001a\u00020\u0012H\u0016J\u0010\u0010E\u001a\u00020\u00142\u0006\u0010D\u001a\u00020CH\u0016J\b\u0010F\u001a\u00020\u0014H\u0016J\b\u0010G\u001a\u00020\u0014H\u0016J\b\u0010H\u001a\u00020\u0014H\u0016J\u0010\u0010J\u001a\u00020\u00142\u0006\u0010I\u001a\u00020\u0012H\u0016J\"\u0010O\u001a\u00020\u00142\u0006\u0010K\u001a\u00020'2\u0006\u0010L\u001a\u00020'2\b\u0010N\u001a\u0004\u0018\u00010MH\u0016J\b\u0010P\u001a\u00020\u0014H\u0016J\u0010\u0010R\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020>H\u0016J\u0010\u0010S\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020>H\u0016R\u001c\u0010W\u001a\n U*\u0004\u0018\u00010T0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010VR\u001b\u0010\\\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001b\u0010_\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010Y\u001a\u0004\b^\u0010[R\u001b\u0010b\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010Y\u001a\u0004\ba\u0010[R\u001b\u0010e\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010Y\u001a\u0004\bd\u0010[R\u001b\u0010h\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010Y\u001a\u0004\bg\u0010[R\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010Y\u001a\u0004\bk\u0010lR\u001b\u0010o\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010Y\u001a\u0004\bn\u0010lR\u001b\u0010r\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010Y\u001a\u0004\bq\u0010[R\u001b\u0010u\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010Y\u001a\u0004\bt\u0010[R\u001b\u0010w\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010Y\u001a\u0004\bv\u0010[R\u001b\u0010|\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010Y\u001a\u0004\bz\u0010{R\u001b\u0010~\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010Y\u001a\u0004\b}\u0010[R\u001d\u0010\u0081\u0001\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010Y\u001a\u0005\b\u0080\u0001\u0010[R\u001e\u0010\u0084\u0001\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010Y\u001a\u0005\b\u0083\u0001\u0010[R\u001e\u0010\u0087\u0001\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010Y\u001a\u0005\b\u0086\u0001\u0010[R\u001e\u0010\u008a\u0001\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010Y\u001a\u0005\b\u0089\u0001\u0010[R\u001e\u0010\u008d\u0001\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010Y\u001a\u0005\b\u008c\u0001\u0010[R\u001e\u0010\u0090\u0001\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010Y\u001a\u0005\b\u008f\u0001\u0010[R\u001e\u0010\u0093\u0001\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010Y\u001a\u0005\b\u0092\u0001\u0010[R\u001e\u0010\u0096\u0001\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010Y\u001a\u0005\b\u0095\u0001\u0010[R\u001e\u0010\u0099\u0001\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010Y\u001a\u0005\b\u0098\u0001\u0010[R\"\u0010\u009d\u0001\u001a\u000b\u0012\u0004\u0012\u00020 \u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010¥\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R1\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010¦\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R*\u0010³\u0001\u001a\f U*\u0005\u0018\u00010§\u00010§\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u001e\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001f\u0010º\u0001\u001a\n\u0012\u0005\u0012\u00030¸\u00010´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010¶\u0001R\u0018\u0010I\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0019\u0010½\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010µ\u0001R\u0018\u0010Á\u0001\u001a\u00030¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R!\u0010Æ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ã\u00010Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u001c\u0010É\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001a\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0019\u0010Î\u0001\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0019\u0010Ð\u0001\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÏ\u0001\u0010Í\u0001R\u0019\u0010Ò\u0001\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÑ\u0001\u0010Í\u0001R\u0019\u0010Ô\u0001\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÓ\u0001\u0010Í\u0001¨\u0006Ù\u0001"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/h;", "Lf70;", "Le9a;", "Lw50;", "Ltu6;", "Ln87;", "Ltj1$a;", "Lb68;", "pizzeriaVO", "Landroid/graphics/drawable/Drawable;", "Uh", "Loz3;", "Lqy7;", "ni", "Lcw5;", "mi", "Lqv5;", "li", "", "showNearbyRestaurantView", "", "Ci", "Bi", "zi", "Ai", "", "slideOffset", "yi", "ki", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "rootView", "ih", "", "hh", "Ld88;", "selectedPizzeria", "U0", "Lrg4;", "googleMap", "p6", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "d0", "x0", "c0", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", Image.TYPE_MEDIUM, "pizzeria", "Ljb7;", "operationalTypeVo", "Lgn3;", "pizzeriaType", "isShortStreetNameEnabled", "G", "", "phoneNumber", "K", "j", "onBackPressed", "Lru/dodopizza/app/presentation/selectpizzeria/combined/a;", "vo", "V0", "lg", "xa", "finish", "focusOnUser", "o", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", com.huawei.hms.opendevice.c.a, "id", "O8", "onCancel", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", DateTokenConverter.CONVERTER_KEY, "Lk79;", "fi", "()Landroid/view/View;", "progress", com.huawei.hms.push.e.a, "Ph", "errorContainer", "f", "gi", "refreshButton", "g", "Zh", "pizzeriaCardClose", Image.TYPE_HIGH, "ci", "pizzeriaListContainer", "Landroidx/recyclerview/widget/RecyclerView;", "i", "bi", "()Landroidx/recyclerview/widget/RecyclerView;", "pizzeriaList", "Qh", "filterList", "k", "Oh", "emptyPizzeriasView", "l", "Nh", "clearFiltersView", "ai", "pizzeriaCardContainer", "Lru/dodopizza/app/presentation/selectpizzeria/PizzeriaCard;", "n", "Yh", "()Lru/dodopizza/app/presentation/selectpizzeria/PizzeriaCard;", "pizzeriaCard", "Xh", "orderHereButtonContainer", "p", "Wh", "orderHereButton", "q", "Sh", "findNearestPizzeriasButtonContainer", "r", "Rh", "findNearestPizzeriasButton", Image.TYPE_SMALL, "Kh", "backButton", "t", "hi", "zoomInButton", "u", "ii", "zoomOutButton", "v", "Vh", "myLocationButton", "w", "Mh", "bottomSheetView", "x", "Lh", "bottomSheetBehaviorView", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "y", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "Lje4;", "z", "Lje4;", "Th", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "Las8;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaWithGoogleMapsPresenter;", "A", "Las8;", "ei", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "B", "Lmoxy/ktx/MoxyKtxDelegate;", "di", "()Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaWithGoogleMapsPresenter;", "presenter", "Ll6;", "I", "Ll6;", "pizzeriaAdapterList", "Lr88;", "X", "filterAdapterList", "Y", "Z", "previousBottomSheetState", "Ln66;", "S4", "Ln66;", "mapController", "", "Lm86;", "T4", "Ljava/util/List;", "pizzeriasMarkerList", "U4", "Lm86;", "userMarker", "V4", "Lb68;", "W4", "Landroid/graphics/drawable/Drawable;", "openDrawable", "X4", "focusedDrawable", "Y4", "closedDrawable", "Z4", "userDrawable", "<init>", "()V", "a5", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class h extends f70 implements e9a, w50, tu6, n87, tj1.a {
    public as8<SelectPizzeriaWithGoogleMapsPresenter> A;
    private final MoxyKtxDelegate B;
    private final l6<b68> I;
    private final n66 S4;
    private final List<m86> T4;
    private m86 U4;
    private b68 V4;
    private Drawable W4;
    private final l6<r88> X;
    private Drawable X4;
    private boolean Y;
    private Drawable Y4;
    private int Z;
    private Drawable Z4;
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
    private final k79 w;
    private final k79 x;
    private BottomSheetBehavior<View> y;
    public je4 z;
    static final /* synthetic */ je5<Object>[] b5 = {bc9.f(new ar8(h.class, "progress", "getProgress()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "errorContainer", "getErrorContainer()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "refreshButton", "getRefreshButton()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "pizzeriaCardClose", "getPizzeriaCardClose()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "pizzeriaListContainer", "getPizzeriaListContainer()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "pizzeriaList", "getPizzeriaList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(h.class, "filterList", "getFilterList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(h.class, "emptyPizzeriasView", "getEmptyPizzeriasView()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "clearFiltersView", "getClearFiltersView()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "pizzeriaCardContainer", "getPizzeriaCardContainer()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "pizzeriaCard", "getPizzeriaCard()Lru/dodopizza/app/presentation/selectpizzeria/PizzeriaCard;", 0)), bc9.f(new ar8(h.class, "orderHereButtonContainer", "getOrderHereButtonContainer()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "orderHereButton", "getOrderHereButton()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "findNearestPizzeriasButtonContainer", "getFindNearestPizzeriasButtonContainer()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "findNearestPizzeriasButton", "getFindNearestPizzeriasButton()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "backButton", "getBackButton()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "zoomInButton", "getZoomInButton()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "zoomOutButton", "getZoomOutButton()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "myLocationButton", "getMyLocationButton()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "bottomSheetView", "getBottomSheetView()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "bottomSheetBehaviorView", "getBottomSheetBehaviorView()Landroid/view/View;", 0)), bc9.f(new ar8(h.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaWithGoogleMapsPresenter;", 0))};
    public static final a a5 = new a(null);

    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\b¨\u0006\u0018"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/h$a;", "", "Lx7a;", "data", "Lru/dodopizza/app/presentation/selectpizzeria/combined/h;", "a", "", "DEFAULT_BOTTOM_SHEET_PEEK_HEIGHT", "I", "", "DEFAULT_EMPTY_VIEW_BIAS", "F", "DEFAULT_PEEK_PART", "DEFAULT_SLIDE_FACTOR", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "FILTERS_VIEW_HEIGHT", "FIND_BUTTON_CONTAINER_HEIGHT", "FULL_ALPHA", "REQUEST_CODE_ENABLE_LOCATION_PROVIDERS", "ZERO", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(x7a x7aVar) {
            z65.h(x7aVar, "data");
            return (h) y64.d(new h(), bi0.c(bi0.d("extra_key_select_pizzeria_data", x7aVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsFragment$lastOrSingleRequestLocation$1", f = "SelectPizzeriaWithGoogleMapsFragment.kt", l = {555}, m = "invokeSuspend")
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
    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsFragment$locationPermissionFlow$1", f = "SelectPizzeriaWithGoogleMapsFragment.kt", l = {}, m = "invokeSuspend")
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
                ru.dodopizza.app.presentation.selectpizzeria.combined.h r5 = ru.dodopizza.app.presentation.selectpizzeria.combined.h.this
                ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsPresenter r5 = ru.dodopizza.app.presentation.selectpizzeria.combined.h.Ch(r5)
                ru.dodopizza.app.presentation.selectpizzeria.combined.g$g r0 = ru.dodopizza.app.presentation.selectpizzeria.combined.g.C0637g.a
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
            throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectpizzeria.combined.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
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

    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"ru/dodopizza/app/presentation/selectpizzeria/combined/h$f", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", com.huawei.hms.opendevice.c.a, "", "slideOffset", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f extends BottomSheetBehavior.f {
        f() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f) {
            int c;
            z65.h(view, "bottomSheet");
            boolean z = true;
            float f2 = 1 - f;
            h.this.Kh().setAlpha(Math.abs(f2));
            View Kh = h.this.Kh();
            c = la6.c(f2);
            if (c != 1) {
                z = false;
            }
            Kh.setEnabled(z);
            h.this.hi().setAlpha(Math.abs(f2));
            h.this.ii().setAlpha(Math.abs(f2));
            h.this.Vh().setAlpha(Math.abs(f2));
            h.this.yi(f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i) {
            z65.h(view, "bottomSheet");
            if (i == 4 && h.this.ci().getVisibility() == 0) {
                h.this.di().w(g.n.a);
            }
            if (i == 3 && h.this.ci().getVisibility() == 0) {
                h.this.di().w(g.o.a);
            }
            if (h.this.Z == i && i == 4) {
                h.this.di().w(g.t.a);
            }
            if (i != 1 && i != 2) {
                h.this.Z = i;
            }
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr88;", "filterVO", "", "<anonymous parameter 1>", "", "a", "(Lr88;I)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function2<r88, Integer, Unit> {
        g() {
            super(2);
        }

        public final void a(r88 r88Var, int i) {
            z65.h(r88Var, "filterVO");
            h.this.di().w(new g.b(r88Var));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(r88 r88Var, Integer num) {
            a(r88Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ru/dodopizza/app/presentation/selectpizzeria/combined/h$h", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.h$h  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC0638h implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View a;
        final /* synthetic */ h b;

        ViewTreeObserver$OnGlobalLayoutListenerC0638h(View view, h hVar) {
            this.a = view;
            this.b = hVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int height;
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BottomSheetBehavior bottomSheetBehavior = this.b.y;
            if (bottomSheetBehavior != null) {
                if (this.b.ci().getVisibility() == 0) {
                    height = this.a.getHeight() / 3;
                } else {
                    height = (this.a.getHeight() / 3) - jx9.a.a(60);
                }
                bottomSheetBehavior.b0(height);
            }
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"ru/dodopizza/app/presentation/selectpizzeria/combined/h$i", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
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
            if (i == 0 && (bottomSheetBehavior = h.this.y) != null && h.this.Z == bottomSheetBehavior.G() && (bottomSheetBehavior2 = h.this.y) != null && bottomSheetBehavior2.G() == 4) {
                h.this.di().w(g.t.a);
            }
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class j extends ej5 implements Function1<View, Unit> {
        j() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            h.this.di().w(g.r.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaWithGoogleMapsPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaWithGoogleMapsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class k extends ej5 implements Function0<SelectPizzeriaWithGoogleMapsPresenter> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SelectPizzeriaWithGoogleMapsPresenter invoke() {
            return h.this.ei().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsFragment$requestLocation$1", f = "SelectPizzeriaWithGoogleMapsFragment.kt", l = {489}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "Loz3;", "Lcw5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsFragment$requestLocation$1$1", f = "SelectPizzeriaWithGoogleMapsFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends f3b implements Function2<qy7, cv1<? super oz3<? extends cw5>>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ h c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.c = hVar;
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
                                return this.c.mi();
                            }
                        }
                    }
                    return wz3.A(cw5.b.a);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsFragment$requestLocation$1$2", f = "SelectPizzeriaWithGoogleMapsFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class b extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ h c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, cv1<? super b> cv1Var) {
                super(3, cv1Var);
                this.c = hVar;
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
        /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "result", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class c<T> implements pz3 {
            final /* synthetic */ h a;
            final /* synthetic */ boolean b;

            c(h hVar, boolean z) {
                this.a = hVar;
                this.b = z;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                if (cw5Var instanceof cw5.d) {
                    cw5.d dVar = (cw5.d) cw5Var;
                    this.a.di().w(new g.i(new ov5(dVar.a().getLatitude(), dVar.a().getLongitude(), null, null, 12, null), this.b));
                } else if (cw5Var instanceof cw5.a) {
                    this.a.di().w(g.f.a);
                } else if (!z65.c(cw5Var, cw5.b.a) && (cw5Var instanceof cw5.c)) {
                    gw5.a((cw5.c) cw5Var, this.a, 100);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z, cv1<? super l> cv1Var) {
            super(2, cv1Var);
            this.c = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new l(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((l) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 h = wz3.h(wz3.x(h.this.ni(), new a(h.this, null)), new b(h.this, null));
                c cVar = new c(h.this, this.c);
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
    public static final class m extends ej5 implements Function1<Object, Boolean> {
        public static final m a = new m();

        public m() {
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
            Object newInstance = PickupPizzeriaVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm86;", "marker", "", "a", "(Lm86;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class o extends ej5 implements Function1<m86, Boolean> {
        final /* synthetic */ ru.dodopizza.app.presentation.selectpizzeria.combined.a a;
        final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(ru.dodopizza.app.presentation.selectpizzeria.combined.a aVar, h hVar) {
            super(1);
            this.a = aVar;
            this.b = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(m86 m86Var) {
            Object obj;
            z65.h(m86Var, "marker");
            Iterator<T> it = ((a.c) this.a).a().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((b68) obj).d(), m86Var.c())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            b68 b68Var = (b68) obj;
            if (b68Var != null) {
                this.b.di().w(new g.q(b68Var));
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
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

    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb68;", "pizzeriaVO", "", "position", "", "a", "(Lb68;I)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class q extends ej5 implements Function2<b68, Integer, Unit> {
        q() {
            super(2);
        }

        public final void a(b68 b68Var, int i) {
            z65.h(b68Var, "pizzeriaVO");
            h.this.di().w(new g.p(b68Var.g(), i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(b68 b68Var, Integer num) {
            a(b68Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsFragment.kt */
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

    public h() {
        super(R.layout.fragment_select_pizzeria_with_google_maps);
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
        this.m = kb0.e(this, R.id.pizzeria_card_container);
        this.n = kb0.e(this, R.id.pizzeria_card);
        this.o = kb0.e(this, R.id.order_here_button_container);
        this.p = kb0.e(this, R.id.order_here_button);
        this.q = kb0.e(this, R.id.find_nearest_pizzerias_button_container);
        this.r = kb0.e(this, R.id.find_nearest_pizzerias_button);
        this.s = kb0.e(this, R.id.back_button);
        this.t = kb0.e(this, R.id.zoom_in);
        this.u = kb0.e(this, R.id.zoom_out);
        this.v = kb0.e(this, R.id.my_location_button);
        this.w = kb0.e(this, R.id.bottom_sheet_view);
        this.x = kb0.e(this, R.id.bottom_sheet_behavior_view);
        k kVar = new k();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.B = new MoxyKtxDelegate(mvpDelegate, SelectPizzeriaWithGoogleMapsPresenter.class.getName() + ".presenter", kVar);
        this.I = new l6<>(null, 1, null);
        this.X = new l6<>(null, 1, null);
        this.Z = 4;
        this.S4 = new n66();
        this.T4 = new ArrayList();
    }

    private final void Ai(boolean z) {
        int i2;
        int i3;
        syb.H0(bi(), true);
        View view = getView();
        if (view != null) {
            i2 = view.getHeight() / 3;
        } else {
            i2 = 230;
        }
        BottomSheetBehavior<View> bottomSheetBehavior = this.y;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.b0(i2);
        }
        un3.o(Oh(), this.I.isEmpty());
        un3.o(bi(), true ^ this.I.isEmpty());
        un3.o(Sh(), z);
        View ci = ci();
        if (z) {
            i3 = jx9.a.a(80);
        } else {
            i3 = 0;
        }
        p45.l(ci, 0, 0, 0, i3, 7, null);
        this.S4.x(0, i2);
    }

    private final void Bi() {
        zi();
        un3.e(ci());
        un3.k(ai());
        un3.e(Sh());
        un3.k(Xh());
        un3.k(Mh());
    }

    private final void Ci(boolean z) {
        Ai(z);
        un3.e(ai());
        un3.e(Xh());
        un3.k(ci());
        un3.k(Mh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Kh() {
        return (View) this.s.a(this, b5[15]);
    }

    private final View Lh() {
        return (View) this.x.a(this, b5[20]);
    }

    private final View Mh() {
        return (View) this.w.a(this, b5[19]);
    }

    private final View Nh() {
        return (View) this.l.a(this, b5[8]);
    }

    private final View Oh() {
        return (View) this.k.a(this, b5[7]);
    }

    private final View Ph() {
        return (View) this.e.a(this, b5[1]);
    }

    private final RecyclerView Qh() {
        return (RecyclerView) this.j.a(this, b5[6]);
    }

    private final View Rh() {
        return (View) this.r.a(this, b5[14]);
    }

    private final View Sh() {
        return (View) this.q.a(this, b5[13]);
    }

    private final Drawable Uh(b68 b68Var) {
        Drawable drawable;
        if (ov9.f(b68Var.g().H(), b68Var.g().L()) && b68Var.f() != jb7.e) {
            drawable = this.W4;
            if (drawable == null) {
                z65.z("openDrawable");
                return null;
            }
        } else {
            drawable = this.Y4;
            if (drawable == null) {
                z65.z("closedDrawable");
                return null;
            }
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Vh() {
        return (View) this.v.a(this, b5[18]);
    }

    private final View Wh() {
        return (View) this.p.a(this, b5[12]);
    }

    private final View Xh() {
        return (View) this.o.a(this, b5[11]);
    }

    private final PizzeriaCard Yh() {
        return (PizzeriaCard) this.n.a(this, b5[10]);
    }

    private final View Zh() {
        return (View) this.g.a(this, b5[3]);
    }

    private final View ai() {
        return (View) this.m.a(this, b5[9]);
    }

    private final RecyclerView bi() {
        return (RecyclerView) this.i.a(this, b5[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View ci() {
        return (View) this.h.a(this, b5[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectPizzeriaWithGoogleMapsPresenter di() {
        return (SelectPizzeriaWithGoogleMapsPresenter) this.B.getValue(this, b5[21]);
    }

    private final View fi() {
        return (View) this.d.a(this, b5[0]);
    }

    private final View gi() {
        return (View) this.f.a(this, b5[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View hi() {
        return (View) this.t.a(this, b5[16]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View ii() {
        return (View) this.u.a(this, b5[17]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5c ji(int i2, View view, c5c c5cVar) {
        z65.h(view, "view");
        z65.h(c5cVar, "insets");
        n45 f2 = c5cVar.f(c5c.m.d());
        z65.g(f2, "getInsets(...)");
        p45.l(view, 0, 0, 0, i2 + f2.d, 7, null);
        p45.j(view, 0, 0, 0, 0, 13, null);
        return c5cVar;
    }

    private final void ki() {
        this.W4 = (Drawable) mh5.b(iu1.e(requireContext(), R.drawable.ic_pizzeria_open), "Can't find R.drawable.ic_pizzeria_open");
        this.X4 = (Drawable) mh5.b(iu1.e(requireContext(), R.drawable.ic_pizzeria_active), "Can't find R.drawable.ic_pizzeria_active");
        this.Y4 = (Drawable) mh5.b(iu1.e(requireContext(), R.drawable.ic_pizzeria_dark_close), "Can't find R.drawable.ic_pizzeria_close");
        this.Z4 = (Drawable) mh5.b(iu1.e(requireContext(), bx8.i0), "Can't find R.drawable.user");
    }

    private final oz3<cw5> li(qv5 qv5Var) {
        return wz3.G(qv5Var.a(), new b(qv5Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<cw5> mi() {
        return li(qv5.a.a(Th()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<qy7> ni() {
        return wz3.F(ky7.a.a(this).a("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oi(h hVar, rg4 rg4Var) {
        z65.h(hVar, "this$0");
        z65.h(rg4Var, "$googleMap");
        if (!hVar.isAdded()) {
            return;
        }
        n66 n66Var = hVar.S4;
        Context requireContext = hVar.requireContext();
        z65.g(requireContext, "requireContext(...)");
        n66Var.p(rg4Var, requireContext);
        hVar.di().w(g.j.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pi(h hVar, String str) {
        z65.h(hVar, "this$0");
        SelectPizzeriaWithGoogleMapsPresenter di = hVar.di();
        z65.e(str);
        di.w(new g.m(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qi(h hVar, View view) {
        z65.h(hVar, "this$0");
        hVar.di().w(g.a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ri(h hVar, View view) {
        z65.h(hVar, "this$0");
        hVar.di().w(g.k.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void si(h hVar, View view) {
        z65.h(hVar, "this$0");
        hVar.di().w(g.l.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ti(h hVar, View view) {
        z65.h(hVar, "this$0");
        hVar.di().w(g.h.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ui(h hVar, View view) {
        z65.h(hVar, "this$0");
        hVar.di().w(g.c.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vi(h hVar, View view) {
        d88 d88Var;
        z65.h(hVar, "this$0");
        SelectPizzeriaWithGoogleMapsPresenter di = hVar.di();
        b68 b68Var = hVar.V4;
        if (b68Var != null) {
            d88Var = b68Var.g();
        } else {
            d88Var = null;
        }
        di.w(new g.e(d88Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wi(h hVar, View view) {
        z65.h(hVar, "this$0");
        hVar.di().w(g.s.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xi(h hVar, View view) {
        z65.h(hVar, "this$0");
        hVar.di().w(g.d.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yi(float f2) {
        ConstraintLayout.b bVar;
        float max = Math.max(0.12f, f2 / 2);
        ViewGroup.LayoutParams layoutParams = Oh().getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            bVar = (ConstraintLayout.b) layoutParams;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.G = max;
        }
        Oh().setLayoutParams(bVar);
    }

    private final void zi() {
        int a2;
        syb.H0(bi(), false);
        View view = getView();
        if (view != null) {
            a2 = (view.getHeight() / 3) - jx9.a.a(60);
        } else {
            a2 = 230 - jx9.a.a(60);
        }
        BottomSheetBehavior<View> bottomSheetBehavior = this.y;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.b0(a2);
        }
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.y;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f0(4);
        }
        this.S4.x(0, a2);
    }

    @Override // defpackage.e9a
    public void G(d88 d88Var, jb7 jb7Var, gn3 gn3Var, boolean z) {
        boolean z2;
        z65.h(d88Var, "pizzeria");
        z65.h(jb7Var, "operationalTypeVo");
        z65.h(gn3Var, "pizzeriaType");
        Yh().S(d88Var, jb7Var, gn3Var, Boolean.valueOf(z));
        View Wh = Wh();
        if (jb7Var != jb7.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        Wh.setEnabled(z2);
    }

    @Override // defpackage.e9a
    public void K(String str) {
        z65.h(str, "phoneNumber");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.f(requireContext, str);
    }

    @Override // defpackage.tj1.a
    public void O8(String str) {
        z65.h(str, "id");
        Context context = getContext();
        if (context != null) {
            av1.c(context);
        }
    }

    public final je4 Th() {
        je4 je4Var = this.z;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    @Override // defpackage.e9a
    public void U0(d88 d88Var, boolean z) {
        if (d88Var != null) {
            Bi();
        } else {
            Ci(z);
        }
    }

    @Override // defpackage.e9a
    public void V0(ru.dodopizza.app.presentation.selectpizzeria.combined.a aVar) {
        z65.h(aVar, "vo");
        if (z65.c(aVar, a.C0632a.a)) {
            un3.e(Mh());
            un3.e(fi());
            un3.k(Ph());
        } else if (z65.c(aVar, a.b.a)) {
            un3.e(Mh());
            un3.e(Ph());
            un3.k(fi());
        } else if (aVar instanceof a.c) {
            this.S4.v(new o(aVar, this));
            this.S4.i();
            this.T4.clear();
            m86 m86Var = this.U4;
            if (m86Var != null) {
                n66 n66Var = this.S4;
                Drawable drawable = this.Z4;
                if (drawable == null) {
                    z65.z("userDrawable");
                    drawable = null;
                }
                n66Var.e(m86Var, drawable);
            }
            a.c cVar = (a.c) aVar;
            for (b68 b68Var : cVar.a()) {
                this.T4.add(this.S4.d(uv5.a(b68Var.g().x()), Uh(b68Var), b68Var.g().getId()));
            }
            this.I.Z(cVar.a(), p.a);
            bi().setAdapter(new k6.a(new k6(this.I), m.a, new z58(cVar.d(), cVar.c(), new q()), n.a).b().d());
            this.X.Z(cVar.b(), r.a);
            un3.e(Ph());
            un3.e(fi());
        }
    }

    @Override // defpackage.e9a
    public void c() {
        String string = requireContext().getString(R.string.turn_on_geolocation);
        z65.g(string, "getString(...)");
        String string2 = requireContext().getString(R.string.cancel);
        z65.g(string2, "getString(...)");
        String string3 = requireContext().getString(R.string.settings);
        z65.g(string3, "getString(...)");
        tj1.e.a(string, string2, string3, "request_permission").show(getChildFragmentManager(), "request_permission");
    }

    @Override // defpackage.e9a
    public void c0(b68 b68Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        z65.h(b68Var, "pizzeriaVO");
        b68 b68Var2 = this.V4;
        Drawable drawable = null;
        if (b68Var2 != null) {
            Iterator<T> it = this.T4.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj3 = it.next();
                    m86 m86Var = (m86) obj3;
                    if (m86Var != null) {
                        obj4 = m86Var.c();
                    } else {
                        obj4 = null;
                    }
                    if (z65.c(obj4, b68Var2.g().getId())) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            m86 m86Var2 = (m86) obj3;
            if (m86Var2 != null) {
                m86Var2.g(this.S4.m(Uh(b68Var2)));
            }
        }
        Iterator<T> it2 = this.T4.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                m86 m86Var3 = (m86) obj;
                if (m86Var3 != null) {
                    obj2 = m86Var3.c();
                } else {
                    obj2 = null;
                }
                if (z65.c(obj2, b68Var.g().getId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        m86 m86Var4 = (m86) obj;
        if (m86Var4 != null) {
            m86Var4.f();
            this.T4.remove(m86Var4);
        }
        List<m86> list = this.T4;
        n66 n66Var = this.S4;
        LatLng a2 = uv5.a(b68Var.g().x());
        Drawable drawable2 = this.X4;
        if (drawable2 == null) {
            z65.z("focusedDrawable");
        } else {
            drawable = drawable2;
        }
        list.add(n66Var.d(a2, drawable, b68Var.g().getId()));
        this.V4 = b68Var;
    }

    @Override // defpackage.e9a
    public void d0(LatLng latLng) {
        z65.h(latLng, "latLng");
        n66.C(this.S4, latLng, false, 2, null);
    }

    public final as8<SelectPizzeriaWithGoogleMapsPresenter> ei() {
        as8<SelectPizzeriaWithGoogleMapsPresenter> as8Var = this.A;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.tu6
    public void finish() {
        di().w(g.a.a);
    }

    @Override // defpackage.f70
    protected int hh() {
        return R.color.transparent;
    }

    @Override // defpackage.f70
    protected void ih(View view) {
        z65.h(view, "rootView");
        final int paddingBottom = view.getPaddingBottom();
        syb.I0(view, new h77() { // from class: r8a
            @Override // defpackage.h77
            public final c5c a(View view2, c5c c5cVar) {
                c5c ji;
                ji = h.ji(paddingBottom, view2, c5cVar);
                return ji;
            }
        });
    }

    @Override // defpackage.e9a
    public void j() {
        Toast.makeText(getContext(), (int) R.string.location_not_available, 1).show();
    }

    @Override // defpackage.e9a
    public void lg() {
        this.S4.E();
        ii().setEnabled(true);
        hi().setEnabled(this.S4.s());
    }

    @Override // defpackage.e9a
    public void m(LatLngBounds latLngBounds) {
        z65.h(latLngBounds, "bounds");
        this.S4.z(latLngBounds);
    }

    @Override // defpackage.e9a
    public void o(boolean z) {
        this.Y = z;
        sh0.d(pp5.a(this), null, null, new l(z, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 100 && i3 == -1) {
            o(this.Y);
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
            a2.a(selectPizzeriaFeatureDependencies, (x7a) obj).b(this);
            super.onAttach(context);
        } else {
            throw new IllegalArgumentException("Argument with key = extra_key_select_pizzeria_data not found in bundle");
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        di().w(g.a.a);
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
        ki();
        RecyclerView bi = bi();
        v99 v99Var = v99.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        bi.addItemDecoration(v99Var.c(requireContext));
        oma.a(gi(), new j());
        Fragment k0 = getChildFragmentManager().k0(R.id.pizzeria_address_map);
        z65.f(k0, "null cannot be cast to non-null type com.google.android.gms.maps.SupportMapFragment");
        ((SupportMapFragment) k0).gh(this);
        Yh().setPhoneTextListener(new PizzeriaCard.a() { // from class: t8a
            @Override // ru.dodopizza.app.presentation.selectpizzeria.PizzeriaCard.a
            public final void a(String str) {
                h.pi(h.this, str);
            }
        });
        Kh().setOnClickListener(new View.OnClickListener() { // from class: u8a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.qi(h.this, view2);
            }
        });
        hi().setOnClickListener(new View.OnClickListener() { // from class: v8a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.ri(h.this, view2);
            }
        });
        ii().setOnClickListener(new View.OnClickListener() { // from class: w8a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.si(h.this, view2);
            }
        });
        Vh().setOnClickListener(new View.OnClickListener() { // from class: x8a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.ti(h.this, view2);
            }
        });
        Nh().setOnClickListener(new View.OnClickListener() { // from class: y8a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.ui(h.this, view2);
            }
        });
        Wh().setOnClickListener(new View.OnClickListener() { // from class: z8a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.vi(h.this, view2);
            }
        });
        Rh().setOnClickListener(new View.OnClickListener() { // from class: a9a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.wi(h.this, view2);
            }
        });
        Zh().setOnClickListener(new View.OnClickListener() { // from class: b9a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.xi(h.this, view2);
            }
        });
        BottomSheetBehavior<View> B = BottomSheetBehavior.B(Lh());
        this.y = B;
        if (B != null) {
            B.s(new f());
        }
        Qh().setAdapter(new k6.a(new k6(this.X), d.a, new j88(new g()), e.a).b().d());
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0638h(view, this));
        bi().addOnScrollListener(new i());
    }

    @Override // defpackage.n87
    public void p6(final rg4 rg4Var) {
        z65.h(rg4Var, "googleMap");
        rg4Var.l(MapStyleOptions.h(requireContext(), R.raw.map_style));
        rg4Var.p(new rg4.f() { // from class: s8a
            @Override // defpackage.rg4.f
            public final void a() {
                h.oi(h.this, rg4Var);
            }
        });
    }

    @Override // defpackage.e9a
    public void x0(LatLng latLng) {
        z65.h(latLng, "latLng");
        n66 n66Var = this.S4;
        Drawable drawable = this.Z4;
        if (drawable == null) {
            z65.z("userDrawable");
            drawable = null;
        }
        this.U4 = n66.f(n66Var, latLng, drawable, null, 4, null);
    }

    @Override // defpackage.e9a
    public void xa() {
        this.S4.F();
        hi().setEnabled(true);
        ii().setEnabled(this.S4.t());
    }
}
