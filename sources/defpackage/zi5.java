package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: LRUMap.java */
/* renamed from: zi5  reason: default package */
/* loaded from: classes2.dex */
public class zi5<K, V> implements yy5<K, V>, Serializable {
    protected final transient int a;
    protected final transient ConcurrentHashMap<K, V> b;
    protected transient int c;

    public zi5(int i, int i2) {
        this.b = new ConcurrentHashMap<>(i, 0.8f, 4);
        this.a = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.c = objectInputStream.readInt();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.c);
    }

    public void a() {
        this.b.clear();
    }

    public V b(K k, V v) {
        if (this.b.size() >= this.a) {
            synchronized (this) {
                try {
                    if (this.b.size() >= this.a) {
                        a();
                    }
                } finally {
                }
            }
        }
        return this.b.put(k, v);
    }

    @Override // defpackage.yy5
    public V get(Object obj) {
        return this.b.get(obj);
    }

    @Override // defpackage.yy5
    public V putIfAbsent(K k, V v) {
        if (this.b.size() >= this.a) {
            synchronized (this) {
                try {
                    if (this.b.size() >= this.a) {
                        a();
                    }
                } finally {
                }
            }
        }
        return this.b.putIfAbsent(k, v);
    }

    protected Object readResolve() {
        int i = this.c;
        return new zi5(i, i);
    }
}
