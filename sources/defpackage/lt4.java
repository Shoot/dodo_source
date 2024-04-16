package defpackage;

import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: IdentityArraySet.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0014\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0006\u0010\u0015\u001a\u00020\u000bJ\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\rJ\u0016\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0016R$\u0010\"\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R4\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Llt4;", "", "T", "", "value", "", Image.TYPE_HIGH, "midIndex", "valueHash", "k", "element", "", "contains", "(Ljava/lang/Object;)Z", CartQueueItemEntity.OPERATION_ADD, "", "clear", "", "collection", "g", "isEmpty", "u", CartQueueItemEntity.OPERATION_REMOVE, "elements", "containsAll", "", "iterator", "", "toString", "<set-?>", "a", "I", "p", "()I", "size", "", "b", "[Ljava/lang/Object;", "t", "()[Ljava/lang/Object;", "values", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: lt4  reason: default package */
/* loaded from: classes.dex */
public final class lt4<T> implements Set<T>, be5 {
    private int a;
    private Object[] b = new Object[16];

    /* compiled from: IdentityArraySet.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"lt4$a", "", "", "hasNext", StatisticManager.NEXT, "()Ljava/lang/Object;", "", "a", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: lt4$a */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, be5 {
        private int a;
        final /* synthetic */ lt4<T> b;

        a(lt4<T> lt4Var) {
            this.b = lt4Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a < this.b.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Object[] t = this.b.t();
            int i = this.a;
            this.a = i + 1;
            T t2 = (T) t[i];
            z65.f(t2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: IdentityArraySet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: lt4$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<T, CharSequence> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(T t) {
            z65.h(t, "it");
            return t.toString();
        }
    }

    private final int h(Object obj) {
        int size = size() - 1;
        int a2 = f6.a(obj);
        Object[] objArr = this.b;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            Object obj2 = objArr[i2];
            int a3 = f6.a(obj2);
            if (a3 < a2) {
                i = i2 + 1;
            } else if (a3 > a2) {
                size = i2 - 1;
            } else if (obj2 == obj) {
                return i2;
            } else {
                return k(i2, obj, a2);
            }
        }
        return -(i + 1);
    }

    private final int k(int i, Object obj, int i2) {
        Object obj2;
        Object[] objArr = this.b;
        int size = size();
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj3 = objArr[i3];
            if (obj3 == obj) {
                return i3;
            }
            if (f6.a(obj3) != i2) {
                break;
            }
        }
        do {
            i++;
            if (i < size) {
                obj2 = objArr[i];
                if (obj2 == obj) {
                    return i;
                }
            } else {
                return -(size + 1);
            }
        } while (f6.a(obj2) == i2);
        return -(i + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        int i;
        z65.h(t, "value");
        int size = size();
        Object[] objArr = this.b;
        if (size > 0) {
            i = h(t);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        if (size != objArr.length) {
            xr.h(objArr, objArr, i2 + 1, i2, size);
        } else {
            Object[] objArr2 = new Object[objArr.length * 2];
            xr.h(objArr, objArr2, i2 + 1, i2, size);
            xr.l(objArr, objArr2, 0, 0, i2, 6, null);
            this.b = objArr2;
        }
        this.b[i2] = t;
        this.a = size() + 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        xr.s(this.b, null, 0, 0, 6, null);
        this.a = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null || h(obj) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void g(Collection<? extends T> collection) {
        boolean z;
        boolean z2;
        Object[] objArr;
        int i;
        Object obj;
        int i2;
        z65.h(collection, "collection");
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof lt4)) {
            for (T t : collection) {
                add(t);
            }
            return;
        }
        Object[] objArr2 = this.b;
        lt4 lt4Var = (lt4) collection;
        Object[] objArr3 = lt4Var.b;
        int size = size();
        int size2 = lt4Var.size();
        int i3 = size + size2;
        if (this.b.length < i3) {
            z = true;
        } else {
            z = false;
        }
        if (size != 0 && f6.a(objArr2[size - 1]) >= f6.a(objArr3[0])) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && z2) {
            xr.h(objArr3, objArr2, size, 0, size2);
            this.a = size() + size2;
            return;
        }
        if (z) {
            if (size > size2) {
                i2 = size * 2;
            } else {
                i2 = size2 * 2;
            }
            objArr = new Object[i2];
        } else {
            objArr = objArr2;
        }
        int i4 = size - 1;
        int i5 = size2 - 1;
        int i6 = i3 - 1;
        while (true) {
            if (i4 < 0 && i5 < 0) {
                break;
            }
            if (i4 < 0) {
                i = i5 - 1;
                obj = objArr3[i5];
            } else if (i5 < 0) {
                i = i5;
                obj = objArr2[i4];
                i4--;
            } else {
                Object obj2 = objArr2[i4];
                Object obj3 = objArr3[i5];
                int a2 = f6.a(obj2);
                int a3 = f6.a(obj3);
                if (a2 > a3) {
                    i4--;
                } else {
                    if (a2 >= a3) {
                        if (obj2 == obj3) {
                            i4--;
                            i5--;
                        } else {
                            int i7 = i4 - 1;
                            while (i7 >= 0) {
                                int i8 = i7 - 1;
                                Object obj4 = objArr2[i7];
                                if (f6.a(obj4) != a3) {
                                    break;
                                } else if (obj3 == obj4) {
                                    i5--;
                                    break;
                                } else {
                                    i7 = i8;
                                }
                            }
                        }
                    }
                    i = i5 - 1;
                    obj = obj3;
                }
                i = i5;
                obj = obj2;
            }
            objArr[i6] = obj;
            i5 = i;
            i6--;
        }
        if (i6 >= 0) {
            xr.h(objArr, objArr, 0, i6 + 1, i3);
        }
        int i9 = i3 - (i6 + 1);
        xr.q(objArr, null, i9, i3);
        this.b = objArr;
        this.a = i9;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }

    public int p() {
        return this.a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t) {
        if (t == null) {
            return false;
        }
        int h = h(t);
        Object[] objArr = this.b;
        int size = size();
        if (h < 0) {
            return false;
        }
        int i = size - 1;
        if (h < i) {
            xr.h(objArr, objArr, h, h + 1, size);
        }
        objArr[i] = null;
        this.a = size() - 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return p();
    }

    public final Object[] t() {
        return this.b;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return ec1.a(this);
    }

    public String toString() {
        String i0;
        i0 = sc1.i0(this, null, "[", "]", 0, null, b.a, 25, null);
        return i0;
    }

    public final boolean u() {
        if (size() > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        z65.h(tArr, "array");
        return (T[]) ec1.b(this, tArr);
    }
}
