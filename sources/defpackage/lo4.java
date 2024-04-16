package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: HijrahDate.java */
/* renamed from: lo4  reason: default package */
/* loaded from: classes3.dex */
public final class lo4 extends g71<lo4> implements Serializable {
    private static final Integer[] A;
    private static final Integer[] B;
    private static final Integer[] I;
    private static final Integer[] X;
    private static final Integer[] Y;
    private static final Integer[] Z;
    private static final int[] j;
    private static final int[] k = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
    private static final int[] l = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
    private static final int[] m = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
    private static final int[] n = {0, 1, 0, 1, 0, 1, 1};
    private static final int[] o = {1, 9999, 11, 51, 5, 29, 354};
    private static final int[] p = {1, 9999, 11, 52, 6, 30, 355};
    private static final int[] q = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
    private static final char r;
    private static final String s;
    private static final String t;
    private static final HashMap<Integer, Integer[]> u;
    private static final HashMap<Integer, Integer[]> v;
    private static final HashMap<Integer, Integer[]> w;
    private static final Long[] x;
    private static final Integer[] y;
    private static final Integer[] z;
    private final transient mo4 b;
    private final transient int c;
    private final transient int d;
    private final transient int e;
    private final transient int f;
    private final transient hn2 g;
    private final long h;
    private final transient boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HijrahDate.java */
    /* renamed from: lo4$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h71.values().length];
            a = iArr;
            try {
                iArr[h71.w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h71.x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h71.z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h71.X.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[h71.t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[h71.u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[h71.v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[h71.y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[h71.A.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[h71.B.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[h71.Y.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[h71.Z.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        int[] iArr = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
        j = iArr;
        char c = File.separatorChar;
        r = c;
        s = File.pathSeparator;
        t = "org" + c + "threeten" + c + "bp" + c + "chrono";
        u = new HashMap<>();
        v = new HashMap<>();
        w = new HashMap<>();
        B = new Integer[iArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = j;
            if (i2 >= iArr2.length) {
                break;
            }
            B[i2] = Integer.valueOf(iArr2[i2]);
            i2++;
        }
        I = new Integer[k.length];
        int i3 = 0;
        while (true) {
            int[] iArr3 = k;
            if (i3 >= iArr3.length) {
                break;
            }
            I[i3] = Integer.valueOf(iArr3[i3]);
            i3++;
        }
        X = new Integer[l.length];
        int i4 = 0;
        while (true) {
            int[] iArr4 = l;
            if (i4 >= iArr4.length) {
                break;
            }
            X[i4] = Integer.valueOf(iArr4[i4]);
            i4++;
        }
        Y = new Integer[m.length];
        int i5 = 0;
        while (true) {
            int[] iArr5 = m;
            if (i5 >= iArr5.length) {
                break;
            }
            Y[i5] = Integer.valueOf(iArr5[i5]);
            i5++;
        }
        Z = new Integer[q.length];
        int i6 = 0;
        while (true) {
            int[] iArr6 = q;
            if (i6 >= iArr6.length) {
                break;
            }
            Z[i6] = Integer.valueOf(iArr6[i6]);
            i6++;
        }
        x = new Long[334];
        int i7 = 0;
        while (true) {
            Long[] lArr = x;
            if (i7 >= lArr.length) {
                break;
            }
            lArr[i7] = Long.valueOf(i7 * 10631);
            i7++;
        }
        y = new Integer[n.length];
        int i8 = 0;
        while (true) {
            int[] iArr7 = n;
            if (i8 >= iArr7.length) {
                break;
            }
            y[i8] = Integer.valueOf(iArr7[i8]);
            i8++;
        }
        z = new Integer[o.length];
        int i9 = 0;
        while (true) {
            int[] iArr8 = o;
            if (i9 >= iArr8.length) {
                break;
            }
            z[i9] = Integer.valueOf(iArr8[i9]);
            i9++;
        }
        A = new Integer[p.length];
        while (true) {
            int[] iArr9 = p;
            if (i < iArr9.length) {
                A[i] = Integer.valueOf(iArr9[i]);
                i++;
            } else {
                try {
                    v1();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
        }
    }

    private lo4(long j2) {
        int[] Y0 = Y0(j2);
        M0(Y0[1]);
        L0(Y0[2]);
        J0(Y0[3]);
        K0(Y0[4]);
        this.b = mo4.a(Y0[0]);
        int i = Y0[1];
        this.c = i;
        this.d = Y0[2];
        this.e = Y0[3];
        this.f = Y0[4];
        this.g = hn2.k(Y0[5]);
        this.h = j2;
        this.i = g1(i);
    }

    private static long B1(int i) {
        Long l2;
        int i2 = i - 1;
        int i3 = i2 / 30;
        int i4 = i2 % 30;
        int intValue = N0(i3)[Math.abs(i4)].intValue();
        if (i4 < 0) {
            intValue = -intValue;
        }
        try {
            l2 = x[i3];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = Long.valueOf(i3 * 10631);
        }
        return (l2.longValue() + intValue) - 492149;
    }

    private static void F0(int i, int i2, int i3, int i4, int i5) {
        if (i < 1) {
            throw new IllegalArgumentException("startYear < 1");
        }
        if (i3 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        }
        if (i2 < 0 || i2 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        }
        if (i4 < 0 || i4 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        }
        if (i3 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        }
        if (i3 < i) {
            throw new IllegalArgumentException("startYear > endYear");
        }
        if (i3 == i && i4 < i2) {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
        boolean g1 = g1(i);
        Integer[] numArr = u.get(Integer.valueOf(i));
        if (numArr == null) {
            if (g1) {
                numArr = new Integer[k.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = k;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    numArr[i6] = Integer.valueOf(iArr[i6]);
                    i6++;
                }
            } else {
                numArr = new Integer[j.length];
                int i7 = 0;
                while (true) {
                    int[] iArr2 = j;
                    if (i7 >= iArr2.length) {
                        break;
                    }
                    numArr[i7] = Integer.valueOf(iArr2[i7]);
                    i7++;
                }
            }
        }
        Integer[] numArr2 = new Integer[numArr.length];
        for (int i8 = 0; i8 < 12; i8++) {
            if (i8 > i2) {
                numArr2[i8] = Integer.valueOf(numArr[i8].intValue() - i5);
            } else {
                numArr2[i8] = Integer.valueOf(numArr[i8].intValue());
            }
        }
        u.put(Integer.valueOf(i), numArr2);
        Integer[] numArr3 = v.get(Integer.valueOf(i));
        if (numArr3 == null) {
            if (g1) {
                numArr3 = new Integer[m.length];
                int i9 = 0;
                while (true) {
                    int[] iArr3 = m;
                    if (i9 >= iArr3.length) {
                        break;
                    }
                    numArr3[i9] = Integer.valueOf(iArr3[i9]);
                    i9++;
                }
            } else {
                numArr3 = new Integer[l.length];
                int i10 = 0;
                while (true) {
                    int[] iArr4 = l;
                    if (i10 >= iArr4.length) {
                        break;
                    }
                    numArr3[i10] = Integer.valueOf(iArr4[i10]);
                    i10++;
                }
            }
        }
        Integer[] numArr4 = new Integer[numArr3.length];
        for (int i11 = 0; i11 < 12; i11++) {
            if (i11 == i2) {
                numArr4[i11] = Integer.valueOf(numArr3[i11].intValue() - i5);
            } else {
                numArr4[i11] = Integer.valueOf(numArr3[i11].intValue());
            }
        }
        v.put(Integer.valueOf(i), numArr4);
        if (i != i3) {
            int i12 = i - 1;
            int i13 = i12 / 30;
            int i14 = i12 % 30;
            Integer[] numArr5 = w.get(Integer.valueOf(i13));
            if (numArr5 == null) {
                int length = q.length;
                Integer[] numArr6 = new Integer[length];
                for (int i15 = 0; i15 < length; i15++) {
                    numArr6[i15] = Integer.valueOf(q[i15]);
                }
                numArr5 = numArr6;
            }
            for (int i16 = i14 + 1; i16 < q.length; i16++) {
                numArr5[i16] = Integer.valueOf(numArr5[i16].intValue() - i5);
            }
            w.put(Integer.valueOf(i13), numArr5);
            int i17 = i3 - 1;
            int i18 = i17 / 30;
            if (i13 != i18) {
                int i19 = i13 + 1;
                while (true) {
                    Long[] lArr = x;
                    if (i19 >= lArr.length) {
                        break;
                    }
                    lArr[i19] = Long.valueOf(lArr[i19].longValue() - i5);
                    i19++;
                }
                int i20 = i18 + 1;
                while (true) {
                    Long[] lArr2 = x;
                    if (i20 >= lArr2.length) {
                        break;
                    }
                    lArr2[i20] = Long.valueOf(lArr2[i20].longValue() + i5);
                    i20++;
                    i18 = i18;
                }
            }
            int i21 = i18;
            int i22 = i17 % 30;
            Integer[] numArr7 = w.get(Integer.valueOf(i21));
            if (numArr7 == null) {
                int length2 = q.length;
                Integer[] numArr8 = new Integer[length2];
                for (int i23 = 0; i23 < length2; i23++) {
                    numArr8[i23] = Integer.valueOf(q[i23]);
                }
                numArr7 = numArr8;
            }
            for (int i24 = i22 + 1; i24 < q.length; i24++) {
                numArr7[i24] = Integer.valueOf(numArr7[i24].intValue() + i5);
            }
            w.put(Integer.valueOf(i21), numArr7);
        }
        boolean g12 = g1(i3);
        Integer[] numArr9 = u.get(Integer.valueOf(i3));
        if (numArr9 == null) {
            if (g12) {
                numArr9 = new Integer[k.length];
                int i25 = 0;
                while (true) {
                    int[] iArr5 = k;
                    if (i25 >= iArr5.length) {
                        break;
                    }
                    numArr9[i25] = Integer.valueOf(iArr5[i25]);
                    i25++;
                }
            } else {
                numArr9 = new Integer[j.length];
                int i26 = 0;
                while (true) {
                    int[] iArr6 = j;
                    if (i26 >= iArr6.length) {
                        break;
                    }
                    numArr9[i26] = Integer.valueOf(iArr6[i26]);
                    i26++;
                }
            }
        }
        Integer[] numArr10 = new Integer[numArr9.length];
        for (int i27 = 0; i27 < 12; i27++) {
            if (i27 > i4) {
                numArr10[i27] = Integer.valueOf(numArr9[i27].intValue() + i5);
            } else {
                numArr10[i27] = Integer.valueOf(numArr9[i27].intValue());
            }
        }
        u.put(Integer.valueOf(i3), numArr10);
        Integer[] numArr11 = v.get(Integer.valueOf(i3));
        if (numArr11 == null) {
            if (g12) {
                numArr11 = new Integer[m.length];
                int i28 = 0;
                while (true) {
                    int[] iArr7 = m;
                    if (i28 >= iArr7.length) {
                        break;
                    }
                    numArr11[i28] = Integer.valueOf(iArr7[i28]);
                    i28++;
                }
            } else {
                numArr11 = new Integer[l.length];
                int i29 = 0;
                while (true) {
                    int[] iArr8 = l;
                    if (i29 >= iArr8.length) {
                        break;
                    }
                    numArr11[i29] = Integer.valueOf(iArr8[i29]);
                    i29++;
                }
            }
        }
        Integer[] numArr12 = new Integer[numArr11.length];
        for (int i30 = 0; i30 < 12; i30++) {
            if (i30 == i4) {
                numArr12[i30] = Integer.valueOf(numArr11[i30].intValue() + i5);
            } else {
                numArr12[i30] = Integer.valueOf(numArr11[i30].intValue());
            }
        }
        HashMap<Integer, Integer[]> hashMap = v;
        hashMap.put(Integer.valueOf(i3), numArr12);
        Integer[] numArr13 = hashMap.get(Integer.valueOf(i));
        Integer[] numArr14 = hashMap.get(Integer.valueOf(i3));
        HashMap<Integer, Integer[]> hashMap2 = u;
        int intValue = numArr13[i2].intValue();
        int intValue2 = numArr14[i4].intValue();
        int intValue3 = hashMap2.get(Integer.valueOf(i))[11].intValue() + numArr13[11].intValue();
        int intValue4 = hashMap2.get(Integer.valueOf(i3))[11].intValue() + numArr14[11].intValue();
        Integer[] numArr15 = A;
        int intValue5 = numArr15[5].intValue();
        Integer[] numArr16 = z;
        int intValue6 = numArr16[5].intValue();
        if (intValue5 < intValue) {
            intValue5 = intValue;
        }
        if (intValue5 < intValue2) {
            intValue5 = intValue2;
        }
        numArr15[5] = Integer.valueOf(intValue5);
        if (intValue6 <= intValue) {
            intValue = intValue6;
        }
        if (intValue <= intValue2) {
            intValue2 = intValue;
        }
        numArr16[5] = Integer.valueOf(intValue2);
        int intValue7 = numArr15[6].intValue();
        int intValue8 = numArr16[6].intValue();
        if (intValue7 < intValue3) {
            intValue7 = intValue3;
        }
        if (intValue7 < intValue4) {
            intValue7 = intValue4;
        }
        numArr15[6] = Integer.valueOf(intValue7);
        if (intValue8 <= intValue3) {
            intValue3 = intValue8;
        }
        if (intValue3 <= intValue4) {
            intValue4 = intValue3;
        }
        numArr16[6] = Integer.valueOf(intValue4);
    }

    private static void J0(int i) {
        if (i >= 1 && i <= Z0()) {
            return;
        }
        throw new DateTimeException("Invalid day of month of Hijrah date, day " + i + " greater than " + Z0() + " or less than 1");
    }

    private static void K0(int i) {
        if (i >= 1 && i <= a1()) {
            return;
        }
        throw new DateTimeException("Invalid day of year of Hijrah date");
    }

    private static void L0(int i) {
        if (i >= 1 && i <= 12) {
            return;
        }
        throw new DateTimeException("Invalid month of Hijrah date");
    }

    private static void M0(int i) {
        if (i >= 1 && i <= 9999) {
            return;
        }
        throw new DateTimeException("Invalid year of Hijrah Era");
    }

    private static Integer[] N0(int i) {
        Integer[] numArr;
        try {
            numArr = w.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return Z;
        }
        return numArr;
    }

    private static Integer[] O0(int i) {
        Integer[] numArr;
        try {
            numArr = u.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            if (g1(i)) {
                return I;
            }
            return B;
        }
        return numArr;
    }

    private static Integer[] P0(int i) {
        Integer[] numArr;
        try {
            numArr = v.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            if (g1(i)) {
                return Y;
            }
            return X;
        }
        return numArr;
    }

    private static InputStream R0() throws IOException {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                property2 = property2 + System.getProperty("file.separator");
            }
            File file = new File(property2 + r + property);
            if (!file.exists()) {
                return null;
            }
            return new FileInputStream(file);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), s);
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            File file2 = new File(nextToken);
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(nextToken);
                    char c = r;
                    sb.append(c);
                    String str = t;
                    sb.append(str);
                    if (new File(sb.toString(), property).exists()) {
                        return new FileInputStream(nextToken + c + str + c + property);
                    }
                } else {
                    try {
                        zipFile = new ZipFile(file2);
                    } catch (IOException unused) {
                        zipFile = null;
                    }
                    if (zipFile != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(t);
                        char c2 = r;
                        sb2.append(c2);
                        sb2.append(property);
                        String sb3 = sb2.toString();
                        ZipEntry entry = zipFile.getEntry(sb3);
                        if (entry == null) {
                            if (c2 == '/') {
                                sb3 = sb3.replace('/', CoreConstants.ESCAPE_CHAR);
                            } else if (c2 == '\\') {
                                sb3 = sb3.replace(CoreConstants.ESCAPE_CHAR, '/');
                            }
                            entry = zipFile.getEntry(sb3);
                        }
                        if (entry != null) {
                            return zipFile.getInputStream(entry);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private static int S0(long j2) {
        Long[] lArr = x;
        for (int i = 0; i < lArr.length; i++) {
            try {
                if (j2 < lArr[i].longValue()) {
                    return i - 1;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return ((int) j2) / 10631;
            }
        }
        return ((int) j2) / 10631;
    }

    private static int T0(long j2, int i) {
        Long l2;
        try {
            l2 = x[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = Long.valueOf(i * 10631);
        }
        return (int) (j2 - l2.longValue());
    }

    private static int U0(int i, int i2, int i3) {
        int intValue;
        Integer[] O0 = O0(i3);
        if (i >= 0) {
            if (i2 > 0) {
                intValue = O0[i2].intValue();
            } else {
                return i;
            }
        } else {
            if (g1(i3)) {
                i += 355;
            } else {
                i += 354;
            }
            if (i2 > 0) {
                intValue = O0[i2].intValue();
            } else {
                return i;
            }
        }
        return i - intValue;
    }

    private static int V0(int i, int i2, int i3) {
        Integer[] N0 = N0(i);
        if (i2 > 0) {
            return i2 - N0[i3].intValue();
        }
        return N0[i3].intValue() + i2;
    }

    private static long X0(int i, int i2, int i3) {
        return B1(i) + b1(i2 - 1, i) + i3;
    }

    private static int[] Y0(long j2) {
        int i;
        int i2;
        int i3;
        int d1;
        int U0;
        int value;
        int i4;
        long j3 = j2 - (-492148);
        if (j3 >= 0) {
            int S0 = S0(j3);
            int T0 = T0(j3, S0);
            int e1 = e1(S0, T0);
            i3 = V0(S0, T0, e1);
            i = (S0 * 30) + e1 + 1;
            d1 = d1(i3, i);
            U0 = U0(i3, d1, i) + 1;
            value = mo4.AH.getValue();
        } else {
            int i5 = (int) j3;
            int i6 = i5 / 10631;
            int i7 = i5 % 10631;
            if (i7 == 0) {
                i6++;
                i7 = -10631;
            }
            int e12 = e1(i6, i7);
            int V0 = V0(i6, i7, e12);
            i = 1 - ((i6 * 30) - e12);
            if (g1(i)) {
                i2 = V0 + 355;
            } else {
                i2 = V0 + 354;
            }
            i3 = i2;
            d1 = d1(i3, i);
            U0 = U0(i3, d1, i) + 1;
            value = mo4.BEFORE_AH.getValue();
        }
        int i8 = (int) ((j2 - (-492153)) % 7);
        if (i8 <= 0) {
            i4 = 7;
        } else {
            i4 = 0;
        }
        return new int[]{value, i, d1 + 1, U0, i3 + 1, i8 + i4};
    }

    static int Z0() {
        return A[5].intValue();
    }

    static int a1() {
        return A[6].intValue();
    }

    private static int b1(int i, int i2) {
        return O0(i2)[i].intValue();
    }

    static int c1(int i, int i2) {
        return P0(i2)[i].intValue();
    }

    private static int d1(int i, int i2) {
        int i3;
        Integer[] O0 = O0(i2);
        int i4 = 0;
        if (i >= 0) {
            while (i4 < O0.length) {
                if (i < O0[i4].intValue()) {
                    return i4 - 1;
                }
                i4++;
            }
            return 11;
        }
        if (g1(i2)) {
            i3 = i + 355;
        } else {
            i3 = i + 354;
        }
        while (i4 < O0.length) {
            if (i3 < O0[i4].intValue()) {
                return i4 - 1;
            }
            i4++;
        }
        return 11;
    }

    private static int e1(int i, long j2) {
        Integer[] N0 = N0(i);
        int i2 = 0;
        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i3 == 0) {
            return 0;
        }
        if (i3 > 0) {
            while (i2 < N0.length) {
                if (j2 < N0[i2].intValue()) {
                    return i2 - 1;
                }
                i2++;
            }
            return 29;
        }
        long j3 = -j2;
        while (i2 < N0.length) {
            if (j3 <= N0[i2].intValue()) {
                return i2 - 1;
            }
            i2++;
        }
        return 29;
    }

    static int f1(int i) {
        Integer[] numArr;
        int i2 = i - 1;
        int i3 = i2 / 30;
        try {
            numArr = w.get(Integer.valueOf(i3));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            int i4 = i2 % 30;
            if (i4 == 29) {
                Long[] lArr = x;
                return (lArr[i3 + 1].intValue() - lArr[i3].intValue()) - numArr[i4].intValue();
            }
            return numArr[i4 + 1].intValue() - numArr[i4].intValue();
        } else if (g1(i)) {
            return 355;
        } else {
            return 354;
        }
    }

    static boolean g1(long j2) {
        if (j2 <= 0) {
            j2 = -j2;
        }
        if (((j2 * 11) + 14) % 30 < 11) {
            return true;
        }
        return false;
    }

    public static lo4 k1(int i, int i2, int i3) {
        if (i >= 1) {
            return l1(mo4.AH, i, i2, i3);
        }
        return l1(mo4.BEFORE_AH, 1 - i, i2, i3);
    }

    static lo4 l1(mo4 mo4Var, int i, int i2, int i3) {
        g95.i(mo4Var, "era");
        M0(i);
        L0(i2);
        J0(i3);
        return new lo4(X0(mo4Var.k(i), i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lo4 m1(long j2) {
        return new lo4(j2);
    }

    private static void n1(String str, int i) throws ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf != -1) {
                try {
                    int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                    int indexOf2 = nextToken.indexOf(45);
                    if (indexOf2 != -1) {
                        String substring = nextToken.substring(0, indexOf2);
                        String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                        int indexOf3 = substring.indexOf(47);
                        int indexOf4 = substring2.indexOf(47);
                        if (indexOf3 != -1) {
                            String substring3 = substring.substring(0, indexOf3);
                            String substring4 = substring.substring(indexOf3 + 1, substring.length());
                            try {
                                int parseInt2 = Integer.parseInt(substring3);
                                try {
                                    int parseInt3 = Integer.parseInt(substring4);
                                    if (indexOf4 != -1) {
                                        String substring5 = substring2.substring(0, indexOf4);
                                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                                        try {
                                            int parseInt4 = Integer.parseInt(substring5);
                                            try {
                                                int parseInt5 = Integer.parseInt(substring6);
                                                if (parseInt2 != -1 && parseInt3 != -1 && parseInt4 != -1 && parseInt5 != -1) {
                                                    F0(parseInt2, parseInt3, parseInt4, parseInt5, parseInt);
                                                } else {
                                                    throw new ParseException("Unknown error at line " + i + ".", i);
                                                }
                                            } catch (NumberFormatException unused) {
                                                throw new ParseException("End month is not properly set at line " + i + ".", i);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            throw new ParseException("End year is not properly set at line " + i + ".", i);
                                        }
                                    } else {
                                        throw new ParseException("End year/month has incorrect format at line " + i + ".", i);
                                    }
                                } catch (NumberFormatException unused3) {
                                    throw new ParseException("Start month is not properly set at line " + i + ".", i);
                                }
                            } catch (NumberFormatException unused4) {
                                throw new ParseException("Start year is not properly set at line " + i + ".", i);
                            }
                        } else {
                            throw new ParseException("Start year/month has incorrect format at line " + i + ".", i);
                        }
                    } else {
                        throw new ParseException("Start and end year/month has incorrect format at line " + i + ".", i);
                    }
                } catch (NumberFormatException unused5) {
                    throw new ParseException("Offset is not properly set at line " + i + ".", i);
                }
            } else {
                throw new ParseException("Offset has incorrect format at line " + i + ".", i);
            }
        }
    }

    private Object readResolve() {
        return new lo4(this.h);
    }

    private static void v1() throws IOException, ParseException {
        InputStream R0 = R0();
        if (R0 != null) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(R0));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            i++;
                            n1(readLine.trim(), i);
                        } else {
                            bufferedReader2.close();
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i71 w1(DataInput dataInput) throws IOException {
        return ko4.e.i(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private Object writeReplace() {
        return new hca((byte) 3, this);
    }

    private static lo4 x1(int i, int i2, int i3) {
        int b1 = b1(i2 - 1, i);
        if (i3 > b1) {
            i3 = b1;
        }
        return k1(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A1(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(w(h71.Y));
        dataOutput.writeByte(w(h71.B));
        dataOutput.writeByte(w(h71.w));
    }

    @Override // defpackage.lq2, defpackage.q8b
    public kwb K(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (G(u8bVar)) {
                h71 h71Var = (h71) u8bVar;
                int i = a.a[h71Var.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return T().b0(h71Var);
                            }
                            return kwb.k(1L, 1000L);
                        }
                        return kwb.k(1L, 5L);
                    }
                    return kwb.k(1L, i1());
                }
                return kwb.k(1L, h1());
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
        }
        return u8bVar.k(this);
    }

    @Override // defpackage.g71, defpackage.i71
    public final j71<lo4> P(gs5 gs5Var) {
        return super.P(gs5Var);
    }

    @Override // defpackage.i71
    /* renamed from: Q0 */
    public ko4 T() {
        return ko4.e;
    }

