package defpackage;

import defpackage.cx4;
import defpackage.nca;
import defpackage.xw4;
import defpackage.yw4;
import defpackage.zw4;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
/* compiled from: ImmutableSetMultimap.java */
/* renamed from: bx4  reason: default package */
/* loaded from: classes2.dex */
public class bx4<K, V> extends yw4<K, V> implements dq6 {
    private final transient zw4<V> c;

    /* compiled from: ImmutableSetMultimap.java */
    /* renamed from: bx4$a */
    /* loaded from: classes2.dex */
    public static final class a<K, V> extends yw4.a<K, V> {
        public bx4<K, V> a() {
            Collection entrySet = this.a.entrySet();
            Comparator<? super K> comparator = this.b;
            if (comparator != null) {
                entrySet = cm7.a(comparator).d().b(entrySet);
            }
            return bx4.e(entrySet, this.c);
        }
    }

    /* compiled from: ImmutableSetMultimap.java */
    /* renamed from: bx4$b */
    /* loaded from: classes2.dex */
    private static final class b {
        static final nca.b<bx4> a = nca.a(bx4.class, "emptySet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bx4(xw4<K, zw4<V>> xw4Var, int i, Comparator<? super V> comparator) {
        super(xw4Var, i);
        this.c = d(comparator);
    }

    private static <V> zw4<V> d(Comparator<? super V> comparator) {
        if (comparator == null) {
            return zw4.e0();
        }
        return cx4.I0(comparator);
    }

    static <K, V> bx4<K, V> e(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return f();
        }
        xw4.a aVar = new xw4.a(collection.size());
        int i = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            zw4 j = j(comparator, entry.getValue());
            if (!j.isEmpty()) {
                aVar.e(key, j);
                i += j.size();
            }
        }
        return new bx4<>(aVar.b(), i, comparator);
    }

    public static <K, V> bx4<K, V> f() {
        return jg3.d;
    }

    private static <V> zw4<V> j(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return zw4.Q(collection);
        }
        return cx4.q0(comparator, collection);
    }

    private static <V> zw4.a<V> k(Comparator<? super V> comparator) {
        if (comparator == null) {
            return new zw4.a<>();
        }
        return new cx4.a(comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            xw4.a b2 = xw4.b();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    zw4.a k = k(comparator);
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        k.f(objectInputStream.readObject());
                    }
                    zw4 i4 = k.i();
                    if (i4.size() == readInt2) {
                        b2.e(readObject, i4);
                        i += readInt2;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(valueOf);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                yw4.b.a.b(this, b2.b());
                yw4.b.b.a(this, i);
                b.a.b(this, d(comparator));
                return;
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        }
        StringBuilder sb3 = new StringBuilder(29);
        sb3.append("Invalid key count ");
        sb3.append(readInt);
        throw new InvalidObjectException(sb3.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(i());
        nca.b(this, objectOutputStream);
    }

    Comparator<? super V> i() {
        zw4<V> zw4Var = this.c;
        if (zw4Var instanceof cx4) {
            return ((cx4) zw4Var).comparator();
        }
        return null;
    }
}
