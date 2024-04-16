package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.b;
import java.util.Arrays;
/* compiled from: BaseProgressIndicator.java */
/* loaded from: classes2.dex */
public abstract class a<S extends com.google.android.material.progressindicator.b> extends ProgressBar {
    static final int o = i19.Widget_MaterialComponents_ProgressIndicator;
    S a;
    private int b;
    private boolean c;
    private boolean d;
    private final int e;
    private final int f;
    private long g;
    wk h;
    private boolean i;
    private int j;
    private final Runnable k;
    private final Runnable l;
    private final nj m;
    private final nj n;

    /* compiled from: BaseProgressIndicator.java */
    /* renamed from: com.google.android.material.progressindicator.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0232a implements Runnable {
        RunnableC0232a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k();
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.j();
            a.this.g = -1L;
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes2.dex */
    class c extends nj {
        c() {
        }

        @Override // defpackage.nj
        public void a(Drawable drawable) {
            a.this.setIndeterminate(false);
            a aVar = a.this;
            aVar.o(aVar.b, a.this.c);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes2.dex */
    class d extends nj {
        d() {
        }

        @Override // defpackage.nj
        public void a(Drawable drawable) {
            super.a(drawable);
            if (!a.this.i) {
                a aVar = a.this;
                aVar.setVisibility(aVar.j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(ia6.c(context, attributeSet, i, o), attributeSet, i);
        this.g = -1L;
        this.i = false;
        this.j = 4;
        this.k = new RunnableC0232a();
        this.l = new b();
        this.m = new c();
        this.n = new d();
        Context context2 = getContext();
        this.a = i(context2, attributeSet);
        TypedArray h = sdb.h(context2, attributeSet, b29.Q, i, i2, new int[0]);
        this.e = h.getInt(b29.V, -1);
        this.f = Math.min(h.getInt(b29.T, -1), 1000);
        h.recycle();
        this.h = new wk();
        this.d = true;
    }

    private e<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().u();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ((com.google.android.material.progressindicator.d) getCurrentDrawable()).p(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f > 0) {
            this.g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean m() {
        if ((getProgressDrawable() != null && getProgressDrawable().isVisible()) || (getIndeterminateDrawable() != null && getIndeterminateDrawable().isVisible())) {
            return false;
        }
        return true;
    }

    private void n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().t().d(this.m);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().l(this.n);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().l(this.n);
        }
    }

    private void p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().r(this.n);
            getIndeterminateDrawable().t().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().r(this.n);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.a.c;
    }

    public int getShowAnimationBehavior() {
        return this.a.e;
    }

    public int getTrackColor() {
        return this.a.d;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    protected void h(boolean z) {
        if (!this.d) {
            return;
        }
        ((com.google.android.material.progressindicator.d) getCurrentDrawable()).p(q(), false, z);
    }

    abstract S i(@NonNull Context context, @NonNull AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    boolean l() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
                return true;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    public void o(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.b = i;
                this.c = z;
                this.i = true;
                if (getIndeterminateDrawable().isVisible() && this.h.a(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().t().f();
                    return;
                } else {
                    this.m.a(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() != null && !z) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (q()) {
            k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.l);
        removeCallbacks(this.k);
        ((com.google.android.material.progressindicator.d) getCurrentDrawable()).h();
        p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(@NonNull Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        try {
            super.onMeasure(i, i2);
            e<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            int e = currentDrawingDelegate.e();
            int d2 = currentDrawingDelegate.d();
            if (e < 0) {
                paddingLeft = getMeasuredWidth();
            } else {
                paddingLeft = e + getPaddingLeft() + getPaddingRight();
            }
            if (d2 < 0) {
                paddingTop = getMeasuredHeight();
            } else {
                paddingTop = d2 + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(paddingLeft, paddingTop);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        h(z);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        h(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        if (syb.X(this) && getWindowVisibility() == 0 && l()) {
            return true;
        }
        return false;
    }

    public void setAnimatorDurationScaleProvider(@NonNull wk wkVar) {
        this.h = wkVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = wkVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = wkVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            com.google.android.material.progressindicator.d dVar = (com.google.android.material.progressindicator.d) getCurrentDrawable();
            if (dVar != null) {
                dVar.h();
            }
            super.setIndeterminate(z);
            com.google.android.material.progressindicator.d dVar2 = (com.google.android.material.progressindicator.d) getCurrentDrawable();
            if (dVar2 != null) {
                dVar2.p(q(), false, false);
            }
            if ((dVar2 instanceof g) && q()) {
                ((g) dVar2).t().g();
            }
            this.i = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof g) {
            ((com.google.android.material.progressindicator.d) drawable).h();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{ba6.b(getContext(), qv8.o, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.a.c = iArr;
            getIndeterminateDrawable().t().c();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        o(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof com.google.android.material.progressindicator.c) {
            com.google.android.material.progressindicator.c cVar = (com.google.android.material.progressindicator.c) drawable;
            cVar.h();
            super.setProgressDrawable(cVar);
            cVar.z(getProgress() / getMax());
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.a.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.a;
        if (s.d != i) {
            s.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.a;
        if (s.b != i) {
            s.b = Math.min(i, s.a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.a;
        if (s.a != i) {
            s.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.j = i;
    }

    @Override // android.widget.ProgressBar
    public g<S> getIndeterminateDrawable() {
        return (g) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public com.google.android.material.progressindicator.c<S> getProgressDrawable() {
        return (com.google.android.material.progressindicator.c) super.getProgressDrawable();
    }
}
