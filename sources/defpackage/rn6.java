package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.math.BigDecimal;
import kotlin.Metadata;
/* compiled from: Money.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0014\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002\u001a\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0086\u0002\u001a\u0015\u0010\f\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002\"\u001c\u0010\u000f\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0005"}, d2 = {"", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lhn6;", "money", "f", "amount", e.a, DateTokenConverter.CONVERTER_KEY, "", "g", c.a, "a", "Ljava/math/BigDecimal;", "zero"}, k = 2, mv = {1, 4, 2})
/* renamed from: rn6  reason: default package */
/* loaded from: classes.dex */
public final class rn6 {
    private static final BigDecimal a = BigDecimal.valueOf(0L).setScale(2);

    public static final /* synthetic */ BigDecimal a() {
        return a;
    }

    public static final /* synthetic */ BigDecimal b(double d) {
        return h(d);
    }

    public static final int c(hn6 hn6Var, hn6 hn6Var2) {
        z65.h(hn6Var, "$this$compareTo");
        z65.h(hn6Var2, "money");
        return hn6Var.b().compareTo(hn6Var2.b());
    }

    public static final hn6 d(hn6 hn6Var, hn6 hn6Var2) {
        z65.h(hn6Var, "$this$minus");
        z65.h(hn6Var2, "money");
        BigDecimal subtract = hn6Var.b().subtract(hn6Var2.b());
        z65.g(subtract, "this.subtract(other)");
        return new hn6(subtract.doubleValue(), hn6Var.c());
    }

    public static final hn6 e(hn6 hn6Var, double d) {
        z65.h(hn6Var, "$this$plus");
        BigDecimal valueOf = BigDecimal.valueOf(d);
        z65.g(valueOf, "BigDecimal.valueOf(amount)");
        BigDecimal add = valueOf.add(hn6Var.b());
        z65.g(add, "this.add(other)");
        return new hn6(add.doubleValue(), hn6Var.c());
    }

    public static final hn6 f(hn6 hn6Var, hn6 hn6Var2) {
        z65.h(hn6Var, "$this$plus");
        z65.h(hn6Var2, "money");
        BigDecimal add = hn6Var2.b().add(hn6Var.b());
        z65.g(add, "this.add(other)");
        return new hn6(add.doubleValue(), hn6Var.c());
    }

    public static final hn6 g(hn6 hn6Var, int i) {
        z65.h(hn6Var, "$this$times");
        BigDecimal b = hn6Var.b();
        BigDecimal valueOf = BigDecimal.valueOf(i);
        z65.g(valueOf, "BigDecimal.valueOf(this.toLong())");
        BigDecimal multiply = b.multiply(valueOf);
        z65.g(multiply, "this.multiply(other)");
        return new hn6(multiply.doubleValue(), hn6Var.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal h(double d) {
        return BigDecimal.valueOf(d).setScale(2, 1);
    }
}
