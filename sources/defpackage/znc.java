package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: znc  reason: default package */
/* loaded from: classes2.dex */
public final class znc implements bpc {
    private final Double a;

    public znc(Double d) {
        if (d == null) {
            this.a = Double.valueOf(Double.NaN);
        } else {
            this.a = d;
        }
    }

    @Override // defpackage.bpc
    public final bpc c() {
        return new znc(this.a);
    }

    @Override // defpackage.bpc
    public final Boolean d() {
        boolean z;
        if (!Double.isNaN(this.a.doubleValue()) && this.a.doubleValue() != 0.0d) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof znc)) {
            return false;
        }
        return this.a.equals(((znc) obj).a);
    }

    @Override // defpackage.bpc
    public final Double f() {
        return this.a;
    }

    @Override // defpackage.bpc
    public final String g() {
        BigDecimal stripTrailingZeros;
        int scale;
        if (Double.isNaN(this.a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.a.doubleValue())) {
            if (this.a.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.a.doubleValue());
        if (valueOf.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = valueOf.stripTrailingZeros();
        }
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    @Override // defpackage.bpc
    public final Iterator<bpc> h() {
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bpc
    public final bpc t(String str, xzc xzcVar, List<bpc> list) {
        if ("toString".equals(str)) {
            return new gpc(g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", g(), str));
    }

    public final String toString() {
        return g();
    }
}
