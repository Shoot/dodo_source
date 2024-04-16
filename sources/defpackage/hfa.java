package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SetBuilder.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 '*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\u001bB\u001b\b\u0000\u0012\u0010\u0010\u001d\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\"\u0010#B\t\b\u0016¢\u0006\u0004\b\"\u0010$B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010&J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0018\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016R\u001e\u0010\u001d\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lhfa;", "E", "", "Ly1;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "k", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "", "clear", CartQueueItemEntity.OPERATION_ADD, CartQueueItemEntity.OPERATION_REMOVE, "", "iterator", "", "elements", "addAll", "removeAll", "retainAll", "Le66;", "a", "Le66;", "backing", "", DateTokenConverter.CONVERTER_KEY, "()I", "size", "<init>", "(Le66;)V", "()V", "initialCapacity", "(I)V", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: hfa  reason: default package */
/* loaded from: classes3.dex */
public final class hfa<E> extends y1<E> implements Set<E>, Serializable, ie5 {
    private static final a b = new a(null);
    private static final hfa c = new hfa(e66.n.e());
    private final e66<E, ?> a;

    /* compiled from: SetBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lhfa$a;", "", "Lhfa;", "", "Empty", "Lhfa;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hfa$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public hfa(e66<E, ?> e66Var) {
        z65.h(e66Var, "backing");
        this.a = e66Var;
    }

    private final Object writeReplace() {
        if (this.a.b0()) {
            return new sca(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (this.a.m(e) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        z65.h(collection, "elements");
        this.a.q();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.y1
    public int d() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.a.e0();
    }

    public final Set<E> k() {
        this.a.o();
        if (size() > 0) {
            return this;
        }
        return c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.a.p0(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        this.a.q();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        this.a.q();
        return super.retainAll(collection);
    }

    public hfa() {
        this(new e66());
    }

    public hfa(int i) {
        this(new e66(i));
    }
}
