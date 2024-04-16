package kotlin.time;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.f;
/* compiled from: Duration.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b$\b\u0087@\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB\u0011\b\u0000\u0012\u0006\u0010&\u001a\u00020\u0012¢\u0006\u0004\bE\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0004J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004J\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001f\u001a\u00020\u001e*\u00060\u0018j\u0002`\u00192\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\tR\u0014\u0010(\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0007R\u0014\u0010+\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b,\u0010\u0007R\u001a\u00101\u001a\u00020\r8@X\u0081\u0004¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\"R\u001a\u00104\u001a\u00020\r8@X\u0081\u0004¢\u0006\f\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\"R\u001a\u00107\u001a\u00020\r8@X\u0081\u0004¢\u0006\f\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\"R\u001a\u0010:\u001a\u00020\r8@X\u0081\u0004¢\u0006\f\u0012\u0004\b9\u00100\u001a\u0004\b8\u0010\"R\u0011\u0010<\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b;\u0010\u0007R\u0011\u0010>\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b=\u0010\u0007R\u0011\u0010@\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b?\u0010\u0007R\u0011\u0010B\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bA\u0010\u0007R\u0011\u0010D\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bC\u0010\u0007\u0088\u0001&\u0092\u0001\u00020\u0012\u0082\u0002\u0004\n\u0002\b!¨\u0006G"}, d2 = {"Lkotlin/time/a;", "", "", "G", "(J)Z", "F", "M", "(J)J", "I", "J", "H", "E", "other", "", "i", "(JJ)I", "Ll93;", "unit", "", "K", "(JLl93;)J", "", "L", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", "a", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "D", "(J)I", "", "o", "(JLjava/lang/Object;)Z", "rawValue", "C", "value", "B", "(J)Ll93;", "storageUnit", "p", "absoluteValue", "q", "getHoursComponent$annotations", "()V", "hoursComponent", "x", "getMinutesComponent$annotations", "minutesComponent", "A", "getSecondsComponent$annotations", "secondsComponent", "z", "getNanosecondsComponent$annotations", "nanosecondsComponent", Image.TYPE_SMALL, "inWholeDays", "t", "inWholeHours", "v", "inWholeMinutes", "w", "inWholeSeconds", "u", "inWholeMilliseconds", "k", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class a implements Comparable<a> {
    public static final C0415a b = new C0415a(null);
    private static final long c = k(0);
    private static final long d;
    private static final long e;
    private final long a;

    /* compiled from: Duration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/time/a$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kotlin.time.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0415a {
        private C0415a() {
        }

        public /* synthetic */ C0415a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        long e2;
        long e3;
        e2 = b.e(4611686018427387903L);
        d = e2;
        e3 = b.e(-4611686018427387903L);
        e = e3;
    }

    private /* synthetic */ a(long j) {
        this.a = j;
    }

    public static final int A(long j) {
        if (H(j)) {
            return 0;
        }
        return (int) (w(j) % 60);
    }

    private static final l93 B(long j) {
        if (G(j)) {
            return l93.b;
        }
        return l93.d;
    }

    private static final long C(long j) {
        return j >> 1;
    }

    public static int D(long j) {
        return ax1.a(j);
    }

    public static final boolean E(long j) {
        return !H(j);
    }

    private static final boolean F(long j) {
        if ((((int) j) & 1) == 1) {
            return true;
        }
        return false;
    }

    private static final boolean G(long j) {
        if ((((int) j) & 1) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean H(long j) {
        if (j != d && j != e) {
            return false;
        }
        return true;
    }

    public static final boolean I(long j) {
        if (j < 0) {
            return true;
        }
        return false;
    }

    public static final boolean J(long j) {
        if (j > 0) {
            return true;
        }
        return false;
    }

    public static final long K(long j, l93 l93Var) {
        z65.h(l93Var, "unit");
        if (j == d) {
            return Long.MAX_VALUE;
        }
        if (j == e) {
            return Long.MIN_VALUE;
        }
        return c.a(C(j), B(j), l93Var);
    }

    public static String L(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (j == 0) {
            return "0s";
        }
        if (j == d) {
            return "Infinity";
        }
        if (j == e) {
            return "-Infinity";
        }
        boolean I = I(j);
        StringBuilder sb = new StringBuilder();
        if (I) {
            sb.append(CoreConstants.DASH_CHAR);
        }
        long p = p(j);
        long s = s(p);
        int q = q(p);
        int x = x(p);
        int A = A(p);
        int z5 = z(p);
        int i = 0;
        if (s != 0) {
            z = true;
        } else {
            z = false;
        }
        if (q != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (A == 0 && z5 == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z) {
            sb.append(s);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(q);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(x);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (A == 0 && !z && !z2 && !z3) {
                if (z5 >= 1000000) {
                    a(j, sb, z5 / 1000000, z5 % 1000000, 6, "ms", false);
                } else if (z5 >= 1000) {
                    a(j, sb, z5 / 1000, z5 % 1000, 3, "us", false);
                } else {
                    sb.append(z5);
                    sb.append("ns");
                }
            } else {
                a(j, sb, A, z5, 9, Image.TYPE_SMALL, false);
            }
            i = i4;
        }
        if (I && i > 1) {
            sb.insert(1, CoreConstants.LEFT_PARENTHESIS_CHAR).append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }

    public static final long M(long j) {
        long d2;
        d2 = b.d(-C(j), ((int) j) & 1);
        return d2;
    }

    private static final void a(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        String j0;
        sb.append(i);
        if (i2 != 0) {
            sb.append(CoreConstants.DOT);
            j0 = m0b.j0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = j0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (j0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) j0, 0, i6);
                z65.g(sb, "append(...)");
            } else {
                sb.append((CharSequence) j0, 0, ((i4 + 3) / 3) * 3);
                z65.g(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ a g(long j) {
        return new a(j);
    }

    public static int i(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (I(j)) {
                return -i;
            }
            return i;
        }
        return z65.k(j, j2);
    }

    public static long k(long j) {
        if (k93.a()) {
            if (G(j)) {
                if (!new f(-4611686018426999999L, 4611686018426999999L).t(C(j))) {
                    throw new AssertionError(C(j) + " ns is out of nanoseconds range");
                }
            } else if (new f(-4611686018427387903L, 4611686018427387903L).t(C(j))) {
                if (new f(-4611686018426L, 4611686018426L).t(C(j))) {
                    throw new AssertionError(C(j) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(C(j) + " ms is out of milliseconds range");
            }
        }
        return j;
    }

    public static boolean o(long j, Object obj) {
        if (!(obj instanceof a) || j != ((a) obj).N()) {
            return false;
        }
        return true;
    }

    public static final long p(long j) {
        if (I(j)) {
            return M(j);
        }
        return j;
    }

    public static final int q(long j) {
        if (H(j)) {
            return 0;
        }
        return (int) (t(j) % 24);
    }

    public static final long s(long j) {
        return K(j, l93.h);
    }

    public static final long t(long j) {
        return K(j, l93.g);
    }

    public static final long u(long j) {
        if (F(j) && E(j)) {
            return C(j);
        }
        return K(j, l93.d);
    }

    public static final long v(long j) {
        return K(j, l93.f);
    }

    public static final long w(long j) {
        return K(j, l93.e);
    }

    public static final int x(long j) {
        if (H(j)) {
            return 0;
        }
        return (int) (v(j) % 60);
    }

    public static final int z(long j) {
        long C;
        if (H(j)) {
            return 0;
        }
        if (F(j)) {
            C = b.g(C(j) % 1000);
        } else {
            C = C(j) % 1000000000;
        }
        return (int) C;
    }

    public final /* synthetic */ long N() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        return h(aVar.N());
    }

    public boolean equals(Object obj) {
        return o(this.a, obj);
    }

    public int h(long j) {
        return i(this.a, j);
    }

    public int hashCode() {
        return D(this.a);
    }

    public String toString() {
        return L(this.a);
    }
}
