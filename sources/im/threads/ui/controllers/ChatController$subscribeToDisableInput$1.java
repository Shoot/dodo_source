package im.threads.ui.controllers;

import im.threads.business.models.InputFieldEnableModel;
import im.threads.ui.config.Config;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$subscribeToDisableInput$1", f = "ChatController.kt", l = {470}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatController$subscribeToDisableInput$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeToDisableInput$1(ChatController chatController, cv1<? super ChatController$subscribeToDisableInput$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatController;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatController$subscribeToDisableInput$1(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatController$subscribeToDisableInput$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
            cr6<Boolean> cr6Var = Config.Companion.getInstance().disabledUserInput;
            final ChatController chatController = this.this$0;
            pz3<? super Boolean> pz3Var = new pz3() { // from class: im.threads.ui.controllers.ChatController$subscribeToDisableInput$1.1

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: ChatController.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @nn2(c = "im.threads.ui.controllers.ChatController$subscribeToDisableInput$1$1$1", f = "ChatController.kt", l = {}, m = "invokeSuspend")
                /* renamed from: im.threads.ui.controllers.ChatController$subscribeToDisableInput$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C03621 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ ChatController this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C03621(ChatController chatController, cv1<? super C03621> cv1Var) {
                        super(2, cv1Var);
                        this.this$0 = chatController;
                    }

                    @Override // defpackage.e70
                    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                        return new C03621(this.this$0, cv1Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                        return ((C03621) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                    }

                    @Override // defpackage.e70
                    public final Object invokeSuspend(Object obj) {
                        WeakReference weakReference;
                        WeakReference weakReference2;
                        ChatFragment chatFragment;
                        InputFieldEnableModel inputFieldEnableModel;
                        ChatFragment chatFragment2;
                        InputFieldEnableModel inputFieldEnableModel2;
                        c75.d();
                        if (this.label == 0) {
                            vk9.b(obj);
                            weakReference = this.this$0.fragment;
                            if (weakReference != null && (chatFragment2 = (ChatFragment) weakReference.get()) != null) {
                                inputFieldEnableModel2 = this.this$0.enableModel;
                                chatFragment2.updateInputEnable$threads_release(inputFieldEnableModel2, this.this$0.isInputDisabled());
                            }
                            weakReference2 = this.this$0.fragment;
                            if (weakReference2 != null && (chatFragment = (ChatFragment) weakReference2.get()) != null) {
                                inputFieldEnableModel = this.this$0.enableModel;
                                chatFragment.updateChatAvailabilityMessage$threads_release(inputFieldEnableModel, this.this$0.isInputDisabled());
                            }
                            return Unit.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // defpackage.pz3
                public /* bridge */ /* synthetic */ Object emit(Object obj2, cv1 cv1Var) {
                    return emit(((Boolean) obj2).booleanValue(), cv1Var);
                }

                public final Object emit(boolean z, cv1<? super Unit> cv1Var) {
                    Object d2;
                    ChatController.this.isInputDisabled = z;
                    Object g = qh0.g(v33.c(), new C03621(ChatController.this, null), cv1Var);
                    d2 = c75.d();
                    return g == d2 ? g : Unit.a;
                }
            };
            this.label = 1;
            if (cr6Var.collect(pz3Var, this) == d) {
                return d;
            }
        }
        throw new KotlinNothingValueException();
    }
}
