package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ji1;
import defpackage.k6;
import defpackage.ym;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter;
import ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplatePizzaViewHolder;
import ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateProductViewHolder;
import ru.dodopizza.app.presentation.product.card.combo.customize.CustomizeTemplatePizzaViewHolder;
import ru.dodopizza.app.presentation.product.card.combo.customize.CustomizeTemplateProductViewHolder;
/* compiled from: ComboTemplateConstructorFragment.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001XB\u0007¢\u0006\u0004\bU\u0010VJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0016J\u001e\u0010\"\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010>\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010O\u001a\b\u0012\u0004\u0012\u00020H0G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020H8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006Y"}, d2 = {"Loi1;", "Lt74;", "Lti1;", "Llm1;", "", "position", "", "nh", "Ll6;", "Lx89;", "products", "Lk6;", "ph", "yh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "gh", "onDestroyView", "Ly89;", "changedReceipt", "o9", "If", "N1", "close", "Landroid/widget/TextView;", "b", "Lk79;", "vh", "()Landroid/widget/TextView;", "slotsPagerIndicator", "Landroidx/appcompat/widget/AppCompatImageView;", com.huawei.hms.opendevice.c.a, "qh", "()Landroidx/appcompat/widget/AppCompatImageView;", "closeSlots", "Landroidx/recyclerview/widget/RecyclerView;", DateTokenConverter.CONVERTER_KEY, "uh", "()Landroidx/recyclerview/widget/RecyclerView;", "slotProductsRecycler", "Lb42;", com.huawei.hms.push.e.a, "Lb42;", "productsSnapHelper", "Lkm1;", "f", "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "Ljn6;", "g", "Ljn6;", "rh", "()Ljn6;", "setMoneyFactory", "(Ljn6;)V", "moneyFactory", "Las8;", "Lru/dodopizza/app/presentation/product/card/combo/constructor/ComboTemplateConstructorPresenter;", Image.TYPE_HIGH, "Las8;", "th", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "i", "Lmoxy/ktx/MoxyKtxDelegate;", "sh", "()Lru/dodopizza/app/presentation/product/card/combo/constructor/ComboTemplateConstructorPresenter;", "presenter", "<init>", "()V", "j", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: oi1  reason: default package */
/* loaded from: classes4.dex */
public final class oi1 extends t74 implements ti1, lm1 {
    private final k79 b = kb0.e(this, R.id.combo_template_slots_pager_indicator);
    private final k79 c = kb0.e(this, R.id.combo_template_slot_products_close);
    private final k79 d = kb0.e(this, R.id.combo_template_slot_products_recycler);
    private final b42 e = new b42(0.25d, 0.0d, 2, null);
    private final km1 f = eu2.d(this);
    public jn6 g;
    public as8<ComboTemplateConstructorPresenter> h;
    private final MoxyKtxDelegate i;
    static final /* synthetic */ je5<Object>[] k = {bc9.f(new ar8(oi1.class, "slotsPagerIndicator", "getSlotsPagerIndicator()Landroid/widget/TextView;", 0)), bc9.f(new ar8(oi1.class, "closeSlots", "getCloseSlots()Landroidx/appcompat/widget/AppCompatImageView;", 0)), bc9.f(new ar8(oi1.class, "slotProductsRecycler", "getSlotProductsRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(oi1.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/product/card/combo/constructor/ComboTemplateConstructorPresenter;", 0))};
    public static final a j = new a(null);

    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Loi1$a;", "", "Lki1;", "data", "Loi1;", "a", "", "CLOSE_RECEIPT", "Ljava/lang/String;", "CUSTOMIZE_TYPE", "MENU_ITEM_ID", "SCREEN", "SELECTED_PRODUCT_ID", "SLOT_POSITION", "TRANSITION_INFO", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: oi1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final oi1 a(ki1 ki1Var) {
            z65.h(ki1Var, "data");
            return (oi1) y64.d(new oi1(), bi0.c(bi0.d("menu_item_id", ki1Var.b()), bi0.d("slot_position", Integer.valueOf(ki1Var.e())), bi0.d("transition_info", ki1Var.f()), bi0.d("selected_product_id", ki1Var.d()), bi0.d("screen", ki1Var.c()), bi0.d("customize_type", ki1Var.a())));
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<Object, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof b88);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$c */
    /* loaded from: classes4.dex */
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
            Object newInstance = ComboTemplatePizzaViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$d */
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
            return Boolean.valueOf(obj instanceof qla);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$e */
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
            Object newInstance = ComboTemplateProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$f */
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function1<Object, Boolean> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof b88);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$g */
    /* loaded from: classes4.dex */
    public static final class g extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final g a = new g();

        public g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = CustomizeTemplatePizzaViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$h */
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function1<Object, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof qla);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$i */
    /* loaded from: classes4.dex */
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
            Object newInstance = CustomizeTemplateProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm78;", "pizzaProduct", "", "a", "(Lm78;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$j */
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<m78, Unit> {
        j() {
            super(1);
        }

        public final void a(m78 m78Var) {
            z65.h(m78Var, "pizzaProduct");
            oi1.this.sh().I(m78Var.getId());
            oi1.this.sh().C();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(m78 m78Var) {
            a(m78Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfl8;", "product", "", "a", "(Lfl8;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$k */
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function1<fl8, Unit> {
        k() {
            super(1);
        }

        public final void a(fl8 fl8Var) {
            z65.h(fl8Var, "product");
            oi1.this.sh().I(fl8Var.getId());
            oi1.this.sh().C();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(fl8 fl8Var) {
            a(fl8Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm78;", "pizzaProduct", "", "a", "(Lm78;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$l */
    /* loaded from: classes4.dex */
    public static final class l extends ej5 implements Function1<m78, Unit> {
        l() {
            super(1);
        }

        public final void a(m78 m78Var) {
            z65.h(m78Var, "pizzaProduct");
            oi1.this.sh().I(m78Var.getId());
            oi1.this.sh().C();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(m78 m78Var) {
            a(m78Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oi1$m */
    /* loaded from: classes4.dex */
    public static final class m extends ej5 implements Function0<Unit> {
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
            oi1.this.vh().setText(oi1.this.getString(R.string.combo_template_slots_change_receipt));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "slotPosition", "Lm78;", "pizzaProduct", "", "a", "(ILm78;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$n */
    /* loaded from: classes4.dex */
    public static final class n extends ej5 implements Function2<Integer, m78, Unit> {
        n() {
            super(2);
        }

        public final void a(int i, m78 m78Var) {
            z65.h(m78Var, "pizzaProduct");
            oi1.this.sh().O(i, m78Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, m78 m78Var) {
            a(num.intValue(), m78Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfl8;", "product", "", "a", "(Lfl8;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$o */
    /* loaded from: classes4.dex */
    public static final class o extends ej5 implements Function1<fl8, Unit> {
        o() {
            super(1);
        }

        public final void a(fl8 fl8Var) {
            z65.h(fl8Var, "product");
            oi1.this.sh().I(fl8Var.getId());
            oi1.this.sh().C();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(fl8 fl8Var) {
            a(fl8Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oi1$p */
    /* loaded from: classes4.dex */
    public static final class p extends ej5 implements Function0<Unit> {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            oi1.this.vh().setText(oi1.this.getString(R.string.combo_template_slots_change_receipt));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "slotPosition", "Lfl8;", "product", "", "a", "(ILfl8;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$q */
    /* loaded from: classes4.dex */
    public static final class q extends ej5 implements Function2<Integer, fl8, Unit> {
        q() {
            super(2);
        }

        public final void a(int i, fl8 fl8Var) {
            z65.h(fl8Var, "product");
            oi1.this.sh().O(i, fl8Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, fl8 fl8Var) {
            a(num.intValue(), fl8Var);
            return Unit.a;
        }
    }

    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "oldPosition", "position", "", "a", "(II)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$r */
    /* loaded from: classes4.dex */
    static final class r extends ej5 implements Function2<Integer, Integer, Unit> {
        r() {
            super(2);
        }

        public final void a(int i, int i2) {
            oi1.this.nh(i);
            oi1.this.yh(i2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return Unit.a;
        }
    }

    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$s */
    /* loaded from: classes4.dex */
    static final class s extends ej5 implements Function1<View, Unit> {
        s() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            oi1.this.sh().C();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ComboTemplateConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/constructor/ComboTemplateConstructorPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/product/card/combo/constructor/ComboTemplateConstructorPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oi1$t */
    /* loaded from: classes4.dex */
    static final class t extends ej5 implements Function0<ComboTemplateConstructorPresenter> {
        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ComboTemplateConstructorPresenter invoke() {
            return oi1.this.th().get();
        }
    }

    public oi1() {
        t tVar = new t();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.i = new MoxyKtxDelegate(mvpDelegate, ComboTemplateConstructorPresenter.class.getName() + ".presenter", tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nh(final int i2) {
        uh().post(new Runnable() { // from class: ni1
            @Override // java.lang.Runnable
            public final void run() {
                oi1.oh(oi1.this, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oh(oi1 oi1Var, int i2) {
        z65.h(oi1Var, "this$0");
        RecyclerView.h adapter = oi1Var.uh().getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i2, "close_receipt");
        }
    }

    private final k6 ph(l6<x89> l6Var) {
        List M;
        Object Z;
        boolean z;
        M = rc1.M(l6Var, b88.class);
        List<b88> list = M;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (b88 b88Var : list) {
                Z = sc1.Z(M);
                if (((b88) Z).h().size() != b88Var.h().size()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("customize_type")) == null) ? null : null;
        if (obj != null && !(obj instanceof gj1)) {
            throw new ClassCastException("Property customize_type has different class type");
        } else if (obj != null) {
            if (((gj1) obj) == gj1.a) {
                return new k6.a(new k6.a(new k6(l6Var), b.a, new yi1(rh(), z, new j(), null, null, 24, null), c.a).b(), d.a, new aj1(rh(), new k(), null, null, 12, null), e.a).b();
            }
            return new k6.a(new k6.a(new k6(l6Var), f.a, new yi1(rh(), z, new l(), new m(), new n()), g.a).b(), h.a, new aj1(rh(), new o(), new p(), new q()), i.a).b();
        } else {
            throw new IllegalArgumentException("Argument with key = customize_type not found in bundle");
        }
    }

    private final AppCompatImageView qh() {
        return (AppCompatImageView) this.c.a(this, k[1]);
    }

    private final RecyclerView uh() {
        return (RecyclerView) this.d.a(this, k[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView vh() {
        return (TextView) this.b.a(this, k[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wh(oi1 oi1Var) {
        z65.h(oi1Var, "this$0");
        oi1Var.uh().setPadding(oi1Var.uh().getWidth() / 2, 0, oi1Var.uh().getWidth() / 2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xh(oi1 oi1Var, int i2) {
        Object obj;
        View M;
        int[] c2;
        z65.h(oi1Var, "this$0");
        RecyclerView.p layoutManager = oi1Var.uh().getLayoutManager();
        flb flbVar = null;
        boolean z = true;
        if (layoutManager != null && (M = layoutManager.M(i2)) != null && (c2 = oi1Var.e.c(layoutManager, M)) != null) {
            if (c2[0] == 0 && c2[1] == 0) {
                c2 = null;
            }
            if (c2 != null) {
                oi1Var.uh().scrollBy(c2[0], c2[1]);
            }
        }
        un3.k(oi1Var.uh());
        un3.k(oi1Var.vh());
        un3.k(oi1Var.qh());
        RecyclerView uh = oi1Var.uh();
        Context context = uh.getContext();
        z65.g(context, "getContext(...)");
        if (i2 != 0) {
            z = false;
        }
        uh.setLayoutAnimation(new ci1(context, z));
        uh.scheduleLayoutAnimation();
        RecyclerView.d0 findViewHolderForAdapterPosition = uh.findViewHolderForAdapterPosition(i2);
        if (findViewHolderForAdapterPosition != null) {
            sr1 sr1Var = (sr1) findViewHolderForAdapterPosition;
            Bundle arguments = oi1Var.getArguments();
            if (arguments != null && (obj = arguments.get("transition_info")) != null) {
                flbVar = obj;
            }
            if (flbVar != null && !(flbVar instanceof flb)) {
                throw new ClassCastException("Property transition_info has different class type");
            } else if (flbVar != null) {
                sr1Var.startAnimation(flbVar);
            } else {
                throw new IllegalArgumentException("Argument with key = transition_info not found in bundle");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yh(int i2) {
        Integer num;
        RecyclerView.h adapter = uh().getAdapter();
        if (adapter != null) {
            num = Integer.valueOf(adapter.getItemCount());
        } else {
            num = null;
        }
        vh().setText(getString(R.string.combo_template_slots_pagination, Integer.valueOf(i2 + 1), Integer.valueOf(((Number) mh5.c(num, 0)).intValue())));
    }

    @Override // defpackage.ti1
    public void If(l6<x89> l6Var, final int i2) {
        z65.h(l6Var, "products");
        uh().setAdapter(ph(l6Var).d());
        yh(i2);
        uh().scrollToPosition(i2);
        uh().post(new Runnable() { // from class: mi1
            @Override // java.lang.Runnable
            public final void run() {
                oi1.xh(oi1.this, i2);
            }
        });
    }

    @Override // defpackage.ti1
    public void N1() {
        Fragment targetFragment = getTargetFragment();
        if (!(getTargetFragment() instanceof ii1)) {
            targetFragment = null;
        }
        if (targetFragment != null) {
            ((ii1) targetFragment).Mc();
        }
    }

    @Override // defpackage.ti1
    public void close() {
        dismiss();
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.f;
    }

    @Override // defpackage.t74
    public void gh() {
        sh().C();
    }

    @Override // defpackage.ti1
    public void o9(int i2, y89 y89Var) {
        z65.h(y89Var, "changedReceipt");
        yh(i2);
        RecyclerView.h adapter = uh().getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i2, y89Var);
        }
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ji1.a G3 = ((LocalityComponent) getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).G3();
        Bundle arguments = getArguments();
        ym.d dVar = null;
        if (arguments == null || (obj = arguments.get("menu_item_id")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof String)) {
            throw new ClassCastException("Property menu_item_id has different class type");
        } else if (obj != null) {
            ji1.a e2 = G3.e((String) obj);
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (obj2 = arguments2.get("slot_position")) == null) {
                obj2 = null;
            }
            if (obj2 != null && !(obj2 instanceof Integer)) {
                throw new ClassCastException("Property slot_position has different class type");
            } else if (obj2 != null) {
                ji1.a d2 = e2.d(((Integer) obj2).intValue());
                Bundle arguments3 = getArguments();
                if (arguments3 == null || (obj3 = arguments3.get("selected_product_id")) == null) {
                    obj3 = null;
                }
                if (obj3 != null && !(obj3 instanceof String)) {
                    throw new ClassCastException("Property selected_product_id has different class type");
                } else if (obj3 != null) {
                    ji1.a c2 = d2.c((String) obj3);
                    Bundle arguments4 = getArguments();
                    if (arguments4 != null && (obj4 = arguments4.get("screen")) != null) {
                        dVar = obj4;
                    }
                    if (dVar != null && !(dVar instanceof ym.d)) {
                        throw new ClassCastException("Property screen has different class type");
                    } else if (dVar != null) {
                        c2.b(dVar).a().a(this);
                        super.onAttach(context);
                    } else {
                        throw new IllegalArgumentException("Argument with key = screen not found in bundle");
                    }
                } else {
                    throw new IllegalArgumentException("Argument with key = selected_product_id not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = slot_position not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = menu_item_id not found in bundle");
        }
    }

    @Override // defpackage.t74, defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        WindowManager.LayoutParams layoutParams;
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = R.style.ComboDialogAnimation;
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        z65.h(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("customize_type")) == null) ? null : null;
        if (obj != null && !(obj instanceof gj1)) {
            throw new ClassCastException("Property customize_type has different class type");
        } else if (obj != null) {
            if (((gj1) obj) == gj1.a) {
                i2 = R.layout.combo_template_constructor;
            } else {
                i2 = R.layout.combo_customize_constructor;
            }
            View inflate = layoutInflater.inflate(i2, viewGroup, false);
            jb0.a.a(this);
            return inflate;
        } else {
            throw new IllegalArgumentException("Argument with key = customize_type not found in bundle");
        }
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        uh().clearOnScrollListeners();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        uh().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        uh().post(new Runnable() { // from class: li1
            @Override // java.lang.Runnable
            public final void run() {
                oi1.wh(oi1.this);
            }
        });
        RecyclerView uh = uh();
        b42 b42Var = this.e;
        b42Var.b(uh());
        uh.addOnScrollListener(new xoa(b42Var, null, new r(), 2, null));
        View view2 = getView();
        if (view2 != null) {
            oma.a(view2, new s());
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            g6c.a.g(window);
        }
    }

    public final jn6 rh() {
        jn6 jn6Var = this.g;
        if (jn6Var != null) {
            return jn6Var;
        }
        z65.z("moneyFactory");
        return null;
    }

    public final ComboTemplateConstructorPresenter sh() {
        MvpPresenter value = this.i.getValue(this, k[3]);
        z65.g(value, "getValue(...)");
        return (ComboTemplateConstructorPresenter) value;
    }

    public final as8<ComboTemplateConstructorPresenter> th() {
        as8<ComboTemplateConstructorPresenter> as8Var = this.h;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
