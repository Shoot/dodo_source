package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
/* compiled from: NetworkConnectedController.java */
/* renamed from: yv6  reason: default package */
/* loaded from: classes.dex */
public class yv6 extends ir1<kw6> {
    public yv6(Context context, d7b d7bVar) {
        super(ckb.c(context, d7bVar).d());
    }

    @Override // defpackage.ir1
    boolean b(@NonNull WorkSpec workSpec) {
        if (workSpec.j.b() == ow6.CONNECTED) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ir1
    /* renamed from: i */
    public boolean c(@NonNull kw6 kw6Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (!kw6Var.a() || !kw6Var.d()) {
                return true;
            }
            return false;
        }
        return !kw6Var.a();
    }
}
