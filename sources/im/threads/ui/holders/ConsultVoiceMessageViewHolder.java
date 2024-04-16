package im.threads.ui.holders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.slider.Slider;
import im.threads.R;
import im.threads.business.formatters.SpeechStatus;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.ExtractedLink;
import im.threads.business.models.FileDescription;
import im.threads.business.models.Quote;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.utils.UrlUtils;
import im.threads.ui.ChatStyle;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.views.CircularProgressButton;
import im.threads.ui.views.VoiceTimeLabelFormatter;
import im.threads.ui.views.VoiceTimeLabelFormatterKt;
import im.threads.ui.widget.textView.QuoteMessageTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.ranges.i;
/* compiled from: ConsultVoiceMessageViewHolder.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010P\u001a\u00020G\u0012\f\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JN\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J \u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010!\u001a\u00020\u0004H\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u001c\u00102\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010-R\u0014\u00108\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00103R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010=\u001a\n 1*\u0004\u0018\u00010<0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010C\u001a\u00020B8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010-R\u0014\u0010M\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010-R\u001c\u0010N\u001a\n 1*\u0004\u0018\u00010+0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010-R\u001c\u0010O\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u00103¨\u0006Z"}, d2 = {"Lim/threads/ui/holders/ConsultVoiceMessageViewHolder;", "Lim/threads/ui/holders/VoiceMessageBaseHolder;", "Lim/threads/business/models/ConsultPhrase;", "consultPhrase", "", "checkText", "Lim/threads/business/models/FileDescription;", "fileDescription", "showLoaderLayout", "showErrorLayout", "showCommonLayout", "", "highlighted", "", "formattedDuration", "Landroid/view/View$OnLongClickListener;", "onLongClick", "Landroid/view/View$OnClickListener;", "onQuoteClickListener", "onAvatarClickListener", "pausePlayClickListener", "Lcom/google/android/material/slider/Slider$a;", "onChangeListener", "Lcom/google/android/material/slider/Slider$b;", "onSliderTouchListener", "onBind", "", "maxValue", "progress", "isPlaying", "init", "updateProgress", "updateIsPlaying", "resetProgress", "Lim/threads/business/models/FileDescription;", "getFileDescription", "()Lim/threads/business/models/FileDescription;", "setFileDescription", "(Lim/threads/business/models/FileDescription;)V", "Ljava/lang/String;", "Landroid/widget/LinearLayout;", "quoteLayout", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "quoteTextHeader", "Landroid/widget/TextView;", "quoteTextDescription", "quoteTextTimeStamp", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "quoteFileImage", "Landroid/widget/ImageView;", "Lim/threads/ui/views/CircularProgressButton;", "quoteProgressButton", "Lim/threads/ui/views/CircularProgressButton;", "errorTextView", "loader", "Landroidx/constraintlayout/widget/ConstraintLayout;", "rootLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lim/threads/ui/widget/textView/QuoteMessageTextView;", "phraseTextView", "Lim/threads/ui/widget/textView/QuoteMessageTextView;", "Lcom/google/android/material/slider/Slider;", "slider", "Lcom/google/android/material/slider/Slider;", "Landroid/widget/ImageButton;", "buttonPlayPause", "Landroid/widget/ImageButton;", "getButtonPlayPause", "()Landroid/widget/ImageButton;", "Landroid/view/ViewGroup;", "voiceMessage", "Landroid/view/ViewGroup;", "getVoiceMessage", "()Landroid/view/ViewGroup;", "fileSizeTextView", "audioStatusTextView", "timeStampTextView", "consultAvatar", "parent", "Lks8;", "Lim/threads/business/models/ChatItem;", "highlightingStream", "Lim/threads/business/ogParser/OpenGraphParser;", "openGraphParser", "Lim/threads/business/media/FileDescriptionMediaPlayer;", "fdMediaPlayer", "<init>", "(Landroid/view/ViewGroup;Lks8;Lim/threads/business/ogParser/OpenGraphParser;Lim/threads/business/media/FileDescriptionMediaPlayer;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ConsultVoiceMessageViewHolder extends VoiceMessageBaseHolder {
    private final TextView audioStatusTextView;
    private final ImageButton buttonPlayPause;
    private final ImageView consultAvatar;
    private final TextView errorTextView;
    private FileDescription fileDescription;
    private final TextView fileSizeTextView;
    private String formattedDuration;
    private final ImageView loader;
    private final QuoteMessageTextView phraseTextView;
    private final ImageView quoteFileImage;
    private final LinearLayout quoteLayout;
    private final CircularProgressButton quoteProgressButton;
    private final TextView quoteTextDescription;
    private final TextView quoteTextHeader;
    private final TextView quoteTextTimeStamp;
    private final ConstraintLayout rootLayout;
    private final Slider slider;
    private final TextView timeStampTextView;
    private final ViewGroup voiceMessage;

    /* compiled from: ConsultVoiceMessageViewHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[SpeechStatus.values().length];
            try {
                iArr2[SpeechStatus.NO_SPEECH_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SpeechStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SpeechStatus.PROCESSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConsultVoiceMessageViewHolder(android.view.ViewGroup r10, defpackage.ks8<im.threads.business.models.ChatItem> r11, im.threads.business.ogParser.OpenGraphParser r12, im.threads.business.media.FileDescriptionMediaPlayer r13) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.ConsultVoiceMessageViewHolder.<init>(android.view.ViewGroup, ks8, im.threads.business.ogParser.OpenGraphParser, im.threads.business.media.FileDescriptionMediaPlayer):void");
    }

    private final void checkText(ConsultPhrase consultPhrase) {
        boolean y;
        String str;
        String phraseText = consultPhrase.getPhraseText();
        if (phraseText != null) {
            y = l0b.y(phraseText);
            if (!y) {
                ExtractedLink extractLink = UrlUtils.extractLink(consultPhrase.getPhraseText());
                ViewExtensionsKt.visible(this.phraseTextView);
                QuoteMessageTextView quoteMessageTextView = this.phraseTextView;
                z65.g(quoteMessageTextView, "phraseTextView");
                String formattedPhrase = consultPhrase.getFormattedPhrase();
                String phraseText2 = consultPhrase.getPhraseText();
                if (extractLink != null) {
                    str = extractLink.getLink();
                } else {
                    str = null;
                }
                BaseHolder.highlightOperatorText$default(this, quoteMessageTextView, formattedPhrase, phraseText2, str, null, 16, null);
                return;
            }
        }
        ViewExtensionsKt.gone(this.phraseTextView);
    }

    private final void showCommonLayout(ConsultPhrase consultPhrase) {
        ViewExtensionsKt.visible(getButtonPlayPause());
        ViewExtensionsKt.gone(this.loader);
        ViewExtensionsKt.gone(this.errorTextView);
        getRotateAnim().cancel();
        int i = WhenMappings.$EnumSwitchMapping$1[consultPhrase.getSpeechStatus().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                getButtonPlayPause().setClickable(false);
                getButtonPlayPause().setAlpha(0.3f);
                ViewExtensionsKt.visible(this.audioStatusTextView);
                ViewExtensionsKt.invisible(this.fileSizeTextView);
                ViewExtensionsKt.invisible(this.timeStampTextView);
                this.slider.setEnabled(false);
                this.audioStatusTextView.setText(R.string.ecc_voice_message_error);
                return;
            }
            getButtonPlayPause().setClickable(false);
            getButtonPlayPause().setAlpha(0.3f);
            ViewExtensionsKt.visible(this.audioStatusTextView);
            ViewExtensionsKt.invisible(this.fileSizeTextView);
            ViewExtensionsKt.invisible(this.timeStampTextView);
            this.slider.setEnabled(false);
            this.audioStatusTextView.setText(R.string.ecc_voice_message_is_processing);
            return;
        }
        getButtonPlayPause().setClickable(true);
        getButtonPlayPause().setAlpha(1.0f);
        ViewExtensionsKt.invisible(this.audioStatusTextView);
        ViewExtensionsKt.visible(this.fileSizeTextView);
        ViewExtensionsKt.visible(this.timeStampTextView);
        this.slider.setEnabled(true);
        this.slider.setLabelFormatter(new VoiceTimeLabelFormatter());
    }

    private final void showErrorLayout(FileDescription fileDescription) {
        ViewExtensionsKt.visible(this.loader);
        ViewExtensionsKt.visible(this.errorTextView);
        ViewExtensionsKt.invisible(getButtonPlayPause());
        this.loader.setImageResource(getErrorImageResByErrorCode(fileDescription.getErrorCode()));
        this.audioStatusTextView.setText(fileDescription.getIncomingName());
        this.errorTextView.setText(getString(getErrorStringResByErrorCode(fileDescription.getErrorCode())));
        getRotateAnim().cancel();
    }

    private final void showLoaderLayout(FileDescription fileDescription) {
        ViewExtensionsKt.visible(this.loader);
        ViewExtensionsKt.invisible(getButtonPlayPause());
        ViewExtensionsKt.gone(this.errorTextView);
        this.audioStatusTextView.setText(fileDescription.getIncomingName());
        initAnimation(this.loader, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    public ImageButton getButtonPlayPause() {
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
        int h;
        int i3;
        h = i.h(i2, i);
        this.fileSizeTextView.setText(VoiceTimeLabelFormatterKt.formatAsDuration(h));
        this.slider.setEnabled(true);
        if (i > i2) {
            this.slider.setValueTo(i);
            this.slider.setValue(h);
        }
        ImageButton buttonPlayPause = getButtonPlayPause();
        ChatStyle style = getStyle();
        if (z) {
            i3 = style.voiceMessagePauseButton;
        } else {
            i3 = style.voiceMessagePlayButton;
        }
        buttonPlayPause.setImageResource(i3);
    }

    public final void onBind(ConsultPhrase consultPhrase, boolean z, String str, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, Slider.a aVar, Slider.b bVar) {
        Unit unit;
        List<? extends TextView> e;
        z65.h(consultPhrase, "consultPhrase");
        z65.h(str, "formattedDuration");
        z65.h(onLongClickListener, "onLongClick");
        z65.h(onClickListener, "onQuoteClickListener");
        z65.h(onClickListener2, "onAvatarClickListener");
        z65.h(onClickListener3, "pausePlayClickListener");
        z65.h(aVar, "onChangeListener");
        z65.h(bVar, "onSliderTouchListener");
        subscribeForHighlighting(consultPhrase, this.rootLayout);
        checkText(consultPhrase);
        FileDescription fileDescription = consultPhrase.getFileDescription();
        if (fileDescription != null) {
            setFileDescription(fileDescription);
            subscribeForVoiceMessageDownloaded();
            getButtonPlayPause().setOnClickListener(onClickListener3);
            this.slider.h(aVar);
            this.slider.i(bVar);
            this.formattedDuration = str;
            View view = this.itemView;
            z65.f(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                viewGroup.getChildAt(i).setOnLongClickListener(onLongClickListener);
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[fileDescription.getState().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    showCommonLayout(consultPhrase);
                } else {
                    showErrorLayout(fileDescription);
                }
            } else {
                showLoaderLayout(fileDescription);
            }
            this.fileSizeTextView.setText(str);
            e = jc1.e(this.timeStampTextView);
            showConsultTimeStamp(consultPhrase, e);
            ImageView imageView = this.consultAvatar;
            z65.g(imageView, "consultAvatar");
            showAvatar(imageView, consultPhrase, onClickListener2);
            changeHighlighting(z);
        }
        Quote quote = consultPhrase.getQuote();
        if (quote != null) {
            LinearLayout linearLayout = this.quoteLayout;
            TextView textView = this.quoteTextHeader;
            TextView textView2 = this.quoteTextDescription;
            TextView textView3 = this.quoteTextTimeStamp;
            ImageView imageView2 = this.quoteFileImage;
            z65.g(imageView2, "quoteFileImage");
            showQuote(quote, onClickListener, linearLayout, textView, textView2, textView3, imageView2, this.quoteProgressButton);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.quoteLayout.setVisibility(8);
        }
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    public void resetProgress() {
        this.fileSizeTextView.setText(this.formattedDuration);
        this.slider.setEnabled(false);
        this.slider.setValue(0.0f);
        getButtonPlayPause().setImageResource(getStyle().voiceMessagePlayButton);
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    public void setFileDescription(FileDescription fileDescription) {
        this.fileDescription = fileDescription;
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    public void updateIsPlaying(boolean z) {
        int i;
        ImageButton buttonPlayPause = getButtonPlayPause();
        if (z) {
            i = getStyle().voiceMessagePauseButton;
        } else {
            i = getStyle().voiceMessagePlayButton;
        }
        buttonPlayPause.setImageResource(i);
    }

    @Override // im.threads.ui.holders.VoiceMessageBaseHolder
    public void updateProgress(int i) {
        float g;
        this.fileSizeTextView.setText(VoiceTimeLabelFormatterKt.formatAsDuration(i));
        Slider slider = this.slider;
        g = i.g(i, slider.getValueTo());
        slider.setValue(g);
    }
}
