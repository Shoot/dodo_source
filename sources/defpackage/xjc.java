package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: xjc  reason: default package */
/* loaded from: classes2.dex */
public final class xjc implements pkc {
    final /* synthetic */ FrameLayout a;
    final /* synthetic */ LayoutInflater b;
    final /* synthetic */ ViewGroup c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ qs2 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xjc(qs2 qs2Var, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = qs2Var;
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
    }

    @Override // defpackage.pkc
    public final int a() {
        return 2;
    }

    @Override // defpackage.pkc
    public final void b(jp5 jp5Var) {
        jp5 jp5Var2;
        this.a.removeAllViews();
        FrameLayout frameLayout = this.a;
        jp5Var2 = this.e.a;
        frameLayout.addView(jp5Var2.b(this.b, this.c, this.d));
    }
}
