package com.google.android.gms.measurement.internal;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class k5 implements fbd {
    private final /* synthetic */ g5 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k5(g5 g5Var) {
        this.a = g5Var;
    }

    @Override // defpackage.fbd
    public final void a(had hadVar, String str, List<String> list, boolean z, boolean z2) {
        m4 E;
        int i = m5.a[hadVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        E = this.a.n().I();
                    } else {
                        E = this.a.n().J();
                    }
                } else if (z) {
                    E = this.a.n().M();
                } else if (!z2) {
                    E = this.a.n().L();
                } else {
                    E = this.a.n().K();
                }
            } else if (z) {
                E = this.a.n().H();
            } else if (!z2) {
                E = this.a.n().G();
            } else {
                E = this.a.n().F();
            }
        } else {
            E = this.a.n().E();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    E.a(str);
                    return;
                } else {
                    E.d(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            E.c(str, list.get(0), list.get(1));
            return;
        }
        E.b(str, list.get(0));
    }
}
