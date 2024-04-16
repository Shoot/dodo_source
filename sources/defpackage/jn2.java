package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: DeAddressFormatterImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Ljn2;", "Lh8;", "Lw6;", "address", "", DateTokenConverter.CONVERTER_KEY, "b", c.a, "a", "Lec9;", "Lec9;", "streetRegex", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jn2  reason: default package */
/* loaded from: classes4.dex */
public final class jn2 implements h8 {
    private final ec9 a = new ec9("^(.*), (\\d+) (.*)$");

    private final String d(w6 w6Var) {
        CharSequence R0;
        ec9 ec9Var = this.a;
        String c = w6Var.n().c();
        z65.g(c, "getStreetName(...)");
        if (ec9Var.a(c)) {
            ec9 ec9Var2 = this.a;
            String c2 = w6Var.n().c();
            z65.g(c2, "getStreetName(...)");
            String k = w6Var.k();
            return ec9Var2.i(c2, "$1 " + k + ", $2 $3");
        }
        String c3 = w6Var.n().c();
        String k2 = w6Var.k();
        R0 = m0b.R0(c3 + " " + k2);
        return R0.toString();
    }

    @Override // defpackage.h8
    public String a(w6 w6Var) {
        z65.h(w6Var, "address");
        return d(w6Var);
    }

    @Override // defpackage.h8
    public String b(w6 w6Var) {
        z65.h(w6Var, "address");
        StringBuilder sb = new StringBuilder();
        sb.append(d(w6Var));
        z65.g(sb, "append(...)");
        String sb2 = g9.a(sb, w6Var.f()).toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // defpackage.h8
    public String c(w6 w6Var) {
        z65.h(w6Var, "address");
        return d(w6Var);
    }
}
