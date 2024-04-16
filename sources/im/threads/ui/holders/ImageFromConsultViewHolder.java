package im.threads.ui.holders;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import im.threads.R;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.imageLoading.ImageModifications;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.FileDescription;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: ImageFromConsultViewHolder.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J.\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010(\u001a\n '*\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010!¨\u00062"}, d2 = {"Lim/threads/ui/holders/ImageFromConsultViewHolder;", "Lim/threads/ui/holders/BaseImageHolder;", "", "applyBubbleLayoutStyle", "showLoadImageAnimation", "stopLoadImageAnimation", "Lim/threads/business/models/FileDescription;", "fileDescription", "showLoaderLayout", "showErrorLayout", "showCommonLayout", "Lim/threads/business/models/ConsultPhrase;", "consultPhrase", "", "highlighted", "Landroid/view/View$OnClickListener;", "buttonClickListener", "Landroid/view/View$OnLongClickListener;", "onLongClickListener", "onAvatarClickListener", "onBind", "Lim/threads/business/imageLoading/ImageModifications$MaskedModification;", "maskedTransformation", "Lim/threads/business/imageLoading/ImageModifications$MaskedModification;", "Landroid/widget/TextView;", "errorTextView", "Landroid/widget/TextView;", "Landroid/widget/LinearLayout;", "loaderLayout", "Landroid/widget/LinearLayout;", "fileNameTextView", "Landroid/widget/ImageView;", "loader", "Landroid/widget/ImageView;", "loaderImage", "imageLayoutWithSpace", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "timeStampLoader", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "kotlin.jvm.PlatformType", "consultAvatar", "Landroid/view/ViewGroup;", "parent", "Lks8;", "Lim/threads/business/models/ChatItem;", "highlightingStream", "Lim/threads/business/ogParser/OpenGraphParser;", "openGraphParser", "<init>", "(Landroid/view/ViewGroup;Lim/threads/business/imageLoading/ImageModifications$MaskedModification;Lks8;Lim/threads/business/ogParser/OpenGraphParser;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ImageFromConsultViewHolder extends BaseImageHolder {
    private final ImageView consultAvatar;
    private final TextView errorTextView;
    private final TextView fileNameTextView;
    private final LinearLayout imageLayoutWithSpace;
    private final ImageView loader;
    private final ImageView loaderImage;
    private final LinearLayout loaderLayout;
    private final ImageModifications.MaskedModification maskedTransformation;
    private final BubbleTimeTextView timeStampLoader;

    /* compiled from: ImageFromConsultViewHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachmentStateEnum.values().length];
            try {
                iArr[AttachmentStateEnum.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentStateEnum.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImageFromConsultViewHolder(android.view.ViewGroup r5, im.threads.business.imageLoading.ImageModifications.MaskedModification r6, defpackage.ks8<im.threads.business.models.ChatItem> r7, im.threads.business.ogParser.OpenGraphParser r8) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.ImageFromConsultViewHolder.<init>(android.view.ViewGroup, im.threads.business.imageLoading.ImageModifications$MaskedModification, ks8, im.threads.business.ogParser.OpenGraphParser):void");
    }

    private final void applyBubbleLayoutStyle() {
        this.loaderLayout.setBackground(on.b(this.itemView.getContext(), getStyle().incomingMessageBubbleBackground));
        setPaddings(true, this.loaderLayout);
        setLayoutMargins(true, this.loaderLayout);
        this.loaderLayout.getBackground().setColorFilter(qc0.a(getColorInt(getStyle().incomingMessageBubbleColor), uc0.SRC_ATOP));
    }

    private final void showCommonLayout(FileDescription fileDescription) {
        String str;
        boolean y;
        ViewExtensionsKt.visible(this.imageLayoutWithSpace);
        ViewExtensionsKt.invisible(this.loaderLayout);
        ViewExtensionsKt.gone(this.timeStampLoader);
        ViewExtensionsKt.gone(this.errorTextView);
        getRotateAnim().cancel();
        Uri previewUri = getPreviewUri(fileDescription.getPreviewFileDescription());
        String str2 = null;
        if (previewUri != null) {
            str = previewUri.toString();
        } else {
            str = null;
        }
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                if (previewUri != null) {
                    str2 = previewUri.toString();
                }
                if (fileDescription.getState() != AttachmentStateEnum.READY && !fileDescription.isDownloadError()) {
                    if (str2 != null && str2.length() != 0) {
                        showLoadImageAnimation();
                        ImageLoader.Companion.get().load(str2).autoRotateWithExif(true).errorDrawableResourceId(Integer.valueOf(getStyle().imagePlaceholder)).scales(ImageView.ScaleType.FIT_XY, ImageView.ScaleType.CENTER_CROP).modifications(this.maskedTransformation).callback(new ImageLoader.ImageLoaderCallback() { // from class: im.threads.ui.holders.ImageFromConsultViewHolder$showCommonLayout$1
                            @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
                            public void onBitmapLoaded(Bitmap bitmap) {
                                ImageLoader.ImageLoaderCallback.DefaultImpls.onBitmapLoaded(this, bitmap);
                            }

                            @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
                            public void onImageLoadError() {
                                ImageFromConsultViewHolder.this.stopLoadImageAnimation();
                            }

                            @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
                            public void onImageLoaded() {
                                ImageFromConsultViewHolder.this.stopLoadImageAnimation();
                            }
                        }).into(getImage());
                        return;
                    }
                    getImage().setImageResource(getStyle().imagePlaceholder);
                    return;
                }
                stopLoadImageAnimation();
                getImage().setImageResource(getStyle().imagePlaceholder);
            }
        }
        FileDescription previewFileDescription = fileDescription.getPreviewFileDescription();
        if (previewFileDescription != null) {
            str2 = previewFileDescription.getDownloadPath();
        }
        if (fileDescription.getState() != AttachmentStateEnum.READY) {
        }
        stopLoadImageAnimation();
        getImage().setImageResource(getStyle().imagePlaceholder);
    }

    private final void showErrorLayout(FileDescription fileDescription) {
        this.loaderLayout.setVisibility(0);
        this.errorTextView.setVisibility(0);
        ViewExtensionsKt.gone(this.imageLayoutWithSpace);
        ViewExtensionsKt.visible(this.timeStampLoader);
        this.loader.setImageResource(getErrorImageResByErrorCode(fileDescription.getErrorCode()));
        this.fileNameTextView.setText(fileDescription.getIncomingName());
        this.errorTextView.setText(getString(getErrorStringResByErrorCode(fileDescription.getErrorCode())));
        getRotateAnim().cancel();
    }

    private final void showLoadImageAnimation() {
        this.loaderImage.setVisibility(0);
        initAnimation(this.loaderImage, true);
        getRotateAnim().start();
    }

    private final void showLoaderLayout(FileDescription fileDescription) {
        ViewExtensionsKt.visible(this.loaderLayout);
        ViewExtensionsKt.gone(this.imageLayoutWithSpace);
        ViewExtensionsKt.visible(this.timeStampLoader);
        ViewExtensionsKt.gone(this.errorTextView);
        this.fileNameTextView.setText(fileDescription.getIncomingName());
        initAnimation(this.loader, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLoadImageAnimation() {
        ViewExtensionsKt.gone(this.loaderImage);
        getRotateAnim().cancel();
    }

    public final void onBind(ConsultPhrase consultPhrase, boolean z, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener2) {
        List<? extends TextView> o;
        Unit unit;
        int i;
        z65.h(consultPhrase, "consultPhrase");
        z65.h(onClickListener, "buttonClickListener");
        z65.h(onLongClickListener, "onLongClickListener");
        z65.h(onClickListener2, "onAvatarClickListener");
        View view = this.itemView;
        z65.g(view, "itemView");
        subscribeForHighlighting(consultPhrase, view);
        applyBubbleLayoutStyle();
        ColorsHelper.setTextColor(this.errorTextView, getStyle().errorMessageTextColor);
        getTimeStampTextView().setOnClickListener(onClickListener);
        getTimeStampTextView().setOnLongClickListener(onLongClickListener);
        this.timeStampLoader.setOnClickListener(onClickListener);
        this.timeStampLoader.setOnLongClickListener(onLongClickListener);
        o = kc1.o(getTimeStampTextView(), this.timeStampLoader);
        showConsultTimeStamp(consultPhrase, o);
        getRootLayout().setOnClickListener(onClickListener);
        getRootLayout().setOnLongClickListener(onLongClickListener);
        getImage().setOnClickListener(onClickListener);
        getImage().setOnLongClickListener(onLongClickListener);
        ImageView imageView = this.consultAvatar;
        z65.g(imageView, "consultAvatar");
        showAvatar(imageView, consultPhrase, onClickListener2);
        FileDescription fileDescription = consultPhrase.getFileDescription();
        if (fileDescription != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[fileDescription.getState().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    showCommonLayout(fileDescription);
                    moveTimeToImageLayout();
                } else {
                    showErrorLayout(fileDescription);
                }
            } else {
                showLoaderLayout(fileDescription);
            }
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            getImage().setImageResource(0);
        }
        LinearLayout rootLayout = getRootLayout();
        Context context = this.itemView.getContext();
        if (z) {
            i = getStyle().chatHighlightingColor;
        } else {
            i = R.color.ecc_transparent;
        }
        rootLayout.setBackgroundColor(iu1.c(context, i));
    }
}
