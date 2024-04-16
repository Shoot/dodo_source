package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Font.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0003\u0010\u001b\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R#\u0010\u0016\u001a\u00020\u00148\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00178\u0007¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR)\u0010\u001f\u001a\u00020\u001c8WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\n\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lxj9;", "Lq24;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "I", DateTokenConverter.CONVERTER_KEY, "()I", "resId", "Lv34;", "b", "Lv34;", "()Lv34;", "weight", "Lq34;", c.a, "style", "Lu34;", "Lu34;", e.a, "()Lu34;", "variationSettings", "Li34;", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "loadingStrategy", "<init>", "(ILv34;ILu34;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xj9  reason: default package */
/* loaded from: classes.dex */
public final class xj9 implements q24 {
    private final int a;
    private final v34 b;
    private final int c;
    private final u34 d;
    private final int e;

    public /* synthetic */ xj9(int i, v34 v34Var, int i2, u34 u34Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, v34Var, i2, u34Var, i3);
    }

    @Override // defpackage.q24
    public int a() {
        return this.e;
    }

    @Override // defpackage.q24
    public v34 b() {
        return this.b;
    }

    @Override // defpackage.q24
    public int c() {
        return this.c;
    }

    public final int d() {
        return this.a;
    }

    public final u34 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj9)) {
            return false;
        }
        xj9 xj9Var = (xj9) obj;
        if (this.a == xj9Var.a && z65.c(b(), xj9Var.b()) && q34.f(c(), xj9Var.c()) && z65.c(this.d, xj9Var.d) && i34.e(a(), xj9Var.a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a * 31) + b().hashCode()) * 31) + q34.g(c())) * 31) + i34.f(a())) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + b() + ", style=" + ((Object) q34.h(c())) + ", loadingStrategy=" + ((Object) i34.g(a())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private xj9(int i, v34 v34Var, int i2, u34 u34Var, int i3) {
        z65.h(v34Var, "weight");
        z65.h(u34Var, "variationSettings");
        this.a = i;
        this.b = v34Var;
        this.c = i2;
        this.d = u34Var;
        this.e = i3;
    }
}
