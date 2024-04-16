package com.hcaptcha.sdk;

import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.Locale;
import lombok.Generated;
import lombok.NonNull;
/* loaded from: classes.dex */
public class HCaptchaConfig implements Serializable {
    @za5
    @Deprecated
    private String apiEndpoint;
    private String assethost;
    private String customTheme;
    private Boolean diagnosticLog;
    private String endpoint;
    private Boolean hideDialog;
    private String host;
    private String imghost;
    private String jsSrc;
    private Boolean loading;
    private String locale;
    private ij4 orientation;
    private String reportapi;
    @Deprecated
    private Boolean resetOnTimeout;
    @za5
    private as4 retryPredicate;
    private String rqdata;
    private Boolean sentry;
    @NonNull
    private String siteKey;
    private jj4 size;
    private kj4 theme;
    private long tokenExpiration;

    /* loaded from: classes.dex */
    public static class a {
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean A;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String B;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean C;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Boolean D;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean E;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private as4 F;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean G;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private long H;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean I;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Boolean J;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String a;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean b;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Boolean c;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean d;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Boolean e;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean f;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Boolean g;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String h;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean i;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String j;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean k;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String l;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String m;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String n;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String o;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String p;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean q;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String r;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean s;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private jj4 t;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean u;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private ij4 v;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean w;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private kj4 x;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean y;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String z;

