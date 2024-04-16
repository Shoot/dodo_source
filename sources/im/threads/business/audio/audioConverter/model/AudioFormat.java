package im.threads.business.audio.audioConverter.model;

import java.util.Locale;
import kotlin.Metadata;
/* compiled from: AudioFormat.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lim/threads/business/audio/audioConverter/model/AudioFormat;", "", "(Ljava/lang/String;I)V", "format", "", "getFormat", "()Ljava/lang/String;", "AAC", "MP3", "M4A", "WMA", "WAV", "FLAC", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum AudioFormat {
    AAC,
    MP3,
    M4A,
    WMA,
    WAV,
    FLAC;

    public final String getFormat() {
        String name = name();
        Locale locale = Locale.getDefault();
        z65.g(locale, "getDefault()");
        String lowerCase = name.toLowerCase(locale);
        z65.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
