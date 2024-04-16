package ru.dodopizza.app.presentation.product.card.combo;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.order.feature.product.card.presentation.view.ExpandableFoodValueInfoIconView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.R;
/* compiled from: TemplateProductViewHolder.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010_\u001a\u00020^\u0012\b\b\u0001\u0010`\u001a\u00020\u0016¢\u0006\u0004\ba\u0010bJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J0\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012H\u0016J&\u0010\u0018\u001a\u00020\u000b2\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015H\u0016J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003J\u001a\u0010&\u001a\u00020\u000b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0$J\u000e\u0010'\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u000bJ\u0006\u0010)\u001a\u00020\u000bJ\u0006\u0010*\u001a\u00020\u000bJ\u000e\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0007J\u0006\u0010-\u001a\u00020\u000bR\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u0010<R\u001b\u0010@\u001a\u0002098DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b?\u0010<R\u001b\u0010E\u001a\u00020A8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\bC\u0010DR\u001b\u0010H\u001a\u0002098DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bF\u00100\u001a\u0004\bG\u0010<R\u001b\u0010K\u001a\u0002098DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bI\u00100\u001a\u0004\bJ\u0010<R\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\"\u0010\u0011\u001a\u00020\u00038\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR.\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0$8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b%\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006c"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/TemplateProductViewHolder;", "Lru/dodopizza/app/presentation/product/card/combo/CustomizeComboViewHolder;", "Lsr1;", "Lfl8;", "product", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "formatProductSize", "Lflb;", "transitionInfo", "", "startAnimation", "Ljn6;", "moneyFactory", "Lqla;", "data", "selectedProduct", "Lkotlin/Function0;", "onChangeReceiptShown", "bind", "Lkotlin/Function2;", "", "onIngredientsChanged", "setIngredientChangedListener", "Ly89;", "changedReceipt", "applyChangedReceipt", "closeReceiptView", "renderSelectButton", "showImage", Action.NAME_ATTRIBUTE, "setTitle", "description", "showDescription", "setFoodValueInfo", "Lkotlin/Function1;", "onSelectClick", "setSelectButtonListener", "setProductSize", "showStoppedSelectButton", "showSelectedButton", "showSelectButton", "formattedExtraPrice", "showExtraPrice", "hideExtraPrice", "Landroid/widget/ImageView;", "productImage$delegate", "Lk79;", "getProductImage", "()Landroid/widget/ImageView;", "productImage", "Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "productFoodValueInfo$delegate", "getProductFoodValueInfo", "()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "productFoodValueInfo", "Landroid/widget/TextView;", "productTitle$delegate", "getProductTitle", "()Landroid/widget/TextView;", "productTitle", "productSize$delegate", "getProductSize", "productSize", "Landroid/widget/Button;", "productSelectButton$delegate", "getProductSelectButton", "()Landroid/widget/Button;", "productSelectButton", "extraPrice$delegate", "getExtraPrice", "extraPrice", "productDescription$delegate", "getProductDescription", "productDescription", "Lto0;", "cardAnimation", "Lto0;", "Lfl8;", "getSelectedProduct", "()Lfl8;", "setSelectedProduct", "(Lfl8;)V", "Lkotlin/jvm/functions/Function1;", "getOnSelectClick", "()Lkotlin/jvm/functions/Function1;", "setOnSelectClick", "(Lkotlin/jvm/functions/Function1;)V", "Ljn6;", "getMoneyFactory", "()Ljn6;", "setMoneyFactory", "(Ljn6;)V", "Lkzb;", "viewInflater", "layoutId", "<init>", "(Lkzb;I)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class TemplateProductViewHolder extends CustomizeComboViewHolder implements sr1 {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(TemplateProductViewHolder.class, "productImage", "getProductImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(TemplateProductViewHolder.class, "productFoodValueInfo", "getProductFoodValueInfo()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", 0)), bc9.f(new ar8(TemplateProductViewHolder.class, "productTitle", "getProductTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(TemplateProductViewHolder.class, "productSize", "getProductSize()Landroid/widget/TextView;", 0)), bc9.f(new ar8(TemplateProductViewHolder.class, "productSelectButton", "getProductSelectButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(TemplateProductViewHolder.class, "extraPrice", "getExtraPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(TemplateProductViewHolder.class, "productDescription", "getProductDescription()Landroid/widget/TextView;", 0))};
    private final to0 cardAnimation;
    private final k79 extraPrice$delegate;
    public jn6 moneyFactory;
    protected Function1<? super fl8, Unit> onSelectClick;
    private final k79 productDescription$delegate;
    private final k79 productFoodValueInfo$delegate;
    private final k79 productImage$delegate;
    private final k79 productSelectButton$delegate;
    private final k79 productSize$delegate;
    private final k79 productTitle$delegate;
    protected fl8 selectedProduct;

    /* compiled from: TemplateProductViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ fl8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fl8 fl8Var) {
            super(1);
            this.b = fl8Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            TemplateProductViewHolder.this.getOnSelectClick().invoke(this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateProductViewHolder(kzb kzbVar, int i) {
        super(kzbVar, i);
        z65.h(kzbVar, "viewInflater");
        this.productImage$delegate = kb0.g(this, R.id.combo_template_slot_image);
        this.productFoodValueInfo$delegate = kb0.g(this, R.id.combo_template_slot_foodvalue_info);
        this.productTitle$delegate = kb0.g(this, R.id.combo_template_slot_title);
        this.productSize$delegate = kb0.g(this, R.id.combo_template_slot_size);
        this.productSelectButton$delegate = kb0.g(this, R.id.combo_template_select_product_button);
        this.extraPrice$delegate = kb0.g(this, R.id.combo_template_extra_price);
        this.productDescription$delegate = kb0.g(this, R.id.combo_template_slot_description);
        this.cardAnimation = new to0();
    }

    private final String formatProductSize(fl8 fl8Var, Context context) {
        if (fl8Var instanceof swb) {
            return ((swb) fl8Var).r().e();
        }
        km8 m = fl8Var.m();
        nb6 b = pb6.b(fl8Var.m());
        if (b == nb6.g) {
            return ql8.d(m.getValue(), context);
        }
        String value = m.getValue();
        String string = context.getString(pb6.a(b).a());
        return value + " " + string;
    }

    private final ImageView getProductImage() {
        return (ImageView) this.productImage$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getProductTitle() {
        return (TextView) this.productTitle$delegate.a(this, $$delegatedProperties[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setIngredientChangedListener$default(TemplateProductViewHolder templateProductViewHolder, Function2 function2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function2 = null;
            }
            templateProductViewHolder.setIngredientChangedListener(function2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIngredientChangedListener");
    }

    public void applyChangedReceipt(qla qlaVar, y89 y89Var) {
        z65.h(qlaVar, "data");
        z65.h(y89Var, "changedReceipt");
    }

    public void bind(jn6 jn6Var, qla qlaVar, fl8 fl8Var, Function0<Unit> function0) {
        z65.h(jn6Var, "moneyFactory");
        z65.h(qlaVar, "data");
        z65.h(fl8Var, "selectedProduct");
        setMoneyFactory(jn6Var);
        setSelectedProduct(fl8Var);
        oma.a(getProductSelectButton(), new a(fl8Var));
        showDescription(fl8Var.f());
        renderSelectButton(fl8Var, qlaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getExtraPrice() {
        return (TextView) this.extraPrice$delegate.a(this, $$delegatedProperties[5]);
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
    public final Function1<fl8, Unit> getOnSelectClick() {
        Function1 function1 = this.onSelectClick;
        if (function1 != null) {
            return function1;
        }
        z65.z("onSelectClick");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getProductDescription() {
        return (TextView) this.productDescription$delegate.a(this, $$delegatedProperties[6]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ExpandableFoodValueInfoIconView getProductFoodValueInfo() {
        return (ExpandableFoodValueInfoIconView) this.productFoodValueInfo$delegate.a(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Button getProductSelectButton() {
        return (Button) this.productSelectButton$delegate.a(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getProductSize() {
        return (TextView) this.productSize$delegate.a(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final fl8 getSelectedProduct() {
        fl8 fl8Var = this.selectedProduct;
        if (fl8Var != null) {
            return fl8Var;
        }
        z65.z("selectedProduct");
        return null;
    }

    public final void hideExtraPrice() {
        un3.e(getExtraPrice());
    }

    public void renderSelectButton(fl8 fl8Var, qla qlaVar) {
        hn6 c;
        z65.h(fl8Var, "selectedProduct");
        z65.h(qlaVar, "data");
        boolean c2 = z65.c(fl8Var.getId(), qlaVar.j());
        boolean f = qlaVar.f();
        boolean z = false;
        if (!qlaVar.e().isEmpty()) {
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
            c = e.get(i);
        } else {
            c = getMoneyFactory().c(0);
        }
        if (c.a() == 0.0d) {
            z = true;
        }
        if (!z) {
            showExtraPrice(un6.b(c));
        } else {
            hideExtraPrice();
        }
        if (f) {
            showStoppedSelectButton();
            hideExtraPrice();
        } else if (c2) {
            showSelectedButton();
        } else {
            showSelectButton();
        }
    }

    public final void setFoodValueInfo(fl8 fl8Var) {
        boolean y;
        List<ExpandableFoodValueInfoIconView.c> e;
        z65.h(fl8Var, "product");
        y = l0b.y(fl8Var.i().e());
        boolean z = !y;
        if (z) {
            ExpandableFoodValueInfoIconView productFoodValueInfo = getProductFoodValueInfo();
            e = jc1.e(ExpandableFoodValueInfoIconView.e.a().invoke(fl8Var));
            productFoodValueInfo.t(e, true);
        }
        un3.o(getProductFoodValueInfo(), z);
    }

    public final void setMoneyFactory(jn6 jn6Var) {
        z65.h(jn6Var, "<set-?>");
        this.moneyFactory = jn6Var;
    }

    protected final void setOnSelectClick(Function1<? super fl8, Unit> function1) {
        z65.h(function1, "<set-?>");
        this.onSelectClick = function1;
    }

    public final void setProductSize(fl8 fl8Var) {
        z65.h(fl8Var, "product");
        TextView productSize = getProductSize();
        Context context = getProductSize().getContext();
        z65.g(context, "getContext(...)");
        productSize.setText(formatProductSize(fl8Var, context));
        un3.o(getProductSize(), !fl8Var.m().b());
    }

    public final void setSelectButtonListener(Function1<? super fl8, Unit> function1) {
        z65.h(function1, "onSelectClick");
        setOnSelectClick(function1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setSelectedProduct(fl8 fl8Var) {
        z65.h(fl8Var, "<set-?>");
        this.selectedProduct = fl8Var;
    }

    public final void setTitle(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getProductTitle().setText(str);
    }

    public final void showDescription(String str) {
        boolean z;
        z65.h(str, "description");
        getProductDescription().setText(str);
        TextView productDescription = getProductDescription();
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        un3.o(productDescription, z);
    }

    public final void showExtraPrice(String str) {
        z65.h(str, "formattedExtraPrice");
        un3.k(getExtraPrice());
        getExtraPrice().setText(getExtraPrice().getContext().getString(R.string.plus_label_with_space, str));
    }

    public final void showImage(fl8 fl8Var) {
        z65.h(fl8Var, "product");
        com.bumptech.glide.b.u(getProductImage()).t(fl8Var.d()).a0(ff4.a()).G0(getProductImage());
    }

    public final void showSelectButton() {
        Button productSelectButton = getProductSelectButton();
        productSelectButton.setText(productSelectButton.getContext().getString(R.string.select));
        productSelectButton.setEnabled(true);
        productSelectButton.setActivated(false);
    }

    public final void showSelectedButton() {
        Button productSelectButton = getProductSelectButton();
        productSelectButton.setText(productSelectButton.getContext().getString(R.string.almost_in_combo));
        productSelectButton.setEnabled(true);
        productSelectButton.setActivated(true);
    }

    public final void showStoppedSelectButton() {
        Button productSelectButton = getProductSelectButton();
        productSelectButton.setText(productSelectButton.getContext().getString(R.string.not_available_now));
        productSelectButton.setEnabled(false);
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

    public void setIngredientChangedListener(Function2<? super Integer, ? super fl8, Unit> function2) {
    }
}
