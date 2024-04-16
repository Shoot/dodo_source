package im.threads.business.models.enums;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ApiVersionEnum.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lim/threads/business/models/enums/ApiVersionEnum;", "", "version", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "toString", "V15", "V17", "V18", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum ApiVersionEnum {
    V15("15"),
    V17("17"),
    V18("18");
    
    public static final Companion Companion = new Companion(null);
    private static final ApiVersionEnum defaultApiVersionEnum;
    private final String version;

    /* compiled from: ApiVersionEnum.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lim/threads/business/models/enums/ApiVersionEnum$Companion;", "", "()V", "defaultApiVersionEnum", "Lim/threads/business/models/enums/ApiVersionEnum;", "getDefaultApiVersionEnum", "()Lim/threads/business/models/enums/ApiVersionEnum;", "createApiVersionEnum", "version", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ApiVersionEnum createApiVersionEnum(String str) {
            ApiVersionEnum[] values;
            z65.h(str, "version");
            try {
                for (ApiVersionEnum apiVersionEnum : ApiVersionEnum.values()) {
                    if (z65.c(apiVersionEnum.getVersion(), str)) {
                        return apiVersionEnum;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (IllegalArgumentException unused) {
                return getDefaultApiVersionEnum();
            }
        }

        public final ApiVersionEnum getDefaultApiVersionEnum() {
            return ApiVersionEnum.defaultApiVersionEnum;
        }
    }

    static {
        ApiVersionEnum apiVersionEnum;
        defaultApiVersionEnum = apiVersionEnum;
    }

    ApiVersionEnum(String str) {
        this.version = str;
    }

    public static final ApiVersionEnum createApiVersionEnum(String str) {
        return Companion.createApiVersionEnum(str);
    }

    public final String getVersion() {
        return this.version;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.version;
    }
}
