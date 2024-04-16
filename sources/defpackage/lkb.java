package defpackage;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: TransactionManagerRegistry.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000e"}, d2 = {"Llkb;", "Lkkb;", "Lmk2;", "daoMode", "Likb;", "a", "", "Ljava/util/Map;", "transactionManagers", "", "b", "transactionManagersByName", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: lkb  reason: default package */
/* loaded from: classes2.dex */
public final class lkb implements kkb {
    private final Map<mk2, ikb> a;
    private final Map<Object, ikb> b;

    /* JADX WARN: Multi-variable type inference failed */
    public lkb(Map<mk2, ? extends ikb> map, Map<Object, ? extends ikb> map2) {
        z65.h(map, "transactionManagers");
        z65.h(map2, "transactionManagersByName");
        this.a = map;
        this.b = map2;
    }

    @Override // defpackage.kkb
    public ikb a(mk2 mk2Var) {
        z65.h(mk2Var, "daoMode");
        ikb ikbVar = this.a.get(mk2Var);
        if (ikbVar != null) {
            return ikbVar;
        }
        throw new IllegalArgumentException("Transaction manager not found for " + mk2Var + " doa mode");
    }
}
