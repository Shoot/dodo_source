package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class v {
    private static v i;
    private WeakHashMap<Context, cra<ColorStateList>> a;
    private wka<String, e> b;
    private cra<String> c;
    private final WeakHashMap<Context, py5<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    private TypedValue e;
    private boolean f;
    private f g;
    private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    private static final c j = new c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.v.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return ok.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.v.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return pk.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class c extends j36<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        private static int k(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter l(int i, PorterDuff.Mode mode) {
            return d(Integer.valueOf(k(i, mode)));
        }

        PorterDuffColorFilter m(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return e(Integer.valueOf(k(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.v.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    rk1.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface f {
        Drawable a(@NonNull v vVar, @NonNull Context context, int i);

        ColorStateList b(@NonNull Context context, int i);

        boolean c(@NonNull Context context, int i, @NonNull Drawable drawable);

        PorterDuff.Mode d(int i);

        boolean e(@NonNull Context context, int i, @NonNull Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.v.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return mxb.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private void a(@NonNull String str, @NonNull e eVar) {
        if (this.b == null) {
            this.b = new wka<>();
        }
        this.b.put(str, eVar);
    }

    private synchronized boolean b(@NonNull Context context, long j2, @NonNull Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                py5<WeakReference<Drawable.ConstantState>> py5Var = this.d.get(context);
                if (py5Var == null) {
                    py5Var = new py5<>();
                    this.d.put(context, py5Var);
                }
                py5Var.l(j2, new WeakReference<>(constantState));
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void c(@NonNull Context context, int i2, @NonNull ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        cra<ColorStateList> craVar = this.a.get(context);
        if (craVar == null) {
            craVar = new cra<>();
            this.a.put(context, craVar);
        }
        craVar.b(i2, colorStateList);
    }

    private void d(@NonNull Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable j2 = j(context, gx8.a);
        if (j2 != null && q(j2)) {
            return;
        }
        this.f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(@NonNull Context context, int i2) {
        Drawable a2;
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        f fVar = this.g;
        if (fVar == null) {
            a2 = null;
        } else {
            a2 = fVar.a(this, context, i2);
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e2, a2);
        }
        return a2;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList != null && mode != null) {
            return l(colorStateList.getColorForState(iArr, 0), mode);
        }
        return null;
    }

    public static synchronized v h() {
        v vVar;
        synchronized (v.class) {
            try {
                if (i == null) {
                    v vVar2 = new v();
                    i = vVar2;
                    p(vVar2);
                }
                vVar = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    private synchronized Drawable i(@NonNull Context context, long j2) {
        py5<WeakReference<Drawable.ConstantState>> py5Var = this.d.get(context);
        if (py5Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> g2 = py5Var.g(j2);
        if (g2 != null) {
            Drawable.ConstantState constantState = g2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            py5Var.m(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (v.class) {
            c cVar = j;
            l = cVar.l(i2, mode);
            if (l == null) {
                l = new PorterDuffColorFilter(i2, mode);
                cVar.m(i2, mode, l);
            }
        }
        return l;
    }

    private ColorStateList n(@NonNull Context context, int i2) {
        cra<ColorStateList> craVar;
        WeakHashMap<Context, cra<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (craVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return craVar.g(i2);
    }

    private static void p(@NonNull v vVar) {
        if (Build.VERSION.SDK_INT < 24) {
            vVar.a("vector", new g());
            vVar.a("animated-vector", new b());
            vVar.a("animated-selector", new a());
            vVar.a("drawable", new d());
        }
    }

    private static boolean q(@NonNull Drawable drawable) {
        if (!(drawable instanceof mxb) && !"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return false;
        }
        return true;
    }

    private Drawable r(@NonNull Context context, int i2) {
        int next;
        wka<String, e> wkaVar = this.b;
        if (wkaVar == null || wkaVar.isEmpty()) {
            return null;
        }
        cra<String> craVar = this.c;
        if (craVar != null) {
            String g2 = craVar.g(i2);
            if ("appcompat_skip_skip".equals(g2) || (g2 != null && this.b.get(g2) == null)) {
                return null;
            }
        } else {
            this.c = new cra<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.c.b(i2, name);
                    e eVar = this.b.get(name);
                    if (eVar != null) {
                        i3 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (i3 != null) {
                        i3.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, e2, i3);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (i3 == null) {
            this.c.b(i2, "appcompat_skip_skip");
        }
        return i3;
    }

    private Drawable v(@NonNull Context context, int i2, boolean z, @NonNull Drawable drawable) {
        ColorStateList m = m(context, i2);
        if (m != null) {
            if (u.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = f83.r(drawable);
            f83.o(r, m);
            PorterDuff.Mode o = o(i2);
            if (o != null) {
                f83.p(r, o);
                return r;
            }
            return r;
        }
        f fVar = this.g;
        if ((fVar == null || !fVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Drawable drawable, c0 c0Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        if (u.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c0Var.d;
        if (!z && !c0Var.c) {
            drawable.clearColorFilter();
        } else {
            if (z) {
                colorStateList = c0Var.a;
            } else {
                colorStateList = null;
            }
            if (c0Var.c) {
                mode = c0Var.b;
            } else {
                mode = h;
            }
            drawable.setColorFilter(g(colorStateList, mode, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(@NonNull Context context, int i2) {
        return k(context, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable k(@NonNull Context context, int i2, boolean z) {
        Drawable r;
        try {
            d(context);
            r = r(context, i2);
            if (r == null) {
                r = f(context, i2);
            }
            if (r == null) {
                r = iu1.e(context, i2);
            }
            if (r != null) {
                r = v(context, i2, z, r);
            }
            if (r != null) {
                u.b(r);
            }
        } catch (Throwable th) {
            throw th;
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList m(@NonNull Context context, int i2) {
        ColorStateList n;
        n = n(context, i2);
        if (n == null) {
            f fVar = this.g;
            if (fVar == null) {
                n = null;
            } else {
                n = fVar.b(context, i2);
            }
            if (n != null) {
                c(context, i2, n);
            }
        }
        return n;
    }

    PorterDuff.Mode o(int i2) {
        f fVar = this.g;
        if (fVar == null) {
            return null;
        }
        return fVar.d(i2);
    }

    public synchronized void s(@NonNull Context context) {
        py5<WeakReference<Drawable.ConstantState>> py5Var = this.d.get(context);
        if (py5Var != null) {
            py5Var.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable t(@NonNull Context context, @NonNull g0 g0Var, int i2) {
        try {
            Drawable r = r(context, i2);
            if (r == null) {
                r = g0Var.a(i2);
            }
            if (r != null) {
                return v(context, i2, false, r);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(f fVar) {
        this.g = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(@NonNull Context context, int i2, @NonNull Drawable drawable) {
        f fVar = this.g;
        if (fVar != null && fVar.c(context, i2, drawable)) {
            return true;
        }
        return false;
    }
}
