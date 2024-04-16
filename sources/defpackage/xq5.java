package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ListBuilder.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0000\u0018\u0000 `*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0002GJBO\b\u0002\u0012\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000>\u0012\u0006\u0010L\u001a\u00020\u000e\u0012\u0006\u0010N\u001a\u00020\u000e\u0012\u0006\u0010P\u001a\u00020\u0015\u0012\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b[\u0010\\B\t\b\u0016¢\u0006\u0004\b[\u0010]B\u0011\b\u0016\u0012\u0006\u0010^\u001a\u00020\u000e¢\u0006\u0004\b[\u0010_J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0014\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0017\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J.\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010$\u001a\u00020\u0015H\u0002J\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\b\u0010'\u001a\u00020\u0015H\u0016J\u0018\u0010)\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b)\u0010 J \u0010*\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010-J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0096\u0002J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0016J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u0010(\u001a\u00020\u000eH\u0016J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00103\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u0010\u001bJ\u0016\u00105\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J\u001e\u00105\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J\b\u00106\u001a\u00020\nH\u0016J\u0017\u00107\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010 J\u0017\u00108\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u00104J\u0016\u00109\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J\u0016\u0010:\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000eH\u0016J)\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00010>\"\u0004\b\u0001\u0010\f2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0>H\u0016¢\u0006\u0004\b@\u0010BJ\u0013\u0010C\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010D\u001a\u00020\u000eH\u0016J\b\u0010F\u001a\u00020EH\u0016R\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010\u0016R\u001c\u0010S\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010U\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010RR\u0014\u0010X\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010Y¨\u0006a"}, d2 = {"Lxq5;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lw1;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "n0", "T", "W", "", "n", "h0", "minCapacity", "e0", "", "other", "", "Z", "i", "l0", "element", "P", "(ILjava/lang/Object;)V", "", "elements", "H", "o0", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "p0", "retain", "q0", "Q", "isEmpty", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "", "listIterator", CartQueueItemEntity.OPERATION_ADD, "(Ljava/lang/Object;)Z", "addAll", "clear", "k", CartQueueItemEntity.OPERATION_REMOVE, "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "", "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "", "toString", "a", "[Ljava/lang/Object;", "array", "b", "I", "offset", c.a, "length", DateTokenConverter.CONVERTER_KEY, "isReadOnly", e.a, "Lxq5;", "backing", "f", "root", "m0", "()Z", "isEffectivelyReadOnly", "()I", "size", "<init>", "([Ljava/lang/Object;IIZLxq5;Lxq5;)V", "()V", "initialCapacity", "(I)V", "g", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: xq5  reason: default package */
/* loaded from: classes3.dex */
public final class xq5<E> extends w1<E> implements List<E>, RandomAccess, Serializable, ee5 {
    private static final a g = new a(null);
    private static final xq5 h;
    private E[] a;
    private int b;
    private int c;
    private boolean d;
    private final xq5<E> e;
    private final xq5<E> f;

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lxq5$a;", "", "Lxq5;", "", "Empty", "Lxq5;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xq5$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\b\u0016\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\u0007\u001a\u00020\u0005H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u000f\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001f"}, d2 = {"Lxq5$b;", "E", "", "", "b", "", "hasPrevious", "hasNext", "", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", StatisticManager.NEXT, "element", "set", "(Ljava/lang/Object;)V", CartQueueItemEntity.OPERATION_ADD, CartQueueItemEntity.OPERATION_REMOVE, "Lxq5;", "a", "Lxq5;", StatisticManager.LIST, "I", "index", c.a, "lastIndex", DateTokenConverter.CONVERTER_KEY, "expectedModCount", "<init>", "(Lxq5;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xq5$b */
    /* loaded from: classes3.dex */
    public static final class b<E> implements ListIterator<E>, be5 {
        private final xq5<E> a;
        private int b;
        private int c;
        private int d;

        public b(xq5<E> xq5Var, int i) {
            z65.h(xq5Var, StatisticManager.LIST);
            this.a = xq5Var;
            this.b = i;
            this.c = -1;
            this.d = ((AbstractList) xq5Var).modCount;
        }

        private final void b() {
            if (((AbstractList) this.a).modCount == this.d) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            b();
            xq5<E> xq5Var = this.a;
            int i = this.b;
            this.b = i + 1;
            xq5Var.add(i, e);
            this.c = -1;
            this.d = ((AbstractList) this.a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.b < ((xq5) this.a).c) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (this.b < ((xq5) this.a).c) {
                int i = this.b;
                this.b = i + 1;
                this.c = i;
                return (E) ((xq5) this.a).a[((xq5) this.a).b + this.c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            b();
            int i = this.b;
            if (i > 0) {
                int i2 = i - 1;
                this.b = i2;
                this.c = i2;
                return (E) ((xq5) this.a).a[((xq5) this.a).b + this.c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i = this.c;
            if (i != -1) {
                this.a.remove(i);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) this.a).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            b();
            int i = this.c;
            if (i != -1) {
                this.a.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        xq5 xq5Var = new xq5(0);
        xq5Var.d = true;
        h = xq5Var;
    }

    private xq5(E[] eArr, int i, int i2, boolean z, xq5<E> xq5Var, xq5<E> xq5Var2) {
        this.a = eArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = xq5Var;
        this.f = xq5Var2;
        if (xq5Var != null) {
            ((AbstractList) this).modCount = ((AbstractList) xq5Var).modCount;
        }
    }

    private final void H(int i, Collection<? extends E> collection, int i2) {
        n0();
        xq5<E> xq5Var = this.e;
        if (xq5Var != null) {
            xq5Var.H(i, collection, i2);
            this.a = this.e.a;
            this.c += i2;
            return;
        }
        l0(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    private final void P(int i, E e) {
        n0();
        xq5<E> xq5Var = this.e;
        if (xq5Var != null) {
            xq5Var.P(i, e);
            this.a = this.e.a;
            this.c++;
            return;
        }
        l0(i, 1);
        this.a[i] = e;
    }

    private final void T() {
        xq5<E> xq5Var = this.f;
        if (xq5Var != null && ((AbstractList) xq5Var).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void W() {
        if (!m0()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private final boolean Z(List<?> list) {
        boolean h2;
        h2 = yq5.h(this.a, this.b, this.c, list);
        return h2;
    }

    private final void e0(int i) {
        if (i >= 0) {
            E[] eArr = this.a;
            if (i > eArr.length) {
                this.a = (E[]) yq5.e(this.a, n1.a.e(eArr.length, i));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void h0(int i) {
        e0(this.c + i);
    }

    private final void l0(int i, int i2) {
        h0(i2);
        E[] eArr = this.a;
        xr.h(eArr, eArr, i + i2, i, this.b + this.c);
        this.c += i2;
    }

    private final boolean m0() {
        xq5<E> xq5Var;
        if (!this.d && ((xq5Var = this.f) == null || !xq5Var.d)) {
            return false;
        }
        return true;
    }

    private final void n0() {
        ((AbstractList) this).modCount++;
    }

    private final E o0(int i) {
        n0();
        xq5<E> xq5Var = this.e;
        if (xq5Var != null) {
            this.c--;
            return xq5Var.o0(i);
        }
        E[] eArr = this.a;
        E e = eArr[i];
        xr.h(eArr, eArr, i, i + 1, this.b + this.c);
        yq5.f(this.a, (this.b + this.c) - 1);
        this.c--;
        return e;
    }

    private final void p0(int i, int i2) {
        if (i2 > 0) {
            n0();
        }
        xq5<E> xq5Var = this.e;
        if (xq5Var != null) {
            xq5Var.p0(i, i2);
        } else {
            E[] eArr = this.a;
            xr.h(eArr, eArr, i, i + i2, this.c);
            E[] eArr2 = this.a;
            int i3 = this.c;
            yq5.g(eArr2, i3 - i2, i3);
        }
        this.c -= i2;
    }

    private final int q0(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3;
        xq5<E> xq5Var = this.e;
        if (xq5Var != null) {
            i3 = xq5Var.q0(i, i2, collection, z);
        } else {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                int i6 = i + i4;
                if (collection.contains(this.a[i6]) == z) {
                    E[] eArr = this.a;
                    i4++;
                    eArr[i5 + i] = eArr[i6];
                    i5++;
                } else {
                    i4++;
                }
            }
            int i7 = i2 - i5;
            E[] eArr2 = this.a;
            xr.h(eArr2, eArr2, i + i5, i2 + i, this.c);
            E[] eArr3 = this.a;
            int i8 = this.c;
            yq5.g(eArr3, i8 - i7, i8);
            i3 = i7;
        }
        if (i3 > 0) {
            n0();
        }
        this.c -= i3;
        return i3;
    }

    private final Object writeReplace() {
        if (m0()) {
            return new sca(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final List<E> Q() {
        if (this.e == null) {
            W();
            this.d = true;
            if (this.c > 0) {
                return this;
            }
            return h;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        W();
        T();
        P(this.b + this.c, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        z65.h(collection, "elements");
        W();
        T();
        int size = collection.size();
        H(this.b + this.c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        W();
        T();
        p0(this.b, this.c);
    }

    @Override // defpackage.w1
    public int d() {
        T();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        T();
        if (obj != this && (!(obj instanceof List) || !Z((List) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        T();
        n1.a.b(i, this.c);
        return this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i;
        T();
        i = yq5.i(this.a, this.b, this.c);
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        T();
        for (int i = 0; i < this.c; i++) {
            if (z65.c(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        T();
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // defpackage.w1
    public E k(int i) {
        W();
        T();
        n1.a.b(i, this.c);
        return o0(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        T();
        for (int i = this.c - 1; i >= 0; i--) {
            if (z65.c(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        W();
        T();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        W();
        T();
        if (q0(this.b, this.c, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        W();
        T();
        if (q0(this.b, this.c, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        W();
        T();
        n1.a.b(i, this.c);
        E[] eArr = this.a;
        int i2 = this.b;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i, int i2) {
        xq5<E> xq5Var;
        n1.a.d(i, i2, this.c);
        E[] eArr = this.a;
        int i3 = this.b + i;
        int i4 = i2 - i;
        boolean z = this.d;
        xq5<E> xq5Var2 = this.f;
        if (xq5Var2 == null) {
            xq5Var = this;
        } else {
            xq5Var = xq5Var2;
        }
        return new xq5(eArr, i3, i4, z, this, xq5Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        Object[] g2;
        z65.h(tArr, "destination");
        T();
        int length = tArr.length;
        int i = this.c;
        if (length >= i) {
            E[] eArr = this.a;
            int i2 = this.b;
            xr.h(eArr, tArr, 0, i2, i + i2);
            g2 = jc1.g(this.c, tArr);
            return (T[]) g2;
        }
        E[] eArr2 = this.a;
        int i3 = this.b;
        T[] tArr2 = (T[]) Arrays.copyOfRange(eArr2, i3, i + i3, tArr.getClass());
        z65.g(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j;
        T();
        j = yq5.j(this.a, this.b, this.c, this);
        return j;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        T();
        n1.a.c(i, this.c);
        return new b(this, i);
    }

    public xq5() {
        this(10);
    }

    public xq5(int i) {
        this(yq5.d(i), 0, 0, false, null, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        W();
        T();
        n1.a.c(i, this.c);
        P(this.b + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        z65.h(collection, "elements");
        W();
        T();
        n1.a.c(i, this.c);
        int size = collection.size();
        H(this.b + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] n;
        T();
        E[] eArr = this.a;
        int i = this.b;
        n = xr.n(eArr, i, this.c + i);
        return n;
    }
}
