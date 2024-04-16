package com.facebook.flipper.plugins.uidebugger.core;

import kotlin.Metadata;
/* compiled from: Context.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/Context;", "", "application", "Lcom/facebook/flipper/plugins/uidebugger/core/ApplicationRef;", "(Lcom/facebook/flipper/plugins/uidebugger/core/ApplicationRef;)V", "getApplication", "()Lcom/facebook/flipper/plugins/uidebugger/core/ApplicationRef;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Context {
    private final ApplicationRef application;

    public Context(ApplicationRef applicationRef) {
        z65.h(applicationRef, "application");
        this.application = applicationRef;
    }

    public final ApplicationRef getApplication() {
        return this.application;
    }
}
