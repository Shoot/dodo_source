package im.threads.ui.holders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.R;
import im.threads.business.formatters.RussianFormatSymbols;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.imageLoading.ImageModifications;
import im.threads.business.imageLoading.LoadImageKt;
import im.threads.business.markdown.LinkifyLinksHighlighter;
import im.threads.business.markdown.LinksHighlighter;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.ExtractedLink;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.Quote;
import im.threads.business.models.enums.ErrorStateEnum;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.ogParser.OGData;
import im.threads.business.ogParser.OGDataContent;
import im.threads.business.ogParser.OpenGraphParser;
import im.threads.business.utils.FileDownloader;
import im.threads.business.utils.FileProvider;
import im.threads.business.utils.FileUtils;
import im.threads.business.utils.FileUtilsKt;
import im.threads.business.utils.UrlUtils;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.holders.BaseHolder;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.utils.NoLongClickMovementMethod;
import im.threads.ui.utils.ScreenSizeGetter;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.utils.ViewUtils;
import im.threads.ui.views.CircularProgressButton;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BaseHolder.kt */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 ¹\u00012\u00020\u0001:\u0002¹\u0001B2\b\u0000\u0012\u0007\u0010¶\u0001\u001a\u00020.\u0012\u0010\b\u0002\u0010|\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010{\u0012\n\b\u0002\u0010\u007f\u001a\u0004\u0018\u00010~¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0002J\b\u0010\u001e\u001a\u00020\tH\u0002J$\u0010\"\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J\u001e\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0001\u0010%\u001a\u00020$2\b\b\u0001\u0010&\u001a\u00020$H\u0002J\b\u0010)\u001a\u00020\tH\u0002J\u0010\u0010*\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0004J)\u00100\u001a\u00020\t2\u0006\u0010,\u001a\u00020+2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020.0-\"\u00020.¢\u0006\u0004\b0\u00101J\u0010\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0004J\u0012\u00105\u001a\u00020$2\b\b\u0001\u0010&\u001a\u00020$H\u0007J%\u00107\u001a\u00020\t2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0-2\b\b\u0001\u0010&\u001a\u00020$¢\u0006\u0004\b7\u00108J\u000e\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u000209J\u0006\u0010<\u001a\u00020\tJ\u0010\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u0005H\u0016JD\u0010A\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020?H\u0004J$\u0010C\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002H\u0004J\u0010\u0010F\u001a\u00020$2\u0006\u0010E\u001a\u00020DH\u0004J\u0010\u0010G\u001a\u00020$2\u0006\u0010E\u001a\u00020DH\u0004J\u0018\u0010J\u001a\u00020\t2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u0017H\u0004J\u0018\u0010K\u001a\u00020\t2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u0017H\u0004J\u0014\u0010N\u001a\u0004\u0018\u00010M2\b\u0010L\u001a\u0004\u0018\u00010\u0002H\u0004J\u0014\u0010P\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010O\u001a\u00020$H\u0004J\u0018\u0010S\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u0005H\u0004J\u001a\u0010S\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\u00172\b\b\u0001\u0010T\u001a\u00020$H\u0004J\b\u0010U\u001a\u00020\tH\u0004J\u0018\u0010W\u001a\u00020\t2\u0006\u0010R\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u001aH\u0004J\u0018\u0010X\u001a\u00020\t2\u0006\u0010R\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u001aH\u0004J \u0010^\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\u00172\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020\\H\u0004J(\u0010c\u001a\u00020\t2\b\u0010`\u001a\u0004\u0018\u00010_2\u0014\u0010b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\t0aH\u0004J\u000f\u0010f\u001a\u00020$H\u0000¢\u0006\u0004\bd\u0010eJ\u0010\u0010g\u001a\u00020\t2\u0006\u0010Q\u001a\u00020.H\u0004J\u001a\u0010i\u001a\u00020\u00022\b\u0010h\u001a\u0004\u0018\u00010\u00022\u0006\u0010`\u001a\u00020_H\u0004JL\u0010t\u001a\u00020\t2\u0006\u0010k\u001a\u00020j2\b\u0010l\u001a\u0004\u0018\u00010\\2\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\u000f2\u0006\u0010q\u001a\u00020\u000f2\u0006\u0010r\u001a\u00020\u00172\b\u0010s\u001a\u0004\u0018\u000109H\u0004J\u0014\u0010v\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010_H\u0004J\u001e\u0010y\u001a\u0004\u0018\u00010'2\b\b\u0001\u0010w\u001a\u00020$2\b\b\u0001\u0010x\u001a\u00020$H\u0004J\u001e\u0010z\u001a\u00020\t2\u0006\u0010[\u001a\u00020Z2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0?H\u0004R\u001c\u0010|\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R!\u0010\u0086\u0001\u001a\u00030\u0081\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R!\u0010/\u001a\f\u0012\u0006\b\u0001\u0012\u00020.\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b/\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u009f\u0001R\u001d\u0010¡\u0001\u001a\u00030 \u00018\u0006¢\u0006\u0010\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R*\u0010¥\u0001\u001a\u00030\u0097\u00018\u0004@\u0004X\u0085\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010\u0099\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R!\u0010®\u0001\u001a\u00030ª\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010\u0083\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001d\u0010°\u0001\u001a\u00030¯\u00018\u0006¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u0016\u0010µ\u0001\u001a\u00020$8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010e¨\u0006º\u0001"}, d2 = {"Lim/threads/ui/holders/BaseHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "formattedText", "usualText", "", "isOnlyOneSymbol", "Lim/threads/business/ogParser/OGData;", "ogData", "", "onOgDataReceived", "Lim/threads/business/ogParser/OGDataContent;", "ogDataContent", "setColorToDivider", "setTimeStamp", "Landroid/widget/TextView;", "ogTitle", "setOgDataTitle", "ogDescription", "setOgDataDescription", "Lim/threads/ui/widget/textView/BubbleMessageTextView;", "ogUrl", "setOgDataUrl", "Landroid/widget/ImageView;", "ogImage", "setOgDataImage", "Landroid/view/ViewGroup;", "ogDataLayout", "checkOgWidth", "showOGView", "hideOGView", "textView", "isUnderlined", RemoteMessageConst.Notification.URL, "setTextWithHighlighting", "setMovementMethod", "", "iconResId", "colorRes", "Landroid/graphics/drawable/Drawable;", "setUpDrawable", "calculateImageSize", "subscribeForOpenGraphData", "Lim/threads/business/models/ChatItem;", "chatItem", "", "Landroid/view/View;", "viewsToHighlight", "subscribeForHighlighting", "(Lim/threads/business/models/ChatItem;[Landroid/view/View;)V", "Lz33;", "event", "subscribe", "getColorInt", "views", "setTextColorToViews", "([Landroid/widget/TextView;I)V", "Lim/threads/ui/views/CircularProgressButton;", "button", "setUpProgressButton", "onClear", "isHighlighted", "changeHighlighting", "", "emails", "highlightOperatorText", "phrase", "highlightClientText", "Lim/threads/business/models/enums/ErrorStateEnum;", "code", "getErrorImageResByErrorCode", "getErrorStringResByErrorCode", "imageLayout", "errorImage", "showErrorImage", "hideErrorImage", "messageText", "Lim/threads/business/models/ExtractedLink;", "bindOGData", "stringId", "getString", "view", "isIncomingMessage", "initAnimation", "colorOfLoader", "cancelAnimation", "layout", "setPaddings", "setLayoutMargins", "consultAvatar", "Lim/threads/business/models/ConsultPhrase;", "consultPhrase", "Landroid/view/View$OnClickListener;", "onAvatarClickListener", "showAvatar", "Lim/threads/business/models/FileDescription;", "fileDescription", "Lkotlin/Function1;", "callback", "fileNameFromDescription", "getImageViewSize$threads_release", "()I", "getImageViewSize", "setImageSize", "fileName", "getFileDescriptionText", "Lim/threads/business/models/Quote;", "quote", "onQuoteClickListener", "Landroid/widget/LinearLayout;", "quoteLayout", "quoteTextHeader", "quoteTextDescription", "quoteTextTimeStamp", "quoteFileImage", "quoteProgressButton", "showQuote", "Landroid/net/Uri;", "getPreviewUri", "res", RemoteMessageConst.Notification.COLOR, "getColoredDrawable", "showConsultTimeStamp", "Lks8;", "highlightingStream", "Lks8;", "Lim/threads/business/ogParser/OpenGraphParser;", "openGraphParser", "Lim/threads/business/ogParser/OpenGraphParser;", "Lim/threads/business/utils/FileProvider;", "fileProvider$delegate", "Lrn5;", "getFileProvider", "()Lim/threads/business/utils/FileProvider;", "fileProvider", "currentChatItem", "Lim/threads/business/models/ChatItem;", "[Landroid/view/View;", "isThisItemHighlighted", "Z", "Lwn1;", "compositeDisposable", "Lwn1;", "Lim/threads/business/markdown/LinksHighlighter;", "linksHighlighter", "Lim/threads/business/markdown/LinksHighlighter;", "Lqx1;", "coroutineScope", "Lqx1;", "getCoroutineScope", "()Lqx1;", "Ljava/text/SimpleDateFormat;", "timeStampSdf", "Ljava/text/SimpleDateFormat;", "Landroid/view/animation/RotateAnimation;", "rotateAnim", "Landroid/view/animation/RotateAnimation;", "getRotateAnim", "()Landroid/view/animation/RotateAnimation;", "Lim/threads/business/ogParser/OGDataContent;", "Lim/threads/ui/utils/ViewUtils;", "viewUtils", "Lim/threads/ui/utils/ViewUtils;", "getViewUtils", "()Lim/threads/ui/utils/ViewUtils;", "quoteSdf", "getQuoteSdf", "()Ljava/text/SimpleDateFormat;", "setQuoteSdf", "(Ljava/text/SimpleDateFormat;)V", "Lim/threads/ui/config/Config;", "config$delegate", "getConfig", "()Lim/threads/ui/config/Config;", "config", "Lim/threads/ui/ChatStyle;", "style", "Lim/threads/ui/ChatStyle;", "getStyle", "()Lim/threads/ui/ChatStyle;", "getTextColor", "textColor", "itemView", "<init>", "(Landroid/view/View;Lks8;Lim/threads/business/ogParser/OpenGraphParser;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public abstract class BaseHolder extends RecyclerView.d0 {
    private static Integer imageViewSize;
    private wn1 compositeDisposable;
    private final rn5 config$delegate;
    private final qx1 coroutineScope;
    private ChatItem currentChatItem;
    private final rn5 fileProvider$delegate;
    private final ks8<ChatItem> highlightingStream;
    private boolean isThisItemHighlighted;
    private final LinksHighlighter linksHighlighter;
    private OGDataContent ogDataContent;
    private final OpenGraphParser openGraphParser;
    @SuppressLint({"SimpleDateFormat"})
    private SimpleDateFormat quoteSdf;
    private final RotateAnimation rotateAnim;
    private final ChatStyle style;
    private final SimpleDateFormat timeStampSdf;
    private final ViewUtils viewUtils;
    private View[] viewsToHighlight;
    public static final Companion Companion = new Companion(null);
    private static final HashMap<Long, MessageStatus> statuses = new HashMap<>();

    /* compiled from: BaseHolder.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR1\u0010\n\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lim/threads/ui/holders/BaseHolder$Companion;", "", "()V", "imageViewSize", "", "getImageViewSize", "()Ljava/lang/Integer;", "setImageViewSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "statuses", "Ljava/util/HashMap;", "", "Lim/threads/business/models/MessageStatus;", "Lkotlin/collections/HashMap;", "getStatuses", "()Ljava/util/HashMap;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Integer getImageViewSize() {
            return BaseHolder.imageViewSize;
        }

        public final HashMap<Long, MessageStatus> getStatuses() {
            return BaseHolder.statuses;
        }

        public final void setImageViewSize(Integer num) {
            BaseHolder.imageViewSize = num;
        }
    }

    /* compiled from: BaseHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorStateEnum.values().length];
            try {
                iArr[ErrorStateEnum.DISALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorStateEnum.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorStateEnum.UNEXPECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorStateEnum.ANY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BaseHolder(View view, ks8 ks8Var, OpenGraphParser openGraphParser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? null : ks8Var, (i & 4) != 0 ? null : openGraphParser);
    }

    private final void calculateImageSize() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        Integer valueOf;
        ChatStyle chatStyle = Config.Companion.getInstance().getChatStyle();
        Resources resources = this.itemView.getContext().getResources();
        ScreenSizeGetter screenSizeGetter = new ScreenSizeGetter();
        Context context = this.itemView.getContext();
        z65.g(context, "itemView.context");
        int width = screenSizeGetter.getScreenSize(context).getWidth();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ecc_message_image_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(chatStyle.incomingImageLeftBorderSize);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(chatStyle.incomingImageRightBorderSize);
        if (dimensionPixelSize2 == 0 && dimensionPixelSize3 == 0) {
            z = true;
        } else {
            z = false;
        }
        int dimensionPixelSize4 = resources.getDimensionPixelSize(chatStyle.outgoingImageLeftBorderSize);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(chatStyle.outgoingImageRightBorderSize);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(chatStyle.bubbleOutgoingMarginLeft);
        int dimensionPixelSize7 = resources.getDimensionPixelSize(chatStyle.bubbleOutgoingMarginRight);
        int dimensionPixelSize8 = resources.getDimensionPixelSize(chatStyle.bubbleIncomingMarginLeft);
        int dimensionPixelSize9 = resources.getDimensionPixelSize(chatStyle.bubbleIncomingMarginRight);
        int dimensionPixelSize10 = resources.getDimensionPixelSize(chatStyle.bubbleOutgoingPaddingLeft);
        int dimensionPixelSize11 = resources.getDimensionPixelSize(chatStyle.bubbleOutgoingPaddingRight);
        int dimensionPixelSize12 = resources.getDimensionPixelSize(chatStyle.bubbleIncomingPaddingLeft);
        int dimensionPixelSize13 = resources.getDimensionPixelSize(chatStyle.bubbleIncomingPaddingRight);
        if (dimensionPixelSize4 == 0 && dimensionPixelSize5 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            i = dimensionPixelSize9 + dimensionPixelSize8 + dimensionPixelSize12 + dimensionPixelSize13;
        } else {
            i = dimensionPixelSize2 + dimensionPixelSize3 + dimensionPixelSize9 + dimensionPixelSize8;
        }
        if (z2) {
            i2 = dimensionPixelSize7 + dimensionPixelSize6 + dimensionPixelSize10 + dimensionPixelSize11;
        } else {
            i2 = dimensionPixelSize4 + dimensionPixelSize5 + dimensionPixelSize7 + dimensionPixelSize6;
        }
        if (i > i2) {
            i3 = width - i;
        } else {
            i3 = width - i2;
        }
        if (i3 > dimensionPixelSize) {
            valueOf = Integer.valueOf(dimensionPixelSize);
        } else {
            valueOf = Integer.valueOf(i3);
        }
        imageViewSize = valueOf;
    }

    private final void checkOgWidth(final ViewGroup viewGroup) {
        viewGroup.post(new Runnable() { // from class: m70
            @Override // java.lang.Runnable
            public final void run() {
                BaseHolder.checkOgWidth$lambda$17(viewGroup);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkOgWidth$lambda$17(ViewGroup viewGroup) {
        z65.h(viewGroup, "$ogDataLayout");
        if (ViewExtensionsKt.getWidthInDp(viewGroup) < 240.0f) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Context context = viewGroup.getContext();
            z65.g(context, "ogDataLayout.context");
            layoutParams.width = (int) ViewExtensionsKt.dpToPx(context, 240);
            viewGroup.requestLayout();
            return;
        }
        viewGroup.getLayoutParams().width = -1;
    }

    private final FileProvider getFileProvider() {
        return (FileProvider) this.fileProvider$delegate.getValue();
    }

    private final int getTextColor() {
        int i;
        if (this instanceof UserPhraseViewHolder) {
            i = this.style.outgoingMessageTextColor;
        } else {
            i = this.style.incomingMessageTextColor;
        }
        return iu1.c(this.itemView.getContext(), i);
    }

    private final void hideOGView() {
        ViewGroup viewGroup;
        WeakReference<BubbleTimeTextView> mainTimeStampView;
        BubbleTimeTextView bubbleTimeTextView;
        WeakReference<ViewGroup> ogDataLayout;
        WeakReference<BubbleTimeTextView> ogTimeStampView;
        BubbleTimeTextView bubbleTimeTextView2;
        WeakReference<ViewGroup> ogDataLayout2;
        ViewGroup viewGroup2;
        OGDataContent oGDataContent = this.ogDataContent;
        if (oGDataContent != null && (ogDataLayout2 = oGDataContent.getOgDataLayout()) != null && (viewGroup2 = ogDataLayout2.get()) != null) {
            ViewExtensionsKt.gone(viewGroup2);
        }
        OGDataContent oGDataContent2 = this.ogDataContent;
        if (oGDataContent2 != null && (ogTimeStampView = oGDataContent2.getOgTimeStampView()) != null && (bubbleTimeTextView2 = ogTimeStampView.get()) != null) {
            ViewExtensionsKt.gone(bubbleTimeTextView2);
        }
        OGDataContent oGDataContent3 = this.ogDataContent;
        if (oGDataContent3 != null && (ogDataLayout = oGDataContent3.getOgDataLayout()) != null) {
            viewGroup = ogDataLayout.get();
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.setTag("");
        }
        OGDataContent oGDataContent4 = this.ogDataContent;
        if (oGDataContent4 != null && (mainTimeStampView = oGDataContent4.getMainTimeStampView()) != null && (bubbleTimeTextView = mainTimeStampView.get()) != null) {
            ViewExtensionsKt.visible(bubbleTimeTextView);
        }
    }

    public static /* synthetic */ void highlightClientText$default(BaseHolder baseHolder, BubbleMessageTextView bubbleMessageTextView, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            baseHolder.highlightClientText(bubbleMessageTextView, str, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: highlightClientText");
    }

    public static /* synthetic */ void highlightOperatorText$default(BaseHolder baseHolder, TextView textView, String str, String str2, String str3, List list, int i, Object obj) {
        String str4;
        String str5;
        String str6;
        if (obj == null) {
            if ((i & 2) != 0) {
                str4 = null;
            } else {
                str4 = str;
            }
            if ((i & 4) != 0) {
                str5 = null;
            } else {
                str5 = str2;
            }
            if ((i & 8) != 0) {
                str6 = null;
            } else {
                str6 = str3;
            }
            ArrayList arrayList = list;
            if ((i & 16) != 0) {
                arrayList = new ArrayList();
            }
            baseHolder.highlightOperatorText(textView, str4, str5, str6, arrayList);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: highlightOperatorText");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void highlightOperatorText$lambda$7$lambda$6$lambda$5(String str, BaseHolder baseHolder, View view) {
        z65.h(str, "$email");
        z65.h(baseHolder, "this$0");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("mailto:" + str));
        iu1.l(baseHolder.itemView.getContext(), intent, null);
    }

    private final boolean isOnlyOneSymbol(String str, String str2) {
        CharSequence R0;
        if (str != null) {
            R0 = m0b.R0(str);
            String obj = R0.toString();
            if (obj != null && obj.length() == 1 && str2 != null && str2.length() != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOgDataReceived(OGData oGData) {
        final OGDataContent oGDataContent = this.ogDataContent;
        if (oGDataContent != null && z65.c(oGData.getMessageText(), oGDataContent.getMessageText())) {
            final ViewGroup viewGroup = oGDataContent.getOgDataLayout().get();
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.og_image);
                z65.g(findViewById, "ogDataLayout.findViewById(R.id.og_image)");
                ImageView imageView = (ImageView) findViewById;
                if (oGData.isEmpty()) {
                    hideOGView();
                    return;
                }
                View findViewById2 = viewGroup.findViewById(R.id.og_title);
                z65.g(findViewById2, "ogDataLayout.findViewById(R.id.og_title)");
                View findViewById3 = viewGroup.findViewById(R.id.og_description);
                z65.g(findViewById3, "ogDataLayout.findViewById(R.id.og_description)");
                View findViewById4 = viewGroup.findViewById(R.id.og_url);
                z65.g(findViewById4, "ogDataLayout.findViewById(R.id.og_url)");
                setColorToDivider(oGDataContent);
                showOGView();
                setTimeStamp(oGDataContent);
                setOgDataTitle(oGData, (TextView) findViewById2);
                setOgDataDescription(oGData, (TextView) findViewById3);
                setOgDataUrl((BubbleMessageTextView) findViewById4, oGData);
                setOgDataImage(oGData, imageView);
                z65.g(viewGroup, "ogDataLayout");
                checkOgWidth(viewGroup);
                this.viewUtils.setClickListener(viewGroup, new View.OnClickListener() { // from class: j70
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BaseHolder.onOgDataReceived$lambda$12$lambda$11$lambda$10(viewGroup, oGDataContent, view);
                    }
                });
                viewGroup.setTag(oGDataContent.getUrl());
            }
            oGDataContent.getOgDataLayout().clear();
            oGDataContent.getOgTimeStampView().clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onOgDataReceived$lambda$12$lambda$11$lambda$10(ViewGroup viewGroup, OGDataContent oGDataContent, View view) {
        z65.h(viewGroup, "$ogDataLayout");
        z65.h(oGDataContent, "$ogDataContent");
        Context context = viewGroup.getContext();
        z65.g(context, "ogDataLayout.context");
        UrlUtils.openUrl(context, oGDataContent.getUrl());
    }

    private final void setColorToDivider(OGDataContent oGDataContent) {
        View findViewById;
        int i;
        ViewGroup viewGroup = oGDataContent.getOgDataLayout().get();
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.ogDivider)) != null) {
            if (this instanceof UserPhraseViewHolder) {
                i = this.style.incomingMessageBubbleColor;
            } else {
                i = this.style.outgoingMessageBubbleColor;
            }
            findViewById.setBackgroundColor(iu1.c(this.itemView.getContext(), i));
        }
    }

    private final void setMovementMethod(TextView textView) {
        textView.setMovementMethod(NoLongClickMovementMethod.Companion.getInstance());
    }

    private final void setOgDataDescription(OGData oGData, TextView textView) {
        if (oGData.getDescription().length() > 0) {
            textView.setVisibility(0);
            textView.setText(oGData.getDescription());
            textView.setTextColor(getTextColor());
            return;
        }
        textView.setVisibility(8);
    }

    private final void setOgDataImage(final OGData oGData, final ImageView imageView) {
        List o;
        if (UrlUtils.INSTANCE.isValidUrl(oGData.getImageUrl())) {
            ViewExtensionsKt.visible(imageView);
            if (!z65.c(imageView.getTag(), oGData.getImageUrl())) {
                String imageUrl = oGData.getImageUrl();
                int i = this.style.imagePlaceholder;
                o = kc1.o(ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.FIT_XY);
                LoadImageKt.loadImage$default(imageView, imageUrl, o, Integer.valueOf(i), null, new ImageLoader.ImageLoaderCallback() { // from class: im.threads.ui.holders.BaseHolder$setOgDataImage$1
                    @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
                    public void onBitmapLoaded(Bitmap bitmap) {
                        ImageLoader.ImageLoaderCallback.DefaultImpls.onBitmapLoaded(this, bitmap);
                    }

                    @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
                    public void onImageLoadError() {
                        ViewExtensionsKt.gone(imageView);
                    }

                    @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
                    public void onImageLoaded() {
                        ImageLoader.ImageLoaderCallback.DefaultImpls.onImageLoaded(this);
                        imageView.setTag(oGData.getImageUrl());
                    }
                }, false, true, false, 168, null);
                return;
            }
            return;
        }
        ViewExtensionsKt.gone(imageView);
    }

    private final void setOgDataTitle(OGData oGData, TextView textView) {
        if (oGData.getTitle().length() > 0) {
            textView.setVisibility(0);
            textView.setText(oGData.getTitle());
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setTextColor(getTextColor());
            return;
        }
        textView.setVisibility(8);
    }

    private final void setOgDataUrl(BubbleMessageTextView bubbleMessageTextView, OGData oGData) {
        String url = oGData.getUrl();
        if (url.length() == 0) {
            OGDataContent oGDataContent = this.ogDataContent;
            if (oGDataContent != null) {
                url = oGDataContent.getUrl();
            } else {
                url = null;
            }
        }
        String scheme = Uri.parse(url).getScheme();
        String host = Uri.parse(url).getHost();
        bubbleMessageTextView.setText(scheme + "://" + host, TextView.BufferType.NORMAL);
        bubbleMessageTextView.setTextColor(getTextColor());
    }

    private final void setTextWithHighlighting(TextView textView, boolean z, String str) {
        setMovementMethod(textView);
        this.linksHighlighter.highlightAllTypeOfLinks(textView, str, z);
    }

    static /* synthetic */ void setTextWithHighlighting$default(BaseHolder baseHolder, TextView textView, boolean z, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                str = null;
            }
            baseHolder.setTextWithHighlighting(textView, z, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTextWithHighlighting");
    }

    private final void setTimeStamp(OGDataContent oGDataContent) {
        BubbleTimeTextView bubbleTimeTextView = oGDataContent.getOgTimeStampView().get();
        if (bubbleTimeTextView != null) {
            ViewExtensionsKt.visible(bubbleTimeTextView);
            if (this instanceof ConsultPhraseHolder) {
                int i = this.style.incomingImageTimeColor;
                if (i != 0) {
                    bubbleTimeTextView.setTextColor(getColorInt(i));
                }
                if (this.style.incomingMessageTimeTextSize != 0) {
                    bubbleTimeTextView.setTextSize(this.itemView.getContext().getResources().getDimension(this.style.incomingMessageTimeTextSize));
                }
                if (this.style.incomingImageTimeBackgroundColor != 0 && bubbleTimeTextView.getBackground() != null) {
                    bubbleTimeTextView.getBackground().setColorFilter(qc0.a(getColorInt(this.style.incomingImageTimeBackgroundColor), uc0.SRC_ATOP));
                    return;
                }
                return;
            }
            int i2 = this.style.outgoingImageTimeColor;
            if (i2 != 0) {
                bubbleTimeTextView.setTextColor(getColorInt(i2));
            }
            if (this.style.outgoingMessageTimeTextSize != 0) {
                bubbleTimeTextView.setTextSize(this.itemView.getContext().getResources().getDimension(this.style.outgoingMessageTimeTextSize));
            }
            if (this.style.outgoingImageTimeBackgroundColor != 0) {
                bubbleTimeTextView.getBackground().setColorFilter(qc0.a(getColorInt(this.style.outgoingImageTimeBackgroundColor), uc0.SRC_ATOP));
            }
        }
    }

    private final Drawable setUpDrawable(int i, int i2) {
        Drawable drawable;
        Drawable b = on.b(this.itemView.getContext(), i);
        if (b != null) {
            drawable = b.mutate();
        } else {
            drawable = null;
        }
        ColorsHelper.setDrawableColor(this.itemView.getContext(), drawable, i2);
        return drawable;
    }

    private final void showOGView() {
        WeakReference<BubbleTimeTextView> mainTimeStampView;
        BubbleTimeTextView bubbleTimeTextView;
        WeakReference<BubbleTimeTextView> ogTimeStampView;
        BubbleTimeTextView bubbleTimeTextView2;
        WeakReference<ViewGroup> ogDataLayout;
        ViewGroup viewGroup;
        OGDataContent oGDataContent = this.ogDataContent;
        if (oGDataContent != null && (ogDataLayout = oGDataContent.getOgDataLayout()) != null && (viewGroup = ogDataLayout.get()) != null) {
            ViewExtensionsKt.visible(viewGroup);
        }
        OGDataContent oGDataContent2 = this.ogDataContent;
        if (oGDataContent2 != null && (ogTimeStampView = oGDataContent2.getOgTimeStampView()) != null && (bubbleTimeTextView2 = ogTimeStampView.get()) != null) {
            ViewExtensionsKt.visible(bubbleTimeTextView2);
        }
        OGDataContent oGDataContent3 = this.ogDataContent;
        if (oGDataContent3 != null && (mainTimeStampView = oGDataContent3.getMainTimeStampView()) != null && (bubbleTimeTextView = mainTimeStampView.get()) != null) {
            ViewExtensionsKt.invisible(bubbleTimeTextView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeForHighlighting$lambda$2(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeForHighlighting$lambda$3(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeForOpenGraphData$lambda$0(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeForOpenGraphData$lambda$1(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ExtractedLink bindOGData(String str) {
        ExtractedLink extractedLink;
        String str2;
        Object obj;
        Unit unit;
        OGData cachedContents;
        WeakReference<ViewGroup> ogDataLayout;
        ViewGroup viewGroup;
        String str3;
        String str4;
        boolean J;
        if (str != null) {
            extractedLink = UrlUtils.extractLink(str);
            if (extractedLink == null || !extractedLink.isEmail()) {
                if (extractedLink != null) {
                    str4 = extractedLink.getLink();
                } else {
                    str4 = null;
                }
                if (str4 != null) {
                    String link = extractedLink.getLink();
                    z65.e(link);
                    J = l0b.J(link, "http", false, 2, null);
                    if (!J) {
                        str2 = "https://" + extractedLink.getLink();
                    }
                }
                if (extractedLink != null) {
                    str2 = extractedLink.getLink();
                }
            }
            str2 = null;
        } else {
            extractedLink = null;
            str2 = null;
        }
        OGDataContent oGDataContent = this.ogDataContent;
        if (oGDataContent != null) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            oGDataContent.setUrl(str3);
        }
        OGDataContent oGDataContent2 = this.ogDataContent;
        if (oGDataContent2 != null && (ogDataLayout = oGDataContent2.getOgDataLayout()) != null && (viewGroup = ogDataLayout.get()) != null) {
            obj = viewGroup.getTag();
        } else {
            obj = null;
        }
        if (z65.c(obj, str2)) {
            return extractedLink;
        }
        OpenGraphParser openGraphParser = this.openGraphParser;
        if (openGraphParser != null && (cachedContents = openGraphParser.getCachedContents(str2)) != null) {
            this.openGraphParser.getOpenGraphParsingStream().d(cachedContents);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            hideOGView();
        }
        sh0.d(this.coroutineScope, v33.c(), null, new BaseHolder$bindOGData$2(this, str2, str, null), 2, null);
        return extractedLink;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void cancelAnimation() {
        this.rotateAnim.cancel();
    }

    public void changeHighlighting(boolean z) {
        int i;
        View[] viewArr = this.viewsToHighlight;
        if (viewArr == null) {
            viewArr = new View[]{this.itemView.getRootView()};
        }
        for (View view : viewArr) {
            Context context = this.itemView.getContext();
            if (z) {
                i = this.style.chatHighlightingColor;
            } else {
                i = R.color.ecc_transparent;
            }
            view.setBackgroundColor(iu1.c(context, i));
        }
        this.isThisItemHighlighted = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void fileNameFromDescription(FileDescription fileDescription, Function1<? super String, Unit> function1) {
        z65.h(function1, "callback");
        if (fileDescription == null) {
            function1.invoke(null);
        } else if (fileDescription.getIncomingName() == null) {
            sh0.d(this.coroutineScope, null, null, new BaseHolder$fileNameFromDescription$1(fileDescription, function1, null), 3, null);
        } else {
            function1.invoke(fileDescription.getIncomingName());
        }
    }

    public final int getColorInt(int i) {
        return iu1.c(this.itemView.getContext(), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Drawable getColoredDrawable(int i, int i2) {
        Drawable b = on.b(this.itemView.getContext(), i);
        if (b != null) {
            b.setColorFilter(qc0.a(iu1.c(this.itemView.getContext(), i2), uc0.SRC_ATOP));
        }
        return b;
    }

    public final Config getConfig() {
        return (Config) this.config$delegate.getValue();
    }

    protected final qx1 getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getErrorImageResByErrorCode(ErrorStateEnum errorStateEnum) {
        z65.h(errorStateEnum, "code");
        int i = WhenMappings.$EnumSwitchMapping$0[errorStateEnum.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return R.drawable.ecc_im_unexpected;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return R.drawable.ecc_im_unexpected;
            }
            return R.drawable.ecc_im_unexpected;
        }
        return R.drawable.ecc_im_wrong_file;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getErrorStringResByErrorCode(ErrorStateEnum errorStateEnum) {
        z65.h(errorStateEnum, "code");
        int i = WhenMappings.$EnumSwitchMapping$0[errorStateEnum.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return R.string.ecc_some_error_during_load_file;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return R.string.ecc_some_error_during_load_file;
            }
            return R.string.ecc_timeout_error_during_load_file;
        }
        return R.string.ecc_disallowed_error_during_load_file;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getFileDescriptionText(String str, FileDescription fileDescription) {
        String str2;
        String f;
        z65.h(fileDescription, "fileDescription");
        if (str == null) {
            str = Action.FILE_ATTRIBUTE;
        }
        if (fileDescription.getSize() > 0) {
            f = e0b.f(FileUtilsKt.toFileSize$default(fileDescription.getSize(), null, 1, null));
            str2 = " " + f;
        } else {
            str2 = "";
        }
        return str + str2;
    }

    public final int getImageViewSize$threads_release() {
        if (imageViewSize == null) {
            calculateImageSize();
        }
        Integer num = imageViewSize;
        z65.e(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Uri getPreviewUri(FileDescription fileDescription) {
        if (fileDescription != null) {
            FileDownloader.Companion companion = FileDownloader.Companion;
            Context context = this.itemView.getContext();
            z65.g(context, "itemView.context");
            File file = new File(companion.getDownloadDir(context), FileUtils.generateFileName(fileDescription));
            if (file.exists()) {
                FileProvider fileProvider = getFileProvider();
                Context context2 = this.itemView.getContext();
                z65.g(context2, "itemView.context");
                return fileProvider.getUriForFile(context2, file);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SimpleDateFormat getQuoteSdf() {
        return this.quoteSdf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final RotateAnimation getRotateAnim() {
        return this.rotateAnim;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getString(int i) {
        Context context = this.itemView.getContext();
        if (context != null) {
            return context.getString(i);
        }
        return null;
    }

    public final ChatStyle getStyle() {
        return this.style;
    }

    public final ViewUtils getViewUtils() {
        return this.viewUtils;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void hideErrorImage(ViewGroup viewGroup, ImageView imageView) {
        z65.h(viewGroup, "imageLayout");
        z65.h(imageView, "errorImage");
        ViewExtensionsKt.gone(imageView);
        ViewExtensionsKt.visible(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void highlightClientText(BubbleMessageTextView bubbleMessageTextView, String str, String str2) {
        z65.h(bubbleMessageTextView, "textView");
        z65.h(str, "phrase");
        bubbleMessageTextView.setText(str, TextView.BufferType.NORMAL);
        setTextWithHighlighting(bubbleMessageTextView, this.style.getOutgoingMarkdownConfiguration().isLinkUnderlined(), str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void highlightOperatorText(TextView textView, String str, String str2, String str3, List<String> list) {
        String f;
        boolean y;
        BubbleMessageTextView bubbleMessageTextView;
        Unit unit;
        z65.h(textView, "textView");
        z65.h(list, "emails");
        if (str != null) {
            y = l0b.y(str);
            if (!y && !isOnlyOneSymbol(str, str2)) {
                String str4 = null;
                if (textView instanceof BubbleMessageTextView) {
                    bubbleMessageTextView = (BubbleMessageTextView) textView;
                } else {
                    bubbleMessageTextView = null;
                }
                if (bubbleMessageTextView != null) {
                    ArrayList arrayList = new ArrayList();
                    for (final String str5 : list) {
                        arrayList.add(new Pair(str5, new View.OnClickListener() { // from class: i70
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                BaseHolder.highlightOperatorText$lambda$7$lambda$6$lambda$5(str5, this, view);
                            }
                        }));
                    }
                    bubbleMessageTextView.setFormattedText(str, true, arrayList);
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    setMovementMethod(textView);
                    if (str2 != null) {
                        str4 = e0b.f(str2);
                    }
                    textView.setText(str4, TextView.BufferType.NORMAL);
                    return;
                }
                return;
            }
        }
        if (str2 != null && str2.length() != 0) {
            f = e0b.f(str2);
            textView.setText(f, TextView.BufferType.NORMAL);
            setTextWithHighlighting(textView, this.style.getIncomingMarkdownConfiguration().isLinkUnderlined(), str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void initAnimation(ImageView imageView, boolean z) {
        int i;
        z65.h(imageView, "view");
        if (z) {
            i = this.style.incomingMessageLoaderColor;
        } else {
            i = this.style.outgoingMessageLoaderColor;
        }
        initAnimation(imageView, i);
    }

    public final void onClear() {
        this.compositeDisposable.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setImageSize(View view) {
        z65.h(view, "view");
        int imageViewSize$threads_release = getImageViewSize$threads_release();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        z65.g(layoutParams, "view.layoutParams");
        layoutParams.width = imageViewSize$threads_release;
        layoutParams.height = imageViewSize$threads_release;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setLayoutMargins(boolean z, ViewGroup viewGroup) {
        z65.h(viewGroup, "layout");
        Resources resources = this.itemView.getContext().getResources();
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z) {
            marginLayoutParams.leftMargin = resources.getDimensionPixelSize(this.style.bubbleIncomingMarginLeft);
            marginLayoutParams.setMarginStart(resources.getDimensionPixelSize(this.style.bubbleIncomingMarginLeft));
            marginLayoutParams.setMarginEnd(resources.getDimensionPixelSize(this.style.bubbleIncomingMarginRight));
            marginLayoutParams.rightMargin = resources.getDimensionPixelSize(this.style.bubbleIncomingMarginRight);
            marginLayoutParams.topMargin = resources.getDimensionPixelSize(this.style.bubbleIncomingMarginTop);
            marginLayoutParams.bottomMargin = resources.getDimensionPixelSize(this.style.bubbleIncomingMarginBottom);
        } else {
            marginLayoutParams.leftMargin = resources.getDimensionPixelSize(this.style.bubbleOutgoingMarginLeft);
            marginLayoutParams.setMarginStart(resources.getDimensionPixelSize(this.style.bubbleOutgoingMarginLeft));
            marginLayoutParams.setMarginEnd(resources.getDimensionPixelSize(this.style.bubbleOutgoingMarginRight));
            marginLayoutParams.rightMargin = resources.getDimensionPixelSize(this.style.bubbleOutgoingMarginRight);
            marginLayoutParams.topMargin = resources.getDimensionPixelSize(this.style.bubbleOutgoingMarginTop);
            marginLayoutParams.bottomMargin = resources.getDimensionPixelSize(this.style.bubbleOutgoingMarginBottom);
        }
        viewGroup.setLayoutParams(marginLayoutParams);
        viewGroup.invalidate();
        viewGroup.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setPaddings(boolean z, ViewGroup viewGroup) {
        z65.h(viewGroup, "layout");
        Resources resources = this.itemView.getContext().getResources();
        if (z) {
            viewGroup.setPadding(resources.getDimensionPixelSize(this.style.bubbleIncomingPaddingLeft), resources.getDimensionPixelSize(this.style.bubbleIncomingPaddingTop), resources.getDimensionPixelSize(this.style.bubbleIncomingPaddingRight), resources.getDimensionPixelSize(this.style.bubbleIncomingPaddingBottom));
        } else {
            viewGroup.setPadding(resources.getDimensionPixelSize(this.style.bubbleOutgoingPaddingLeft), resources.getDimensionPixelSize(this.style.bubbleOutgoingPaddingTop), resources.getDimensionPixelSize(this.style.bubbleOutgoingPaddingRight), resources.getDimensionPixelSize(this.style.bubbleOutgoingPaddingBottom));
        }
    }

    protected final void setQuoteSdf(SimpleDateFormat simpleDateFormat) {
        z65.h(simpleDateFormat, "<set-?>");
        this.quoteSdf = simpleDateFormat;
    }

    public final void setTextColorToViews(TextView[] textViewArr, int i) {
        z65.h(textViewArr, "views");
        for (TextView textView : textViewArr) {
            textView.setTextColor(getColorInt(i));
        }
    }

    public final void setUpProgressButton(CircularProgressButton circularProgressButton) {
        z65.h(circularProgressButton, "button");
        ChatStyle chatStyle = this.style;
        int i = chatStyle.downloadButtonTintResId;
        Drawable upDrawable = setUpDrawable(chatStyle.startDownloadIconResId, i);
        Drawable upDrawable2 = setUpDrawable(chatStyle.inProgressIconResId, i);
        Drawable upDrawable3 = setUpDrawable(chatStyle.completedIconResId, i);
        circularProgressButton.setStartDownloadDrawable(upDrawable);
        circularProgressButton.setInProgress(upDrawable2);
        circularProgressButton.setCompletedDrawable(upDrawable3);
        circularProgressButton.setBackgroundColorResId(this.style.downloadButtonBackgroundTintResId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void showAvatar(ImageView imageView, ConsultPhrase consultPhrase, View.OnClickListener onClickListener) {
        List o;
        List e;
        z65.h(imageView, "consultAvatar");
        z65.h(consultPhrase, "consultPhrase");
        z65.h(onClickListener, "onAvatarClickListener");
        imageView.setOnClickListener(onClickListener);
        if (consultPhrase.isAvatarVisible()) {
            ViewExtensionsKt.visible(imageView);
            String avatarPath = consultPhrase.getAvatarPath();
            if (avatarPath != null && avatarPath.length() != 0) {
                String convertRelativeUrlToAbsolute = FileUtils.convertRelativeUrlToAbsolute(consultPhrase.getAvatarPath());
                o = kc1.o(ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.FIT_XY);
                Integer valueOf = Integer.valueOf(R.drawable.ecc_operator_avatar_placeholder);
                e = jc1.e(ImageModifications.CircleCropModification.INSTANCE);
                LoadImageKt.loadImage$default(imageView, convertRelativeUrlToAbsolute, o, valueOf, e, null, false, false, true, 112, null);
                return;
            }
            imageView.setImageResource(this.style.defaultOperatorAvatar);
            return;
        }
        ViewExtensionsKt.invisible(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void showConsultTimeStamp(ConsultPhrase consultPhrase, List<? extends TextView> list) {
        z65.h(consultPhrase, "consultPhrase");
        z65.h(list, "views");
        String format = this.timeStampSdf.format(new Date(consultPhrase.getTimeStamp()));
        List<? extends TextView> list2 = list;
        for (TextView textView : list2) {
            textView.setText(format);
        }
        if (consultPhrase.getModified() == ModificationStateEnum.EDITED) {
            ChatStyle chatStyle = this.style;
            Drawable coloredDrawable = getColoredDrawable(chatStyle.messageEditedIconResId, chatStyle.messageEditedIconColorResId);
            for (TextView textView2 : list2) {
                textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, coloredDrawable, (Drawable) null);
            }
            return;
        }
        for (TextView textView3 : list2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void showErrorImage(ViewGroup viewGroup, ImageView imageView) {
        z65.h(viewGroup, "imageLayout");
        z65.h(imageView, "errorImage");
        ViewExtensionsKt.invisible(viewGroup);
        ViewExtensionsKt.visible(imageView);
        imageView.setImageResource(this.style.imagePlaceholder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void showQuote(Quote quote, View.OnClickListener onClickListener, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, CircularProgressButton circularProgressButton) {
        String phraseOwnerTitle;
        int downloadProgress;
        String downloadPath;
        List o;
        z65.h(quote, "quote");
        z65.h(linearLayout, "quoteLayout");
        z65.h(textView, "quoteTextHeader");
        z65.h(textView2, "quoteTextDescription");
        z65.h(textView3, "quoteTextTimeStamp");
        z65.h(imageView, "quoteFileImage");
        linearLayout.setVisibility(0);
        if (quote.getModified() == ModificationStateEnum.DELETED) {
            textView2.setTextColor(iu1.c(this.itemView.getContext(), this.style.systemMessageTextColorResId));
            ViewExtensionsKt.visible(textView2);
            textView2.setText(this.itemView.getContext().getString(R.string.ecc_message_deleted));
            if (circularProgressButton != null) {
                circularProgressButton.setVisibility(8);
            }
            imageView.setVisibility(8);
            return;
        }
        if (circularProgressButton != null) {
            circularProgressButton.setVisibility(8);
        }
        if (quote.getPhraseOwnerTitle() == null) {
            phraseOwnerTitle = this.itemView.getContext().getString(R.string.ecc_I);
        } else {
            phraseOwnerTitle = quote.getPhraseOwnerTitle();
        }
        textView.setText(phraseOwnerTitle);
        textView2.setTextColor(iu1.c(this.itemView.getContext(), this.style.incomingMessageTextColor));
        if (circularProgressButton != null) {
            circularProgressButton.setVisibility(8);
        }
        textView2.setText(quote.getText());
        textView3.setText(this.itemView.getContext().getString(R.string.ecc_sent_at, this.quoteSdf.format(new Date(quote.getTimeStamp()))));
        this.viewUtils.setClickListener(linearLayout, onClickListener);
        FileDescription fileDescription = quote.getFileDescription();
        imageView.setVisibility(8);
        if (fileDescription != null) {
            fileNameFromDescription(fileDescription, new BaseHolder$showQuote$1(textView2, this, fileDescription));
            if (FileUtils.isVoiceMessage(fileDescription)) {
                textView2.setText(R.string.ecc_voice_message);
            } else if (FileUtils.isImage(quote.getFileDescription())) {
                imageView.setVisibility(0);
                Uri fileUri = fileDescription.getFileUri();
                if (fileUri == null || (downloadPath = fileUri.toString()) == null) {
                    downloadPath = fileDescription.getDownloadPath();
                }
                if (downloadPath != null && downloadPath.length() != 0) {
                    String downloadPath2 = fileDescription.getDownloadPath();
                    o = kc1.o(ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.CENTER_CROP);
                    LoadImageKt.loadImage$default(imageView, downloadPath2, o, Integer.valueOf(this.style.imagePlaceholder), null, null, true, false, false, 216, null);
                } else {
                    imageView.setImageResource(this.style.imagePlaceholder);
                }
                imageView.setOnClickListener(onClickListener);
            } else {
                if (circularProgressButton != null) {
                    circularProgressButton.setOnClickListener(onClickListener);
                }
                if (circularProgressButton != null) {
                    if (fileDescription.getFileUri() != null) {
                        downloadProgress = 100;
                    } else {
                        downloadProgress = fileDescription.getDownloadProgress();
                    }
                    circularProgressButton.setProgress(downloadProgress);
                }
            }
        }
    }

    protected final boolean subscribe(z33 z33Var) {
        z65.h(z33Var, "event");
        if (this.compositeDisposable.i()) {
            this.compositeDisposable = new wn1();
        }
        return this.compositeDisposable.b(z33Var);
    }

    public final void subscribeForHighlighting(ChatItem chatItem, View... viewArr) {
        z65.h(chatItem, "chatItem");
        z65.h(viewArr, "viewsToHighlight");
        this.currentChatItem = chatItem;
        this.viewsToHighlight = viewArr;
        ks8<ChatItem> ks8Var = this.highlightingStream;
        if (ks8Var != null) {
            wn1 wn1Var = this.compositeDisposable;
            r57<ChatItem> m = ks8Var.m(ti.c());
            final BaseHolder$subscribeForHighlighting$1 baseHolder$subscribeForHighlighting$1 = new BaseHolder$subscribeForHighlighting$1(this);
            wr1<? super ChatItem> wr1Var = new wr1() { // from class: k70
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    BaseHolder.subscribeForHighlighting$lambda$2(Function1.this, obj);
                }
            };
            final BaseHolder$subscribeForHighlighting$2 baseHolder$subscribeForHighlighting$2 = BaseHolder$subscribeForHighlighting$2.INSTANCE;
            wn1Var.b(m.p(wr1Var, new wr1() { // from class: l70
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    BaseHolder.subscribeForHighlighting$lambda$3(Function1.this, obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void subscribeForOpenGraphData(OGDataContent oGDataContent) {
        ks8<OGData> ks8Var;
        z65.h(oGDataContent, "ogDataContent");
        this.ogDataContent = oGDataContent;
        OpenGraphParser openGraphParser = this.openGraphParser;
        if (openGraphParser != null) {
            ks8Var = openGraphParser.getOpenGraphParsingStream();
        } else {
            ks8Var = null;
        }
        if (ks8Var != null) {
            wn1 wn1Var = this.compositeDisposable;
            r57<OGData> m = this.openGraphParser.getOpenGraphParsingStream().m(ti.c());
            final BaseHolder$subscribeForOpenGraphData$1 baseHolder$subscribeForOpenGraphData$1 = new BaseHolder$subscribeForOpenGraphData$1(this);
            wr1<? super OGData> wr1Var = new wr1() { // from class: g70
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    BaseHolder.subscribeForOpenGraphData$lambda$0(Function1.this, obj);
                }
            };
            final BaseHolder$subscribeForOpenGraphData$2 baseHolder$subscribeForOpenGraphData$2 = BaseHolder$subscribeForOpenGraphData$2.INSTANCE;
            wn1Var.b(m.p(wr1Var, new wr1() { // from class: h70
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    BaseHolder.subscribeForOpenGraphData$lambda$1(Function1.this, obj);
                }
            }));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHolder(View view, ks8<ChatItem> ks8Var, OpenGraphParser openGraphParser) {
        super(view);
        rn5 b;
        boolean v;
        SimpleDateFormat simpleDateFormat;
        rn5 b2;
        z65.h(view, "itemView");
        this.highlightingStream = ks8Var;
        this.openGraphParser = openGraphParser;
        b = yn5.b(BaseHolder$special$$inlined$inject$1.INSTANCE);
        this.fileProvider$delegate = b;
        this.compositeDisposable = new wn1();
        this.linksHighlighter = new LinkifyLinksHighlighter();
        this.coroutineScope = rx1.a(v33.b());
        this.timeStampSdf = new SimpleDateFormat("HH:mm", Locale.getDefault());
        this.rotateAnim = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.viewUtils = new ViewUtils();
        v = l0b.v(Locale.getDefault().getLanguage(), "ru", true);
        if (v) {
            simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", new RussianFormatSymbols());
        } else {
            simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
        }
        this.quoteSdf = simpleDateFormat;
        b2 = yn5.b(BaseHolder$config$2.INSTANCE);
        this.config$delegate = b2;
        this.style = getConfig().getChatStyle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void initAnimation(ImageView imageView, int i) {
        z65.h(imageView, "view");
        imageView.setImageResource(R.drawable.ecc_im_loading_themed);
        ColorsHelper.setTint(this.itemView.getContext(), imageView, i);
        this.rotateAnim.setDuration(3000L);
        this.rotateAnim.setRepeatCount(-1);
        imageView.setAnimation(this.rotateAnim);
        this.rotateAnim.start();
    }
}
