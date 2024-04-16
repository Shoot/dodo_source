package com.google.crypto.tink.shaded.protobuf;

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
/* loaded from: classes2.dex */
public abstract class h implements Iterable<Byte>, Serializable {
    public static final h b = new j(y.d);
    private static final f c;
    private static final Comparator<h> d;
    private int a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public class a extends c {
        private int a = 0;
        private final int b;

        a() {
            this.b = h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.g
        public byte d() {
            int i = this.a;
            if (i < this.b) {
                this.a = i + 1;
                return h.this.G(i);
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
    /* loaded from: classes2.dex */
    class b implements Comparator<h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            g it = hVar.iterator();
            g it2 = hVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(h.l0(it.d()), h.l0(it2.d()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(hVar.size(), hVar2.size());
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
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
    /* loaded from: classes2.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public static final class e extends j {
        private final int f;
        private final int g;

        e(byte[] bArr, int i, int i2) {
            super(bArr);
            h.k(i, i + i2, bArr.length);
            this.f = i;
            this.g = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        protected void E(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.e, I0() + i, bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        byte G(int i) {
            return this.e[this.f + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j
        protected int I0() {
            return this.f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public byte d(int i) {
            h.f(i, size());
            return this.e[this.f + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public int size() {
            return this.g;
        }

        Object writeReplace() {
            return h.q0(h0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public interface f {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public interface g extends Iterator<Byte> {
        byte d();
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0239h {
        private final CodedOutputStream a;
        private final byte[] b;

        /* synthetic */ C0239h(int i, a aVar) {
            this(i);
        }

        public h a() {
            this.a.c();
            return new j(this.b);
        }

        public CodedOutputStream b() {
            return this.a;
        }

        private C0239h(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            this.a = CodedOutputStream.d0(bArr);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    static abstract class i extends h {
        i() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public static class j extends i {
        protected final byte[] e;

        j(byte[] bArr) {
            bArr.getClass();
            this.e = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected void E(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.e, i, bArr, i2, i3);
        }

        final boolean F0(h hVar, int i, int i2) {
            if (i2 <= hVar.size()) {
                int i3 = i + i2;
                if (i3 <= hVar.size()) {
                    if (hVar instanceof j) {
                        j jVar = (j) hVar;
                        byte[] bArr = this.e;
                        byte[] bArr2 = jVar.e;
                        int I0 = I0() + i2;
                        int I02 = I0();
                        int I03 = jVar.I0() + i;
                        while (I02 < I0) {
                            if (bArr[I02] != bArr2[I03]) {
                                return false;
                            }
                            I02++;
                            I03++;
                        }
                        return true;
                    }
                    return hVar.e0(i, i3).equals(e0(0, i2));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + hVar.size());
            }
            throw new IllegalArgumentException("Length too large: " + i2 + size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        byte G(int i) {
            return this.e[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final boolean H() {
            int I0 = I0();
            return i1.n(this.e, I0, size() + I0);
        }

        protected int I0() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final com.google.crypto.tink.shaded.protobuf.i T() {
            return com.google.crypto.tink.shaded.protobuf.i.h(this.e, I0(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected final int W(int i, int i2, int i3) {
            return y.i(i, this.e, I0() + i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public byte d(int i) {
            return this.e[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final h e0(int i, int i2) {
            int k = h.k(i, i2, size());
            if (k == 0) {
                return h.b;
            }
            return new e(this.e, I0() + i, k);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
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
                return F0(jVar, 0, size());
            }
            return obj.equals(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected final String n0(Charset charset) {
            return new String(this.e, I0(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public int size() {
            return this.e.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        final void x0(fk0 fk0Var) throws IOException {
            fk0Var.a(this.e, I0(), size());
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        f dVar;
        if (com.google.crypto.tink.shaded.protobuf.d.c()) {
            dVar = new k(null);
        } else {
            dVar = new d(null);
        }
        c = dVar;
        d = new b();
    }

    h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0239h Q(int i2) {
        return new C0239h(i2, null);
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

    private String p0() {
        if (size() <= 50) {
            return d1.a(this);
        }
        return d1.a(e0(0, 47)) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h q0(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h r0(byte[] bArr, int i2, int i3) {
        return new e(bArr, i2, i3);
    }

    public static h u(byte[] bArr) {
        return w(bArr, 0, bArr.length);
    }

    public static h w(byte[] bArr, int i2, int i3) {
        k(i2, i2 + i3, bArr.length);
        return new j(c.a(bArr, i2, i3));
    }

    public static h x(String str) {
        return new j(str.getBytes(y.b));
    }

    protected abstract void E(byte[] bArr, int i2, int i3, int i4);

    abstract byte G(int i2);

    public abstract boolean H();

    @Override // java.lang.Iterable
    /* renamed from: P */
    public g iterator() {
        return new a();
    }

    public abstract com.google.crypto.tink.shaded.protobuf.i T();

    protected abstract int W(int i2, int i3, int i4);

    protected final int Z() {
        return this.a;
    }

    public abstract byte d(int i2);

    public abstract h e0(int i2, int i3);

    public abstract boolean equals(Object obj);

    public final byte[] h0() {
        int size = size();
        if (size == 0) {
            return y.d;
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
        return m0(y.b);
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), p0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void x0(fk0 fk0Var) throws IOException;
}
