package com.dodopizza.order.feature.menu.adapters.menuitem;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.order.feature.personalprice.PersonalPriceBadgeView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: BaseVH.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010C\u001a\u00020B\u0012\b\b\u0001\u0010D\u001a\u00020\u0006¢\u0006\u0004\bE\u0010FJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H&J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u0014\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012J\u0014\u0010\u0015\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012J\u001a\u0010\u0019\u001a\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0016J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0002J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J\u0006\u0010 \u001a\u00020\u0004J\u0016\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#J$\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012J\u0006\u0010(\u001a\u00020\u0004R.\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u0010\n\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00103R\u0014\u00107\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u00103R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006G"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/BaseVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "title", "", "setTitle", "", "lines", "setMaxLinesDescription", "(Ljava/lang/Integer;)V", "description", "setDescription", RemoteMessageConst.Notification.URL, "placeholderResId", "showImage", "", "isAvailable", "setAvailability", "Lkotlin/Function0;", "listener", "setClickListener", "setOnSelectButtonListener", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "animator", "animate", "selectButtonTitle", "setSelectButtonTitle", "price", "showRawPrice", "hideRawPrice", "showPersonalPriceBadge", "hidePersonalPriceBadge", "Lu18;", "formatter", "", "timeRemain", "showEnabledPersonalPriceTimer", "onTimerFinished", "launchPersonalPriceTimer", "releasePersonalPriceTimer", "Lkotlin/jvm/functions/Function1;", "getAnimator", "()Lkotlin/jvm/functions/Function1;", "setAnimator", "(Lkotlin/jvm/functions/Function1;)V", "Lt18;", "personalPriceTimer", "Lt18;", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "getDescription", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Landroid/widget/Button;", "getSelectButton", "()Landroid/widget/Button;", "selectButton", "getRawPrice", "rawPrice", "Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", "getPersonalPriceBadge", "()Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", "personalPriceBadge", "Lkzb;", "viewInflater", "viewLayoutId", "<init>", "(Lkzb;I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class BaseVH extends SelfInflatingViewHolder {
    public static final int $stable = 8;
    private Function1<? super ImageView, Unit> animator;
    private t18 personalPriceTimer;

    /* compiled from: BaseVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/widget/ImageView;", "it", "", "a", "(Landroid/widget/ImageView;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<ImageView, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void a(ImageView imageView) {
            z65.h(imageView, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageView imageView) {
            a(imageView);
            return Unit.a;
        }
    }

    /* compiled from: BaseVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", CrashHianalyticsData.TIME, "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<Long, Unit> {
        final /* synthetic */ u18 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u18 u18Var) {
            super(1);
            this.b = u18Var;
        }

        public final void a(long j) {
            PersonalPriceBadgeView personalPriceBadge = BaseVH.this.getPersonalPriceBadge();
            u18 u18Var = this.b;
            Context context = BaseVH.this.itemView.getContext();
            z65.g(context, "getContext(...)");
            personalPriceBadge.setTimeRemain(u18Var.a(context, j));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            a(l.longValue());
            return Unit.a;
        }
    }

    /* compiled from: BaseVH.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0<Unit> function0) {
            super(0);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BaseVH.this.getPersonalPriceBadge().setEnabled(false);
            BaseVH.this.getPersonalPriceBadge().a();
            BaseVH.this.getPersonalPriceBadge().setDiscountText(jzb.a(BaseVH.this, r09.personal_price_badge_discount_expired));
            this.b.invoke();
        }
    }

    /* compiled from: BaseVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0<Unit> function0) {
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

    /* compiled from: BaseVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Function0<Unit> function0) {
            super(1);
            this.b = function0;
        }

        public final void a(View view) {
            z65.h(view, "it");
            BaseVH.this.getAnimator().invoke(BaseVH.this.getImageView());
            this.b.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseVH(kzb kzbVar, int i) {
        super(kzbVar, i);
        z65.h(kzbVar, "viewInflater");
        this.animator = a.a;
        this.personalPriceTimer = new v18();
    }

    public final void animate(Function1<? super ImageView, Unit> function1) {
        z65.h(function1, "animator");
        function1.invoke(getImageView());
    }

    public final Function1<ImageView, Unit> getAnimator() {
        return this.animator;
    }

    public abstract TextView getDescription();

    public abstract ImageView getImageView();

    public abstract PersonalPriceBadgeView getPersonalPriceBadge();

    public abstract TextView getRawPrice();

    public abstract Button getSelectButton();

    public abstract TextView getTitle();

    public final void hidePersonalPriceBadge() {
        un3.e(getPersonalPriceBadge());
    }

    public final void hideRawPrice() {
        un3.e(getRawPrice());
    }

    public final void launchPersonalPriceTimer(u18 u18Var, long j, Function0<Unit> function0) {
        z65.h(u18Var, "formatter");
        z65.h(function0, "onTimerFinished");
        this.personalPriceTimer.a(j, new b(u18Var), new c(function0));
    }

    public final void releasePersonalPriceTimer() {
        this.personalPriceTimer.release();
    }

    public final void setAnimator(Function1<? super ImageView, Unit> function1) {
        z65.h(function1, "<set-?>");
        this.animator = function1;
    }

    public final void setAvailability(boolean z) {
        getSelectButton().setEnabled(z);
    }

    public final void setClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new d(function0));
    }

    public final void setDescription(String str) {
        z65.h(str, "description");
        getDescription().setText(str);
    }

    public final void setMaxLinesDescription(Integer num) {
        int i;
        TextView description = getDescription();
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        description.setMaxLines(i);
    }

    public final void setOnSelectButtonListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getSelectButton(), new e(function0));
    }

    public final void setSelectButtonTitle(String str) {
        z65.h(str, "selectButtonTitle");
        getSelectButton().setText(str);
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getTitle().setText(str);
    }

    public final void showEnabledPersonalPriceTimer(u18 u18Var, long j) {
        z65.h(u18Var, "formatter");
        getPersonalPriceBadge().setEnabled(true);
        PersonalPriceBadgeView personalPriceBadge = getPersonalPriceBadge();
        Context context = this.itemView.getContext();
        z65.g(context, "getContext(...)");
        personalPriceBadge.setTimeRemain(u18Var.a(context, j));
    }

    public abstract void showImage(String str, int i);

    public final void showPersonalPriceBadge() {
        getPersonalPriceBadge().setDiscountText(jzb.a(this, r09.discount));
        un3.k(getPersonalPriceBadge());
    }

    public final void showRawPrice(String str) {
        z65.h(str, "price");
        getRawPrice().setText(str);
        gdb.a.a(getRawPrice());
        un3.k(getRawPrice());
    }
}