        @Deprecated
        public a a(String str) {
            j(str);
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a b(String str) {
            this.o = str;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HCaptchaConfig c() {
            Boolean bool = this.c;
            if (!this.b) {
                bool = HCaptchaConfig.access$000();
            }
            Boolean bool2 = bool;
            Boolean bool3 = this.e;
            if (!this.d) {
                bool3 = HCaptchaConfig.access$100();
            }
            Boolean bool4 = bool3;
            Boolean bool5 = this.g;
            if (!this.f) {
                bool5 = HCaptchaConfig.access$200();
            }
            Boolean bool6 = bool5;
            String str = this.j;
            if (!this.i) {
                str = HCaptchaConfig.access$300();
            }
            String str2 = str;
            String str3 = this.l;
            if (!this.k) {
                str3 = HCaptchaConfig.access$400();
            }
            String str4 = str3;
            String str5 = this.r;
            if (!this.q) {
                str5 = HCaptchaConfig.access$500();
            }
            String str6 = str5;
            jj4 jj4Var = this.t;
            if (!this.s) {
                jj4Var = HCaptchaConfig.access$600();
            }
            jj4 jj4Var2 = jj4Var;
            ij4 ij4Var = this.v;
            if (!this.u) {
                ij4Var = HCaptchaConfig.access$700();
            }
            ij4 ij4Var2 = ij4Var;
            kj4 kj4Var = this.x;
            if (!this.w) {
                kj4Var = HCaptchaConfig.access$800();
            }
            kj4 kj4Var2 = kj4Var;
            String str7 = this.z;
            if (!this.y) {
                str7 = HCaptchaConfig.access$900();
            }
            String str8 = str7;
            String str9 = this.B;
            if (!this.A) {
                str9 = HCaptchaConfig.access$1000();
            }
            String str10 = str9;
            Boolean bool7 = this.D;
            if (!this.C) {
                bool7 = HCaptchaConfig.access$1100();
            }
            Boolean bool8 = bool7;
            as4 as4Var = this.F;
            if (!this.E) {
                as4Var = HCaptchaConfig.access$1200();
            }
            as4 as4Var2 = as4Var;
            long j = this.H;
            if (!this.G) {
                j = HCaptchaConfig.access$1300();
            }
            long j2 = j;
            Boolean bool9 = this.J;
            if (!this.I) {
                bool9 = HCaptchaConfig.access$1400();
            }
            return new HCaptchaConfig(this.a, bool2, bool4, bool6, this.h, str2, str4, this.m, this.n, this.o, this.p, str6, jj4Var2, ij4Var2, kj4Var2, str8, str10, bool8, as4Var2, j2, bool9);
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a d(String str) {
            this.B = str;
            this.A = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a e(Boolean bool) {
            this.J = bool;
            this.I = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a f(String str) {
            this.m = str;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a g(Boolean bool) {
            this.g = bool;
            this.f = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a h(String str) {
            this.z = str;
            this.y = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a i(String str) {
            this.p = str;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a j(String str) {
            this.l = str;
            this.k = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a k(Boolean bool) {
            this.e = bool;
            this.d = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a l(String str) {
            this.r = str;
            this.q = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a m(ij4 ij4Var) {
            this.v = ij4Var;
            this.u = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a n(String str) {
            this.n = str;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        @Deprecated
        public a o(Boolean bool) {
            this.D = bool;
            this.C = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        @za5
        public a p(as4 as4Var) {
            this.F = as4Var;
            this.E = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a q(String str) {
            this.h = str;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a r(Boolean bool) {
            this.c = bool;
            this.b = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a s(@NonNull String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("siteKey is marked non-null but is null");
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a t(jj4 jj4Var) {
            this.t = jj4Var;
            this.s = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "HCaptchaConfig.HCaptchaConfigBuilder(siteKey=" + this.a + ", sentry$value=" + this.c + ", loading$value=" + this.e + ", hideDialog$value=" + this.g + ", rqdata=" + this.h + ", apiEndpoint$value=" + this.j + ", jsSrc$value=" + this.l + ", endpoint=" + this.m + ", reportapi=" + this.n + ", assethost=" + this.o + ", imghost=" + this.p + ", locale$value=" + this.r + ", size$value=" + this.t + ", orientation$value=" + this.v + ", theme$value=" + this.x + ", host$value=" + this.z + ", customTheme$value=" + this.B + ", resetOnTimeout$value=" + this.D + ", retryPredicate$value=" + this.F + ", tokenExpiration$value=" + this.H + ", diagnosticLog$value=" + this.J + ")";
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a u(kj4 kj4Var) {
            this.x = kj4Var;
            this.w = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a v(long j) {
            this.H = j;
            this.G = true;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private static String $default$apiEndpoint() {
        return "https://js.hcaptcha.com/1/api.js";
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private static String $default$customTheme() {
        return null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private static String $default$host() {
        return null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private static String $default$jsSrc() {
        return "https://js.hcaptcha.com/1/api.js";
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private static String $default$locale() {
        return Locale.getDefault().getLanguage();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private static as4 $default$retryPredicate() {
        return new ej4();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private static long $default$tokenExpiration() {
        return 120L;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaConfig(@NonNull String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, jj4 jj4Var, ij4 ij4Var, kj4 kj4Var, String str10, String str11, Boolean bool4, as4 as4Var, long j, Boolean bool5) {
        if (str == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        this.siteKey = str;
        this.sentry = bool;
        this.loading = bool2;
        this.hideDialog = bool3;
        this.rqdata = str2;
        this.apiEndpoint = str3;
        this.jsSrc = str4;
        this.endpoint = str5;
        this.reportapi = str6;
        this.assethost = str7;
        this.imghost = str8;
        this.locale = str9;
        this.size = jj4Var;
        this.orientation = ij4Var;
        this.theme = kj4Var;
        this.host = str10;
        this.customTheme = str11;
        this.resetOnTimeout = bool4;
        this.retryPredicate = as4Var;
        this.tokenExpiration = j;
        this.diagnosticLog = bool5;
    }

    public static /* synthetic */ Boolean access$000() {
        return Boolean.TRUE;
    }

    public static /* synthetic */ Boolean access$100() {
        return Boolean.TRUE;
    }

    public static /* synthetic */ String access$1000() {
        return $default$customTheme();
    }

    public static /* synthetic */ Boolean access$1100() {
        return Boolean.FALSE;
    }

    public static /* synthetic */ as4 access$1200() {
        return $default$retryPredicate();
    }

    public static /* synthetic */ long access$1300() {
        return $default$tokenExpiration();
    }

    public static /* synthetic */ Boolean access$1400() {
        return Boolean.FALSE;
    }

    public static /* synthetic */ Boolean access$200() {
        return Boolean.FALSE;
    }

    public static /* synthetic */ String access$300() {
        return $default$apiEndpoint();
    }

    public static /* synthetic */ String access$400() {
        return $default$jsSrc();
    }

    public static /* synthetic */ String access$500() {
        return $default$locale();
    }

    public static /* synthetic */ jj4 access$600() {
        return jj4.INVISIBLE;
    }

    public static /* synthetic */ ij4 access$700() {
        return ij4.PORTRAIT;
    }

    public static /* synthetic */ kj4 access$800() {
        return kj4.LIGHT;
    }

    public static /* synthetic */ String access$900() {
        return $default$host();
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static a builder() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$$default$retryPredicate$41a513e9$1(HCaptchaConfig hCaptchaConfig, HCaptchaException hCaptchaException) {
        if (!Boolean.TRUE.equals(hCaptchaConfig.resetOnTimeout) || hCaptchaException.b() != gj4.SESSION_TIMEOUT) {
            return false;
        }
        return true;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(@Nullable Object obj) {
        return obj instanceof HCaptchaConfig;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HCaptchaConfig)) {
            return false;
        }
        HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) obj;
        if (!hCaptchaConfig.canEqual(this) || getTokenExpiration() != hCaptchaConfig.getTokenExpiration()) {
            return false;
        }
        Boolean sentry = getSentry();
        Boolean sentry2 = hCaptchaConfig.getSentry();
        if (sentry != null ? !sentry.equals(sentry2) : sentry2 != null) {
            return false;
        }
        Boolean loading = getLoading();
        Boolean loading2 = hCaptchaConfig.getLoading();
        if (loading != null ? !loading.equals(loading2) : loading2 != null) {
            return false;
        }
        Boolean hideDialog = getHideDialog();
        Boolean hideDialog2 = hCaptchaConfig.getHideDialog();
        if (hideDialog != null ? !hideDialog.equals(hideDialog2) : hideDialog2 != null) {
            return false;
        }
        Boolean resetOnTimeout = getResetOnTimeout();
        Boolean resetOnTimeout2 = hCaptchaConfig.getResetOnTimeout();
        if (resetOnTimeout != null ? !resetOnTimeout.equals(resetOnTimeout2) : resetOnTimeout2 != null) {
            return false;
        }
        Boolean diagnosticLog = getDiagnosticLog();
        Boolean diagnosticLog2 = hCaptchaConfig.getDiagnosticLog();
        if (diagnosticLog != null ? !diagnosticLog.equals(diagnosticLog2) : diagnosticLog2 != null) {
            return false;
        }
        String siteKey = getSiteKey();
        String siteKey2 = hCaptchaConfig.getSiteKey();
        if (siteKey != null ? !siteKey.equals(siteKey2) : siteKey2 != null) {
            return false;
        }
        String rqdata = getRqdata();
        String rqdata2 = hCaptchaConfig.getRqdata();
        if (rqdata != null ? !rqdata.equals(rqdata2) : rqdata2 != null) {
            return false;
        }
        String apiEndpoint = getApiEndpoint();
        String apiEndpoint2 = hCaptchaConfig.getApiEndpoint();
        if (apiEndpoint != null ? !apiEndpoint.equals(apiEndpoint2) : apiEndpoint2 != null) {
            return false;
        }
        String jsSrc = getJsSrc();
        String jsSrc2 = hCaptchaConfig.getJsSrc();
        if (jsSrc != null ? !jsSrc.equals(jsSrc2) : jsSrc2 != null) {
            return false;
        }
        String endpoint = getEndpoint();
        String endpoint2 = hCaptchaConfig.getEndpoint();
        if (endpoint != null ? !endpoint.equals(endpoint2) : endpoint2 != null) {
            return false;
        }
        String reportapi = getReportapi();
        String reportapi2 = hCaptchaConfig.getReportapi();
        if (reportapi != null ? !reportapi.equals(reportapi2) : reportapi2 != null) {
            return false;
        }
        String assethost = getAssethost();
        String assethost2 = hCaptchaConfig.getAssethost();
        if (assethost != null ? !assethost.equals(assethost2) : assethost2 != null) {
            return false;
        }
        String imghost = getImghost();
        String imghost2 = hCaptchaConfig.getImghost();
        if (imghost != null ? !imghost.equals(imghost2) : imghost2 != null) {
            return false;
        }
        String locale = getLocale();
        String locale2 = hCaptchaConfig.getLocale();
        if (locale != null ? !locale.equals(locale2) : locale2 != null) {
            return false;
        }
        jj4 size = getSize();
        jj4 size2 = hCaptchaConfig.getSize();
        if (size != null ? !size.equals(size2) : size2 != null) {
            return false;
        }
        ij4 orientation = getOrientation();
        ij4 orientation2 = hCaptchaConfig.getOrientation();
        if (orientation != null ? !orientation.equals(orientation2) : orientation2 != null) {
            return false;
        }
        kj4 theme = getTheme();
        kj4 theme2 = hCaptchaConfig.getTheme();
        if (theme != null ? !theme.equals(theme2) : theme2 != null) {
            return false;
        }
        String host = getHost();
        String host2 = hCaptchaConfig.getHost();
        if (host != null ? !host.equals(host2) : host2 != null) {
            return false;
        }
        String customTheme = getCustomTheme();
        String customTheme2 = hCaptchaConfig.getCustomTheme();
        if (customTheme != null ? !customTheme.equals(customTheme2) : customTheme2 != null) {
            return false;
        }
        as4 retryPredicate = getRetryPredicate();
        as4 retryPredicate2 = hCaptchaConfig.getRetryPredicate();
        if (retryPredicate != null ? retryPredicate.equals(retryPredicate2) : retryPredicate2 == null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public String getApiEndpoint() {
        return this.jsSrc;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getAssethost() {
        return this.assethost;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCustomTheme() {
        return this.customTheme;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getDiagnosticLog() {
        return this.diagnosticLog;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getEndpoint() {
        return this.endpoint;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getHideDialog() {
        return this.hideDialog;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getHost() {
        return this.host;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getImghost() {
        return this.imghost;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getJsSrc() {
        return this.jsSrc;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getLoading() {
        return this.loading;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getLocale() {
        return this.locale;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ij4 getOrientation() {
        return this.orientation;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getReportapi() {
        return this.reportapi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    public Boolean getResetOnTimeout() {
        return this.resetOnTimeout;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public as4 getRetryPredicate() {
        return this.retryPredicate;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getRqdata() {
        return this.rqdata;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getSentry() {
        return this.sentry;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSiteKey() {
        return this.siteKey;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public jj4 getSize() {
        return this.size;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public kj4 getTheme() {
        return this.theme;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getTokenExpiration() {
        return this.tokenExpiration;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        long tokenExpiration = getTokenExpiration();
        Boolean sentry = getSentry();
        int i = (((int) (tokenExpiration ^ (tokenExpiration >>> 32))) + 59) * 59;
        int i2 = 43;
        if (sentry == null) {
            hashCode = 43;
        } else {
            hashCode = sentry.hashCode();
        }
        int i3 = i + hashCode;
        Boolean loading = getLoading();
        int i4 = i3 * 59;
        if (loading == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = loading.hashCode();
        }
        int i5 = i4 + hashCode2;
        Boolean hideDialog = getHideDialog();
        int i6 = i5 * 59;
        if (hideDialog == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = hideDialog.hashCode();
        }
        int i7 = i6 + hashCode3;
        Boolean resetOnTimeout = getResetOnTimeout();
        int i8 = i7 * 59;
        if (resetOnTimeout == null) {
            hashCode4 = 43;
        } else {
            hashCode4 = resetOnTimeout.hashCode();
        }
        int i9 = i8 + hashCode4;
        Boolean diagnosticLog = getDiagnosticLog();
        int i10 = i9 * 59;
        if (diagnosticLog == null) {
            hashCode5 = 43;
        } else {
            hashCode5 = diagnosticLog.hashCode();
        }
        int i11 = i10 + hashCode5;
        String siteKey = getSiteKey();
        int i12 = i11 * 59;
        if (siteKey == null) {
            hashCode6 = 43;
        } else {
            hashCode6 = siteKey.hashCode();
        }
        int i13 = i12 + hashCode6;
        String rqdata = getRqdata();
        int i14 = i13 * 59;
        if (rqdata == null) {
            hashCode7 = 43;
        } else {
            hashCode7 = rqdata.hashCode();
        }
        int i15 = i14 + hashCode7;
        String apiEndpoint = getApiEndpoint();
        int i16 = i15 * 59;
        if (apiEndpoint == null) {
            hashCode8 = 43;
        } else {
            hashCode8 = apiEndpoint.hashCode();
        }
        int i17 = i16 + hashCode8;
        String jsSrc = getJsSrc();
        int i18 = i17 * 59;
        if (jsSrc == null) {
            hashCode9 = 43;
        } else {
            hashCode9 = jsSrc.hashCode();
        }
        int i19 = i18 + hashCode9;
        String endpoint = getEndpoint();
        int i20 = i19 * 59;
        if (endpoint == null) {
            hashCode10 = 43;
        } else {
            hashCode10 = endpoint.hashCode();
        }
        int i21 = i20 + hashCode10;
        String reportapi = getReportapi();
        int i22 = i21 * 59;
        if (reportapi == null) {
            hashCode11 = 43;
        } else {
            hashCode11 = reportapi.hashCode();
        }
        int i23 = i22 + hashCode11;
        String assethost = getAssethost();
        int i24 = i23 * 59;
        if (assethost == null) {
            hashCode12 = 43;
        } else {
            hashCode12 = assethost.hashCode();
        }
        int i25 = i24 + hashCode12;
        String imghost = getImghost();
        int i26 = i25 * 59;
        if (imghost == null) {
            hashCode13 = 43;
        } else {
            hashCode13 = imghost.hashCode();
        }
        int i27 = i26 + hashCode13;
        String locale = getLocale();
        int i28 = i27 * 59;
        if (locale == null) {
            hashCode14 = 43;
        } else {
            hashCode14 = locale.hashCode();
        }
        int i29 = i28 + hashCode14;
        jj4 size = getSize();
        int i30 = i29 * 59;
        if (size == null) {
            hashCode15 = 43;
        } else {
            hashCode15 = size.hashCode();
        }
        int i31 = i30 + hashCode15;
        ij4 orientation = getOrientation();
        int i32 = i31 * 59;
        if (orientation == null) {
            hashCode16 = 43;
        } else {
            hashCode16 = orientation.hashCode();
        }
        int i33 = i32 + hashCode16;
        kj4 theme = getTheme();
        int i34 = i33 * 59;
        if (theme == null) {
            hashCode17 = 43;
        } else {
            hashCode17 = theme.hashCode();
        }
        int i35 = i34 + hashCode17;
        String host = getHost();
        int i36 = i35 * 59;
        if (host == null) {
            hashCode18 = 43;
        } else {
            hashCode18 = host.hashCode();
        }
        int i37 = i36 + hashCode18;
        String customTheme = getCustomTheme();
        int i38 = i37 * 59;
        if (customTheme == null) {
            hashCode19 = 43;
        } else {
            hashCode19 = customTheme.hashCode();
        }
        int i39 = i38 + hashCode19;
        as4 retryPredicate = getRetryPredicate();
        int i40 = i39 * 59;
        if (retryPredicate != null) {
            i2 = retryPredicate.hashCode();
        }
        return i40 + i2;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    @za5
    public void setApiEndpoint(String str) {
        this.apiEndpoint = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setAssethost(String str) {
        this.assethost = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCustomTheme(String str) {
        this.customTheme = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setDiagnosticLog(Boolean bool) {
        this.diagnosticLog = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setEndpoint(String str) {
        this.endpoint = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setHideDialog(Boolean bool) {
        this.hideDialog = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setHost(String str) {
        this.host = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setImghost(String str) {
        this.imghost = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setJsSrc(String str) {
        this.jsSrc = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setLoading(Boolean bool) {
        this.loading = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setLocale(String str) {
        this.locale = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setOrientation(ij4 ij4Var) {
        this.orientation = ij4Var;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setReportapi(String str) {
        this.reportapi = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    public void setResetOnTimeout(Boolean bool) {
        this.resetOnTimeout = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @za5
    public void setRetryPredicate(as4 as4Var) {
        this.retryPredicate = as4Var;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setRqdata(String str) {
        this.rqdata = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSentry(Boolean bool) {
        this.sentry = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSiteKey(@NonNull String str) {
        if (str != null) {
            this.siteKey = str;
            return;
        }
        throw new NullPointerException("siteKey is marked non-null but is null");
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSize(jj4 jj4Var) {
        this.size = jj4Var;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setTheme(kj4 kj4Var) {
        this.theme = kj4Var;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setTokenExpiration(long j) {
        this.tokenExpiration = j;
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public a toBuilder() {
        return new a().s(this.siteKey).r(this.sentry).k(this.loading).g(this.hideDialog).q(this.rqdata).a(this.apiEndpoint).j(this.jsSrc).f(this.endpoint).n(this.reportapi).b(this.assethost).i(this.imghost).l(this.locale).t(this.size).m(this.orientation).u(this.theme).h(this.host).d(this.customTheme).o(this.resetOnTimeout).p(this.retryPredicate).v(this.tokenExpiration).e(this.diagnosticLog);
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "HCaptchaConfig(siteKey=" + getSiteKey() + ", sentry=" + getSentry() + ", loading=" + getLoading() + ", hideDialog=" + getHideDialog() + ", rqdata=" + getRqdata() + ", apiEndpoint=" + getApiEndpoint() + ", jsSrc=" + getJsSrc() + ", endpoint=" + getEndpoint() + ", reportapi=" + getReportapi() + ", assethost=" + getAssethost() + ", imghost=" + getImghost() + ", locale=" + getLocale() + ", size=" + getSize() + ", orientation=" + getOrientation() + ", theme=" + getTheme() + ", host=" + getHost() + ", customTheme=" + getCustomTheme() + ", resetOnTimeout=" + getResetOnTimeout() + ", retryPredicate=" + getRetryPredicate() + ", tokenExpiration=" + getTokenExpiration() + ", diagnosticLog=" + getDiagnosticLog() + ")";
    }
}
