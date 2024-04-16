package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
/* compiled from: BatteryNotLowController.java */
/* renamed from: z90  reason: default package */
/* loaded from: classes.dex */
public class z90 extends ir1<Boolean> {
    public z90(Context context, d7b d7bVar) {
        super(ckb.c(context, d7bVar).b());
    }

    @Override // defpackage.ir1
    boolean b(@NonNull WorkSpec workSpec) {
        return workSpec.j.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ir1
    /* renamed from: i */
    public boolean c(@NonNull Boolean bool) {
        return !bool.booleanValue();
    }
}
