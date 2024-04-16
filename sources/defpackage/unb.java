package defpackage;

import defpackage.fe5;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: TypeIntrinsics.java */
/* renamed from: unb  reason: default package */
/* loaded from: classes3.dex */
public class unb {
    public static Collection a(Object obj) {
        if ((obj instanceof be5) && !(obj instanceof ce5)) {
            p(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof be5) && !(obj instanceof de5)) {
            p(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof be5) && !(obj instanceof ee5)) {
            p(obj, "kotlin.collections.MutableList");
        }
        return h(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof be5) && !(obj instanceof fe5)) {
            p(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i) {
        if (obj != null && !k(obj, i)) {
            p(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw o(e);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw o(e);
        }
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw o(e);
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw o(e);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof j94) {
            return ((j94) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof y84) {
            return 3;
        }
        if (obj instanceof a94) {
            return 4;
        }
        if (obj instanceof c94) {
            return 5;
        }
        if (obj instanceof d94) {
            return 6;
        }
        if (obj instanceof e94) {
            return 7;
        }
        if (obj instanceof f94) {
            return 8;
        }
        if (obj instanceof g94) {
            return 9;
        }
        if (obj instanceof j84) {
            return 10;
        }
        if (obj instanceof k84) {
            return 11;
        }
        if (obj instanceof l84) {
            return 12;
        }
        if (obj instanceof m84) {
            return 13;
        }
        if (obj instanceof n84) {
            return 14;
        }
        if (obj instanceof o84) {
            return 15;
        }
        if (obj instanceof p84) {
            return 16;
        }
        if (obj instanceof q84) {
            return 17;
        }
        if (obj instanceof r84) {
            return 18;
        }
        if (obj instanceof s84) {
            return 19;
        }
        if (obj instanceof u84) {
            return 20;
        }
        if (obj instanceof v84) {
            return 21;
        }
        if (obj instanceof w84) {
            return 22;
        }
        return -1;
    }

    public static boolean k(Object obj, int i) {
        if ((obj instanceof b94) && j(obj) == i) {
            return true;
        }
        return false;
    }

    public static boolean l(Object obj) {
        if ((obj instanceof Map.Entry) && (!(obj instanceof be5) || (obj instanceof fe5.a))) {
            return true;
        }
        return false;
    }

    public static boolean m(Object obj) {
        if ((obj instanceof Set) && (!(obj instanceof be5) || (obj instanceof ie5))) {
            return true;
        }
        return false;
    }

    private static <T extends Throwable> T n(T t) {
        return (T) z65.p(t, unb.class.getName());
    }

    public static ClassCastException o(ClassCastException classCastException) {
        throw ((ClassCastException) n(classCastException));
    }

    public static void p(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        q(name + " cannot be cast to " + str);
    }

    public static void q(String str) {
        throw o(new ClassCastException(str));
    }
}
