package com.facebook.flipper.plugins.sandbox;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.flipper.core.FlipperResponder;
import java.util.Map;
/* loaded from: classes2.dex */
public class SandboxFlipperPlugin implements FlipperPlugin {
    private static final String GET_METHOD_NAME = "getSandbox";
    public static final String ID = "Sandbox";
    private static final String SET_METHOD_NAME = "setSandbox";
    private final SandboxFlipperPluginStrategy mStrategy;

    public SandboxFlipperPlugin(SandboxFlipperPluginStrategy sandboxFlipperPluginStrategy) {
        this.mStrategy = sandboxFlipperPluginStrategy;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public String getId() {
        return ID;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onConnect(FlipperConnection flipperConnection) {
        flipperConnection.receive(GET_METHOD_NAME, new FlipperReceiver() { // from class: com.facebook.flipper.plugins.sandbox.SandboxFlipperPlugin.1
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) {
                FlipperArray.Builder builder = new FlipperArray.Builder();
                Map<String, String> knownSandboxes = SandboxFlipperPlugin.this.mStrategy.getKnownSandboxes();
                if (knownSandboxes == null) {
                    flipperResponder.success(builder.build());
                    return;
                }
                for (String str : knownSandboxes.keySet()) {
                    builder.put(new FlipperObject.Builder().put(Action.NAME_ATTRIBUTE, str).put("value", knownSandboxes.get(str)));
                }
                flipperResponder.success(builder.build());
            }
        });
        flipperConnection.receive(SET_METHOD_NAME, new FlipperReceiver() { // from class: com.facebook.flipper.plugins.sandbox.SandboxFlipperPlugin.2
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                SandboxFlipperPlugin.this.mStrategy.setSandbox(flipperObject.getString("sandbox"));
                flipperResponder.success(new FlipperObject.Builder().put("result", Boolean.TRUE).build());
            }
        });
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public boolean runInBackground() {
        return false;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onDisconnect() {
    }
}
