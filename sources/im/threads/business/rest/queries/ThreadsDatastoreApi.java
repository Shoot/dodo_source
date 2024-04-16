package im.threads.business.rest.queries;

import ch.qos.logback.core.joran.action.Action;
import defpackage.fq6;
import im.threads.business.models.FileUploadResponse;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.PUT;
import retrofit2.http.Part;
/* compiled from: ThreadsDatastoreApi.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¨\u0006\u000b"}, d2 = {"Lim/threads/business/rest/queries/ThreadsDatastoreApi;", "", "Lfq6$c;", Action.FILE_ATTRIBUTE, "Lji9;", "externalClientId", "", "token", "Lretrofit2/Call;", "Lim/threads/business/models/FileUploadResponse;", "upload", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public interface ThreadsDatastoreApi {
    @PUT("files")
    @Multipart
    Call<FileUploadResponse> upload(@Part fq6.c cVar, @Part("externalClientId") ji9 ji9Var, @Header("X-Client-Token") String str);
}
