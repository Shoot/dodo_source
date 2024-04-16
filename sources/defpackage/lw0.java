package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import org.jsoup.UncheckedIOException;
/* compiled from: CharacterReader.java */
/* renamed from: lw0  reason: default package */
/* loaded from: classes3.dex */
public final class lw0 {
    private char[] a;
    private Reader b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String[] h;
    private ArrayList<Integer> i;
    private int j;
    private boolean k;
    private String l;
    private int m;

    public lw0(Reader reader, int i) {
        this.g = -1;
        this.h = new String[512];
        this.i = null;
        this.j = 1;
        vvb.j(reader);
        vvb.d(reader.markSupported());
        this.b = reader;
        this.a = new char[Math.min(i, 32768)];
        b();
    }

    private int A(int i) {
        if (!z()) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(this.i, Integer.valueOf(i));
        if (binarySearch < -1) {
            return Math.abs(binarySearch) - 2;
        }
        return binarySearch;
    }

    static boolean R(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 != 0) {
                int i5 = i + 1;
                int i6 = i3 + 1;
                if (cArr[i] != str.charAt(i3)) {
                    return false;
                }
                i = i5;
                i2 = i4;
                i3 = i6;
            } else {
                return true;
            }
        }
    }

    private void T() {
        if (!z()) {
            return;
        }
        if (this.i.size() > 0) {
            int A = A(this.f);
            if (A == -1) {
                A = 0;
            }
            int intValue = this.i.get(A).intValue();
            this.j += A;
            this.i.clear();
            this.i.add(Integer.valueOf(intValue));
        }
        for (int i = this.e; i < this.c; i++) {
            if (this.a[i] == '\n') {
                this.i.add(Integer.valueOf(this.f + 1 + i));
            }
        }
    }

    private void b() {
        int i;
        int i2;
        boolean z;
        if (!this.k && (i = this.e) >= this.d) {
            int i3 = this.g;
            if (i3 != -1) {
                i2 = i - i3;
                i = i3;
            } else {
                i2 = 0;
            }
            try {
                long j = i;
                long skip = this.b.skip(j);
                this.b.mark(32768);
                int i4 = 0;
                while (true) {
                    z = true;
                    if (i4 > 1024) {
                        break;
                    }
                    Reader reader = this.b;
                    char[] cArr = this.a;
                    int read = reader.read(cArr, i4, cArr.length - i4);
                    if (read == -1) {
                        this.k = true;
                    }
                    if (read <= 0) {
                        break;
                    }
                    i4 += read;
                }
                this.b.reset();
                if (i4 > 0) {
                    if (skip != j) {
                        z = false;
                    }
                    vvb.d(z);
                    this.c = i4;
                    this.f += i;
                    this.e = i2;
                    if (this.g != -1) {
                        this.g = 0;
                    }
                    this.d = Math.min(i4, 24576);
                }
                T();
                this.l = null;
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    private static String c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + cArr[i + i4];
        }
        int i5 = i3 & 511;
        String str = strArr[i5];
        if (str != null && R(cArr, i, i2, str)) {
            return str;
        }
        String str2 = new String(cArr, i, i2);
        strArr[i5] = str2;
        return str2;
    }

    private boolean y() {
        if (this.e >= this.c) {
            return true;
        }
        return false;
    }

    public int B() {
        return C(Q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int C(int i) {
        if (!z()) {
            return 1;
        }
        int A = A(i);
        if (A == -1) {
            return this.j;
        }
        return A + this.j + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        if (this.c - this.e < 1024) {
            this.d = 0;
        }
        b();
        this.g = this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E(String str) {
        b();
        if (H(str)) {
            this.e += str.length();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F(String str) {
        if (M(str)) {
            this.e += str.length();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G(char c) {
        if (!x() && this.a[this.e] == c) {
            return true;
        }
        return false;
    }

    boolean H(String str) {
        b();
        int length = str.length();
        if (length > this.c - this.e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.a[this.e + i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I(char... cArr) {
        if (x()) {
            return false;
        }
        b();
        char c = this.a[this.e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J(char[] cArr) {
        b();
        if (!x() && Arrays.binarySearch(cArr, this.a[this.e]) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K() {
        if (x()) {
            return false;
        }
        char c = this.a[this.e];
        if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean L() {
        char c;
        if (x() || (c = this.a[this.e]) < '0' || c > '9') {
            return false;
        }
        return true;
    }

    boolean M(String str) {
        b();
        int length = str.length();
        if (length > this.c - this.e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.a[this.e + i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N() {
        if (x()) {
            return false;
        }
        char c = this.a[this.e];
        if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c))) {
            return false;
        }
        return true;
    }

    int O(char c) {
        b();
        for (int i = this.e; i < this.c; i++) {
            if (c == this.a[i]) {
                return i - this.e;
            }
        }
        return -1;
    }

    int P(CharSequence charSequence) {
        b();
        char charAt = charSequence.charAt(0);
        int i = this.e;
        while (i < this.c) {
            if (charAt != this.a[i]) {
                do {
                    i++;
                    if (i >= this.c) {
                        break;
                    }
                } while (charAt != this.a[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.a[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.e;
                }
            }
            i = i2;
        }
        return -1;
    }

    public int Q() {
        return this.f + this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S() {
        int i = this.g;
        if (i != -1) {
            this.e = i;
            W();
            return;
        }
        throw new UncheckedIOException(new IOException("Mark invalid"));
    }

    public void U(boolean z) {
        if (z && this.i == null) {
            this.i = new ArrayList<>(409);
            T();
        } else if (!z) {
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        int i = this.e;
        if (i >= 1) {
            this.e = i - 1;
            return;
        }
        throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W() {
        this.g = -1;
    }

    public void a() {
        this.e++;
    }

    public void d() {
        Reader reader = this.b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.b = null;
            this.a = null;
            this.h = null;
            throw th;
        }
        this.b = null;
        this.a = null;
        this.h = null;
    }

    public int e() {
        return f(Q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f(int i) {
        if (!z()) {
            return i + 1;
        }
        int A = A(i);
        if (A == -1) {
            return i + 1;
        }
        return (i - this.i.get(A).intValue()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char g() {
        char c;
        b();
        if (y()) {
            c = 65535;
        } else {
            c = this.a[this.e];
        }
        this.e++;
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h(boolean z) {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                } else if (c == '\'') {
                    if (z) {
                        break;
                    }
                } else {
                    continue;
                    i3++;
                }
            }
            if (!z) {
                break;
            }
            i3++;
        }
        this.e = i3;
        if (i3 > i) {
            return c(this.a, this.h, i, i3 - i);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.e = i3;
        if (i3 > i) {
            return c(this.a, this.h, i, i3 - i);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String j() {
        int i;
        char c;
        b();
        int i2 = this.e;
        while (true) {
            i = this.e;
            if (i >= this.c || (c = this.a[i]) < '0' || c > '9') {
                break;
            }
            this.e = i + 1;
        }
        return c(this.a, this.h, i2, i - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        int i;
        char c;
        b();
        int i2 = this.e;
        while (true) {
            i = this.e;
            if (i >= this.c || (((c = this.a[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.e = i + 1;
        }
        return c(this.a, this.h, i2, i - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String l() {
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 >= this.c || (((c = this.a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        return c(this.a, this.h, i, this.e - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String m() {
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 >= this.c || (((c = this.a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        while (!y()) {
            char[] cArr = this.a;
            int i3 = this.e;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.e = i3 + 1;
        }
        return c(this.a, this.h, i, this.e - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String n() {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.e = i3;
        if (i3 > i) {
            return c(this.a, this.h, i, i3 - i);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String o() {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.e = i3;
        if (i3 > i) {
            return c(this.a, this.h, i, i3 - i);
        }
        return "";
    }

    public String p(char c) {
        int O = O(c);
        if (O != -1) {
            String c2 = c(this.a, this.h, this.e, O);
            this.e += O;
            return c2;
        }
        return t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String q(String str) {
        int P = P(str);
        if (P != -1) {
            String c = c(this.a, this.h, this.e, P);
            this.e += P;
            return c;
        } else if (this.c - this.e < str.length()) {
            return t();
        } else {
            int length = (this.c - str.length()) + 1;
            char[] cArr = this.a;
            String[] strArr = this.h;
            int i = this.e;
            String c2 = c(cArr, strArr, i, length - i);
            this.e = length;
            return c2;
        }
    }

    public String r(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.e = i3;
        if (i3 > i) {
            return c(this.a, this.h, i, i3 - i);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String s(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.e = i3;
        if (i3 > i) {
            return c(this.a, this.h, i, i3 - i);
        }
        return "";
    }

    String t() {
        b();
        char[] cArr = this.a;
        String[] strArr = this.h;
        int i = this.e;
        String c = c(cArr, strArr, i, this.c - i);
        this.e = this.c;
        return c;
    }

    public String toString() {
        int i = this.c;
        int i2 = this.e;
        if (i - i2 < 0) {
            return "";
        }
        return new String(this.a, i2, i - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(String str) {
        boolean z = false;
        int i = -1;
        if (str.equals(this.l)) {
            int i2 = this.m;
            if (i2 == -1) {
                return false;
            }
            if (i2 >= this.e) {
                return true;
            }
        }
        this.l = str;
        Locale locale = Locale.ENGLISH;
        int P = P(str.toLowerCase(locale));
        if (P > -1) {
            this.m = this.e + P;
            return true;
        }
        int P2 = P(str.toUpperCase(locale));
        if (P2 > -1) {
            z = true;
        }
        if (z) {
            i = this.e + P2;
        }
        this.m = i;
        return z;
    }

    public char v() {
        b();
        if (y()) {
            return (char) 65535;
        }
        return this.a[this.e];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String w() {
        return B() + ":" + e();
    }

    public boolean x() {
        b();
        if (this.e >= this.c) {
            return true;
        }
        return false;
    }

    public boolean z() {
        if (this.i != null) {
            return true;
        }
        return false;
    }

    public lw0(Reader reader) {
        this(reader, 32768);
    }

    public lw0(String str) {
        this(new StringReader(str), str.length());
    }
}
