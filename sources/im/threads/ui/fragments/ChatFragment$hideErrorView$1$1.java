package im.threads.ui.fragments;

import im.threads.databinding.EccFragmentChatBinding;
import im.threads.ui.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatFragment$hideErrorView$1$1 extends ej5 implements Function1<Boolean, Unit> {
    final /* synthetic */ boolean $showList;
    final /* synthetic */ EccFragmentChatBinding $this_apply;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$hideErrorView$1$1(boolean z, ChatFragment chatFragment, EccFragmentChatBinding eccFragmentChatBinding) {
        super(1);
        this.$showList = z;
        this.this$0 = chatFragment;
        this.$this_apply = eccFragmentChatBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.a;
    }

    public final void invoke(boolean z) {
        if (z && this.$showList) {
            ChatFragment chatFragment = this.this$0;
            chatFragment.showWelcomeScreen$threads_release(chatFragment.getChatController().isChatReady$threads_release());
        } else if (this.$showList) {
            ViewExtensionsKt.visible(this.$this_apply.chatItemsRecycler);
        }
    }
}
