package defpackage;

import defpackage.kl8;
import defpackage.uq0;
import kotlin.Metadata;
/* compiled from: cartitemtransforms.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"Ltja;", "", "sortOrder", "count", "Lnq0;", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: hs0  reason: default package */
/* loaded from: classes4.dex */
public final class hs0 {
    public static final nq0 a(tja tjaVar, int i, int i2) {
        int i3;
        String str;
        String str2;
        int i4;
        int i5;
        z65.h(tjaVar, "<this>");
        fl8 Y = tjaVar.Y();
        if (tjaVar.p()) {
            i3 = 21;
        } else {
            i3 = 1;
        }
        if (Y instanceof m78) {
            m78 m78Var = (m78) Y;
            int d = m78Var.o().d();
            String e = m78Var.o().e();
            int d2 = m78Var.s().d();
            str2 = m78Var.s().e();
            i4 = d;
            str = e;
            i5 = d2;
        } else if (!(Y instanceof swb)) {
            str = "";
            str2 = str;
            i4 = 0;
            i5 = 0;
        } else {
            swb swbVar = (swb) Y;
            int d3 = swbVar.r().d();
            str2 = swbVar.r().e();
            str = "";
            i5 = d3;
            i4 = 0;
        }
        return new nq0(uq0.b.a.b(uq0.b.c, tjaVar.G0(), tjaVar.h(), null, null, null, null, 60, null), i3, kl8.a.a.a(Y.e()), i2, 999, Y.getName(), Y.f(), 0, 0.0f, Y.n(), tjaVar.h(), false, 0, rn6.g(tjaVar.h(), i2), i4, str, i5, str2, tjaVar.getId(), tjaVar.t(), null, i, new qq0(null, null, 3, null), null, null, false, 25165824, null);
    }
}
