package io.realm.internal;

import io.realm.log.RealmLog;
import io.realm.n0;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
/* loaded from: classes3.dex */
public class Util {
    private static Boolean a;
    private static Boolean b;

    public static void a(String str) {
        if (!new uf().a()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static boolean b(String str, File file, String str2) {
        boolean z;
        File file2 = new File(file, str2 + ".management");
        File file3 = new File(str);
        File file4 = new File(str + ".note");
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            for (File file5 : listFiles) {
                if (!file5.delete()) {
                    RealmLog.g(String.format(Locale.ENGLISH, "Realm temporary file at %s cannot be deleted", file5.getAbsolutePath()), new Object[0]);
                }
            }
        }
        if (file2.exists() && !file2.delete()) {
            RealmLog.g(String.format(Locale.ENGLISH, "Realm temporary folder at %s cannot be deleted", file2.getAbsolutePath()), new Object[0]);
        }
        if (file3.exists()) {
            z = file3.delete();
            if (!z) {
                RealmLog.g(String.format(Locale.ENGLISH, "Realm file at %s cannot be deleted", file3.getAbsolutePath()), new Object[0]);
            }
        } else {
            z = true;
        }
        if (file4.exists() && !file4.delete()) {
            RealmLog.g(String.format(Locale.ENGLISH, ".note file at %s cannot be deleted", file4.getAbsolutePath()), new Object[0]);
        }
        return z;
    }

    public static Class<? extends o89> c(Class<? extends o89> cls) {
        if (!cls.equals(o89.class) && !cls.equals(n0.class)) {
            Class superclass = cls.getSuperclass();
            if (!superclass.equals(Object.class) && !superclass.equals(n0.class)) {
                return superclass;
            }
            return cls;
        }
        throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
    }

    public static String d() {
        return nativeGetTablePrefix();
    }

    public static synchronized boolean e() {
        boolean booleanValue;
        synchronized (Util.class) {
            if (b == null) {
                try {
                    b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    b = Boolean.FALSE;
                }
            }
            booleanValue = b.booleanValue();
        }
        return booleanValue;
    }

    public static boolean f(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static synchronized boolean g() {
        boolean booleanValue;
        synchronized (Util.class) {
            if (a == null) {
                try {
                    int i = l04.b;
                    a = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    a = Boolean.FALSE;
                }
            }
            booleanValue = a.booleanValue();
        }
        return booleanValue;
    }

    public static <T> Set<T> h(T... tArr) {
        if (tArr == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : tArr) {
            if (t != null) {
                linkedHashSet.add(t);
            }
        }
        return linkedHashSet;
    }

    static native String nativeGetTablePrefix();
}
