package defpackage;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ModelToResourceClassCache.java */
/* renamed from: pm6  reason: default package */
/* loaded from: classes.dex */
public class pm6 {
    private final AtomicReference<jp6> a = new AtomicReference<>();
    private final lr<jp6, List<Class<?>>> b = new lr<>();

    public List<Class<?>> a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        jp6 andSet = this.a.getAndSet(null);
        if (andSet == null) {
            andSet = new jp6(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.b) {
            list = this.b.get(andSet);
        }
        this.a.set(andSet);
        return list;
    }

    public void b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new jp6(cls, cls2, cls3), list);
        }
    }
}
