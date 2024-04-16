package im.threads.ui.holders;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.UserPhrase;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.utils.FileUtilsKt;
import im.threads.ui.holders.UserFileViewHolder;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.views.CircularProgressButton;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UserFileViewHolder.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 D2\u00020\u0001:\u0001DB3\u0012\u0006\u0010=\u001a\u00020<\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0!\u0012\u0006\u0010A\u001a\u00020@\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!¢\u0006\u0004\bB\u0010CJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\bH\u0002J.\u0010 \u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010;\u001a\n :*\u0004\u0018\u00010)0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010+¨\u0006E"}, d2 = {"Lim/threads/ui/holders/UserFileViewHolder;", "Lim/threads/ui/holders/BaseHolder;", "Lim/threads/business/models/MessageStatus;", "messageStatus", "", "timeStamp", "Landroid/view/View$OnLongClickListener;", "onLongClick", "", "bindTimeStamp", "Lim/threads/business/models/FileDescription;", "fileDescription", "Landroid/view/View$OnClickListener;", "onClickListener", "checkAttachmentError", "buttonClickListener", "updateFileView", "showPendingView", "showReadyView", "showErrorLayout", "hideErrorLayout", "showCircularProgressButton", "showLoader", "scrollToErrorIfAppearsFirstTime", "showErrorBubble", "showNormalBubble", "showBubbleByCurrentStatus", "Lim/threads/business/models/UserPhrase;", "userPhrase", "rowClickListener", "", "isFilterVisible", "onBind", "Lks8;", "messageErrorProcessor", "Lks8;", "Ljava/text/SimpleDateFormat;", "sdf", "Ljava/text/SimpleDateFormat;", "Ljava/lang/Long;", "Lim/threads/business/models/FileDescription;", "Landroid/widget/TextView;", "fileHeaderTextView", "Landroid/widget/TextView;", "fileSizeTextView", "errorTextView", "Landroid/widget/ImageView;", "loader", "Landroid/widget/ImageView;", "Landroid/widget/LinearLayout;", "rootLayout", "Landroid/widget/LinearLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "bubbleLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lim/threads/ui/views/CircularProgressButton;", "circularProgressButton", "Lim/threads/ui/views/CircularProgressButton;", "kotlin.jvm.PlatformType", "timeStampTextView", "Landroid/view/ViewGroup;", "parent", "Lim/threads/business/models/ChatItem;", "highlightingStream", "Lim/threads/business/ogParser/OpenGraphParser;", "openGraphParser", "<init>", "(Landroid/view/ViewGroup;Lks8;Lim/threads/business/ogParser/OpenGraphParser;Lks8;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class UserFileViewHolder extends BaseHolder {
    public static final Companion Companion = new Companion(null);
    private static final HashMap<String, AttachmentStateEnum> fileStatuses = new HashMap<>();
    private final ConstraintLayout bubbleLayout;
    private final CircularProgressButton circularProgressButton;
    private final TextView errorTextView;
    private FileDescription fileDescription;
    private final TextView fileHeaderTextView;
    private final TextView fileSizeTextView;
    private final ImageView loader;
    private final ks8<Long> messageErrorProcessor;
    private final LinearLayout rootLayout;
    private final SimpleDateFormat sdf;
    private Long timeStamp;
    private final TextView timeStampTextView;

    /* compiled from: UserFileViewHolder.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lim/threads/ui/holders/UserFileViewHolder$Companion;", "", "()V", "fileStatuses", "Ljava/util/HashMap;", "", "Lim/threads/business/models/enums/AttachmentStateEnum;", "Lkotlin/collections/HashMap;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: UserFileViewHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[AttachmentStateEnum.values().length];
            try {
                iArr2[AttachmentStateEnum.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AttachmentStateEnum.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UserFileViewHolder(android.view.ViewGroup r8, defpackage.ks8<im.threads.business.models.ChatItem> r9, im.threads.business.ogParser.OpenGraphParser r10, defpackage.ks8<java.lang.Long> r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.UserFileViewHolder.<init>(android.view.ViewGroup, ks8, im.threads.business.ogParser.OpenGraphParser, ks8):void");
    }

    private final void bindTimeStamp(MessageStatus messageStatus, long j, final View.OnLongClickListener onLongClickListener) {
        Drawable coloredDrawable;
        this.timeStampTextView.setOnLongClickListener(new View.OnLongClickListener() { // from class: hub
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean bindTimeStamp$lambda$3;
                bindTimeStamp$lambda$3 = UserFileViewHolder.bindTimeStamp$lambda$3(onLongClickListener, view);
                return bindTimeStamp$lambda$3;
            }
        });
        this.timeStampTextView.setText(this.sdf.format(new Date(j)));
        switch (WhenMappings.$EnumSwitchMapping$0[messageStatus.ordinal()]) {
            case 1:
                MessageStatus messageStatus2 = BaseHolder.Companion.getStatuses().get(Long.valueOf(j));
                if (messageStatus2 != null && messageStatus2 == MessageStatus.FAILED) {
                    coloredDrawable = getColoredDrawable(getStyle().messageFailedIconResId, getStyle().messageFailedIconColorResId);
                    break;
                } else {
                    showNormalBubble();
                    showPendingView();
                    coloredDrawable = getColoredDrawable(getStyle().messageSendingIconResId, getStyle().messageSendingIconColorResId);
                    break;
                }
                break;
            case 2:
            case 3:
                showNormalBubble();
                ViewExtensionsKt.gone(this.loader);
                coloredDrawable = getColoredDrawable(getStyle().messageSentIconResId, getStyle().messageSentIconColorResId);
                break;
            case 4:
                showNormalBubble();
                ViewExtensionsKt.gone(this.loader);
                coloredDrawable = getColoredDrawable(getStyle().messageDeliveredIconResId, getStyle().messageDeliveredIconColorResId);
                break;
            case 5:
                showNormalBubble();
                ViewExtensionsKt.gone(this.loader);
                coloredDrawable = getColoredDrawable(getStyle().messageReadIconResId, getStyle().messageReadIconColorResId);
                break;
            case 6:
                showErrorBubble();
                scrollToErrorIfAppearsFirstTime();
                ViewExtensionsKt.gone(this.loader);
                coloredDrawable = getColoredDrawable(getStyle().messageFailedIconResId, getStyle().messageFailedIconColorResId);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.timeStampTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, coloredDrawable, (Drawable) null);
        BaseHolder.Companion.getStatuses().put(Long.valueOf(j), messageStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindTimeStamp$lambda$3(View.OnLongClickListener onLongClickListener, View view) {
        z65.h(onLongClickListener, "$onLongClick");
        onLongClickListener.onLongClick(view);
        return true;
    }

    private final void checkAttachmentError(FileDescription fileDescription, View.OnClickListener onClickListener) {
        if (fileDescription.getState() == AttachmentStateEnum.ERROR) {
            showErrorLayout(fileDescription);
            return;
        }
        hideErrorLayout();
        updateFileView(fileDescription, onClickListener);
    }

    private final void hideErrorLayout() {
        ViewExtensionsKt.gone(this.errorTextView);
    }

    private final void scrollToErrorIfAppearsFirstTime() {
        Long l;
        MessageStatus messageStatus = BaseHolder.Companion.getStatuses().get(this.timeStamp);
        if ((messageStatus == null || messageStatus != MessageStatus.FAILED) && (l = this.timeStamp) != null) {
            this.messageErrorProcessor.d(Long.valueOf(l.longValue()));
        }
    }

    private final void showBubbleByCurrentStatus() {
        MessageStatus messageStatus = BaseHolder.Companion.getStatuses().get(this.timeStamp);
        if (messageStatus != null && messageStatus == MessageStatus.FAILED) {
            showErrorBubble();
        } else {
            showNormalBubble();
        }
    }

    private final void showCircularProgressButton() {
        Uri uri;
        FileDescription fileDescription = this.fileDescription;
        Integer num = null;
        if (fileDescription != null) {
            uri = fileDescription.getFileUri();
        } else {
            uri = null;
        }
        int i = 100;
        if (uri != null) {
            num = 100;
        } else {
            FileDescription fileDescription2 = this.fileDescription;
            if (fileDescription2 != null) {
                num = Integer.valueOf(fileDescription2.getDownloadProgress());
            }
        }
        CircularProgressButton circularProgressButton = this.circularProgressButton;
        if (num != null) {
            i = num.intValue();
        }
        circularProgressButton.setProgress(i);
        ViewExtensionsKt.visible(this.circularProgressButton);
        ViewExtensionsKt.gone(this.loader);
    }

    private final void showErrorBubble() {
        this.bubbleLayout.getBackground().setColorFilter(qc0.a(getColorInt(getStyle().messageNotSentBubbleBackgroundColor), uc0.SRC_ATOP));
        FileDescription fileDescription = this.fileDescription;
        if (fileDescription != null) {
            showErrorLayout(fileDescription);
        }
    }

    private final void showErrorLayout(FileDescription fileDescription) {
        showLoader();
        ViewExtensionsKt.visible(this.errorTextView);
        this.loader.setImageResource(getErrorImageResByErrorCode(fileDescription.getErrorCode()));
        this.errorTextView.setText(getString(getErrorStringResByErrorCode(fileDescription.getErrorCode())));
    }

    private final void showLoader() {
        ViewExtensionsKt.invisible(this.circularProgressButton);
        ViewExtensionsKt.visible(this.loader);
    }

    private final void showNormalBubble() {
        this.bubbleLayout.getBackground().setColorFilter(qc0.a(getColorInt(getStyle().outgoingMessageBubbleColor), uc0.SRC_ATOP));
    }

    private final void showPendingView() {
        showLoader();
        ViewExtensionsKt.gone(this.errorTextView);
        initAnimation(this.loader, false);
    }

    private final void showReadyView() {
        Uri uri;
        int i;
        ViewExtensionsKt.gone(this.errorTextView);
        showCircularProgressButton();
        CircularProgressButton circularProgressButton = this.circularProgressButton;
        FileDescription fileDescription = this.fileDescription;
        if (fileDescription != null) {
            uri = fileDescription.getFileUri();
        } else {
            uri = null;
        }
        if (uri != null) {
            i = 100;
        } else {
            FileDescription fileDescription2 = this.fileDescription;
            if (fileDescription2 != null) {
                i = fileDescription2.getDownloadProgress();
            } else {
                i = 0;
            }
        }
        circularProgressButton.setProgress(i);
    }

    private final void updateFileView(FileDescription fileDescription, View.OnClickListener onClickListener) {
        LoggerEdna.info("AttachmentState: " + fileDescription.getState());
        String str = fileDescription.getIncomingName() + ":" + fileDescription.getSize();
        HashMap<String, AttachmentStateEnum> hashMap = fileStatuses;
        AttachmentStateEnum attachmentStateEnum = hashMap.get(str);
        if (attachmentStateEnum == null || fileDescription.getState().compareTo(attachmentStateEnum) >= 0) {
            attachmentStateEnum = fileDescription.getState();
        }
        int i = WhenMappings.$EnumSwitchMapping$1[attachmentStateEnum.ordinal()];
        if (i != 1) {
            if (i != 2) {
                showPendingView();
            } else {
                showReadyView();
            }
        } else {
            showErrorLayout(fileDescription);
        }
        this.circularProgressButton.setOnClickListener(onClickListener);
        hashMap.put(str, attachmentStateEnum);
    }

    public final void onBind(UserPhrase userPhrase, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnLongClickListener onLongClickListener, boolean z) {
        int i;
        z65.h(userPhrase, "userPhrase");
        z65.h(onClickListener, "buttonClickListener");
        z65.h(onClickListener2, "rowClickListener");
        z65.h(onLongClickListener, "onLongClick");
        this.timeStamp = Long.valueOf(userPhrase.getTimeStamp());
        subscribeForHighlighting(userPhrase, this.rootLayout);
        FileDescription fileDescription = userPhrase.getFileDescription();
        if (fileDescription != null) {
            this.fileDescription = fileDescription;
            View view = this.itemView;
            z65.f(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            fileNameFromDescription(fileDescription, new UserFileViewHolder$onBind$1$1(this));
            this.fileSizeTextView.setText(FileUtilsKt.toFileSize$default(fileDescription.getSize(), null, 1, null));
            TextView textView = this.fileSizeTextView;
            if (fileDescription.getSize() > 0) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                viewGroup.getChildAt(i2).setOnLongClickListener(onLongClickListener);
                viewGroup.getChildAt(i2).setOnClickListener(onClickListener2);
            }
            checkAttachmentError(fileDescription, onClickListener);
            this.rootLayout.setOnLongClickListener(onLongClickListener);
            changeHighlighting(z);
        }
        showBubbleByCurrentStatus();
        bindTimeStamp(userPhrase.getSentState(), userPhrase.getTimeStamp(), onLongClickListener);
    }
}
