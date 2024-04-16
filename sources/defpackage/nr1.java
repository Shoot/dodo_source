package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Constraints.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\b\u0087@\u0018\u0000 +2\u00020\u0001:\u0001\u0013B\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0012ø\u0001\u0002¢\u0006\u0004\b)\u0010*J>\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\rR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0011\u0010 \u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u001a\u0010%\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0016\u001a\u0004\b#\u0010\u001fR\u001a\u0010(\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0016\u001a\u0004\b&\u0010\u001f\u0088\u0001\u0017\u0092\u0001\u00020\u0012ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lnr1;", "", "", "minWidth", "maxWidth", "minHeight", "maxHeight", DateTokenConverter.CONVERTER_KEY, "(JIIII)J", "", "r", "(J)Ljava/lang/String;", "q", "(J)I", "other", "", "f", "(JLjava/lang/Object;)Z", "", "a", "J", "getValue$annotations", "()V", "value", Image.TYPE_HIGH, "focusIndex", "p", "n", "o", Image.TYPE_MEDIUM, "j", "(J)Z", "hasBoundedWidth", "i", "hasBoundedHeight", "l", "getHasFixedWidth$annotations", "hasFixedWidth", "k", "getHasFixedHeight$annotations", "hasFixedHeight", c.a, "(J)J", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nr1  reason: default package */
/* loaded from: classes.dex */
public final class nr1 {
    public static final a b = new a(null);
    private static final int[] c = {18, 20, 17, 15};
    private static final int[] d = {65535, 262143, 32767, 8191};
    private static final int[] e = {32767, 8191, 65535, 262143};
    private final long a;

    /* compiled from: Constraints.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ8\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0012R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Lnr1$a;", "", "", "size", "a", "width", "height", "Lnr1;", c.a, "(II)J", "minWidth", "maxWidth", "minHeight", "maxHeight", "b", "(IIII)J", "", "FocusMask", "J", "", "HeightMask", "[I", "Infinity", "I", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinHeightOffsets", "MinNonFocusBits", "MinNonFocusMask", "WidthMask", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: nr1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }

        public final long b(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            long j;
            int i7;
            if (i4 == Integer.MAX_VALUE) {
                i5 = i3;
            } else {
                i5 = i4;
            }
            int a = a(i5);
            if (i2 == Integer.MAX_VALUE) {
                i6 = i;
            } else {
                i6 = i2;
            }
            int a2 = a(i6);
            if (a + a2 <= 31) {
                if (a2 != 13) {
                    if (a2 != 18) {
                        if (a2 != 15) {
                            if (a2 == 16) {
                                j = 0;
                            } else {
                                throw new IllegalStateException("Should only have the provided constants.");
                            }
                        } else {
                            j = 2;
                        }
                    } else {
                        j = 1;
                    }
                } else {
                    j = 3;
                }
                int i8 = 0;
                if (i2 == Integer.MAX_VALUE) {
                    i7 = 0;
                } else {
                    i7 = i2 + 1;
                }
                if (i4 != Integer.MAX_VALUE) {
                    i8 = i4 + 1;
                }
                int i9 = nr1.c[(int) j];
                return nr1.c((i7 << 33) | j | (i << 2) | (i3 << i9) | (i8 << (i9 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
        }

        public final long c(int i, int i2) {
            if (i >= 0 && i2 >= 0) {
                return b(i, i, i2, i2);
            }
            throw new IllegalArgumentException(("width(" + i + ") and height(" + i2 + ") must be >= 0").toString());
        }
    }

    private /* synthetic */ nr1(long j) {
        this.a = j;
    }

    public static final /* synthetic */ nr1 b(long j) {
        return new nr1(j);
    }

    public static final long d(long j, int i, int i2, int i3, int i4) {
        if (i3 >= 0 && i >= 0) {
            if (i2 < i && i2 != Integer.MAX_VALUE) {
                throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
            } else if (i4 < i3 && i4 != Integer.MAX_VALUE) {
                throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
            } else {
                return b.b(i, i2, i3, i4);
            }
        }
        throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
    }

    public static /* synthetic */ long e(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = p(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = n(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = o(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m(j);
        }
        return d(j, i6, i7, i8, i4);
    }

    public static boolean f(long j, Object obj) {
        if (!(obj instanceof nr1) || j != ((nr1) obj).s()) {
            return false;
        }
        return true;
    }

    public static final boolean g(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    private static final int h(long j) {
        return (int) (j & 3);
    }

    public static final boolean i(long j) {
        int h = h(j);
        if ((((int) (j >> (c[h] + 31))) & e[h]) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean j(long j) {
        if ((((int) (j >> 33)) & d[h(j)]) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean k(long j) {
        if (m(j) == o(j)) {
            return true;
        }
        return false;
    }

    public static final boolean l(long j) {
        if (n(j) == p(j)) {
            return true;
        }
        return false;
    }

    public static final int m(long j) {
        int h = h(j);
        int i = ((int) (j >> (c[h] + 31))) & e[h];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int n(long j) {
        int i = ((int) (j >> 33)) & d[h(j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int o(long j) {
        int h = h(j);
        return ((int) (j >> c[h])) & e[h];
    }

    public static final int p(long j) {
        return ((int) (j >> 2)) & d[h(j)];
    }

    public static int q(long j) {
        return ax1.a(j);
    }

    public static String r(long j) {
        String valueOf;
        int n = n(j);
        String str = "Infinity";
        if (n == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(n);
        }
        int m = m(j);
        if (m != Integer.MAX_VALUE) {
            str = String.valueOf(m);
        }
        return "Constraints(minWidth = " + p(j) + ", maxWidth = " + valueOf + ", minHeight = " + o(j) + ", maxHeight = " + str + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return q(this.a);
    }

    public final /* synthetic */ long s() {
        return this.a;
    }

    public String toString() {
        return r(this.a);
    }

    public static long c(long j) {
        return j;
    }
}
