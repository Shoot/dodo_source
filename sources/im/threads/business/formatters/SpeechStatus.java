package im.threads.business.formatters;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SpeechStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lim/threads/business/formatters/SpeechStatus;", "", "(Ljava/lang/String;I)V", "PROCESSING", "SUCCESS", "MAXSPEECH", GrsBaseInfo.CountryCodeSource.UNKNOWN, "NO_SPEECH_STATUS", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum SpeechStatus {
    PROCESSING,
    SUCCESS,
    MAXSPEECH,
    UNKNOWN,
    NO_SPEECH_STATUS;
    
    public static final Companion Companion = new Companion(null);

    /* compiled from: SpeechStatus.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lim/threads/business/formatters/SpeechStatus$Companion;", "", "()V", "fromString", "Lim/threads/business/formatters/SpeechStatus;", Action.NAME_ATTRIBUTE, "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SpeechStatus fromString(String str) {
            if (str != null) {
                try {
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    z65.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    return SpeechStatus.valueOf(upperCase);
                } catch (IllegalArgumentException unused) {
                    return SpeechStatus.UNKNOWN;
                }
            }
            return SpeechStatus.NO_SPEECH_STATUS;
        }
    }
}
