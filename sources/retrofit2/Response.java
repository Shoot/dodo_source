package retrofit2;

import defpackage.hi9;
import defpackage.ik9;
import im.threads.ui.fragments.ChatFragment;
import java.util.Objects;
import retrofit2.OkHttpCall;
/* loaded from: classes3.dex */
public final class Response<T> {
    private final T body;
    private final kk9 errorBody;
    private final ik9 rawResponse;

    private Response(ik9 ik9Var, T t, kk9 kk9Var) {
        this.rawResponse = ik9Var;
        this.body = t;
        this.errorBody = kk9Var;
    }

    public static <T> Response<T> error(int i, kk9 kk9Var) {
        Objects.requireNonNull(kk9Var, "body == null");
        if (i >= 400) {
            return error(kk9Var, new ik9.a().b(new OkHttpCall.NoContentResponseBody(kk9Var.contentType(), kk9Var.contentLength())).e(i).l("Response.error()").o(vr8.d).r(new hi9.a().u("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 400: " + i);
    }

    public static <T> Response<T> success(T t) {
        return success(t, new ik9.a().e(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY).l("OK").o(vr8.d).r(new hi9.a().u("http://localhost/").b()).c());
    }

    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.j();
    }

    public kk9 errorBody() {
        return this.errorBody;
    }

    public gn4 headers() {
        return this.rawResponse.q();
    }

    public boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public String message() {
        return this.rawResponse.r();
    }

    public ik9 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(int i, T t) {
        if (i >= 200 && i < 300) {
            return success(t, new ik9.a().e(i).l("Response.success()").o(vr8.d).r(new hi9.a().u("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i);
    }

    public static <T> Response<T> error(kk9 kk9Var, ik9 ik9Var) {
        Objects.requireNonNull(kk9Var, "body == null");
        Objects.requireNonNull(ik9Var, "rawResponse == null");
        if (!ik9Var.isSuccessful()) {
            return new Response<>(ik9Var, null, kk9Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(T t, gn4 gn4Var) {
        Objects.requireNonNull(gn4Var, "headers == null");
        return success(t, new ik9.a().e(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY).l("OK").o(vr8.d).j(gn4Var).r(new hi9.a().u("http://localhost/").b()).c());
    }

    public static <T> Response<T> success(T t, ik9 ik9Var) {
        Objects.requireNonNull(ik9Var, "rawResponse == null");
        if (ik9Var.isSuccessful()) {
            return new Response<>(ik9Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
