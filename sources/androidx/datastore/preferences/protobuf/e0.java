package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.i1;
import java.io.IOException;
/* compiled from: MapEntryLite.java */
/* loaded from: classes.dex */
public class e0<K, V> {
    private final a<K, V> a;
    private final K b;
    private final V c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapEntryLite.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {
        public final i1.b a;
        public final K b;
        public final i1.b c;
        public final V d;

        public a(i1.b bVar, K k, i1.b bVar2, V v) {
            this.a = bVar;
            this.b = k;
            this.c = bVar2;
            this.d = v;
        }
    }

    private e0(i1.b bVar, K k, i1.b bVar2, V v) {
        this.a = new a<>(bVar, k, bVar2, v);
        this.b = k;
        this.c = v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int b(a<K, V> aVar, K k, V v) {
        return s.d(aVar.a, 1, k) + s.d(aVar.c, 2, v);
    }

    public static <K, V> e0<K, V> d(i1.b bVar, K k, i1.b bVar2, V v) {
        return new e0<>(bVar, k, bVar2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k, V v) throws IOException {
        s.z(codedOutputStream, aVar.a, 1, k);
        s.z(codedOutputStream, aVar.c, 2, v);
    }

    public int a(int i, K k, V v) {
        return CodedOutputStream.V(i) + CodedOutputStream.C(b(this.a, k, v));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.a;
    }
}
