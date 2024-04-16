package com.facebook.flipper.plugins.crashreporter;

import android.app.Activity;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import java.lang.Thread;
/* loaded from: classes2.dex */
public class CrashReporterPlugin implements FlipperPlugin {
    public static final String ID = "CrashReporter";
    private static CrashReporterPlugin crashreporterPlugin;
    private Activity mActivity;
    private FlipperConnection mConnection;
    private Thread.UncaughtExceptionHandler prevHandler;

    private CrashReporterPlugin() {
    }

    public static CrashReporterPlugin getInstance() {
        if (crashreporterPlugin == null) {
            crashreporterPlugin = new CrashReporterPlugin();
        }
        return crashreporterPlugin;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public String getId() {
        return ID;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onConnect(FlipperConnection flipperConnection) {
        this.mConnection = flipperConnection;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onDisconnect() {
        this.mConnection = null;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public boolean runInBackground() {
        return true;
    }

    public void sendExceptionMessage(Thread thread, Throwable th) {
        FlipperConnection flipperConnection = this.mConnection;
        if (flipperConnection != null) {
            StringBuilder sb = new StringBuilder("");
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                sb.append(stackTrace[i].toString());
                if (i < stackTrace.length - 1) {
                    sb.append("\n\tat ");
                }
            }
            flipperConnection.send("crash-report", new FlipperObject.Builder().put("callstack", sb.toString()).put(Action.NAME_ATTRIBUTE, th.toString()).put("reason", th.getMessage()).build());
        }
    }

    public void setActivity(Activity activity) {
        this.mActivity = activity;
    }
}
