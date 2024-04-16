package com.dodopizza.kustoworker;

import com.dodopizza.kustoworker.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KustoInitialized.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$3", f = "KustoInitialized.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InitializedKustoImpl$sendWithConfirmation$3 extends f3b implements Function2<CommonUtils.Done, cv1<? super Unit>, Object> {
    final /* synthetic */ List $messages;
    int label;
    final /* synthetic */ InitializedKustoImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializedKustoImpl$sendWithConfirmation$3(InitializedKustoImpl initializedKustoImpl, List list, cv1 cv1Var) {
        super(2, cv1Var);
        this.this$0 = initializedKustoImpl;
        this.$messages = list;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        z65.h(cv1Var, "completion");
        return new InitializedKustoImpl$sendWithConfirmation$3(this.this$0, this.$messages, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CommonUtils.Done done, cv1<? super Unit> cv1Var) {
        return ((InitializedKustoImpl$sendWithConfirmation$3) create(done, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        int w;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            InitializedKustoImpl initializedKustoImpl = this.this$0;
            StringBuilder sb = new StringBuilder();
            sb.append("Successfully sent messages ");
            List<KustoMessage> list = this.$messages;
            w = lc1.w(list, 10);
            ArrayList arrayList = new ArrayList(w);
            for (KustoMessage kustoMessage : list) {
                arrayList.add(kustoMessage.getId());
            }
            sb.append(arrayList);
            initializedKustoImpl.writeDebugLog(sb.toString());
            return Unit.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
