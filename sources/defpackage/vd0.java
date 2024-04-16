package defpackage;

import com.google.i18n.phonenumbers.c;
import defpackage.pi6;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: BlockingMetadataBootstrappingGuard.java */
/* renamed from: vd0  reason: default package */
/* loaded from: classes.dex */
final class vd0<T extends pi6> implements oi6<T> {
    private final si6 a;
    private final ti6 b;
    private final T c;
    private final Map<String, String> d = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public vd0(si6 si6Var, ti6 ti6Var, T t) {
        this.a = si6Var;
        this.b = ti6Var;
        this.c = t;
    }

    private synchronized void b(String str) {
        try {
            if (this.d.containsKey(str)) {
                return;
            }
            for (c cVar : c(str)) {
                this.c.a(cVar);
            }
            this.d.put(str, str);
        } catch (Throwable th) {
            throw th;
        }
    }

    private Collection<c> c(String str) {
        try {
            return this.b.d(this.a.a(str));
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw new IllegalStateException("Failed to read file " + str, e);
        }
    }

    @Override // defpackage.oi6
    public T a(String str) {
        if (!this.d.containsKey(str)) {
            b(str);
        }
        return this.c;
    }
}
