package com.facebook.flipper.plugins.common;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.flipper.core.FlipperResponder;
import java.io.PrintWriter;
import java.io.StringWriter;
/* loaded from: classes2.dex */
public abstract class MainThreadFlipperReceiver implements FlipperReceiver {
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static String getStackTraceString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.facebook.flipper.core.FlipperReceiver
    public final void onReceive(final FlipperObject flipperObject, final FlipperResponder flipperResponder) {
        this.mHandler.post(new Runnable() { // from class: com.facebook.flipper.plugins.common.MainThreadFlipperReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MainThreadFlipperReceiver.this.onReceiveOnMainThread(flipperObject, flipperResponder);
                } catch (Exception e) {
                    flipperResponder.error(new FlipperObject.Builder().put(Action.NAME_ATTRIBUTE, e.getClass().getCanonicalName()).put("message", e.getMessage()).put("stacktrace", MainThreadFlipperReceiver.getStackTraceString(e)).build());
                }
            }
        });
    }

    public abstract void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception;
}
