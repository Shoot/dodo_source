package com.dodopizza.android.view.custom.badgebackgroundtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BadgeBackgroundTextView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010!¨\u0006&"}, d2 = {"Lcom/dodopizza/android/view/custom/badgebackgroundtextview/BadgeBackgroundTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "g", c.a, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", Image.TYPE_HIGH, "", RemoteMessageConst.Notification.COLOR, e.a, "i", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "activated", "setActivated", "Landroid/graphics/RectF;", "a", "Landroid/graphics/RectF;", "badgeRect", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "badgePaint", "I", "badgeColor", DateTokenConverter.CONVERTER_KEY, "badgeInactiveColor", "", "F", "badgeAngle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "f", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BadgeBackgroundTextView extends AppCompatTextView {
    public static final a f = new a(null);
    private RectF a;
    private final Paint b;
    private int c;
    private int d;
    private float e;

    /* compiled from: BadgeBackgroundTextView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/android/view/custom/badgebackgroundtextview/BadgeBackgroundTextView$a;", "", "", "DEFAULT_ANGLE", "I", "DEFAULT_COLOR", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeBackgroundTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(attributeSet, "attributeSet");
        this.a = new RectF();
        this.b = new Paint();
        h(context, attributeSet);
    }

    private final void c() {
        e(this.c);
        invalidate();
    }

    private final void e(int i) {
        this.b.setColor(i);
    }

    private final void g() {
        e(this.d);
        invalidate();
    }

    private final void h(Context context, AttributeSet attributeSet) {
        i(context, attributeSet);
        this.b.setAntiAlias(true);
        e(this.c);
    }

    private final void i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w19.u, 0, 0);
        try {
            this.e = obtainStyledAttributes.getInt(w19.v, 0);
            this.c = obtainStyledAttributes.getColor(w19.w, 0);
            this.d = obtainStyledAttributes.getColor(w19.x, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        float f2;
        z65.h(canvas, "canvas");
        canvas.save();
        if (getParent().getLayoutDirection() == 1) {
            f2 = -this.e;
        } else {
            f2 = this.e;
        }
        float f3 = 2;
        canvas.rotate(f2, getMeasuredWidth() / f3, getMeasuredHeight() / f3);
        this.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float measuredHeight = getMeasuredHeight() / 2;
        canvas.drawRoundRect(this.a, measuredHeight, measuredHeight, this.b);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        super.setActivated(z);
        if (z) {
            c();
        } else {
            g();
        }
    }
}
