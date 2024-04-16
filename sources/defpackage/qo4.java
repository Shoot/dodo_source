package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HitTestResult.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+/B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0003J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tJ$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011J,\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011J,\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011J\u0011\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u001a\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J\u0011\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0096\u0002J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001bH\u0016J\u0006\u0010(\u001a\u00020\u0003R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u00108\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b6\u00107\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lqo4;", "", "Lsm6$c;", "", "F", "Lm43;", "u", "()J", "t", "", "z", DateTokenConverter.CONVERTER_KEY, "", "distanceFromEdge", "isInLayer", "D", "node", "Lkotlin/Function0;", "childHitTest", "A", "B", "G", "element", "p", "", "elements", "containsAll", "", "index", "v", "C", "isEmpty", "", "iterator", "E", "", "listIterator", "fromIndex", "toIndex", "subList", "clear", "", "", "a", "[Ljava/lang/Object;", "values", "", "b", "[J", "distanceFromEdgeAndInLayer", c.a, "I", "hitDepth", "<set-?>", "x", "()I", "size", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qo4  reason: default package */
/* loaded from: classes.dex */
public final class qo4 implements List<sm6.c>, be5 {
    private Object[] a = new Object[16];
    private long[] b = new long[16];
    private int c = -1;
    private int d;

    /* compiled from: HitTestResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\t\u0010\u0006\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0018"}, d2 = {"Lqo4$a;", "", "Lsm6$c;", "", "hasNext", "hasPrevious", "b", "", "nextIndex", c.a, "previousIndex", "a", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "getMinIndex", "minIndex", "getMaxIndex", "maxIndex", "<init>", "(Lqo4;III)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: qo4$a */
    /* loaded from: classes.dex */
    private final class a implements ListIterator<sm6.c>, be5 {
        private int a;
        private final int b;
        private final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(sm6.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public sm6.c next() {
            Object[] objArr = qo4.this.a;
            int i = this.a;
            this.a = i + 1;
            Object obj = objArr[i];
            z65.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (sm6.c) obj;
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public sm6.c previous() {
            Object[] objArr = qo4.this.a;
            int i = this.a - 1;
            this.a = i;
            Object obj = objArr[i];
            z65.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (sm6.c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.a < this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.a > this.b) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.a - this.b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.a - this.b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(sm6.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(qo4 qo4Var, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? qo4Var.size() : i3);
        }
    }

    /* compiled from: HitTestResult.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\u0011\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0096\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0096\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019¨\u0006\""}, d2 = {"Lqo4$b;", "", "Lsm6$c;", "element", "", DateTokenConverter.CONVERTER_KEY, "", "elements", "containsAll", "", "index", "g", "k", "isEmpty", "", "iterator", "p", "", "listIterator", "fromIndex", "toIndex", "subList", "a", "I", "getMinIndex", "()I", "minIndex", "b", "getMaxIndex", "maxIndex", Image.TYPE_HIGH, "size", "<init>", "(Lqo4;II)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: qo4$b */
    /* loaded from: classes.dex */
    private final class b implements List<sm6.c>, be5 {
        private final int a;
        private final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i, sm6.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends sm6.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof sm6.c)) {
                return false;
            }
            return d((sm6.c) obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            z65.h(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((sm6.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean d(sm6.c cVar) {
            z65.h(cVar, "element");
            if (indexOf(cVar) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        /* renamed from: g */
        public sm6.c get(int i) {
            Object obj = qo4.this.a[i + this.a];
            z65.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (sm6.c) obj;
        }

        public int h() {
            return this.b - this.a;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof sm6.c)) {
                return -1;
            }
            return k((sm6.c) obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<sm6.c> iterator() {
            qo4 qo4Var = qo4.this;
            int i = this.a;
            return new a(i, i, this.b);
        }

        public int k(sm6.c cVar) {
            z65.h(cVar, "element");
            int i = this.a;
            int i2 = this.b;
            if (i <= i2) {
                while (!z65.c(qo4.this.a[i], cVar)) {
                    if (i != i2) {
                        i++;
                    } else {
                        return -1;
                    }
                }
                return i - this.a;
            }
            return -1;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof sm6.c)) {
                return -1;
            }
            return p((sm6.c) obj);
        }

        @Override // java.util.List
        public ListIterator<sm6.c> listIterator() {
            qo4 qo4Var = qo4.this;
            int i = this.a;
            return new a(i, i, this.b);
        }

        public int p(sm6.c cVar) {
            z65.h(cVar, "element");
            int i = this.b;
            int i2 = this.a;
            if (i2 <= i) {
                while (!z65.c(qo4.this.a[i], cVar)) {
                    if (i != i2) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - this.a;
            }
            return -1;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ sm6.c remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<sm6.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ sm6.c set(int i, sm6.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return h();
        }

        @Override // java.util.List
        public void sort(Comparator<? super sm6.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<sm6.c> subList(int i, int i2) {
            qo4 qo4Var = qo4.this;
            int i3 = this.a;
            return new b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return ec1.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends sm6.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator<sm6.c> listIterator(int i) {
            qo4 qo4Var = qo4.this;
            int i2 = this.a;
            return new a(i + i2, i2, this.b);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            z65.h(tArr, "array");
            return (T[]) ec1.b(this, tArr);
        }
    }

    private final void F() {
        int n;
        int i = this.c + 1;
        n = kc1.n(this);
        if (i <= n) {
            while (true) {
                this.a[i] = null;
                if (i == n) {
                    break;
                }
                i++;
            }
        }
        this.d = this.c + 1;
    }

    private final void t() {
        int i = this.c;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            z65.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.b, length);
            z65.g(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
        }
    }

    private final long u() {
        long a2;
        int n;
        a2 = ro4.a(Float.POSITIVE_INFINITY, false);
        int i = this.c + 1;
        n = kc1.n(this);
        if (i <= n) {
            while (true) {
                long b2 = m43.b(this.b[i]);
                if (m43.a(b2, a2) < 0) {
                    a2 = b2;
                }
                if (m43.c(a2) < 0.0f && m43.d(a2)) {
                    return a2;
                }
                if (i == n) {
                    break;
                }
                i++;
            }
        }
        return a2;
    }

    public final void A(sm6.c cVar, boolean z, Function0<Unit> function0) {
        z65.h(cVar, "node");
        z65.h(function0, "childHitTest");
        B(cVar, -1.0f, z, function0);
    }

    public final void B(sm6.c cVar, float f, boolean z, Function0<Unit> function0) {
        long a2;
        z65.h(cVar, "node");
        z65.h(function0, "childHitTest");
        int i = this.c;
        this.c = i + 1;
        t();
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = cVar;
        long[] jArr = this.b;
        a2 = ro4.a(f, z);
        jArr[i2] = a2;
        F();
        function0.invoke();
        this.c = i;
    }

    public int C(sm6.c cVar) {
        int n;
        z65.h(cVar, "element");
        n = kc1.n(this);
        if (n >= 0) {
            int i = 0;
            while (!z65.c(this.a[i], cVar)) {
                if (i != n) {
                    i++;
                } else {
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean D(float f, boolean z) {
        int n;
        long a2;
        int i = this.c;
        n = kc1.n(this);
        if (i != n) {
            a2 = ro4.a(f, z);
            if (m43.a(u(), a2) > 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public int E(sm6.c cVar) {
        int n;
        z65.h(cVar, "element");
        for (n = kc1.n(this); -1 < n; n--) {
            if (z65.c(this.a[n], cVar)) {
                return n;
            }
        }
        return -1;
    }

    public final void G(sm6.c cVar, float f, boolean z, Function0<Unit> function0) {
        int n;
        int n2;
        int n3;
        int n4;
        z65.h(cVar, "node");
        z65.h(function0, "childHitTest");
        int i = this.c;
        n = kc1.n(this);
        if (i == n) {
            B(cVar, f, z, function0);
            int i2 = this.c + 1;
            n4 = kc1.n(this);
            if (i2 == n4) {
                F();
                return;
            }
            return;
        }
        long u = u();
        int i3 = this.c;
        n2 = kc1.n(this);
        this.c = n2;
        B(cVar, f, z, function0);
        int i4 = this.c + 1;
        n3 = kc1.n(this);
        if (i4 < n3 && m43.a(u, u()) > 0) {
            int i5 = this.c + 1;
            int i6 = i3 + 1;
            Object[] objArr = this.a;
            xr.h(objArr, objArr, i6, i5, size());
            long[] jArr = this.b;
            xr.g(jArr, jArr, i6, i5, size());
            this.c = ((size() + i3) - this.c) - 1;
        }
        F();
        this.c = i3;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, sm6.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends sm6.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.c = -1;
        F();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof sm6.c)) {
            return false;
        }
        return p((sm6.c) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((sm6.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.c = size() - 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof sm6.c)) {
            return -1;
        }
        return C((sm6.c) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<sm6.c> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof sm6.c)) {
            return -1;
        }
        return E((sm6.c) obj);
    }

    @Override // java.util.List
    public ListIterator<sm6.c> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public boolean p(sm6.c cVar) {
        z65.h(cVar, "element");
        if (indexOf(cVar) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ sm6.c remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<sm6.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ sm6.c set(int i, sm6.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return x();
    }

    @Override // java.util.List
    public void sort(Comparator<? super sm6.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<sm6.c> subList(int i, int i2) {
        return new b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ec1.a(this);
    }

    @Override // java.util.List
    /* renamed from: v */
    public sm6.c get(int i) {
        Object obj = this.a[i];
        z65.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (sm6.c) obj;
    }

    public int x() {
        return this.d;
    }

    public final boolean z() {
        long u = u();
        if (m43.c(u) < 0.0f && m43.d(u)) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends sm6.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<sm6.c> listIterator(int i) {
        return new a(this, i, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        z65.h(tArr, "array");
        return (T[]) ec1.b(this, tArr);
    }
}
