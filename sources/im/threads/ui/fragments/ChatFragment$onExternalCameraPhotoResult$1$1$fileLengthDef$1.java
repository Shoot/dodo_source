package im.threads.ui.fragments;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$onExternalCameraPhotoResult$1$1$fileLengthDef$1", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChatFragment$onExternalCameraPhotoResult$1$1$fileLengthDef$1 extends f3b implements Function2<qx1, cv1<? super Long>, Object> {
    final /* synthetic */ File $file;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onExternalCameraPhotoResult$1$1$fileLengthDef$1(File file, cv1<? super ChatFragment$onExternalCameraPhotoResult$1$1$fileLengthDef$1> cv1Var) {
        super(2, cv1Var);
        this.$file = file;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatFragment$onExternalCameraPhotoResult$1$1$fileLengthDef$1(this.$file, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Long> cv1Var) {
        return ((ChatFragment$onExternalCameraPhotoResult$1$1$fileLengthDef$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            return nf0.d(this.$file.length());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
