package im.threads.business.media;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import im.threads.business.config.BaseConfig;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.media.FileDescriptionMediaPlayer;
import im.threads.business.models.FileDescription;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FileDescriptionMediaPlayer.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\b\u0010\r\u001a\u00020\u0006H\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007J\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010)\u001a\u0004\u0018\u00010\u00102\b\u0010(\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u0004\u0018\u0001058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010;\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lim/threads/business/media/FileDescriptionMediaPlayer;", "", "Landroid/media/AudioFocusRequest;", "getAudioFocusRequest", "Lim/threads/business/models/FileDescription;", "fileDescription", "", "startMediaPlayer", "createMediaPlayer", "releaseMediaPlayer", "processPlayPause", "reset", "release", "requestAudioFocus", "abandonAudioFocus", "clearClickedDownloadPath", "Landroid/media/MediaPlayer;", "restartMediaPlayer", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "", "clickedDownloadPath", "Ljava/lang/String;", "getClickedDownloadPath", "()Ljava/lang/String;", "setClickedDownloadPath", "(Ljava/lang/String;)V", "", "restartCount", "I", "Li14;", "", "updateProcessor", "Li14;", "getUpdateProcessor", "()Li14;", "Lz33;", "disposable", "Lz33;", "<set-?>", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "onAudioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "Lim/threads/business/models/FileDescription;", "getFileDescription", "()Lim/threads/business/models/FileDescription;", "Landroid/net/Uri;", "getFileUri", "()Landroid/net/Uri;", "fileUri", "getDuration", "()I", "duration", "<init>", "(Landroid/media/AudioManager;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FileDescriptionMediaPlayer {
    public static final Companion Companion = new Companion(null);
    private static final long UPDATE_PERIOD = 200;
    private AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private String clickedDownloadPath;
    private final z33 disposable;
    private FileDescription fileDescription;
    private MediaPlayer mediaPlayer;
    private final AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
    private int restartCount;
    private final i14<Boolean> updateProcessor;

    /* compiled from: FileDescriptionMediaPlayer.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lim/threads/business/media/FileDescriptionMediaPlayer$Companion;", "", "()V", "UPDATE_PERIOD", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FileDescriptionMediaPlayer(AudioManager audioManager) {
        z65.h(audioManager, "audioManager");
        this.audioManager = audioManager;
        js8 e0 = js8.e0();
        z65.g(e0, "create()");
        this.updateProcessor = e0;
        l04<wgb<Long>> H = l04.E(UPDATE_PERIOD, TimeUnit.MILLISECONDS).L().X().H(ti.c());
        final FileDescriptionMediaPlayer$disposable$1 fileDescriptionMediaPlayer$disposable$1 = new FileDescriptionMediaPlayer$disposable$1(this);
        wr1<? super wgb<Long>> wr1Var = new wr1() { // from class: ot3
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                FileDescriptionMediaPlayer.disposable$lambda$0(Function1.this, obj);
            }
        };
        final FileDescriptionMediaPlayer$disposable$2 fileDescriptionMediaPlayer$disposable$2 = FileDescriptionMediaPlayer$disposable$2.INSTANCE;
        z33 P = H.P(wr1Var, new wr1() { // from class: pt3
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                FileDescriptionMediaPlayer.disposable$lambda$1(Function1.this, obj);
            }
        });
        z65.g(P, "interval(UPDATE_PERIOD, …onMediaPlayer \", error) }");
        this.disposable = P;
        this.onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: qt3
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                FileDescriptionMediaPlayer.onAudioFocusChangeListener$lambda$2(FileDescriptionMediaPlayer.this, i);
            }
        };
    }

    private final void createMediaPlayer(FileDescription fileDescription) {
        this.fileDescription = fileDescription;
        try {
            this.mediaPlayer = MediaPlayer.create(BaseConfig.Companion.getInstance().context, getFileUri());
            this.restartCount = 0;
        } catch (Exception unused) {
            int i = this.restartCount;
            this.restartCount = i + 1;
            if (i < 3) {
                restartMediaPlayer(fileDescription);
            } else {
                releaseMediaPlayer();
            }
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: nt3
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    FileDescriptionMediaPlayer.createMediaPlayer$lambda$6(FileDescriptionMediaPlayer.this, mediaPlayer2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMediaPlayer$lambda$6(FileDescriptionMediaPlayer fileDescriptionMediaPlayer, MediaPlayer mediaPlayer) {
        z65.h(fileDescriptionMediaPlayer, "this$0");
        fileDescriptionMediaPlayer.abandonAudioFocus();
        fileDescriptionMediaPlayer.releaseMediaPlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disposable$lambda$0(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disposable$lambda$1(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final AudioFocusRequest getAudioFocusRequest() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest == null) {
            audioAttributes = mt3.a(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build());
            acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(true);
            onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(this.onAudioFocusChangeListener);
            build = onAudioFocusChangeListener.build();
            this.audioFocusRequest = build;
            z65.e(build);
            return build;
        }
        return audioFocusRequest;
    }

    private final Uri getFileUri() {
        Uri uri;
        boolean z;
        String str;
        String str2;
        Uri parse;
        Uri uri2;
        FileDescription fileDescription = this.fileDescription;
        if (fileDescription != null) {
            if (fileDescription != null) {
                uri = fileDescription.getFileUri();
            } else {
                uri = null;
            }
            boolean z2 = false;
            if (uri != null) {
                z = true;
            } else {
                z = false;
            }
            FileDescription fileDescription2 = this.fileDescription;
            if (fileDescription2 != null) {
                str = fileDescription2.getDownloadPath();
            } else {
                str = null;
            }
            if (str == null) {
                z2 = true;
            }
            if (z) {
                FileDescription fileDescription3 = this.fileDescription;
                if (fileDescription3 != null) {
                    parse = fileDescription3.getFileUri();
                }
                parse = null;
            } else {
                if (!z2) {
                    FileDescription fileDescription4 = this.fileDescription;
                    if (fileDescription4 != null) {
                        str2 = fileDescription4.getDownloadPath();
                    } else {
                        str2 = null;
                    }
                    parse = Uri.parse(str2);
                }
                parse = null;
            }
            FileDescription fileDescription5 = this.fileDescription;
            if (fileDescription5 != null) {
                fileDescription5.setFileUri(parse);
            }
            FileDescription fileDescription6 = this.fileDescription;
            if (fileDescription6 != null) {
                uri2 = fileDescription6.getFileUri();
            } else {
                uri2 = null;
            }
            if (uri2 == null) {
                LoggerEdna.info("file uri is null");
                return null;
            }
            return parse;
        }
        LoggerEdna.info("file uri is null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAudioFocusChangeListener$lambda$2(FileDescriptionMediaPlayer fileDescriptionMediaPlayer, int i) {
        MediaPlayer mediaPlayer;
        z65.h(fileDescriptionMediaPlayer, "this$0");
        if (i != -3 && i != -2 && i != -1) {
            if (i == 1 && (mediaPlayer = fileDescriptionMediaPlayer.mediaPlayer) != null) {
                mediaPlayer.start();
                return;
            }
            return;
        }
        MediaPlayer mediaPlayer2 = fileDescriptionMediaPlayer.mediaPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.pause();
        }
    }

    private final void releaseMediaPlayer() {
        this.fileDescription = null;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.mediaPlayer = null;
        }
        this.updateProcessor.d(Boolean.TRUE);
    }

    private final void startMediaPlayer(FileDescription fileDescription) {
        createMediaPlayer(fileDescription);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.start();
            requestAudioFocus();
            this.updateProcessor.d(Boolean.TRUE);
        }
    }

    @SuppressLint({"NewApi"})
    public final void abandonAudioFocus() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.audioManager.abandonAudioFocusRequest(getAudioFocusRequest());
        } else {
            this.audioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
        }
    }

    public final void clearClickedDownloadPath() {
        this.clickedDownloadPath = null;
    }

    public final String getClickedDownloadPath() {
        return this.clickedDownloadPath;
    }

    public final int getDuration() {
        int duration;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null && (duration = mediaPlayer.getDuration()) >= 0) {
            return duration;
        }
        return 1;
    }

    public final FileDescription getFileDescription() {
        return this.fileDescription;
    }

    public final MediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }

    public final i14<Boolean> getUpdateProcessor() {
        return this.updateProcessor;
    }

    public final void processPlayPause(FileDescription fileDescription) {
        z65.h(fileDescription, "fileDescription");
        getFileUri();
        if (p57.a(this.fileDescription, fileDescription)) {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    abandonAudioFocus();
                } else {
                    mediaPlayer.start();
                    requestAudioFocus();
                }
                this.updateProcessor.d(Boolean.TRUE);
                return;
            }
            return;
        }
        releaseMediaPlayer();
        startMediaPlayer(fileDescription);
    }

    public final void release() {
        if (this.mediaPlayer != null) {
            releaseMediaPlayer();
        }
        this.disposable.a();
    }

    @SuppressLint({"NewApi"})
    public final void requestAudioFocus() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.audioManager.requestAudioFocus(getAudioFocusRequest());
        } else {
            this.audioManager.requestAudioFocus(this.onAudioFocusChangeListener, 3, 4);
        }
    }

    public final void reset() {
        if (this.mediaPlayer != null) {
            releaseMediaPlayer();
        }
    }

    public final MediaPlayer restartMediaPlayer(FileDescription fileDescription) {
        z65.h(fileDescription, "fileDescription");
        releaseMediaPlayer();
        createMediaPlayer(fileDescription);
        return this.mediaPlayer;
    }

    public final void setClickedDownloadPath(String str) {
        this.clickedDownloadPath = str;
    }
}
