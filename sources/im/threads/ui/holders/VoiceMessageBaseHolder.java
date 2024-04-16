package im.threads.ui.holders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import im.threads.R;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.media.FileDescriptionMediaPlayer;
import im.threads.business.models.ChatItem;
import im.threads.business.models.FileDescription;
import im.threads.business.models.FileDescriptionUri;
import im.threads.business.ogParser.OpenGraphParser;
import im.threads.ui.config.Config;
import im.threads.ui.holders.VoiceMessageBaseHolder;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: VoiceMessageBaseHolder.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 /2\u00020\u0001:\u0001/B9\b\u0000\u0012\u0006\u0010'\u001a\u00020&\u0012\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0002H&J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00188&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8$X¤\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00060"}, d2 = {"Lim/threads/ui/holders/VoiceMessageBaseHolder;", "Lim/threads/ui/holders/BaseHolder;", "", "resetTintForPlayPauseButton", "", "maxValue", "progress", "", "isPlaying", "init", "updateProgress", "updateIsPlaying", "resetProgress", "startLoader", "stopLoader", "subscribeForVoiceMessageDownloaded", "Lim/threads/business/media/FileDescriptionMediaPlayer;", "fdMediaPlayer", "Lim/threads/business/media/FileDescriptionMediaPlayer;", "isIncomingMessage", "Z", "Lwn1;", "disposables", "Lwn1;", "Lim/threads/business/models/FileDescription;", "getFileDescription", "()Lim/threads/business/models/FileDescription;", "setFileDescription", "(Lim/threads/business/models/FileDescription;)V", "fileDescription", "Landroid/view/ViewGroup;", "getVoiceMessage", "()Landroid/view/ViewGroup;", "voiceMessage", "Landroid/widget/ImageView;", "getButtonPlayPause", "()Landroid/widget/ImageView;", "buttonPlayPause", "Landroid/view/View;", "itemView", "Lks8;", "Lim/threads/business/models/ChatItem;", "highlightStream", "Lim/threads/business/ogParser/OpenGraphParser;", "openGraphParser", "<init>", "(Landroid/view/View;Lks8;Lim/threads/business/ogParser/OpenGraphParser;Lim/threads/business/media/FileDescriptionMediaPlayer;Z)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public abstract class VoiceMessageBaseHolder extends BaseHolder {
    public static final Companion Companion = new Companion(null);
    private static String loadingStateTag = "loading";
    private final wn1 disposables;
    private final FileDescriptionMediaPlayer fdMediaPlayer;
    private final boolean isIncomingMessage;

    /* compiled from: VoiceMessageBaseHolder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lim/threads/ui/holders/VoiceMessageBaseHolder$Companion;", "", "()V", "loadingStateTag", "", "getLoadingStateTag", "()Ljava/lang/String;", "setLoadingStateTag", "(Ljava/lang/String;)V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getLoadingStateTag() {
            return VoiceMessageBaseHolder.loadingStateTag;
        }

        public final void setLoadingStateTag(String str) {
            z65.h(str, "<set-?>");
            VoiceMessageBaseHolder.loadingStateTag = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceMessageBaseHolder(View view, ks8<ChatItem> ks8Var, OpenGraphParser openGraphParser, FileDescriptionMediaPlayer fileDescriptionMediaPlayer, boolean z) {
        super(view, ks8Var, openGraphParser);
        z65.h(view, "itemView");
        z65.h(openGraphParser, "openGraphParser");
        z65.h(fileDescriptionMediaPlayer, "fdMediaPlayer");
        this.fdMediaPlayer = fileDescriptionMediaPlayer;
        this.isIncomingMessage = z;
        this.disposables = new wn1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetTintForPlayPauseButton() {
        int i;
        if (this.isIncomingMessage) {
            i = getStyle().incomingPlayPauseButtonColor;
        } else {
            i = getStyle().outgoingPlayPauseButtonColor;
        }
        ColorsHelper.setTint(this.itemView.getContext(), getButtonPlayPause(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeForVoiceMessageDownloaded$lambda$3$lambda$1(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeForVoiceMessageDownloaded$lambda$3$lambda$2(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    protected abstract ImageView getButtonPlayPause();

    public abstract FileDescription getFileDescription();

    protected abstract ViewGroup getVoiceMessage();

    public abstract void init(int i, int i2, boolean z);

    public abstract void resetProgress();

    public abstract void setFileDescription(FileDescription fileDescription);

    public final void startLoader() {
        int i;
        ViewExtensionsKt.visible(getVoiceMessage());
        if (this.isIncomingMessage) {
            i = Config.Companion.getInstance().getChatStyle().incomingMessageLoaderColor;
        } else {
            i = Config.Companion.getInstance().getChatStyle().outgoingMessageLoaderColor;
        }
        getButtonPlayPause().setTag(loadingStateTag);
        initAnimation(getButtonPlayPause(), i);
    }

    public final void stopLoader() {
        cancelAnimation();
        getButtonPlayPause().setImageResource(R.drawable.ecc_voice_message_play);
        resetTintForPlayPauseButton();
        getButtonPlayPause().setTag("");
    }

    public final void subscribeForVoiceMessageDownloaded() {
        final View view = this.itemView;
        z65.g(view, "itemView");
        if (!syb.X(view)) {
            this.disposables.e();
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: im.threads.ui.holders.VoiceMessageBaseHolder$subscribeForVoiceMessageDownloaded$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    z65.h(view2, "view");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    z65.h(view2, "view");
                    view.removeOnAttachStateChangeListener(this);
                    this.disposables.e();
                }
            });
        }
        FileDescription fileDescription = getFileDescription();
        if (fileDescription != null) {
            wn1 wn1Var = this.disposables;
            r57<FileDescriptionUri> m = fileDescription.getOnCompleteSubject().m(ti.c());
            final VoiceMessageBaseHolder$subscribeForVoiceMessageDownloaded$2$1 voiceMessageBaseHolder$subscribeForVoiceMessageDownloaded$2$1 = new VoiceMessageBaseHolder$subscribeForVoiceMessageDownloaded$2$1(this);
            wr1<? super FileDescriptionUri> wr1Var = new wr1() { // from class: y1c
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    VoiceMessageBaseHolder.subscribeForVoiceMessageDownloaded$lambda$3$lambda$1(Function1.this, obj);
                }
            };
            final VoiceMessageBaseHolder$subscribeForVoiceMessageDownloaded$2$2 voiceMessageBaseHolder$subscribeForVoiceMessageDownloaded$2$2 = new VoiceMessageBaseHolder$subscribeForVoiceMessageDownloaded$2$2(LoggerEdna.INSTANCE);
            wn1Var.b(m.p(wr1Var, new wr1() { // from class: z1c
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    VoiceMessageBaseHolder.subscribeForVoiceMessageDownloaded$lambda$3$lambda$2(Function1.this, obj);
                }
            }));
        }
    }

    public abstract void updateIsPlaying(boolean z);

    public abstract void updateProgress(int i);
}
