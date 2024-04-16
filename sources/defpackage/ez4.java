package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: DefaultInAppStoriesErrorCallback.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lez4;", "", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "Lez4$a;", "Lez4$b;", "Lez4$c;", "Lez4$d;", "Lez4$e;", "Lez4$f;", "Lez4$g;", "Lez4$h;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ez4  reason: default package */
/* loaded from: classes2.dex */
public interface ez4 {

    /* compiled from: DefaultInAppStoriesErrorCallback.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lez4$a;", "Lez4;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ez4$a */
    /* loaded from: classes2.dex */
    public static final class a implements ez4 {
        public static final a a = new a();

        private a() {
        }
    }

    /* compiled from: DefaultInAppStoriesErrorCallback.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lez4$b;", "Lez4;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ez4$b */
    /* loaded from: classes2.dex */
    public static final class b implements ez4 {
        public static final b a = new b();

        private b() {
        }
    }

    /* compiled from: DefaultInAppStoriesErrorCallback.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lez4$c;", "Lez4;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getFeed", "()Ljava/lang/String;", "feed", "<init>", "(Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ez4$c */
    /* loaded from: classes2.dex */
    public static final class c implements ez4 {
        private final String a;

        public c(String str) {
            z65.h(str, "feed");
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && z65.c(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "ListError(feed=" + str + ")";
        }
    }

    /* compiled from: DefaultInAppStoriesErrorCallback.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lez4$d;", "Lez4;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ez4$d */
    /* loaded from: classes2.dex */
    public static final class d implements ez4 {
        public static final d a = new d();

        private d() {
        }
    }

    /* compiled from: DefaultInAppStoriesErrorCallback.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lez4$e;", "Lez4;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getFeed", "()Ljava/lang/String;", "feed", "<init>", "(Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ez4$e */
    /* loaded from: classes2.dex */
    public static final class e implements ez4 {
        private final String a;

        public e(String str) {
            z65.h(str, "feed");
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && z65.c(this.a, ((e) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "OnboardingError(feed=" + str + ")";
        }
    }

    /* compiled from: DefaultInAppStoriesErrorCallback.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lez4$f;", "Lez4;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ez4$f */
    /* loaded from: classes2.dex */
    public static final class f implements ez4 {
        public static final f a = new f();

        private f() {
        }
    }

    /* compiled from: DefaultInAppStoriesErrorCallback.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lez4$g;", "Lez4;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ez4$g */
    /* loaded from: classes2.dex */
    public static final class g implements ez4 {
        public static final g a = new g();

        private g() {
        }
    }

    /* compiled from: DefaultInAppStoriesErrorCallback.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lez4$h;", "Lez4;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ez4$h */
    /* loaded from: classes2.dex */
    public static final class h implements ez4 {
        public static final h a = new h();

        private h() {
        }
    }
}
