package com.facebook.flipper.plugins.sandbox;

import java.util.Map;
/* loaded from: classes2.dex */
public interface SandboxFlipperPluginStrategy {
    Map<String, String> getKnownSandboxes();

    void setSandbox(String str);
}
