package im.threads.ui.activities;

import im.threads.databinding.EccActivityGalleryBinding;
import im.threads.ui.activities.GalleryActivity;
import im.threads.ui.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GalleryActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lim/threads/ui/activities/GalleryActivity$ScreenState;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GalleryActivity$subscribeToScreenState$1 extends ej5 implements Function1<GalleryActivity.ScreenState, Unit> {
    final /* synthetic */ GalleryActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryActivity$subscribeToScreenState$1(GalleryActivity galleryActivity) {
        super(1);
        this.this$0 = galleryActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GalleryActivity.ScreenState screenState) {
        invoke2(screenState);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GalleryActivity.ScreenState screenState) {
        EccActivityGalleryBinding eccActivityGalleryBinding;
        EccActivityGalleryBinding eccActivityGalleryBinding2;
        EccActivityGalleryBinding eccActivityGalleryBinding3;
        EccActivityGalleryBinding eccActivityGalleryBinding4;
        EccActivityGalleryBinding eccActivityGalleryBinding5 = null;
        if (screenState == GalleryActivity.ScreenState.SEARCH) {
            eccActivityGalleryBinding4 = this.this$0.binding;
            if (eccActivityGalleryBinding4 == null) {
                z65.z("binding");
                eccActivityGalleryBinding4 = null;
            }
            ViewExtensionsKt.visible(eccActivityGalleryBinding4.searchLayout);
        } else {
            eccActivityGalleryBinding = this.this$0.binding;
            if (eccActivityGalleryBinding == null) {
                z65.z("binding");
                eccActivityGalleryBinding = null;
            }
            ViewExtensionsKt.gone(eccActivityGalleryBinding.searchLayout);
        }
        if (screenState == GalleryActivity.ScreenState.BUCKET_LIST) {
            eccActivityGalleryBinding3 = this.this$0.binding;
            if (eccActivityGalleryBinding3 == null) {
                z65.z("binding");
            } else {
                eccActivityGalleryBinding5 = eccActivityGalleryBinding3;
            }
            ViewExtensionsKt.visible(eccActivityGalleryBinding5.searchLabelLayout);
        } else {
            eccActivityGalleryBinding2 = this.this$0.binding;
            if (eccActivityGalleryBinding2 == null) {
                z65.z("binding");
            } else {
                eccActivityGalleryBinding5 = eccActivityGalleryBinding2;
            }
            ViewExtensionsKt.gone(eccActivityGalleryBinding5.searchLabelLayout);
        }
        this.this$0.checkBottomButtons();
    }
}
