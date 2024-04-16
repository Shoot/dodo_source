package im.threads.business.models.enums;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ErrorStateEnum.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lim/threads/business/models/enums/ErrorStateEnum;", "", "state", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getState", "()Ljava/lang/String;", "ANY", "DISALLOWED", "TIMEOUT", "UNEXPECTED", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum ErrorStateEnum {
    ANY("ANY"),
    DISALLOWED("DS-1"),
    TIMEOUT("DS-10"),
    UNEXPECTED("DS-100");
    
    public static final Companion Companion = new Companion(null);
    private final String state;

    /* compiled from: ErrorStateEnum.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lim/threads/business/models/enums/ErrorStateEnum$Companion;", "", "()V", "errorStateEnumFromString", "Lim/threads/business/models/enums/ErrorStateEnum;", "value", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorStateEnum errorStateEnumFromString(String str) {
            ErrorStateEnum[] values;
            z65.h(str, "value");
            try {
                for (ErrorStateEnum errorStateEnum : ErrorStateEnum.values()) {
                    if (z65.c(errorStateEnum.getState(), str)) {
                        return errorStateEnum;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (NoSuchElementException unused) {
                return ErrorStateEnum.ANY;
            }
        }
    }

    ErrorStateEnum(String str) {
        this.state = str;
    }

    public static final ErrorStateEnum errorStateEnumFromString(String str) {
        return Companion.errorStateEnumFromString(str);
    }

    public final String getState() {
        return this.state;
    }
}
