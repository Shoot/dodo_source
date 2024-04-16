package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.textinputlayout.DodoEditText;
import com.dodopizza.geo.feature.pickup.presentation.PickupPizzeriaVH;
import com.dodopizza.order.feature.combinedmap.filters.views.PizzeriaFilterViewHolder;
import com.dodopizza.order.feature.pizzeriasuggestions.PizzeriaSuggestionsDependencies;
import com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionsPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cw5;
import defpackage.k6;
import defpackage.p98;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: PizzeriaSuggestionsFragment.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u008b\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001eB\t¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001a\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\"\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u001aH\u0016R(\u0010:\u001a\b\u0012\u0004\u0012\u000204038\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b&\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R#\u0010@\u001a\n ;*\u0004\u0018\u000104048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010WR\u001b\u0010\\\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010K\u001a\u0004\bZ\u0010[R\u001b\u0010_\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010K\u001a\u0004\b^\u0010WR\u001b\u0010a\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010K\u001a\u0004\b`\u0010[R\u001b\u0010d\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010K\u001a\u0004\bc\u0010[R\u001b\u0010g\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010K\u001a\u0004\bf\u0010[R\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010K\u001a\u0004\bj\u0010kR\u001b\u0010o\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010K\u001a\u0004\bn\u0010[R\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010K\u001a\u0004\br\u0010sR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020v0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020z0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010xR\u0016\u0010\u007f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R \u0010$\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R!\u0010\u0088\u0001\u001a\f ;*\u0005\u0018\u00010\u0085\u00010\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008c\u0001"}, d2 = {"Lt98;", "Lf70;", "Laa8;", "Lw50;", "Ltj1$a;", "", "Lh", "Loz3;", "Lcw5;", "Rh", "Qh", "Lqv5;", "Ph", "vh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Ly98;", "vo", "f7", "b", "", "visible", "v3", "i6", "a", "k", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", com.huawei.hms.opendevice.c.a, "", "id", "O8", "Lt88;", "pizzeriaInfo", "ab", "d9", "a9", "h9", "onCancel", "onDestroy", "onBackPressed", "Las8;", "Lcom/dodopizza/order/feature/pizzeriasuggestions/presentation/PizzeriaSuggestionsPresenter;", "Las8;", "Gh", "()Las8;", "setPresenterProvider$order_release", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lmoxy/ktx/MoxyKtxDelegate;", "Fh", "()Lcom/dodopizza/order/feature/pizzeriasuggestions/presentation/PizzeriaSuggestionsPresenter;", "presenter", "Lje4;", com.huawei.hms.push.e.a, "Lje4;", "Eh", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "Lcom/dodopizza/android/textinputlayout/DodoEditText;", "f", "Lk79;", "wh", "()Lcom/dodopizza/android/textinputlayout/DodoEditText;", "addressField", "Landroidx/appcompat/widget/Toolbar;", "g", "Kh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/recyclerview/widget/RecyclerView;", Image.TYPE_HIGH, "Ih", "()Landroidx/recyclerview/widget/RecyclerView;", "recycler", "i", "Hh", "()Landroid/view/View;", "progress", "j", "Ch", "filterList", "Dh", "findNearestPizzeriasButton", "l", "Ah", "emptyPizzeriasView", Image.TYPE_MEDIUM, "xh", "clearFiltersView", "Landroid/widget/TextView;", "n", "Bh", "()Landroid/widget/TextView;", "emptyTextView", "o", "zh", "emptyImage", "Landroidx/constraintlayout/widget/ConstraintLayout;", "p", "Jh", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Ll6;", "Lb68;", "q", "Ll6;", "pizzeriasAdapter", "Ls88;", "r", "filtersAdapter", Image.TYPE_SMALL, "Z", "keyboardIsVisible", "Li98;", "t", "Lrn5;", "yh", "()Li98;", "Lorg/slf4j/Logger;", "u", "Lorg/slf4j/Logger;", "logger", "<init>", "()V", "v", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t98  reason: default package */
/* loaded from: classes2.dex */
public final class t98 extends f70 implements aa8, w50, tj1.a {
    public as8<PizzeriaSuggestionsPresenter> c;
    private final MoxyKtxDelegate d;
    public je4 e;
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
    private final l6<b68> q;
    private final l6<s88> r;
    private boolean s;
    private final rn5 t;
    private final Logger u;
    static final /* synthetic */ je5<Object>[] w = {bc9.f(new ar8(t98.class, "presenter", "getPresenter$order_release()Lcom/dodopizza/order/feature/pizzeriasuggestions/presentation/PizzeriaSuggestionsPresenter;", 0)), bc9.f(new ar8(t98.class, "addressField", "getAddressField()Lcom/dodopizza/android/textinputlayout/DodoEditText;", 0)), bc9.f(new ar8(t98.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(t98.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(t98.class, "progress", "getProgress()Landroid/view/View;", 0)), bc9.f(new ar8(t98.class, "filterList", "getFilterList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(t98.class, "findNearestPizzeriasButton", "getFindNearestPizzeriasButton()Landroid/view/View;", 0)), bc9.f(new ar8(t98.class, "emptyPizzeriasView", "getEmptyPizzeriasView()Landroid/view/View;", 0)), bc9.f(new ar8(t98.class, "clearFiltersView", "getClearFiltersView()Landroid/view/View;", 0)), bc9.f(new ar8(t98.class, "emptyTextView", "getEmptyTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(t98.class, "emptyImage", "getEmptyImage()Landroid/view/View;", 0)), bc9.f(new ar8(t98.class, "root", "getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;", 0))};
    public static final a v = new a(null);
    public static final int x = 8;

    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lt98$a;", "", "Li98;", "data", "Lt98;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "", "REQUEST_CODE_ENABLE_LOCATION_PROVIDERS", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t98$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t98 a(i98 i98Var) {
            z65.h(i98Var, "data");
            return (t98) y64.d(new t98(), bi0.c(bi0.d("data", i98Var)));
        }
    }

    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"t98$b", "Ljg5;", "", "isVisible", "", "a", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t98$b */
    /* loaded from: classes2.dex */
    public static final class b implements jg5 {
        b() {
        }

        @Override // defpackage.jg5
        public void a(boolean z) {
            boolean z2;
            t98.this.s = z;
            View zh = t98.this.zh();
            int i = 0;
            if (z && t98.this.Ah().getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i = 8;
            }
            zh.setVisibility(i);
        }
    }

    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li98;", "a", "()Li98;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t98$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<i98> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final i98 invoke() {
            Bundle arguments = t98.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof i98)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                return (i98) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t98$d */
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function1<Object, Boolean> {
        public static final d a = new d();

        public d() {
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
    /* renamed from: t98$e */
    /* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb68;", "pizzeria", "", "position", "", "a", "(Lb68;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t98$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function2<b68, Integer, Unit> {
        f() {
            super(2);
        }

        public final void a(b68 b68Var, int i) {
            z65.h(b68Var, "pizzeria");
            t98.this.Fh().z(b68Var, i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(b68 b68Var, Integer num) {
            a(b68Var, num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls88;", "filterVO", "", "<anonymous parameter 1>", "", "a", "(Ls88;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t98$g */
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function2<s88, Integer, Unit> {
        g() {
            super(2);
        }

        public final void a(s88 s88Var, int i) {
            z65.h(s88Var, "filterVO");
            t98.this.Fh().x(s88Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(s88 s88Var, Integer num) {
            a(s88Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t98$h */
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<Object, Boolean> {
        public static final h a = new h();

        public h() {
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
    /* renamed from: t98$i */
    /* loaded from: classes2.dex */
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
            Object newInstance = PickupPizzeriaVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: t98$j */
    /* loaded from: classes2.dex */
    public static final class j extends ej5 implements Function1<String, Unit> {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "it");
            t98.this.Fh().f(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionsFragment$lastOrSingleRequestLocation$1", f = "PizzeriaSuggestionsFragment.kt", l = {264}, m = "invokeSuspend")
    /* renamed from: t98$k */
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements Function2<pz3<? super cw5>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ qv5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(qv5 qv5Var, cv1<? super k> cv1Var) {
            super(2, cv1Var);
            this.c = qv5Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k kVar = new k(this.c, cv1Var);
            kVar.b = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super cw5> pz3Var, cv1<? super Unit> cv1Var) {
            return ((k) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "Loz3;", "Lcw5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionsFragment$locationPermissionFlow$1", f = "PizzeriaSuggestionsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: t98$l */
    /* loaded from: classes2.dex */
    public static final class l extends f3b implements Function2<qy7, cv1<? super oz3<? extends cw5>>, Object> {
        int a;
        /* synthetic */ Object b;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l lVar = new l(cv1Var);
            lVar.b = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(qy7 qy7Var, cv1<? super oz3<? extends cw5>> cv1Var) {
            return ((l) create(qy7Var, cv1Var)).invokeSuspend(Unit.a);
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
                            return t98.this.Qh();
                        }
                    }
                }
                return wz3.A(cw5.b.a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/pizzeriasuggestions/presentation/PizzeriaSuggestionsPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/pizzeriasuggestions/presentation/PizzeriaSuggestionsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t98$m */
    /* loaded from: classes2.dex */
    static final class m extends ej5 implements Function0<PizzeriaSuggestionsPresenter> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PizzeriaSuggestionsPresenter invoke() {
            return t98.this.Gh().get();
        }
    }

    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionsFragment$requestLocation$1", f = "PizzeriaSuggestionsFragment.kt", l = {230}, m = "invokeSuspend")
    /* renamed from: t98$n */
    /* loaded from: classes2.dex */
    static final class n extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PizzeriaSuggestionsFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "it", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: t98$n$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ t98 a;

            a(t98 t98Var) {
                this.a = t98Var;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                this.a.Fh().m(zv5.a(cw5Var));
                return Unit.a;
            }
        }

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new n(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((n) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 Qh = t98.this.Qh();
                a aVar = new a(t98.this);
                this.a = 1;
                if (Qh.collect(aVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionsFragment$requestLocationWithPermissions$1", f = "PizzeriaSuggestionsFragment.kt", l = {207}, m = "invokeSuspend")
    /* renamed from: t98$o */
    /* loaded from: classes2.dex */
    public static final class o extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PizzeriaSuggestionsFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionsFragment$requestLocationWithPermissions$1$1", f = "PizzeriaSuggestionsFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: t98$o$a */
        /* loaded from: classes2.dex */
        public static final class a extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ t98 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t98 t98Var, cv1<? super a> cv1Var) {
                super(3, cv1Var);
                this.c = t98Var;
            }

            @Override // defpackage.y84
            /* renamed from: i */
            public final Object invoke(pz3<? super cw5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
                a aVar = new a(this.c, cv1Var);
                aVar.b = th;
                return aVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    this.c.u.warn("Failed to request location. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PizzeriaSuggestionsFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "result", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: t98$o$b */
        /* loaded from: classes2.dex */
        public static final class b<T> implements pz3 {
            final /* synthetic */ t98 a;

            b(t98 t98Var) {
                this.a = t98Var;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                if (cw5Var instanceof cw5.c) {
                    gw5.a((cw5.c) cw5Var, this.a, 100);
                } else {
                    this.a.Fh().m(zv5.a(cw5Var));
                    this.a.Fh().B();
                }
                return Unit.a;
            }
        }

        o(cv1<? super o> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new o(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((o) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 h = wz3.h(t98.this.Rh(), new a(t98.this, null));
                b bVar = new b(t98.this);
                this.a = 1;
                if (h.collect(bVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: PizzeriaSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Ls88;", "oldItems", "newItems", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t98$p */
    /* loaded from: classes2.dex */
    static final class p extends ej5 implements Function2<List<? extends s88>, List<? extends s88>, e.C0047e> {
        public static final p a = new p();

        p() {
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

    public t98() {
        super(gz8.fragment_pizzeria_suggestions);
        rn5 b2;
        m mVar = new m();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.d = new MoxyKtxDelegate(mvpDelegate, PizzeriaSuggestionsPresenter.class.getName() + ".presenter", mVar);
        this.f = kb0.e(this, gy8.pizzeria_address);
        this.g = kb0.e(this, gy8.pizzeria_toolbar);
        this.h = kb0.e(this, gy8.pizzerias_list);
        this.i = kb0.e(this, dy8.F0);
        this.j = kb0.e(this, gy8.filters_list);
        this.k = kb0.e(this, gy8.find_nearest_pizzerias_button);
        this.l = kb0.e(this, gy8.empty_view);
        this.m = kb0.e(this, gy8.clear_filters_view);
        this.n = kb0.e(this, gy8.empty_textview);
        this.o = kb0.e(this, gy8.empty_image);
        this.p = kb0.e(this, gy8.root_pizzeria_suggestion);
        this.q = new l6<>(null, 1, null);
        this.r = new l6<>(null, 1, null);
        b2 = yn5.b(new c());
        this.t = b2;
        this.u = LoggerFactory.getLogger("PizzeriaSuggestionsFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Ah() {
        return (View) this.l.a(this, w[7]);
    }

    private final TextView Bh() {
        return (TextView) this.n.a(this, w[9]);
    }

    private final RecyclerView Ch() {
        return (RecyclerView) this.j.a(this, w[5]);
    }

    private final View Dh() {
        return (View) this.k.a(this, w[6]);
    }

    private final View Hh() {
        return (View) this.i.a(this, w[4]);
    }

    private final RecyclerView Ih() {
        return (RecyclerView) this.h.a(this, w[3]);
    }

    private final ConstraintLayout Jh() {
        return (ConstraintLayout) this.p.a(this, w[11]);
    }

    private final Toolbar Kh() {
        return (Toolbar) this.g.a(this, w[2]);
    }

    private final void Lh() {
        wh().setText(yh().a());
        e97.a(wh(), kn2.b(pp5.a(this), 0L, new j(), 1, null));
        Kh().setNavigationOnClickListener(new View.OnClickListener() { // from class: q98
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t98.Mh(t98.this, view);
            }
        });
        RecyclerView Ih = Ih();
        Ih.setLayoutManager(new LinearLayoutManager(Ih.getContext()));
        Ih.setAdapter(new k6.a(new k6(this.q), h.a, new z58(true, true, new f()), i.a).b().d());
        v99 v99Var = v99.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        Ih.addItemDecoration(v99Var.c(requireContext));
        Ch().setAdapter(new k6.a(new k6(this.r), d.a, new k88(true, new g()), e.a).b().d());
        Dh().setOnClickListener(new View.OnClickListener() { // from class: r98
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t98.Nh(t98.this, view);
            }
        });
        xh().setOnClickListener(new View.OnClickListener() { // from class: s98
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t98.Oh(t98.this, view);
            }
        });
        vh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mh(t98 t98Var, View view) {
        z65.h(t98Var, "this$0");
        t98Var.Fh().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nh(t98 t98Var, View view) {
        z65.h(t98Var, "this$0");
        t98Var.Fh().A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Oh(t98 t98Var, View view) {
        z65.h(t98Var, "this$0");
        t98Var.Fh().w();
    }

    private final oz3<cw5> Ph(qv5 qv5Var) {
        return wz3.G(qv5Var.a(), new k(qv5Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<cw5> Qh() {
        return Ph(qv5.a.a(Eh()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<cw5> Rh() {
        return wz3.x(ky7.a.a(this).a("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), new l(null));
    }

    private final void vh() {
        ig5.a.b(Jh(), new b());
    }

    private final DodoEditText wh() {
        return (DodoEditText) this.f.a(this, w[1]);
    }

    private final View xh() {
        return (View) this.m.a(this, w[8]);
    }

    private final i98 yh() {
        return (i98) this.t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View zh() {
        return (View) this.o.a(this, w[10]);
    }

    public final je4 Eh() {
        je4 je4Var = this.e;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    public final PizzeriaSuggestionsPresenter Fh() {
        return (PizzeriaSuggestionsPresenter) this.d.getValue(this, w[0]);
    }

    public final as8<PizzeriaSuggestionsPresenter> Gh() {
        as8<PizzeriaSuggestionsPresenter> as8Var = this.c;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.tj1.a
    public void O8(String str) {
        z65.h(str, "id");
        Context context = getContext();
        if (context != null) {
            av1.c(context);
        }
    }

    @Override // defpackage.aa8
    public void a() {
        gg5.c(wh());
    }

    @Override // defpackage.aa8
    public void a9() {
        un3.k(Kh());
    }

    @Override // defpackage.aa8
    public void ab(t88 t88Var) {
        z65.h(t88Var, "pizzeriaInfo");
        i64.a(this, "select_pizzeria_key", bi0.c(lnb.a("pizzeria_info_value", t88Var)));
    }

    @Override // defpackage.aa8
    public void b() {
        un3.e(Ih());
        un3.k(Hh());
    }

    @Override // defpackage.aa8
    public void c() {
        String string = requireContext().getString(r09.g2);
        z65.g(string, "getString(...)");
        String string2 = requireContext().getString(r09.I);
        z65.g(string2, "getString(...)");
        String string3 = requireContext().getString(r09.b2);
        z65.g(string3, "getString(...)");
        tj1.e.a(string, string2, string3, "request_permission").show(getChildFragmentManager(), "request_permission");
    }

    @Override // defpackage.aa8
    public void d9() {
        i64.a(this, "select_pizzeria_key", bi0.c(lnb.a("select_pizzeria_back_click_value", "select_pizzeria_back_click_value")));
    }

    @Override // defpackage.aa8
    public void f7(y98 y98Var) {
        boolean z;
        boolean z2;
        int i2;
        z65.h(y98Var, "vo");
        un3.e(Hh());
        un3.k(Ih());
        this.q.T(y98Var.c());
        RecyclerView Ch = Ch();
        if (!(!y98Var.c().isEmpty()) && y98Var.b().length() != 0) {
            z = false;
        } else {
            z = true;
        }
        un3.o(Ch, z);
        this.r.Z(y98Var.a(), p.a);
        View zh = zh();
        if (this.s && y98Var.c().isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        zh.setVisibility(i2);
        if (y98Var.c().isEmpty() && y98Var.b().length() == 0) {
            un3.o(xh(), true);
            Bh().setText(r09.looking_pizzeria_not_found_via_filters);
        } else {
            un3.o(xh(), false);
            Bh().setText(r09.looking_pizzeria_not_found_v2);
        }
        un3.o(Ah(), y98Var.c().isEmpty());
    }

    @Override // defpackage.aa8
    public void h9() {
        un3.e(Kh());
    }

    @Override // defpackage.aa8
    public void i6() {
        sh0.d(pp5.a(this), null, null, new o(null), 3, null);
    }

    @Override // defpackage.aa8
    public void k() {
        sh0.d(pp5.a(this), null, null, new n(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 100 && i3 == -1) {
            i6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        p98.b a2 = p98.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof i98)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a((i98) obj, (PizzeriaSuggestionsDependencies) getComponentDependenciesRegistry().a(bc9.b(PizzeriaSuggestionsDependencies.class))).a(this);
            super.onAttach(context);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Fh().j();
        return true;
    }

    @Override // defpackage.tj1.a
    public void onCancel(String str) {
        z65.h(str, "id");
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        ig5.a.d(Jh());
        super.onDestroy();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Lh();
    }

    @Override // defpackage.aa8
    public void v3(boolean z) {
        un3.o(Dh(), z);
    }
}
