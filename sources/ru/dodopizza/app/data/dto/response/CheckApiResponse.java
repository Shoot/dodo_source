package ru.dodopizza.app.data.dto.response;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CheckApiResponse.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/dodopizza/app/data/dto/response/CheckApiResponse;", "", "()V", "errorCode", "", "getErrorCode", "()Ljava/lang/Integer;", "setErrorCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "Companion", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckApiResponse {
    public static final Companion Companion = new Companion(null);
    private static final CheckApiResponse ERROR;
    private static final CheckApiResponse SUCCESS;
    @uca("errorCode")
    @mn3
    private Integer errorCode;

    /* compiled from: CheckApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/dodopizza/app/data/dto/response/CheckApiResponse$Companion;", "", "()V", "ERROR", "Lru/dodopizza/app/data/dto/response/CheckApiResponse;", "getERROR", "()Lru/dodopizza/app/data/dto/response/CheckApiResponse;", "SUCCESS", "getSUCCESS", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CheckApiResponse getERROR() {
            return CheckApiResponse.ERROR;
        }

        public final CheckApiResponse getSUCCESS() {
            return CheckApiResponse.SUCCESS;
        }
    }

    static {
        CheckApiResponse checkApiResponse = new CheckApiResponse();
        checkApiResponse.errorCode = 1;
        SUCCESS = checkApiResponse;
        CheckApiResponse checkApiResponse2 = new CheckApiResponse();
        checkApiResponse2.errorCode = -100;
        ERROR = checkApiResponse2;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final void setErrorCode(Integer num) {
        this.errorCode = num;
    }
}
