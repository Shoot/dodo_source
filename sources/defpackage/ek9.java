package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import defpackage.ek9;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* compiled from: ResourcesCompat.java */
/* renamed from: ek9  reason: default package */
/* loaded from: classes.dex */
public final class ek9 {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<d, SparseArray<c>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    /* compiled from: ResourcesCompat.java */
    /* renamed from: ek9$a */
    /* loaded from: classes.dex */
    static class a {
        static Drawable a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourcesCompat.java */
    /* renamed from: ek9$b */
    /* loaded from: classes.dex */
    public static class b {
        static int a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @NonNull
        static ColorStateList b(@NonNull Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* renamed from: ek9$c */
    /* loaded from: classes.dex */
    public static class c {
        final ColorStateList a;
        final Configuration b;
        final int c;

        c(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, Resources.Theme theme) {
            int hashCode;
            this.a = colorStateList;
            this.b = configuration;
            if (theme == null) {
                hashCode = 0;
            } else {
                hashCode = theme.hashCode();
            }
            this.c = hashCode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* renamed from: ek9$d */
    /* loaded from: classes.dex */
    public static final class d {
        final Resources a;
        final Resources.Theme b;

        d(@NonNull Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a.equals(dVar.a) && p57.a(this.b, dVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return p57.b(this.a, this.b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* renamed from: ek9$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        @NonNull
        public static Handler e(Handler handler) {
            if (handler == null) {
                return new Handler(Looper.getMainLooper());
            }
            return handler;
        }

        public final void c(final int i, Handler handler) {
            e(handler).post(new Runnable() { // from class: gk9
                @Override // java.lang.Runnable
                public final void run() {
                    ek9.e.this.f(i);
                }
            });
        }

        public final void d(@NonNull final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: fk9
                @Override // java.lang.Runnable
                public final void run() {
                    ek9.e.this.g(typeface);
                }
            });
        }

        /* renamed from: h */
        public abstract void f(int i);

        /* renamed from: i */
        public abstract void g(@NonNull Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    /* renamed from: ek9$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* compiled from: ResourcesCompat.java */
        /* renamed from: ek9$f$a */
        /* loaded from: classes.dex */
        static class a {
            private static final Object a = new Object();
            private static Method b;
            private static boolean c;

            @SuppressLint({"BanUncheckedReflection"})
            static void a(@NonNull Resources.Theme theme) {
                synchronized (a) {
                    if (!c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        c = true;
                    }
                    Method method = b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: ResourcesCompat.java */
        /* renamed from: ek9$f$b */
        /* loaded from: classes.dex */
        static class b {
            static void a(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(@NonNull Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                b.a(theme);
            } else if (i >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(@NonNull d dVar, int i, @NonNull ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            try {
                WeakHashMap<d, SparseArray<c>> weakHashMap = b;
                SparseArray<c> sparseArray = weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i, new c(colorStateList, dVar.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r2.c == r5.hashCode()) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList b(@androidx.annotation.NonNull defpackage.ek9.d r5, int r6) {
        /*
            java.lang.Object r0 = defpackage.ek9.c
            monitor-enter(r0)
            java.util.WeakHashMap<ek9$d, android.util.SparseArray<ek9$c>> r1 = defpackage.ek9.b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            ek9$c r2 = (defpackage.ek9.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek9.b(ek9$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(@NonNull Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(@NonNull Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(resources, i, theme);
        }
        return resources.getColor(i);
    }

    public static ColorStateList e(@NonNull Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        d dVar = new d(resources, theme);
        ColorStateList b2 = b(dVar, i);
        if (b2 != null) {
            return b2;
        }
        ColorStateList l = l(resources, i, theme);
        if (l != null) {
            a(dVar, i, l, theme);
            return l;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return b.b(resources, i, theme);
        } else {
            return resources.getColorStateList(i);
        }
    }

    public static Drawable f(@NonNull Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return a.a(resources, i, theme);
    }

    public static Drawable g(@NonNull Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return a.b(resources, i, i2, theme);
    }

    public static Typeface h(@NonNull Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(@NonNull Context context, int i, @NonNull TypedValue typedValue, int i2, e eVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i, typedValue, i2, eVar, null, true, false);
    }

    public static void j(@NonNull Context context, int i, @NonNull e eVar, Handler handler) throws Resources.NotFoundException {
        kh8.f(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            n(context, i, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    @NonNull
    private static TypedValue k() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    private static ColorStateList l(Resources resources, int i, Resources.Theme theme) {
        if (m(resources, i)) {
            return null;
        }
        try {
            return mf1.a(resources, resources.getXml(i), theme);
        } catch (Exception e2) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean m(@NonNull Resources resources, int i) {
        TypedValue k = k();
        resources.getValue(i, k, true);
        int i2 = k.type;
        if (i2 >= 28 && i2 <= 31) {
            return true;
        }
        return false;
    }

    private static Typeface n(@NonNull Context context, int i, @NonNull TypedValue typedValue, int i2, e eVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface o = o(context, resources, typedValue, i, i2, eVar, handler, z, z2);
        if (o == null && eVar == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return o;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface o(@androidx.annotation.NonNull android.content.Context r16, android.content.res.Resources r17, @androidx.annotation.NonNull android.util.TypedValue r18, int r19, int r20, defpackage.ek9.e r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek9.o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, ek9$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
