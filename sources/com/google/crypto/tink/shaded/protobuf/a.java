package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.AbstractC0238a;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.m0;
import java.io.IOException;
/* compiled from: AbstractMessageLite.java */
/* loaded from: classes2.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0238a<MessageType, BuilderType>> implements m0 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0238a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0238a<MessageType, BuilderType>> implements m0.a {
        /* JADX INFO: Access modifiers changed from: protected */
        public static UninitializedMessageException m(m0 m0Var) {
            return new UninitializedMessageException(m0Var);
        }

        protected abstract BuilderType j(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.m0.a
        /* renamed from: l */
        public BuilderType q1(m0 m0Var) {
            if (f().getClass().isInstance(m0Var)) {
                return (BuilderType) j((a) m0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public h c() {
        try {
            h.C0239h Q = h.Q(d());
            i(Q.b());
            return Q.a();
        } catch (IOException e) {
            throw new RuntimeException(m("ByteString"), e);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public byte[] h() {
        try {
            byte[] bArr = new byte[d()];
            CodedOutputStream d0 = CodedOutputStream.d0(bArr);
            i(d0);
            d0.c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m("byte array"), e);
        }
    }

    int j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l(y0 y0Var) {
        int j = j();
        if (j == -1) {
            int d = y0Var.d(this);
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
}
