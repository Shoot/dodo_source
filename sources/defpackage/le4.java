package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
/* compiled from: OtherAnalytics.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lle4;", "Ldc;", "Lqc;", "a", "Loe4;", "Loe4;", "getSource", "()Loe4;", KustoStorage.KustoTable.COLUMN_SOURCE, "<init>", "(Loe4;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: le4  reason: default package */
/* loaded from: classes4.dex */
public final class le4 implements dc {
    private final oe4 a;

    public le4(oe4 oe4Var) {
        z65.h(oe4Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = oe4Var;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(new bc("geo_permission"), "pizzeriaSource", this.a.getValue(), false, 4, null).a();
    }
}
