package im.threads.ui.fragments;

import im.threads.business.models.ChatItem;
import im.threads.ui.adapters.ChatAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatFragment$addItemsToChat$1$1 extends ej5 implements Function0<Unit> {
    final /* synthetic */ boolean $isAnimationEnabled;
    final /* synthetic */ boolean $isChatReady;
    final /* synthetic */ List<ChatItem> $it;
    final /* synthetic */ gr5 $listUpdatedCallback;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.ui.fragments.ChatFragment$addItemsToChat$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends ej5 implements Function0<Unit> {
        final /* synthetic */ boolean $isAnimationEnabled;
        final /* synthetic */ boolean $isChatReady;
        final /* synthetic */ List<ChatItem> $it;
        final /* synthetic */ gr5 $listUpdatedCallback;
        final /* synthetic */ ChatFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ChatFragment chatFragment, List<? extends ChatItem> list, gr5 gr5Var, boolean z, boolean z2) {
            super(0);
            this.this$0 = chatFragment;
            this.$it = list;
            this.$listUpdatedCallback = gr5Var;
            this.$isAnimationEnabled = z;
            this.$isChatReady = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ChatAdapter chatAdapter = this.this$0.chatAdapter;
            if (chatAdapter != null) {
                chatAdapter.addItems(this.$it, this.$listUpdatedCallback, this.$isAnimationEnabled);
            }
            if (this.$isChatReady) {
                ChatFragment.hideErrorView$threads_release$default(this.this$0, false, 1, null);
                this.this$0.hideProgressBar();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatFragment$addItemsToChat$1$1(ChatFragment chatFragment, List<? extends ChatItem> list, gr5 gr5Var, boolean z, boolean z2) {
        super(0);
        this.this$0 = chatFragment;
        this.$it = list;
        this.$listUpdatedCallback = gr5Var;
        this.$isAnimationEnabled = z;
        this.$isChatReady = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getChatController().setFormattedDurations$threads_release(this.$it, this.this$0.mediaMetadataRetriever, new AnonymousClass1(this.this$0, this.$it, this.$listUpdatedCallback, this.$isAnimationEnabled, this.$isChatReady));
    }
}
