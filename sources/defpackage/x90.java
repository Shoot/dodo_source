package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
/* compiled from: BatteryChargingController.java */
/* renamed from: x90  reason: default package */
/* loaded from: classes.dex */
public class x90 extends ir1<Boolean> {
    public x90(Context context, d7b d7bVar) {
        super(ckb.c(context, d7bVar).a());
    }

    @Override // defpackage.ir1
    boolean b(@NonNull WorkSpec workSpec) {
        return workSpec.j.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ir1
    /* renamed from: i */
    public boolean c(@NonNull Boolean bool) {
        return !bool.booleanValue();
    }
}
