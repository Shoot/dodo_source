package com.dodopizza.controlling.feature.bottomchooser.presentation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: OptionItemViewHolder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002J\u0014\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/controlling/feature/bottomchooser/presentation/OptionItemViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "titleRes", "", "setTitle", "imageRes", "setImage", "imageTintRes", "setImageTint", "Lkotlin/Function0;", "listener", "setOnClickListener", "Landroid/widget/ImageView;", "imageView$delegate", "Lk79;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Landroid/widget/TextView;", "titleText$delegate", "getTitleText", "()Landroid/widget/TextView;", "titleText", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OptionItemViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(OptionItemViewHolder.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(OptionItemViewHolder.class, "titleText", "getTitleText()Landroid/widget/TextView;", 0))};
    private final k79 imageView$delegate;
    private final k79 titleText$delegate;

    /* compiled from: OptionItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionItemViewHolder(kzb kzbVar) {
        super(kzbVar, wz8.item_chooser_option);
        z65.h(kzbVar, "viewInflater");
        this.imageView$delegate = kb0.g(this, zx8.chooser_option_image);
        this.titleText$delegate = kb0.g(this, zx8.chooser_option_title);
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getTitleText() {
        return (TextView) this.titleText$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void setImage(int i) {
        getImageView().setImageDrawable(iu1.e(getImageView().getContext(), i));
    }

    public final void setImageTint(int i) {
        getImageView().setImageTintList(iu1.d(getImageView().getContext(), i));
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    public final void setTitle(int i) {
        getTitleText().setText(i);
    }
}
