package im.threads.ui.holders;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.imageLoading.ImageModifications;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.UserPhrase;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.ui.config.Config;
import im.threads.ui.holders.BaseHolder;
import im.threads.ui.holders.ImageFromUserViewHolder;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: ImageFromUserViewHolder.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B=\u0012\u0006\u00109\u001a\u00020\u0010\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\"\u0012\u0006\u0010=\u001a\u00020<\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\"¢\u0006\u0004\b>\u0010?J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J*\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u0019\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J&\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006@"}, d2 = {"Lim/threads/ui/holders/ImageFromUserViewHolder;", "Lim/threads/ui/holders/BaseImageHolder;", "", "isChosen", "Ljava/lang/Runnable;", "longClickRunnable", "", "bindIsChosen", "Lim/threads/business/models/FileDescription;", "fileDescription", "Lim/threads/business/models/MessageStatus;", "messageStatus", "bindImage", "", "timeStamp", "bindTimeStamp", "Landroid/view/ViewGroup;", "layout", "applyBubbleLayoutStyle", "showLoaderLayout", "showErrorLayout", "showErrorBubble", "showNormalBubble", "scrollToErrorIfAppearsFirstTime", "showBubbleByCurrentStatus", "showCommonLayout", "Lim/threads/business/models/UserPhrase;", "userPhrase", "highlighted", "clickRunnable", "onBind", "Lim/threads/business/imageLoading/ImageModifications$MaskedModification;", "maskedTransformation", "Lim/threads/business/imageLoading/ImageModifications$MaskedModification;", "Lks8;", "messageErrorProcessor", "Lks8;", "Ljava/text/SimpleDateFormat;", "sdf", "Ljava/text/SimpleDateFormat;", "Ljava/lang/Long;", "", "loadedUri", "Ljava/lang/String;", "Landroid/widget/RelativeLayout;", "loaderLayoutRoot", "Landroid/widget/RelativeLayout;", "Landroid/widget/TextView;", "errorText", "Landroid/widget/TextView;", "fileName", "Landroid/widget/ImageView;", "loader", "Landroid/widget/ImageView;", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "timeStampLoading", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "parent", "Lim/threads/business/models/ChatItem;", "highlightingStream", "Lim/threads/business/ogParser/OpenGraphParser;", "openGraphParser", "<init>", "(Landroid/view/ViewGroup;Lim/threads/business/imageLoading/ImageModifications$MaskedModification;Lks8;Lim/threads/business/ogParser/OpenGraphParser;Lks8;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ImageFromUserViewHolder extends BaseImageHolder {
    private final TextView errorText;
    private final TextView fileName;
    private String loadedUri;
    private final ImageView loader;
    private final RelativeLayout loaderLayoutRoot;
    private final ImageModifications.MaskedModification maskedTransformation;
    private final ks8<Long> messageErrorProcessor;
    private final SimpleDateFormat sdf;
    private Long timeStamp;
    private final BubbleTimeTextView timeStampLoading;

    /* compiled from: ImageFromUserViewHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageStatus.values().length];
            try {
                iArr[MessageStatus.SENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageStatus.SENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageStatus.ENQUEUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageStatus.DELIVERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageStatus.READ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MessageStatus.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImageFromUserViewHolder(android.view.ViewGroup r4, im.threads.business.imageLoading.ImageModifications.MaskedModification r5, defpackage.ks8<im.threads.business.models.ChatItem> r6, im.threads.business.ogParser.OpenGraphParser r7, defpackage.ks8<java.lang.Long> r8) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            defpackage.z65.h(r4, r0)
            java.lang.String r0 = "highlightingStream"
            defpackage.z65.h(r6, r0)
            java.lang.String r0 = "openGraphParser"
            defpackage.z65.h(r7, r0)
            java.lang.String r0 = "messageErrorProcessor"
            defpackage.z65.h(r8, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = im.threads.R.layout.ecc_item_user_image_from
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "from(parent.context).inf…mage_from, parent, false)"
            defpackage.z65.g(r4, r0)
            r3.<init>(r4, r6, r7, r2)
            r3.maskedTransformation = r5
            r3.messageErrorProcessor = r8
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "HH:mm"
            java.util.Locale r6 = java.util.Locale.getDefault()
            r4.<init>(r5, r6)
            r3.sdf = r4
            android.view.View r4 = r3.itemView
            int r5 = im.threads.R.id.loaderLayoutRoot
            android.view.View r4 = r4.findViewById(r5)
            java.lang.String r5 = "itemView.findViewById(R.id.loaderLayoutRoot)"
            defpackage.z65.g(r4, r5)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r3.loaderLayoutRoot = r4
            android.view.View r5 = r3.itemView
            int r6 = im.threads.R.id.errorText
            android.view.View r5 = r5.findViewById(r6)
            java.lang.String r6 = "itemView.findViewById(R.id.errorText)"
            defpackage.z65.g(r5, r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.errorText = r5
            android.view.View r6 = r3.itemView
            int r7 = im.threads.R.id.fileName
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "itemView.findViewById(R.id.fileName)"
            defpackage.z65.g(r6, r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3.fileName = r6
            android.view.View r7 = r3.itemView
            int r8 = im.threads.R.id.loader
            android.view.View r7 = r7.findViewById(r8)
            java.lang.String r8 = "itemView.findViewById(R.id.loader)"
            defpackage.z65.g(r7, r8)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r3.loader = r7
            android.view.View r7 = r3.itemView
            int r8 = im.threads.R.id.timeStampLoading
            android.view.View r7 = r7.findViewById(r8)
            java.lang.String r8 = "itemView.findViewById(R.id.timeStampLoading)"
            defpackage.z65.g(r7, r8)
            im.threads.ui.widget.textView.BubbleTimeTextView r7 = (im.threads.ui.widget.textView.BubbleTimeTextView) r7
            r3.timeStampLoading = r7
            r7 = 1
            android.widget.TextView[] r7 = new android.widget.TextView[r7]
            r7[r2] = r6
            im.threads.ui.ChatStyle r6 = r3.getStyle()
            int r6 = r6.outgoingMessageTextColor
            r3.setTextColorToViews(r7, r6)
            r3.applyBubbleLayoutStyle(r4)
            im.threads.ui.ChatStyle r4 = r3.getStyle()
            int r4 = r4.errorMessageTextColor
            im.threads.ui.utils.ColorsHelper.setTextColor(r5, r4)
            android.view.View r4 = r3.itemView
            int r5 = im.threads.R.id.delimiter
            android.view.View r4 = r4.findViewById(r5)
            im.threads.ui.ChatStyle r5 = r3.getStyle()
            int r5 = r5.outgoingDelimitersColor
            int r5 = r3.getColorInt(r5)
            r4.setBackgroundColor(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.ImageFromUserViewHolder.<init>(android.view.ViewGroup, im.threads.business.imageLoading.ImageModifications$MaskedModification, ks8, im.threads.business.ogParser.OpenGraphParser, ks8):void");
    }

    private final void applyBubbleLayoutStyle(ViewGroup viewGroup) {
        viewGroup.setBackground(on.b(this.itemView.getContext(), getStyle().outgoingMessageBubbleBackground));
        viewGroup.getBackground().setColorFilter(qc0.a(getColorInt(getStyle().outgoingMessageBubbleColor), uc0.SRC_ATOP));
        setPaddings(false, viewGroup);
        setLayoutMargins(false, viewGroup);
        viewGroup.invalidate();
        viewGroup.requestLayout();
    }

    private final void bindImage(FileDescription fileDescription, MessageStatus messageStatus) {
        if (fileDescription != null) {
            if ((fileDescription.getState() != AttachmentStateEnum.PENDING && messageStatus != MessageStatus.SENDING) || BaseHolder.Companion.getStatuses().get(this.timeStamp) != null) {
                BaseHolder.Companion companion = BaseHolder.Companion;
                MessageStatus messageStatus2 = companion.getStatuses().get(this.timeStamp);
                MessageStatus messageStatus3 = MessageStatus.FAILED;
                if (messageStatus2 == messageStatus3) {
                    if (fileDescription.getState() != AttachmentStateEnum.ERROR && messageStatus != messageStatus3 && (companion.getStatuses().get(this.timeStamp) == null || companion.getStatuses().get(this.timeStamp) != messageStatus3)) {
                        showCommonLayout(fileDescription);
                        return;
                    } else {
                        showErrorLayout(fileDescription);
                        return;
                    }
                }
            }
            showLoaderLayout(fileDescription);
        }
    }

    private final void bindIsChosen(boolean z, final Runnable runnable) {
        getRootLayout().setOnLongClickListener(new View.OnLongClickListener() { // from class: mu4
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean bindIsChosen$lambda$3;
                bindIsChosen$lambda$3 = ImageFromUserViewHolder.bindIsChosen$lambda$3(runnable, view);
                return bindIsChosen$lambda$3;
            }
        });
        changeHighlighting(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindIsChosen$lambda$3(Runnable runnable, View view) {
        z65.h(runnable, "$longClickRunnable");
        runnable.run();
        return true;
    }

    private final void bindTimeStamp(MessageStatus messageStatus, long j, FileDescription fileDescription, final Runnable runnable) {
        Drawable coloredDrawable;
        getTimeStampTextView().setOnLongClickListener(new View.OnLongClickListener() { // from class: pu4
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean bindTimeStamp$lambda$5;
                bindTimeStamp$lambda$5 = ImageFromUserViewHolder.bindTimeStamp$lambda$5(runnable, view);
                return bindTimeStamp$lambda$5;
            }
        });
        String format = this.sdf.format(new Date(j));
        getTimeStampTextView().setText(format);
        this.timeStampLoading.setText(format);
        switch (WhenMappings.$EnumSwitchMapping$0[messageStatus.ordinal()]) {
            case 1:
                MessageStatus messageStatus2 = BaseHolder.Companion.getStatuses().get(Long.valueOf(j));
                if (messageStatus2 != null && messageStatus2 == MessageStatus.FAILED) {
                    coloredDrawable = getColoredDrawable(getStyle().messageFailedIconResId, getStyle().messageFailedIconColorResId);
                    break;
                } else {
                    showCommonLayout(fileDescription);
                    coloredDrawable = getColoredDrawable(getStyle().messageSendingIconResId, getStyle().messageSendingIconColorResId);
                    break;
                }
            case 2:
            case 3:
                showCommonLayout(fileDescription);
                coloredDrawable = getColoredDrawable(getStyle().messageSentIconResId, getStyle().messageSentIconColorResId);
                break;
            case 4:
                showCommonLayout(fileDescription);
                coloredDrawable = getColoredDrawable(getStyle().messageDeliveredIconResId, getStyle().messageDeliveredIconColorResId);
                break;
            case 5:
                showCommonLayout(fileDescription);
                coloredDrawable = getColoredDrawable(getStyle().messageReadIconResId, getStyle().messageReadIconColorResId);
                break;
            case 6:
                if (fileDescription != null) {
                    showErrorLayout(fileDescription);
                }
                scrollToErrorIfAppearsFirstTime();
                coloredDrawable = getColoredDrawable(getStyle().messageFailedIconResId, getStyle().messageFailedIconColorResId);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        getTimeStampTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, coloredDrawable, (Drawable) null);
        this.timeStampLoading.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, coloredDrawable, (Drawable) null);
        BaseHolder.Companion.getStatuses().put(Long.valueOf(j), messageStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindTimeStamp$lambda$5(Runnable runnable, View view) {
        z65.h(runnable, "$longClickRunnable");
        runnable.run();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBind$lambda$1(Runnable runnable, View view) {
        z65.h(runnable, "$clickRunnable");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBind$lambda$2(Runnable runnable, View view) {
        z65.h(runnable, "$longClickRunnable");
        runnable.run();
        return true;
    }

    private final void scrollToErrorIfAppearsFirstTime() {
        Long l;
        MessageStatus messageStatus = BaseHolder.Companion.getStatuses().get(this.timeStamp);
        if ((messageStatus == null || messageStatus != MessageStatus.FAILED) && (l = this.timeStamp) != null) {
            this.messageErrorProcessor.d(Long.valueOf(l.longValue()));
        }
    }

    private final void showBubbleByCurrentStatus(FileDescription fileDescription) {
        MessageStatus messageStatus = BaseHolder.Companion.getStatuses().get(this.timeStamp);
        if (messageStatus != null && messageStatus == MessageStatus.FAILED) {
            if (fileDescription != null) {
                showErrorLayout(fileDescription);
                return;
            }
            return;
        }
        showCommonLayout(fileDescription);
    }

    private final void showCommonLayout(FileDescription fileDescription) {
        String str;
        String uri;
        getImageLayout().setVisibility(0);
        this.errorText.setVisibility(8);
        this.loaderLayoutRoot.setVisibility(8);
        getRotateAnim().cancel();
        showNormalBubble();
        if (fileDescription != null) {
            boolean isDownloadError = fileDescription.isDownloadError();
            Uri fileUri = fileDescription.getFileUri();
            Uri previewUri = getPreviewUri(fileDescription.getPreviewFileDescription());
            FileDescription previewFileDescription = fileDescription.getPreviewFileDescription();
            String str2 = null;
            if (previewFileDescription != null) {
                str = previewFileDescription.getDownloadPath();
            } else {
                str = null;
            }
            if (fileUri != null && (uri = fileUri.toString()) != null) {
                str = uri;
            } else {
                if (previewUri != null) {
                    str2 = previewUri.toString();
                }
                if (str2 != null) {
                    str = str2;
                }
            }
            if (str != null && str.length() != 0 && !isDownloadError) {
                ImageLoader.Companion.get().autoRotateWithExif(true).load(str).scales(ImageView.ScaleType.FIT_XY, ImageView.ScaleType.CENTER_CROP).modifications(this.maskedTransformation).errorDrawableResourceId(Integer.valueOf(getStyle().imagePlaceholder)).into(getImage());
                this.loadedUri = String.valueOf(fileUri);
            } else {
                getImage().setImageResource(getStyle().imagePlaceholder);
            }
            moveTimeToImageLayout();
        }
    }

    private final void showErrorBubble() {
        this.loaderLayoutRoot.getBackground().setColorFilter(qc0.a(getColorInt(getStyle().messageNotSentBubbleBackgroundColor), uc0.SRC_ATOP));
    }

    private final void showErrorLayout(FileDescription fileDescription) {
        this.errorText.setVisibility(0);
        this.loaderLayoutRoot.setVisibility(0);
        getImageLayout().setVisibility(8);
        showErrorBubble();
        if (fileDescription != null) {
            this.loader.setImageResource(getErrorImageResByErrorCode(fileDescription.getErrorCode()));
            ColorsHelper.setTint(this.itemView.getContext(), this.loader, Config.Companion.getInstance().getChatStyle().messageNotSentErrorImageColor);
            fileNameFromDescription(fileDescription, new ImageFromUserViewHolder$showErrorLayout$1(this));
            this.errorText.setText(getString(getErrorStringResByErrorCode(fileDescription.getErrorCode())));
            getRotateAnim().cancel();
        }
    }

    private final void showLoaderLayout(FileDescription fileDescription) {
        this.loaderLayoutRoot.setVisibility(0);
        getImageLayout().setVisibility(8);
        this.errorText.setVisibility(8);
        TextView textView = this.fileName;
        String incomingName = fileDescription.getIncomingName();
        if (incomingName == null) {
            incomingName = "";
        }
        textView.setText(incomingName);
        initAnimation(this.loader, false);
    }

    private final void showNormalBubble() {
        this.loaderLayoutRoot.getBackground().setColorFilter(qc0.a(getColorInt(getStyle().outgoingMessageBubbleColor), uc0.SRC_ATOP));
    }

    public final void onBind(UserPhrase userPhrase, boolean z, final Runnable runnable, final Runnable runnable2) {
        z65.h(userPhrase, "userPhrase");
        z65.h(runnable, "clickRunnable");
        z65.h(runnable2, "longClickRunnable");
        this.timeStamp = Long.valueOf(userPhrase.getTimeStamp());
        showBubbleByCurrentStatus(userPhrase.getFileDescription());
        View view = this.itemView;
        z65.g(view, "itemView");
        subscribeForHighlighting(userPhrase, view);
        getImage().setOnClickListener(new View.OnClickListener() { // from class: nu4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ImageFromUserViewHolder.onBind$lambda$1(runnable, view2);
            }
        });
        getImage().setOnLongClickListener(new View.OnLongClickListener() { // from class: ou4
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean onBind$lambda$2;
                onBind$lambda$2 = ImageFromUserViewHolder.onBind$lambda$2(runnable2, view2);
                return onBind$lambda$2;
            }
        });
        bindImage(userPhrase.getFileDescription(), userPhrase.getSentState());
        bindIsChosen(z, runnable2);
        bindTimeStamp(userPhrase.getSentState(), userPhrase.getTimeStamp(), userPhrase.getFileDescription(), runnable2);
    }
}
