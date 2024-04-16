package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
/* compiled from: FragmentFactory.java */
/* loaded from: classes.dex */
public class g {
    private static final wka<ClassLoader, wka<String, Class<?>>> a = new wka<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    private static Class<?> c(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        wka<ClassLoader, wka<String, Class<?>>> wkaVar = a;
        wka<String, Class<?>> wkaVar2 = wkaVar.get(classLoader);
        if (wkaVar2 == null) {
            wkaVar2 = new wka<>();
            wkaVar.put(classLoader, wkaVar2);
        }
        Class<?> cls = wkaVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            wkaVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    @NonNull
    public static Class<? extends Fragment> d(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    @NonNull
    public Fragment a(@NonNull ClassLoader classLoader, @NonNull String str) {
        throw null;
    }
}
