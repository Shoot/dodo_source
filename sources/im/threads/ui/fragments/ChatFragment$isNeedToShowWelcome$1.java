package im.threads.ui.fragments;

import im.threads.business.extensions.BusinessExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$isNeedToShowWelcome$1", f = "ChatFragment.kt", l = {446}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatFragment$isNeedToShowWelcome$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    int label;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqx1;", "", "invoke", "(Lqx1;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: im.threads.ui.fragments.ChatFragment$isNeedToShowWelcome$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends ej5 implements Function1<qx1, Unit> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ boolean $isNeedToShowWelcome;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super Boolean, Unit> function1, boolean z) {
            super(1);
            this.$callback = function1;
            this.$isNeedToShowWelcome = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(qx1 qx1Var) {
            invoke2(qx1Var);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(qx1 qx1Var) {
            z65.h(qx1Var, "$this$withMainContext");
            this.$callback.invoke(Boolean.valueOf(this.$isNeedToShowWelcome));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatFragment$isNeedToShowWelcome$1(ChatFragment chatFragment, Function1<? super Boolean, Unit> function1, cv1<? super ChatFragment$isNeedToShowWelcome$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatFragment;
        this.$callback = function1;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatFragment$isNeedToShowWelcome$1(this.this$0, this.$callback, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatFragment$isNeedToShowWelcome$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, this.this$0.getChatController().isNeedToShowWelcome());
            this.label = 1;
            if (BusinessExtensionsKt.withMainContext(anonymousClass1, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
