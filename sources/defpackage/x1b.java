package defpackage;

import defpackage.uu2;
import kotlin.Metadata;
/* compiled from: SuggestionAddressProvider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lx1b;", "", "Lwk7;", "orderType", "", "a", "Lpu2;", "Lpu2;", "deliverablePlaceFormatter", "<init>", "(Lpu2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x1b  reason: default package */
/* loaded from: classes2.dex */
public final class x1b {
    private final pu2 a;

    public x1b(pu2 pu2Var) {
        z65.h(pu2Var, "deliverablePlaceFormatter");
        this.a = pu2Var;
    }

    public final String a(wk7 wk7Var) {
        z65.h(wk7Var, "orderType");
        if (wk7Var instanceof uu2.a) {
            return this.a.b(((uu2.a) wk7Var).e());
        }
        return null;
    }
}
