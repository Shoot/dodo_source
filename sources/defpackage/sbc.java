package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;
/* renamed from: sbc  reason: default package */
/* loaded from: classes3.dex */
public class sbc {

    /* renamed from: sbc$a */
    /* loaded from: classes3.dex */
    private static class a extends ObjectInputStream {
        private static final Set c;
        private final Class a;
        private boolean b;

        static {
            HashSet hashSet = new HashSet();
            c = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        a(Class cls, InputStream inputStream) throws IOException {
            super(inputStream);
            this.b = false;
            this.a = cls;
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            if (!this.b) {
                if (objectStreamClass.getName().equals(this.a.getName())) {
                    this.b = true;
                } else {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else if (!c.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static long a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = 0;
            for (int i3 = i; i3 < i + i2; i3++) {
                j = (j << 8) | (bArr[i3] & 255);
            }
            return j;
        }
        throw new NullPointerException("in == null");
    }

    public static int b(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (((i >> i3) & 1) == 0) {
                return i3;
            }
        }
        return 0;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new NullPointerException("in == null");
    }

    public static byte[][] d(byte[][] bArr) {
        if (!k(bArr)) {
            byte[][] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                byte[] bArr3 = new byte[bArr[i].length];
                bArr2[i] = bArr3;
                byte[] bArr4 = bArr[i];
                System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            }
            return bArr2;
        }
        throw new NullPointerException("in has null pointers");
    }

    public static void e(byte[] bArr, byte[] bArr2, int i) {
        if (bArr != null) {
            if (bArr2 != null) {
                if (i >= 0) {
                    if (bArr2.length + i <= bArr.length) {
                        for (int i2 = 0; i2 < bArr2.length; i2++) {
                            bArr[i + i2] = bArr2[i2];
                        }
                        return;
                    }
                    throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
                }
                throw new IllegalArgumentException("offset hast to be >= 0");
            }
            throw new NullPointerException("src == null");
        }
        throw new NullPointerException("dst == null");
    }

    public static Object f(byte[] bArr, Class cls) throws IOException, ClassNotFoundException {
        a aVar = new a(cls, new ByteArrayInputStream(bArr));
        Object readObject = aVar.readObject();
        if (aVar.available() == 0) {
            if (cls.isInstance(readObject)) {
                return readObject;
            }
            throw new IOException("unexpected class found in ObjectInputStream");
        }
        throw new IOException("unexpected data found at end of ObjectInputStream");
    }

    public static byte[] g(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i + i2 <= bArr.length) {
                        byte[] bArr2 = new byte[i2];
                        for (int i3 = 0; i3 < i2; i3++) {
                            bArr2[i3] = bArr[i + i3];
                        }
                        return bArr2;
                    }
                    throw new IllegalArgumentException("offset + length must not be greater then size of source array");
                }
                throw new IllegalArgumentException("length hast to be >= 0");
            }
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        throw new NullPointerException("src == null");
    }

    public static int h(e23 e23Var) {
        if (e23Var != null) {
            String algorithmName = e23Var.getAlgorithmName();
            if (algorithmName.equals("SHAKE128")) {
                return 32;
            }
            if (algorithmName.equals("SHAKE256")) {
                return 64;
            }
            return e23Var.getDigestSize();
        }
        throw new NullPointerException("digest == null");
    }

    public static int i(long j, int i) {
        return (int) (j & ((1 << i) - 1));
    }

    public static long j(long j, int i) {
        return j >> i;
    }

    public static boolean k(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(int i, long j) {
        if (j >= 0) {
            if (j < (1 << i)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static boolean m(long j, int i, int i2) {
        if (j == 0 || (j + 1) % ((long) Math.pow(1 << i, i2)) != 0) {
            return false;
        }
        return true;
    }

    public static boolean n(long j, int i, int i2) {
        if (j == 0 || j % ((long) Math.pow(1 << i, i2 + 1)) != 0) {
            return false;
        }
        return true;
    }

    public static int o(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i != 0) {
                i2++;
            } else {
                return i2;
            }
        }
    }

    public static byte[] p(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] q(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }
}
