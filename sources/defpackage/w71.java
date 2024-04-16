package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CipherSuite.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lw71;", "", "", "toString", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "javaName", "<init>", "(Ljava/lang/String;)V", "b", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: w71  reason: default package */
/* loaded from: classes3.dex */
public final class w71 {
    public static final w71 A;
    public static final w71 A0;
    public static final w71 B;
    public static final w71 B0;
    public static final w71 C;
    public static final w71 C0;
    public static final w71 D;
    public static final w71 D0;
    public static final w71 E;
    public static final w71 E0;
    public static final w71 F;
    public static final w71 F0;
    public static final w71 G;
    public static final w71 G0;
    public static final w71 H;
    public static final w71 H0;
    public static final w71 I;
    public static final w71 I0;
    public static final w71 J;
    public static final w71 J0;
    public static final w71 K;
    public static final w71 K0;
    public static final w71 L;
    public static final w71 L0;
    public static final w71 M;
    public static final w71 M0;
    public static final w71 N;
    public static final w71 N0;
    public static final w71 O;
    public static final w71 O0;
    public static final w71 P;
    public static final w71 P0;
    public static final w71 Q;
    public static final w71 Q0;
    public static final w71 R;
    public static final w71 R0;
    public static final w71 S;
    public static final w71 S0;
    public static final w71 T;
    public static final w71 T0;
    public static final w71 U;
    public static final w71 U0;
    public static final w71 V;
    public static final w71 V0;
    public static final w71 W;
    public static final w71 W0;
    public static final w71 X;
    public static final w71 X0;
    public static final w71 Y;
    public static final w71 Y0;
    public static final w71 Z;
    public static final w71 Z0;
    public static final w71 a0;
    public static final w71 a1;
    public static final b b;
    public static final w71 b0;
    public static final w71 b1;
    private static final Comparator<String> c;
    public static final w71 c0;
    public static final w71 c1;
    private static final Map<String, w71> d;
    public static final w71 d0;
    public static final w71 d1;
    public static final w71 e;
    public static final w71 e0;
    public static final w71 e1;
    public static final w71 f;
    public static final w71 f0;
    public static final w71 f1;
    public static final w71 g;
    public static final w71 g0;
    public static final w71 g1;
    public static final w71 h;
    public static final w71 h0;
    public static final w71 h1;
    public static final w71 i;
    public static final w71 i0;
    public static final w71 i1;
    public static final w71 j;
    public static final w71 j0;
    public static final w71 j1;
    public static final w71 k;
    public static final w71 k0;
    public static final w71 k1;
    public static final w71 l;
    public static final w71 l0;
    public static final w71 l1;
    public static final w71 m;
    public static final w71 m0;
    public static final w71 m1;
    public static final w71 n;
    public static final w71 n0;
    public static final w71 n1;
    public static final w71 o;
    public static final w71 o0;
    public static final w71 o1;
    public static final w71 p;
    public static final w71 p0;
    public static final w71 p1;
    public static final w71 q;
    public static final w71 q0;
    public static final w71 q1;
    public static final w71 r;
    public static final w71 r0;
    public static final w71 r1;
    public static final w71 s;
    public static final w71 s0;
    public static final w71 s1;
    public static final w71 t;
    public static final w71 t0;
    public static final w71 u;
    public static final w71 u0;
    public static final w71 v;
    public static final w71 v0;
    public static final w71 w;
    public static final w71 w0;
    public static final w71 x;
    public static final w71 x0;
    public static final w71 y;
    public static final w71 y0;
    public static final w71 z;
    public static final w71 z0;
    private final String a;

