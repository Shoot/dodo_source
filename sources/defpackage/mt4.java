package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: IdentityScopeMap.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0012\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0002J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR4\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R@\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u001f2\u0014\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R\"\u0010.\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lmt4;", "", "T", "", "index", "Llt4;", "o", "value", Image.TYPE_HIGH, "f", "midIndex", "valueHash", "g", Action.SCOPE_ATTRIBUTE, "", c.a, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "element", e.a, "", DateTokenConverter.CONVERTER_KEY, Image.TYPE_MEDIUM, "n", "(Ljava/lang/Object;)V", "", "<set-?>", "a", "[I", "k", "()[I", "valueOrder", "", "b", "[Ljava/lang/Object;", "l", "()[Ljava/lang/Object;", "values", "[Llt4;", "i", "()[Llt4;", "scopeSets", "I", "j", "()I", "p", "(I)V", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: mt4  reason: default package */
/* loaded from: classes.dex */
public final class mt4<T> {
    private int[] a;
    private Object[] b;
    private lt4<T>[] c;
    private int d;

    public mt4() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.a = iArr;
        this.b = new Object[50];
        this.c = new lt4[50];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(Object obj) {
        int a = f6.a(obj);
        int i = this.d - 1;
        Object[] objArr = this.b;
        int[] iArr = this.a;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = objArr[iArr[i3]];
            int a2 = f6.a(obj2);
            if (a2 < a) {
                i2 = i3 + 1;
            } else if (a2 > a) {
                i = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                return g(i3, obj, a);
            }
        }
        return -(i2 + 1);
    }

    private final int g(int i, Object obj, int i2) {
        Object[] objArr = this.b;
        int[] iArr = this.a;
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = objArr[iArr[i3]];
            if (obj2 == obj) {
                return i3;
            }
            if (f6.a(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.d;
        while (true) {
            if (i4 < i5) {
                Object obj3 = objArr[iArr[i4]];
                if (obj3 == obj) {
                    return i4;
                }
                if (f6.a(obj3) != i2) {
                    break;
                }
                i4++;
            } else {
                i4 = this.d;
                break;
            }
        }
        return -(i4 + 1);
    }

    private final lt4<T> h(Object obj) {
        int i;
        int i2 = this.d;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        lt4<T>[] lt4VarArr = this.c;
        if (i2 > 0) {
            i = f(obj);
            if (i >= 0) {
                return o(i);
            }
        } else {
            i = -1;
        }
        int i3 = -(i + 1);
        if (i2 < iArr.length) {
            int i4 = iArr[i2];
            objArr[i4] = obj;
            lt4<T> lt4Var = lt4VarArr[i4];
            if (lt4Var == null) {
                lt4Var = new lt4<>();
                lt4VarArr[i4] = lt4Var;
            }
            if (i3 < i2) {
                xr.f(iArr, iArr, i3 + 1, i3, i2);
            }
            iArr[i3] = i4;
            this.d++;
            return lt4Var;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(lt4VarArr, length);
        z65.g(copyOf, "copyOf(this, newSize)");
        lt4<T>[] lt4VarArr2 = (lt4[]) copyOf;
        lt4<T> lt4Var2 = new lt4<>();
        lt4VarArr2[i2] = lt4Var2;
        Object[] copyOf2 = Arrays.copyOf(objArr, length);
        z65.g(copyOf2, "copyOf(this, newSize)");
        copyOf2[i2] = obj;
        int[] iArr2 = new int[length];
        for (int i5 = i2 + 1; i5 < length; i5++) {
            iArr2[i5] = i5;
        }
        if (i3 < i2) {
            xr.f(iArr, iArr2, i3 + 1, i3, i2);
        }
        iArr2[i3] = i2;
        if (i3 > 0) {
            xr.k(iArr, iArr2, 0, 0, i3, 6, null);
        }
        this.c = lt4VarArr2;
        this.b = copyOf2;
        this.a = iArr2;
        this.d++;
        return lt4Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lt4<T> o(int i) {
        lt4<T> lt4Var = this.c[this.a[i]];
        z65.e(lt4Var);
        return lt4Var;
    }

    public final boolean c(Object obj, T t) {
        z65.h(obj, "value");
        z65.h(t, Action.SCOPE_ATTRIBUTE);
        return h(obj).add(t);
    }

    public final void d() {
        lt4<T>[] lt4VarArr = this.c;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int length = lt4VarArr.length;
        for (int i = 0; i < length; i++) {
            lt4<T> lt4Var = lt4VarArr[i];
            if (lt4Var != null) {
                lt4Var.clear();
            }
            iArr[i] = i;
            objArr[i] = null;
        }
        this.d = 0;
    }

    public final boolean e(Object obj) {
        z65.h(obj, "element");
        if (f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final lt4<T>[] i() {
        return this.c;
    }

    public final int j() {
        return this.d;
    }

    public final int[] k() {
        return this.a;
    }

    public final Object[] l() {
        return this.b;
    }

    public final boolean m(Object obj, T t) {
        int i;
        lt4<T> lt4Var;
        z65.h(obj, "value");
        z65.h(t, Action.SCOPE_ATTRIBUTE);
        int f = f(obj);
        int[] iArr = this.a;
        lt4<T>[] lt4VarArr = this.c;
        Object[] objArr = this.b;
        int i2 = this.d;
        if (f < 0 || (lt4Var = lt4VarArr[(i = iArr[f])]) == null) {
            return false;
        }
        boolean remove = lt4Var.remove(t);
        if (lt4Var.size() == 0) {
            int i3 = f + 1;
            if (i3 < i2) {
                xr.f(iArr, iArr, f, i3, i2);
            }
            int i4 = i2 - 1;
            iArr[i4] = i;
            objArr[i] = null;
            this.d = i4;
        }
        return remove;
    }

    public final void n(T t) {
        z65.h(t, Action.SCOPE_ATTRIBUTE);
        int[] k = k();
        lt4<T>[] i = i();
        Object[] l = l();
        int j = j();
        int i2 = 0;
        for (int i3 = 0; i3 < j; i3++) {
            int i4 = k[i3];
            lt4<T> lt4Var = i[i4];
            z65.e(lt4Var);
            lt4Var.remove(t);
            if (lt4Var.size() > 0) {
                if (i2 != i3) {
                    int i5 = k[i2];
                    k[i2] = i4;
                    k[i3] = i5;
                }
                i2++;
            }
        }
        int j2 = j();
        for (int i6 = i2; i6 < j2; i6++) {
            l[k[i6]] = null;
        }
        p(i2);
    }

    public final void p(int i) {
        this.d = i;
    }
}
