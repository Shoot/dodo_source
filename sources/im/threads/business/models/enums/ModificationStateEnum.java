package im.threads.business.models.enums;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ModificationStateEnum.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lim/threads/business/models/enums/ModificationStateEnum;", "", "state", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getState", "()Ljava/lang/String;", "NONE", "EDITED", "DELETED", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum ModificationStateEnum {
    NONE("NONE"),
    EDITED("EDITED"),
    DELETED("DELETED");
    
    public static final Companion Companion = new Companion(null);
    private final String state;

    /* compiled from: ModificationStateEnum.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lim/threads/business/models/enums/ModificationStateEnum$Companion;", "", "()V", "fromString", "Lim/threads/business/models/enums/ModificationStateEnum;", "value", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ModificationStateEnum fromString(String str) {
            ModificationStateEnum[] values;
            try {
                for (ModificationStateEnum modificationStateEnum : ModificationStateEnum.values()) {
                    if (z65.c(modificationStateEnum.getState(), str)) {
                        return modificationStateEnum;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (NoSuchElementException unused) {
                return ModificationStateEnum.NONE;
            }
        }
    }

    ModificationStateEnum(String str) {
        this.state = str;
    }

    public static final ModificationStateEnum fromString(String str) {
        return Companion.fromString(str);
    }

    public final String getState() {
        return this.state;
    }
}
