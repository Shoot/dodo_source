package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: ArrayQueue.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0017"}, d2 = {"Lnr;", "", "T", "", "b", "element", "a", "(Ljava/lang/Object;)V", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "", "[Ljava/lang/Object;", "elements", "", "I", "head", c.a, "tail", "", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: nr  reason: default package */
/* loaded from: classes3.dex */
public class nr<T> {
    private Object[] a = new Object[16];
    private int b;
    private int c;

    private final void b() {
        Object[] objArr = this.a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        xr.l(objArr, objArr2, 0, this.b, 0, 10, null);
        Object[] objArr3 = this.a;
        int length2 = objArr3.length;
        int i = this.b;
        xr.l(objArr3, objArr2, length2 - i, 0, i, 4, null);
        this.a = objArr2;
        this.b = 0;
        this.c = length;
    }

    public final void a(T t) {
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.c = length;
        if (length == this.b) {
            b();
        }
    }

    public final boolean c() {
        if (this.b == this.c) {
            return true;
        }
        return false;
    }

    public final T d() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        Object[] objArr = this.a;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.b = (i + 1) & (objArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
