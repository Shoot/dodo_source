package com.facebook.flipper.plugins.navigation;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.flipper.core.FlipperResponder;
import java.util.Date;
/* loaded from: classes2.dex */
public class NavigationFlipperPlugin implements FlipperPlugin {
    private static NavigationFlipperPlugin instance;
    private FlipperConnection mConnection = null;

    private NavigationFlipperPlugin() {
    }

    public static NavigationFlipperPlugin getInstance() {
        if (instance == null) {
            instance = new NavigationFlipperPlugin();
        }
        return instance;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public String getId() {
        return "Navigation";
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onConnect(FlipperConnection flipperConnection) throws Exception {
        this.mConnection = flipperConnection;
        flipperConnection.receive("greet", new FlipperReceiver() { // from class: com.facebook.flipper.plugins.navigation.NavigationFlipperPlugin.1
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                flipperResponder.success(new FlipperObject.Builder().put("greeting", "Hello").build());
            }
        });
        this.mConnection.send("nav_plugin_active", new FlipperObject.Builder().build());
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public boolean runInBackground() {
        return true;
    }

    @Deprecated
    public void sendNavigationEvent(String str) {
        sendNavigationEvent(str, null, null);
    }

    public void sendNavigationEvent(String str, String str2, Date date) {
        if (this.mConnection != null) {
            FlipperObject.Builder put = new FlipperObject.Builder().put("uri", str);
            if (date == null) {
                date = new Date();
            }
            this.mConnection.send("nav_event", put.put("date", date).put(Action.CLASS_ATTRIBUTE, str2).build());
        }
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onDisconnect() throws Exception {
    }
}
