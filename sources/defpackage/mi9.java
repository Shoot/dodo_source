package defpackage;

import defpackage.k65;
import kotlin.Metadata;
/* compiled from: RequestCounterInterceptor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lmi9;", "Lk65;", "Lk65$a;", "chain", "Lik9;", "intercept", "Lli9;", "a", "Lli9;", "counter", "<init>", "(Lli9;)V", "backend"}, k = 1, mv = {1, 9, 0})
/* renamed from: mi9  reason: default package */
/* loaded from: classes4.dex */
public final class mi9 implements k65 {
    private final li9 a;

    public mi9(li9 li9Var) {
        z65.h(li9Var, "counter");
        this.a = li9Var;
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) {
        z65.h(aVar, "chain");
        hi9 request = aVar.request();
        if (this.a.b()) {
            request = aVar.request().i().t(aVar.request().l().m().b("chuck_query_number", String.valueOf(this.a.c(request.l()))).c()).b();
        }
        return aVar.b(request);
    }
}
