package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
/* compiled from: MoreObjects.java */
/* renamed from: ro6  reason: default package */
/* loaded from: classes2.dex */
public final class ro6 {

    /* compiled from: MoreObjects.java */
    /* renamed from: ro6$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final String a;
        private final C0503b b;
        private C0503b c;
        private boolean d;
        private boolean e;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MoreObjects.java */
        /* renamed from: ro6$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends C0503b {
            private a() {
                super();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MoreObjects.java */
        /* renamed from: ro6$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0503b {
            String a;
            Object b;
            C0503b c;

            private C0503b() {
            }
        }

        private C0503b c() {
            C0503b c0503b = new C0503b();
            this.c.c = c0503b;
            this.c = c0503b;
            return c0503b;
        }

        private b d(Object obj) {
            c().b = obj;
            return this;
        }

        private b e(String str, Object obj) {
            C0503b c = c();
            c.b = obj;
            c.a = (String) hh8.i(str);
            return this;
        }

        private a f() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        private b g(String str, Object obj) {
            a f = f();
            f.b = obj;
            f.a = (String) hh8.i(str);
            return this;
        }

        private static boolean i(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() != 0) {
                    return false;
                }
                return true;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof pb7) {
                    return !((pb7) obj).c();
                }
                if (!obj.getClass().isArray() || Array.getLength(obj) != 0) {
                    return false;
                }
                return true;
            }
        }

        public b a(String str, int i) {
            return g(str, String.valueOf(i));
        }

        public b b(String str, Object obj) {
            return e(str, obj);
        }

        public b h(Object obj) {
            return d(obj);
        }

        public String toString() {
            boolean z = this.d;
            boolean z2 = this.e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append(CoreConstants.CURLY_LEFT);
            String str = "";
            for (C0503b c0503b = this.b.c; c0503b != null; c0503b = c0503b.c) {
                Object obj = c0503b.b;
                if (!(c0503b instanceof a)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && i(obj)) {
                    }
                }
                sb.append(str);
                String str2 = c0503b.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                } else {
                    sb.append(obj);
                }
                str = ", ";
            }
            sb.append(CoreConstants.CURLY_RIGHT);
            return sb.toString();
        }

        private b(String str) {
            C0503b c0503b = new C0503b();
            this.b = c0503b;
            this.c = c0503b;
            this.d = false;
            this.e = false;
            this.a = (String) hh8.i(str);
        }
    }

    public static <T> T a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
