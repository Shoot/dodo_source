package im.threads.ui.fragments;

import android.content.Context;
import im.threads.business.utils.FileUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$onCameraClick$1$externalCameraPhotoFileDef$1", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChatFragment$onCameraClick$1$externalCameraPhotoFileDef$1 extends f3b implements Function2<qx1, cv1<? super File>, Object> {
    final /* synthetic */ androidx.fragment.app.d $activity;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onCameraClick$1$externalCameraPhotoFileDef$1(androidx.fragment.app.d dVar, cv1<? super ChatFragment$onCameraClick$1$externalCameraPhotoFileDef$1> cv1Var) {
        super(2, cv1Var);
        this.$activity = dVar;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatFragment$onCameraClick$1$externalCameraPhotoFileDef$1(this.$activity, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super File> cv1Var) {
        return ((ChatFragment$onCameraClick$1$externalCameraPhotoFileDef$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            Context applicationContext = this.$activity.getApplicationContext();
            z65.g(applicationContext, "activity.applicationContext");
            return FileUtils.createImageFile(applicationContext);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
