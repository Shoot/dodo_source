package defpackage;

import com.dodopizza.orderhistory.domain.check.CheckApi;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CheckService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Ln31;", "Lm31;", "", "orderId", "", "a", "", "Lz21;", "b", "Lcom/dodopizza/orderhistory/domain/check/CheckApi;", "Lcom/dodopizza/orderhistory/domain/check/CheckApi;", "api", "Lf31;", "Lf31;", "mapper", "Lj31;", c.a, "Lj31;", "repository", "<init>", "(Lcom/dodopizza/orderhistory/domain/check/CheckApi;Lf31;Lj31;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: n31  reason: default package */
/* loaded from: classes2.dex */
public final class n31 implements m31 {
    private final CheckApi a;
    private final f31 b;
    private final j31 c;

    public n31(CheckApi checkApi, f31 f31Var, j31 j31Var) {
        z65.h(checkApi, "api");
        z65.h(f31Var, "mapper");
        z65.h(j31Var, "repository");
        this.a = checkApi;
        this.b = f31Var;
        this.c = j31Var;
    }

    @Override // defpackage.m31
    public void a(String str) {
        int w;
        z65.h(str, "orderId");
        List<e31> checks = this.a.getChecks(str);
        f31 f31Var = this.b;
        w = lc1.w(checks, 10);
        ArrayList<z21> arrayList = new ArrayList(w);
        for (e31 e31Var : checks) {
            arrayList.add(f31Var.a(e31Var));
        }
        this.c.clear();
        j31 j31Var = this.c;
        for (z21 z21Var : arrayList) {
            j31Var.a(z21Var);
        }
    }

    @Override // defpackage.m31
    public List<z21> b() {
        return this.c.getAll();
    }
}
