package cloud.mindbox.mobile_sdk.models;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.Gson;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MindboxError.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0006\f\r\u000e\u000f\u0010\u0011B\u0013\b\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/MindboxError;", "", "", "toJson", "", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "<init>", "(Ljava/lang/Integer;)V", "Companion", "b", "InternalServer", "Protocol", "Unknown", "UnknownServer", "Validation", "Lcloud/mindbox/mobile_sdk/models/MindboxError$InternalServer;", "Lcloud/mindbox/mobile_sdk/models/MindboxError$Protocol;", "Lcloud/mindbox/mobile_sdk/models/MindboxError$Unknown;", "Lcloud/mindbox/mobile_sdk/models/MindboxError$UnknownServer;", "Lcloud/mindbox/mobile_sdk/models/MindboxError$Validation;", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class MindboxError {
    public static final b Companion = new b(null);
    private static final rn5<Gson> gson$delegate;
    private final Integer statusCode;

    /* compiled from: MindboxError.kt */
    @y95(MindboxErrorAdapter.class)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJF\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/MindboxError$InternalServer;", "Lcloud/mindbox/mobile_sdk/models/MindboxError;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "status", "", "errorMessage", "errorId", "httpStatusCode", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getErrorId", "()Ljava/lang/String;", "getErrorMessage", "getHttpStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "getStatusCode", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcloud/mindbox/mobile_sdk/models/MindboxError$InternalServer;", "equals", "", "other", "", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class InternalServer extends MindboxError {
        private final String errorId;
        private final String errorMessage;
        private final Integer httpStatusCode;
        private final String status;
        private final int statusCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalServer(int i, String str, String str2, String str3, Integer num) {
            super(Integer.valueOf(i), null);
            z65.h(str, "status");
            this.statusCode = i;
            this.status = str;
            this.errorMessage = str2;
            this.errorId = str3;
            this.httpStatusCode = num;
        }

        public static /* synthetic */ InternalServer copy$default(InternalServer internalServer, int i, String str, String str2, String str3, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = internalServer.statusCode;
            }
            if ((i2 & 2) != 0) {
                str = internalServer.status;
            }
            String str4 = str;
            if ((i2 & 4) != 0) {
                str2 = internalServer.errorMessage;
            }
            String str5 = str2;
            if ((i2 & 8) != 0) {
                str3 = internalServer.errorId;
            }
            String str6 = str3;
            if ((i2 & 16) != 0) {
                num = internalServer.httpStatusCode;
            }
            return internalServer.copy(i, str4, str5, str6, num);
        }

        public final int component1() {
            return this.statusCode;
        }

        public final String component2() {
            return this.status;
        }

        public final String component3() {
            return this.errorMessage;
        }

        public final String component4() {
            return this.errorId;
        }

        public final Integer component5() {
            return this.httpStatusCode;
        }

        public final InternalServer copy(int i, String str, String str2, String str3, Integer num) {
            z65.h(str, "status");
            return new InternalServer(i, str, str2, str3, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InternalServer)) {
                return false;
            }
            InternalServer internalServer = (InternalServer) obj;
            if (this.statusCode == internalServer.statusCode && z65.c(this.status, internalServer.status) && z65.c(this.errorMessage, internalServer.errorMessage) && z65.c(this.errorId, internalServer.errorId) && z65.c(this.httpStatusCode, internalServer.httpStatusCode)) {
                return true;
            }
            return false;
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

        @Override // cloud.mindbox.mobile_sdk.models.MindboxError
        public Integer getStatusCode() {
            return Integer.valueOf(this.statusCode);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = ((this.statusCode * 31) + this.status.hashCode()) * 31;
            String str = this.errorMessage;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode3 + hashCode) * 31;
            String str2 = this.errorId;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            Integer num = this.httpStatusCode;
            if (num != null) {
                i = num.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            return "InternalServer(statusCode=" + this.statusCode + ", status=" + this.status + ", errorMessage=" + this.errorMessage + ", errorId=" + this.errorId + ", httpStatusCode=" + this.httpStatusCode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: MindboxError.kt */
    @y95(MindboxErrorAdapter.class)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJF\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/MindboxError$Protocol;", "Lcloud/mindbox/mobile_sdk/models/MindboxError;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "status", "", "errorMessage", "errorId", "httpStatusCode", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getErrorId", "()Ljava/lang/String;", "getErrorMessage", "getHttpStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "getStatusCode", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcloud/mindbox/mobile_sdk/models/MindboxError$Protocol;", "equals", "", "other", "", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Protocol extends MindboxError {
        private final String errorId;
        private final String errorMessage;
        private final Integer httpStatusCode;
        private final String status;
        private final int statusCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Protocol(int i, String str, String str2, String str3, Integer num) {
            super(Integer.valueOf(i), null);
            z65.h(str, "status");
            this.statusCode = i;
            this.status = str;
            this.errorMessage = str2;
            this.errorId = str3;
            this.httpStatusCode = num;
        }

        public static /* synthetic */ Protocol copy$default(Protocol protocol, int i, String str, String str2, String str3, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = protocol.statusCode;
            }
            if ((i2 & 2) != 0) {
                str = protocol.status;
            }
            String str4 = str;
            if ((i2 & 4) != 0) {
                str2 = protocol.errorMessage;
            }
            String str5 = str2;
            if ((i2 & 8) != 0) {
                str3 = protocol.errorId;
            }
            String str6 = str3;
            if ((i2 & 16) != 0) {
                num = protocol.httpStatusCode;
            }
            return protocol.copy(i, str4, str5, str6, num);
        }

        public final int component1() {
            return this.statusCode;
        }

        public final String component2() {
            return this.status;
        }

        public final String component3() {
            return this.errorMessage;
        }

        public final String component4() {
            return this.errorId;
        }

        public final Integer component5() {
            return this.httpStatusCode;
        }

        public final Protocol copy(int i, String str, String str2, String str3, Integer num) {
            z65.h(str, "status");
            return new Protocol(i, str, str2, str3, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protocol)) {
                return false;
            }
            Protocol protocol = (Protocol) obj;
            if (this.statusCode == protocol.statusCode && z65.c(this.status, protocol.status) && z65.c(this.errorMessage, protocol.errorMessage) && z65.c(this.errorId, protocol.errorId) && z65.c(this.httpStatusCode, protocol.httpStatusCode)) {
                return true;
            }
            return false;
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

        @Override // cloud.mindbox.mobile_sdk.models.MindboxError
        public Integer getStatusCode() {
            return Integer.valueOf(this.statusCode);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = ((this.statusCode * 31) + this.status.hashCode()) * 31;
            String str = this.errorMessage;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode3 + hashCode) * 31;
            String str2 = this.errorId;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            Integer num = this.httpStatusCode;
            if (num != null) {
                i = num.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            return "Protocol(statusCode=" + this.statusCode + ", status=" + this.status + ", errorMessage=" + this.errorMessage + ", errorId=" + this.errorId + ", httpStatusCode=" + this.httpStatusCode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: MindboxError.kt */
    @y95(MindboxErrorAdapter.class)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/MindboxError$Unknown;", "Lcloud/mindbox/mobile_sdk/models/MindboxError;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Unknown extends MindboxError {
        private final Throwable throwable;

        public Unknown() {
            this(null, 1, null);
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = unknown.throwable;
            }
            return unknown.copy(th);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final Unknown copy(Throwable th) {
            return new Unknown(th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Unknown) && z65.c(this.throwable, ((Unknown) obj).throwable)) {
                return true;
            }
            return false;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            Throwable th = this.throwable;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Unknown(throwable=" + this.throwable + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public Unknown(Throwable th) {
            super(null, null);
            this.throwable = th;
        }

        public /* synthetic */ Unknown(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }
    }

    /* compiled from: MindboxError.kt */
    @y95(MindboxErrorAdapter.class)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000f¨\u0006 "}, d2 = {"Lcloud/mindbox/mobile_sdk/models/MindboxError$UnknownServer;", "Lcloud/mindbox/mobile_sdk/models/MindboxError;", "()V", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "status", "", "errorMessage", "errorId", "httpStatusCode", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getErrorId", "()Ljava/lang/String;", "getErrorMessage", "getHttpStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "getStatusCode", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcloud/mindbox/mobile_sdk/models/MindboxError$UnknownServer;", "equals", "", "other", "", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class UnknownServer extends MindboxError {
        private final String errorId;
        private final String errorMessage;
        private final Integer httpStatusCode;
        private final String status;
        private final Integer statusCode;

        public /* synthetic */ UnknownServer(Integer num, String str, String str2, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2);
        }

        public static /* synthetic */ UnknownServer copy$default(UnknownServer unknownServer, Integer num, String str, String str2, String str3, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = unknownServer.statusCode;
            }
            if ((i & 2) != 0) {
                str = unknownServer.status;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                str2 = unknownServer.errorMessage;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = unknownServer.errorId;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                num2 = unknownServer.httpStatusCode;
            }
            return unknownServer.copy(num, str4, str5, str6, num2);
        }

        public final Integer component1() {
            return this.statusCode;
        }

        public final String component2() {
            return this.status;
        }

        public final String component3() {
            return this.errorMessage;
        }

        public final String component4() {
            return this.errorId;
        }

        public final Integer component5() {
            return this.httpStatusCode;
        }

        public final UnknownServer copy(Integer num, String str, String str2, String str3, Integer num2) {
            return new UnknownServer(num, str, str2, str3, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnknownServer)) {
                return false;
            }
            UnknownServer unknownServer = (UnknownServer) obj;
            if (z65.c(this.statusCode, unknownServer.statusCode) && z65.c(this.status, unknownServer.status) && z65.c(this.errorMessage, unknownServer.errorMessage) && z65.c(this.errorId, unknownServer.errorId) && z65.c(this.httpStatusCode, unknownServer.httpStatusCode)) {
                return true;
            }
            return false;
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

        @Override // cloud.mindbox.mobile_sdk.models.MindboxError
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            Integer num = this.statusCode;
            int i = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i2 = hashCode * 31;
            String str = this.status;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str2 = this.errorMessage;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str3 = this.errorId;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            Integer num2 = this.httpStatusCode;
            if (num2 != null) {
                i = num2.hashCode();
            }
            return i5 + i;
        }

        public String toString() {
            return "UnknownServer(statusCode=" + this.statusCode + ", status=" + this.status + ", errorMessage=" + this.errorMessage + ", errorId=" + this.errorId + ", httpStatusCode=" + this.httpStatusCode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public UnknownServer(Integer num, String str, String str2, String str3, Integer num2) {
            super(num, null);
            this.statusCode = num;
            this.status = str;
            this.errorMessage = str2;
            this.errorId = str3;
            this.httpStatusCode = num2;
        }

        public UnknownServer() {
            this(null, null, "Cannot reach server", null, null, 27, null);
        }
    }

    /* compiled from: MindboxError.kt */
    @y95(MindboxErrorAdapter.class)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/MindboxError$Validation;", "Lcloud/mindbox/mobile_sdk/models/MindboxError;", "", "component1", "", "component2", "", "", "component3", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "status", "validationMessages", "copy", "toString", "hashCode", "other", "", "equals", "I", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "Ljava/util/List;", "getValidationMessages", "()Ljava/util/List;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Validation extends MindboxError {
        private final String status;
        private final int statusCode;
        private final List<Object> validationMessages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Validation(int i, String str, List<Object> list) {
            super(Integer.valueOf(i), null);
            z65.h(str, "status");
            z65.h(list, "validationMessages");
            this.statusCode = i;
            this.status = str;
            this.validationMessages = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Validation copy$default(Validation validation, int i, String str, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = validation.statusCode;
            }
            if ((i2 & 2) != 0) {
                str = validation.status;
            }
            if ((i2 & 4) != 0) {
                list = validation.validationMessages;
            }
            return validation.copy(i, str, list);
        }

        public final int component1() {
            return this.statusCode;
        }

        public final String component2() {
            return this.status;
        }

        public final List<Object> component3() {
            return this.validationMessages;
        }

        public final Validation copy(int i, String str, List<Object> list) {
            z65.h(str, "status");
            z65.h(list, "validationMessages");
            return new Validation(i, str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Validation)) {
                return false;
            }
            Validation validation = (Validation) obj;
            if (this.statusCode == validation.statusCode && z65.c(this.status, validation.status) && z65.c(this.validationMessages, validation.validationMessages)) {
                return true;
            }
            return false;
        }

        public final String getStatus() {
            return this.status;
        }

        @Override // cloud.mindbox.mobile_sdk.models.MindboxError
        public Integer getStatusCode() {
            return Integer.valueOf(this.statusCode);
        }

        public final List<Object> getValidationMessages() {
            return this.validationMessages;
        }

        public int hashCode() {
            return (((this.statusCode * 31) + this.status.hashCode()) * 31) + this.validationMessages.hashCode();
        }

        public String toString() {
            return "Validation(statusCode=" + this.statusCode + ", status=" + this.status + ", validationMessages=" + this.validationMessages + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: MindboxError.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Gson> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    /* compiled from: MindboxError.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/MindboxError$b;", "", "Lcom/google/gson/Gson;", "gson$delegate", "Lrn5;", "getGson", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Gson getGson() {
            return (Gson) MindboxError.gson$delegate.getValue();
        }
    }

    static {
        rn5<Gson> b2;
        b2 = yn5.b(a.INSTANCE);
        gson$delegate = b2;
    }

    public /* synthetic */ MindboxError(Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(num);
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public final String toJson() {
        String t = Companion.getGson().t(this);
        z65.g(t, "gson.toJson(this)");
        return t;
    }

    private MindboxError(Integer num) {
        this.statusCode = num;
    }
}
