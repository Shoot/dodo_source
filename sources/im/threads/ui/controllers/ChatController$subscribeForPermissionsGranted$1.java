package im.threads.ui.controllers;

import im.threads.business.chatUpdates.ChatUpdateProcessor;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$subscribeForPermissionsGranted$1", f = "ChatController.kt", l = {1752}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatController$subscribeForPermissionsGranted$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeForPermissionsGranted$1(ChatController chatController, cv1<? super ChatController$subscribeForPermissionsGranted$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatController;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatController$subscribeForPermissionsGranted$1(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatController$subscribeForPermissionsGranted$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        ChatUpdateProcessor chatUpdateProcessor;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vk9.b(obj);
        } else {
            vk9.b(obj);
            chatUpdateProcessor = this.this$0.getChatUpdateProcessor();
            cr6<Integer> grantedPermissionsFlow = chatUpdateProcessor.getGrantedPermissionsFlow();
            final ChatController chatController = this.this$0;
            pz3<? super Integer> pz3Var = new pz3() { // from class: im.threads.ui.controllers.ChatController$subscribeForPermissionsGranted$1.1
                @Override // defpackage.pz3
                public /* bridge */ /* synthetic */ Object emit(Object obj2, cv1 cv1Var) {
                    return emit(((Number) obj2).intValue(), cv1Var);
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
                    r1 = r1.fragment;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(int r1, defpackage.cv1<? super kotlin.Unit> r2) {
                    /*
                        r0 = this;
                        r2 = 204(0xcc, float:2.86E-43)
                        if (r2 != r1) goto L17
                        im.threads.ui.controllers.ChatController r1 = im.threads.ui.controllers.ChatController.this
                        java.lang.ref.WeakReference r1 = im.threads.ui.controllers.ChatController.access$getFragment$p(r1)
                        if (r1 == 0) goto L17
                        java.lang.Object r1 = r1.get()
                        im.threads.ui.fragments.ChatFragment r1 = (im.threads.ui.fragments.ChatFragment) r1
                        if (r1 == 0) goto L17
                        r1.initRecordButtonState$threads_release()
                    L17:
                        kotlin.Unit r1 = kotlin.Unit.a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.controllers.ChatController$subscribeForPermissionsGranted$1.AnonymousClass1.emit(int, cv1):java.lang.Object");
                }
            };
            this.label = 1;
            if (grantedPermissionsFlow.collect(pz3Var, this) == d) {
                return d;
            }
        }
        throw new KotlinNothingValueException();
    }
}
