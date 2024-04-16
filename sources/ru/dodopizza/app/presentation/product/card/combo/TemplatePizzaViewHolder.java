package ru.dodopizza.app.presentation.product.card.combo;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.dodopizza.order.feature.product.card.presentation.pizza.view.PizzaVariationControlViewLite;
import com.dodopizza.order.feature.product.card.presentation.view.ExpandableFoodValueInfoIconView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: TemplatePizzaViewHolder.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001[B\u0019\u0012\u0006\u0010V\u001a\u00020U\u0012\b\b\u0001\u0010W\u001a\u00020 ¢\u0006\u0004\bX\u0010YJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016Jb\u0010\"\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u001b2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001d2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\u001fH\u0016J\u0018\u0010#\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010$\u001a\u00020\rH\u0014R\u001b\u0010*\u001a\u00020%8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u0002008DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b6\u00103R\u001b\u0010:\u001a\u0002008DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u00103R\u001b\u0010?\u001a\u00020;8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bA\u0010'\u001a\u0004\bB\u0010CR\u001b\u0010G\u001a\u0002008DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bE\u0010'\u001a\u0004\bF\u00103R\"\u0010\u0004\u001a\u00020\u00038\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0004\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006\\"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/TemplatePizzaViewHolder;", "Lru/dodopizza/app/presentation/product/card/combo/CustomizeComboViewHolder;", "Lsr1;", "Lm78;", "selectedProduct", "", "applyProductDescription", "Lb88;", "data", "", "isSingleDough", "isVariantDoughInSlot", "isNotAllInStop", "", "renderProductTypeControl", "Lfl8;", "product", "showImage", "Lflb;", "transitionInfo", "startAnimation", "Ly89;", "changedReceipt", "applyChanges", "closeReceiptView", "Ljn6;", "moneyFactory", "Lkotlin/Function1;", "onSelectClick", "Lkotlin/Function0;", "onChangeReceiptShown", "Lkotlin/Function2;", "", "onIngredientsChanged", "bind", "renderSelectButton", "showSaveButton", "Landroid/widget/ImageView;", "productImage$delegate", "Lk79;", "getProductImage", "()Landroid/widget/ImageView;", "productImage", "Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "productFoodValueInfo$delegate", "getProductFoodValueInfo", "()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "productFoodValueInfo", "Landroid/widget/TextView;", "productTitle$delegate", "getProductTitle", "()Landroid/widget/TextView;", "productTitle", "productDescription$delegate", "getProductDescription", "productDescription", "productSize$delegate", "getProductSize", "productSize", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", "productTypeControl$delegate", "getProductTypeControl", "()Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", "productTypeControl", "Landroid/widget/Button;", "productSelectButton$delegate", "getProductSelectButton", "()Landroid/widget/Button;", "productSelectButton", "extraPrice$delegate", "getExtraPrice", "extraPrice", "Lm78;", "getSelectedProduct", "()Lm78;", "setSelectedProduct", "(Lm78;)V", "Lto0;", "cardAnimation", "Lto0;", "Ljn6;", "getMoneyFactory", "()Ljn6;", "setMoneyFactory", "(Ljn6;)V", "Lkzb;", "viewInflater", "layoutId", "<init>", "(Lkzb;I)V", "Companion", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class TemplatePizzaViewHolder extends CustomizeComboViewHolder implements sr1 {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(TemplatePizzaViewHolder.class, "productImage", "getProductImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(TemplatePizzaViewHolder.class, "productFoodValueInfo", "getProductFoodValueInfo()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", 0)), bc9.f(new ar8(TemplatePizzaViewHolder.class, "productTitle", "getProductTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(TemplatePizzaViewHolder.class, "productDescription", "getProductDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(TemplatePizzaViewHolder.class, "productSize", "getProductSize()Landroid/widget/TextView;", 0)), bc9.f(new ar8(TemplatePizzaViewHolder.class, "productTypeControl", "getProductTypeControl()Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", 0)), bc9.f(new ar8(TemplatePizzaViewHolder.class, "productSelectButton", "getProductSelectButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(TemplatePizzaViewHolder.class, "extraPrice", "getExtraPrice()Landroid/widget/TextView;", 0))};
    public static final a Companion = new a(null);
    public static final double ZERO_AMOUNT = 0.0d;
    private final to0 cardAnimation;
    private final k79 extraPrice$delegate;
    public jn6 moneyFactory;
    private final k79 productDescription$delegate;
    private final k79 productFoodValueInfo$delegate;
    private final k79 productImage$delegate;
    private final k79 productSelectButton$delegate;
    private final k79 productSize$delegate;
    private final k79 productTitle$delegate;
    private final k79 productTypeControl$delegate;
    protected m78 selectedProduct;

    /* compiled from: TemplatePizzaViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/TemplatePizzaViewHolder$a;", "", "", "ZERO_AMOUNT", "D", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TemplatePizzaViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function1<m78, Unit> a;
        final /* synthetic */ TemplatePizzaViewHolder b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super m78, Unit> function1, TemplatePizzaViewHolder templatePizzaViewHolder) {
            super(1);
            this.a = function1;
            this.b = templatePizzaViewHolder;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.invoke(this.b.getSelectedProduct());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TemplatePizzaViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dough", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<Integer, Unit> {
        final /* synthetic */ b88 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b88 b88Var) {
            super(1);
            this.b = b88Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            Object obj;
            List<ExpandableFoodValueInfoIconView.c> e;
            TemplatePizzaViewHolder templatePizzaViewHolder = TemplatePizzaViewHolder.this;
            Iterator<T> it = this.b.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (i == ((m78) obj).q()) {
                    break;
                }
            }
            z65.e(obj);
            templatePizzaViewHolder.setSelectedProduct((m78) obj);
            TemplatePizzaViewHolder templatePizzaViewHolder2 = TemplatePizzaViewHolder.this;
            templatePizzaViewHolder2.showImage(templatePizzaViewHolder2.getSelectedProduct());
            ExpandableFoodValueInfoIconView productFoodValueInfo = TemplatePizzaViewHolder.this.getProductFoodValueInfo();
            e = jc1.e(ExpandableFoodValueInfoIconView.e.a().invoke(TemplatePizzaViewHolder.this.getSelectedProduct()));
            productFoodValueInfo.t(e, true);
            TemplatePizzaViewHolder templatePizzaViewHolder3 = TemplatePizzaViewHolder.this;
            templatePizzaViewHolder3.renderSelectButton(templatePizzaViewHolder3.getSelectedProduct(), this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplatePizzaViewHolder(kzb kzbVar, int i) {
        super(kzbVar, i);
        z65.h(kzbVar, "viewInflater");
        this.productImage$delegate = kb0.g(this, R.id.combo_template_pizza_image);
        this.productFoodValueInfo$delegate = kb0.g(this, R.id.combo_template_pizza_foodvalue_info);
        this.productTitle$delegate = kb0.g(this, R.id.combo_template_pizza_title);
        this.productDescription$delegate = kb0.g(this, R.id.combo_template_pizza_description);
        this.productSize$delegate = kb0.g(this, R.id.combo_template_pizza_size);
        this.productTypeControl$delegate = kb0.g(this, R.id.combo_template_pizza_type);
        this.productSelectButton$delegate = kb0.g(this, R.id.combo_template_select_pizza_button);
        this.extraPrice$delegate = kb0.g(this, R.id.combo_template_extra_price);
        this.cardAnimation = new to0();
    }

    private final String applyProductDescription(m78 m78Var) {
        int w;
        String i0;
        String o;
        if (m78Var.k().isEmpty()) {
            return m78Var.f();
        }
        Collection<ul8> k = m78Var.k();
        w = lc1.w(k, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ul8 ul8Var : k) {
            arrayList.add(ul8Var.getName());
        }
        i0 = sc1.i0(arrayList, null, null, null, 0, null, null, 63, null);
        o = l0b.o(i0);
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(TemplatePizzaViewHolder templatePizzaViewHolder, jn6 jn6Var, b88 b88Var, boolean z, Function1 function1, Function0 function0, Function2 function2, int i, Object obj) {
        if (obj == null) {
            Function0<Unit> function02 = function0;
            if ((i & 16) != 0) {
                function02 = null;
            }
            templatePizzaViewHolder.bind(jn6Var, b88Var, z, function1, function02, function2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    private final TextView getProductTitle() {
        return (TextView) this.productTitle$delegate.a(this, $$delegatedProperties[2]);
    }

    private final void renderProductTypeControl(b88 b88Var, boolean z, boolean z2, boolean z3) {
        if (z) {
            if (z2) {
                getProductTypeControl().setVisibility(4);
            } else {
                un3.o(getProductTypeControl(), false);
            }
        } else if (z3) {
            un3.o(getProductTypeControl(), true);
            getProductTypeControl().setSelectedDough(getSelectedProduct().q());
            getProductTypeControl().setOnDoughChangeListener(new c(b88Var));
        } else {
            un3.o(getProductTypeControl(), true);
            getProductTypeControl().k();
        }
    }

    public void applyChanges(b88 b88Var, y89 y89Var) {
        z65.h(b88Var, "data");
        z65.h(y89Var, "changedReceipt");
    }

    public void bind(jn6 jn6Var, b88 b88Var, boolean z, Function1<? super m78, Unit> function1, Function0<Unit> function0, Function2<? super Integer, ? super m78, Unit> function2) {
        int w;
        int w2;
        boolean z2;
        Object obj;
        Object obj2;
        m78 m78Var;
        Object Z;
        List<ExpandableFoodValueInfoIconView.c> e;
        List q0;
        int[] E0;
        int[] E02;
        int[] E03;
        Object Z2;
        z65.h(jn6Var, "moneyFactory");
        z65.h(b88Var, "data");
        z65.h(function1, "onSelectClick");
        setMoneyFactory(jn6Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : b88Var.h()) {
            if (b88Var.g().contains(((m78) obj3).getId())) {
                arrayList.add(obj3);
            } else {
                arrayList2.add(obj3);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        Iterable<m78> iterable = (Iterable) pair.c();
        w = lc1.w(iterable, 10);
        ArrayList arrayList3 = new ArrayList(w);
        for (m78 m78Var2 : iterable) {
            arrayList3.add(Integer.valueOf(m78Var2.q()));
        }
        Iterable<m78> iterable2 = (Iterable) pair.d();
        w2 = lc1.w(iterable2, 10);
        ArrayList arrayList4 = new ArrayList(w2);
        for (m78 m78Var3 : iterable2) {
            arrayList4.add(Integer.valueOf(m78Var3.q()));
        }
        Pair pair2 = new Pair(arrayList3, arrayList4);
        List list = (List) pair2.a();
        List list2 = (List) pair2.b();
        if (b88Var.h().size() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Z2 = sc1.Z(b88Var.h());
            m78Var = (m78) Z2;
        } else {
            List<m78> h = b88Var.h();
            List<m78> list3 = h;
            Iterator<T> it = list3.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (z65.c(b88Var.j(), ((m78) obj2).getId())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            m78 m78Var4 = (m78) obj2;
            if (m78Var4 == null) {
                Iterator<T> it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (!list.contains(Integer.valueOf(((m78) next).q()))) {
                        obj = next;
                        break;
                    }
                }
                m78 m78Var5 = (m78) obj;
                if (m78Var5 == null) {
                    Z = sc1.Z(h);
                    m78Var = (m78) Z;
                } else {
                    m78Var = m78Var5;
                }
            } else {
                m78Var = m78Var4;
            }
        }
        setSelectedProduct(m78Var);
        showImage(getSelectedProduct());
        ExpandableFoodValueInfoIconView productFoodValueInfo = getProductFoodValueInfo();
        e = jc1.e(ExpandableFoodValueInfoIconView.e.a().invoke(getSelectedProduct()));
        productFoodValueInfo.t(e, true);
        getProductTitle().setText(getSelectedProduct().getName());
        getProductSize().setText(getSelectedProduct().s().e());
        getProductDescription().setText(applyProductDescription(getSelectedProduct()));
        oma.a(getProductSelectButton(), new b(function1, this));
        renderSelectButton(getSelectedProduct(), b88Var);
        getProductTypeControl().setDoughControlVisible(true);
        PizzaVariationControlViewLite productTypeControl = getProductTypeControl();
        List list4 = list2;
        q0 = sc1.q0(list4, list);
        E0 = sc1.E0(q0);
        productTypeControl.q(E0);
        PizzaVariationControlViewLite productTypeControl2 = getProductTypeControl();
        E02 = sc1.E0(list4);
        productTypeControl2.e(E02);
        PizzaVariationControlViewLite productTypeControl3 = getProductTypeControl();
        E03 = sc1.E0(list);
        productTypeControl3.c(E03);
        PizzaVariationControlViewLite productTypeControl4 = getProductTypeControl();
        String str = b88Var.e().get(1);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        productTypeControl4.setTraditionalDoughText(str);
        PizzaVariationControlViewLite productTypeControl5 = getProductTypeControl();
        String str3 = b88Var.e().get(2);
        if (str3 != null) {
            str2 = str3;
        }
        productTypeControl5.setThinDoughText(str2);
        renderProductTypeControl(b88Var, z2, z, !list4.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getExtraPrice() {
        return (TextView) this.extraPrice$delegate.a(this, $$delegatedProperties[7]);
    }

    public final jn6 getMoneyFactory() {
        jn6 jn6Var = this.moneyFactory;
        if (jn6Var != null) {
            return jn6Var;
        }
        z65.z("moneyFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getProductDescription() {
        return (TextView) this.productDescription$delegate.a(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ExpandableFoodValueInfoIconView getProductFoodValueInfo() {
        return (ExpandableFoodValueInfoIconView) this.productFoodValueInfo$delegate.a(this, $$delegatedProperties[1]);
    }

    protected final ImageView getProductImage() {
        return (ImageView) this.productImage$delegate.a(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Button getProductSelectButton() {
        return (Button) this.productSelectButton$delegate.a(this, $$delegatedProperties[6]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getProductSize() {
        return (TextView) this.productSize$delegate.a(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final PizzaVariationControlViewLite getProductTypeControl() {
        return (PizzaVariationControlViewLite) this.productTypeControl$delegate.a(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final m78 getSelectedProduct() {
        m78 m78Var = this.selectedProduct;
        if (m78Var != null) {
            return m78Var;
        }
        z65.z("selectedProduct");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void renderSelectButton(m78 m78Var, b88 b88Var) {
        boolean z;
        int w;
        z65.h(m78Var, "selectedProduct");
        z65.h(b88Var, "data");
        boolean c2 = z65.c(m78Var.getId(), b88Var.j());
        List<m78> h = b88Var.h();
        if (!(h instanceof Collection) || !h.isEmpty()) {
            for (m78 m78Var2 : h) {
                if (z65.c(m78Var2.getId(), b88Var.j())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        ArrayList<m78> arrayList = new ArrayList();
        for (Object obj : b88Var.h()) {
            if (!b88Var.g().contains(((m78) obj).getId())) {
                arrayList.add(obj);
            }
        }
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (m78 m78Var3 : arrayList) {
            arrayList2.add(Integer.valueOf(m78Var3.q()));
        }
        boolean isEmpty = arrayList2.isEmpty();
        List<hn6> f = b88Var.f();
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
        hn6 hn6Var = f.get(i);
        if (!z65.c(hn6Var, getMoneyFactory().b(0.0d))) {
            un3.k(getExtraPrice());
            getExtraPrice().setText(getExtraPrice().getContext().getString(R.string.plus_label_with_space, un6.b(hn6Var)));
        } else {
            un3.e(getExtraPrice());
        }
        if (isEmpty) {
            Button productSelectButton = getProductSelectButton();
            productSelectButton.setText(productSelectButton.getContext().getString(R.string.not_available_now));
            productSelectButton.setEnabled(false);
            productSelectButton.setActivated(false);
            un3.e(getExtraPrice());
        } else if (c2) {
            Button productSelectButton2 = getProductSelectButton();
            productSelectButton2.setText(productSelectButton2.getContext().getString(R.string.almost_in_combo));
            productSelectButton2.setEnabled(true);
            productSelectButton2.setActivated(true);
        } else if (z) {
            showSaveButton();
        } else {
            Button productSelectButton3 = getProductSelectButton();
            productSelectButton3.setText(productSelectButton3.getContext().getString(R.string.select));
            productSelectButton3.setEnabled(true);
            productSelectButton3.setActivated(false);
        }
    }

    public final void setMoneyFactory(jn6 jn6Var) {
        z65.h(jn6Var, "<set-?>");
        this.moneyFactory = jn6Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setSelectedProduct(m78 m78Var) {
        z65.h(m78Var, "<set-?>");
        this.selectedProduct = m78Var;
    }

    public final void showImage(fl8 fl8Var) {
        z65.h(fl8Var, "product");
        com.bumptech.glide.b.u(getProductImage()).t(fl8Var.d()).a0(ff4.a()).G0(getProductImage());
    }

    protected void showSaveButton() {
        Button productSelectButton = getProductSelectButton();
        productSelectButton.setText(productSelectButton.getContext().getString(R.string.save_and_select));
        productSelectButton.setEnabled(true);
        productSelectButton.setActivated(true);
    }

    @Override // defpackage.sr1
    public void startAnimation(flb flbVar) {
        z65.h(flbVar, "transitionInfo");
        to0 to0Var = this.cardAnimation;
        View view = this.itemView;
        z65.g(view, "itemView");
        to0Var.a(view, flbVar);
    }

    public void closeReceiptView() {
    }
}
