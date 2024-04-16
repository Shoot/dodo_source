package im.threads.business.utils;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import im.threads.business.models.ChatItem;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
/* compiled from: ChatItemListFinder.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0007J \u0010\t\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\n"}, d2 = {"Lim/threads/business/utils/ChatItemListFinder;", "", "()V", "indexOf", "", StatisticManager.LIST, "", "Lim/threads/business/models/ChatItem;", "chatItem", "lastIndexOf", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatItemListFinder {
    public static final ChatItemListFinder INSTANCE = new ChatItemListFinder();

    private ChatItemListFinder() {
    }

    public static final int indexOf(List<? extends ChatItem> list, ChatItem chatItem) {
        z65.h(list, StatisticManager.LIST);
        z65.h(chatItem, "chatItem");
        int i = 0;
        for (ChatItem chatItem2 : list) {
            if (chatItem2 == null || !chatItem2.isTheSameItem(chatItem)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static final int lastIndexOf(List<? extends ChatItem> list, ChatItem chatItem) {
        z65.h(list, StatisticManager.LIST);
        z65.h(chatItem, "chatItem");
        ListIterator<? extends ChatItem> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            ChatItem previous = listIterator.previous();
            if (previous != null && previous.isTheSameItem(chatItem)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
}
