package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: SdkValidation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lxx9;", "", "", "domain", "", DateTokenConverter.CONVERTER_KEY, c.a, "endpointId", "previousDeviceUUID", "previousInstallationId", "", "Lxx9$a;", e.a, "<init>", "()V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xx9  reason: default package */
/* loaded from: classes.dex */
public final class xx9 {
    public static final xx9 a = new xx9();

    /* compiled from: SdkValidation.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lxx9$a;", "", "", "toString", "", "a", "Z", "i", "()Z", "critical", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: xx9$a */
    /* loaded from: classes.dex */
    public enum a {
        EMPTY_DOMAIN(true, "Domain must not be empty"),
        INVALID_FORMAT_DOMAIN(true, "The domain must not start with https:// and must not end with /"),
        INVALID_DOMAIN(true, "The domain is not valid"),
        EMPTY_ENDPOINT(true, "Endpoint must not be empty"),
        INVALID_DEVICE_ID(false, "Invalid previous device UUID format"),
        INVALID_INSTALLATION_ID(false, "Invalid UUID format of previous installationId");
        
        private final boolean a;
        private final String b;

        a(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        public final boolean i() {
            return this.a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return name() + "(critical=" + this.a + ", message=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SdkValidation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lxx9$a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: xx9$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<List<? extends a>> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3, String str4) {
            super(0);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends a> invoke() {
            boolean y;
            boolean y2;
            ArrayList arrayList = new ArrayList();
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            String str4 = this.d;
            y = l0b.y(str);
            if (y) {
                arrayList.add(a.EMPTY_DOMAIN);
            } else {
                xx9 xx9Var = xx9.a;
                if (!xx9Var.d(str)) {
                    arrayList.add(a.INVALID_FORMAT_DOMAIN);
                } else if (!xx9Var.c(str)) {
                    arrayList.add(a.INVALID_DOMAIN);
                }
            }
            y2 = l0b.y(str2);
            if (y2) {
                arrayList.add(a.EMPTY_ENDPOINT);
            }
            if (str3.length() > 0 && !zn3.isUuid(str3)) {
                arrayList.add(a.INVALID_DEVICE_ID);
            }
            if (str4.length() > 0 && !zn3.isUuid(str4)) {
                arrayList.add(a.INVALID_INSTALLATION_ID);
            }
            return arrayList;
        }
    }

    private xx9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(String str) {
        return hs7.b.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(String str) {
        boolean J;
        boolean J2;
        boolean u;
        J = l0b.J(str, "http", false, 2, null);
        if (!J) {
            J2 = l0b.J(str, "/", false, 2, null);
            if (!J2) {
                u = l0b.u(str, "/", false, 2, null);
                if (u) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<a> e(String str, String str2, String str3, String str4) {
        List l;
        z65.h(str, "domain");
        z65.h(str2, "endpointId");
        z65.h(str3, "previousDeviceUUID");
        z65.h(str4, "previousInstallationId");
        yx5 yx5Var = yx5.a;
        l = kc1.l();
        return (List) yx5Var.b(l, new b(str, str2, str3, str4));
    }
}
