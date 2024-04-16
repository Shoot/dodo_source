package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0249a;
import com.google.protobuf.f;
import com.google.protobuf.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: AbstractMessageLite.java */
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0249a<MessageType, BuilderType>> implements k0 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0249a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0249a<MessageType, BuilderType>> implements k0.a {
        protected static <T> void p(Iterable<T> iterable, List<? super T> list) {
            w.a(iterable);
            if (iterable instanceof do5) {
                List<?> n = ((do5) iterable).n();
                do5 do5Var = (do5) list;
                int size = list.size();
                for (Object obj : n) {
                    if (obj == null) {
                        String str = "Element at index " + (do5Var.size() - size) + " is null.";
                        for (int size2 = do5Var.size() - 1; size2 >= size; size2--) {
                            do5Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (obj instanceof f) {
                        do5Var.L((f) obj);
                    } else {
                        do5Var.add((String) obj);
                    }
                }
            } else if (iterable instanceof r0) {
                list.addAll((Collection) iterable);
            } else {
                q(iterable, list);
            }
        }

        private static <T> void q(Iterable<T> iterable, List<? super T> list) {
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
        public static UninitializedMessageException t(k0 k0Var) {
            return new UninitializedMessageException(k0Var);
        }

        protected abstract BuilderType r(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.k0.a
        /* renamed from: s */
        public BuilderType n0(k0 k0Var) {
            if (f().getClass().isInstance(k0Var)) {
                return (BuilderType) r((a) k0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void p(Iterable<T> iterable, List<? super T> list) {
        AbstractC0249a.p(iterable, list);
    }

    private String s(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.k0
    public f c() {
        try {
            f.h P = f.P(d());
            l(P.b());
            return P.a();
        } catch (IOException e) {
            throw new RuntimeException(s("ByteString"), e);
        }
    }

    int q() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r(w0 w0Var) {
        int q = q();
        if (q == -1) {
            int d = w0Var.d(this);
            u(d);
            return d;
        }
        return q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UninitializedMessageException t() {
        return new UninitializedMessageException(this);
    }

    void u(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] v() {
        try {
            byte[] bArr = new byte[d()];
            CodedOutputStream c0 = CodedOutputStream.c0(bArr);
            l(c0);
            c0.c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(s("byte array"), e);
        }
    }
}
