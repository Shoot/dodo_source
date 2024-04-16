package im.threads.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import im.threads.R;
import im.threads.business.config.BaseConfig;
import im.threads.business.extensions.BusinessExtensionsKt;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.utils.Balloon;
import im.threads.business.utils.FileUtils;
import im.threads.ui.utils.FileHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$onFileResult$1", f = "ChatFragment.kt", l = {1370}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatFragment$onFileResult$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ Intent $data;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqx1;", "", "invoke", "(Lqx1;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: im.threads.ui.fragments.ChatFragment$onFileResult$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends ej5 implements Function1<qx1, Unit> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ boolean $isAllowedFileExtension;
        final /* synthetic */ boolean $isAllowedFileSize;
        final /* synthetic */ boolean $isCanBeSent;
        final /* synthetic */ Uri $uri;
        final /* synthetic */ ChatFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, boolean z2, boolean z3, ChatFragment chatFragment, Uri uri, Intent intent) {
            super(1);
            this.$isAllowedFileExtension = z;
            this.$isAllowedFileSize = z2;
            this.$isCanBeSent = z3;
            this.this$0 = chatFragment;
            this.$uri = uri;
            this.$data = intent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(qx1 qx1Var) {
            invoke2(qx1Var);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(qx1 qx1Var) {
            z65.h(qx1Var, "$this$withMainContext");
            if (!this.$isAllowedFileExtension) {
                Context requireContext = this.this$0.requireContext();
                z65.g(requireContext, "requireContext()");
                String string = this.this$0.getString(R.string.ecc_not_allowed_file_extension);
                z65.g(string, "getString(R.string.ecc_not_allowed_file_extension)");
                Balloon.show(requireContext, string);
            } else if (this.$isAllowedFileSize) {
                try {
                    if (this.$isCanBeSent) {
                        this.this$0.onFileResult(this.$uri);
                        this.this$0.requireActivity().getContentResolver().takePersistableUriPermission(this.$uri, this.$data.getFlags() & 3);
                    } else {
                        Context requireContext2 = this.this$0.requireContext();
                        z65.g(requireContext2, "requireContext()");
                        String string2 = this.this$0.getString(R.string.ecc_failed_to_open_file);
                        z65.g(string2, "getString(R.string.ecc_failed_to_open_file)");
                        Balloon.show(requireContext2, string2);
                    }
                } catch (SecurityException e) {
                    LoggerEdna.error("file can't be sent", e);
                    Context requireContext3 = this.this$0.requireContext();
                    z65.g(requireContext3, "requireContext()");
                    String string3 = this.this$0.getString(R.string.ecc_failed_to_open_file);
                    z65.g(string3, "getString(R.string.ecc_failed_to_open_file)");
                    Balloon.show(requireContext3, string3);
                }
            } else {
                Context requireContext4 = this.this$0.requireContext();
                z65.g(requireContext4, "requireContext()");
                String string4 = this.this$0.getString(R.string.ecc_not_allowed_file_size, Long.valueOf(FileHelper.INSTANCE.getMaxAllowedFileSize()));
                z65.g(string4, "getString(\n             …                        )");
                Balloon.show(requireContext4, string4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onFileResult$1(Uri uri, ChatFragment chatFragment, Intent intent, cv1<? super ChatFragment$onFileResult$1> cv1Var) {
        super(2, cv1Var);
        this.$uri = uri;
        this.this$0 = chatFragment;
        this.$data = intent;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatFragment$onFileResult$1(this.$uri, this.this$0, this.$data, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatFragment$onFileResult$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
            FileHelper fileHelper = FileHelper.INSTANCE;
            BaseConfig.Companion companion = BaseConfig.Companion;
            boolean isAllowedFileExtension = fileHelper.isAllowedFileExtension(FileUtils.getExtensionFromMediaStore(companion.getInstance().context, this.$uri));
            boolean isAllowedFileSize = fileHelper.isAllowedFileSize(FileUtils.getFileSizeFromMediaStore(companion.getInstance().context, this.$uri));
            Context requireContext = this.this$0.requireContext();
            z65.g(requireContext, "requireContext()");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(isAllowedFileExtension, isAllowedFileSize, FileUtils.canBeSent(requireContext, this.$uri), this.this$0, this.$uri, this.$data);
            this.label = 1;
            if (BusinessExtensionsKt.withMainContext(anonymousClass1, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
