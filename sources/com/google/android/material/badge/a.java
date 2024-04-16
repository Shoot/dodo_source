package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.badge.BadgeState;
import defpackage.tab;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.slf4j.Marker;
/* compiled from: BadgeDrawable.java */
/* loaded from: classes2.dex */
public class a extends Drawable implements tab.b {
    private static final int n = i19.Widget_MaterialComponents_Badge;
    private static final int o = qv8.badgeStyle;
    @NonNull
    private final WeakReference<Context> a;
    @NonNull
    private final fa6 b;
    @NonNull
    private final tab c;
    @NonNull
    private final Rect d;
    @NonNull
    private final BadgeState e;
    private float f;
    private float g;
    private int h;
    private float i;
    private float j;
    private float k;
    private WeakReference<View> l;
    private WeakReference<FrameLayout> m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDrawable.java */
    /* renamed from: com.google.android.material.badge.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0223a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ FrameLayout b;

        RunnableC0223a(View view, FrameLayout frameLayout) {
            this.a = view;
            this.b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.N(this.a, this.b);
        }
    }

    private a(@NonNull Context context, int i, int i2, int i3, BadgeState.State state) {
        this.a = new WeakReference<>(context);
        sdb.c(context);
        this.d = new Rect();
        this.b = new fa6();
        tab tabVar = new tab(this);
        this.c = tabVar;
        tabVar.e().setTextAlign(Paint.Align.CENTER);
        G(i19.TextAppearance_MaterialComponents_Badge);
        this.e = new BadgeState(context, i, i2, i3, state);
        y();
    }

    private void F(fab fabVar) {
        Context context;
        if (this.c.d() == fabVar || (context = this.a.get()) == null) {
            return;
        }
        this.c.h(fabVar, context);
        O();
    }

    private void G(int i) {
        Context context = this.a.get();
        if (context == null) {
            return;
        }
        F(new fab(context, i));
    }

    private void L(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != ky8.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.m;
            if (weakReference != null && weakReference.get() == viewGroup) {
                return;
            }
            M(view);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(ky8.mtrl_anchor_parent);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(view.getLayoutParams());
            frameLayout.setMinimumWidth(view.getWidth());
            frameLayout.setMinimumHeight(view.getHeight());
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(view);
            viewGroup.addView(frameLayout, indexOfChild);
            this.m = new WeakReference<>(frameLayout);
            frameLayout.post(new RunnableC0223a(view, frameLayout));
        }
    }

    private static void M(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void O() {
        View view;
        Context context = this.a.get();
        WeakReference<View> weakReference = this.l;
        FrameLayout frameLayout = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.d);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.m;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null || b.a) {
                if (frameLayout == null) {
                    frameLayout = (ViewGroup) view.getParent();
                }
                frameLayout.offsetDescendantRectToMyCoords(view, rect2);
            }
            b(context, rect2, view);
            b.g(this.d, this.f, this.g, this.j, this.k);
            this.b.Y(this.i);
            if (!rect.equals(this.d)) {
                this.b.setBounds(this.d);
            }
        }
    }

    private void P() {
        this.h = ((int) Math.pow(10.0d, l() - 1.0d)) - 1;
    }

    private void b(@NonNull Context context, @NonNull Rect rect, @NonNull View view) {
        int i;
        float f;
        float f2;
        float f3;
        int p = p();
        int g = this.e.g();
        if (g != 8388691 && g != 8388693) {
            this.g = rect.top + p;
        } else {
            this.g = rect.bottom - p;
        }
        if (m() <= 9) {
            if (!q()) {
                f3 = this.e.c;
            } else {
                f3 = this.e.d;
            }
            this.i = f3;
            this.k = f3;
            this.j = f3;
        } else {
            float f4 = this.e.d;
            this.i = f4;
            this.k = f4;
            this.j = (this.c.f(h()) / 2.0f) + this.e.e;
        }
        Resources resources = context.getResources();
        if (q()) {
            i = ww8.mtrl_badge_text_horizontal_edge_offset;
        } else {
            i = ww8.mtrl_badge_horizontal_edge_offset;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int o2 = o();
        int g2 = this.e.g();
        if (g2 != 8388659 && g2 != 8388691) {
            if (syb.E(view) == 0) {
                f2 = ((rect.right + this.j) - dimensionPixelSize) - o2;
            } else {
                f2 = (rect.left - this.j) + dimensionPixelSize + o2;
            }
            this.f = f2;
            return;
        }
        if (syb.E(view) == 0) {
            f = (rect.left - this.j) + dimensionPixelSize + o2;
        } else {
            f = ((rect.right + this.j) - dimensionPixelSize) - o2;
        }
        this.f = f;
    }

    @NonNull
    public static a d(@NonNull Context context) {
        return new a(context, 0, o, n, null);
    }

    @NonNull
    public static a e(@NonNull Context context, int i) {
        return new a(context, i, o, n, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static a f(@NonNull Context context, @NonNull BadgeState.State state) {
        return new a(context, 0, o, n, state);
    }

    private void g(Canvas canvas) {
        Rect rect = new Rect();
        String h = h();
        this.c.e().getTextBounds(h, 0, h.length(), rect);
        canvas.drawText(h, this.f, this.g + (rect.height() / 2), this.c.e());
    }

    @NonNull
    private String h() {
        if (m() <= this.h) {
            return NumberFormat.getInstance(this.e.p()).format(m());
        }
        Context context = this.a.get();
        if (context == null) {
            return "";
        }
        return String.format(this.e.p(), context.getString(w09.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.h), Marker.ANY_NON_NULL_MARKER);
    }

    private int o() {
        int m;
        if (q()) {
            m = this.e.l();
        } else {
            m = this.e.m();
        }
        return m + this.e.c();
    }

    private int p() {
        int s;
        if (q()) {
            s = this.e.r();
        } else {
            s = this.e.s();
        }
        return s + this.e.d();
    }

    private void r() {
        this.c.e().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void s() {
        ColorStateList valueOf = ColorStateList.valueOf(this.e.f());
        if (this.b.x() != valueOf) {
            this.b.b0(valueOf);
            invalidateSelf();
        }
    }

    private void t() {
        FrameLayout frameLayout;
        WeakReference<View> weakReference = this.l;
        if (weakReference != null && weakReference.get() != null) {
            View view = this.l.get();
            WeakReference<FrameLayout> weakReference2 = this.m;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            } else {
                frameLayout = null;
            }
            N(view, frameLayout);
        }
    }

    private void u() {
        this.c.e().setColor(this.e.h());
        invalidateSelf();
    }

    private void v() {
        P();
        this.c.i(true);
        O();
        invalidateSelf();
    }

    private void w() {
        this.c.i(true);
        O();
        invalidateSelf();
    }

    private void x() {
        boolean u = this.e.u();
        setVisible(u, false);
        if (b.a && j() != null && !u) {
            ((ViewGroup) j().getParent()).invalidate();
        }
    }

    private void y() {
        v();
        w();
        r();
        s();
        u();
        t();
        O();
        x();
    }

    public void A(int i) {
        C(i);
        B(i);
    }

    public void B(int i) {
        this.e.y(i);
        O();
    }

    public void C(int i) {
        this.e.z(i);
        O();
    }

    public void D(int i) {
        if (this.e.n() != i) {
            this.e.A(i);
            v();
        }
    }

    public void E(int i) {
        int max = Math.max(0, i);
        if (this.e.o() != max) {
            this.e.B(max);
            w();
        }
    }

    public void H(int i) {
        J(i);
        I(i);
    }

    public void I(int i) {
        this.e.C(i);
        O();
    }

    public void J(int i) {
        this.e.D(i);
        O();
    }

    public void K(boolean z) {
        this.e.E(z);
        x();
    }

    public void N(@NonNull View view, FrameLayout frameLayout) {
        this.l = new WeakReference<>(view);
        boolean z = b.a;
        if (z && frameLayout == null) {
            L(view);
        } else {
            this.m = new WeakReference<>(frameLayout);
        }
        if (!z) {
            M(view);
        }
        O();
        invalidateSelf();
    }

    @Override // defpackage.tab.b
    public void a() {
        invalidateSelf();
    }

    public void c() {
        if (q()) {
            this.e.a();
            w();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.b.draw(canvas);
            if (q()) {
                g(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public CharSequence i() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (q()) {
            if (this.e.k() == 0 || (context = this.a.get()) == null) {
                return null;
            }
            if (m() <= this.h) {
                return context.getResources().getQuantityString(this.e.k(), m(), Integer.valueOf(m()));
            }
            return context.getString(this.e.i(), Integer.valueOf(this.h));
        }
        return this.e.j();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public FrameLayout j() {
        WeakReference<FrameLayout> weakReference = this.m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int k() {
        return this.e.m();
    }

    public int l() {
        return this.e.n();
    }

    public int m() {
        if (q()) {
            return this.e.o();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public BadgeState.State n() {
        return this.e.q();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.tab.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public boolean q() {
        return this.e.t();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.e.w(i);
        r();
    }

    public void z(int i) {
        this.e.x(i);
        s();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
