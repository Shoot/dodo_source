package com.dodopizza.controlling.feature.binaryfeedback.presentation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.chip.Chip;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BinaryFeedbackView.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010'\u001a\u00020%¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0014R0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView;", "Landroid/widget/LinearLayout;", "Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c$b;", "selectedButton", "", "b", "Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c;", "state", "setButtonsState", "", "enabled", "setSelectionEnabled", "Landroid/view/View;", "a", "Lk79;", "getButtonsSpacing", "()Landroid/view/View;", "buttonsSpacing", "Lcom/google/android/material/chip/Chip;", "getPositiveButtonChip", "()Lcom/google/android/material/chip/Chip;", "positiveButtonChip", com.huawei.hms.opendevice.c.a, "getNegativeButtonChip", "negativeButtonChip", "Lkotlin/Function1;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "getButtonsClickListener", "()Lkotlin/jvm/functions/Function1;", "setButtonsClickListener", "(Lkotlin/jvm/functions/Function1;)V", "buttonsClickListener", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BinaryFeedbackView extends LinearLayout {
    static final /* synthetic */ je5<Object>[] e = {bc9.f(new ar8(BinaryFeedbackView.class, "buttonsSpacing", "getButtonsSpacing()Landroid/view/View;", 0)), bc9.f(new ar8(BinaryFeedbackView.class, "positiveButtonChip", "getPositiveButtonChip()Lcom/google/android/material/chip/Chip;", 0)), bc9.f(new ar8(BinaryFeedbackView.class, "negativeButtonChip", "getNegativeButtonChip()Lcom/google/android/material/chip/Chip;", 0))};
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private Function1<? super c.b, Unit> d;

    /* compiled from: BinaryFeedbackView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        a() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            BinaryFeedbackView.this.b(c.b.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: BinaryFeedbackView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            BinaryFeedbackView.this.b(c.b.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: BinaryFeedbackView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c;", "", "a", "b", "Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c$a;", "Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c$b;", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface c {

        /* compiled from: BinaryFeedbackView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c$a;", "Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes.dex */
        public static final class a implements c {
            public static final a a = new a();

            private a() {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BinaryFeedbackView.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c$b;", "", "Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c;", "<init>", "(Ljava/lang/String;I)V", "a", "b", "controlling_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes.dex */
        public static final class b implements c {
            public static final b a = new b("POSITIVE", 0);
            public static final b b = new b("NEGATIVE", 1);
            private static final /* synthetic */ b[] c;
            private static final /* synthetic */ kj3 d;

            static {
                b[] a2 = a();
                c = a2;
                d = lj3.a(a2);
            }

            private b(String str, int i) {
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{a, b};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) c.clone();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinaryFeedbackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(c.b bVar) {
        setButtonsState(bVar);
        Function1<? super c.b, Unit> function1 = this.d;
        if (function1 != null) {
            function1.invoke(bVar);
        }
    }

    private final View getButtonsSpacing() {
        return (View) this.a.a(this, e[0]);
    }

    private final Chip getNegativeButtonChip() {
        return (Chip) this.c.a(this, e[2]);
    }

    private final Chip getPositiveButtonChip() {
        return (Chip) this.b.a(this, e[1]);
    }

    public final Function1<c.b, Unit> getButtonsClickListener() {
        return this.d;
    }

    public final void setButtonsClickListener(Function1<? super c.b, Unit> function1) {
        this.d = function1;
    }

    public final void setButtonsState(c cVar) {
        boolean z;
        z65.h(cVar, "state");
        Chip positiveButtonChip = getPositiveButtonChip();
        boolean z2 = false;
        if (cVar == c.b.a) {
            z = true;
        } else {
            z = false;
        }
        positiveButtonChip.setChecked(z);
        Chip negativeButtonChip = getNegativeButtonChip();
        if (cVar == c.b.b) {
            z2 = true;
        }
        negativeButtonChip.setChecked(z2);
    }

    public final void setSelectionEnabled(boolean z) {
        getPositiveButtonChip().setClickable(z);
        getNegativeButtonChip().setClickable(z);
    }

    public /* synthetic */ BinaryFeedbackView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryFeedbackView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = kb0.d(this, zx8.binary_feedback_buttons_spacing);
        this.b = kb0.d(this, zx8.binary_feedback_positive_button);
        this.c = kb0.d(this, zx8.binary_feedback_negative_button);
        setOrientation(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x19.x, i, i2);
        z65.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(x19.y, 0);
        obtainStyledAttributes.recycle();
        View.inflate(context, wz8.layout_binary_feedback, this);
        View buttonsSpacing = getButtonsSpacing();
        ViewGroup.LayoutParams layoutParams = getButtonsSpacing().getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        buttonsSpacing.setLayoutParams(layoutParams);
        oma.a(getPositiveButtonChip(), new a());
        oma.a(getNegativeButtonChip(), new b());
    }
}
