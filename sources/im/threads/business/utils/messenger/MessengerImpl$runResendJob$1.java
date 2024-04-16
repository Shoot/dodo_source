package im.threads.business.utils.messenger;

import im.threads.business.config.BaseConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessengerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.utils.messenger.MessengerImpl$runResendJob$1", f = "MessengerImpl.kt", l = {236}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MessengerImpl$runResendJob$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessengerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerImpl$runResendJob$1(MessengerImpl messengerImpl, cv1<? super MessengerImpl$runResendJob$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = messengerImpl;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        MessengerImpl$runResendJob$1 messengerImpl$runResendJob$1 = new MessengerImpl$runResendJob$1(this.this$0, cv1Var);
        messengerImpl$runResendJob$1.L$0 = obj;
        return messengerImpl$runResendJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((MessengerImpl$runResendJob$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        qx1 qx1Var;
        boolean z;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                qx1Var = (qx1) this.L$0;
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            qx1Var = (qx1) this.L$0;
        }
        while (rx1.g(qx1Var)) {
            z = this.this$0.isViewActive;
            if (z) {
                this.this$0.proceedUnsentMessages();
            }
            long resendIntervalMillis = BaseConfig.Companion.getInstance().getRequestConfig().getSocketClientSettings().getResendIntervalMillis();
            this.L$0 = qx1Var;
            this.label = 1;
            if (xt2.a(resendIntervalMillis, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
