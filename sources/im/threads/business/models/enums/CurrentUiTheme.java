package im.threads.business.models.enums;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CurrentUiTheme.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lim/threads/business/models/enums/CurrentUiTheme;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SYSTEM", "LIGHT", "DARK", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum CurrentUiTheme {
    SYSTEM(0),
    LIGHT(1),
    DARK(2);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* compiled from: CurrentUiTheme.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lim/threads/business/models/enums/CurrentUiTheme$Companion;", "", "()V", "fromInt", "Lim/threads/business/models/enums/CurrentUiTheme;", "intValue", "", "(Ljava/lang/Integer;)Lim/threads/business/models/enums/CurrentUiTheme;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CurrentUiTheme fromInt(Integer num) {
            CurrentUiTheme currentUiTheme;
            CurrentUiTheme[] values = CurrentUiTheme.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    currentUiTheme = values[i];
                    int ordinal = currentUiTheme.ordinal();
                    if (num != null && ordinal == num.intValue()) {
                        break;
                    }
                    i++;
                } else {
                    currentUiTheme = null;
                    break;
                }
            }
            if (currentUiTheme == null) {
                return CurrentUiTheme.SYSTEM;
            }
            return currentUiTheme;
        }
    }

    CurrentUiTheme(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
