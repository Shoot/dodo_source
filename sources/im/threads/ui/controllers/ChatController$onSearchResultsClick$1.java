package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "items", "", "Lim/threads/business/models/ChatItem;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$onSearchResultsClick$1 extends ej5 implements Function1<List<? extends ChatItem>, Boolean> {
    final /* synthetic */ long $dateTimestamp;
    final /* synthetic */ String $uuid;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$onSearchResultsClick$1(long j, ChatController chatController, String str) {
        super(1);
        this.$dateTimestamp = j;
        this.this$0 = chatController;
        this.$uuid = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<? extends ChatItem> list) {
        boolean z;
        Object Z;
        int itemPositionByUuid;
        z65.h(list, "items");
        if (!list.isEmpty()) {
            Z = sc1.Z(list);
            if (((ChatItem) Z).getTimeStamp() >= this.$dateTimestamp) {
                itemPositionByUuid = this.this$0.getItemPositionByUuid(list, this.$uuid);
                if (itemPositionByUuid < 0) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
