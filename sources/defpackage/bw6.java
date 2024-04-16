package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
/* compiled from: NetworkMeteredController.java */
/* renamed from: bw6  reason: default package */
/* loaded from: classes.dex */
public class bw6 extends ir1<kw6> {
    private static final String e = nx5.f("NetworkMeteredCtrlr");

    public bw6(Context context, d7b d7bVar) {
        super(ckb.c(context, d7bVar).d());
    }

    @Override // defpackage.ir1
    boolean b(@NonNull WorkSpec workSpec) {
        if (workSpec.j.b() == ow6.METERED) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ir1
    /* renamed from: i */
    public boolean c(@NonNull kw6 kw6Var) {
        if (Build.VERSION.SDK_INT < 26) {
            nx5.c().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !kw6Var.a();
        } else if (!kw6Var.a() || !kw6Var.b()) {
            return true;
        } else {
            return false;
        }
    }
}
