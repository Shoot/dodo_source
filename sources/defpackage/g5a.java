package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.selectdeliveryaddress.SelectDeliveryAddressPresenter;
import com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressComponent;
import com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressFeatureDependencies;
import com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressRoutingFeatureDependencies;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpView;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: SelectDeliveryAddressFragment.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001=B\u0007¢\u0006\u0004\b:\u0010;J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R#\u0010,\u001a\n '*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00109\u001a\b\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006>"}, d2 = {"Lg5a;", "Lf70;", "Ltu6;", "", "Lw50;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "", "onBackPressed", "finish", "Ldv6;", com.huawei.hms.opendevice.c.a, "Ldv6;", "ph", "()Ldv6;", "setNavigatorHolder", "(Ldv6;)V", "navigatorHolder", "Lf63;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "getRouter", "()Lf63;", "setRouter", "(Lf63;)V", "router", "Las8;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/SelectDeliveryAddressPresenter;", e.a, "Las8;", "rh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "f", "Lmoxy/ktx/MoxyKtxDelegate;", "qh", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/SelectDeliveryAddressPresenter;", "presenter", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "g", "Lrn5;", "nh", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "args", "Lcma;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressComponent;", Image.TYPE_HIGH, "Lcma;", "oh", "()Lcma;", "componentDependenciesRegistry", "<init>", "()V", "i", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: g5a  reason: default package */
/* loaded from: classes2.dex */
public final class g5a extends f70 implements tu6, MvpView, w50 {
    public dv6 c;
    public f63 d;
    public as8<SelectDeliveryAddressPresenter> e;
    private final MoxyKtxDelegate f;
    private final rn5 g;
    private final cma<SelectDeliveryAddressComponent> h;
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(g5a.class, "presenter", "getPresenter()Lcom/dodopizza/geo/feature/selectdeliveryaddress/SelectDeliveryAddressPresenter;", 0))};
    public static final a i = new a(null);
    private static final int k = dy8.delivery_address_select_container;

    /* compiled from: SelectDeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lg5a$a;", "", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "data", "Lg5a;", "a", "", "EXTRA_FRAGMENT_DATA", "Ljava/lang/String;", "", "FRAGMENT_CONTAINER_ID", "I", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: g5a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g5a a(com.dodopizza.geo.feature.selectdeliveryaddress.b bVar) {
            z65.h(bVar, "data");
            return (g5a) y64.d(new g5a(), bi0.c(bi0.d("select_delivery_address_extra_fragment_data", bVar)));
        }
    }

    /* compiled from: SelectDeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "a", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: g5a$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<com.dodopizza.geo.feature.selectdeliveryaddress.b> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.dodopizza.geo.feature.selectdeliveryaddress.b invoke() {
            Bundle arguments = g5a.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("select_delivery_address_extra_fragment_data")) == null) ? null : null;
            if (obj != null && !(obj instanceof com.dodopizza.geo.feature.selectdeliveryaddress.b)) {
                throw new ClassCastException("Property select_delivery_address_extra_fragment_data has different class type");
            } else if (obj != null) {
                return (com.dodopizza.geo.feature.selectdeliveryaddress.b) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = select_delivery_address_extra_fragment_data not found in bundle");
            }
        }
    }

    /* compiled from: SelectDeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressComponent;", "a", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressComponent;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: g5a$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<SelectDeliveryAddressComponent> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SelectDeliveryAddressComponent invoke() {
            return SelectDeliveryAddressComponent.e.a().a((SelectDeliveryAddressFeatureDependencies) g5a.this.getComponentDependenciesRegistry().a(bc9.b(SelectDeliveryAddressFeatureDependencies.class)), (SelectDeliveryAddressRoutingFeatureDependencies) g5a.this.getComponentDependenciesRegistry().a(bc9.b(SelectDeliveryAddressRoutingFeatureDependencies.class)), g5a.this.nh());
        }
    }

    /* compiled from: SelectDeliveryAddressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/SelectDeliveryAddressPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/SelectDeliveryAddressPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: g5a$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function0<SelectDeliveryAddressPresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SelectDeliveryAddressPresenter invoke() {
            return g5a.this.rh().get();
        }
    }

    public g5a() {
        super(dz8.fragment_delivery_address_select);
        rn5 b2;
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.f = new MoxyKtxDelegate(mvpDelegate, SelectDeliveryAddressPresenter.class.getName() + ".presenter", dVar);
        b2 = yn5.b(new b());
        this.g = b2;
        this.h = new cma<>(eu2.d(this), bc9.b(SelectDeliveryAddressComponent.class), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.dodopizza.geo.feature.selectdeliveryaddress.b nh() {
        return (com.dodopizza.geo.feature.selectdeliveryaddress.b) this.g.getValue();
    }

    private final SelectDeliveryAddressPresenter qh() {
        return (SelectDeliveryAddressPresenter) this.f.getValue(this, j[0]);
    }

    @Override // defpackage.tu6
    public void finish() {
        qh().r();
    }

    @Override // defpackage.f70, defpackage.lm1
    /* renamed from: oh */
    public cma<SelectDeliveryAddressComponent> getComponentDependenciesRegistry() {
        return this.h;
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        return x50.a(this);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        getComponentDependenciesRegistry().b().p3(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        ph().b();
        super.onPause();
    }

    @Override // defpackage.f70, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        dv6 ph = ph();
        int i2 = k;
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        ph.a(new y46(this, i2, childFragmentManager, null, 8, null));
    }

    public final dv6 ph() {
        dv6 dv6Var = this.c;
        if (dv6Var != null) {
            return dv6Var;
        }
        z65.z("navigatorHolder");
        return null;
    }

    public final as8<SelectDeliveryAddressPresenter> rh() {
        as8<SelectDeliveryAddressPresenter> as8Var = this.e;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
