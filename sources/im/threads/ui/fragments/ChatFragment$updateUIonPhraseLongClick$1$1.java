package im.threads.ui.fragments;

import android.view.View;
import android.widget.ImageButton;
import im.threads.R;
import im.threads.business.extensions.BusinessExtensionsKt;
import im.threads.business.models.ChatPhrase;
import im.threads.databinding.EccFragmentChatBinding;
import im.threads.ui.fragments.ChatFragment$updateUIonPhraseLongClick$1$1;
import im.threads.ui.utils.ColorsHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$updateUIonPhraseLongClick$1$1", f = "ChatFragment.kt", l = {2403, 2413}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatFragment$updateUIonPhraseLongClick$1$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ ChatPhrase $chatPhrase;
    final /* synthetic */ int $position;
    final /* synthetic */ EccFragmentChatBinding $this_apply;
    int label;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqx1;", "", "invoke", "(Lqx1;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: im.threads.ui.fragments.ChatFragment$updateUIonPhraseLongClick$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends ej5 implements Function1<qx1, Unit> {
        final /* synthetic */ ChatPhrase $chatPhrase;
        final /* synthetic */ int $position;
        final /* synthetic */ EccFragmentChatBinding $this_apply;
        final /* synthetic */ ChatFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatFragment chatFragment, EccFragmentChatBinding eccFragmentChatBinding, ChatPhrase chatPhrase, int i) {
            super(1);
            this.this$0 = chatFragment;
            this.$this_apply = eccFragmentChatBinding;
            this.$chatPhrase = chatPhrase;
            this.$position = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(ChatFragment chatFragment, ChatPhrase chatPhrase, int i, View view) {
            z65.h(chatFragment, "this$0");
            z65.h(chatPhrase, "$chatPhrase");
            chatFragment.onReplyClick(chatPhrase, i);
            chatFragment.checkBackButtonVisibility();
            chatFragment.unChooseItem();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(qx1 qx1Var) {
            invoke2(qx1Var);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(qx1 qx1Var) {
            z65.h(qx1Var, "$this$withMainContext");
            ChatFragment chatFragment = this.this$0;
            ImageButton imageButton = this.$this_apply.reply;
            z65.g(imageButton, "reply");
            chatFragment.setContextIconDefaultTint(imageButton);
            this.$this_apply.reply.setEnabled(true);
            ImageButton imageButton2 = this.$this_apply.reply;
            final ChatFragment chatFragment2 = this.this$0;
            final ChatPhrase chatPhrase = this.$chatPhrase;
            final int i = this.$position;
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: im.threads.ui.fragments.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatFragment$updateUIonPhraseLongClick$1$1.AnonymousClass1.invoke$lambda$0(ChatFragment.this, chatPhrase, i, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqx1;", "", "invoke", "(Lqx1;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: im.threads.ui.fragments.ChatFragment$updateUIonPhraseLongClick$1$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends ej5 implements Function1<qx1, Unit> {
        final /* synthetic */ EccFragmentChatBinding $this_apply;
        final /* synthetic */ ChatFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ChatFragment chatFragment, EccFragmentChatBinding eccFragmentChatBinding) {
            super(1);
            this.this$0 = chatFragment;
            this.$this_apply = eccFragmentChatBinding;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(qx1 qx1Var) {
            invoke2(qx1Var);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(qx1 qx1Var) {
            int i;
            z65.h(qx1Var, "$this$withMainContext");
            try {
                i = this.this$0.getStyle().chatBodyIconsColorState[0];
            } catch (Exception unused) {
                i = R.color.disabled_icons_color;
            }
            ColorsHelper.setTint(this.this$0.getContext(), this.$this_apply.reply, i);
            this.$this_apply.reply.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$updateUIonPhraseLongClick$1$1(ChatFragment chatFragment, ChatPhrase chatPhrase, EccFragmentChatBinding eccFragmentChatBinding, int i, cv1<? super ChatFragment$updateUIonPhraseLongClick$1$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatFragment;
        this.$chatPhrase = chatPhrase;
        this.$this_apply = eccFragmentChatBinding;
        this.$position = i;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatFragment$updateUIonPhraseLongClick$1$1(this.this$0, this.$chatPhrase, this.$this_apply, this.$position, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatFragment$updateUIonPhraseLongClick$1$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vk9.b(obj);
        } else {
            vk9.b(obj);
            if (this.this$0.getChatController().isMessageSent$threads_release(this.$chatPhrase.getId())) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, this.$chatPhrase, this.$position);
                this.label = 1;
                if (BusinessExtensionsKt.withMainContext(anonymousClass1, this) == d) {
                    return d;
                }
            } else {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$this_apply);
                this.label = 2;
                if (BusinessExtensionsKt.withMainContext(anonymousClass2, this) == d) {
                    return d;
                }
            }
        }
        return Unit.a;
    }
}
