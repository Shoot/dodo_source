package com.facebook.flipper.plugins.uidebugger;

import android.app.Application;
import ch.qos.logback.core.CoreConstants;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.plugins.uidebugger.core.ApplicationInspector;
import com.facebook.flipper.plugins.uidebugger.core.ApplicationRef;
import com.facebook.flipper.plugins.uidebugger.core.Context;
import kotlin.Metadata;
/* compiled from: UIDebuggerFlipperPlugin.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/UIDebuggerFlipperPlugin;", "Lcom/facebook/flipper/core/FlipperPlugin;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "connection", "Lcom/facebook/flipper/core/FlipperConnection;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/flipper/plugins/uidebugger/core/Context;", "getId", "", "onConnect", "", "onDisconnect", "runInBackground", "", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UIDebuggerFlipperPlugin implements FlipperPlugin {
    private final Application application;
    private FlipperConnection connection;
    private final Context context;

    public UIDebuggerFlipperPlugin(Application application) {
        z65.h(application, "application");
        this.application = application;
        this.context = new Context(new ApplicationRef(application));
    }

    public final Application getApplication() {
        return this.application;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public String getId() {
        return "ui-debugger";
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onConnect(FlipperConnection flipperConnection) throws Exception {
        z65.h(flipperConnection, "connection");
        this.connection = flipperConnection;
        flipperConnection.send("init", new FlipperObject.Builder().put("rootId", String.valueOf(System.identityHashCode(this.application))).build());
        new ApplicationInspector(this.context).inspect();
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onDisconnect() throws Exception {
        this.connection = null;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public boolean runInBackground() {
        return true;
    }
}
