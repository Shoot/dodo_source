package retrofit2;

import java.io.IOException;
/* loaded from: classes3.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    Call<T> mo61clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    hi9 request();

    xgb timeout();
}
