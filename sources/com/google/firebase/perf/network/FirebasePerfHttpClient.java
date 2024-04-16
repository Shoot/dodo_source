package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
/* loaded from: classes2.dex */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, Timer timer, jmb jmbVar) throws IOException {
        gw6 c = gw6.c(jmbVar);
        try {
            c.t(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long a = hw6.a(httpRequest);
            if (a != null) {
                c.m(a.longValue());
            }
            timer.g();
            c.n(timer.e());
            return (T) httpClient.execute(httpHost, httpRequest, new p55(responseHandler, timer, c));
        } catch (IOException e) {
            c.r(timer.c());
            hw6.d(c);
            throw e;
        }
    }

    static <T> T b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, Timer timer, jmb jmbVar) throws IOException {
        gw6 c = gw6.c(jmbVar);
        try {
            c.t(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long a = hw6.a(httpRequest);
            if (a != null) {
                c.m(a.longValue());
            }
            timer.g();
            c.n(timer.e());
            return (T) httpClient.execute(httpHost, httpRequest, new p55(responseHandler, timer, c), httpContext);
        } catch (IOException e) {
            c.r(timer.c());
            hw6.d(c);
            throw e;
        }
    }

    static <T> T c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, Timer timer, jmb jmbVar) throws IOException {
        gw6 c = gw6.c(jmbVar);
        try {
            c.t(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long a = hw6.a(httpUriRequest);
            if (a != null) {
                c.m(a.longValue());
            }
            timer.g();
            c.n(timer.e());
            return (T) httpClient.execute(httpUriRequest, new p55(responseHandler, timer, c));
        } catch (IOException e) {
            c.r(timer.c());
            hw6.d(c);
            throw e;
        }
    }

    static <T> T d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, Timer timer, jmb jmbVar) throws IOException {
        gw6 c = gw6.c(jmbVar);
        try {
            c.t(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long a = hw6.a(httpUriRequest);
            if (a != null) {
                c.m(a.longValue());
            }
            timer.g();
            c.n(timer.e());
            return (T) httpClient.execute(httpUriRequest, new p55(responseHandler, timer, c), httpContext);
        } catch (IOException e) {
            c.r(timer.c());
            hw6.d(c);
            throw e;
        }
    }

    static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, jmb jmbVar) throws IOException {
        gw6 c = gw6.c(jmbVar);
        try {
            c.t(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long a = hw6.a(httpRequest);
            if (a != null) {
                c.m(a.longValue());
            }
            timer.g();
            c.n(timer.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c.r(timer.c());
            c.k(execute.getStatusLine().getStatusCode());
            Long a2 = hw6.a(execute);
            if (a2 != null) {
                c.p(a2.longValue());
            }
            String b = hw6.b(execute);
            if (b != null) {
                c.o(b);
            }
            c.b();
            return execute;
        } catch (IOException e) {
            c.r(timer.c());
            hw6.d(c);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return g(httpClient, httpUriRequest, new Timer(), jmb.k());
    }

    static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, jmb jmbVar) throws IOException {
        gw6 c = gw6.c(jmbVar);
        try {
            c.t(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long a = hw6.a(httpRequest);
            if (a != null) {
                c.m(a.longValue());
            }
            timer.g();
            c.n(timer.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c.r(timer.c());
            c.k(execute.getStatusLine().getStatusCode());
            Long a2 = hw6.a(execute);
            if (a2 != null) {
                c.p(a2.longValue());
            }
            String b = hw6.b(execute);
            if (b != null) {
                c.o(b);
            }
            c.b();
            return execute;
        } catch (IOException e) {
            c.r(timer.c());
            hw6.d(c);
            throw e;
        }
    }

    static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, jmb jmbVar) throws IOException {
        gw6 c = gw6.c(jmbVar);
        try {
            c.t(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long a = hw6.a(httpUriRequest);
            if (a != null) {
                c.m(a.longValue());
            }
            timer.g();
            c.n(timer.e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c.r(timer.c());
            c.k(execute.getStatusLine().getStatusCode());
            Long a2 = hw6.a(execute);
            if (a2 != null) {
                c.p(a2.longValue());
            }
            String b = hw6.b(execute);
            if (b != null) {
                c.o(b);
            }
            c.b();
            return execute;
        } catch (IOException e) {
            c.r(timer.c());
            hw6.d(c);
            throw e;
        }
    }

    static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, jmb jmbVar) throws IOException {
        gw6 c = gw6.c(jmbVar);
        try {
            c.t(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long a = hw6.a(httpUriRequest);
            if (a != null) {
                c.m(a.longValue());
            }
            timer.g();
            c.n(timer.e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c.r(timer.c());
            c.k(execute.getStatusLine().getStatusCode());
            Long a2 = hw6.a(execute);
            if (a2 != null) {
                c.p(a2.longValue());
            }
            String b = hw6.b(execute);
            if (b != null) {
                c.o(b);
            }
            c.b();
            return execute;
        } catch (IOException e) {
            c.r(timer.c());
            hw6.d(c);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return h(httpClient, httpUriRequest, httpContext, new Timer(), jmb.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return (T) c(httpClient, httpUriRequest, responseHandler, new Timer(), jmb.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) d(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), jmb.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return e(httpClient, httpHost, httpRequest, new Timer(), jmb.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return f(httpClient, httpHost, httpRequest, httpContext, new Timer(), jmb.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, new Timer(), jmb.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), jmb.k());
    }
}
