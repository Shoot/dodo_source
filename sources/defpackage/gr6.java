package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
/* compiled from: MutableVector.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0013\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u000b\u00068B!\b\u0001\u0012\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000,\u0012\u0006\u0010<\u001a\u00020\b¢\u0006\u0004\b=\u0010>J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0014\u0010\u0011\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0006\u0010\u0014\u001a\u00020\nJ\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0007J\u0014\u0010\u0016\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bJ\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0005J\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u0007J\u0014\u0010\u001f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0015\u0010 \u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0016\u0010$\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bJ\u0014\u0010%\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ \u0010&\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b&\u0010'J\u001e\u0010+\u001a\u00020\n2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00028\u00000(j\b\u0012\u0004\u0012\u00028\u0000`)R0\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000,8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010-\u0012\u0004\b2\u00103\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00105R$\u0010<\u001a\u00020\b2\u0006\u00107\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lgr6;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "element", "", "b", "(Ljava/lang/Object;)Z", "", "index", "", "a", "(ILjava/lang/Object;)V", "elements", DateTokenConverter.CONVERTER_KEY, "", "f", "g", "", Image.TYPE_HIGH, "k", "n", "p", "capacity", "q", "t", "(Ljava/lang/Object;)I", "u", "v", "w", "x", "y", "z", "(I)Ljava/lang/Object;", "start", "end", "A", "B", "C", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "D", "", "[Ljava/lang/Object;", "r", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "getContent$annotations", "()V", RemoteMessageConst.Notification.CONTENT, "Ljava/util/List;", StatisticManager.LIST, "<set-?>", com.huawei.hms.opendevice.c.a, "I", Image.TYPE_SMALL, "()I", "size", "<init>", "([Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gr6  reason: default package */
/* loaded from: classes.dex */
public final class gr6<T> implements RandomAccess {
    private T[] a;
    private List<T> b;
    private int c;

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010$¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lgr6$a;", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", CartQueueItemEntity.OPERATION_ADD, "", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", CartQueueItemEntity.OPERATION_REMOVE, "removeAll", "g", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "Lgr6;", "a", "Lgr6;", "vector", DateTokenConverter.CONVERTER_KEY, "()I", "size", "<init>", "(Lgr6;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gr6$a */
    /* loaded from: classes.dex */
    private static final class a<T> implements List<T>, ee5 {
        private final gr6<T> a;

        public a(gr6<T> gr6Var) {
            z65.h(gr6Var, "vector");
            this.a = gr6Var;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            return this.a.b(t);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> collection) {
            z65.h(collection, "elements");
            return this.a.f(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.a.k();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.a.n(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            z65.h(collection, "elements");
            return this.a.p(collection);
        }

        public int d() {
            return this.a.s();
        }

        public T g(int i) {
            hr6.c(this, i);
            return this.a.z(i);
        }

        @Override // java.util.List
        public T get(int i) {
            hr6.c(this, i);
            return this.a.r()[i];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.a.t(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.a.u();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.a.w(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return g(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            z65.h(collection, "elements");
            return this.a.y(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            z65.h(collection, "elements");
            return this.a.B(collection);
        }

        @Override // java.util.List
        public T set(int i, T t) {
            hr6.c(this, i);
            return this.a.C(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            hr6.d(this, i, i2);
            return new b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return ec1.a(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.a.a(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            z65.h(collection, "elements");
            return this.a.g(collection);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.a.x(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            z65.h(tArr, "array");
            return (T[]) ec1.b(this, tArr);
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0018\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010)\u001a\u00020\n\u0012\u0006\u0010+\u001a\u00020\n¢\u0006\u0004\b/\u00100J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010.\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lgr6$b;", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", CartQueueItemEntity.OPERATION_ADD, "", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", CartQueueItemEntity.OPERATION_REMOVE, "removeAll", "g", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "a", "Ljava/util/List;", StatisticManager.LIST, "b", "I", "start", com.huawei.hms.opendevice.c.a, "end", DateTokenConverter.CONVERTER_KEY, "()I", "size", "<init>", "(Ljava/util/List;II)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gr6$b */
    /* loaded from: classes.dex */
    private static final class b<T> implements List<T>, ee5 {
        private final List<T> a;
        private final int b;
        private int c;

        public b(List<T> list, int i, int i2) {
            z65.h(list, StatisticManager.LIST);
            this.a = list;
            this.b = i;
            this.c = i2;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            List<T> list = this.a;
            int i = this.c;
            this.c = i + 1;
            list.add(i, t);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> collection) {
            z65.h(collection, "elements");
            this.a.addAll(i + this.b, collection);
            this.c += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 <= i) {
                while (true) {
                    this.a.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.c = this.b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (z65.c(this.a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            z65.h(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int d() {
            return this.c - this.b;
        }

        public T g(int i) {
            hr6.c(this, i);
            this.c--;
            return this.a.remove(i + this.b);
        }

        @Override // java.util.List
        public T get(int i) {
            hr6.c(this, i);
            return this.a.get(i + this.b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (z65.c(this.a.get(i2), obj)) {
                    return i2 - this.b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (this.c == this.b) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 <= i) {
                while (!z65.c(this.a.get(i), obj)) {
                    if (i != i2) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - this.b;
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return g(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            z65.h(collection, "elements");
            int i = this.c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i != this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            z65.h(collection, "elements");
            int i = this.c;
            int i2 = i - 1;
            int i3 = this.b;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.a.get(i2))) {
                        this.a.remove(i2);
                        this.c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public T set(int i, T t) {
            hr6.c(this, i);
            return this.a.set(i + this.b, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            hr6.d(this, i, i2);
            return new b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return ec1.a(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.a.add(i + this.b, t);
            this.c++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (z65.c(this.a.get(i2), obj)) {
                    this.a.remove(i2);
                    this.c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            z65.h(tArr, "array");
            return (T[]) ec1.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            z65.h(collection, "elements");
            this.a.addAll(this.c, collection);
            this.c += collection.size();
            return collection.size() > 0;
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lgr6$c;", "T", "", "", "hasNext", StatisticManager.NEXT, "()Ljava/lang/Object;", "", CartQueueItemEntity.OPERATION_REMOVE, "hasPrevious", "", "nextIndex", "previous", "previousIndex", "element", CartQueueItemEntity.OPERATION_ADD, "(Ljava/lang/Object;)V", "set", "", "a", "Ljava/util/List;", StatisticManager.LIST, "b", "I", "index", "<init>", "(Ljava/util/List;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gr6$c */
    /* loaded from: classes.dex */
    private static final class c<T> implements ListIterator<T>, be5 {
        private final List<T> a;
        private int b;

        public c(List<T> list, int i) {
            z65.h(list, StatisticManager.LIST);
            this.a = list;
            this.b = i;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.a.add(this.b, t);
            this.b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.b < this.a.size()) {
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
        public T next() {
            List<T> list = this.a;
            int i = this.b;
            this.b = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.b - 1;
            this.b = i;
            return this.a.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.b - 1;
            this.b = i;
            this.a.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.a.set(this.b, t);
        }
    }

    public gr6(T[] tArr, int i) {
        z65.h(tArr, RemoteMessageConst.Notification.CONTENT);
        this.a = tArr;
        this.c = i;
    }

    public final void A(int i, int i2) {
        if (i2 > i) {
            int i3 = this.c;
            if (i2 < i3) {
                T[] tArr = this.a;
                xr.h(tArr, tArr, i, i2, i3);
            }
            int i4 = this.c - (i2 - i);
            int s = s() - 1;
            if (i4 <= s) {
                int i5 = i4;
                while (true) {
                    this.a[i5] = null;
                    if (i5 == s) {
                        break;
                    }
                    i5++;
                }
            }
            this.c = i4;
        }
    }

    public final boolean B(Collection<? extends T> collection) {
        z65.h(collection, "elements");
        int i = this.c;
        for (int s = s() - 1; -1 < s; s--) {
            if (!collection.contains(r()[s])) {
                z(s);
            }
        }
        if (i != this.c) {
            return true;
        }
        return false;
    }

    public final T C(int i, T t) {
        T[] tArr = this.a;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    public final void D(Comparator<T> comparator) {
        z65.h(comparator, "comparator");
        xr.z(this.a, comparator, 0, this.c);
    }

    public final void a(int i, T t) {
        q(this.c + 1);
        T[] tArr = this.a;
        int i2 = this.c;
        if (i != i2) {
            xr.h(tArr, tArr, i + 1, i, i2);
        }
        tArr[i] = t;
        this.c++;
    }

    public final boolean b(T t) {
        q(this.c + 1);
        T[] tArr = this.a;
        int i = this.c;
        tArr[i] = t;
        this.c = i + 1;
        return true;
    }

    public final boolean d(int i, gr6<T> gr6Var) {
        z65.h(gr6Var, "elements");
        if (gr6Var.u()) {
            return false;
        }
        q(this.c + gr6Var.c);
        T[] tArr = this.a;
        int i2 = this.c;
        if (i != i2) {
            xr.h(tArr, tArr, gr6Var.c + i, i, i2);
        }
        xr.h(gr6Var.a, tArr, i, 0, gr6Var.c);
        this.c += gr6Var.c;
        return true;
    }

    public final boolean f(int i, Collection<? extends T> collection) {
        z65.h(collection, "elements");
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        q(this.c + collection.size());
        T[] tArr = this.a;
        if (i != this.c) {
            xr.h(tArr, tArr, collection.size() + i, i, this.c);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kc1.v();
            }
            tArr[i2 + i] = t;
            i2 = i3;
        }
        this.c += collection.size();
        return true;
    }

    public final boolean g(Collection<? extends T> collection) {
        z65.h(collection, "elements");
        return f(this.c, collection);
    }

    public final List<T> h() {
        List<T> list = this.b;
        if (list == null) {
            a aVar = new a(this);
            this.b = aVar;
            return aVar;
        }
        return list;
    }

    public final void k() {
        T[] tArr = this.a;
        int s = s();
        while (true) {
            s--;
            if (-1 < s) {
                tArr[s] = null;
            } else {
                this.c = 0;
                return;
            }
        }
    }

    public final boolean n(T t) {
        int s = s() - 1;
        if (s >= 0) {
            for (int i = 0; !z65.c(r()[i], t); i++) {
                if (i != s) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean p(Collection<? extends T> collection) {
        z65.h(collection, "elements");
        for (T t : collection) {
            if (!n(t)) {
                return false;
            }
        }
        return true;
    }

    public final void q(int i) {
        T[] tArr = this.a;
        if (tArr.length < i) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            z65.g(tArr2, "copyOf(this, newSize)");
            this.a = tArr2;
        }
    }

    public final T[] r() {
        return this.a;
    }

    public final int s() {
        return this.c;
    }

    public final int t(T t) {
        int i = this.c;
        if (i > 0) {
            T[] tArr = this.a;
            int i2 = 0;
            while (!z65.c(t, tArr[i2])) {
                i2++;
                if (i2 >= i) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean u() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        if (this.c != 0) {
            return true;
        }
        return false;
    }

    public final int w(T t) {
        int i = this.c;
        if (i > 0) {
            int i2 = i - 1;
            T[] tArr = this.a;
            while (!z65.c(t, tArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean x(T t) {
        int t2 = t(t);
        if (t2 >= 0) {
            z(t2);
            return true;
        }
        return false;
    }

    public final boolean y(Collection<? extends T> collection) {
        z65.h(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        int i = this.c;
        for (T t : collection) {
            x(t);
        }
        if (i == this.c) {
            return false;
        }
        return true;
    }

    public final T z(int i) {
        T[] tArr = this.a;
        T t = tArr[i];
        if (i != s() - 1) {
            xr.h(tArr, tArr, i, i + 1, this.c);
        }
        int i2 = this.c - 1;
        this.c = i2;
        tArr[i2] = null;
        return t;
    }
}
