package defpackage;

import ch.qos.logback.core.joran.action.Action;
import cloud.mindbox.mobile_sdk.models.EventType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Event.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Ltx4;", "", "", Action.NAME_ATTRIBUTE, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "a", "b", "Ltx4$a;", "Ltx4$b;", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: tx4  reason: default package */
/* loaded from: classes.dex */
public abstract class tx4 {
    private final String name;

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltx4$a;", "Ltx4;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tx4$a */
    /* loaded from: classes.dex */
    public static final class a extends tx4 {
        public static final a INSTANCE = new a();

        private a() {
            super("appStartup", null);
        }
    }

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Ltx4$b;", "Ltx4;", "Lcloud/mindbox/mobile_sdk/models/EventType;", "eventType", "Lcloud/mindbox/mobile_sdk/models/EventType;", "getEventType", "()Lcloud/mindbox/mobile_sdk/models/EventType;", "", "body", "Ljava/lang/String;", "getBody", "()Ljava/lang/String;", "<init>", "(Lcloud/mindbox/mobile_sdk/models/EventType;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tx4$b */
    /* loaded from: classes.dex */
    public static final class b extends tx4 {
        private final String body;
        private final EventType eventType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EventType eventType, String str) {
            super(eventType.getOperation(), null);
            z65.h(eventType, "eventType");
            this.eventType = eventType;
            this.body = str;
        }

        public final String getBody() {
            return this.body;
        }

        public final EventType getEventType() {
            return this.eventType;
        }

        public /* synthetic */ b(EventType eventType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(eventType, (i & 2) != 0 ? null : str);
        }
    }

    public /* synthetic */ tx4(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getName() {
        return this.name;
    }

    private tx4(String str) {
        this.name = str;
    }
}
