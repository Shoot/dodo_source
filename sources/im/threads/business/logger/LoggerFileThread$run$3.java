package im.threads.business.logger;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: LoggerFileThread.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.logger.LoggerFileThread$run$3", f = "LoggerFileThread.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LoggerFileThread$run$3 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoggerFileThread$run$3(cv1<? super LoggerFileThread$run$3> cv1Var) {
        super(2, cv1Var);
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new LoggerFileThread$run$3(cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((LoggerFileThread$run$3) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
            cr6<Boolean> flushIsFinishedFlow = LoggerFileThread.Companion.getFlushIsFinishedFlow();
            Boolean a = nf0.a(true);
            this.label = 1;
            if (flushIsFinishedFlow.emit(a, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
