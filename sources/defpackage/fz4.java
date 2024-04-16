package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: InAppStoryEvents.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0004\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lfz4;", "", "Loz3;", "Lfz4$a;", "a", "()Loz3;", "callToActionClicks", "Lfz4$b;", "b", "urlClicks", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fz4  reason: default package */
/* loaded from: classes2.dex */
public interface fz4 {

    /* compiled from: InAppStoryEvents.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\t\u0010\u0010¨\u0006\u0015"}, d2 = {"Lfz4$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "storyId", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "storyName", "actionUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fz4$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final int a;
        private final String b;
        private final String c;

        public a(int i, String str, String str2) {
            z65.h(str, "storyName");
            z65.h(str2, "actionUrl");
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public final String a() {
            return this.c;
        }

        public final int b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            int i = this.a;
            String str = this.b;
            String str2 = this.c;
            return "CallToActionClick(storyId=" + i + ", storyName=" + str + ", actionUrl=" + str2 + ")";
        }
    }

    /* compiled from: InAppStoryEvents.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lfz4$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "scheme", "b", RemoteMessageConst.Notification.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fz4$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final String a;
        private final String b;

        public b(String str, String str2) {
            z65.h(str, "scheme");
            z65.h(str2, RemoteMessageConst.Notification.URL);
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            return "UrlClick(scheme=" + str + ", url=" + str2 + ")";
        }
    }

    oz3<a> a();

    oz3<b> b();
}
