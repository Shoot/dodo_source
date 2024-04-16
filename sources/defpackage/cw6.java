package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
/* compiled from: NetworkNotRoamingController.java */
/* renamed from: cw6  reason: default package */
/* loaded from: classes.dex */
public class cw6 extends ir1<kw6> {
    private static final String e = nx5.f("NetworkNotRoamingCtrlr");

    public cw6(Context context, d7b d7bVar) {
        super(ckb.c(context, d7bVar).d());
    }

    @Override // defpackage.ir1
    boolean b(@NonNull WorkSpec workSpec) {
        if (workSpec.j.b() == ow6.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ir1
    /* renamed from: i */
    public boolean c(@NonNull kw6 kw6Var) {
        if (Build.VERSION.SDK_INT < 24) {
            nx5.c().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !kw6Var.a();
        } else if (!kw6Var.a() || !kw6Var.c()) {
            return true;
        } else {
            return false;
        }
    }
}
