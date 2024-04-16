package im.threads.ui.adapters.utils;

import im.threads.business.models.ChatItem;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.UserPhrase;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.ui.adapters.ChatAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
/* compiled from: SendingStatusObserver.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.adapters.utils.SendingStatusObserver$startObserving$1$observedMessagesDef$1", f = "SendingStatusObserver.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SendingStatusObserver$startObserving$1$observedMessagesDef$1 extends f3b implements Function2<qx1, cv1<? super ArrayList<Integer>>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SendingStatusObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendingStatusObserver$startObserving$1$observedMessagesDef$1(SendingStatusObserver sendingStatusObserver, cv1<? super SendingStatusObserver$startObserving$1$observedMessagesDef$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = sendingStatusObserver;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new SendingStatusObserver$startObserving$1$observedMessagesDef$1(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super ArrayList<Integer>> cv1Var) {
        return ((SendingStatusObserver$startObserving$1$observedMessagesDef$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        WeakReference weakReference;
        ArrayList<ChatItem> list;
        ArrayList arrayList;
        IntRange m;
        SendingStatusObserver sendingStatusObserver;
        Iterator<Integer> it;
        ArrayList<ChatItem> arrayList2;
        UserPhrase userPhrase;
        long j;
        DatabaseHolder database;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                it = (Iterator) this.L$3;
                arrayList = (ArrayList) this.L$2;
                arrayList2 = (ArrayList) this.L$1;
                sendingStatusObserver = (SendingStatusObserver) this.L$0;
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            weakReference = this.this$0.chatAdapterRef;
            ChatAdapter chatAdapter = (ChatAdapter) weakReference.get();
            if (chatAdapter == null || (list = chatAdapter.getList()) == null) {
                return null;
            }
            SendingStatusObserver sendingStatusObserver2 = this.this$0;
            arrayList = new ArrayList();
            m = kc1.m(list);
            sendingStatusObserver = sendingStatusObserver2;
            it = m.iterator();
            arrayList2 = list;
        }
        while (it.hasNext()) {
            int b = ((q55) it).b();
            if (b < arrayList2.size()) {
                ChatItem chatItem = arrayList2.get(b);
                if (chatItem instanceof UserPhrase) {
                    userPhrase = (UserPhrase) chatItem;
                } else {
                    userPhrase = null;
                }
                if (userPhrase != null) {
                    long time = new Date().getTime();
                    if (userPhrase.getSentState().compareTo(MessageStatus.SENT) < 0) {
                        long timeStamp = time - userPhrase.getTimeStamp();
                        j = sendingStatusObserver.interval;
                        if (timeStamp > j) {
                            MessageStatus messageStatus = MessageStatus.FAILED;
                            database = sendingStatusObserver.getDatabase();
                            database.setStateOfUserPhraseByCorrelationId(userPhrase.getId(), messageStatus);
                            userPhrase.setSentState(messageStatus);
                            arrayList.add(nf0.c(b));
                            t46 c = v33.c();
                            SendingStatusObserver$startObserving$1$observedMessagesDef$1$1$1$1$1 sendingStatusObserver$startObserving$1$observedMessagesDef$1$1$1$1$1 = new SendingStatusObserver$startObserving$1$observedMessagesDef$1$1$1$1$1(sendingStatusObserver, userPhrase, null);
                            this.L$0 = sendingStatusObserver;
                            this.L$1 = arrayList2;
                            this.L$2 = arrayList;
                            this.L$3 = it;
                            this.label = 1;
                            if (qh0.g(c, sendingStatusObserver$startObserving$1$observedMessagesDef$1$1$1$1$1, this) == d) {
                                return d;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return arrayList;
    }
}
