package im.threads.ui.controllers;

import im.threads.business.config.BaseConfig;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.secureDatabase.DatabaseHolder;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: QuickAnswerController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lim/threads/business/models/ConsultPhrase;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.QuickAnswerController$onBind$1$onLoaded$1$lastConsultPhraseDef$1", f = "QuickAnswerController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QuickAnswerController$onBind$1$onLoaded$1$lastConsultPhraseDef$1 extends f3b implements Function2<qx1, cv1<? super ConsultPhrase>, Object> {
    final /* synthetic */ List<ChatItem> $items;
    int label;
    final /* synthetic */ QuickAnswerController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuickAnswerController$onBind$1$onLoaded$1$lastConsultPhraseDef$1(QuickAnswerController quickAnswerController, List<? extends ChatItem> list, cv1<? super QuickAnswerController$onBind$1$onLoaded$1$lastConsultPhraseDef$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = quickAnswerController;
        this.$items = list;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new QuickAnswerController$onBind$1$onLoaded$1$lastConsultPhraseDef$1(this.this$0, this.$items, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super ConsultPhrase> cv1Var) {
        return ((QuickAnswerController$onBind$1$onLoaded$1$lastConsultPhraseDef$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        DatabaseHolder database;
        DatabaseHolder database2;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            database = this.this$0.getDatabase();
            database.putChatItems(this.$items);
            database2 = this.this$0.getDatabase();
            List<String> unreadMessagesUuid = database2.getUnreadMessagesUuid();
            if (!unreadMessagesUuid.isEmpty()) {
                BaseConfig.Companion.getInstance().transport.markMessagesAsRead(unreadMessagesUuid);
            }
            List<ChatItem> list = this.$items;
            ListIterator<ChatItem> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                ChatItem previous = listIterator.previous();
                if (previous instanceof ConsultPhrase) {
                    if (previous instanceof ConsultPhrase) {
                        return (ConsultPhrase) previous;
                    }
                    return null;
                }
            }
            throw new NoSuchElementException("List contains no element matching the predicate.");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
