package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PlAddressFormatterImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Ldb8;", "Lh8;", "Lw6;", "address", "", "b", c.a, "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: db8  reason: default package */
/* loaded from: classes4.dex */
public final class db8 implements h8 {
    @Override // defpackage.h8
    public String a(w6 w6Var) {
        z65.h(w6Var, "address");
        StringBuilder sb = new StringBuilder();
        sb.append(w6Var.n().c());
        z65.g(sb, "append(...)");
        String sb2 = g9.b(sb, w6Var.k()).toString();
        z65.g(sb2, "with(...)");
        return sb2;
    }

    @Override // defpackage.h8
    public String b(w6 w6Var) {
        z65.h(w6Var, "address");
        StringBuilder sb = new StringBuilder();
        sb.append(w6Var.n().c());
        z65.g(sb, "append(...)");
        String sb2 = g9.a(g9.a(g9.a(g9.a(g9.b(sb, w6Var.k()), w6Var.e()), w6Var.d()), w6Var.f()), w6Var.i()).toString();
        z65.g(sb2, "with(...)");
        return sb2;
    }

    @Override // defpackage.h8
    public String c(w6 w6Var) {
        z65.h(w6Var, "address");
        StringBuilder sb = new StringBuilder();
        sb.append(w6Var.n().c());
        z65.g(sb, "append(...)");
        String sb2 = g9.a(g9.a(g9.a(g9.b(sb, w6Var.k()), w6Var.e()), w6Var.d()), w6Var.i()).toString();
        z65.g(sb2, "with(...)");
        return sb2;
    }
}
