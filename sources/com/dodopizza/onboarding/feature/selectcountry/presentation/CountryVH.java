package com.dodopizza.onboarding.feature.selectcountry.presentation;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: CountryVH.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/onboarding/feature/selectcountry/presentation/CountryVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", Action.NAME_ATTRIBUTE, "", "setName", "flag", "setFlag", "Lkotlin/Function0;", "listener", "setOnClickListener", "Landroid/widget/TextView;", "nameView$delegate", "Lk79;", "getNameView", "()Landroid/widget/TextView;", "nameView", "Landroid/widget/ImageView;", "flagView$delegate", "getFlagView", "()Landroid/widget/ImageView;", "flagView", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CountryVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(CountryVH.class, "nameView", "getNameView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(CountryVH.class, "flagView", "getFlagView()Landroid/widget/ImageView;", 0))};
    private final k79 flagView$delegate;
    private final k79 nameView$delegate;

    /* compiled from: CountryVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
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
    public CountryVH(kzb kzbVar) {
        super(kzbVar, fz8.item_country);
        z65.h(kzbVar, "viewInflater");
        this.nameView$delegate = kb0.g(this, fy8.h);
        this.flagView$delegate = kb0.g(this, fy8.i);
    }

    private final ImageView getFlagView() {
        return (ImageView) this.flagView$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getNameView() {
        return (TextView) this.nameView$delegate.a(this, $$delegatedProperties[0]);
    }

    public final void setFlag(String str) {
        z65.h(str, "flag");
        ImageView flagView = getFlagView();
        Resources resources = this.itemView.getResources();
        z65.g(resources, "getResources(...)");
        flagView.setImageDrawable(xy3.a(resources, str));
    }

    public final void setName(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getNameView().setText(str);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }
}
