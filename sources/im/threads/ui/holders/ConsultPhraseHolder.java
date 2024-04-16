package im.threads.ui.holders;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import im.threads.R;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.imageLoading.ImageModifications;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.ExtractedLink;
import im.threads.business.models.FileDescription;
import im.threads.business.models.Quote;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.ogParser.OGDataContent;
import im.threads.business.utils.FileUtils;
import im.threads.business.utils.UrlUtils;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.utils.ViewUtils;
import im.threads.ui.views.CircularProgressButton;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: ConsultPhraseHolder.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M\u0012\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J$\u0010\n\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J>\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0006R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001c\u00100\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00106\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010+R\u001c\u00107\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101R\u0014\u00108\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010+R\u0014\u00109\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00101R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00101R\u0014\u0010?\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00101R\u0014\u0010@\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010+R\u0014\u0010A\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010+R\u001c\u0010C\u001a\n /*\u0004\u0018\u00010B0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010F\u001a\n /*\u0004\u0018\u00010E0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010H\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u00101R\u0014\u0010I\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010%R\u0014\u0010J\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u001fR\u001c\u0010K\u001a\n /*\u0004\u0018\u00010B0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010DR\u001c\u0010L\u001a\n /*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u001f¨\u0006T"}, d2 = {"Lim/threads/ui/holders/ConsultPhraseHolder;", "Lim/threads/ui/holders/BaseHolder;", "Lim/threads/business/models/FileDescription;", "fileDescription", "", "setupPaddingsAndBorders", "Landroid/view/View$OnClickListener;", "imageClickListener", "", "isExternalImage", "loadImage", "", "imagePath", "Lim/threads/business/models/ConsultPhrase;", "consultPhrase", "phrase", "showPhrase", "startLoaderAnimation", "stopLoaderAnimation", "showLoaderLayout", "showErrorLayout", "fileClickListener", "showCommonLayout", "highlighted", "onQuoteClickListener", "Landroid/view/View$OnLongClickListener;", "onRowLongClickListener", "onAvatarClickListener", "onBind", "Landroid/view/ViewGroup;", "parent", "Landroid/view/ViewGroup;", "Lim/threads/business/imageLoading/ImageModifications$MaskedModification;", "maskedTransformation", "Lim/threads/business/imageLoading/ImageModifications$MaskedModification;", "Landroid/view/View;", "fileRow", "Landroid/view/View;", "Landroid/widget/LinearLayout;", "quoteLayout", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "quoteTextHeader", "Landroid/widget/TextView;", "quoteTextDescription", "quoteTextTimeStamp", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "quoteFileImage", "Landroid/widget/ImageView;", "Lim/threads/ui/views/CircularProgressButton;", "quoteProgressButton", "Lim/threads/ui/views/CircularProgressButton;", "circularProgressButton", "errorTextView", "fileImage", "rightTextHeader", ElementGenerator.TYPE_IMAGE, "Landroid/widget/FrameLayout;", "imageRoot", "Landroid/widget/FrameLayout;", "imageLayout", "errorImage", "loaderImage", "rightTextDescription", "rightTextFileStamp", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "timeStampTextView", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "Lim/threads/ui/widget/textView/BubbleMessageTextView;", "phraseTextView", "Lim/threads/ui/widget/textView/BubbleMessageTextView;", "consultAvatar", "phraseFrame", "ogDataLayout", "ogTimestamp", "bubbleLayout", "Lks8;", "Lim/threads/business/models/ChatItem;", "highlightingStream", "Lim/threads/business/ogParser/OpenGraphParser;", "openGraphParser", "<init>", "(Landroid/view/ViewGroup;Lim/threads/business/imageLoading/ImageModifications$MaskedModification;Lks8;Lim/threads/business/ogParser/OpenGraphParser;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ConsultPhraseHolder extends BaseHolder {
    private final ViewGroup bubbleLayout;
    private final CircularProgressButton circularProgressButton;
    private final ImageView consultAvatar;
    private final ImageView errorImage;
    private final TextView errorTextView;
    private final ImageView fileImage;
    private final View fileRow;
    private final ImageView image;
    private final FrameLayout imageLayout;
    private final FrameLayout imageRoot;
    private final ImageView loaderImage;
    private final ImageModifications.MaskedModification maskedTransformation;
    private final ViewGroup ogDataLayout;
    private final BubbleTimeTextView ogTimestamp;
    private final ViewGroup parent;
    private final View phraseFrame;
    private final BubbleMessageTextView phraseTextView;
    private final ImageView quoteFileImage;
    private final LinearLayout quoteLayout;
    private final CircularProgressButton quoteProgressButton;
    private final TextView quoteTextDescription;
    private final TextView quoteTextHeader;
    private final TextView quoteTextTimeStamp;
    private final TextView rightTextDescription;
    private final TextView rightTextFileStamp;
    private final TextView rightTextHeader;
    private final BubbleTimeTextView timeStampTextView;

    /* compiled from: ConsultPhraseHolder.kt */
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
    public ConsultPhraseHolder(android.view.ViewGroup r8, im.threads.business.imageLoading.ImageModifications.MaskedModification r9, defpackage.ks8<im.threads.business.models.ChatItem> r10, im.threads.business.ogParser.OpenGraphParser r11) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.ConsultPhraseHolder.<init>(android.view.ViewGroup, im.threads.business.imageLoading.ImageModifications$MaskedModification, ks8, im.threads.business.ogParser.OpenGraphParser):void");
    }

    private final void loadImage(FileDescription fileDescription, View.OnClickListener onClickListener, boolean z) {
        boolean y;
        FileDescription previewFileDescription = fileDescription.getPreviewFileDescription();
        if (previewFileDescription != null) {
            Uri previewUri = getPreviewUri(previewFileDescription.getPreviewFileDescription());
            String str = null;
            String uri = previewUri != null ? previewUri.toString() : null;
            if (uri != null) {
                y = l0b.y(uri);
                if (!y) {
                    if (previewUri != null) {
                        str = previewUri.toString();
                    }
                    loadImage(str, onClickListener, z);
                }
            }
            str = previewFileDescription.getDownloadPath();
            loadImage(str, onClickListener, z);
        }
    }

    static /* synthetic */ void loadImage$default(ConsultPhraseHolder consultPhraseHolder, FileDescription fileDescription, View.OnClickListener onClickListener, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        consultPhraseHolder.loadImage(fileDescription, onClickListener, z);
    }

    private final void setupPaddingsAndBorders(FileDescription fileDescription) {
        boolean z;
        AttachmentStateEnum attachmentStateEnum;
        ViewGroup viewGroup = this.bubbleLayout;
        ChatStyle chatStyle = Config.Companion.getInstance().getChatStyle();
        Resources resources = viewGroup.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(chatStyle.incomingImageLeftBorderSize);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(chatStyle.incomingImageTopBorderSize);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(chatStyle.incomingImageRightBorderSize);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(chatStyle.incomingImageBottomBorderSize);
        if (dimensionPixelSize == 0 && dimensionPixelSize2 == 0 && dimensionPixelSize3 == 0 && dimensionPixelSize4 == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean isImage = FileUtils.isImage(fileDescription);
        setImageSize(this.imageRoot);
        ViewGroup viewGroup2 = this.bubbleLayout;
        z65.g(viewGroup2, "bubbleLayout");
        setLayoutMargins(true, viewGroup2);
        if (isImage) {
            if (fileDescription != null) {
                attachmentStateEnum = fileDescription.getState();
            } else {
                attachmentStateEnum = null;
            }
            if (attachmentStateEnum == AttachmentStateEnum.READY) {
                ViewExtensionsKt.visible(this.imageRoot);
                ViewGroup.LayoutParams layoutParams = this.bubbleLayout.getLayoutParams();
                z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(0);
                this.bubbleLayout.setLayoutParams(marginLayoutParams);
                this.bubbleLayout.invalidate();
                this.bubbleLayout.requestLayout();
                if (z) {
                    this.phraseFrame.setPadding(0, 0, 0, 0);
                    this.quoteLayout.setPadding(0, 0, 0, 0);
                    z65.g(viewGroup, "this");
                    setPaddings(true, viewGroup);
                } else {
                    viewGroup.setPadding(0, 0, 0, 0);
                    ViewGroup.LayoutParams layoutParams2 = this.image.getLayoutParams();
                    z65.f(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                    layoutParams3.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
                    this.image.setLayoutParams(layoutParams3);
                    this.phraseFrame.setPadding(dimensionPixelSize, 0, dimensionPixelSize3, resources.getDimensionPixelSize(getStyle().bubbleIncomingPaddingBottom));
                    this.quoteLayout.setPadding(dimensionPixelSize, resources.getDimensionPixelSize(getStyle().bubbleIncomingPaddingTop), dimensionPixelSize3, 0);
                }
                this.image.invalidate();
                this.image.requestLayout();
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams4 = this.bubbleLayout.getLayoutParams();
        z65.f(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams2.width = -2;
        marginLayoutParams2.height = -2;
        marginLayoutParams2.setMarginEnd(resources.getDimensionPixelSize(R.dimen.ecc_user_margin_right));
        this.bubbleLayout.invalidate();
        this.bubbleLayout.requestLayout();
        ViewExtensionsKt.gone(this.imageRoot);
        this.phraseFrame.setPadding(0, 0, 0, 0);
        this.quoteLayout.setPadding(0, 0, 0, 0);
        z65.g(viewGroup, "this");
        setPaddings(true, viewGroup);
    }

    private final void showCommonLayout(FileDescription fileDescription, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        boolean z;
        String from;
        int downloadProgress;
        this.imageRoot.setVisibility(8);
        this.fileRow.setVisibility(0);
        this.errorTextView.setVisibility(8);
        this.circularProgressButton.setVisibility(0);
        getRotateAnim().cancel();
        if (fileDescription.getState() == AttachmentStateEnum.READY) {
            z = true;
        } else {
            z = false;
        }
        if (z && FileUtils.isImage(fileDescription)) {
            loadImage$default(this, fileDescription, onClickListener2, false, 4, (Object) null);
        } else if (!z && FileUtils.isImage(fileDescription)) {
            startLoaderAnimation();
        } else {
            this.fileRow.setVisibility(0);
            this.circularProgressButton.setVisibility(0);
            this.circularProgressButton.setClickable(true);
            this.circularProgressButton.setOnClickListener(onClickListener);
            TextView textView = this.rightTextHeader;
            if (fileDescription.getFrom() == null) {
                from = "";
            } else {
                from = fileDescription.getFrom();
            }
            textView.setText(from);
            if (!TextUtils.isEmpty(this.rightTextHeader.getText())) {
                this.rightTextHeader.setVisibility(0);
            } else {
                this.rightTextHeader.setVisibility(8);
            }
            fileNameFromDescription(fileDescription, new ConsultPhraseHolder$showCommonLayout$1(this, fileDescription));
            this.rightTextFileStamp.setText(this.itemView.getContext().getString(R.string.ecc_sent_at, getQuoteSdf().format(new Date(fileDescription.getTimeStamp()))));
            CircularProgressButton circularProgressButton = this.circularProgressButton;
            if (fileDescription.getFileUri() != null) {
                downloadProgress = 100;
            } else {
                downloadProgress = fileDescription.getDownloadProgress();
            }
            circularProgressButton.setProgress(downloadProgress);
        }
    }

    private final void showErrorLayout(FileDescription fileDescription) {
        this.fileRow.setVisibility(0);
        ImageView imageView = this.fileImage;
        z65.g(imageView, "fileImage");
        imageView.setVisibility(0);
        this.errorTextView.setVisibility(0);
        this.imageLayout.setVisibility(8);
        this.circularProgressButton.setVisibility(8);
        this.fileImage.setBackground(null);
        this.imageRoot.setVisibility(8);
        this.fileImage.setImageResource(getErrorImageResByErrorCode(fileDescription.getErrorCode()));
        this.rightTextDescription.setText(fileDescription.getIncomingName());
        this.errorTextView.setText(getString(getErrorStringResByErrorCode(fileDescription.getErrorCode())));
        getRotateAnim().cancel();
    }

    private final void showLoaderLayout(FileDescription fileDescription) {
        this.fileRow.setVisibility(0);
        ImageView imageView = this.fileImage;
        z65.g(imageView, "fileImage");
        imageView.setVisibility(0);
        this.errorTextView.setVisibility(8);
        this.rightTextDescription.setText(fileDescription.getIncomingName());
        this.circularProgressButton.setVisibility(8);
        this.imageRoot.setVisibility(8);
        this.fileImage.setBackground(null);
        ImageView imageView2 = this.fileImage;
        z65.g(imageView2, "fileImage");
        initAnimation(imageView2, true);
    }

    private final void showPhrase(ConsultPhrase consultPhrase, String str) {
        ExtractedLink extractLink;
        BubbleMessageTextView bubbleMessageTextView = this.phraseTextView;
        BubbleTimeTextView bubbleTimeTextView = this.timeStampTextView;
        z65.g(bubbleTimeTextView, "timeStampTextView");
        bubbleMessageTextView.bindTimestampView(bubbleTimeTextView);
        ViewExtensionsKt.visible(this.phraseTextView);
        String extractDeepLink = UrlUtils.extractDeepLink(str);
        if (getStyle().linkPreviewEnabled) {
            extractLink = bindOGData(str);
        } else {
            extractLink = UrlUtils.extractLink(str);
        }
        List<String> extractEmailAddresses = UrlUtils.extractEmailAddresses(str);
        BubbleMessageTextView bubbleMessageTextView2 = this.phraseTextView;
        z65.g(bubbleMessageTextView2, "phraseTextView");
        String formattedPhrase = consultPhrase.getFormattedPhrase();
        String phraseText = consultPhrase.getPhraseText();
        if (extractDeepLink == null) {
            if (extractLink != null) {
                extractDeepLink = extractLink.getLink();
            } else {
                extractDeepLink = null;
            }
        }
        highlightOperatorText(bubbleMessageTextView2, formattedPhrase, phraseText, extractDeepLink, extractEmailAddresses);
    }

    private final void startLoaderAnimation() {
        this.imageLayout.setVisibility(0);
        this.loaderImage.setVisibility(0);
        this.image.setVisibility(4);
        initAnimation(this.loaderImage, true);
        getRotateAnim().setDuration(3000L);
        getRotateAnim().setRepeatCount(-1);
        this.loaderImage.setAnimation(getRotateAnim());
        getRotateAnim().start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLoaderAnimation() {
        this.loaderImage.setVisibility(4);
        this.image.setVisibility(0);
        getRotateAnim().cancel();
        getRotateAnim().reset();
    }

    public final void onBind(ConsultPhrase consultPhrase, boolean z, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener4) {
        List<? extends TextView> o;
        Unit unit;
        String extractImageMarkdownLink;
        CharSequence R0;
        z65.h(consultPhrase, "consultPhrase");
        z65.h(onClickListener, "imageClickListener");
        z65.h(onClickListener2, "fileClickListener");
        z65.h(onClickListener3, "onQuoteClickListener");
        z65.h(onLongClickListener, "onRowLongClickListener");
        z65.h(onClickListener4, "onAvatarClickListener");
        this.phraseTextView.setText("");
        ViewExtensionsKt.invisible(this.consultAvatar);
        setupPaddingsAndBorders(consultPhrase.getFileDescription());
        View view = this.itemView;
        z65.g(view, "itemView");
        subscribeForHighlighting(consultPhrase, view);
        subscribeForOpenGraphData(new OGDataContent(new WeakReference(this.ogDataLayout), new WeakReference(this.ogTimestamp), new WeakReference(this.timeStampTextView), consultPhrase.getPhraseText(), null, 16, null));
        o = kc1.o(this.ogTimestamp, this.timeStampTextView);
        showConsultTimeStamp(consultPhrase, o);
        this.imageLayout.setVisibility(8);
        this.fileRow.setVisibility(8);
        this.quoteLayout.setVisibility(8);
        this.imageRoot.setVisibility(8);
        ViewGroup viewGroup = this.bubbleLayout;
        z65.g(viewGroup, "bubbleLayout");
        setLayoutMargins(true, viewGroup);
        changeHighlighting(z);
        ImageView imageView = this.consultAvatar;
        z65.g(imageView, "consultAvatar");
        showAvatar(imageView, consultPhrase, onClickListener4);
        if (consultPhrase.getModified() == ModificationStateEnum.DELETED) {
            this.phraseTextView.setTextSize(0, this.itemView.getContext().getResources().getDimension(getStyle().systemMessageTextSize));
            this.phraseTextView.setTextColor(iu1.c(this.itemView.getContext(), getStyle().systemMessageTextColorResId));
            BubbleMessageTextView bubbleMessageTextView = this.phraseTextView;
            BubbleTimeTextView bubbleTimeTextView = this.timeStampTextView;
            z65.g(bubbleTimeTextView, "timeStampTextView");
            bubbleMessageTextView.bindTimestampView(bubbleTimeTextView);
            ViewExtensionsKt.visible(this.phraseTextView);
            this.phraseTextView.setText(this.itemView.getContext().getString(R.string.ecc_message_deleted));
            ViewUtils viewUtils = getViewUtils();
            View view2 = this.itemView;
            z65.f(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            viewUtils.removeClickListener((ViewGroup) view2);
            return;
        }
        ViewUtils viewUtils2 = getViewUtils();
        View view3 = this.itemView;
        z65.f(view3, "null cannot be cast to non-null type android.view.ViewGroup");
        viewUtils2.setClickListener((ViewGroup) view3, onLongClickListener);
        BubbleMessageTextView bubbleMessageTextView2 = this.phraseTextView;
        z65.g(bubbleMessageTextView2, "phraseTextView");
        setTextColorToViews(new TextView[]{bubbleMessageTextView2}, getStyle().incomingMessageTextColor);
        String phraseText = consultPhrase.getPhraseText();
        Unit unit2 = null;
        if (phraseText != null) {
            R0 = m0b.R0(phraseText);
            showPhrase(consultPhrase, R0.toString());
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            BubbleMessageTextView bubbleMessageTextView3 = this.phraseTextView;
            z65.g(bubbleMessageTextView3, "phraseTextView");
            bubbleMessageTextView3.setVisibility(8);
        }
        Quote quote = consultPhrase.getQuote();
        if (quote != null) {
            LinearLayout linearLayout = this.quoteLayout;
            TextView textView = this.quoteTextHeader;
            TextView textView2 = this.quoteTextDescription;
            TextView textView3 = this.quoteTextTimeStamp;
            ImageView imageView2 = this.quoteFileImage;
            z65.g(imageView2, "quoteFileImage");
            showQuote(quote, onClickListener3, linearLayout, textView, textView2, textView3, imageView2, this.quoteProgressButton);
            unit2 = Unit.a;
        }
        if (unit2 == null) {
            this.quoteLayout.setVisibility(8);
        }
        FileDescription fileDescription = consultPhrase.getFileDescription();
        if (fileDescription != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[fileDescription.getState().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    showCommonLayout(fileDescription, onClickListener2, onClickListener);
                } else {
                    showErrorLayout(fileDescription);
                }
            } else {
                showLoaderLayout(fileDescription);
            }
        } else {
            String formattedPhrase = consultPhrase.getFormattedPhrase();
            if (formattedPhrase != null && (extractImageMarkdownLink = UrlUtils.INSTANCE.extractImageMarkdownLink(formattedPhrase)) != null) {
                loadImage(extractImageMarkdownLink, onClickListener, true);
            }
        }
        if (consultPhrase.getFileDescription() == null && consultPhrase.getQuote() == null) {
            this.phraseFrame.getLayoutParams().width = -2;
        } else {
            this.phraseFrame.getLayoutParams().width = -1;
        }
    }

    static /* synthetic */ void loadImage$default(ConsultPhraseHolder consultPhraseHolder, String str, View.OnClickListener onClickListener, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        consultPhraseHolder.loadImage(str, onClickListener, z);
    }

    private final void loadImage(String str, View.OnClickListener onClickListener, boolean z) {
        hideErrorImage(this.imageLayout, this.errorImage);
        ViewExtensionsKt.gone(this.fileRow);
        ViewExtensionsKt.gone(this.circularProgressButton);
        ViewExtensionsKt.visible(this.image);
        ViewExtensionsKt.visible(this.imageRoot);
        this.image.setOnClickListener(onClickListener);
        if (str != null && str.length() != 0) {
            startLoaderAnimation();
            ImageLoader callback = ImageLoader.Companion.get().load(str).autoRotateWithExif(true).scales(ImageView.ScaleType.FIT_XY, ImageView.ScaleType.CENTER_CROP).modifications(this.maskedTransformation).callback(new ImageLoader.ImageLoaderCallback() { // from class: im.threads.ui.holders.ConsultPhraseHolder$loadImage$loadConfig$1
                @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
                public void onBitmapLoaded(Bitmap bitmap) {
                    ImageLoader.ImageLoaderCallback.DefaultImpls.onBitmapLoaded(this, bitmap);
                }

                @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
                public void onImageLoadError() {
                    FrameLayout frameLayout;
                    ImageView imageView;
                    ConsultPhraseHolder consultPhraseHolder = ConsultPhraseHolder.this;
                    frameLayout = consultPhraseHolder.imageLayout;
                    imageView = ConsultPhraseHolder.this.errorImage;
                    consultPhraseHolder.showErrorImage(frameLayout, imageView);
                    ConsultPhraseHolder.this.stopLoaderAnimation();
                }

                @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
                public void onImageLoaded() {
                    ConsultPhraseHolder.this.stopLoaderAnimation();
                }
            });
            if (z) {
                callback.disableEdnaSsl();
            }
            callback.into(this.image);
            return;
        }
        this.image.setImageResource(getStyle().imagePlaceholder);
    }
}
