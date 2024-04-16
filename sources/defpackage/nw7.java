package defpackage;

import com.dodopizza.persistence.entity.payment.CardEntity;
import defpackage.jw7;
import kotlin.Metadata;
/* compiled from: PaymentWayFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lnw7;", "", "Lft7;", "paymentMethod", "Ljw7;", "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nw7  reason: default package */
/* loaded from: classes2.dex */
public final class nw7 {
    public static final nw7 a = new nw7();

    /* compiled from: PaymentWayFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nw7$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[du7.values().length];
            try {
                iArr[du7.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[du7.k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[du7.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[du7.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[du7.h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[du7.l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[du7.m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[du7.n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[du7.o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private nw7() {
    }

    public final jw7 a(ft7 ft7Var) {
        String str;
        String str2;
        String str3;
        z65.h(ft7Var, "paymentMethod");
        p60 p60Var = null;
        String str4 = "";
        switch (a.$EnumSwitchMapping$0[ft7Var.g().ordinal()]) {
            case 1:
                String e = ft7Var.e();
                String a2 = ft7Var.a();
                if (a2 == null) {
                    str = "";
                } else {
                    str = a2;
                }
                return new jw7.b(e, str, ft7Var.f(), ft7Var.h(), ft7Var.i());
            case 2:
                String e2 = ft7Var.e();
                String a3 = ft7Var.a();
                z65.e(a3);
                dt7 f = ft7Var.f();
                int h = ft7Var.h();
                CardEntity c = ft7Var.c();
                if (c != null) {
                    p60Var = sw7.b(c);
                }
                return new jw7.g(e2, a3, f, h, p60Var);
            case 3:
                return new jw7.c(ft7Var.e(), ft7Var.h());
            case 4:
                return new jw7.j(ft7Var.e(), ft7Var.h());
            case 5:
                String e3 = ft7Var.e();
                String a4 = ft7Var.a();
                if (a4 != null) {
                    str4 = a4;
                }
                int h2 = ft7Var.h();
                wg4 d = ft7Var.d();
                if (d == null) {
                    d = new wg4(null, null, 3, null);
                }
                return new jw7.e(e3, str4, h2, d);
            case 6:
                return new jw7.f(ft7Var.e(), ft7Var.h());
            case 7:
                String e4 = ft7Var.e();
                String a5 = ft7Var.a();
                if (a5 != null) {
                    str4 = a5;
                }
                return new jw7.h(e4, str4, ft7Var.f(), ft7Var.h());
            case 8:
                String e5 = ft7Var.e();
                String a6 = ft7Var.a();
                if (a6 == null) {
                    str2 = "";
                } else {
                    str2 = a6;
                }
                return new jw7.a(e5, str2, qf0.a(ft7Var.b()), ft7Var.f(), ft7Var.h());
            case 9:
                String e6 = ft7Var.e();
                String a7 = ft7Var.a();
                if (a7 == null) {
                    str3 = "";
                } else {
                    str3 = a7;
                }
                return new jw7.i(e6, str3, qf0.a(ft7Var.b()), ft7Var.f(), ft7Var.h());
            default:
                du7 g = ft7Var.g();
                throw new IllegalArgumentException("Wrong payment type " + g);
        }
    }
}
