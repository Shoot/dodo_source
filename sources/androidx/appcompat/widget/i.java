package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.v;
/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class i {
    private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static i c;
    private v a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public class a implements v.f {
        private final int[] a = {px8.R, px8.P, px8.a};
        private final int[] b = {px8.o, px8.B, px8.t, px8.p, px8.q, px8.s, px8.r};
        private final int[] c = {px8.O, px8.Q, px8.k, px8.K, px8.L, px8.M, px8.N};
        private final int[] d = {px8.w, px8.i, px8.v};
        private final int[] e = {px8.J, px8.S};
        private final int[] f = {px8.c, px8.g, px8.d, px8.h};

        a() {
        }

        private boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(@NonNull Context context) {
            return h(context, 0);
        }

        private ColorStateList h(@NonNull Context context, int i) {
            int c = a0.c(context, aw8.x);
            return new ColorStateList(new int[][]{a0.b, a0.e, a0.c, a0.i}, new int[]{a0.b(context, aw8.v), qf1.k(c, i), qf1.k(c, i), i});
        }

        private ColorStateList i(@NonNull Context context) {
            return h(context, a0.c(context, aw8.u));
        }

        private ColorStateList j(@NonNull Context context) {
            return h(context, a0.c(context, aw8.v));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i = aw8.A;
            ColorStateList e = a0.e(context, i);
            if (e != null && e.isStateful()) {
                int[] iArr3 = a0.b;
                iArr[0] = iArr3;
                iArr2[0] = e.getColorForState(iArr3, 0);
                iArr[1] = a0.f;
                iArr2[1] = a0.c(context, aw8.w);
                iArr[2] = a0.i;
                iArr2[2] = e.getDefaultColor();
            } else {
                iArr[0] = a0.b;
                iArr2[0] = a0.b(context, i);
                iArr[1] = a0.f;
                iArr2[1] = a0.c(context, aw8.w);
                iArr[2] = a0.i;
                iArr2[2] = a0.c(context, i);
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(@NonNull v vVar, @NonNull Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = vVar.j(context, px8.F);
            Drawable j2 = vVar.j(context, px8.G);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (u.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = i.b;
            }
            drawable.setColorFilter(i.e(i, mode));
        }

        @Override // androidx.appcompat.widget.v.f
        public Drawable a(@NonNull v vVar, @NonNull Context context, int i) {
            if (i == px8.j) {
                return new LayerDrawable(new Drawable[]{vVar.j(context, px8.i), vVar.j(context, px8.k)});
            }
            if (i == px8.y) {
                return l(vVar, context, xw8.i);
            }
            if (i == px8.x) {
                return l(vVar, context, xw8.j);
            }
            if (i == px8.z) {
                return l(vVar, context, xw8.k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.v.f
        public ColorStateList b(@NonNull Context context, int i) {
            if (i == px8.m) {
                return on.a(context, qw8.e);
            }
            if (i == px8.I) {
                return on.a(context, qw8.h);
            }
            if (i == px8.H) {
                return k(context);
            }
            if (i == px8.f) {
                return j(context);
            }
            if (i == px8.b) {
                return g(context);
            }
            if (i == px8.e) {
                return i(context);
            }
            if (i != px8.D && i != px8.E) {
                if (f(this.b, i)) {
                    return a0.e(context, aw8.y);
                }
                if (f(this.e, i)) {
                    return on.a(context, qw8.d);
                }
                if (f(this.f, i)) {
                    return on.a(context, qw8.c);
                }
                if (i == px8.A) {
                    return on.a(context, qw8.f);
                }
                return null;
            }
            return on.a(context, qw8.g);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[RETURN] */
        @Override // androidx.appcompat.widget.v.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean c(@androidx.annotation.NonNull android.content.Context r7, int r8, @androidx.annotation.NonNull android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.i.a()
                int[] r1 = r6.a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = defpackage.aw8.y
            L11:
                r1 = r0
            L12:
                r0 = -1
                r5 = 1
                goto L50
            L15:
                int[] r1 = r6.c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = defpackage.aw8.w
                goto L11
            L20:
                int[] r1 = r6.d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r8 = 16842801(0x1010031, float:2.3693695E-38)
                goto L12
            L32:
                int r1 = defpackage.px8.u
                if (r8 != r1) goto L47
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r0
                r5 = 1
                r0 = r8
                r8 = 16842800(0x1010030, float:2.3693693E-38)
                goto L50
            L47:
                int r1 = defpackage.px8.l
                if (r8 != r1) goto L4c
                goto L2d
            L4c:
                r1 = r0
                r8 = 0
                r0 = -1
                r5 = 0
            L50:
                if (r5 == 0) goto L6d
                boolean r3 = androidx.appcompat.widget.u.a(r9)
                if (r3 == 0) goto L5c
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L5c:
                int r7 = androidx.appcompat.widget.a0.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.i.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L6c
                r9.setAlpha(r0)
            L6c:
                return r2
            L6d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.v.f
        public PorterDuff.Mode d(int i) {
            if (i == px8.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.v.f
        public boolean e(@NonNull Context context, int i, @NonNull Drawable drawable) {
            if (i == px8.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = aw8.y;
                m(findDrawableByLayerId, a0.c(context, i2), i.b);
                m(layerDrawable.findDrawableByLayerId(16908303), a0.c(context, i2), i.b);
                m(layerDrawable.findDrawableByLayerId(16908301), a0.c(context, aw8.w), i.b);
                return true;
            } else if (i != px8.y && i != px8.x && i != px8.z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), a0.b(context, aw8.y), i.b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = aw8.w;
                m(findDrawableByLayerId2, a0.c(context, i3), i.b);
                m(layerDrawable2.findDrawableByLayerId(16908301), a0.c(context, i3), i.b);
                return true;
            }
        }
    }

    public static synchronized i b() {
        i iVar;
        synchronized (i.class) {
            try {
                if (c == null) {
                    h();
                }
                iVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (i.class) {
            l = v.l(i, mode);
        }
        return l;
    }

    public static synchronized void h() {
        synchronized (i.class) {
            if (c == null) {
                i iVar = new i();
                c = iVar;
                iVar.a = v.h();
                c.a.u(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Drawable drawable, c0 c0Var, int[] iArr) {
        v.w(drawable, c0Var, iArr);
    }

    public synchronized Drawable c(@NonNull Context context, int i) {
        return this.a.j(context, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable d(@NonNull Context context, int i, boolean z) {
        return this.a.k(context, i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList f(@NonNull Context context, int i) {
        return this.a.m(context, i);
    }

    public synchronized void g(@NonNull Context context) {
        this.a.s(context);
    }
}
