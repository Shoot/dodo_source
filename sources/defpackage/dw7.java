package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: PaymentScenarioFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Ldw7;", "Lcw7;", "Lys7;", "paymentData", "Lpp0;", "b", c.a, DateTokenConverter.CONVERTER_KEY, "Lkotlin/Pair;", "", e.a, "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dw7  reason: default package */
/* loaded from: classes2.dex */
public final class dw7 implements cw7 {
    public static final dw7 a = new dw7();

    /* compiled from: PaymentScenarioFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dw7$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[du7.values().length];
            try {
                iArr[du7.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[du7.m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[du7.n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[du7.j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[du7.k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[du7.l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[du7.o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private dw7() {
    }

    private final pp0 b(ys7 ys7Var) {
        Pair<String, String> e = e(ys7Var);
        String a2 = e.a();
        String b = e.b();
        String e2 = ys7Var.e();
        String str = "";
        if (e2 == null) {
            e2 = "";
        }
        String d = ys7Var.d();
        if (d != null) {
            str = d;
        }
        return new ch4(a2, b, e2, str);
    }

    private final pp0 c(ys7 ys7Var) {
        pp0 lu6Var;
        String str;
        String str2;
        String str3;
        String str4 = "";
        if (ys7Var.o()) {
            if (ys7Var.n()) {
                String l = ys7Var.l();
                if (l != null) {
                    str4 = l;
                }
                lu6Var = new ap2(str4);
            } else {
                long f = ys7Var.f();
                String m = ys7Var.m();
                if (m == null) {
                    str = "";
                } else {
                    str = m;
                }
                String c = ys7Var.c();
                if (c == null) {
                    str2 = "";
                } else {
                    str2 = c;
                }
                String l2 = ys7Var.l();
                if (l2 == null) {
                    str3 = "";
                } else {
                    str3 = l2;
                }
                lu6Var = new j4c(f, str, str2, str3);
            }
        } else {
            long f2 = ys7Var.f();
            String b = ys7Var.b();
            if (b == null) {
                b = "";
            }
            String k = ys7Var.k();
            if (k != null) {
                str4 = k;
            }
            lu6Var = new lu6(f2, b, str4);
        }
        return lu6Var;
    }

    private final pp0 d(ys7 ys7Var) {
        String str;
        String str2;
        long f = ys7Var.f();
        String m = ys7Var.m();
        if (m == null) {
            str = "";
        } else {
            str = m;
        }
        String c = ys7Var.c();
        if (c == null) {
            str2 = "";
        } else {
            str2 = c;
        }
        String l = ys7Var.l();
        if (l == null) {
            l = "";
        }
        return new j4c(f, str, str2, l);
    }

    private final Pair<String, String> e(ys7 ys7Var) {
        String str;
        Map<String, String> j = ys7Var.j();
        String str2 = "";
        String str3 = (j == null || (str3 = j.get("googlePayGatewayMerchantId")) == null) ? "" : "";
        Map<String, String> j2 = ys7Var.j();
        if (j2 != null && (str = j2.get("gateway")) != null) {
            str2 = str;
        }
        return new Pair<>(str3, str2);
    }

    @Override // defpackage.cw7
    public pp0 a(ys7 ys7Var) {
        z65.h(ys7Var, "paymentData");
        switch (a.$EnumSwitchMapping$0[ys7Var.h().ordinal()]) {
            case 1:
                return b(ys7Var);
            case 2:
                return au9.a;
            case 3:
                return um.a;
            case 4:
                return c(ys7Var);
            case 5:
                return ht9.a;
            case 6:
                return d(ys7Var);
            case 7:
                return bv9.a;
            default:
                String a2 = ys7Var.a();
                iw7 i = ys7Var.i();
                throw new IllegalArgumentException("Acquirer " + a2 + " doesn't support payment type " + i);
        }
    }
}
