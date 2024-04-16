package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
/* compiled from: NetworkUnmeteredController.java */
/* renamed from: qw6  reason: default package */
/* loaded from: classes.dex */
public class qw6 extends ir1<kw6> {
    public qw6(@NonNull Context context, @NonNull d7b d7bVar) {
        super(ckb.c(context, d7bVar).d());
    }

    @Override // defpackage.ir1
    boolean b(@NonNull WorkSpec workSpec) {
        if (workSpec.j.b() != ow6.UNMETERED && (Build.VERSION.SDK_INT < 30 || workSpec.j.b() != ow6.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ir1
    /* renamed from: i */
    public boolean c(@NonNull kw6 kw6Var) {
        if (kw6Var.a() && !kw6Var.b()) {
            return false;
        }
        return true;
    }
}
