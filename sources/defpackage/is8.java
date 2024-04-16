package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.nr7;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import org.slf4j.Marker;
/* compiled from: PublicSuffixDatabase.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001\rB\u001d\b\u0000\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006$"}, d2 = {"Lis8;", "", "", "domain", "", "f", "domainLabels", "b", "", e.a, DateTokenConverter.CONVERTER_KEY, c.a, "Lnr7;", "a", "Lnr7;", "getPath", "()Lnr7;", "path", "Liu3;", "Liu3;", "getFileSystem", "()Liu3;", "fileSystem", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "<init>", "(Lnr7;Liu3;)V", "g", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: is8  reason: default package */
/* loaded from: classes3.dex */
public final class is8 {
    public static final a g = new a(null);
    public static final nr7 h = nr7.a.e(nr7.b, "/okhttp3/internal/publicsuffix/" + is8.class.getSimpleName() + ".gz", false, 1, null);
    private static final byte[] i = {42};
    private static final List<String> j;
    private static final is8 k;
    private final nr7 a;
    private final iu3 b;
    private final AtomicBoolean c;
    private final CountDownLatch d;
    private byte[] e;
    private byte[] f;

    /* compiled from: PublicSuffixDatabase.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lis8$a;", "", "", "", "labels", "", "labelIndex", "", "b", "([B[[BI)Ljava/lang/String;", "Lis8;", c.a, "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "Lnr7;", "PUBLIC_SUFFIX_RESOURCE", "Lnr7;", "WILDCARD_LABEL", "[B", "instance", "Lis8;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: is8$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            int b;
            boolean z;
            int b2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        b = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        b = zdc.b(bArr2[i8][i9], 255);
                        z = z3;
                    }
                    b2 = b - zdc.b(bArr[i5 + i10], 255);
                    if (b2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    } else if (bArr2[i8].length == i9) {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    } else {
                        z2 = z;
                    }
                }
                if (b2 >= 0) {
                    if (b2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                return new String(bArr, i5, i7, rw0.b);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }

        public final is8 c() {
            return is8.k;
        }
    }

    static {
        List<String> e;
        e = jc1.e(Marker.ANY_MARKER);
        j = e;
        k = new is8(null, null, 3, null);
    }

    public is8() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
        r4 = defpackage.m0b.x0(r8, new char[]{ch.qos.logback.core.CoreConstants.DOT}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ea, code lost:
        r1 = defpackage.m0b.x0(r5, new char[]{ch.qos.logback.core.CoreConstants.DOT}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.String> b(java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is8.b(java.util.List):java.util.List");
    }

    private final void d() throws IOException {
        try {
            fh0 c = c77.c(new zi4(this.b.q(this.a)));
            byte[] u0 = c.u0(c.readInt());
            byte[] u02 = c.u0(c.readInt());
            Unit unit = Unit.a;
            aa1.a(c, null);
            synchronized (this) {
                z65.e(u0);
                this.e = u0;
                z65.e(u02);
                this.f = u02;
            }
        } finally {
            this.d.countDown();
        }
    }

    private final void e() {
        boolean z = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    xb8.a.g().k("Failed to read public suffix list", 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> f(String str) {
        List<String> x0;
        Object k0;
        List<String> T;
        x0 = m0b.x0(str, new char[]{CoreConstants.DOT}, false, 0, 6, null);
        k0 = sc1.k0(x0);
        if (z65.c(k0, "")) {
            T = sc1.T(x0, 1);
            return T;
        }
        return x0;
    }

    public final String c(String str) {
        int size;
        int size2;
        Sequence P;
        Sequence i2;
        String p;
        z65.h(str, "domain");
        String unicode = IDN.toUnicode(str);
        z65.e(unicode);
        List<String> f = f(unicode);
        List<String> b = b(f);
        if (f.size() == b.size() && b.get(0).charAt(0) != '!') {
            return null;
        }
        if (b.get(0).charAt(0) == '!') {
            size = f.size();
            size2 = b.size();
        } else {
            size = f.size();
            size2 = b.size() + 1;
        }
        int i3 = size - size2;
        P = sc1.P(f(str));
        i2 = dca.i(P, i3);
        p = dca.p(i2, ".", null, null, 0, null, null, 62, null);
        return p;
    }

    public is8(nr7 nr7Var, iu3 iu3Var) {
        z65.h(nr7Var, "path");
        z65.h(iu3Var, "fileSystem");
        this.a = nr7Var;
        this.b = iu3Var;
        this.c = new AtomicBoolean(false);
        this.d = new CountDownLatch(1);
    }

    public /* synthetic */ is8(nr7 nr7Var, iu3 iu3Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? h : nr7Var, (i2 & 2) != 0 ? iu3.d : iu3Var);
    }
}
