package defpackage;

import kotlin.Metadata;
/* compiled from: HalvesTitleFormatter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lam4;", "Lzl4;", "Lgl4;", "halvesInfo", "", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: am4  reason: default package */
/* loaded from: classes2.dex */
public final class am4 implements zl4 {
    @Override // defpackage.zl4
    public String a(gl4 gl4Var) {
        String str;
        z65.h(gl4Var, "halvesInfo");
        if (gl4Var.a().length() == 0) {
            return gl4Var.a();
        }
        StringBuilder sb = new StringBuilder(gl4Var.a());
        if (gl4Var.b().e().length() > 0) {
            str = ", " + qhb.a(gl4Var.b().e());
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        z65.e(sb2);
        return sb2;
    }
}
