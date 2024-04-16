package com.facebook.flipper.plugins.uidebugger.commands;

import ch.qos.logback.core.CoreConstants;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.flipper.core.FlipperResponder;
import com.facebook.flipper.plugins.common.MainThreadFlipperReceiver;
import com.facebook.flipper.plugins.uidebugger.core.Context;
import kotlin.Metadata;
/* compiled from: Command.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/commands/Command;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/flipper/plugins/uidebugger/core/Context;", "(Lcom/facebook/flipper/plugins/uidebugger/core/Context;)V", "getContext", "()Lcom/facebook/flipper/plugins/uidebugger/core/Context;", "execute", "", "params", "Lcom/facebook/flipper/core/FlipperObject;", "response", "Lcom/facebook/flipper/core/FlipperResponder;", "identifier", "", "receiver", "Lcom/facebook/flipper/core/FlipperReceiver;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Command {
    private final Context context;

    public Command(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.context = context;
    }

    public abstract void execute(FlipperObject flipperObject, FlipperResponder flipperResponder);

    public final Context getContext() {
        return this.context;
    }

    public abstract String identifier();

    public FlipperReceiver receiver() {
        return new MainThreadFlipperReceiver() { // from class: com.facebook.flipper.plugins.uidebugger.commands.Command$receiver$1
            @Override // com.facebook.flipper.plugins.common.MainThreadFlipperReceiver
            public void onReceiveOnMainThread(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                z65.h(flipperObject, "params");
                z65.h(flipperResponder, "responder");
                Command.this.execute(flipperObject, flipperResponder);
            }
        };
    }
}
