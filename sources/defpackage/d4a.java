package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import kotlin.Metadata;
/* compiled from: SegmentedByteString.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00160-\u0012\u0006\u00108\u001a\u000203¢\u0006\u0004\b9\u0010:J\b\u0010\u0002\u001a\u00020\u0001H\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0001H\u0016J\u0017\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J(\u0010#\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\fH\u0016J\u0018\u0010&\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\fH\u0016J\u000f\u0010'\u001a\u00020\u0016H\u0010¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020!2\b\u0010\u001f\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010+\u001a\u00020\fH\u0016J\b\u0010,\u001a\u00020\u0005H\u0016R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00160-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00108\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Ld4a;", "Llk0;", "J0", "Ljava/lang/Object;", "writeReplace", "", "a", "G", "r0", "algorithm", "k", "(Ljava/lang/String;)Llk0;", "", "beginIndex", "endIndex", "p0", "pos", "", "N", "(I)B", "x", "()I", "", "x0", "Lyg0;", "buffer", "offset", "byteCount", "", "E0", "(Lyg0;II)V", "other", "otherOffset", "", "b0", "e0", "fromIndex", "K", "Q", "M", "()[B", "", "equals", "hashCode", "toString", "", "f", "[[B", "I0", "()[[B", "segments", "", "g", "[I", "F0", "()[I", "directory", "<init>", "([[B[I)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: d4a  reason: default package */
/* loaded from: classes3.dex */
public final class d4a extends lk0 {
    private final transient byte[][] f;
    private final transient int[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4a(byte[][] bArr, int[] iArr) {
        super(lk0.e.u());
        z65.h(bArr, "segments");
        z65.h(iArr, "directory");
        this.f = bArr;
        this.g = iArr;
    }

    private final lk0 J0() {
        return new lk0(x0());
    }

    private final Object writeReplace() {
        lk0 J0 = J0();
        z65.f(J0, "null cannot be cast to non-null type java.lang.Object");
        return J0;
    }

    @Override // defpackage.lk0
    public void E0(yg0 yg0Var, int i, int i2) {
        int i3;
        z65.h(yg0Var, "buffer");
        int i4 = i + i2;
        int b = h.b(this, i);
        while (i < i4) {
            if (b == 0) {
                i3 = 0;
            } else {
                i3 = F0()[b - 1];
            }
            int i5 = F0()[I0().length + b];
            int min = Math.min(i4, (F0()[b] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            r3a r3aVar = new r3a(I0()[b], i6, i6 + min, true, false);
            r3a r3aVar2 = yg0Var.a;
            if (r3aVar2 == null) {
                r3aVar.g = r3aVar;
                r3aVar.f = r3aVar;
                yg0Var.a = r3aVar;
            } else {
                z65.e(r3aVar2);
                r3a r3aVar3 = r3aVar2.g;
                z65.e(r3aVar3);
                r3aVar3.c(r3aVar);
            }
            i += min;
            b++;
        }
        yg0Var.N(yg0Var.P() + i2);
    }

    public final int[] F0() {
        return this.g;
    }

    @Override // defpackage.lk0
    public String G() {
        return J0().G();
    }

    public final byte[][] I0() {
        return this.f;
    }

    @Override // defpackage.lk0
    public int K(byte[] bArr, int i) {
        z65.h(bArr, "other");
        return J0().K(bArr, i);
    }

    @Override // defpackage.lk0
    public byte[] M() {
        return x0();
    }

    @Override // defpackage.lk0
    public byte N(int i) {
        int i2;
        i.b(F0()[I0().length - 1], i, 1L);
        int b = h.b(this, i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = F0()[b - 1];
        }
        return I0()[b][(i - i2) + F0()[I0().length + b]];
    }

    @Override // defpackage.lk0
    public int Q(byte[] bArr, int i) {
        z65.h(bArr, "other");
        return J0().Q(bArr, i);
    }

    @Override // defpackage.lk0
    public String a() {
        return J0().a();
    }

    @Override // defpackage.lk0
    public boolean b0(int i, lk0 lk0Var, int i2, int i3) {
        int i4;
        z65.h(lk0Var, "other");
        if (i < 0 || i > n0() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = h.b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = F0()[b - 1];
            }
            int i6 = F0()[I0().length + b];
            int min = Math.min(i5, (F0()[b] - i4) + i4) - i;
            if (!lk0Var.e0(i2, I0()[b], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    @Override // defpackage.lk0
    public boolean e0(int i, byte[] bArr, int i2, int i3) {
        int i4;
        z65.h(bArr, "other");
        if (i < 0 || i > n0() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = h.b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = F0()[b - 1];
            }
            int i6 = F0()[I0().length + b];
            int min = Math.min(i5, (F0()[b] - i4) + i4) - i;
            if (!i.a(I0()[b], i6 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    @Override // defpackage.lk0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lk0) {
            lk0 lk0Var = (lk0) obj;
            if (lk0Var.n0() == n0() && b0(0, lk0Var, 0, n0())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lk0
    public int hashCode() {
        int w = w();
        if (w == 0) {
            int length = I0().length;
            int i = 0;
            int i2 = 1;
            int i3 = 0;
            while (i < length) {
                int i4 = F0()[length + i];
                int i5 = F0()[i];
                byte[] bArr = I0()[i];
                int i6 = (i5 - i3) + i4;
                while (i4 < i6) {
                    i2 = (i2 * 31) + bArr[i4];
                    i4++;
                }
                i++;
                i3 = i5;
            }
            f0(i2);
            return i2;
        }
        return w;
    }

    @Override // defpackage.lk0
    public lk0 k(String str) {
        z65.h(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = I0().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = F0()[length + i];
            int i4 = F0()[i];
            messageDigest.update(I0()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        z65.e(digest);
        return new lk0(digest);
    }

    @Override // defpackage.lk0
    public lk0 p0(int i, int i2) {
        Object[] n;
        int e = i.e(this, i2);
        if (i >= 0) {
            if (e <= n0()) {
                int i3 = e - i;
                if (i3 >= 0) {
                    if (i == 0 && e == n0()) {
                        return this;
                    }
                    if (i == e) {
                        return lk0.e;
                    }
                    int b = h.b(this, i);
                    int b2 = h.b(this, e - 1);
                    n = xr.n(I0(), b, b2 + 1);
                    byte[][] bArr = (byte[][]) n;
                    int[] iArr = new int[bArr.length * 2];
                    int i4 = 0;
                    if (b <= b2) {
                        int i5 = b;
                        int i6 = 0;
                        while (true) {
                            iArr[i6] = Math.min(F0()[i5] - i, i3);
                            int i7 = i6 + 1;
                            iArr[i6 + bArr.length] = F0()[I0().length + i5];
                            if (i5 == b2) {
                                break;
                            }
                            i5++;
                            i6 = i7;
                        }
                    }
                    if (b != 0) {
                        i4 = F0()[b - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i - i4);
                    return new d4a(bArr, iArr);
                }
                throw new IllegalArgumentException(("endIndex=" + e + " < beginIndex=" + i).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + e + " > length(" + n0() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
    }

    @Override // defpackage.lk0
    public lk0 r0() {
        return J0().r0();
    }

    @Override // defpackage.lk0
    public String toString() {
        return J0().toString();
    }

    @Override // defpackage.lk0
    public int x() {
        return F0()[I0().length - 1];
    }

    @Override // defpackage.lk0
    public byte[] x0() {
        byte[] bArr = new byte[n0()];
        int length = I0().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = F0()[length + i];
            int i5 = F0()[i];
            int i6 = i5 - i2;
            xr.d(I0()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }
}