    @Override // defpackage.i71
    /* renamed from: W0 */
    public mo4 b0() {
        return this.b;
    }

    public int h1() {
        return c1(this.d - 1, this.c);
    }

    public int i1() {
        return f1(this.c);
    }

    @Override // defpackage.i71, defpackage.kq2, defpackage.p8b
    /* renamed from: j1 */
    public lo4 i(long j2, x8b x8bVar) {
        return (lo4) super.i(j2, x8bVar);
    }

    @Override // defpackage.i71
    public long m0() {
        return X0(this.c, this.d, this.e);
    }

    @Override // defpackage.g71
    /* renamed from: p1 */
    public lo4 r0(long j2, x8b x8bVar) {
        return (lo4) super.h0(j2, x8bVar);
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        int i;
        int i2;
        if (u8bVar instanceof h71) {
            switch (a.a[((h71) u8bVar).ordinal()]) {
                case 1:
                    i = this.e;
                    break;
                case 2:
                    i = this.f;
                    break;
                case 3:
                    i2 = (this.e - 1) / 7;
                    i = i2 + 1;
                    break;
                case 4:
                    i = this.c;
                    break;
                case 5:
                    i = this.g.getValue();
                    break;
                case 6:
                    i2 = (this.e - 1) % 7;
                    i = i2 + 1;
                    break;
                case 7:
                    i2 = (this.f - 1) % 7;
                    i = i2 + 1;
                    break;
                case 8:
                    return m0();
                case 9:
                    i2 = (this.f - 1) / 7;
                    i = i2 + 1;
                    break;
                case 10:
                    i = this.d;
                    break;
                case 11:
                    i = this.c;
                    break;
                case 12:
                    i = this.b.getValue();
                    break;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
            }
            return i;
        }
        return u8bVar.q(this);
    }

