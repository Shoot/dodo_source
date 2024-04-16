package defpackage;

import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.q;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: LoadPathCache.java */
/* renamed from: ur5  reason: default package */
/* loaded from: classes.dex */
public class ur5 {
    private static final q<?, ?, ?> c = new q<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new tqb(), null)), null);
    private final lr<jp6, q<?, ?, ?>> a = new lr<>();
    private final AtomicReference<jp6> b = new AtomicReference<>();

    private jp6 b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        jp6 andSet = this.b.getAndSet(null);
        if (andSet == null) {
            andSet = new jp6();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> qVar;
        jp6 b = b(cls, cls2, cls3);
        synchronized (this.a) {
            qVar = (q<Data, TResource, Transcode>) this.a.get(b);
        }
        this.b.set(b);
        return qVar;
    }

    public boolean c(q<?, ?, ?> qVar) {
        return c.equals(qVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, q<?, ?, ?> qVar) {
        synchronized (this.a) {
            lr<jp6, q<?, ?, ?>> lrVar = this.a;
            jp6 jp6Var = new jp6(cls, cls2, cls3);
            if (qVar == null) {
                qVar = c;
            }
            lrVar.put(jp6Var, qVar);
        }
    }
}
