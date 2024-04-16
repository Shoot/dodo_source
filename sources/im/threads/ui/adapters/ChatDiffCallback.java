package im.threads.ui.adapters;

import androidx.recyclerview.widget.e;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultPhrase;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ChatDiffCallback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, d2 = {"Lim/threads/ui/adapters/ChatDiffCallback;", "Landroidx/recyclerview/widget/e$b;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "Lim/threads/business/models/ChatItem;", "oldList", "Ljava/util/List;", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatDiffCallback extends e.b {
    private final List<ChatItem> newList;
    private final List<ChatItem> oldList;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatDiffCallback(List<? extends ChatItem> list, List<? extends ChatItem> list2) {
        z65.h(list, "oldList");
        z65.h(list2, "newList");
        this.oldList = list;
        this.newList = list2;
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areContentsTheSame(int i, int i2) {
        boolean z;
        ChatItem chatItem = this.oldList.get(i);
        ChatItem chatItem2 = this.newList.get(i2);
        if (!(chatItem instanceof ConsultPhrase) || !(chatItem2 instanceof ConsultPhrase) || ((ConsultPhrase) chatItem).isAvatarVisible() == ((ConsultPhrase) chatItem2).isAvatarVisible()) {
            z = true;
        } else {
            z = false;
        }
        if (!p57.a(this.oldList.get(i), this.newList.get(i2)) || !z) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areItemsTheSame(int i, int i2) {
        return this.oldList.get(i).isTheSameItem(this.newList.get(i2));
    }

    @Override // androidx.recyclerview.widget.e.b
    public int getNewListSize() {
        return this.newList.size();
    }

    @Override // androidx.recyclerview.widget.e.b
    public int getOldListSize() {
        return this.oldList.size();
    }
}
