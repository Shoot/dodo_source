package cloud.mindbox.mobile_sdk.models;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.reflect.TypeToken;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Event.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \r2\u00020\u0001:\t\u000e\u000f\u0010\u0011\r\u0012\u0013\u0014\u0015B\u0019\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0001\b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/EventType;", "", "", "ordinal", "", "operation", "Ljava/lang/String;", "getOperation", "()Ljava/lang/String;", "endpoint", "getEndpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "Lcloud/mindbox/mobile_sdk/models/EventType$a;", "Lcloud/mindbox/mobile_sdk/models/EventType$b;", "Lcloud/mindbox/mobile_sdk/models/EventType$c;", "Lcloud/mindbox/mobile_sdk/models/EventType$d;", "Lcloud/mindbox/mobile_sdk/models/EventType$e;", "Lcloud/mindbox/mobile_sdk/models/EventType$f;", "Lcloud/mindbox/mobile_sdk/models/EventType$g;", "Lcloud/mindbox/mobile_sdk/models/EventType$h;", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class EventType {
    private static final int APP_INFO_UPDATED_ORDINAL = 1;
    private static final int APP_INSTALLED_ORDINAL = 0;
    private static final int APP_INSTALLED_WITHOUT_CUSTOMER = 7;
    private static final int ASYNC_OPERATION_ORDINAL = 5;
    public static final Companion Companion = new Companion(null);
    private static final int PUSH_CLICKED_ORDINAL = 3;
    private static final int PUSH_DELIVERED_ORDINAL = 2;
    private static final int SYNC_OPERATION_ORDINAL = 6;
    private static final int TRACK_VISIT_ORDINAL = 4;
    private final String endpoint;
    private final String operation;

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/EventType$Companion;", "", "()V", "APP_INFO_UPDATED_ORDINAL", "", "APP_INSTALLED_ORDINAL", "APP_INSTALLED_WITHOUT_CUSTOMER", "ASYNC_OPERATION_ORDINAL", "PUSH_CLICKED_ORDINAL", "PUSH_DELIVERED_ORDINAL", "SYNC_OPERATION_ORDINAL", "TRACK_VISIT_ORDINAL", "typeToken", "Lcom/google/gson/reflect/TypeToken;", "Lcloud/mindbox/mobile_sdk/models/EventType;", "ordinal", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TypeToken<? extends EventType> typeToken(int i) {
            switch (i) {
                case 0:
                    return new TypeToken<b>() { // from class: cloud.mindbox.mobile_sdk.models.EventType$Companion$typeToken$1
                    };
                case 1:
                    return new TypeToken<a>() { // from class: cloud.mindbox.mobile_sdk.models.EventType$Companion$typeToken$3
                    };
                case 2:
                    return new TypeToken<f>() { // from class: cloud.mindbox.mobile_sdk.models.EventType$Companion$typeToken$4
                    };
                case 3:
                    return new TypeToken<e>() { // from class: cloud.mindbox.mobile_sdk.models.EventType$Companion$typeToken$5
                    };
                case 4:
                    return new TypeToken<h>() { // from class: cloud.mindbox.mobile_sdk.models.EventType$Companion$typeToken$6
                    };
                case 5:
                    return new TypeToken<d>() { // from class: cloud.mindbox.mobile_sdk.models.EventType$Companion$typeToken$7
                    };
                case 6:
                    return new TypeToken<g>() { // from class: cloud.mindbox.mobile_sdk.models.EventType$Companion$typeToken$8
                    };
                case 7:
                    return new TypeToken<c>() { // from class: cloud.mindbox.mobile_sdk.models.EventType$Companion$typeToken$2
                    };
                default:
                    throw new IllegalArgumentException("Unknown TypeToken for " + i + " EventType ordinal");
            }
        }
    }

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/EventType$a;", "Lcloud/mindbox/mobile_sdk/models/EventType;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends EventType {
        public static final a INSTANCE = new a();

        private a() {
            super("MobilePush.ApplicationInfoUpdated", "/v3/operations/async", null);
        }
    }

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/EventType$b;", "Lcloud/mindbox/mobile_sdk/models/EventType;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b extends EventType {
        public static final b INSTANCE = new b();

        private b() {
            super("MobilePush.ApplicationInstalled", "/v3/operations/async", null);
        }
    }

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/EventType$c;", "Lcloud/mindbox/mobile_sdk/models/EventType;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c extends EventType {
        public static final c INSTANCE = new c();

        private c() {
            super("MobilePush.ApplicationInstalledWithoutCustomer", "/v3/operations/async", null);
        }
    }

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/EventType$d;", "Lcloud/mindbox/mobile_sdk/models/EventType;", "", "operation", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class d extends EventType {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(str, "/v3/operations/async", null);
            z65.h(str, "operation");
        }
    }

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/EventType$e;", "Lcloud/mindbox/mobile_sdk/models/EventType;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class e extends EventType {
        public static final e INSTANCE = new e();

        private e() {
            super("MobilePush.TrackClick", "/v3/operations/async", null);
        }
    }

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/EventType$f;", "Lcloud/mindbox/mobile_sdk/models/EventType;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class f extends EventType {
        public static final f INSTANCE = new f();

        private f() {
            super("", "/mobile-push/delivered", null);
        }
    }

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/EventType$g;", "Lcloud/mindbox/mobile_sdk/models/EventType;", "", "operation", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class g extends EventType {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(str, "/v3/operations/sync", null);
            z65.h(str, "operation");
        }
    }

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/EventType$h;", "Lcloud/mindbox/mobile_sdk/models/EventType;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class h extends EventType {
        public static final h INSTANCE = new h();

        private h() {
            super("TrackVisit", "/v1.1/customer/mobile-track-visit", null);
        }
    }

    public /* synthetic */ EventType(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getOperation() {
        return this.operation;
    }

    public final int ordinal() {
        if (this instanceof b) {
            return 0;
        }
        if (this instanceof c) {
            return 7;
        }
        if (this instanceof a) {
            return 1;
        }
        if (this instanceof f) {
            return 2;
        }
        if (this instanceof e) {
            return 3;
        }
        if (this instanceof h) {
            return 4;
        }
        if (this instanceof d) {
            return 5;
        }
        if (this instanceof g) {
            return 6;
        }
        throw new NoWhenBranchMatchedException();
    }

    private EventType(String str, String str2) {
        this.operation = str;
        this.endpoint = str2;
    }
}
