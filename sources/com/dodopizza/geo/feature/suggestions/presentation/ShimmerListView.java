package com.dodopizza.geo.feature.suggestions.presentation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: ShimmerListView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\f\u0010\u000b\u001a\u00020\u0004*\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001c\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\n\u0010\r\u0012\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/ShimmerListView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "titleTop", "titleWidth", "", com.huawei.hms.opendevice.c.a, "descriptionWidth", "b", "a", "onDraw", "I", "numItems", "getContentColor$annotations", "()V", "contentColor", "cornerRadius", DateTokenConverter.CONVERTER_KEY, "itemHeight", com.huawei.hms.push.e.a, "titleHeight", "f", "descriptionHeight", "g", "titleAndDescriptionPadding", Image.TYPE_HIGH, "itemPadding", "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", "paint", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ShimmerListView extends View {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final Paint i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.b = Color.parseColor("#E0E0E0");
        this.i = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w19.t2);
        z65.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.a = obtainStyledAttributes.getInt(w19.z2, this.a);
        this.b = obtainStyledAttributes.getColor(w19.u2, this.b);
        this.c = obtainStyledAttributes.getDimensionPixelSize(w19.v2, this.c);
        this.d = obtainStyledAttributes.getDimensionPixelSize(w19.x2, this.d);
        this.e = obtainStyledAttributes.getDimensionPixelSize(w19.B2, this.e);
        this.f = obtainStyledAttributes.getDimensionPixelSize(w19.w2, this.f);
        this.g = obtainStyledAttributes.getDimensionPixelSize(w19.A2, this.g);
        this.h = obtainStyledAttributes.getDimensionPixelSize(w19.y2, this.h);
        obtainStyledAttributes.recycle();
    }

    private final int a(int i) {
        return Math.round(kx9.a(i) * (Resources.getSystem().getDisplayMetrics().densityDpi / ((float) SyslogConstants.LOG_LOCAL4)));
    }

    private final void b(Canvas canvas, int i, int i2) {
        float a = a(getPaddingStart());
        int i3 = this.e;
        int i4 = this.g;
        canvas.drawRoundRect(a, i + i3 + i4, i2, i + i3 + this.f + i4, a(this.c), a(this.c), this.i);
    }

    private final void c(Canvas canvas, int i, int i2) {
        canvas.drawRoundRect(a(getPaddingStart()), i, i2, i + this.e, a(this.c), a(this.c), this.i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        z65.h(canvas, "canvas");
        super.onDraw(canvas);
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.d;
            int i4 = ((this.h + i3) * i2) + (((i3 - this.e) - this.f) / 2);
            int width = getWidth() / 2;
            int paddingStart = (width / 2) + getPaddingStart();
            this.i.setColor(this.b);
            c(canvas, i4, width);
            b(canvas, i4, paddingStart);
        }
    }

    private static /* synthetic */ void getContentColor$annotations() {
    }
}
