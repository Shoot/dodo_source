package com.dodopizza.kustoworker;

import com.dodopizza.kustoworker.CommonUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KustoInitialized.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Loz3;", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$replayFromStorage$1", f = "KustoInitialized.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InitializedKustoImpl$replayFromStorage$1 extends f3b implements Function2<Integer, cv1<? super oz3<? extends CommonUtils.Done>>, Object> {
    private /* synthetic */ int I$0;
    int label;
    final /* synthetic */ InitializedKustoImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializedKustoImpl$replayFromStorage$1(InitializedKustoImpl initializedKustoImpl, cv1 cv1Var) {
        super(2, cv1Var);
        this.this$0 = initializedKustoImpl;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        z65.h(cv1Var, "completion");
        InitializedKustoImpl$replayFromStorage$1 initializedKustoImpl$replayFromStorage$1 = new InitializedKustoImpl$replayFromStorage$1(this.this$0, cv1Var);
        Number number = (Number) obj;
        number.intValue();
        initializedKustoImpl$replayFromStorage$1.I$0 = number.intValue();
        return initializedKustoImpl$replayFromStorage$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, cv1<? super oz3<? extends CommonUtils.Done>> cv1Var) {
        return ((InitializedKustoImpl$replayFromStorage$1) create(num, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        KustoStorage kustoStorage;
        KustoSender kustoSender;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            int i = this.I$0;
            kustoStorage = this.this$0.kustoStorage;
            List<KustoMessage> messages = kustoStorage.getMessages(i);
            InitializedKustoImpl initializedKustoImpl = this.this$0;
            initializedKustoImpl.writeDebugLog("Loaded " + messages.size() + " messages from storage");
            if (messages.isEmpty()) {
                this.this$0.writeDebugLog("No messages to send.");
                this.this$0.writeDebugLog("Complete to replay messages from storage");
                return wz3.A(CommonUtils.Done.INSTANCE);
            }
            InitializedKustoImpl initializedKustoImpl2 = this.this$0;
            initializedKustoImpl2.writeDebugLog("Try to send message batch size = " + messages.size());
            kustoSender = this.this$0.kustoSender;
            return wz3.x(wz3.F(wz3.A(kustoSender.sendMessages(messages)), new InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$1(null, this)), new InitializedKustoImpl$replayFromStorage$1$invokeSuspend$$inlined$let$lambda$2(null, this));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
