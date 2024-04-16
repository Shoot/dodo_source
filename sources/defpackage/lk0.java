package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ByteString.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0016\u0018\u0000 Q2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010@\u001a\u00020!¢\u0006\u0004\bO\u0010PJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0006\u0010\r\u001a\u00020\u0000J\u0006\u0010\u000e\u001a\u00020\u0000J\u0006\u0010\u000f\u001a\u00020\u0000J\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\u0000H\u0016J\u001c\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015H\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0015H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u001f\u0010 J\b\u0010\"\u001a\u00020!H\u0016J\u000f\u0010#\u001a\u00020!H\u0010¢\u0006\u0004\b#\u0010$J'\u0010)\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0010¢\u0006\u0004\b)\u0010*J(\u0010.\u001a\u00020-2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0016J(\u0010/\u001a\u00020-2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0016J\u000e\u00101\u001a\u00020-2\u0006\u00100\u001a\u00020\u0000J\u000e\u00103\u001a\u00020-2\u0006\u00102\u001a\u00020\u0000J\u001a\u00105\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00002\b\b\u0002\u00104\u001a\u00020\u0015H\u0007J\u001a\u00106\u001a\u00020\u00152\u0006\u0010+\u001a\u00020!2\b\b\u0002\u00104\u001a\u00020\u0015H\u0017J\u001a\u00107\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00002\b\b\u0002\u00104\u001a\u00020\u0015H\u0007J\u001a\u00108\u001a\u00020\u00152\u0006\u0010+\u001a\u00020!2\b\b\u0002\u00104\u001a\u00020\u0015H\u0017J\u0013\u0010:\u001a\u00020-2\b\u0010+\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010;\u001a\u00020\u0015H\u0016J\u0011\u0010<\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0000H\u0096\u0002J\b\u0010=\u001a\u00020\nH\u0016R\u001a\u0010@\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010$R\"\u0010;\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010 \"\u0004\bD\u0010ER$\u0010L\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0011\u0010N\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\bM\u0010 ¨\u0006R"}, d2 = {"Llk0;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "", "readObject", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "", "z0", "a", "W", "l0", "m0", "algorithm", "k", "(Ljava/lang/String;)Llk0;", "G", "r0", "", "beginIndex", "endIndex", "p0", "pos", "", "N", "(I)B", "index", Image.TYPE_SMALL, "x", "()I", "", "x0", "M", "()[B", "Lyg0;", "buffer", "offset", "byteCount", "E0", "(Lyg0;II)V", "other", "otherOffset", "", "b0", "e0", "prefix", "o0", "suffix", "q", "fromIndex", "H", "K", "P", "Q", "", "equals", "hashCode", "i", "toString", "[B", "u", "data", "b", "I", "w", "f0", "(I)V", c.a, "Ljava/lang/String;", "E", "()Ljava/lang/String;", "h0", "(Ljava/lang/String;)V", "utf8", "n0", "size", "<init>", "([B)V", DateTokenConverter.CONVERTER_KEY, "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: lk0  reason: default package */
/* loaded from: classes3.dex */
public class lk0 implements Serializable, Comparable<lk0> {
    public static final a d = new a(null);
    public static final lk0 e = new lk0(new byte[0]);
    private final byte[] a;
    private transient int b;
    private transient String c;

    /* compiled from: ByteString.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\n\u001a\u00020\u0006*\u00020\tH\u0007J\u001d\u0010\r\u001a\u00020\u0006*\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0007J\f\u0010\u0010\u001a\u00020\u0006*\u00020\tH\u0007J\u001b\u0010\u0012\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Llk0$a;", "", "", "", "offset", "byteCount", "Llk0;", e.a, "([BII)Llk0;", "", DateTokenConverter.CONVERTER_KEY, "Ljava/nio/charset/Charset;", "charset", c.a, "(Ljava/lang/String;Ljava/nio/charset/Charset;)Llk0;", "a", "b", "Ljava/io/InputStream;", "g", "(Ljava/io/InputStream;I)Llk0;", "EMPTY", "Llk0;", "", "serialVersionUID", "J", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ lk0 f(a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = i.c();
            }
            return aVar.e(bArr, i, i2);
        }

        public final lk0 a(String str) {
            z65.h(str, "<this>");
            byte[] a = c.a(str);
            if (a != null) {
                return new lk0(a);
            }
            return null;
        }

        public final lk0 b(String str) {
            z65.h(str, "<this>");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((e.b(str.charAt(i2)) << 4) + e.b(str.charAt(i2 + 1)));
                }
                return new lk0(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final lk0 c(String str, Charset charset) {
            z65.h(str, "<this>");
            z65.h(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            z65.g(bytes, "getBytes(...)");
            return new lk0(bytes);
        }

        public final lk0 d(String str) {
            z65.h(str, "<this>");
            lk0 lk0Var = new lk0(sdc.a(str));
            lk0Var.h0(str);
            return lk0Var;
        }

        public final lk0 e(byte[] bArr, int i, int i2) {
            byte[] m;
            z65.h(bArr, "<this>");
            int f = i.f(bArr, i2);
            i.b(bArr.length, i, f);
            m = xr.m(bArr, i, f + i);
            return new lk0(m);
        }

        public final lk0 g(InputStream inputStream, int i) throws IOException {
            z65.h(inputStream, "<this>");
            if (i >= 0) {
                byte[] bArr = new byte[i];
                int i2 = 0;
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new lk0(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
        }
    }

    public lk0(byte[] bArr) {
        z65.h(bArr, "data");
        this.a = bArr;
    }

    public static /* synthetic */ int L(lk0 lk0Var, lk0 lk0Var2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return lk0Var.H(lk0Var2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int T(lk0 lk0Var, lk0 lk0Var2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = i.c();
            }
            return lk0Var.P(lk0Var2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static final lk0 o(String str) {
        return d.d(str);
    }

    public static /* synthetic */ lk0 q0(lk0 lk0Var, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = i.c();
            }
            return lk0Var.p0(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        lk0 g = d.g(objectInputStream, objectInputStream.readInt());
        Field declaredField = lk0.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, g.a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.a.length);
        objectOutputStream.write(this.a);
    }

    public final String E() {
        return this.c;
    }

    public void E0(yg0 yg0Var, int i, int i2) {
        z65.h(yg0Var, "buffer");
        e.d(this, yg0Var, i, i2);
    }

    public String G() {
        byte[] u;
        String q;
        char[] cArr = new char[u().length * 2];
        int i = 0;
        for (byte b : u()) {
            int i2 = i + 1;
            cArr[i] = e.f()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = e.f()[b & 15];
        }
        q = l0b.q(cArr);
        return q;
    }

    public final int H(lk0 lk0Var, int i) {
        z65.h(lk0Var, "other");
        return K(lk0Var.M(), i);
    }

    public int K(byte[] bArr, int i) {
        z65.h(bArr, "other");
        int length = u().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!i.a(u(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] M() {
        return u();
    }

    public byte N(int i) {
        return u()[i];
    }

    public final int P(lk0 lk0Var, int i) {
        z65.h(lk0Var, "other");
        return Q(lk0Var.M(), i);
    }

    public int Q(byte[] bArr, int i) {
        z65.h(bArr, "other");
        for (int min = Math.min(i.e(this, i), u().length - bArr.length); -1 < min; min--) {
            if (i.a(u(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public final lk0 W() {
        return k("MD5");
    }

    public String a() {
        return c.c(u(), null, 1, null);
    }

    public boolean b0(int i, lk0 lk0Var, int i2, int i3) {
        z65.h(lk0Var, "other");
        return lk0Var.e0(i2, u(), i, i3);
    }

    public boolean e0(int i, byte[] bArr, int i2, int i3) {
        z65.h(bArr, "other");
        if (i >= 0 && i <= u().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && i.a(u(), i, bArr, i2, i3)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lk0) {
            lk0 lk0Var = (lk0) obj;
            if (lk0Var.n0() == u().length && lk0Var.e0(0, u(), 0, u().length)) {
                return true;
            }
        }
        return false;
    }

    public final void f0(int i) {
        this.b = i;
    }

    public final void h0(String str) {
        this.c = str;
    }

    public int hashCode() {
        int w = w();
        if (w == 0) {
            int hashCode = Arrays.hashCode(u());
            f0(hashCode);
            return hashCode;
        }
        return w;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(defpackage.lk0 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            defpackage.z65.h(r10, r0)
            int r0 = r9.n0()
            int r1 = r10.n0()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.s(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.s(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = -1
            goto L34
        L2c:
            r3 = 1
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk0.compareTo(lk0):int");
    }

    public lk0 k(String str) {
        z65.h(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.a, 0, n0());
        byte[] digest = messageDigest.digest();
        z65.e(digest);
        return new lk0(digest);
    }

    public final lk0 l0() {
        return k("SHA-1");
    }

    public final lk0 m0() {
        return k("SHA-256");
    }

    public final int n0() {
        return x();
    }

    public final boolean o0(lk0 lk0Var) {
        z65.h(lk0Var, "prefix");
        return b0(0, lk0Var, 0, lk0Var.n0());
    }

    public lk0 p0(int i, int i2) {
        byte[] m;
        int e2 = i.e(this, i2);
        if (i >= 0) {
            if (e2 <= u().length) {
                if (e2 - i >= 0) {
                    if (i != 0 || e2 != u().length) {
                        m = xr.m(u(), i, e2);
                        return new lk0(m);
                    }
                    return this;
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + u().length + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public final boolean q(lk0 lk0Var) {
        z65.h(lk0Var, "suffix");
        return b0(n0() - lk0Var.n0(), lk0Var, 0, lk0Var.n0());
    }

    public lk0 r0() {
        for (int i = 0; i < u().length; i++) {
            byte b = u()[i];
            if (b >= 65 && b <= 90) {
                byte[] u = u();
                byte[] copyOf = Arrays.copyOf(u, u.length);
                z65.g(copyOf, "copyOf(...)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new lk0(copyOf);
            }
        }
        return this;
    }

    public final byte s(int i) {
        return N(i);
    }

    public String toString() {
        String F;
        String F2;
        String F3;
        lk0 lk0Var;
        byte[] m;
        String str;
        if (u().length == 0) {
            str = "[size=0]";
        } else {
            int a2 = e.a(u(), 64);
            if (a2 == -1) {
                if (u().length <= 64) {
                    str = "[hex=" + G() + ']';
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[size=");
                    sb.append(u().length);
                    sb.append(" hex=");
                    int e2 = i.e(this, 64);
                    if (e2 <= u().length) {
                        if (e2 >= 0) {
                            if (e2 != u().length) {
                                m = xr.m(u(), 0, e2);
                                lk0Var = new lk0(m);
                            } else {
                                lk0Var = this;
                            }
                            sb.append(lk0Var.G());
                            sb.append("…]");
                            return sb.toString();
                        }
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    throw new IllegalArgumentException(("endIndex > length(" + u().length + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
                }
            } else {
                String z0 = z0();
                String substring = z0.substring(0, a2);
                z65.g(substring, "substring(...)");
                F = l0b.F(substring, "\\", "\\\\", false, 4, null);
                F2 = l0b.F(F, "\n", "\\n", false, 4, null);
                F3 = l0b.F(F2, "\r", "\\r", false, 4, null);
                if (a2 < z0.length()) {
                    return "[size=" + u().length + " text=" + F3 + "…]";
                }
                return "[text=" + F3 + ']';
            }
        }
        return str;
    }

    public final byte[] u() {
        return this.a;
    }

    public final int w() {
        return this.b;
    }

    public int x() {
        return u().length;
    }

    public byte[] x0() {
        byte[] u = u();
        byte[] copyOf = Arrays.copyOf(u, u.length);
        z65.g(copyOf, "copyOf(...)");
        return copyOf;
    }

    public String z0() {
        String E = E();
        if (E == null) {
            String c = sdc.c(M());
            h0(c);
            return c;
        }
        return E;
    }
}
