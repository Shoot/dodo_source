package ru.dodopizza.app.presentation.checkout.details.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.SegmentedControl;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeSwitcher.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0014\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0014\u0010\u0011\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0016\u0010$\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0016\u0010&\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001e¨\u0006*"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeSwitcher;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "", "enabled", "setEnabled", "Lkotlin/Function0;", "listener", "setOnDeliverySelectedListener", "setOnRestaurantSelectedListener", "Landroid/text/SpannableString;", "text", "setRestaurantLabel", "setDeliveryLabel", "Landroid/widget/RadioButton;", "Lk79;", "getDeliveryRadioButton", "()Landroid/widget/RadioButton;", "deliveryRadioButton", "getRestaurantRadioButton", "restaurantRadioButton", "", "I", "groupRadius", "buttonRadius", e.a, "innerPadding", "f", "buttonTextAppearance", "g", "selectedButtonTextAppearance", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", Image.TYPE_HIGH, "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OrderTypeSwitcher extends FrameLayout {
    private final k79 a;
    private final k79 b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    static final /* synthetic */ je5<Object>[] i = {bc9.f(new ar8(OrderTypeSwitcher.class, "deliveryRadioButton", "getDeliveryRadioButton()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(OrderTypeSwitcher.class, "restaurantRadioButton", "getRestaurantRadioButton()Landroid/widget/RadioButton;", 0))};
    public static final a h = new a(null);
    public static final int j = 8;

    /* compiled from: OrderTypeSwitcher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeSwitcher$a;", "", "", "DEFAULT_BUTTON_RADIUS_DP", "I", "DEFAULT_GROUP_RADIUS_DP", "DEFAULT_INNER_PADDING", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcher.kt */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<View, Unit> {
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
    public OrderTypeSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(attributeSet, "attrs");
        this.a = kb0.d(this, gy8.switch_delivery);
        this.b = kb0.d(this, gy8.switch_restaurant);
        a(context, attributeSet);
        b();
    }

    private final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, y19.J1, 0, 0);
        try {
            int i2 = y19.M1;
            jx9 jx9Var = jx9.a;
            this.c = obtainStyledAttributes.getDimensionPixelSize(i2, jx9Var.a(12));
            this.d = obtainStyledAttributes.getDimensionPixelSize(y19.K1, jx9Var.a(10));
            this.e = obtainStyledAttributes.getDimensionPixelSize(y19.N1, jx9Var.a(0));
            int i3 = y19.L1;
            int i4 = pv8.b;
            this.f = obtainStyledAttributes.getResourceId(i3, i4);
            this.g = obtainStyledAttributes.getResourceId(y19.O1, i4);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void b() {
        View inflate = LayoutInflater.from(getContext()).inflate(gz8.view_order_type_switcher, (ViewGroup) this, false);
        z65.f(inflate, "null cannot be cast to non-null type com.dodopizza.android.view.custom.SegmentedControl");
        SegmentedControl segmentedControl = (SegmentedControl) inflate;
        segmentedControl.setGroupRadius(this.c);
        segmentedControl.setButtonRadius(this.d);
        segmentedControl.setInnerPadding(this.e);
        segmentedControl.setButtonTextAppearance(this.f);
        segmentedControl.setSelectedButtonTextAppearance(this.g);
        addView(segmentedControl);
    }

    private final RadioButton getDeliveryRadioButton() {
        return (RadioButton) this.a.a(this, i[0]);
    }

    private final RadioButton getRestaurantRadioButton() {
        return (RadioButton) this.b.a(this, i[1]);
    }

    public final void c() {
        getDeliveryRadioButton().setChecked(true);
    }

    public final void d() {
        getRestaurantRadioButton().setChecked(true);
    }

    public final void setDeliveryLabel(SpannableString spannableString) {
        z65.h(spannableString, "text");
        getDeliveryRadioButton().setText(spannableString);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        getDeliveryRadioButton().setEnabled(z);
        getRestaurantRadioButton().setEnabled(z);
    }

    public final void setOnDeliverySelectedListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getDeliveryRadioButton(), new b(function0));
    }

    public final void setOnRestaurantSelectedListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getRestaurantRadioButton(), new c(function0));
    }

    public final void setRestaurantLabel(SpannableString spannableString) {
        z65.h(spannableString, "text");
        getRestaurantRadioButton().setText(spannableString);
    }
}
