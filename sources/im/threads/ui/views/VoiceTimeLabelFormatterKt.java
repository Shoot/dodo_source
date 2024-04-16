package im.threads.ui.views;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: VoiceTimeLabelFormatter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"formatAsDuration", "", "", "", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VoiceTimeLabelFormatterKt {
    public static final String formatAsDuration(long j) {
        pza pzaVar = pza.a;
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String format = String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L))}, 2));
        z65.g(format, "format(locale, format, *args)");
        return format;
    }

    public static final String formatAsDuration(int i) {
        return formatAsDuration(i);
    }
}
