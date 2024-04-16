package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.h1;
import com.google.protobuf.k0;
import com.google.protobuf.r;
import com.google.protobuf.u;
import com.google.protobuf.u.a;
import com.google.protobuf.w;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes.dex */
public abstract class u<MessageType extends u<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, u<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected d1 unknownFields = d1.c();

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends u<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0249a<MessageType, BuilderType> {
        private final MessageType a;
        protected MessageType b;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.a = messagetype;
            if (!messagetype.N()) {
                this.b = H();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void G(MessageType messagetype, MessageType messagetype2) {
            s0.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType H() {
            return (MessageType) this.a.U();
        }

        protected void A() {
            MessageType H = H();
            G(H, this.b);
            this.b = H;
        }

        @Override // defpackage.bi6
        /* renamed from: B */
        public MessageType f() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.a.AbstractC0249a
        /* renamed from: C */
        public BuilderType r(MessageType messagetype) {
            return F(messagetype);
        }

        @Override // com.google.protobuf.k0.a
        /* renamed from: D */
        public BuilderType q0(g gVar, m mVar) throws IOException {
            z();
            try {
                s0.a().d(this.b).i(this.b, h.Q(gVar), mVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        public BuilderType F(MessageType messagetype) {
            if (f().equals(messagetype)) {
                return this;
            }
            z();
            G(this.b, messagetype);
            return this;
        }

        @Override // defpackage.bi6
        public final boolean isInitialized() {
            return u.M(this.b, false);
        }

        @Override // com.google.protobuf.k0.a
        /* renamed from: v */
        public final MessageType a() {
            MessageType k = k();
            if (k.isInitialized()) {
                return k;
            }
            throw a.AbstractC0249a.t(k);
        }

        @Override // com.google.protobuf.k0.a
        /* renamed from: w */
        public MessageType k() {
            if (!this.b.N()) {
                return this.b;
            }
            this.b.O();
            return this.b;
        }

        /* renamed from: y */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) f().e();
            buildertype.b = k();
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void z() {
            if (!this.b.N()) {
                A();
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    protected static class b<T extends u<T, ?>> extends com.google.protobuf.b<T> {
        private final T b;

        public b(T t) {
            this.b = t;
        }

        @Override // defpackage.er7
        /* renamed from: g */
        public T b(g gVar, m mVar) throws InvalidProtocolBufferException {
            return (T) u.V(this.b, gVar, mVar);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends u<MessageType, BuilderType> implements bi6 {
        protected r<d> extensions = r.h();

        /* JADX INFO: Access modifiers changed from: package-private */
        public r<d> Z() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.u, com.google.protobuf.k0
        public /* bridge */ /* synthetic */ k0.a b() {
            return super.b();
        }

        @Override // com.google.protobuf.u, com.google.protobuf.k0
        public /* bridge */ /* synthetic */ k0.a e() {
            return super.e();
        }

        @Override // com.google.protobuf.u, defpackage.bi6
        public /* bridge */ /* synthetic */ k0 f() {
            return super.f();
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    static final class d implements r.b<d> {
        final w.d<?> a;
        final int b;
        final h1.b c;
        final boolean d;
        final boolean e;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.b - dVar.b;
        }

        @Override // com.google.protobuf.r.b
        public int e() {
            return this.b;
        }

        public w.d<?> g() {
            return this.a;
        }

        @Override // com.google.protobuf.r.b
        public boolean j() {
            return this.d;
        }

        @Override // com.google.protobuf.r.b
        public h1.b l() {
            return this.c;
        }

        @Override // com.google.protobuf.r.b
        public h1.c m() {
            return this.c.i();
        }

        @Override // com.google.protobuf.r.b
        public boolean n() {
            return this.e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.r.b
        public k0.a r(k0.a aVar, k0 k0Var) {
            return ((a) aVar).F((u) k0Var);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static class e<ContainingType extends k0, Type> extends k<ContainingType, Type> {
        final k0 a;
        final d b;

        public h1.b a() {
            return this.b.l();
        }

        public k0 b() {
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
    /* loaded from: classes.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    private int A(w0<?> w0Var) {
        if (w0Var == null) {
            return s0.a().d(this).d(this);
        }
        return w0Var.d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static w.g F() {
        return v.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> w.i<E> G() {
        return t0.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends u<?, ?>> T H(Class<T> cls) {
        u<?, ?> uVar = defaultInstanceMap.get(cls);
        if (uVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                uVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (uVar == null) {
            uVar = (T) ((u) f1.k(cls)).f();
            if (uVar != null) {
                defaultInstanceMap.put(cls, uVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) uVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object L(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends u<T, ?>> boolean M(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.C(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = s0.a().d(t).c(t);
        if (z) {
            f fVar = f.SET_MEMOIZED_IS_INITIALIZED;
            if (c2) {
                obj = t;
            } else {
                obj = null;
            }
            t.D(fVar, obj);
        }
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.w$g] */
    public static w.g Q(w.g gVar) {
        int i;
        int size = gVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return gVar.i(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> w.i<E> R(w.i<E> iVar) {
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
    public static Object T(k0 k0Var, String str, Object[] objArr) {
        return new u0(k0Var, str, objArr);
    }

    static <T extends u<T, ?>> T V(T t, g gVar, m mVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.U();
        try {
            w0 d2 = s0.a().d(t2);
            d2.i(t2, h.Q(gVar), mVar);
            d2.b(t2);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.l(t2);
        } catch (UninitializedMessageException e3) {
            throw e3.a().l(t2);
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

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends u<?, ?>> void W(Class<T> cls, T t) {
        t.P();
        defaultInstanceMap.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends u<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType B() {
        return (BuilderType) C(f.NEW_BUILDER);
    }

    protected Object C(f fVar) {
        return E(fVar, null, null);
    }

    protected Object D(f fVar, Object obj) {
        return E(fVar, obj, null);
    }

    protected abstract Object E(f fVar, Object obj, Object obj2);

    @Override // defpackage.bi6
    /* renamed from: I */
    public final MessageType f() {
        return (MessageType) C(f.GET_DEFAULT_INSTANCE);
    }

    int J() {
        return this.memoizedHashCode;
    }

    boolean K() {
        if (J() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void O() {
        s0.a().d(this).b(this);
        P();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.k0
    /* renamed from: S */
    public final BuilderType e() {
        return (BuilderType) C(f.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageType U() {
        return (MessageType) C(f.NEW_MUTABLE_INSTANCE);
    }

    void X(int i) {
        this.memoizedHashCode = i;
    }

    @Override // com.google.protobuf.k0
    /* renamed from: Y */
    public final BuilderType b() {
        return (BuilderType) ((a) C(f.NEW_BUILDER)).F(this);
    }

    @Override // com.google.protobuf.k0
    public int d() {
        return r(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return s0.a().d(this).g(this, (u) obj);
    }

    @Override // com.google.protobuf.k0
    public final er7<MessageType> g() {
        return (er7) C(f.GET_PARSER);
    }

    public int hashCode() {
        if (N()) {
            return z();
        }
        if (K()) {
            X(z());
        }
        return J();
    }

    @Override // defpackage.bi6
    public final boolean isInitialized() {
        return M(this, true);
    }

    @Override // com.google.protobuf.k0
    public void l(CodedOutputStream codedOutputStream) throws IOException {
        s0.a().d(this).h(this, i.P(codedOutputStream));
    }

    @Override // com.google.protobuf.a
    int q() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.a
    int r(w0 w0Var) {
        if (N()) {
            int A = A(w0Var);
            if (A >= 0) {
                return A;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + A);
        } else if (q() != Integer.MAX_VALUE) {
            return q();
        } else {
            int A2 = A(w0Var);
            u(A2);
            return A2;
        }
    }

    public String toString() {
        return l0.f(this, super.toString());
    }

    @Override // com.google.protobuf.a
    void u(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object w() throws Exception {
        return C(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        u(Integer.MAX_VALUE);
    }

    int z() {
        return s0.a().d(this).f(this);
    }
}
