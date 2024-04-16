package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: _ArraysJvm.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aS\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a2\u0010\r\u001a\u00020\f*\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007\u001a2\u0010\u000f\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007\u001a2\u0010\u0011\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007\u001a2\u0010\u0013\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007\u001a5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0018\u001a\u00020\f*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010\u001c\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001a\u001a\u00028\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001d\u001a&\u0010\u001f\u001a\u00020\u001b*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u001a&\u0010 \u001a\u00020\u001b*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u001a.\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0015\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0006H\u0086\u0002\u001a\u0015\u0010%\u001a\u00020\f*\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0086\u0002\u001a\u0015\u0010&\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0086\u0002\u001a\u001f\u0010'\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b'\u0010(\u001a;\u0010,\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010+\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000)j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`*¢\u0006\u0004\b,\u0010-\u001aO\u0010.\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010+\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000)j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`*2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"T", "", "", c.a, "([Ljava/lang/Object;)Ljava/util/List;", "destination", "", "destinationOffset", "startIndex", "endIndex", Image.TYPE_HIGH, "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "", "f", "", "g", "", e.a, "fromIndex", "toIndex", "n", "([Ljava/lang/Object;II)[Ljava/lang/Object;", Image.TYPE_MEDIUM, "([BII)[B", "element", "", "q", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "", "o", "p", "w", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "u", "elements", "t", "v", "x", "([Ljava/lang/Object;)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "y", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "z", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/ArraysKt")
/* renamed from: xr */
/* loaded from: classes3.dex */
public class xr extends wr {
    public static <T> List<T> c(T[] tArr) {
        z65.h(tArr, "<this>");
        List<T> a = zr.a(tArr);
        z65.g(a, "asList(...)");
        return a;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        z65.h(bArr, "<this>");
        z65.h(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static float[] e(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        z65.h(fArr, "<this>");
        z65.h(fArr2, "destination");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    public static int[] f(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        z65.h(iArr, "<this>");
        z65.h(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static long[] g(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        z65.h(jArr, "<this>");
        z65.h(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static <T> T[] h(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        z65.h(tArr, "<this>");
        z65.h(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static /* synthetic */ byte[] i(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        byte[] d;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        d = d(bArr, bArr2, i, i2, i3);
        return d;
    }

    public static /* synthetic */ float[] j(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        float[] e;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        e = e(fArr, fArr2, i, i2, i3);
        return e;
    }

    public static /* synthetic */ int[] k(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        int[] f;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        f = f(iArr, iArr2, i, i2, i3);
        return f;
    }

    public static /* synthetic */ Object[] l(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        Object[] h;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        h = h(objArr, objArr2, i, i2, i3);
        return h;
    }

    public static byte[] m(byte[] bArr, int i, int i2) {
        z65.h(bArr, "<this>");
        vr.b(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        z65.g(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static <T> T[] n(T[] tArr, int i, int i2) {
        z65.h(tArr, "<this>");
        vr.b(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        z65.g(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static void o(byte[] bArr, byte b, int i, int i2) {
        z65.h(bArr, "<this>");
        Arrays.fill(bArr, i, i2, b);
    }

    public static void p(int[] iArr, int i, int i2, int i3) {
        z65.h(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    public static <T> void q(T[] tArr, T t, int i, int i2) {
        z65.h(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    public static /* synthetic */ void r(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        p(iArr, i, i2, i3);
    }

    public static /* synthetic */ void s(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        q(objArr, obj, i, i2);
    }

    public static byte[] t(byte[] bArr, byte[] bArr2) {
        z65.h(bArr, "<this>");
        z65.h(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        z65.e(copyOf);
        return copyOf;
    }

    public static int[] u(int[] iArr, int i) {
        z65.h(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        z65.e(copyOf);
        return copyOf;
    }

    public static int[] v(int[] iArr, int[] iArr2) {
        z65.h(iArr, "<this>");
        z65.h(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        z65.e(copyOf);
        return copyOf;
    }

    public static <T> T[] w(T[] tArr, T t) {
        z65.h(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        z65.e(tArr2);
        return tArr2;
    }

    public static <T> void x(T[] tArr) {
        z65.h(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void y(T[] tArr, Comparator<? super T> comparator) {
        z65.h(tArr, "<this>");
        z65.h(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static <T> void z(T[] tArr, Comparator<? super T> comparator, int i, int i2) {
        z65.h(tArr, "<this>");
        z65.h(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }
}
