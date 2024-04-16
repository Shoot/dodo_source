package im.threads.business.audio.audioRecorder;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.logger.LoggerEdna;
import java.io.IOException;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
/* compiled from: AudioRecorder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lim/threads/business/audio/audioRecorder/AudioRecorder;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "currentConfig", "Lim/threads/business/audio/audioRecorder/AudioRecorderConfig;", "recorder", "Landroid/media/MediaRecorder;", "voiceFilePath", "", "getVoiceFilePath", "()Ljava/lang/String;", "prepare", "", "config", "prepareWithDefaultConfig", "fileNameDateFormat", "Ljava/text/SimpleDateFormat;", "start", "stop", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioRecorder {
    private final Context context;
    private AudioRecorderConfig currentConfig;
    private final MediaRecorder recorder;

    public AudioRecorder(Context context) {
        MediaRecorder mediaRecorder;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.context = context;
        if (Build.VERSION.SDK_INT >= 31) {
            jz.a();
            mediaRecorder = iz.a(context);
        } else {
            mediaRecorder = new MediaRecorder();
        }
        this.recorder = mediaRecorder;
    }

    private final void prepare(AudioRecorderConfig audioRecorderConfig) {
        this.currentConfig = audioRecorderConfig;
        Integer audioSource = audioRecorderConfig.getAudioSource();
        if (audioSource != null) {
            this.recorder.setAudioSource(audioSource.intValue());
        }
        Integer outputFormat = audioRecorderConfig.getOutputFormat();
        if (outputFormat != null) {
            this.recorder.setOutputFormat(outputFormat.intValue());
        }
        Integer audioEncoder = audioRecorderConfig.getAudioEncoder();
        if (audioEncoder != null) {
            this.recorder.setAudioEncoder(audioEncoder.intValue());
        }
        Integer audioEncodingBitRate = audioRecorderConfig.getAudioEncodingBitRate();
        if (audioEncodingBitRate != null) {
            this.recorder.setAudioEncodingBitRate(audioEncodingBitRate.intValue());
        }
        Integer audioSamplingRate = audioRecorderConfig.getAudioSamplingRate();
        if (audioSamplingRate != null) {
            this.recorder.setAudioSamplingRate(audioSamplingRate.intValue());
        }
        String outputFilePath = audioRecorderConfig.getOutputFilePath();
        if (outputFilePath != null) {
            this.recorder.setOutputFile(outputFilePath);
        }
        try {
            this.recorder.prepare();
        } catch (IOException unused) {
            LoggerEdna.error("prepare() failed");
        }
    }

    public final String getVoiceFilePath() {
        String outputFilePath;
        AudioRecorderConfig audioRecorderConfig = this.currentConfig;
        if (audioRecorderConfig == null || (outputFilePath = audioRecorderConfig.getOutputFilePath()) == null) {
            return "";
        }
        return outputFilePath;
    }

    public final void prepareWithDefaultConfig(SimpleDateFormat simpleDateFormat) {
        z65.h(simpleDateFormat, "fileNameDateFormat");
        prepare(new AudioRecorderConfig(null, null, null, null, null, null, simpleDateFormat, 63, null).getDefaultConfig(this.context));
    }

    public final void start() {
        this.recorder.start();
    }

    public final void stop() {
        try {
            this.recorder.stop();
            this.recorder.release();
        } catch (RuntimeException unused) {
            LoggerEdna.info("Exception occurred in releaseRecorder but it's fine");
        }
    }
}
