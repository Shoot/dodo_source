package com.dodopizza.controlling.feature.starsfeedback.presentation;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.starsfeedback.presentation.StarsFeedbackView;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: StarsFeedbackView.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001b\u0010\u001d\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001b\u0010\u001f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010*\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00068"}, d2 = {"Lcom/dodopizza/controlling/feature/starsfeedback/presentation/StarsFeedbackView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "clickedStarIndex", "", DateTokenConverter.CONVERTER_KEY, "targetStarIndex", e.a, "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "enabled", "setStarsTintEnabled", "selectedStarIndex", "setSelectedStar", "Landroid/widget/CheckBox;", "a", "Lk79;", "getStar1", "()Landroid/widget/CheckBox;", "star1", "b", "getStar2", "star2", c.a, "getStar3", "star3", "getStar4", "star4", "getStar5", "star5", "Lkotlin/Function1;", "f", "Lkotlin/jvm/functions/Function1;", "getOnStarClick", "()Lkotlin/jvm/functions/Function1;", "setOnStarClick", "(Lkotlin/jvm/functions/Function1;)V", "onStarClick", "g", "Z", "isEditable", "()Z", "setEditable", "(Z)V", "", "getStars", "()[Landroid/widget/CheckBox;", "stars", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StarsFeedbackView extends ConstraintLayout {
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(StarsFeedbackView.class, "star1", "getStar1()Landroid/widget/CheckBox;", 0)), bc9.f(new ar8(StarsFeedbackView.class, "star2", "getStar2()Landroid/widget/CheckBox;", 0)), bc9.f(new ar8(StarsFeedbackView.class, "star3", "getStar3()Landroid/widget/CheckBox;", 0)), bc9.f(new ar8(StarsFeedbackView.class, "star4", "getStar4()Landroid/widget/CheckBox;", 0)), bc9.f(new ar8(StarsFeedbackView.class, "star5", "getStar5()Landroid/widget/CheckBox;", 0))};
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private Function1<? super Integer, Unit> f;
    private boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarsFeedbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = kb0.d(this, zx8.stars_feedback_1);
        this.b = kb0.d(this, zx8.stars_feedback_2);
        this.c = kb0.d(this, zx8.stars_feedback_3);
        this.d = kb0.d(this, zx8.stars_feedback_4);
        this.e = kb0.d(this, zx8.stars_feedback_5);
        this.g = true;
        View.inflate(getContext(), wz8.layout_stars_feedback, this);
        CheckBox[] stars = getStars();
        int length = stars.length;
        for (final int i = 0; i < length; i++) {
            stars[i].setOnClickListener(new View.OnClickListener() { // from class: pta
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarsFeedbackView.c(StarsFeedbackView.this, i, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(StarsFeedbackView starsFeedbackView, int i, View view) {
        z65.h(starsFeedbackView, "this$0");
        starsFeedbackView.d(i);
    }

    private final void d(int i) {
        e(i);
        Function1<? super Integer, Unit> function1 = this.f;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    private final void e(int i) {
        boolean z;
        CheckBox[] stars = getStars();
        int length = stars.length;
        for (int i2 = 0; i2 < length; i2++) {
            CheckBox checkBox = stars[i2];
            if (i2 <= i) {
                z = true;
            } else {
                z = false;
            }
            checkBox.setChecked(z);
        }
    }

    private final CheckBox getStar1() {
        return (CheckBox) this.a.a(this, h[0]);
    }

    private final CheckBox getStar2() {
        return (CheckBox) this.b.a(this, h[1]);
    }

    private final CheckBox getStar3() {
        return (CheckBox) this.c.a(this, h[2]);
    }

    private final CheckBox getStar4() {
        return (CheckBox) this.d.a(this, h[3]);
    }

    private final CheckBox getStar5() {
        return (CheckBox) this.e.a(this, h[4]);
    }

    private final CheckBox[] getStars() {
        return new CheckBox[]{getStar1(), getStar2(), getStar3(), getStar4(), getStar5()};
    }

    public final Function1<Integer, Unit> getOnStarClick() {
        return this.f;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.g && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void setEditable(boolean z) {
        this.g = z;
    }

    public final void setOnStarClick(Function1<? super Integer, Unit> function1) {
        this.f = function1;
    }

    public final void setSelectedStar(int i) {
        e(i);
    }

    public final void setStarsTintEnabled(boolean z) {
        CheckBox[] stars;
        PorterDuff.Mode mode;
        for (CheckBox checkBox : getStars()) {
            if (z) {
                mode = PorterDuff.Mode.SRC_IN;
            } else {
                mode = PorterDuff.Mode.DST;
            }
            checkBox.setButtonTintMode(mode);
        }
    }
}
