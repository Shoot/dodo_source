package defpackage;

import ch.qos.logback.core.CoreConstants;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lns7;", "", "<init>", "()V", "a", "Lns7$a;", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ns7  reason: default package */
/* loaded from: classes.dex */
public abstract class ns7 {

    /* compiled from: InAppConfigResponse.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB/\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J9\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001d"}, d2 = {"Lns7$a;", "Lns7;", "", "component1", "component2", "component3", "component4", MessageAttributes.TYPE, "imageUrl", "redirectUrl", "intentPayload", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getImageUrl", "getRedirectUrl", "getIntentPayload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ns7$a */
    /* loaded from: classes.dex */
    public static final class a extends ns7 {
        public static final C0457a Companion = new C0457a(null);
        public static final String SIMPLE_IMAGE_JSON_NAME = "simpleImage";
        @uca("imageUrl")
        private final String imageUrl;
        @uca("intentPayload")
        private final String intentPayload;
        @uca("redirectUrl")
        private final String redirectUrl;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;

        /* compiled from: InAppConfigResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lns7$a$a;", "", "", "SIMPLE_IMAGE_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: ns7$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0457a {
            private C0457a() {
            }

            public /* synthetic */ C0457a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(String str, String str2, String str3, String str4) {
            super(null);
            this.type = str;
            this.imageUrl = str2;
            this.redirectUrl = str3;
            this.intentPayload = str4;
        }

        public static /* synthetic */ a copy$default(a aVar, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.type;
            }
            if ((i & 2) != 0) {
                str2 = aVar.imageUrl;
            }
            if ((i & 4) != 0) {
                str3 = aVar.redirectUrl;
            }
            if ((i & 8) != 0) {
                str4 = aVar.intentPayload;
            }
            return aVar.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.imageUrl;
        }

        public final String component3() {
            return this.redirectUrl;
        }

        public final String component4() {
            return this.intentPayload;
        }

        public final a copy(String str, String str2, String str3, String str4) {
            return new a(str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.type, aVar.type) && z65.c(this.imageUrl, aVar.imageUrl) && z65.c(this.redirectUrl, aVar.redirectUrl) && z65.c(this.intentPayload, aVar.intentPayload)) {
                return true;
            }
            return false;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getIntentPayload() {
            return this.intentPayload;
        }

        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            String str = this.type;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.imageUrl;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.redirectUrl;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.intentPayload;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i4 + i;
        }

        public String toString() {
            return "SimpleImage(type=" + this.type + ", imageUrl=" + this.imageUrl + ", redirectUrl=" + this.redirectUrl + ", intentPayload=" + this.intentPayload + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private ns7() {
    }

    public /* synthetic */ ns7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
