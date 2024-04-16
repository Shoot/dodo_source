package im.threads.business.controllers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: UnreadMessagesController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.controllers.UnreadMessagesController$executeIfHumanMessageFound$1$1$2", f = "UnreadMessagesController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class UnreadMessagesController$executeIfHumanMessageFound$1$1$2 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $block;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreadMessagesController$executeIfHumanMessageFound$1$1$2(Function0<Unit> function0, cv1<? super UnreadMessagesController$executeIfHumanMessageFound$1$1$2> cv1Var) {
        super(2, cv1Var);
        this.$block = function0;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new UnreadMessagesController$executeIfHumanMessageFound$1$1$2(this.$block, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((UnreadMessagesController$executeIfHumanMessageFound$1$1$2) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            this.$block.invoke();
            return Unit.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
