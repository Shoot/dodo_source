package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Map;
/* compiled from: ChangeBounds.java */
/* renamed from: yu0  reason: default package */
/* loaded from: classes.dex */
public class yu0 extends clb {
    private static final String[] Y4 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> Z4 = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> a5 = new c(PointF.class, "topLeft");
    private static final Property<k, PointF> b5 = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> c5 = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> d5 = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> e5 = new g(PointF.class, "position");
    private static m99 f5 = new m99();
    private int[] V4 = new int[2];
    private boolean W4 = false;
    private boolean X4 = false;

    /* compiled from: ChangeBounds.java */
    /* renamed from: yu0$a */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ BitmapDrawable b;
        final /* synthetic */ View c;
        final /* synthetic */ float d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.a = viewGroup;
            this.b = bitmapDrawable;
            this.c = view;
            this.d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a1c.b(this.a).b(this.b);
            a1c.g(this.c, this.d);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: yu0$b */
    /* loaded from: classes.dex */
    static class b extends Property<Drawable, PointF> {
        private Rect a;

        b(Class cls, String str) {
            super(cls, str);
            this.a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: yu0$c */
    /* loaded from: classes.dex */
    static class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: yu0$d */
    /* loaded from: classes.dex */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: yu0$e */
    /* loaded from: classes.dex */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            a1c.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: yu0$f */
    /* loaded from: classes.dex */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            a1c.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: yu0$g */
    /* loaded from: classes.dex */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            a1c.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: yu0$h */
    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {
        final /* synthetic */ k a;
        private k mViewBounds;

        h(k kVar) {
            this.a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: yu0$i */
    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ View b;
        final /* synthetic */ Rect c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;
        final /* synthetic */ int f;
        final /* synthetic */ int g;

        i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.b = view;
            this.c = rect;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                syb.B0(this.b, this.c);
                a1c.f(this.b, this.d, this.e, this.f, this.g);
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: yu0$j */
    /* loaded from: classes.dex */
    class j extends glb {
        boolean a = false;
        final /* synthetic */ ViewGroup b;

        j(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // defpackage.clb.f
        public void b(@NonNull clb clbVar) {
            if (!this.a) {
                hzb.c(this.b, false);
            }
            clbVar.T(this);
        }

        @Override // defpackage.glb, defpackage.clb.f
        public void c(@NonNull clb clbVar) {
            hzb.c(this.b, false);
            this.a = true;
        }

        @Override // defpackage.glb, defpackage.clb.f
        public void d(@NonNull clb clbVar) {
            hzb.c(this.b, true);
        }

        @Override // defpackage.glb, defpackage.clb.f
        public void e(@NonNull clb clbVar) {
            hzb.c(this.b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChangeBounds.java */
    /* renamed from: yu0$k */
    /* loaded from: classes.dex */
    public static class k {
        private int a;
        private int b;
        private int c;
        private int d;
        private View e;
        private int f;
        private int g;

        k(View view) {
            this.e = view;
        }

        private void b() {
            a1c.f(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    private void h0(mlb mlbVar) {
        View view = mlbVar.b;
        if (syb.Y(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            mlbVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            mlbVar.a.put("android:changeBounds:parent", mlbVar.b.getParent());
            if (this.X4) {
                mlbVar.b.getLocationInWindow(this.V4);
                mlbVar.a.put("android:changeBounds:windowX", Integer.valueOf(this.V4[0]));
                mlbVar.a.put("android:changeBounds:windowY", Integer.valueOf(this.V4[1]));
            }
            if (this.W4) {
                mlbVar.a.put("android:changeBounds:clip", syb.w(view));
            }
        }
    }

    private boolean i0(View view, View view2) {
        if (!this.X4) {
            return true;
        }
        mlb v = v(view, true);
        if (v == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == v.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.clb
    public String[] H() {
        return Y4;
    }

    @Override // defpackage.clb
    public void g(@NonNull mlb mlbVar) {
        h0(mlbVar);
    }

    @Override // defpackage.clb
    public void j(@NonNull mlb mlbVar) {
        h0(mlbVar);
    }

    @Override // defpackage.clb
    public Animator o(@NonNull ViewGroup viewGroup, mlb mlbVar, mlb mlbVar2) {
        int i2;
        View view;
        ObjectAnimator a2;
        int i3;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator;
        Animator c2;
        if (mlbVar == null || mlbVar2 == null) {
            return null;
        }
        Map<String, Object> map = mlbVar.a;
        Map<String, Object> map2 = mlbVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = mlbVar2.b;
        if (i0(viewGroup2, viewGroup3)) {
            Rect rect3 = (Rect) mlbVar.a.get("android:changeBounds:bounds");
            Rect rect4 = (Rect) mlbVar2.a.get("android:changeBounds:bounds");
            int i4 = rect3.left;
            int i5 = rect4.left;
            int i6 = rect3.top;
            int i7 = rect4.top;
            int i8 = rect3.right;
            int i9 = rect4.right;
            int i10 = rect3.bottom;
            int i11 = rect4.bottom;
            int i12 = i8 - i4;
            int i13 = i10 - i6;
            int i14 = i9 - i5;
            int i15 = i11 - i7;
            Rect rect5 = (Rect) mlbVar.a.get("android:changeBounds:clip");
            Rect rect6 = (Rect) mlbVar2.a.get("android:changeBounds:clip");
            if ((i12 != 0 && i13 != 0) || (i14 != 0 && i15 != 0)) {
                if (i4 == i5 && i6 == i7) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                if (i8 != i9 || i10 != i11) {
                    i2++;
                }
            } else {
                i2 = 0;
            }
            if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                i2++;
            }
            if (i2 > 0) {
                if (!this.W4) {
                    view = view2;
                    a1c.f(view, i4, i6, i8, i10);
                    if (i2 == 2) {
                        if (i12 == i14 && i13 == i15) {
                            c2 = l47.a(view, e5, y().a(i4, i6, i5, i7));
                        } else {
                            k kVar = new k(view);
                            ObjectAnimator a3 = l47.a(kVar, a5, y().a(i4, i6, i5, i7));
                            ObjectAnimator a4 = l47.a(kVar, b5, y().a(i8, i10, i9, i11));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a3, a4);
                            animatorSet.addListener(new h(kVar));
                            c2 = animatorSet;
                        }
                    } else if (i4 == i5 && i6 == i7) {
                        c2 = l47.a(view, c5, y().a(i8, i10, i9, i11));
                    } else {
                        c2 = l47.a(view, d5, y().a(i4, i6, i5, i7));
                    }
                } else {
                    view = view2;
                    a1c.f(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                    if (i4 == i5 && i6 == i7) {
                        a2 = null;
                    } else {
                        a2 = l47.a(view, e5, y().a(i4, i6, i5, i7));
                    }
                    if (rect5 == null) {
                        i3 = 0;
                        rect = new Rect(0, 0, i12, i13);
                    } else {
                        i3 = 0;
                        rect = rect5;
                    }
                    if (rect6 == null) {
                        rect2 = new Rect(i3, i3, i14, i15);
                    } else {
                        rect2 = rect6;
                    }
                    if (!rect.equals(rect2)) {
                        syb.B0(view, rect);
                        m99 m99Var = f5;
                        Object[] objArr = new Object[2];
                        objArr[i3] = rect;
                        objArr[1] = rect2;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", m99Var, objArr);
                        ofObject.addListener(new i(view, rect6, i5, i7, i9, i11));
                        objectAnimator = ofObject;
                    } else {
                        objectAnimator = null;
                    }
                    c2 = llb.c(a2, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    hzb.c(viewGroup4, true);
                    b(new j(viewGroup4));
                }
                return c2;
            }
            return null;
        }
        int intValue = ((Integer) mlbVar.a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) mlbVar.a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) mlbVar2.a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) mlbVar2.a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.V4);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c3 = a1c.c(view2);
        a1c.g(view2, 0.0f);
        a1c.b(viewGroup).a(bitmapDrawable);
        yr7 y = y();
        int[] iArr = this.V4;
        int i16 = iArr[0];
        int i17 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, fr8.a(Z4, y.a(intValue - i16, intValue2 - i17, intValue3 - i16, intValue4 - i17)));
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c3));
        return ofPropertyValuesHolder;
    }
}
