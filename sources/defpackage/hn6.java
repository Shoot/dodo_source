package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appsflyer.AppsFlyerProperties;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: Money.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0016¨\u0006\u001a"}, d2 = {"Lhn6;", "Ljava/io/Serializable;", "", e.a, DateTokenConverter.CONVERTER_KEY, "", "other", "equals", "", "hashCode", "Ljava/math/BigDecimal;", "a", "Lrn5;", "b", "()Ljava/math/BigDecimal;", "bigDecimalAmount", "", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", AppsFlyerProperties.CURRENCY_CODE, "", "()D", "amount", "<init>", "(DLjava/lang/String;)V", "money"}, k = 1, mv = {1, 4, 2})
/* renamed from: hn6  reason: default package */
/* loaded from: classes.dex */
public final class hn6 implements Serializable {
    private final rn5 a;
    private final String b;

    /* compiled from: Money.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "a", "()Ljava/math/BigDecimal;"}, k = 3, mv = {1, 4, 2})
    /* renamed from: hn6$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<BigDecimal> {
        final /* synthetic */ double a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(double d) {
            super(0);
            this.a = d;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final BigDecimal invoke() {
            return rn6.b(this.a);
        }
    }

    public hn6(double d, String str) {
        z65.h(str, AppsFlyerProperties.CURRENCY_CODE);
        this.b = str;
        this.a = xn5.b(new a(d));
    }

    public final double a() {
        return b().doubleValue();
    }

    public final BigDecimal b() {
        return (BigDecimal) this.a.getValue();
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return z65.c(b(), rn6.a());
    }

    public final boolean e() {
        if (b().compareTo(rn6.a()) > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!z65.c(hn6.class, cls)) {
            return false;
        }
        if (obj != null) {
            hn6 hn6Var = (hn6) obj;
            if (!(!z65.c(b(), hn6Var.b())) && !(!z65.c(this.b, hn6Var.b))) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.dodopizza.common.money.Money");
    }

    public int hashCode() {
        return (b().hashCode() * 31) + this.b.hashCode();
    }
}
