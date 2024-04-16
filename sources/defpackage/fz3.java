package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Float16.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0014\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B\u0012\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0088\u0001\t\u0092\u0001\u00020\bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lfz3;", "", "", Image.TYPE_HIGH, "(S)F", "value", "a", "(F)S", "", "halfValue", "g", "(S)S", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fz3  reason: default package */
/* loaded from: classes.dex */
public final class fz3 implements Comparable<fz3> {
    public static final a a = new a(null);
    private static final short b = g(5120);
    private static final short c = g(-1025);
    private static final short d = g(31743);
    private static final short e = g(1024);
    private static final short f = g(1);
    private static final short g = g(32256);
    private static final short h = g(-1024);
    private static final short i = g(Short.MIN_VALUE);
    private static final short j = g(31744);
    private static final short k = g(0);
    private static final short l = a(1.0f);
    private static final short m = a(-1.0f);
    private static final float n;

    /* compiled from: Float16.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u001d\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lfz3$a;", "", "", "f", "", "b", "", "FP16_COMBINED", "I", "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "F", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "MaxExponent", "MinExponent", "Lfz3;", "NegativeOne", "S", "One", "Size", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: fz3$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short b(float f) {
            int i;
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            int i2 = floatToRawIntBits >>> 31;
            int i3 = (floatToRawIntBits >>> 23) & 255;
            int i4 = 8388607 & floatToRawIntBits;
            int i5 = 31;
            int i6 = 0;
            if (i3 == 255) {
                if (i4 != 0) {
                    i6 = 512;
                }
            } else {
                int i7 = i3 - 112;
                if (i7 >= 31) {
                    i5 = 49;
                } else if (i7 <= 0) {
                    if (i7 >= -10) {
                        int i8 = (8388608 | i4) >> (1 - i7);
                        if ((i8 & 4096) != 0) {
                            i8 += 8192;
                        }
                        i6 = i8 >> 13;
                    }
                    i5 = 0;
                } else {
                    i6 = i4 >> 13;
                    if ((floatToRawIntBits & 4096) != 0) {
                        i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                        return (short) i;
                    }
                    i5 = i7;
                }
            }
            i = (i2 << 15) | (i5 << 10) | i6;
            return (short) i;
        }
    }

    static {
        gz3 gz3Var = gz3.a;
        n = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f2) {
        return g(a.b(f2));
    }

    public static final float h(short s) {
        int i2;
        int i3;
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 == 0) {
            if (i6 != 0) {
                gz3 gz3Var = gz3.a;
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - n;
                if (i4 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        } else {
            int i7 = i6 << 13;
            if (i5 == 31) {
                if (i7 != 0) {
                    i7 |= 4194304;
                }
                i2 = i7;
                i3 = 255;
            } else {
                int i8 = i5 + 112;
                i2 = i7;
                i3 = i8;
            }
        }
        int i9 = (i3 << 23) | (i4 << 16) | i2;
        gz3 gz3Var2 = gz3.a;
        return Float.intBitsToFloat(i9);
    }

    public static short g(short s) {
        return s;
    }
}
