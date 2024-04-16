package defpackage;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ZoneRulesInitializer.java */
/* renamed from: bdc  reason: default package */
/* loaded from: classes3.dex */
public abstract class bdc {
    public static final bdc a = new a();
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final AtomicReference<bdc> c = new AtomicReference<>();

    /* compiled from: ZoneRulesInitializer.java */
    /* renamed from: bdc$b */
    /* loaded from: classes3.dex */
    static class b extends bdc {
        b() {
        }

        @Override // defpackage.bdc
        protected void b() {
            Iterator it = ServiceLoader.load(cdc.class, cdc.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    cdc.f((cdc) it.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        if (!b.getAndSet(true)) {
            AtomicReference<bdc> atomicReference = c;
            ho1.a(atomicReference, null, new b());
            atomicReference.get().b();
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    public static void c(bdc bdcVar) {
        if (!b.get()) {
            if (ho1.a(c, null, bdcVar)) {
                return;
            }
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
        throw new IllegalStateException("Already initialized");
    }

    protected abstract void b();

    /* compiled from: ZoneRulesInitializer.java */
    /* renamed from: bdc$a */
    /* loaded from: classes3.dex */
    static class a extends bdc {
        a() {
        }

        @Override // defpackage.bdc
        protected void b() {
        }
    }
}
