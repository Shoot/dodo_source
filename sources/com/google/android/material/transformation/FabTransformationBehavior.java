package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.g81;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect c;
    private final RectF d;
    private final RectF e;
    private final int[] f;
    private float g;
    private float h;

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ View b;
        final /* synthetic */ View c;

        a(boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                this.b.setVisibility(4);
                this.c.setAlpha(1.0f);
                this.c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {
        final /* synthetic */ g81 a;
        final /* synthetic */ Drawable b;

        c(g81 g81Var, Drawable drawable) {
            this.a = g81Var;
            this.b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        final /* synthetic */ g81 a;

        d(g81 g81Var) {
            this.a = g81Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g81.e revealInfo = this.a.getRevealInfo();
            revealInfo.c = Float.MAX_VALUE;
            this.a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class e {
        public bp6 a;
        public yf8 b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    private ViewGroup B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    private ViewGroup g(@NonNull View view) {
        View findViewById = view.findViewById(ky8.mtrl_child_content_container);
        if (findViewById != null) {
            return B(findViewById);
        }
        if (!(view instanceof wkb) && !(view instanceof vkb)) {
            return B(view);
        }
        return B(((ViewGroup) view).getChildAt(0));
    }

    private void h(@NonNull View view, @NonNull e eVar, @NonNull cp6 cp6Var, @NonNull cp6 cp6Var2, float f, float f2, float f3, float f4, @NonNull RectF rectF) {
        float o = o(eVar, cp6Var, f, f3);
        float o2 = o(eVar, cp6Var2, f2, f4);
        Rect rect = this.c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.d;
        rectF2.set(rect);
        RectF rectF3 = this.e;
        p(view, rectF3);
        rectF3.offset(o, o2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void i(@NonNull View view, @NonNull RectF rectF) {
        p(view, rectF);
        rectF.offset(this.g, this.h);
    }

    @NonNull
    private Pair<cp6, cp6> j(float f, float f2, boolean z, @NonNull e eVar) {
        cp6 e2;
        cp6 e3;
        int i;
        if (f != 0.0f && f2 != 0.0f) {
            if ((z && f2 < 0.0f) || (!z && i > 0)) {
                e2 = eVar.a.e("translationXCurveUpwards");
                e3 = eVar.a.e("translationYCurveUpwards");
            } else {
                e2 = eVar.a.e("translationXCurveDownwards");
                e3 = eVar.a.e("translationYCurveDownwards");
            }
        } else {
            e2 = eVar.a.e("translationXLinear");
            e3 = eVar.a.e("translationYLinear");
        }
        return new Pair<>(e2, e3);
    }

    private float k(@NonNull View view, @NonNull View view2, @NonNull yf8 yf8Var) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        rectF2.offset(-m(view, view2, yf8Var), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float l(@NonNull View view, @NonNull View view2, @NonNull yf8 yf8Var) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        rectF2.offset(0.0f, -n(view, view2, yf8Var));
        return rectF.centerY() - rectF2.top;
    }

    private float m(@NonNull View view, @NonNull View view2, @NonNull yf8 yf8Var) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        int i = yf8Var.a & 7;
        if (i != 1) {
            if (i != 3) {
                if (i != 5) {
                    f = 0.0f;
                    return f + yf8Var.b;
                }
                centerX = rectF2.right;
                centerX2 = rectF.right;
            } else {
                centerX = rectF2.left;
                centerX2 = rectF.left;
            }
        } else {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        }
        f = centerX - centerX2;
        return f + yf8Var.b;
    }

    private float n(@NonNull View view, @NonNull View view2, @NonNull yf8 yf8Var) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        int i = yf8Var.a & 112;
        if (i != 16) {
            if (i != 48) {
                if (i != 80) {
                    f = 0.0f;
                    return f + yf8Var.c;
                }
                centerY = rectF2.bottom;
                centerY2 = rectF.bottom;
            } else {
                centerY = rectF2.top;
                centerY2 = rectF.top;
            }
        } else {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        }
        f = centerY - centerY2;
        return f + yf8Var.c;
    }

    private float o(@NonNull e eVar, @NonNull cp6 cp6Var, float f, float f2) {
        long c2 = cp6Var.c();
        long d2 = cp6Var.d();
        cp6 e2 = eVar.a.e("expansion");
        return sk.a(f, f2, cp6Var.e().getInterpolation(((float) (((e2.c() + e2.d()) + 17) - c2)) / ((float) d2)));
    }

    private void p(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void q(View view, View view2, boolean z, boolean z2, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup g;
        ObjectAnimator ofFloat;
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (((view2 instanceof g81) && f81.a == 0) || (g = g(view2)) == null) {
            return;
        }
        if (z) {
            if (!z2) {
                b71.a.set(g, Float.valueOf(0.0f));
            }
            ofFloat = ObjectAnimator.ofFloat(g, b71.a, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(g, b71.a, 0.0f);
        }
        eVar.a.e("contentFade").a(ofFloat);
        list.add(ofFloat);
    }

    private void r(@NonNull View view, View view2, boolean z, boolean z2, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (!(view2 instanceof g81)) {
            return;
        }
        g81 g81Var = (g81) view2;
        int z3 = z(view);
        int i = 16777215 & z3;
        if (z) {
            if (!z2) {
                g81Var.setCircularRevealScrimColor(z3);
            }
            ofInt = ObjectAnimator.ofInt(g81Var, g81.d.a, i);
        } else {
            ofInt = ObjectAnimator.ofInt(g81Var, g81.d.a, z3);
        }
        ofInt.setEvaluator(yq.b());
        eVar.a.e(RemoteMessageConst.Notification.COLOR).a(ofInt);
        list.add(ofInt);
    }

    private void s(@NonNull View view, @NonNull View view2, boolean z, @NonNull e eVar, @NonNull List<Animator> list) {
        float m = m(view, view2, eVar.b);
        float n = n(view, view2, eVar.b);
        Pair<cp6, cp6> j = j(m, n, z, eVar);
        cp6 cp6Var = (cp6) j.first;
        cp6 cp6Var2 = (cp6) j.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m = this.g;
        }
        fArr[0] = m;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            n = this.h;
        }
        fArr2[0] = n;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        cp6Var.a(ofFloat);
        cp6Var2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void t(View view, @NonNull View view2, boolean z, boolean z2, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float y = syb.y(view2) - syb.y(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-y);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -y);
        }
        eVar.a.e("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    private void u(@NonNull View view, View view2, boolean z, boolean z2, @NonNull e eVar, float f, float f2, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (!(view2 instanceof g81)) {
            return;
        }
        g81 g81Var = (g81) view2;
        float k = k(view, view2, eVar.b);
        float l = l(view, view2, eVar.b);
        ((FloatingActionButton) view).i(this.c);
        float width = this.c.width() / 2.0f;
        cp6 e2 = eVar.a.e("expansion");
        if (z) {
            if (!z2) {
                g81Var.setRevealInfo(new g81.e(k, l, width));
            }
            if (z2) {
                width = g81Var.getRevealInfo().c;
            }
            animator = d81.a(g81Var, k, l, ma6.b(k, l, 0.0f, 0.0f, f, f2));
            animator.addListener(new d(g81Var));
            x(view2, e2.c(), (int) k, (int) l, width, list);
        } else {
            float f3 = g81Var.getRevealInfo().c;
            Animator a2 = d81.a(g81Var, k, l, width);
            int i = (int) k;
            int i2 = (int) l;
            x(view2, e2.c(), i, i2, f3, list);
            w(view2, e2.c(), e2.d(), eVar.a.f(), i, i2, width, list);
            animator = a2;
        }
        e2.a(animator);
        list.add(animator);
        list2.add(d81.b(g81Var));
    }

    private void v(View view, View view2, boolean z, boolean z2, @NonNull e eVar, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof g81) && (view instanceof ImageView)) {
            g81 g81Var = (g81) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, d83.b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, d83.b, 255);
            }
            ofInt.addUpdateListener(new b(view2));
            eVar.a.e("iconFade").a(ofInt);
            list.add(ofInt);
            list2.add(new c(g81Var, drawable));
        }
    }

    private void w(View view, long j, long j2, long j3, int i, int i2, float f, @NonNull List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    private void x(View view, long j, int i, int i2, float f, @NonNull List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private void y(@NonNull View view, @NonNull View view2, boolean z, boolean z2, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m = m(view, view2, eVar.b);
        float n = n(view, view2, eVar.b);
        Pair<cp6, cp6> j = j(m, n, z, eVar);
        cp6 cp6Var = (cp6) j.first;
        cp6 cp6Var2 = (cp6) j.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m);
                view2.setTranslationY(-n);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            h(view2, eVar, cp6Var, cp6Var2, -m, -n, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -m);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -n);
        }
        cp6Var.a(ofFloat);
        cp6Var2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private int z(@NonNull View view) {
        ColorStateList u = syb.u(view);
        if (u != null) {
            return u.getColorForState(view.getDrawableState(), u.getDefaultColor());
        }
        return 0;
    }

    protected abstract e A(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    protected AnimatorSet f(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        e A = A(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        t(view, view2, z, z2, A, arrayList, arrayList2);
        RectF rectF = this.d;
        y(view, view2, z, z2, A, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        s(view, view2, z, A, arrayList);
        v(view, view2, z, z2, A, arrayList, arrayList2);
        u(view, view2, z, z2, A, width, height, arrayList, arrayList2);
        r(view, view2, z, z2, A, arrayList, arrayList2);
        q(view, view2, z, z2, A, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        yk.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
