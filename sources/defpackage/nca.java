package defpackage;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
/* compiled from: Serialization.java */
/* renamed from: nca  reason: default package */
/* loaded from: classes2.dex */
final class nca {

    /* compiled from: Serialization.java */
    /* renamed from: nca$b */
    /* loaded from: classes2.dex */
    static final class b<T> {
        private final Field a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(T t, int i) {
            try {
                this.a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(T t, Object obj) {
            try {
                this.a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        private b(Field field) {
            this.a = field;
            field.setAccessible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> b<T> a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void b(dq6<K, V> dq6Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(dq6Var.a().size());
        for (Map.Entry<K, Collection<V>> entry : dq6Var.a().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            for (V v : entry.getValue()) {
                objectOutputStream.writeObject(v);
            }
        }
    }
}
