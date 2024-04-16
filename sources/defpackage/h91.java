package defpackage;

import kotlin.Metadata;
/* compiled from: ClientDeliveryLocationFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lh91;", "Lg91;", "Lp9a;", "selectedSuggestion", "Le91;", "a", "Lht4;", "Lht4;", "identifierGenerator", "Lq9a;", "b", "Lq9a;", "converter", "<init>", "(Lht4;Lq9a;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h91  reason: default package */
/* loaded from: classes4.dex */
public final class h91 implements g91 {
    private final ht4 a;
    private final q9a b;

    public h91(ht4 ht4Var, q9a q9aVar) {
        z65.h(ht4Var, "identifierGenerator");
        z65.h(q9aVar, "converter");
        this.a = ht4Var;
        this.b = q9aVar;
    }

    @Override // defpackage.g91
    public e91 a(p9a p9aVar) {
        z65.h(p9aVar, "selectedSuggestion");
        return new e91(this.a.a(), this.b.a(p9aVar), true);
    }
}
