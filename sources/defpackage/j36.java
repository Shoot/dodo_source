package defpackage;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: LruCache.java */
/* renamed from: j36  reason: default package */
/* loaded from: classes.dex */
public class j36<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public j36(int i) {
        if (i > 0) {
            this.c = i;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int g(K k, V v) {
        int h = h(k, v);
        if (h >= 0) {
            return h;
        }
        throw new IllegalStateException("Negative size: " + k + ContainerUtils.KEY_VALUE_DELIMITER + v);
    }

    protected V a(@NonNull K k) {
        return null;
    }

    public final void c() {
        j(-1);
    }

    public final V d(@NonNull K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                try {
                    V v = this.a.get(k);
                    if (v != null) {
                        this.g++;
                        return v;
                    }
                    this.h++;
                    V a = a(k);
                    if (a == null) {
                        return null;
                    }
                    synchronized (this) {
                        try {
                            this.e++;
                            put = this.a.put(k, a);
                            if (put != null) {
                                this.a.put(k, put);
                            } else {
                                this.b += g(k, a);
                            }
                        } finally {
                        }
                    }
                    if (put != null) {
                        b(false, k, a, put);
                        return put;
                    }
                    j(this.c);
                    return a;
                } finally {
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    public final V e(@NonNull K k, @NonNull V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this) {
                try {
                    this.d++;
                    this.b += g(k, v);
                    put = this.a.put(k, v);
                    if (put != null) {
                        this.b -= g(k, put);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                b(false, k, put, v);
            }
            j(this.c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public final V f(@NonNull K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                try {
                    remove = this.a.remove(k);
                    if (remove != null) {
                        this.b -= g(k, remove);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (remove != null) {
                b(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    protected int h(@NonNull K k, @NonNull V v) {
        return 1;
    }

    public final synchronized Map<K, V> i() {
        return new LinkedHashMap(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap<K, V> r0 = r4.a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r4.b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r5 = move-exception
            goto L74
        L14:
            int r0 = r4.b     // Catch: java.lang.Throwable -> L12
            if (r0 <= r5) goto L53
            java.util.LinkedHashMap<K, V> r0 = r4.a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap<K, V> r0 = r4.a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, V> r2 = r4.a     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r4.b     // Catch: java.lang.Throwable -> L12
            int r3 = r4.g(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r3
            r4.b = r2     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f     // Catch: java.lang.Throwable -> L12
            r3 = 1
            int r2 = r2 + r3
            r4.f = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L0
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r5     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j36.j(int):void");
    }

    public final synchronized String toString() {
        int i;
        try {
            int i2 = this.g;
            int i3 = this.h + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i));
    }

    protected void b(boolean z, @NonNull K k, @NonNull V v, V v2) {
    }
}
