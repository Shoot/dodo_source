package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.i1;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v.a;
import androidx.datastore.preferences.protobuf.x;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes.dex */
public abstract class v<MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, v<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected e1 unknownFields = e1.e();
    protected int memoizedSerializedSize = -1;

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0028a<MessageType, BuilderType> {
        private final MessageType a;
        protected MessageType b;
        protected boolean c = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) messagetype.t(f.NEW_MUTABLE_INSTANCE);
        }

        private void w(MessageType messagetype, MessageType messagetype2) {
            t0.a().e(messagetype).a(messagetype, messagetype2);
        }

        @Override // androidx.datastore.preferences.protobuf.l0.a
        /* renamed from: o */
        public final MessageType a() {
            MessageType k = k();
            if (k.isInitialized()) {
                return k;
            }
            throw a.AbstractC0028a.n(k);
        }

        @Override // androidx.datastore.preferences.protobuf.l0.a
        /* renamed from: p */
        public MessageType k() {
            if (this.c) {
                return this.b;
            }
            this.b.B();
            this.c = true;
            return this.b;
        }

        /* renamed from: q */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) f().e();
            buildertype.v(k());
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void r() {
            if (this.c) {
                MessageType messagetype = (MessageType) this.b.t(f.NEW_MUTABLE_INSTANCE);
                w(messagetype, this.b);
                this.b = messagetype;
                this.c = false;
            }
        }

        @Override // defpackage.ci6
        /* renamed from: s */
        public MessageType f() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0028a
        /* renamed from: t */
        public BuilderType l(MessageType messagetype) {
            return v(messagetype);
        }

        public BuilderType v(MessageType messagetype) {
            r();
            w(this.b, messagetype);
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    protected static class b<T extends v<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {
        private final T b;

        public b(T t) {
            this.b = t;
        }

        @Override // defpackage.gr7
        /* renamed from: g */
        public T b(h hVar, n nVar) throws InvalidProtocolBufferException {
            return (T) v.H(this.b, hVar, nVar);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends v<MessageType, BuilderType> implements ci6 {
        protected s<d> extensions = s.h();

        /* JADX INFO: Access modifiers changed from: package-private */
        public s<d> K() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.v, androidx.datastore.preferences.protobuf.l0
        public /* bridge */ /* synthetic */ l0.a b() {
            return super.b();
        }

        @Override // androidx.datastore.preferences.protobuf.v, androidx.datastore.preferences.protobuf.l0
        public /* bridge */ /* synthetic */ l0.a e() {
            return super.e();
        }

        @Override // androidx.datastore.preferences.protobuf.v, defpackage.ci6
        public /* bridge */ /* synthetic */ l0 f() {
            return super.f();
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    static final class d implements s.b<d> {
        final int a;
        final i1.b b;
        final boolean c;
        final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.s.b
        public l0.a S(l0.a aVar, l0 l0Var) {
            return ((a) aVar).v((v) l0Var);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.a - dVar.a;
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public int e() {
            return this.a;
        }

        public x.d<?> g() {
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public boolean j() {
            return this.c;
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public i1.b l() {
            return this.b;
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public i1.c m() {
            return this.b.a();
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public boolean n() {
            return this.d;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static class e<ContainingType extends l0, Type> extends l<ContainingType, Type> {
        final l0 a;
        final d b;

        public i1.b a() {
            return this.b.l();
        }

        public l0 b() {
            return this.a;
        }

        public int c() {
            return this.b.e();
        }

        public boolean d() {
            return this.b.c;
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

    protected static final <T extends v<T, ?>> boolean A(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.t(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = t0.a().e(t).c(t);
        if (z) {
            f fVar = f.SET_MEMOIZED_IS_INITIALIZED;
            if (c2) {
                obj = t;
            } else {
                obj = null;
            }
            t.u(fVar, obj);
        }
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> x.i<E> C(x.i<E> iVar) {
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
    public static Object F(l0 l0Var, String str, Object[] objArr) {
        return new v0(l0Var, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends v<T, ?>> T G(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) r(H(t, h.f(inputStream), n.b()));
    }

    static <T extends v<T, ?>> T H(T t, h hVar, n nVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.t(f.NEW_MUTABLE_INSTANCE);
        try {
            x0 e2 = t0.a().e(t2);
            e2.h(t2, i.Q(hVar), nVar);
            e2.b(t2);
            return t2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage()).k(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends v<?, ?>> void I(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    private static <T extends v<T, ?>> T r(T t) throws InvalidProtocolBufferException {
        if (t != null && !t.isInitialized()) {
            throw t.n().a().k(t);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> x.i<E> w() {
        return u0.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends v<?, ?>> T x(Class<T> cls) {
        v<?, ?> vVar = defaultInstanceMap.get(cls);
        if (vVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (vVar == null) {
            vVar = (T) ((v) g1.i(cls)).f();
            if (vVar != null) {
                defaultInstanceMap.put(cls, vVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) vVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object z(Method method, Object obj, Object... objArr) {
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

    protected void B() {
        t0.a().e(this).b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: D */
    public final BuilderType e() {
        return (BuilderType) t(f.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: J */
    public final BuilderType b() {
        BuilderType buildertype = (BuilderType) t(f.NEW_BUILDER);
        buildertype.v(this);
        return buildertype;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public int d() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = t0.a().e(this).d(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f().getClass().isInstance(obj)) {
            return false;
        }
        return t0.a().e(this).g(this, (v) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final gr7<MessageType> g() {
        return (gr7) t(f.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void h(CodedOutputStream codedOutputStream) throws IOException {
        t0.a().e(this).i(this, j.P(codedOutputStream));
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int f2 = t0.a().e(this).f(this);
        this.memoizedHashCode = f2;
        return f2;
    }

    @Override // defpackage.ci6
    public final boolean isInitialized() {
        return A(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int j() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    void o(int i) {
        this.memoizedSerializedSize = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object q() throws Exception {
        return t(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType s() {
        return (BuilderType) t(f.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object t(f fVar) {
        return v(fVar, null, null);
    }

    public String toString() {
        return m0.e(this, super.toString());
    }

    protected Object u(f fVar, Object obj) {
        return v(fVar, obj, null);
    }

    protected abstract Object v(f fVar, Object obj, Object obj2);

    @Override // defpackage.ci6
    /* renamed from: y */
    public final MessageType f() {
        return (MessageType) t(f.GET_DEFAULT_INSTANCE);
    }
}
