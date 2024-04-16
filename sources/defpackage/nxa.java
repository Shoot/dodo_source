package defpackage;

import com.dodopizza.persistence.entity.RealmString;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: StopRepository.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lnxa;", "Lmxa;", "", "", "b", "a", "Lava;", "Lava;", "stateProvider", "<init>", "(Lava;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nxa  reason: default package */
/* loaded from: classes4.dex */
public final class nxa implements mxa {
    private final ava a;

    public nxa(ava avaVar) {
        z65.h(avaVar, "stateProvider");
        this.a = avaVar;
    }

    @Override // defpackage.mxa
    public Collection<String> a() {
        int w;
        k0<RealmString> toppingIdsStopList = this.a.e().getToppingIdsStopList();
        w = lc1.w(toppingIdsStopList, 10);
        ArrayList arrayList = new ArrayList(w);
        for (RealmString realmString : toppingIdsStopList) {
            arrayList.add(realmString.getValue());
        }
        return arrayList;
    }

    @Override // defpackage.mxa
    public Collection<String> b() {
        int w;
        k0<RealmString> productIdsStopList = this.a.e().getProductIdsStopList();
        w = lc1.w(productIdsStopList, 10);
        ArrayList arrayList = new ArrayList(w);
        for (RealmString realmString : productIdsStopList) {
            arrayList.add(realmString.getValue());
        }
        return arrayList;
    }
}
