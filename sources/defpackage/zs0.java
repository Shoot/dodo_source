package defpackage;

import kotlin.Metadata;
/* compiled from: CashChargeViewBinder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lzs0;", "", "Lys0;", "viewState", "Lws0;", "vo", "", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: zs0  reason: default package */
/* loaded from: classes4.dex */
public final class zs0 {
    public final void a(ys0 ys0Var, ws0 ws0Var) {
        z65.h(ys0Var, "viewState");
        z65.h(ws0Var, "vo");
        String a = nn6.a.a().a();
        if (ws0Var.f()) {
            ys0Var.D3(a);
        } else {
            ys0Var.h3(a);
        }
        ys0Var.rg(ws0Var.e());
        ys0Var.Cd(ws0Var.d());
        if (ws0Var.c().d()) {
            ys0Var.b3();
            ys0Var.H8();
        } else if (rn6.c(ws0Var.c(), ws0Var.d()) < 0) {
            ys0Var.Vf();
            ys0Var.Z();
            ys0Var.C5(false);
        } else {
            ys0Var.b3();
            ys0Var.Z();
            ys0Var.C5(true);
        }
    }
}
