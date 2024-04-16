package im.threads.ui.fragments;

import android.net.Uri;
import im.threads.R;
import im.threads.business.extensions.BusinessExtensionsKt;
import im.threads.business.models.FileDescription;
import im.threads.business.utils.FileUtils;
import im.threads.ui.fragments.ChatFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$onFileResult$2", f = "ChatFragment.kt", l = {1415}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatFragment$onFileResult$2 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqx1;", "", "invoke", "(Lqx1;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: im.threads.ui.fragments.ChatFragment$onFileResult$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends ej5 implements Function1<qx1, Unit> {
        final /* synthetic */ String $fileName;
        final /* synthetic */ ChatFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatFragment chatFragment, String str) {
            super(1);
            this.this$0 = chatFragment;
            this.$fileName = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(qx1 qx1Var) {
            invoke2(qx1Var);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(qx1 qx1Var) {
            ChatFragment.QuoteLayoutHolder quoteLayoutHolder;
            z65.h(qx1Var, "$this$withMainContext");
            quoteLayoutHolder = this.this$0.quoteLayoutHolder;
            if (quoteLayoutHolder != null) {
                quoteLayoutHolder.setContent(this.this$0.requireContext().getString(R.string.ecc_file), this.$fileName, null, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onFileResult$2(ChatFragment chatFragment, Uri uri, cv1<? super ChatFragment$onFileResult$2> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatFragment;
        this.$uri = uri;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatFragment$onFileResult$2(this.this$0, this.$uri, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatFragment$onFileResult$2) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
            ChatFragment chatFragment = this.this$0;
            String string = this.this$0.requireContext().getString(R.string.ecc_I);
            Uri uri = this.$uri;
            chatFragment.setFileDescription(new FileDescription(string, uri, FileUtils.getFileSize(uri), System.currentTimeMillis()));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, FileUtils.getFileName(this.$uri));
            this.label = 1;
            if (BusinessExtensionsKt.withMainContext(anonymousClass1, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
