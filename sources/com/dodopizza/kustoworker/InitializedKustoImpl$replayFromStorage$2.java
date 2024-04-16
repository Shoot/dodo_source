package com.dodopizza.kustoworker;

import com.dodopizza.kustoworker.CommonUtils;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KustoInitialized.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpz3;", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "", e.a, "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$replayFromStorage$2", f = "KustoInitialized.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InitializedKustoImpl$replayFromStorage$2 extends f3b implements y84<pz3<? super CommonUtils.Done>, Throwable, cv1<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    private /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InitializedKustoImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializedKustoImpl$replayFromStorage$2(InitializedKustoImpl initializedKustoImpl, cv1 cv1Var) {
        super(3, cv1Var);
        this.this$0 = initializedKustoImpl;
    }

    public final cv1<Unit> create(pz3<? super CommonUtils.Done> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
        z65.h(pz3Var, "$this$create");
        z65.h(th, e.a);
        z65.h(cv1Var, "continuation");
        InitializedKustoImpl$replayFromStorage$2 initializedKustoImpl$replayFromStorage$2 = new InitializedKustoImpl$replayFromStorage$2(this.this$0, cv1Var);
        initializedKustoImpl$replayFromStorage$2.L$0 = pz3Var;
        initializedKustoImpl$replayFromStorage$2.L$1 = th;
        return initializedKustoImpl$replayFromStorage$2;
    }

    @Override // defpackage.y84
    public final Object invoke(pz3<? super CommonUtils.Done> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
        return ((InitializedKustoImpl$replayFromStorage$2) create(pz3Var, th, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
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
            InitializedKustoImpl initializedKustoImpl = this.this$0;
            initializedKustoImpl.writeDebugLog("Failed to replay messages from database: " + ((Throwable) this.L$1).getMessage());
            CommonUtils.Done done = CommonUtils.Done.INSTANCE;
            this.L$0 = null;
            this.label = 1;
            if (((pz3) this.L$0).emit(done, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
