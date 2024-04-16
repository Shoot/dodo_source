package defpackage;

import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.compositeprogressbar.drawable.TargetAnimationObject;
import kotlin.Metadata;
/* compiled from: InfiniteProgressDrawable.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J \u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Lx05;", "Lcp8;", "Landroid/graphics/drawable/Animatable;", "Lcom/dodopizza/android/view/custom/compositeprogressbar/drawable/TargetAnimationObject;", "targetObject", "", "width", "height", "", "p", "", "o", "Landroid/graphics/Canvas;", "canvas", DateTokenConverter.CONVERTER_KEY, "draw", "isRunning", "start", "stop", "", "Landroid/animation/Animator;", "[Landroid/animation/Animator;", "animators", "q", "Lcom/dodopizza/android/view/custom/compositeprogressbar/drawable/TargetAnimationObject;", "react1TargetObject", "r", "react2TargetObject", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x05  reason: default package */
/* loaded from: classes.dex */
public final class x05 extends cp8 implements Animatable {
    private Animator[] p;
    private TargetAnimationObject q = new TargetAnimationObject(0.0f, 0.0f, 3, null);
    private TargetAnimationObject r = new TargetAnimationObject(0.0f, 0.0f, 3, null);

    public x05() {
        vk vkVar = vk.a;
        this.p = new Animator[]{vkVar.a(this.q), vkVar.b(this.r)};
    }

    private final boolean o() {
        Animator animator;
        Animator[] animatorArr = this.p;
        int length = animatorArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                animator = animatorArr[i];
                if (animator.isStarted()) {
                    break;
                }
                i++;
            } else {
                animator = null;
                break;
            }
        }
        if (animator == null) {
            return false;
        }
        return true;
    }

    private final void p(TargetAnimationObject targetAnimationObject, int i, int i2) {
        float f = i;
        float f2 = f / 360.0f;
        float translate = (targetAnimationObject.getTranslate() + 180.0f) * f2;
        float translate2 = (targetAnimationObject.getTranslate() + (targetAnimationObject.getScale() * 360.0f) + 180.0f) * f2;
        if (f83.f(this) == 0) {
            i().set(translate, 0.0f, translate2, i2);
        } else {
            i().set(f - translate, 0.0f, f - translate2, i2);
        }
    }

    @Override // defpackage.cp8, defpackage.f80
    public void d(Canvas canvas, int i, int i2) {
        z65.h(canvas, "canvas");
        a().setColor(g());
        b().setColor(h());
        j(i, i2);
        e(canvas);
        p(this.q, i, i2);
        f(canvas);
        p(this.r, i, i2);
        f(canvas);
    }

    @Override // defpackage.f80, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        z65.h(canvas, "canvas");
        super.draw(canvas);
        if (o()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Animator animator;
        Animator[] animatorArr = this.p;
        int length = animatorArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                animator = animatorArr[i];
                if (animator.isRunning()) {
                    break;
                }
                i++;
            } else {
                animator = null;
                break;
            }
        }
        if (animator == null) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (o()) {
            return;
        }
        for (Animator animator : this.p) {
            animator.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        for (Animator animator : this.p) {
            animator.end();
        }
    }
}
