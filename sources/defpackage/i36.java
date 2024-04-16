package defpackage;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: LruCache.java */
/* renamed from: i36  reason: default package */
/* loaded from: classes.dex */
public class i36<T, Y> {
    private final Map<T, a<Y>> a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LruCache.java */
    /* renamed from: i36$a */
    /* loaded from: classes.dex */
    public static final class a<Y> {
        final Y a;
        final int b;

        a(Y y, int i) {
            this.a = y;
            this.b = i;
        }
    }

    public i36(long j) {
        this.b = j;
        this.c = j;
    }

    private void f() {
        m(this.c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Y g(@NonNull T t) {
        Y y;
        a<Y> aVar = this.a.get(t);
        if (aVar != null) {
            y = aVar.a;
        } else {
            y = null;
        }
        return y;
    }

    public synchronized long h() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int i(Y y) {
        return 1;
    }

    public synchronized Y k(@NonNull T t, Y y) {
        a<Y> aVar;
        int i = i(y);
        long j = i;
        Y y2 = null;
        if (j >= this.c) {
            j(t, y);
            return null;
        }
        if (y != null) {
            this.d += j;
        }
        Map<T, a<Y>> map = this.a;
        if (y == null) {
            aVar = null;
        } else {
            aVar = new a<>(y, i);
        }
        a<Y> put = map.put(t, aVar);
        if (put != null) {
            this.d -= put.b;
            if (!put.a.equals(y)) {
                j(t, put.a);
            }
        }
        f();
        if (put != null) {
            y2 = put.a;
        }
        return y2;
    }

    public synchronized Y l(@NonNull T t) {
        a<Y> remove = this.a.remove(t);
        if (remove == null) {
            return null;
        }
        this.d -= remove.b;
        return remove.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void m(long j) {
        while (this.d > j) {
            Iterator<Map.Entry<T, a<Y>>> it = this.a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.d -= value.b;
            T key = next.getKey();
            it.remove();
            j(key, value.a);
        }
    }

    protected void j(@NonNull T t, Y y) {
    }
}
