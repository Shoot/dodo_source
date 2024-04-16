package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InfoStoryService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lh15;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "reason", "<init>", "(Ljava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lh15$a;", "Lh15$b;", "Lh15$c;", "Lh15$d;", "Lh15$e;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h15  reason: default package */
/* loaded from: classes4.dex */
public abstract class h15 {
    private final String a;

    /* compiled from: InfoStoryService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh15$a;", "Lh15;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h15$a */
    /* loaded from: classes4.dex */
    public static final class a extends h15 {
        public static final a b = new a();

        private a() {
            super("Info story feature is not available on the client. Enable feature toggle InfoStoriesAndroid and try again!", null);
        }
    }

    /* compiled from: InfoStoryService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh15$b;", "Lh15;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h15$b */
    /* loaded from: classes4.dex */
    public static final class b extends h15 {
        public static final b b = new b();

        private b() {
            super("InAppStoryManager not init! Initialize manager before showing info story!", null);
        }
    }

    /* compiled from: InfoStoryService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh15$c;", "Lh15;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h15$c */
    /* loaded from: classes4.dex */
    public static final class c extends h15 {
        public static final c b = new c();

        private c() {
            super("Empty info story id!", null);
        }
    }

    /* compiled from: InfoStoryService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh15$d;", "Lh15;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h15$d */
    /* loaded from: classes4.dex */
    public static final class d extends h15 {
        public static final d b = new d();

        private d() {
            super("You have already shown this info story!", null);
        }
    }

    /* compiled from: InfoStoryService.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lh15$e;", "Lh15;", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "<init>", "(Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h15$e */
    /* loaded from: classes4.dex */
    public static final class e extends h15 {
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(str, null);
            z65.h(str, "id");
            this.b = str;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && z65.c(this.b, ((e) obj).b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String str = this.b;
            return "Success(id=" + str + ")";
        }
    }

    public /* synthetic */ h15(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private h15(String str) {
        this.a = str;
    }
}
