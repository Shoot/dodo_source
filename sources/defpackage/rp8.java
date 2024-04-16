package defpackage;

import kotlin.Metadata;
/* compiled from: PromoCodeConditionProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lrp8;", "", "Lop8;", "promoCode", "", "a", "Lw18;", "promoAction", "b", "Lc63;", "Lc63;", "dodoResources", "<init>", "(Lc63;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rp8  reason: default package */
/* loaded from: classes2.dex */
public final class rp8 {
    private final c63 a;

    public rp8(c63 c63Var) {
        z65.h(c63Var, "dodoResources");
        this.a = c63Var;
    }

    public final String a(op8 op8Var) {
        z65.h(op8Var, "promoCode");
        if (op8Var.f().length() > 0) {
            return op8Var.f();
        }
        return this.a.getString(fq8.a(op8Var.e()));
    }

    public final String b(w18 w18Var) {
        z65.h(w18Var, "promoAction");
        String f = w18Var.f();
        if (f.length() == 0) {
            return this.a.getString(fq8.a(w18Var.e()));
        }
        return f;
    }
}
