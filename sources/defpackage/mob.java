package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.p34;
import defpackage.w34;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
/* compiled from: TypefaceCompatApi26Impl.java */
/* renamed from: mob  reason: default package */
/* loaded from: classes.dex */
public class mob extends iob {
    protected final Class<?> g;
    protected final Constructor<?> h;
    protected final Method i;
    protected final Method j;
    protected final Method k;
    protected final Method l;
    protected final Method m;

    public mob() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = u();
            constructor = v(cls);
            method = r(cls);
            method2 = s(cls);
            method3 = w(cls);
            method4 = q(cls);
            method5 = t(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method;
        this.j = method2;
        this.k = method3;
        this.l = method4;
        this.m = method5;
    }

    private Object k() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void l(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean m(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean n(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.i != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.iob, defpackage.pob
    public Typeface a(Context context, p34.c cVar, Resources resources, int i) {
        p34.d[] a;
        if (!p()) {
            return super.a(context, cVar, resources, i);
        }
        Object k = k();
        if (k == null) {
            return null;
        }
        for (p34.d dVar : cVar.a()) {
            if (!m(context, k, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                l(k);
                return null;
            }
        }
        if (!o(k)) {
            return null;
        }
        return h(k);
    }

    @Override // defpackage.iob, defpackage.pob
    public Typeface b(Context context, CancellationSignal cancellationSignal, @NonNull w34.b[] bVarArr, int i) {
        Typeface h;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!p()) {
            w34.b f = f(bVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f.e()).setItalic(f.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h2 = qob.h(context, bVarArr, cancellationSignal);
        Object k = k();
        if (k == null) {
            return null;
        }
        boolean z = false;
        for (w34.b bVar : bVarArr) {
            ByteBuffer byteBuffer = h2.get(bVar.d());
            if (byteBuffer != null) {
                if (!n(k, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    l(k);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            l(k);
            return null;
        } else if (!o(k) || (h = h(k)) == null) {
            return null;
        } else {
            return Typeface.create(h, i);
        }
    }

    @Override // defpackage.pob
    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!p()) {
            return super.d(context, resources, i, str, i2);
        }
        Object k = k();
        if (k == null) {
            return null;
        }
        if (!m(context, k, str, 0, -1, -1, null)) {
            l(k);
            return null;
        } else if (!o(k)) {
            return null;
        } else {
            return h(k);
        }
    }

    protected Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method q(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method r(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method s(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method t(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> u() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> v(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    protected Method w(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }
}
