package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0004\u0003\u0007\u000b\u0011B#\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lgtb;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "b", "getDescription", "description", "", com.huawei.hms.opendevice.c.a, "Z", "isUpsaleEnabled", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", DateTokenConverter.CONVERTER_KEY, "Lgtb$b;", "Lgtb$c;", "Lgtb$d;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gtb  reason: default package */
/* loaded from: classes4.dex */
public abstract class gtb {
    public static final a d = new a(null);
    private final String a;
    private final String b;
    private final boolean c;

    /* compiled from: UpsaleState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lgtb$a;", "", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "", "state", "Lgtb;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gtb$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gtb a(String str, int i) {
            z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new c(str);
                    }
                    throw new IllegalArgumentException("Unknown upsale state!");
                }
                return new b(str);
            }
            return new d(str);
        }
    }

    /* compiled from: UpsaleState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgtb$b;", "Lgtb;", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "<init>", "(Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gtb$b */
    /* loaded from: classes4.dex */
    public static final class b extends gtb {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(str, "Применен", false, 4, null);
            z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        }
    }

    /* compiled from: UpsaleState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgtb$c;", "Lgtb;", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "<init>", "(Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gtb$c */
    /* loaded from: classes4.dex */
    public static final class c extends gtb {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(str, "Скрыт", false, 4, null);
            z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        }
    }

    /* compiled from: UpsaleState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgtb$d;", "Lgtb;", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "<init>", "(Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gtb$d */
    /* loaded from: classes4.dex */
    public static final class d extends gtb {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(str, "Не применен", true, null);
            z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        }
    }

    public /* synthetic */ gtb(String str, String str2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z);
    }

    public final String a() {
        return this.a;
    }

    private gtb(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public /* synthetic */ gtb(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, null);
    }
}
