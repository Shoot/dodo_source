package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: IdentityArrayMap.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0010\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\b\b\u0002\u0010#\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u000fJ\u0006\u0010\u0015\u001a\u00020\u0011R4\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR4\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR$\u0010\"\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lkt4;", "", "Key", "Value", Action.KEY_ATTRIBUTE, "", DateTokenConverter.CONVERTER_KEY, "midIndex", "keyHash", e.a, "", "j", c.a, "(Ljava/lang/Object;)Z", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "", "l", "(Ljava/lang/Object;Ljava/lang/Object;)V", "k", "b", "", "<set-?>", "a", "[Ljava/lang/Object;", "g", "()[Ljava/lang/Object;", "keys", "i", "values", "I", Image.TYPE_HIGH, "()I", "size", "capacity", "<init>", "(I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: kt4  reason: default package */
/* loaded from: classes.dex */
public final class kt4<Key, Value> {
    private Object[] a;
    private Object[] b;
    private int c;

    public kt4(int i) {
        this.a = new Object[i];
        this.b = new Object[i];
    }

    private final int d(Object obj) {
        int a = f6.a(obj);
        int i = this.c - 1;
        Object[] objArr = this.a;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = objArr[i3];
            int a2 = f6.a(obj2);
            if (a2 < a) {
                i2 = i3 + 1;
            } else if (a2 > a) {
                i = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                return e(i3, obj, a);
            }
        }
        return -(i2 + 1);
    }

    private final int e(int i, Object obj, int i2) {
        Object obj2;
        Object[] objArr = this.a;
        int i3 = this.c;
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

    public final void b() {
        this.c = 0;
        xr.s(this.a, null, 0, 0, 6, null);
        xr.s(this.b, null, 0, 0, 6, null);
    }

    public final boolean c(Key key) {
        z65.h(key, Action.KEY_ATTRIBUTE);
        if (d(key) >= 0) {
            return true;
        }
        return false;
    }

    public final Value f(Key key) {
        z65.h(key, Action.KEY_ATTRIBUTE);
        int d = d(key);
        if (d >= 0) {
            return (Value) this.b[d];
        }
        return null;
    }

    public final Object[] g() {
        return this.a;
    }

    public final int h() {
        return this.c;
    }

    public final Object[] i() {
        return this.b;
    }

    public final boolean j() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    public final Value k(Key key) {
        z65.h(key, Action.KEY_ATTRIBUTE);
        int d = d(key);
        if (d < 0) {
            return null;
        }
        Object[] objArr = this.b;
        Value value = (Value) objArr[d];
        int i = this.c;
        Object[] objArr2 = this.a;
        int i2 = d + 1;
        xr.h(objArr2, objArr2, d, i2, i);
        xr.h(objArr, objArr, d, i2, i);
        int i3 = i - 1;
        objArr2[i3] = null;
        objArr[i3] = null;
        this.c = i3;
        return value;
    }

    public final void l(Key key, Value value) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        z65.h(key, Action.KEY_ATTRIBUTE);
        Object[] objArr3 = this.a;
        Object[] objArr4 = this.b;
        int i = this.c;
        int d = d(key);
        if (d >= 0) {
            objArr4[d] = value;
            return;
        }
        int i2 = -(d + 1);
        if (i == objArr3.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            objArr = new Object[i * 2];
        } else {
            objArr = objArr3;
        }
        int i3 = i2 + 1;
        xr.h(objArr3, objArr, i3, i2, i);
        if (z) {
            xr.l(objArr3, objArr, 0, 0, i2, 6, null);
        }
        objArr[i2] = key;
        this.a = objArr;
        if (z) {
            objArr2 = new Object[i * 2];
        } else {
            objArr2 = objArr4;
        }
        xr.h(objArr4, objArr2, i3, i2, i);
        if (z) {
            xr.l(objArr4, objArr2, 0, 0, i2, 6, null);
        }
        objArr2[i2] = value;
        this.b = objArr2;
        this.c++;
    }

    public /* synthetic */ kt4(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
