package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazySet.java */
/* renamed from: ao5  reason: default package */
/* loaded from: classes2.dex */
public class ao5<T> implements bs8<Set<T>> {
    private volatile Set<T> b = null;
    private volatile Set<bs8<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());

    ao5(Collection<bs8<T>> collection) {
        this.a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ao5<?> b(Collection<bs8<?>> collection) {
        return new ao5<>((Set) collection);
    }

    private synchronized void d() {
        try {
            for (bs8<T> bs8Var : this.a) {
                this.b.add(bs8Var.get());
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(bs8<T> bs8Var) {
        try {
            if (this.b == null) {
                this.a.add(bs8Var);
            } else {
                this.b.add(bs8Var.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.bs8
    /* renamed from: c */
    public Set<T> get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
