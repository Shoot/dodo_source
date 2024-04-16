package defpackage;

import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: kkc  reason: default package */
/* loaded from: classes2.dex */
final class kkc extends lkc {
    final /* synthetic */ Intent a;
    final /* synthetic */ kp5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kkc(Intent intent, kp5 kp5Var, int i) {
        this.a = intent;
        this.b = kp5Var;
    }

    @Override // defpackage.lkc
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
