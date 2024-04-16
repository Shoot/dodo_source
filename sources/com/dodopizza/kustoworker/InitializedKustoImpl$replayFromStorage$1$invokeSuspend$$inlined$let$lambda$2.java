package com.dodopizza.kustoworker;

import com.dodopizza.kustoworker.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: KustoInitialized.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/kustoworker/MessagesSent;", "result", "Loz3;", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/dodopizza/kustoworker/InitializedKustoImpl$replayFromStorage$1$1$2", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$replayFromStorage$1$1$2", f = "KustoInitialized.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$2 extends f3b implements Function2<MessagesSent, cv1<? super oz3<? extends CommonUtils.Done>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InitializedKustoImpl$replayFromStorage$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$2(cv1 cv1Var, InitializedKustoImpl$replayFromStorage$1 initializedKustoImpl$replayFromStorage$1) {
        super(2, cv1Var);
        this.this$0 = initializedKustoImpl$replayFromStorage$1;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        z65.h(cv1Var, "completion");
        InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$2 initializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$2 = new InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$2(cv1Var, this.this$0);
        initializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$2.L$0 = obj;
        return initializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MessagesSent messagesSent, cv1<? super oz3<? extends CommonUtils.Done>> cv1Var) {
        return ((InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$2) create(messagesSent, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        KustoStorage kustoStorage;
        int w;
        int w2;
        int i;
        oz3 replayFromStorage;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            MessagesSent messagesSent = (MessagesSent) this.L$0;
            kustoStorage = this.this$0.this$0.kustoStorage;
            List<KustoMessageMeta> messages = messagesSent.getMessages();
            w = lc1.w(messages, 10);
            ArrayList arrayList = new ArrayList(w);
            for (KustoMessageMeta kustoMessageMeta : messages) {
                arrayList.add(kustoMessageMeta.getId());
            }
            kustoStorage.removeMessages(arrayList);
            InitializedKustoImpl initializedKustoImpl = this.this$0.this$0;
            StringBuilder sb = new StringBuilder();
            sb.append("Messages ");
            List<KustoMessageMeta> messages2 = messagesSent.getMessages();
            w2 = lc1.w(messages2, 10);
            ArrayList arrayList2 = new ArrayList(w2);
            for (KustoMessageMeta kustoMessageMeta2 : messages2) {
                arrayList2.add(kustoMessageMeta2.getId());
            }
            sb.append(arrayList2);
            sb.append(" removed from storage");
            initializedKustoImpl.writeDebugLog(sb.toString());
            int size = messagesSent.getMessages().size();
            i = this.this$0.this$0.maxBatchSize;
            if (size < i) {
                this.this$0.this$0.writeDebugLog("Complete to replay messages from storage");
                return wz3.A(CommonUtils.Done.INSTANCE);
            }
            this.this$0.this$0.writeDebugLog("Replay next messages from storage");
            replayFromStorage = this.this$0.this$0.replayFromStorage();
            return replayFromStorage;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
