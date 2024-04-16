package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
/* compiled from: FontFamily.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0000\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b%\u0010&J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0003J\u0017\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0003J\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\t\u0010\u000e\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0096\u0003J\u0011\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0096\u0001J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lf34;", "Lys3;", "", "Lq24;", "element", "", "t", "", "elements", "containsAll", "", "index", "u", "z", "isEmpty", "", "iterator", "A", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "equals", "hashCode", "", "toString", "i", "Ljava/util/List;", "v", "()Ljava/util/List;", "fonts", "x", "()I", "size", "<init>", "(Ljava/util/List;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: f34  reason: default package */
/* loaded from: classes.dex */
public final class f34 extends ys3 implements List<q24>, be5 {
    private final /* synthetic */ List<q24> h;
    private final List<q24> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f34(List<? extends q24> list) {
        super(null);
        z65.h(list, "fonts");
        this.h = list;
        List<? extends q24> list2 = list;
        if (!list2.isEmpty()) {
            this.i = new ArrayList(list2);
            return;
        }
        throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
    }

    public int A(q24 q24Var) {
        z65.h(q24Var, "element");
        return this.h.lastIndexOf(q24Var);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, q24 q24Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends q24> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof q24)) {
            return false;
        }
        return t((q24) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        return this.h.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f34) && z65.c(this.i, ((f34) obj).i)) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.i.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof q24)) {
            return -1;
        }
        return z((q24) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.h.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<q24> iterator() {
        return this.h.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof q24)) {
            return -1;
        }
        return A((q24) obj);
    }

    @Override // java.util.List
    public ListIterator<q24> listIterator() {
        return this.h.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ q24 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<q24> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ q24 set(int i, q24 q24Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return x();
    }

    @Override // java.util.List
    public void sort(Comparator<? super q24> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<q24> subList(int i, int i2) {
        return this.h.subList(i, i2);
    }

    public boolean t(q24 q24Var) {
        z65.h(q24Var, "element");
        return this.h.contains(q24Var);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ec1.a(this);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.util.List
    /* renamed from: u */
    public q24 get(int i) {
        return this.h.get(i);
    }

    public final List<q24> v() {
        return this.i;
    }

    public int x() {
        return this.h.size();
    }

    public int z(q24 q24Var) {
        z65.h(q24Var, "element");
        return this.h.indexOf(q24Var);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends q24> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<q24> listIterator(int i) {
        return this.h.listIterator(i);
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
