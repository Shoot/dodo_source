package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.m0;
import com.google.crypto.tink.shaded.protobuf.t;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.w.a;
import com.google.crypto.tink.shaded.protobuf.y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes2.dex */
public abstract class w<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected f1 unknownFields = f1.c();
    protected int memoizedSerializedSize = -1;

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0238a<MessageType, BuilderType> {
        private final MessageType a;
        protected MessageType b;
        protected boolean c = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) messagetype.s(f.NEW_MUTABLE_INSTANCE);
        }

        private void w(MessageType messagetype, MessageType messagetype2) {
            u0.a().e(messagetype).a(messagetype, messagetype2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.m0.a
        /* renamed from: n */
        public final MessageType a() {
            MessageType k = k();
            if (k.isInitialized()) {
                return k;
            }
            throw a.AbstractC0238a.m(k);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.m0.a
        /* renamed from: o */
        public MessageType k() {
            if (this.c) {
                return this.b;
            }
            this.b.A();
            this.c = true;
            return this.b;
        }

        /* renamed from: p */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) f().e();
            buildertype.v(k());
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void q() {
            if (this.c) {
                r();
                this.c = false;
            }
        }

        protected void r() {
            MessageType messagetype = (MessageType) this.b.s(f.NEW_MUTABLE_INSTANCE);
            w(messagetype, this.b);
            this.b = messagetype;
        }

        @Override // defpackage.ai6
        /* renamed from: s */
        public MessageType f() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0238a
        /* renamed from: t */
        public BuilderType j(MessageType messagetype) {
            return v(messagetype);
        }

        public BuilderType v(MessageType messagetype) {
            q();
            w(this.b, messagetype);
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    protected static class b<T extends w<T, ?>> extends com.google.crypto.tink.shaded.protobuf.b<T> {
        private final T b;

        public b(T t) {
            this.b = t;
        }

        @Override // defpackage.dr7
        /* renamed from: g */
        public T a(i iVar, o oVar) throws InvalidProtocolBufferException {
            return (T) w.H(this.b, iVar, oVar);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends w<MessageType, BuilderType> implements ai6 {
        protected t<d> extensions = t.h();

        /* JADX INFO: Access modifiers changed from: package-private */
        public t<d> L() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    static final class d implements t.b<d> {
        final y.d<?> a;
        final int b;
        final j1.b c;
        final boolean d;
        final boolean e;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.b - dVar.b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t.b
        public int e() {
            return this.b;
        }

        public y.d<?> g() {
            return this.a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t.b
        public boolean j() {
            return this.d;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t.b
        public j1.b l() {
            return this.c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t.b
        public j1.c m() {
            return this.c.a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t.b
        public boolean n() {
            return this.e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.t.b
        public m0.a y(m0.a aVar, m0 m0Var) {
            return ((a) aVar).v((w) m0Var);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static class e<ContainingType extends m0, Type> extends m<ContainingType, Type> {
        final m0 a;
        final d b;

        public j1.b a() {
            return this.b.l();
        }

        public m0 b() {
            return this.a;
        }

        public int c() {
            return this.b.e();
        }

        public boolean d() {
            return this.b.d;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> y.i<E> B(y.i<E> iVar) {
        int i;
        int size = iVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return iVar.i(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object D(m0 m0Var, String str, Object[] objArr) {
        return new w0(m0Var, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends w<T, ?>> T E(T t, h hVar, o oVar) throws InvalidProtocolBufferException {
        return (T) q(G(t, hVar, oVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends w<T, ?>> T F(T t, byte[] bArr, o oVar) throws InvalidProtocolBufferException {
        return (T) q(I(t, bArr, 0, bArr.length, oVar));
    }

    private static <T extends w<T, ?>> T G(T t, h hVar, o oVar) throws InvalidProtocolBufferException {
        i T = hVar.T();
        T t2 = (T) H(t, T, oVar);
        try {
            T.a(0);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.l(t2);
        }
    }

    static <T extends w<T, ?>> T H(T t, i iVar, o oVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.s(f.NEW_MUTABLE_INSTANCE);
        try {
            y0 e2 = u0.a().e(t2);
            e2.i(t2, j.Q(iVar), oVar);
            e2.b(t2);
            return t2;
        } catch (InvalidProtocolBufferException e3) {
            e = e3;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.l(t2);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).l(t2);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    static <T extends w<T, ?>> T I(T t, byte[] bArr, int i, int i2, o oVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.s(f.NEW_MUTABLE_INSTANCE);
        try {
            y0 e2 = u0.a().e(t2);
            e2.h(t2, bArr, i, i + i2, new e.b(oVar));
            e2.b(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (InvalidProtocolBufferException e3) {
            e = e3;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.l(t2);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).l(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m().l(t2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends w<?, ?>> void J(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    private static <T extends w<T, ?>> T q(T t) throws InvalidProtocolBufferException {
        if (t != null && !t.isInitialized()) {
            throw t.n().a().l(t);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> y.i<E> v() {
        return v0.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends w<?, ?>> T w(Class<T> cls) {
        w<?, ?> wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (wVar == null) {
            wVar = (T) ((w) h1.k(cls)).f();
            if (wVar != null) {
                defaultInstanceMap.put(cls, wVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object y(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    protected static final <T extends w<T, ?>> boolean z(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.s(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = u0.a().e(t).c(t);
        if (z) {
            f fVar = f.SET_MEMOIZED_IS_INITIALIZED;
            if (c2) {
                obj = t;
            } else {
                obj = null;
            }
            t.t(fVar, obj);
        }
        return c2;
    }

    protected void A() {
        u0.a().e(this).b(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* renamed from: C */
    public final BuilderType e() {
        return (BuilderType) s(f.NEW_BUILDER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* renamed from: K */
    public final BuilderType b() {
        BuilderType buildertype = (BuilderType) s(f.NEW_BUILDER);
        buildertype.v(this);
        return buildertype;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public int d() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = u0.a().e(this).d(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return u0.a().e(this).g(this, (w) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final dr7<MessageType> g() {
        return (dr7) s(f.GET_PARSER);
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int f2 = u0.a().e(this).f(this);
        this.memoizedHashCode = f2;
        return f2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        u0.a().e(this).j(this, k.P(codedOutputStream));
    }

    @Override // defpackage.ai6
    public final boolean isInitialized() {
        return z(this, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    int j() {
        return this.memoizedSerializedSize;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    void o(int i) {
        this.memoizedSerializedSize = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object p() throws Exception {
        return s(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType r() {
        return (BuilderType) s(f.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object s(f fVar) {
        return u(fVar, null, null);
    }

    protected Object t(f fVar, Object obj) {
        return u(fVar, obj, null);
    }

    public String toString() {
        return n0.e(this, super.toString());
    }

    protected abstract Object u(f fVar, Object obj, Object obj2);

    @Override // defpackage.ai6
    /* renamed from: x */
    public final MessageType f() {
        return (MessageType) s(f.GET_DEFAULT_INSTANCE);
    }
}
