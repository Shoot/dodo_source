package ru.dodopizza.app.presentation.widgets.inappnotification;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: InAppNotification.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00100\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001b\u0010!\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010*¨\u00063"}, d2 = {"Lru/dodopizza/app/presentation/widgets/inappnotification/InAppNotification;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "", "action", c.a, "b", "", "text", "setTitle", "", "colorInt", "setTitleColor", "Landroid/content/res/ColorStateList;", "tintColorState", "setCloseIconTint", "setDescription", "setDescriptionColor", RemoteMessageConst.Notification.URL, "a", "Landroid/graphics/drawable/Drawable;", "drawable", "setBackgroundStyle", "Landroid/widget/TextView;", "Lk79;", "getTitle", "()Landroid/widget/TextView;", "title", "getDescription", "description", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, "Landroidx/appcompat/widget/AppCompatImageButton;", DateTokenConverter.CONVERTER_KEY, "getCloseButton", "()Landroidx/appcompat/widget/AppCompatImageButton;", "closeButton", "Lcom/google/android/material/card/MaterialCardView;", e.a, "getNotificationCard", "()Lcom/google/android/material/card/MaterialCardView;", "notificationCard", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InAppNotification extends FrameLayout {
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(InAppNotification.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(InAppNotification.class, "description", "getDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(InAppNotification.class, ElementGenerator.TYPE_IMAGE, "getImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(InAppNotification.class, "closeButton", "getCloseButton()Landroidx/appcompat/widget/AppCompatImageButton;", 0)), bc9.f(new ar8(InAppNotification.class, "notificationCard", "getNotificationCard()Lcom/google/android/material/card/MaterialCardView;", 0))};
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    private final k79 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppNotification.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<View, Unit> {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppNotification.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<View, Unit> {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppNotification(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    private final AppCompatImageButton getCloseButton() {
        return (AppCompatImageButton) this.d.a(this, f[3]);
    }

    private final TextView getDescription() {
        return (TextView) this.b.a(this, f[1]);
    }

    private final ImageView getImage() {
        return (ImageView) this.c.a(this, f[2]);
    }

    private final MaterialCardView getNotificationCard() {
        return (MaterialCardView) this.e.a(this, f[4]);
    }

    private final TextView getTitle() {
        return (TextView) this.a.a(this, f[0]);
    }

    public final void a(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        com.bumptech.glide.b.u(this).t(str).G0(getImage());
    }

    public final void b(Function0<Unit> function0) {
        z65.h(function0, "action");
        oma.a(getNotificationCard(), new a(function0));
    }

    public final void c(Function0<Unit> function0) {
        z65.h(function0, "action");
        oma.a(getCloseButton(), new b(function0));
    }

    public final void setBackgroundStyle(Drawable drawable) {
        z65.h(drawable, "drawable");
        getNotificationCard().setBackground(drawable);
    }

    public final void setCloseIconTint(ColorStateList colorStateList) {
        z65.h(colorStateList, "tintColorState");
        getCloseButton().setImageTintList(colorStateList);
    }

    public final void setDescription(String str) {
        boolean y;
        z65.h(str, "text");
        y = l0b.y(str);
        if (!y) {
            getDescription().setText(str);
            un3.k(getDescription());
            return;
        }
        un3.e(getDescription());
    }

    public final void setDescriptionColor(int i) {
        getDescription().setTextColor(i);
    }

    public final void setTitle(String str) {
        z65.h(str, "text");
        getTitle().setText(str);
    }

    public final void setTitleColor(int i) {
        getTitle().setTextColor(i);
    }

    public /* synthetic */ InAppNotification(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppNotification(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = kb0.d(this, R.id.in_app_notification_title);
        this.b = kb0.d(this, R.id.in_app_notification_description);
        this.c = kb0.d(this, R.id.in_app_notification_icon);
        this.d = kb0.d(this, R.id.in_app_notification_close_button);
        this.e = kb0.d(this, R.id.in_app_notification_card);
        View.inflate(context, R.layout.main_screen_notification_item, this);
    }
}
