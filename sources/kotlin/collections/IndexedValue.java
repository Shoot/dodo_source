package kotlin.collections;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: IndexedValue.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "index", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "<init>", "(ILjava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class IndexedValue<T> {
    private final int a;
    private final T b;

    public IndexedValue(int i, T t) {
        this.a = i;
        this.b = t;
    }

    public final int a() {
        return this.a;
    }

    public final T b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        if (this.a == indexedValue.a && z65.c(this.b, indexedValue.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = this.a * 31;
        T t = this.b;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return i + hashCode;
    }

    public String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
