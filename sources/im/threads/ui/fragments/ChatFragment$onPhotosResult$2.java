package im.threads.ui.fragments;

import android.content.Context;
import android.net.Uri;
import im.threads.R;
import im.threads.business.extensions.BusinessExtensionsKt;
import im.threads.business.models.CampaignMessage;
import im.threads.business.models.FileDescription;
import im.threads.business.models.Quote;
import im.threads.business.models.UpcomingUserMessage;
import im.threads.business.utils.Balloon;
import im.threads.business.utils.ClibpboardExtensionsKt;
import im.threads.business.utils.FileUtils;
import im.threads.ui.fragments.ChatFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "filteredPhotos", "", "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatFragment$onPhotosResult$2 extends ej5 implements Function1<List<? extends Uri>, Unit> {
    final /* synthetic */ String $inputText;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "im.threads.ui.fragments.ChatFragment$onPhotosResult$2$1", f = "ChatFragment.kt", l = {1486}, m = "invokeSuspend")
    /* renamed from: im.threads.ui.fragments.ChatFragment$onPhotosResult$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        final /* synthetic */ List<Uri> $filteredPhotos;
        final /* synthetic */ String $inputText;
        int label;
        final /* synthetic */ ChatFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqx1;", "", "invoke", "(Lqx1;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: im.threads.ui.fragments.ChatFragment$onPhotosResult$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C03641 extends ej5 implements Function1<qx1, Unit> {
            final /* synthetic */ ArrayList<Long> $fileSizes;
            final /* synthetic */ List<Uri> $filteredPhotos;
            final /* synthetic */ String $inputText;
            final /* synthetic */ ChatFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03641(List<? extends Uri> list, ArrayList<Long> arrayList, ChatFragment chatFragment, String str) {
                super(1);
                this.$filteredPhotos = list;
                this.$fileSizes = arrayList;
                this.this$0 = chatFragment;
                this.$inputText = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(qx1 qx1Var) {
                invoke2(qx1Var);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(qx1 qx1Var) {
                CampaignMessage campaignMessage;
                Quote quote;
                boolean z;
                ta0 ta0Var;
                ChatFragment.QuoteLayoutHolder quoteLayoutHolder;
                z65.h(qx1Var, "$this$withMainContext");
                Uri uri = this.$filteredPhotos.get(0);
                Long l = this.$fileSizes.get(0);
                z65.g(l, "fileSizes[0]");
                FileDescription fileDescription = new FileDescription(this.this$0.requireContext().getString(R.string.ecc_I), uri, l.longValue(), System.currentTimeMillis());
                campaignMessage = this.this$0.campaignMessage;
                quote = this.this$0.mQuote;
                String str = this.$inputText;
                int length = str.length() - 1;
                int i = 0;
                boolean z2 = false;
                while (i <= length) {
                    boolean z3 = z65.j(str.charAt(!z2 ? i : length), 32) <= 0;
                    if (z2) {
                        if (!z3) {
                            break;
                        }
                        length--;
                    } else if (z3) {
                        i++;
                    } else {
                        z2 = true;
                    }
                }
                UpcomingUserMessage upcomingUserMessage = new UpcomingUserMessage(fileDescription, campaignMessage, quote, str.subSequence(i, length + 1).toString(), ClibpboardExtensionsKt.isLastCopyText(this.$inputText));
                z = this.this$0.isSendBlocked;
                if (!z) {
                    this.this$0.getChatController().onUserInput$threads_release(upcomingUserMessage);
                } else {
                    Context requireContext = this.this$0.requireContext();
                    z65.g(requireContext, "requireContext()");
                    String string = this.this$0.getString(R.string.ecc_message_were_unsent);
                    z65.g(string, "getString(R.string.ecc_message_were_unsent)");
                    Balloon.show(requireContext, string);
                }
                ta0Var = this.this$0.inputTextObservable;
                ta0Var.d("");
                quoteLayoutHolder = this.this$0.quoteLayoutHolder;
                if (quoteLayoutHolder != null) {
                    quoteLayoutHolder.clear();
                }
                int size = this.$filteredPhotos.size();
                for (int i2 = 1; i2 < size; i2++) {
                    Uri uri2 = this.$filteredPhotos.get(i2);
                    Long l2 = this.$fileSizes.get(i2);
                    z65.g(l2, "fileSizes[i]");
                    this.this$0.getChatController().onUserInput$threads_release(new UpcomingUserMessage(new FileDescription(this.this$0.requireContext().getString(R.string.ecc_I), uri2, l2.longValue(), System.currentTimeMillis()), null, null, null, false));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends Uri> list, ChatFragment chatFragment, String str, cv1<? super AnonymousClass1> cv1Var) {
            super(2, cv1Var);
            this.$filteredPhotos = list;
            this.this$0 = chatFragment;
            this.$inputText = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new AnonymousClass1(this.$filteredPhotos, this.this$0, this.$inputText, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((AnonymousClass1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                ArrayList arrayList = new ArrayList(this.$filteredPhotos.size());
                int size = this.$filteredPhotos.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(nf0.d(FileUtils.getFileSize(this.$filteredPhotos.get(i2))));
                }
                C03641 c03641 = new C03641(this.$filteredPhotos, arrayList, this.this$0, this.$inputText);
                this.label = 1;
                if (BusinessExtensionsKt.withMainContext(c03641, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onPhotosResult$2(ChatFragment chatFragment, String str) {
        super(1);
        this.this$0 = chatFragment;
        this.$inputText = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Uri> list) {
        invoke2(list);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends Uri> list) {
        z65.h(list, "filteredPhotos");
        if (!list.isEmpty()) {
            this.this$0.unChooseItem();
            sh0.d(this.this$0.coroutineScope, v33.b(), null, new AnonymousClass1(list, this.this$0, this.$inputText, null), 2, null);
            return;
        }
        Context requireContext = this.this$0.requireContext();
        z65.g(requireContext, "requireContext()");
        String string = this.this$0.getString(R.string.ecc_failed_to_open_file);
        z65.g(string, "getString(R.string.ecc_failed_to_open_file)");
        Balloon.show(requireContext, string);
    }
}
