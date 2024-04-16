package org.bson.types;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes3.dex */
public final class ObjectId implements Comparable<ObjectId>, Serializable {
    private static final int e;
    private static final short f;
    private static final AtomicInteger g = new AtomicInteger(new SecureRandom().nextInt());
    private static final char[] h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private final int a;
    private final int b;
    private final int c;
    private final short d;

    static {
        try {
            SecureRandom secureRandom = new SecureRandom();
            e = secureRandom.nextInt(16777216);
            f = (short) secureRandom.nextInt(32768);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public ObjectId() {
        this(new Date());
    }

    private static short E(byte b, byte b2) {
        return (short) (((b & 255) << 8) | (b2 & 255));
    }

    private static byte[] G(String str) {
        if (u(str)) {
            byte[] bArr = new byte[12];
            for (int i = 0; i < 12; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
            }
            return bArr;
        }
        throw new IllegalArgumentException("invalid hexadecimal representation of an ObjectId: [" + str + "]");
    }

    private static byte K(short s) {
        return (byte) s;
    }

    private static byte L(short s) {
        return (byte) (s >> 8);
    }

    private static int i(Date date) {
        return (int) (date.getTime() / 1000);
    }

    private static byte k(int i) {
        return (byte) i;
    }

    private static byte o(int i) {
        return (byte) (i >> 8);
    }

    private static byte q(int i) {
        return (byte) (i >> 16);
    }

    private static byte s(int i) {
        return (byte) (i >> 24);
    }

    public static boolean u(String str) {
        if (str != null) {
            int length = str.length();
            if (length != 24) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    private static byte[] w(int i, int i2, int i3) {
        return new byte[]{s(i), q(i), o(i), k(i), s(i2), q(i2), o(i2), k(i2), s(i3), q(i3), o(i3), k(i3)};
    }

    private static int x(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public void H(ByteBuffer byteBuffer) {
        boolean z;
        hs.c("buffer", byteBuffer);
        if (byteBuffer.remaining() >= 12) {
            z = true;
        } else {
            z = false;
        }
        hs.b("buffer.remaining() >=12", z);
        byteBuffer.put(s(this.a));
        byteBuffer.put(q(this.a));
        byteBuffer.put(o(this.a));
        byteBuffer.put(k(this.a));
        byteBuffer.put(q(this.c));
        byteBuffer.put(o(this.c));
        byteBuffer.put(k(this.c));
        byteBuffer.put(L(this.d));
        byteBuffer.put(K(this.d));
        byteBuffer.put(q(this.b));
        byteBuffer.put(o(this.b));
        byteBuffer.put(k(this.b));
    }

    public byte[] M() {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        H(allocate);
        return allocate.array();
    }

    public String N() {
        byte[] M;
        char[] cArr = new char[24];
        int i = 0;
        for (byte b : M()) {
            int i2 = i + 1;
            char[] cArr2 = h;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ObjectId objectId) {
        objectId.getClass();
        byte[] M = M();
        byte[] M2 = objectId.M();
        for (int i = 0; i < 12; i++) {
            byte b = M[i];
            byte b2 = M2[i];
            if (b != b2) {
                if ((b & 255) < (b2 & 255)) {
                    return -1;
                }
                return 1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ObjectId.class != obj.getClass()) {
            return false;
        }
        ObjectId objectId = (ObjectId) obj;
        if (this.b == objectId.b && this.a == objectId.a && this.c == objectId.c && this.d == objectId.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return N();
    }

    public ObjectId(Date date) {
        this(i(date), g.getAndIncrement() & 16777215, false);
    }

    public ObjectId(Date date, int i) {
        this(i(date), i, true);
    }

    @Deprecated
    public ObjectId(Date date, int i, short s, int i2) {
        this(i(date), i, s, i2);
    }

    @Deprecated
    public ObjectId(int i, int i2, short s, int i3) {
        this(i, i2, s, i3, true);
    }

    public ObjectId(int i, int i2) {
        this(i, i2, true);
    }

    private ObjectId(int i, int i2, boolean z) {
        this(i, e, f, i2, z);
    }

    private ObjectId(int i, int i2, short s, int i3, boolean z) {
        if ((i2 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The machine identifier must be between 0 and 16777215 (it must fit in three bytes).");
        }
        if (z && (i3 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
        this.a = i;
        this.b = 16777215 & i3;
        this.c = i2;
        this.d = s;
    }

    public ObjectId(String str) {
        this(G(str));
    }

    public ObjectId(byte[] bArr) {
        this(ByteBuffer.wrap((byte[]) hs.a("bytes has length of 12", bArr, ((byte[]) hs.c("bytes", bArr)).length == 12)));
    }

    ObjectId(int i, int i2, int i3) {
        this(w(i, i2, i3));
    }

    public ObjectId(ByteBuffer byteBuffer) {
        hs.c("buffer", byteBuffer);
        hs.b("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        this.a = x(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.c = x((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.d = E(byteBuffer.get(), byteBuffer.get());
        this.b = x((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
    }
}
