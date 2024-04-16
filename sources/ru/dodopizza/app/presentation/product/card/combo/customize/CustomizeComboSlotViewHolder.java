package ru.dodopizza.app.presentation.product.card.combo.customize;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.product.card.combo.ComboSlotViewHolder;
/* compiled from: CustomizeComboSlotViewHolder.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/customize/CustomizeComboSlotViewHolder;", "Lru/dodopizza/app/presentation/product/card/combo/ComboSlotViewHolder;", "Lfi1;", "data", "Lhn6;", "calculateToppingsSum", "", "", "removedIngredientsNames", "addedToppingsNames", "", "applyChangedReceipt", "setSlotExtraPrice", "setSlotDescription", "Landroid/widget/TextView;", "slotProductReceiptText$delegate", "Lk79;", "getSlotProductReceiptText", "()Landroid/widget/TextView;", "slotProductReceiptText", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "Companion", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CustomizeComboSlotViewHolder extends ComboSlotViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(CustomizeComboSlotViewHolder.class, "slotProductReceiptText", "getSlotProductReceiptText()Landroid/widget/TextView;", 0))};
    public static final a Companion = new a(null);
    private static final String RECEIPT_SEPARATOR = ", ";
    private static final String REMOVED_INGREDIENT_PREFIX = "- ";
    private static final String TOPPINGS_PREFIX = "+ ";
    private final k79 slotProductReceiptText$delegate;

    /* compiled from: CustomizeComboSlotViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/customize/CustomizeComboSlotViewHolder$a;", "", "", "RECEIPT_SEPARATOR", "Ljava/lang/String;", "REMOVED_INGREDIENT_PREFIX", "TOPPINGS_PREFIX", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomizeComboSlotViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.combo_customize_product_card_slot_item);
        z65.h(kzbVar, "viewInflater");
        this.slotProductReceiptText$delegate = kb0.g(this, R.id.combo_slot_receipt);
    }

    private final void applyChangedReceipt(Collection<String> collection, Collection<String> collection2) {
        String str;
        CharSequence R0;
        String str2 = "";
        if (!collection.isEmpty()) {
            str = sc1.i0(collection, RECEIPT_SEPARATOR, REMOVED_INGREDIENT_PREFIX, null, 0, null, null, 60, null);
        } else {
            str = "";
        }
        if (!collection2.isEmpty()) {
            str2 = sc1.i0(collection2, RECEIPT_SEPARATOR, TOPPINGS_PREFIX, null, 0, null, null, 60, null);
        }
        String str3 = str + "\n" + str2;
        if (str.length() > 0 || str2.length() > 0) {
            getSlotProductReceiptText().setVisibility(0);
            TextView slotProductReceiptText = getSlotProductReceiptText();
            R0 = m0b.R0(str3);
            slotProductReceiptText.setText(R0.toString());
        }
    }

    private final hn6 calculateToppingsSum(fi1 fi1Var) {
        Collection<ejb> collection;
        Object Y;
        y89 c = fi1Var.c();
        if (c != null) {
            collection = c.b();
        } else {
            collection = null;
        }
        double d = 0.0d;
        if (collection != null && !collection.isEmpty()) {
            Collection<ejb> collection2 = collection;
            for (ejb ejbVar : collection2) {
                d += ejbVar.h().a();
            }
            Y = sc1.Y(collection2);
            return new hn6(d, ((ejb) Y).h().c());
        }
        return new hn6(0.0d, "");
    }

    private final TextView getSlotProductReceiptText() {
        return (TextView) this.slotProductReceiptText$delegate.a(this, $$delegatedProperties[0]);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.ComboSlotViewHolder
    public void setSlotDescription(fi1 fi1Var) {
        List l;
        List list;
        List l2;
        List list2;
        Collection<ejb> b;
        int w;
        Collection<ul8> c;
        int w2;
        z65.h(fi1Var, "data");
        super.setSlotDescription(fi1Var);
        y89 c2 = fi1Var.c();
        if (c2 == null || (c = c2.c()) == null) {
            l = kc1.l();
            list = l;
        } else {
            Collection<ul8> collection = c;
            w2 = lc1.w(collection, 10);
            list = new ArrayList<>(w2);
            for (ul8 ul8Var : collection) {
                list.add(ul8Var.getName());
            }
        }
        y89 c3 = fi1Var.c();
        if (c3 == null || (b = c3.b()) == null) {
            l2 = kc1.l();
            list2 = l2;
        } else {
            Collection<ejb> collection2 = b;
            w = lc1.w(collection2, 10);
            list2 = new ArrayList<>(w);
            for (ejb ejbVar : collection2) {
                list2.add(ejbVar.getName());
            }
        }
        applyChangedReceipt(list, list2);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.ComboSlotViewHolder
    public void setSlotExtraPrice(fi1 fi1Var) {
        z65.h(fi1Var, "data");
        TextView slotProductExtraPrice = getSlotProductExtraPrice();
        hn6 d = fi1Var.d();
        hn6 hn6Var = new hn6(d.a() + calculateToppingsSum(fi1Var).a(), d.c());
        boolean z = false;
        slotProductExtraPrice.setText(slotProductExtraPrice.getContext().getString(R.string.plus_label, un6.b(hn6Var)));
        if (hn6Var.a() == 0.0d) {
            z = true;
        }
        un3.o(slotProductExtraPrice, !z);
    }
}
