package ru.dodopizza.app.presentation.product.card.combo.customize;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpDelegateHolder;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderLayout;
/* compiled from: ComboCustomizeBuilderLayout.kt */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010g\u001a\u00020f\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010h\u0012\b\b\u0002\u0010k\u001a\u00020j¢\u0006\u0004\bl\u0010mJ\u0006\u0010\u0006\u001a\u00020\u0005JH\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0015\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013J\u0014\u0010\u0017\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013J\u0006\u0010\u0018\u001a\u00020\u0005J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\u0016\u0010$\u001a\u00020\u00052\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000)H\u0016J(\u00102\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u0010H\u0002R\u001a\u00108\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010A\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010A\u001a\u0004\bQ\u0010RR\u001b\u0010V\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\bU\u0010HR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010A\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010A\u001a\u0004\b^\u0010_R\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006n"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderLayout;", "Landroid/widget/LinearLayout;", "Lih1;", "Lmoxy/MvpDelegateHolder;", "Llm1;", "", "d4", "", "slotId", "currentProductId", "", "Lul8;", "currentProductIngredients", "Lejb;", "currentProductToppings", "alternativeProductsIds", "", "isTemp", "n7", "Lkotlin/Function0;", "onReceiptSaved", "p6", "onCloseListener", "setOnCloseListener", "W3", "Z7", "S8", "close", "v8", "Lvl8;", "ingredient", "K0", "e0", "", "Lkjb;", "toppingsVO", "setToppingsData", "O", "t", "Wc", "s4", "Lmoxy/MvpDelegate;", "getMvpDelegate", "Lcom/google/android/material/chip/Chip;", "chip", "Landroid/text/SpannableString;", "spannableIngredient", "Landroid/text/style/StrikethroughSpan;", "strikethroughSpan", "isChecked", "J3", "Lkm1;", "a", "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderPresenter;", "b", "Lmoxy/ktx/MoxyKtxDelegate;", "getPresenter", "()Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderPresenter;", "presenter", "Landroidx/constraintlayout/widget/ConstraintLayout;", com.huawei.hms.opendevice.c.a, "Lk79;", "getContainerConstraint", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "containerConstraint", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "getRemoveIngredientsTitle", "()Landroid/widget/TextView;", "removeIngredientsTitle", "Lcom/google/android/material/chip/ChipGroup;", e.a, "getIngredientsChips", "()Lcom/google/android/material/chip/ChipGroup;", "ingredientsChips", "Landroidx/recyclerview/widget/RecyclerView;", "f", "getProductsToAddList", "()Landroidx/recyclerview/widget/RecyclerView;", "productsToAddList", "g", "getAddIngredientsTitle", "addIngredientsTitle", "Landroid/widget/ImageButton;", Image.TYPE_HIGH, "getDiscardReceiptButton", "()Landroid/widget/ImageButton;", "discardReceiptButton", "Landroid/widget/Button;", "i", "getSaveOrCancelButton", "()Landroid/widget/Button;", "saveOrCancelButton", "j", "Lmoxy/MvpDelegate;", "mvpDelegate", "k", "Lkotlin/jvm/functions/Function0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ComboCustomizeBuilderLayout extends LinearLayout implements ih1, MvpDelegateHolder, lm1 {
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(ComboCustomizeBuilderLayout.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderPresenter;", 0)), bc9.f(new ar8(ComboCustomizeBuilderLayout.class, "containerConstraint", "getContainerConstraint()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), bc9.f(new ar8(ComboCustomizeBuilderLayout.class, "removeIngredientsTitle", "getRemoveIngredientsTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboCustomizeBuilderLayout.class, "ingredientsChips", "getIngredientsChips()Lcom/google/android/material/chip/ChipGroup;", 0)), bc9.f(new ar8(ComboCustomizeBuilderLayout.class, "productsToAddList", "getProductsToAddList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(ComboCustomizeBuilderLayout.class, "addIngredientsTitle", "getAddIngredientsTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboCustomizeBuilderLayout.class, "discardReceiptButton", "getDiscardReceiptButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(ComboCustomizeBuilderLayout.class, "saveOrCancelButton", "getSaveOrCancelButton()Landroid/widget/Button;", 0))};
    private final km1 a;
    private final MoxyKtxDelegate b;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private MvpDelegate<ComboCustomizeBuilderLayout> j;
    private Function0<Unit> k;

    /* compiled from: ComboCustomizeBuilderLayout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderPresenter;", "a", "()Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<ComboCustomizeBuilderPresenter> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ComboCustomizeBuilderPresenter invoke() {
            return ((LocalityComponent) ComboCustomizeBuilderLayout.this.getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).q1().a().a();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
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
            return Boolean.valueOf(obj instanceof kjb);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
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
            Object newInstance = CustomizeToppingViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ComboCustomizeBuilderLayout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkjb;", "toppingVO", "", "isAdded", "", "a", "(Lkjb;Z)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function2<kjb, Boolean, Unit> {
        d() {
            super(2);
        }

        public final void a(kjb kjbVar, boolean z) {
            z65.h(kjbVar, "toppingVO");
            ComboCustomizeBuilderLayout.this.getPresenter().K(kjbVar, z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(kjb kjbVar, Boolean bool) {
            a(kjbVar, bool.booleanValue());
            return Unit.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComboCustomizeBuilderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    private final void J3(Chip chip, SpannableString spannableString, StrikethroughSpan strikethroughSpan, boolean z) {
        if (!z) {
            spannableString.setSpan(strikethroughSpan, 0, spannableString.length(), 0);
        } else {
            spannableString.removeSpan(strikethroughSpan);
        }
        chip.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L7(ComboCustomizeBuilderLayout comboCustomizeBuilderLayout, Chip chip, SpannableString spannableString, StrikethroughSpan strikethroughSpan, vl8 vl8Var, CompoundButton compoundButton, boolean z) {
        z65.h(comboCustomizeBuilderLayout, "this$0");
        z65.h(chip, "$chip");
        z65.h(spannableString, "$spannableIngredient");
        z65.h(strikethroughSpan, "$strikethroughSpan");
        z65.h(vl8Var, "$ingredient");
        comboCustomizeBuilderLayout.J3(chip, spannableString, strikethroughSpan, z);
        comboCustomizeBuilderLayout.getPresenter().I(vl8Var, !z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(ComboCustomizeBuilderLayout comboCustomizeBuilderLayout, View view) {
        z65.h(comboCustomizeBuilderLayout, "this$0");
        comboCustomizeBuilderLayout.getPresenter().H();
    }

    private final TextView getAddIngredientsTitle() {
        return (TextView) this.g.a(this, l[5]);
    }

    private final ConstraintLayout getContainerConstraint() {
        return (ConstraintLayout) this.c.a(this, l[1]);
    }

    private final ImageButton getDiscardReceiptButton() {
        return (ImageButton) this.h.a(this, l[6]);
    }

    private final ChipGroup getIngredientsChips() {
        return (ChipGroup) this.e.a(this, l[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComboCustomizeBuilderPresenter getPresenter() {
        return (ComboCustomizeBuilderPresenter) this.b.getValue(this, l[0]);
    }

    private final RecyclerView getProductsToAddList() {
        return (RecyclerView) this.f.a(this, l[4]);
    }

    private final TextView getRemoveIngredientsTitle() {
        return (TextView) this.d.a(this, l[2]);
    }

    private final Button getSaveOrCancelButton() {
        return (Button) this.i.a(this, l[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h5(ComboCustomizeBuilderLayout comboCustomizeBuilderLayout, View view) {
        z65.h(comboCustomizeBuilderLayout, "this$0");
        comboCustomizeBuilderLayout.getPresenter().J();
    }

    @Override // defpackage.ih1
    public void K0(final vl8 vl8Var) {
        String o;
        z65.h(vl8Var, "ingredient");
        getRemoveIngredientsTitle().setVisibility(0);
        getIngredientsChips().setVisibility(0);
        Context context = getIngredientsChips().getContext();
        final Chip chip = new Chip(context);
        chip.setId(View.generateViewId());
        chip.setChipBackgroundColorResource(R.color.chip_background_color);
        chip.setTextColor(iu1.d(context, R.color.chip_text_color));
        chip.setEllipsize(TextUtils.TruncateAt.END);
        o = l0b.o(qhb.a(vl8Var.getName()));
        final SpannableString spannableString = new SpannableString(o);
        final StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        chip.setText(spannableString);
        if (vl8Var.b()) {
            chip.setCheckable(true);
            chip.setCheckedIconVisible(false);
            chip.setChecked(!vl8Var.c());
            J3(chip, spannableString, strikethroughSpan, true ^ vl8Var.c());
            chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: bh1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ComboCustomizeBuilderLayout.L7(ComboCustomizeBuilderLayout.this, chip, spannableString, strikethroughSpan, vl8Var, compoundButton, z);
                }
            });
        } else {
            chip.setEnabled(false);
        }
        getIngredientsChips().addView(chip);
    }

    @Override // defpackage.ih1
    public void O() {
        un3.o(getAddIngredientsTitle(), true);
        un3.o(getProductsToAddList(), true);
    }

    @Override // defpackage.ih1
    public void S8() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(getContainerConstraint());
        dVar.s(R.id.add_toppings_container, 3, R.id.container_constraint_layout, 3, 0);
        dVar.s(R.id.add_ingredients_title, 6, R.id.container_constraint_layout, 6, 0);
        dVar.s(R.id.remove_ingredients_container, 3, R.id.add_toppings_container, 4, 0);
        dVar.s(R.id.remove_ingredients_title, 6, R.id.container_constraint_layout, 6, 0);
        dVar.i(getContainerConstraint());
    }

    public final void W3() {
        getPresenter().H();
    }

    @Override // defpackage.ih1
    public void Wc() {
        getDiscardReceiptButton().setVisibility(8);
        getSaveOrCancelButton().setText(R.string.cancel);
        getSaveOrCancelButton().setTextColor(iu1.c(getContext(), R.color.textIconSecondaryColor));
        getSaveOrCancelButton().setBackgroundTintList(iu1.d(getContext(), R.color.surfaceSecondaryColor));
    }

    @Override // defpackage.ih1
    public void Z7() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(getContainerConstraint());
        dVar.s(R.id.remove_ingredients_container, 3, R.id.container_constraint_layout, 3, 0);
        dVar.s(R.id.remove_ingredients_container, 6, R.id.container_constraint_layout, 6, 0);
        dVar.s(R.id.add_toppings_container, 3, R.id.remove_ingredients_container, 4, 0);
        dVar.s(R.id.add_toppings_container, 6, R.id.container_constraint_layout, 6, 0);
        dVar.i(getContainerConstraint());
    }

    @Override // defpackage.ih1
    public void close() {
        Function0<Unit> function0 = this.k;
        if (function0 == null) {
            z65.z("onCloseListener");
            function0 = null;
        }
        function0.invoke();
    }

    public final void d4() {
        getMvpDelegate().onCreate();
        getMvpDelegate().onAttach();
        getDiscardReceiptButton().setOnClickListener(new View.OnClickListener() { // from class: ch1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComboCustomizeBuilderLayout.U4(ComboCustomizeBuilderLayout.this, view);
            }
        });
        getSaveOrCancelButton().setOnClickListener(new View.OnClickListener() { // from class: dh1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComboCustomizeBuilderLayout.h5(ComboCustomizeBuilderLayout.this, view);
            }
        });
    }

    @Override // defpackage.ih1
    public void e0() {
        for (View view : dzb.b(getIngredientsChips())) {
            z65.f(view, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            ((Chip) view).setChecked(true);
        }
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.a;
    }

    @Override // moxy.MvpDelegateHolder
    public MvpDelegate<ComboCustomizeBuilderLayout> getMvpDelegate() {
        if (this.j == null) {
            this.j = new MvpDelegate<>(this);
        }
        MvpDelegate<ComboCustomizeBuilderLayout> mvpDelegate = this.j;
        z65.f(mvpDelegate, "null cannot be cast to non-null type moxy.MvpDelegate<ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderLayout>");
        return mvpDelegate;
    }

    public final void n7(String str, String str2, Collection<ul8> collection, Collection<ejb> collection2, Collection<String> collection3, boolean z) {
        z65.h(str, "slotId");
        z65.h(str2, "currentProductId");
        z65.h(collection, "currentProductIngredients");
        z65.h(collection2, "currentProductToppings");
        z65.h(collection3, "alternativeProductsIds");
        getProductsToAddList().setLayoutManager(new LinearLayoutManager(getContext()));
        getPresenter().O(str, str2, collection, collection2, collection3, z);
    }

    public final void p6(Function0<Unit> function0) {
        getPresenter().M(function0);
    }

    @Override // defpackage.ih1
    public void s4() {
        getDiscardReceiptButton().setVisibility(0);
        getSaveOrCancelButton().setText(R.string.save);
        getSaveOrCancelButton().setTextColor(iu1.c(getContext(), R.color.primary_button_text_color));
        getSaveOrCancelButton().setBackgroundTintList(iu1.d(getContext(), R.color.surfaceDodoColor));
    }

    public final void setOnCloseListener(Function0<Unit> function0) {
        z65.h(function0, "onCloseListener");
        this.k = function0;
    }

    @Override // defpackage.ih1
    public void setToppingsData(List<kjb> list) {
        z65.h(list, "toppingsVO");
        getProductsToAddList().setAdapter(new k6.a(new k6(list), b.a, new fjb(new d()), c.a).b().d());
    }

    @Override // defpackage.ih1
    public void t() {
        un3.o(getAddIngredientsTitle(), false);
        un3.o(getProductsToAddList(), false);
    }

    @Override // defpackage.ih1
    public void v8() {
        getRemoveIngredientsTitle().setVisibility(8);
        getIngredientsChips().setVisibility(8);
        getIngredientsChips().removeAllViews();
    }

    public /* synthetic */ ComboCustomizeBuilderLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboCustomizeBuilderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = eu2.c(this);
        a aVar = new a();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.b = new MoxyKtxDelegate(mvpDelegate, ComboCustomizeBuilderPresenter.class.getName() + ".presenter", aVar);
        this.c = kb0.d(this, R.id.container_constraint_layout);
        this.d = kb0.d(this, R.id.remove_ingredients_title);
        this.e = kb0.d(this, R.id.ingredients_chip_group);
        this.f = kb0.d(this, R.id.products_to_add_list);
        this.g = kb0.d(this, R.id.add_ingredients_title);
        this.h = kb0.d(this, R.id.discard_receipt_button);
        this.i = kb0.d(this, R.id.save_receipt_button);
        View.inflate(context, R.layout.layout_combo_customize_builder, this);
        getProductsToAddList().addItemDecoration(new eyb(8, 0, 0, 6, null));
        setOrientation(1);
    }
}