    /* compiled from: CipherSuite.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u0018\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"w71$a", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "a", "b", "", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w71$a */
    /* loaded from: classes3.dex */
    public static final class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            z65.h(str, "a");
            z65.h(str2, "b");
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    if (z65.j(charAt, charAt2) < 0) {
                        return -1;
                    }
                    return 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                if (length < length2) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }

    /* compiled from: CipherSuite.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b}\b\u0086\u0003\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0014\u0010 \u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0014\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0014R\u0014\u0010\"\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\u0014\u0010#\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0014\u0010$\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0014R\u0014\u0010%\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0014R\u0014\u0010&\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0014R\u0014\u0010'\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0014R\u0014\u0010(\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0014R\u0014\u0010)\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0014R\u0014\u0010*\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0014R\u0014\u0010+\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0014R\u0014\u0010,\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0014R\u0014\u0010-\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0014R\u0014\u0010.\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0014R\u0014\u0010/\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0014R\u0014\u00100\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0014R\u0014\u00101\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0014R\u0014\u00102\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0014R\u0014\u00103\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0014R\u0014\u00104\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0014R\u0014\u00105\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0014R\u0014\u00106\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0014R\u0014\u00107\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0014R\u0014\u00108\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0014R\u0014\u00109\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0014R\u0014\u0010:\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0014R\u0014\u0010;\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0014R\u0014\u0010<\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0014R\u0014\u0010=\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0014R\u0014\u0010>\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0014R\u0014\u0010?\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0014R\u0014\u0010@\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0014R\u0014\u0010A\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0014R\u0014\u0010B\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0014R\u0014\u0010C\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0014R\u0014\u0010D\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0014R\u0014\u0010E\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0014R\u0014\u0010F\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0014R\u0014\u0010G\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0014R\u0014\u0010H\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0014R\u0014\u0010I\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0014R\u0014\u0010J\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0014R\u0014\u0010K\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0014R\u0014\u0010L\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0014R\u0014\u0010M\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0014R\u0014\u0010N\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0014R\u0014\u0010O\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0014R\u0014\u0010P\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0014R\u0014\u0010Q\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0014R\u0014\u0010R\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0014R\u0014\u0010S\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0014R\u0014\u0010T\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0014R\u0014\u0010U\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0014R\u0014\u0010V\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0014R\u0014\u0010W\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0014R\u0014\u0010X\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0014R\u0014\u0010Y\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0014R\u0014\u0010Z\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0014R\u0014\u0010[\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0014R\u0014\u0010\\\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0014R\u0014\u0010]\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0014R\u0014\u0010^\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0014R\u0014\u0010_\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0014R\u0014\u0010`\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0014R\u0014\u0010a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0014R\u0014\u0010b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0014R\u0014\u0010c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0014R\u0014\u0010d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0014R\u0014\u0010e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010\u0014R\u0014\u0010f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0014R\u0014\u0010g\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0014R\u0014\u0010h\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0014R\u0014\u0010i\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0014R\u0014\u0010j\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0014R\u0014\u0010k\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0014R\u0014\u0010l\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0014R\u0014\u0010m\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010\u0014R\u0014\u0010n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0014R\u0014\u0010o\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010\u0014R\u0014\u0010p\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0014R\u0014\u0010q\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0014R\u0014\u0010r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010\u0014R\u0014\u0010s\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0014R\u0014\u0010t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0014R\u0014\u0010u\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010\u0014R\u0014\u0010v\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0014R\u0014\u0010w\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0014R\u0014\u0010x\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0014R\u0014\u0010y\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010\u0014R\u0014\u0010z\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0014R\u0014\u0010{\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010\u0014R\u0014\u0010|\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0014R\u0014\u0010}\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010\u0014R\u0014\u0010~\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0014R\u0014\u0010\u007f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\u0014R\u0016\u0010\u0080\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0014R\u0016\u0010\u0081\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0014R\u0016\u0010\u0082\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0014R\u0016\u0010\u0083\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0014R\u0016\u0010\u0084\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0014R\u0016\u0010\u0085\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0014R\u0016\u0010\u0086\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0014R\u0016\u0010\u0087\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0014R\u0016\u0010\u0088\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0014R\u0016\u0010\u0089\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u0014R\u0016\u0010\u008a\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u0014¨\u0006\u008d\u0001"}, d2 = {"Lw71$b;", "", "", "javaName", e.a, "", "value", "Lw71;", DateTokenConverter.CONVERTER_KEY, "b", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ORDER_BY_NAME", "Ljava/util/Comparator;", c.a, "()Ljava/util/Comparator;", "", "INSTANCES", "Ljava/util/Map;", "TLS_AES_128_CCM_8_SHA256", "Lw71;", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w71$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final w71 d(String str, int i) {
            w71 w71Var = new w71(str, null);
            w71.d.put(str, w71Var);
            return w71Var;
        }

        private final String e(String str) {
            boolean J;
            boolean J2;
            J = l0b.J(str, "TLS_", false, 2, null);
            if (!J) {
                J2 = l0b.J(str, "SSL_", false, 2, null);
                if (J2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("TLS_");
                    String substring = str.substring(4);
                    z65.g(substring, "substring(...)");
                    sb.append(substring);
                    return sb.toString();
                }
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SSL_");
            String substring2 = str.substring(4);
            z65.g(substring2, "substring(...)");
            sb2.append(substring2);
            return sb2.toString();
        }

        public final synchronized w71 b(String str) {
            w71 w71Var;
            try {
                z65.h(str, "javaName");
                w71Var = (w71) w71.d.get(str);
                if (w71Var == null) {
                    w71Var = (w71) w71.d.get(e(str));
                    if (w71Var == null) {
                        w71Var = new w71(str, null);
                    }
                    w71.d.put(str, w71Var);
                }
            } catch (Throwable th) {
                throw th;
            }
            return w71Var;
        }

        public final Comparator<String> c() {
            return w71.c;
        }
    }

    static {
        b bVar = new b(null);
        b = bVar;
        c = new a();
        d = new LinkedHashMap();
        e = bVar.d("SSL_RSA_WITH_NULL_MD5", 1);
        f = bVar.d("SSL_RSA_WITH_NULL_SHA", 2);
        g = bVar.d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        h = bVar.d("SSL_RSA_WITH_RC4_128_MD5", 4);
        i = bVar.d("SSL_RSA_WITH_RC4_128_SHA", 5);
        j = bVar.d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        k = bVar.d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        l = bVar.d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        m = bVar.d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        n = bVar.d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        o = bVar.d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        p = bVar.d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        q = bVar.d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        r = bVar.d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        s = bVar.d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        t = bVar.d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        u = bVar.d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        v = bVar.d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        w = bVar.d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        x = bVar.d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        y = bVar.d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        z = bVar.d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        A = bVar.d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        B = bVar.d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        C = bVar.d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        D = bVar.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        E = bVar.d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        F = bVar.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        G = bVar.d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        H = bVar.d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        I = bVar.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        J = bVar.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        K = bVar.d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        L = bVar.d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        M = bVar.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        N = bVar.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        O = bVar.d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        P = bVar.d("TLS_RSA_WITH_NULL_SHA256", 59);
        Q = bVar.d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        R = bVar.d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        S = bVar.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        T = bVar.d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        U = bVar.d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        V = bVar.d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        W = bVar.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        X = bVar.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        Y = bVar.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        Z = bVar.d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        a0 = bVar.d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        b0 = bVar.d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        c0 = bVar.d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        d0 = bVar.d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", SyslogConstants.LOG_LOCAL1);
        e0 = bVar.d("TLS_PSK_WITH_RC4_128_SHA", 138);
        f0 = bVar.d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        g0 = bVar.d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        h0 = bVar.d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        i0 = bVar.d("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        j0 = bVar.d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        k0 = bVar.d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        l0 = bVar.d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m0 = bVar.d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        n0 = bVar.d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        o0 = bVar.d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        p0 = bVar.d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        q0 = bVar.d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        r0 = bVar.d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        s0 = bVar.d("TLS_FALLBACK_SCSV", 22016);
        t0 = bVar.d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        u0 = bVar.d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        v0 = bVar.d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        w0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        x0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        y0 = bVar.d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        z0 = bVar.d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        A0 = bVar.d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        B0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        C0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        D0 = bVar.d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        E0 = bVar.d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        F0 = bVar.d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        G0 = bVar.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        H0 = bVar.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        I0 = bVar.d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        J0 = bVar.d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        K0 = bVar.d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        L0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        M0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        N0 = bVar.d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        O0 = bVar.d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        P0 = bVar.d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        Q0 = bVar.d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        R0 = bVar.d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        S0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        T0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        U0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        V0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        W0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        X0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        Y0 = bVar.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        Z0 = bVar.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        a1 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        b1 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        c1 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        d1 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        e1 = bVar.d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f1 = bVar.d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        g1 = bVar.d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        h1 = bVar.d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        i1 = bVar.d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        j1 = bVar.d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        k1 = bVar.d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        l1 = bVar.d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        m1 = bVar.d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        n1 = bVar.d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        o1 = bVar.d("TLS_AES_128_GCM_SHA256", 4865);
        p1 = bVar.d("TLS_AES_256_GCM_SHA384", 4866);
        q1 = bVar.d("TLS_CHACHA20_POLY1305_SHA256", 4867);
        r1 = bVar.d("TLS_AES_128_CCM_SHA256", 4868);
        s1 = bVar.d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public /* synthetic */ w71(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String c() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    private w71(String str) {
        this.a = str;
    }
}
