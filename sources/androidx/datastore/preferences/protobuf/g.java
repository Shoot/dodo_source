package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public abstract class g implements Iterable<Byte>, Serializable {
    public static final g b = new j(x.c);
    private static final f c;
    private static final Comparator<g> d;
    private int a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public class a extends c {
        private int a = 0;
        private final int b;

        a() {
            this.b = g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.g.InterfaceC0029g
        public byte d() {
            int i = this.a;
            if (i < this.b) {
                this.a = i + 1;
                return g.this.G(i);
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
    static class b implements Comparator<g> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(g gVar, g gVar2) {
            InterfaceC0029g it = gVar.iterator();
            InterfaceC0029g it2 = gVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(g.l0(it.d()), g.l0(it2.d()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(gVar.size(), gVar2.size());
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    static abstract class c implements InterfaceC0029g {
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
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
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
            g.k(i, i + i2, bArr.length);
            this.f = i;
            this.g = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        protected void E(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.e, F0() + i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.g.j
        protected int F0() {
            return this.f;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        byte G(int i) {
            return this.e[this.f + i];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public byte d(int i) {
            g.f(i, size());
            return this.e[this.f + i];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.g;
        }

        Object writeReplace() {
            return g.p0(h0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public interface f {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0029g extends Iterator<Byte> {
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

        public g a() {
            this.a.c();
            return new j(this.b);
        }

        public CodedOutputStream b() {
            return this.a;
        }

        private h(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            this.a = CodedOutputStream.g0(bArr);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    static abstract class i extends g {
        i() {
        }

        @Override // androidx.datastore.preferences.protobuf.g, java.lang.Iterable
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

        @Override // androidx.datastore.preferences.protobuf.g
        protected void E(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.e, i, bArr, i2, i3);
        }

        protected int F0() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        byte G(int i) {
            return this.e[i];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean H() {
            int F0 = F0();
            return h1.n(this.e, F0, size() + F0);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final androidx.datastore.preferences.protobuf.h T() {
            return androidx.datastore.preferences.protobuf.h.j(this.e, F0(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected final int W(int i, int i2, int i3) {
            return x.i(i, this.e, F0() + i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte d(int i) {
            return this.e[i];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final g e0(int i, int i2) {
            int k = g.k(i, i2, size());
            if (k == 0) {
                return g.b;
            }
            return new e(this.e, F0() + i, k);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                int Z = Z();
                int Z2 = jVar.Z();
                if (Z != 0 && Z2 != 0 && Z != Z2) {
                    return false;
                }
                return x0(jVar, 0, size());
            }
            return obj.equals(this);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected final String n0(Charset charset) {
            return new String(this.e, F0(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        final void r0(hk0 hk0Var) throws IOException {
            hk0Var.a(this.e, F0(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.e.length;
        }

        final boolean x0(g gVar, int i, int i2) {
            if (i2 <= gVar.size()) {
                int i3 = i + i2;
                if (i3 <= gVar.size()) {
                    if (gVar instanceof j) {
                        j jVar = (j) gVar;
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
                    return gVar.e0(i, i3).equals(e0(0, i2));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + gVar.size());
            }
            throw new IllegalArgumentException("Length too large: " + i2 + size());
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        f dVar;
        if (androidx.datastore.preferences.protobuf.d.c()) {
            dVar = new k(null);
        } else {
            dVar = new d(null);
        }
        c = dVar;
        d = new b();
    }

    g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h Q(int i2) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static int l0(byte b2) {
        return b2 & 255;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g p0(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g q0(byte[] bArr, int i2, int i3) {
        return new e(bArr, i2, i3);
    }

    public static g u(byte[] bArr) {
        return w(bArr, 0, bArr.length);
    }

    public static g w(byte[] bArr, int i2, int i3) {
        k(i2, i2 + i3, bArr.length);
        return new j(c.a(bArr, i2, i3));
    }

    public static g x(String str) {
        return new j(str.getBytes(x.a));
    }

    protected abstract void E(byte[] bArr, int i2, int i3, int i4);

    abstract byte G(int i2);

    public abstract boolean H();

    @Override // java.lang.Iterable
    /* renamed from: P */
    public InterfaceC0029g iterator() {
        return new a();
    }

    public abstract androidx.datastore.preferences.protobuf.h T();

    protected abstract int W(int i2, int i3, int i4);

    protected final int Z() {
        return this.a;
    }

    public abstract byte d(int i2);

    public abstract g e0(int i2, int i3);

    public abstract boolean equals(Object obj);

    public final byte[] h0() {
        int size = size();
        if (size == 0) {
            return x.c;
        }
        byte[] bArr = new byte[size];
        E(bArr, 0, 0, size);
        return bArr;
    }

    public final int hashCode() {
        int i2 = this.a;
        if (i2 == 0) {
            int size = size();
            i2 = W(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.a = i2;
        }
        return i2;
    }

    public final String m0(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return n0(charset);
    }

    protected abstract String n0(Charset charset);

    public final String o0() {
        return m0(x.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void r0(hk0 hk0Var) throws IOException;

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
