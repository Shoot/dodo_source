package com.dodopizza.android.view.custom;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.SegmentedControl;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
/* compiled from: SegmentedControl.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u00015B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b8\u00109J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0001H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\u0012\u0010\u001b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0013J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0013J\u0010\u0010&\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020\u0013J\u0010\u0010'\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020\u0013J\u0016\u0010+\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0013J\u0012\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u001a2\u0006\u0010.\u001a\u00020\u0013H\u0016J\"\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u001a2\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u0013H\u0016J\u001c\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u001a2\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u000e\u00103\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0013R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/dodopizza/android/view/custom/SegmentedControl;", "Landroid/widget/RadioGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "g", Image.TYPE_HIGH, "view", "setupRadioGroup", "Landroid/widget/RadioButton;", "button", "setupButton", "Landroid/graphics/drawable/StateListDrawable;", com.huawei.hms.opendevice.c.a, e.a, "Landroid/content/res/ColorStateList;", "f", "", RemoteMessageConst.Notification.COLOR, "", "cornerRadius", "Landroid/graphics/drawable/Drawable;", DateTokenConverter.CONVERTER_KEY, "i", "Landroid/view/View;", "setupIfRadioButton", "l", "", "enabled", "setEnabled", "radius", "setGroupRadius", "setButtonRadius", "padding", "setInnerPadding", "style", "setButtonTextAppearance", "setSelectedButtonTextAppearance", "", "buttonText", "buttonId", "b", "child", "addView", "index", "width", "height", "Landroid/view/ViewGroup$LayoutParams;", "params", "j", "", "a", "Ljava/util/List;", "designPreviewViews", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SegmentedControl extends RadioGroup {
    public static final a b = new a(null);
    private static final int c = jw8.backgroundUnderlayerColor;
    private static final int d = jw8.q;
    private static final int e = jw8.h;
    private static final int f = jw8.n;
    private static final int g = jw8.o;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private List<? extends View> a;

    /* compiled from: SegmentedControl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/dodopizza/android/view/custom/SegmentedControl$a;", "", "", "BACKGROUND_COLOR", "I", "DEFAULT_BUTTON_RADIUS_DP", "DEFAULT_GROUP_RADIUS_DP", "DEFAULT_INNER_PADDING", "FOREGROUND_COLOR", "FOREGROUND_SELECTION_COLOR", "ITEMS_MARGIN", "TEXT_COLOR_DISABLED", "TEXT_COLOR_ENABLED", "buttonRadius", "buttonTextAppearance", "groupRadius", "innerPadding", "selectedButtonTextAppearance", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<Object, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof RadioButton);
        }
    }

    /* compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<Object, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof RadioButton);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedControl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        List<? extends View> l2;
        List<? extends View> s;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(attributeSet, "attrs");
        setOrientation(0);
        l2 = kc1.l();
        this.a = l2;
        g(context, attributeSet);
        if (isInEditMode()) {
            b("Demo Button 1", 0);
            b("Demo Button 2", 1);
            s = dca.s(dzb.b(this));
            this.a = s;
            j(0);
        }
        h();
        l();
    }

    private final StateListDrawable c(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[0], d(iu1.c(context, c), h));
        return stateListDrawable;
    }

    private final Drawable d(int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(new float[]{f2, f2, f2, f2, f2, f2, f2, f2});
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    private final StateListDrawable e(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int i2 = e;
        stateListDrawable.addState(new int[]{16842912, -16842910}, d(iu1.c(context, i2), i));
        stateListDrawable.addState(new int[]{16842912}, d(iu1.c(context, i2), i));
        int i3 = d;
        stateListDrawable.addState(new int[]{-16842910}, d(iu1.c(context, i3), i));
        stateListDrawable.addState(new int[0], d(iu1.c(context, i3), i));
        return stateListDrawable;
    }

    private final ColorStateList f(Context context) {
        return new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{iu1.c(context, f), iu1.c(context, g)});
    }

    private final void g(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w19.g2, 0, 0);
        try {
            int i2 = w19.j2;
            jx9 jx9Var = jx9.a;
            h = obtainStyledAttributes.getDimensionPixelSize(i2, jx9Var.a(12));
            i = obtainStyledAttributes.getDimensionPixelSize(w19.h2, jx9Var.a(10));
            j = obtainStyledAttributes.getDimensionPixelSize(w19.k2, jx9Var.a(0));
            int i3 = w19.i2;
            int i4 = yv8.d;
            k = obtainStyledAttributes.getResourceId(i3, i4);
            l = obtainStyledAttributes.getResourceId(w19.l2, i4);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void h() {
        Sequence<RadioButton> j2;
        setupRadioGroup(this);
        j2 = dca.j(dzb.b(this), b.a);
        z65.f(j2, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        for (RadioButton radioButton : j2) {
            setupButton(radioButton);
        }
    }

    private final void i() {
        if (isInEditMode()) {
            for (View view : this.a) {
                removeView(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SegmentedControl segmentedControl, RadioGroup radioGroup, int i2) {
        Sequence<RadioButton> j2;
        z65.h(segmentedControl, "this$0");
        z65.e(radioGroup);
        j2 = dca.j(dzb.b(radioGroup), c.a);
        z65.f(j2, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        for (RadioButton radioButton : j2) {
            segmentedControl.setupButton(radioButton);
        }
    }

    private final void l() {
        int i2;
        int i3 = 0;
        for (View view : dzb.b(this)) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kc1.v();
            }
            View view2 = view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                RadioGroup.LayoutParams layoutParams2 = (RadioGroup.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(0);
                if (i3 == getChildCount() - 1) {
                    i2 = 0;
                } else {
                    i2 = 2;
                }
                layoutParams2.setMarginEnd(i2);
                view2.setLayoutParams(layoutParams2);
                i3 = i4;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RadioGroup.LayoutParams");
            }
        }
    }

    private final void setupButton(RadioButton radioButton) {
        int i2;
        Context context = getContext();
        z65.g(context, "getContext(...)");
        radioButton.setBackground(e(context));
        if (radioButton.isChecked()) {
            i2 = l;
        } else {
            i2 = k;
        }
        gdb.a.b(radioButton, i2);
        Context context2 = getContext();
        z65.g(context2, "getContext(...)");
        radioButton.setTextColor(f(context2));
        RadioGroup.LayoutParams layoutParams = null;
        radioButton.setButtonDrawable((Drawable) null);
        radioButton.setGravity(17);
        ViewGroup.LayoutParams layoutParams2 = radioButton.getLayoutParams();
        if (layoutParams2 != null) {
            if (layoutParams2 instanceof RadioGroup.LayoutParams) {
                layoutParams = (RadioGroup.LayoutParams) layoutParams2;
            }
            if (layoutParams != null) {
                layoutParams.weight = 1.0f;
                layoutParams.width = 0;
                layoutParams.height = -1;
                radioButton.setLayoutParams(layoutParams);
            }
        }
        layoutParams = new RadioGroup.LayoutParams(0, -1, 1.0f);
        radioButton.setLayoutParams(layoutParams);
    }

    private final void setupIfRadioButton(View view) {
        RadioButton radioButton;
        if (view != null) {
            if (view instanceof RadioButton) {
                radioButton = (RadioButton) view;
            } else {
                radioButton = null;
            }
            if (radioButton != null) {
                setupButton(radioButton);
                l();
            }
        }
    }

    private final void setupRadioGroup(RadioGroup radioGroup) {
        int i2 = j;
        radioGroup.setPadding(i2, i2, i2, i2);
        Context context = getContext();
        z65.g(context, "getContext(...)");
        radioGroup.setBackground(c(context));
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: e4a
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i3) {
                SegmentedControl.k(SegmentedControl.this, radioGroup2, i3);
            }
        });
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        i();
        setupIfRadioButton(view);
    }

    public final void b(String str, int i2) {
        z65.h(str, "buttonText");
        RadioButton radioButton = new RadioButton(getContext());
        radioButton.setId(i2);
        radioButton.setText(str);
        setupButton(radioButton);
        addView(radioButton);
        l();
    }

    public final void j(int i2) {
        check(i2);
    }

    public final void setButtonRadius(int i2) {
        i = i2;
        h();
    }

    public final void setButtonTextAppearance(int i2) {
        k = i2;
        h();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        for (View view : dzb.b(this)) {
            view.setEnabled(z);
        }
    }

    public final void setGroupRadius(int i2) {
        h = i2;
        h();
    }

    public final void setInnerPadding(int i2) {
        j = i2;
        h();
    }

    public final void setSelectedButtonTextAppearance(int i2) {
        l = i2;
        h();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        super.addView(view, i2);
        i();
        setupIfRadioButton(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, int i3) {
        super.addView(view, i2, i3);
        i();
        setupIfRadioButton(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        i();
        setupIfRadioButton(view);
    }
}
