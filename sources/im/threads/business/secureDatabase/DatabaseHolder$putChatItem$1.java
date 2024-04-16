package im.threads.business.secureDatabase;

import im.threads.business.extensions.MutableLazy;
import im.threads.business.models.ChatItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatabaseHolder$putChatItem$1 extends ej5 implements Function0<Boolean> {
    final /* synthetic */ ChatItem $chatItem;
    final /* synthetic */ DatabaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseHolder$putChatItem$1(DatabaseHolder databaseHolder, ChatItem chatItem) {
        super(0);
        this.this$0 = databaseHolder;
        this.$chatItem = chatItem;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        MutableLazy mutableLazy;
        mutableLazy = this.this$0.myOpenHelper;
        return Boolean.valueOf(((ThreadsDbHelper) mutableLazy.getValue()).putChatItem(this.$chatItem));
    }
}
