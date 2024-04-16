package defpackage;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.m0;
import defpackage.yf5;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
/* compiled from: Registry.java */
/* renamed from: kc9  reason: default package */
/* loaded from: classes2.dex */
public final class kc9 {
    private static final Logger a = Logger.getLogger(kc9.class.getName());
    private static final AtomicReference<kf5> b = new AtomicReference<>(new kf5());
    private static final ConcurrentMap<String, b> c = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> d = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Object> e = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, uj8<?, ?>> f = new ConcurrentHashMap();
    private static final ConcurrentMap<String, uf5> g = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Registry.java */
    /* renamed from: kc9$a */
    /* loaded from: classes2.dex */
    public class a implements b {
        final /* synthetic */ yf5 a;

        a(yf5 yf5Var) {
            this.a = yf5Var;
        }
    }

    /* compiled from: Registry.java */
    /* renamed from: kc9$b */
    /* loaded from: classes2.dex */
    private interface b {
    }

    private kc9() {
    }

    private static <KeyProtoT extends m0> b a(yf5<KeyProtoT> yf5Var) {
        return new a(yf5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (defpackage.kc9.b.get().j(r3) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        r4 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r4.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        r5 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (defpackage.kc9.g.containsKey(r5.getKey()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + r5.getKey() + " from an existing key manager of type " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        r3 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r3.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
        r4 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (defpackage.kc9.g.containsKey(r4.getKey()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + r4.getKey());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.m0, KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.m0> void b(java.lang.String r3, java.util.Map<java.lang.String, defpackage.yf5.a.C0751a<KeyFormatProtoT>> r4, boolean r5) throws java.security.GeneralSecurityException {
        /*
            java.lang.Class<kc9> r0 = defpackage.kc9.class
            monitor-enter(r0)
            if (r5 == 0) goto L34
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = defpackage.kc9.d     // Catch: java.lang.Throwable -> L31
            boolean r2 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L34
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L1a
            goto L34
        L1a:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "New keys are already disallowed for key type "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            r5.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L31:
            r3 = move-exception
            goto Lc8
        L34:
            if (r5 == 0) goto Lca
            java.util.concurrent.atomic.AtomicReference<kf5> r5 = defpackage.kc9.b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L31
            kf5 r5 = (defpackage.kf5) r5     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.j(r3)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L8a
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L31
        L4c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto Lca
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap<java.lang.String, uf5> r1 = defpackage.kc9.g     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L65
            goto L4c
        L65:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "Attempted to register a new key template "
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L31
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = " from an existing key manager of type "
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            r1.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L8a:
            java.util.Set r3 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L92:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto Lca
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap<java.lang.String, uf5> r5 = defpackage.kc9.g     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L31
            if (r5 != 0) goto Lab
            goto L92
        Lab:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "Attempted overwrite of a registered key template "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L31
            r5.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        Lc8:
            monitor-exit(r0)
            throw r3
        Lca:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc9.b(java.lang.String, java.util.Map, boolean):void");
    }

    public static Class<?> c(Class<?> cls) {
        uj8<?, ?> uj8Var = f.get(cls);
        if (uj8Var == null) {
            return null;
        }
        return uj8Var.a();
    }

    public static <P> P d(we5 we5Var, Class<P> cls) throws GeneralSecurityException {
        return (P) e(we5Var.R(), we5Var.S(), cls);
    }

    public static <P> P e(String str, h hVar, Class<P> cls) throws GeneralSecurityException {
        return b.get().c(str, cls).c(hVar);
    }

    public static <P> P f(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) e(str, h.u(bArr), cls);
    }

    public static if5<?> g(String str) throws GeneralSecurityException {
        return b.get().f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized Map<String, uf5> h() {
        Map<String, uf5> unmodifiableMap;
        synchronized (kc9.class) {
            unmodifiableMap = Collections.unmodifiableMap(g);
        }
        return unmodifiableMap;
    }

    public static synchronized m0 i(vf5 vf5Var) throws GeneralSecurityException {
        m0 d2;
        synchronized (kc9.class) {
            if5<?> g2 = g(vf5Var.R());
            if (d.get(vf5Var.R()).booleanValue()) {
                d2 = g2.d(vf5Var.S());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + vf5Var.R());
            }
        }
        return d2;
    }

    public static synchronized we5 j(vf5 vf5Var) throws GeneralSecurityException {
        we5 a2;
        synchronized (kc9.class) {
            if5<?> g2 = g(vf5Var.R());
            if (d.get(vf5Var.R()).booleanValue()) {
                a2 = g2.a(vf5Var.S());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + vf5Var.R());
            }
        }
        return a2;
    }

    public static synchronized <KeyProtoT extends m0> void k(yf5<KeyProtoT> yf5Var, boolean z) throws GeneralSecurityException {
        Map<String, yf5.a.C0751a<?>> emptyMap;
        synchronized (kc9.class) {
            try {
                if (yf5Var != null) {
                    AtomicReference<kf5> atomicReference = b;
                    kf5 kf5Var = new kf5(atomicReference.get());
                    kf5Var.g(yf5Var);
                    String d2 = yf5Var.d();
                    if (z) {
                        emptyMap = yf5Var.f().c();
                    } else {
                        emptyMap = Collections.emptyMap();
                    }
                    b(d2, emptyMap, z);
                    if (!atomicReference.get().j(d2)) {
                        c.put(d2, a(yf5Var));
                        if (z) {
                            l(d2, yf5Var.f().c());
                        }
                    }
                    d.put(d2, Boolean.valueOf(z));
                    atomicReference.set(kf5Var);
                } else {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static <KeyFormatProtoT extends m0> void l(String str, Map<String, yf5.a.C0751a<KeyFormatProtoT>> map) {
        for (Map.Entry<String, yf5.a.C0751a<KeyFormatProtoT>> entry : map.entrySet()) {
            g.put(entry.getKey(), uf5.a(str, entry.getValue().a.h(), entry.getValue().b));
        }
    }

    public static synchronized <B, P> void m(uj8<B, P> uj8Var) throws GeneralSecurityException {
        synchronized (kc9.class) {
            try {
                if (uj8Var != null) {
                    Class<P> b2 = uj8Var.b();
                    ConcurrentMap<Class<?>, uj8<?, ?>> concurrentMap = f;
                    if (concurrentMap.containsKey(b2)) {
                        uj8<?, ?> uj8Var2 = concurrentMap.get(b2);
                        if (!uj8Var.getClass().getName().equals(uj8Var2.getClass().getName())) {
                            Logger logger = a;
                            logger.warning("Attempted overwrite of a registered PrimitiveWrapper for type " + b2);
                            throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", b2.getName(), uj8Var2.getClass().getName(), uj8Var.getClass().getName()));
                        }
                    }
                    concurrentMap.put(b2, uj8Var);
                } else {
                    throw new IllegalArgumentException("wrapper must be non-null");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <B, P> P n(rj8<B> rj8Var, Class<P> cls) throws GeneralSecurityException {
        uj8<?, ?> uj8Var = f.get(cls);
        if (uj8Var != null) {
            if (uj8Var.a().equals(rj8Var.g())) {
                return (P) uj8Var.c(rj8Var);
            }
            throw new GeneralSecurityException("Wrong input primitive class, expected " + uj8Var.a() + ", got " + rj8Var.g());
        }
        throw new GeneralSecurityException("No wrapper found for " + rj8Var.g().getName());
    }
}
