package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: SnapshotWeakSet.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR0\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lypa;", "", "T", "value", "", "hash", "b", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", c.a, "(ILjava/lang/Object;I)I", "", "a", "(Ljava/lang/Object;)Z", "I", e.a, "()I", "g", "(I)V", "size", "", "[I", DateTokenConverter.CONVERTER_KEY, "()[I", "setHashes$runtime_release", "([I)V", "hashes", "", "Le3c;", "[Le3c;", "f", "()[Le3c;", "setValues$runtime_release", "([Le3c;)V", "values", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ypa  reason: default package */
/* loaded from: classes.dex */
public final class ypa<T> {
    private int a;
    private int[] b = new int[16];
    private e3c<T>[] c = new e3c[16];

    private final int b(T t, int i) {
        T t2;
        int i2 = this.a - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.b[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 > i) {
                i2 = i4 - 1;
            } else {
                e3c<T> e3cVar = this.c[i4];
                if (e3cVar != null) {
                    t2 = e3cVar.get();
                } else {
                    t2 = null;
                }
                if (t == t2) {
                    return i4;
                }
                return c(i4, t, i);
            }
        }
        return -(i3 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        return -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int c(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.b
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            e3c<T>[] r2 = r3.c
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.a
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.b
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            e3c<T>[] r2 = r3.c
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.a
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypa.c(int, java.lang.Object, int):int");
    }

    public final boolean a(T t) {
        int i;
        z65.h(t, "value");
        int i2 = this.a;
        int a = f6.a(t);
        if (i2 > 0) {
            i = b(t, a);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i3 = -(i + 1);
        e3c<T>[] e3cVarArr = this.c;
        int length = e3cVarArr.length;
        if (i2 == length) {
            int i4 = length * 2;
            e3c<T>[] e3cVarArr2 = new e3c[i4];
            int[] iArr = new int[i4];
            int i5 = i3 + 1;
            xr.h(e3cVarArr, e3cVarArr2, i5, i3, i2);
            xr.l(this.c, e3cVarArr2, 0, 0, i3, 6, null);
            xr.f(this.b, iArr, i5, i3, i2);
            xr.k(this.b, iArr, 0, 0, i3, 6, null);
            this.c = e3cVarArr2;
            this.b = iArr;
        } else {
            int i6 = i3 + 1;
            xr.h(e3cVarArr, e3cVarArr, i6, i3, i2);
            int[] iArr2 = this.b;
            xr.f(iArr2, iArr2, i6, i3, i2);
        }
        this.c[i3] = new e3c<>(t);
        this.b[i3] = a;
        this.a++;
        return true;
    }

    public final int[] d() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    public final e3c<T>[] f() {
        return this.c;
    }

    public final void g(int i) {
        this.a = i;
    }
}
