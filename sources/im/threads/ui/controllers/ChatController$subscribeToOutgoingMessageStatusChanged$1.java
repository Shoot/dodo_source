package im.threads.ui.controllers;

import im.threads.business.transport.threadsGate.responses.Status;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lim/threads/business/transport/threadsGate/responses/Status;", "it", "Lls8;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)Lls8;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatController$subscribeToOutgoingMessageStatusChanged$1 extends ej5 implements Function1<List<? extends Status>, ls8<? extends Status>> {
    public static final ChatController$subscribeToOutgoingMessageStatusChanged$1 INSTANCE = new ChatController$subscribeToOutgoingMessageStatusChanged$1();

    ChatController$subscribeToOutgoingMessageStatusChanged$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ls8<? extends Status> invoke2(List<Status> list) {
        z65.h(list, "it");
        return l04.B(list);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ls8<? extends Status> invoke(List<? extends Status> list) {
        return invoke2((List<Status>) list);
    }
}
