package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public abstract class f implements Iterable<Byte>, Serializable {
    public static final f b = new j(w.d);
    private static final InterfaceC0250f c;
    private static final Comparator<f> d;
    private int a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public class a extends c {
        private int a = 0;
        private final int b;

        a() {
            this.b = f.this.size();
        }

        @Override // com.google.protobuf.f.g
        public byte d() {
            int i = this.a;
            if (i < this.b) {
                this.a = i + 1;
                return f.this.E(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a < this.b) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    class b implements Comparator<f> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            g it = fVar.iterator();
            g it2 = fVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compareTo = Integer.valueOf(f.h0(it.d())).compareTo(Integer.valueOf(f.h0(it2.d())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(fVar.size()).compareTo(Integer.valueOf(fVar2.size()));
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(d());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC0250f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.protobuf.f.InterfaceC0250f
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static final class e extends j {
        private final int f;
        private final int g;

        e(byte[] bArr, int i, int i2) {
            super(bArr);
            f.k(i, i + i2, bArr.length);
            this.f = i;
            this.g = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.f.j, com.google.protobuf.f
        byte E(int i) {
            return this.e[this.f + i];
        }

        @Override // com.google.protobuf.f.j
        protected int F0() {
            return this.f;
        }

        @Override // com.google.protobuf.f.j, com.google.protobuf.f
        public byte d(int i) {
            f.f(i, size());
            return this.e[this.f + i];
        }

        @Override // com.google.protobuf.f.j, com.google.protobuf.f
        public int size() {
            return this.g;
        }

        Object writeReplace() {
            return f.p0(e0());
        }

        @Override // com.google.protobuf.f.j, com.google.protobuf.f
        protected void x(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.e, F0() + i, bArr, i2, i3);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private interface InterfaceC0250f {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public interface g extends Iterator<Byte> {
        byte d();
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    static final class h {
        private final CodedOutputStream a;
        private final byte[] b;

        /* synthetic */ h(int i, a aVar) {
            this(i);
        }

        public f a() {
            this.a.c();
            return new j(this.b);
        }

        public CodedOutputStream b() {
            return this.a;
        }

        private h(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            this.a = CodedOutputStream.c0(bArr);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    static abstract class i extends f {
        i() {
        }

        @Override // com.google.protobuf.f, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static class j extends i {
        protected final byte[] e;

        j(byte[] bArr) {
            bArr.getClass();
            this.e = bArr;
        }

        @Override // com.google.protobuf.f
        byte E(int i) {
            return this.e[i];
        }

        protected int F0() {
            return 0;
        }

        @Override // com.google.protobuf.f
        public final boolean G() {
            int F0 = F0();
            return g1.n(this.e, F0, size() + F0);
        }

        @Override // com.google.protobuf.f
        public final com.google.protobuf.g Q() {
            return com.google.protobuf.g.h(this.e, F0(), size(), true);
        }

        @Override // com.google.protobuf.f
        protected final int T(int i, int i2, int i3) {
            return w.i(i, this.e, F0() + i2, i3);
        }

        @Override // com.google.protobuf.f
        public final f Z(int i, int i2) {
            int k = f.k(i, i2, size());
            if (k == 0) {
                return f.b;
            }
            return new e(this.e, F0() + i, k);
        }

        @Override // com.google.protobuf.f
        public byte d(int i) {
            return this.e[i];
        }

        @Override // com.google.protobuf.f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f) || size() != ((f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                int W = W();
                int W2 = jVar.W();
                if (W != 0 && W2 != 0 && W != W2) {
                    return false;
                }
                return x0(jVar, 0, size());
            }
            return obj.equals(this);
        }

        @Override // com.google.protobuf.f
        protected final String m0(Charset charset) {
            return new String(this.e, F0(), size(), charset);
        }

        @Override // com.google.protobuf.f
        final void r0(gk0 gk0Var) throws IOException {
            gk0Var.a(this.e, F0(), size());
        }

        @Override // com.google.protobuf.f
        public int size() {
            return this.e.length;
        }

        @Override // com.google.protobuf.f
        protected void x(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.e, i, bArr, i2, i3);
        }

        final boolean x0(f fVar, int i, int i2) {
            if (i2 <= fVar.size()) {
                int i3 = i + i2;
                if (i3 <= fVar.size()) {
                    if (fVar instanceof j) {
                        j jVar = (j) fVar;
                        byte[] bArr = this.e;
                        byte[] bArr2 = jVar.e;
                        int F0 = F0() + i2;
                        int F02 = F0();
                        int F03 = jVar.F0() + i;
                        while (F02 < F0) {
                            if (bArr[F02] != bArr2[F03]) {
                                return false;
                            }
                            F02++;
                            F03++;
                        }
                        return true;
                    }
                    return fVar.Z(i, i3).equals(Z(0, i2));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + fVar.size());
            }
            throw new IllegalArgumentException("Length too large: " + i2 + size());
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    private static final class k implements InterfaceC0250f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.protobuf.f.InterfaceC0250f
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        InterfaceC0250f dVar;
        if (com.google.protobuf.d.c()) {
            dVar = new k(null);
        } else {
            dVar = new d(null);
        }
        c = dVar;
        d = new b();
    }

    f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h P(int i2) {
        return new h(i2, null);
    }

    static void f(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h0(byte b2) {
        return b2 & 255;
    }

    static int k(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) < 0) {
            if (i2 >= 0) {
                if (i3 < i2) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
                }
                throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        return i5;
    }

    private String o0() {
        if (size() <= 50) {
            return b1.a(this);
        }
        return b1.a(Z(0, 47)) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f p0(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f q0(byte[] bArr, int i2, int i3) {
        return new e(bArr, i2, i3);
    }

    public static f u(byte[] bArr, int i2, int i3) {
        k(i2, i2 + i3, bArr.length);
        return new j(c.a(bArr, i2, i3));
    }

    public static f w(String str) {
        return new j(str.getBytes(w.b));
    }

    abstract byte E(int i2);

    public abstract boolean G();

    @Override // java.lang.Iterable
    /* renamed from: H */
    public g iterator() {
        return new a();
    }

    public abstract com.google.protobuf.g Q();

    protected abstract int T(int i2, int i3, int i4);

    protected final int W() {
        return this.a;
    }

    public abstract f Z(int i2, int i3);

    public abstract byte d(int i2);

    public final byte[] e0() {
        int size = size();
        if (size == 0) {
            return w.d;
        }
        byte[] bArr = new byte[size];
        x(bArr, 0, 0, size);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.a;
        if (i2 == 0) {
            int size = size();
            i2 = T(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.a = i2;
        }
        return i2;
    }

    public final String l0(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return m0(charset);
    }

    protected abstract String m0(Charset charset);

    public final String n0() {
        return l0(w.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void r0(gk0 gk0Var) throws IOException;

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), o0());
    }

    protected abstract void x(byte[] bArr, int i2, int i3, int i4);
}
