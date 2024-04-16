package com.dodopizza.onboarding.feature.chooseordertype.presentation;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TopCropImageView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/TopCropImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class TopCropImageView extends AppCompatImageView {
    public static final a a = new a(null);

    /* compiled from: TopCropImageView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/TopCropImageView$a;", "", "", "ASPECT_RATIO", "F", "<init>", "()V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (getDrawable() == null) {
            return;
        }
        int intrinsicWidth = getDrawable().getIntrinsicWidth();
        int intrinsicHeight = getDrawable().getIntrinsicHeight();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (intrinsicWidth * measuredHeight > measuredWidth * intrinsicHeight) {
            f = measuredHeight / intrinsicHeight;
            f2 = (measuredWidth - (intrinsicWidth * f)) * 0.5f;
        } else {
            f = measuredWidth / intrinsicWidth;
            f2 = 0.0f;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        matrix.postTranslate(f2, 0.0f);
        setImageMatrix(matrix);
    }

    public /* synthetic */ TopCropImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
