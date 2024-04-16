package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: CardTypeExt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwp0;", "", "a", "(Lwp0;)I", "iconResId", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: xp0  reason: default package */
/* loaded from: classes4.dex */
public final class xp0 {
    public static final int a(wp0 wp0Var) {
        z65.h(wp0Var, "<this>");
        if (!(wp0Var instanceof zp0)) {
            return 0;
        }
        if (wp0Var == zp0.e) {
            return bx8.ic_bankcard_amex;
        }
        if (wp0Var == zp0.f) {
            return bx8.ic_bankcard_diners_club;
        }
        if (wp0Var == zp0.g) {
            return bx8.ic_bankcard_discover;
        }
        if (wp0Var == zp0.h) {
            return bx8.ic_bankcard_jcb;
        }
        if (wp0Var == zp0.i) {
            return bx8.ic_bankcard_mastercard;
        }
        if (wp0Var == zp0.j) {
            return bx8.ic_bankcard_visa;
        }
        if (wp0Var == zp0.k) {
            return bx8.ic_bankcard_maestro;
        }
        if (wp0Var == zp0.l) {
            return bx8.ic_bankcard_mir;
        }
        if (wp0Var == zp0.m) {
            return bx8.ic_bankcard_belcard;
        }
        if (wp0Var == zp0.n) {
            return bx8.ic_bankcard_uzcard;
        }
        if (wp0Var == zp0.o) {
            return bx8.ic_bankcard_humo;
        }
        if (wp0Var == zp0.p || wp0Var == zp0.q) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
