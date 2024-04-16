package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MindboxResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lsk6;", "", "", "status", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "errorMessage", "getErrorMessage", "errorId", "getErrorId", "", "httpStatusCode", "Ljava/lang/Integer;", "getHttpStatusCode", "()Ljava/lang/Integer;", "", "validationMessages", "Ljava/util/List;", "getValidationMessages", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sk6  reason: default package */
/* loaded from: classes.dex */
public final class sk6 {
    public static final a Companion = new a(null);
    public static final String STATUS_INTERNAL_SERVER_ERROR = "InternalServerError";
    public static final String STATUS_PROTOCOL_ERROR = "ProtocolError";
    public static final String STATUS_SUCCESS = "Success";
    public static final String STATUS_TRANSACTION_ALREADY_PROCESSED = "TransactionAlreadyProcessed";
    public static final String STATUS_VALIDATION_ERROR = "ValidationError";
    @uca("errorId")
    private final String errorId;
    @uca("errorMessage")
    private final String errorMessage;
    @uca("httpStatusCode")
    private final Integer httpStatusCode;
    @uca("status")
    private final String status;
    @uca("validationMessages")
    private final List<Object> validationMessages;

    /* compiled from: MindboxResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lsk6$a;", "", "", "STATUS_INTERNAL_SERVER_ERROR", "Ljava/lang/String;", "STATUS_PROTOCOL_ERROR", "STATUS_SUCCESS", "STATUS_TRANSACTION_ALREADY_PROCESSED", "STATUS_VALIDATION_ERROR", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sk6$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public sk6() {
        this(null, null, null, null, null, 31, null);
    }

    public final String getErrorId() {
        return this.errorId;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public final List<Object> getValidationMessages() {
        return this.validationMessages;
    }

    public sk6(String str, String str2, String str3, Integer num, List<Object> list) {
        this.status = str;
        this.errorMessage = str2;
        this.errorId = str3;
        this.httpStatusCode = num;
        this.validationMessages = list;
    }

    public /* synthetic */ sk6(String str, String str2, String str3, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list);
    }
}
