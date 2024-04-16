package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.p34;
import defpackage.w34;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: TypefaceCompatApi24Impl.java */
/* renamed from: job  reason: default package */
/* loaded from: classes.dex */
class job extends pob {
    private static final Class<?> b;
    private static final Constructor<?> c;
    private static final Method d;
    private static final Method e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    private static boolean g(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean i() {
        Method method = d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    private static Object j() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.pob
    public Typeface a(Context context, p34.c cVar, Resources resources, int i) {
        p34.d[] a;
        Object j = j();
        if (j == null) {
            return null;
        }
        for (p34.d dVar : cVar.a()) {
            ByteBuffer b2 = qob.b(context, resources, dVar.b());
            if (b2 == null || !g(j, b2, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return h(j);
    }

    @Override // defpackage.pob
    public Typeface b(Context context, CancellationSignal cancellationSignal, @NonNull w34.b[] bVarArr, int i) {
        Object j = j();
        if (j == null) {
            return null;
        }
        wka wkaVar = new wka();
        for (w34.b bVar : bVarArr) {
            Uri d2 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) wkaVar.get(d2);
            if (byteBuffer == null) {
                byteBuffer = qob.f(context, cancellationSignal, d2);
                wkaVar.put(d2, byteBuffer);
            }
            if (byteBuffer == null || !g(j, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface h = h(j);
        if (h == null) {
            return null;
        }
        return Typeface.create(h, i);
    }
}
