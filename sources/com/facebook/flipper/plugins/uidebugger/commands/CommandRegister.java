package com.facebook.flipper.plugins.uidebugger.commands;

import com.facebook.flipper.core.FlipperConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CommandRegister.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b6\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/commands/CommandRegister;", "", "()V", "Companion", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CommandRegister {
    public static final Companion Companion = new Companion(null);

    /* compiled from: CommandRegister.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u0004\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/commands/CommandRegister$Companion;", "", "()V", "register", "", "T", "Lcom/facebook/flipper/plugins/uidebugger/commands/Command;", "connection", "Lcom/facebook/flipper/core/FlipperConnection;", "cmd", "(Lcom/facebook/flipper/core/FlipperConnection;Lcom/facebook/flipper/plugins/uidebugger/commands/Command;)V", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends Command> void register(FlipperConnection flipperConnection, T t) {
            z65.h(flipperConnection, "connection");
            z65.h(t, "cmd");
            flipperConnection.receive(t.identifier(), t.receiver());
        }
    }

    private CommandRegister() {
    }

    public /* synthetic */ CommandRegister(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
