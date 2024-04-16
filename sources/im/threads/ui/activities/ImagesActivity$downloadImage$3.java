package im.threads.ui.activities;

import im.threads.R;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.utils.Balloon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ImagesActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ImagesActivity$downloadImage$3 extends ej5 implements Function1<Throwable, Unit> {
    final /* synthetic */ ImagesActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesActivity$downloadImage$3(ImagesActivity imagesActivity) {
        super(1);
        this.this$0 = imagesActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        ImagesActivity imagesActivity = this.this$0;
        String string = imagesActivity.getString(R.string.ecc_unable_to_save);
        z65.g(string, "getString(R.string.ecc_unable_to_save)");
        Balloon.show(imagesActivity, string);
        LoggerEdna.error("downloadImage", th);
    }
}
