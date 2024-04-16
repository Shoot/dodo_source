package com.dodopizza.order.feature.personaloffer.presentantion.adapter;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.order.feature.personalaction.PersonalOfferApplicationTypeBadge;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PersonalOfferViewHolder.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010b\u001a\u00020a¢\u0006\u0004\bc\u0010dJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0006J\u0010\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u0004J\u0010\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\u0006J\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0006J\u0006\u0010%\u001a\u00020\u0006J\u0006\u0010&\u001a\u00020\u0006J\u0006\u0010'\u001a\u00020\u0006J\u0006\u0010(\u001a\u00020\u0006J\u0014\u0010+\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060)J\u0006\u0010,\u001a\u00020\u0006J\u0006\u0010-\u001a\u00020\u0006J\u0006\u0010.\u001a\u00020\u0006J\u0014\u0010/\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060)J\u0014\u00100\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060)R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b>\u0010?R\u001b\u0010C\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00103\u001a\u0004\bB\u0010:R\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00103\u001a\u0004\bF\u0010GR\u001b\u0010K\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00103\u001a\u0004\bJ\u0010GR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u00103\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u00103\u001a\u0004\bS\u0010TR\u001b\u0010X\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u00103\u001a\u0004\bW\u0010:R\u001b\u0010[\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u00103\u001a\u0004\bZ\u0010GR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u00103\u001a\u0004\b^\u0010_¨\u0006e"}, d2 = {"Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/PersonalOfferViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "imageUrl", "", "placeholderResId", "", "loadImage", "imageResId", "showImageWithGiftPlaceholder", "showImageWithCashbackPlaceholder", "showImageWithDiscountPlaceholder", "showImageFromLocalRes", "", "expireTimeMillis", "showExpireTitle", "futureExpireTimeMillis", "showFutureExpireTitle", "showExpiringTitle", "hideExpireTitle", "showSecretActionLabel", "hideSecretActionLabel", "offerName", "setOfferName", "hideOfferTypeBadge", "showOfferTypeBadge", "offerTypeLabel", "setOfferTypeLabel", "offerTypeIcon", "setOfferTypeIcon", "", "enable", "enableOfferTypeIcon", "showApplyButton", "showDisabledButton", "showAppliedButton", "showWatchButton", "showButton", "hideButton", "enableButton", "disableButton", "Lkotlin/Function0;", "listener", "setOnClickListener", "removeOnClickListener", "showLoading", "hideLoading", "setOnMoreImageClickListener", "setOnCardClickListener", "Lcom/google/android/material/card/MaterialCardView;", "offerCard$delegate", "Lk79;", "getOfferCard", "()Lcom/google/android/material/card/MaterialCardView;", "offerCard", "Landroid/widget/ImageView;", "offerImage$delegate", "getOfferImage", "()Landroid/widget/ImageView;", "offerImage", "Landroid/view/View;", "expireTimeContainer$delegate", "getExpireTimeContainer", "()Landroid/view/View;", "expireTimeContainer", "expireTimeIcon$delegate", "getExpireTimeIcon", "expireTimeIcon", "Landroid/widget/TextView;", "expireTimeTitle$delegate", "getExpireTimeTitle", "()Landroid/widget/TextView;", "expireTimeTitle", "offerNameTitle$delegate", "getOfferNameTitle", "offerNameTitle", "Landroid/widget/ViewAnimator;", "buttonAnimator$delegate", "getButtonAnimator", "()Landroid/widget/ViewAnimator;", "buttonAnimator", "Landroid/widget/Button;", "applyButton$delegate", "getApplyButton", "()Landroid/widget/Button;", "applyButton", "showMoreButton$delegate", "getShowMoreButton", "showMoreButton", "secretActionLabel$delegate", "getSecretActionLabel", "secretActionLabel", "Lcom/dodopizza/order/feature/personalaction/PersonalOfferApplicationTypeBadge;", "personalOfferApplicationTypeBadge$delegate", "getPersonalOfferApplicationTypeBadge", "()Lcom/dodopizza/order/feature/personalaction/PersonalOfferApplicationTypeBadge;", "personalOfferApplicationTypeBadge", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PersonalOfferViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(PersonalOfferViewHolder.class, "offerCard", "getOfferCard()Lcom/google/android/material/card/MaterialCardView;", 0)), bc9.f(new ar8(PersonalOfferViewHolder.class, "offerImage", "getOfferImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PersonalOfferViewHolder.class, "expireTimeContainer", "getExpireTimeContainer()Landroid/view/View;", 0)), bc9.f(new ar8(PersonalOfferViewHolder.class, "expireTimeIcon", "getExpireTimeIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PersonalOfferViewHolder.class, "expireTimeTitle", "getExpireTimeTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PersonalOfferViewHolder.class, "offerNameTitle", "getOfferNameTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PersonalOfferViewHolder.class, "buttonAnimator", "getButtonAnimator()Landroid/widget/ViewAnimator;", 0)), bc9.f(new ar8(PersonalOfferViewHolder.class, "applyButton", "getApplyButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(PersonalOfferViewHolder.class, "showMoreButton", "getShowMoreButton()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PersonalOfferViewHolder.class, "secretActionLabel", "getSecretActionLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PersonalOfferViewHolder.class, "personalOfferApplicationTypeBadge", "getPersonalOfferApplicationTypeBadge()Lcom/dodopizza/order/feature/personalaction/PersonalOfferApplicationTypeBadge;", 0))};
    public static final int $stable = 8;
    private final k79 applyButton$delegate;
    private final k79 buttonAnimator$delegate;
    private final k79 expireTimeContainer$delegate;
    private final k79 expireTimeIcon$delegate;
    private final k79 expireTimeTitle$delegate;
    private final k79 offerCard$delegate;
    private final k79 offerImage$delegate;
    private final k79 offerNameTitle$delegate;
    private final k79 personalOfferApplicationTypeBadge$delegate;
    private final k79 secretActionLabel$delegate;
    private final k79 showMoreButton$delegate;

    /* compiled from: PersonalOfferViewHolder.kt */
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

    /* compiled from: PersonalOfferViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
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

    /* compiled from: PersonalOfferViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0<Unit> function0) {
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
    public PersonalOfferViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.item_personal_offer_horizontal2);
        z65.h(kzbVar, "viewInflater");
        this.offerCard$delegate = kb0.g(this, gy8.personal_offer_card);
        this.offerImage$delegate = kb0.g(this, gy8.personal_offer_image);
        this.expireTimeContainer$delegate = kb0.g(this, gy8.personal_offer_expire_container);
        this.expireTimeIcon$delegate = kb0.g(this, gy8.personal_offer_expire_icon);
        this.expireTimeTitle$delegate = kb0.g(this, gy8.personal_offer_expire_title);
        this.offerNameTitle$delegate = kb0.g(this, gy8.personal_offer_name);
        this.buttonAnimator$delegate = kb0.g(this, gy8.personal_offer_button_switcher);
        this.applyButton$delegate = kb0.g(this, gy8.personal_offer_apply_button);
        this.showMoreButton$delegate = kb0.g(this, gy8.personal_offer_show_more_title);
        this.secretActionLabel$delegate = kb0.g(this, gy8.secret_action_label);
        this.personalOfferApplicationTypeBadge$delegate = kb0.g(this, gy8.personal_offer_type_badge);
    }

    private final Button getApplyButton() {
        return (Button) this.applyButton$delegate.a(this, $$delegatedProperties[7]);
    }

    private final ViewAnimator getButtonAnimator() {
        return (ViewAnimator) this.buttonAnimator$delegate.a(this, $$delegatedProperties[6]);
    }

    private final View getExpireTimeContainer() {
        return (View) this.expireTimeContainer$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ImageView getExpireTimeIcon() {
        return (ImageView) this.expireTimeIcon$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getExpireTimeTitle() {
        return (TextView) this.expireTimeTitle$delegate.a(this, $$delegatedProperties[4]);
    }

    private final MaterialCardView getOfferCard() {
        return (MaterialCardView) this.offerCard$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ImageView getOfferImage() {
        return (ImageView) this.offerImage$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getOfferNameTitle() {
        return (TextView) this.offerNameTitle$delegate.a(this, $$delegatedProperties[5]);
    }

    private final PersonalOfferApplicationTypeBadge getPersonalOfferApplicationTypeBadge() {
        return (PersonalOfferApplicationTypeBadge) this.personalOfferApplicationTypeBadge$delegate.a(this, $$delegatedProperties[10]);
    }

    private final TextView getSecretActionLabel() {
        return (TextView) this.secretActionLabel$delegate.a(this, $$delegatedProperties[9]);
    }

    private final ImageView getShowMoreButton() {
        return (ImageView) this.showMoreButton$delegate.a(this, $$delegatedProperties[8]);
    }

    private final void loadImage(String str, int i) {
        com.bumptech.glide.b.u(getOfferImage()).t(str).d().a0(i).G0(getOfferImage());
    }

    public final void disableButton() {
        getApplyButton().setEnabled(false);
    }

    public final void enableButton() {
        getApplyButton().setEnabled(true);
    }

    public final void enableOfferTypeIcon(boolean z) {
        getPersonalOfferApplicationTypeBadge().e(z);
    }

    public final void hideButton() {
        un3.e(getButtonAnimator());
    }

    public final void hideExpireTitle() {
        un3.e(getExpireTimeIcon());
        un3.e(getExpireTimeContainer());
    }

    public final void hideLoading() {
        un3.m(getButtonAnimator(), getApplyButton());
    }

    public final void hideOfferTypeBadge() {
        un3.e(getPersonalOfferApplicationTypeBadge());
    }

    public final void hideSecretActionLabel() {
        un3.e(getSecretActionLabel());
    }

    public final void removeOnClickListener() {
        getApplyButton().setOnClickListener(null);
    }

    public final void setOfferName(String str) {
        z65.h(str, "offerName");
        getOfferNameTitle().setText(str);
    }

    public final void setOfferTypeIcon(int i) {
        getPersonalOfferApplicationTypeBadge().setIcon(i);
    }

    public final void setOfferTypeLabel(int i) {
        getPersonalOfferApplicationTypeBadge().setLabel(i);
    }

    public final void setOnCardClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getOfferCard(), new a(function0));
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getApplyButton(), new b(function0));
    }

    public final void setOnMoreImageClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getShowMoreButton(), new c(function0));
    }

    public final void showAppliedButton() {
        getApplyButton().setActivated(true);
        getApplyButton().setText(r09.cancel_full);
    }

    public final void showApplyButton() {
        getApplyButton().setActivated(false);
        getApplyButton().setText(r09.action_apply);
    }

    public final void showButton() {
        un3.k(getButtonAnimator());
    }

    public final void showDisabledButton() {
        getApplyButton().setEnabled(false);
        getApplyButton().setText(r09.action_soon);
    }

    public final void showExpireTitle(long j) {
        un3.e(getExpireTimeIcon());
        Context context = getExpireTimeTitle().getContext();
        getExpireTimeTitle().setText(context.getString(r09.personal_offer_expire_time, chb.a(j)));
        getExpireTimeTitle().setTextColor(iu1.c(context, ew8.B));
        un3.k(getExpireTimeContainer());
    }

    public final void showExpiringTitle(long j) {
        un3.e(getExpireTimeIcon());
        Context context = getExpireTimeTitle().getContext();
        getExpireTimeTitle().setText(context.getString(r09.personal_offer_expire_time, chb.a(j)));
        getExpireTimeTitle().setTextColor(iu1.c(context, ew8.E));
        un3.k(getExpireTimeContainer());
    }

    public final void showFutureExpireTitle(long j) {
        getExpireTimeIcon().setImageResource(bx8.ic_lock);
        un3.k(getExpireTimeIcon());
        Context context = getExpireTimeTitle().getContext();
        getExpireTimeTitle().setText(context.getString(r09.personal_offer_future_expire_time, chb.a(j)));
        getExpireTimeTitle().setTextColor(iu1.c(context, ew8.B));
        un3.k(getExpireTimeContainer());
    }

    public final void showImageFromLocalRes(int i) {
        loadImage(i, b09.gift);
    }

    public final void showImageWithCashbackPlaceholder(String str) {
        z65.h(str, "imageUrl");
        loadImage(str, b09.cashback);
    }

    public final void showImageWithDiscountPlaceholder(String str) {
        z65.h(str, "imageUrl");
        loadImage(str, b09.discount);
    }

    public final void showImageWithGiftPlaceholder(String str) {
        z65.h(str, "imageUrl");
        loadImage(str, b09.gift);
    }

    public final void showLoading() {
        un3.l(getButtonAnimator(), gy8.personal_offer_progress_bar);
    }

    public final void showOfferTypeBadge() {
        un3.k(getPersonalOfferApplicationTypeBadge());
    }

    public final void showSecretActionLabel() {
        un3.k(getSecretActionLabel());
    }

    public final void showWatchButton() {
        getApplyButton().setActivated(true);
        getApplyButton().setText(r09.action_watch);
    }

    private final void loadImage(int i, int i2) {
        com.bumptech.glide.b.u(getOfferImage()).s(Integer.valueOf(i)).d().a0(i2).G0(getOfferImage());
    }
}
