package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.qd6;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SimpleMenuItemCopyMaker.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkla;", "Lxd6;", "Lqd6$e;", "Lqd6;", "Lvf6;", "menuPersonalPriceInfo", "", "b", "menuItem", c.a, "Lzf6;", "a", "Lzf6;", "menuPersonalPriceInfoRepository", "<init>", "(Lzf6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kla  reason: default package */
/* loaded from: classes4.dex */
public final class kla implements xd6<qd6.e> {
    private final zf6 a;

    public kla(zf6 zf6Var) {
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        this.a = zf6Var;
    }

    private final boolean b(qd6 qd6Var, vf6 vf6Var) {
        return !z65.c(qd6Var.h(), vf6Var.e());
    }

    @Override // defpackage.xd6
    /* renamed from: c */
    public qd6.e a(qd6.e eVar) {
        List l;
        z65.h(eVar, "menuItem");
        vf6 find = this.a.find(eVar.t().t());
        if (find != null && b(eVar, find)) {
            l = kc1.l();
            return qd6.e.s(eVar, null, null, null, null, null, null, null, find.f(), null, null, find.e(), null, l, null, false, 27519, null);
        }
        return null;
    }
}
