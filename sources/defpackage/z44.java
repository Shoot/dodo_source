package defpackage;

import android.annotation.SuppressLint;
/* compiled from: ForcedSender.java */
/* renamed from: z44  reason: default package */
/* loaded from: classes2.dex */
public final class z44 {
    @SuppressLint({"DiscouragedApi"})
    public static void a(ulb<?> ulbVar, xj8 xj8Var) {
        if (ulbVar instanceof amb) {
            lmb.c().e().u(((amb) ulbVar).d().f(xj8Var), 1);
            return;
        }
        wx5.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", ulbVar);
    }
}
