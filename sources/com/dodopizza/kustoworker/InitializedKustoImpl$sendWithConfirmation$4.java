package com.dodopizza.kustoworker;

import com.dodopizza.kustoworker.CommonUtils;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KustoInitialized.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpz3;", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "", e.a, "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$4", f = "KustoInitialized.kt", l = {240}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InitializedKustoImpl$sendWithConfirmation$4 extends f3b implements y84<pz3<? super CommonUtils.Done>, Throwable, cv1<? super Unit>, Object> {
    final /* synthetic */ List $messages;
    private /* synthetic */ Object L$0;
    private /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InitializedKustoImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializedKustoImpl$sendWithConfirmation$4(InitializedKustoImpl initializedKustoImpl, List list, cv1 cv1Var) {
        super(3, cv1Var);
        this.this$0 = initializedKustoImpl;
        this.$messages = list;
    }

    public final cv1<Unit> create(pz3<? super CommonUtils.Done> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
        z65.h(pz3Var, "$this$create");
        z65.h(th, e.a);
        z65.h(cv1Var, "continuation");
        InitializedKustoImpl$sendWithConfirmation$4 initializedKustoImpl$sendWithConfirmation$4 = new InitializedKustoImpl$sendWithConfirmation$4(this.this$0, this.$messages, cv1Var);
        initializedKustoImpl$sendWithConfirmation$4.L$0 = pz3Var;
        initializedKustoImpl$sendWithConfirmation$4.L$1 = th;
        return initializedKustoImpl$sendWithConfirmation$4;
    }

    @Override // defpackage.y84
    public final Object invoke(pz3<? super CommonUtils.Done> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
        return ((InitializedKustoImpl$sendWithConfirmation$4) create(pz3Var, th, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        int w;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            pz3 pz3Var = (pz3) this.L$0;
            Throwable th = (Throwable) this.L$1;
            InitializedKustoImpl initializedKustoImpl = this.this$0;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to send messages ");
            List<KustoMessage> list = this.$messages;
            w = lc1.w(list, 10);
            ArrayList arrayList = new ArrayList(w);
            for (KustoMessage kustoMessage : list) {
                arrayList.add(kustoMessage.getId());
            }
            sb.append(arrayList);
            sb.append(" with error ");
            sb.append(th.getMessage());
            initializedKustoImpl.writeDebugLog(sb.toString());
            CommonUtils.Done done = CommonUtils.Done.INSTANCE;
            this.L$0 = null;
            this.label = 1;
            if (pz3Var.emit(done, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
