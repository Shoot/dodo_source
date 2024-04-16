package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: wjc  reason: default package */
/* loaded from: classes2.dex */
final class wjc extends lkc {
    final /* synthetic */ Intent a;
    final /* synthetic */ Activity b;
    final /* synthetic */ int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wjc(Intent intent, Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // defpackage.lkc
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
