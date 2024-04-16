package im.threads.ui.controllers;

import im.threads.business.state.ChatState;
import im.threads.business.state.ChatStateEvent;
import im.threads.databinding.EccFragmentChatBinding;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$subscribeOnChatState$1", f = "ChatController.kt", l = {1688}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatController$subscribeOnChatState$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeOnChatState$1(ChatController chatController, cv1<? super ChatController$subscribeOnChatState$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatController;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatController$subscribeOnChatState$1(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatController$subscribeOnChatState$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        ChatState chatState;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vk9.b(obj);
        } else {
            vk9.b(obj);
            chatState = this.this$0.getChatState();
            kua<ChatStateEvent> stateFlow = chatState.getStateFlow();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (stateFlow.collect(anonymousClass1, this) == d) {
                return d;
            }
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lim/threads/business/state/ChatStateEvent;", "stateEvent", "", "emit", "(Lim/threads/business/state/ChatStateEvent;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: im.threads.ui.controllers.ChatController$subscribeOnChatState$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1<T> implements pz3 {
        final /* synthetic */ ChatController this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatController.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "im.threads.ui.controllers.ChatController$subscribeOnChatState$1$1$1", f = "ChatController.kt", l = {}, m = "invokeSuspend")
        /* renamed from: im.threads.ui.controllers.ChatController$subscribeOnChatState$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C03611 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChatController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03611(ChatController chatController, cv1<? super C03611> cv1Var) {
                super(2, cv1Var);
                this.this$0 = chatController;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new C03611(this.this$0, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((C03611) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                WeakReference weakReference;
                ChatFragment chatFragment;
                c75.d();
                if (this.label == 0) {
                    vk9.b(obj);
                    weakReference = this.this$0.fragment;
                    if (weakReference != null && (chatFragment = (ChatFragment) weakReference.get()) != null) {
                        chatFragment.showProgressBar();
                        return Unit.a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatController.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lim/threads/databinding/EccFragmentChatBinding;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "im.threads.ui.controllers.ChatController$subscribeOnChatState$1$1$2", f = "ChatController.kt", l = {}, m = "invokeSuspend")
        /* renamed from: im.threads.ui.controllers.ChatController$subscribeOnChatState$1$1$2  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass2 extends f3b implements Function2<qx1, cv1<? super EccFragmentChatBinding>, Object> {
            final /* synthetic */ String $timeoutMessage;
            int label;
            final /* synthetic */ ChatController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ChatController chatController, String str, cv1<? super AnonymousClass2> cv1Var) {
                super(2, cv1Var);
                this.this$0 = chatController;
                this.$timeoutMessage = str;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new AnonymousClass2(this.this$0, this.$timeoutMessage, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super EccFragmentChatBinding> cv1Var) {
                return ((AnonymousClass2) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                WeakReference weakReference;
                ChatFragment chatFragment;
                c75.d();
                if (this.label == 0) {
                    vk9.b(obj);
                    weakReference = this.this$0.fragment;
                    if (weakReference != null && (chatFragment = (ChatFragment) weakReference.get()) != null) {
                        return chatFragment.showErrorView$threads_release(this.$timeoutMessage);
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass1(ChatController chatController) {
            this.this$0 = chatController;
        }

        /* JADX WARN: Code restructure failed: missing block: B:111:0x0266, code lost:
            if (r15 == null) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
            r15 = r13.this$0.fragment;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f9, code lost:
            r15 = r2.this$0.fragment;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x01fe, code lost:
            r14 = r2.this$0.fragment;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0197 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01da  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(im.threads.business.state.ChatStateEvent r14, defpackage.cv1<? super kotlin.Unit> r15) {
            /*
                Method dump skipped, instructions count: 633
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.controllers.ChatController$subscribeOnChatState$1.AnonymousClass1.emit(im.threads.business.state.ChatStateEvent, cv1):java.lang.Object");
        }

        @Override // defpackage.pz3
        public /* bridge */ /* synthetic */ Object emit(Object obj, cv1 cv1Var) {
            return emit((ChatStateEvent) obj, (cv1<? super Unit>) cv1Var);
        }
    }
}
