package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0028a;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.l0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: AbstractMessageLite.java */
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0028a<MessageType, BuilderType>> implements l0 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0028a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0028a<MessageType, BuilderType>> implements l0.a {
        protected static <T> void i(Iterable<T> iterable, List<? super T> list) {
            x.a(iterable);
            if (iterable instanceof eo5) {
                List<?> n = ((eo5) iterable).n();
                eo5 eo5Var = (eo5) list;
                int size = list.size();
                for (Object obj : n) {
                    if (obj == null) {
                        String str = "Element at index " + (eo5Var.size() - size) + " is null.";
                        for (int size2 = eo5Var.size() - 1; size2 >= size; size2--) {
                            eo5Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (obj instanceof g) {
                        eo5Var.Y0((g) obj);
                    } else {
                        eo5Var.add((String) obj);
                    }
                }
            } else if (iterable instanceof s0) {
                list.addAll((Collection) iterable);
            } else {
                j(iterable, list);
            }
        }

        private static <T> void j(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static UninitializedMessageException n(l0 l0Var) {
            return new UninitializedMessageException(l0Var);
        }

        protected abstract BuilderType l(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.l0.a
        /* renamed from: m */
        public BuilderType E(l0 l0Var) {
            if (f().getClass().isInstance(l0Var)) {
                return (BuilderType) l((a) l0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void i(Iterable<T> iterable, List<? super T> list) {
        AbstractC0028a.i(iterable, list);
    }

    private String m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public g c() {
        try {
            g.h Q = g.Q(d());
            h(Q.b());
            return Q.a();
        } catch (IOException e) {
            throw new RuntimeException(m("ByteString"), e);
        }
    }

    int j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l(x0 x0Var) {
        int j = j();
        if (j == -1) {
            int d = x0Var.d(this);
            o(d);
            return d;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UninitializedMessageException n() {
        return new UninitializedMessageException(this);
    }

    void o(int i) {
        throw new UnsupportedOperationException();
    }

    public void p(OutputStream outputStream) throws IOException {
        CodedOutputStream f0 = CodedOutputStream.f0(outputStream, CodedOutputStream.I(d()));
        h(f0);
        f0.c0();
    }
}
