package ru.dodopizza.app.presentation.product.card.combo;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: ComboSlotViewHolder.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010;\u001a\u00020:\u0012\b\b\u0001\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\t\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011J\u0014\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014J\u0014\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014J\u0006\u0010\u0018\u001a\u00020\u000bJ\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0011R\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010*R\u001b\u00101\u001a\u00020'8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010*R\u001b\u00104\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u0010*R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001e\u001a\u0004\b7\u00108¨\u0006@"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/ComboSlotViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Lfi1;", "comboSlotVO", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "sizeBadgeFormat", "Lfl8;", "getSizeWithUnit", "product", "", "setSlotImage", "data", "setSlotDescription", "setSlotExtraPrice", "setSizeBadge", "", "inStop", "setStopTextVisible", "Lkotlin/Function0;", "listener", "setSlotCardClickListener", "setSlotChangeButtonClickListener", "hideSlotChangeProduct", "showSlotChangeProduct", "isNeedShowOnboarding", "isOnboardingNeedShow", "Landroidx/cardview/widget/CardView;", "slotCard$delegate", "Lk79;", "getSlotCard", "()Landroidx/cardview/widget/CardView;", "slotCard", "Landroid/widget/ImageView;", "slotProductImage$delegate", "getSlotProductImage", "()Landroid/widget/ImageView;", "slotProductImage", "Landroid/widget/TextView;", "slotProductTitle$delegate", "getSlotProductTitle", "()Landroid/widget/TextView;", "slotProductTitle", "slotProductSizeBadge$delegate", "getSlotProductSizeBadge", "slotProductSizeBadge", "slotProductExtraPrice$delegate", "getSlotProductExtraPrice", "slotProductExtraPrice", "slotProductStopText$delegate", "getSlotProductStopText", "slotProductStopText", "Landroid/widget/Button;", "slotChangeProduct$delegate", "getSlotChangeProduct", "()Landroid/widget/Button;", "slotChangeProduct", "Lkzb;", "viewInflater", "", "layoutId", "<init>", "(Lkzb;I)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class ComboSlotViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(ComboSlotViewHolder.class, "slotCard", "getSlotCard()Landroidx/cardview/widget/CardView;", 0)), bc9.f(new ar8(ComboSlotViewHolder.class, "slotProductImage", "getSlotProductImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(ComboSlotViewHolder.class, "slotProductTitle", "getSlotProductTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboSlotViewHolder.class, "slotProductSizeBadge", "getSlotProductSizeBadge()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboSlotViewHolder.class, "slotProductExtraPrice", "getSlotProductExtraPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboSlotViewHolder.class, "slotProductStopText", "getSlotProductStopText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboSlotViewHolder.class, "slotChangeProduct", "getSlotChangeProduct()Landroid/widget/Button;", 0))};
    private final k79 slotCard$delegate;
    private final k79 slotChangeProduct$delegate;
    private final k79 slotProductExtraPrice$delegate;
    private final k79 slotProductImage$delegate;
    private final k79 slotProductSizeBadge$delegate;
    private final k79 slotProductStopText$delegate;
    private final k79 slotProductTitle$delegate;

    /* compiled from: ComboSlotViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.a = function0;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ComboSlotViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0) {
            super(1);
            this.a = function0;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboSlotViewHolder(kzb kzbVar, int i) {
        super(kzbVar, i);
        z65.h(kzbVar, "viewInflater");
        this.slotCard$delegate = kb0.g(this, R.id.combo_slot_cardview);
        this.slotProductImage$delegate = kb0.g(this, R.id.combo_slot_image);
        this.slotProductTitle$delegate = kb0.g(this, R.id.combo_slot_title);
        this.slotProductSizeBadge$delegate = kb0.g(this, R.id.combo_slot_size_badge);
        this.slotProductExtraPrice$delegate = kb0.g(this, R.id.combo_slot_extra_price);
        this.slotProductStopText$delegate = kb0.g(this, R.id.combo_slot_not_available_text);
        this.slotChangeProduct$delegate = kb0.g(this, R.id.change_combo_slot);
    }

    private final String getSizeWithUnit(fl8 fl8Var, Context context) {
        nb6 b2 = pb6.b(fl8Var.m());
        if (b2 == nb6.g) {
            return ql8.d(fl8Var.m().getValue(), context);
        }
        String value = fl8Var.m().getValue();
        String string = context.getString(pb6.a(b2).a());
        return value + " " + string;
    }

    private final CardView getSlotCard() {
        return (CardView) this.slotCard$delegate.a(this, $$delegatedProperties[0]);
    }

    private final Button getSlotChangeProduct() {
        return (Button) this.slotChangeProduct$delegate.a(this, $$delegatedProperties[6]);
    }

    private final ImageView getSlotProductImage() {
        return (ImageView) this.slotProductImage$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getSlotProductSizeBadge() {
        return (TextView) this.slotProductSizeBadge$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getSlotProductStopText() {
        return (TextView) this.slotProductStopText$delegate.a(this, $$delegatedProperties[5]);
    }

    private final TextView getSlotProductTitle() {
        return (TextView) this.slotProductTitle$delegate.a(this, $$delegatedProperties[2]);
    }

    private final String sizeBadgeFormat(fi1 fi1Var, Context context) {
        fl8 g = fi1Var.g();
        if (g instanceof qma) {
            return getSizeWithUnit(g, context);
        }
        if (g instanceof swb) {
            return ((swb) g).r().e();
        }
        return fi1Var.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getSlotProductExtraPrice() {
        return (TextView) this.slotProductExtraPrice$delegate.a(this, $$delegatedProperties[4]);
    }

    public final void hideSlotChangeProduct() {
        un3.e(getSlotChangeProduct());
    }

    public final void isOnboardingNeedShow(boolean z) {
        this.itemView.setTag(R.id.combo_onboarding_view_id, Boolean.valueOf(z));
    }

    public final void setSizeBadge(fi1 fi1Var) {
        boolean z;
        z65.h(fi1Var, "comboSlotVO");
        TextView slotProductSizeBadge = getSlotProductSizeBadge();
        Context context = slotProductSizeBadge.getContext();
        z65.g(context, "getContext(...)");
        String sizeBadgeFormat = sizeBadgeFormat(fi1Var, context);
        slotProductSizeBadge.setText(sizeBadgeFormat);
        if (sizeBadgeFormat.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        un3.o(slotProductSizeBadge, z);
    }

    public final void setSlotCardClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getSlotCard(), new a(function0));
    }

    public final void setSlotChangeButtonClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getSlotChangeProduct(), new b(function0));
    }

    public void setSlotDescription(fi1 fi1Var) {
        z65.h(fi1Var, "data");
        getSlotProductTitle().setText(fi1Var.g().getName());
    }

    public void setSlotExtraPrice(fi1 fi1Var) {
        z65.h(fi1Var, "data");
        TextView slotProductExtraPrice = getSlotProductExtraPrice();
        hn6 d = fi1Var.d();
        boolean z = false;
        slotProductExtraPrice.setText(slotProductExtraPrice.getContext().getString(R.string.plus_label_with_space, un6.b(d)));
        if (d.a() == 0.0d) {
            z = true;
        }
        un3.o(slotProductExtraPrice, !z);
    }

    public final void setSlotImage(fl8 fl8Var) {
        z65.h(fl8Var, "product");
        int a2 = ff4.a();
        com.bumptech.glide.b.u(getSlotProductImage()).t(fl8Var.d()).a0(a2).i(a2).G0(getSlotProductImage());
    }

    public final void setStopTextVisible(boolean z) {
        un3.o(getSlotProductStopText(), z);
    }

    public final void showSlotChangeProduct() {
        un3.k(getSlotChangeProduct());
    }
}
