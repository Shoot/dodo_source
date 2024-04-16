package im.threads.business;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AuthMethod.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lim/threads/business/AuthMethod;", "", "(Ljava/lang/String;I)V", "toString", "", "HEADERS", "COOKIES", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum AuthMethod {
    HEADERS,
    COOKIES;
    
    public static final Companion Companion = new Companion(null);

    /* compiled from: AuthMethod.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lim/threads/business/AuthMethod$Companion;", "", "()V", "fromString", "Lim/threads/business/AuthMethod;", "stringValue", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AuthMethod fromString(String str) {
            AuthMethod authMethod;
            boolean v;
            AuthMethod[] values = AuthMethod.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    authMethod = values[i];
                    v = l0b.v(authMethod.name(), str, true);
                    if (v) {
                        break;
                    }
                    i++;
                } else {
                    authMethod = null;
                    break;
                }
            }
            if (authMethod == null) {
                return AuthMethod.HEADERS;
            }
            return authMethod;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        z65.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
