package com.dodopizza.android.view.custom.doubleimageview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.doubleimageview.DoubleImageView;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: DoubleImageView.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b+\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\bR\u001b\u0010\u001d\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001b\u0010%\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0018\u0010(\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u00060"}, d2 = {"Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "Landroid/widget/FrameLayout;", "Lu67;", c.a, "", "b", "Landroid/view/View;", "view", "", "isRight", DateTokenConverter.CONVERTER_KEY, "", "offset", "k", "hasOffset", "setHasOffset", "Landroid/graphics/drawable/Drawable;", "drawable", "i", "f", Image.TYPE_HIGH, "g", "isSingleMode", "j", "Landroid/widget/ImageView;", "a", "Lk79;", "getSingleImageView", "()Landroid/widget/ImageView;", "singleImageView", "Landroid/view/ViewGroup;", "getDoubleImageContainer", "()Landroid/view/ViewGroup;", "doubleImageContainer", "getFirstImageView", "firstImageView", "getSecondImageView", "secondImageView", e.a, "Lu67;", "offsetCalculator", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DoubleImageView extends FrameLayout {
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(DoubleImageView.class, "singleImageView", "getSingleImageView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(DoubleImageView.class, "doubleImageContainer", "getDoubleImageContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(DoubleImageView.class, "firstImageView", "getFirstImageView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(DoubleImageView.class, "secondImageView", "getSecondImageView()Landroid/widget/ImageView;", 0))};
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    private u67 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleImageView(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        LayoutInflater.from(getContext()).inflate(sz8.composite_image_view_layout, this);
        this.a = kb0.d(this, vx8.base_image);
        this.b = kb0.d(this, vx8.double_image_content);
        this.c = kb0.d(this, vx8.first_image);
        this.d = kb0.d(this, vx8.second_image);
    }

    private final void b() {
        d(getFirstImageView(), false);
        d(getSecondImageView(), true);
    }

    private final u67 c() {
        u67 u67Var = this.e;
        if (u67Var == null) {
            u67Var = new vx();
        }
        this.e = u67Var;
        return u67Var;
    }

    private final void d(final View view, final boolean z) {
        if (getMeasuredWidth() == 0) {
            new Handler().post(new Runnable() { // from class: v63
                @Override // java.lang.Runnable
                public final void run() {
                    DoubleImageView.e(DoubleImageView.this, view, z);
                }
            });
        }
        float a = c().a(this, z);
        if (!z) {
            a = -a;
        }
        k(view, a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DoubleImageView doubleImageView, View view, boolean z) {
        z65.h(doubleImageView, "this$0");
        z65.h(view, "$view");
        doubleImageView.d(view, z);
    }

    private final ViewGroup getDoubleImageContainer() {
        return (ViewGroup) this.b.a(this, f[1]);
    }

    private final ImageView getFirstImageView() {
        return (ImageView) this.c.a(this, f[2]);
    }

    private final ImageView getSecondImageView() {
        return (ImageView) this.d.a(this, f[3]);
    }

    private final void k(View view, float f2) {
        ViewParent parent = view.getParent();
        z65.f(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setTranslationX(f2);
        view.setTranslationX(-f2);
    }

    public final void f(Drawable drawable) {
        z65.h(drawable, "drawable");
        j(false);
        getFirstImageView().setImageDrawable(drawable);
    }

    public final void g(Drawable drawable) {
        z65.h(drawable, "drawable");
        j(true);
        getSingleImageView().setImageDrawable(drawable);
    }

    public final ImageView getSingleImageView() {
        return (ImageView) this.a.a(this, f[0]);
    }

    public final void h(Drawable drawable) {
        z65.h(drawable, "drawable");
        j(false);
        getSecondImageView().setImageDrawable(drawable);
    }

    public final void i(Drawable drawable) {
        z65.h(drawable, "drawable");
        j(true);
        getSingleImageView().setImageDrawable(drawable);
    }

    public final void j(boolean z) {
        un3.o(getDoubleImageContainer(), !z);
        un3.o(getSingleImageView(), z);
        if (!z) {
            b();
        }
    }

    public final void setHasOffset(boolean z) {
        u67 s3bVar;
        if (z) {
            s3bVar = new vx();
        } else if (!z) {
            s3bVar = new s3b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.e = s3bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        LayoutInflater.from(getContext()).inflate(sz8.composite_image_view_layout, this);
        this.a = kb0.d(this, vx8.base_image);
        this.b = kb0.d(this, vx8.double_image_content);
        this.c = kb0.d(this, vx8.first_image);
        this.d = kb0.d(this, vx8.second_image);
    }
}
