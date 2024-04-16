package defpackage;

import kotlin.Metadata;
/* compiled from: HalvesConstructorRouterImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Luk4;", "Ltk4;", "", "leftId", "rightId", "Lml4;", "halvesData", "", "a", "Lf63;", "Lf63;", "router", "<init>", "(Lf63;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: uk4  reason: default package */
/* loaded from: classes4.dex */
public final class uk4 implements tk4 {
    private final f63 a;

    public uk4(f63 f63Var) {
        z65.h(f63Var, "router");
        this.a = f63Var;
    }

    @Override // defpackage.tk4
    public void a(String str, String str2, ml4 ml4Var) {
        z65.h(str, "leftId");
        z65.h(str2, "rightId");
        z65.h(ml4Var, "halvesData");
        this.a.e(vl4.a(new ml4(lnb.a(str, str2), ml4Var.b(), ml4Var.c())));
    }
}
