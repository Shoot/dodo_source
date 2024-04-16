package defpackage;

import com.dodopizza.geo.feature.deliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.deliveryaddressmap.presentation.b;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: DeliveryLocationSuggestionsRouterImpl.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkz2;", "Ljz2;", "", "id", "Lcom/dodopizza/geo/feature/suggestions/presentation/b;", "result", "", "b", "Liv0;", c.a, "", LocalityEntity.FIELD_COUNTRY_CODE, "Lck1;", KustoStorage.KustoTable.COLUMN_SOURCE, "a", "Lf63;", "Lf63;", "router", "<init>", "(Lf63;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: kz2  reason: default package */
/* loaded from: classes4.dex */
public final class kz2 implements jz2 {
    private final f63 a;

    public kz2(f63 f63Var) {
        z65.h(f63Var, "router");
        this.a = f63Var;
    }

    @Override // defpackage.jz2
    public void a(String str, ck1 ck1Var) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(ck1Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a.e(new b(new a.b(str, ck1Var)));
    }

    @Override // defpackage.jz2
    public void b(int i, com.dodopizza.geo.feature.suggestions.presentation.b bVar) {
        z65.h(bVar, "result");
        this.a.i(i, bVar);
    }

    @Override // defpackage.jz2
    public void c(int i, iv0 iv0Var) {
        z65.h(iv0Var, "result");
        this.a.l(i, iv0Var);
    }
}
