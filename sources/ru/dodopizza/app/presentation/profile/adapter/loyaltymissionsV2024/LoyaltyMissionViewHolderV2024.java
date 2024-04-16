package ru.dodopizza.app.presentation.profile.adapter.loyaltymissionsV2024;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.dodopizza.android.buttons.DodoButton;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: LoyaltyMissionViewHolderV2024.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0002J7\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u0007J\u0014\u0010\u001b\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019J\u0014\u0010\u001c\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019J\u0006\u0010\u001d\u001a\u00020\u0007J\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\u0007J\u0006\u0010 \u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\u0007J\u0016\u0010$\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\tJ\u0006\u0010'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010*\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010+\u001a\u00020\u0007R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b=\u0010:R\u001b\u0010A\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u0010:R\u001b\u0010D\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010.\u001a\u0004\bC\u0010:R\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bG\u0010HR\u001b\u0010L\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010.\u001a\u0004\bK\u0010:R\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010.\u001a\u0004\bO\u0010PR\u001b\u0010T\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010.\u001a\u0004\bS\u0010:R\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010.\u001a\u0004\bW\u0010XR\u001b\u0010\\\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010.\u001a\u0004\b[\u0010PR\u001b\u0010_\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010.\u001a\u0004\b^\u0010:¨\u0006d"}, d2 = {"Lru/dodopizza/app/presentation/profile/adapter/loyaltymissionsV2024/LoyaltyMissionViewHolderV2024;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "endDateMillis", "", "textColorRes", "backgroundTintColorRes", "", "showEndDateTitle", "", "text", "textColorId", "colorId", "iconRes", "configureButton", "(Ljava/lang/String;IILjava/lang/Integer;)V", "imageUrl", "showMissionImage", "rewardAmount", "setMissionReward", "missionText", "setMissionTitle", "descriptionText", "setMissionDescription", "hideMissionDescription", "Lkotlin/Function0;", "clickListener", "setCardClickListener", "setButtonClickListener", "showGetStartedButton", "showAcceptingButton", "showVerifyingButton", "showCompletedButton", "showRetryButton", "currentProgress", "totalProgress", "showProgressButton", "message", "showModeratorMessage", "hideStatusDescription", "hideExpireTitle", "showExpiringTitle", "showExpireTitle", "showCompletedExpirationTitle", "Landroidx/cardview/widget/CardView;", "rootCard$delegate", "Lk79;", "getRootCard", "()Landroidx/cardview/widget/CardView;", "rootCard", "Landroid/widget/ImageView;", "image$delegate", "getImage", "()Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, "Landroid/widget/TextView;", "rewardTitle$delegate", "getRewardTitle", "()Landroid/widget/TextView;", "rewardTitle", "expireTitle$delegate", "getExpireTitle", "expireTitle", "missionTitle$delegate", "getMissionTitle", "missionTitle", "missionDescription$delegate", "getMissionDescription", "missionDescription", "Lcom/dodopizza/android/buttons/DodoButton;", "actionButton$delegate", "getActionButton", "()Lcom/dodopizza/android/buttons/DodoButton;", "actionButton", "doneTitleButton$delegate", "getDoneTitleButton", "doneTitleButton", "Landroid/view/ViewGroup;", "progressContainer$delegate", "getProgressContainer", "()Landroid/view/ViewGroup;", "progressContainer", "progressCounter$delegate", "getProgressCounter", "progressCounter", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "statusProgress$delegate", "getStatusProgress", "()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "statusProgress", "statusContainer$delegate", "getStatusContainer", "statusContainer", "moderatorMessage$delegate", "getModeratorMessage", "moderatorMessage", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoyaltyMissionViewHolderV2024 extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "rootCard", "getRootCard()Landroidx/cardview/widget/CardView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, ElementGenerator.TYPE_IMAGE, "getImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "rewardTitle", "getRewardTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "expireTitle", "getExpireTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "missionTitle", "getMissionTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "missionDescription", "getMissionDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "actionButton", "getActionButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "doneTitleButton", "getDoneTitleButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "progressContainer", "getProgressContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "progressCounter", "getProgressCounter()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "statusProgress", "getStatusProgress()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "statusContainer", "getStatusContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(LoyaltyMissionViewHolderV2024.class, "moderatorMessage", "getModeratorMessage()Landroid/widget/TextView;", 0))};
    private final k79 actionButton$delegate;
    private final k79 doneTitleButton$delegate;
    private final k79 expireTitle$delegate;
    private final k79 image$delegate;
    private final k79 missionDescription$delegate;
    private final k79 missionTitle$delegate;
    private final k79 moderatorMessage$delegate;
    private final k79 progressContainer$delegate;
    private final k79 progressCounter$delegate;
    private final k79 rewardTitle$delegate;
    private final k79 rootCard$delegate;
    private final k79 statusContainer$delegate;
    private final k79 statusProgress$delegate;

    /* compiled from: LoyaltyMissionViewHolderV2024.kt */
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

    /* compiled from: LoyaltyMissionViewHolderV2024.kt */
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
    public LoyaltyMissionViewHolderV2024(kzb kzbVar) {
        super(kzbVar, R.layout.item_loyalty_mission_v2024);
        z65.h(kzbVar, "viewInflater");
        this.rootCard$delegate = kb0.g(this, R.id.loyalty_mission_card);
        this.image$delegate = kb0.g(this, R.id.loyalty_mission_image);
        this.rewardTitle$delegate = kb0.g(this, R.id.loyalty_mission_reward);
        this.expireTitle$delegate = kb0.g(this, R.id.loyalty_mission_expire_title);
        this.missionTitle$delegate = kb0.g(this, R.id.loyalty_mission_title);
        this.missionDescription$delegate = kb0.g(this, R.id.loyalty_mission_description);
        this.actionButton$delegate = kb0.g(this, R.id.loyalty_mission_button);
        this.doneTitleButton$delegate = kb0.g(this, R.id.loyalty_mission_done_title_button);
        this.progressContainer$delegate = kb0.g(this, R.id.loyalty_mission_progress_container);
        this.progressCounter$delegate = kb0.g(this, R.id.loyalty_mission_progress_counter);
        this.statusProgress$delegate = kb0.g(this, R.id.loyalty_mission_status_progress);
        this.statusContainer$delegate = kb0.g(this, R.id.loyalty_mission_status_container);
        this.moderatorMessage$delegate = kb0.g(this, R.id.loyalty_mission_moderator_message);
    }

    private final void configureButton(String str, int i, int i2, Integer num) {
        Context context = getRootCard().getContext();
        getActionButton().setText(str);
        getActionButton().setTextColor(iu1.c(context, i));
        getActionButton().setBackgroundTintList(iu1.d(context, i2));
        getActionButton().setState(DodoButton.a.a);
        if (num != null) {
            getActionButton().setIcon(iu1.e(context, num.intValue()));
            getActionButton().setIconTint(iu1.d(context, i));
        } else {
            getActionButton().setIcon(null);
        }
        un3.k(getActionButton());
        un3.e(getProgressContainer());
        un3.e(getDoneTitleButton());
    }

    static /* synthetic */ void configureButton$default(LoyaltyMissionViewHolderV2024 loyaltyMissionViewHolderV2024, String str, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            num = null;
        }
        loyaltyMissionViewHolderV2024.configureButton(str, i, i2, num);
    }

    private final DodoButton getActionButton() {
        return (DodoButton) this.actionButton$delegate.a(this, $$delegatedProperties[6]);
    }

    private final TextView getDoneTitleButton() {
        return (TextView) this.doneTitleButton$delegate.a(this, $$delegatedProperties[7]);
    }

    private final TextView getExpireTitle() {
        return (TextView) this.expireTitle$delegate.a(this, $$delegatedProperties[3]);
    }

    private final ImageView getImage() {
        return (ImageView) this.image$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getMissionDescription() {
        return (TextView) this.missionDescription$delegate.a(this, $$delegatedProperties[5]);
    }

    private final TextView getMissionTitle() {
        return (TextView) this.missionTitle$delegate.a(this, $$delegatedProperties[4]);
    }

    private final TextView getModeratorMessage() {
        return (TextView) this.moderatorMessage$delegate.a(this, $$delegatedProperties[12]);
    }

    private final ViewGroup getProgressContainer() {
        return (ViewGroup) this.progressContainer$delegate.a(this, $$delegatedProperties[8]);
    }

    private final TextView getProgressCounter() {
        return (TextView) this.progressCounter$delegate.a(this, $$delegatedProperties[9]);
    }

    private final TextView getRewardTitle() {
        return (TextView) this.rewardTitle$delegate.a(this, $$delegatedProperties[2]);
    }

    private final CardView getRootCard() {
        return (CardView) this.rootCard$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ViewGroup getStatusContainer() {
        return (ViewGroup) this.statusContainer$delegate.a(this, $$delegatedProperties[11]);
    }

    private final LinearProgressIndicator getStatusProgress() {
        return (LinearProgressIndicator) this.statusProgress$delegate.a(this, $$delegatedProperties[10]);
    }

    private final void showEndDateTitle(long j, int i, int i2) {
        Context context = getExpireTitle().getContext();
        getExpireTitle().setText(context.getString(R.string.loyalty_mission_expire_time, chb.a(j)));
        getExpireTitle().setTextColor(iu1.c(context, i));
        getExpireTitle().setBackgroundTintList(iu1.d(context, i2));
        un3.k(getExpireTitle());
    }

    public final void hideExpireTitle() {
        un3.e(getExpireTitle());
    }

    public final void hideMissionDescription() {
        un3.e(getMissionDescription());
    }

    public final void hideStatusDescription() {
        un3.e(getStatusContainer());
    }

    public final void setButtonClickListener(Function0<Unit> function0) {
        z65.h(function0, "clickListener");
        oma.a(getActionButton(), new a(function0));
    }

    public final void setCardClickListener(Function0<Unit> function0) {
        z65.h(function0, "clickListener");
        oma.a(getRootCard(), new b(function0));
    }

    public final void setMissionDescription(String str) {
        z65.h(str, "descriptionText");
        getMissionDescription().setText(str);
        un3.k(getMissionDescription());
    }

    public final void setMissionReward(long j) {
        getRewardTitle().setText(getRewardTitle().getContext().getString(R.string.plus_label, String.valueOf(j)));
    }

    public final void setMissionTitle(String str) {
        z65.h(str, "missionText");
        getMissionTitle().setText(str);
    }

    public final void showAcceptingButton() {
        showGetStartedButton();
        getActionButton().setState(DodoButton.a.b);
    }

    public final void showCompletedButton() {
        un3.e(getActionButton());
        un3.e(getProgressContainer());
        un3.k(getDoneTitleButton());
    }

    public final void showCompletedExpirationTitle() {
        Context context = getExpireTitle().getContext();
        getExpireTitle().setText(context.getString(R.string.loyalty_mission_expire_time_done));
        getExpireTitle().setTextColor(iu1.c(context, R.color.textIconSuccessColor));
        getExpireTitle().setBackgroundTintList(iu1.d(context, R.color.surfaceSuccessSecondaryColor));
        un3.k(getExpireTitle());
    }

    public final void showExpireTitle(long j) {
        showEndDateTitle(j, R.color.textIconPrimaryColor, R.color.surfaceSecondaryColor);
    }

    public final void showExpiringTitle(long j) {
        showEndDateTitle(j, R.color.textIconWarningColor, R.color.surfaceWarningSecondaryColor);
    }

    public final void showGetStartedButton() {
        String string = getActionButton().getContext().getString(R.string.loyalty_mission_get_starter);
        z65.g(string, "getString(...)");
        configureButton$default(this, string, R.color.staticWhiteColor, R.color.loyalty_mission_send_button_color_v2024, null, 8, null);
    }

    public final void showMissionImage(String str) {
        z65.h(str, "imageUrl");
        com.bumptech.glide.b.u(getImage()).t(str).a0(R.drawable.ic_mission_placeholder).G0(getImage());
    }

    public final void showModeratorMessage(String str) {
        z65.h(str, "message");
        getModeratorMessage().setText(str);
        un3.k(getStatusContainer());
    }

    public final void showProgressButton(int i, int i2) {
        getStatusProgress().setMax(i2);
        getStatusProgress().setProgress(i);
        getProgressCounter().setText(getProgressCounter().getContext().getString(R.string.proportion, Integer.valueOf(i), Integer.valueOf(i2)));
        un3.e(getActionButton());
        un3.e(getDoneTitleButton());
        un3.k(getProgressContainer());
    }

    public final void showRetryButton() {
        String string = getActionButton().getContext().getString(R.string.loyalty_mission_retry);
        z65.g(string, "getString(...)");
        configureButton$default(this, string, R.color.staticWhiteColor, R.color.loyalty_mission_send_button_color_v2024, null, 8, null);
    }

    public final void showVerifyingButton() {
        String string = getActionButton().getContext().getString(R.string.loyalty_mission_verifying);
        z65.g(string, "getString(...)");
        configureButton(string, R.color.textIconTertiaryColor, R.color.surfaceTertiaryColor, Integer.valueOf((int) R.drawable.ic_timer));
    }
}
