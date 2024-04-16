package defpackage;

import defpackage.ik9;
import defpackage.k65;
import defpackage.kk9;
import im.threads.ui.fragments.ChatFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: IgnoreQueriesInterceptor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lwt4;", "Lk65;", "Lk65$a;", "chain", "Lik9;", "intercept", "Lmh0;", "a", "Lmh0;", "buildInfo", "Lyt4;", "b", "Lyt4;", "ignoreQueriesProvider", "<init>", "(Lmh0;Lyt4;)V", "backend"}, k = 1, mv = {1, 9, 0})
/* renamed from: wt4  reason: default package */
/* loaded from: classes4.dex */
public final class wt4 implements k65 {
    private final mh0 a;
    private final yt4 b;

    public wt4(mh0 mh0Var, yt4 yt4Var) {
        z65.h(mh0Var, "buildInfo");
        z65.h(yt4Var, "ignoreQueriesProvider");
        this.a = mh0Var;
        this.b = yt4Var;
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) {
        List F0;
        Object obj;
        boolean y;
        boolean O;
        z65.h(aVar, "chain");
        F0 = sc1.F0(this.b.a());
        Iterator it = F0.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            O = m0b.O(uu0.c(aVar), ((tt4) next).a().a(), false, 2, null);
            if (O) {
                obj = next;
                break;
            }
        }
        tt4 tt4Var = (tt4) mh5.c(obj, new tt4(new ut4(""), vt4.d));
        y = l0b.y(tt4Var.a().a());
        if ((!y) && nh0.a(this.a)) {
            ik9.a l = aVar.b(aVar.request()).u().e(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY).l(tt4Var.b().i());
            kk9.b bVar = kk9.Companion;
            byte[] bytes = tt4Var.b().i().getBytes(rw0.b);
            z65.g(bytes, "getBytes(...)");
            return l.b(bVar.h(bytes, qc6.e.b("application/json"))).a("content-type", "application/json").c();
        }
        return aVar.b(aVar.request());
    }
}
