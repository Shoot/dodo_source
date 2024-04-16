package im.threads.ui.fragments;

import android.widget.TextView;
import im.threads.business.extensions.BusinessExtensionsKt;
import im.threads.databinding.EccFragmentChatBinding;
import im.threads.ui.fragments.ChatFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$QuoteLayoutHolder$setVoice$1$1", f = "ChatFragment.kt", l = {2653}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatFragment$QuoteLayoutHolder$setVoice$1$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ EccFragmentChatBinding $this_apply;
    int label;
    final /* synthetic */ ChatFragment.QuoteLayoutHolder this$0;
    final /* synthetic */ ChatFragment this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqx1;", "", "invoke", "(Lqx1;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: im.threads.ui.fragments.ChatFragment$QuoteLayoutHolder$setVoice$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends ej5 implements Function1<qx1, Unit> {
        final /* synthetic */ EccFragmentChatBinding $this_apply;
        final /* synthetic */ ChatFragment.QuoteLayoutHolder this$0;
        final /* synthetic */ ChatFragment this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(EccFragmentChatBinding eccFragmentChatBinding, ChatFragment.QuoteLayoutHolder quoteLayoutHolder, ChatFragment chatFragment) {
            super(1);
            this.$this_apply = eccFragmentChatBinding;
            this.this$0 = quoteLayoutHolder;
            this.this$1 = chatFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(qx1 qx1Var) {
            invoke2(qx1Var);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(qx1 qx1Var) {
            String str;
            z65.h(qx1Var, "$this$withMainContext");
            TextView textView = this.$this_apply.quoteDuration;
            str = this.this$0.formattedDuration;
            textView.setText(str);
            this.this$1.getChatUpdateProcessor().postAttachAudioFile(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$QuoteLayoutHolder$setVoice$1$1(ChatFragment.QuoteLayoutHolder quoteLayoutHolder, ChatFragment chatFragment, EccFragmentChatBinding eccFragmentChatBinding, cv1<? super ChatFragment$QuoteLayoutHolder$setVoice$1$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = quoteLayoutHolder;
        this.this$1 = chatFragment;
        this.$this_apply = eccFragmentChatBinding;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatFragment$QuoteLayoutHolder$setVoice$1$1(this.this$0, this.this$1, this.$this_apply, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatFragment$QuoteLayoutHolder$setVoice$1$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        String formattedDuration;
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
            ChatFragment.QuoteLayoutHolder quoteLayoutHolder = this.this$0;
            formattedDuration = quoteLayoutHolder.getFormattedDuration(this.this$1.getFileDescription());
            quoteLayoutHolder.formattedDuration = formattedDuration;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_apply, this.this$0, this.this$1);
            this.label = 1;
            if (BusinessExtensionsKt.withMainContext(anonymousClass1, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
