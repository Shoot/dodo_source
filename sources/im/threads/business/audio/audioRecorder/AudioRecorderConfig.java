package im.threads.business.audio.audioRecorder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AudioRecorderConfig.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J`\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&H\u0007J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\u000e¨\u0006)"}, d2 = {"Lim/threads/business/audio/audioRecorder/AudioRecorderConfig;", "", "audioSource", "", "outputFormat", "audioEncoder", "audioEncodingBitRate", "audioSamplingRate", "outputFilePath", "", "fileNameDateFormat", "Ljava/text/SimpleDateFormat;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/text/SimpleDateFormat;)V", "getAudioEncoder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAudioEncodingBitRate", "getAudioSamplingRate", "getAudioSource", "getFileNameDateFormat", "()Ljava/text/SimpleDateFormat;", "getOutputFilePath", "()Ljava/lang/String;", "getOutputFormat", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/text/SimpleDateFormat;)Lim/threads/business/audio/audioRecorder/AudioRecorderConfig;", "equals", "", "other", "getDefaultConfig", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "hashCode", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioRecorderConfig {
    private final Integer audioEncoder;
    private final Integer audioEncodingBitRate;
    private final Integer audioSamplingRate;
    private final Integer audioSource;
    private final SimpleDateFormat fileNameDateFormat;
    private final String outputFilePath;
    private final Integer outputFormat;

    public AudioRecorderConfig(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, SimpleDateFormat simpleDateFormat) {
        z65.h(simpleDateFormat, "fileNameDateFormat");
        this.audioSource = num;
        this.outputFormat = num2;
        this.audioEncoder = num3;
        this.audioEncodingBitRate = num4;
        this.audioSamplingRate = num5;
        this.outputFilePath = str;
        this.fileNameDateFormat = simpleDateFormat;
    }

    public static /* synthetic */ AudioRecorderConfig copy$default(AudioRecorderConfig audioRecorderConfig, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, SimpleDateFormat simpleDateFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            num = audioRecorderConfig.audioSource;
        }
        if ((i & 2) != 0) {
            num2 = audioRecorderConfig.outputFormat;
        }
        Integer num6 = num2;
        if ((i & 4) != 0) {
            num3 = audioRecorderConfig.audioEncoder;
        }
        Integer num7 = num3;
        if ((i & 8) != 0) {
            num4 = audioRecorderConfig.audioEncodingBitRate;
        }
        Integer num8 = num4;
        if ((i & 16) != 0) {
            num5 = audioRecorderConfig.audioSamplingRate;
        }
        Integer num9 = num5;
        if ((i & 32) != 0) {
            str = audioRecorderConfig.outputFilePath;
        }
        String str2 = str;
        if ((i & 64) != 0) {
            simpleDateFormat = audioRecorderConfig.fileNameDateFormat;
        }
        return audioRecorderConfig.copy(num, num6, num7, num8, num9, str2, simpleDateFormat);
    }

    public final Integer component1() {
        return this.audioSource;
    }

    public final Integer component2() {
        return this.outputFormat;
    }

    public final Integer component3() {
        return this.audioEncoder;
    }

    public final Integer component4() {
        return this.audioEncodingBitRate;
    }

    public final Integer component5() {
        return this.audioSamplingRate;
    }

    public final String component6() {
        return this.outputFilePath;
    }

    public final SimpleDateFormat component7() {
        return this.fileNameDateFormat;
    }

    public final AudioRecorderConfig copy(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, SimpleDateFormat simpleDateFormat) {
        z65.h(simpleDateFormat, "fileNameDateFormat");
        return new AudioRecorderConfig(num, num2, num3, num4, num5, str, simpleDateFormat);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioRecorderConfig)) {
            return false;
        }
        AudioRecorderConfig audioRecorderConfig = (AudioRecorderConfig) obj;
        if (z65.c(this.audioSource, audioRecorderConfig.audioSource) && z65.c(this.outputFormat, audioRecorderConfig.outputFormat) && z65.c(this.audioEncoder, audioRecorderConfig.audioEncoder) && z65.c(this.audioEncodingBitRate, audioRecorderConfig.audioEncodingBitRate) && z65.c(this.audioSamplingRate, audioRecorderConfig.audioSamplingRate) && z65.c(this.outputFilePath, audioRecorderConfig.outputFilePath) && z65.c(this.fileNameDateFormat, audioRecorderConfig.fileNameDateFormat)) {
            return true;
        }
        return false;
    }

    public final Integer getAudioEncoder() {
        return this.audioEncoder;
    }

    public final Integer getAudioEncodingBitRate() {
        return this.audioEncodingBitRate;
    }

    public final Integer getAudioSamplingRate() {
        return this.audioSamplingRate;
    }

    public final Integer getAudioSource() {
        return this.audioSource;
    }

    @SuppressLint({"InlinedApi"})
    public final AudioRecorderConfig getDefaultConfig(Context context) {
        boolean z;
        int i;
        int i2;
        Integer num;
        String str;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 11;
        } else {
            i = 1;
        }
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            i2 = 7;
        } else {
            i2 = 2;
        }
        Integer valueOf2 = Integer.valueOf(i2);
        Integer num2 = null;
        if (z) {
            num = null;
        } else {
            num = 128000;
        }
        if (!z) {
            num2 = 44100;
        }
        Integer num3 = num2;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        pza pzaVar = pza.a;
        if (z) {
            str = "/voice%s.ogg";
        } else {
            str = "/voice%s.wav";
        }
        String format = String.format(str, Arrays.copyOf(new Object[]{this.fileNameDateFormat.format(new Date())}, 1));
        z65.g(format, "format(format, *args)");
        return new AudioRecorderConfig(1, valueOf, valueOf2, num, num3, absolutePath + format, this.fileNameDateFormat);
    }

    public final SimpleDateFormat getFileNameDateFormat() {
        return this.fileNameDateFormat;
    }

    public final String getOutputFilePath() {
        return this.outputFilePath;
    }

    public final Integer getOutputFormat() {
        return this.outputFormat;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Integer num = this.audioSource;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.outputFormat;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num3 = this.audioEncoder;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num4 = this.audioEncodingBitRate;
        if (num4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num5 = this.audioSamplingRate;
        if (num5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str = this.outputFilePath;
        if (str != null) {
            i = str.hashCode();
        }
        return ((i6 + i) * 31) + this.fileNameDateFormat.hashCode();
    }

    public String toString() {
        Integer num = this.audioSource;
        Integer num2 = this.outputFormat;
        Integer num3 = this.audioEncoder;
        Integer num4 = this.audioEncodingBitRate;
        Integer num5 = this.audioSamplingRate;
        String str = this.outputFilePath;
        SimpleDateFormat simpleDateFormat = this.fileNameDateFormat;
        return "AudioRecorderConfig(audioSource=" + num + ", outputFormat=" + num2 + ", audioEncoder=" + num3 + ", audioEncodingBitRate=" + num4 + ", audioSamplingRate=" + num5 + ", outputFilePath=" + str + ", fileNameDateFormat=" + simpleDateFormat + ")";
    }

    public /* synthetic */ AudioRecorderConfig(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, SimpleDateFormat simpleDateFormat, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : str, simpleDateFormat);
    }
}
