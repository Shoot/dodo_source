package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.p34;
import defpackage.w34;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: TypefaceCompatApi21Impl.java */
/* renamed from: iob  reason: default package */
/* loaded from: classes.dex */
class iob extends pob {
    private static Class<?> b = null;
    private static Constructor<?> c = null;
    private static Method d = null;
    private static Method e = null;
    private static boolean f = false;

    private static boolean g(Object obj, String str, int i, boolean z) {
        j();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface h(Object obj) {
        j();
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File i(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void j() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
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

    private static Object k() {
        j();
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.pob
    public Typeface a(Context context, p34.c cVar, Resources resources, int i) {
        p34.d[] a;
        Object k = k();
        for (p34.d dVar : cVar.a()) {
            File e2 = qob.e(context);
            if (e2 == null) {
                return null;
            }
            try {
                if (!qob.c(e2, resources, dVar.b())) {
                    return null;
                }
                if (!g(k, e2.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                e2.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e2.delete();
            }
        }
        return h(k);
    }

    @Override // defpackage.pob
    public Typeface b(Context context, CancellationSignal cancellationSignal, @NonNull w34.b[] bVarArr, int i) {
        if (bVarArr.length < 1) {
            return null;
        }
        w34.b f2 = f(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f2.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File i2 = i(openFileDescriptor);
            if (i2 != null && i2.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(i2);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c2 = super.c(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return c2;
        } catch (IOException unused) {
            return null;
        }
    }
}
