package defpackage;

import android.app.Activity;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: tic  reason: default package */
/* loaded from: classes2.dex */
public final class tic implements pkc {
    final /* synthetic */ Activity a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ qs2 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tic(qs2 qs2Var, Activity activity, Bundle bundle, Bundle bundle2) {
        this.d = qs2Var;
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
    }

    @Override // defpackage.pkc
    public final int a() {
        return 0;
    }

    @Override // defpackage.pkc
    public final void b(jp5 jp5Var) {
        jp5 jp5Var2;
        jp5Var2 = this.d.a;
        jp5Var2.a(this.a, this.b, this.c);
    }
}