    @Override // defpackage.i71
    /* renamed from: r1 */
    public lo4 l0(t8b t8bVar) {
        return (lo4) super.l0(t8bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.g71
    /* renamed from: s1 */
    public lo4 x0(long j2) {
        return new lo4(this.h + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.g71
    /* renamed from: t1 */
    public lo4 z0(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i = (this.d - 1) + ((int) j2);
        int i2 = i / 12;
        int i3 = i % 12;
        while (i3 < 0) {
            i3 += 12;
            i2 = g95.n(i2, 1);
        }
        return l1(this.b, g95.j(this.c, i2), i3 + 1, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.g71
    /* renamed from: u1 */
    public lo4 E0(long j2) {
        if (j2 == 0) {
            return this;
        }
        return l1(this.b, g95.j(this.c, (int) j2), this.d, this.e);
    }

    @Override // defpackage.i71, defpackage.kq2, defpackage.p8b
    /* renamed from: y1 */
    public lo4 s(r8b r8bVar) {
        return (lo4) super.s(r8bVar);
    }

    @Override // defpackage.i71
    /* renamed from: z1 */
    public lo4 p0(u8b u8bVar, long j2) {
        if (u8bVar instanceof h71) {
            h71 h71Var = (h71) u8bVar;
            h71Var.E(j2);
            int i = (int) j2;
            switch (a.a[h71Var.ordinal()]) {
                case 1:
                    return x1(this.c, this.d, i);
                case 2:
                    int i2 = i - 1;
                    return x1(this.c, (i2 / 30) + 1, (i2 % 30) + 1);
                case 3:
                    return x0((j2 - q(h71.z)) * 7);
                case 4:
                    if (this.c < 1) {
                        i = 1 - i;
                    }
                    return x1(i, this.d, this.e);
                case 5:
                    return x0(j2 - this.g.getValue());
                case 6:
                    return x0(j2 - q(h71.u));
                case 7:
                    return x0(j2 - q(h71.v));
                case 8:
                    return new lo4(i);
                case 9:
                    return x0((j2 - q(h71.A)) * 7);
                case 10:
                    return x1(this.c, i, this.e);
                case 11:
                    return x1(i, this.d, this.e);
                case 12:
                    return x1(1 - this.c, this.d, this.e);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
            }
        }
        return (lo4) u8bVar.o(this, j2);
    }
}
