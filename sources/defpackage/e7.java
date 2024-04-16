package defpackage;

import kotlin.Metadata;
/* compiled from: AddressComponentVO.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"Ld7;", "other", "b", "", "isLast", "a", "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: e7  reason: default package */
/* loaded from: classes2.dex */
public final class e7 {
    public static final d7 a(d7 d7Var, boolean z) {
        d7 a;
        z65.h(d7Var, "<this>");
        if (d7Var.k() != z) {
            a = d7Var.a((r22 & 1) != 0 ? d7Var.a : null, (r22 & 2) != 0 ? d7Var.b : null, (r22 & 4) != 0 ? d7Var.c : null, (r22 & 8) != 0 ? d7Var.d : false, (r22 & 16) != 0 ? d7Var.e : 0, (r22 & 32) != 0 ? d7Var.f : 0, (r22 & 64) != 0 ? d7Var.g : null, (r22 & 128) != 0 ? d7Var.h : z, (r22 & 256) != 0 ? d7Var.i : false, (r22 & 512) != 0 ? d7Var.j : false);
            return a;
        }
        return d7Var;
    }

    public static final d7 b(d7 d7Var, d7 d7Var2) {
        z65.h(d7Var, "<this>");
        z65.h(d7Var2, "other");
        d7Var.t(d7Var2.h());
        d7Var.u(d7Var2.i());
        d7Var.q(d7Var2.l());
        d7Var.o(d7Var2.d());
        d7Var.p(d7Var2.e());
        d7Var.s(d7Var2.g());
        d7Var.n(d7Var2.k());
        d7Var.m(d7Var2.j());
        d7Var.r(d7Var2.f());
        return d7Var;
    }
}
