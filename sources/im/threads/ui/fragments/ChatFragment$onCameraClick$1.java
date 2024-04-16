package im.threads.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import im.threads.R;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.utils.Balloon;
import im.threads.business.utils.FileProvider;
import im.threads.business.utils.MediaHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$onCameraClick$1", f = "ChatFragment.kt", l = {1135}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatFragment$onCameraClick$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ androidx.fragment.app.d $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onCameraClick$1(ChatFragment chatFragment, androidx.fragment.app.d dVar, cv1<? super ChatFragment$onCameraClick$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatFragment;
        this.$activity = dVar;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        ChatFragment$onCameraClick$1 chatFragment$onCameraClick$1 = new ChatFragment$onCameraClick$1(this.this$0, this.$activity, cv1Var);
        chatFragment$onCameraClick$1.L$0 = obj;
        return chatFragment$onCameraClick$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatFragment$onCameraClick$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        Intent intent;
        hs2 b;
        ChatFragment chatFragment;
        FileProvider fileProvider;
        File file;
        d = c75.d();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    chatFragment = (ChatFragment) this.L$1;
                    intent = (Intent) this.L$0;
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                qx1 qx1Var = (qx1) this.L$0;
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                b = sh0.b(qx1Var, v33.b(), null, new ChatFragment$onCameraClick$1$externalCameraPhotoFileDef$1(this.$activity, null), 2, null);
                ChatFragment chatFragment2 = this.this$0;
                this.L$0 = intent;
                this.L$1 = chatFragment2;
                this.label = 1;
                obj = b.l0(this);
                if (obj == d) {
                    return d;
                }
                chatFragment = chatFragment2;
            }
            chatFragment.externalCameraPhotoFile = (File) obj;
            fileProvider = this.this$0.getFileProvider();
            androidx.fragment.app.d dVar = this.$activity;
            file = this.this$0.externalCameraPhotoFile;
            z65.e(file);
            Uri uriForFile = fileProvider.getUriForFile(dVar, file);
            LoggerEdna.debug("Image File uri resolved: " + uriForFile);
            intent.putExtra("output", uriForFile);
            MediaHelper.grantPermissionsForImageUri(this.$activity, intent, uriForFile);
            this.this$0.startActivityForResult(intent, 102);
        } catch (IllegalArgumentException e) {
            LoggerEdna.error("Could not start external camera", e);
            Context requireContext = this.this$0.requireContext();
            z65.g(requireContext, "requireContext()");
            String string = this.this$0.requireContext().getString(R.string.ecc_camera_could_not_start_error);
            z65.g(string, "requireContext().getStri…ra_could_not_start_error)");
            Balloon.show(requireContext, string);
        }
        return Unit.a;
    }
}
