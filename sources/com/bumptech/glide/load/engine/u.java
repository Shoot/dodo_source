package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: ResourceRecycler.java */
/* loaded from: classes.dex */
class u {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    /* loaded from: classes.dex */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((nj9) message.obj).b();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(nj9<?> nj9Var, boolean z) {
        try {
            if (!this.a && !z) {
                this.a = true;
                nj9Var.b();
                this.a = false;
            }
            this.b.obtainMessage(1, nj9Var).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
