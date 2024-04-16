package im.threads.ui.fragments;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import im.threads.business.models.ChatItem;
import im.threads.business.models.Quote;
import im.threads.ui.adapters.ChatAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u00012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lim/threads/business/models/ChatItem;", "kotlin.jvm.PlatformType", StatisticManager.LIST, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChatFragment$AdapterCallback$onQuoteClick$1 extends ej5 implements Function1<List<? extends ChatItem>, List<? extends ChatItem>> {
    final /* synthetic */ Quote $quote;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$AdapterCallback$onQuoteClick$1(ChatFragment chatFragment, Quote quote) {
        super(1);
        this.this$0 = chatFragment;
        this.$quote = quote;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final List<ChatItem> invoke(List<? extends ChatItem> list) {
        ChatFragment.addItemsToChat$default(this.this$0, list, null, false, 6, null);
        ChatAdapter chatAdapter = this.this$0.chatAdapter;
        int itemHighlighted = chatAdapter != null ? chatAdapter.setItemHighlighted(this.$quote.getUuid()) : -1;
        if (itemHighlighted != -1) {
            this.this$0.scrollToPosition$threads_release(itemHighlighted, true);
        }
        return list;
    }
}
