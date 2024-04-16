package io.realm.internal;

import io.realm.internal.e;
@Keep
/* loaded from: classes3.dex */
public interface ObservableCollection {

    /* loaded from: classes3.dex */
    public static class a implements e.a<b> {
        private final OsCollectionChangeSet a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(OsCollectionChangeSet osCollectionChangeSet) {
            this.a = osCollectionChangeSet;
        }

        @Override // io.realm.internal.e.a
        /* renamed from: b */
        public void a(b bVar, Object obj) {
            bVar.a(obj, this.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class b<T> extends e.b<T, Object> {
        public void a(T t, OsCollectionChangeSet osCollectionChangeSet) {
            S s = this.b;
            if (s instanceof am7) {
                ((am7) s).a(t, new gva(osCollectionChangeSet));
            } else if (s instanceof d89) {
                ((d89) s).a(t);
            } else {
                throw new RuntimeException("Unsupported listener type: " + this.b);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c<T> implements am7<T> {
        private final d89<T> a;

        public c(d89<T> d89Var) {
            this.a = d89Var;
        }

        @Override // defpackage.am7
        public void a(T t, xl7 xl7Var) {
            this.a.a(t);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof c) && this.a == ((c) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    void notifyChangeListeners(long j);
}
