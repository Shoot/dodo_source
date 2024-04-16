package im.threads.business.media;

import ch.qos.logback.core.joran.action.Action;
import im.threads.business.audio.audioConverter.AudioConverter;
import im.threads.business.audio.audioConverter.callback.IConvertCallback;
import im.threads.business.audio.audioConverter.model.AudioFormat;
import im.threads.business.config.BaseConfig;
import im.threads.business.logger.LoggerEdna;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
/* compiled from: ChatCenterAudioConverter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lim/threads/business/media/ChatCenterAudioConverter;", "", "()V", "convertToWav", "", Action.FILE_ATTRIBUTE, "Ljava/io/File;", "callback", "Lim/threads/business/media/ChatCenterAudioConverterCallback;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatCenterAudioConverter {
    public final void convertToWav(File file, ChatCenterAudioConverterCallback chatCenterAudioConverterCallback) {
        z65.h(file, Action.FILE_ATTRIBUTE);
        z65.h(chatCenterAudioConverterCallback, "callback");
        final WeakReference weakReference = new WeakReference(chatCenterAudioConverterCallback);
        AudioConverter.Companion.with$threads_release(BaseConfig.Companion.getInstance().context).setFile(file).setFormat(AudioFormat.WAV).setCallback(new IConvertCallback() { // from class: im.threads.business.media.ChatCenterAudioConverter$convertToWav$1
            @Override // im.threads.business.audio.audioConverter.callback.IConvertCallback
            public void onFailure(Exception exc) {
                z65.h(exc, "error");
                LoggerEdna.error("error finishing voice message recording", exc);
            }

            @Override // im.threads.business.audio.audioConverter.callback.IConvertCallback
            public void onSuccess(File file2) {
                z65.h(file2, "convertedFile");
                ChatCenterAudioConverterCallback chatCenterAudioConverterCallback2 = weakReference.get();
                if (chatCenterAudioConverterCallback2 != null) {
                    chatCenterAudioConverterCallback2.acceptConvertedFile(file2);
                }
            }
        }).convert();
    }
}
