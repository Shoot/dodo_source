package defpackage;

import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.Map;
/* renamed from: pq8  reason: default package */
/* loaded from: classes3.dex */
public class pq8 {
    private static final ThreadLocal a = new ThreadLocal();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pq8$a */
    /* loaded from: classes3.dex */
    public static class a implements PrivilegedAction {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return Security.getProperty(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pq8$b */
    /* loaded from: classes3.dex */
    public static class b implements PrivilegedAction {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(this.a);
        }
    }

    public static BigInteger a(String str) {
        String b2 = b(str);
        if (b2 != null) {
            return new BigInteger(b2);
        }
        return null;
    }

    public static String b(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new a(str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) a.get();
        if (map != null && (str2 = (String) map.get(str)) != null) {
            return str2;
        }
        return (String) AccessController.doPrivileged(new b(str));
    }

    public static boolean c(String str) {
        try {
            return f(b(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    public static boolean d(String str, boolean z) {
        try {
            String b2 = b(str);
            if (z) {
                return f(b2);
            }
            return e(b2);
        } catch (AccessControlException unused) {
            return false;
        }
    }

    private static boolean e(String str) {
        if (str == null || str.length() != 5) {
            return false;
        }
        if (str.charAt(0) != 'f' && str.charAt(0) != 'F') {
            return false;
        }
        if (str.charAt(1) != 'a' && str.charAt(1) != 'A') {
            return false;
        }
        if (str.charAt(2) != 'l' && str.charAt(2) != 'L') {
            return false;
        }
        if (str.charAt(3) != 's' && str.charAt(3) != 'S') {
            return false;
        }
        if (str.charAt(4) != 'e' && str.charAt(4) != 'E') {
            return false;
        }
        return true;
    }

    private static boolean f(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        if (str.charAt(0) != 't' && str.charAt(0) != 'T') {
            return false;
        }
        if (str.charAt(1) != 'r' && str.charAt(1) != 'R') {
            return false;
        }
        if (str.charAt(2) != 'u' && str.charAt(2) != 'U') {
            return false;
        }
        if (str.charAt(3) != 'e' && str.charAt(3) != 'E') {
            return false;
        }
        return true;
    }
}
