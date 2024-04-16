package com.dodopizza.kustoworker;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: KustoInitialized.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "messagesSent", "Lcom/dodopizza/kustoworker/MessagesSent;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/dodopizza/kustoworker/InitializedKustoImpl$replayFromStorage$1$1$1"}, k = 3, mv = {1, 4, 2})
@nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$replayFromStorage$1$1$1", f = "KustoInitialized.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$1 extends f3b implements Function2<MessagesSent, cv1<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InitializedKustoImpl$replayFromStorage$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$1(cv1 cv1Var, InitializedKustoImpl$replayFromStorage$1 initializedKustoImpl$replayFromStorage$1) {
        super(2, cv1Var);
        this.this$0 = initializedKustoImpl$replayFromStorage$1;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        z65.h(cv1Var, "completion");
        InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$1 initializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$1 = new InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$1(cv1Var, this.this$0);
        initializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$1.L$0 = obj;
        return initializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MessagesSent messagesSent, cv1<? super Unit> cv1Var) {
        return ((InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$1) create(messagesSent, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        int w;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            InitializedKustoImpl initializedKustoImpl = this.this$0.this$0;
            StringBuilder sb = new StringBuilder();
            sb.append("Messages ");
            List<KustoMessageMeta> messages = ((MessagesSent) this.L$0).getMessages();
            w = lc1.w(messages, 10);
            ArrayList arrayList = new ArrayList(w);
            for (KustoMessageMeta kustoMessageMeta : messages) {
                arrayList.add(kustoMessageMeta.getId());
            }
            sb.append(arrayList);
            sb.append(" successfully sent");
            initializedKustoImpl.writeDebugLog(sb.toString());
            return Unit.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
