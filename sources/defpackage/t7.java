package defpackage;

import defpackage.s7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: AddressFieldPresenterFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lt7;", "Lns3;", "Lis3;", "fieldInfo", "Lls3;", "a", "Ldza;", "Ldza;", "getStreetAutocompleteInteractor", "()Ldza;", "streetAutocompleteInteractor", "Lnp4;", "b", "Lnp4;", "getHouseAutocompleteInteractor", "()Lnp4;", "houseAutocompleteInteractor", "<init>", "(Ldza;Lnp4;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: t7  reason: default package */
/* loaded from: classes4.dex */
public final class t7 implements ns3 {
    private final dza a;
    private final np4 b;

    public t7(dza dzaVar, np4 np4Var) {
        z65.h(dzaVar, "streetAutocompleteInteractor");
        z65.h(np4Var, "houseAutocompleteInteractor");
        this.a = dzaVar;
        this.b = np4Var;
    }

    @Override // defpackage.ns3
    public ls3 a(is3 is3Var) {
        z65.h(is3Var, "fieldInfo");
        s7 s7Var = (s7) is3Var;
        if (s7Var instanceof s7.b) {
            return new wla();
        }
        if (s7Var instanceof s7.a) {
            String name = s7Var.getName();
            if (z65.c(name, n7.b.getValue())) {
                return new cza(this.a);
            }
            if (z65.c(name, n7.c.getValue())) {
                return new mp4(this.b);
            }
            throw new IllegalArgumentException("Unknown address element");
        }
        throw new NoWhenBranchMatchedException();
    }
}
