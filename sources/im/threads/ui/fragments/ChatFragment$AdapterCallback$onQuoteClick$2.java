package im.threads.ui.fragments;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import im.threads.business.models.ChatItem;
import im.threads.ui.adapters.ChatAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", StatisticManager.LIST, "", "Lim/threads/business/models/ChatItem;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChatFragment$AdapterCallback$onQuoteClick$2 extends ej5 implements Function1<List<? extends ChatItem>, Unit> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$AdapterCallback$onQuoteClick$2(ChatFragment chatFragment) {
        super(1);
        this.this$0 = chatFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends ChatItem> list) {
        invoke2(list);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends ChatItem> list) {
        ChatAdapter chatAdapter = this.this$0.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.removeHighlight();
        }
        ChatFragment.addItemsToChat$default(this.this$0, list, null, false, 6, null);
    }
}
