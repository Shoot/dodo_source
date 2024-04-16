package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.menu.adapters.promotion.VerticalPromotionProductViewHolder;
import com.dodopizza.order.feature.upsell.UpsaleFeatureDependencies;
import com.dodopizza.order.feature.upsell.presentation.UpsalePresenter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.atb;
import defpackage.k6;
import defpackage.psb;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: UpsaleFragment.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0001IB\u0007¢\u0006\u0004\bF\u0010GJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0016\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00107\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u001b\u0010\u0004\u001a\u00020\u00038DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u0010?R#\u0010E\u001a\n @*\u0004\u0018\u00010\u001b0\u001b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006J"}, d2 = {"Lpsb;", "Lf70;", "Lotb;", "Landroidx/recyclerview/widget/RecyclerView;", "upsellProductsRV", "", "nh", "mh", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "jg", "ud", "", "Latb;", "upsellProducts", "L1", "e8", "", "upsellProductId", "m2", "Las8;", "Lcom/dodopizza/order/feature/upsell/presentation/UpsalePresenter;", com.huawei.hms.opendevice.c.a, "Las8;", "qh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Lg78;", DateTokenConverter.CONVERTER_KEY, "Lg78;", "getPizzaDoughNameFormatter", "()Lg78;", "setPizzaDoughNameFormatter", "(Lg78;)V", "pizzaDoughNameFormatter", "Ljn6;", com.huawei.hms.push.e.a, "Ljn6;", "oh", "()Ljn6;", "setMoneyFactory", "(Ljn6;)V", "moneyFactory", "f", "Lk79;", "sh", "()Landroid/view/View;", "upsellSector", "Landroid/widget/TextView;", "g", "th", "()Landroid/widget/TextView;", "upsellTitleTextView", Image.TYPE_HIGH, "rh", "()Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "i", "Lmoxy/ktx/MoxyKtxDelegate;", "ph", "()Lcom/dodopizza/order/feature/upsell/presentation/UpsalePresenter;", "presenter", "<init>", "()V", "j", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: psb  reason: default package */
/* loaded from: classes2.dex */
public class psb extends f70 implements otb {
    public as8<UpsalePresenter> c;
    public g78 d;
    public jn6 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final MoxyKtxDelegate i;
    static final /* synthetic */ je5<Object>[] k = {bc9.f(new ar8(psb.class, "upsellSector", "getUpsellSector()Landroid/view/View;", 0)), bc9.f(new ar8(psb.class, "upsellTitleTextView", "getUpsellTitleTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(psb.class, "upsellProductsRV", "getUpsellProductsRV()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(psb.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/upsell/presentation/UpsalePresenter;", 0))};
    public static final a j = new a(null);
    public static final int l = 8;

    /* compiled from: UpsaleFragment.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J4\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u0019"}, d2 = {"Lpsb$a;", "", "Lpsb;", "b", "Landroidx/fragment/app/Fragment;", "recipient", "Lkotlin/Function1;", "", "", "onItemClickListener", "Lkotlin/Function0;", "onEmptyStateListener", com.huawei.hms.opendevice.c.a, "", "HORIZONTAL_PADDINGS_DP", "I", "ON_ADD_UPSALE", "Ljava/lang/String;", "ON_EMPTY_STATE", "ON_UPSALE_UPDATE", "TAG", "UPSALE_PRODUCT_ID", "UPSALE_STATE", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: psb$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Function0 function0, Function1 function1, String str, Bundle bundle) {
            z65.h(function0, "$onEmptyStateListener");
            z65.h(function1, "$onItemClickListener");
            z65.h(str, Action.KEY_ATTRIBUTE);
            z65.h(bundle, "bundle");
            String string = bundle.getString("UPSALE_STATE");
            if (z65.c(string, "ON_ADD_UPSALE")) {
                String string2 = bundle.getString("UPSALE_PRODUCT_ID");
                if (string2 != null) {
                    function1.invoke(string2);
                }
            } else if (z65.c(string, "ON_EMPTY_STATE")) {
                function0.invoke();
            }
        }

        public final psb b() {
            return new psb();
        }

        public final psb c(psb psbVar, Fragment fragment, final Function1<? super String, Unit> function1, final Function0<Unit> function0) {
            z65.h(psbVar, "<this>");
            z65.h(fragment, "recipient");
            z65.h(function1, "onItemClickListener");
            z65.h(function0, "onEmptyStateListener");
            fragment.getChildFragmentManager().A1("ON_UPSALE_UPDATE", fragment, new r64() { // from class: osb
                @Override // defpackage.r64
                public final void a(String str, Bundle bundle) {
                    psb.a.d(Function0.this, function1, str, bundle);
                }
            });
            return psbVar;
        }
    }

    /* compiled from: UpsaleFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/upsell/presentation/UpsalePresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/upsell/presentation/UpsalePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: psb$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<UpsalePresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final UpsalePresenter invoke() {
            return psb.this.qh().get();
        }
    }

    /* compiled from: UpsaleFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: psb$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<String, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
            psb.this.ph().z(str);
        }
    }

    /* compiled from: UpsaleFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Latb$a;", "product", "", "position", "", "a", "(Latb$a;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: psb$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function2<atb.a, Integer, Unit> {
        d() {
            super(2);
        }

        public final void a(atb.a aVar, int i) {
            z65.h(aVar, "product");
            psb.this.ph().D(aVar, i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(atb.a aVar, Integer num) {
            a(aVar, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: psb$e */
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
            return Boolean.valueOf(obj instanceof atb.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: psb$f */
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
            Object newInstance = VerticalPromotionProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    public psb() {
        super(gz8.fragment_upsale);
        this.f = kb0.e(this, gy8.shopping_cart_upsale_sector);
        this.g = kb0.e(this, gy8.upsell_title);
        this.h = kb0.e(this, gy8.upsale_products1);
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.i = new MoxyKtxDelegate(mvpDelegate, UpsalePresenter.class.getName() + ".presenter", bVar);
    }

    private final View sh() {
        return (View) this.f.a(this, k[0]);
    }

    private final TextView th() {
        return (TextView) this.g.a(this, k[1]);
    }

    @Override // defpackage.otb
    public void L1(Collection<? extends atb> collection) {
        z65.h(collection, "upsellProducts");
        un3.k(sh());
        rh().setAdapter(new k6.a(new k6(new l6(collection)), e.a, new dyb(oh(), new c(), new d()), f.a).a().d());
    }

    @Override // defpackage.otb
    public void e8() {
        i64.a(this, "ON_UPSALE_UPDATE", bi0.c(lnb.a("UPSALE_STATE", "ON_EMPTY_STATE")));
    }

    @Override // defpackage.otb
    public void jg() {
        edb.o(th(), s19.TextAppearance_Dodo_Heading_H3);
    }

    @Override // defpackage.otb
    public void m2(String str) {
        z65.h(str, "upsellProductId");
        i64.a(this, "ON_UPSALE_UPDATE", bi0.c(lnb.a("UPSALE_STATE", "ON_ADD_UPSALE"), lnb.a("UPSALE_PRODUCT_ID", str)));
    }

    public void mh(RecyclerView recyclerView) {
        z65.h(recyclerView, "upsellProductsRV");
        recyclerView.addItemDecoration(new zo4(0, 10, 10));
    }

    public void nh(RecyclerView recyclerView) {
        z65.h(recyclerView, "upsellProductsRV");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
    }

    public final jn6 oh() {
        jn6 jn6Var = this.e;
        if (jn6Var != null) {
            return jn6Var;
        }
        z65.z("moneyFactory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        msb.a.a().a((UpsaleFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(UpsaleFeatureDependencies.class))).a(this);
        super.onAttach(context);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        nh(rh());
        mh(rh());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final UpsalePresenter ph() {
        return (UpsalePresenter) this.i.getValue(this, k[3]);
    }

    public final as8<UpsalePresenter> qh() {
        as8<UpsalePresenter> as8Var = this.c;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final RecyclerView rh() {
        return (RecyclerView) this.h.a(this, k[2]);
    }

    @Override // defpackage.otb
    public void ud() {
        edb.o(th(), s19.TextAppearance_Dodo_Heading_H2);
    }
}
