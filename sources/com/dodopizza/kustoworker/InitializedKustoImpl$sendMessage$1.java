package com.dodopizza.kustoworker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: KustoInitialized.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqx1;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$sendMessage$1", f = "KustoInitialized.kt", l = {139, 140}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class InitializedKustoImpl$sendMessage$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ MessageReceived $event;
    int label;
    final /* synthetic */ InitializedKustoImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializedKustoImpl$sendMessage$1(InitializedKustoImpl initializedKustoImpl, MessageReceived messageReceived, cv1 cv1Var) {
        super(2, cv1Var);
        this.this$0 = initializedKustoImpl;
        this.$event = messageReceived;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        z65.h(cv1Var, "completion");
        return new InitializedKustoImpl$sendMessage$1(this.this$0, this.$event, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((InitializedKustoImpl$sendMessage$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        KustoPubSub kustoPubSub;
        KustoPubSub kustoPubSub2;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    vk9.b(obj);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vk9.b(obj);
        } else {
            vk9.b(obj);
            kustoPubSub = this.this$0.kustoPubSub;
            Channel channel = Channel.Sender;
            MessageReceived messageReceived = this.$event;
            this.label = 1;
            if (kustoPubSub.publish(channel, messageReceived, this) == d) {
                return d;
            }
        }
        kustoPubSub2 = this.this$0.kustoPubSub;
        Channel channel2 = Channel.Storage;
        MessageReceived messageReceived2 = this.$event;
        this.label = 2;
        if (kustoPubSub2.publish(channel2, messageReceived2, this) == d) {
            return d;
        }
        return Unit.a;
    }
}
