package im.threads.business.chatUpdates;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatUpdateProcessor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.chatUpdates.ChatUpdateProcessor$postGrantedPermissions$1", f = "ChatUpdateProcessor.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatUpdateProcessor$postGrantedPermissions$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ int $permissionsRequestCode;
    int label;
    final /* synthetic */ ChatUpdateProcessor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatUpdateProcessor$postGrantedPermissions$1(ChatUpdateProcessor chatUpdateProcessor, int i, cv1<? super ChatUpdateProcessor$postGrantedPermissions$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatUpdateProcessor;
        this.$permissionsRequestCode = i;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatUpdateProcessor$postGrantedPermissions$1(this.this$0, this.$permissionsRequestCode, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatUpdateProcessor$postGrantedPermissions$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
            cr6<Integer> grantedPermissionsFlow = this.this$0.getGrantedPermissionsFlow();
            Integer c = nf0.c(this.$permissionsRequestCode);
            this.label = 1;
            if (grantedPermissionsFlow.emit(c, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
