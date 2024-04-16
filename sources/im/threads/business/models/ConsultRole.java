package im.threads.business.models;

import im.threads.business.logger.LoggerEdna;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ConsultRole.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lim/threads/business/models/ConsultRole;", "", "role", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRole", "()Ljava/lang/String;", "BOT", "EXTERNAL_BOT", "OPERATOR", "SUPERVISOR", "SYSTEM", "INTEGRATION", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum ConsultRole {
    BOT("BOT"),
    EXTERNAL_BOT("EXTERNAL_BOT"),
    OPERATOR("OPERATOR"),
    SUPERVISOR("SUPERVISOR"),
    SYSTEM("SYSTEM"),
    INTEGRATION("INTEGRATION");
    
    public static final Companion Companion = new Companion(null);
    private final String role;

    /* compiled from: ConsultRole.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lim/threads/business/models/ConsultRole$Companion;", "", "()V", "consultRoleFromString", "Lim/threads/business/models/ConsultRole;", "role", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConsultRole consultRoleFromString(String str) {
            ConsultRole[] values;
            try {
                for (ConsultRole consultRole : ConsultRole.values()) {
                    if (z65.c(consultRole.getRole(), str)) {
                        return consultRole;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (NoSuchElementException unused) {
                LoggerEdna.error("Cannot find consult role for: " + str + ". Applied default \"Operator\"");
                return ConsultRole.OPERATOR;
            }
        }
    }

    ConsultRole(String str) {
        this.role = str;
    }

    public static final ConsultRole consultRoleFromString(String str) {
        return Companion.consultRoleFromString(str);
    }

    public final String getRole() {
        return this.role;
    }
}
