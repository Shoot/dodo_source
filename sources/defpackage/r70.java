package defpackage;

import defpackage.df8;
import java.util.Queue;
/* compiled from: BaseKeyPool.java */
/* renamed from: r70  reason: default package */
/* loaded from: classes.dex */
abstract class r70<T extends df8> {
    private final Queue<T> a = vub.g(20);

    abstract T a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public T b() {
        T poll = this.a.poll();
        if (poll == null) {
            return a();
        }
        return poll;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
