package ru.dodopizza.backend.domain.upload.dto;

import kotlin.Metadata;
/* compiled from: UploadSizeDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/dodopizza/backend/domain/upload/dto/UploadSizeDto;", "", "size", "", "(J)V", "getSize", "()J", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UploadSizeDto {
    @uca("uploadedSizeInBytes")
    private final long size;

    public UploadSizeDto(long j) {
        this.size = j;
    }

    public final long getSize() {
        return this.size;
    }
}
