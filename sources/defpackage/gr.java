package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: ArrayDeque.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 :*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00012B\t\b\u0016¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u001e\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u001e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0018\u0010\u001f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010$\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010(\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010 J\u0016\u0010)\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0016\u0010*\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J)\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010,\"\u0004\b\u0001\u0010\u000b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000,H\u0016¢\u0006\u0004\b.\u00101R\u0016\u00104\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010<\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lgr;", "E", "Lw1;", "", "minCapacity", "", "P", "newCapacity", "G", "index", "W", "T", "Q", "H", "internalIndex", "", "elements", "", "isEmpty", "element", "u", "(Ljava/lang/Object;)V", "x", "Z", "()Ljava/lang/Object;", "e0", "h0", CartQueueItemEntity.OPERATION_ADD, "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", CartQueueItemEntity.OPERATION_REMOVE, "k", "removeAll", "retainAll", "clear", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "a", "I", "head", "b", "[Ljava/lang/Object;", "elementData", "<set-?>", c.a, DateTokenConverter.CONVERTER_KEY, "()I", "size", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: gr  reason: default package */
/* loaded from: classes3.dex */
public final class gr<E> extends w1<E> {
    public static final a d = new a(null);
    private static final Object[] e = new Object[0];
    private int a;
    private Object[] b = e;
    private int c;

