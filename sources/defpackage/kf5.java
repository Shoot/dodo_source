package defpackage;

import com.google.crypto.tink.shaded.protobuf.m0;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
/* compiled from: KeyManagerRegistry.java */
/* renamed from: kf5  reason: default package */
/* loaded from: classes2.dex */
final class kf5 {
    private static final Logger b = Logger.getLogger(kf5.class.getName());
    private final ConcurrentMap<String, b> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KeyManagerRegistry.java */
    /* renamed from: kf5$a */
    /* loaded from: classes2.dex */
    public class a implements b {
        final /* synthetic */ yf5 a;

        a(yf5 yf5Var) {
            this.a = yf5Var;
        }

        @Override // defpackage.kf5.b
        public Class<?> a() {
            return this.a.getClass();
        }

        @Override // defpackage.kf5.b
        public Set<Class<?>> b() {
            return this.a.i();
        }

        @Override // defpackage.kf5.b
        public <Q> if5<Q> c(Class<Q> cls) throws GeneralSecurityException {
            try {
                return new jf5(this.a, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }

        @Override // defpackage.kf5.b
        public if5<?> d() {
            yf5 yf5Var = this.a;
            return new jf5(yf5Var, yf5Var.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KeyManagerRegistry.java */
    /* renamed from: kf5$b */
    /* loaded from: classes2.dex */
    public interface b {
        Class<?> a();

        Set<Class<?>> b();

        <P> if5<P> c(Class<P> cls) throws GeneralSecurityException;

        if5<?> d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public kf5(kf5 kf5Var) {
        this.a = new ConcurrentHashMap(kf5Var.a);
    }

    private static <T> T a(T t) {
        t.getClass();
        return t;
    }

    private static <KeyProtoT extends m0> b b(yf5<KeyProtoT> yf5Var) {
        return new a(yf5Var);
    }

    private synchronized b d(String str) throws GeneralSecurityException {
        if (this.a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.a.get(str);
    }

    private <P> if5<P> e(String str, Class<P> cls) throws GeneralSecurityException {
        b d = d(str);
        if (cls == null) {
            return (if5<P>) d.d();
        }
        if (d.b().contains(cls)) {
            return d.c(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + d.a() + ", supported primitives: " + i(d.b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
        r5.a.putIfAbsent(r0, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized <P> void h(defpackage.kf5.b r6, boolean r7) throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            monitor-enter(r5)
            if5 r0 = r6.d()     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.ConcurrentMap<java.lang.String, kf5$b> r1 = r5.a     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L60
            kf5$b r1 = (defpackage.kf5.b) r1     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L62
            java.lang.Class r2 = r1.a()     // Catch: java.lang.Throwable -> L60
            java.lang.Class r3 = r6.a()     // Catch: java.lang.Throwable -> L60
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L22
            goto L62
        L22:
            java.util.logging.Logger r7 = defpackage.kf5.b     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch: java.lang.Throwable -> L60
            r2.append(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L60
            r7.warning(r2)     // Catch: java.lang.Throwable -> L60
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L60
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.Throwable -> L60
            java.lang.Class r0 = r1.a()     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L60
            r1 = 1
            r3[r1] = r0     // Catch: java.lang.Throwable -> L60
            java.lang.Class r6 = r6.a()     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L60
            r0 = 2
            r3[r0] = r6     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L60
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L60
            throw r7     // Catch: java.lang.Throwable -> L60
        L60:
            r6 = move-exception
            goto L71
        L62:
            if (r7 != 0) goto L6a
            java.util.concurrent.ConcurrentMap<java.lang.String, kf5$b> r7 = r5.a     // Catch: java.lang.Throwable -> L60
            r7.putIfAbsent(r0, r6)     // Catch: java.lang.Throwable -> L60
            goto L6f
        L6a:
            java.util.concurrent.ConcurrentMap<java.lang.String, kf5$b> r7 = r5.a     // Catch: java.lang.Throwable -> L60
            r7.put(r0, r6)     // Catch: java.lang.Throwable -> L60
        L6f:
            monitor-exit(r5)
            return
        L71:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf5.h(kf5$b, boolean):void");
    }

    private static String i(Set<Class<?>> set) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls : set) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <P> if5<P> c(String str, Class<P> cls) throws GeneralSecurityException {
        return e(str, (Class) a(cls));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public if5<?> f(String str) throws GeneralSecurityException {
        return d(str).d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <KeyProtoT extends m0> void g(yf5<KeyProtoT> yf5Var) throws GeneralSecurityException {
        if (yf5Var.a().a()) {
            h(b(yf5Var), false);
        } else {
            throw new GeneralSecurityException("failed to register key manager " + yf5Var.getClass() + " as it is not FIPS compatible.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j(String str) {
        return this.a.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public kf5() {
        this.a = new ConcurrentHashMap();
    }
}
