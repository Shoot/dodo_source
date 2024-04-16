package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.b2.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public abstract class b2<MessageType extends b2<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends w0<MessageType, BuilderType> {
    private static Map<Object, b2<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected a4 zzb = a4.k();

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    protected static class a<T extends b2<T, ?>> extends y0<T> {
        private final T b;

        public a(T t) {
            this.b = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    public static abstract class b<MessageType extends b2<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends n0d<MessageType, BuilderType> {
        private final MessageType a;
        protected MessageType b;

        /* JADX INFO: Access modifiers changed from: protected */
        public b(MessageType messagetype) {
            this.a = messagetype;
            if (!messagetype.G()) {
                this.b = (MessageType) messagetype.A();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void m(MessageType messagetype, MessageType messagetype2) {
            g3.a().c(messagetype).e(messagetype, messagetype2);
        }

        private final BuilderType r(byte[] bArr, int i, int i2, s1 s1Var) throws zzjq {
            if (!this.b.G()) {
                q();
            }
            try {
                g3.a().c(this.b).f(this.b, bArr, 0, i2, new c1(s1Var));
                return this;
            } catch (zzjq e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzjq.f();
            }
        }

        @Override // defpackage.n0d
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            b bVar = (b) this.a.o(e.e, null, null);
            bVar.b = (MessageType) x();
            return bVar;
        }

        @Override // defpackage.i3d
        public final boolean g() {
            return b2.v(this.b, false);
        }

        @Override // defpackage.n0d
        public final /* synthetic */ n0d i(byte[] bArr, int i, int i2) throws zzjq {
            return r(bArr, 0, i2, s1.c);
        }

        @Override // defpackage.n0d
        public final /* synthetic */ n0d j(byte[] bArr, int i, int i2, s1 s1Var) throws zzjq {
            return r(bArr, 0, i2, s1Var);
        }

        public final BuilderType l(MessageType messagetype) {
            if (this.a.equals(messagetype)) {
                return this;
            }
            if (!this.b.G()) {
                q();
            }
            m(this.b, messagetype);
            return this;
        }

        @Override // defpackage.j3d
        /* renamed from: n */
        public final MessageType u() {
            MessageType messagetype = (MessageType) x();
            if (messagetype.g()) {
                return messagetype;
            }
            throw new zzmf(messagetype);
        }

        @Override // defpackage.j3d
        /* renamed from: o */
        public MessageType x() {
            if (!this.b.G()) {
                return this.b;
            }
            this.b.E();
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void p() {
            if (!this.b.G()) {
                q();
            }
        }

        protected void q() {
            MessageType messagetype = (MessageType) this.a.A();
            m(messagetype, this.b);
            this.b = messagetype;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    static final class c implements h2d<c> {
        @Override // defpackage.h2d
        public final u3d Z(u3d u3dVar, u3d u3dVar2) {
            throw new NoSuchMethodError();
        }

        @Override // defpackage.h2d
        public final q4d b() {
            throw new NoSuchMethodError();
        }

        @Override // defpackage.h2d
        public final l5d c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // defpackage.h2d
        public final boolean d() {
            throw new NoSuchMethodError();
        }

        @Override // defpackage.h2d
        public final boolean f() {
            throw new NoSuchMethodError();
        }

        @Override // defpackage.h2d
        public final j3d j0(j3d j3dVar, h3d h3dVar) {
            throw new NoSuchMethodError();
        }

        @Override // defpackage.h2d
        public final int zza() {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends b2<MessageType, BuilderType> implements i3d {
        protected x1<c> zzc = x1.i();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final x1<c> H() {
            if (this.zzc.r()) {
                this.zzc = (x1) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    public enum e {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    public static class f<ContainingType extends h3d, Type> extends s1d<ContainingType, Type> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static m2d B() {
        return e2.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static p2d C() {
        return n2.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> o2d<E> D() {
        return i3.g();
    }

    private final int m() {
        return g3.a().c(this).d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends b2<?, ?>> T n(Class<T> cls) {
        b2<?, ?> b2Var = zzc.get(cls);
        if (b2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                b2Var = zzc.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (b2Var == null) {
            b2Var = (T) ((b2) e4.b(cls)).o(e.f, null, null);
            if (b2Var != null) {
                zzc.put(cls, b2Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) b2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object p(Method method, Object obj, Object... objArr) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object q(h3d h3dVar, String str, Object[] objArr) {
        return new h3(h3dVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> o2d<E> r(o2d<E> o2dVar) {
        int i;
        int size = o2dVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return o2dVar.e(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static p2d s(p2d p2dVar) {
        int i;
        int size = p2dVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return p2dVar.m(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends b2<?, ?>> void t(Class<T> cls, T t) {
        t.F();
        zzc.put(cls, t);
    }

    protected static final <T extends b2<T, ?>> boolean v(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.o(e.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b2 = g3.a().c(t).b(t);
        if (z) {
            int i = e.b;
            if (b2) {
                obj = t;
            } else {
                obj = null;
            }
            t.o(i, obj, null);
        }
        return b2;
    }

    private final int w(j3<?> j3Var) {
        if (j3Var == null) {
            return g3.a().c(this).a(this);
        }
        return j3Var.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MessageType A() {
        return (MessageType) o(e.d, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E() {
        g3.a().c(this).c(this);
        F();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    final int a(j3 j3Var) {
        if (G()) {
            int w = w(j3Var);
            if (w >= 0) {
                return w;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + w);
        } else if (j() != Integer.MAX_VALUE) {
            return j();
        } else {
            int w2 = w(j3Var);
            l(w2);
            return w2;
        }
    }

    @Override // defpackage.h3d
    public final void b(zzio zzioVar) throws IOException {
        g3.a().c(this).h(this, r1.a(zzioVar));
    }

    @Override // defpackage.h3d
    public final /* synthetic */ j3d c() {
        return ((b) o(e.e, null, null)).l(this);
    }

    @Override // defpackage.i3d
    public final /* synthetic */ h3d d() {
        return (b2) o(e.f, null, null);
    }

    @Override // defpackage.h3d
    public final /* synthetic */ j3d e() {
        return (b) o(e.e, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return g3.a().c(this).g(this, (b2) obj);
    }

    @Override // defpackage.h3d
    public final int f() {
        return a(null);
    }

    @Override // defpackage.i3d
    public final boolean g() {
        return v(this, true);
    }

    public int hashCode() {
        if (G()) {
            return m();
        }
        if (this.zza == 0) {
            this.zza = m();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    final int j() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.w0
    final void l(int i) {
        if (i >= 0) {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object o(int i, Object obj, Object obj2);

    public String toString() {
        return a3.a(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends b2<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType y() {
        return (BuilderType) o(e.e, null, null);
    }

    public final BuilderType z() {
        return (BuilderType) ((b) o(e.e, null, null)).l(this);
    }
}