    /* compiled from: ArrayDeque.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lgr$a;", "", "", "defaultMinCapacity", "I", "", "emptyElementData", "[Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gr$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void E(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = size() + collection.size();
    }

    private final void G(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.b;
        xr.h(objArr2, objArr, 0, this.a, objArr2.length);
        Object[] objArr3 = this.b;
        int length = objArr3.length;
        int i2 = this.a;
        xr.h(objArr3, objArr, length - i2, 0, i2);
        this.a = 0;
        this.b = objArr;
    }

    private final int H(int i) {
        int F;
        if (i == 0) {
            F = yr.F(this.b);
            return F;
        }
        return i - 1;
    }

    private final void P(int i) {
        int e2;
        if (i >= 0) {
            Object[] objArr = this.b;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == e) {
                e2 = i.e(i, 10);
                this.b = new Object[e2];
                return;
            }
            G(n1.a.e(objArr.length, i));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final int Q(int i) {
        int F;
        F = yr.F(this.b);
        if (i == F) {
            return 0;
        }
        return i + 1;
    }

    private final int T(int i) {
        if (i < 0) {
            return i + this.b.length;
        }
        return i;
    }

    private final int W(int i) {
        Object[] objArr = this.b;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final E Z() {
        if (!isEmpty()) {
            Object[] objArr = this.b;
            int i = this.a;
            E e2 = (E) objArr[i];
            objArr[i] = null;
            this.a = Q(i);
            this.c = size() - 1;
            return e2;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        x(e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        z65.h(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        P(size() + collection.size());
        E(W(this.a + size()), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int W = W(this.a + size());
        int i = this.a;
        if (i < W) {
            xr.q(this.b, null, i, W);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            xr.q(objArr, null, this.a, objArr.length);
            xr.q(this.b, null, 0, W);
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w1
    public int d() {
        return this.c;
    }

    public final E e0() {
        if (isEmpty()) {
            return null;
        }
        return Z();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        n1.a.b(i, size());
        return (E) this.b[W(this.a + i)];
    }

    public final E h0() {
        int n;
        if (!isEmpty()) {
            int i = this.a;
            n = kc1.n(this);
            int W = W(i + n);
            Object[] objArr = this.b;
            E e2 = (E) objArr[W];
            objArr[W] = null;
            this.c = size() - 1;
            return e2;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int W = W(this.a + size());
        int i2 = this.a;
        if (i2 < W) {
            while (i2 < W) {
                if (z65.c(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 >= W) {
            int length = this.b.length;
            while (true) {
                if (i2 < length) {
                    if (z65.c(obj, this.b[i2])) {
                        i = this.a;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < W; i3++) {
                        if (z65.c(obj, this.b[i3])) {
                            i2 = i3 + this.b.length;
                            i = this.a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w1
    public E k(int i) {
        int n;
        int n2;
        n1.a.b(i, size());
        n = kc1.n(this);
        if (i == n) {
            return h0();
        }
        if (i == 0) {
            return Z();
        }
        int W = W(this.a + i);
        E e2 = (E) this.b[W];
        if (i < (size() >> 1)) {
            int i2 = this.a;
            if (W >= i2) {
                Object[] objArr = this.b;
                xr.h(objArr, objArr, i2 + 1, i2, W);
            } else {
                Object[] objArr2 = this.b;
                xr.h(objArr2, objArr2, 1, 0, W);
                Object[] objArr3 = this.b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.a;
                xr.h(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.b;
            int i4 = this.a;
            objArr4[i4] = null;
            this.a = Q(i4);
        } else {
            int i5 = this.a;
            n2 = kc1.n(this);
            int W2 = W(i5 + n2);
            if (W <= W2) {
                Object[] objArr5 = this.b;
                xr.h(objArr5, objArr5, W, W + 1, W2 + 1);
            } else {
                Object[] objArr6 = this.b;
                xr.h(objArr6, objArr6, W, W + 1, objArr6.length);
                Object[] objArr7 = this.b;
                objArr7[objArr7.length - 1] = objArr7[0];
                xr.h(objArr7, objArr7, 0, 1, W2 + 1);
            }
            this.b[W2] = null;
        }
        this.c = size() - 1;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int F;
        int i;
        int W = W(this.a + size());
        int i2 = this.a;
        if (i2 < W) {
            F = W - 1;
            if (i2 <= F) {
                while (!z65.c(obj, this.b[F])) {
                    if (F != i2) {
                        F--;
                    }
                }
                i = this.a;
                return F - i;
            }
            return -1;
        }
        if (i2 > W) {
            int i3 = W - 1;
            while (true) {
                if (-1 >= i3) {
                    F = yr.F(this.b);
                    int i4 = this.a;
                    if (i4 <= F) {
                        while (!z65.c(obj, this.b[F])) {
                            if (F != i4) {
                                F--;
                            }
                        }
                        i = this.a;
                    }
                } else if (z65.c(obj, this.b[i3])) {
                    F = i3 + this.b.length;
                    i = this.a;
                    break;
                } else {
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        int W;
        z65.h(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int W2 = W(this.a + size());
            int i = this.a;
            if (i < W2) {
                W = i;
                while (i < W2) {
                    Object obj = this.b[i];
                    if (!collection.contains(obj)) {
                        this.b[W] = obj;
                        W++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                xr.q(this.b, null, W, W2);
            } else {
                int length = this.b.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                W = W(i2);
                for (int i3 = 0; i3 < W2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.b[W] = obj3;
                        W = Q(W);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.c = T(W - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        int W;
        z65.h(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int W2 = W(this.a + size());
            int i = this.a;
            if (i < W2) {
                W = i;
                while (i < W2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        this.b[W] = obj;
                        W++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                xr.q(this.b, null, W, W2);
            } else {
                int length = this.b.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                W = W(i2);
                for (int i3 = 0; i3 < W2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[W] = obj3;
                        W = Q(W);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.c = T(W - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e2) {
        n1.a.b(i, size());
        int W = W(this.a + i);
        Object[] objArr = this.b;
        E e3 = (E) objArr[W];
        objArr[W] = e2;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        Object[] g;
        z65.h(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) vr.a(tArr, size());
        }
        int W = W(this.a + size());
        int i = this.a;
        if (i < W) {
            xr.l(this.b, tArr, 0, i, W, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            xr.h(objArr, tArr, 0, this.a, objArr.length);
            Object[] objArr2 = this.b;
            xr.h(objArr2, tArr, objArr2.length - this.a, 0, W);
        }
        g = jc1.g(size(), tArr);
        return (T[]) g;
    }

    public final void u(E e2) {
        P(size() + 1);
        int H = H(this.a);
        this.a = H;
        this.b[H] = e2;
        this.c = size() + 1;
    }

    public final void x(E e2) {
        P(size() + 1);
        this.b[W(this.a + size())] = e2;
        this.c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e2) {
        n1.a.c(i, size());
        if (i == size()) {
            x(e2);
        } else if (i == 0) {
            u(e2);
        } else {
            P(size() + 1);
            int W = W(this.a + i);
            if (i < ((size() + 1) >> 1)) {
                int H = H(W);
                int H2 = H(this.a);
                int i2 = this.a;
                if (H < i2) {
                    Object[] objArr = this.b;
                    xr.h(objArr, objArr, i2 - 1, i2, objArr.length);
                    Object[] objArr2 = this.b;
                    objArr2[objArr2.length - 1] = objArr2[0];
                    xr.h(objArr2, objArr2, 0, 1, H + 1);
                } else {
                    Object[] objArr3 = this.b;
                    objArr3[H2] = objArr3[i2];
                    xr.h(objArr3, objArr3, i2, i2 + 1, H + 1);
                }
                this.b[H] = e2;
                this.a = H2;
            } else {
                int W2 = W(this.a + size());
                if (W < W2) {
                    Object[] objArr4 = this.b;
                    xr.h(objArr4, objArr4, W + 1, W, W2);
                } else {
                    Object[] objArr5 = this.b;
                    xr.h(objArr5, objArr5, 1, 0, W2);
                    Object[] objArr6 = this.b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    xr.h(objArr6, objArr6, W + 1, W, objArr6.length - 1);
                }
                this.b[W] = e2;
            }
            this.c = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        z65.h(collection, "elements");
        n1.a.c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        P(size() + collection.size());
        int W = W(this.a + size());
        int W2 = W(this.a + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.a;
            int i3 = i2 - size;
            if (W2 < i2) {
                Object[] objArr = this.b;
                xr.h(objArr, objArr, i3, i2, objArr.length);
                if (size >= W2) {
                    Object[] objArr2 = this.b;
                    xr.h(objArr2, objArr2, objArr2.length - size, 0, W2);
                } else {
                    Object[] objArr3 = this.b;
                    xr.h(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.b;
                    xr.h(objArr4, objArr4, 0, size, W2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.b;
                xr.h(objArr5, objArr5, i3, i2, W2);
            } else {
                Object[] objArr6 = this.b;
                i3 += objArr6.length;
                int i4 = W2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    xr.h(objArr6, objArr6, i3, i2, W2);
                } else {
                    xr.h(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.b;
                    xr.h(objArr7, objArr7, 0, this.a + length, W2);
                }
            }
            this.a = i3;
            E(T(W2 - size), collection);
        } else {
            int i5 = W2 + size;
            if (W2 >= W) {
                Object[] objArr8 = this.b;
                xr.h(objArr8, objArr8, size, 0, W);
                Object[] objArr9 = this.b;
                if (i5 >= objArr9.length) {
                    xr.h(objArr9, objArr9, i5 - objArr9.length, W2, objArr9.length);
                } else {
                    xr.h(objArr9, objArr9, 0, objArr9.length - size, objArr9.length);
                    Object[] objArr10 = this.b;
                    xr.h(objArr10, objArr10, i5, W2, objArr10.length - size);
                }
            } else {
                int i6 = size + W;
                Object[] objArr11 = this.b;
                if (i6 <= objArr11.length) {
                    xr.h(objArr11, objArr11, i5, W2, W);
                } else if (i5 >= objArr11.length) {
                    xr.h(objArr11, objArr11, i5 - objArr11.length, W2, W);
                } else {
                    int length2 = W - (i6 - objArr11.length);
                    xr.h(objArr11, objArr11, 0, length2, W);
                    Object[] objArr12 = this.b;
                    xr.h(objArr12, objArr12, i5, W2, length2);
                }
            }
            E(W2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
