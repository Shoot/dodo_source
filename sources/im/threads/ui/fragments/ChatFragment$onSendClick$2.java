package im.threads.ui.fragments;

import android.content.Context;
import android.net.Uri;
import im.threads.R;
import im.threads.business.utils.Balloon;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "filteredPhotos", "", "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChatFragment$onSendClick$2 extends ej5 implements Function1<List<? extends Uri>, Unit> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "im.threads.ui.fragments.ChatFragment$onSendClick$2$1", f = "ChatFragment.kt", l = {1306}, m = "invokeSuspend")
    /* renamed from: im.threads.ui.fragments.ChatFragment$onSendClick$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        final /* synthetic */ List<Uri> $filteredPhotos;
        final /* synthetic */ String $inputText;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChatFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ChatFragment chatFragment, List<? extends Uri> list, String str, cv1<? super AnonymousClass1> cv1Var) {
            super(2, cv1Var);
            this.this$0 = chatFragment;
            this.$filteredPhotos = list;
            this.$inputText = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$filteredPhotos, this.$inputText, cv1Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((AnonymousClass1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            hs2 b;
            boolean z;
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
                b = sh0.b((qx1) this.L$0, v33.b(), null, new ChatFragment$onSendClick$2$1$messagesDef$1(this.$filteredPhotos, this.$inputText, this.this$0, null), 2, null);
                this.label = 1;
                obj = b.l0(this);
                if (obj == d) {
                    return d;
                }
            }
            List list = (List) obj;
            z = this.this$0.isSendBlocked;
            if (z) {
                this.this$0.clearInput();
                Context requireContext = this.this$0.requireContext();
                z65.g(requireContext, "requireContext()");
                String string = this.this$0.requireContext().getString(R.string.ecc_message_were_unsent);
                z65.g(string, "requireContext().getStri….ecc_message_were_unsent)");
                Balloon.show(requireContext, string);
            } else {
                ChatFragment.sendMessage$default(this.this$0, list, false, 2, null);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onSendClick$2(ChatFragment chatFragment) {
        super(1);
        this.this$0 = chatFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Uri> list) {
        invoke2(list);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends Uri> list) {
        ta0 ta0Var;
        z65.h(list, "filteredPhotos");
        if (!list.isEmpty()) {
            ta0Var = this.this$0.inputTextObservable;
            String str = (String) ta0Var.A();
            if (str == null) {
                return;
            }
            sh0.d(this.this$0.coroutineScope, null, null, new AnonymousClass1(this.this$0, list, str, null), 3, null);
            return;
        }
        Context requireContext = this.this$0.requireContext();
        z65.g(requireContext, "requireContext()");
        String string = this.this$0.getString(R.string.ecc_failed_to_open_file);
        z65.g(string, "getString(R.string.ecc_failed_to_open_file)");
        Balloon.show(requireContext, string);
    }
}
