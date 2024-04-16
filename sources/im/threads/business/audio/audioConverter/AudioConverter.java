package im.threads.business.audio.audioConverter;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.github.hiteshsondhi88.libffmpeg.d;
import com.github.hiteshsondhi88.libffmpeg.f;
import com.github.hiteshsondhi88.libffmpeg.g;
import im.threads.business.annotation.OpenForTesting;
import im.threads.business.audio.audioConverter.callback.IConvertCallback;
import im.threads.business.audio.audioConverter.callback.ILoadCallback;
import im.threads.business.audio.audioConverter.model.AudioFormat;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AudioConverter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R&\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lim/threads/business/audio/audioConverter/AudioConverter;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "audioFile", "Ljava/io/File;", "getAudioFile$annotations", "()V", "getAudioFile", "()Ljava/io/File;", "setAudioFile", "(Ljava/io/File;)V", "callback", "Lim/threads/business/audio/audioConverter/callback/IConvertCallback;", "getCallback$annotations", "getCallback", "()Lim/threads/business/audio/audioConverter/callback/IConvertCallback;", "setCallback", "(Lim/threads/business/audio/audioConverter/callback/IConvertCallback;)V", "format", "Lim/threads/business/audio/audioConverter/model/AudioFormat;", "getFormat$annotations", "getFormat", "()Lim/threads/business/audio/audioConverter/model/AudioFormat;", "setFormat", "(Lim/threads/business/audio/audioConverter/model/AudioFormat;)V", "convert", "", "setFile", "originalFile", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioConverter {
    public static final Companion Companion = new Companion(null);
    private static boolean isLoaded;
    private File audioFile;
    private IConvertCallback callback;
    private final Context context;
    private AudioFormat format;

    /* compiled from: AudioConverter.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u001f\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0016R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lim/threads/business/audio/audioConverter/AudioConverter$Companion;", "", "()V", "<set-?>", "", "isLoaded", "isLoaded$threads_release", "()Z", "getConvertedFile", "Ljava/io/File;", "originalFile", "format", "Lim/threads/business/audio/audioConverter/model/AudioFormat;", "load", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "callback", "Lim/threads/business/audio/audioConverter/callback/ILoadCallback;", "load$threads_release", "with", "Lim/threads/business/audio/audioConverter/AudioConverter;", "with$threads_release", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File getConvertedFile(File file, AudioFormat audioFormat) {
            List y0;
            String F;
            String path = file.getPath();
            z65.g(path, "originalFile.path");
            y0 = m0b.y0(path, new String[]{"."}, false, 0, 6, null);
            String[] strArr = (String[]) y0.toArray(new String[0]);
            String path2 = file.getPath();
            z65.g(path2, "originalFile.path");
            String str = strArr[strArr.length - 1];
            z65.e(audioFormat);
            F = l0b.F(path2, str, audioFormat.getFormat(), false, 4, null);
            return new File(F);
        }

        public final boolean isLoaded$threads_release() {
            return AudioConverter.isLoaded;
        }

        public final void load$threads_release(Context context, final ILoadCallback iLoadCallback) {
            z65.h(iLoadCallback, "callback");
            try {
                d.d(context).e(new g() { // from class: im.threads.business.audio.audioConverter.AudioConverter$Companion$load$1
                    @Override // com.github.hiteshsondhi88.libffmpeg.g
                    public void onFailure() {
                        AudioConverter.isLoaded = false;
                        ILoadCallback.this.onFailure(new Exception("Failed to loaded FFmpeg lib"));
                    }

                    @Override // com.github.hiteshsondhi88.libffmpeg.g
                    public void onSuccess() {
                        AudioConverter.isLoaded = true;
                        ILoadCallback.this.onSuccess();
                    }

                    @Override // com.github.hiteshsondhi88.libffmpeg.k
                    public void onFinish() {
                    }

                    @Override // com.github.hiteshsondhi88.libffmpeg.k
                    public void onStart() {
                    }
                });
            } catch (Exception e) {
                AudioConverter.isLoaded = false;
                iLoadCallback.onFailure(e);
            }
        }

        public final AudioConverter with$threads_release(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            return new AudioConverter(context, null);
        }
    }

    public /* synthetic */ AudioConverter(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public final void convert() {
        if (!isLoaded) {
            IConvertCallback iConvertCallback = this.callback;
            if (iConvertCallback != null) {
                iConvertCallback.onFailure(new Exception("FFmpeg not loaded"));
                return;
            }
            return;
        }
        File file = this.audioFile;
        if (file != null) {
            if (!file.exists()) {
                IConvertCallback iConvertCallback2 = this.callback;
                z65.e(iConvertCallback2);
                iConvertCallback2.onFailure(new IOException("File not exists"));
            } else if (file.canRead()) {
                final File convertedFile = Companion.getConvertedFile(file, this.format);
                try {
                    d.d(this.context).c(new String[]{"-y", "-i", file.getPath(), convertedFile.getPath()}, new f() { // from class: im.threads.business.audio.audioConverter.AudioConverter$convert$1$1
                        @Override // com.github.hiteshsondhi88.libffmpeg.f
                        public void onFailure(String str) {
                            z65.h(str, "message");
                            IConvertCallback callback = AudioConverter.this.getCallback();
                            if (callback != null) {
                                callback.onFailure(new IOException(str));
                            }
                        }

                        @Override // com.github.hiteshsondhi88.libffmpeg.f
                        public void onProgress(String str) {
                            z65.h(str, "message");
                        }

                        @Override // com.github.hiteshsondhi88.libffmpeg.f
                        public void onSuccess(String str) {
                            z65.h(str, "message");
                            IConvertCallback callback = AudioConverter.this.getCallback();
                            if (callback != null) {
                                callback.onSuccess(convertedFile);
                            }
                        }

                        @Override // com.github.hiteshsondhi88.libffmpeg.k
                        public void onFinish() {
                        }

                        @Override // com.github.hiteshsondhi88.libffmpeg.k
                        public void onStart() {
                        }
                    });
                    Unit unit = Unit.a;
                } catch (Exception e) {
                    IConvertCallback iConvertCallback3 = this.callback;
                    if (iConvertCallback3 != null) {
                        iConvertCallback3.onFailure(e);
                        Unit unit2 = Unit.a;
                    }
                }
            } else {
                IConvertCallback iConvertCallback4 = this.callback;
                z65.e(iConvertCallback4);
                iConvertCallback4.onFailure(new IOException("Can't read the file. Missing permission?"));
            }
        }
    }

    public final File getAudioFile() {
        return this.audioFile;
    }

    public final IConvertCallback getCallback() {
        return this.callback;
    }

    public final AudioFormat getFormat() {
        return this.format;
    }

    public final void setAudioFile(File file) {
        this.audioFile = file;
    }

    public final AudioConverter setCallback(IConvertCallback iConvertCallback) {
        this.callback = iConvertCallback;
        return this;
    }

    public final AudioConverter setFile(File file) {
        this.audioFile = file;
        return this;
    }

    public final AudioConverter setFormat(AudioFormat audioFormat) {
        this.format = audioFormat;
        return this;
    }

    private AudioConverter(Context context) {
        this.context = context;
    }

    /* renamed from: setCallback  reason: collision with other method in class */
    public final void m10setCallback(IConvertCallback iConvertCallback) {
        this.callback = iConvertCallback;
    }

    /* renamed from: setFormat  reason: collision with other method in class */
    public final void m11setFormat(AudioFormat audioFormat) {
        this.format = audioFormat;
    }

    @OpenForTesting
    public static /* synthetic */ void getAudioFile$annotations() {
    }

    @OpenForTesting
    public static /* synthetic */ void getCallback$annotations() {
    }

    @OpenForTesting
    public static /* synthetic */ void getFormat$annotations() {
    }
}
