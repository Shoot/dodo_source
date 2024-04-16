package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: AddressFormatterImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lj8;", "Lh8;", "Lw6;", "address", "", "b", c.a, "a", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j8  reason: default package */
/* loaded from: classes4.dex */
public final class j8 implements h8 {
    private final hq3 a;

    public j8(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        this.a = hq3Var;
    }

    @Override // defpackage.h8
    public String a(w6 w6Var) {
        z65.h(w6Var, "address");
        StringBuilder sb = new StringBuilder();
        boolean a = this.a.a(bq3.q);
        if (a) {
            sb.append(w6Var.n().a());
        } else if (!a) {
            sb.append(w6Var.n().c());
        }
        g9.a(sb, w6Var.k());
        String sb2 = sb.toString();
        z65.g(sb2, "with(...)");
        return sb2;
    }

    @Override // defpackage.h8
    public String b(w6 w6Var) {
        z65.h(w6Var, "address");
        StringBuilder sb = new StringBuilder();
        sb.append(w6Var.n().c());
        z65.g(sb, "append(...)");
        String sb2 = g9.a(g9.a(g9.a(g9.a(g9.a(sb, w6Var.k()), w6Var.e()), w6Var.d()), w6Var.f()), w6Var.i()).toString();
        z65.g(sb2, "with(...)");
        return sb2;
    }

    @Override // defpackage.h8
    public String c(w6 w6Var) {
        z65.h(w6Var, "address");
        StringBuilder sb = new StringBuilder();
        boolean a = this.a.a(bq3.q);
        if (a) {
            sb.append(w6Var.n().a());
        } else if (!a) {
            sb.append(w6Var.n().c());
        }
        g9.a(sb, w6Var.k());
        g9.a(sb, w6Var.e());
        g9.a(sb, w6Var.d());
        g9.a(sb, w6Var.i());
        String sb2 = sb.toString();
        z65.g(sb2, "with(...)");
        return sb2;
    }
}
