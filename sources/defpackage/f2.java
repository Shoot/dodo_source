package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AbstractSet.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u0000 \f*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\fB\t\b\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lf2;", "E", "Lc1;", "", "", "other", "", "equals", "", "hashCode", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: f2  reason: default package */
/* loaded from: classes3.dex */
public abstract class f2<E> extends c1<E> implements Set<E>, be5 {
    public static final a a = new a(null);

    /* compiled from: AbstractSet.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\t2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lf2$a;", "", "", c.a, "", "b", "(Ljava/util/Collection;)I", "", "other", "", "a", "(Ljava/util/Set;Ljava/util/Set;)Z", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: f2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Set<?> set, Set<?> set2) {
            z65.h(set, c.a);
            z65.h(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(Collection<?> collection) {
            int i;
            z65.h(collection, c.a);
            int i2 = 0;
            for (Object obj : collection) {
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 += i;
            }
            return i2;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return a.a(this, (Set) obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return a.b(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
