package im.threads.ui.fragments;

import im.threads.ui.controllers.ChatController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/ui/controllers/ChatController;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatFragment$chatController$2 extends ej5 implements Function0<ChatController> {
    public static final ChatFragment$chatController$2 INSTANCE = new ChatFragment$chatController$2();

    ChatFragment$chatController$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ChatController invoke() {
        return ChatController.Companion.getInstance();
    }
}
