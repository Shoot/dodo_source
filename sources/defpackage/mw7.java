package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.jw7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentWayDataResolver.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lmw7;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isCarryoutOrRestaurantMode", "", DateTokenConverter.CONVERTER_KEY, "Ljw7$g;", "paymentWay", "", c.a, "Ljw7$a;", "Lmw7$a;", "b", "Ljw7;", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mw7  reason: default package */
/* loaded from: classes4.dex */
public final class mw7 {
    public static final mw7 a = new mw7();

    /* compiled from: PaymentWayDataResolver.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001d"}, d2 = {"Lmw7$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "paymentName", "b", "I", "()I", "paymentIconId", c.a, "paymentIconVisibility", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "paymentIconTintId", e.a, "Z", "()Z", "isRedirectSaveCardEnabled", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mw7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private final String a;
        private final int b;
        private final int c;
        private final Integer d;
        private final boolean e;

        public a(String str, int i, int i2, Integer num, boolean z) {
            z65.h(str, "paymentName");
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = num;
            this.e = z;
        }

        public final int a() {
            return this.b;
        }

        public final Integer b() {
            return this.d;
        }

        public final int c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public final boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && z65.c(this.d, aVar.d) && this.e == aVar.e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31;
            Integer num = this.d;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + a91.a(this.e);
        }

        public String toString() {
            String str = this.a;
            int i = this.b;
            int i2 = this.c;
            Integer num = this.d;
            boolean z = this.e;
            return "PaymentWayViewData(paymentName=" + str + ", paymentIconId=" + i + ", paymentIconVisibility=" + i2 + ", paymentIconTintId=" + num + ", isRedirectSaveCardEnabled=" + z + ")";
        }

        public /* synthetic */ a(String str, int i, int i2, Integer num, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, num, (i3 & 16) != 0 ? false : z);
        }
    }

    /* compiled from: PaymentWayDataResolver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw7$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[pf0.values().length];
            try {
                iArr[pf0.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pf0.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private mw7() {
    }

    private final a b(jw7.a aVar, Context context) {
        a aVar2;
        int i = b.$EnumSwitchMapping$0[aVar.i().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return new a(aVar.a(), bx8.ic_card, 0, Integer.valueOf(ew8.A), false, 16, null);
            }
            String string = context.getString(r09.momo_pay_method);
            z65.g(string, "getString(...)");
            aVar2 = new a(string, bx8.ic_momo_square_pinkbg, 0, null, false, 16, null);
        } else {
            String string2 = context.getString(r09.kaspi_pay_method);
            z65.g(string2, "getString(...)");
            aVar2 = new a(string2, bx8.ic_kaspi_pay, 0, null, false, 16, null);
        }
        return aVar2;
    }

    private final int c(jw7.g gVar) {
        wp0 k = gVar.k();
        if (k != null && xp0.a(k) == 0) {
            return 8;
        }
        return 0;
    }

    private final String d(Context context, boolean z) {
        int i;
        if (z) {
            i = r09.checkout_payment_title_terminal_to_carryout;
        } else {
            i = r09.checkout_payment_title_terminal_to_courier;
        }
        String string = context.getString(i);
        z65.g(string, "getString(...)");
        return string;
    }

    public final a a(Context context, jw7 jw7Var, boolean z) {
        int i;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(jw7Var, "paymentWay");
        if (jw7Var instanceof jw7.b) {
            String string = context.getString(r09.by_bank_card);
            z65.g(string, "getString(...)");
            return new a(string, bx8.ic_card, 0, Integer.valueOf(ew8.A), jw7Var.f());
        } else if (jw7Var instanceof jw7.g) {
            jw7.g gVar = (jw7.g) jw7Var;
            String j = gVar.j();
            wp0 k = gVar.k();
            if (k != null) {
                i = xp0.a(k);
            } else {
                i = 0;
            }
            return new a(j, i, c(gVar), null, false, 16, null);
        } else if (jw7Var instanceof jw7.j) {
            return new a(d(context, z), bx8.ic_card, 8, Integer.valueOf(ew8.A), false, 16, null);
        } else {
            if (jw7Var instanceof jw7.c) {
                String string2 = context.getString(r09.checkout_in_cash_to_courier);
                z65.g(string2, "getString(...)");
                return new a(string2, bx8.ic_cash, 8, Integer.valueOf(ew8.A), false, 16, null);
            } else if (jw7Var instanceof jw7.e) {
                String string3 = context.getString(r09.google_pay);
                z65.g(string3, "getString(...)");
                return new a(string3, bx8.ic_google_pay, 0, null, false, 16, null);
            } else if (jw7Var instanceof jw7.f) {
                String string4 = context.getString(r09.paypal_method);
                z65.g(string4, "getString(...)");
                return new a(string4, bx8.ic_bankcard_paypal, 0, null, false, 16, null);
            } else if (jw7Var instanceof jw7.h) {
                String string5 = context.getString(r09.sber_pay_method);
                z65.g(string5, "getString(...)");
                return new a(string5, bx8.ic_sber_pay, 0, null, false, 16, null);
            } else if (jw7Var instanceof jw7.i) {
                String string6 = context.getString(r09.by_sbp_pay_method);
                z65.g(string6, "getString(...)");
                return new a(string6, bx8.ic_sbp, 0, null, false, 16, null);
            } else if (jw7Var instanceof jw7.a) {
                return b((jw7.a) jw7Var, context);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
