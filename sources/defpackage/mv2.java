package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.domain.OnDeliveryLocationSelectedDependencies;
import com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies;
import com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListRoutingFeatureDependencies;
import com.dodopizza.geo.feature.deliveryaddresslist.adapter.DeliveryAddressVH;
import com.dodopizza.geo.feature.deliveryaddresslist.adapter.DeliveryAddressWithSelectionVH;
import com.dodopizza.geo.feature.deliveryaddresslist.adapter.EnterNewAddressVH;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gv2;
import defpackage.k6;
import defpackage.k9a;
import defpackage.tj1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: DeliveryAddressListFragment.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 [2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\\B\u0007¢\u0006\u0004\bY\u0010ZJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u001b\u00102\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b0\u00101R\u001b\u00106\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b4\u00105R\u001b\u0010:\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b=\u0010>R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\r0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR(\u0010R\u001a\b\u0012\u0004\u0012\u00020K0J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR#\u0010X\u001a\n S*\u0004\u0018\u00010K0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006]"}, d2 = {"Lmv2;", "Lf70;", "Lew2;", "Ltj1$a;", "Lw50;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "Lgv2;", "addressList", "u3", "", "showAddAddressButton", "Zb", "Lou2;", "deliverablePlace", "Ig", "Pg", "Ef", "Dd", com.huawei.hms.push.e.a, "f", "g", "", "id", "O8", "onCancel", "onBackPressed", "Lk9a$b;", "request", "q", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "xh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/ProgressBar;", DateTokenConverter.CONVERTER_KEY, "vh", "()Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/LinearLayout;", "sh", "()Landroid/widget/LinearLayout;", "emptyContent", "Landroidx/recyclerview/widget/RecyclerView;", "wh", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", "ph", "()Landroid/widget/Button;", "addAddressButton", "Landroid/widget/TextView;", Image.TYPE_HIGH, "rh", "()Landroid/widget/TextView;", "emptyAddressMessage", "Ll6;", "i", "Ll6;", "addresses", "Liv2;", "j", "Lrn5;", "qh", "()Liv2;", "args", "Las8;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/DeliveryAddressListPresenter;", "k", "Las8;", "uh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "l", "Lmoxy/ktx/MoxyKtxDelegate;", "th", "()Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/DeliveryAddressListPresenter;", "presenter", "<init>", "()V", Image.TYPE_MEDIUM, "a", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mv2  reason: default package */
/* loaded from: classes2.dex */
public final class mv2 extends f70 implements ew2, tj1.a, w50 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final l6<gv2> i;
    private final rn5 j;
    public as8<DeliveryAddressListPresenter> k;
    private final MoxyKtxDelegate l;
    static final /* synthetic */ je5<Object>[] n = {bc9.f(new ar8(mv2.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(mv2.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(mv2.class, "emptyContent", "getEmptyContent()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(mv2.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(mv2.class, "addAddressButton", "getAddAddressButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(mv2.class, "emptyAddressMessage", "getEmptyAddressMessage()Landroid/widget/TextView;", 0)), bc9.f(new ar8(mv2.class, "presenter", "getPresenter()Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/DeliveryAddressListPresenter;", 0))};
    public static final a m = new a(null);

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lmv2$a;", "", "Liv2;", "data", "Lmv2;", "a", "", "EXTRA_FRAGMENT_DATA", "Ljava/lang/String;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mv2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mv2 a(iv2 iv2Var) {
            z65.h(iv2Var, "data");
            return (mv2) y64.d(new mv2(), bi0.c(bi0.d("delivery_address_list_extra_fragment_data", iv2Var)));
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Liv2;", "a", "()Liv2;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<iv2> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final iv2 invoke() {
            Bundle arguments = mv2.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("delivery_address_list_extra_fragment_data")) == null) ? null : null;
            if (obj != null && !(obj instanceof iv2)) {
                throw new ClassCastException("Property delivery_address_list_extra_fragment_data has different class type");
            } else if (obj != null) {
                return (iv2) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = delivery_address_list_extra_fragment_data not found in bundle");
            }
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function1<Object, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof gv2.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$d */
    /* loaded from: classes2.dex */
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
            Object newInstance = DeliveryAddressVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function1<Object, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof gv2.b);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$f */
    /* loaded from: classes2.dex */
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
            Object newInstance = DeliveryAddressWithSelectionVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$g */
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function1<Object, Boolean> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof gv2.c);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$h */
    /* loaded from: classes2.dex */
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
            Object newInstance = EnterNewAddressVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lou2;", "place", "", "a", "(Lou2;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$i */
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function1<ou2, Unit> {
        i() {
            super(1);
        }

        public final void a(ou2 ou2Var) {
            z65.h(ou2Var, "place");
            mv2.this.th().P(ou2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ou2 ou2Var) {
            a(ou2Var);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgv2$a;", "place", "", "a", "(Lgv2$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$j */
    /* loaded from: classes2.dex */
    static final class j extends ej5 implements Function1<gv2.a, Unit> {
        j() {
            super(1);
        }

        public final void a(gv2.a aVar) {
            z65.h(aVar, "place");
            mv2.this.th().N(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gv2.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgv2$b;", "place", "", "a", "(Lgv2$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$k */
    /* loaded from: classes2.dex */
    static final class k extends ej5 implements Function1<gv2.b, Unit> {
        k() {
            super(1);
        }

        public final void a(gv2.b bVar) {
            z65.h(bVar, "place");
            mv2.this.th().N(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gv2.b bVar) {
            a(bVar);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgv2$b;", "place", "", "a", "(Lgv2$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$l */
    /* loaded from: classes2.dex */
    static final class l extends ej5 implements Function1<gv2.b, Unit> {
        l() {
            super(1);
        }

        public final void a(gv2.b bVar) {
            z65.h(bVar, "place");
            mv2.this.th().Q(bVar, mv2.this.i.size() - 1, mv2.this.i.indexOf(bVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gv2.b bVar) {
            a(bVar);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mv2$m */
    /* loaded from: classes2.dex */
    static final class m extends ej5 implements Function0<Unit> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            mv2.this.th().O();
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$n */
    /* loaded from: classes2.dex */
    static final class n extends ej5 implements Function1<View, Unit> {
        n() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            mv2.this.th().O();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/DeliveryAddressListPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/DeliveryAddressListPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$o */
    /* loaded from: classes2.dex */
    static final class o extends ej5 implements Function0<DeliveryAddressListPresenter> {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final DeliveryAddressListPresenter invoke() {
            return mv2.this.uh().get();
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgv2;", "item", "", "", "a", "(Lgv2;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$p */
    /* loaded from: classes2.dex */
    static final class p extends ej5 implements Function1<gv2, List<? extends String>> {
        final /* synthetic */ ou2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(ou2 ou2Var) {
            super(1);
            this.a = ou2Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(gv2 gv2Var) {
            List<String> l;
            List<String> e;
            z65.h(gv2Var, "item");
            if (!(gv2Var instanceof gv2.b)) {
                l = kc1.l();
                return l;
            }
            ((gv2.b) gv2Var).j(this.a);
            e = jc1.e("update_selected_flag");
            return e;
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgv2;", "item", "", "", "a", "(Lgv2;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$q */
    /* loaded from: classes2.dex */
    static final class q extends ej5 implements Function1<gv2, List<? extends String>> {
        public static final q a = new q();

        q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(gv2 gv2Var) {
            List<String> l;
            List<String> e;
            z65.h(gv2Var, "item");
            if (!(gv2Var instanceof gv2.b)) {
                l = kc1.l();
                return l;
            }
            ((gv2.b) gv2Var).k();
            e = jc1.e("update_selected_flag");
            return e;
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mv2$r */
    /* loaded from: classes2.dex */
    static final class r extends ej5 implements Function0<Unit> {
        final /* synthetic */ k9a.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(k9a.b bVar) {
            super(0);
            this.b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            mv2.this.th().L(EditDeliveryAddressMapPresenter.a.b.a, this.b);
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mv2$s */
    /* loaded from: classes2.dex */
    static final class s extends ej5 implements Function0<Unit> {
        final /* synthetic */ k9a.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(k9a.b bVar) {
            super(0);
            this.b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            mv2.this.th().L(EditDeliveryAddressMapPresenter.a.C0141a.a, this.b);
        }
    }

    /* compiled from: DeliveryAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgv2;", "item", "", "", "a", "(Lgv2;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mv2$t */
    /* loaded from: classes2.dex */
    static final class t extends ej5 implements Function1<gv2, List<? extends String>> {
        final /* synthetic */ ou2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(ou2 ou2Var) {
            super(1);
            this.a = ou2Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(gv2 gv2Var) {
            List<String> l;
            List<String> e;
            z65.h(gv2Var, "item");
            if (gv2Var instanceof gv2.b) {
                gv2.b bVar = (gv2.b) gv2Var;
                if (z65.c(bVar.d(), this.a)) {
                    bVar.l();
                    e = jc1.e("error_without_location");
                    return e;
                }
            }
            l = kc1.l();
            return l;
        }
    }

    public mv2() {
        super(dz8.fragment_delivery_address_list);
        rn5 b2;
        this.c = kb0.e(this, dy8.O0);
        this.d = kb0.e(this, dy8.G0);
        this.e = kb0.e(this, dy8.empty_content);
        this.f = kb0.e(this, dy8.addresses_recycler_view);
        this.g = kb0.e(this, dy8.add_new_address_button);
        this.h = kb0.e(this, dy8.empty_address_message);
        this.i = new l6<>(null, 1, null);
        b2 = yn5.b(new b());
        this.j = b2;
        o oVar = new o();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.l = new MoxyKtxDelegate(mvpDelegate, DeliveryAddressListPresenter.class.getName() + ".presenter", oVar);
    }

    private final Button ph() {
        return (Button) this.g.a(this, n[4]);
    }

    private final iv2 qh() {
        return (iv2) this.j.getValue();
    }

    private final TextView rh() {
        return (TextView) this.h.a(this, n[5]);
    }

    private final LinearLayout sh() {
        return (LinearLayout) this.e.a(this, n[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeliveryAddressListPresenter th() {
        return (DeliveryAddressListPresenter) this.l.getValue(this, n[6]);
    }

    private final ProgressBar vh() {
        return (ProgressBar) this.d.a(this, n[1]);
    }

    private final RecyclerView wh() {
        return (RecyclerView) this.f.a(this, n[3]);
    }

    private final Toolbar xh() {
        return (Toolbar) this.c.a(this, n[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yh(mv2 mv2Var, View view) {
        z65.h(mv2Var, "this$0");
        mv2Var.th().onBackPressed();
    }

    @Override // defpackage.ew2
    public void Dd() {
        String string = getString(o09.delete_address_text);
        z65.g(string, "getString(...)");
        String string2 = requireContext().getString(o09.i);
        z65.g(string2, "getString(...)");
        String string3 = requireContext().getString(o09.N);
        z65.g(string3, "getString(...)");
        tj1.e.a(string, string2, string3, "delete_address").show(getChildFragmentManager(), "delete_address");
    }

    @Override // defpackage.ew2
    public void Ef() {
        this.i.w1(q.a);
    }

    @Override // defpackage.ew2
    public void Ig(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        this.i.w1(new t(ou2Var));
    }

    @Override // defpackage.tj1.a
    public void O8(String str) {
        z65.h(str, "id");
        th().M();
    }

    @Override // defpackage.ew2
    public void Pg(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        this.i.w1(new p(ou2Var));
    }

    @Override // defpackage.ew2
    public void Zb(boolean z) {
        String string;
        un3.k(sh());
        un3.e(wh());
        un3.o(ph(), z);
        TextView rh = rh();
        if (z) {
            string = getString(o09.profile_address_list_empty_screen_message);
        } else {
            string = getString(o09.empty_delivery_addresses);
        }
        rh.setText(string);
    }

    @Override // defpackage.ew2
    public void e() {
        Toast.makeText(getContext(), o09.remove_address_error, 1).show();
    }

    @Override // defpackage.ew2
    public void f() {
        un3.k(vh());
    }

    @Override // defpackage.ew2
    public void g() {
        un3.e(vh());
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        th().onBackPressed();
        return true;
    }

    @Override // defpackage.tj1.a
    public void onCancel(String str) {
        z65.h(str, "id");
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        hv2.a.a().a((DeliveryAddressListFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(DeliveryAddressListFeatureDependencies.class)), (DeliveryAddressListRoutingFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(DeliveryAddressListRoutingFeatureDependencies.class)), (OnDeliveryLocationSelectedDependencies) getComponentDependenciesRegistry().a(bc9.b(OnDeliveryLocationSelectedDependencies.class)), qh(), new sj1(qh().e(), qh().b(), qh().c(), qh().a())).a(this);
        super.onCreate(bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        xh().setNavigationOnClickListener(new View.OnClickListener() { // from class: lv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                mv2.yh(mv2.this, view2);
            }
        });
        un3.e(sh());
        un3.e(wh());
        wh().setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView wh = wh();
        v99 v99Var = v99.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        wh.addItemDecoration(v99.b(v99Var, requireContext, 0, 2, null));
        wh().setAdapter(new k6.a(new k6.a(new k6.a(new k6(this.i), c.a, new vu2(new i(), new j()), d.a).b(), e.a, new cx2(new k(), new l()), f.a).b(), g.a, new si3(new m()), h.a).b().d());
        oma.a(ph(), new n());
    }

    @Override // defpackage.ew2
    public void q(k9a.b bVar) {
        z65.h(bVar, "request");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        x81.c(requireContext, new r(bVar), new s(bVar));
    }

    @Override // defpackage.ew2
    public void u3(List<? extends gv2> list) {
        z65.h(list, "addressList");
        un3.e(sh());
        un3.k(wh());
        this.i.r();
        this.i.addAll(list);
    }

    public final as8<DeliveryAddressListPresenter> uh() {
        as8<DeliveryAddressListPresenter> as8Var = this.k;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
