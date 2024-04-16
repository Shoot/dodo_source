package ru.dodopizza.app.presentation.product.card.combo.customize;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.dodopizza.order.feature.product.card.presentation.pizza.view.PizzaVariationControlViewLite;
import com.dodopizza.order.feature.product.card.presentation.view.ExpandableFoodValueInfoIconView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.i;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.product.card.combo.TemplateProductViewHolder;
/* compiled from: CustomizeTemplateProductViewHolder.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J0\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00102\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J$\u0010 \u001a\u00020\u00042\u001a\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u00100R\u001b\u00104\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u00100R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u00108R*\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/customize/CustomizeTemplateProductViewHolder;", "Lru/dodopizza/app/presentation/product/card/combo/TemplateProductViewHolder;", "Lqla;", "data", "", "applyDescription", "setupProductTypeChangeListener", "configureProductVariations", "", "Lswb;", "getNonStopVariableProducts", "", "Lejb;", "addedToppings", "Lhn6;", "calculateToppingsSum", "Lfl8;", "product", "getToppings", "Ljn6;", "moneyFactory", "selectedProduct", "Lkotlin/Function0;", "onChangeReceiptShown", "bind", "Ly89;", "changedReceipt", "applyChangedReceipt", "closeReceiptView", "Lkotlin/Function2;", "", "onIngredientsChanged", "setIngredientChangedListener", "renderSelectButton", "Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderLayout;", "comboCustomizeBuilder$delegate", "Lk79;", "getComboCustomizeBuilder", "()Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderLayout;", "comboCustomizeBuilder", "Landroid/widget/Button;", "customizeReceiptButton$delegate", "getCustomizeReceiptButton", "()Landroid/widget/Button;", "customizeReceiptButton", "Landroidx/cardview/widget/CardView;", "receiptCardView$delegate", "getReceiptCardView", "()Landroidx/cardview/widget/CardView;", "receiptCardView", "comboTemplateCardView$delegate", "getComboTemplateCardView", "comboTemplateCardView", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", "productTypeControl$delegate", "getProductTypeControl", "()Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", "productTypeControl", "Lkotlin/jvm/functions/Function2;", "Lvp0;", "currentCardState", "Lvp0;", "previousChangedReceipt", "Ly89;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CustomizeTemplateProductViewHolder extends TemplateProductViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(CustomizeTemplateProductViewHolder.class, "comboCustomizeBuilder", "getComboCustomizeBuilder()Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderLayout;", 0)), bc9.f(new ar8(CustomizeTemplateProductViewHolder.class, "customizeReceiptButton", "getCustomizeReceiptButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(CustomizeTemplateProductViewHolder.class, "receiptCardView", "getReceiptCardView()Landroidx/cardview/widget/CardView;", 0)), bc9.f(new ar8(CustomizeTemplateProductViewHolder.class, "comboTemplateCardView", "getComboTemplateCardView()Landroidx/cardview/widget/CardView;", 0)), bc9.f(new ar8(CustomizeTemplateProductViewHolder.class, "productTypeControl", "getProductTypeControl()Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", 0))};
    private final k79 comboCustomizeBuilder$delegate;
    private final k79 comboTemplateCardView$delegate;
    private vp0 currentCardState;
    private final k79 customizeReceiptButton$delegate;
    private Function2<? super Integer, ? super fl8, Unit> onIngredientsChanged;
    private y89 previousChangedReceipt;
    private final k79 productTypeControl$delegate;
    private final k79 receiptCardView$delegate;

    /* compiled from: CustomizeTemplateProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ fl8 b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CustomizeTemplateProductViewHolder.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ru.dodopizza.app.presentation.product.card.combo.customize.CustomizeTemplateProductViewHolder$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0591a extends ej5 implements Function0<Unit> {
            final /* synthetic */ CustomizeTemplateProductViewHolder a;
            final /* synthetic */ fl8 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0591a(CustomizeTemplateProductViewHolder customizeTemplateProductViewHolder, fl8 fl8Var) {
                super(0);
                this.a = customizeTemplateProductViewHolder;
                this.b = fl8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.currentCardState = vp0.a;
                Function2 function2 = this.a.onIngredientsChanged;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(this.a.getAbsoluteAdapterPosition()), this.b);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fl8 fl8Var) {
            super(0);
            this.b = fl8Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CustomizeTemplateProductViewHolder customizeTemplateProductViewHolder = CustomizeTemplateProductViewHolder.this;
            Context context = customizeTemplateProductViewHolder.getCustomizeReceiptButton().getContext();
            z65.g(context, "getContext(...)");
            customizeTemplateProductViewHolder.flipCard(context, CustomizeTemplateProductViewHolder.this.getComboTemplateCardView(), CustomizeTemplateProductViewHolder.this.getReceiptCardView(), new C0591a(CustomizeTemplateProductViewHolder.this, this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomizeTemplateProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0) {
            super(0);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CustomizeTemplateProductViewHolder.this.currentCardState = vp0.b;
            Function0<Unit> function0 = this.b;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* compiled from: CustomizeTemplateProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ qla b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CustomizeTemplateProductViewHolder.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<Unit> {
            final /* synthetic */ CustomizeTemplateProductViewHolder a;
            final /* synthetic */ qla b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CustomizeTemplateProductViewHolder customizeTemplateProductViewHolder, qla qlaVar) {
                super(0);
                this.a = customizeTemplateProductViewHolder;
                this.b = qlaVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getOnSelectClick().invoke(this.a.getSelectedProduct());
                this.a.previousChangedReceipt = this.b.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(qla qlaVar) {
            super(1);
            this.b = qlaVar;
        }

        public final void a(View view) {
            z65.h(view, "it");
            CustomizeTemplateProductViewHolder.this.getComboCustomizeBuilder().p6(new a(CustomizeTemplateProductViewHolder.this, this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomizeTemplateProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "size", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<Integer, Unit> {
        final /* synthetic */ qla b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(qla qlaVar) {
            super(1);
            this.b = qlaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            Object obj;
            int w;
            List<ExpandableFoodValueInfoIconView.c> e;
            CustomizeTemplateProductViewHolder customizeTemplateProductViewHolder = CustomizeTemplateProductViewHolder.this;
            Iterator it = customizeTemplateProductViewHolder.getNonStopVariableProducts(this.b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (i == ((swb) obj).s()) {
                    break;
                }
            }
            fl8 fl8Var = (swb) obj;
            if (fl8Var == null) {
                fl8Var = CustomizeTemplateProductViewHolder.this.getSelectedProduct();
            }
            customizeTemplateProductViewHolder.setSelectedProduct(fl8Var);
            ComboCustomizeBuilderLayout comboCustomizeBuilder = CustomizeTemplateProductViewHolder.this.getComboCustomizeBuilder();
            String i2 = this.b.i();
            String id = CustomizeTemplateProductViewHolder.this.getSelectedProduct().getId();
            Collection<ul8> k = CustomizeTemplateProductViewHolder.this.getSelectedProduct().k();
            CustomizeTemplateProductViewHolder customizeTemplateProductViewHolder2 = CustomizeTemplateProductViewHolder.this;
            Collection<ejb> toppings = customizeTemplateProductViewHolder2.getToppings(customizeTemplateProductViewHolder2.getSelectedProduct());
            List<fl8> h = this.b.h();
            w = lc1.w(h, 10);
            ArrayList arrayList = new ArrayList(w);
            for (fl8 fl8Var2 : h) {
                arrayList.add(fl8Var2.getId());
            }
            comboCustomizeBuilder.n7(i2, id, k, toppings, arrayList, true);
            CustomizeTemplateProductViewHolder customizeTemplateProductViewHolder3 = CustomizeTemplateProductViewHolder.this;
            customizeTemplateProductViewHolder3.showImage(customizeTemplateProductViewHolder3.getSelectedProduct());
            ExpandableFoodValueInfoIconView productFoodValueInfo = CustomizeTemplateProductViewHolder.this.getProductFoodValueInfo();
            e = jc1.e(ExpandableFoodValueInfoIconView.e.a().invoke(CustomizeTemplateProductViewHolder.this.getSelectedProduct()));
            productFoodValueInfo.t(e, true);
            TextView productSize = CustomizeTemplateProductViewHolder.this.getProductSize();
            fl8 selectedProduct = CustomizeTemplateProductViewHolder.this.getSelectedProduct();
            z65.f(selectedProduct, "null cannot be cast to non-null type com.dodopizza.common.product.VariableProduct");
            productSize.setText(((swb) selectedProduct).r().e());
            CustomizeTemplateProductViewHolder.this.configureProductVariations(this.b);
            Function2 function2 = CustomizeTemplateProductViewHolder.this.onIngredientsChanged;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(CustomizeTemplateProductViewHolder.this.getAbsoluteAdapterPosition()), CustomizeTemplateProductViewHolder.this.getSelectedProduct());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomizeTemplateProductViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.item_customize_template_simple_product);
        z65.h(kzbVar, "viewInflater");
        this.comboCustomizeBuilder$delegate = kb0.g(this, R.id.combo_customize_view);
        this.customizeReceiptButton$delegate = kb0.g(this, R.id.combo_customize_receipt);
        this.receiptCardView$delegate = kb0.g(this, R.id.customize_layout_root_card);
        this.comboTemplateCardView$delegate = kb0.g(this, R.id.combo_template_slot_root_card);
        this.productTypeControl$delegate = kb0.g(this, R.id.combo_template_pizza_type);
        this.currentCardState = vp0.a;
        this.previousChangedReceipt = y89.c.a();
    }

    private final void applyDescription(qla qlaVar) {
        List l;
        List l2;
        Collection<ejb> b2;
        int w;
        Collection<ul8> c2;
        int w2;
        y89 d2 = qlaVar.d();
        if (d2 == null || (c2 = d2.c()) == null) {
            l = kc1.l();
        } else {
            Collection<ul8> collection = c2;
            w2 = lc1.w(collection, 10);
            l = new ArrayList(w2);
            for (ul8 ul8Var : collection) {
                l.add(ul8Var.getId());
            }
        }
        y89 d3 = qlaVar.d();
        if (d3 == null || (b2 = d3.b()) == null) {
            l2 = kc1.l();
        } else {
            Collection<ejb> collection2 = b2;
            w = lc1.w(collection2, 10);
            l2 = new ArrayList(w);
            for (ejb ejbVar : collection2) {
                l2.add(ejbVar.getName());
            }
        }
        if (l.isEmpty() && l2.isEmpty() && getSelectedProduct().f().length() > 0) {
            showDescription(getSelectedProduct().f());
            return;
        }
        Context context = getProductDescription().getContext();
        z65.g(context, "getContext(...)");
        applyChangedReceiptDescription(context, getSelectedProduct().k(), l, l2, getProductDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(CustomizeTemplateProductViewHolder customizeTemplateProductViewHolder, qla qlaVar, fl8 fl8Var, Function0 function0, View view) {
        int w;
        z65.h(customizeTemplateProductViewHolder, "this$0");
        z65.h(qlaVar, "$data");
        z65.h(fl8Var, "$selectedProduct");
        ComboCustomizeBuilderLayout comboCustomizeBuilder = customizeTemplateProductViewHolder.getComboCustomizeBuilder();
        String i = qlaVar.i();
        String id = fl8Var.getId();
        Collection<ul8> k = fl8Var.k();
        Collection<ejb> toppings = customizeTemplateProductViewHolder.getToppings(customizeTemplateProductViewHolder.getSelectedProduct());
        List<fl8> h = qlaVar.h();
        w = lc1.w(h, 10);
        ArrayList arrayList = new ArrayList(w);
        for (fl8 fl8Var2 : h) {
            arrayList.add(fl8Var2.getId());
        }
        comboCustomizeBuilder.n7(i, id, k, toppings, arrayList, true);
        Context context = customizeTemplateProductViewHolder.getCustomizeReceiptButton().getContext();
        z65.g(context, "getContext(...)");
        customizeTemplateProductViewHolder.flipCard(context, customizeTemplateProductViewHolder.getReceiptCardView(), customizeTemplateProductViewHolder.getComboTemplateCardView(), new b(function0));
    }

    private final hn6 calculateToppingsSum(Collection<ejb> collection) {
        double d2 = 0.0d;
        if (collection != null && !collection.isEmpty()) {
            for (ejb ejbVar : collection) {
                d2 += ejbVar.h().a();
            }
            return getMoneyFactory().b(d2);
        }
        return getMoneyFactory().b(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureProductVariations(qla qlaVar) {
        List F0;
        int w;
        int e;
        int e2;
        int[] E0;
        int w2;
        int[] E02;
        if (!(getSelectedProduct() instanceof swb)) {
            getProductTypeControl().setSizeControlVisible(false);
            return;
        }
        ArrayList<swb> arrayList = new ArrayList();
        for (Object obj : qlaVar.h()) {
            if (obj instanceof swb) {
                arrayList.add(obj);
            }
        }
        List<swb> nonStopVariableProducts = getNonStopVariableProducts(qlaVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            Integer valueOf = Integer.valueOf(((swb) obj2).s());
            Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(valueOf, obj3);
            }
            ((List) obj3).add(obj2);
        }
        F0 = sc1.F0(linkedHashMap.keySet());
        w = lc1.w(arrayList, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2);
        for (swb swbVar : arrayList) {
            linkedHashMap2.put(String.valueOf(swbVar.s()), swbVar.r().e());
        }
        getProductTypeControl().setSizeControlVisible(true);
        if (nonStopVariableProducts.size() <= 1) {
            un3.e(getProductTypeControl());
        } else {
            un3.k(getProductTypeControl());
            PizzaVariationControlViewLite productTypeControl = getProductTypeControl();
            E0 = sc1.E0(F0);
            productTypeControl.r(E0);
        }
        getProductTypeControl().d(new int[]{3, 2, 1});
        PizzaVariationControlViewLite productTypeControl2 = getProductTypeControl();
        List<swb> list = nonStopVariableProducts;
        w2 = lc1.w(list, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (swb swbVar2 : list) {
            arrayList2.add(Integer.valueOf(swbVar2.s()));
        }
        E02 = sc1.E0(arrayList2);
        productTypeControl2.f(E02);
        PizzaVariationControlViewLite productTypeControl3 = getProductTypeControl();
        String str = (String) linkedHashMap2.get("1");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        productTypeControl3.setSmallSizeText(str);
        PizzaVariationControlViewLite productTypeControl4 = getProductTypeControl();
        String str3 = (String) linkedHashMap2.get("2");
        if (str3 == null) {
            str3 = "";
        }
        productTypeControl4.setMediumSizeText(str3);
        PizzaVariationControlViewLite productTypeControl5 = getProductTypeControl();
        String str4 = (String) linkedHashMap2.get("3");
        if (str4 != null) {
            str2 = str4;
        }
        productTypeControl5.setLargeSizeText(str2);
        fl8 selectedProduct = getSelectedProduct();
        z65.f(selectedProduct, "null cannot be cast to non-null type com.dodopizza.common.product.VariableProduct");
        getProductTypeControl().setSelectedSize(((swb) selectedProduct).r().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComboCustomizeBuilderLayout getComboCustomizeBuilder() {
        return (ComboCustomizeBuilderLayout) this.comboCustomizeBuilder$delegate.a(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardView getComboTemplateCardView() {
        return (CardView) this.comboTemplateCardView$delegate.a(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Button getCustomizeReceiptButton() {
        return (Button) this.customizeReceiptButton$delegate.a(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<swb> getNonStopVariableProducts(qla qlaVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : qlaVar.h()) {
            if (obj instanceof swb) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!qlaVar.g().contains(((swb) obj2).getId())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    private final PizzaVariationControlViewLite getProductTypeControl() {
        return (PizzaVariationControlViewLite) this.productTypeControl$delegate.a(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardView getReceiptCardView() {
        return (CardView) this.receiptCardView$delegate.a(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<ejb> getToppings(fl8 fl8Var) {
        List l;
        if (!(fl8Var instanceof um8)) {
            l = kc1.l();
            return l;
        }
        return ((um8) fl8Var).a();
    }

    private final void setupProductTypeChangeListener(qla qlaVar) {
        if (!(getSelectedProduct() instanceof swb)) {
            return;
        }
        getProductTypeControl().l();
        getProductTypeControl().setOnSizeChangeListener(new d(qlaVar));
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.TemplateProductViewHolder
    public void applyChangedReceipt(qla qlaVar, y89 y89Var) {
        z65.h(qlaVar, "data");
        z65.h(y89Var, "changedReceipt");
        super.applyChangedReceipt(qlaVar, y89Var);
        boolean z = !z65.c(y89Var, this.previousChangedReceipt);
        qla c2 = qla.c(qlaVar, null, null, null, false, null, null, y89Var, 63, null);
        setupProductTypeChangeListener(c2);
        applyDescription(c2);
        renderSelectButton(getSelectedProduct(), c2);
        if (z) {
            showSelectButton();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
        r9 = true;
     */
    @Override // ru.dodopizza.app.presentation.product.card.combo.TemplateProductViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bind(defpackage.jn6 r9, final defpackage.qla r10, final defpackage.fl8 r11, final kotlin.jvm.functions.Function0<kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.product.card.combo.customize.CustomizeTemplateProductViewHolder.bind(jn6, qla, fl8, kotlin.jvm.functions.Function0):void");
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.TemplateProductViewHolder
    public void closeReceiptView() {
        super.closeReceiptView();
        if (this.currentCardState == vp0.b) {
            getComboCustomizeBuilder().W3();
            this.currentCardState = vp0.a;
        }
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.TemplateProductViewHolder
    public void renderSelectButton(fl8 fl8Var, qla qlaVar) {
        List l;
        boolean z;
        Collection<ejb> b2;
        int w;
        z65.h(fl8Var, "selectedProduct");
        z65.h(qlaVar, "data");
        super.renderSelectButton(fl8Var, qlaVar);
        y89 d2 = qlaVar.d();
        if (d2 == null || (b2 = d2.b()) == null) {
            l = kc1.l();
        } else {
            Collection<ejb> collection = b2;
            w = lc1.w(collection, 10);
            l = new ArrayList(w);
            for (ejb ejbVar : collection) {
                l.add(ejbVar.d());
            }
        }
        Collection<ejb> arrayList = new ArrayList<>();
        for (Object obj : getToppings(fl8Var)) {
            if (l.contains(((ejb) obj).d())) {
                arrayList.add(obj);
            }
        }
        double a2 = calculateToppingsSum(arrayList).a();
        List<hn6> e = qlaVar.e();
        Iterator<fl8> it = qlaVar.h().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (z65.c(it.next().getId(), fl8Var.getId())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        double a3 = a2 + e.get(i).a();
        if (a3 == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            un3.k(getExtraPrice());
            getExtraPrice().setText(getExtraPrice().getContext().getString(R.string.plus_label, un6.b(getMoneyFactory().b(a3))));
            return;
        }
        un3.e(getExtraPrice());
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.TemplateProductViewHolder
    public void setIngredientChangedListener(Function2<? super Integer, ? super fl8, Unit> function2) {
        this.onIngredientsChanged = function2;
    }
}
