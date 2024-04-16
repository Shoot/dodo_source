package im.threads.ui.activities;

import im.threads.databinding.EccActivityGalleryBinding;
import im.threads.ui.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GalleryActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isDataEmpty", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GalleryActivity$subscribeToDataIsEmpty$1 extends ej5 implements Function1<Boolean, Unit> {
    final /* synthetic */ GalleryActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryActivity$subscribeToDataIsEmpty$1(GalleryActivity galleryActivity) {
        super(1);
        this.this$0 = galleryActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        EccActivityGalleryBinding eccActivityGalleryBinding;
        EccActivityGalleryBinding eccActivityGalleryBinding2;
        z65.g(bool, "isDataEmpty");
        EccActivityGalleryBinding eccActivityGalleryBinding3 = null;
        if (bool.booleanValue()) {
            eccActivityGalleryBinding2 = this.this$0.binding;
            if (eccActivityGalleryBinding2 == null) {
                z65.z("binding");
            } else {
                eccActivityGalleryBinding3 = eccActivityGalleryBinding2;
            }
            ViewExtensionsKt.visible(eccActivityGalleryBinding3.nothingFoundLabel);
        } else {
            eccActivityGalleryBinding = this.this$0.binding;
            if (eccActivityGalleryBinding == null) {
                z65.z("binding");
            } else {
                eccActivityGalleryBinding3 = eccActivityGalleryBinding;
            }
            ViewExtensionsKt.gone(eccActivityGalleryBinding3.nothingFoundLabel);
        }
        this.this$0.checkBottomButtons();
    }
}
