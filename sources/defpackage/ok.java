package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.v;
import defpackage.g83;
import defpackage.pua;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: AnimatedStateListDrawableCompat.java */
/* renamed from: ok  reason: default package */
/* loaded from: classes.dex */
public class ok extends pua implements ghb {
    private c o;
    private g p;
    private int q;
    private int r;
    private boolean s;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: ok$b */
    /* loaded from: classes.dex */
    public static class b extends g {
        private final Animatable a;

        b(Animatable animatable) {
            super();
            this.a = animatable;
        }

        @Override // defpackage.ok.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.ok.g
        public void d() {
            this.a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: ok$c */
    /* loaded from: classes.dex */
    public static class c extends pua.a {
        py5<Long> K;
        cra<Integer> L;

        c(c cVar, @NonNull ok okVar, Resources resources) {
            super(cVar, okVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new py5<>();
            this.L = new cra<>();
        }

        private static long D(int i, int i2) {
            return i2 | (i << 32);
        }

        int B(@NonNull int[] iArr, @NonNull Drawable drawable, int i) {
            int z = super.z(iArr, drawable);
            this.L.m(z, Integer.valueOf(i));
            return z;
        }

        int C(int i, int i2, @NonNull Drawable drawable, boolean z) {
            long j;
            int a = super.a(drawable);
            long D = D(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = a;
            this.K.b(D, Long.valueOf(j2 | j));
            if (z) {
                this.K.b(D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        int E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.h(i, 0).intValue();
        }

        int F(@NonNull int[] iArr) {
            int A = super.A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.A(StateSet.WILD_CARD);
        }

        int G(int i, int i2) {
            return (int) this.K.h(D(i, i2), -1L).longValue();
        }

        boolean H(int i, int i2) {
            if ((this.K.h(D(i, i2), -1L).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        boolean I(int i, int i2) {
            if ((this.K.h(D(i, i2), -1L).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        @Override // defpackage.pua.a, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new ok(this, null);
        }

        @Override // defpackage.pua.a, defpackage.g83.d
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // defpackage.pua.a, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new ok(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: ok$d */
    /* loaded from: classes.dex */
    public static class d extends g {
        private final pk a;

        d(pk pkVar) {
            super();
            this.a = pkVar;
        }

        @Override // defpackage.ok.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.ok.g
        public void d() {
            this.a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: ok$e */
    /* loaded from: classes.dex */
    public static class e extends g {
        private final ObjectAnimator a;
        private final boolean b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int i;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            qk1.a(ofInt, true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        @Override // defpackage.ok.g
        public boolean a() {
            return this.b;
        }

        @Override // defpackage.ok.g
        public void b() {
            this.a.reverse();
        }

        @Override // defpackage.ok.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.ok.g
        public void d() {
            this.a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: ok$f */
    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {
        private int[] a;
        private int b;
        private int c;

        f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        int a() {
            return this.c;
        }

        int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * this.c) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            if (i3 < i2) {
                f2 = i / this.c;
            } else {
                f2 = 0.0f;
            }
            return (i3 / i2) + f2;
        }
    }

    public ok() {
        this(null, null);
    }

    @NonNull
    public static ok m(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            ok okVar = new ok();
            okVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return okVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals("item")) {
                            q(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals("transition")) {
                            r(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray s = fob.s(resources, theme, attributeSet, e29.h);
        int resourceId = s.getResourceId(e29.i, 0);
        int resourceId2 = s.getResourceId(e29.j, -1);
        if (resourceId2 > 0) {
            drawable = v.h().j(context, resourceId2);
        } else {
            drawable = null;
        }
        s.recycle();
        int[] k = k(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    drawable = mxb.c(resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = rk1.a(resources, xmlPullParser, attributeSet, theme);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (drawable != null) {
            return this.o.B(k, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray s = fob.s(resources, theme, attributeSet, e29.k);
        int resourceId = s.getResourceId(e29.n, -1);
        int resourceId2 = s.getResourceId(e29.m, -1);
        int resourceId3 = s.getResourceId(e29.l, -1);
        if (resourceId3 > 0) {
            drawable = v.h().j(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = s.getBoolean(e29.o, false);
        s.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    drawable = pk.b(context, resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = rk1.a(resources, xmlPullParser, attributeSet, theme);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (drawable != null) {
            if (resourceId != -1 && resourceId2 != -1) {
                return this.o.C(resourceId, resourceId2, drawable, z);
            }
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private boolean s(int i) {
        int c2;
        int G;
        g bVar;
        g gVar = this.p;
        if (gVar != null) {
            if (i == this.q) {
                return true;
            }
            if (i == this.r && gVar.a()) {
                gVar.b();
                this.q = this.r;
                this.r = i;
                return true;
            }
            c2 = this.q;
            gVar.d();
        } else {
            c2 = c();
        }
        this.p = null;
        this.r = -1;
        this.q = -1;
        c cVar = this.o;
        int E = cVar.E(c2);
        int E2 = cVar.E(i);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof pk) {
            bVar = new d((pk) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.c();
        this.p = bVar;
        this.r = c2;
        this.q = i;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.o;
        cVar.d |= rk1.b(typedArray);
        cVar.x(typedArray.getBoolean(e29.d, cVar.i));
        cVar.t(typedArray.getBoolean(e29.e, cVar.l));
        cVar.u(typedArray.getInt(e29.f, cVar.A));
        cVar.v(typedArray.getInt(e29.g, cVar.B));
        setDither(typedArray.getBoolean(e29.b, cVar.x));
    }

    @Override // defpackage.pua, defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    @NonNull
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(@NonNull Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(@NonNull Outline outline) {
        super.getOutline(outline);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(@NonNull Rect rect) {
        return super.getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.pua, defpackage.g83
    public void h(@NonNull g83.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.o = (c) dVar;
        }
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(@NonNull Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // defpackage.pua, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.p;
        if (gVar != null) {
            gVar.d();
            this.p = null;
            g(this.q);
            this.q = -1;
            this.r = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.pua
    /* renamed from: l */
    public c j() {
        return new c(this.o, this, null);
    }

    @Override // defpackage.pua, defpackage.g83, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.s && super.mutate() == this) {
            this.o.r();
            this.s = true;
        }
        return this;
    }

    public void n(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = fob.s(resources, theme, attributeSet, e29.a);
        setVisible(s.getBoolean(e29.c, true), true);
        t(s);
        i(resources);
        s.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pua, defpackage.g83, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean z;
        int F = this.o.F(iArr);
        if (F != c() && (s(F) || g(F))) {
            z = true;
        } else {
            z = false;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z | current.setState(iArr);
        }
        return z;
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTint(int i) {
        super.setTint(i);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(@NonNull PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.p;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // defpackage.g83, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    ok(c cVar, Resources resources) {
        super(null);
        this.q = -1;
        this.r = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: ok$g */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
