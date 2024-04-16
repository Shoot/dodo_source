package defpackage;

import defpackage.g89;
import io.realm.d0;
import io.realm.j0;
import kotlin.Metadata;
/* compiled from: RealmDatabaseInMemoryConnectionFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lh89;", "Lbm2;", "Lg89$a;", "b", "a", "Lg89$a;", "connection", "Lio/realm/j0;", "realmConfiguration", "<init>", "(Lio/realm/j0;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: h89  reason: default package */
/* loaded from: classes2.dex */
public final class h89 implements bm2<g89.a> {
    private final g89.a a;

    public h89(j0 j0Var) {
        z65.h(j0Var, "realmConfiguration");
        d0 F0 = d0.F0(j0Var);
        z65.g(F0, "getInstance(realmConfiguration)");
        this.a = new g89.a(F0);
    }

    @Override // defpackage.bm2
    /* renamed from: b */
    public g89.a a() {
        return this.a;
    }
}
