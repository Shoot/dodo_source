package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: IdentityArrayIntMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003R$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR4\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Ljt4;", "", Action.KEY_ATTRIBUTE, "", c.a, "midIndex", "value", "valueHash", DateTokenConverter.CONVERTER_KEY, "b", "<set-?>", "a", "I", "f", "()I", "size", "", "[Ljava/lang/Object;", e.a, "()[Ljava/lang/Object;", "keys", "", "[I", "g", "()[I", "values", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jt4  reason: default package */
/* loaded from: classes.dex */
public final class jt4 {
    private int a;
    private Object[] b = new Object[4];
    private int[] c = new int[4];

    private final int c(Object obj) {
        int i = this.a - 1;
        int a = f6.a(obj);
        Object[] objArr = this.b;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = objArr[i3];
            int a2 = f6.a(obj2);
            if (a2 < a) {
                i2 = i3 + 1;
            } else if (a2 > a) {
                i = i3 - 1;
            } else if (obj2 == obj) {
                return i3;
            } else {
                return d(i3, obj, a);
            }
        }
        return -(i2 + 1);
    }

    private final int d(int i, Object obj, int i2) {
        Object obj2;
        Object[] objArr = this.b;
        int i3 = this.a;
        for (int i4 = i - 1; -1 < i4; i4--) {
            Object obj3 = objArr[i4];
            if (obj3 == obj) {
                return i4;
            }
            if (f6.a(obj3) != i2) {
                break;
            }
        }
        do {
            i++;
            if (i < i3) {
                obj2 = objArr[i];
                if (obj2 == obj) {
                    return i;
                }
            } else {
                return -(i3 + 1);
            }
        } while (f6.a(obj2) == i2);
        return -(i + 1);
    }

    public final int b(Object obj, int i) {
        int i2;
        z65.h(obj, Action.KEY_ATTRIBUTE);
        int[] iArr = this.c;
        if (this.a > 0) {
            i2 = c(obj);
            if (i2 >= 0) {
                int i3 = iArr[i2];
                iArr[i2] = i;
                return i3;
            }
        } else {
            i2 = -1;
        }
        int i4 = -(i2 + 1);
        Object[] objArr = this.b;
        int i5 = this.a;
        if (i5 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i6 = i4 + 1;
            xr.h(objArr, objArr2, i6, i4, i5);
            xr.f(iArr, iArr2, i6, i4, i5);
            xr.l(objArr, objArr2, 0, 0, i4, 6, null);
            xr.k(iArr, iArr2, 0, 0, i4, 6, null);
            this.b = objArr2;
            this.c = iArr2;
        } else {
            int i7 = i4 + 1;
            xr.h(objArr, objArr, i7, i4, i5);
            xr.f(iArr, iArr, i7, i4, i5);
        }
        this.b[i4] = obj;
        this.c[i4] = i;
        this.a++;
        return -1;
    }

    public final Object[] e() {
        return this.b;
    }

    public final int f() {
        return this.a;
    }

    public final int[] g() {
        return this.c;
    }
}
