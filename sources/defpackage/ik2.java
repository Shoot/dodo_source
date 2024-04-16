package defpackage;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: DaoConnectorRegistry.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B?\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0007\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR(\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000f"}, d2 = {"Lik2;", "Lhk2;", "Lmk2;", "daoMode", "Ldm2;", "Lzl2;", "a", "", "Ljava/util/Map;", "connectors", "", "b", "connectorsByName", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ik2  reason: default package */
/* loaded from: classes2.dex */
public final class ik2 implements hk2 {
    private final Map<mk2, dm2<? extends zl2>> a;
    private final Map<Object, dm2<? extends zl2>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public ik2(Map<mk2, ? extends dm2<? extends zl2>> map, Map<Object, ? extends dm2<? extends zl2>> map2) {
        z65.h(map, "connectors");
        z65.h(map2, "connectorsByName");
        this.a = map;
        this.b = map2;
    }

    @Override // defpackage.hk2
    public dm2<? extends zl2> a(mk2 mk2Var) {
        z65.h(mk2Var, "daoMode");
        dm2<? extends zl2> dm2Var = this.a.get(mk2Var);
        if (dm2Var != null) {
            return dm2Var;
        }
        throw new IllegalArgumentException("Database connector not found for " + mk2Var + " doa mode");
    }
}
