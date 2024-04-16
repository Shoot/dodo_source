package ru.dodopizza.app.presentation.product.card.combo.customize;

import android.widget.TextView;
import com.dodopizza.order.feature.product.card.presentation.pizza.topping.ToppingViewHolder;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: CustomizeToppingViewHolder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/customize/CustomizeToppingViewHolder;", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/topping/ToppingViewHolder;", "Lhn6;", "price", "", "setPrice", "Lkzb;", "inflater", "<init>", "(Lkzb;)V", "Companion", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CustomizeToppingViewHolder extends ToppingViewHolder {
    public static final a Companion = new a(null);
    private static final String TOPPING_PRICE_PLACEHOLDER = "+%s";

    /* compiled from: CustomizeToppingViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/customize/CustomizeToppingViewHolder$a;", "", "", "TOPPING_PRICE_PLACEHOLDER", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomizeToppingViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.item_combo_customize_builder);
        z65.h(kzbVar, "inflater");
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.topping.ToppingViewHolder
    public void setPrice(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        TextView price = getPrice();
        pza pzaVar = pza.a;
        String format = String.format(TOPPING_PRICE_PLACEHOLDER, Arrays.copyOf(new Object[]{un6.b(hn6Var)}, 1));
        z65.g(format, "format(...)");
        price.setText(format);
    }
}
