package com.dodopizza.kustoworker.client;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.google.gson.a;
import com.google.gson.reflect.TypeToken;
import defpackage.b77;
import defpackage.hi9;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KustoClient.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/dodopizza/kustoworker/client/KustoClient;", "", "Lcom/dodopizza/kustoworker/client/KustoClient$KustoRequest;", "request", "", "sendRequest", "Ljava/io/OutputStream;", "out", "", "", "payload", "", "writeJsonStream", "Lb77;", "httpClient", "Lb77;", "Lcom/google/gson/Gson;", "serializer", "Lcom/google/gson/Gson;", "host", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "KustoRequest", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class KustoClient {
    public static final Companion Companion = new Companion(null);
    private static final qc6 JSON;
    private final String host;
    private final b77 httpClient;
    private final Gson serializer;

    /* compiled from: KustoClient.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/dodopizza/kustoworker/client/KustoClient$Companion;", "", "Lb77;", "buildHttpClient", "Lcom/google/gson/Gson;", "buildSerializer", "Lqc6;", "JSON", "Lqc6;", "getJSON", "()Lqc6;", "<init>", "()V", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b77 buildHttpClient() {
            b77 c = new b77.a().e(2L, TimeUnit.SECONDS).c();
            z65.g(c, "OkHttpClient.Builder()\n …SECONDS)\n        .build()");
            return c;
        }

        public final Gson buildSerializer() {
            Gson b = new a().b();
            z65.g(b, "GsonBuilder()\n        .create()");
            return b;
        }

        public final qc6 getJSON() {
            return KustoClient.JSON;
        }
    }

    /* compiled from: KustoClient.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u0003¢\u0006\u0002\u0010\u0006J\u001b\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u0003HÆ\u0003J%\u0010\n\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/kustoworker/client/KustoClient$KustoRequest;", "", "payload", "", "", "", "(Ljava/util/List;)V", "getPayload", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class KustoRequest {
        private final List<Map<String, Object>> payload;

        /* JADX WARN: Multi-variable type inference failed */
        public KustoRequest(List<? extends Map<String, ? extends Object>> list) {
            z65.h(list, "payload");
            this.payload = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ KustoRequest copy$default(KustoRequest kustoRequest, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = kustoRequest.payload;
            }
            return kustoRequest.copy(list);
        }

        public final List<Map<String, Object>> component1() {
            return this.payload;
        }

        public final KustoRequest copy(List<? extends Map<String, ? extends Object>> list) {
            z65.h(list, "payload");
            return new KustoRequest(list);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof KustoRequest) || !z65.c(this.payload, ((KustoRequest) obj).payload)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public final List<Map<String, Object>> getPayload() {
            return this.payload;
        }

        public int hashCode() {
            List<Map<String, Object>> list = this.payload;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "KustoRequest(payload=" + this.payload + ")";
        }
    }

    static {
        qc6 c = qc6.c("application/json; charset=utf-8");
        z65.g(c, "MediaType.get(\"application/json; charset=utf-8\")");
        JSON = c;
    }

    public KustoClient(String str) {
        z65.h(str, "host");
        this.host = str;
        Companion companion = Companion;
        this.httpClient = companion.buildHttpClient();
        this.serializer = companion.buildSerializer();
    }

    public final String sendRequest(final KustoRequest kustoRequest) {
        z65.h(kustoRequest, "request");
        hi9 b = new hi9.a().u(this.host).m(new ji9() { // from class: com.dodopizza.kustoworker.client.KustoClient$sendRequest$requestBody$1
            @Override // defpackage.ji9
            public qc6 contentType() {
                return KustoClient.Companion.getJSON();
            }

            @Override // defpackage.ji9
            public void writeTo(eh0 eh0Var) {
                z65.h(eh0Var, "sink");
                KustoClient kustoClient = KustoClient.this;
                OutputStream S1 = eh0Var.S1();
                z65.g(S1, "sink.outputStream()");
                kustoClient.writeJsonStream(S1, kustoRequest.getPayload());
            }
        }).b();
        z65.g(b, "Request.Builder()\n      …questBody)\n      .build()");
        ik9 execute = FirebasePerfOkHttpClient.execute(this.httpClient.a(b));
        try {
            z65.g(execute, "response");
            if (execute.isSuccessful()) {
                kk9 b2 = execute.b();
                z65.e(b2);
                String string = b2.string();
                z65.g(string, "response.body()!!.string()");
                aa1.a(execute, null);
                return string;
            }
            throw new IOException("Unexpected code " + execute);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(execute, th);
                throw th2;
            }
        }
    }

    public final void writeJsonStream(OutputStream outputStream, List<? extends Map<String, ? extends Object>> list) {
        z65.h(outputStream, "out");
        z65.h(list, "payload");
        dd5 r = this.serializer.r(new OutputStreamWriter(outputStream, "UTF-8"));
        try {
            this.serializer.x(list, new TypeToken<List<? extends Map<String, ? extends Object>>>() { // from class: com.dodopizza.kustoworker.client.KustoClient$writeJsonStream$1$1
            }.getType(), r);
            Unit unit = Unit.a;
            aa1.a(r, null);
        } finally {
        }
    }
}
