package com.dodopizza.kustoworker;

import com.dodopizza.kustoworker.CommonUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KustoInitialized.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/dodopizza/kustoworker/Channel;", "it", "Loz3;", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$1", f = "KustoInitialized.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InitializedKustoImpl$initSenderStream$1 extends f3b implements Function2<Channel, cv1<? super oz3<? extends CommonUtils.Done>>, Object> {
    int label;
    final /* synthetic */ InitializedKustoImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializedKustoImpl$initSenderStream$1(InitializedKustoImpl initializedKustoImpl, cv1 cv1Var) {
        super(2, cv1Var);
        this.this$0 = initializedKustoImpl;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        z65.h(cv1Var, "completion");
        return new InitializedKustoImpl$initSenderStream$1(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Channel channel, cv1<? super oz3<? extends CommonUtils.Done>> cv1Var) {
        return ((InitializedKustoImpl$initSenderStream$1) create(channel, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        oz3 replayFromStorage;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            this.this$0.writeDebugLog("Try to replay messages from storage");
            replayFromStorage = this.this$0.replayFromStorage();
            return replayFromStorage;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
