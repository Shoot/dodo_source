package retrofit2;

import defpackage.fq6;
import defpackage.g54;
import defpackage.gn4;
import defpackage.hi9;
import defpackage.sq4;
import java.io.IOException;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RequestBuilder {
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final sq4 baseUrl;
    private ji9 body;
    private qc6 contentType;
    private g54.a formBuilder;
    private final boolean hasBody;
    private final gn4.a headersBuilder;
    private final String method;
    private fq6.a multipartBuilder;
    private String relativeUrl;
    private final hi9.a requestBuilder = new hi9.a();
    private sq4.a urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* loaded from: classes3.dex */
    private static class ContentTypeOverridingRequestBody extends ji9 {
        private final qc6 contentType;
        private final ji9 delegate;

        ContentTypeOverridingRequestBody(ji9 ji9Var, qc6 qc6Var) {
            this.delegate = ji9Var;
            this.contentType = qc6Var;
        }

        @Override // defpackage.ji9
        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        @Override // defpackage.ji9
        public qc6 contentType() {
            return this.contentType;
        }

        @Override // defpackage.ji9
        public void writeTo(eh0 eh0Var) throws IOException {
            this.delegate.writeTo(eh0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestBuilder(String str, sq4 sq4Var, String str2, gn4 gn4Var, qc6 qc6Var, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = sq4Var;
        this.relativeUrl = str2;
        this.contentType = qc6Var;
        this.hasBody = z;
        if (gn4Var != null) {
            this.headersBuilder = gn4Var.p();
        } else {
            this.headersBuilder = new gn4.a();
        }
        if (z2) {
            this.formBuilder = new g54.a();
        } else if (z3) {
            fq6.a aVar = new fq6.a();
            this.multipartBuilder = aVar;
            aVar.d(fq6.k);
        }
    }

    private static String canonicalizeForPath(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                yg0 yg0Var = new yg0();
                yg0Var.k0(str, 0, i);
                canonicalizeForPath(yg0Var, str, i, length, z);
                return yg0Var.L();
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addFormField(String str, String str2, boolean z) {
        if (z) {
            this.formBuilder.b(str, str2);
        } else {
            this.formBuilder.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addHeader(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.contentType = qc6.c(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        }
        this.headersBuilder.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addHeaders(gn4 gn4Var) {
        this.headersBuilder.b(gn4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addPart(gn4 gn4Var, ji9 ji9Var) {
        this.multipartBuilder.a(gn4Var, ji9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addPathParam(String str, String str2, boolean z) {
        if (this.relativeUrl != null) {
            String canonicalizeForPath = canonicalizeForPath(str2, z);
            String str3 = this.relativeUrl;
            String replace = str3.replace("{" + str + "}", canonicalizeForPath);
            if (!PATH_TRAVERSAL.matcher(replace).matches()) {
                this.relativeUrl = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addQueryParam(String str, String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            sq4.a n = this.baseUrl.n(str3);
            this.urlBuilder = n;
            if (n != null) {
                this.relativeUrl = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        if (z) {
            this.urlBuilder.a(str, str2);
        } else {
            this.urlBuilder.b(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void addTag(Class<T> cls, T t) {
        this.requestBuilder.s(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hi9.a get() {
        sq4 v;
        sq4.a aVar = this.urlBuilder;
        if (aVar != null) {
            v = aVar.c();
        } else {
            v = this.baseUrl.v(this.relativeUrl);
            if (v == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        ContentTypeOverridingRequestBody contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            g54.a aVar2 = this.formBuilder;
            if (aVar2 != null) {
                contentTypeOverridingRequestBody = aVar2.c();
            } else {
                fq6.a aVar3 = this.multipartBuilder;
                if (aVar3 != null) {
                    contentTypeOverridingRequestBody = aVar3.c();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = ji9.create((qc6) null, new byte[0]);
                }
            }
        }
        qc6 qc6Var = this.contentType;
        if (qc6Var != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, qc6Var);
            } else {
                this.headersBuilder.a("Content-Type", qc6Var.toString());
            }
        }
        return this.requestBuilder.t(v).k(this.headersBuilder.f()).l(this.method, contentTypeOverridingRequestBody);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBody(ji9 ji9Var) {
        this.body = ji9Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addPart(fq6.c cVar) {
        this.multipartBuilder.b(cVar);
    }

    private static void canonicalizeForPath(yg0 yg0Var, String str, int i, int i2, boolean z) {
        yg0 yg0Var2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                    yg0Var.G(codePointAt);
                } else {
                    if (yg0Var2 == null) {
                        yg0Var2 = new yg0();
                    }
                    yg0Var2.G(codePointAt);
                    while (!yg0Var2.U0()) {
                        byte readByte = yg0Var2.readByte();
                        yg0Var.V0(37);
                        char[] cArr = HEX_DIGITS;
                        yg0Var.V0(cArr[((readByte & 255) >> 4) & 15]);
                        yg0Var.V0(cArr[readByte & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
        }
    }
}
