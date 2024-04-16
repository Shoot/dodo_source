package com.facebook.flipper.plugins.react;

import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperPlugin;
@Deprecated
/* loaded from: classes2.dex */
public class ReactFlipperPlugin implements FlipperPlugin {
    public static final String ID = "React";

    @Override // com.facebook.flipper.core.FlipperPlugin
    public String getId() {
        return ID;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public boolean runInBackground() {
        return true;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onDisconnect() {
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onConnect(FlipperConnection flipperConnection) {
    }
}
