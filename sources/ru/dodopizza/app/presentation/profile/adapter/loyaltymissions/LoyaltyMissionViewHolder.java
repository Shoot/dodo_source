package ru.dodopizza.app.presentation.profile.adapter.loyaltymissions;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.dodopizza.android.buttons.DodoButton;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: LoyaltyMissionViewHolder.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J$\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0004H\u0002J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u0010\u0015\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\u0014\u0010\u0016\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\u0006J\u0006\u0010\u001b\u001a\u00020\u0006J\u0016\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\bJ\u0006\u0010%\u001a\u00020\u0006J\u0006\u0010&\u001a\u00020\u0006J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u00107R\u001b\u0010;\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u00107R\u001b\u0010>\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u00107R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010+\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010+\u001a\u0004\bK\u0010LR\u001b\u0010P\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010+\u001a\u0004\bO\u00102R\u001b\u0010S\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010+\u001a\u0004\bR\u00107¨\u0006X"}, d2 = {"Lru/dodopizza/app/presentation/profile/adapter/loyaltymissions/LoyaltyMissionViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "endDateMillis", "", "colorRes", "", "showEndDateTitle", "", "text", "textColorId", "colorId", "configureButton", "imageUrl", "showMissionImage", "rewardAmount", "setMissionReward", "missionText", "setMissionTitle", "Lkotlin/Function0;", "clickListener", "setCardClickListener", "setButtonClickListener", "showGetStartedButton", "showAcceptingButton", "showVerifyingButton", "showCompletedButton", "showRetryButton", "currentProgress", "totalProgress", "showProgressButton", "doneProgress", "showDoneProgressButton", "statusDescription", "showWaitingStatusDescription", "showDoneStatusDescription", "showAlertStatusDescription", "hideStatusDescription", "hideExpireTitle", "showExpiringTitle", "showExpireTitle", "Landroidx/cardview/widget/CardView;", "missionCard$delegate", "Lk79;", "getMissionCard", "()Landroidx/cardview/widget/CardView;", "missionCard", "Landroid/widget/ImageView;", "missionImage$delegate", "getMissionImage", "()Landroid/widget/ImageView;", "missionImage", "Landroid/widget/TextView;", "missionReward$delegate", "getMissionReward", "()Landroid/widget/TextView;", "missionReward", "missionExpireTitle$delegate", "getMissionExpireTitle", "missionExpireTitle", "missionTitle$delegate", "getMissionTitle", "missionTitle", "Lcom/dodopizza/android/buttons/DodoButton;", "missionButton$delegate", "getMissionButton", "()Lcom/dodopizza/android/buttons/DodoButton;", "missionButton", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "missionStatusProgress$delegate", "getMissionStatusProgress", "()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "missionStatusProgress", "Landroid/view/ViewGroup;", "missionStatusContainer$delegate", "getMissionStatusContainer", "()Landroid/view/ViewGroup;", "missionStatusContainer", "missionStatusIcon$delegate", "getMissionStatusIcon", "missionStatusIcon", "missionStatusDesc$delegate", "getMissionStatusDesc", "missionStatusDesc", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoyaltyMissionViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(LoyaltyMissionViewHolder.class, "missionCard", "getMissionCard()Landroidx/cardview/widget/CardView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolder.class, "missionImage", "getMissionImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolder.class, "missionReward", "getMissionReward()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolder.class, "missionExpireTitle", "getMissionExpireTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolder.class, "missionTitle", "getMissionTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolder.class, "missionButton", "getMissionButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolder.class, "missionStatusProgress", "getMissionStatusProgress()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolder.class, "missionStatusContainer", "getMissionStatusContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolder.class, "missionStatusIcon", "getMissionStatusIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolder.class, "missionStatusDesc", "getMissionStatusDesc()Landroid/widget/TextView;", 0))};
    private final k79 missionButton$delegate;
    private final k79 missionCard$delegate;
    private final k79 missionExpireTitle$delegate;
    private final k79 missionImage$delegate;
    private final k79 missionReward$delegate;
    private final k79 missionStatusContainer$delegate;
    private final k79 missionStatusDesc$delegate;
    private final k79 missionStatusIcon$delegate;
    private final k79 missionStatusProgress$delegate;
    private final k79 missionTitle$delegate;

    /* compiled from: LoyaltyMissionViewHolder.kt */
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

    /* compiled from: LoyaltyMissionViewHolder.kt */
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
    public LoyaltyMissionViewHolder(kzb kzbVar) {
        super(kzbVar, R.layout.item_loyalty_mission);
        z65.h(kzbVar, "viewInflater");
        this.missionCard$delegate = kb0.g(this, R.id.loyalty_mission_card);
        this.missionImage$delegate = kb0.g(this, R.id.loyalty_mission_image);
        this.missionReward$delegate = kb0.g(this, R.id.loyalty_mission_reward);
        this.missionExpireTitle$delegate = kb0.g(this, R.id.loyalty_mission_expire_title);
        this.missionTitle$delegate = kb0.g(this, R.id.loyalty_mission_title);
        this.missionButton$delegate = kb0.g(this, R.id.loyalty_mission_button);
        this.missionStatusProgress$delegate = kb0.g(this, R.id.loyalty_mission_status_progress);
        this.missionStatusContainer$delegate = kb0.g(this, R.id.loyalty_mission_status_container);
        this.missionStatusIcon$delegate = kb0.g(this, R.id.loyalty_mission_status_icon);
        this.missionStatusDesc$delegate = kb0.g(this, R.id.loyalty_mission_status_description);
    }

    private final void configureButton(String str, int i, int i2) {
        Context context = getMissionButton().getContext();
        getMissionButton().setText(str);
        getMissionButton().setTextColor(iu1.c(context, i));
        getMissionButton().setBackgroundTintList(iu1.d(context, i2));
        getMissionButton().setState(DodoButton.a.a);
    }

    private final DodoButton getMissionButton() {
        return (DodoButton) this.missionButton$delegate.a(this, $$delegatedProperties[5]);
    }

    private final CardView getMissionCard() {
        return (CardView) this.missionCard$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getMissionExpireTitle() {
        return (TextView) this.missionExpireTitle$delegate.a(this, $$delegatedProperties[3]);
    }

    private final ImageView getMissionImage() {
        return (ImageView) this.missionImage$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getMissionReward() {
        return (TextView) this.missionReward$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ViewGroup getMissionStatusContainer() {
        return (ViewGroup) this.missionStatusContainer$delegate.a(this, $$delegatedProperties[7]);
    }

    private final TextView getMissionStatusDesc() {
        return (TextView) this.missionStatusDesc$delegate.a(this, $$delegatedProperties[9]);
    }

    private final ImageView getMissionStatusIcon() {
        return (ImageView) this.missionStatusIcon$delegate.a(this, $$delegatedProperties[8]);
    }

    private final LinearProgressIndicator getMissionStatusProgress() {
        return (LinearProgressIndicator) this.missionStatusProgress$delegate.a(this, $$delegatedProperties[6]);
    }

    private final TextView getMissionTitle() {
        return (TextView) this.missionTitle$delegate.a(this, $$delegatedProperties[4]);
    }

    private final void showEndDateTitle(long j, int i) {
        Context context = getMissionExpireTitle().getContext();
        getMissionExpireTitle().setText(context.getString(R.string.loyalty_mission_expire_time, chb.a(j)));
        getMissionExpireTitle().setTextColor(iu1.c(context, i));
        un3.k(getMissionExpireTitle());
    }

    public final void hideExpireTitle() {
        un3.e(getMissionExpireTitle());
    }

    public final void hideStatusDescription() {
        un3.e(getMissionStatusContainer());
    }

    public final void setButtonClickListener(Function0<Unit> function0) {
        z65.h(function0, "clickListener");
        oma.a(getMissionButton(), new a(function0));
    }

    public final void setCardClickListener(Function0<Unit> function0) {
        z65.h(function0, "clickListener");
        oma.a(getMissionCard(), new b(function0));
    }

    public final void setMissionReward(long j) {
        getMissionReward().setText(getMissionReward().getContext().getString(R.string.plus_label_with_space, String.valueOf(j)));
    }

    public final void setMissionTitle(String str) {
        z65.h(str, "missionText");
        getMissionTitle().setText(str);
    }

    public final void showAcceptingButton() {
        showGetStartedButton();
        getMissionButton().setState(DodoButton.a.b);
    }

    public final void showAlertStatusDescription(String str) {
        z65.h(str, "statusDescription");
        getMissionStatusIcon().setImageResource(R.drawable.ic_alert);
        getMissionStatusDesc().setText(str);
        un3.k(getMissionStatusContainer());
    }

    public final void showCompletedButton() {
        String string = getMissionButton().getContext().getString(R.string.loyalty_mission_mission_completed);
        z65.g(string, "getString(...)");
        configureButton(string, R.color.staticWhiteColor, R.color.surfaceSuccessColor);
    }

    public final void showDoneProgressButton(int i) {
        String string = getMissionButton().getContext().getString(R.string.proportion_with_space, Integer.valueOf(i), Integer.valueOf(i));
        z65.g(string, "getString(...)");
        configureButton(string, R.color.staticWhiteColor, R.color.surfaceSuccessColor);
        getMissionStatusProgress().setMax(i);
        getMissionStatusProgress().setProgress(i);
    }

    public final void showDoneStatusDescription(String str) {
        z65.h(str, "statusDescription");
        getMissionStatusIcon().setImageResource(R.drawable.ic_check);
        getMissionStatusDesc().setText(str);
        un3.k(getMissionStatusContainer());
    }

    public final void showExpireTitle(long j) {
        showEndDateTitle(j, R.color.textIconSecondaryColor);
    }

    public final void showExpiringTitle(long j) {
        showEndDateTitle(j, R.color.textIconWarningColor);
    }

    public final void showGetStartedButton() {
        String string = getMissionButton().getContext().getString(R.string.loyalty_mission_get_starter);
        z65.g(string, "getString(...)");
        configureButton(string, R.color.staticWhiteColor, R.color.loyalty_mission_send_button_color);
    }

    public final void showMissionImage(String str) {
        z65.h(str, "imageUrl");
        com.bumptech.glide.b.u(getMissionImage()).t(str).a0(R.drawable.ic_mission_placeholder).G0(getMissionImage());
    }

    public final void showProgressButton(int i, int i2) {
        String string = getMissionButton().getContext().getString(R.string.proportion_with_space, Integer.valueOf(i), Integer.valueOf(i2));
        z65.g(string, "getString(...)");
        configureButton(string, R.color.textIconPrimaryColor, R.color.transparent);
        getMissionStatusProgress().setMax(i2);
        getMissionStatusProgress().setProgress(i);
    }

    public final void showRetryButton() {
        String string = getMissionButton().getContext().getString(R.string.loyalty_mission_retry);
        z65.g(string, "getString(...)");
        configureButton(string, R.color.staticWhiteColor, R.color.loyalty_mission_send_button_color);
    }

    public final void showVerifyingButton() {
        String string = getMissionButton().getContext().getString(R.string.loyalty_mission_verifying);
        z65.g(string, "getString(...)");
        configureButton(string, R.color.textIconPrimaryColor, R.color.surfaceDodoSecondaryColor);
    }

    public final void showWaitingStatusDescription(String str) {
        z65.h(str, "statusDescription");
        getMissionStatusIcon().setImageResource(R.drawable.ic_time);
        getMissionStatusDesc().setText(str);
        un3.k(getMissionStatusContainer());
    }
}
