package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
/* compiled from: StorageNotLowController.java */
/* renamed from: rxa  reason: default package */
/* loaded from: classes.dex */
public class rxa extends ir1<Boolean> {
    public rxa(@NonNull Context context, @NonNull d7b d7bVar) {
        super(ckb.c(context, d7bVar).e());
    }

    @Override // defpackage.ir1
    boolean b(@NonNull WorkSpec workSpec) {
        return workSpec.j.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ir1
    /* renamed from: i */
    public boolean c(@NonNull Boolean bool) {
        return !bool.booleanValue();
    }
}
