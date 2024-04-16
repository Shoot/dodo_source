package com.google.android.gms.common.api.internal;

import android.app.Dialog;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
final class l0 extends ajc {
    final /* synthetic */ Dialog a;
    final /* synthetic */ m0 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(m0 m0Var, Dialog dialog) {
        this.b = m0Var;
        this.a = dialog;
    }

    @Override // defpackage.ajc
    public final void a() {
        this.b.b.o();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
