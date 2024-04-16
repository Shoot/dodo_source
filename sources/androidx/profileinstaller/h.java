package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProfileTranscoder.java */
/* loaded from: classes.dex */
public class h {
    static final byte[] a = {112, 114, 111, 0};
    static final byte[] b = {112, 114, 109, 0};

    private static void A(@NonNull InputStream inputStream) throws IOException {
        d.h(inputStream);
        int j = d.j(inputStream);
        if (j == 6 || j == 7) {
            return;
        }
        while (j > 0) {
            d.j(inputStream);
            for (int j2 = d.j(inputStream); j2 > 0; j2--) {
                d.h(inputStream);
            }
            j--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, j.a)) {
            N(outputStream, cVarArr);
            return true;
        } else if (Arrays.equals(bArr, j.b)) {
            M(outputStream, cVarArr);
            return true;
        } else if (Arrays.equals(bArr, j.d)) {
            K(outputStream, cVarArr);
            return true;
        } else if (Arrays.equals(bArr, j.c)) {
            L(outputStream, cVarArr);
            return true;
        } else if (Arrays.equals(bArr, j.e)) {
            J(outputStream, cVarArr);
            return true;
        } else {
            return false;
        }
    }

    private static void C(@NonNull OutputStream outputStream, @NonNull c cVar) throws IOException {
        int i = 0;
        for (int i2 : cVar.h) {
            Integer valueOf = Integer.valueOf(i2);
            d.p(outputStream, valueOf.intValue() - i);
            i = valueOf.intValue();
        }
    }

    private static k D(@NonNull c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d.p(byteArrayOutputStream, cVarArr.length);
            int i = 2;
            for (c cVar : cVarArr) {
                d.q(byteArrayOutputStream, cVar.c);
                d.q(byteArrayOutputStream, cVar.d);
                d.q(byteArrayOutputStream, cVar.g);
                String j = j(cVar.a, cVar.b, j.a);
                int k = d.k(j);
                d.p(byteArrayOutputStream, k);
                i = i + 14 + k;
                d.n(byteArrayOutputStream, j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                k kVar = new k(e.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return kVar;
            }
            throw d.c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(a);
        outputStream.write(bArr);
    }

    private static void F(@NonNull OutputStream outputStream, @NonNull c cVar) throws IOException {
        I(outputStream, cVar);
        C(outputStream, cVar);
        H(outputStream, cVar);
    }

    private static void G(@NonNull OutputStream outputStream, @NonNull c cVar, @NonNull String str) throws IOException {
        d.p(outputStream, d.k(str));
        d.p(outputStream, cVar.e);
        d.q(outputStream, cVar.f);
        d.q(outputStream, cVar.c);
        d.q(outputStream, cVar.g);
        d.n(outputStream, str);
    }

    private static void H(@NonNull OutputStream outputStream, @NonNull c cVar) throws IOException {
        byte[] bArr = new byte[k(cVar.g)];
        for (Map.Entry<Integer, Integer> entry : cVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, cVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, cVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(@NonNull OutputStream outputStream, @NonNull c cVar) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : cVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                d.p(outputStream, intValue - i);
                d.p(outputStream, 0);
                i = intValue;
            }
        }
    }

    private static void J(@NonNull OutputStream outputStream, @NonNull c[] cVarArr) throws IOException {
        d.p(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String j = j(cVar.a, cVar.b, j.e);
            d.p(outputStream, d.k(j));
            d.p(outputStream, cVar.i.size());
            d.p(outputStream, cVar.h.length);
            d.q(outputStream, cVar.c);
            d.n(outputStream, j);
            for (Integer num : cVar.i.keySet()) {
                d.p(outputStream, num.intValue());
            }
            for (int i : cVar.h) {
                d.p(outputStream, i);
            }
        }
    }

    private static void K(@NonNull OutputStream outputStream, @NonNull c[] cVarArr) throws IOException {
        d.r(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String j = j(cVar.a, cVar.b, j.d);
            d.p(outputStream, d.k(j));
            d.p(outputStream, cVar.h.length);
            d.q(outputStream, cVar.i.size() * 4);
            d.q(outputStream, cVar.c);
            d.n(outputStream, j);
            for (Integer num : cVar.i.keySet()) {
                d.p(outputStream, num.intValue());
                d.p(outputStream, 0);
            }
            for (int i : cVar.h) {
                d.p(outputStream, i);
            }
        }
    }

    private static void L(@NonNull OutputStream outputStream, @NonNull c[] cVarArr) throws IOException {
        byte[] b2 = b(cVarArr, j.c);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, b2);
    }

    private static void M(@NonNull OutputStream outputStream, @NonNull c[] cVarArr) throws IOException {
        byte[] b2 = b(cVarArr, j.b);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, b2);
    }

    private static void N(@NonNull OutputStream outputStream, @NonNull c[] cVarArr) throws IOException {
        O(outputStream, cVarArr);
    }

    private static void O(@NonNull OutputStream outputStream, @NonNull c[] cVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(cVarArr));
        arrayList.add(c(cVarArr));
        arrayList.add(d(cVarArr));
        long length2 = j.a.length + a.length + 4 + (arrayList.size() * 16);
        d.q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            k kVar = (k) arrayList.get(i);
            d.q(outputStream, kVar.a.i());
            d.q(outputStream, length2);
            if (kVar.d) {
                byte[] bArr = kVar.c;
                byte[] b2 = d.b(bArr);
                arrayList2.add(b2);
                d.q(outputStream, b2.length);
                d.q(outputStream, bArr.length);
                length = b2.length;
            } else {
                arrayList2.add(kVar.c);
                d.q(outputStream, kVar.c.length);
                d.q(outputStream, 0L);
                length = kVar.c.length;
            }
            length2 += length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    private static int a(@NonNull c cVar) {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : cVar.i.entrySet()) {
            i |= entry.getValue().intValue();
        }
        return i;
    }

    @NonNull
    private static byte[] b(@NonNull c[] cVarArr, @NonNull byte[] bArr) throws IOException {
        int i = 0;
        int i2 = 0;
        for (c cVar : cVarArr) {
            i2 += d.k(j(cVar.a, cVar.b, bArr)) + 16 + (cVar.e * 2) + cVar.f + k(cVar.g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, j.c)) {
            int length = cVarArr.length;
            while (i < length) {
                c cVar2 = cVarArr[i];
                G(byteArrayOutputStream, cVar2, j(cVar2.a, cVar2.b, bArr));
                F(byteArrayOutputStream, cVar2);
                i++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                G(byteArrayOutputStream, cVar3, j(cVar3.a, cVar3.b, bArr));
            }
            int length2 = cVarArr.length;
            while (i < length2) {
                F(byteArrayOutputStream, cVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw d.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    private static k c(@NonNull c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < cVarArr.length; i2++) {
            try {
                c cVar = cVarArr[i2];
                d.p(byteArrayOutputStream, i2);
                d.p(byteArrayOutputStream, cVar.e);
                i = i + 4 + (cVar.e * 2);
                C(byteArrayOutputStream, cVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            k kVar = new k(e.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return kVar;
        }
        throw d.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    private static k d(@NonNull c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < cVarArr.length; i2++) {
            try {
                c cVar = cVarArr[i2];
                int a2 = a(cVar);
                byte[] e = e(cVar);
                byte[] f = f(cVar);
                d.p(byteArrayOutputStream, i2);
                int length = e.length + 2 + f.length;
                d.q(byteArrayOutputStream, length);
                d.p(byteArrayOutputStream, a2);
                byteArrayOutputStream.write(e);
                byteArrayOutputStream.write(f);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            k kVar = new k(e.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return kVar;
        }
        throw d.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(@NonNull c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(@NonNull c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    private static String g(@NonNull String str, @NonNull String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    @NonNull
    private static String h(@NonNull String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    private static c i(@NonNull c[] cVarArr, @NonNull String str) {
        if (cVarArr.length <= 0) {
            return null;
        }
        String h = h(str);
        for (int i = 0; i < cVarArr.length; i++) {
            if (cVarArr[i].b.equals(h)) {
                return cVarArr[i];
            }
        }
        return null;
    }

    @NonNull
    private static String j(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        String a2 = j.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a2);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + j.a(bArr) + str2;
        }
        return g(str2, a2);
    }

    private static int k(int i) {
        return y(i * 2) / 8;
    }

    private static int l(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                throw d.c("Unexpected flag: " + i);
            }
            return i2;
        }
        throw d.c("HOT methods are not stored in the bitmap");
    }

    private static int[] m(@NonNull InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += d.h(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    private static int n(@NonNull BitSet bitSet, int i, int i2) {
        int i3 = 2;
        if (!bitSet.get(l(2, i, i2))) {
            i3 = 0;
        }
        if (bitSet.get(l(4, i, i2))) {
            return i3 | 4;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] o(@NonNull InputStream inputStream, @NonNull byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, d.d(inputStream, bArr.length))) {
            return d.d(inputStream, j.b.length);
        }
        throw d.c("Invalid magic");
    }

    private static void p(@NonNull InputStream inputStream, @NonNull c cVar) throws IOException {
        int available = inputStream.available() - cVar.f;
        int i = 0;
        while (inputStream.available() > available) {
            i += d.h(inputStream);
            cVar.i.put(Integer.valueOf(i), 1);
            for (int h = d.h(inputStream); h > 0; h--) {
                A(inputStream);
            }
        }
        if (inputStream.available() == available) {
            return;
        }
        throw d.c("Read too much data during profile line parse");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static c[] q(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, j.f)) {
            if (!Arrays.equals(j.a, bArr2)) {
                return r(inputStream, bArr, cVarArr);
            }
            throw d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, j.g)) {
            return t(inputStream, bArr2, cVarArr);
        } else {
            throw d.c("Unsupported meta version");
        }
    }

    @NonNull
    static c[] r(@NonNull InputStream inputStream, @NonNull byte[] bArr, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, j.f)) {
            int j = d.j(inputStream);
            byte[] e = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                try {
                    c[] s = s(byteArrayInputStream, j, cVarArr);
                    byteArrayInputStream.close();
                    return s;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw d.c("Content found after the end of file");
        }
        throw d.c("Unsupported meta version");
    }

    @NonNull
    private static c[] s(@NonNull InputStream inputStream, int i, c[] cVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i == cVarArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int h = d.h(inputStream);
                iArr[i2] = d.h(inputStream);
                strArr[i2] = d.f(inputStream, h);
            }
            for (int i3 = 0; i3 < i; i3++) {
                c cVar = cVarArr[i3];
                if (cVar.b.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    cVar.e = i4;
                    cVar.h = m(inputStream, i4);
                } else {
                    throw d.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw d.c("Mismatched number of dex files found in metadata");
    }

    @NonNull
    static c[] t(@NonNull InputStream inputStream, @NonNull byte[] bArr, c[] cVarArr) throws IOException {
        int h = d.h(inputStream);
        byte[] e = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
            try {
                c[] u = u(byteArrayInputStream, bArr, h, cVarArr);
                byteArrayInputStream.close();
                return u;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw d.c("Content found after the end of file");
    }

    @NonNull
    private static c[] u(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i, c[] cVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i == cVarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                d.h(inputStream);
                String f = d.f(inputStream, d.h(inputStream));
                long i3 = d.i(inputStream);
                int h = d.h(inputStream);
                c i4 = i(cVarArr, f);
                if (i4 != null) {
                    i4.d = i3;
                    int[] m = m(inputStream, h);
                    if (Arrays.equals(bArr, j.e)) {
                        i4.e = h;
                        i4.h = m;
                    }
                } else {
                    throw d.c("Missing profile key: " + f);
                }
            }
            return cVarArr;
        }
        throw d.c("Mismatched number of dex files found in metadata");
    }

    private static void v(@NonNull InputStream inputStream, @NonNull c cVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(d.d(inputStream, d.a(cVar.g * 2)));
        int i = 0;
        while (true) {
            int i2 = cVar.g;
            if (i < i2) {
                int n = n(valueOf, i, i2);
                if (n != 0) {
                    Integer num = cVar.i.get(Integer.valueOf(i));
                    if (num == null) {
                        num = 0;
                    }
                    cVar.i.put(Integer.valueOf(i), Integer.valueOf(n | num.intValue()));
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static c[] w(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (Arrays.equals(bArr, j.b)) {
            int j = d.j(inputStream);
            byte[] e = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                try {
                    c[] x = x(byteArrayInputStream, str, j);
                    byteArrayInputStream.close();
                    return x;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw d.c("Content found after the end of file");
        }
        throw d.c("Unsupported version");
    }

    @NonNull
    private static c[] x(@NonNull InputStream inputStream, @NonNull String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i];
        for (int i2 = 0; i2 < i; i2++) {
            int h = d.h(inputStream);
            int h2 = d.h(inputStream);
            long i3 = d.i(inputStream);
            cVarArr[i2] = new c(str, d.f(inputStream, h), d.i(inputStream), 0L, h2, (int) i3, (int) d.i(inputStream), new int[h2], new TreeMap());
        }
        for (int i4 = 0; i4 < i; i4++) {
            c cVar = cVarArr[i4];
            p(inputStream, cVar);
            cVar.h = m(inputStream, cVar.e);
            v(inputStream, cVar);
        }
        return cVarArr;
    }

    private static int y(int i) {
        return (i + 7) & (-8);
    }

    private static void z(@NonNull byte[] bArr, int i, int i2, @NonNull c cVar) {
        int l = l(i, i2, cVar.g);
        int i3 = l / 8;
        bArr[i3] = (byte) ((1 << (l % 8)) | bArr[i3]);
    }
}
