package cloud.mindbox.mobile_sdk;

import android.content.Context;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MindboxConfiguration.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001%BY\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b \u0010!B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b \u0010$Js\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\r\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006&"}, d2 = {"Lcloud/mindbox/mobile_sdk/MindboxConfiguration;", "", "", "previousInstallationId", "previousDeviceUUID", "endpointId", "domain", "packageName", "versionName", "versionCode", "", "subscribeCustomerIfCreated", "shouldCreateCustomer", "uuidDebugEnabled", "copy$sdk_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcloud/mindbox/mobile_sdk/MindboxConfiguration;", "copy", "toString", "Ljava/lang/String;", "getPreviousInstallationId$sdk_release", "()Ljava/lang/String;", "getPreviousDeviceUUID$sdk_release", "getEndpointId$sdk_release", "getDomain$sdk_release", "getPackageName$sdk_release", "getVersionName$sdk_release", "getVersionCode$sdk_release", "Z", "getSubscribeCustomerIfCreated$sdk_release", "()Z", "getShouldCreateCustomer$sdk_release", "getUuidDebugEnabled$sdk_release", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "Lcloud/mindbox/mobile_sdk/MindboxConfiguration$a;", "builder", "(Lcloud/mindbox/mobile_sdk/MindboxConfiguration$a;)V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MindboxConfiguration {
    private final String domain;
    private final String endpointId;
    private final String packageName;
    private final String previousDeviceUUID;
    private final String previousInstallationId;
    private final boolean shouldCreateCustomer;
    private final boolean subscribeCustomerIfCreated;
    private final boolean uuidDebugEnabled;
    private final String versionCode;
    private final String versionName;

    /* compiled from: MindboxConfiguration.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\u0018\u0000 %2\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0017R\"\u0010!\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010#\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\"\u0010\u0017R\"\u0010'\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000f\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0017R\"\u0010*\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0017R\"\u0010-\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001c\u001a\u0004\b$\u0010\u001e\"\u0004\b,\u0010 R\"\u0010/\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b.\u0010 ¨\u00062"}, d2 = {"Lcloud/mindbox/mobile_sdk/MindboxConfiguration$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "", "previousInstallationId", Image.TYPE_MEDIUM, "", "subscribe", "n", "Lcloud/mindbox/mobile_sdk/MindboxConfiguration;", "a", "Landroid/content/Context;", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "domain", DateTokenConverter.CONVERTER_KEY, "endpointId", "g", "setPreviousInstallationId$sdk_release", "(Ljava/lang/String;)V", e.a, "f", "setPreviousDeviceUUID$sdk_release", "previousDeviceUUID", "Z", "i", "()Z", "setSubscribeCustomerIfCreated$sdk_release", "(Z)V", "subscribeCustomerIfCreated", "setPackageName$sdk_release", "packageName", Image.TYPE_HIGH, "l", "setVersionName$sdk_release", "versionName", "k", "setVersionCode$sdk_release", "versionCode", "j", "setShouldCreateCustomer$sdk_release", "shouldCreateCustomer", "setUuidDebugEnabled$sdk_release", "uuidDebugEnabled", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        public static final C0089a l = new C0089a(null);
        private final Context a;
        private final String b;
        private final String c;
        private String d;
        private String e;
        private boolean f;
        private String g;
        private String h;
        private String i;
        private boolean j;
        private boolean k;

        /* compiled from: MindboxConfiguration.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcloud/mindbox/mobile_sdk/MindboxConfiguration$a$a;", "", "", "PLACEHOLDER_APP_PACKAGE_NAME", "Ljava/lang/String;", "PLACEHOLDER_APP_VERSION_CODE", "PLACEHOLDER_APP_VERSION_NAME", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: cloud.mindbox.mobile_sdk.MindboxConfiguration$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0089a {
            private C0089a() {
            }

            public /* synthetic */ C0089a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(Context context, String str, String str2) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(str, "domain");
            z65.h(str2, "endpointId");
            this.a = context;
            this.b = str;
            this.c = str2;
            this.d = "";
            this.e = "";
            this.g = "Unknown package name";
            this.h = "Unknown version";
            this.i = CallerData.NA;
            this.j = true;
            this.k = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
            if (r1 == null) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void b(android.content.Context r4) {
            /*
                r3 = this;
                android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: java.lang.Exception -> L66
                java.lang.String r1 = r4.getPackageName()     // Catch: java.lang.Exception -> L66
                r2 = 0
                android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L66
                java.lang.String r1 = r0.packageName     // Catch: java.lang.Exception -> L66
                java.lang.String r2 = "packageInfo.packageName"
                defpackage.z65.g(r1, r2)     // Catch: java.lang.Exception -> L66
                java.lang.CharSequence r1 = defpackage.c0b.R0(r1)     // Catch: java.lang.Exception -> L66
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L66
                r3.g = r1     // Catch: java.lang.Exception -> L66
                java.lang.String r1 = r0.versionName     // Catch: java.lang.Exception -> L66
                if (r1 == 0) goto L2c
                java.lang.CharSequence r1 = defpackage.c0b.R0(r1)     // Catch: java.lang.Exception -> L66
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L66
                if (r1 != 0) goto L2e
            L2c:
                java.lang.String r1 = "Unknown package name"
            L2e:
                r3.h = r1     // Catch: java.lang.Exception -> L66
                int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L66
                r2 = 28
                if (r1 < r2) goto L47
                long r0 = defpackage.nj6.a(r0)     // Catch: java.lang.Exception -> L66
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L66
                java.lang.CharSequence r0 = defpackage.c0b.R0(r0)     // Catch: java.lang.Exception -> L66
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L66
                goto L57
            L47:
                long r0 = defpackage.po7.a(r0)     // Catch: java.lang.Exception -> L66
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L66
                java.lang.CharSequence r0 = defpackage.c0b.R0(r0)     // Catch: java.lang.Exception -> L66
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L66
            L57:
                r3.i = r0     // Catch: java.lang.Exception -> L66
                zha r0 = defpackage.zha.a     // Catch: java.lang.Exception -> L66
                r0.k(r4)     // Catch: java.lang.Exception -> L66
                nk6 r4 = defpackage.nk6.a     // Catch: java.lang.Exception -> L66
                java.lang.String r0 = r3.g     // Catch: java.lang.Exception -> L66
                r4.s(r0)     // Catch: java.lang.Exception -> L66
                goto L6d
            L66:
                fk6 r4 = defpackage.fk6.a
                java.lang.String r0 = "Getting app info failed. Identified as an unknown application"
                r4.e(r3, r0)
            L6d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.MindboxConfiguration.a.b(android.content.Context):void");
        }

        public final MindboxConfiguration a() {
            b(this.a);
            return new MindboxConfiguration(this);
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.g;
        }

        public final String f() {
            return this.e;
        }

        public final String g() {
            return this.d;
        }

        public final boolean h() {
            return this.j;
        }

        public final boolean i() {
            return this.f;
        }

        public final boolean j() {
            return this.k;
        }

        public final String k() {
            return this.i;
        }

        public final String l() {
            return this.h;
        }

        public final a m(String str) {
            z65.h(str, "previousInstallationId");
            this.d = str;
            return this;
        }

        public final a n(boolean z) {
            this.f = z;
            return this;
        }
    }

    private MindboxConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3) {
        this.previousInstallationId = str;
        this.previousDeviceUUID = str2;
        this.endpointId = str3;
        this.domain = str4;
        this.packageName = str5;
        this.versionName = str6;
        this.versionCode = str7;
        this.subscribeCustomerIfCreated = z;
        this.shouldCreateCustomer = z2;
        this.uuidDebugEnabled = z3;
    }

    public static /* synthetic */ MindboxConfiguration copy$sdk_release$default(MindboxConfiguration mindboxConfiguration, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z4;
        boolean z5;
        boolean z6;
        if ((i & 1) != 0) {
            str8 = mindboxConfiguration.previousInstallationId;
        } else {
            str8 = str;
        }
        if ((i & 2) != 0) {
            str9 = mindboxConfiguration.previousDeviceUUID;
        } else {
            str9 = str2;
        }
        if ((i & 4) != 0) {
            str10 = mindboxConfiguration.endpointId;
        } else {
            str10 = str3;
        }
        if ((i & 8) != 0) {
            str11 = mindboxConfiguration.domain;
        } else {
            str11 = str4;
        }
        if ((i & 16) != 0) {
            str12 = mindboxConfiguration.packageName;
        } else {
            str12 = str5;
        }
        if ((i & 32) != 0) {
            str13 = mindboxConfiguration.versionName;
        } else {
            str13 = str6;
        }
        if ((i & 64) != 0) {
            str14 = mindboxConfiguration.versionCode;
        } else {
            str14 = str7;
        }
        if ((i & 128) != 0) {
            z4 = mindboxConfiguration.subscribeCustomerIfCreated;
        } else {
            z4 = z;
        }
        if ((i & 256) != 0) {
            z5 = mindboxConfiguration.shouldCreateCustomer;
        } else {
            z5 = z2;
        }
        if ((i & 512) != 0) {
            z6 = mindboxConfiguration.uuidDebugEnabled;
        } else {
            z6 = z3;
        }
        return mindboxConfiguration.copy$sdk_release(str8, str9, str10, str11, str12, str13, str14, z4, z5, z6);
    }

    public final MindboxConfiguration copy$sdk_release(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3) {
        z65.h(str, "previousInstallationId");
        z65.h(str2, "previousDeviceUUID");
        z65.h(str3, "endpointId");
        z65.h(str4, "domain");
        z65.h(str5, "packageName");
        z65.h(str6, "versionName");
        z65.h(str7, "versionCode");
        return new MindboxConfiguration(str, str2, str3, str4, str5, str6, str7, z, z2, z3);
    }

    public final String getDomain$sdk_release() {
        return this.domain;
    }

    public final String getEndpointId$sdk_release() {
        return this.endpointId;
    }

    public final String getPackageName$sdk_release() {
        return this.packageName;
    }

    public final String getPreviousDeviceUUID$sdk_release() {
        return this.previousDeviceUUID;
    }

    public final String getPreviousInstallationId$sdk_release() {
        return this.previousInstallationId;
    }

    public final boolean getShouldCreateCustomer$sdk_release() {
        return this.shouldCreateCustomer;
    }

    public final boolean getSubscribeCustomerIfCreated$sdk_release() {
        return this.subscribeCustomerIfCreated;
    }

    public final boolean getUuidDebugEnabled$sdk_release() {
        return this.uuidDebugEnabled;
    }

    public final String getVersionCode$sdk_release() {
        return this.versionCode;
    }

    public final String getVersionName$sdk_release() {
        return this.versionName;
    }

    public String toString() {
        return "MindboxConfiguration(previousInstallationId = " + this.previousInstallationId + ", previousDeviceUUID = " + this.previousDeviceUUID + ", endpointId = " + this.endpointId + ", domain = " + this.domain + ", packageName = " + this.packageName + ", versionName = " + this.versionName + ", versionCode = " + this.versionCode + ", subscribeCustomerIfCreated = " + this.subscribeCustomerIfCreated + ", shouldCreateCustomer = " + this.shouldCreateCustomer + ", uuidDebugEnabled = " + this.uuidDebugEnabled + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MindboxConfiguration(a aVar) {
        this(aVar.g(), aVar.f(), aVar.d(), aVar.c(), aVar.e(), aVar.l(), aVar.k(), aVar.i(), aVar.h(), aVar.j());
        z65.h(aVar, "builder");
    }
}
