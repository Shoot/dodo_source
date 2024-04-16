package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import defpackage.cm0;
import java.io.IOException;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final cm0.a callFactory;
    private volatile boolean canceled;
    private Throwable creationFailure;
    private boolean executed;
    private cm0 rawCall;
    private final RequestFactory requestFactory;
    private final Converter<kk9, T> responseConverter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ExceptionCatchingResponseBody extends kk9 {
        private final kk9 delegate;
        private final fh0 delegateSource;
        IOException thrownException;

        ExceptionCatchingResponseBody(kk9 kk9Var) {
            this.delegate = kk9Var;
            this.delegateSource = c77.c(new y54(kk9Var.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // defpackage.y54, defpackage.pqa
                public long read(yg0 yg0Var, long j) throws IOException {
                    try {
                        return super.read(yg0Var, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        @Override // defpackage.kk9, java.io.Closeable, java.lang.AutoCloseable, defpackage.pqa
        public void close() {
            this.delegate.close();
        }

        @Override // defpackage.kk9
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // defpackage.kk9
        public qc6 contentType() {
            return this.delegate.contentType();
        }

        @Override // defpackage.kk9
        public fh0 source() {
            return this.delegateSource;
        }

        void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException == null) {
                return;
            }
            throw iOException;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class NoContentResponseBody extends kk9 {
        private final long contentLength;
        private final qc6 contentType;

        /* JADX INFO: Access modifiers changed from: package-private */
        public NoContentResponseBody(qc6 qc6Var, long j) {
            this.contentType = qc6Var;
            this.contentLength = j;
        }

        @Override // defpackage.kk9
        public long contentLength() {
            return this.contentLength;
        }

        @Override // defpackage.kk9
        public qc6 contentType() {
            return this.contentType;
        }

        @Override // defpackage.kk9
        public fh0 source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OkHttpCall(RequestFactory requestFactory, Object[] objArr, cm0.a aVar, Converter<kk9, T> converter) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callFactory = aVar;
        this.responseConverter = converter;
    }

    private cm0 createRawCall() throws IOException {
        cm0 a = this.callFactory.a(this.requestFactory.create(this.args));
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private cm0 getRawCall() throws IOException {
        cm0 cm0Var = this.rawCall;
        if (cm0Var != null) {
            return cm0Var;
        }
        Throwable th = this.creationFailure;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            cm0 createRawCall = createRawCall();
            this.rawCall = createRawCall;
            return createRawCall;
        } catch (IOException | Error | RuntimeException e) {
            Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        cm0 cm0Var;
        this.canceled = true;
        synchronized (this) {
            cm0Var = this.rawCall;
        }
        if (cm0Var != null) {
            cm0Var.cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        cm0 cm0Var;
        Throwable th;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (!this.executed) {
                    this.executed = true;
                    cm0Var = this.rawCall;
                    th = this.creationFailure;
                    if (cm0Var == null && th == null) {
                        cm0 createRawCall = createRawCall();
                        this.rawCall = createRawCall;
                        cm0Var = createRawCall;
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            cm0Var.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(cm0Var, new fm0() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th3) {
                try {
                    callback.onFailure(OkHttpCall.this, th3);
                } catch (Throwable th4) {
                    Utils.throwIfFatal(th4);
                    th4.printStackTrace();
                }
            }

            @Override // defpackage.fm0
            public void onFailure(cm0 cm0Var2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // defpackage.fm0
            public void onResponse(cm0 cm0Var2, ik9 ik9Var) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(ik9Var));
                    } catch (Throwable th3) {
                        Utils.throwIfFatal(th3);
                        th3.printStackTrace();
                    }
                } catch (Throwable th4) {
                    Utils.throwIfFatal(th4);
                    callFailure(th4);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        cm0 rawCall;
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                rawCall = getRawCall();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(FirebasePerfOkHttpClient.execute(rawCall));
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            try {
                cm0 cm0Var = this.rawCall;
                if (cm0Var == null || !cm0Var.isCanceled()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    Response<T> parseResponse(ik9 ik9Var) throws IOException {
        kk9 b = ik9Var.b();
        ik9 c = ik9Var.u().b(new NoContentResponseBody(b.contentType(), b.contentLength())).c();
        int j = c.j();
        if (j >= 200 && j < 300) {
            if (j != 204 && j != 205) {
                ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(b);
                try {
                    return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), c);
                } catch (RuntimeException e) {
                    exceptionCatchingResponseBody.throwIfCaught();
                    throw e;
                }
            }
            b.close();
            return Response.success((Object) null, c);
        }
        try {
            return Response.error(Utils.buffer(b), c);
        } finally {
            b.close();
        }
    }

    @Override // retrofit2.Call
    public synchronized hi9 request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return getRawCall().request();
    }

    @Override // retrofit2.Call
    public synchronized xgb timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return getRawCall().timeout();
    }

    @Override // retrofit2.Call
    /* renamed from: clone */
    public OkHttpCall<T> mo61clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }
}
