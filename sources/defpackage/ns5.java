package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LocaleList.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0096\u0002J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lns5;", "", "Lis5;", "", "i", "g", "element", "", DateTokenConverter.CONVERTER_KEY, "elements", "containsAll", "isEmpty", "", "iterator", "", "other", "equals", "hashCode", "", "toString", "", "a", "Ljava/util/List;", Image.TYPE_HIGH, "()Ljava/util/List;", "localeList", "b", "I", "k", "()I", "size", "<init>", "(Ljava/util/List;)V", c.a, "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ns5  reason: default package */
/* loaded from: classes.dex */
public final class ns5 implements Collection<is5>, be5 {
    public static final a c = new a(null);
    private final List<is5> a;
    private final int b;

    /* compiled from: LocaleList.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lns5$a;", "", "Lns5;", "a", "()Lns5;", "current", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ns5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ns5 a() {
            return gc8.a().b();
        }
    }

    public ns5(List<is5> list) {
        z65.h(list, "localeList");
        this.a = list;
        this.b = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(is5 is5Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends is5> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof is5)) {
            return false;
        }
        return d((is5) obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        return this.a.containsAll(collection);
    }

    public boolean d(is5 is5Var) {
        z65.h(is5Var, "element");
        return this.a.contains(is5Var);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ns5) && z65.c(this.a, ((ns5) obj).a)) {
            return true;
        }
        return false;
    }

    public final is5 g(int i) {
        return this.a.get(i);
    }

    public final List<is5> h() {
        return this.a;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<is5> iterator() {
        return this.a.iterator();
    }

    public int k() {
        return this.b;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super is5> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return k();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return ec1.a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        z65.h(tArr, "array");
        return (T[]) ec1.b(this, tArr);
    }
}
