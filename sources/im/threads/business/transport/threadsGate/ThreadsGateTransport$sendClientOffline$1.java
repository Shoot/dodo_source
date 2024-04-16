package im.threads.business.transport.threadsGate;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: ThreadsGateTransport.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.transport.threadsGate.ThreadsGateTransport$sendClientOffline$1", f = "ThreadsGateTransport.kt", l = {279}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ThreadsGateTransport$sendClientOffline$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callBack;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ThreadsGateTransport this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadsGateTransport$sendClientOffline$1(ThreadsGateTransport threadsGateTransport, Function0<Unit> function0, cv1<? super ThreadsGateTransport$sendClientOffline$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = threadsGateTransport;
        this.$callBack = function0;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        ThreadsGateTransport$sendClientOffline$1 threadsGateTransport$sendClientOffline$1 = new ThreadsGateTransport$sendClientOffline$1(this.this$0, this.$callBack, cv1Var);
        threadsGateTransport$sendClientOffline$1.L$0 = obj;
        return threadsGateTransport$sendClientOffline$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ThreadsGateTransport$sendClientOffline$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vk9.b(obj);
        } else {
            vk9.b(obj);
            final qx1 qx1Var = (qx1) this.L$0;
            fr6 fr6Var = this.this$0.logoutCorrelationId;
            final Function0<Unit> function0 = this.$callBack;
            pz3 pz3Var = new pz3() { // from class: im.threads.business.transport.threadsGate.ThreadsGateTransport$sendClientOffline$1.1
                @Override // defpackage.pz3
                public /* bridge */ /* synthetic */ Object emit(Object obj2, cv1 cv1Var) {
                    return emit((String) obj2, (cv1<? super Unit>) cv1Var);
                }

                public final Object emit(String str, cv1<? super Unit> cv1Var) {
                    if (str == null && rx1.g(qx1.this)) {
                        function0.invoke();
                        rx1.d(qx1.this, null, 1, null);
                    }
                    return Unit.a;
                }
            };
            this.label = 1;
            if (fr6Var.collect(pz3Var, this) == d) {
                return d;
            }
        }
        throw new KotlinNothingValueException();
    }
}
