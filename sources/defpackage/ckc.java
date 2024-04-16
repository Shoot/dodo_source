package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: ckc  reason: default package */
/* loaded from: classes2.dex */
final class ckc implements View.OnClickListener {
    final /* synthetic */ Context a;
    final /* synthetic */ Intent b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ckc(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.a.startActivity(this.b);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
