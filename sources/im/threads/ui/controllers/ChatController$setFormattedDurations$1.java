package im.threads.ui.controllers;

import android.media.MediaMetadataRetriever;
import im.threads.business.extensions.BusinessExtensionsKt;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.FileDescription;
import im.threads.business.models.UserPhrase;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$setFormattedDurations$1", f = "ChatController.kt", l = {1816}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatController$setFormattedDurations$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ List<ChatItem> $list;
    final /* synthetic */ MediaMetadataRetriever $mediaMetadataRetriever;
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqx1;", "", "invoke", "(Lqx1;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: im.threads.ui.controllers.ChatController$setFormattedDurations$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends ej5 implements Function1<qx1, Unit> {
        final /* synthetic */ Function0<Unit> $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function0<Unit> function0) {
            super(1);
            this.$callback = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(qx1 qx1Var) {
            invoke2(qx1Var);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(qx1 qx1Var) {
            z65.h(qx1Var, "$this$withMainContext");
            this.$callback.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatController$setFormattedDurations$1(List<? extends ChatItem> list, ChatController chatController, MediaMetadataRetriever mediaMetadataRetriever, Function0<Unit> function0, cv1<? super ChatController$setFormattedDurations$1> cv1Var) {
        super(2, cv1Var);
        this.$list = list;
        this.this$0 = chatController;
        this.$mediaMetadataRetriever = mediaMetadataRetriever;
        this.$callback = function0;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatController$setFormattedDurations$1(this.$list, this.this$0, this.$mediaMetadataRetriever, this.$callback, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatController$setFormattedDurations$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        List<ChatItem> W;
        ConsultPhrase consultPhrase;
        UserPhrase userPhrase;
        String formattedDuration;
        FileDescription fileDescription;
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
            W = sc1.W(this.$list);
            ChatController chatController = this.this$0;
            MediaMetadataRetriever mediaMetadataRetriever = this.$mediaMetadataRetriever;
            for (ChatItem chatItem : W) {
                FileDescription fileDescription2 = null;
                if (chatItem instanceof ConsultPhrase) {
                    consultPhrase = (ConsultPhrase) chatItem;
                } else {
                    consultPhrase = null;
                }
                if (consultPhrase != null && (fileDescription = consultPhrase.getFileDescription()) != null) {
                    fileDescription2 = fileDescription;
                } else {
                    if (chatItem instanceof UserPhrase) {
                        userPhrase = (UserPhrase) chatItem;
                    } else {
                        userPhrase = null;
                    }
                    if (userPhrase != null) {
                        fileDescription2 = userPhrase.getFileDescription();
                    }
                }
                if (fileDescription2 != null) {
                    formattedDuration = chatController.getFormattedDuration(fileDescription2, mediaMetadataRetriever);
                    fileDescription2.setVoiceFormattedDuration(formattedDuration);
                }
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$callback);
            this.label = 1;
            if (BusinessExtensionsKt.withMainContext(anonymousClass2, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
