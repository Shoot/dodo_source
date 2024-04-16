package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultInfo;
import im.threads.business.transport.HistoryLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "Lim/threads/business/models/ConsultInfo;", "", "Lim/threads/business/models/ChatItem;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$loadHistory$2$2 extends ej5 implements Function1<Pair<? extends ConsultInfo, ? extends List<? extends ChatItem>>, Unit> {
    final /* synthetic */ boolean $applyUiChanges;
    final /* synthetic */ HistoryLoader.HistoryLoadingCallback $callback;
    final /* synthetic */ Boolean $isAfterAnchor;
    final /* synthetic */ boolean $loadToTheEnd;
    final /* synthetic */ Function1<List<? extends ChatItem>, Boolean> $untilCondition;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatController$loadHistory$2$2(ChatController chatController, Function1<? super List<? extends ChatItem>, Boolean> function1, boolean z, boolean z2, Boolean bool, HistoryLoader.HistoryLoadingCallback historyLoadingCallback) {
        super(1);
        this.this$0 = chatController;
        this.$untilCondition = function1;
        this.$loadToTheEnd = z;
        this.$applyUiChanges = z2;
        this.$isAfterAnchor = bool;
        this.$callback = historyLoadingCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends ConsultInfo, ? extends List<? extends ChatItem>> pair) {
        invoke2((Pair<ConsultInfo, ? extends List<? extends ChatItem>>) pair);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        r5 = r14.this$0.fragment;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(kotlin.Pair<im.threads.business.models.ConsultInfo, ? extends java.util.List<? extends im.threads.business.models.ChatItem>> r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.controllers.ChatController$loadHistory$2$2.invoke2(kotlin.Pair):void");
    }
}
