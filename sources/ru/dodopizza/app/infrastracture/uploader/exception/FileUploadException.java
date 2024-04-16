package ru.dodopizza.app.infrastracture.uploader.exception;

import kotlin.Metadata;
/* compiled from: FileUploadException.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lru/dodopizza/app/infrastracture/uploader/exception/FileUploadException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "a", "Ljava/lang/String;", "getUploadId", "()Ljava/lang/String;", "uploadId", "<init>", "(Ljava/lang/String;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FileUploadException extends RuntimeException {
    private final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileUploadException(String str) {
        super("Could not upload content with id " + str);
        z65.h(str, "uploadId");
        this.a = str;
    }
}
