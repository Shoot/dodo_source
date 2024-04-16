package ru.dodopizza.app.presentation.product.card.combo.customize;

import android.content.Context;
import android.view.View;
import android.widget.Button;
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
import ru.dodopizza.app.presentation.product.card.combo.TemplatePizzaViewHolder;
/* compiled from: CustomizeTemplatePizzaViewHolder.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J`\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00172\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010#\u001a\u00020\u0004H\u0014R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u00105R*\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/customize/CustomizeTemplatePizzaViewHolder;", "Lru/dodopizza/app/presentation/product/card/combo/TemplatePizzaViewHolder;", "Lb88;", "data", "", "applyDescription", "setupProductTypeChangeListener", "configurePizzaVariations", "", "Lm78;", "getNonStopProducts", "showSelectedButton", "", "Lejb;", "addedToppings", "Lhn6;", "calculateToppingsSum", "Ljn6;", "moneyFactory", "", "isVariantDoughInSlot", "Lkotlin/Function1;", "onSelectClick", "Lkotlin/Function0;", "onChangeReceiptShown", "Lkotlin/Function2;", "", "onIngredientsChanged", "bind", "Ly89;", "changedReceipt", "applyChanges", "closeReceiptView", "selectedProduct", "renderSelectButton", "showSaveButton", "Landroidx/cardview/widget/CardView;", "comboTemplateCardView$delegate", "Lk79;", "getComboTemplateCardView", "()Landroidx/cardview/widget/CardView;", "comboTemplateCardView", "receiptCardView$delegate", "getReceiptCardView", "receiptCardView", "Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderLayout;", "comboCustomizeBuilder$delegate", "getComboCustomizeBuilder", "()Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderLayout;", "comboCustomizeBuilder", "Landroid/widget/Button;", "customizeReceiptButton$delegate", "getCustomizeReceiptButton", "()Landroid/widget/Button;", "customizeReceiptButton", "Lkotlin/jvm/functions/Function2;", "Lvp0;", "currentCardState", "Lvp0;", "previousChangedReceipt", "Ly89;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CustomizeTemplatePizzaViewHolder extends TemplatePizzaViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(CustomizeTemplatePizzaViewHolder.class, "comboTemplateCardView", "getComboTemplateCardView()Landroidx/cardview/widget/CardView;", 0)), bc9.f(new ar8(CustomizeTemplatePizzaViewHolder.class, "receiptCardView", "getReceiptCardView()Landroidx/cardview/widget/CardView;", 0)), bc9.f(new ar8(CustomizeTemplatePizzaViewHolder.class, "comboCustomizeBuilder", "getComboCustomizeBuilder()Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderLayout;", 0)), bc9.f(new ar8(CustomizeTemplatePizzaViewHolder.class, "customizeReceiptButton", "getCustomizeReceiptButton()Landroid/widget/Button;", 0))};
    private final k79 comboCustomizeBuilder$delegate;
    private final k79 comboTemplateCardView$delegate;
    private vp0 currentCardState;
    private final k79 customizeReceiptButton$delegate;
    private Function2<? super Integer, ? super m78, Unit> onIngredientsChanged;
    private y89 previousChangedReceipt;
    private final k79 receiptCardView$delegate;

    /* compiled from: CustomizeTemplatePizzaViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ Function2<Integer, m78, Unit> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CustomizeTemplatePizzaViewHolder.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ru.dodopizza.app.presentation.product.card.combo.customize.CustomizeTemplatePizzaViewHolder$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0590a extends ej5 implements Function0<Unit> {
            final /* synthetic */ CustomizeTemplatePizzaViewHolder a;
            final /* synthetic */ Function2<Integer, m78, Unit> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0590a(CustomizeTemplatePizzaViewHolder customizeTemplatePizzaViewHolder, Function2<? super Integer, ? super m78, Unit> function2) {
                super(0);
                this.a = customizeTemplatePizzaViewHolder;
                this.b = function2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.currentCardState = vp0.a;
                Function2<Integer, m78, Unit> function2 = this.b;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(this.a.getAbsoluteAdapterPosition()), this.a.getSelectedProduct());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Integer, ? super m78, Unit> function2) {
            super(0);
            this.b = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CustomizeTemplatePizzaViewHolder customizeTemplatePizzaViewHolder = CustomizeTemplatePizzaViewHolder.this;
            Context context = customizeTemplatePizzaViewHolder.getCustomizeReceiptButton().getContext();
            z65.g(context, "getContext(...)");
            customizeTemplatePizzaViewHolder.flipCard(context, CustomizeTemplatePizzaViewHolder.this.getComboTemplateCardView(), CustomizeTemplatePizzaViewHolder.this.getReceiptCardView(), new C0590a(CustomizeTemplatePizzaViewHolder.this, this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomizeTemplatePizzaViewHolder.kt */
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
            CustomizeTemplatePizzaViewHolder.this.currentCardState = vp0.b;
            Function0<Unit> function0 = this.b;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* compiled from: CustomizeTemplatePizzaViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function1<m78, Unit> b;
        final /* synthetic */ b88 c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CustomizeTemplatePizzaViewHolder.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<Unit> {
            final /* synthetic */ Function1<m78, Unit> a;
            final /* synthetic */ CustomizeTemplatePizzaViewHolder b;
            final /* synthetic */ b88 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super m78, Unit> function1, CustomizeTemplatePizzaViewHolder customizeTemplatePizzaViewHolder, b88 b88Var) {
                super(0);
                this.a = function1;
                this.b = customizeTemplatePizzaViewHolder;
                this.c = b88Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.invoke(this.b.getSelectedProduct());
                this.b.previousChangedReceipt = this.c.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super m78, Unit> function1, b88 b88Var) {
            super(1);
            this.b = function1;
            this.c = b88Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            CustomizeTemplatePizzaViewHolder.this.getComboCustomizeBuilder().p6(new a(this.b, CustomizeTemplatePizzaViewHolder.this, this.c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomizeTemplatePizzaViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "dough", "", "a", "(II)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ b88 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b88 b88Var) {
            super(2);
            this.b = b88Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(int i, int i2) {
            m78 m78Var;
            Object obj;
            int w;
            List<ExpandableFoodValueInfoIconView.c> e;
            CustomizeTemplatePizzaViewHolder customizeTemplatePizzaViewHolder = CustomizeTemplatePizzaViewHolder.this;
            Iterator it = customizeTemplatePizzaViewHolder.getNonStopProducts(this.b).iterator();
            while (true) {
                m78Var = null;
                if (it.hasNext()) {
                    obj = it.next();
                    m78 m78Var2 = (m78) obj;
                    if (i == m78Var2.u() && i2 == m78Var2.q()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            m78 m78Var3 = (m78) obj;
            if (m78Var3 == null) {
                Iterator it2 = CustomizeTemplatePizzaViewHolder.this.getNonStopProducts(this.b).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (i == ((m78) next).u()) {
                        m78Var = next;
                        break;
                    }
                }
                m78Var3 = m78Var;
                if (m78Var3 == null) {
                    m78Var3 = CustomizeTemplatePizzaViewHolder.this.getSelectedProduct();
                }
            }
            customizeTemplatePizzaViewHolder.setSelectedProduct(m78Var3);
            ComboCustomizeBuilderLayout comboCustomizeBuilder = CustomizeTemplatePizzaViewHolder.this.getComboCustomizeBuilder();
            String i3 = this.b.i();
            String id = CustomizeTemplatePizzaViewHolder.this.getSelectedProduct().getId();
            Collection<ul8> k = CustomizeTemplatePizzaViewHolder.this.getSelectedProduct().k();
            Collection<ejb> a = CustomizeTemplatePizzaViewHolder.this.getSelectedProduct().a();
            List<m78> h = this.b.h();
            w = lc1.w(h, 10);
            ArrayList arrayList = new ArrayList(w);
            for (m78 m78Var4 : h) {
                arrayList.add(m78Var4.getId());
            }
            comboCustomizeBuilder.n7(i3, id, k, a, arrayList, true);
            CustomizeTemplatePizzaViewHolder customizeTemplatePizzaViewHolder2 = CustomizeTemplatePizzaViewHolder.this;
            customizeTemplatePizzaViewHolder2.showImage(customizeTemplatePizzaViewHolder2.getSelectedProduct());
            ExpandableFoodValueInfoIconView productFoodValueInfo = CustomizeTemplatePizzaViewHolder.this.getProductFoodValueInfo();
            e = jc1.e(ExpandableFoodValueInfoIconView.e.a().invoke(CustomizeTemplatePizzaViewHolder.this.getSelectedProduct()));
            productFoodValueInfo.t(e, true);
            CustomizeTemplatePizzaViewHolder.this.getProductSize().setText(CustomizeTemplatePizzaViewHolder.this.getProductSize().getResources().getString(R.string.two_phrase_placeholder, CustomizeTemplatePizzaViewHolder.this.getSelectedProduct().s().e(), qhb.a(CustomizeTemplatePizzaViewHolder.this.getSelectedProduct().o().e())));
            CustomizeTemplatePizzaViewHolder.this.configurePizzaVariations(this.b);
            Function2 function2 = CustomizeTemplatePizzaViewHolder.this.onIngredientsChanged;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(CustomizeTemplatePizzaViewHolder.this.getAbsoluteAdapterPosition()), CustomizeTemplatePizzaViewHolder.this.getSelectedProduct());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomizeTemplatePizzaViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.item_customize_template_pizza_product);
        z65.h(kzbVar, "viewInflater");
        this.comboTemplateCardView$delegate = kb0.g(this, R.id.combo_template_slot_root_card);
        this.receiptCardView$delegate = kb0.g(this, R.id.customize_layout_root_card);
        this.comboCustomizeBuilder$delegate = kb0.g(this, R.id.combo_customize_view);
        this.customizeReceiptButton$delegate = kb0.g(this, R.id.combo_customize_receipt);
        this.currentCardState = vp0.a;
        this.previousChangedReceipt = y89.c.a();
    }

    private final void applyDescription(b88 b88Var) {
        List l;
        List l2;
        Collection<ejb> b2;
        int w;
        Collection<ul8> c2;
        int w2;
        y89 d2 = b88Var.d();
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
        y89 d3 = b88Var.d();
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
            getProductDescription().setText(getSelectedProduct().f());
            return;
        }
        Context context = getProductDescription().getContext();
        z65.g(context, "getContext(...)");
        applyChangedReceiptDescription(context, getSelectedProduct().k(), l, l2, getProductDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(CustomizeTemplatePizzaViewHolder customizeTemplatePizzaViewHolder, b88 b88Var, Function0 function0, View view) {
        int w;
        z65.h(customizeTemplatePizzaViewHolder, "this$0");
        z65.h(b88Var, "$data");
        ComboCustomizeBuilderLayout comboCustomizeBuilder = customizeTemplatePizzaViewHolder.getComboCustomizeBuilder();
        String i = b88Var.i();
        String id = customizeTemplatePizzaViewHolder.getSelectedProduct().getId();
        Collection<ul8> k = customizeTemplatePizzaViewHolder.getSelectedProduct().k();
        Collection<ejb> a2 = customizeTemplatePizzaViewHolder.getSelectedProduct().a();
        List<m78> h = b88Var.h();
        w = lc1.w(h, 10);
        ArrayList arrayList = new ArrayList(w);
        for (m78 m78Var : h) {
            arrayList.add(m78Var.getId());
        }
        comboCustomizeBuilder.n7(i, id, k, a2, arrayList, true);
        Context context = customizeTemplatePizzaViewHolder.getCustomizeReceiptButton().getContext();
        z65.g(context, "getContext(...)");
        customizeTemplatePizzaViewHolder.flipCard(context, customizeTemplatePizzaViewHolder.getReceiptCardView(), customizeTemplatePizzaViewHolder.getComboTemplateCardView(), new b(function0));
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
    public final void configurePizzaVariations(b88 b88Var) {
        List F0;
        int w;
        int e;
        int e2;
        int w2;
        int[] E0;
        int[] E02;
        int[] E03;
        int e0;
        List<m78> nonStopProducts = getNonStopProducts(b88Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : nonStopProducts) {
            Integer valueOf = Integer.valueOf(((m78) obj).u());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        F0 = sc1.F0(linkedHashMap.keySet());
        List<m78> h = b88Var.h();
        w = lc1.w(h, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2);
        for (m78 m78Var : h) {
            String valueOf2 = String.valueOf(m78Var.u());
            String e3 = m78Var.s().e();
            e0 = m0b.e0(m78Var.s().e(), m78Var.m().getValue(), 0, false, 6, null);
            String substring = e3.substring(e0);
            z65.g(substring, "substring(...)");
            linkedHashMap2.put(valueOf2, substring);
        }
        ArrayList<m78> arrayList = new ArrayList();
        for (Object obj3 : nonStopProducts) {
            if (((m78) obj3).u() == getSelectedProduct().u()) {
                arrayList.add(obj3);
            }
        }
        getProductTypeControl().h(new int[]{2, 1});
        w2 = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (m78 m78Var2 : arrayList) {
            arrayList2.add(Integer.valueOf(m78Var2.q()));
        }
        E0 = sc1.E0(arrayList2);
        if (E0.length == 0) {
            getProductTypeControl().setDoughControlVisible(false);
        } else {
            getProductTypeControl().setDoughControlVisible(true);
            getProductTypeControl().q(E0);
            getProductTypeControl().e(E0);
        }
        if (F0.isEmpty()) {
            getProductTypeControl().setSizeControlVisible(false);
        } else {
            getProductTypeControl().setSizeControlVisible(true);
            getProductTypeControl().i(new int[]{3, 2, 1});
            PizzaVariationControlViewLite productTypeControl = getProductTypeControl();
            List list = F0;
            E02 = sc1.E0(list);
            productTypeControl.r(E02);
            PizzaVariationControlViewLite productTypeControl2 = getProductTypeControl();
            E03 = sc1.E0(list);
            productTypeControl2.f(E03);
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
        }
        getProductTypeControl().n(getSelectedProduct().s().d(), getSelectedProduct().q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComboCustomizeBuilderLayout getComboCustomizeBuilder() {
        return (ComboCustomizeBuilderLayout) this.comboCustomizeBuilder$delegate.a(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardView getComboTemplateCardView() {
        return (CardView) this.comboTemplateCardView$delegate.a(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Button getCustomizeReceiptButton() {
        return (Button) this.customizeReceiptButton$delegate.a(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<m78> getNonStopProducts(b88 b88Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : b88Var.h()) {
            if (!b88Var.g().contains(((m78) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardView getReceiptCardView() {
        return (CardView) this.receiptCardView$delegate.a(this, $$delegatedProperties[1]);
    }

    private final void setupProductTypeChangeListener(b88 b88Var) {
        getProductTypeControl().l();
        getProductTypeControl().setOnVariationChangeListener(new d(b88Var));
    }

    private final void showSelectedButton() {
        Button productSelectButton = getProductSelectButton();
        productSelectButton.setText(productSelectButton.getContext().getString(R.string.select));
        productSelectButton.setEnabled(true);
        productSelectButton.setActivated(false);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.TemplatePizzaViewHolder
    public void applyChanges(b88 b88Var, y89 y89Var) {
        z65.h(b88Var, "data");
        z65.h(y89Var, "changedReceipt");
        super.applyChanges(b88Var, y89Var);
        boolean z = true;
        boolean z2 = !z65.c(y89Var, this.previousChangedReceipt);
        List<m78> h = b88Var.h();
        if (!(h instanceof Collection) || !h.isEmpty()) {
            for (m78 m78Var : h) {
                if (z65.c(m78Var.getId(), b88Var.j())) {
                    break;
                }
            }
        }
        z = false;
        b88 c2 = b88.c(b88Var, null, null, null, null, null, null, y89Var, 63, null);
        setupProductTypeChangeListener(c2);
        applyDescription(c2);
        renderSelectButton(getSelectedProduct(), c2);
        if (z2) {
            if (z) {
                showSaveButton();
            } else {
                showSelectedButton();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    @Override // ru.dodopizza.app.presentation.product.card.combo.TemplatePizzaViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bind(defpackage.jn6 r2, final defpackage.b88 r3, boolean r4, kotlin.jvm.functions.Function1<? super defpackage.m78, kotlin.Unit> r5, final kotlin.jvm.functions.Function0<kotlin.Unit> r6, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super defpackage.m78, kotlin.Unit> r7) {
        /*
            r1 = this;
            java.lang.String r0 = "moneyFactory"
            defpackage.z65.h(r2, r0)
            java.lang.String r0 = "data"
            defpackage.z65.h(r3, r0)
            java.lang.String r0 = "onSelectClick"
            defpackage.z65.h(r5, r0)
            super.bind(r2, r3, r4, r5, r6, r7)
            r1.onIngredientsChanged = r7
            ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderLayout r2 = r1.getComboCustomizeBuilder()
            r2.d4()
            ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderLayout r2 = r1.getComboCustomizeBuilder()
            ru.dodopizza.app.presentation.product.card.combo.customize.CustomizeTemplatePizzaViewHolder$a r4 = new ru.dodopizza.app.presentation.product.card.combo.customize.CustomizeTemplatePizzaViewHolder$a
            r4.<init>(r7)
            r2.setOnCloseListener(r4)
            android.widget.Button r2 = r1.getCustomizeReceiptButton()
            f62 r4 = new f62
            r4.<init>()
            r2.setOnClickListener(r4)
            android.widget.Button r2 = r1.getProductSelectButton()
            ru.dodopizza.app.presentation.product.card.combo.customize.CustomizeTemplatePizzaViewHolder$c r4 = new ru.dodopizza.app.presentation.product.card.combo.customize.CustomizeTemplatePizzaViewHolder$c
            r4.<init>(r5, r3)
            defpackage.oma.a(r2, r4)
            android.widget.Button r2 = r1.getCustomizeReceiptButton()
            m78 r4 = r1.getSelectedProduct()
            java.util.Collection r4 = r4.k()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L5d
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L5d
            goto L74
        L5d:
            java.util.Iterator r4 = r4.iterator()
        L61:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L74
            java.lang.Object r5 = r4.next()
            ul8 r5 = (defpackage.ul8) r5
            boolean r5 = r5.d()
            if (r5 == 0) goto L61
            goto La2
        L74:
            m78 r4 = r1.getSelectedProduct()
            java.util.Collection r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L8c
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L8c
            goto Lb6
        L8c:
            java.util.Iterator r4 = r4.iterator()
        L90:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb6
            java.lang.Object r5 = r4.next()
            ejb r5 = (defpackage.ejb) r5
            boolean r5 = r5.a()
            if (r5 == 0) goto L90
        La2:
            java.util.Collection r4 = r3.g()
            m78 r5 = r1.getSelectedProduct()
            java.lang.String r5 = r5.getId()
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto Lb6
            r4 = 1
            goto Lb7
        Lb6:
            r4 = 0
        Lb7:
            if (r4 == 0) goto Lbb
            r4 = 0
            goto Lbd
        Lbb:
            r4 = 8
        Lbd:
            r2.setVisibility(r4)
            r1.applyDescription(r3)
            android.widget.TextView r2 = r1.getProductSize()
            android.widget.TextView r4 = r1.getProductSize()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            m78 r0 = r1.getSelectedProduct()
            fna r0 = r0.s()
            java.lang.String r0 = r0.e()
            r5[r7] = r0
            m78 r7 = r1.getSelectedProduct()
            w63 r7 = r7.o()
            java.lang.String r7 = r7.e()
            java.lang.String r7 = defpackage.qhb.a(r7)
            r5[r6] = r7
            r6 = 2131887597(0x7f1205ed, float:1.9409806E38)
            java.lang.String r4 = r4.getString(r6, r5)
            r2.setText(r4)
            com.dodopizza.order.feature.product.card.presentation.pizza.view.PizzaVariationControlViewLite r2 = r1.getProductTypeControl()
            r2.k()
            r1.setupProductTypeChangeListener(r3)
            r1.configurePizzaVariations(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.product.card.combo.customize.CustomizeTemplatePizzaViewHolder.bind(jn6, b88, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2):void");
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.TemplatePizzaViewHolder
    public void closeReceiptView() {
        super.closeReceiptView();
        if (this.currentCardState == vp0.b) {
            getComboCustomizeBuilder().W3();
            this.currentCardState = vp0.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.dodopizza.app.presentation.product.card.combo.TemplatePizzaViewHolder
    public void renderSelectButton(m78 m78Var, b88 b88Var) {
        List l;
        boolean z;
        Collection<ejb> b2;
        int w;
        z65.h(m78Var, "selectedProduct");
        z65.h(b88Var, "data");
        super.renderSelectButton(m78Var, b88Var);
        y89 d2 = b88Var.d();
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
        for (Object obj : m78Var.a()) {
            if (l.contains(((ejb) obj).d())) {
                arrayList.add(obj);
            }
        }
        Iterator<m78> it = b88Var.h().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (z65.c(it.next().getId(), m78Var.getId())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        double a2 = calculateToppingsSum(arrayList).a() + b88Var.f().get(i).a();
        if (a2 == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            un3.k(getExtraPrice());
            getExtraPrice().setText(getExtraPrice().getContext().getString(R.string.plus_label, un6.b(getMoneyFactory().b(a2))));
            return;
        }
        un3.e(getExtraPrice());
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.TemplatePizzaViewHolder
    protected void showSaveButton() {
        Button productSelectButton = getProductSelectButton();
        productSelectButton.setText(productSelectButton.getContext().getString(R.string.save));
        productSelectButton.setEnabled(true);
        productSelectButton.setActivated(false);
    }
}
