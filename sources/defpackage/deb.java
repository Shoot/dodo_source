package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.eeb;
import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: ThreadSafeHeap.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b&\u0010'J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR$\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\u000f\u0010\nR\u0011\u0010%\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Ldeb;", "Leeb;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "i", "", "l", "(I)V", "k", "", "f", "()[Leeb;", "j", Image.TYPE_MEDIUM, "(II)V", e.a, "()Leeb;", "node", "", "g", "(Leeb;)Z", "b", "index", Image.TYPE_HIGH, "(I)Leeb;", "a", "(Leeb;)V", "[Leeb;", "value", c.a, "()I", "size", DateTokenConverter.CONVERTER_KEY, "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: deb  reason: default package */
/* loaded from: classes3.dex */
public class deb<T extends eeb & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;
    private T[] a;

    private final T[] f() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new eeb[4];
            this.a = tArr2;
            return tArr2;
        } else if (c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
            z65.g(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((eeb[]) copyOf);
            this.a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    private final void j(int i) {
        this._size = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            return
        Lb:
            T extends eeb & java.lang.Comparable<? super T>[] r2 = r5.a
            defpackage.z65.e(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            defpackage.z65.e(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            defpackage.z65.e(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            defpackage.z65.e(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            defpackage.z65.e(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.m(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deb.k(int):void");
    }

    private final void l(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            z65.e(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            z65.e(t);
            T t2 = tArr[i];
            z65.e(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m(i, i2);
            i = i2;
        }
    }

    private final void m(int i, int i2) {
        T[] tArr = this.a;
        z65.e(tArr);
        T t = tArr[i2];
        z65.e(t);
        T t2 = tArr[i];
        z65.e(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }

    public final void a(T t) {
        t.i(this);
        T[] f = f();
        int c = c();
        j(c + 1);
        f[c] = t;
        t.setIndex(c);
        l(c);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        if (c() == 0) {
            return true;
        }
        return false;
    }

    public final T e() {
        T b;
        synchronized (this) {
            b = b();
        }
        return b;
    }

    public final boolean g(T t) {
        boolean z;
        synchronized (this) {
            if (t.g() == null) {
                z = false;
            } else {
                h(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    public final T h(int i) {
        T[] tArr = this.a;
        z65.e(tArr);
        j(c() - 1);
        if (i < c()) {
            m(i, c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                z65.e(t);
                T t2 = tArr[i2];
                z65.e(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m(i, i2);
                    l(i2);
                }
            }
            k(i);
        }
        T t3 = tArr[c()];
        z65.e(t3);
        t3.i(null);
        t3.setIndex(-1);
        tArr[c()] = null;
        return t3;
    }

    public final T i() {
        T t;
        synchronized (this) {
            if (c() > 0) {
                t = h(0);
            } else {
                t = null;
            }
        }
        return t;
    }
}
