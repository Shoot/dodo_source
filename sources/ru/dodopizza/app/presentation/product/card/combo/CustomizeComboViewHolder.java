package ru.dodopizza.app.presentation.product.card.combo;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
/* compiled from: CustomizeComboViewHolder.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u000b\u001a\u00020\nJ0\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/CustomizeComboViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lul8;", "productIngredients", "", "removedIngredientsIds", "addedToppings", "Landroid/widget/TextView;", "productDescriptionTextView", "", "applyChangedReceiptDescription", "Landroid/view/View;", "visibleView", "inVisibleView", "Lkotlin/Function0;", "doOnEnd", "flipCard", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "Lkzb;", "viewInflater", "", "layoutId", "<init>", "(Lkzb;I)V", "Companion", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class CustomizeComboViewHolder extends SelfInflatingViewHolder {
    private static final String ADDED_TOPPING_SYMBOL = "+";
    public static final a Companion = new a(null);
    private static final String RECEIPT_SEPARATOR = ", ";
    private final Logger logger;

    /* compiled from: CustomizeComboViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/CustomizeComboViewHolder$a;", "", "", "ADDED_TOPPING_SYMBOL", "Ljava/lang/String;", "RECEIPT_SEPARATOR", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CustomizeComboViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul8;", "ingredient", "", "a", "(Lul8;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<ul8, CharSequence> {
        final /* synthetic */ Collection<String> a;
        final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Collection<String> collection, Context context) {
            super(1);
            this.a = collection;
            this.b = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(ul8 ul8Var) {
            z65.h(ul8Var, "ingredient");
            SpannableString spannableString = new SpannableString(qhb.a(ul8Var.getName()));
            if (this.a.contains(ul8Var.c())) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 0);
            }
            spannableString.setSpan(new ForegroundColorSpan(iu1.c(this.b, R.color.textIconSecondaryColor)), 0, spannableString.length(), 0);
            return spannableString;
        }
    }

    /* compiled from: CustomizeComboViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "topping", "", "a", "(Ljava/lang/String;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<String, CharSequence> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(1);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(String str) {
            z65.h(str, "topping");
            String a = qhb.a(str);
            SpannableString spannableString = new SpannableString("+" + a);
            spannableString.setSpan(new ForegroundColorSpan(iu1.c(this.a, R.color.textIconPrimaryColor)), 0, spannableString.length(), 0);
            return spannableString;
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d implements Animator.AnimatorListener {
        final /* synthetic */ Function0 a;
        final /* synthetic */ View b;

        public d(Function0 function0, View view) {
            this.a = function0;
            this.b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animator");
            Function0 function0 = this.a;
            if (function0 != null) {
                function0.invoke();
            }
            this.b.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animator");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomizeComboViewHolder(kzb kzbVar, int i) {
        super(kzbVar, i);
        z65.h(kzbVar, "viewInflater");
        Logger logger = LoggerFactory.getLogger("CustomizeTemplateViewHolder");
        z65.g(logger, "getLogger(...)");
        this.logger = logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void flipCard$default(CustomizeComboViewHolder customizeComboViewHolder, Context context, View view, View view2, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                function0 = null;
            }
            customizeComboViewHolder.flipCard(context, view, view2, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flipCard");
    }

    public final void applyChangedReceiptDescription(Context context, Collection<ul8> collection, Collection<String> collection2, Collection<String> collection3, TextView textView) {
        Appendable g0;
        Appendable g02;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(collection, "productIngredients");
        z65.h(collection2, "removedIngredientsIds");
        z65.h(collection3, "addedToppings");
        z65.h(textView, "productDescriptionTextView");
        g0 = sc1.g0(collection, new SpannableStringBuilder(), null, null, null, 0, null, new b(collection2, context), 62, null);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) g0;
        g02 = sc1.g0(collection3, new SpannableStringBuilder(), null, null, null, 0, null, new c(context), 62, null);
        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) g02;
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.replace(0, 1, (CharSequence) String.valueOf(Character.toUpperCase(spannableStringBuilder.charAt(0))));
        }
        if (spannableStringBuilder2.length() > 0) {
            spannableStringBuilder.append((CharSequence) RECEIPT_SEPARATOR);
        }
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        textView.setText(spannableStringBuilder);
    }

    public final void flipCard(Context context, View view, View view2, Function0<Unit> function0) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(view, "visibleView");
        z65.h(view2, "inVisibleView");
        try {
            view.setVisibility(0);
            float f = ((float) JosStatusCodes.RTN_CODE_COMMON_ERROR) * context.getResources().getDisplayMetrics().density;
            view.setCameraDistance(f);
            view2.setCameraDistance(f);
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.flip_out);
            z65.f(loadAnimator, "null cannot be cast to non-null type android.animation.AnimatorSet");
            AnimatorSet animatorSet = (AnimatorSet) loadAnimator;
            animatorSet.setTarget(view2);
            Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, R.animator.flip_in);
            z65.f(loadAnimator2, "null cannot be cast to non-null type android.animation.AnimatorSet");
            AnimatorSet animatorSet2 = (AnimatorSet) loadAnimator2;
            animatorSet2.setTarget(view);
            animatorSet.start();
            animatorSet2.start();
            animatorSet2.addListener(new d(function0, view2));
        } catch (Exception e) {
            this.logger.info("Failed flip combo customize card. ", (Throwable) e);
        }
    }
}
