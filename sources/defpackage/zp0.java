package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CardType.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000ej\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u0007j\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lzp0;", "", "Lwp0;", "", "toString", "a", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "title", "getCode", "code", "", "U", "()I", "numberLength", "O", "cvvLength", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "l", Image.TYPE_MEDIUM, "n", "o", "p", "q", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zp0  reason: default package */
/* loaded from: classes2.dex */
public final class zp0 implements wp0 {
    public static final a b;
    private static final Map<Pair<String, String>, wp0> c;
    private static int d;
    public static final zp0 e;
    public static final zp0 f;
    public static final zp0 g;
    public static final zp0 h;
    public static final zp0 i;
    public static final zp0 j;
    public static final zp0 k;
    public static final zp0 l;
    public static final zp0 m;
    public static final zp0 n;
    public static final zp0 o;
    public static final zp0 p;
    public static final zp0 q;
    private static final /* synthetic */ zp0[] r;
    private static final /* synthetic */ kj3 s;
    private final String a;

    /* compiled from: CardType.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002R/\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lzp0$a;", "", "", "intervalStart", "intervalEnd", "Lkotlin/Pair;", c.a, "", "Lwp0;", "intervalLookup", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "", "minDigits", "I", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zp0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Pair<String, String> c(String str, String str2) {
            return new Pair<>(str, str2);
        }

        static /* synthetic */ Pair d(a aVar, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = str;
            }
            return aVar.c(str, str2);
        }

        public final Map<Pair<String, String>, wp0> b() {
            return zp0.c;
        }
    }

    /* compiled from: CardType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zp0$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[zp0.values().length];
            try {
                iArr[zp0.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zp0.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zp0.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zp0.h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[zp0.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[zp0.j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[zp0.m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[zp0.n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[zp0.o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[zp0.q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[zp0.l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[zp0.k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[zp0.p.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int e2;
        int e3;
        zp0 zp0Var = new zp0("AMEX", 0, "AmEx");
        e = zp0Var;
        zp0 zp0Var2 = new zp0("DINERSCLUB", 1, "DinersClub");
        f = zp0Var2;
        zp0 zp0Var3 = new zp0("DISCOVER", 2, "Discover");
        g = zp0Var3;
        zp0 zp0Var4 = new zp0("JCB", 3, "JCB");
        h = zp0Var4;
        zp0 zp0Var5 = new zp0("MASTERCARD", 4, "MasterCard");
        i = zp0Var5;
        zp0 zp0Var6 = new zp0("VISA", 5, "Visa");
        j = zp0Var6;
        zp0 zp0Var7 = new zp0("MAESTRO", 6, "Maestro");
        k = zp0Var7;
        zp0 zp0Var8 = new zp0("MIR", 7, "Mir");
        l = zp0Var8;
        zp0 zp0Var9 = new zp0("BELCARD", 8, "BelCard");
        m = zp0Var9;
        zp0 zp0Var10 = new zp0("UZCARD", 9, "UzCard");
        n = zp0Var10;
        zp0 zp0Var11 = new zp0("HUMO", 10, "Humo");
        o = zp0Var11;
        p = new zp0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 11, "Unknown");
        q = new zp0("INSUFFICIENT_DIGITS", 12, "More digits required");
        zp0[] a2 = a();
        r = a2;
        s = lj3.a(a2);
        a aVar = new a(null);
        b = aVar;
        HashMap hashMap = new HashMap();
        c = hashMap;
        d = 1;
        hashMap.put(aVar.c("2221", "2720"), zp0Var5);
        hashMap.put(aVar.c("300", "305"), zp0Var2);
        hashMap.put(a.d(aVar, "309", null, 2, null), zp0Var2);
        hashMap.put(a.d(aVar, "34", null, 2, null), zp0Var);
        hashMap.put(aVar.c("3528", "3589"), zp0Var4);
        hashMap.put(a.d(aVar, "36", null, 2, null), zp0Var2);
        hashMap.put(a.d(aVar, "37", null, 2, null), zp0Var);
        hashMap.put(aVar.c("38", "39"), zp0Var2);
        hashMap.put(a.d(aVar, "4", null, 2, null), zp0Var6);
        hashMap.put(a.d(aVar, "50", null, 2, null), zp0Var7);
        hashMap.put(aVar.c("51", "55"), zp0Var5);
        hashMap.put(aVar.c("56", "59"), zp0Var7);
        hashMap.put(a.d(aVar, "6011", null, 2, null), zp0Var3);
        hashMap.put(a.d(aVar, "61", null, 2, null), zp0Var7);
        hashMap.put(a.d(aVar, "62", null, 2, null), zp0Var3);
        hashMap.put(a.d(aVar, "63", null, 2, null), zp0Var7);
        hashMap.put(aVar.c("644", "649"), zp0Var3);
        hashMap.put(a.d(aVar, "65", null, 2, null), zp0Var3);
        hashMap.put(aVar.c("66", "69"), zp0Var7);
        hashMap.put(a.d(aVar, "88", null, 2, null), zp0Var3);
        hashMap.put(aVar.c("2200", "2204"), zp0Var8);
        hashMap.put(a.d(aVar, "9112", null, 2, null), zp0Var9);
        hashMap.put(a.d(aVar, "8600", null, 2, null), zp0Var10);
        hashMap.put(a.d(aVar, "9860", null, 2, null), zp0Var11);
        for (Map.Entry entry : hashMap.entrySet()) {
            Pair pair = (Pair) entry.getKey();
            e2 = i.e(d, ((String) pair.c()).length());
            d = e2;
            e3 = i.e(e2, ((String) pair.d()).length());
            d = e3;
        }
    }

    private zp0(String str, int i2, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ zp0[] a() {
        return new zp0[]{e, f, g, h, i, j, k, l, m, n, o, p, q};
    }

    public static zp0 valueOf(String str) {
        return (zp0) Enum.valueOf(zp0.class, str);
    }

    public static zp0[] values() {
        return (zp0[]) r.clone();
    }

    @Override // defpackage.wp0
    public int O() {
        switch (b.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return 4;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
            case 12:
                return 3;
            case 8:
            case 9:
                return 0;
            case 10:
            case 13:
                return -1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // defpackage.wp0
    public int U() {
        switch (b.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return 15;
            case 2:
                return 14;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return 16;
            case 10:
                return d;
            case 11:
            case 12:
            case 13:
                return -1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // defpackage.wp0
    public String getCode() {
        return name();
    }

    public String k() {
        return this.a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return k();
    }
}
