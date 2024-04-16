package defpackage;

import kotlin.Metadata;
/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0004\u001a\u00020\u0003R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lnk2;", "T", "Lyta;", "", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "value", "", "I", "getHashCode", "()I", "hashCode", "<init>", "(Ljava/lang/Object;I)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: nk2  reason: default package */
/* loaded from: classes.dex */
final class nk2<T> extends yta<T> {
    private final T a;
    private final int b;

    public nk2(T t, int i) {
        super(null);
        this.a = t;
        this.b = i;
    }

    public final void a() {
        int i;
        T t = this.a;
        boolean z = false;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        if (i == this.b) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
    }

    public final T b() {
        return this.a;
    }
}
