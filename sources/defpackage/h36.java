package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: LruCache.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0017\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\nJ1\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0018\u0010\bJ\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR0\u0010\"\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00028\u00000#j\b\u0012\u0004\u0012\u00028\u0000`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R$\u0010+\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068G@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010(¨\u00063"}, d2 = {"Lh36;", "K", "V", "", Action.KEY_ATTRIBUTE, "value", "", "g", "(Ljava/lang/Object;Ljava/lang/Object;)I", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", e.a, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "maxSize", "", "j", "f", "", "evicted", "oldValue", "newValue", c.a, "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "b", "i", "", "toString", "Lw3b;", "a", "Lw3b;", "monitor", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "keySet", "<set-?>", "I", Image.TYPE_HIGH, "()I", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: h36  reason: default package */
/* loaded from: classes.dex */
public class h36<K, V> {
    private final w3b a = u3b.a();
    private final HashMap<K, V> b;
    private final LinkedHashSet<K> c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public h36(int i) {
        if (i > 0) {
            this.e = i;
            this.b = new HashMap<>(0, 0.75f);
            this.c = new LinkedHashSet<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final int g(K k, V v) {
        int i = i(k, v);
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(("Negative size: " + k + '=' + v).toString());
    }

    protected V b(K k) {
        return null;
    }

    public final V d(K k) {
        synchronized (this.a) {
            V v = this.b.get(k);
            if (v != null) {
                this.c.remove(k);
                this.c.add(k);
                this.i++;
                return v;
            }
            this.j++;
            V b = b(k);
            if (b == null) {
                return null;
            }
            synchronized (this.a) {
                try {
                    this.g++;
                    V put = this.b.put(k, b);
                    this.c.remove(k);
                    this.c.add(k);
                    if (put != null) {
                        this.b.put(k, put);
                        v = put;
                    } else {
                        this.d = h() + g(k, b);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                c(false, k, b, v);
                return v;
            }
            j(this.e);
            return b;
        }
    }

    public final V e(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this.a) {
                try {
                    this.f++;
                    this.d = h() + g(k, v);
                    put = this.b.put(k, v);
                    if (put != null) {
                        this.d = h() - g(k, put);
                    }
                    if (this.c.contains(k)) {
                        this.c.remove(k);
                    }
                    this.c.add(k);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                c(false, k, put, v);
            }
            j(this.e);
            return put;
        }
        throw null;
    }

    public final V f(K k) {
        V remove;
        k.getClass();
        synchronized (this.a) {
            try {
                remove = this.b.remove(k);
                this.c.remove(k);
                if (remove != null) {
                    this.d = h() - g(k, remove);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            c(false, k, remove, null);
        }
        return remove;
    }

    public final int h() {
        int i;
        synchronized (this.a) {
            i = this.d;
        }
        return i;
    }

    protected int i(K k, V v) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r8) {
        /*
            r7 = this;
        L0:
            w3b r0 = r7.a
            monitor-enter(r0)
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L8d
            java.util.HashMap<K, V> r1 = r7.b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8d
            goto L1b
        L18:
            r8 = move-exception
            goto L95
        L1b:
            java.util.HashMap<K, V> r1 = r7.b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet<K> r2 = r7.c     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L8d
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L78
            java.util.HashMap<K, V> r1 = r7.b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L78
            java.util.LinkedHashSet<K> r1 = r7.c     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = defpackage.ic1.Y(r1)     // Catch: java.lang.Throwable -> L18
            java.util.HashMap<K, V> r4 = r7.b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L70
            java.util.HashMap<K, V> r5 = r7.b     // Catch: java.lang.Throwable -> L18
            java.util.Map r5 = defpackage.unb.d(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet<K> r5 = r7.c     // Catch: java.lang.Throwable -> L18
            java.util.Collection r5 = defpackage.unb.a(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r5 = r7.h()     // Catch: java.lang.Throwable -> L18
            defpackage.z65.e(r1)     // Catch: java.lang.Throwable -> L18
            defpackage.z65.e(r4)     // Catch: java.lang.Throwable -> L18
            int r6 = r7.g(r1, r4)     // Catch: java.lang.Throwable -> L18
            int r5 = r5 - r6
            r7.d = r5     // Catch: java.lang.Throwable -> L18
            int r5 = r7.h     // Catch: java.lang.Throwable -> L18
            int r5 = r5 + r2
            r7.h = r5     // Catch: java.lang.Throwable -> L18
            goto L7a
        L70:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L78:
            r1 = r3
            r4 = r1
        L7a:
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            if (r1 != 0) goto L82
            if (r4 != 0) goto L82
            return
        L82:
            defpackage.z65.e(r1)
            defpackage.z65.e(r4)
            r7.c(r2, r1, r4, r3)
            goto L0
        L8d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L95:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h36.j(int):void");
    }

    public String toString() {
        int i;
        String str;
        synchronized (this.a) {
            try {
                int i2 = this.i;
                int i3 = this.j + i2;
                if (i3 != 0) {
                    i = (i2 * 100) / i3;
                } else {
                    i = 0;
                }
                str = "LruCache[maxSize=" + this.e + ",hits=" + this.i + ",misses=" + this.j + ",hitRate=" + i + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    protected void c(boolean z, K k, V v, V v2) {
    }
}
