package com.dodopizza.controlling.feature.ratingapplied.presentation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.b;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.controlling.feature.ratingapplied.presentation.PromoActionViewHolder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: PromoActionViewHolder.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0018¨\u0006!"}, d2 = {"Lcom/dodopizza/controlling/feature/ratingapplied/presentation/PromoActionViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Lkotlin/Function0;", "", "listener", "setOnClickListener", "", "drawableRes", "showImage", "titleRes", "setTitle", "textRes", "setUrl", "", "urlText", "Landroid/widget/ImageView;", "image$delegate", "Lk79;", "getImage", "()Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, "Landroid/widget/TextView;", "title$delegate", "getTitle", "()Landroid/widget/TextView;", "title", "url$delegate", "getUrl", RemoteMessageConst.Notification.URL, "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PromoActionViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(PromoActionViewHolder.class, ElementGenerator.TYPE_IMAGE, "getImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PromoActionViewHolder.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PromoActionViewHolder.class, RemoteMessageConst.Notification.URL, "getUrl()Landroid/widget/TextView;", 0))};
    private final k79 image$delegate;
    private final k79 title$delegate;
    private final k79 url$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoActionViewHolder(kzb kzbVar) {
        super(kzbVar, wz8.item_rating_applied_promo);
        z65.h(kzbVar, "viewInflater");
        this.image$delegate = kb0.g(this, zx8.rating_applied_promo_image);
        this.title$delegate = kb0.g(this, zx8.rating_applied_promo_title);
        this.url$delegate = kb0.g(this, zx8.rating_applied_promo_link);
    }

    private final ImageView getImage() {
        return (ImageView) this.image$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getTitle() {
        return (TextView) this.title$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getUrl() {
        return (TextView) this.url$delegate.a(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListener$lambda$0(Function0 function0, View view) {
        z65.h(function0, "$listener");
        function0.invoke();
    }

    public final void setOnClickListener(final Function0<Unit> function0) {
        z65.h(function0, "listener");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: np8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromoActionViewHolder.setOnClickListener$lambda$0(Function0.this, view);
            }
        });
    }

    public final void setTitle(int i) {
        getTitle().setText(getTitle().getContext().getText(i));
    }

    public final void setUrl(int i) {
        getUrl().setText(getUrl().getContext().getText(i));
    }

    public final void showImage(int i) {
        b.u(getImage()).s(Integer.valueOf(i)).o0(new io9(mpb.a(2.0f, getImage().getContext()))).b0(yj8.HIGH).G0(getImage());
    }

    public final void setUrl(String str) {
        z65.h(str, "urlText");
        getUrl().setText(str);
    }
}
