package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DeferredIntervalsVOConverter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lps2;", "", "Lls2;", RemoteMessageConst.FROM, "Lms2;", "b", "Ljs2;", "Lks2;", c.a, "Lns2;", "Los2;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ps2  reason: default package */
/* loaded from: classes4.dex */
public final class ps2 {
    private final ms2 b(ls2 ls2Var) {
        ks2 ks2Var;
        String e = ls2Var.e();
        Long b = ls2Var.b();
        js2 a = ls2Var.a();
        if (a != null) {
            ks2Var = c(a);
        } else {
            ks2Var = null;
        }
        return new ms2(e, b, ks2Var, ls2Var.c(), ls2Var.d(), false, 32, null);
    }

    private final ks2 c(js2 js2Var) {
        return new ks2(js2Var.a());
    }

    public final os2 a(ns2 ns2Var) {
        int w;
        z65.h(ns2Var, RemoteMessageConst.FROM);
        String a = ns2Var.a();
        List<ls2> b = ns2Var.b();
        w = lc1.w(b, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ls2 ls2Var : b) {
            arrayList.add(b(ls2Var));
        }
        return new os2(a, arrayList);
    }
}
