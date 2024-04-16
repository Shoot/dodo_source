package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.View;
/* compiled from: SimpleInvalidationHandler.java */
/* renamed from: hla  reason: default package */
/* loaded from: classes3.dex */
public class hla extends Handler {
    private View a;

    public hla(View view) {
        this.a = view;
    }

    public void a() {
        this.a = null;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        View view;
        if (message.what == 0 && (view = this.a) != null) {
            view.invalidate();
        }
    }
}
