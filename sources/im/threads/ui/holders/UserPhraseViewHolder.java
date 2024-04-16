package im.threads.ui.holders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.slider.Slider;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import im.threads.R;
import im.threads.business.imageLoading.ImageModifications;
import im.threads.business.models.CampaignMessage;
import im.threads.business.models.ExtractedLink;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.Quote;
import im.threads.business.models.UserPhrase;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.ogParser.OGDataContent;
import im.threads.business.utils.FileUtils;
import im.threads.business.utils.UrlUtils;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.views.CircularProgressButton;
import im.threads.ui.views.VoiceTimeLabelFormatter;
import im.threads.ui.views.VoiceTimeLabelFormatterKt;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UserPhraseViewHolder.kt */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001BM\u0012\u0006\u0010@\u001a\u00020?\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\u000e\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010E\u0012\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001\u0012\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\"\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J \u0010 \u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u0002H\u0002J\b\u0010\"\u001a\u00020\u0002H\u0002J\b\u0010#\u001a\u00020\u0002H\u0002J\u0019\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\b\u0010(\u001a\u00020\u0002H\u0002J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010)\u001a\u00020\u0002H\u0002J\b\u0010*\u001a\u00020\u0002H\u0002J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002Jh\u00107\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010-\u001a\u0004\u0018\u00010\r2\b\u0010.\u001a\u0004\u0018\u00010\r2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010\r2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00106\u001a\u00020$J \u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020$H\u0016J\u0010\u0010<\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u001dH\u0016J\u0010\u0010=\u001a\u00020\u00022\u0006\u0010:\u001a\u00020$H\u0016J\b\u0010>\u001a\u00020\u0002H\u0016R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u0004\u0018\u00010B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00140E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010JR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010QR\u0016\u0010,\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010^R\u0014\u0010`\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010[R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010XR\u0014\u0010e\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010[R\u0014\u0010f\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010cR\u0014\u0010g\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010cR\u0014\u0010h\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010cR\u0014\u0010i\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010^R\u0014\u0010j\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010AR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010cR\u0014\u0010o\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010cR\u0014\u0010p\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010[R\u0014\u0010q\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010cR\u0014\u0010r\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010cR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020?8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bv\u0010A\u001a\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010AR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001e\u0010\u0080\u0001\u001a\u00020Y8\u0014X\u0094\u0004¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010[\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0083\u0001\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010|¨\u0006\u008d\u0001"}, d2 = {"Lim/threads/ui/holders/UserPhraseViewHolder;", "Lim/threads/ui/holders/VoiceMessageBaseHolder;", "", "checkOpenGraphVisibility", "hideAll", "Lim/threads/business/models/FileDescription;", "fileDescription", "setupPaddingsAndBorders", "", "phrase", "showPhrase", "Lim/threads/business/models/UserPhrase;", "userPhrase", "Landroid/view/View$OnClickListener;", "imageClickListener", "fileClickListener", "showFiles", "Lim/threads/business/models/CampaignMessage;", "campaignMessage", "showCampaign", "", "timeStamp", "setTimestamp", "Lim/threads/business/models/MessageStatus;", "sendStatus", "setSendState", "scrollToErrorIfAppearsFirstTime", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "srcDrawableResId", "colorResId", "updateDrawable", "showLoaderLayout", "showErrorBubble", "showNormalBubble", "", "errorMock", "showBubbleByCurrentStatusOrErrorMock", "(Ljava/lang/Boolean;)V", "showErrorText", "hideErrorText", "showCommonLayout", "initTimeStampView", "formattedDuration", "buttonClickListener", "onRowClickListener", "Lcom/google/android/material/slider/Slider$a;", "onChangeListener", "Lcom/google/android/material/slider/Slider$b;", "onSliderTouchListener", "onQuoteClickListener", "Landroid/view/View$OnLongClickListener;", "onLongClickListener", "isChosen", "onBind", "maxValue", "progress", "isPlaying", "init", "updateProgress", "updateIsPlaying", "resetProgress", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/ViewGroup;", "Lim/threads/business/imageLoading/ImageModifications$MaskedModification;", "maskedTransformation", "Lim/threads/business/imageLoading/ImageModifications$MaskedModification;", "Lks8;", "messageErrorProcessor", "Lks8;", "Ljava/text/SimpleDateFormat;", "sdf", "Ljava/text/SimpleDateFormat;", "fileSdf", "Lim/threads/business/models/FileDescription;", "getFileDescription", "()Lim/threads/business/models/FileDescription;", "setFileDescription", "(Lim/threads/business/models/FileDescription;)V", "Ljava/lang/Long;", "Ljava/lang/String;", "Landroid/widget/RelativeLayout;", "rootLayout", "Landroid/widget/RelativeLayout;", "Landroid/widget/TableRow;", "rightTextRow", "Landroid/widget/TableRow;", "Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, "Landroid/widget/ImageView;", "Landroid/widget/FrameLayout;", "imageRoot", "Landroid/widget/FrameLayout;", "imageLayout", "errorImage", "Landroid/widget/TextView;", "rightTextDescription", "Landroid/widget/TextView;", "quoteTextRow", "quoteImage", "quoteTextDescription", "quoteTextHeader", "quoteTextTimeStamp", "phraseFrame", "ogDataLayout", "Lcom/google/android/material/slider/Slider;", "slider", "Lcom/google/android/material/slider/Slider;", "fileSizeTextView", "errorText", "loader", "rightTextHeader", "rightTextTimeStamp", "Lim/threads/ui/views/CircularProgressButton;", "fileImageButton", "Lim/threads/ui/views/CircularProgressButton;", "voiceMessage", "getVoiceMessage", "()Landroid/view/ViewGroup;", "bubbleLayout", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "ogTimestamp", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "Lim/threads/ui/widget/textView/BubbleMessageTextView;", "phraseTextView", "Lim/threads/ui/widget/textView/BubbleMessageTextView;", "buttonPlayPause", "getButtonPlayPause", "()Landroid/widget/ImageView;", "timeStampTextView", "Lim/threads/business/models/ChatItem;", "highlightingStream", "Lim/threads/business/ogParser/OpenGraphParser;", "openGraphParser", "Lim/threads/business/media/FileDescriptionMediaPlayer;", "fdMediaPlayer", "<init>", "(Landroid/view/ViewGroup;Lim/threads/business/imageLoading/ImageModifications$MaskedModification;Lks8;Lim/threads/business/ogParser/OpenGraphParser;Lim/threads/business/media/FileDescriptionMediaPlayer;Lks8;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class UserPhraseViewHolder extends VoiceMessageBaseHolder {
    public static final Companion Companion = new Companion(null);
    private static final HashMap<String, Integer> fileProgress = new HashMap<>();
    private static final HashMap<String, AttachmentStateEnum> fileStatuses = new HashMap<>();
    private final ViewGroup bubbleLayout;
    private final ImageView buttonPlayPause;
    private final ImageView errorImage;
    private final TextView errorText;
    private FileDescription fileDescription;
    private final CircularProgressButton fileImageButton;
    @SuppressLint({"SimpleDateFormat"})
    private final SimpleDateFormat fileSdf;
    private final TextView fileSizeTextView;
    private String formattedDuration;
    private final ImageView image;
    private final FrameLayout imageLayout;
    private final FrameLayout imageRoot;
    private final ImageView loader;
    private final ImageModifications.MaskedModification maskedTransformation;
    private final ks8<Long> messageErrorProcessor;
    private final ViewGroup ogDataLayout;
    private final BubbleTimeTextView ogTimestamp;
    private final ViewGroup parentView;
    private final FrameLayout phraseFrame;
    private final BubbleMessageTextView phraseTextView;
    private final ImageView quoteImage;
    private final TextView quoteTextDescription;
    private final TextView quoteTextHeader;
    private final TableRow quoteTextRow;
    private final TextView quoteTextTimeStamp;
    private final TextView rightTextDescription;
    private final TextView rightTextHeader;
    private final TableRow rightTextRow;
    private final TextView rightTextTimeStamp;
    private final RelativeLayout rootLayout;
    private final SimpleDateFormat sdf;
    private final Slider slider;
    private Long timeStamp;
    private BubbleTimeTextView timeStampTextView;
    private final ViewGroup voiceMessage;

    /* compiled from: UserPhraseViewHolder.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lim/threads/ui/holders/UserPhraseViewHolder$Companion;", "", "()V", "fileProgress", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "fileStatuses", "Lim/threads/business/models/enums/AttachmentStateEnum;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: UserPhraseViewHolder.kt */
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
    public UserPhraseViewHolder(android.view.ViewGroup r17, im.threads.business.imageLoading.ImageModifications.MaskedModification r18, defpackage.ks8<im.threads.business.models.ChatItem> r19, im.threads.business.ogParser.OpenGraphParser r20, im.threads.business.media.FileDescriptionMediaPlayer r21, defpackage.ks8<java.lang.Long> r22) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.UserPhraseViewHolder.<init>(android.view.ViewGroup, im.threads.business.imageLoading.ImageModifications$MaskedModification, ks8, im.threads.business.ogParser.OpenGraphParser, im.threads.business.media.FileDescriptionMediaPlayer, ks8):void");
    }

    private final void checkOpenGraphVisibility() {
        BubbleTimeTextView bubbleTimeTextView = null;
        if (ViewExtensionsKt.isVisible(this.ogDataLayout)) {
            BubbleTimeTextView bubbleTimeTextView2 = this.timeStampTextView;
            if (bubbleTimeTextView2 == null) {
                z65.z("timeStampTextView");
            } else {
                bubbleTimeTextView = bubbleTimeTextView2;
            }
            ViewExtensionsKt.invisible(bubbleTimeTextView);
            return;
        }
        BubbleTimeTextView bubbleTimeTextView3 = this.timeStampTextView;
        if (bubbleTimeTextView3 == null) {
            z65.z("timeStampTextView");
        } else {
            bubbleTimeTextView = bubbleTimeTextView3;
        }
        ViewExtensionsKt.visible(bubbleTimeTextView);
    }

    private final void hideAll() {
        ViewExtensionsKt.gone(this.imageLayout);
        ViewExtensionsKt.gone(this.quoteImage);
        ViewExtensionsKt.gone(this.fileImageButton);
        ViewExtensionsKt.gone(getVoiceMessage());
        ViewExtensionsKt.gone(this.quoteTextRow);
        ViewExtensionsKt.gone(this.rightTextRow);
    }

    private final void hideErrorText() {
        ViewExtensionsKt.gone(this.errorText);
    }

    private final void initTimeStampView(UserPhrase userPhrase) {
        BubbleTimeTextView bubbleTimeTextView;
        if (FileUtils.isVoiceMessage(userPhrase.getFileDescription())) {
            ViewExtensionsKt.gone(this.itemView.findViewById(R.id.timeStamp));
            View findViewById = this.itemView.findViewById(R.id.voiceTimeStamp);
            z65.g(findViewById, "{\n            itemView.f…voiceTimeStamp)\n        }");
            bubbleTimeTextView = (BubbleTimeTextView) findViewById;
        } else {
            ViewExtensionsKt.gone(this.itemView.findViewById(R.id.voiceTimeStamp));
            View findViewById2 = this.itemView.findViewById(R.id.timeStamp);
            z65.g(findViewById2, "{\n            itemView.f…R.id.timeStamp)\n        }");
            bubbleTimeTextView = (BubbleTimeTextView) findViewById2;
        }
        this.timeStampTextView = bubbleTimeTextView;
        BubbleTimeTextView bubbleTimeTextView2 = null;
        if (bubbleTimeTextView == null) {
            z65.z("timeStampTextView");
            bubbleTimeTextView = null;
        }
        ViewExtensionsKt.visible(bubbleTimeTextView);
        BubbleTimeTextView bubbleTimeTextView3 = this.timeStampTextView;
        if (bubbleTimeTextView3 == null) {
            z65.z("timeStampTextView");
            bubbleTimeTextView3 = null;
        }
        bubbleTimeTextView3.setTextColor(getColorInt(getStyle().outgoingMessageTimeColor));
        if (getStyle().outgoingMessageTimeTextSize > 0) {
            float dimension = this.parentView.getContext().getResources().getDimension(getStyle().outgoingMessageTimeTextSize);
            BubbleTimeTextView bubbleTimeTextView4 = this.timeStampTextView;
            if (bubbleTimeTextView4 == null) {
                z65.z("timeStampTextView");
            } else {
                bubbleTimeTextView2 = bubbleTimeTextView4;
            }
            bubbleTimeTextView2.setTextSize(0, dimension);
        }
    }

    private final void scrollToErrorIfAppearsFirstTime() {
        Long l;
        MessageStatus messageStatus = BaseHolder.Companion.getStatuses().get(this.timeStamp);
        if ((messageStatus == null || messageStatus != MessageStatus.FAILED) && (l = this.timeStamp) != null) {
            this.messageErrorProcessor.d(Long.valueOf(l.longValue()));
        }
    }

    private final void setSendState(MessageStatus messageStatus) {
        switch (WhenMappings.$EnumSwitchMapping$0[messageStatus.ordinal()]) {
            case 1:
                int i = getStyle().approveRequestToResolveThreadTextResId;
                MessageStatus messageStatus2 = BaseHolder.Companion.getStatuses().get(this.timeStamp);
                if (messageStatus2 == null || messageStatus2 != MessageStatus.FAILED) {
                    showNormalBubble();
                    Context context = this.parentView.getContext();
                    z65.g(context, "parentView.context");
                    updateDrawable(context, getStyle().messageSendingIconResId, getStyle().messageSendingIconColorResId);
                    break;
                }
                break;
            case 2:
            case 3:
                showNormalBubble();
                Context context2 = this.parentView.getContext();
                z65.g(context2, "parentView.context");
                updateDrawable(context2, getStyle().messageSentIconResId, getStyle().messageSentIconColorResId);
                break;
            case 4:
                showNormalBubble();
                Context context3 = this.parentView.getContext();
                z65.g(context3, "parentView.context");
                updateDrawable(context3, getStyle().messageDeliveredIconResId, getStyle().messageDeliveredIconColorResId);
                break;
            case 5:
                showNormalBubble();
                Context context4 = this.parentView.getContext();
                z65.g(context4, "parentView.context");
                updateDrawable(context4, getStyle().messageReadIconResId, getStyle().messageReadIconColorResId);
                break;
            case 6:
                showErrorBubble();
                scrollToErrorIfAppearsFirstTime();
                Context context5 = this.parentView.getContext();
                z65.g(context5, "parentView.context");
                updateDrawable(context5, getStyle().messageFailedIconResId, getStyle().messageFailedIconColorResId);
                break;
        }
        Long l = this.timeStamp;
        if (l != null) {
            BaseHolder.Companion.getStatuses().put(Long.valueOf(l.longValue()), messageStatus);
        }
    }

    private final void setTimestamp(long j) {
        String format = this.sdf.format(new Date(j));
        BubbleTimeTextView bubbleTimeTextView = this.timeStampTextView;
        if (bubbleTimeTextView == null) {
            z65.z("timeStampTextView");
            bubbleTimeTextView = null;
        }
        bubbleTimeTextView.setText(format);
        this.ogTimestamp.setText(format);
    }

    private final void setupPaddingsAndBorders(FileDescription fileDescription) {
        boolean z;
        ViewGroup viewGroup = this.bubbleLayout;
        ChatStyle chatStyle = Config.Companion.getInstance().getChatStyle();
        Resources resources = viewGroup.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(chatStyle.outgoingImageLeftBorderSize);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(chatStyle.outgoingImageTopBorderSize);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(chatStyle.outgoingImageRightBorderSize);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(chatStyle.outgoingImageBottomBorderSize);
        if (dimensionPixelSize == 0 && dimensionPixelSize2 == 0 && dimensionPixelSize3 == 0 && dimensionPixelSize4 == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean isImage = FileUtils.isImage(fileDescription);
        setImageSize(this.imageRoot);
        setLayoutMargins(false, this.bubbleLayout);
        if (isImage) {
            ViewExtensionsKt.visible(this.imageRoot);
            ViewGroup.LayoutParams layoutParams = this.bubbleLayout.getLayoutParams();
            z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            this.bubbleLayout.setLayoutParams(marginLayoutParams);
            this.bubbleLayout.invalidate();
            this.bubbleLayout.requestLayout();
            if (z) {
                this.phraseFrame.setPadding(dimensionPixelSize, 0, dimensionPixelSize3, 0);
                this.quoteTextRow.setPadding(dimensionPixelSize, 0, dimensionPixelSize3, 0);
                setPaddings(false, viewGroup);
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.image.getLayoutParams();
                z65.f(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
                this.image.setLayoutParams(layoutParams3);
                this.phraseFrame.setPadding(dimensionPixelSize, 0, dimensionPixelSize3, resources.getDimensionPixelSize(getStyle().bubbleIncomingPaddingBottom));
                ViewGroup.LayoutParams layoutParams4 = this.quoteTextRow.getLayoutParams();
                z65.f(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
                layoutParams5.setMargins(dimensionPixelSize, resources.getDimensionPixelSize(getStyle().bubbleIncomingPaddingTop), dimensionPixelSize3, resources.getDimensionPixelSize(getStyle().bubbleIncomingPaddingTop));
                this.quoteTextRow.setLayoutParams(layoutParams5);
                viewGroup.setPadding(0, 0, 0, 0);
            }
            this.image.invalidate();
            this.image.requestLayout();
            return;
        }
        ViewGroup.LayoutParams layoutParams6 = this.bubbleLayout.getLayoutParams();
        z65.f(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6;
        marginLayoutParams2.width = -2;
        marginLayoutParams2.height = -2;
        this.bubbleLayout.invalidate();
        this.bubbleLayout.requestLayout();
        ViewExtensionsKt.gone(this.imageRoot);
        this.phraseFrame.setPadding(0, 0, 0, 0);
        setPaddings(false, viewGroup);
    }

    private final void showBubbleByCurrentStatusOrErrorMock(Boolean bool) {
        MessageStatus messageStatus = BaseHolder.Companion.getStatuses().get(this.timeStamp);
        if ((messageStatus == null || messageStatus != MessageStatus.FAILED) && z65.c(bool, Boolean.TRUE)) {
            showNormalBubble();
        } else {
            showErrorBubble();
        }
    }

    private final void showCampaign(CampaignMessage campaignMessage) {
        ViewExtensionsKt.visible(this.quoteTextRow);
        this.quoteTextDescription.setText(campaignMessage.getText());
        this.quoteTextHeader.setText(campaignMessage.getSenderName());
        String string = this.parentView.getContext().getResources().getString(R.string.ecc_sent_at, this.fileSdf.format(campaignMessage.getReceivedDate()));
        z65.g(string, "parentView.context.resou…e.receivedDate)\n        )");
        this.quoteTextTimeStamp.setText(string);
    }

    private final void showCommonLayout() {
        ViewExtensionsKt.gone(this.errorText);
        ViewExtensionsKt.gone(this.loader);
        getRotateAnim().cancel();
        getRotateAnim().reset();
    }

    private final void showErrorBubble() {
        this.bubbleLayout.getBackground().setColorFilter(qc0.a(getColorInt(getStyle().messageNotSentBubbleBackgroundColor), uc0.SRC_ATOP));
        showErrorText();
    }

    private final void showErrorText() {
        ViewExtensionsKt.visible(this.errorText);
        ViewExtensionsKt.visible(this.loader);
        ViewExtensionsKt.gone(this.fileImageButton);
        this.errorText.setText(getString(R.string.ecc_message_not_sent));
        getRotateAnim().cancel();
        getRotateAnim().reset();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
        if (r0 != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showFiles(im.threads.business.models.UserPhrase r11, android.view.View.OnClickListener r12, android.view.View.OnClickListener r13) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.UserPhraseViewHolder.showFiles(im.threads.business.models.UserPhrase, android.view.View$OnClickListener, android.view.View$OnClickListener):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFiles$lambda$15$lambda$14(UserPhraseViewHolder userPhraseViewHolder) {
        z65.h(userPhraseViewHolder, "this$0");
        if (ViewExtensionsKt.isVisible(userPhraseViewHolder.quoteTextRow)) {
            userPhraseViewHolder.quoteTextRow.getLayoutParams().width = userPhraseViewHolder.image.getWidth();
        }
    }

    private final void showLoaderLayout() {
        ViewExtensionsKt.gone(this.errorText);
        ViewExtensionsKt.visible(this.loader);
        ViewExtensionsKt.gone(this.fileImageButton);
        initAnimation(this.loader, false);
    }

    private final void showNormalBubble() {
        this.bubbleLayout.getBackground().setColorFilter(qc0.a(getColorInt(getStyle().outgoingMessageBubbleColor), uc0.SRC_ATOP));
        hideErrorText();
    }

    private final void showPhrase(String str) {
        ViewExtensionsKt.visible(this.phraseTextView);
        BubbleMessageTextView bubbleMessageTextView = this.phraseTextView;
        BubbleTimeTextView bubbleTimeTextView = this.timeStampTextView;
        String str2 = null;
        if (bubbleTimeTextView == null) {
            z65.z("timeStampTextView");
            bubbleTimeTextView = null;
        }
        bubbleMessageTextView.bindTimestampView(bubbleTimeTextView);
        if (getStyle().linkPreviewEnabled) {
            bindOGData(str);
        }
        ExtractedLink extractLink = UrlUtils.extractLink(str);
        String extractDeepLink = UrlUtils.extractDeepLink(str);
        if (extractLink != null && !extractLink.isEmail()) {
            str2 = extractLink.getLink();
        }
        BubbleMessageTextView bubbleMessageTextView2 = this.phraseTextView;
        if (extractDeepLink == null) {
            extractDeepLink = str2;
        }
        highlightClientText(bubbleMessageTextView2, str, extractDeepLink);
    }

    private final void updateDrawable(Context context, int i, int i2) {
        Drawable b = on.b(context, i);
        if (b != null) {
            if (i2 >= 0) {
                b.setColorFilter(qc0.a(iu1.c(context, i2), uc0.SRC_ATOP));
            }
            BubbleTimeTextView bubbleTimeTextView = this.timeStampTextView;
            if (bubbleTimeTextView == null) {
                z65.z("timeStampTextView");
                bubbleTimeTextView = null;
            }
            bubbleTimeTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, b, (Drawable) null);
            this.ogTimestamp.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, b, (Drawable) null);
        }
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    protected ImageView getButtonPlayPause() {
        return this.buttonPlayPause;
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    public FileDescription getFileDescription() {
        return this.fileDescription;
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    protected ViewGroup getVoiceMessage() {
        return this.voiceMessage;
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    public void init(int i, int i2, boolean z) {
        int i3;
        int min = Math.min(i2, i);
        this.fileSizeTextView.setText(VoiceTimeLabelFormatterKt.formatAsDuration(min));
        this.slider.setEnabled(true);
        this.slider.setValueTo(i);
        this.slider.setValue(min);
        ImageView buttonPlayPause = getButtonPlayPause();
        ChatStyle style = getStyle();
        if (z) {
            i3 = style.voiceMessagePauseButton;
        } else {
            i3 = style.voiceMessagePlayButton;
        }
        buttonPlayPause.setImageResource(i3);
    }

    public final void onBind(UserPhrase userPhrase, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, Slider.a aVar, Slider.b bVar, View.OnClickListener onClickListener5, View.OnLongClickListener onLongClickListener, boolean z) {
        String str2;
        long j;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        z65.h(userPhrase, "userPhrase");
        z65.h(str, "formattedDuration");
        z65.h(onClickListener, "imageClickListener");
        z65.h(aVar, "onChangeListener");
        z65.h(bVar, "onSliderTouchListener");
        this.timeStamp = Long.valueOf(userPhrase.getTimeStamp());
        showBubbleByCurrentStatusOrErrorMock(userPhrase.getErrorMock());
        initTimeStampView(userPhrase);
        hideAll();
        setupPaddingsAndBorders(userPhrase.getFileDescription());
        subscribeForHighlighting(userPhrase, this.rootLayout);
        WeakReference weakReference = new WeakReference(this.ogDataLayout);
        WeakReference weakReference2 = new WeakReference(this.ogTimestamp);
        BubbleTimeTextView bubbleTimeTextView = this.timeStampTextView;
        Unit unit = null;
        if (bubbleTimeTextView == null) {
            z65.z("timeStampTextView");
            bubbleTimeTextView = null;
        }
        subscribeForOpenGraphData(new OGDataContent(weakReference, weakReference2, new WeakReference(bubbleTimeTextView), userPhrase.getPhraseText(), null, 16, null));
        this.rootLayout.setOnLongClickListener(onLongClickListener);
        changeHighlighting(z);
        if (userPhrase.getPhraseText() != null) {
            String phraseText = userPhrase.getPhraseText();
            int length = phraseText.length() - 1;
            int i3 = 0;
            boolean z4 = false;
            while (i3 <= length) {
                if (!z4) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (z65.j(phraseText.charAt(i2), 32) <= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z4) {
                    if (!z3) {
                        z4 = true;
                    } else {
                        i3++;
                    }
                } else if (!z3) {
                    break;
                } else {
                    length--;
                }
            }
            str2 = phraseText.subSequence(i3, length + 1).toString();
        } else {
            str2 = null;
        }
        long timeStamp = userPhrase.getTimeStamp();
        MessageStatus sentState = userPhrase.getSentState();
        Quote quote = userPhrase.getQuote();
        CampaignMessage campaignMessage = userPhrase.getCampaignMessage();
        this.formattedDuration = str;
        getViewUtils().setClickListener(this.rootLayout, onLongClickListener);
        getViewUtils().setClickListener(this.rootLayout, onClickListener4);
        getButtonPlayPause().setOnClickListener(onClickListener3);
        this.slider.h(aVar);
        this.slider.i(bVar);
        this.slider.setLabelFormatter(new VoiceTimeLabelFormatter());
        this.fileSizeTextView.setText(str);
        if (userPhrase.getSentState() == MessageStatus.FAILED) {
            showErrorText();
        }
        if (quote != null) {
            j = timeStamp;
            showQuote(quote, onClickListener5, this.quoteTextRow, this.quoteTextHeader, this.quoteTextDescription, this.quoteTextTimeStamp, this.quoteImage, null);
        } else {
            j = timeStamp;
            if (campaignMessage != null) {
                showCampaign(campaignMessage);
            }
        }
        showFiles(userPhrase, onClickListener, onClickListener2);
        setTimestamp(j);
        setSendState(sentState);
        if (str2 != null) {
            showPhrase(str2);
            unit = Unit.a;
        }
        if (unit == null) {
            ViewExtensionsKt.gone(this.phraseTextView);
        }
        if ((quote != null || getFileDescription() != null) && getVoiceMessage().getVisibility() != 0) {
            this.phraseFrame.getLayoutParams().width = -1;
        } else {
            this.phraseFrame.getLayoutParams().width = -2;
        }
        TextView textView = this.rightTextHeader;
        if (textView.getText() != null && !z65.c(this.rightTextHeader.getText().toString(), "null")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        checkOpenGraphVisibility();
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    public void resetProgress() {
        this.fileSizeTextView.setText(this.formattedDuration);
        this.slider.setEnabled(false);
        this.slider.setValue(0.0f);
        if (!z65.c(getButtonPlayPause().getTag(), VoiceMessageBaseHolder.Companion.getLoadingStateTag())) {
            getButtonPlayPause().setImageResource(getStyle().voiceMessagePlayButton);
        }
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    public void setFileDescription(FileDescription fileDescription) {
        this.fileDescription = fileDescription;
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    public void updateIsPlaying(boolean z) {
        int i;
        if (!z65.c(getButtonPlayPause().getTag(), VoiceMessageBaseHolder.Companion.getLoadingStateTag())) {
            if (z) {
                i = getStyle().voiceMessagePauseButton;
            } else {
                i = getStyle().voiceMessagePlayButton;
            }
            getButtonPlayPause().setImageResource(i);
        }
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    public void updateProgress(int i) {
        this.fileSizeTextView.setText(VoiceTimeLabelFormatterKt.formatAsDuration(i));
        Slider slider = this.slider;
        slider.setValue(Math.min(i, slider.getValueTo()));
    }

    private final void showErrorText(FileDescription fileDescription) {
        ViewExtensionsKt.visible(this.errorText);
        ViewExtensionsKt.visible(this.loader);
        ViewExtensionsKt.gone(this.imageLayout);
        ViewExtensionsKt.gone(this.imageRoot);
        ViewExtensionsKt.gone(this.image);
        this.loader.setImageResource(getErrorImageResByErrorCode(fileDescription.getErrorCode()));
        ViewExtensionsKt.gone(this.fileImageButton);
        this.errorText.setText(getString(getErrorStringResByErrorCode(fileDescription.getErrorCode())));
        getRotateAnim().cancel();
        getRotateAnim().reset();
    }
}
