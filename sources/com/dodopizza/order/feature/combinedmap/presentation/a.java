package com.dodopizza.order.feature.combinedmap.presentation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.textinputlayout.DodoEditText;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.suggestions.presentation.g;
import com.dodopizza.order.feature.combinedmap.CombinedSelectionMapFeatureDependencies;
import com.dodopizza.order.feature.combinedmap.filters.views.PizzeriaFilterViewHolder;
import com.dodopizza.order.feature.combinedmap.presentation.a;
import com.dodopizza.order.feature.selectionmap.presentation.c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.ny2;
import defpackage.tmb;
import defpackage.xf1;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: CombinedSelectionMapFragment.kt */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 ·\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002¸\u0001B\t¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J,\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\bH\u0002J\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016J\u001a\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\u0012\u0010,\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*H\u0016J\u0018\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J\b\u00103\u001a\u00020\u0004H\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0016J\b\u00107\u001a\u00020\u0004H\u0016J\b\u00108\u001a\u00020\u0004H\u0016J\b\u00109\u001a\u00020\u0004H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010=\u001a\u00020\u0004H\u0016J\u0018\u0010@\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010?\u001a\u00020>H\u0016J\u0018\u0010C\u001a\u00020\u00042\u0006\u0010A\u001a\u00020>2\u0006\u0010B\u001a\u00020>H\u0016J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010D\u001a\u00020>H\u0016J\b\u0010F\u001a\u00020\u000eH\u0016R\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010I\u001a\u0004\bT\u0010UR\u001b\u0010Z\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010I\u001a\u0004\bX\u0010YR\u001b\u0010]\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010YR\u001b\u0010`\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010I\u001a\u0004\b_\u0010YR\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010I\u001a\u0004\bc\u0010dR\u001b\u0010h\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010I\u001a\u0004\bg\u0010YR\u001b\u0010k\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010I\u001a\u0004\bj\u0010YR\u001e\u0010o\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u001b\u0010r\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010I\u001a\u0004\bq\u0010YR\u001b\u0010u\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010I\u001a\u0004\bt\u0010YR\u001b\u0010z\u001a\u00020v8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010I\u001a\u0004\bx\u0010yR\u001b\u0010\u007f\u001a\u00020{8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010I\u001a\u0004\b}\u0010~R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010I\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0087\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010I\u001a\u0006\b\u0086\u0001\u0010\u0083\u0001R \u0010\u008c\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010I\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u0091\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008e\u0001\u0010I\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0096\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0093\u0001\u0010I\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001e\u0010\u0099\u0001\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010I\u001a\u0005\b\u0098\u0001\u0010YR \u0010\u009e\u0001\u001a\u00030\u009a\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009b\u0001\u0010I\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001d\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020*088\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R1\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010¦\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R+\u0010´\u0001\u001a\r ¯\u0001*\u0005\u0018\u00010§\u00010§\u00018@X\u0080\u0084\u0002¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001¨\u0006¹\u0001"}, d2 = {"Lcom/dodopizza/order/feature/combinedmap/presentation/a;", "Lf70;", "Lpg1;", "Lw50;", "", "pi", "ni", "hi", "Lev2;", "data", "Ldt5;", "locality", "Le91;", "clientDeliveryLocation", "", "isFromSuggestions", "ri", "gi", "ji", "Bh", "mi", "li", "Ch", "ki", "Lcom/dodopizza/order/feature/selectionmap/presentation/c$c;", "vo", "ti", "openSuggestionsData", "fi", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "onViewCreated", "Oe", "x5", "T8", "Ls88;", "filterVO", "c5", "Ld88;", "pizzeria", "", "position", "Y7", "L9", "n1", "Lt88;", "pizzeriaInfo", "tb", "D9", "l6", "Wf", "V1", "C3", "Y5", "q4", "", "localityId", "pd", tmb.c.COUNTRY_JSON_NAME, "flag", "qg", "phoneNumber", "K", "onBackPressed", "Lcom/dodopizza/android/textinputlayout/DodoEditText;", com.huawei.hms.opendevice.c.a, "Lk79;", "Wh", "()Lcom/dodopizza/android/textinputlayout/DodoEditText;", "searchField", "Landroidx/recyclerview/widget/RecyclerView;", DateTokenConverter.CONVERTER_KEY, "Kh", "()Landroidx/recyclerview/widget/RecyclerView;", "filterList", "Landroid/widget/LinearLayout;", com.huawei.hms.push.e.a, "Vh", "()Landroid/widget/LinearLayout;", "searchContainer", "f", "Eh", "()Landroid/view/View;", "bottomSheetView", "g", "Dh", "bottomSheetBehaviorView", Image.TYPE_HIGH, "Sh", "pizzeriaCardContainer", "Lcom/dodopizza/order/feature/combinedmap/presentation/PizzeriaCard;", "i", "Qh", "()Lcom/dodopizza/order/feature/combinedmap/presentation/PizzeriaCard;", "pizzeriaCard", "j", "Ph", "orderHereButtonContainer", "k", "Oh", "orderHereButton", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "l", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", Image.TYPE_MEDIUM, "Rh", "pizzeriaCardClose", "n", "Jh", "dimView", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "o", "Fh", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "closeButton", "Landroid/widget/RadioGroup;", "p", "Nh", "()Landroid/widget/RadioGroup;", "mapSwitcher", "Landroid/widget/RadioButton;", "q", "Yh", "()Landroid/widget/RadioButton;", "switchPizzeria", "r", "Xh", "switchDelivery", "Landroidx/fragment/app/FragmentContainerView;", Image.TYPE_SMALL, "Mh", "()Landroidx/fragment/app/FragmentContainerView;", "mapContainer", "Landroid/widget/ImageView;", "t", "Lh", "()Landroid/widget/ImageView;", "flagView", "Landroid/widget/TextView;", "u", "Ih", "()Landroid/widget/TextView;", "countryView", "v", "Hh", "countrySelectButton", "Landroid/widget/FrameLayout;", "w", "Gh", "()Landroid/widget/FrameLayout;", "contentContainer", "x", "Ll6;", "filterAdapterList", "Lcom/dodopizza/order/feature/selectionmap/presentation/e;", "y", "Lcom/dodopizza/order/feature/selectionmap/presentation/e;", "selectionMapFragment", "Las8;", "Lcom/dodopizza/order/feature/combinedmap/presentation/CombinedSelectionMapPresenter;", "z", "Las8;", "Uh", "()Las8;", "setPresenterProvider$order_release", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "A", "Lmoxy/ktx/MoxyKtxDelegate;", "Th", "()Lcom/dodopizza/order/feature/combinedmap/presentation/CombinedSelectionMapPresenter;", "presenter", "<init>", "()V", "B", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a extends f70 implements pg1, w50 {
    private final MoxyKtxDelegate A;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private BottomSheetBehavior<View> l;
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
    private final l6<s88> x;
    private com.dodopizza.order.feature.selectionmap.presentation.e y;
    public as8<CombinedSelectionMapPresenter> z;
    static final /* synthetic */ je5<Object>[] I = {bc9.f(new ar8(a.class, "searchField", "getSearchField()Lcom/dodopizza/android/textinputlayout/DodoEditText;", 0)), bc9.f(new ar8(a.class, "filterList", "getFilterList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(a.class, "searchContainer", "getSearchContainer()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(a.class, "bottomSheetView", "getBottomSheetView()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "bottomSheetBehaviorView", "getBottomSheetBehaviorView()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "pizzeriaCardContainer", "getPizzeriaCardContainer()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "pizzeriaCard", "getPizzeriaCard()Lcom/dodopizza/order/feature/combinedmap/presentation/PizzeriaCard;", 0)), bc9.f(new ar8(a.class, "orderHereButtonContainer", "getOrderHereButtonContainer()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "orderHereButton", "getOrderHereButton()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "pizzeriaCardClose", "getPizzeriaCardClose()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "dimView", "getDimView()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "closeButton", "getCloseButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", 0)), bc9.f(new ar8(a.class, "mapSwitcher", "getMapSwitcher()Landroid/widget/RadioGroup;", 0)), bc9.f(new ar8(a.class, "switchPizzeria", "getSwitchPizzeria()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(a.class, "switchDelivery", "getSwitchDelivery()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(a.class, "mapContainer", "getMapContainer()Landroidx/fragment/app/FragmentContainerView;", 0)), bc9.f(new ar8(a.class, "flagView", "getFlagView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(a.class, "countryView", "getCountryView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "countrySelectButton", "getCountrySelectButton()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "contentContainer", "getContentContainer()Landroid/widget/FrameLayout;", 0)), bc9.f(new ar8(a.class, "presenter", "getPresenter$order_release()Lcom/dodopizza/order/feature/combinedmap/presentation/CombinedSelectionMapPresenter;", 0))};
    public static final C0173a B = new C0173a(null);
    public static final int X = 8;

    /* compiled from: CombinedSelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/order/feature/combinedmap/presentation/a$a;", "", "Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "arguments", "Lcom/dodopizza/order/feature/combinedmap/presentation/a;", "a", "", "ADDRESS_DETAILS_FRAGMENT", "Ljava/lang/String;", "ARG_SELECTED_INITIAL_DATA", "", "BOTTOM_SHEET_OFFSET_IN_DP", "I", "", "BRING_TO_FRONT_Z_INDEX", "F", "DEFAULT_PEEK_PART", "DELIVERY_ADDRESS_MAP_OFFSET", "DELIVERY_ADDRESS_MAP_PADDING", "SELECTION_MAP_FRAGMENT_TAG", "SUGGESTIONS_FRAGMENT_TAG", "SUGGESTIONS_TOP_PADDING", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.order.feature.combinedmap.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0173a {
        private C0173a() {
        }

        public /* synthetic */ C0173a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(com.dodopizza.order.feature.selectionmap.presentation.f fVar) {
            z65.h(fVar, "arguments");
            return (a) y64.d(new a(), bi0.c(bi0.d("arg_selected_initial_data", fVar)));
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function1<Object, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof s88);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final c a = new c();

        public c() {
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

    /* compiled from: CombinedSelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.Th().N();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CombinedSelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls88;", "filterVO", "", "<anonymous parameter 1>", "", "a", "(Ls88;I)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function2<s88, Integer, Unit> {
        e() {
            super(2);
        }

        public final void a(s88 s88Var, int i) {
            z65.h(s88Var, "filterVO");
            a.this.c5(s88Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(s88 s88Var, Integer num) {
            a(s88Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: CombinedSelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "number", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<String, Unit> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "number");
            a.this.Th().w(str);
        }
    }

    /* compiled from: CombinedSelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/combinedmap/presentation/CombinedSelectionMapPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/combinedmap/presentation/CombinedSelectionMapPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function0<CombinedSelectionMapPresenter> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CombinedSelectionMapPresenter invoke() {
            return a.this.Uh().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CombinedSelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function0<Unit> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FragmentContainerView Mh = a.this.Mh();
            jx9 jx9Var = jx9.a;
            p45.g(Mh, 0, 0, 0, jx9Var.a(-20));
            com.dodopizza.order.feature.selectionmap.presentation.e eVar = a.this.y;
            if (eVar != null) {
                eVar.Nh(jx9Var.a(16));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CombinedSelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function0<Unit> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a.this.Ch();
            com.dodopizza.order.feature.selectionmap.presentation.e eVar = a.this.y;
            if (eVar != null) {
                eVar.Nh(a.this.Vh().getHeight());
            }
        }
    }

    /* compiled from: CombinedSelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class j extends ej5 implements Function0<Unit> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a.this.mi();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CombinedSelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Ls88;", "oldItems", "newItems", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class k extends ej5 implements Function2<List<? extends s88>, List<? extends s88>, e.C0047e> {
        public static final k a = new k();

        k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<s88> list, List<s88> list2) {
            z65.h(list, "oldItems");
            z65.h(list2, "newItems");
            e.C0047e b = androidx.recyclerview.widget.e.b(new m88(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    public a() {
        super(gz8.fragment_search_pizzeria);
        this.c = kb0.e(this, gy8.V3);
        this.d = kb0.e(this, gy8.filters_list);
        this.e = kb0.e(this, gy8.search_container);
        this.f = kb0.e(this, gy8.bottom_sheet_view);
        this.g = kb0.e(this, gy8.p);
        this.h = kb0.e(this, gy8.pizzeria_card_container);
        this.i = kb0.e(this, gy8.pizzeria_info_card);
        this.j = kb0.e(this, gy8.order_here_button_container);
        this.k = kb0.e(this, gy8.order_here_button);
        this.m = kb0.e(this, gy8.pizzeria_card_close);
        this.n = kb0.e(this, gy8.dim_view);
        this.o = kb0.e(this, gy8.F);
        this.p = kb0.e(this, gy8.map_switcher);
        this.q = kb0.e(this, gy8.switcher_pizzeria);
        this.r = kb0.e(this, gy8.switcher_delivery);
        this.s = kb0.e(this, gy8.map_container);
        this.t = kb0.e(this, gy8.E0);
        this.u = kb0.e(this, gy8.O);
        this.v = kb0.e(this, gy8.country_select_button);
        this.w = kb0.e(this, gy8.content_container);
        this.x = new l6<>(null, 1, null);
        g gVar = new g();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.A = new MoxyKtxDelegate(mvpDelegate, CombinedSelectionMapPresenter.class.getName() + ".presenter", gVar);
    }

    private final void Bh() {
        Mh().setPadding(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ch() {
        p45.g(Mh(), 0, 0, 0, 0);
    }

    private final View Dh() {
        return (View) this.g.a(this, I[4]);
    }

    private final View Eh() {
        return (View) this.f.a(this, I[3]);
    }

    private final FloatingActionButton Fh() {
        return (FloatingActionButton) this.o.a(this, I[11]);
    }

    private final FrameLayout Gh() {
        return (FrameLayout) this.w.a(this, I[19]);
    }

    private final View Hh() {
        return (View) this.v.a(this, I[18]);
    }

    private final TextView Ih() {
        return (TextView) this.u.a(this, I[17]);
    }

    private final View Jh() {
        return (View) this.n.a(this, I[10]);
    }

    private final RecyclerView Kh() {
        return (RecyclerView) this.d.a(this, I[1]);
    }

    private final ImageView Lh() {
        return (ImageView) this.t.a(this, I[16]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentContainerView Mh() {
        return (FragmentContainerView) this.s.a(this, I[15]);
    }

    private final RadioGroup Nh() {
        return (RadioGroup) this.p.a(this, I[12]);
    }

    private final View Oh() {
        return (View) this.k.a(this, I[8]);
    }

    private final View Ph() {
        return (View) this.j.a(this, I[7]);
    }

    private final PizzeriaCard Qh() {
        return (PizzeriaCard) this.i.a(this, I[6]);
    }

    private final View Rh() {
        return (View) this.m.a(this, I[9]);
    }

    private final View Sh() {
        return (View) this.h.a(this, I[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout Vh() {
        return (LinearLayout) this.e.a(this, I[2]);
    }

    private final DodoEditText Wh() {
        return (DodoEditText) this.c.a(this, I[0]);
    }

    private final RadioButton Xh() {
        return (RadioButton) this.r.a(this, I[14]);
    }

    private final RadioButton Yh() {
        return (RadioButton) this.q.a(this, I[13]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zh(a aVar, View view) {
        z65.h(aVar, "this$0");
        com.dodopizza.order.feature.selectionmap.presentation.e eVar = aVar.y;
        if (eVar != null) {
            eVar.th();
        }
        aVar.Th().x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ai(a aVar, View view) {
        z65.h(aVar, "this$0");
        aVar.Th().G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bi(a aVar, View view) {
        z65.h(aVar, "this$0");
        aVar.Th().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ci(a aVar, CompoundButton compoundButton, boolean z) {
        z65.h(aVar, "this$0");
        if (z) {
            aVar.Th().P("restaurant");
            aVar.Th().J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void di(a aVar, CompoundButton compoundButton, boolean z) {
        z65.h(aVar, "this$0");
        if (z) {
            aVar.Th().P("delivery");
            aVar.Th().I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ei(a aVar, View view) {
        z65.h(aVar, "this$0");
        aVar.Th().y();
    }

    private final void fi(ev2 ev2Var) {
        Th().K(ev2Var);
    }

    private final void gi() {
        Fragment l0 = getChildFragmentManager().l0("address_details_fragment");
        if (l0 != null && (l0 instanceof av2)) {
            p p = getChildFragmentManager().p();
            z65.g(p, "beginTransaction(...)");
            p.t(l0).m();
        }
        Wf();
        Ch();
        com.dodopizza.order.feature.selectionmap.presentation.e eVar = this.y;
        if (eVar != null) {
            eVar.Nh(0);
        }
    }

    private final void hi() {
        getChildFragmentManager().A1("select_delivery_suggestion_key", this, new r64() { // from class: ag1
            @Override // defpackage.r64
            public final void a(String str, Bundle bundle) {
                a.ii(a.this, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ii(a aVar, String str, Bundle bundle) {
        z65.h(aVar, "this$0");
        z65.h(str, "<anonymous parameter 0>");
        z65.h(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("select_delivery_suggestion_value");
        if (serializable != null && (serializable instanceof g.a)) {
            g.a aVar2 = (g.a) serializable;
            e91 a = aVar2.a();
            aVar.ri(new ev2("", a.c().f(), true, false, di0.a, o09.map_address_error_mes, false, a.d(), a.c()), aVar2.b(), a, true);
            aVar.l6();
        }
    }

    private final void ji() {
        Mh().setPadding(0, jx9.a.a(52), 0, 0);
    }

    private final void ki() {
        n1c.a(Gh(), new h());
    }

    private final void li() {
        n1c.a(Vh(), new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mi() {
        if (!isAdded()) {
            return;
        }
        jx9 jx9Var = jx9.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        int d2 = jx9Var.d(requireContext) / 3;
        BottomSheetBehavior<View> bottomSheetBehavior = this.l;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.b0(d2);
        }
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.l;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f0(4);
        }
        Ch();
        com.dodopizza.order.feature.selectionmap.presentation.e eVar = this.y;
        if (eVar != null) {
            eVar.Nh(d2);
        }
    }

    private final void ni() {
        getChildFragmentManager().A1("delivery_key", this, new r64() { // from class: bg1
            @Override // defpackage.r64
            public final void a(String str, Bundle bundle) {
                a.oi(a.this, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oi(a aVar, String str, Bundle bundle) {
        z65.h(aVar, "this$0");
        z65.h(str, "<anonymous parameter 0>");
        z65.h(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("show_delivery_address_value");
        if (serializable != null && (serializable instanceof xu2)) {
            xu2 xu2Var = (xu2) serializable;
            aVar.ri(xu2Var.a(), xu2Var.d(), xu2Var.b(), false);
        }
        Serializable serializable2 = bundle.getSerializable("open_delivery_suggestions_value");
        if (serializable2 != null && (serializable2 instanceof ev2)) {
            aVar.fi((ev2) serializable2);
        }
        String string = bundle.getString("close_delivery_address_view_value");
        if (string != null && z65.c(string, "close_delivery_address_view_value")) {
            aVar.gi();
        }
        Serializable serializable3 = bundle.getSerializable("select_delivery_address_value");
        if (serializable3 != null && (serializable3 instanceof iv0)) {
            aVar.Th().D((iv0) serializable3);
        }
        Serializable serializable4 = bundle.getSerializable("new_delivery_address_value");
        if (serializable4 != null && (serializable4 instanceof c.a.C0131a)) {
            aVar.Th().F((c.a.C0131a) serializable4);
        }
        String string2 = bundle.getString("show_main_screen_value");
        if (string2 != null && z65.c(string2, "show_main_screen_value")) {
            aVar.Th().H();
        }
        String string3 = bundle.getString("handle_locality_changed");
        if (string3 != null && z65.c(string3, "handle_locality_changed")) {
            aVar.Th().E();
        }
    }

    private final void pi() {
        getChildFragmentManager().A1("select_pizzeria_key", this, new r64() { // from class: yf1
            @Override // defpackage.r64
            public final void a(String str, Bundle bundle) {
                a.qi(a.this, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qi(a aVar, String str, Bundle bundle) {
        z65.h(aVar, "this$0");
        z65.h(str, "<anonymous parameter 0>");
        z65.h(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("pizzeria_info_value");
        if (serializable != null && (serializable instanceof t88)) {
            aVar.Th().M((t88) serializable);
        }
        Serializable serializable2 = bundle.getSerializable("select_pizzeria_vo_value");
        if (serializable2 != null && (serializable2 instanceof c.C0203c)) {
            aVar.ti((c.C0203c) serializable2);
        }
        if (bundle.getSerializable("select_pizzeria_back_click_value") != null) {
            aVar.Th().C();
        }
    }

    private final void ri(ev2 ev2Var, dt5 dt5Var, e91 e91Var, boolean z) {
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_selected_initial_data")) == null) ? null : null;
        if (obj != null && !(obj instanceof com.dodopizza.order.feature.selectionmap.presentation.f)) {
            throw new ClassCastException("Property arg_selected_initial_data has different class type");
        } else if (obj != null) {
            com.dodopizza.order.feature.selectionmap.presentation.f fVar = (com.dodopizza.order.feature.selectionmap.presentation.f) obj;
            if (e91Var == null && (e91Var = fVar.a()) == null) {
                e91Var = e91.e;
            }
            xu2 xu2Var = new xu2(true, z, dt5Var, fVar.b(), e91Var, fVar.l(), fVar.m(), fVar.e(), ev2Var);
            Fragment l0 = getChildFragmentManager().l0("address_details_fragment");
            if (l0 != null && (l0 instanceof av2)) {
                ((av2) l0).vh(xu2Var);
                ki();
                return;
            }
            av2 a = av2.l.a(xu2Var);
            p p = getChildFragmentManager().p();
            z65.g(p, "beginTransaction(...)");
            p.v(gy8.content_container, a, "address_details_fragment").k();
            p.x(new Runnable() { // from class: zf1
                @Override // java.lang.Runnable
                public final void run() {
                    a.si(a.this);
                }
            });
        } else {
            throw new IllegalArgumentException("Argument with key = arg_selected_initial_data not found in bundle");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void si(a aVar) {
        z65.h(aVar, "this$0");
        aVar.ki();
    }

    private final void ti(c.C0203c c0203c) {
        this.x.Z(c0203c.b(), k.a);
        if (this.y != null) {
            li();
        }
    }

    @Override // defpackage.pg1
    public void C3() {
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_selected_initial_data")) == null) ? null : null;
        if (obj != null && !(obj instanceof com.dodopizza.order.feature.selectionmap.presentation.f)) {
            throw new ClassCastException("Property arg_selected_initial_data has different class type");
        } else if (obj != null) {
            com.dodopizza.order.feature.selectionmap.presentation.f fVar = (com.dodopizza.order.feature.selectionmap.presentation.f) obj;
            i98 i98Var = new i98(fVar.d(), "", fVar.b(), fVar.k(), fVar.c(), true, false);
            p p = getChildFragmentManager().p();
            z65.g(p, "beginTransaction(...)");
            p.c(gy8.map_container, t98.v.a(i98Var), "suggestions_fragment_tag").m();
            ji();
        } else {
            throw new IllegalArgumentException("Argument with key = arg_selected_initial_data not found in bundle");
        }
    }

    @Override // defpackage.pg1
    public void D9() {
        un3.e(Eh());
        un3.e(Ph());
        un3.e(Oh());
        un3.e(Sh());
        Ch();
        com.dodopizza.order.feature.selectionmap.presentation.e eVar = this.y;
        if (eVar != null) {
            eVar.Nh(0);
        }
    }

    @Override // defpackage.pg1
    public void K(String str) {
        z65.h(str, "phoneNumber");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.f(requireContext, str);
    }

    @Override // defpackage.pg1
    public void L9() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.l;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.f0(4);
        }
        un3.k(Vh());
        D9();
        li();
    }

    @Override // defpackage.pg1
    public void Oe() {
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_selected_initial_data")) == null) ? null : null;
        if (obj != null && !(obj instanceof com.dodopizza.order.feature.selectionmap.presentation.f)) {
            throw new ClassCastException("Property arg_selected_initial_data has different class type");
        } else if (obj != null) {
            com.dodopizza.order.feature.selectionmap.presentation.e a = com.dodopizza.order.feature.selectionmap.presentation.e.v.a((com.dodopizza.order.feature.selectionmap.presentation.f) obj);
            this.y = a;
            p p = getChildFragmentManager().p();
            z65.g(p, "beginTransaction(...)");
            p.v(gy8.map_container, a, "selection_map_fragment_tag").m();
        } else {
            throw new IllegalArgumentException("Argument with key = arg_selected_initial_data not found in bundle");
        }
    }

    @Override // defpackage.pg1
    public void T8() {
        un3.e(Nh());
    }

    public final CombinedSelectionMapPresenter Th() {
        return (CombinedSelectionMapPresenter) this.A.getValue(this, I[20]);
    }

    public final as8<CombinedSelectionMapPresenter> Uh() {
        as8<CombinedSelectionMapPresenter> as8Var = this.z;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.pg1
    public void V1() {
        Fragment l0 = getChildFragmentManager().l0("selection_map_fragment_tag");
        if (l0 != null && (l0 instanceof com.dodopizza.order.feature.selectionmap.presentation.e)) {
            gi();
            ((com.dodopizza.order.feature.selectionmap.presentation.e) l0).sh(naa.b);
        }
        Bh();
    }

    @Override // defpackage.pg1
    public void Wf() {
        un3.e(Jh());
    }

    @Override // defpackage.pg1
    public void Y5(boolean z) {
        ri(ev2.j.a(), null, null, false);
        Fragment l0 = getChildFragmentManager().l0("selection_map_fragment_tag");
        if (l0 != null && (l0 instanceof com.dodopizza.order.feature.selectionmap.presentation.e)) {
            D9();
            if (!z) {
                ((com.dodopizza.order.feature.selectionmap.presentation.e) l0).sh(naa.a);
            }
        }
        Bh();
    }

    @Override // defpackage.pg1
    public void Y7(d88 d88Var, int i2) {
        z65.h(d88Var, "pizzeria");
        com.dodopizza.order.feature.selectionmap.presentation.e eVar = this.y;
        if (eVar != null) {
            eVar.Y7(d88Var, i2);
        }
    }

    @Override // defpackage.pg1
    public void c5(s88 s88Var) {
        com.dodopizza.order.feature.selectionmap.presentation.e eVar = this.y;
        if (eVar != null) {
            eVar.c5(s88Var);
        }
    }

    @Override // defpackage.pg1
    public void l6() {
        un3.k(Jh());
    }

    @Override // defpackage.pg1
    public void n1() {
        un3.e(Vh());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        xf1.b a = xf1.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_selected_initial_data")) == null) ? null : null;
        if (obj != null && !(obj instanceof com.dodopizza.order.feature.selectionmap.presentation.f)) {
            throw new ClassCastException("Property arg_selected_initial_data has different class type");
        } else if (obj != null) {
            a.a((com.dodopizza.order.feature.selectionmap.presentation.f) obj, (CombinedSelectionMapFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(CombinedSelectionMapFeatureDependencies.class))).a(this);
            super.onAttach(context);
        } else {
            throw new IllegalArgumentException("Argument with key = arg_selected_initial_data not found in bundle");
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Th().C();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        pi();
        ni();
        hi();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getChildFragmentManager().v("select_pizzeria_key");
        getChildFragmentManager().v("delivery_key");
        getChildFragmentManager().v("select_delivery_suggestion_key");
        super.onDestroy();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Gh().setTranslationZ(100.0f);
        com.dodopizza.order.feature.selectionmap.presentation.f fVar = null;
        Wh().setKeyListener(null);
        oma.a(Wh(), new d());
        Kh().setAdapter(new k6.a(new k6(this.x), b.a, new k88(false, new e(), 1, null), c.a).b().d());
        BottomSheetBehavior<View> B2 = BottomSheetBehavior.B(Dh());
        this.l = B2;
        if (B2 != null) {
            B2.V(false);
        }
        BottomSheetBehavior<View> bottomSheetBehavior = this.l;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.U(jx9.a.a(82));
        }
        Rh().setOnClickListener(new View.OnClickListener() { // from class: cg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.Zh(a.this, view2);
            }
        });
        Oh().setOnClickListener(new View.OnClickListener() { // from class: dg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.ai(a.this, view2);
            }
        });
        Qh().setPhoneTextListener(new f());
        Fh().setOnClickListener(new View.OnClickListener() { // from class: eg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.bi(a.this, view2);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null && (obj = arguments.get("arg_selected_initial_data")) != null) {
            fVar = obj;
        }
        if (fVar != null && !(fVar instanceof com.dodopizza.order.feature.selectionmap.presentation.f)) {
            throw new ClassCastException("Property arg_selected_initial_data has different class type");
        } else if (fVar != null) {
            com.dodopizza.order.feature.selectionmap.presentation.f fVar2 = fVar;
            if (fVar2.k() != naa.b && fVar2.k() != naa.c) {
                Xh().setChecked(true);
            } else {
                Yh().setChecked(true);
            }
            Yh().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fg1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    a.ci(a.this, compoundButton, z);
                }
            });
            Xh().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: gg1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    a.di(a.this, compoundButton, z);
                }
            });
            Hh().setOnClickListener(new View.OnClickListener() { // from class: hg1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a.ei(a.this, view2);
                }
            });
        } else {
            throw new IllegalArgumentException("Argument with key = arg_selected_initial_data not found in bundle");
        }
    }

    @Override // defpackage.pg1
    public void pd(e91 e91Var, String str) {
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(str, "localityId");
        Fragment l0 = getChildFragmentManager().l0("selection_map_fragment_tag");
        if (l0 != null && (l0 instanceof com.dodopizza.order.feature.selectionmap.presentation.e)) {
            ((com.dodopizza.order.feature.selectionmap.presentation.e) l0).uh(e91Var, str);
        }
    }

    @Override // defpackage.pg1
    public void q4() {
        Object obj;
        Bundle arguments = getArguments();
        String str = null;
        if (arguments == null || (obj = arguments.get("arg_selected_initial_data")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof com.dodopizza.order.feature.selectionmap.presentation.f)) {
            throw new ClassCastException("Property arg_selected_initial_data has different class type");
        } else if (obj != null) {
            com.dodopizza.order.feature.selectionmap.presentation.f fVar = (com.dodopizza.order.feature.selectionmap.presentation.f) obj;
            ny2.a aVar = ny2.K;
            int a = CombinedSelectionMapPresenter.m.a();
            String b2 = fVar.b();
            dt5 d2 = fVar.d();
            if (d2 != null) {
                str = d2.getId();
            }
            h2b c2 = aVar.c(a, b2, null, str, null, ck1.v, false, true, false);
            p p = getChildFragmentManager().p();
            z65.g(p, "beginTransaction(...)");
            p.c(gy8.map_container, com.dodopizza.geo.feature.suggestions.presentation.a.n.a(c2), "suggestions_fragment_tag").m();
            ji();
        } else {
            throw new IllegalArgumentException("Argument with key = arg_selected_initial_data not found in bundle");
        }
    }

    @Override // defpackage.pg1
    public void qg(String str, String str2) {
        z65.h(str, tmb.c.COUNTRY_JSON_NAME);
        z65.h(str2, "flag");
        ImageView Lh = Lh();
        Resources resources = getResources();
        z65.g(resources, "getResources(...)");
        Lh.setImageDrawable(xy3.a(resources, str2));
        Ih().setText(str);
    }

    @Override // defpackage.pg1
    public void tb(t88 t88Var) {
        boolean z;
        z65.h(t88Var, "pizzeriaInfo");
        n1();
        un3.k(Eh());
        un3.k(Ph());
        un3.k(Oh());
        un3.k(Sh());
        Qh().Q(t88Var.b(), t88Var.a(), t88Var.c(), t88Var.f());
        View Oh = Oh();
        if (t88Var.a() != jb7.e) {
            z = true;
        } else {
            z = false;
        }
        Oh.setEnabled(z);
        View view = getView();
        if (view != null) {
            n1c.a(view, new j());
        }
    }

    @Override // defpackage.pg1
    public void x5() {
        un3.k(Nh());
    }
}
