package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SimpleArrayMap.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010(\u001a\u00020\u0005¢\u0006\u0004\b)\u0010&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\b\u0010\b\u001a\u00020\u0005H\u0004J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u001a\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0011J\u0006\u0010\u0013\u001a\u00020\tJ\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\"\u0010'\u001a\u00020\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lvka;", "K", "V", "", Action.KEY_ATTRIBUTE, "", "hash", c.a, e.a, "", "a", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "g", "(I)Ljava/lang/Object;", "i", "f", "value", Image.TYPE_HIGH, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "equals", "hashCode", "", "toString", "", "[I", "hashes", "", "[Ljava/lang/Object;", "keyValues", "I", "get_size", "()I", "set_size", "(I)V", "_size", "capacity", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vka  reason: default package */
/* loaded from: classes.dex */
public final class vka<K, V> {
    private int[] a;
    private Object[] b;
    private int c;

    public vka() {
        this(0, 1, null);
    }

    public final boolean a(K k) {
        if (d(k) >= 0) {
            return true;
        }
        return false;
    }

    public final V b(K k) {
        int d = d(k);
        if (d >= 0) {
            return (V) this.b[(d << 1) + 1];
        }
        return null;
    }

    protected final int c(Object obj, int i) {
        z65.h(obj, Action.KEY_ATTRIBUTE);
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int a = bt1.a(this.a, i2, i);
        if (a < 0) {
            return a;
        }
        if (z65.c(obj, this.b[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (z65.c(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (z65.c(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj, obj.hashCode());
    }

    protected final int e() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int a = bt1.a(this.a, i, 0);
        if (a < 0) {
            return a;
        }
        if (this.b[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof vka) {
                vka vkaVar = (vka) obj;
                int i = this.c;
                if (i != vkaVar.c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    K g = g(i2);
                    V i3 = i(i2);
                    Object b = vkaVar.b(g);
                    if (i3 == null) {
                        if (b != null || !vkaVar.a(g)) {
                            return false;
                        }
                    } else if (!z65.c(i3, b)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            } else {
                int i4 = this.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    K g2 = g(i5);
                    V i6 = i(i5);
                    Object obj2 = ((Map) obj).get(g2);
                    if (i6 == null) {
                        if (obj2 != null || !((Map) obj).containsKey(g2)) {
                            return false;
                        }
                    } else if (!z65.c(i6, obj2)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        if (this.c <= 0) {
            return true;
        }
        return false;
    }

    public final K g(int i) {
        return (K) this.b[i << 1];
    }

    public final V h(K k, V v) {
        int hashCode;
        int c;
        int i = this.c;
        if (k == null) {
            c = e();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            c = c(k, hashCode);
        }
        if (c >= 0) {
            int i2 = (c << 1) + 1;
            Object[] objArr = this.b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~c;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            z65.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i4 << 1);
            z65.g(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
            if (i != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            xr.f(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.b;
            xr.h(objArr2, objArr2, i5 << 1, i3 << 1, this.c << 1);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int i;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i2 = this.c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final V i(int i) {
        return (V) this.b[(i << 1) + 1];
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append(CoreConstants.CURLY_LEFT);
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K g = g(i2);
            if (g != this) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V i3 = i(i2);
            if (i3 != this) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        String sb2 = sb.toString();
        z65.g(sb2, "buffer.toString()");
        return sb2;
    }

    public vka(int i) {
        if (i == 0) {
            this.a = bt1.a;
            this.b = bt1.b;
        } else {
            this.a = new int[i];
            this.b = new Object[i << 1];
        }
        this.c = 0;
    }

    public /* synthetic */ vka(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
