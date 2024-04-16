package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ComboProductCartInfoView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\rB'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0014\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nJ\u0006\u0010\r\u001a\u00020\u0004J\u0014\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\nR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001b\u0010\u001b\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013¨\u0006%"}, d2 = {"Lbi1;", "Landroid/widget/LinearLayout;", "", Action.NAME_ATTRIBUTE, "", "setName", "b", "sizeAndDough", "setSizeAndDough", c.a, "", "toppings", "setToppings", "a", "ingredients", "setRemovedIngredients", "Landroid/widget/TextView;", "Lk79;", "getShoppingProductName", "()Landroid/widget/TextView;", "shoppingProductName", "getShoppingProductSize", "shoppingProductSize", "getShoppingProductToppings", "shoppingProductToppings", DateTokenConverter.CONVERTER_KEY, "getShoppingProductRemovedIngredients", "shoppingProductRemovedIngredients", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", e.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bi1  reason: default package */
/* loaded from: classes2.dex */
public final class bi1 extends LinearLayout {
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(bi1.class, "shoppingProductName", "getShoppingProductName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(bi1.class, "shoppingProductSize", "getShoppingProductSize()Landroid/widget/TextView;", 0)), bc9.f(new ar8(bi1.class, "shoppingProductToppings", "getShoppingProductToppings()Landroid/widget/TextView;", 0)), bc9.f(new ar8(bi1.class, "shoppingProductRemovedIngredients", "getShoppingProductRemovedIngredients()Landroid/widget/TextView;", 0))};
    public static final a e = new a(null);
    public static final int g = 8;

    /* compiled from: ComboProductCartInfoView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbi1$a;", "", "", "RECEIPT_SEPARATOR", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bi1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ bi1(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final TextView getShoppingProductName() {
        return (TextView) this.a.a(this, f[0]);
    }

    private final TextView getShoppingProductRemovedIngredients() {
        return (TextView) this.d.a(this, f[3]);
    }

    private final TextView getShoppingProductSize() {
        return (TextView) this.b.a(this, f[1]);
    }

    private final TextView getShoppingProductToppings() {
        return (TextView) this.c.a(this, f[2]);
    }

    public final void a() {
        un3.k(getShoppingProductRemovedIngredients());
    }

    public final void b() {
        un3.k(getShoppingProductSize());
    }

    public final void c() {
        un3.k(getShoppingProductToppings());
    }

    public final void setName(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getShoppingProductName().setText(str);
    }

    public final void setRemovedIngredients(List<String> list) {
        String i0;
        z65.h(list, "ingredients");
        i0 = sc1.i0(list, ", ", null, null, 0, null, null, 62, null);
        getShoppingProductRemovedIngredients().setText(getContext().getString(r09.Z1, i0));
    }

    public final void setSizeAndDough(String str) {
        z65.h(str, "sizeAndDough");
        getShoppingProductSize().setText(str);
    }

    public final void setToppings(List<String> list) {
        String i0;
        z65.h(list, "toppings");
        i0 = sc1.i0(list, ", ", null, null, 0, null, null, 62, null);
        getShoppingProductToppings().setText(getContext().getString(r09.l, i0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        View.inflate(context, gz8.shopping_cart_combo_customization_view, this);
        this.a = kb0.d(this, gy8.shopping_product_name);
        this.b = kb0.d(this, gy8.shopping_product_size);
        this.c = kb0.d(this, gy8.shopping_product_toppings);
        this.d = kb0.d(this, gy8.shopping_product_removed_ingredients);
    }
}
